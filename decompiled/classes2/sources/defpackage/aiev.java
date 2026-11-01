package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class aiev extends aiey implements java.util.Collection {
    protected aiev() {
    }

    @Override // java.util.Collection
    public boolean add(java.lang.Object obj) {
        return c().add(obj);
    }

    @Override // java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        return c().addAll(collection);
    }

    protected abstract java.util.Collection c();

    @Override // java.util.Collection
    public void clear() {
        c().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return c().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return c().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return c().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return c().remove(obj);
    }

    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        return c().removeAll(collection);
    }

    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return c().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return c().size();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return c().toArray();
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return c().toArray(objArr);
    }
}
