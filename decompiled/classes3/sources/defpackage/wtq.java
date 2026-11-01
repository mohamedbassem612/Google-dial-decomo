package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wtq implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ wtq(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((defpackage.qav) obj).a(this.a);
            return;
        }
        defpackage.wde wdeVar = (defpackage.wde) obj;
        if (this.a) {
            wdeVar.a();
        } else {
            wdeVar.c();
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
