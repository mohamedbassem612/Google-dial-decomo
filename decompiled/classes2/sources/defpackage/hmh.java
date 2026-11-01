package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmh {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;
    private final java.lang.Integer g;

    public hmh(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, java.lang.String str4) {
        aooh.f(str, "name");
        aooh.f(str2, "photoUri");
        aooh.f(str4, "lookupUri");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.e = str3;
        this.f = null;
        this.g = null;
        this.d = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hmh) {
            defpackage.hmh hmhVar = (defpackage.hmh) obj;
            if (aooh.n(this.a, hmhVar.a) && aooh.n(this.b, hmhVar.b) && this.c == hmhVar.c && aooh.n(this.e, hmhVar.e)) {
                java.lang.String str = hmhVar.f;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    java.lang.Integer num = hmhVar.g;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n(this.d, hmhVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        java.lang.String str = this.e;
        return (((((iHashCode * 31) + anty.M(this.c)) * 31) + (str == null ? 0 : str.hashCode())) * 29791) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ContactInfo(name=" + this.a + ", photoUri=" + this.b + ", photoId=" + this.c + ", numberTypeLabel=" + this.e + ", numberLabel=null, numberType=null, lookupUri=" + this.d + ')';
    }
}
