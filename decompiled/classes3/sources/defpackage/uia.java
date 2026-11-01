package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uia extends wsc {
    public final defpackage.uht a;

    public uia(defpackage.uht uhtVar) {
        this.a = uhtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.uia) && this.a == ((defpackage.uia) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(cause=" + this.a + ')';
    }
}
