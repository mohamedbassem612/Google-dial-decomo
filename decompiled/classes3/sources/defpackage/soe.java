package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class soe {
    public static final defpackage.soe a = new defpackage.soe("", "", "", "", -1);
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;

    public soe(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i) {
        aooh.f(str, "lookupKey");
        aooh.f(str2, "packageName");
        aooh.f(str3, "displayName");
        aooh.f(str4, "photoUri");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.soe) {
            defpackage.soe soeVar = (defpackage.soe) obj;
            if (aooh.n(this.b, soeVar.b) && aooh.n(this.c, soeVar.c) && aooh.n(this.d, soeVar.d) && aooh.n(this.e, soeVar.e) && this.f == soeVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f;
    }

    public final java.lang.String toString() {
        return "PeopleInfo(lookupKey=" + this.b + ", packageName=" + this.c + ", displayName=" + this.d + ", photoUri=" + this.e + ", capability=" + this.f + ')';
    }
}
