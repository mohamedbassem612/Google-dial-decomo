package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ojd {
    private static final aimz a = aimz.i("com/android/dialer/externals/aicore/ui/DialerAiCorePreferenceCreator");
    private final zzx b;

    public ojd(zzx zzxVar) {
        this.b = zzxVar;
    }

    public final com.android.dialer.externals.aicore.ui.DialerAiCorePreference a(yse yseVar, androidx.preference.PreferenceScreen preferenceScreen) {
        aooh.f(preferenceScreen, "preferenceScreen");
        if (!this.b.k().containsKey(yseVar)) {
            a.b().l("com/android/dialer/externals/aicore/ui/DialerAiCorePreferenceCreator", "createAndAddDialerAiCorePreference", 25, "DialerAiCorePreferenceCreator.kt").v("feature integration not available, not adding AiCore preference");
            return null;
        }
        android.content.Context context = preferenceScreen.j;
        aooh.e(context, "getContext(...)");
        com.android.dialer.externals.aicore.ui.DialerAiCorePreference dialerAiCorePreference = new com.android.dialer.externals.aicore.ui.DialerAiCorePreference(context, yseVar);
        preferenceScreen.ae(dialerAiCorePreference);
        return dialerAiCorePreference;
    }
}
