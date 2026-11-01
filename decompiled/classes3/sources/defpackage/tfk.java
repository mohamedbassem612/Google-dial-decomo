package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tfk {
    public final dji a;
    public final dji b;
    public final java.lang.String c;
    public final boolean d;
    public final defpackage.abvz e;
    public final defpackage.tfj f;
    public final java.lang.String g;
    public final android.net.Uri h;
    public final int i;
    public final nwx j;
    public final boolean k;

    public tfk(dji djiVar, dji djiVar2, java.lang.String str, boolean z, defpackage.abvz abvzVar, defpackage.tfj tfjVar, java.lang.String str2, android.net.Uri uri, int i, nwx nwxVar, boolean z2) {
        aooh.f(djiVar, "title");
        aooh.f(djiVar2, "subtitle");
        aooh.f(abvzVar, "calleeId");
        aooh.f(nwxVar, "meetReachability");
        this.a = djiVar;
        this.b = djiVar2;
        this.c = str;
        this.d = z;
        this.e = abvzVar;
        this.f = tfjVar;
        this.g = str2;
        this.h = uri;
        this.i = i;
        this.j = nwxVar;
        this.k = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tfk) {
            defpackage.tfk tfkVar = (defpackage.tfk) obj;
            if (aooh.n(this.a, tfkVar.a) && aooh.n(this.b, tfkVar.b) && aooh.n(this.c, tfkVar.c) && this.d == tfkVar.d && aooh.n(this.e, tfkVar.e) && aooh.n(this.f, tfkVar.f) && aooh.n(this.g, tfkVar.g) && aooh.n(this.h, tfkVar.h) && this.i == tfkVar.i && this.j == tfkVar.j && this.k == tfkVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + anty.L(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        java.lang.String str = this.g;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        android.net.Uri uri = this.h;
        return ((((((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31) + this.i) * 31) + this.j.hashCode()) * 31) + anty.L(this.k);
    }

    public final java.lang.String toString() {
        return "SearchCollapsedUiModel(title=" + this.a + ", subtitle=" + this.b + ", lookupKey=" + this.c + ", showWifiIcons=" + this.d + ", calleeId=" + this.e + ", actionContext=" + this.f + ", photoUri=" + this.g + ", contactUri=" + this.h + ", carrierPresence=" + this.i + ", meetReachability=" + this.j + ", isWorkProfileContact=" + this.k + ')';
    }
}
