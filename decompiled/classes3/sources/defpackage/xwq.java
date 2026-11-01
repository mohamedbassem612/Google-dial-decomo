package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwq implements defpackage.xwv, defpackage.xyf, defpackage.xwx {
    public static final boolean a = android.util.Log.isLoggable("Engine", 2);
    public final defpackage.xwo b;
    public final defpackage.xvx c;
    public final defpackage.xye d;
    public final defpackage.ygq e;
    public final akbx f;
    public final defpackage.xff g;
    public final defpackage.vqu h;
    public final defpackage.uss i;

    public xwq(defpackage.xye xyeVar, defpackage.vqu vquVar, defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3) throws java.lang.Throwable {
        this.d = xyeVar;
        defpackage.xwo xwoVar = new defpackage.xwo(vquVar);
        this.b = xwoVar;
        defpackage.xvx xvxVar = new defpackage.xvx();
        this.c = xvxVar;
        synchronized (this) {
            try {
                synchronized (xvxVar) {
                    try {
                        try {
                        } catch (java.lang.Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.g = new defpackage.xff();
                this.h = new defpackage.vqu((byte[]) null, (byte[]) null);
                this.i = new defpackage.uss(xynVar, xynVar2, xynVar3, this, this);
                this.f = new akbx(xwoVar);
                this.e = new defpackage.ygq();
                xyeVar.a = this;
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        }
    }

    public static void a(java.lang.String str, long j, defpackage.xuo xuoVar) {
        android.util.Log.v("Engine", str + " in " + defpackage.yfx.a(j) + "ms, key: " + xuoVar.toString());
    }

    public static void d(java.lang.String str, defpackage.xwy xwyVar) {
        android.graphics.Bitmap bitmap;
        if (android.util.Log.isLoggable("GlideMemoryTracking", 3)) {
            java.lang.Object objC = xwyVar.c();
            if (objC instanceof android.graphics.Bitmap) {
                bitmap = (android.graphics.Bitmap) objC;
            } else {
                bitmap = objC instanceof android.graphics.drawable.BitmapDrawable ? ((android.graphics.drawable.BitmapDrawable) objC).getBitmap() : null;
            }
            if (bitmap != null) {
                int iIdentityHashCode = java.lang.System.identityHashCode(bitmap);
                android.util.Log.d("GlideMemoryTracking", "Engine [Device: " + android.os.Build.DEVICE + "]: Loaded bitmap [ID: " + iIdentityHashCode + "] from memory cache (" + str + "). Size: [" + bitmap.getWidth() + 'x' + bitmap.getHeight() + "] (" + defpackage.ygc.a(bitmap) + " bytes)");
            }
        }
    }

    @Override // defpackage.xwv
    public final synchronized void b(defpackage.xwu xwuVar, defpackage.xuo xuoVar) {
        this.h.y(xuoVar, xwuVar);
    }

    @Override // defpackage.xwv
    public final synchronized void c(defpackage.xwu xwuVar, defpackage.xuo xuoVar, defpackage.xwy xwyVar) {
        if (xwyVar != null) {
            if (xwyVar.a) {
                this.c.b(xuoVar, xwyVar);
            }
        }
        this.h.y(xuoVar, xwuVar);
    }
}
