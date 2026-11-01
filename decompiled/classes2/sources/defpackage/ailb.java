package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ailb extends defpackage.aila implements java.util.SortedSet {
    public ailb(java.util.SortedSet sortedSet, ahyp ahypVar) {
        super(sortedSet, ahypVar);
    }

    @Override // java.util.SortedSet
    public final java.util.Comparator comparator() {
        return ((java.util.SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final java.lang.Object first() {
        return ahvr.aW(this.a.iterator(), this.b);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet headSet(java.lang.Object obj) {
        return new defpackage.ailb(((java.util.SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final java.lang.Object last() {
        java.util.SortedSet sortedSetHeadSet = (java.util.SortedSet) this.a;
        while (true) {
            ahyp ahypVar = this.b;
            java.lang.Object objLast = sortedSetHeadSet.last();
            if (ahypVar.a(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return new defpackage.ailb(((java.util.SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final java.util.SortedSet tailSet(java.lang.Object obj) {
        return new defpackage.ailb(((java.util.SortedSet) this.a).tailSet(obj), this.b);
    }
}
