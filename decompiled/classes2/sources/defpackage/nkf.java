package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nkf extends mni {
    private final int a;

    public nkf(int i) {
        super((char[]) null);
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.nkf) && this.a == ((defpackage.nkf) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(reason=");
        sb.append((java.lang.Object) (this.a != 2 ? "RUNNER_FAILED_TO_INIT" : "NO_RUNNER_FOR_USE_CASE"));
        sb.append(')');
        return sb.toString();
    }
}
