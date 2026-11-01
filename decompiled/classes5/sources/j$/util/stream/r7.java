package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class r7 implements j$.util.stream.Stream {
    public final /* synthetic */ java.util.stream.Stream a;

    public /* synthetic */ r7(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ j$.util.stream.Stream e(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof j$.util.stream.s7 ? ((j$.util.stream.s7) stream).a : new j$.util.stream.r7(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.LongStream B(j$.util.stream.l0 l0Var) {
        return j$.util.stream.z1.e(this.a.flatMapToLong(j$.util.stream.n4.J(l0Var)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(java.util.function.Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(java.util.function.Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object collect(j$.util.stream.Collector collector) {
        java.util.stream.Collector hVar;
        java.util.stream.Stream stream = this.a;
        if (collector == null) {
            hVar = null;
        } else {
            hVar = collector instanceof j$.util.stream.g ? ((j$.util.stream.g) collector).a : new j$.util.stream.h(collector);
        }
        return stream.collect(hVar);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream distinct() {
        return e(this.a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
        return e(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.stream.Stream stream = this.a;
        if (obj instanceof j$.util.stream.r7) {
            obj = ((j$.util.stream.r7) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream filter(java.util.function.Predicate predicate) {
        return e(this.a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional findAny() {
        return j$.util.y.a(this.a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional findFirst() {
        return j$.util.y.a(this.a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream flatMap(java.util.function.Function function) {
        return e(this.a.flatMap(j$.util.stream.n4.J(function)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(java.util.function.Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    public final /* synthetic */ java.util.Iterator iterator2() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream l(j$.util.stream.c1 c1Var) {
        return e(this.a.gather(j$.util.stream.b1.a(c1Var)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream limit(long j) {
        return e(this.a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream map(java.util.function.Function function) {
        return e(this.a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        return j$.util.stream.c0.e(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.LongStream mapToLong(java.util.function.ToLongFunction toLongFunction) {
        return j$.util.stream.z1.e(this.a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional max(java.util.Comparator comparator) {
        return j$.util.y.a(this.a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional min(java.util.Comparator comparator) {
        return j$.util.y.a(this.a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(java.util.function.Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        return j$.util.stream.e.e(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream parallel() {
        return j$.util.stream.e.e(this.a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream peek(java.util.function.Consumer consumer) {
        return e(this.a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.Optional reduce(java.util.function.BinaryOperator binaryOperator) {
        return j$.util.y.a(this.a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream sequential() {
        return j$.util.stream.e.e(this.a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream skip(long j) {
        return e(this.a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream sorted() {
        return e(this.a.sorted());
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.x0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
        return e(this.a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.util.List toList() {
        return this.a.toList();
    }

    @Override // j$.util.stream.BaseStream
    public final /* synthetic */ j$.util.stream.BaseStream unordered() {
        return j$.util.stream.e.e(this.a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.DoubleStream w(j$.util.stream.l0 l0Var) {
        return j$.util.stream.c0.e(this.a.flatMapToDouble(j$.util.stream.n4.J(l0Var)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.IntStream x(j$.util.stream.l0 l0Var) {
        return j$.util.stream.IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(j$.util.stream.n4.J(l0Var)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.stream.Stream sorted(java.util.Comparator comparator) {
        return e(this.a.sorted(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }
}
