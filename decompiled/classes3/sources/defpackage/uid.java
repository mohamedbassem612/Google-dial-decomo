package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uid extends wsc {
    public final defpackage.uhu a;

    public uid(defpackage.uhu uhuVar) {
        this.a = uhuVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.uid) && this.a == ((defpackage.uid) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(verdict=" + this.a + ')';
    }
}
