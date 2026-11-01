package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cse extends defpackage.crn {
    public cse() {
        super("Generic XYZ", 12884901889L, 14);
    }

    @Override // defpackage.crn
    public final float a(int i) {
        return 2.0f;
    }

    @Override // defpackage.crn
    public final float b(int i) {
        return -2.0f;
    }

    @Override // defpackage.crn
    public final float c(float f, float f2, float f3) {
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            return 2.0f;
        }
        return f3;
    }

    @Override // defpackage.crn
    public final long d(float f, float f2, float f3) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        return (jFloatToRawIntBits << 32) | (((long) java.lang.Float.floatToRawIntBits(f2 <= 2.0f ? f2 : 2.0f)) & 4294967295L);
    }

    @Override // defpackage.crn
    public final long e(float f, float f2, float f3, float f4, defpackage.crn crnVar) {
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        return defpackage.cfd.N(f, f2, f3 <= 2.0f ? f3 : 2.0f, f4, crnVar);
    }
}
