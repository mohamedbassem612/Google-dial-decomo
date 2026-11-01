package androidx.room;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class MultiInstanceInvalidationService extends android.app.Service {
    public int a;
    public final java.util.Map b = new java.util.LinkedHashMap();
    public final android.os.RemoteCallbackList c = new defpackage.gfo(this);
    private final defpackage.gfl d = new defpackage.gfl(this);

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        aooh.f(intent, "intent");
        return this.d;
    }
}
