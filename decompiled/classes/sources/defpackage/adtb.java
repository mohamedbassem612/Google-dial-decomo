package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adtb extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.adth a;

    public adtb(defpackage.adth adthVar) {
        j$.util.Objects.requireNonNull(adthVar);
        this.a = adthVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.a.g();
        }
    }
}
