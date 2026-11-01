package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uk extends defpackage.enf {
    private static final android.net.Uri g = new android.net.Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    private final android.content.Context h;
    private final android.content.AsyncQueryHandler i;
    private final defpackage.ui j = new defpackage.ui(this);

    public uk(android.content.Context context) {
        this.h = context;
        this.i = new defpackage.uj(this, context.getContentResolver());
    }

    @Override // defpackage.enf
    public final void a() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        int i = android.os.Build.VERSION.SDK_INT;
        android.content.Context context = this.h;
        if (i >= 33) {
            aa$.ExternalSyntheticApiModelOutline0.m(context, this.j, intentFilter, 2);
        } else {
            context.registerReceiver(this.j, intentFilter);
        }
        c();
    }

    @Override // defpackage.enf
    public final void b() {
        this.h.unregisterReceiver(this.j);
        this.i.cancelOperation(42);
    }

    final void c() {
        this.i.startQuery(42, null, g, new java.lang.String[]{"CarConnectionState"}, null, null, null);
    }
}
