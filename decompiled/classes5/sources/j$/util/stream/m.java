package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class m implements j$.util.stream.Collector {
    public final java.util.function.Supplier a;
    public final java.util.function.BiConsumer b;
    public final java.util.function.BinaryOperator c;
    public final java.util.function.Function d;
    public final java.util.Set e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BinaryOperator binaryOperator, java.util.Set set) {
        this(supplier, biConsumer, binaryOperator, new j$.desugar.sun.nio.fs.n((byte) 27), set);
        java.util.Set set2 = j$.util.stream.Collectors.a;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.BiConsumer accumulator() {
        return this.b;
    }

    @Override // j$.util.stream.Collector
    public final java.util.Set characteristics() {
        return this.e;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.BinaryOperator combiner() {
        return this.c;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.Function finisher() {
        return this.d;
    }

    @Override // j$.util.stream.Collector
    public final java.util.function.Supplier supplier() {
        return this.a;
    }

    public m(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BinaryOperator binaryOperator, java.util.function.Function function, java.util.Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }
}
