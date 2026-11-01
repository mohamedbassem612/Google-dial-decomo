package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiss implements j$.util.Spliterator {
    final /* synthetic */ java.util.function.Supplier a;
    private boolean b;

    public aiss(java.util.function.Supplier supplier) {
        this.a = supplier;
    }

    public final int characteristics() {
        return 272;
    }

    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        j$.util.Spliterator.-CC.$default$forEachRemaining(this, consumer);
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
        if (this.b) {
            return false;
        }
        java.lang.Object objM = aa$.ExternalSyntheticApiModelOutline1.m(this.a);
        if (objM == null) {
            this.b = true;
            return false;
        }
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, objM);
        return true;
    }

    public final j$.util.Spliterator trySplit() {
        return null;
    }
}
