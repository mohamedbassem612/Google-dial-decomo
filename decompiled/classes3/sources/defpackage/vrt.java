package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrt {
    public final boolean a;
    public final boolean b;
    public final defpackage.vrr c;
    public final j$.util.Optional d;
    public final defpackage.vrr e;
    public final defpackage.vrr f;
    public final j$.util.Optional g;
    public final defpackage.vrr h;
    public final j$.util.Optional i;
    public final j$.util.Optional j;
    public final j$.util.Optional k;
    public final boolean l;

    public vrt(boolean z, boolean z2, defpackage.vrr vrrVar, j$.util.Optional optional, defpackage.vrr vrrVar2, defpackage.vrr vrrVar3, j$.util.Optional optional2, defpackage.vrr vrrVar4, j$.util.Optional optional3, j$.util.Optional optional4, j$.util.Optional optional5, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = vrrVar;
        this.d = optional;
        this.e = vrrVar2;
        this.f = vrrVar3;
        this.g = optional2;
        this.h = vrrVar4;
        this.i = optional3;
        this.j = optional4;
        this.k = optional5;
        this.l = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vrt) {
            defpackage.vrt vrtVar = (defpackage.vrt) obj;
            if (this.a == vrtVar.a && this.b == vrtVar.b && this.c.equals(vrtVar.c) && this.d.equals(vrtVar.d) && this.e.equals(vrtVar.e) && this.f.equals(vrtVar.f) && this.g.equals(vrtVar.g) && this.h.equals(vrtVar.h) && this.i.equals(vrtVar.i) && this.j.equals(vrtVar.j) && this.k.equals(vrtVar.k) && this.l == vrtVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true == this.l ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.k;
        j$.util.Optional optional2 = this.j;
        j$.util.Optional optional3 = this.i;
        defpackage.vrr vrrVar = this.h;
        j$.util.Optional optional4 = this.g;
        defpackage.vrr vrrVar2 = this.f;
        defpackage.vrr vrrVar3 = this.e;
        j$.util.Optional optional5 = this.d;
        return "VvmAccountInfoModel{shouldRemoveAllVisualVoicemailPreferences=" + this.a + ", isVvmActivated=" + this.b + ", voicemailPreferenceState=" + java.lang.String.valueOf(this.c) + ", voicemailSummaryMessage=" + java.lang.String.valueOf(optional5) + ", voicemailTranscriptionPreferenceState=" + java.lang.String.valueOf(vrrVar3) + ", donateTranscribedPreferenceState=" + java.lang.String.valueOf(vrrVar2) + ", donateTranscribedVoicemailPreferenceSummary=" + java.lang.String.valueOf(optional4) + ", changeGreetingPreferenceState=" + java.lang.String.valueOf(vrrVar) + ", voicemailChangePinPreferenceSummary=" + java.lang.String.valueOf(optional3) + ", changePinPreferenceTitle=" + java.lang.String.valueOf(optional2) + ", changePinIntent=" + java.lang.String.valueOf(optional) + ", isAutoDownloadOverCellularSettingAvailable=" + this.l + '}';
    }

    public vrt() {
        throw null;
    }
}
