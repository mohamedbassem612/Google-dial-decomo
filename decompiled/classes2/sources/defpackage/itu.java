package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class itu implements defpackage.itr {
    public final defpackage.itq a;

    public itu(defpackage.itq itqVar) {
        this.a = itqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.itu) && this.a == ((defpackage.itu) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ErrorGeneratingCallActions(errorType=" + this.a + ')';
    }
}
