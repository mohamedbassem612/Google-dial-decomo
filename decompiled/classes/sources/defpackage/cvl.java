package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cvl {
    private final long a;

    public static java.lang.String a(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.cvl) && this.a == ((defpackage.cvl) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
