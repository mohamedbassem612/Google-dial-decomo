package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class c1 implements j$.util.c0, java.util.function.DoubleConsumer, j$.util.w {
    public boolean a = false;
    public double b;
    public final /* synthetic */ j$.util.p0 c;

    public c1(j$.util.p0 p0Var) {
        this.c = p0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.c0, java.util.Iterator, j$.util.w
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            forEachRemaining((java.util.function.DoubleConsumer) consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        if (j$.util.n1.a) {
            j$.util.n1.a(j$.util.c1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        forEachRemaining((java.util.function.DoubleConsumer) new j$.util.z(consumer, (byte) 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((java.util.function.DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final java.lang.Double next() {
        if (!j$.util.n1.a) {
            return java.lang.Double.valueOf(nextDouble());
        }
        j$.util.n1.a(j$.util.c1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.c0
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.l0
    public final void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
        j$.util.Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }
}
