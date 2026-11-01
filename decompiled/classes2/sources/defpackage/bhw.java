package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class bhw implements defpackage.drr {
    private final defpackage.drr a;
    private dpp b;
    private dpq c;
    private dpp d;
    private dpn e;

    public bhw(defpackage.drr drrVar) {
        this.a = drrVar;
    }

    @Override // defpackage.drr
    public final long a(dpo dpoVar, long j, dpq dpqVar, long j2) {
        dpp dppVar;
        dpp dppVar2;
        dpn dpnVar = this.e;
        if (dpnVar != null && (dppVar = this.b) != null && anty.ah(dppVar.a, j) && this.c == dpqVar && (dppVar2 = this.d) != null && anty.ah(dppVar2.a, j2)) {
            return dpnVar.a;
        }
        long jA = this.a.a(dpoVar, j, dpqVar, j2);
        this.b = new dpp(j);
        this.c = dpqVar;
        this.d = new dpp(j2);
        this.e = new dpn(jA);
        return jA;
    }
}
