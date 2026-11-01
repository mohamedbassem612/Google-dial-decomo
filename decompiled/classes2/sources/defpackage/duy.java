package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class duy extends defpackage.dvk {
    public androidx.core.graphics.drawable.IconCompat a;
    public boolean b;

    @Override // defpackage.dvk
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.dvk
    public final void b(izg izgVar) {
        android.graphics.Bitmap bitmap;
        android.app.Notification.BigPictureStyle bigContentTitle = new android.app.Notification.BigPictureStyle((android.app.Notification.Builder) izgVar.a).setBigContentTitle(null);
        if (this.a != null) {
            int i = android.os.Build.VERSION.SDK_INT;
            androidx.core.graphics.drawable.IconCompat iconCompat = this.a;
            if (i >= 31) {
                defpackage.dux.a(bigContentTitle, defpackage.dvg.c(iconCompat));
            } else if (iconCompat.b() == 1) {
                androidx.core.graphics.drawable.IconCompat iconCompat2 = this.a;
                int i2 = iconCompat2.b;
                if (i2 == -1) {
                    java.lang.Object obj = iconCompat2.c;
                    bitmap = obj instanceof android.graphics.Bitmap ? (android.graphics.Bitmap) obj : null;
                } else if (i2 == 1) {
                    bitmap = (android.graphics.Bitmap) iconCompat2.c;
                } else {
                    if (i2 != 5) {
                        java.util.Objects.toString(iconCompat2);
                        throw new java.lang.IllegalStateException("called getBitmap() on ".concat(iconCompat2.toString()));
                    }
                    android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iconCompat2.c;
                    int iMin = (int) (java.lang.Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iMin, iMin, android.graphics.Bitmap.Config.ARGB_8888);
                    android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                    android.graphics.Paint paint = new android.graphics.Paint(3);
                    paint.setColor(0);
                    float f = iMin;
                    float f2 = 0.010416667f * f;
                    paint.setShadowLayer(f2, 0.0f, 0.020833334f * f, 1023410176);
                    float f3 = f * 0.5f;
                    float f4 = 0.9166667f * f3;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setShadowLayer(f2, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap2, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f3, f3, f4, paint);
                    canvas.setBitmap(null);
                    bitmap = bitmapCreateBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.b) {
            bigContentTitle.bigLargeIcon((android.graphics.Bitmap) null);
        }
        if (this.e) {
            bigContentTitle.setSummaryText(this.d);
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.dux.c(bigContentTitle, false);
            defpackage.dux.b(bigContentTitle, null);
        }
    }
}
