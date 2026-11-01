package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class oxv implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;

    public /* synthetic */ oxv(float f, int i) {
        this.$cid = i;
        this.a = f;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.oyc.g((android.widget.TextView) obj, this.a);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) obj;
        defpackage.oyc.g(textView, java.lang.Math.min(this.a, textView.getAlpha()));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return this.$cid != 0 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
