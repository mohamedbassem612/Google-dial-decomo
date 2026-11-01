package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dnv {
    public static final java.lang.Void a(java.lang.String str) {
        throw new java.lang.IllegalStateException("Text drawing wrapper is missing a Canvas!");
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void d(android.text.TextPaint textPaint, float f) {
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(java.lang.Math.round(f * 255.0f));
    }

    public static final float e(float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(((int) ((((long) java.lang.Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final float f(float f, float f2, float f3, float f4, float f5) {
        return f + ((f2 - f) * java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }
}
