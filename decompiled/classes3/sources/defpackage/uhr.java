package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uhr extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.ucs a;
    final /* synthetic */ uhs b;

    public uhr(uhs uhsVar, defpackage.ucs ucsVar) {
        this.a = ucsVar;
        j$.util.Objects.requireNonNull(uhsVar);
        this.b = uhsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.a(getResultCode() == -1);
        this.b.d.set(false);
    }
}
