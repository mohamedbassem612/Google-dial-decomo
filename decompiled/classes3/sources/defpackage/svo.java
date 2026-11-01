package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svo {
    private final boolean a;
    private final java.lang.String b;
    private final java.lang.String c;
    private final android.content.ComponentName d;
    private final java.lang.String e;
    private final android.content.ComponentName f;
    private final int g;

    public svo(boolean z, java.lang.String str, java.lang.String str2, android.content.ComponentName componentName, java.lang.String str3, android.content.ComponentName componentName2, int i) {
        aooh.f(str, "dialedNumber");
        aooh.f(str2, "preferredPhoneAccountId");
        aooh.f(componentName, "preferredPhoneAccountComponentName");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = componentName;
        this.e = str3;
        this.f = componentName2;
        this.g = i;
    }

    public final ojp a() {
        android.net.Uri uri = defpackage.svl.a;
        aooh.e(uri, "CONTENT_URI_USER_SIM_PREFERENCE");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("change_sim_selected", this.a);
        bundle.putString("dialed_number", this.b);
        bundle.putString("preferred_phone_account_id", this.c);
        bundle.putParcelable("preferred_phone_account_component_name", this.d);
        bundle.putString("suggested_phone_account_id", this.e);
        bundle.putParcelable("suggested_phone_account_component_name", this.f);
        bundle.putInt("suggestion_rule", this.g);
        return new ojp(uri, "update_sim_history", bundle);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.svo) {
            defpackage.svo svoVar = (defpackage.svo) obj;
            if (this.a == svoVar.a && aooh.n(this.b, svoVar.b) && aooh.n(this.c, svoVar.c) && aooh.n(this.d, svoVar.d) && aooh.n(this.e, svoVar.e) && aooh.n(this.f, svoVar.f) && this.g == svoVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iL = (((((anty.L(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        java.lang.String str = this.e;
        int iHashCode = ((iL * 31) + (str == null ? 0 : str.hashCode())) * 31;
        android.content.ComponentName componentName = this.f;
        return ((iHashCode + (componentName != null ? componentName.hashCode() : 0)) * 31) + this.g;
    }

    public final java.lang.String toString() {
        return "UpspUpdateSimHistory(changeSimSelected=" + this.a + ", dialedNumber=" + this.b + ", preferredPhoneAccountId=" + this.c + ", preferredPhoneAccountComponentName=" + this.d + ", suggestedPhoneAccountId=" + this.e + ", suggestedPhoneAccountComponentName=" + this.f + ", upspSuggestionRule=" + this.g + ')';
    }
}
