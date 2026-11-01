package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class aiew extends aiey implements java.util.Map {
    protected aiew() {
    }

    protected abstract java.util.Map b();

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object obj) {
        return b().containsValue(obj);
    }

    @Override // java.util.Map
    public java.util.Set entrySet() {
        return b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object obj) {
        return obj == this || b().equals(obj);
    }

    @Override // java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.util.Map
    public java.util.Set keySet() {
        return b().keySet();
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        return b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return b().values();
    }
}
