package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dpj {
    public final long a;

    public static java.lang.String a(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + dpi.b(java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f) + ", " + dpi.b(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f) + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dpj) && this.a == ((defpackage.dpj) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
