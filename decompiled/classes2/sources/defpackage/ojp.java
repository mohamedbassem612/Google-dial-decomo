package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojp {
    public final android.net.Uri a;
    public final java.lang.String b;
    public final android.os.Bundle c;
    private final java.lang.String d;

    public ojp(android.net.Uri uri, java.lang.String str, android.os.Bundle bundle) {
        aooh.f(uri, "uri");
        this.a = uri;
        this.b = str;
        this.d = null;
        this.c = bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ojp) {
            defpackage.ojp ojpVar = (defpackage.ojp) obj;
            if (aooh.n(this.a, ojpVar.a) && aooh.n(this.b, ojpVar.b)) {
                java.lang.String str = ojpVar.d;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.c, ojpVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        android.os.Bundle bundle = this.c;
        return (iHashCode * 961) + (bundle == null ? 0 : bundle.hashCode());
    }

    public final java.lang.String toString() {
        return "RemoteMethod(uri=" + this.a + ", methodName=" + this.b + ", arg=null, extras=" + this.c + ')';
    }
}
