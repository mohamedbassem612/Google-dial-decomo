package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syc {
    public final android.net.Uri a;
    private final java.lang.String b;

    public syc(android.net.Uri uri, java.lang.String str) {
        if (uri == null) {
            throw new java.lang.NullPointerException("Null callUri");
        }
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.syc) {
            defpackage.syc sycVar = (defpackage.syc) obj;
            if (this.a.equals(sycVar.a)) {
                java.lang.String str = this.b;
                if (str == null) {
                    if (sycVar.b == null) {
                        return true;
                    }
                } else if (str.equals(sycVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "CallInfo{callUri=" + this.a.toString() + ", phoneNumber=" + this.b + '}';
    }

    public syc() {
        throw null;
    }
}
