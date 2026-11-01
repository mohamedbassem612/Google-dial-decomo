package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class aljd implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.alip) obj).l();
            return;
        }
        if (i == 1) {
            ((ahqf) obj).a();
            return;
        }
        if (i == 2) {
            ((defpackage.aqan) obj).close();
            return;
        }
        if (i == 3) {
            ((defpackage.allg) obj).e();
        } else if (i != 4) {
        } else {
            ((defpackage.allg) obj).d();
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 2) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 3) {
            return i != 4 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
