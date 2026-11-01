package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kid {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final int f;

    public kid(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i) {
        defpackage.aooh.f(str, "uuid");
        defpackage.aooh.f(str2, "name");
        defpackage.aooh.f(str3, "photoThumbnailUri");
        defpackage.aooh.f(str4, "packageName");
        defpackage.aooh.f(str5, "lookupKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kid) {
            defpackage.kid kidVar = (defpackage.kid) obj;
            if (defpackage.aooh.n(this.a, kidVar.a) && defpackage.aooh.n(this.b, kidVar.b) && defpackage.aooh.n(this.c, kidVar.c) && defpackage.aooh.n(this.d, kidVar.d) && defpackage.aooh.n(this.e, kidVar.e) && this.f == kidVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f;
    }

    public final java.lang.String toString() {
        return "PeopleDirectoryContactEntity(uuid=" + this.a + ", name=" + this.b + ", photoThumbnailUri=" + this.c + ", packageName=" + this.d + ", lookupKey=" + this.e + ", capabilities=" + this.f + ')';
    }
}
