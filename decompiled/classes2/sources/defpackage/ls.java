package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ls implements android.window.OnBackInvokedCallback {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ls(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [afvt, java.lang.Object] */
    public final void onBackInvoked() {
        int i = this.$cid;
        if (i == 0) {
            this.a.run();
            return;
        }
        if (i == 1) {
            ((dq) this.a).K();
            return;
        }
        if (i == 2) {
            this.a.run();
            return;
        }
        if (i == 3) {
            ((fyd) this.a).b();
            return;
        }
        ?? r2 = this.a;
        if (i != 4) {
            r2.l();
        } else {
            ((wdu) r2).b();
        }
    }
}
