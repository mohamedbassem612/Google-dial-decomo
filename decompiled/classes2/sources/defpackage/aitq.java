package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aitq extends j$.util.Spliterators.AbstractSpliterator {
    final /* synthetic */ java.util.function.BiFunction a;
    final /* synthetic */ defpackage.aitr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aitq(defpackage.aitr aitrVar, long j, java.util.function.BiFunction biFunction) {
        super(j, 16);
        this.a = biFunction;
        j$.util.Objects.requireNonNull(aitrVar);
        this.b = aitrVar;
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
        defpackage.aitr aitrVar = this.b;
        if (!aitrVar.a()) {
            return false;
        }
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, aa$.ExternalSyntheticApiModelOutline1.m(this.a, aitrVar.a.a, aitrVar.b.a));
        return true;
    }
}
