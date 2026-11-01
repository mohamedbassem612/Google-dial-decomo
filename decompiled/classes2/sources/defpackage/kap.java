package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kap implements defpackage.kaq {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public kap(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        aooh.f(str, "uuid");
        aooh.f(str2, "cachedLookupUri");
        aooh.f(str3, "packageName");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.kap) {
            defpackage.kap kapVar = (defpackage.kap) obj;
            if (aooh.n(this.a, kapVar.a) && aooh.n(this.b, kapVar.b) && aooh.n(this.c, kapVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ThirdPartyEntryKey(uuid=" + this.a + ", cachedLookupUri=" + this.b + ", packageName=" + this.c + ')';
    }
}
