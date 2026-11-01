package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class aick extends defpackage.aicd implements java.util.SortedMap {
    final /* synthetic */ aicr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aick(aicr aicrVar, java.util.SortedMap sortedMap) {
        super(aicrVar, sortedMap);
        j$.util.Objects.requireNonNull(aicrVar);
        this.d = aicrVar;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return e().comparator();
    }

    public java.util.SortedMap e() {
        return (java.util.SortedMap) this.a;
    }

    @Override // defpackage.aicd, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet keySet() {
        return new defpackage.aicl(this.d, e());
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return e().firstKey();
    }

    public java.util.SortedMap headMap(java.lang.Object obj) {
        return new defpackage.aick(this.d, e().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return e().lastKey();
    }

    public java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return new defpackage.aick(this.d, e().subMap(obj, obj2));
    }

    public java.util.SortedMap tailMap(java.lang.Object obj) {
        return new defpackage.aick(this.d, e().tailMap(obj));
    }
}
