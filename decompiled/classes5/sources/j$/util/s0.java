package j$.util;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final /* synthetic */ class s0 implements j$.util.Spliterator.OfLong {
    public final /* synthetic */ java.util.Spliterator.OfLong a;

    public /* synthetic */ s0(java.util.Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ j$.util.Spliterator.OfLong a(java.util.Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof j$.util.t0 ? ((j$.util.t0) ofLong).a : new j$.util.s0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.util.Spliterator.OfLong ofLong = this.a;
        if (obj instanceof j$.util.s0) {
            obj = ((j$.util.s0) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.w0
    public final /* synthetic */ void forEachRemaining(java.lang.Object obj) {
        this.a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.w0
    public final /* synthetic */ boolean tryAdvance(java.lang.Object obj) {
        return this.a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator.OfLong, j$.util.w0, j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        this.a.forEachRemaining((java.util.function.Consumer<? super java.lang.Long>) consumer);
    }

    @Override // j$.util.Spliterator.OfLong
    public final /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
        this.a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.a.tryAdvance((java.util.function.Consumer<? super java.lang.Long>) consumer);
    }

    @Override // j$.util.Spliterator.OfLong
    public final /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
        return this.a.tryAdvance(longConsumer);
    }

    @Override // j$.util.w0, j$.util.Spliterator
    public final /* synthetic */ j$.util.w0 trySplit() {
        return j$.util.u0.a(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ j$.util.Spliterator trySplit() {
        return j$.util.x0.a(this.a.trySplit());
    }
}
