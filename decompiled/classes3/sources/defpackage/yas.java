package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yas extends defpackage.yap {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.xuo
    public final void a(java.security.MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.yap
    protected final android.graphics.Bitmap c(defpackage.xxm xxmVar, android.graphics.Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmapA;
        android.graphics.Paint paint = defpackage.ycc.a;
        int iMin = java.lang.Math.min(i, i2);
        float f = iMin;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = java.lang.Math.max(f / width, f / height);
        float f2 = width * fMax;
        float f3 = fMax * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        android.graphics.RectF rectF = new android.graphics.RectF(f4, f5, f2 + f4, f3 + f5);
        android.graphics.Bitmap.Config configA = defpackage.ycc.a(bitmap);
        float f6 = f / 2.0f;
        if (configA.equals(bitmap.getConfig())) {
            bitmapA = bitmap;
        } else {
            bitmapA = xxmVar.a(bitmap.getWidth(), bitmap.getHeight(), configA);
            new android.graphics.Canvas(bitmapA).drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        android.graphics.Bitmap bitmapA2 = xxmVar.a(iMin, iMin, defpackage.ycc.a(bitmap));
        bitmapA2.setHasAlpha(true);
        defpackage.ycc.c.lock();
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapA2);
            canvas.drawCircle(f6, f6, f6, defpackage.ycc.a);
            canvas.drawBitmap(bitmapA, (android.graphics.Rect) null, rectF, defpackage.ycc.b);
            canvas.setBitmap(null);
            defpackage.ycc.c.unlock();
            if (!bitmapA.equals(bitmap)) {
                xxmVar.d(bitmapA);
            }
            return bitmapA2;
        } catch (java.lang.Throwable th) {
            defpackage.ycc.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.xuo
    public final boolean equals(java.lang.Object obj) {
        return obj instanceof defpackage.yas;
    }

    @Override // defpackage.xuo
    public final int hashCode() {
        return 1101716364;
    }
}
