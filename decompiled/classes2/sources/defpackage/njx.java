package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class njx implements defpackage.nke {
    public final defpackage.njt a;

    public njx(defpackage.njt njtVar) {
        this.a = njtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.njx) && this.a == ((defpackage.njx) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ConnectToUserEvent(displayLabel=" + this.a + ')';
    }

    public njx() {
        this(defpackage.njt.NONE);
    }
}
