package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dky {
    public static final long a = defpackage.dfd.e(0, 0);
    public final long b;

    public static final int a(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int b(long j) {
        return java.lang.Math.max((int) (j >> 32), (int) (4294967295L & j));
    }

    public static final int c(long j) {
        return java.lang.Math.min((int) (j >> 32), (int) (4294967295L & j));
    }

    public static final int d(long j) {
        return (int) (j >> 32);
    }

    public static java.lang.String e(long j) {
        return "TextRange(" + ((int) (j >> 32)) + ", " + ((int) (j & 4294967295L)) + ')';
    }

    public static final boolean f(long j) {
        return ((int) (j >> 32)) == ((int) (4294967295L & j));
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dky) && this.b == ((defpackage.dky) obj).b;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return e(this.b);
    }
}
