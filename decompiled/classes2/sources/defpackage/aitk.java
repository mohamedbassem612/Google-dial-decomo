package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aitk extends j$.util.Spliterators.AbstractSpliterator {
    final /* synthetic */ java.util.Iterator a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aitk(java.util.Iterator it) {
        super(Long.MAX_VALUE, 0);
        this.a = it;
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
        java.util.Iterator it = this.a;
        boolean zHasNext = it.hasNext();
        if (zHasNext) {
            aa$.ExternalSyntheticApiModelOutline1.m(consumer, it.next());
        }
        return zHasNext;
    }
}
