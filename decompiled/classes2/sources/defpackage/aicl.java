package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class aicl extends aicg implements java.util.SortedSet {
    final /* synthetic */ aicr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicl(aicr aicrVar, java.util.SortedMap sortedMap) {
        super(aicrVar, sortedMap);
        j$.util.Objects.requireNonNull(aicrVar);
        this.c = aicrVar;
    }

    public java.util.SortedMap b() {
        return (java.util.SortedMap) ((aijb) this).d;
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return b().firstKey();
    }

    public java.util.SortedSet headSet(java.lang.Object obj) {
        return new defpackage.aicl(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        return b().lastKey();
    }

    public java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new defpackage.aicl(this.c, b().subMap(obj, obj2));
    }

    public java.util.SortedSet tailSet(java.lang.Object obj) {
        return new defpackage.aicl(this.c, b().tailMap(obj));
    }
}
