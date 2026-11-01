package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aigf implements java.util.Map, java.io.Serializable, j$.util.Map {
    public static final java.util.Map.Entry[] a = new java.util.Map.Entry[0];
    private static final long serialVersionUID = 912559;

    public static defpackage.aigb g(int i) {
        defpackage.ahvr.bC(i, "expectedSize");
        return new defpackage.aigb(i);
    }

    public static defpackage.aigf h(java.lang.Iterable iterable) {
        defpackage.aigb aigbVar = new defpackage.aigb(iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : 4);
        aigbVar.j(iterable);
        return aigbVar.e(true);
    }

    public static defpackage.aigf i(java.util.Map map) {
        if ((map instanceof defpackage.aigf) && !(map instanceof java.util.SortedMap)) {
            defpackage.aigf aigfVar = (defpackage.aigf) map;
            if (!aigfVar.fr()) {
                return aigfVar;
            }
        }
        return h(map.entrySet());
    }

    public static defpackage.aigf j() {
        return defpackage.aikj.b;
    }

    public static defpackage.aigf k(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ahvr.bB(obj, obj2);
        return defpackage.aikj.a(1, new java.lang.Object[]{obj, obj2}, null);
    }

    public static defpackage.aigf l(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.ahvr.bB(obj, obj2);
        defpackage.ahvr.bB(obj3, obj4);
        return defpackage.aikj.a(2, new java.lang.Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static defpackage.aigf m(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        defpackage.ahvr.bB(obj, obj2);
        defpackage.ahvr.bB(obj3, obj4);
        defpackage.ahvr.bB(obj5, obj6);
        return defpackage.aikj.a(3, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
    }

    public static defpackage.aigf n(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        defpackage.ahvr.bB(obj, obj2);
        defpackage.ahvr.bB(obj3, obj4);
        defpackage.ahvr.bB(obj5, obj6);
        defpackage.ahvr.bB(obj7, obj8);
        return defpackage.aikj.a(4, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8}, null);
    }

    public static defpackage.aigf o(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        defpackage.ahvr.bB(obj, obj2);
        defpackage.ahvr.bB(obj3, obj4);
        defpackage.ahvr.bB(obj5, obj6);
        defpackage.ahvr.bB(obj7, obj8);
        defpackage.ahvr.bB(obj9, obj10);
        return defpackage.aikj.a(5, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10}, null);
    }

    public static defpackage.aigf p(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        return defpackage.aikj.a(6, new java.lang.Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12}, null);
    }

    @java.lang.SafeVarargs
    public static defpackage.aigf q(java.util.Map.Entry... entryArr) {
        return h(java.util.Arrays.asList(entryArr));
    }

    public static j$.util.stream.Collector r() {
        return defpackage.aido.b(new adci(20), new ailg(1));
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.aifo values();

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        return j$.util.Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.aihd entrySet();

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return defpackage.ahvr.aJ(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.aihd keySet();

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    public defpackage.ailj fq() {
        throw null;
    }

    public abstract boolean fr();

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return defpackage.ahvr.al(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        return j$.util.Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    @java.lang.Deprecated
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        j$.util.Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final java.lang.String toString() {
        return defpackage.ahvr.aF(this);
    }

    public java.lang.Object writeReplace() {
        return new aige(this);
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return j$.util.Map.-CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map
    public final /* synthetic */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$remove(this, obj, obj2);
    }
}
