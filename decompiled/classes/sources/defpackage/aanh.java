package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aanh extends android.os.Handler {
    public aanh(android.os.Looper looper) {
        super(looper);
        android.os.Looper.getMainLooper();
    }

    protected void b(android.os.Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(android.os.Message message) {
        b(message);
    }

    public aanh(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        android.os.Looper.getMainLooper();
    }
}
