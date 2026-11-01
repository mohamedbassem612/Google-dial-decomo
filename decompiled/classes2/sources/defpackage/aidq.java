package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aidq implements j$.util.Spliterator {
    public j$.util.Spliterator a;
    final j$.util.Spliterator b;
    final java.util.function.Function c;
    int d;
    long e;

    public aidq(j$.util.Spliterator spliterator, j$.util.Spliterator spliterator2, java.util.function.Function function, int i, long j) {
        this.a = spliterator;
        this.b = spliterator2;
        this.c = function;
        this.d = i;
        this.e = j;
    }

    public final int characteristics() {
        return this.d;
    }

    public final long estimateSize() {
        j$.util.Spliterator spliterator = this.a;
        if (spliterator != null) {
            this.e = java.lang.Math.max(this.e, spliterator.estimateSize());
        }
        return java.lang.Math.max(this.e, 0L);
    }

    public final void forEachRemaining(final java.util.function.Consumer consumer) {
        j$.util.Spliterator spliterator = this.a;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            this.a = null;
        }
        this.b.forEachRemaining(new java.util.function.Consumer() { // from class: aidp
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                j$.util.Spliterator spliterator2 = (j$.util.Spliterator) obj;
                if (spliterator2 != null) {
                    spliterator2.forEachRemaining(consumer);
                }
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer2);
            }
        });
        this.e = 0L;
    }

    public final /* synthetic */ java.util.Comparator getComparator() {
        return j$.util.Spliterator.-CC.$default$getComparator(this);
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.Spliterator.-CC.$default$getExactSizeIfKnown(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.Spliterator.-CC.$default$hasCharacteristics(this, i);
    }

    public final boolean tryAdvance(java.util.function.Consumer consumer) {
        do {
            j$.util.Spliterator spliterator = this.a;
            if (spliterator != null && spliterator.tryAdvance(consumer)) {
                long j = this.e;
                if (j != Long.MAX_VALUE) {
                    this.e = j - 1;
                }
                return true;
            }
            this.a = null;
        } while (this.b.tryAdvance(new achb(this, 8)));
        return false;
    }

    public final j$.util.Spliterator trySplit() {
        j$.util.Spliterator aidqVar;
        j$.util.Spliterator spliteratorTrySplit = this.b.trySplit();
        if (spliteratorTrySplit != null) {
            int i = this.d & (-65);
            long jEstimateSize = estimateSize();
            if (jEstimateSize < Long.MAX_VALUE) {
                jEstimateSize /= 2;
                this.e -= jEstimateSize;
                this.d = i;
            }
            aidqVar = new defpackage.aidq(this.a, spliteratorTrySplit, this.c, i, jEstimateSize);
        } else {
            aidqVar = this.a;
            if (aidqVar == null) {
                return null;
            }
        }
        this.a = null;
        return aidqVar;
    }
}
