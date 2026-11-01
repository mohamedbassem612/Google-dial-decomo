    @Override // defpackage.zcr
    public final boolean a() {
        boolean zBooleanValue;
        kwe kweVar = this.b;
        if (((Boolean) kweVar.c.a()).booleanValue()) {
            Boolean bool = (Boolean) kweVar.d.a();
            zBooleanValue = bool.booleanValue();
            ((aimw) ((aimw) ((aimw) kwe.a.b()).g(1, TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/geofence/Geofence", "withinBeepSoundAvailableCountriesGeofence", 62, "Geofence.java")).y("forced override: %s", bool);
        } else {
            kwt kwtVar = kweVar.b;
            if (kwtVar.c()) {
                String str = (String) kwtVar.d.eZ();
                if (str == null) {
                    ((aimw) ((aimw) ((aimw) kwt.a.b()).g((byte) 1, TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isBeepSoundAvailableCountry", ']', "LocaleProvider.java")).v("beep sound is not available because current country code is null");
                } else if (((aify) kwtVar.g.eZ()).contains(str)) {
                    zBooleanValue = true;
                } else {
                    ((aimw) ((aimw) ((aimw) kwt.a.b()).g((byte) 1, TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isBeepSoundAvailableCountry", 'c', "LocaleProvider.java")).v("beep sound is not available because not in beep available country list");
                }
            } else {
                ((aimw) ((aimw) ((aimw) kwt.a.b()).g((byte) 1, TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isBeepSoundAvailableCountry", 'V', "LocaleProvider.java")).v("beep sound is not available because not call recording country");
            }
            zBooleanValue = false;
        }
        if (zBooleanValue) {
            return true;
        }
        ((aimw) ((aimw) a.b()).g(1, TimeUnit.MINUTES).l("com/android/dialer/callrecording/disclosure/impl/beepsound/BeepSoundCallRecordingDisclosureEnabledFn", "isEnabled", 16, "BeepSoundCallRecordingDisclosureEnabledFn.kt")).v("disabled by geofence");
        return false;
    }
