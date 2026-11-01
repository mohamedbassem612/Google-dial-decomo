package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdm implements agye {
    public final /* synthetic */ defpackage.tdn a;

    public tdm(defpackage.tdn tdnVar) {
        j$.util.Objects.requireNonNull(tdnVar);
        this.a = tdnVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.tdn.a.c(), "failed to initialize rtt configuration", "com/android/dialer/rtt/settings/impl/ui/RttSettingsFragmentPeer$RttConfigurationLoadedCallbacks", "onError", 'V', "RttSettingsFragmentPeer.java", th, zct.b);
        defpackage.agby.o(((aw) this.a.c).Q, 2132020640, 0).h();
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        tcp tcpVar = (tcp) obj;
        defpackage.tdn.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsFragmentPeer$RttConfigurationLoadedCallbacks", "onNewData", 62, "RttSettingsFragmentPeer.java").y("successfully initialized rtt configuration: %s", tcpVar.name());
        defpackage.tdn tdnVar = this.a;
        if (!tdnVar.e.X()) {
            tdnVar.e.I(true);
            com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat rttSettingsPreferenceCompat = tdnVar.e;
            defpackage.aprf aprfVar = new defpackage.aprf(this);
            com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "setOnRttConfigurationClickedListener", 134, "RttSettingsPreferenceCompat.java").v("setOnRttConfigurationClickedListener");
            rttSettingsPreferenceCompat.d = aprfVar;
        }
        com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat rttSettingsPreferenceCompat2 = tdnVar.e;
        com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "setRttConfiguration", 139, "RttSettingsPreferenceCompat.java").v("setRttConfiguration");
        rttSettingsPreferenceCompat2.c = j$.util.Optional.of(tcpVar);
        rttSettingsPreferenceCompat2.k();
    }

    public final /* synthetic */ void c() {
    }
}
