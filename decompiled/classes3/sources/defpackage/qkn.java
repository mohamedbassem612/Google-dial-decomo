package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qkn implements defpackage.znt {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qkn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.znt
    public final ajcq b() {
        int i = this.$cid;
        if (i != 0) {
            if (i != 1) {
                java.lang.Object obj = this.a;
                return ahvr.E(new defpackage.sxq(obj, 7), ((defpackage.tcl) obj).n);
            }
            ((ooc) this.a).h.a();
            return aiql.z(java.lang.Boolean.TRUE);
        }
        java.lang.Object obj2 = this.a;
        defpackage.qfe qfeVar = new defpackage.qfe(obj2, 5);
        defpackage.qko qkoVar = (defpackage.qko) obj2;
        return qkoVar.s.g(qfeVar, qkoVar.n);
    }
}
