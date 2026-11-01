package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dk extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.dl a;

    public dk(defpackage.dl dlVar) {
        this.a = dlVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.b();
    }
}
