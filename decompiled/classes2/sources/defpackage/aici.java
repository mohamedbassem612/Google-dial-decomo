package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aici extends defpackage.aicl implements java.util.NavigableSet {
    final /* synthetic */ aicr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aici(aicr aicrVar, java.util.NavigableMap navigableMap) {
        super(aicrVar, navigableMap);
        j$.util.Objects.requireNonNull(aicrVar);
        this.b = aicrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aicl
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap b() {
        return (java.util.NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet descendingSet() {
        return new defpackage.aici(this.b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet headSet(java.lang.Object obj, boolean z) {
        return new defpackage.aici(this.b, b().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        return b().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollFirst() {
        return ahvr.ba(iterator());
    }

    @Override // java.util.NavigableSet
    public final java.lang.Object pollLast() {
        return ahvr.ba(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new defpackage.aici(this.b, b().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final java.util.NavigableSet tailSet(java.lang.Object obj, boolean z) {
        return new defpackage.aici(this.b, b().tailMap(obj, z));
    }

    @Override // defpackage.aicl, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // defpackage.aicl, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.aicl, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }
}
