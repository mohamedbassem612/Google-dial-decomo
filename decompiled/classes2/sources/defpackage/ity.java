package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ity {
    public final long a;

    public ity(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.ity) && this.a == ((defpackage.ity) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "Timestamp(timestampMs=" + this.a + ')';
    }
}
