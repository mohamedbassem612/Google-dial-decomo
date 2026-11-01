package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dpt {
    public final long a;

    public static java.lang.String a(long j) {
        if (j == 0) {
            return "Unspecified";
        }
        if (j == 4294967296L) {
            return "Sp";
        }
        return j == 8589934592L ? "Em" : "Invalid";
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dpt) && this.a == ((defpackage.dpt) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return a(this.a);
    }
}
