package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class r1 extends j$.util.stream.a implements j$.util.stream.IntStream {
    public static j$.util.Spliterator.OfInt R(j$.util.Spliterator spliterator) {
        if (spliterator instanceof j$.util.Spliterator.OfInt) {
            return (j$.util.Spliterator.OfInt) spliterator;
        }
        if (!j$.util.stream.l9.a) {
            throw new java.lang.UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        j$.util.stream.l9.a(j$.util.stream.a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.w7 E() {
        return j$.util.stream.w7.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator F(java.util.function.Supplier supplier) {
        return new j$.util.stream.f8(supplier);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.m2 G(long j, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.K(j);
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator N(j$.util.stream.a aVar, java.util.function.Supplier supplier, boolean z) {
        return new j$.util.stream.n8(aVar, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream a(j$.util.stream.l0 l0Var) {
        j$.util.Objects.requireNonNull(l0Var);
        return new j$.util.stream.m1(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, l0Var, (byte) 2);
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(java.util.function.IntPredicate intPredicate) {
        return ((java.lang.Boolean) m(j$.util.stream.n4.N(j$.util.stream.h2.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(java.util.function.IntPredicate intPredicate) {
        return ((java.lang.Boolean) m(j$.util.stream.n4.N(j$.util.stream.h2.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.DoubleStream asDoubleStream() {
        return new j$.util.stream.a0(this, 0, (byte) 2);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.LongStream asLongStream() {
        return new j$.util.stream.y(this, 0, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.OptionalDouble average() {
        long[] jArr = (long[]) collect(new j$.util.stream.r0((byte) 11), new j$.util.stream.r0((byte) 12), new j$.util.stream.r0((byte) 13));
        long j = jArr[0];
        return j > 0 ? new j$.util.OptionalDouble(jArr[1] / j) : j$.util.OptionalDouble.c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.Stream boxed() {
        return new j$.util.stream.u(this, 0, new j$.util.stream.r0((byte) 15), (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.stream.t tVar = new j$.util.stream.t(biConsumer, (byte) 2);
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(objIntConsumer);
        j$.util.Objects.requireNonNull(tVar);
        return m(new j$.util.stream.s4(j$.util.stream.w7.INT_VALUE, tVar, objIntConsumer, supplier, (byte) 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((java.lang.Long) m(new j$.util.stream.u4((byte) 3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream distinct() {
        return ((j$.util.stream.x5) boxed()).distinct().mapToInt(new j$.util.stream.r0((byte) 14));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream dropWhile(java.util.function.IntPredicate intPredicate) {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(intPredicate);
        return new j$.util.stream.r9(this, j$.util.stream.la.b, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream filter(java.util.function.IntPredicate intPredicate) {
        j$.util.Objects.requireNonNull(intPredicate);
        return new j$.util.stream.m1(this, j$.util.stream.v7.t, intPredicate, (byte) 3);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.OptionalInt findAny() {
        return (j$.util.OptionalInt) m(j$.util.stream.g0.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.OptionalInt findFirst() {
        return (j$.util.OptionalInt) m(j$.util.stream.g0.c);
    }

    public void forEach(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        m(new j$.util.stream.n0(intConsumer, false));
    }

    public void forEachOrdered(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        m(new j$.util.stream.n0(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.DoubleStream g() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.a0(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 3);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.util.Spliterator$OfInt, java.lang.Object] */
    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    public final java.util.Iterator<java.lang.Integer> iterator2() {
        ?? Spliterator = spliterator();
        j$.util.Objects.requireNonNull(Spliterator);
        return new j$.util.a1(Spliterator);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.LongStream k() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.y(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 2);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream limit(long j) {
        if (j >= 0) {
            return j$.util.stream.q6.e(this, 0L, j);
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream map(java.util.function.IntUnaryOperator intUnaryOperator) {
        j$.util.Objects.requireNonNull(intUnaryOperator);
        return new j$.util.stream.m1(this, j$.util.stream.v7.p | j$.util.stream.v7.n, intUnaryOperator, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.Stream mapToObj(java.util.function.IntFunction intFunction) {
        j$.util.Objects.requireNonNull(intFunction);
        return new j$.util.stream.u(this, j$.util.stream.v7.p | j$.util.stream.v7.n, intFunction, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.OptionalInt max() {
        return reduce(new j$.util.stream.r0((byte) 10));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.OptionalInt min() {
        return reduce(new j$.util.stream.r0((byte) 6));
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(java.util.function.IntPredicate intPredicate) {
        return ((java.lang.Boolean) m(j$.util.stream.n4.N(j$.util.stream.h2.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 o(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.A(aVar, spliterator, z);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream peek(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        return new j$.util.stream.m1(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, java.util.function.IntBinaryOperator intBinaryOperator) {
        j$.util.Objects.requireNonNull(intBinaryOperator);
        return ((java.lang.Integer) m(new j$.util.stream.d5(j$.util.stream.w7.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream skip(long j) {
        if (j >= 0) {
            return j != 0 ? j$.util.stream.q6.e(this, j, -1L) : this;
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream sorted() {
        return new j$.util.stream.z6(this, j$.util.stream.v7.q | j$.util.stream.v7.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.Spliterator<java.lang.Integer> spliterator() {
        return R(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new j$.util.stream.r0((byte) 9));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.IntSummaryStatistics summaryStatistics() {
        return (j$.util.IntSummaryStatistics) collect(new j$.desugar.sun.nio.fs.n((byte) 22), new j$.util.stream.r0((byte) 7), new j$.util.stream.r0((byte) 8));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.stream.IntStream takeWhile(java.util.function.IntPredicate intPredicate) {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(intPredicate);
        return new j$.util.stream.p9(this, j$.util.stream.la.a, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) j$.util.stream.n4.H((j$.util.stream.q2) n(new j$.util.stream.r0((byte) 5))).b();
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream unordered() {
        return j$.util.stream.v7.ORDERED.p(this.f) ? new j$.util.stream.x(this, j$.util.stream.v7.r, (byte) 1) : this;
    }

    @Override // j$.util.stream.a
    public final boolean v(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        java.util.function.IntConsumer d0Var;
        boolean zT;
        j$.util.Spliterator.OfInt ofIntR = R(spliterator);
        if (f6Var instanceof java.util.function.IntConsumer) {
            d0Var = (java.util.function.IntConsumer) f6Var;
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(j$.util.stream.a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            j$.util.Objects.requireNonNull(f6Var);
            d0Var = new j$.util.d0(f6Var, (byte) 1);
        }
        do {
            zT = f6Var.t();
            if (zT) {
                break;
            }
        } while (ofIntR.tryAdvance(d0Var));
        return zT;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.OptionalInt reduce(java.util.function.IntBinaryOperator intBinaryOperator) {
        j$.util.Objects.requireNonNull(intBinaryOperator);
        return (j$.util.OptionalInt) m(new j$.util.stream.q4(j$.util.stream.w7.INT_VALUE, intBinaryOperator, (byte) 3));
    }
}
