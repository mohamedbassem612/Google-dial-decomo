package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class afhs implements java.io.Closeable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ afhs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.afhr) obj).c = true;
            return;
        }
        synchronized (((defpackage.afhx) obj).i) {
            int i2 = ((defpackage.afhx) obj).l;
            defpackage.ahvr.ca(i2 > 0, "Refcount went negative!", i2);
            ((defpackage.afhx) obj).l--;
            ((defpackage.afhx) obj).c();
        }
    }
}
