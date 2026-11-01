package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class a implements j$.util.stream.BaseStream {
    public final j$.util.stream.a a;
    public final j$.util.stream.a b;
    public final int c;
    public final j$.util.stream.a d;
    public int e;
    public int f;
    public j$.util.Spliterator g;
    public java.util.function.Supplier h;
    public boolean i;
    public final boolean j;
    public java.lang.Runnable k;
    public boolean l;

    public a(j$.util.stream.a aVar, j$.util.stream.a aVar2, int i) {
        if (aVar2.i || !aVar.i || aVar.d != aVar2 || aVar2.b != aVar) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        aVar2.i = true;
        aVar.d = this;
        this.b = aVar;
        this.c = j$.util.stream.v7.h & i;
        this.f = j$.util.stream.v7.h(i, aVar.f);
        this.a = aVar.a;
        this.e = aVar.e + 1;
    }

    public j$.util.stream.w7 E() {
        return j$.util.stream.w7.DOUBLE_VALUE;
    }

    public j$.util.Spliterator F(java.util.function.Supplier supplier) {
        return new j$.util.stream.e8(supplier);
    }

    public j$.util.stream.m2 G(long j, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.D(j);
    }

    public j$.util.stream.u2 H(j$.util.stream.a aVar, j$.util.Spliterator spliterator, java.util.function.IntFunction intFunction) {
        throw new java.lang.UnsupportedOperationException("Parallel evaluation is not supported");
    }

    public j$.util.Spliterator I(j$.util.stream.a aVar, j$.util.Spliterator spliterator) {
        return H(aVar, spliterator, new j$.desugar.sun.nio.fs.n((byte) 14)).spliterator();
    }

    public boolean J() {
        throw new java.lang.UnsupportedOperationException();
    }

    public j$.util.stream.f6 K(int i, j$.util.stream.f6 f6Var) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final j$.util.Spliterator L(int i) {
        int i2;
        int i3;
        j$.util.stream.a aVar = this.a;
        j$.util.Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
        } else {
            java.util.function.Supplier supplier = aVar.h;
            if (supplier == null) {
                throw new java.lang.IllegalStateException("source already consumed or closed");
            }
            spliterator = (j$.util.Spliterator) supplier.get();
            aVar.h = null;
        }
        if (aVar.l && aVar.j) {
            int i4 = 1;
            j$.util.Spliterator spliteratorI = spliterator;
            j$.util.stream.a aVar2 = aVar;
            while (true) {
                aVar2 = aVar2.d;
                if (aVar == this) {
                    break;
                }
                int i5 = aVar2.c;
                if (aVar2.J()) {
                    if (j$.util.stream.v7.SHORT_CIRCUIT.p(i5)) {
                        i5 &= ~j$.util.stream.v7.u;
                    }
                    spliteratorI = aVar2.I(aVar, spliteratorI);
                    if (spliteratorI.hasCharacteristics(64)) {
                        i2 = i5 & (~j$.util.stream.v7.t);
                        i3 = j$.util.stream.v7.s;
                    } else {
                        i2 = i5 & (~j$.util.stream.v7.s);
                        i3 = j$.util.stream.v7.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                aVar2.e = i4;
                aVar2.f = j$.util.stream.v7.h(i5, aVar.f);
                aVar = aVar2;
                i4++;
            }
            spliterator = spliteratorI;
        }
        if (i != 0) {
            this.f = j$.util.stream.v7.h(i, this.f);
        }
        return spliterator;
    }

    public final j$.util.Spliterator M() {
        j$.util.stream.a aVar = this.a;
        if (this != aVar) {
            throw new java.lang.IllegalStateException();
        }
        if (this.i) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        j$.util.Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
            return spliterator;
        }
        java.util.function.Supplier supplier = aVar.h;
        if (supplier == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        j$.util.Spliterator spliterator2 = (j$.util.Spliterator) supplier.get();
        aVar.h = null;
        return spliterator2;
    }

    public j$.util.Spliterator N(j$.util.stream.a aVar, java.util.function.Supplier supplier, boolean z) {
        return new j$.util.stream.l8(aVar, supplier, z);
    }

    public final void O(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        f(spliterator, P((j$.util.stream.f6) j$.util.Objects.requireNonNull(f6Var)));
    }

    public final j$.util.stream.f6 P(j$.util.stream.f6 f6Var) {
        j$.util.Objects.requireNonNull(f6Var);
        while (true) {
            int i = this.e;
            j$.util.stream.a aVar = this.b;
            if (i <= 0) {
                return f6Var;
            }
            f6Var = this.K(aVar.f, f6Var);
            this = aVar;
        }
    }

    public final j$.util.Spliterator Q(j$.util.Spliterator spliterator) {
        return this.e != 0 ? N(this, new j$.desugar.sun.nio.fs.g((byte) 8, spliterator), this.a.l) : spliterator;
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.i = true;
        this.h = null;
        this.g = null;
        j$.util.stream.a aVar = this.a;
        java.lang.Runnable runnable = aVar.k;
        if (runnable != null) {
            aVar.k = null;
            runnable.run();
        }
    }

    public final void f(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        j$.util.Objects.requireNonNull(f6Var);
        if (j$.util.stream.v7.SHORT_CIRCUIT.p(this.f)) {
            i(spliterator, f6Var);
            return;
        }
        f6Var.p(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(f6Var);
        f6Var.end();
    }

    public final boolean i(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        while (this.e > 0) {
            this = this.b;
        }
        f6Var.p(spliterator.getExactSizeIfKnown());
        boolean zV = this.v(spliterator, f6Var);
        f6Var.end();
        return zV;
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.l;
    }

    public final j$.util.stream.u2 j(j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        if (this.a.l) {
            return o(this, spliterator, z, intFunction);
        }
        j$.util.stream.m2 m2VarG = G(q(spliterator), intFunction);
        O(spliterator, m2VarG);
        return m2VarG.build();
    }

    public final java.lang.Object m(j$.util.stream.j9 j9Var) {
        if (this.i) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        return this.a.l ? j9Var.b(this, L(j9Var.c())) : j9Var.a(this, L(j9Var.c()));
    }

    public final j$.util.stream.u2 n(java.util.function.IntFunction intFunction) {
        j$.util.stream.a aVar;
        if (this.i) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        if (!this.a.l || (aVar = this.b) == null || !J()) {
            return j(L(0), true, intFunction);
        }
        this.e = 0;
        return H(aVar, aVar.L(0), intFunction);
    }

    public j$.util.stream.u2 o(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.z(aVar, spliterator, z);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream onClose(java.lang.Runnable runnable) {
        if (this.i) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        j$.util.Objects.requireNonNull(runnable);
        j$.util.stream.a aVar = this.a;
        java.lang.Runnable runnable2 = aVar.k;
        if (runnable2 != null) {
            runnable = new j$.util.stream.f9(runnable2, runnable, (byte) 0);
        }
        aVar.k = runnable;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream parallel() {
        this.a.l = true;
        return this;
    }

    public final long q(j$.util.Spliterator spliterator) {
        if (j$.util.stream.v7.SIZED.p(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.stream.BaseStream sequential() {
        this.a.l = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public j$.util.Spliterator spliterator() {
        if (this.i) {
            throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
        }
        this.i = true;
        j$.util.stream.a aVar = this.a;
        if (this != aVar) {
            return N(this, new j$.desugar.sun.nio.fs.g((byte) 7, this), aVar.l);
        }
        j$.util.Spliterator spliterator = aVar.g;
        if (spliterator != null) {
            aVar.g = null;
            return spliterator;
        }
        java.util.function.Supplier supplier = aVar.h;
        if (supplier == null) {
            throw new java.lang.IllegalStateException("source already consumed or closed");
        }
        aVar.h = null;
        return F(supplier);
    }

    public boolean v(j$.util.Spliterator spliterator, j$.util.stream.f6 f6Var) {
        boolean zT;
        do {
            zT = f6Var.t();
            if (zT) {
                break;
            }
        } while (spliterator.tryAdvance(f6Var));
        return zT;
    }

    public a(j$.util.stream.a aVar, int i) {
        if (!aVar.i) {
            aVar.i = true;
            aVar.d = this;
            this.b = aVar;
            this.c = j$.util.stream.v7.h & i;
            this.f = j$.util.stream.v7.h(i, aVar.f);
            j$.util.stream.a aVar2 = aVar.a;
            this.a = aVar2;
            if (J()) {
                aVar2.j = true;
            }
            this.e = aVar.e + 1;
            return;
        }
        throw new java.lang.IllegalStateException("stream has already been operated upon or closed");
    }

    public a(j$.util.Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = i & j$.util.stream.v7.g;
        this.c = i2;
        this.f = (~(i2 << 1)) & j$.util.stream.v7.l;
        this.e = 0;
        this.l = z;
    }

    public a(java.util.function.Supplier supplier, int i, boolean z) {
        this.b = null;
        this.h = supplier;
        this.a = this;
        int i2 = i & j$.util.stream.v7.g;
        this.c = i2;
        this.f = (~(i2 << 1)) & j$.util.stream.v7.l;
        this.e = 0;
        this.l = z;
    }
}
