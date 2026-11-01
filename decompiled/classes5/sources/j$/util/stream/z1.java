package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class z1 implements j$.util.stream.LongStream {
    public final /* synthetic */ java.util.stream.LongStream a;

    public /* synthetic */ z1(java.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ j$.util.stream.LongStream e(java.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof j$.util.stream.a2 ? ((j$.util.stream.a2) longStream).a : new j$.util.stream.z1(longStream);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.IntStream C() {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream a(j$.util.stream.l0 l0Var) {
        java.util.stream.LongStream longStream = this.a;
        j$.util.stream.l0 l0Var2 = new j$.util.stream.l0();
        l0Var2.a = l0Var;
        return e(longStream.flatMap(l0Var2));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.DoubleStream asDoubleStream() {
        return j$.util.stream.c0.e(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.OptionalDouble average() {
        return j$.util.y.b(this.a.average());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream b() {
        return e(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.Stream boxed() {
        return j$.util.stream.r7.e(this.a.boxed());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream c() {
        return e(this.a.filter(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream d() {
        return e(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream distinct() {
        return e(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.LongStream longStream = this.a;
        if (obj instanceof j$.util.stream.z1) {
            obj = ((j$.util.stream.z1) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.OptionalLong findAny() {
        return j$.util.y.d(this.a.findAny());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.OptionalLong findFirst() {
        return j$.util.y.d(this.a.findFirst());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEach(java.util.function.LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.DoubleStream h() {
        return j$.util.stream.c0.e(this.a.mapToDouble(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    public final /* synthetic */ java.util.Iterator<java.lang.Long> iterator2() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.j0 ? ((j$.util.j0) it).a : new j$.util.i0(it);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction) {
        return j$.util.stream.r7.e(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.OptionalLong max() {
        return j$.util.y.d(this.a.max());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.OptionalLong min() {
        return j$.util.y.d(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.e.e(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream parallel() {
        return j$.util.stream.e.e(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream peek(java.util.function.LongConsumer longConsumer) {
        return e(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean r() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.OptionalLong reduce(java.util.function.LongBinaryOperator longBinaryOperator) {
        return j$.util.y.d(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean s() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream sequential() {
        return j$.util.stream.e.e(this.a.sequential());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream sorted() {
        return e(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator<java.lang.Long> spliterator() {
        return j$.util.s0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.LongSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream unordered() {
        return j$.util.stream.e.e(this.a.unordered());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ j$.util.stream.LongStream y() {
        return e(this.a.map(null));
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ boolean z() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.LongStream parallel() {
        return e(this.a.parallel());
    }

    @Override // j$.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.LongStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.LongStream sequential() {
        return e(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator<java.lang.Long> spliterator() {
        return j$.util.x0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Long> iterator2() {
        return this.a.iterator();
    }
}
