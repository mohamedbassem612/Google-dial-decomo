package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class klk extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.klo a;

    public klk(defpackage.klo kloVar) {
        j$.util.Objects.requireNonNull(kloVar);
        this.a = kloVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.D = false;
    }
}
