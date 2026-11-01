package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class h implements java.util.stream.Collector {
    public final /* synthetic */ j$.util.stream.Collector a;

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.BiConsumer accumulator() {
        return this.a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.Set characteristics() {
        return j$.util.stream.t7.a(this.a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.BinaryOperator combiner() {
        return this.a.combiner();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.Collector collector = this.a;
        if (obj instanceof j$.util.stream.h) {
            obj = ((j$.util.stream.h) obj).a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.Function finisher() {
        return this.a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ java.util.function.Supplier supplier() {
        return this.a.supplier();
    }
}
