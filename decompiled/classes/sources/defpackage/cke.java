package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cke implements java.util.Map, java.io.Serializable, j$.util.Map, defpackage.aoow {
    private final /* synthetic */ java.util.Map a;

    public cke(defpackage.adw adwVar) {
        this.a = adwVar.b();
    }

    @Override // java.util.Map
    public final void clear() {
        defpackage.a.am();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        return this.a.containsKey((java.lang.String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        return this.a.containsValue((java.util.List) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        return (java.util.List) this.a.get((java.lang.String) obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.an();
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return this.a.values();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.a.an();
    }
}
