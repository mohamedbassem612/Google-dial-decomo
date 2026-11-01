package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aihl extends aigf implements java.util.NavigableMap, j$.util.Map {
    public static final java.util.Comparator b;
    private static final defpackage.aihl e;
    private static final long serialVersionUID = 0;
    public final transient aiko c;
    public final transient aify d;
    private final transient defpackage.aihl f;

    static {
        aiju aijuVar = aiju.a;
        b = aijuVar;
        e = new defpackage.aihl(aiho.G(aijuVar), aike.a, null);
    }

    public aihl(aiko aikoVar, aify aifyVar, defpackage.aihl aihlVar) {
        this.c = aikoVar;
        this.d = aifyVar;
        this.f = aihlVar;
    }

    public static defpackage.aihl a(java.util.Comparator comparator) {
        return aiju.a.equals(comparator) ? e : new defpackage.aihl(aiho.G(comparator), aike.a, null);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static defpackage.aihl t(java.util.Comparator comparator, java.lang.Object obj, java.lang.Object obj2) {
        return new defpackage.aihl(new aiko(aify.p(obj), comparator), aify.p(obj2), null);
    }

    private final defpackage.aihl w(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return a(comparator());
        }
        return new defpackage.aihl(this.c.K(i, i2), this.d.b(i, i2), null);
    }

    public final aifo c() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry ceilingEntry(java.lang.Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object ceilingKey(java.lang.Object obj) {
        return ahvr.aD(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return ((aiho) this.c).a;
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.NavigableSet descendingKeySet() {
        return this.c.z();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ java.util.NavigableMap descendingMap() {
        defpackage.aihl aihlVar = this.f;
        if (aihlVar == null) {
            return isEmpty() ? a(aijz.d(comparator()).a()) : new defpackage.aihl(this.c.z(), this.d.a(), this);
        }
        return aihlVar;
    }

    @Override // java.util.SortedMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aihd entrySet() {
        return isEmpty() ? aikn.a : new defpackage.aihj(this);
    }

    public final /* synthetic */ aihd f() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().g().get(0);
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        return this.c.first();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry floorEntry(java.lang.Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object floorKey(java.lang.Object obj) {
        return ahvr.aD(floorEntry(obj));
    }

    public final boolean fr() {
        return this.c.l() || this.d.l();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f  */
    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        int iBinarySearch;
        aiko aikoVar = this.c;
        if (obj != null) {
            try {
                iBinarySearch = java.util.Collections.binarySearch(aikoVar.d, obj, aikoVar.a);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (java.lang.ClassCastException unused) {
            }
        } else {
            iBinarySearch = -1;
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.d.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry higherEntry(java.lang.Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object higherKey(java.lang.Object obj) {
        return ahvr.aD(higherEntry(obj));
    }

    @Override // java.util.SortedMap, java.util.Map
    public final /* synthetic */ java.util.Set keySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (java.util.Map.Entry) entrySet().g().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        return this.c.last();
    }

    @Override // java.util.NavigableMap
    public final java.util.Map.Entry lowerEntry(java.lang.Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final java.lang.Object lowerKey(java.lang.Object obj) {
        return ahvr.aD(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ java.util.NavigableSet navigableKeySet() {
        return this.c;
    }

    @Override // java.util.NavigableMap
    @java.lang.Deprecated
    public final java.util.Map.Entry pollFirstEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @java.lang.Deprecated
    public final java.util.Map.Entry pollLastEntry() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.aihl headMap(java.lang.Object obj, boolean z) {
        ahvr.ci(obj);
        return w(0, this.c.I(obj, z));
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final defpackage.aihl subMap(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        ahvr.ci(obj);
        ahvr.ci(obj2);
        ahvr.bW(comparator().compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final defpackage.aihl tailMap(java.lang.Object obj, boolean z) {
        ahvr.ci(obj);
        return w(this.c.J(obj, z), size());
    }

    @Override // java.util.SortedMap, java.util.Map
    public final /* synthetic */ java.util.Collection values() {
        return this.d;
    }

    public java.lang.Object writeReplace() {
        return new defpackage.aihk(this);
    }
}
