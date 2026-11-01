package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class allr implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.allu a;
    public final /* synthetic */ defpackage.almy b;
    public final /* synthetic */ java.util.function.BiConsumer c;

    public /* synthetic */ allr(defpackage.allu alluVar, defpackage.almy almyVar, java.util.function.BiConsumer biConsumer) {
        this.a = alluVar;
        this.b = almyVar;
        this.c = biConsumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        this.a.e.h(new defpackage.alka((defpackage.almz) obj, this.b, this.c));
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
