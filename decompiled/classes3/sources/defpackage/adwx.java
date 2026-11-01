package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adwx {
    private final android.content.BroadcastReceiver.PendingResult a;
    private final boolean b;
    private final int c;
    private boolean d;

    static {
        aiof.i("GnpSdk");
    }

    public adwx(android.content.BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.a = pendingResult;
        this.b = z;
        this.c = i;
    }

    public final synchronized void a() {
        if (this.d) {
            return;
        }
        if (this.b) {
            this.a.setResultCode(-1);
        }
        this.a.finish();
        this.d = true;
    }

    public final java.lang.String toString() {
        return "BroadcastAsyncOperation{executionId=" + this.c + '}';
    }
}
