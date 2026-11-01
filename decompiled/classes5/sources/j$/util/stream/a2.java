package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class a2 implements java.util.stream.LongStream {
    public final /* synthetic */ j$.util.stream.LongStream a;

    public /* synthetic */ a2(j$.util.stream.LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ java.util.stream.LongStream e(j$.util.stream.LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof j$.util.stream.z1 ? ((j$.util.stream.z1) longStream).a : new j$.util.stream.a2(longStream);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean allMatch(java.util.function.LongPredicate longPredicate) {
        return this.a.r();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean anyMatch(java.util.function.LongPredicate longPredicate) {
        return this.a.z();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.DoubleStream asDoubleStream() {
        return j$.util.stream.d0.e(this.a.asDoubleStream());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalDouble average() {
        return j$.util.y.f(this.a.average());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return j$.util.stream.s7.e(this.a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream distinct() {
        return e(this.a.distinct());
    }

    public final /* synthetic */ java.util.stream.LongStream dropWhile(java.util.function.LongPredicate longPredicate) {
        return e(this.a.d());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.LongStream longStream = this.a;
        if (obj instanceof j$.util.stream.a2) {
            obj = ((j$.util.stream.a2) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream filter(java.util.function.LongPredicate longPredicate) {
        return e(this.a.c());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong findAny() {
        return j$.util.y.h(this.a.findAny());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong findFirst() {
        return j$.util.y.h(this.a.findFirst());
    }

    @Override // java.util.stream.LongStream
    public final java.util.stream.LongStream flatMap(java.util.function.LongFunction longFunction) {
        j$.util.stream.LongStream longStream = this.a;
        j$.util.stream.l0 l0Var = new j$.util.stream.l0();
        l0Var.a = longFunction;
        return e(longStream.a(l0Var));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEach(java.util.function.LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j$.util.k0] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Long> iterator2() {
        ?? Iterator2 = this.a.iterator2();
        if (Iterator2 == 0) {
            return null;
        }
        return Iterator2 instanceof j$.util.i0 ? ((j$.util.i0) Iterator2).a : new j$.util.j0(Iterator2);
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream map(java.util.function.LongUnaryOperator longUnaryOperator) {
        return e(this.a.y());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(java.util.function.LongToDoubleFunction longToDoubleFunction) {
        return j$.util.stream.d0.e(this.a.h());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.LongToIntFunction longToIntFunction) {
        return j$.util.stream.s1.e(this.a.C());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction) {
        return j$.util.stream.s7.e(this.a.mapToObj(longFunction));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong max() {
        return j$.util.y.h(this.a.max());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong min() {
        return j$.util.y.h(this.a.min());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ boolean noneMatch(java.util.function.LongPredicate longPredicate) {
        return this.a.s();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.f.e(this.a.onClose(runnable));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return j$.util.stream.f.e(this.a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream peek(java.util.function.LongConsumer longConsumer) {
        return e(this.a.peek(longConsumer));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.OptionalLong reduce(java.util.function.LongBinaryOperator longBinaryOperator) {
        return j$.util.y.h(this.a.reduce(longBinaryOperator));
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return j$.util.stream.f.e(this.a.sequential());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ java.util.stream.LongStream sorted() {
        return e(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.Spliterator$OfLong] */
    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator<java.lang.Long> spliterator() {
        return j$.util.t0.a(this.a.spliterator());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // java.util.stream.LongStream
    public final java.util.LongSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    public final /* synthetic */ java.util.stream.LongStream takeWhile(java.util.function.LongPredicate longPredicate) {
        return e(this.a.b());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return j$.util.stream.f.e(this.a.unordered());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.LongStream parallel() {
        return e(this.a.parallel());
    }

    @Override // java.util.stream.LongStream
    public final /* synthetic */ long reduce(long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.LongStream sequential() {
        return e(this.a.sequential());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Spliterator<java.lang.Long> spliterator2() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // java.util.stream.LongStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator<java.lang.Long> iterator() {
        return this.a.iterator2();
    }
}
