package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jwk {
    private static final defpackage.aimz d = defpackage.aimz.i("com/android/dialer/callingnetworks/impl/CallingNetworksImpl");
    public final defpackage.jwu a;
    public final defpackage.ajct b;
    public final defpackage.aoin c;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.okj g;
    private final defpackage.oki h;

    public jwk(defpackage.ajct ajctVar, defpackage.jwu jwuVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.okj okjVar, defpackage.oki okiVar) {
        this.b = ajctVar;
        this.a = jwuVar;
        this.c = aoinVar;
        this.e = aoinVar2;
        this.f = aoinVar3;
        this.g = okjVar;
        this.h = okiVar;
    }

    static int b(android.os.PersistableBundle persistableBundle) {
        if (!persistableBundle.containsKey("display_lte_icon_type_string")) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseLteIconType", (char) 179, "CallingNetworksImpl.java")).v("LTE icon type not defined in the carrier config");
            return 2;
        }
        java.lang.String string = persistableBundle.getString("display_lte_icon_type_string", "");
        int iHashCode = string.hashCode();
        if (iHashCode != 112389764) {
            if (iHashCode == 112401236 && string.equals("voz4g")) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseLteIconType", (char) 190, "CallingNetworksImpl.java")).v("configured to use Voz4g icon");
                return 3;
            }
        } else if (string.equals("volte")) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseLteIconType", (char) 187, "CallingNetworksImpl.java")).v("configured to use VoLTE icon");
            return 2;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.d()).i(defpackage.zct.b)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseLteIconType", (char) 196, "CallingNetworksImpl.java")).y("unexpected value for display_lte_icon_type_enum : %s", string);
        return 1;
    }

    static int c(android.os.PersistableBundle persistableBundle) {
        if (!persistableBundle.containsKey("display_wifi_icon_type_string")) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseWifiIconType", (char) 154, "CallingNetworksImpl.java")).v("WiFi icon type not defined in the carrier config");
            return 2;
        }
        java.lang.String string = persistableBundle.getString("display_wifi_icon_type_string", "");
        int iHashCode = string.hashCode();
        if (iHashCode != -810567346) {
            if (iHashCode == 645406582 && string.equals("vozwifi")) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseWifiIconType", (char) 165, "CallingNetworksImpl.java")).v("configured to use VozWiFi icon");
                return 3;
            }
        } else if (string.equals("vowifi")) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseWifiIconType", (char) 162, "CallingNetworksImpl.java")).v("configured to use VoWiFi icon");
            return 2;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.d()).i(defpackage.zct.b)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "parseWifiIconType", (char) 171, "CallingNetworksImpl.java")).y("unexpected value for display_wifi_icon_type_string : %s", string);
        return 1;
    }

    public final jvy a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        int iB = this.g.b(phoneAccountHandle);
        if (iB == -1) {
            return jvy.a;
        }
        android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) this.h.a(iB).orElse((java.lang.Object) null);
        if (persistableBundle == null) {
            return jvy.a;
        }
        defpackage.akzx akzxVarM = jvy.a.m();
        if (persistableBundle.getBoolean("display_call_type_icon_bool", false)) {
            if (((java.lang.Boolean) this.e.a()).booleanValue()) {
                int iC = c(persistableBundle);
                akzxVarM.u();
                jvy jvyVar = akzxVarM.b;
                jvyVar.d = iC - 1;
                jvyVar.b |= 2;
                akzxVarM.u();
                jvy jvyVar2 = akzxVarM.b;
                jvyVar2.b |= 8;
                jvyVar2.f = true;
            } else {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "getCallingNetworksAvailabilitySync", '{', "CallingNetworksImpl.java")).v("enable Wifi technology icons flag is disabled");
            }
            if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                int iB2 = b(persistableBundle);
                akzxVarM.u();
                jvy jvyVar3 = akzxVarM.b;
                jvyVar3.e = iB2 - 1;
                jvyVar3.b |= 4;
            } else {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "getCallingNetworksAvailabilitySync", (char) 129, "CallingNetworksImpl.java")).v("enable LTE technology icons flag is disabled");
            }
        }
        if (persistableBundle.getBoolean("display_hd_plus_icon_bool", false)) {
            akzxVarM.u();
            jvy jvyVar4 = akzxVarM.b;
            jvyVar4.b |= 1;
            jvyVar4.c = true;
        } else {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) d.b()).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callingnetworks/impl/CallingNetworksImpl", "getCallingNetworksAvailabilitySync", (char) 137, "CallingNetworksImpl.java")).v("enable HD plus icon flag is disabled");
        }
        return akzxVarM.r();
    }
}
