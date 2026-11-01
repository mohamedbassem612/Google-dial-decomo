package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kjn {
    public final long a;

    public kjn(long j) {
        this.a = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.kjn) && this.a == ((defpackage.kjn) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return anty.M(this.a);
    }

    public final java.lang.String toString() {
        return "GroupedCall(timestamp=" + this.a + ')';
    }
}
