package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface LongStream extends j$.util.stream.BaseStream<java.lang.Long, j$.util.stream.LongStream> {
    j$.util.stream.IntStream C();

    j$.util.stream.LongStream a(j$.util.stream.l0 l0Var);

    j$.util.stream.DoubleStream asDoubleStream();

    j$.util.OptionalDouble average();

    j$.util.stream.LongStream b();

    j$.util.stream.Stream boxed();

    j$.util.stream.LongStream c();

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer);

    long count();

    j$.util.stream.LongStream d();

    j$.util.stream.LongStream distinct();

    j$.util.OptionalLong findAny();

    j$.util.OptionalLong findFirst();

    void forEach(java.util.function.LongConsumer longConsumer);

    void forEachOrdered(java.util.function.LongConsumer longConsumer);

    j$.util.stream.DoubleStream h();

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    java.util.Iterator<java.lang.Long> iterator2();

    j$.util.stream.LongStream limit(long j);

    j$.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction);

    j$.util.OptionalLong max();

    j$.util.OptionalLong min();

    @Override // j$.util.stream.BaseStream
    j$.util.stream.LongStream parallel();

    j$.util.stream.LongStream peek(java.util.function.LongConsumer longConsumer);

    boolean r();

    long reduce(long j, java.util.function.LongBinaryOperator longBinaryOperator);

    j$.util.OptionalLong reduce(java.util.function.LongBinaryOperator longBinaryOperator);

    boolean s();

    @Override // j$.util.stream.BaseStream
    j$.util.stream.LongStream sequential();

    j$.util.stream.LongStream skip(long j);

    j$.util.stream.LongStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.Spliterator<java.lang.Long> spliterator();

    long sum();

    j$.util.LongSummaryStatistics summaryStatistics();

    long[] toArray();

    j$.util.stream.LongStream y();

    boolean z();
}
