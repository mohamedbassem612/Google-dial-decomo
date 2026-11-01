package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lpq {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final aomy e;
    public final boolean f;
    public final boolean g;

    public lpq(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, aomy aomyVar, boolean z, boolean z2) {
        aooh.f(str, "text");
        aooh.f(str2, "description");
        aooh.f(aomyVar, "onClick");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = aomyVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lpq) {
            defpackage.lpq lpqVar = (defpackage.lpq) obj;
            if (this.a == lpqVar.a && aooh.n(this.b, lpqVar.b) && aooh.n(this.c, lpqVar.c) && aooh.n(this.d, lpqVar.d) && aooh.n(this.e, lpqVar.e) && this.f == lpqVar.f && this.g == lpqVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        java.lang.String str = this.d;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31) + anty.L(this.f)) * 31) + anty.L(this.g);
    }

    public final java.lang.String toString() {
        return "ActivatableFeatureListItemUiData(iconId=" + this.a + ", text=" + this.b + ", description=" + this.c + ", stateDescription=" + this.d + ", onClick=" + this.e + ", active=" + this.f + ", enabled=" + this.g + ')';
    }
}
