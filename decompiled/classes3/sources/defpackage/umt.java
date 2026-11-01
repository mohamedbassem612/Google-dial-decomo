package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class umt {
    public final java.lang.String a;
    public final android.net.Uri b;
    public final java.util.List c;
    public final defpackage.unf d;
    public final int e;
    public final int f;

    public umt(java.lang.String str, android.net.Uri uri, java.util.List list, defpackage.unf unfVar, int i, int i2) {
        aooh.f(str, "name");
        this.a = str;
        this.b = uri;
        this.c = list;
        this.d = unfVar;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.umt) {
            defpackage.umt umtVar = (defpackage.umt) obj;
            if (aooh.n(this.a, umtVar.a) && aooh.n(this.b, umtVar.b) && aooh.n(this.c, umtVar.c) && aooh.n(this.d, umtVar.d) && this.e == umtVar.e && this.f == umtVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        android.net.Uri uri = this.b;
        int iHashCode2 = (((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31) + this.c.hashCode()) * 31;
        defpackage.unf unfVar = this.d;
        return ((((iHashCode2 + (unfVar != null ? unfVar.hashCode() : 0)) * 31) + this.e) * 31) + this.f;
    }

    public final java.lang.String toString() {
        return "FavoriteCallRequest(name=" + this.a + ", photoUri=" + this.b + ", channels=" + this.c + ", defaultChannel=" + this.d + ", position=" + this.e + ", totalContacts=" + this.f + ')';
    }
}
