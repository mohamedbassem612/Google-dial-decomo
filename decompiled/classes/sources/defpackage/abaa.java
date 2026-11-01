package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abaa {
    public final java.lang.String a = "ondevicesafety-pa.googleapis.com:443";
    public final java.lang.String b = "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8";

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abaa) {
            defpackage.abaa abaaVar = (defpackage.abaa) obj;
            if (defpackage.aooh.n(this.a, abaaVar.a) && defpackage.aooh.n(this.b, abaaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PersephoneServer(hostUrl=" + this.a + ", apiKey=" + this.b + ')';
    }
}
