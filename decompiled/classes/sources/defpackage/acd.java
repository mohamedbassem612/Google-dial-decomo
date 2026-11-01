package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class acd implements java.util.Set, defpackage.aoow {
    public final defpackage.adw a;

    public acd(defpackage.adw adwVar) {
        this.a = adwVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        defpackage.a.am();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        defpackage.aooh.f(entry, "element");
        return defpackage.aooh.n(this.a.a(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!defpackage.aooh.n(this.a.a(entry.getKey()), entry.getValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.d();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.aooc.e(new defpackage.acs(this, (defpackage.aoln) null, 1));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return defpackage.anty.al();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.anty.am();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.e;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        return defpackage.aoob.b(this, objArr);
    }

    public final java.lang.String toString() {
        return defpackage.ajsz.cr(this, null, "[", "]", null, 57);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.aoob.a(this);
    }
}
