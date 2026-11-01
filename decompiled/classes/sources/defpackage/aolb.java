package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aolb extends defpackage.aokr {
    private final defpackage.aola a;

    public aolb(defpackage.aola aolaVar) {
        this.a = aolaVar;
    }

    @Override // defpackage.aojt
    public final int a() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        defpackage.aooh.f((java.util.Map.Entry) obj, "element");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aokr
    public final boolean b(java.util.Map.Entry entry) {
        defpackage.aooh.f(entry, "element");
        return this.a.i(entry);
    }

    @Override // defpackage.aokr
    public final boolean c(java.util.Map.Entry entry) {
        defpackage.aooh.f(entry, "element");
        defpackage.aooh.f(entry, "entry");
        defpackage.aola aolaVar = this.a;
        aolaVar.f();
        int iB = aolaVar.b(entry.getKey());
        if (iB >= 0) {
            java.lang.Object[] objArr = aolaVar.c;
            defpackage.aooh.c(objArr);
            if (defpackage.aooh.n(objArr[iB], entry.getValue())) {
                aolaVar.g(iB);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        return this.a.h(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.aokw(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        this.a.f();
        return super.retainAll(collection);
    }
}
