package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class okh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager");
    public static final android.content.IntentFilter b;
    public final android.content.Context c;
    public final defpackage.ahpz d;
    public final j$.util.concurrent.ConcurrentHashMap e;
    private final defpackage.aoir f;

    static {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.telecom.action.DEFAULT_DIALER_CHANGED");
        intentFilter.addAction("android.telephony.action.CARRIER_CONFIG_CHANGED");
        intentFilter.addAction("android.telecom.action.PHONE_ACCOUNT_REGISTERED");
        intentFilter.addAction("android.telecom.action.PHONE_ACCOUNT_UNREGISTERED");
        intentFilter.addAction("android.telephony.action.SUBSCRIPTION_CARRIER_IDENTITY_CHANGED");
        b = intentFilter;
    }

    public okh(android.content.Context context, defpackage.ahpz ahpzVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ahpzVar == null) {
            defpackage.aooh.i("traceCreation");
        }
        this.c = context;
        this.d = ahpzVar;
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.f = new defpackage.aoiy(new defpackage.mbe(this, 10));
    }

    public final void a() {
        this.f.a();
    }

    public final defpackage.okf b(android.telephony.TelephonyManager telephonyManager) {
        java.lang.Object objPutIfAbsent;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(baa$.ExternalSyntheticApiModelOutline1.m(telephonyManager));
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.e;
        java.lang.Object okfVar = concurrentHashMap.get(numValueOf);
        if (okfVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (okfVar = new defpackage.okf(this, telephonyManager)))) != null) {
            okfVar = objPutIfAbsent;
        }
        return (defpackage.okf) okfVar;
    }
}
