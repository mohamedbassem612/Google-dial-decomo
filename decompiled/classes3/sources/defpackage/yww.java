package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yww implements defpackage.ywz {
    public final defpackage.ywx a;

    public yww(defpackage.ywx ywxVar) {
        this.a = ywxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.yww) && this.a == ((defpackage.yww) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "NotMet(reason=" + this.a + ')';
    }
}
