package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agyk implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;

    /* JADX WARN: Type inference failed for: r1v2, types: [ajcq, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((zoe) obj).a.cancel(false);
            return;
        }
        if (i == 1) {
            ((defpackage.soq) obj).a();
        } else if (i != 2) {
            ((ahjl) obj).a();
        } else {
            ((defpackage.agxr) obj).c();
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 1) {
            return i != 2 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
