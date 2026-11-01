package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fuu implements defpackage.evh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ fuu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.evh
    public final void a(long j, defpackage.etx etxVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.hgt.aj(j, etxVar, (defpackage.fmk[]) ((defpackage.jyn) this.a).c);
            return;
        }
        java.lang.Object obj = this.a;
        if (i != 1) {
            defpackage.hgt.ak(j, etxVar, (defpackage.fmk[]) ((defpackage.jkq) obj).b);
        } else {
            defpackage.hgt.aj(j, etxVar, ((defpackage.fqe) obj).b);
        }
    }
}
