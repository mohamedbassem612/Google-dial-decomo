package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abtt {
    private final long a;
    private final int b;

    public abtt(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.abtt) {
            defpackage.abtt abttVar = (defpackage.abtt) obj;
            if (this.a == abttVar.a && this.b == abttVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b;
    }

    public final java.lang.String toString() {
        return "VerificationFailureKey{protoId=" + this.a + ", verificationFailure=" + java.lang.Integer.toString(this.b - 2) + '}';
    }

    public abtt() {
        throw null;
    }
}
