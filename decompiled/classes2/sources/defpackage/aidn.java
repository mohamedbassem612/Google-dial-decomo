package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aidn implements java.util.function.BiConsumer {
    public final /* synthetic */ java.util.function.Function a;
    public final /* synthetic */ java.util.function.Function b;

    public /* synthetic */ aidn(java.util.function.Function function, java.util.function.Function function2) {
        this.a = function;
        this.b = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        j$.util.stream.Collector collector = aido.a;
        ((defpackage.aifz) obj).b(aa$.ExternalSyntheticApiModelOutline1.m(this.a, obj2), aa$.ExternalSyntheticApiModelOutline1.m(this.b, obj2));
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return j$.util.function.BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
