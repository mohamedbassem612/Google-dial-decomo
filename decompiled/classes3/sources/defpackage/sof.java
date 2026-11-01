package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sof {
    public final android.net.Uri a;
    public final java.lang.String b;

    public sof(android.net.Uri uri, java.lang.String str) {
        aooh.f(uri, "uri");
        aooh.f(str, "packageName");
        this.a = uri;
        this.b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sof) {
            defpackage.sof sofVar = (defpackage.sof) obj;
            if (aooh.n(this.a, sofVar.a) && aooh.n(this.b, sofVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "ThirdPartyLookupUri(uri=" + this.a + ", packageName=" + this.b + ')';
    }
}
