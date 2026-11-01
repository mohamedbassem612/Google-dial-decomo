package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umy {
    public final long a;
    public final java.lang.String b;
    public final long c;
    public final int d;
    public final java.lang.String e;
    public final android.net.Uri f;
    public final defpackage.unf g;
    public final java.util.List h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int l;

    public umy(long j, java.lang.String str, long j2, int i, java.lang.String str2, android.net.Uri uri, defpackage.unf unfVar, java.util.List list, boolean z, boolean z2, int i2, int i3) {
        aooh.f(str, "lookUpKey");
        aooh.f(str2, "name");
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = i;
        this.e = str2;
        this.f = uri;
        this.g = unfVar;
        this.h = list;
        this.i = z;
        this.j = z2;
        this.k = i2;
        this.l = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.umy) {
            defpackage.umy umyVar = (defpackage.umy) obj;
            if (this.a == umyVar.a && aooh.n(this.b, umyVar.b) && this.c == umyVar.c && this.d == umyVar.d && aooh.n(this.e, umyVar.e) && aooh.n(this.f, umyVar.f) && aooh.n(this.g, umyVar.g) && aooh.n(this.h, umyVar.h) && this.i == umyVar.i && this.j == umyVar.j && this.k == umyVar.k && this.l == umyVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((((((anty.M(this.a) * 31) + this.b.hashCode()) * 31) + anty.M(this.c)) * 31) + this.d) * 31) + this.e.hashCode();
        android.net.Uri uri = this.f;
        int iHashCode = ((iM * 31) + (uri == null ? 0 : uri.hashCode())) * 31;
        defpackage.unf unfVar = this.g;
        return ((((((((((iHashCode + (unfVar != null ? unfVar.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + anty.L(this.i)) * 31) + anty.L(this.j)) * 31) + this.k) * 31) + this.l;
    }

    public final java.lang.String toString() {
        return "FavoritesBarItemUiModel(contactId=" + this.a + ", lookUpKey=" + this.b + ", speedDialEntryId=" + this.c + ", pinnedPosition=" + this.d + ", name=" + this.e + ", photoUri=" + this.f + ", defaultChannel=" + this.g + ", channels=" + this.h + ", voiceOverWifi=" + this.i + ", videoOverWifi=" + this.j + ", position=" + this.k + ", totalContacts=" + this.l + ')';
    }
}
