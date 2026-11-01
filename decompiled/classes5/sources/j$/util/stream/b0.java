package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class b0 extends j$.util.stream.a implements j$.util.stream.DoubleStream {
    public final /* synthetic */ byte m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(j$.util.stream.a aVar, int i, byte b) {
        super(aVar, i);
        this.m = b;
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.IntStream A() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.x(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean D() {
        return ((java.lang.Boolean) m(j$.util.stream.n4.M(j$.util.stream.h2.NONE))).booleanValue();
    }

    @Override // j$.util.stream.a
    public final boolean J() {
        switch (this.m) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream a(j$.util.stream.l0 l0Var) {
        j$.util.Objects.requireNonNull(l0Var);
        return new j$.util.stream.v(this, j$.util.stream.v7.p | j$.util.stream.v7.n | j$.util.stream.v7.t, l0Var, (byte) 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.OptionalDouble average() {
        double[] dArr = (double[]) collect(new j$.util.stream.l((byte) 18), new j$.util.stream.l((byte) 19), new j$.util.stream.l((byte) 20));
        if (dArr[2] <= 0.0d) {
            return j$.util.OptionalDouble.c;
        }
        java.util.Set set = j$.util.stream.Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (java.lang.Double.isNaN(d) && java.lang.Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.OptionalDouble(d / dArr[2]);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream b() {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.y6(this, j$.util.stream.la.a, (byte) 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.Stream boxed() {
        return new j$.util.stream.u(this, 0, new j$.util.stream.l((byte) 10), (byte) 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream c() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.a0(this, j$.util.stream.v7.t, (byte) 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.ObjDoubleConsumer objDoubleConsumer, java.util.function.BiConsumer biConsumer) {
        j$.util.Objects.requireNonNull(biConsumer);
        j$.util.stream.t tVar = new j$.util.stream.t(biConsumer, (byte) 0);
        j$.util.Objects.requireNonNull(supplier);
        j$.util.Objects.requireNonNull(objDoubleConsumer);
        j$.util.Objects.requireNonNull(tVar);
        return m(new j$.util.stream.s4(j$.util.stream.w7.DOUBLE_VALUE, tVar, objDoubleConsumer, supplier, (byte) 1));
    }

    @Override // j$.util.stream.DoubleStream
    public final long count() {
        return ((java.lang.Long) m(new j$.util.stream.u4((byte) 1))).longValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream d() {
        int i = j$.util.stream.la.a;
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.y6(this, j$.util.stream.la.b, (byte) 2);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream distinct() {
        return ((j$.util.stream.x5) boxed()).distinct().mapToDouble(new j$.util.stream.l((byte) 11));
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.OptionalDouble findAny() {
        return (j$.util.OptionalDouble) m(j$.util.stream.f0.d);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.OptionalDouble findFirst() {
        return (j$.util.OptionalDouble) m(j$.util.stream.f0.c);
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEach(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        m(new j$.util.stream.m0(doubleConsumer, false));
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEachOrdered(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        m(new j$.util.stream.m0(doubleConsumer, true));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.util.p0, java.lang.Object] */
    @Override // j$.util.stream.BaseStream
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public final java.util.Iterator<java.lang.Double> iterator2() {
        ?? Spliterator = spliterator();
        j$.util.Objects.requireNonNull(Spliterator);
        return new j$.util.c1(Spliterator);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream limit(long j) {
        if (j >= 0) {
            return j$.util.stream.q6.d(this, 0L, j);
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream map(java.util.function.DoubleUnaryOperator doubleUnaryOperator) {
        j$.util.Objects.requireNonNull(doubleUnaryOperator);
        return new j$.util.stream.v(this, j$.util.stream.v7.p | j$.util.stream.v7.n, doubleUnaryOperator, (byte) 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.Stream mapToObj(java.util.function.DoubleFunction doubleFunction) {
        j$.util.Objects.requireNonNull(doubleFunction);
        return new j$.util.stream.u(this, j$.util.stream.v7.p | j$.util.stream.v7.n, doubleFunction, (byte) 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.OptionalDouble max() {
        return reduce(new j$.util.stream.l((byte) 13));
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.OptionalDouble min() {
        return reduce(new j$.util.stream.l((byte) 17));
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean p() {
        return ((java.lang.Boolean) m(j$.util.stream.n4.M(j$.util.stream.h2.ANY))).booleanValue();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.stream.DoubleStream parallel() {
        switch (this.m) {
            case 0:
                this.a.l = true;
                return this;
            default:
                this.a.l = true;
                return this;
        }
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream peek(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        return new j$.util.stream.v(this, doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final double reduce(double d, java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        j$.util.Objects.requireNonNull(doubleBinaryOperator);
        return ((java.lang.Double) m(new j$.util.stream.w4(j$.util.stream.w7.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.stream.DoubleStream sequential() {
        switch (this.m) {
            case 0:
                this.a.l = false;
                return this;
            default:
                this.a.l = false;
                return this;
        }
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream skip(long j) {
        if (j >= 0) {
            return j != 0 ? j$.util.stream.q6.d(this, j, -1L) : this;
        }
        j$.time.g.b(java.lang.Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.DoubleStream sorted() {
        return new j$.util.stream.y6(this, j$.util.stream.v7.q | j$.util.stream.v7.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.Spliterator<java.lang.Double> spliterator() {
        j$.util.Spliterator spliterator = super.spliterator();
        if (spliterator instanceof j$.util.p0) {
            return (j$.util.p0) spliterator;
        }
        if (!j$.util.stream.l9.a) {
            throw new java.lang.UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        j$.util.stream.l9.a(j$.util.stream.a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final double sum() {
        double[] dArr = (double[]) collect(new j$.util.stream.l((byte) 14), new j$.util.stream.l((byte) 15), new j$.util.stream.l((byte) 16));
        java.util.Set set = j$.util.stream.Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (java.lang.Double.isNaN(d) && java.lang.Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.DoubleSummaryStatistics summaryStatistics() {
        return (j$.util.DoubleSummaryStatistics) collect(new j$.desugar.sun.nio.fs.n((byte) 15), new j$.util.stream.l((byte) 21), new j$.util.stream.l((byte) 9));
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean t() {
        return ((java.lang.Boolean) m(j$.util.stream.n4.M(j$.util.stream.h2.ALL))).booleanValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final double[] toArray() {
        return (double[]) j$.util.stream.n4.G((j$.util.stream.o2) n(new j$.util.stream.l((byte) 12))).b();
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.stream.LongStream u() {
        j$.util.Objects.requireNonNull(null);
        return new j$.util.stream.y(this, j$.util.stream.v7.p | j$.util.stream.v7.n, (byte) 0);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream unordered() {
        return j$.util.stream.v7.ORDERED.p(this.f) ? new j$.util.stream.a0(this, j$.util.stream.v7.r, (byte) 0) : this;
    }

    @Override // j$.util.stream.a
    public final boolean v(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        java.util.function.DoubleConsumer zVar;
        boolean zT;
        if (!(spliterator instanceof j$.util.p0)) {
            if (!j$.util.stream.l9.a) {
                throw new java.lang.UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
            }
            j$.util.stream.l9.a(j$.util.stream.a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        j$.util.p0 p0Var = (j$.util.p0) spliterator;
        if (f6Var instanceof java.util.function.DoubleConsumer) {
            zVar = (java.util.function.DoubleConsumer) f6Var;
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(j$.util.stream.a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            j$.util.Objects.requireNonNull(f6Var);
            zVar = new j$.util.z(f6Var, (byte) 1);
        }
        do {
            zT = f6Var.t();
            if (zT) {
                break;
            }
        } while (p0Var.tryAdvance(zVar));
        return zT;
    }

    @Override // j$.util.stream.DoubleStream
    public final j$.util.OptionalDouble reduce(java.util.function.DoubleBinaryOperator doubleBinaryOperator) {
        j$.util.Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.OptionalDouble) m(new j$.util.stream.q4(j$.util.stream.w7.DOUBLE_VALUE, doubleBinaryOperator, (byte) 1));
    }
}
