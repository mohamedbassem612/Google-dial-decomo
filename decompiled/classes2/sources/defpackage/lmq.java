package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmq {
    public final android.telecom.Call.Details a;
    public final boolean b;

    public lmq(android.telecom.Call.Details details, boolean z) {
        this.a = details;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lmq) {
            defpackage.lmq lmqVar = (defpackage.lmq) obj;
            if (aooh.n(this.a, lmqVar.a) && this.b == lmqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "CallScreeningDetails(callDetails=" + this.a + ", isSanitized=" + this.b + ')';
    }
}
