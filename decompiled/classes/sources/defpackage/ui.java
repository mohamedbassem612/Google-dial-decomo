package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ui extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.uk a;

    public ui(defpackage.uk ukVar) {
        this.a = ukVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.c();
    }
}
