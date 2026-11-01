package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vlh implements defpackage.zcr {
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aoin i;
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn");
    static final defpackage.aihd a = defpackage.aihd.v("sailfish", "marlin", "walleye", "taimen", "blueline", "crosshatch", "sargo", "bonito", "needlefish", "coral", "flame", "sunfish", "bramble", "redfin", "barbet", "oriole", "raven", "whitefin", "slider", "retrofin", "bluejay", "pipit");
    static final defpackage.aihd b = new defpackage.aile("Swing_NA_OM");
    static final defpackage.aihd c = defpackage.aihd.v("utah", "nevada", "houston", "prado", "kansas", "webb", "glory", "boston", "fogo", "mona", "monai", "rtwo", "vegas", "cybert", "dallas");

    public vlh(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        this.f = aoinVar;
        this.g = aoinVar2;
        this.h = aoinVar3;
        this.i = aoinVar4;
    }

    private static int b() {
        java.lang.reflect.Method method = defpackage.afea.a;
        try {
            java.lang.reflect.Method method2 = defpackage.afea.a;
            if (method2 != null) {
                return ((java.lang.Integer) method2.invoke(null, "ro.product.first_api_level", 0)).intValue();
            }
            return 0;
        } catch (java.lang.Exception e) {
            android.util.Log.e("SystemProperties", "get error", e);
            return 0;
        }
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (!android.os.Build.BRAND.contains("google") || a.contains(android.os.Build.DEVICE)) {
                defpackage.aoin aoinVar = this.i;
                if (((java.lang.Boolean) aoinVar.a()).booleanValue() && android.os.Build.BRAND.contains("TCL") && b() >= 36) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", '^', "RestVoicemailEnabledFn.java")).v("REST supported TCL device (SDK 36+)");
                } else if (!((java.lang.Boolean) aoinVar.a()).booleanValue() && ((java.lang.Boolean) this.h.a()).booleanValue() && android.os.Build.BRAND.contains("TCL") && b.contains(android.os.Build.DEVICE)) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 'c', "RestVoicemailEnabledFn.java")).v("REST supported TCL device");
                } else if (((java.lang.Boolean) this.g.a()).booleanValue() && android.os.Build.BRAND.contains("motorola")) {
                    if (b() < 36) {
                        java.lang.String lowerCase = android.os.Build.DEVICE.toLowerCase(java.util.Locale.US);
                        defpackage.ailj it = c.iterator();
                        do {
                            if (!it.hasNext()) {
                                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 'm', "RestVoicemailEnabledFn.java")).v("REST unsupported Moto device (V2)");
                            }
                        } while (!lowerCase.contains((java.lang.String) it.next()));
                    }
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 'j', "RestVoicemailEnabledFn.java")).v("REST supported Moto device (V2)");
                } else {
                    boolean zBooleanValue = ((java.lang.Boolean) this.f.a()).booleanValue();
                    defpackage.aimz aimzVar = d;
                    if (zBooleanValue) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 's', "RestVoicemailEnabledFn.java")).v("REST supported Moto device");
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 'w', "RestVoicemailEnabledFn.java")).v("device does not support REST");
                    }
                }
            } else {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 'Y', "RestVoicemailEnabledFn.java")).v("REST supported Pixel device");
            }
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVoicemailEnabledFn", "isEnabled", 'S', "RestVoicemailEnabledFn.java")).v("unsupported SDK");
        return false;
    }
}
