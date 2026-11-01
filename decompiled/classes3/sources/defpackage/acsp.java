package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsp {
    public static final float[] a = {0.12f, 0.28f, 0.48f, 0.72f, 1.0f};
    public static final float[] b = {1.0f, 0.7f, 0.42f, 0.18f};
    public static final float[] c = {0.0f, 0.07f, 0.15f, 0.25f, 0.38f, 0.54f, 0.74f, 1.0f};
    public static final float[] d = d(1.75f);
    public static final float[] e = d(3.4f);

    public static final float a(float f) {
        return f - ((float) java.lang.Math.floor(f));
    }

    public static final float b(float f, float f2, float f3, float f4, float f5) {
        float fAbs = java.lang.Math.abs(f) - f3;
        float fAbs2 = java.lang.Math.abs(f2) - f4;
        float f6 = fAbs + f5;
        float fMax = java.lang.Math.max(f6, 0.0f);
        float f7 = fAbs2 + f5;
        float fMax2 = java.lang.Math.max(f7, 0.0f);
        return (java.lang.Math.min(java.lang.Math.max(f6, f7), 0.0f) + ((float) java.lang.Math.sqrt((fMax * fMax) + (fMax2 * fMax2)))) - f5;
    }

    public static final short[] c(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        short[] sArr = new short[i3 * 6 * i4];
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = (i6 * i2) + i7;
                int i9 = i8 + i2;
                int i10 = i9 + 1;
                sArr[i5] = (short) i8;
                short s = (short) i9;
                sArr[i5 + 1] = s;
                short s2 = (short) (i8 + 1);
                sArr[i5 + 2] = s2;
                sArr[i5 + 3] = s;
                int i11 = i5 + 5;
                sArr[i5 + 4] = (short) i10;
                i5 += 6;
                sArr[i11] = s2;
            }
        }
        return sArr;
    }

    private static final float[] d(float f) {
        float[] fArr = new float[65];
        for (int i = 0; i < 65; i++) {
            fArr[i] = (float) java.lang.Math.pow(1.0f - (i / 64.0f), f);
        }
        return fArr;
    }
}
