package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggv extends android.graphics.drawable.Drawable {
    private static java.lang.ref.SoftReference a;
    private static android.graphics.Path[] b;
    private static int[] c;
    private final int d;
    private final android.graphics.Paint e = new android.graphics.Paint(1);

    public aggv(int i) {
        this.d = android.graphics.Color.argb(204, android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        java.lang.ref.SoftReference softReference = a;
        android.graphics.Bitmap bitmap = null;
        android.graphics.Bitmap bitmap2 = softReference != null ? (android.graphics.Bitmap) softReference.get() : null;
        if (bitmap2 != null) {
            int width = bitmap2.getWidth();
            int height = bitmap2.getHeight();
            if ((iWidth <= width || width >= 2049.0f) && (iHeight <= height || height >= 1152.0f)) {
                bitmap = bitmap2;
            }
        } else {
            bitmap = bitmap2;
        }
        if (bitmap == null) {
            android.graphics.Paint paint = this.e;
            paint.reset();
            float fMin = java.lang.Math.min(1.5f, java.lang.Math.max(iWidth / 1366.0f, iHeight / 768.0f));
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap((int) (fMin * 1366.0f), (int) (fMin * 768.0f), android.graphics.Bitmap.Config.ALPHA_8);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap);
            canvas2.save();
            canvas2.scale(fMin, fMin);
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC));
            if (b == null) {
                android.graphics.Path[] pathArr = new android.graphics.Path[7];
                b = pathArr;
                c = new int[]{10, 40, 51, 66, 91, 112, 130};
                android.graphics.Path path = new android.graphics.Path();
                pathArr[0] = path;
                path.moveTo(1029.4f, 357.5f);
                path.lineTo(1366.0f, 759.1f);
                path.lineTo(1366.0f, 0.0f);
                path.lineTo(1137.7f, 0.0f);
                path.close();
                android.graphics.Path[] pathArr2 = b;
                android.graphics.Path path2 = new android.graphics.Path();
                pathArr2[1] = path2;
                path2.moveTo(1138.1f, 0.0f);
                path2.rLineTo(-144.8f, 768.0f);
                path2.rLineTo(372.7f, 0.0f);
                path2.rLineTo(0.0f, -524.0f);
                path2.cubicTo(1290.7f, 121.6f, 1219.2f, 41.1f, 1178.7f, 0.0f);
                path2.close();
                android.graphics.Path[] pathArr3 = b;
                android.graphics.Path path3 = new android.graphics.Path();
                pathArr3[2] = path3;
                path3.moveTo(949.8f, 768.0f);
                path3.rCubicTo(92.6f, -170.6f, 213.0f, -440.3f, 269.4f, -768.0f);
                path3.lineTo(585.0f, 0.0f);
                path3.rLineTo(2.1f, 766.0f);
                path3.close();
                android.graphics.Path[] pathArr4 = b;
                android.graphics.Path path4 = new android.graphics.Path();
                pathArr4[3] = path4;
                path4.moveTo(471.1f, 768.0f);
                path4.rMoveTo(704.5f, 0.0f);
                path4.cubicTo(1123.6f, 563.3f, 1027.4f, 275.2f, 856.2f, 0.0f);
                path4.lineTo(476.4f, 0.0f);
                path4.rLineTo(-5.3f, 768.0f);
                path4.close();
                android.graphics.Path[] pathArr5 = b;
                android.graphics.Path path5 = new android.graphics.Path();
                pathArr5[4] = path5;
                path5.moveTo(323.1f, 768.0f);
                path5.moveTo(777.5f, 768.0f);
                path5.cubicTo(661.9f, 348.8f, 427.2f, 21.4f, 401.2f, 25.4f);
                path5.lineTo(323.1f, 768.0f);
                path5.close();
                android.graphics.Path[] pathArr6 = b;
                android.graphics.Path path6 = new android.graphics.Path();
                pathArr6[5] = path6;
                path6.moveTo(178.44286f, 766.8571f);
                path6.lineTo(308.7f, 768.0f);
                path6.cubicTo(381.7f, 604.6f, 481.6f, 344.3f, 562.2f, 0.0f);
                path6.lineTo(0.0f, 0.0f);
                path6.close();
                android.graphics.Path[] pathArr7 = b;
                android.graphics.Path path7 = new android.graphics.Path();
                pathArr7[6] = path7;
                path7.moveTo(146.0f, 0.0f);
                path7.lineTo(0.0f, 0.0f);
                path7.lineTo(0.0f, 768.0f);
                path7.lineTo(394.2f, 768.0f);
                path7.cubicTo(327.7f, 475.3f, 228.5f, 201.0f, 146.0f, 0.0f);
                path7.close();
            }
            for (int i = 0; i < 7; i++) {
                paint.setColor(c[i] << 24);
                canvas2.drawPath(b[i], paint);
            }
            canvas2.restore();
            paint.reset();
            a = new java.lang.ref.SoftReference(bitmapCreateBitmap);
            paint.reset();
            bitmap = bitmapCreateBitmap;
        }
        canvas.save();
        canvas.clipRect(bounds);
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        float fWidth = bounds.width() / width2;
        float fHeight = bounds.height() / height2;
        canvas.scale(fWidth, fHeight);
        if (fHeight > fWidth) {
            canvas.scale(fHeight / fWidth, 1.0f, width2 * 0.146f, 0.0f);
        } else if (fWidth > fHeight) {
            canvas.scale(1.0f, fWidth / fHeight, 0.0f, height2 * 0.228f);
        }
        canvas.drawColor(-16777216);
        android.graphics.Paint paint2 = this.e;
        paint2.setColor(-1);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        canvas.drawColor(this.d);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
