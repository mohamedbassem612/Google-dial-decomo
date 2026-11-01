package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class e0 implements j$.util.g0, j$.util.w {
    public final /* synthetic */ java.util.PrimitiveIterator.OfInt a;

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.PrimitiveIterator.OfInt ofInt = this.a;
        if (obj instanceof j$.util.e0) {
            obj = ((j$.util.e0) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.l0
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.g0, java.util.Iterator
    public final /* synthetic */ java.lang.Integer next() {
        return this.a.next();
    }

    @Override // j$.util.g0
    public final /* synthetic */ int nextInt() {
        return this.a.nextInt();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.a.remove();
    }

    @Override // j$.util.g0, java.util.Iterator, j$.util.w
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.a.forEachRemaining((java.util.function.Consumer<? super java.lang.Integer>) consumer);
    }

    @Override // j$.util.g0
    public final /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
        this.a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return this.a.next();
    }
}
