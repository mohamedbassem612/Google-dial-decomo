package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wgl {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService");
    public final defpackage.ajct b;
    public final defpackage.ajct c;
    public final defpackage.zjs d;
    public final defpackage.suf e;
    private final defpackage.okj f;
    private defpackage.aigf g = defpackage.aikj.b;

    public wgl(defpackage.ajct ajctVar, defpackage.ajct ajctVar2, defpackage.suf sufVar, defpackage.zjs zjsVar, defpackage.okj okjVar) {
        this.b = ajctVar;
        this.c = ajctVar2;
        this.e = sufVar;
        this.d = zjsVar;
        this.f = okjVar;
    }

    public static defpackage.aigf b(java.util.Set set, defpackage.wgi wgiVar) {
        return (defpackage.aigf) j$.util.Collection.-EL.stream(set).collect(defpackage.aido.b(j$.util.function.Function.-CC.identity(), new vxb(wgiVar, 4)));
    }

    public static java.lang.String c(defpackage.wgi wgiVar) {
        return java.lang.String.format("{displayVoice: %s, displayVideo: %s}", java.lang.Boolean.valueOf(wgiVar.c), java.lang.Boolean.valueOf(wgiVar.d));
    }

    public final defpackage.wgi a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        j$.util.Optional optionalH = this.f.h(phoneAccountHandle);
        if (!optionalH.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getWifiCallingIconsConfigForPhoneAccount", (char) 250, "WifiCallingIconsConfigService.java")).v("No subscription info found for phone account, returning no wifi calling icons config.");
            return defpackage.wgi.a;
        }
        int subscriptionId = ((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getSubscriptionId();
        defpackage.aigf aigfVar = this.g;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(subscriptionId);
        android.telephony.ims.ImsMmTelManager imsMmTelManagerM = baa$.ExternalSyntheticApiModelOutline1.m(aigfVar.get(numValueOf));
        if (imsMmTelManagerM == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getImsMmTelManager", 289, "WifiCallingIconsConfigService.java")).v("No ImsMmTelManager found in cache, creating new instance");
            imsMmTelManagerM = android.telephony.ims.ImsMmTelManager.createForSubscriptionId(subscriptionId);
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            aigbVar.l(this.g);
            aigbVar.i(numValueOf, imsMmTelManagerM);
            this.g = aigbVar.e(false);
        }
        boolean zIsAvailable = imsMmTelManagerM.isAvailable(1, 1);
        boolean zIsAvailable2 = imsMmTelManagerM.isAvailable(2, 1);
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getWifiCallingIconsConfigForSubscription", 271, "WifiCallingIconsConfigService.java")).L("Wifi calling availability: voiceOverWifi: %b, videoOverWifi: %b", zIsAvailable, zIsAvailable2);
        defpackage.akzx akzxVarM = defpackage.wgi.a.m();
        akzxVarM.u();
        defpackage.wgi wgiVar = (defpackage.wgi) akzxVarM.b;
        wgiVar.b |= 1;
        wgiVar.c = zIsAvailable;
        akzxVarM.u();
        defpackage.wgi wgiVar2 = (defpackage.wgi) akzxVarM.b;
        wgiVar2.b |= 2;
        wgiVar2.d = zIsAvailable2;
        defpackage.wgi wgiVar3 = (defpackage.wgi) akzxVarM.r();
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/wificallingicons/impl/service/WifiCallingIconsConfigService", "getWifiCallingIconsConfigForPhoneAccount", 242, "WifiCallingIconsConfigService.java")).y("Returning wifi calling icons config: %s", c(wgiVar3));
        return wgiVar3;
    }
}
