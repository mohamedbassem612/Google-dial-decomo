package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpp {
    public final long a;

    public static java.lang.String a(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public static boolean b(long j, java.lang.Object obj) {
        return (obj instanceof defpackage.dpp) && j == ((defpackage.dpp) obj).a;
    }

    public final boolean equals(java.lang.Object obj) {
        return b(this.a, obj);
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
