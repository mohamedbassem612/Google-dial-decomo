package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahdj implements android.os.MessageQueue.IdleHandler {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahdj(aeni aeniVar, int i) {
        this.$cid = i;
        this.a = aeniVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aosb, java.lang.Object] */
    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        if (this.$cid != 0) {
            java.lang.Object obj = this.a;
            ((aeni) obj).a.c(new vcz(obj, 12), 7000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            this.a.e(aojh.a, defpackage.smd.g);
        }
        return false;
    }

    public ahdj(aosb aosbVar, int i) {
        this.$cid = i;
        this.a = aosbVar;
    }
}
