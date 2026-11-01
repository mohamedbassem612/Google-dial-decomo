package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class c0 implements j$.util.stream.DoubleStream {
    public final /* synthetic */ java.util.stream.DoubleStream a;

    public /* synthetic */ c0(java.util.stream.DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ j$.util.stream.DoubleStream e(java.util.stream.DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof j$.util.stream.d0 ? ((j$.util.stream.d0) doubleStream).a : new j$.util.stream.c0(doubleStream);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.IntStream A() {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean D() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream a(j$.util.stream.l0 l0Var) {
        java.util.stream.DoubleStream doubleStream = this.a;
        j$.util.stream.l0 l0Var2 = new j$.util.stream.l0();
        l0Var2.a = l0Var;
        return e(doubleStream.flatMap(l0Var2));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.OptionalDouble average() {
        return j$.util.y.b(this.a.average());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream b() {
        return e(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.Stream boxed() {
        return j$.util.stream.r7.e(this.a.boxed());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream c() {
        return e(this.a.filter(null));
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream d() {
        return e(this.a.dropWhile(null));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream distinct() {
        return e(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.DoubleStream doubleStream = this.a;
        if (obj instanceof j$.util.stream.c0) {
            obj = ((j$.util.stream.c0) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.OptionalDouble findAny() {
        return j$.util.y.b(this.a.findAny());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.OptionalDouble findFirst() {
        return j$.util.y.b(this.a.findFirst());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    public final /* synthetic */ java.util.Iterator<java.lang.Double> iterator2() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.b0 ? ((j$.util.b0) it).a : new j$.util.a0(it);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream map(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        return e(this.a.map(doubleUnaryOperator));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction) {
        return j$.util.stream.r7.e(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.OptionalDouble max() {
        return j$.util.y.b(this.a.max());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.OptionalDouble min() {
        return j$.util.y.b(this.a.min());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.e.e(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean p() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream parallel() {
        return j$.util.stream.e.e(this.a.parallel());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream peek(java.util.function.DoubleConsumer doubleConsumer) {
        return e(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.OptionalDouble reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.y.b(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream sequential() {
        return j$.util.stream.e.e(this.a.sequential());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.DoubleStream sorted() {
        return e(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator<java.lang.Double> spliterator() {
        return j$.util.n0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.DoubleSummaryStatistics summaryStatistics() {
        this.a.summaryStatistics();
        throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ boolean t() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ j$.util.stream.LongStream u() {
        return j$.util.stream.z1.e(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream unordered() {
        return j$.util.stream.e.e(this.a.unordered());
    }

    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.DoubleStream parallel() {
        return e(this.a.parallel());
    }

    @Override // j$.util.stream.DoubleStream
    public final /* synthetic */ double reduce(double d, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.DoubleStream, j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.DoubleStream sequential() {
        return e(this.a.sequential());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator<java.lang.Double> spliterator() {
        return j$.util.x0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
    public final /* synthetic */ java.util.Iterator<java.lang.Double> iterator2() {
        return this.a.iterator();
    }
}
