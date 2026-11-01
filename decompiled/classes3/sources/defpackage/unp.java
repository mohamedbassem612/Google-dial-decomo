package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class unp {
    public final long a;
    public final int b;
    public final java.lang.String c;
    public final long d;
    public final java.lang.String e;
    public final long f;
    public final java.lang.String g;
    public final java.util.List h;
    public final defpackage.unf i;
    public final wgi j;

    public unp(long j, int i, java.lang.String str, long j2, java.lang.String str2, long j3, java.lang.String str3, java.util.List list, defpackage.unf unfVar, wgi wgiVar) {
        aooh.f(str, "name");
        aooh.f(str2, "lookUpKey");
        aooh.f(wgiVar, "wifiCallingIconsConfig");
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = j2;
        this.e = str2;
        this.f = j3;
        this.g = str3;
        this.h = list;
        this.i = unfVar;
        this.j = wgiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.unp) {
            defpackage.unp unpVar = (defpackage.unp) obj;
            if (this.a == unpVar.a && this.b == unpVar.b && aooh.n(this.c, unpVar.c) && this.d == unpVar.d && aooh.n(this.e, unpVar.e) && this.f == unpVar.f && aooh.n(this.g, unpVar.g) && aooh.n(this.h, unpVar.h) && aooh.n(this.i, unpVar.i) && aooh.n(this.j, unpVar.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = (((((((anty.M(this.a) * 31) + this.b) * 31) + this.c.hashCode()) * 31) + anty.M(this.d)) * 31) + this.e.hashCode();
        java.lang.String str = this.g;
        int iM2 = ((((((iM * 31) + anty.M(this.f)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode()) * 31;
        defpackage.unf unfVar = this.i;
        return ((iM2 + (unfVar != null ? unfVar.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    public final java.lang.String toString() {
        return "FavoritesBarItem(speedDialEntryId=" + this.a + ", pinnedPosition=" + this.b + ", name=" + this.c + ", contactId=" + this.d + ", lookUpKey=" + this.e + ", photoId=" + this.f + ", photoUri=" + this.g + ", channels=" + this.h + ", defaultChannel=" + this.i + ", wifiCallingIconsConfig=" + this.j + ')';
    }
}
