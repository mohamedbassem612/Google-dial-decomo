package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmg {
    public final long a;
    public final java.util.List b;
    public final java.lang.String c;
    public final long d;
    public final java.lang.String e;
    public final java.lang.String f;

    public hmg(long j, java.util.List list, java.lang.String str, long j2, java.lang.String str2, java.lang.String str3) {
        aooh.f(list, "phoneInfos");
        aooh.f(str, "displayNamePrimary");
        aooh.f(str2, "photoThumbnailUri");
        aooh.f(str3, "lookupKey");
        this.a = j;
        this.b = list;
        this.c = str;
        this.d = j2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hmg) {
            defpackage.hmg hmgVar = (defpackage.hmg) obj;
            if (this.a == hmgVar.a && aooh.n(this.b, hmgVar.b) && aooh.n(this.c, hmgVar.c) && this.d == hmgVar.d && aooh.n(this.e, hmgVar.e) && aooh.n(this.f, hmgVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + anty.M(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "CompactContact(contactId=" + this.a + ", phoneInfos=" + this.b + ", displayNamePrimary=" + this.c + ", photoId=" + this.d + ", photoThumbnailUri=" + this.e + ", lookupKey=" + this.f + ')';
    }
}
