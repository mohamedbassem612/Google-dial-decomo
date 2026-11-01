package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class y2 implements j$.util.stream.u2 {
    public final java.util.Collection a;

    public y2(java.util.Collection collection) {
        this.a = collection;
    }

    @Override // j$.util.stream.u2
    public final j$.util.stream.u2 a(int i) {
        throw new java.lang.IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.u2
    public final long count() {
        return this.a.size();
    }

    @Override // j$.util.stream.u2
    public final void forEach(java.util.function.Consumer consumer) {
        j$.util.Collection.EL.a(this.a, consumer);
    }

    @Override // j$.util.stream.u2
    public final /* synthetic */ j$.util.stream.u2 g(long j, long j2, java.util.function.IntFunction intFunction) {
        return j$.util.stream.n4.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.u2
    public final void h(java.lang.Object[] objArr, int i) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // j$.util.stream.u2
    public final java.lang.Object[] k(java.util.function.IntFunction intFunction) {
        java.util.Collection collection = this.a;
        return collection.toArray((java.lang.Object[]) intFunction.apply(collection.size()));
    }

    @Override // j$.util.stream.u2
    public final int l() {
        return 0;
    }

    @Override // j$.util.stream.u2
    public final j$.util.Spliterator spliterator() {
        return j$.util.Collection.EL.stream(this.a).spliterator();
    }

    public final java.lang.String toString() {
        java.util.Collection collection = this.a;
        return java.lang.String.format("CollectionNode[%d][%s]", java.lang.Integer.valueOf(collection.size()), collection);
    }
}
