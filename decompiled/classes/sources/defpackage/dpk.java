package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpk {
    public final long a;

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f;
    }

    public static final float b(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dpk) && this.a == ((defpackage.dpk) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return defpackage.dpi.b(java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f) + " x " + defpackage.dpi.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f);
    }
}
