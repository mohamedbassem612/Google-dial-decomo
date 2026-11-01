package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yar extends defpackage.yap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yap
    protected final android.graphics.Bitmap c(defpackage.xxm xxmVar, android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Paint paint = defpackage.ycc.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (android.util.Log.isLoggable("TransformationUtils", 2)) {
                android.util.Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return defpackage.ycc.c(xxmVar, bitmap, i, i2);
        }
        if (!android.util.Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        android.util.Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.yar;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return -670243078;
    }
}
