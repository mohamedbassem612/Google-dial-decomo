package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itv implements defpackage.itt {
    public final int a;

    public itv(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.itv) && this.a == ((defpackage.itv) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorGeneratingDecision(errorType=");
        sb.append((java.lang.Object) (this.a != 2 ? "TERMINAL_FAILURE" : "TRANSIENT_FAILURE"));
        sb.append(')');
        return sb.toString();
    }
}
