package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class d0 implements java.util.stream.DoubleStream {
    public final /* synthetic */ j$.util.stream.DoubleStream a;

    public /* synthetic */ d0(j$.util.stream.DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ java.util.stream.DoubleStream e(j$.util.stream.DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof j$.util.stream.c0 ? ((j$.util.stream.c0) doubleStream).a : new j$.util.stream.d0(doubleStream);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean allMatch(java.util.function.DoublePredicate doublePredicate) {
        return this.a.t();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean anyMatch(java.util.function.DoublePredicate doublePredicate) {
        return this.a.p();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble average() {
        return j$.util.y.f(this.a.average());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream boxed() {
        return j$.util.stream.s7.e(this.a.boxed());
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream distinct() {
        return e(this.a.distinct());
    }

    public final /* synthetic */ java.util.stream.DoubleStream dropWhile(java.util.function.DoublePredicate doublePredicate) {
        return e(this.a.d());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.DoubleStream doubleStream = this.a;
        if (obj instanceof j$.util.stream.d0) {
            obj = ((j$.util.stream.d0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream filter(java.util.function.DoublePredicate doublePredicate) {
        return e(this.a.c());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble findAny() {
        return j$.util.y.f(this.a.findAny());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble findFirst() {
        return j$.util.y.f(this.a.findFirst());
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.stream.DoubleStream flatMap(java.util.function.DoubleFunction doubleFunction) {
        j$.util.stream.DoubleStream doubleStream = this.a;
        j$.util.stream.l0 l0Var = new j$.util.stream.l0();
        l0Var.a = doubleFunction;
        return e(doubleStream.a(l0Var));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [j$.util.c0] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Double> iterator2() {
        ?? Iterator2 = this.a.iterator2();
        if (Iterator2 == 0) {
            return null;
        }
        return Iterator2 instanceof j$.util.a0 ? ((j$.util.a0) Iterator2).a : new j$.util.b0(Iterator2);
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream map(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        return e(this.a.map(doubleUnaryOperator));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.DoubleToIntFunction doubleToIntFunction) {
        return j$.util.stream.s1.e(this.a.A());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.DoubleToLongFunction doubleToLongFunction) {
        return j$.util.stream.a2.e(this.a.u());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction) {
        return j$.util.stream.s7.e(this.a.mapToObj(doubleFunction));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble max() {
        return j$.util.y.f(this.a.max());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble min() {
        return j$.util.y.f(this.a.min());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ boolean noneMatch(java.util.function.DoublePredicate doublePredicate) {
        return this.a.D();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.f.e(this.a.onClose(runnable));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return j$.util.stream.f.e(this.a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream peek(java.util.function.DoubleConsumer doubleConsumer) {
        return e(this.a.peek(doubleConsumer));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.OptionalDouble reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.y.f(this.a.reduce(doubleBinaryOperator));
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return j$.util.stream.f.e(this.a.sequential());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ java.util.stream.DoubleStream sorted() {
        return e(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.p0] */
    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator<java.lang.Double> spliterator() {
        return j$.util.o0.a(this.a.spliterator());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // java.util.stream.DoubleStream
    public final java.util.DoubleSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ java.util.stream.DoubleStream takeWhile(java.util.function.DoublePredicate doublePredicate) {
        return e(this.a.b());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return j$.util.stream.f.e(this.a.unordered());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.DoubleStream parallel() {
        return e(this.a.parallel());
    }

    @Override // java.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.DoubleStream sequential() {
        return e(this.a.sequential());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    /* JADX INFO: renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Spliterator<java.lang.Double> spliterator2() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // java.util.stream.DoubleStream, java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator<java.lang.Double> iterator() {
        return this.a.iterator2();
    }
}
