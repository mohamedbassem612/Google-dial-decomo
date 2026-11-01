package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaev extends android.content.BroadcastReceiver {
    public android.content.Context a;
    private final defpackage.aelu b;

    public aaev(defpackage.aelu aeluVar) {
        this.b = aeluVar;
    }

    public final synchronized void a() {
        android.content.Context context = this.a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.net.Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.b.c();
            a();
        }
    }
}
