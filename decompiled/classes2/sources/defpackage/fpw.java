package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fpw implements defpackage.fpt {
    private final int a;
    private final int b;
    private final defpackage.etx c;

    public fpw(defpackage.eut eutVar, defpackage.eqg eqgVar) {
        defpackage.etx etxVar = eutVar.a;
        this.c = etxVar;
        etxVar.Q(12);
        int iQ = etxVar.q();
        if ("audio/raw".equals(eqgVar.p)) {
            int iJ = eum.j(eqgVar.K) * eqgVar.H;
            if (iQ % iJ != 0) {
                defpackage.etr.f("BoxParsers", a.bf(iQ, iJ, "Audio sample size mismatch. stsd sample size: ", ", stsz sample size: "));
                iQ = iJ;
            }
        }
        this.a = iQ == 0 ? -1 : iQ;
        this.b = etxVar.q();
    }

    @Override // defpackage.fpt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.fpt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fpt
    public final int c() {
        int i = this.a;
        return i == -1 ? this.c.q() : i;
    }
}
