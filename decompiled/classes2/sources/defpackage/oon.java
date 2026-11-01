package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oon implements defpackage.geh {
    public static final aimz a = aimz.i("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsFragmentCompatPeer");
    public androidx.preference.PreferenceScreen b;
    public androidx.preference.SwitchPreference c;
    public defpackage.lpa d;
    public final android.content.Context e;
    public final rlv f;
    public final defpackage.ood g;
    public final defpackage.ool h;
    public final defpackage.oii i;

    public oon(android.content.Context context, defpackage.oii oiiVar, rlv rlvVar, defpackage.ood oodVar, defpackage.ool oolVar) {
        this.e = context;
        this.i = oiiVar;
        this.f = rlvVar;
        this.g = oodVar;
        this.h = oolVar;
    }

    @Override // defpackage.geh
    public final boolean a(androidx.preference.Preference preference, java.lang.Object obj) {
        ajcq ajcqVarP;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        a.b().l("com/android/dialer/fliptosilence/impl/settings/impl/FlipToSilenceSettingsFragmentCompatPeer", "onPreferenceChange", 125, "FlipToSilenceSettingsFragmentCompatPeer.java").y("enable flip to silence: %b", bool);
        defpackage.ool oolVar = this.h;
        defpackage.lpa lpaVar = this.d;
        android.content.Context contextZ = oolVar.z();
        boolean zBooleanValue = bool.booleanValue();
        defpackage.oii oiiVar = this.i;
        int i = 0;
        if (((zzx) oiiVar.b).m()) {
            ajcqVarP = defpackage.oii.p();
        } else {
            java.lang.Object obj2 = oiiVar.a;
            kaw kawVar = (kaw) obj2;
            ajcqVarP = kawVar.p(((aogc) oiiVar.c).bl(new defpackage.ook(zBooleanValue, 0)));
        }
        lpaVar.b(contextZ, ajcqVarP, new defpackage.oom(this, bool, i), new defpackage.jox(10));
        return true;
    }
}
