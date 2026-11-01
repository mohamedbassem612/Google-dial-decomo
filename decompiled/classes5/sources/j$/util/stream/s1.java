package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class s1 implements java.util.stream.IntStream {
    public final /* synthetic */ j$.util.stream.IntStream a;

    public /* synthetic */ s1(j$.util.stream.IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ java.util.stream.IntStream e(j$.util.stream.IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof j$.util.stream.IntStream.VivifiedWrapper ? ((j$.util.stream.IntStream.VivifiedWrapper) intStream).a : new j$.util.stream.s1(intStream);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean allMatch(java.util.function.IntPredicate intPredicate) {
        return this.a.allMatch(intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean anyMatch(java.util.function.IntPredicate intPredicate) {
        return this.a.anyMatch(intPredicate);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.DoubleStream asDoubleStream() {
        return j$.util.stream.d0.e(this.a.asDoubleStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.LongStream asLongStream() {
        return j$.util.stream.a2.e(this.a.asLongStream());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.OptionalDouble average() {
        return j$.util.y.f(this.a.average());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return j$.util.stream.s7.e(this.a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
        return this.a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream distinct() {
        return e(this.a.distinct());
    }

    public final /* synthetic */ java.util.stream.IntStream dropWhile(java.util.function.IntPredicate intPredicate) {
        return e(this.a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.IntStream intStream = this.a;
        if (obj instanceof j$.util.stream.s1) {
            obj = ((j$.util.stream.s1) obj).a;
        }
        return intStream.equals(obj);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream filter(java.util.function.IntPredicate intPredicate) {
        return e(this.a.filter(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.OptionalInt findAny() {
        return j$.util.y.g(this.a.findAny());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.OptionalInt findFirst() {
        return j$.util.y.g(this.a.findFirst());
    }

    @Override // java.util.stream.IntStream
    public final java.util.stream.IntStream flatMap(java.util.function.IntFunction intFunction) {
        j$.util.stream.IntStream intStream = this.a;
        j$.util.stream.l0 l0Var = new j$.util.stream.l0();
        l0Var.a = intFunction;
        return e(intStream.a(l0Var));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEach(java.util.function.IntConsumer intConsumer) {
        this.a.forEach(intConsumer);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ void forEachOrdered(java.util.function.IntConsumer intConsumer) {
        this.a.forEachOrdered(intConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j$.util.g0] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Integer> iterator2() {
        ?? Iterator2 = this.a.iterator2();
        if (Iterator2 == 0) {
            return null;
        }
        return Iterator2 instanceof j$.util.e0 ? ((j$.util.e0) Iterator2).a : new j$.util.f0(Iterator2);
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream map(java.util.function.IntUnaryOperator intUnaryOperator) {
        return e(this.a.map(intUnaryOperator));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(java.util.function.IntToDoubleFunction intToDoubleFunction) {
        return j$.util.stream.d0.e(this.a.g());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.IntToLongFunction intToLongFunction) {
        return j$.util.stream.a2.e(this.a.k());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
        return j$.util.stream.s7.e(this.a.mapToObj(intFunction));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.OptionalInt max() {
        return j$.util.y.g(this.a.max());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.OptionalInt min() {
        return j$.util.y.g(this.a.min());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ boolean noneMatch(java.util.function.IntPredicate intPredicate) {
        return this.a.noneMatch(intPredicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.f.e(this.a.onClose(runnable));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return j$.util.stream.f.e(this.a.parallel());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
        return e(this.a.peek(intConsumer));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.OptionalInt reduce(java.util.function.IntBinaryOperator intBinaryOperator) {
        return j$.util.y.g(this.a.reduce(intBinaryOperator));
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return j$.util.stream.f.e(this.a.sequential());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ java.util.stream.IntStream sorted() {
        return e(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.Spliterator$OfInt] */
    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator<java.lang.Integer> spliterator() {
        return j$.util.r0.a(this.a.spliterator());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int sum() {
        return this.a.sum();
    }

    @Override // java.util.stream.IntStream
    public final java.util.IntSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
    }

    public final /* synthetic */ java.util.stream.IntStream takeWhile(java.util.function.IntPredicate intPredicate) {
        return e(this.a.takeWhile(intPredicate));
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return j$.util.stream.f.e(this.a.unordered());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.IntStream parallel() {
        return e(this.a.parallel());
    }

    @Override // java.util.stream.IntStream
    public final /* synthetic */ int reduce(int i, java.util.function.IntBinaryOperator intBinaryOperator) {
        return this.a.reduce(i, intBinaryOperator);
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.IntStream sequential() {
        return e(this.a.sequential());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Spliterator<java.lang.Integer> spliterator2() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // java.util.stream.IntStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator<java.lang.Integer> iterator() {
        return this.a.iterator2();
    }
}
