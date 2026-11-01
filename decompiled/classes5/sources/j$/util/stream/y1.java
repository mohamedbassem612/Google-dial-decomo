package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class y1 extends j$.util.stream.a implements j$.util.stream.LongStream {
    @Override // j$.util.stream.LongStream
    public final j$.util.stream.IntStream C() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.x(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 2);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.w7 E() {
        return j$.util.stream.w7.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator F(java.util.function.Supplier supplier) {
        return new j$.util.stream.g8(supplier);
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.m2 G(long j, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.L(j);
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator N(j$.util.stream.a aVar, java.util.function.Supplier supplier, boolean z) {
        return new j$.util.stream.p8(aVar, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream a(j$.util.stream.l0 l0Var) {
        j$.util.Objects.requireNonNull(l0Var);
        return new j$.util.stream.w1(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, l0Var, (byte) 0);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.DoubleStream asDoubleStream() {
        return new j$.util.stream.a0(this, j$.util.stream.v7.n, (byte) 4);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.OptionalDouble average() {
        long[] jArr = (long[]) collect(new j$.util.stream.r0((byte) 20), new j$.util.stream.r0((byte) 21), new j$.util.stream.r0((byte) 22));
        long j = jArr[0];
        return j > 0 ? new j$.util.OptionalDouble(jArr[1] / j) : j$.util.OptionalDouble.c;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream b() {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.t9(this, j$.util.stream.la.a, (byte) 0);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.Stream boxed() {
        return new j$.util.stream.u(this, 0, new j$.util.stream.r0((byte) 19), (byte) 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream c() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.y(this, j$.util.stream.v7.t, (byte) 5);
    }

    @Override // j$.util.stream.LongStream
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjLongConsumer objLongConsumer, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.stream.t tVar = new j$.util.stream.t(biConsumer, (byte) 3);
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(objLongConsumer);
        j$.util.Objects.requireNonNull(tVar);
        return m(new j$.util.stream.s4(j$.util.stream.w7.LONG_VALUE, tVar, objLongConsumer, supplier, (byte) 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((java.lang.Long) m(new j$.util.stream.u4((byte) 0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream d() {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.v9(this, j$.util.stream.la.b, (byte) 0);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream distinct() {
        return ((j$.util.stream.x5) boxed()).distinct().mapToLong(new j$.util.stream.r0((byte) 26));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.OptionalLong findAny() {
        return (j$.util.OptionalLong) m(j$.util.stream.h0.d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.OptionalLong findFirst() {
        return (j$.util.OptionalLong) m(j$.util.stream.h0.c);
    }

    @Override // j$.util.stream.LongStream
    public final void forEach(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        m(new j$.util.stream.o0(longConsumer, false));
    }

    @Override // j$.util.stream.LongStream
    public final void forEachOrdered(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        m(new j$.util.stream.o0(longConsumer, true));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.DoubleStream h() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.a0(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.util.Spliterator$OfLong, java.lang.Object] */
    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator */
    public final java.util.Iterator<java.lang.Long> iterator2() {
        ?? Spliterator = spliterator();
        j$.util.Objects.requireNonNull(Spliterator);
        return new j$.util.b1(Spliterator);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream limit(long j) {
        if (j >= 0) {
            return j$.util.stream.q6.f(this, 0L, j);
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.Stream mapToObj(java.util.function.LongFunction longFunction) {
        j$.util.Objects.requireNonNull(longFunction);
        return new j$.util.stream.u(this, j$.util.stream.v7.p | j$.util.stream.v7.n, longFunction, (byte) 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.OptionalLong max() {
        return reduce(new j$.util.stream.r0((byte) 23));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.OptionalLong min() {
        return reduce(new j$.util.stream.r0((byte) 25));
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 o(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.B(aVar, spliterator, z);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream peek(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        return new j$.util.stream.w1(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final boolean r() {
        return ((java.lang.Boolean) m(j$.util.stream.n4.O(j$.util.stream.h2.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, java.util.function.LongBinaryOperator longBinaryOperator) {
        j$.util.Objects.requireNonNull(longBinaryOperator);
        return ((java.lang.Long) m(new j$.util.stream.o4(j$.util.stream.w7.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean s() {
        return ((java.lang.Boolean) m(j$.util.stream.n4.O(j$.util.stream.h2.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream skip(long j) {
        if (j >= 0) {
            return j != 0 ? j$.util.stream.q6.f(this, j, -1L) : this;
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream sorted() {
        return new j$.util.stream.a7(this, j$.util.stream.v7.q | j$.util.stream.v7.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.Spliterator<java.lang.Long> spliterator() {
        j$.util.Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.Spliterator.OfLong) {
            return (j$.util.Spliterator.OfLong) spliterator;
        }
        if (!j$.util.stream.l9.a) {
            throw new java.lang.UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        j$.util.stream.l9.a(j$.util.stream.a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new j$.util.stream.r0((byte) 24));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.LongSummaryStatistics summaryStatistics() {
        return (j$.util.LongSummaryStatistics) collect(new j$.desugar.sun.nio.fs.n((byte) 25), new j$.util.stream.r0((byte) 16), new j$.util.stream.r0((byte) 17));
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) j$.util.stream.n4.I((j$.util.stream.s2) n(new j$.util.stream.r0((byte) 18))).b();
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream unordered() {
        return j$.util.stream.v7.ORDERED.p(this.f) ? new j$.util.stream.y(this, j$.util.stream.v7.r, (byte) 4) : this;
    }

    @Override // j$.util.stream.a
    public final boolean v(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        java.util.function.LongConsumer h0Var;
        boolean zT;
        if (!(spliterator instanceof j$.util.Spliterator.OfLong)) {
            if (!j$.util.stream.l9.a) {
                throw new java.lang.UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            j$.util.stream.l9.a(j$.util.stream.a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        j$.util.Spliterator.OfLong ofLong = (j$.util.Spliterator.OfLong) spliterator;
        if (f6Var instanceof java.util.function.LongConsumer) {
            h0Var = (java.util.function.LongConsumer) f6Var;
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(j$.util.stream.a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            j$.util.Objects.requireNonNull(f6Var);
            h0Var = new j$.util.h0(f6Var, (byte) 1);
        }
        do {
            zT = f6Var.t();
            if (zT) {
                break;
            }
        } while (ofLong.tryAdvance(h0Var));
        return zT;
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.stream.LongStream y() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.y(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 3);
    }

    @Override // j$.util.stream.LongStream
    public final boolean z() {
        return ((java.lang.Boolean) m(j$.util.stream.n4.O(j$.util.stream.h2.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.OptionalLong reduce(java.util.function.LongBinaryOperator longBinaryOperator) {
        j$.util.Objects.requireNonNull(longBinaryOperator);
        return (j$.util.OptionalLong) m(new j$.util.stream.q4(j$.util.stream.w7.LONG_VALUE, longBinaryOperator, (byte) 0));
    }
}
