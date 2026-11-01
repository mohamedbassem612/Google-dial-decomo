package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class k implements java.util.function.Supplier, java.util.function.Function {
    public final /* synthetic */ j$.util.stream.Collector a;

    public /* synthetic */ k(j$.util.stream.Collector collector) {
        this.a = collector;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo3andThen(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        j$.util.stream.o oVar = (j$.util.stream.o) obj;
        java.util.Set set = j$.util.stream.Collectors.a;
        j$.util.stream.Collector collector = this.a;
        return new j$.util.stream.o(collector.finisher().apply(oVar.a), collector.finisher().apply(oVar.b));
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        java.util.Set set = j$.util.stream.Collectors.a;
        j$.util.stream.Collector collector = this.a;
        return new j$.util.stream.o(collector.supplier().get(), collector.supplier().get());
    }
}
