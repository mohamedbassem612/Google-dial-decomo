package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public class i8 implements j$.util.Spliterator {
    public final java.util.function.Supplier a;
    public j$.util.Spliterator b;

    public i8(java.util.function.Supplier supplier) {
        this.a = supplier;
    }

    public final j$.util.Spliterator a() {
        j$.util.Spliterator spliterator = this.b;
        if (spliterator != null) {
            return spliterator;
        }
        j$.util.Spliterator spliterator2 = (j$.util.Spliterator) this.a.get();
        this.b = spliterator2;
        return spliterator2;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return a().characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a().estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        a().forEachRemaining(consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return a().getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return a().getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    public final java.lang.String toString() {
        return j$.desugar.sun.nio.fs.h.b(getClass().getName(), "[", java.lang.String.valueOf(a()), "]");
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        return a().tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        return a().trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.w0 trySplit() {
        return (j$.util.w0) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfInt trySplit() {
        return (j$.util.Spliterator.OfInt) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.Spliterator.OfLong trySplit() {
        return (j$.util.Spliterator.OfLong) trySplit();
    }

    @Override // j$.util.Spliterator
    public final /* bridge */ /* synthetic */ j$.util.p0 trySplit() {
        return (j$.util.p0) trySplit();
    }
}
