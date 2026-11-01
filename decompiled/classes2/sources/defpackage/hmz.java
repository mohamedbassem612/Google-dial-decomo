package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hmz {
    public final java.lang.String a;
    public final long b;
    public final java.lang.String c;
    public final long d;
    public final java.lang.String e;
    public final java.util.List f;
    public final upl g;
    public final java.lang.Integer h;

    public hmz(java.lang.String str, long j, java.lang.String str2, long j2, java.lang.String str3, java.util.List list, upl uplVar, java.lang.Integer num) {
        aooh.f(str, "name");
        aooh.f(str2, "lookupKey");
        aooh.f(str3, "photoUri");
        aooh.f(list, "channels");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = j2;
        this.e = str3;
        this.f = list;
        this.g = uplVar;
        this.h = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hmz) {
            defpackage.hmz hmzVar = (defpackage.hmz) obj;
            if (aooh.n(this.a, hmzVar.a) && this.b == hmzVar.b && aooh.n(this.c, hmzVar.c) && this.d == hmzVar.d && aooh.n(this.e, hmzVar.e) && aooh.n(this.f, hmzVar.f) && aooh.n(this.g, hmzVar.g) && aooh.n(this.h, hmzVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.c.hashCode()) * 31) + anty.M(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        upl uplVar = this.g;
        int iHashCode2 = ((iHashCode * 31) + (uplVar == null ? 0 : uplVar.hashCode())) * 31;
        java.lang.Integer num = this.h;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompactFavorite(name=" + this.a + ", contactId=" + this.b + ", lookupKey=" + this.c + ", photoId=" + this.d + ", photoUri=" + this.e + ", channels=" + this.f + ", defaultChannel=" + this.g + ", pinnedPosition=" + this.h + ')';
    }
}
