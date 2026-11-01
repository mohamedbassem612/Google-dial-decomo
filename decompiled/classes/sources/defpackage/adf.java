package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class adf implements java.util.Map, j$.util.Map, defpackage.aoow {
    private final defpackage.adw a;
    private defpackage.acd b;
    private act c;
    private aeh d;

    public adf(defpackage.adw adwVar) {
        this.a = adwVar;
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
    public final boolean containsKey(java.lang.Object obj) {
        return defpackage.adw.f(this.a, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.a.c(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        defpackage.acd acdVar = this.b;
        if (acdVar != null) {
            return acdVar;
        }
        defpackage.acd acdVar2 = new defpackage.acd(this.a);
        this.b = acdVar2;
        return acdVar2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adf) {
            return defpackage.aooh.n(this.a, ((defpackage.adf) obj).a);
        }
        if (obj instanceof java.util.Map) {
            defpackage.adw adwVar = this.a;
            java.util.Map map = (java.util.Map) obj;
            if (adwVar.e == map.size()) {
                java.lang.Object[] objArr = adwVar.b;
                java.lang.Object[] objArr2 = adwVar.c;
                long[] jArr = adwVar.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return true;
                }
                int i = 0;
                loop0: while (true) {
                    long j = ~jArr[i];
                    long j2 = -9187201950435737472L;
                    while (true) {
                        j &= j2;
                        if (j != 0) {
                            int iNumberOfTrailingZeros = (i << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                            java.lang.Object obj2 = objArr[iNumberOfTrailingZeros];
                            java.lang.Object obj3 = objArr2[iNumberOfTrailingZeros];
                            if (obj3 != null) {
                                if (!defpackage.aooh.n(obj3, map.get(obj2))) {
                                    break loop0;
                                }
                                j2 = (-1) + j;
                            } else {
                                if (map.get(obj2) != null || !map.containsKey(obj2)) {
                                    break loop0;
                                }
                                j2 = (-1) + j;
                            }
                        }
                    }
                    if (i == length) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        j$.util.Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return j$.util.Map.-CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.d();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        act actVar = this.c;
        if (actVar != null) {
            return actVar;
        }
        act actVar2 = new act(this.a);
        this.c = actVar2;
        return actVar2;
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
        return this.a.e;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        aeh aehVar = this.d;
        if (aehVar != null) {
            return aehVar;
        }
        aeh aehVar2 = new aeh(this.a);
        this.d = aehVar2;
        return aehVar2;
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
