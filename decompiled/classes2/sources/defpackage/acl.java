package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acl {
    public final long a;

    public static final int a(long j) {
        return (int) (j >> 32);
    }

    public static final int b(long j) {
        return (int) (j & 4294967295L);
    }

    public static long c(int i, int i2) {
        return (((long) i) << 32) | (((long) i2) & 4294967295L);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.acl) && this.a == ((defpackage.acl) obj).a;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        long j = this.a;
        sb.append(a(j));
        sb.append(", ");
        sb.append(b(j));
        sb.append(')');
        return sb.toString();
    }
}
