package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class zlv extends java.util.LinkedHashMap implements j$.util.Map {
    public zlv() {
        super(3, 0.75f, false);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj == null || (obj instanceof java.lang.String)) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj == null || aoov.c(obj)) {
            return super.containsValue((java.util.List) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        if (obj == null || (obj instanceof java.lang.String)) {
            return (java.util.List) super.get((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return obj instanceof java.lang.String ? (java.util.List) j$.util.Map.-CC.$default$getOrDefault(this, (java.lang.String) obj, (java.util.List) obj2) : obj2;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj == null || (obj instanceof java.lang.String)) && (obj2 == null || aoov.c(obj2))) {
            return j$.util.Map.-CC.$default$remove(this, (java.lang.String) obj, (java.util.List) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        aooh.f(entry, "eldest");
        return super.size() > 3;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        if (obj == null || (obj instanceof java.lang.String)) {
            return (java.util.List) super.remove((java.lang.String) obj);
        }
        return null;
    }
}
