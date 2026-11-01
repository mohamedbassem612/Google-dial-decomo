package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afeu implements java.io.Closeable {
    private final /* synthetic */ int $cid;
    private java.lang.Object a;

    public afeu(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            if (obj != null) {
                ((java.nio.channels.FileLock) obj).release();
                this.a = null;
                return;
            }
            return;
        }
        if (obj != null) {
            ((java.util.concurrent.Semaphore) obj).release();
            this.a = null;
        }
    }
}
