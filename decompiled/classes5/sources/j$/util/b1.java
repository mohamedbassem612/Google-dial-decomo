package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class b1 implements j$.util.k0, java.util.function.LongConsumer, j$.util.w {
    public boolean a = false;
    public long b;
    public final /* synthetic */ j$.util.Spliterator.OfLong c;

    public b1(j$.util.Spliterator.OfLong ofLong) {
        this.c = ofLong;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ java.util.function.LongConsumer andThen(java.util.function.LongConsumer longConsumer) {
        return j$.util.function.LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.k0, java.util.Iterator, j$.util.w
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            forEachRemaining((java.util.function.LongConsumer) consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        if (j$.util.n1.a) {
            j$.util.n1.a(j$.util.b1.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        forEachRemaining((java.util.function.LongConsumer) new j$.util.h0(consumer, (byte) 0));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((java.util.function.LongConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final java.lang.Long next() {
        if (!j$.util.n1.a) {
            return java.lang.Long.valueOf(nextLong());
        }
        j$.util.n1.a(j$.util.b1.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.k0
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }

    @Override // j$.util.l0
    public final void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        j$.util.Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }
}
