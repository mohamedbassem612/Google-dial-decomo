package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aagn extends defpackage.aago {
    final /* synthetic */ defpackage.aaez a;
    final /* synthetic */ android.app.PendingIntent b;

    public aagn(defpackage.aaez aaezVar, android.app.PendingIntent pendingIntent) {
        this.a = aaezVar;
        this.b = pendingIntent;
    }

    @Override // defpackage.aago
    public final void a() {
        try {
            this.a.startIntentSenderForResult(this.b.getIntentSender(), 2, null, 0, 0, 0, null);
        } catch (android.content.IntentSender.SendIntentException e) {
            android.util.Log.e("DialogRedirect", "Failed to start resolution intent sender.", e);
        }
    }
}
