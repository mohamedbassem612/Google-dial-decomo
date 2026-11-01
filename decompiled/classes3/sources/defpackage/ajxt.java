package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajxt extends android.content.BroadcastReceiver {
    public defpackage.ajxu a;
    public android.content.Context b;

    public ajxt(defpackage.ajxu ajxuVar) {
        this.a = ajxuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.ajxu ajxuVar = this.a;
        if (ajxuVar == null || !ajxuVar.b()) {
            return;
        }
        if (defpackage.agmc.ae()) {
            android.util.Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        defpackage.ajxu ajxuVar2 = this.a;
        com.google.firebase.messaging.FirebaseMessaging firebaseMessaging = ajxuVar2.a;
        com.google.firebase.messaging.FirebaseMessaging.l(ajxuVar2, 0L);
        android.content.Context context2 = this.b;
        if (context2 != null) {
            context2.unregisterReceiver(this);
        }
        this.a = null;
    }
}
