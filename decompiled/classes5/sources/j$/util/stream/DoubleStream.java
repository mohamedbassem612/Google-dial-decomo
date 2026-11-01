package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface DoubleStream extends j$.util.stream.BaseStream<java.lang.Double, j$.util.stream.DoubleStream> {
    j$.util.stream.IntStream A();

    boolean D();

    j$.util.stream.DoubleStream a(j$.util.stream.l0 l0Var);

    j$.util.OptionalDouble average();

    j$.util.stream.DoubleStream b();

    j$.util.stream.Stream boxed();

    j$.util.stream.DoubleStream c();

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer);

    long count();

    j$.util.stream.DoubleStream d();

    j$.util.stream.DoubleStream distinct();

    j$.util.OptionalDouble findAny();

    j$.util.OptionalDouble findFirst();

    void forEach(java.util.function.DoubleConsumer doubleConsumer);

    void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    java.util.Iterator<java.lang.Double> iterator2();

    j$.util.stream.DoubleStream limit(long j);

    j$.util.stream.DoubleStream map(java.util.function.DoubleUnaryOperator doubleUnaryOperator);

    j$.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction);

    j$.util.OptionalDouble max();

    j$.util.OptionalDouble min();

    boolean p();

    @Override // j$.util.stream.BaseStream
    j$.util.stream.DoubleStream parallel();

    j$.util.stream.DoubleStream peek(java.util.function.DoubleConsumer doubleConsumer);

    double reduce(double d, java.util.function.DoubleBinaryOperator doubleBinaryOperator);

    j$.util.OptionalDouble reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.BaseStream
    j$.util.stream.DoubleStream sequential();

    j$.util.stream.DoubleStream skip(long j);

    j$.util.stream.DoubleStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.Spliterator<java.lang.Double> spliterator();

    double sum();

    j$.util.DoubleSummaryStatistics summaryStatistics();

    boolean t();

    double[] toArray();

    j$.util.stream.LongStream u();
}
