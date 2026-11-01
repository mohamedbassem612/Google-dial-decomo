package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dps {
    public static final defpackage.dpt[] a = {new defpackage.dpt(0), new defpackage.dpt(4294967296L), new defpackage.dpt(8589934592L)};
    public final long b;

    public static final float a(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long b(long j) {
        return a[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static java.lang.String c(long j) {
        long j2 = a[(int) ((1095216660480L & j) >>> 32)].a;
        if (j2 == 0) {
            return "Unspecified";
        }
        if (j2 == 4294967296L) {
            return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ".sp";
        }
        if (j2 != 8589934592L) {
            return "Invalid";
        }
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ".em";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dps) && this.b == ((defpackage.dps) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return c(this.b);
    }
}
