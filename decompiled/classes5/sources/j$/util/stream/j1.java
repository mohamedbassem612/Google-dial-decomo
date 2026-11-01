package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j1 extends j$.util.stream.x5 {
    public static long o;
    public final j$.util.stream.a1 m;
    public static final j$.sun.misc.a n = j$.sun.misc.a.b;
    public static final int p = ((j$.util.stream.v7.p | j$.util.stream.v7.n) | j$.util.stream.v7.t) | j$.util.stream.v7.u;

    /* JADX WARN: Illegal instructions before constructor call */
    public j1(j$.util.stream.c1 c1Var, j$.util.stream.j1 j1Var) {
        j$.util.stream.a aVar = j1Var.b;
        j$.util.stream.a1 a1Var = (j$.util.stream.a1) c1Var;
        a1Var.f();
        super(aVar, j1Var, p);
        this.m = a1Var;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        return (j$.util.stream.u2) R(this.b.Q(spliterator), true, this.m, new j$.util.stream.r0((byte) 1), new j$.util.stream.r0((byte) 2), new j$.util.stream.r0((byte) 3), new j$.util.stream.r0((byte) 4));
    }

    @Override // j$.util.stream.a
    public final j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return H(null, spliterator, null).spliterator();
    }

    @Override // j$.util.stream.a
    public final boolean J() {
        return true;
    }

    @Override // j$.util.stream.a
    public final j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        return new j$.util.stream.g1(this.m, f6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object R(j$.util.Spliterator spliterator, boolean z, j$.util.stream.c1 c1Var, java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BinaryOperator binaryOperator, java.util.function.Function function) {
        j$.util.stream.a1 a1Var = (j$.util.stream.a1) c1Var;
        java.util.function.Supplier supplierE = a1Var.e();
        j$.util.stream.z0 z0VarF = a1Var.f();
        if (!z) {
            j$.util.stream.f1 f1Var = new j$.util.stream.f1(supplierE, supplier, biConsumer, z0VarF, a1Var, function);
            f1Var.a(spliterator);
            return f1Var.b();
        }
        java.util.function.BinaryOperator binaryOperatorB = a1Var.b();
        j$.util.stream.k1 k1Var = j$.util.stream.k1.DEFAULT;
        k1Var.getClass();
        return binaryOperatorB != k1Var ? ((j$.util.stream.f1) new j$.util.stream.e1(this, spliterator, function, a1Var, z0VarF, biConsumer, supplier, supplierE, binaryOperatorB, binaryOperator).join()).b() : ((j$.util.stream.f1) new j$.util.stream.d1(this, spliterator, function, a1Var, z0VarF, biConsumer, supplier, supplierE).join()).b();
    }

    @Override // j$.util.stream.x5, j$.util.stream.Stream
    public final java.lang.Object collect(j$.util.stream.Collector collector) {
        if (this.i) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        boolean z = this.a.l;
        j$.util.stream.a aVar = this.b;
        return R(aVar.Q(aVar.L(0)), z, this.m, collector.supplier(), collector.accumulator(), z ? collector.combiner() : null, collector.characteristics().contains(j$.util.stream.Collector.Characteristics.IDENTITY_FINISH) ? null : collector.finisher());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(j$.util.stream.x5 x5Var, j$.util.stream.c1 c1Var) {
        super(x5Var, p);
        j$.util.stream.a1 a1Var = (j$.util.stream.a1) c1Var;
        a1Var.f();
        this.m = a1Var;
    }

    @Override // j$.util.stream.x5, j$.util.stream.Stream
    public final java.lang.Object collect(java.util.function.Supplier supplier, java.util.function.BiConsumer biConsumer, java.util.function.BiConsumer biConsumer2) {
        if (!this.i) {
            this.i = true;
            boolean z = this.a.l;
            j$.util.stream.a aVar = this.b;
            return R(aVar.Q(aVar.L(0)), z, this.m, supplier, biConsumer, z ? new j$.util.stream.t(biConsumer2, (byte) 1) : null, null);
        }
        throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
    }
}
