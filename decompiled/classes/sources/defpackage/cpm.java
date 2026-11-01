package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpm {
    public final long a;

    public /* synthetic */ cpm(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) java.lang.Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final long b(long j, float f) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / f;
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static java.lang.String c(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + defpackage.rz.j(java.lang.Float.intBitsToFloat((int) (j >> 32))) + ", " + defpackage.rz.j(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cpm) && this.a == ((defpackage.cpm) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return c(this.a);
    }
}
