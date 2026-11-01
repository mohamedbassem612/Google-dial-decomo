package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class gap extends defpackage.aonv implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gap(java.lang.Object obj, int i) {
        super(0, obj, defpackage.gat.class, "refresh", "refresh(Ljava/lang/Object;)V", 0);
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        java.lang.Object obj = this.b;
        if (i != 0) {
            ((defpackage.gat) obj).c();
            return defpackage.aojh.a;
        }
        ((defpackage.gat) obj).c();
        return defpackage.aojh.a;
    }
}
