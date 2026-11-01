package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abpn {
    public final java.util.List a;

    public abpn(java.util.List list) {
        this.a = list;
        if (list.size() != 12) {
            throw new java.lang.IllegalStateException("Dialpad must have 12 keys.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.abpn) && aooh.n(this.a, ((defpackage.abpn) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "DialpadData(keys=" + this.a + ')';
    }
}
