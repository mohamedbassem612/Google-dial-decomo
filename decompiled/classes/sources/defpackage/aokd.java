package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokd implements java.util.Map, java.io.Serializable, j$.util.Map, defpackage.aoow {
    public static final defpackage.aokd a = new defpackage.aokd();
    private static final long serialVersionUID = 8246714829545688274L;

    private aokd() {
    }

    private final java.lang.Object readResolve() {
        return a;
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
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.lang.Void) {
            defpackage.aooh.f((java.lang.Void) obj, "value");
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return defpackage.aoke.a;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return defpackage.aoke.a;
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
        return 0;
    }

    public final java.lang.String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return defpackage.aokc.a;
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
