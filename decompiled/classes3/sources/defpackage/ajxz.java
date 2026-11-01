package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajxz extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.ajya a;
    private defpackage.ajya b;

    public ajxz(defpackage.ajya ajyaVar, defpackage.ajya ajyaVar2) {
        j$.util.Objects.requireNonNull(ajyaVar);
        this.a = ajyaVar;
        this.b = ajyaVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.ajya ajyaVar = this.b;
        if (ajyaVar == null || !ajyaVar.a()) {
            return;
        }
        if (defpackage.agmc.ae()) {
            android.util.Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
        }
        defpackage.ajya ajyaVar2 = this.b;
        ajyaVar2.b.a(ajyaVar2, 0L);
        context.unregisterReceiver(this);
        this.b = null;
    }
}
