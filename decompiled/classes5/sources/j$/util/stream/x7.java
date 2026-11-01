package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class x7 implements j$.util.Spliterator {
    public final boolean a;
    public final j$.util.stream.a b;
    public java.util.function.Supplier c;
    public j$.util.Spliterator d;
    public j$.util.stream.f6 e;
    public java.util.function.BooleanSupplier f;
    public long g;
    public j$.util.stream.c h;
    public boolean i;

    public x7(j$.util.stream.a aVar, java.util.function.Supplier supplier, boolean z) {
        this.b = aVar;
        this.c = supplier;
        this.d = null;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    public final boolean a() {
        j$.util.stream.c cVar = this.h;
        if (cVar == null) {
            if (this.i) {
                return false;
            }
            c();
            d();
            this.g = 0L;
            this.e.p(this.d.getExactSizeIfKnown());
            return b();
        }
        long j = this.g + 1;
        this.g = j;
        int i = (j > cVar.count() ? 1 : (j == cVar.count() ? 0 : -1));
        ?? r3 = i >>> 31;
        if (i < 0) {
            return r3;
        }
        this.g = 0L;
        this.h.clear();
        return b();
    }

    public final boolean b() {
        while (this.h.count() == 0) {
            if (this.e.t() || !this.f.getAsBoolean()) {
                if (this.i) {
                    return false;
                }
                this.e.end();
                this.i = true;
            }
        }
        return true;
    }

    public final void c() {
        if (this.d == null) {
            this.d = (j$.util.Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int i = this.b.f;
        int i2 = ((~i) >> 1) & j$.util.stream.v7.j & i & j$.util.stream.v7.f;
        return (i2 & 64) != 0 ? (i2 & (-16449)) | (this.d.characteristics() & 16448) : i2;
    }

    public void d() {
        j$.util.stream.j7 j7Var = new j$.util.stream.j7();
        this.h = j7Var;
        j$.util.Objects.requireNonNull(j7Var);
        this.e = this.b.P(new j$.util.stream.k8(j7Var, (byte) 1));
        this.f = new j$.desugar.sun.nio.fs.g((byte) 14, this);
    }

    public j$.util.stream.x7 e(j$.util.Spliterator spliterator) {
        return new j$.util.stream.l8(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (j$.util.Spliterator.CC.$default$hasCharacteristics(this, 4)) {
            return null;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (j$.util.stream.v7.SIZED.p(this.b.f)) {
            return this.d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s[%s]", getClass().getName(), this.d);
    }

    @Override // j$.util.Spliterator
    public j$.util.Spliterator trySplit() {
        if (!this.a || this.h != null || this.i) {
            return null;
        }
        c();
        j$.util.Spliterator spliteratorTrySplit = this.d.trySplit();
        if (spliteratorTrySplit != null) {
            return e(spliteratorTrySplit);
        }
        return null;
    }

    public x7(j$.util.stream.a aVar, j$.util.Spliterator spliterator, boolean z) {
        this.b = aVar;
        this.c = null;
        this.d = spliterator;
        this.a = z;
    }
}
