package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class otl implements defpackage.znh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ otl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aoin, java.lang.Object] */
    @Override // defpackage.znh
    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.otq) this.a).b();
            return ajcm.a;
        }
        ?? r4 = this.a;
        if (i != 1) {
            defpackage.uiw uiwVar = (defpackage.uiw) r4.a();
            return aosv.F(uiwVar.b, 0, new defpackage.txf(uiwVar, (aoln) null, 14), 3);
        }
        ((ibs) r4).b();
        return ajcm.a;
    }
}
