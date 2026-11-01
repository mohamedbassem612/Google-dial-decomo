package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vru {
    public final boolean a;
    public final android.content.Intent b;
    public final android.content.Intent c;
    public final j$.util.Optional d;
    public final defpackage.vrr e;
    public final j$.util.Optional f;
    public final j$.util.Optional g;
    public final j$.util.Optional h;

    public vru(boolean z, android.content.Intent intent, android.content.Intent intent2, j$.util.Optional optional, defpackage.vrr vrrVar, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        this.a = z;
        this.b = intent;
        this.c = intent2;
        this.d = optional;
        this.e = vrrVar;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
    }

    static defpackage.vrq a() {
        defpackage.vrq vrqVar = new defpackage.vrq();
        vrqVar.d(false);
        vrqVar.f(j$.util.Optional.empty());
        vrqVar.c(defpackage.vrr.c);
        vrqVar.h(j$.util.Optional.empty());
        vrqVar.g(j$.util.Optional.empty());
        vrqVar.i(j$.util.Optional.empty());
        return vrqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vru) {
            defpackage.vru vruVar = (defpackage.vru) obj;
            if (this.a == vruVar.a && this.b.equals(vruVar.b) && this.c.equals(vruVar.c) && this.d.equals(vruVar.d) && this.e.equals(vruVar.e) && this.f.equals(vruVar.f) && this.g.equals(vruVar.g) && this.h.equals(vruVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.h;
        j$.util.Optional optional2 = this.g;
        j$.util.Optional optional3 = this.f;
        defpackage.vrr vrrVar = this.e;
        j$.util.Optional optional4 = this.d;
        android.content.Intent intent = this.c;
        return "VoicemailSettingsModel{isVvmEligible=" + this.a + ", notificationSettingsIntent=" + java.lang.String.valueOf(this.b) + ", advancedSettingsIntent=" + java.lang.String.valueOf(intent) + ", phoneAccountLabelInfo=" + java.lang.String.valueOf(optional4) + ", changeFiGreetingPreferenceState=" + java.lang.String.valueOf(vrrVar) + ", vvmAccountInfoModel=" + java.lang.String.valueOf(optional3) + ", sodaBannerModel=" + java.lang.String.valueOf(optional2) + ", vvmPreferenceErrorMessage=" + java.lang.String.valueOf(optional) + '}';
    }

    public vru() {
        throw null;
    }
}
