package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zjo extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.zjp a;

    public zjo(defpackage.zjp zjpVar) {
        this.a = zjpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) throws java.io.IOException {
        defpackage.aooh.f(intent, "intent");
        defpackage.zjp zjpVar = this.a;
        defpackage.ahok ahokVarF = zjpVar.d.f(1224, "Broadcast to CachedTelecomManager");
        try {
            if (defpackage.aooh.n(intent.getAction(), "android.telecom.action.DEFAULT_DIALER_CHANGED")) {
                ((defpackage.aimw) defpackage.zjp.a.b().l("com/google/android/dialershared/externals/androidapis/telecom/CachedTelecomManager$registerReceiver$<anonymous>", "onReceive$<anonymous>", 106, "CachedTelecomManager.kt")).y("received intent with action %s, invalidating #getDefaultDialerPackage cache", intent.getAction());
                zjpVar.g.b();
            }
            if (((java.lang.Boolean) zjpVar.e.a()).booleanValue() && (defpackage.aooh.n(intent.getAction(), "android.telecom.action.PHONE_ACCOUNT_REGISTERED") || defpackage.aooh.n(intent.getAction(), "android.telecom.action.PHONE_ACCOUNT_UNREGISTERED"))) {
                ((defpackage.aimw) defpackage.zjp.a.b().l("com/google/android/dialershared/externals/androidapis/telecom/CachedTelecomManager$registerReceiver$<anonymous>", "onReceive$<anonymous>", 119, "CachedTelecomManager.kt")).y("received intent with action %s, invalidating #getPhoneAccount cache", intent.getAction());
                zjpVar.b();
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
