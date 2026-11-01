package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class s7 implements java.util.stream.Stream {
    public final /* synthetic */ j$.util.stream.Stream a;

    public /* synthetic */ s7(j$.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ java.util.stream.Stream e(j$.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof j$.util.stream.r7 ? ((j$.util.stream.r7) stream).a : new j$.util.stream.s7(stream);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean allMatch(java.util.function.Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.lang.Object collect(java.util.stream.Collector collector) {
        j$.util.stream.Collector gVar;
        j$.util.stream.Stream stream = this.a;
        if (collector == null) {
            gVar = null;
        } else {
            gVar = collector instanceof j$.util.stream.h ? ((j$.util.stream.h) collector).a : new j$.util.stream.g(collector);
        }
        return stream.collect(gVar);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream distinct() {
        return e(this.a.distinct());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
        return e(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.util.stream.Stream stream = this.a;
        if (obj instanceof j$.util.stream.s7) {
            obj = ((j$.util.stream.s7) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream filter(java.util.function.Predicate predicate) {
        return e(this.a.filter(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.Optional findAny() {
        return j$.util.y.e(this.a.findAny());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.Optional findFirst() {
        return j$.util.y.e(this.a.findFirst());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream flatMap(java.util.function.Function function) {
        return e(this.a.flatMap(j$.util.stream.n4.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.DoubleStream flatMapToDouble(java.util.function.Function function) {
        return j$.util.stream.d0.e(this.a.w(j$.util.stream.n4.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream flatMapToInt(java.util.function.Function function) {
        return j$.util.stream.s1.e(this.a.x(j$.util.stream.n4.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream flatMapToLong(java.util.function.Function function) {
        return j$.util.stream.a2.e(this.a.B(j$.util.stream.n4.J(function)));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ java.util.stream.Stream gather(java.util.stream.Gatherer gatherer) {
        return e(this.a.l(j$.util.stream.a1.c(gatherer)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.Iterator iterator() {
        return this.a.iterator2();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream map(java.util.function.Function function) {
        return e(this.a.map(function));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.stream.d0.e(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.stream.s1.e(this.a.mapToInt(toIntFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.LongStream mapToLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.stream.a2.e(this.a.mapToLong(toLongFunction));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.Optional max(java.util.Comparator comparator) {
        return j$.util.y.e(this.a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.Optional min(java.util.Comparator comparator) {
        return j$.util.y.e(this.a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.f.e(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream parallel() {
        return j$.util.stream.f.e(this.a.parallel());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream peek(java.util.function.Consumer consumer) {
        return e(this.a.peek(consumer));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.Optional reduce(java.util.function.BinaryOperator binaryOperator) {
        return j$.util.y.e(this.a.reduce(binaryOperator));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream sequential() {
        return j$.util.stream.f.e(this.a.sequential());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted() {
        return e(this.a.sorted());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return j$.util.y0.a(this.a.spliterator());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
        return e(this.a.takeWhile(predicate));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.lang.Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.List toList() {
        return this.a.toList();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ java.util.stream.BaseStream unordered() {
        return j$.util.stream.f.e(this.a.unordered());
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.util.stream.Stream sorted(java.util.Comparator comparator) {
        return e(this.a.sorted(comparator));
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // java.util.stream.Stream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }
}
