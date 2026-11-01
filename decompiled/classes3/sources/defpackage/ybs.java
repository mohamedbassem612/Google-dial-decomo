package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybs implements defpackage.ybt {
    private final /* synthetic */ int $cid;
    private final java.util.List a;
    private final defpackage.xxt b;
    private final java.lang.Object c;

    public ybs(android.os.ParcelFileDescriptor parcelFileDescriptor, java.util.List list, defpackage.xxt xxtVar, int i) {
        this.$cid = i;
        this.b = xxtVar;
        this.a = list;
        this.c = new defpackage.xvp(parcelFileDescriptor);
    }

    @Override // defpackage.ybt
    public final int a() {
        if (this.$cid != 0) {
            return defpackage.xff.E(this.a, ((defpackage.xvm) this.c).a(), this.b);
        }
        return defpackage.xff.A(this.a, new defpackage.xuj((defpackage.xvp) this.c, this.b, 2));
    }

    @Override // defpackage.ybt
    public final android.graphics.Bitmap b(android.graphics.BitmapFactory.Options options) throws java.lang.Throwable {
        int i = this.$cid;
        java.lang.Object obj = this.c;
        if (i != 0) {
            return defpackage.xfh.x(((defpackage.xvm) obj).a(), options, this);
        }
        java.io.FileDescriptor fileDescriptor = ((defpackage.xvp) obj).a().getFileDescriptor();
        android.graphics.Bitmap bitmap = null;
        if (android.os.Build.VERSION.SDK_INT != 34 || !defpackage.ybp.a(options) || !defpackage.xfh.z(this)) {
            return android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        }
        defpackage.xfh.s(options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        try {
            android.graphics.Bitmap bitmapDecodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            if (bitmapDecodeFileDescriptor == null) {
                options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                android.graphics.Bitmap bitmapY = defpackage.xfh.y(bitmapDecodeFileDescriptor);
                bitmapDecodeFileDescriptor.recycle();
                options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                return bitmapY;
            } catch (java.lang.Throwable th) {
                th = th;
                bitmap = bitmapDecodeFileDescriptor;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.ybt
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType c() {
        if (this.$cid != 0) {
            return defpackage.xff.G(this.a, ((defpackage.xvm) this.c).a(), this.b);
        }
        return defpackage.xff.C(this.a, new defpackage.xui((defpackage.xvp) this.c, this.b));
    }

    @Override // defpackage.ybt
    public final void d() {
        if (this.$cid != 0) {
            ((defpackage.xvm) this.c).a.a();
        }
    }

    @Override // defpackage.ybt
    public final boolean e() {
        int i = this.$cid;
        java.lang.Object obj = this.c;
        if (i == 0) {
            return defpackage.xff.D(this.a, new defpackage.xuk((defpackage.xvp) obj, this.b, 2));
        }
        java.io.InputStream inputStreamA = ((defpackage.xvm) obj).a();
        inputStreamA.mark(5242880);
        return defpackage.xff.D(this.a, new defpackage.xuk(inputStreamA, this.b, 0));
    }

    public ybs(java.io.InputStream inputStream, java.util.List list, defpackage.xxt xxtVar, int i) {
        this.$cid = i;
        this.b = xxtVar;
        this.a = list;
        this.c = new defpackage.xvm(inputStream, xxtVar);
    }
}
