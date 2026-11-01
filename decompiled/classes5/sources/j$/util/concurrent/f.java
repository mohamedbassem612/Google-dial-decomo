package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class f extends j$.util.concurrent.o implements j$.util.Spliterator {
    public final j$.util.concurrent.ConcurrentHashMap i;
    public long j;

    public f(j$.util.concurrent.k[] kVarArr, int i, int i2, int i3, long j, j$.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        consumer.getClass();
        while (true) {
            j$.util.concurrent.k kVarA = a();
            if (kVarA == null) {
                return;
            } else {
                consumer.r(new j$.util.concurrent.j(kVarA.b, kVarA.c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        consumer.getClass();
        j$.util.concurrent.k kVarA = a();
        if (kVarA == null) {
            return false;
        }
        consumer.r(new j$.util.concurrent.j(kVarA.b, kVarA.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final j$.util.Spliterator trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        j$.util.concurrent.k[] kVarArr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new j$.util.concurrent.f(kVarArr, this.h, i3, i2, j, this.i);
    }
}
