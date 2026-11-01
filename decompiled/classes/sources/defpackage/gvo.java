package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gvo implements defpackage.gvw {
    public final android.net.ConnectivityManager a;

    public gvo(android.net.ConnectivityManager connectivityManager) {
        if (connectivityManager == null) {
            defpackage.aooh.i("connManager");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.gvw
    public final defpackage.aoxh a(defpackage.grn grnVar) {
        defpackage.aooh.f(grnVar, "constraints");
        return new defpackage.aoxa(new blj(grnVar, this, (defpackage.aoln) null, 6));
    }

    @Override // defpackage.gvw
    public final boolean b(defpackage.gxl gxlVar) {
        defpackage.aooh.f(gxlVar, "workSpec");
        return (gxlVar.k.a() == null && gxlVar.k.b == defpackage.gsi.a) ? false : true;
    }

    @Override // defpackage.gvw
    public final boolean c(defpackage.gxl gxlVar) {
        if (b(gxlVar)) {
            throw new java.lang.IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
