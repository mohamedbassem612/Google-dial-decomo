package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kuw implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/callrecording/disclosure/impl/beepsound/BeepSoundCallRecordingDisclosureEnabledFn");
    private final kwe b;

    public kuw(kwe kweVar) {
        this.b = kweVar;
    }

    public final boolean a() {
        boolean zBooleanValue;
        kwe kweVar = this.b;
        if (((java.lang.Boolean) kweVar.c.a()).booleanValue()) {
            java.lang.Boolean bool = (java.lang.Boolean) kweVar.d.a();
            zBooleanValue = bool.booleanValue();
            kwe.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/callrecording/impl/geofence/Geofence", "withinBeepSoundAvailableCountriesGeofence", 62, "Geofence.java").y("forced override: %s", bool);
        } else {
            kwt kwtVar = kweVar.b;
            if (kwtVar.c()) {
                java.lang.String str = (java.lang.String) kwtVar.d.eZ();
                if (str == null) {
                    hgb.c(kwt.a.b(), "beep sound is not available because current country code is null", "com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isBeepSoundAvailableCountry", ']', "LocaleProvider.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                } else if (((aify) kwtVar.g.eZ()).contains(str)) {
                    zBooleanValue = true;
                } else {
                    hgb.c(kwt.a.b(), "beep sound is not available because not in beep available country list", "com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isBeepSoundAvailableCountry", 'c', "LocaleProvider.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                }
            } else {
                hgb.c(kwt.a.b(), "beep sound is not available because not call recording country", "com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isBeepSoundAvailableCountry", 'V', "LocaleProvider.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            }
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/callrecording/disclosure/impl/beepsound/BeepSoundCallRecordingDisclosureEnabledFn", "isEnabled", 16, "BeepSoundCallRecordingDisclosureEnabledFn.kt").v("disabled by geofence");
        return false;
    }
}
