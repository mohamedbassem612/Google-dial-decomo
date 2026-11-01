package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ajur implements defpackage.ajwe {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ajwe
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            android.os.StrictMode.ThreadPolicy.Builder builderDetectNetwork = new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork();
            builderDetectNetwork.detectResourceMismatches();
            aa$.ExternalSyntheticApiModelOutline0.m(builderDetectNetwork);
            return com.google.firebase.concurrent.ExecutorsRegistrar.a(java.util.concurrent.Executors.newFixedThreadPool(4, new defpackage.ajul("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())));
        }
        if (i == 1) {
            return java.util.Collections.EMPTY_SET;
        }
        if (i == 2) {
            return com.google.firebase.concurrent.ExecutorsRegistrar.a(java.util.concurrent.Executors.newFixedThreadPool(java.lang.Math.max(2, java.lang.Runtime.getRuntime().availableProcessors()), new defpackage.ajul("Firebase Lite", 0, new android.os.StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
        }
        if (i == 3) {
            return com.google.firebase.concurrent.ExecutorsRegistrar.a(java.util.concurrent.Executors.newCachedThreadPool(new defpackage.ajul("Firebase Blocking", 11, null)));
        }
        if (i == 4) {
            return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new defpackage.ajul("Firebase Scheduler", 0, null));
        }
        defpackage.ajwe ajweVar = com.google.firebase.messaging.FirebaseMessaging.a;
        return null;
    }
}
