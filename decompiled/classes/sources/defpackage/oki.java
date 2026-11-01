package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class oki {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/externals/androidapis/telephony/DialerCarrierConfigManager");
    public final android.content.Context b;

    public oki(defpackage.aoss aossVar, defpackage.aolr aolrVar, android.content.Context context) {
        if (aossVar == null) {
            defpackage.aooh.i("blockingScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("blockingContext");
        }
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = context;
    }

    public final j$.util.Optional a(int i) {
        j$.util.Optional optionalEmpty;
        try {
            android.telephony.CarrierConfigManager carrierConfigManager = (android.telephony.CarrierConfigManager) this.b.getSystemService("carrier_config");
            optionalEmpty = j$.util.Optional.ofNullable(carrierConfigManager != null ? carrierConfigManager.getConfigForSubId(i) : null);
            if (optionalEmpty == null) {
                defpackage.aooh.g();
            }
        } catch (java.lang.SecurityException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e).l("com/android/dialer/externals/androidapis/telephony/DialerCarrierConfigManager", "getConfigForSubIdLegacy", 82, "DialerCarrierConfigManager.kt")).v("CarrierConfigManager.getConfigForSubId called without permission.");
            optionalEmpty = j$.util.Optional.empty();
            if (optionalEmpty == null) {
                defpackage.aooh.g();
                return null;
            }
        }
        return optionalEmpty;
    }
}
