package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adta implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;

    public adta(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.adte) obj).d();
        } else if (i != 1) {
            ((defpackage.adte) obj).c();
        } else {
            ((defpackage.adte) obj).e();
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
