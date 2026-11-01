package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yxw extends defpackage.yxy {
    public final int a;

    public yxw(int i) {
        super(false);
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yxw) && this.a == ((defpackage.yxw) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HadesQueryFailure(reason=");
        sb.append((java.lang.Object) (this.a != 1 ? "INVALID_ACTION" : "UNKNOWN"));
        sb.append(')');
        return sb.toString();
    }
}
