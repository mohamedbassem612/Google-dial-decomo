package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public interface IntStream extends j$.util.stream.BaseStream<java.lang.Integer, j$.util.stream.IntStream> {

    /* JADX INFO: renamed from: j$.util.stream.IntStream$-CC, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class CC {
        public static j$.util.stream.IntStream range(int i, int i2) {
            if (i >= i2) {
                j$.util.h1 h1Var = j$.util.Spliterators.b;
                return new j$.util.stream.p1(h1Var, j$.util.stream.v7.l(h1Var), false);
            }
            j$.util.stream.h9 h9Var = new j$.util.stream.h9(i, i2);
            return new j$.util.stream.p1(h9Var, j$.util.stream.v7.l(h9Var), false);
        }
    }

    j$.util.stream.IntStream a(j$.util.stream.l0 l0Var);

    boolean allMatch(java.util.function.IntPredicate intPredicate);

    boolean anyMatch(java.util.function.IntPredicate intPredicate);

    j$.util.stream.DoubleStream asDoubleStream();

    j$.util.stream.LongStream asLongStream();

    j$.util.OptionalDouble average();

    j$.util.stream.Stream<java.lang.Integer> boxed();

    java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer);

    long count();

    j$.util.stream.IntStream distinct();

    j$.util.stream.IntStream dropWhile(java.util.function.IntPredicate intPredicate);

    j$.util.stream.IntStream filter(java.util.function.IntPredicate intPredicate);

    j$.util.OptionalInt findAny();

    j$.util.OptionalInt findFirst();

    void forEach(java.util.function.IntConsumer intConsumer);

    void forEachOrdered(java.util.function.IntConsumer intConsumer);

    j$.util.stream.DoubleStream g();

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    java.util.Iterator<java.lang.Integer> iterator2();

    j$.util.stream.LongStream k();

    j$.util.stream.IntStream limit(long j);

    j$.util.stream.IntStream map(java.util.function.IntUnaryOperator intUnaryOperator);

    <U> j$.util.stream.Stream<U> mapToObj(java.util.function.IntFunction<? extends U> intFunction);

    j$.util.OptionalInt max();

    j$.util.OptionalInt min();

    boolean noneMatch(java.util.function.IntPredicate intPredicate);

    @Override // j$.util.stream.BaseStream
    j$.util.stream.IntStream parallel();

    j$.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer);

    int reduce(int i, java.util.function.IntBinaryOperator intBinaryOperator);

    j$.util.OptionalInt reduce(java.util.function.IntBinaryOperator intBinaryOperator);

    @Override // j$.util.stream.BaseStream
    j$.util.stream.IntStream sequential();

    j$.util.stream.IntStream skip(long j);

    j$.util.stream.IntStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.Spliterator<java.lang.Integer> spliterator();

    int sum();

    j$.util.IntSummaryStatistics summaryStatistics();

    j$.util.stream.IntStream takeWhile(java.util.function.IntPredicate intPredicate);

    int[] toArray();

    /* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
    public final /* synthetic */ class VivifiedWrapper implements j$.util.stream.IntStream {
        public final /* synthetic */ java.util.stream.IntStream a;

        public /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.a = intStream;
        }

        public static /* synthetic */ j$.util.stream.IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof j$.util.stream.s1 ? ((j$.util.stream.s1) intStream).a : new j$.util.stream.IntStream.VivifiedWrapper(intStream);
        }

        @Override // j$.util.stream.IntStream
        public final j$.util.stream.IntStream a(j$.util.stream.l0 l0Var) {
            java.util.stream.IntStream intStream = this.a;
            j$.util.stream.l0 l0Var2 = new j$.util.stream.l0();
            l0Var2.a = l0Var;
            return convert(intStream.flatMap(l0Var2));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean allMatch(java.util.function.IntPredicate intPredicate) {
            return this.a.allMatch(intPredicate);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean anyMatch(java.util.function.IntPredicate intPredicate) {
            return this.a.anyMatch(intPredicate);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.DoubleStream asDoubleStream() {
            return j$.util.stream.c0.e(this.a.asDoubleStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.LongStream asLongStream() {
            return j$.util.stream.z1.e(this.a.asLongStream());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.OptionalDouble average() {
            return j$.util.y.b(this.a.average());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.Stream boxed() {
            return j$.util.stream.r7.e(this.a.boxed());
        }

        @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
        public final /* synthetic */ void close() {
            this.a.close();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return this.a.collect(supplier, objIntConsumer, biConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ long count() {
            return this.a.count();
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream distinct() {
            return convert(this.a.distinct());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream dropWhile(java.util.function.IntPredicate intPredicate) {
            return convert(this.a.dropWhile(intPredicate));
        }

        public final /* synthetic */ boolean equals(java.lang.Object obj) {
            java.util.stream.IntStream intStream = this.a;
            if (obj instanceof j$.util.stream.IntStream.VivifiedWrapper) {
                obj = ((j$.util.stream.IntStream.VivifiedWrapper) obj).a;
            }
            return intStream.equals(obj);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream filter(java.util.function.IntPredicate intPredicate) {
            return convert(this.a.filter(intPredicate));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.OptionalInt findAny() {
            return j$.util.y.c(this.a.findAny());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.OptionalInt findFirst() {
            return j$.util.y.c(this.a.findFirst());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEach(java.util.function.IntConsumer intConsumer) {
            this.a.forEach(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ void forEachOrdered(java.util.function.IntConsumer intConsumer) {
            this.a.forEachOrdered(intConsumer);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.DoubleStream g() {
            return j$.util.stream.c0.e(this.a.mapToDouble(null));
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ boolean isParallel() {
            return this.a.isParallel();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.PrimitiveIterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator */
        public final /* synthetic */ java.util.Iterator<java.lang.Integer> iterator2() {
            ?? it = this.a.iterator();
            if (it == 0) {
                return null;
            }
            return it instanceof j$.util.f0 ? ((j$.util.f0) it).a : new j$.util.e0(it);
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.LongStream k() {
            return j$.util.stream.z1.e(this.a.mapToLong(null));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream limit(long j) {
            return convert(this.a.limit(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream map(java.util.function.IntUnaryOperator intUnaryOperator) {
            return convert(this.a.map(intUnaryOperator));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
            return j$.util.stream.r7.e(this.a.mapToObj(intFunction));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.OptionalInt max() {
            return j$.util.y.c(this.a.max());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.OptionalInt min() {
            return j$.util.y.c(this.a.min());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ boolean noneMatch(java.util.function.IntPredicate intPredicate) {
            return this.a.noneMatch(intPredicate);
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
            return j$.util.stream.e.e(this.a.onClose(runnable));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.stream.BaseStream parallel() {
            return j$.util.stream.e.e(this.a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
            return convert(this.a.peek(intConsumer));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.OptionalInt reduce(java.util.function.IntBinaryOperator intBinaryOperator) {
            return j$.util.y.c(this.a.reduce(intBinaryOperator));
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.stream.BaseStream sequential() {
            return j$.util.stream.e.e(this.a.sequential());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream skip(long j) {
            return convert(this.a.skip(j));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream sorted() {
            return convert(this.a.sorted());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Spliterator$OfInt] */
        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.Spliterator<java.lang.Integer> spliterator() {
            return j$.util.q0.a(this.a.spliterator());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int sum() {
            return this.a.sum();
        }

        @Override // j$.util.stream.IntStream
        public final j$.util.IntSummaryStatistics summaryStatistics() {
            this.a.summaryStatistics();
            throw new java.lang.Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ j$.util.stream.IntStream takeWhile(java.util.function.IntPredicate intPredicate) {
            return convert(this.a.takeWhile(intPredicate));
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int[] toArray() {
            return this.a.toArray();
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.stream.BaseStream unordered() {
            return j$.util.stream.e.e(this.a.unordered());
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.stream.IntStream parallel() {
            return convert(this.a.parallel());
        }

        @Override // j$.util.stream.IntStream
        public final /* synthetic */ int reduce(int i, java.util.function.IntBinaryOperator intBinaryOperator) {
            return this.a.reduce(i, intBinaryOperator);
        }

        @Override // j$.util.stream.IntStream, j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.stream.IntStream sequential() {
            return convert(this.a.sequential());
        }

        @Override // j$.util.stream.BaseStream
        public final /* synthetic */ j$.util.Spliterator<java.lang.Integer> spliterator() {
            return j$.util.x0.a(this.a.spliterator());
        }

        @Override // j$.util.stream.BaseStream
        /* JADX INFO: renamed from: iterator, reason: avoid collision after fix types in other method */
        public final /* synthetic */ java.util.Iterator<java.lang.Integer> iterator2() {
            return this.a.iterator();
        }
    }
}
