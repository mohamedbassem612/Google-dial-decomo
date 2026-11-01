package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class aicd extends java.util.AbstractMap {
    final transient java.util.Map a;
    final /* synthetic */ aicr b;

    public aicd(aicr aicrVar, java.util.Map map) {
        j$.util.Objects.requireNonNull(aicrVar);
        this.b = aicrVar;
        this.a = map;
    }

    final java.util.Map.Entry a(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        return new java.util.AbstractMap.SimpleImmutableEntry(key, this.b.e(key, (java.util.Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Map map = this.a;
        aicr aicrVar = this.b;
        if (map == aicrVar.a) {
            aicrVar.q();
        } else {
            ahvr.bc(new defpackage.aicc(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map map = this.a;
        ahvr.ci(map);
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.aicb(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) ahvr.aE(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.e(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.b.p();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        aicr aicrVar = this.b;
        java.util.Collection collectionA = aicrVar.a();
        collectionA.addAll(collection);
        aicrVar.b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.a.toString();
    }
}
