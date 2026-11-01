package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqg {
    public final long a;

    public /* synthetic */ cqg(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        float f;
        float f2;
        if ((63 & j) == 0) {
            f = (float) ((j >>> 56) + 0.0d);
            f2 = 255.0f;
        } else {
            f = (float) (((j >>> 6) & 1023) + 0.0d);
            f2 = 1023.0f;
        }
        return f / f2;
    }

    public static final float b(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) (((j >>> 32) & 255) + 0.0d)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        char c = (char) s;
        int i3 = c & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3 + 1056964608) - cql.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return java.lang.Float.intBitsToFloat((i5 << 16) | (i2 << 23) | i);
    }

    public static final float c(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) (((j >>> 40) & 255) + 0.0d)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        char c = (char) s;
        int i3 = c & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3 + 1056964608) - cql.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return java.lang.Float.intBitsToFloat((i5 << 16) | (i2 << 23) | i);
    }

    public static final float d(long j) {
        int i;
        int i2;
        long j2 = 63 & j;
        long j3 = j >>> 48;
        if (j2 == 0) {
            return ((float) ((j3 & 255) + 0.0d)) / 255.0f;
        }
        short s = (short) j3;
        char c = (char) s;
        int i3 = c & 1023;
        int i4 = (s >>> 10) & 31;
        int i5 = c & 32768;
        if (i4 != 0) {
            i = i3 << 13;
            if (i4 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = i4 + 112;
            }
        } else {
            if (i3 != 0) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3 + 1056964608) - cql.a;
                return i5 != 0 ? -fIntBitsToFloat : fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return java.lang.Float.intBitsToFloat((i5 << 16) | (i2 << 23) | i);
    }

    public static final long e(long j, defpackage.crn crnVar) {
        defpackage.crs crsVarZ;
        float[] fArr = defpackage.crp.a;
        defpackage.crn crnVar2 = defpackage.crp.y[(int) (63 & j)];
        int i = crnVar2.c;
        int i2 = crnVar.c;
        if ((i | i2) < 0) {
            crsVarZ = defpackage.cfd.z(crnVar2, crnVar);
        } else {
            int i3 = i | (i2 << 6);
            defpackage.aco acoVar = defpackage.crt.a;
            java.lang.Object objA = acoVar.a(i3);
            if (objA == null) {
                objA = defpackage.cfd.z(crnVar2, crnVar);
                acoVar.g(i3, objA);
            }
            crsVarZ = (defpackage.crs) objA;
        }
        return crsVarZ.a(j);
    }

    public static final defpackage.crn f(long j) {
        float[] fArr = defpackage.crp.a;
        return defpackage.crp.y[(int) (j & 63)];
    }

    public static java.lang.String g(long j) {
        float fD = d(j);
        float fC = c(j);
        float fB = b(j);
        float[] fArr = defpackage.crp.a;
        return "Color(" + fD + ", " + fC + ", " + fB + ", " + a(j) + ", " + defpackage.crp.y[(int) (63 & j)].a + ')';
    }

    public static /* synthetic */ long h(long j, float f) {
        float fD = d(j);
        float fC = c(j);
        float fB = b(j);
        float[] fArr = defpackage.crp.a;
        return defpackage.cfd.N(fD, fC, fB, f, defpackage.crp.y[(int) (j & 63)]);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cqg) && this.a == ((defpackage.cqg) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return g(this.a);
    }
}
