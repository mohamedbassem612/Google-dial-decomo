package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cml implements cmj {
    private final float a;
    private final float b;

    public cml(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final long a(long j, long j2, dpq dpqVar) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        return (((long) java.lang.Math.round((((int) (j3 >> 32)) / 2.0f) * (this.a + 1.0f))) << 32) | (((long) java.lang.Math.round((((int) (j3 & 4294967295L)) / 2.0f) * (this.b + 1.0f))) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cml) {
            defpackage.cml cmlVar = (defpackage.cml) obj;
            if (java.lang.Float.compare(this.a, cmlVar.a) == 0 && java.lang.Float.compare(this.b, cmlVar.b) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ')';
    }
}
