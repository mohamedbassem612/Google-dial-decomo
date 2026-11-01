package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class n4 implements j$.util.stream.j9 {
    public static final j$.util.stream.n3 a = new j$.util.stream.n3();
    public static final j$.util.stream.l3 b = new j$.util.stream.l3();
    public static final j$.util.stream.m3 c = new j$.util.stream.m3();
    public static final j$.util.stream.k3 d = new j$.util.stream.k3();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static j$.util.stream.q2 A(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z) {
        long jQ = aVar.q(spliterator);
        if (jQ < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.q2 q2Var = (j$.util.stream.q2) new j$.util.stream.a3(aVar, spliterator, new j$.util.stream.z2((byte) 1), new j$.util.stream.z2((byte) 2)).invoke();
            return z ? H(q2Var) : q2Var;
        }
        if (jQ >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jQ];
        new j$.util.stream.d4(spliterator, aVar, iArr).invoke();
        return new j$.util.stream.q3(iArr);
    }

    public static j$.util.stream.s2 B(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z) {
        long jQ = aVar.q(spliterator);
        if (jQ < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.s2 s2Var = (j$.util.stream.s2) new j$.util.stream.a3(aVar, spliterator, new j$.util.stream.z2((byte) 3), new j$.util.stream.z2((byte) 4)).invoke();
            return z ? I(s2Var) : s2Var;
        }
        if (jQ >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) jQ];
        new j$.util.stream.e4(spliterator, aVar, jArr).invoke();
        return new j$.util.stream.z3(jArr);
    }

    public static j$.util.stream.w2 C(j$.util.stream.w7 w7Var, j$.util.stream.u2 u2Var, j$.util.stream.u2 u2Var2) {
        int i = j$.util.stream.v2.a[w7Var.ordinal()];
        if (i == 1) {
            return new j$.util.stream.g3(u2Var, u2Var2);
        }
        if (i == 2) {
            return new j$.util.stream.d3((j$.util.stream.q2) u2Var, (j$.util.stream.q2) u2Var2);
        }
        if (i == 3) {
            return new j$.util.stream.e3((j$.util.stream.s2) u2Var, (j$.util.stream.s2) u2Var2);
        }
        if (i == 4) {
            return new j$.util.stream.c3((j$.util.stream.o2) u2Var, (j$.util.stream.o2) u2Var2);
        }
        throw new java.lang.IllegalStateException("Unknown shape ".concat(java.lang.String.valueOf(w7Var)));
    }

    public static j$.util.stream.j2 D(long j) {
        return (j < 0 || j >= 2147483639) ? new j$.util.stream.j3() : new j$.util.stream.i3(j);
    }

    public static j$.util.stream.o3 E(j$.util.stream.w7 w7Var) {
        int i = j$.util.stream.v2.a[w7Var.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new java.lang.IllegalStateException("Unknown shape ".concat(java.lang.String.valueOf(w7Var)));
    }

    public static j$.util.stream.u2 F(j$.util.stream.u2 u2Var, java.util.function.IntFunction intFunction) {
        if (u2Var.l() <= 0) {
            return u2Var;
        }
        long jCount = u2Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jCount);
        new j$.util.stream.l4(u2Var, objArr, (byte) 1).invoke();
        return new j$.util.stream.x2(objArr);
    }

    public static j$.util.stream.o2 G(j$.util.stream.o2 o2Var) {
        if (o2Var.l() <= 0) {
            return o2Var;
        }
        long jCount = o2Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) jCount];
        new j$.util.stream.i4(o2Var, dArr, (byte) 0).invoke();
        return new j$.util.stream.h3(dArr);
    }

    public static j$.util.stream.q2 H(j$.util.stream.q2 q2Var) {
        if (q2Var.l() <= 0) {
            return q2Var;
        }
        long jCount = q2Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) jCount];
        new j$.util.stream.j4(q2Var, iArr, (byte) 0).invoke();
        return new j$.util.stream.q3(iArr);
    }

    public static j$.util.stream.s2 I(j$.util.stream.s2 s2Var) {
        if (s2Var.l() <= 0) {
            return s2Var;
        }
        long jCount = s2Var.count();
        if (jCount >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) jCount];
        new j$.util.stream.k4(s2Var, jArr, (byte) 0).invoke();
        return new j$.util.stream.z3(jArr);
    }

    public static j$.util.stream.l0 J(java.util.function.Function function) {
        j$.util.stream.l0 l0Var = new j$.util.stream.l0();
        l0Var.a = function;
        return l0Var;
    }

    public static j$.util.stream.k2 K(long j) {
        return (j < 0 || j >= 2147483639) ? new j$.util.stream.s3() : new j$.util.stream.r3(j);
    }

    public static j$.util.stream.l2 L(long j) {
        return (j < 0 || j >= 2147483639) ? new j$.util.stream.b4() : new j$.util.stream.a4(j);
    }

    public static j$.nio.file.e0 M(j$.util.stream.h2 h2Var) {
        j$.util.Objects.requireNonNull(null);
        j$.util.Objects.requireNonNull(h2Var);
        return new j$.nio.file.e0(j$.util.stream.w7.DOUBLE_VALUE, h2Var, new j$.util.stream.b2(h2Var, (byte) 1));
    }

    public static j$.nio.file.e0 N(j$.util.stream.h2 h2Var, java.util.function.IntPredicate intPredicate) {
        j$.util.Objects.requireNonNull(intPredicate);
        j$.util.Objects.requireNonNull(h2Var);
        return new j$.nio.file.e0(j$.util.stream.w7.INT_VALUE, h2Var, new j$.nio.file.e0((java.lang.Object) h2Var, (java.lang.Object) intPredicate, (byte) 7));
    }

    public static j$.nio.file.e0 O(j$.util.stream.h2 h2Var) {
        j$.util.Objects.requireNonNull(null);
        j$.util.Objects.requireNonNull(h2Var);
        return new j$.nio.file.e0(j$.util.stream.w7.LONG_VALUE, h2Var, new j$.util.stream.b2(h2Var, (byte) 0));
    }

    public static j$.nio.file.e0 P(j$.util.stream.h2 h2Var, java.util.function.Predicate predicate) {
        j$.util.Objects.requireNonNull(predicate);
        j$.util.Objects.requireNonNull(h2Var);
        return new j$.nio.file.e0(j$.util.stream.w7.REFERENCE, h2Var, new j$.nio.file.e0((java.lang.Object) h2Var, (java.lang.Object) predicate, (byte) 8));
    }

    public static void d() {
        throw new java.lang.IllegalStateException("called wrong accept method");
    }

    public static void e(j$.util.stream.c6 c6Var, java.lang.Double d2) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(c6Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        c6Var.accept(d2.doubleValue());
    }

    public static void g(j$.util.stream.d6 d6Var, java.lang.Integer num) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(d6Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        d6Var.accept(num.intValue());
    }

    public static void i(j$.util.stream.e6 e6Var, java.lang.Long l) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(e6Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        e6Var.accept(l.longValue());
    }

    public static void k() {
        throw new java.lang.IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new java.lang.IllegalStateException("called wrong accept method");
    }

    public static java.lang.Object[] m(j$.util.stream.t2 t2Var, java.util.function.IntFunction intFunction) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(t2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (t2Var.count() >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) t2Var.count());
        t2Var.h(objArr, 0);
        return objArr;
    }

    public static void n(j$.util.stream.o2 o2Var, java.lang.Double[] dArr, int i) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(o2Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) o2Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = java.lang.Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(j$.util.stream.q2 q2Var, java.lang.Integer[] numArr, int i) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(q2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) q2Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = java.lang.Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(j$.util.stream.s2 s2Var, java.lang.Long[] lArr, int i) {
        if (j$.util.stream.l9.a) {
            j$.util.stream.l9.a(s2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) s2Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = java.lang.Long.valueOf(jArr[i2]);
        }
    }

    public static void q(j$.util.stream.o2 o2Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            o2Var.d((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(o2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.p0) o2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(j$.util.stream.q2 q2Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            q2Var.d((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(q2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Spliterator.OfInt) q2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(j$.util.stream.s2 s2Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            s2Var.d((java.util.function.LongConsumer) consumer);
        } else {
            if (j$.util.stream.l9.a) {
                j$.util.stream.l9.a(s2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Spliterator.OfLong) s2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.util.stream.o2 t(j$.util.stream.o2 o2Var, long j, long j2) {
        if (j == 0 && j2 == o2Var.count()) {
            return o2Var;
        }
        long j3 = j2 - j;
        j$.util.p0 p0Var = (j$.util.p0) o2Var.spliterator();
        j$.util.stream.j2 j2VarD = D(j3);
        j2VarD.p(j3);
        java.lang.Object[] objArr = 0;
        for (int i = 0; i < j && p0Var.tryAdvance(new j$.util.stream.n2(objArr == true ? 1 : 0)); i++) {
        }
        if (j2 == o2Var.count()) {
            p0Var.forEachRemaining((java.util.function.DoubleConsumer) j2VarD);
        } else {
            for (int i2 = 0; i2 < j3 && p0Var.tryAdvance((java.util.function.DoubleConsumer) j2VarD); i2++) {
            }
        }
        j2VarD.end();
        return j2VarD.build();
    }

    public static j$.util.stream.q2 u(j$.util.stream.q2 q2Var, long j, long j2) {
        if (j == 0 && j2 == q2Var.count()) {
            return q2Var;
        }
        long j3 = j2 - j;
        j$.util.Spliterator.OfInt ofInt = (j$.util.Spliterator.OfInt) q2Var.spliterator();
        j$.util.stream.k2 k2VarK = K(j3);
        k2VarK.p(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((java.util.function.IntConsumer) new j$.util.stream.p2((byte) 0)); i++) {
        }
        if (j2 == q2Var.count()) {
            ofInt.forEachRemaining((java.util.function.IntConsumer) k2VarK);
        } else {
            for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((java.util.function.IntConsumer) k2VarK); i2++) {
            }
        }
        k2VarK.end();
        return k2VarK.build();
    }

    public static j$.util.stream.s2 v(j$.util.stream.s2 s2Var, long j, long j2) {
        if (j == 0 && j2 == s2Var.count()) {
            return s2Var;
        }
        long j3 = j2 - j;
        j$.util.Spliterator.OfLong ofLong = (j$.util.Spliterator.OfLong) s2Var.spliterator();
        j$.util.stream.l2 l2VarL = L(j3);
        l2VarL.p(j3);
        for (int i = 0; i < j && ofLong.tryAdvance((java.util.function.LongConsumer) new j$.util.stream.r2((byte) 0)); i++) {
        }
        if (j2 == s2Var.count()) {
            ofLong.forEachRemaining((java.util.function.LongConsumer) l2VarL);
        } else {
            for (int i2 = 0; i2 < j3 && ofLong.tryAdvance((java.util.function.LongConsumer) l2VarL); i2++) {
            }
        }
        l2VarL.end();
        return l2VarL.build();
    }

    public static j$.util.stream.u2 w(j$.util.stream.u2 u2Var, long j, long j2, java.util.function.IntFunction intFunction) {
        if (j == 0 && j2 == u2Var.count()) {
            return u2Var;
        }
        j$.util.Spliterator spliterator = u2Var.spliterator();
        long j3 = j2 - j;
        j$.util.stream.m2 m2VarX = x(j3, intFunction);
        m2VarX.p(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new j$.util.stream.r0((byte) 27)); i++) {
        }
        if (j2 == u2Var.count()) {
            spliterator.forEachRemaining(m2VarX);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(m2VarX); i2++) {
            }
        }
        m2VarX.end();
        return m2VarX.build();
    }

    public static j$.util.stream.m2 x(long j, java.util.function.IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new j$.util.stream.h4() : new j$.util.stream.p3(j, intFunction);
    }

    public static j$.util.stream.u2 y(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        long jQ = aVar.q(spliterator);
        if (jQ < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.u2 u2Var = (j$.util.stream.u2) new j$.util.stream.a3(aVar, spliterator, new j$.desugar.sun.nio.fs.g((byte) 10, intFunction), new j$.util.stream.z2((byte) 5)).invoke();
            return z ? F(u2Var, intFunction) : u2Var;
        }
        if (jQ >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) intFunction.apply((int) jQ);
        new j$.util.stream.f4(spliterator, aVar, objArr).invoke();
        return new j$.util.stream.x2(objArr);
    }

    public static j$.util.stream.o2 z(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z) {
        long jQ = aVar.q(spliterator);
        if (jQ < 0 || !spliterator.hasCharacteristics(16384)) {
            j$.util.stream.o2 o2Var = (j$.util.stream.o2) new j$.util.stream.a3(aVar, spliterator, new j$.util.stream.r0((byte) 29), new j$.util.stream.z2((byte) 0)).invoke();
            return z ? G(o2Var) : o2Var;
        }
        if (jQ >= 2147483639) {
            j$.time.g.b("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) jQ];
        new j$.util.stream.c4(spliterator, aVar, dArr).invoke();
        return new j$.util.stream.h3(dArr);
    }

    public abstract j$.util.stream.i5 Q();

    @Override // j$.util.stream.j9
    public java.lang.Object a(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        j$.util.stream.i5 i5VarQ = Q();
        aVar.O(spliterator, i5VarQ);
        return i5VarQ.get();
    }

    @Override // j$.util.stream.j9
    public java.lang.Object b(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return ((j$.util.stream.i5) new j$.util.stream.p5(this, aVar, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.j9
    public int c() {
        return 0;
    }
}
