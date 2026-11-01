package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aojp implements java.util.Map, j$.util.Map, defpackage.aoow {
    protected aojp() {
    }

    private final java.util.Map.Entry a(java.lang.Object obj) {
        java.lang.Object next;
        java.util.Iterator it = f().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (defpackage.aooh.n(((java.util.Map.Entry) next).getKey(), obj)) {
                return (java.util.Map.Entry) next;
            }
        }
        next = null;
        return (java.util.Map.Entry) next;
    }

    public int b() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        defpackage.a.am();
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return a(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        java.util.Set setF = f();
        if (setF.isEmpty()) {
            return false;
        }
        java.util.Iterator it = setF.iterator();
        while (it.hasNext()) {
            if (defpackage.aooh.n(((java.util.Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public java.util.Collection e() {
        throw null;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return f();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (b() == map.size()) {
                java.util.Set<java.util.Map.Entry> setEntrySet = map.entrySet();
                if ((setEntrySet instanceof java.util.Collection) && setEntrySet.isEmpty()) {
                    return true;
                }
                for (java.util.Map.Entry entry : setEntrySet) {
                    if (entry != null) {
                        java.lang.Object key = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        java.lang.Object obj2 = get(key);
                        if (!defpackage.aooh.n(value, obj2) || (obj2 == null && !containsKey(key))) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public abstract java.util.Set f();

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    public java.util.Set g() {
        throw null;
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        java.util.Map.Entry entryA = a(obj);
        if (entryA != null) {
            return entryA.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return f().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final java.lang.String j(java.lang.Object obj) {
        return obj == this ? "(this Map)" : java.lang.String.valueOf(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return g();
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return b();
    }

    public final java.lang.String toString() {
        return defpackage.ajsz.cr(f(), ", ", "{", "}", new agkc(this, 15), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return e();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.an();
    }
}
