package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahmx implements defpackage.ahpm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahmx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ahok, java.lang.Object] */
    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        ?? r1 = this.a;
        if (i != 0) {
            ((defpackage.ahmw) r1).s();
        } else {
            r1.close();
        }
    }
}
