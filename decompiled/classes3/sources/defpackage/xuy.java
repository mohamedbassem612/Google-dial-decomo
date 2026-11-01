package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xuy implements defpackage.xvb {
    private final java.lang.String a;
    private final android.content.res.AssetManager b;
    private java.lang.Object c;

    public xuy(android.content.res.AssetManager assetManager, java.lang.String str) {
        this.b = assetManager;
        this.a = str;
    }

    protected abstract java.lang.Object c(android.content.res.AssetManager assetManager, java.lang.String str);

    @Override // defpackage.xvb
    public final void e() {
        java.lang.Object obj = this.c;
        if (obj != null) {
            try {
                f(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    protected abstract void f(java.lang.Object obj);

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        try {
            java.lang.Object objC = c(this.b, this.a);
            this.c = objC;
            xvaVar.c(objC);
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("AssetPathFetcher", 3)) {
                android.util.Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            xvaVar.f(e);
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }
}
