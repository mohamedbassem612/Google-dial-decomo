package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hgm {
    private static final java.lang.ThreadLocal b = new defpackage.hgi();
    private static final java.lang.ThreadLocal c = new defpackage.hgj();
    private static final java.lang.ThreadLocal d = new defpackage.hgk();
    public static final java.lang.ThreadLocal a = new defpackage.hgl();
    private static final float e = 0.70710677f;

    public static float a() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    public static float b(android.content.Context context) {
        return android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float c(android.graphics.Matrix matrix) {
        float[] fArr = (float[]) a.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) java.lang.Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static android.graphics.Bitmap d(android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(android.graphics.Path path, float f, float f2, float f3) {
        android.graphics.PathMeasure pathMeasure = (android.graphics.PathMeasure) b.get();
        android.graphics.Path path2 = (android.graphics.Path) c.get();
        android.graphics.Path path3 = (android.graphics.Path) d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f == 1.0f && f2 == 0.0f) && length >= 1.0f && java.lang.Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = java.lang.Math.min(f4, f5) + f6;
            float fMax = java.lang.Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = defpackage.hgh.a(fMin, length);
                fMax = defpackage.hgh.a(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = defpackage.hgh.a(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = defpackage.hgh.a(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }
}
