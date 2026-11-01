package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wui implements defpackage.zta {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public wui(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        if (this.$cid == 0) {
            wuj wujVar = new wuj();
            defpackage.amxr.g(wujVar);
            return wujVar;
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        myu myuVar = new myu();
        defpackage.amxr.g(myuVar);
        defpackage.ahgl.b(myuVar, zrxVar);
        return myuVar;
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        if (this.$cid != 0) {
            defpackage.kaw kawVar = (defpackage.kaw) this.a;
            return (kawVar.I() || kawVar.J()) ? defpackage.aiql.z(zsz.c) : defpackage.aiql.z(zsz.b);
        }
        defpackage.aooh.f(zrxVar, "callParameter");
        return ((defpackage.zzx) this.a).o() ? defpackage.aiql.z(zsz.c) : defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final /* synthetic */ defpackage.ajcq c(zrx zrxVar) {
        return this.$cid != 0 ? defpackage.aiql.z(zrxVar) : defpackage.aiql.z(zrxVar);
    }
}
