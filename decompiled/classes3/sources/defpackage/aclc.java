package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aclc {
    public final java.util.Map a;
    public final int b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.util.List e;

    public aclc(int i, java.lang.String str, java.util.Map map, java.lang.String str2, java.util.List list) {
        aooh.f(map, "actionIntents");
        aooh.f(str2, "gnpCampaignId");
        aooh.f(list, "gnpCampaignMendelIds");
        this.b = i;
        this.c = str;
        this.a = map;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aclc) {
            defpackage.aclc aclcVar = (defpackage.aclc) obj;
            if (this.b == aclcVar.b && aooh.n(this.c, aclcVar.c) && aooh.n(this.a, aclcVar.a) && aooh.n(this.d, aclcVar.d) && aooh.n(this.e, aclcVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.c;
        return (((((((this.b * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final java.lang.String toString() {
        return "PromoDetailsKt(promoType=" + ((java.lang.Object) defpackage.abxl.i(this.b)) + ", elementId=" + this.c + ", actionIntents=" + this.a + ", gnpCampaignId=" + this.d + ", gnpCampaignMendelIds=" + this.e + ')';
    }
}
