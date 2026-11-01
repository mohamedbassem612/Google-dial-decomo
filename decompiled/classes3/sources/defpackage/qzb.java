package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qzb {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final defpackage.qug e;
    public final boolean f;
    public final boolean g;

    public qzb(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.qug qugVar, boolean z, boolean z2) {
        aooh.f(str, "text");
        aooh.f(str2, "description");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = qugVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qzb) {
            defpackage.qzb qzbVar = (defpackage.qzb) obj;
            if (this.a == qzbVar.a && aooh.n(this.b, qzbVar.b) && aooh.n(this.c, qzbVar.c) && aooh.n(this.d, qzbVar.d) && this.e == qzbVar.e && this.f == qzbVar.f && this.g == qzbVar.g) {
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
        return "MoreMenuListItemUiModel(iconDrawableResourceId=" + this.a + ", text=" + this.b + ", description=" + this.c + ", stateDescription=" + this.d + ", voiceButtonKey=" + this.e + ", active=" + this.f + ", enabled=" + this.g + ')';
    }
}
