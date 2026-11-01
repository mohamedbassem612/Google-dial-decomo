package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class z4 extends j$.util.stream.n4 {
    public final /* synthetic */ java.util.function.BinaryOperator h;
    public final /* synthetic */ java.util.function.BiConsumer i;
    public final /* synthetic */ java.util.function.Supplier j;
    public final /* synthetic */ j$.util.stream.Collector k;

    public z4(j$.util.stream.w7 w7Var, java.util.function.BinaryOperator binaryOperator, java.util.function.BiConsumer biConsumer, java.util.function.Supplier supplier, j$.util.stream.Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.n4
    public final j$.util.stream.i5 Q() {
        return new j$.util.stream.a5(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.n4, j$.util.stream.j9
    public final int c() {
        if (this.k.characteristics().contains(j$.util.stream.Collector.Characteristics.UNORDERED)) {
            return j$.util.stream.v7.r;
        }
        return 0;
    }
}
