package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfd {
    public static final int a(int i, boolean z) {
        return ac$.ExternalSyntheticApiModelOutline0.m(i, z);
    }

    public static final void b(android.view.View view) {
        ac$.ExternalSyntheticApiModelOutline0.m(view);
    }

    public static final void c(android.view.View view) {
        ac$.ExternalSyntheticApiModelOutline0.m(view, defpackage.dfc.a);
    }

    public static final boolean d(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f3 * f8) - (f4 * f7);
        float f18 = (f9 * f14) - (f10 * f13);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f9 * f15) - (f11 * f13);
        float f21 = (f2 * f7) - (f3 * f6);
        float f22 = (f9 * f16) - (f12 * f13);
        float f23 = (f * f8) - (f4 * f5);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f * f7) - (f3 * f5);
        float f26 = (f10 * f16) - (f12 * f14);
        float f27 = (f * f6) - (f2 * f5);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f27 * f28) - (f25 * f26)) + (f23 * f24)) + (f21 * f22)) - (f19 * f20)) + (f17 * f18);
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = (((f6 * f28) - (f7 * f26)) + (f8 * f24)) * f30;
            fArr2[1] = ((((-f2) * f28) + (f3 * f26)) - (f4 * f24)) * f30;
            fArr2[2] = (((f14 * f17) - (f15 * f19)) + (f16 * f21)) * f30;
            fArr2[3] = ((((-f10) * f17) + (f11 * f19)) - (f12 * f21)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f31 * f28) + (f7 * f22)) - (f8 * f20)) * f30;
            fArr2[5] = (((f28 * f) - (f3 * f22)) + (f4 * f20)) * f30;
            float f32 = -f13;
            fArr2[6] = (((f32 * f17) + (f15 * f23)) - (f16 * f25)) * f30;
            fArr2[7] = (((f17 * f9) - (f11 * f23)) + (f12 * f25)) * f30;
            fArr2[8] = (((f5 * f26) - (f6 * f22)) + (f8 * f18)) * f30;
            fArr2[9] = ((((-f) * f26) + (f22 * f2)) - (f4 * f18)) * f30;
            fArr2[10] = (((f13 * f19) - (f14 * f23)) + (f16 * f27)) * f30;
            fArr2[11] = ((((-f9) * f19) + (f23 * f10)) - (f12 * f27)) * f30;
            fArr2[12] = (((f31 * f24) + (f6 * f20)) - (f7 * f18)) * f30;
            fArr2[13] = (((f * f24) - (f2 * f20)) + (f3 * f18)) * f30;
            fArr2[14] = (((f32 * f21) + (f14 * f25)) - (f15 * f27)) * f30;
            fArr2[15] = (((f9 * f21) - (f10 * f25)) + (f11 * f27)) * f30;
        }
        return f29 != 0.0f;
    }

    public static final long e(int i, int i2) {
        if (i < 0 || i2 < 0) {
            dnv.b(defpackage.a.bv((byte) 93, i2, i, "start and end cannot be negative. [start: ", ", end: "));
        }
        return (((long) i) << 32) | (((long) i2) & 4294967295L);
    }

    public static final int f(int i, defpackage.dnw dnwVar) {
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i != 3 && i != 0) {
                throw new java.lang.IllegalStateException("Invalid TextDirection.");
            }
            int layoutDirectionFromLocale = android.text.TextUtils.getLayoutDirectionFromLocale(dnwVar.a);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                return 2;
            }
        }
        return 3;
    }

    public static final boolean g(defpackage.dkz dkzVar) {
        defpackage.dki dkiVar = dkzVar.d;
        defpackage.djq djqVar = dkiVar != null ? new defpackage.djq(dkiVar.b.b) : null;
        return djqVar == null || djqVar.a != 1;
    }

    public static final defpackage.cpn h(defpackage.dpo dpoVar) {
        return new defpackage.cpn(dpoVar.b, dpoVar.c, dpoVar.d, dpoVar.e);
    }

    public static final defpackage.dpo i(long j, long j2) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        return new defpackage.dpo(i2, i, ((int) (j2 >> 32)) + i2, ((int) (j2 & 4294967295L)) + i);
    }

    public static final defpackage.dpo j(defpackage.cpn cpnVar) {
        return new defpackage.dpo(java.lang.Math.round(cpnVar.b), java.lang.Math.round(cpnVar.c), java.lang.Math.round(cpnVar.d), java.lang.Math.round(cpnVar.e));
    }

    public static final long k(long j, long j2) {
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long l(long j) {
        return (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32)))) << 32) | (((long) java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L);
    }

    public static float m(defpackage.dpl dplVar, long j) {
        defpackage.dpv dpvVarA;
        if (defpackage.dps.a[(int) ((1095216660480L & j) >>> 32)].a != 4294967296L) {
            dpm.b("Only Sp can convert to Px");
        }
        int i = defpackage.dpw.a;
        int i2 = (int) (j & 4294967295L);
        if (dplVar.b() >= 1.03f && (dpvVarA = defpackage.dpw.a(dplVar.b())) != null) {
            return dpvVarA.b(java.lang.Float.intBitsToFloat(i2));
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
        float fB = dplVar.b();
        return fIntBitsToFloat * fB;
    }

    public static long n(defpackage.dpl dplVar, float f) {
        long jFloatToRawIntBits;
        int i = defpackage.dpw.a;
        if (dplVar.b() >= 1.03f) {
            defpackage.dpv dpvVarA = defpackage.dpw.a(dplVar.b());
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(dpvVarA != null ? dpvVarA.a(f) : f / dplVar.b());
            defpackage.dpt[] dptVarArr = defpackage.dps.a;
        } else {
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f / dplVar.b());
            defpackage.dpt[] dptVarArr2 = defpackage.dps.a;
        }
        return (jFloatToRawIntBits & 4294967295L) | 4294967296L;
    }

    public static float o(defpackage.dpf dpfVar, long j) {
        if (defpackage.dps.a[(int) ((1095216660480L & j) >>> 32)].a != 4294967296L) {
            dpm.b("Only Sp can convert to Px");
        }
        return dpfVar.dl(dpfVar.dh(j));
    }

    public static int p(defpackage.dpf dpfVar, float f) {
        float fDl = dpfVar.dl(f);
        if (java.lang.Float.isInfinite(fDl)) {
            return Integer.MAX_VALUE;
        }
        return java.lang.Math.round(fDl);
    }

    public static long q(defpackage.dpf dpfVar, long j) {
        if (j != 9205357640488583168L) {
            return defpackage.mni.bj(dpfVar.di(java.lang.Float.intBitsToFloat((int) (j >> 32))), dpfVar.di(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static long r(defpackage.dpf dpfVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fDl = dpfVar.dl(java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f);
        float fDl2 = dpfVar.dl(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f);
        return (((long) java.lang.Float.floatToRawIntBits(fDl)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fDl2)) & 4294967295L);
    }
}
