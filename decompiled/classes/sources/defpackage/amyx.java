package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amyx implements java.util.Map {
    private final java.util.Map a;

    public amyx(java.util.Map map) {
        this.a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.Class) {
            return this.a.containsKey(((java.lang.Class) obj).getName());
        }
        throw new java.lang.IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        if (obj instanceof java.lang.Class) {
            return this.a.get(((java.lang.Class) obj).getName());
        }
        throw new java.lang.IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return ((defpackage.aikj) this.a).d;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return ((defpackage.aikj) this.a).values();
    }
}
