package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xvn implements defpackage.xvb {
    protected final boolean a;
    private final android.net.Uri b;
    private final android.content.ContentResolver c;
    private java.lang.Object d;

    public xvn(android.content.ContentResolver contentResolver, android.net.Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    protected abstract java.lang.Object b(android.net.Uri uri, android.content.ContentResolver contentResolver);

    protected abstract void c(java.lang.Object obj);

    @Override // defpackage.xvb
    public final void e() {
        java.lang.Object obj = this.d;
        if (obj != null) {
            try {
                c(obj);
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.a;
    }

    protected final android.content.res.AssetFileDescriptor f(android.net.Uri uri) {
        return (this.a && defpackage.xff.x(uri) && defpackage.xff.w()) ? defpackage.xff.v(uri, this.c) : this.c.openAssetFileDescriptor(uri, "r");
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        try {
            java.lang.Object objB = b(this.b, this.c);
            this.d = objB;
            xvaVar.c(objB);
        } catch (java.io.FileNotFoundException e) {
            if (android.util.Log.isLoggable("LocalUriFetcher", 3)) {
                android.util.Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            xvaVar.f(e);
        }
    }

    @Override // defpackage.xvb
    public final void d() {
    }
}
