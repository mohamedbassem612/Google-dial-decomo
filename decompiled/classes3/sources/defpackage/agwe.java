package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agwe implements amym {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agwe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoss, aoub, java.lang.Object] */
    public final void a() {
        int i = this.$cid;
        ?? r2 = this.a;
        if (i != 0) {
            aosv.q((aoss) r2, (java.util.concurrent.CancellationException) null);
        } else {
            r2.s((java.util.concurrent.CancellationException) null);
        }
    }
}
