package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xxh implements android.os.Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        if (message.what != 1) {
            return false;
        }
        ((defpackage.xxe) message.obj).e();
        return true;
    }
}
