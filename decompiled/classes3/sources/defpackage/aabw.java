package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aabw extends aanh {
    final /* synthetic */ aabx a;
    private final android.content.Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabw(aabx aabxVar, android.content.Context context) {
        super(android.os.Looper.myLooper() == null ? android.os.Looper.getMainLooper() : android.os.Looper.myLooper());
        j$.util.Objects.requireNonNull(aabxVar);
        this.a = aabxVar;
        this.b = context.getApplicationContext();
    }

    public final void handleMessage(android.os.Message message) {
        if (message.what != 1) {
            android.util.Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + message.what);
            return;
        }
        aabx aabxVar = this.a;
        android.content.Context context = this.b;
        int iL = aabxVar.l(context, 17895000);
        if (aacn.f(iL)) {
            aabxVar.i(context, iL);
        }
    }
}
