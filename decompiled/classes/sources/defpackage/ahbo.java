package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahbo implements defpackage.aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ahbo(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            return (defpackage.ahbi) this.a.a(this.b);
        }
        ?? r1 = this.a;
        if (i != 1) {
            return defpackage.ahou.e(defpackage.ahou.d((java.util.Set) r1.a()), (defpackage.ahou) ((defpackage.ahpz) this.b).d);
        }
        defpackage.acxg acxgVar = (defpackage.acxg) r1;
        uzx uzxVar = (uzx) acxgVar.b.a();
        uzxVar.getClass();
        defpackage.aoss aossVar = (defpackage.aoss) acxgVar.a.a();
        aossVar.getClass();
        return new zts((defpackage.ztp) this.b, uzxVar, aossVar);
    }
}
