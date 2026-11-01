package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfa implements defpackage.tfh {
    public final java.lang.String a = "";

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.tfa) && aooh.n(this.a, ((defpackage.tfa) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "AddContact(nameToPreFill=" + this.a + ')';
    }
}
