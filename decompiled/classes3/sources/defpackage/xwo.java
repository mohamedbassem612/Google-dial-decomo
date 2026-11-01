package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwo {
    private volatile defpackage.xyb a;
    private final defpackage.vqu b;

    public xwo(defpackage.vqu vquVar) {
        this.b = vquVar;
    }

    public final defpackage.xyb a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    java.lang.Object obj = this.b.a;
                    java.io.File cacheDir = ((android.content.Context) ((defpackage.aelu) obj).a).getCacheDir();
                    defpackage.xyd xydVar = null;
                    java.io.File file = cacheDir == null ? null : new java.io.File(cacheDir, (java.lang.String) ((defpackage.aelu) obj).b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        xydVar = new defpackage.xyd(file);
                    }
                    this.a = xydVar;
                }
                if (this.a == null) {
                    this.a = new defpackage.xyc();
                }
            }
        }
        return this.a;
    }
}
