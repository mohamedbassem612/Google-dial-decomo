package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class a1 implements j$.util.g0, java.util.function.IntConsumer, j$.util.w {
    public boolean a = false;
    public int b;
    public final /* synthetic */ j$.util.Spliterator.OfInt c;

    public a1(j$.util.Spliterator.OfInt ofInt) {
        this.c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
        return j$.util.function.IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.g0, java.util.Iterator, j$.util.w
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            forEachRemaining((java.util.function.IntConsumer) consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        if (j$.util.n1.a) {
            j$.util.n1.a(j$.util.a1.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        forEachRemaining((java.util.function.IntConsumer) new j$.util.d0(consumer, (byte) 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((java.util.function.IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final java.lang.Integer next() {
        if (!j$.util.n1.a) {
            return java.lang.Integer.valueOf(nextInt());
        }
        j$.util.n1.a(j$.util.a1.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.g0
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.l0
    public final void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        j$.util.Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }
}
