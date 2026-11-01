package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yaq extends defpackage.yap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yap
    protected final android.graphics.Bitmap c(defpackage.xxm xxmVar, android.graphics.Bitmap bitmap, int i, int i2) {
        float height;
        float f;
        android.graphics.Paint paint = defpackage.ycc.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f2 = i2;
        float f3 = i;
        float width = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = f2 / bitmap.getHeight();
            f = 0.0f;
            width = (f3 - (bitmap.getWidth() * height)) * 0.5f;
        } else {
            float width2 = f3 / bitmap.getWidth();
            float height2 = (f2 - (bitmap.getHeight() * width2)) * 0.5f;
            height = width2;
            f = height2;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((int) (width + 0.5f), (int) (f + 0.5f));
        android.graphics.Bitmap bitmapA = xxmVar.a(i, i2, defpackage.ycc.b(bitmap));
        defpackage.ycc.e(bitmap, bitmapA);
        defpackage.ycc.d(bitmap, bitmapA, matrix);
        if (bitmapA != null && !bitmapA.equals(bitmap) && ((bitmapA.getWidth() != bitmap.getWidth() || bitmapA.getHeight() != bitmap.getHeight()) && android.util.Log.isLoggable("GlideMemoryTracking", 3))) {
            defpackage.ygc.m("TransformationUtils [centerCrop]", null, bitmapA, bitmap.getWidth(), bitmap.getHeight());
        }
        return bitmapA;
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.yaq;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return -599754482;
    }
}
