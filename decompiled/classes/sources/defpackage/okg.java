package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class okg extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.okh a;

    public okg(defpackage.okh okhVar) {
        this.a = okhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) throws java.io.IOException {
        defpackage.aooh.f(intent, "intent");
        defpackage.okh okhVar = this.a;
        defpackage.ahok ahokVarF = okhVar.d.f(406, "Broadcast to CachedTelephonyManager");
        try {
            if (defpackage.aooh.n(intent.getAction(), "android.telecom.action.DEFAULT_DIALER_CHANGED") || defpackage.aooh.n(intent.getAction(), "android.telephony.action.CARRIER_CONFIG_CHANGED")) {
                ((defpackage.aimw) defpackage.okh.a.b().l("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager$registerReceiver$<anonymous>", "onReceive$<anonymous>", 217, "CachedTelephonyManager.kt")).y("received intent with action %s, invalidating #getVisualVoicemailPackageName cache", intent.getAction());
                for (java.lang.Object obj : okhVar.e.values()) {
                    defpackage.aooh.e(obj, "next(...)");
                    ((defpackage.okf) obj).a.b();
                }
            }
            if (defpackage.aooh.n(intent.getAction(), "android.telecom.action.PHONE_ACCOUNT_REGISTERED") || defpackage.aooh.n(intent.getAction(), "android.telecom.action.PHONE_ACCOUNT_UNREGISTERED")) {
                ((defpackage.aimw) defpackage.okh.a.b().l("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager$registerReceiver$<anonymous>", "onReceive$<anonymous>", 231, "CachedTelephonyManager.kt")).y("received intent with action %s, invalidating #getSimOperator/#getGroupIdLevel1 cache", intent.getAction());
                for (java.lang.Object obj2 : okhVar.e.values()) {
                    defpackage.aooh.e(obj2, "next(...)");
                    defpackage.okf okfVar = (defpackage.okf) obj2;
                    okfVar.b.b();
                    okfVar.c.b();
                    okfVar.f.b();
                }
            }
            if (defpackage.aooh.n(intent.getAction(), "android.telephony.action.SUBSCRIPTION_CARRIER_IDENTITY_CHANGED")) {
                ((defpackage.aimw) defpackage.okh.a.b().l("com/android/dialer/externals/androidapis/telephony/CachedTelephonyManager$registerReceiver$<anonymous>", "onReceive$<anonymous>", 244, "CachedTelephonyManager.kt")).y("received intent with action %s, invalidating #getSimSpecificCarrierId cache", intent.getAction());
                for (java.lang.Object obj3 : okhVar.e.values()) {
                    defpackage.aooh.e(obj3, "next(...)");
                    ((defpackage.okf) obj3).c.b();
                }
            }
            defpackage.ajsz.ak(ahokVarF, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
