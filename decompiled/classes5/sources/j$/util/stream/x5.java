package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class x5 extends j$.util.stream.a implements j$.util.stream.Stream {
    @Override // j$.util.stream.Stream
    public final j$.util.stream.LongStream B(j$.util.stream.l0 l0Var) {
        j$.util.Objects.requireNonNull(l0Var);
        return new j$.util.stream.w1(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, l0Var, (byte) 2);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.w7 E() {
        return j$.util.stream.w7.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator F(java.util.function.Supplier supplier) {
        return new j$.util.stream.i8(supplier);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.m2 G(long j, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.x(j, intFunction);
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator N(j$.util.stream.a aVar, java.util.function.Supplier supplier, boolean z) {
        return new j$.util.stream.e9(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(java.util.function.Predicate predicate) {
        return ((java.lang.Boolean) m(j$.util.stream.n4.P(j$.util.stream.h2.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(java.util.function.Predicate predicate) {
        return ((java.lang.Boolean) m(j$.util.stream.n4.P(j$.util.stream.h2.ANY, predicate))).booleanValue();
    }

    public java.lang.Object collect(j$.util.stream.Collector collector) {
        j$.util.stream.Collector collector2;
        java.lang.Object objM;
        if (this.a.l && collector.characteristics().contains(j$.util.stream.Collector.Characteristics.CONCURRENT) && (!j$.util.stream.v7.ORDERED.p(this.f) || collector.characteristics().contains(j$.util.stream.Collector.Characteristics.UNORDERED))) {
            objM = collector.supplier().get();
            forEach(new j$.nio.file.e0((java.lang.Object) collector.accumulator(), objM, (byte) 10));
            collector2 = collector;
        } else {
            java.util.function.Supplier supplier = ((j$.util.stream.Collector) j$.util.Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            objM = m(new j$.util.stream.z4(j$.util.stream.w7.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return !collector2.characteristics().contains(j$.util.stream.Collector.Characteristics.IDENTITY_FINISH) ? collector2.finisher().apply(objM) : objM;
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((java.lang.Long) m(new j$.util.stream.u4((byte) 2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream distinct() {
        return new j$.util.stream.r(this, j$.util.stream.v7.m | j$.util.stream.v7.t, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream dropWhile(java.util.function.Predicate predicate) {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(predicate);
        return new j$.util.stream.m9(this, j$.util.stream.la.b, predicate, (byte) 1);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream filter(java.util.function.Predicate predicate) {
        j$.util.Objects.requireNonNull(predicate);
        return new j$.util.stream.u(this, j$.util.stream.v7.t, predicate, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional findAny() {
        return (j$.util.Optional) m(j$.util.stream.i0.d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional findFirst() {
        return (j$.util.Optional) m(j$.util.stream.i0.c);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream flatMap(java.util.function.Function function) {
        j$.util.Objects.requireNonNull(function);
        return new j$.util.stream.s5(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, function, (byte) 1);
    }

    public void forEach(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        m(new j$.util.stream.p0(consumer, false));
    }

    public void forEachOrdered(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        m(new j$.util.stream.p0(consumer, true));
    }

    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    public final java.util.Iterator iterator2() {
        j$.util.Spliterator spliterator = spliterator();
        j$.util.Objects.requireNonNull(spliterator);
        return new j$.util.z0(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream l(j$.util.stream.c1 c1Var) {
        j$.sun.misc.a aVar = j$.util.stream.j1.n;
        if (getClass() != j$.util.stream.j1.class) {
            return new j$.util.stream.j1(this, c1Var);
        }
        j$.util.stream.j1 j1Var = (j$.util.stream.j1) this;
        return new j$.util.stream.j1(j1Var.m.a(c1Var), j1Var);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream limit(long j) {
        if (j >= 0) {
            return j$.util.stream.q6.g(this, 0L, j);
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream map(java.util.function.Function function) {
        j$.util.Objects.requireNonNull(function);
        return new j$.util.stream.s5(this, j$.util.stream.v7.p | j$.util.stream.v7.n, function, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.DoubleStream mapToDouble(java.util.function.ToDoubleFunction toDoubleFunction) {
        j$.util.Objects.requireNonNull(toDoubleFunction);
        return new j$.util.stream.v(this, j$.util.stream.v7.p | j$.util.stream.v7.n, toDoubleFunction, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.IntStream mapToInt(java.util.function.ToIntFunction toIntFunction) {
        j$.util.Objects.requireNonNull(toIntFunction);
        return new j$.util.stream.m1(this, j$.util.stream.v7.p | j$.util.stream.v7.n, toIntFunction, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.LongStream mapToLong(java.util.function.ToLongFunction toLongFunction) {
        j$.util.Objects.requireNonNull(toLongFunction);
        return new j$.util.stream.w1(this, j$.util.stream.v7.p | j$.util.stream.v7.n, toLongFunction, (byte) 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional max(java.util.Comparator comparator) {
        j$.util.Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.b(comparator, (byte) 0));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional min(java.util.Comparator comparator) {
        j$.util.Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.b(comparator, (byte) 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(java.util.function.Predicate predicate) {
        return ((java.lang.Boolean) m(j$.util.stream.n4.P(j$.util.stream.h2.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 o(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.y(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream peek(java.util.function.Consumer consumer) {
        j$.util.Objects.requireNonNull(consumer);
        return new j$.util.stream.u(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object reduce(java.lang.Object obj, java.util.function.BiFunction biFunction, java.util.function.BinaryOperator binaryOperator) {
        j$.util.Objects.requireNonNull(biFunction);
        j$.util.Objects.requireNonNull(binaryOperator);
        return m(new j$.util.stream.s4(j$.util.stream.w7.REFERENCE, binaryOperator, biFunction, obj, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream skip(long j) {
        if (j >= 0) {
            return j != 0 ? j$.util.stream.q6.g(this, j, -1L) : this;
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream sorted() {
        return new j$.util.stream.b7(this);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream takeWhile(java.util.function.Predicate predicate) {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(predicate);
        return new j$.util.stream.m9(this, j$.util.stream.la.a, predicate, (byte) 0);
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.F(n(intFunction), intFunction).k(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final java.util.List toList() {
        return j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(java.util.Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream unordered() {
        return j$.util.stream.v7.ORDERED.p(this.f) ? new j$.util.stream.r5(this, j$.util.stream.v7.r, (byte) 1) : this;
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.DoubleStream w(j$.util.stream.l0 l0Var) {
        j$.util.Objects.requireNonNull(l0Var);
        return new j$.util.stream.v(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, l0Var, (byte) 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.IntStream x(j$.util.stream.l0 l0Var) {
        j$.util.Objects.requireNonNull(l0Var);
        return new j$.util.stream.m1(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, l0Var, (byte) 5);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.stream.Stream sorted(java.util.Comparator comparator) {
        return new j$.util.stream.b7(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object[] toArray() {
        return toArray(new j$.util.stream.z2((byte) 6));
    }

    @Override // j$.util.stream.Stream
    public final java.lang.Object reduce(java.lang.Object obj, java.util.function.BinaryOperator binaryOperator) {
        j$.util.Objects.requireNonNull(binaryOperator);
        j$.util.Objects.requireNonNull(binaryOperator);
        return m(new j$.util.stream.s4(j$.util.stream.w7.REFERENCE, binaryOperator, binaryOperator, obj, (byte) 2));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.Optional reduce(java.util.function.BinaryOperator binaryOperator) {
        j$.util.Objects.requireNonNull(binaryOperator);
        return (j$.util.Optional) m(new j$.util.stream.q4(j$.util.stream.w7.REFERENCE, binaryOperator, (byte) 2));
    }

    public java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.Objects.requireNonNull(biConsumer2);
        return m(new j$.util.stream.s4(j$.util.stream.w7.REFERENCE, biConsumer2, biConsumer, supplier, (byte) 3));
    }
}
