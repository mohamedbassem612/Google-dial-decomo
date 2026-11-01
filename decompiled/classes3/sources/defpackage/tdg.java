package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tdg implements agye {
    final /* synthetic */ defpackage.tdh a;

    public tdg(defpackage.tdh tdhVar) {
        j$.util.Objects.requireNonNull(tdhVar);
        this.a = tdhVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.tdh.a.c(), "Error in AccessibilitySettingsLoadedCallbacks", "com/android/dialer/rtt/settings/impl/ui/AccessibilitySettingsFragmentPeer$AccessibilitySettingsLoadedCallbacks", "onError", 'C', "AccessibilitySettingsFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.tdb tdbVar = (defpackage.tdb) obj;
        tcp tcpVar = tdbVar.a;
        defpackage.tdh tdhVar = this.a;
        defpackage.tdf tdfVar = tdhVar.d;
        androidx.preference.Preference preferenceL = tdfVar.dW().l(tdfVar.A().getString(2132019985));
        aimz aimzVar = defpackage.tdh.a;
        aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/AccessibilitySettingsFragmentPeer", "updateRttPreference", 75, "AccessibilitySettingsFragmentPeer.java").y("successfully updated rtt settings summary: %s", tcpVar.name());
        int iOrdinal = tcpVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            preferenceL.N(2132019957);
        } else if (iOrdinal == 2) {
            preferenceL.N(2132019958);
        } else if (iOrdinal == 3) {
            preferenceL.N(2132019956);
        } else if (iOrdinal == 4) {
            throw new java.lang.AssertionError("the fragment should only be used when RTT visibility is not UNSUPPORTED");
        }
        if (tdbVar.b) {
            if (tdhVar.b() == null) {
                aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/AccessibilitySettingsFragmentPeer", "addHearingAidCompatibilitySettingsPreference", 200, "AccessibilitySettingsFragmentPeer.java").v("addHearingAidCompatibilitySettingsPreference");
                androidx.preference.SwitchPreference switchPreference = new androidx.preference.SwitchPreference(((androidx.preference.Preference) tdhVar.b).j);
                switchPreference.M(2);
                switchPreference.L(tdfVar.Y(2132018857));
                switchPreference.P(2132018859);
                switchPreference.N(2132018858);
                tdhVar.b.ae(switchPreference);
                ((androidx.preference.Preference) switchPreference).n = new jcj(tdhVar, 10);
            }
            androidx.preference.SwitchPreference switchPreferenceB = tdhVar.b();
            switchPreferenceB.I(true);
            switchPreferenceB.k(tdbVar.c);
        }
        if (tdbVar.d) {
            if (tdhVar.a() == null) {
                aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/AccessibilitySettingsFragmentPeer", "addTtySettingPreference", 217, "AccessibilitySettingsFragmentPeer.java").v("addTtySettingPreference");
                androidx.preference.ListPreference listPreference = new androidx.preference.ListPreference(((androidx.preference.Preference) tdhVar.b).j, (android.util.AttributeSet) null);
                listPreference.M(3);
                listPreference.L(tdfVar.Y(2132020610));
                listPreference.Q(tdfVar.Y(2132020611));
                listPreference.n(2130903099);
                listPreference.o(2130903102);
                tdhVar.b.ae(listPreference);
                ((androidx.preference.Preference) listPreference).n = new jcj(tdhVar, 11);
            }
            if (((com.android.dialer.widget.FooterPreferenceCompat) tdfVar.ee(tdfVar.Y(2132020613))) == null) {
                aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/AccessibilitySettingsFragmentPeer", "addTtyWifiCallingWarningPreference", 234, "AccessibilitySettingsFragmentPeer.java").v("addTTYWifiCallingWarningPreference");
                com.android.dialer.widget.FooterPreferenceCompat footerPreferenceCompat = new com.android.dialer.widget.FooterPreferenceCompat(((androidx.preference.Preference) tdhVar.b).j);
                footerPreferenceCompat.M(4);
                footerPreferenceCompat.L(tdfVar.Y(2132020613));
                footerPreferenceCompat.Q(tdfVar.Y(2132020612));
                tdhVar.b.ae(footerPreferenceCompat);
            }
            androidx.preference.ListPreference listPreferenceA = tdhVar.a();
            defpackage.tde tdeVar = tdbVar.e;
            int iOrdinal2 = tdeVar.ordinal();
            if (iOrdinal2 == 0) {
                listPreferenceA.N(2132020608);
            } else if (iOrdinal2 == 1) {
                listPreferenceA.N(2132020606);
            } else if (iOrdinal2 == 2) {
                listPreferenceA.N(2132020607);
            } else if (iOrdinal2 == 3) {
                listPreferenceA.N(2132020609);
            }
            listPreferenceA.q(java.lang.String.valueOf(tdeVar.ordinal()));
            if (tdbVar.f) {
                listPreferenceA.n(2130903100);
                listPreferenceA.o(2130903101);
            }
        }
    }

    public final /* synthetic */ void c() {
    }
}
