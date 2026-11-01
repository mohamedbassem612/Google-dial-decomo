package j$.util.stream;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class ka implements j$.util.Spliterator {
    public final j$.util.Spliterator a;
    public final java.util.concurrent.atomic.AtomicBoolean b;
    public boolean c;
    public int d;

    public ka(j$.util.Spliterator spliterator) {
        this.c = true;
        this.a = spliterator;
        this.b = new java.util.concurrent.atomic.AtomicBoolean();
    }

    public final boolean a() {
        return (this.d == 0 && this.b.get()) ? false : true;
    }

    public j$.util.Spliterator b(j$.util.Spliterator spliterator) {
        return new j$.util.stream.ga((j$.util.Spliterator.OfLong) spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public j$.util.Spliterator trySplit() {
        j$.util.Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    public ka(j$.util.Spliterator spliterator, j$.util.stream.ka kaVar) {
        this.c = true;
        this.a = spliterator;
        kaVar.getClass();
        this.b = kaVar.b;
    }
}
