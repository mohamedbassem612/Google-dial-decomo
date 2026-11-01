package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aich extends defpackage.aick implements java.util.NavigableMap {
    final /* synthetic */ aicr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aich(aicr aicrVar, java.util.NavigableMap navigableMap) {
        super(aicrVar, navigableMap);
        j$.util.Objects.requireNonNull(aicrVar);
        this.c = aicrVar;
    }

    final java.util.Map.Entry b(java.util.Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
        aicr aicrVar = this.c;
        java.util.Collection collectionA = aicrVar.a();
        collectionA.addAll((java.util.Collection) entry.getValue());
        it.remove();
        return new java.util.AbstractMap.SimpleImmutableEntry(entry.getKey(), aicrVar.d(collectionA));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.aick
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap e() {
        return (java.util.NavigableMap) super.e();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        java.util.Map.Entry entryCeilingEntry = e().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return e().ceilingKey(obj);
    }

    @Override // defpackage.aick, defpackage.aicd, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableSet keySet() {
        return new defpackage.aici(this.c, e());
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet descendingKeySet() {
        return ((defpackage.aich) descendingMap()).keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap descendingMap() {
        return new defpackage.aich(this.c, e().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        java.util.Map.Entry entryFirstEntry = e().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        java.util.Map.Entry entryFloorEntry = e().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return e().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap headMap(java.lang.Object obj, boolean z) {
        return new defpackage.aich(this.c, e().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        java.util.Map.Entry entryHigherEntry = e().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return e().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        java.util.Map.Entry entryLastEntry = e().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        java.util.Map.Entry entryLowerEntry = e().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return e().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableSet navigableKeySet() {
        return keySet();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollFirstEntry() {
        return b(new defpackage.aicb(this).iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry pollLastEntry() {
        return b(new defpackage.aicb((defpackage.aicd) descendingMap()).iterator());
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return new defpackage.aich(this.c, e().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final java.util.NavigableMap tailMap(java.lang.Object obj, boolean z) {
        return new defpackage.aich(this.c, e().tailMap(obj, z));
    }

    @Override // defpackage.aick, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // defpackage.aick, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // defpackage.aick, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }
}
