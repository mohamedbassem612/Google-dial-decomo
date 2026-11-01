package androidx.media3.exoplayer.video;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class PlaceholderSurface extends android.view.Surface {
    public static int a;
    private static boolean c;
    public final boolean b;
    private final defpackage.fjp d;
    private boolean e;

    public PlaceholderSurface(defpackage.fjp fjpVar, android.graphics.SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = fjpVar;
        this.b = z;
    }

    public static synchronized boolean a() {
        int i;
        if (!c) {
            try {
                if (defpackage.esv.c("EGL_EXT_protected_content")) {
                    i = defpackage.esv.c("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
            } catch (defpackage.eti e) {
                defpackage.etr.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(java.lang.String.valueOf(e.getMessage())));
            }
            a = i;
            c = true;
        }
        return a != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        defpackage.fjp fjpVar = this.d;
        synchronized (fjpVar) {
            if (!this.e) {
                ahvr.ci(fjpVar.b);
                fjpVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
