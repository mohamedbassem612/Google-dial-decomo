package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gem extends android.os.Handler {
    final /* synthetic */ defpackage.ger a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gem(defpackage.ger gerVar, android.os.Looper looper) {
        super(looper);
        this.a = gerVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            this.a.ef();
        }
    }
}
