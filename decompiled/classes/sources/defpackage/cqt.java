package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqt {
    public final float[] a;

    public /* synthetic */ cqt(float[] fArr) {
        this.a = fArr;
    }

    public static final long a(float[] fArr, long j) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        float f11 = (f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2) + f7;
        float f12 = (f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8;
        if ((java.lang.Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return (((long) java.lang.Float.floatToRawIntBits(f11 * f10)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f10 * f12)) & 4294967295L);
    }

    public static final void b(float[] fArr, defpackage.cpl cplVar) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float f10 = cplVar.a;
        float f11 = f3 * f10;
        float f12 = cplVar.b;
        float f13 = f6 * f12;
        float f14 = cplVar.c;
        float f15 = cplVar.d;
        float f16 = 1.0f / ((f11 + f13) + f9);
        int iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f16) & Integer.MAX_VALUE;
        float f17 = f * f10;
        float f18 = f4 * f12;
        float f19 = f17 + f18 + f7;
        float f20 = f10 * f2;
        float f21 = f12 * f5;
        float f22 = f20 + f21 + f8;
        float f23 = f6 * f15;
        float f24 = 1.0f / ((f11 + f23) + f9);
        int iFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f24) & Integer.MAX_VALUE;
        float f25 = f4 * f15;
        float f26 = f17 + f25 + f7;
        float f27 = f5 * f15;
        float f28 = f20 + f27 + f8;
        float f29 = f3 * f14;
        float f30 = 1.0f / ((f13 + f29) + f9);
        int iFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f30) & Integer.MAX_VALUE;
        float f31 = f * f14;
        float f32 = f31 + f18 + f7;
        float f33 = f14 * f2;
        float f34 = f21 + f33 + f8;
        float f35 = 1.0f / ((f29 + f23) + f9);
        int iFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(f35) & Integer.MAX_VALUE;
        float f36 = f31 + f25 + f7;
        float f37 = f33 + f27 + f8;
        if (iFloatToRawIntBits2 >= 2139095040) {
            f24 = 0.0f;
        }
        float f38 = f24 * f26;
        if (iFloatToRawIntBits3 >= 2139095040) {
            f30 = 0.0f;
        }
        float f39 = f30 * f32;
        if (iFloatToRawIntBits4 >= 2139095040) {
            f35 = 0.0f;
        }
        float f40 = f35 * f36;
        float fMin = java.lang.Math.min(f38, java.lang.Math.min(f39, f40));
        if (iFloatToRawIntBits >= 2139095040) {
            f16 = 0.0f;
        }
        float f41 = f16 * f19;
        cplVar.a = java.lang.Math.min(f41, fMin);
        float f42 = f24 * f28;
        float f43 = f30 * f34;
        float f44 = f35 * f37;
        float f45 = f16 * f22;
        cplVar.b = java.lang.Math.min(f45, java.lang.Math.min(f42, java.lang.Math.min(f43, f44)));
        cplVar.c = java.lang.Math.max(f41, java.lang.Math.max(f38, java.lang.Math.max(f39, f40)));
        cplVar.d = java.lang.Math.max(f45, java.lang.Math.max(f42, java.lang.Math.max(f43, f44)));
    }

    public static final void c(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void d(float[] fArr, float f) {
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) java.lang.Math.sin(d);
        float fCos = (float) java.lang.Math.cos(d);
        float f2 = fArr[0];
        float f3 = fCos * f2;
        float f4 = fArr[4];
        float f5 = fSin * f4;
        float f6 = -fSin;
        float f7 = fArr[1];
        float f8 = fCos * f7;
        float f9 = fArr[5];
        float f10 = fSin * f9;
        float f11 = fArr[2];
        float f12 = fCos * f11;
        float f13 = fArr[6];
        float f14 = fSin * f13;
        float f15 = fArr[3];
        float f16 = fArr[7];
        fArr[0] = f3 + f5;
        fArr[1] = f8 + f10;
        fArr[2] = f12 + f14;
        fArr[3] = (fCos * f15) + (fSin * f16);
        fArr[4] = (f2 * f6) + (f4 * fCos);
        fArr[5] = (f7 * f6) + (f9 * fCos);
        fArr[6] = (f11 * f6) + (f13 * fCos);
        fArr[7] = (f6 * f15) + (fCos * f16);
    }

    public static /* synthetic */ float[] e() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final void f(float[] fArr) {
        float f = fArr[1];
        float f2 = fArr[2];
        float f3 = fArr[5];
        float f4 = fArr[6];
        float f5 = fArr[9];
        float f6 = fArr[10];
        float f7 = fArr[13];
        float f8 = fArr[14];
        fArr[1] = (f * (-1.0f)) - (f2 * 1.2246469E-16f);
        fArr[2] = (f * 1.2246469E-16f) + (f2 * (-1.0f));
        fArr[5] = (f3 * (-1.0f)) - (f4 * 1.2246469E-16f);
        fArr[6] = (f3 * 1.2246469E-16f) + (f4 * (-1.0f));
        fArr[9] = (f5 * (-1.0f)) - (f6 * 1.2246469E-16f);
        fArr[10] = (f5 * 1.2246469E-16f) + (f6 * (-1.0f));
        fArr[13] = (f7 * (-1.0f)) - (f8 * 1.2246469E-16f);
        fArr[14] = (f7 * 1.2246469E-16f) + (f8 * (-1.0f));
    }

    public static final void g(float[] fArr, float f, float f2) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
    }

    public static final void h(float[] fArr, float f, float f2) {
        float f3 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * 0.0f) + fArr[12];
        float f4 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * 0.0f) + fArr[13];
        float f5 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * 0.0f) + fArr[14];
        float f6 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * 0.0f) + fArr[15];
        fArr[12] = f3;
        fArr[13] = f4;
        fArr[14] = f5;
        fArr[15] = f6;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cqt) && defpackage.aooh.n(this.a, ((defpackage.cqt) obj).a);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.a);
    }

    public final java.lang.String toString() {
        float[] fArr = this.a;
        return defpackage.aoov.l("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }
}
