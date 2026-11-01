package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abuj implements defpackage.abuo {
    public final defpackage.abtx a;

    public abuj(defpackage.abtx abtxVar) {
        this.a = abtxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abuj) && aooh.n(this.a, ((defpackage.abuj) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "GetSuccess(callingCardData=" + this.a + ')';
    }
}
