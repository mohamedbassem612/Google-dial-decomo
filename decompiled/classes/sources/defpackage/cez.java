package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class cez implements java.util.List, defpackage.aooy {
    private final defpackage.cfc a;

    public cez(defpackage.cfc cfcVar) {
        this.a = cfcVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        this.a.n(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        defpackage.cfc cfcVar = this.a;
        return cfcVar.k(cfcVar.b, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.g();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.l(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.l(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.cfd.a(this, i);
        return this.a.a[i];
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.b == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new cfb(this, 0, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        defpackage.cfc cfcVar = this.a;
        java.lang.Object[] objArr = cfcVar.a;
        for (int i = cfcVar.b - 1; i >= 0; i--) {
            if (defpackage.aooh.n(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new cfb(this, 0, 0);
    }

    @Override // java.util.List
    public final /* bridge */ java.lang.Object remove(int i) {
        defpackage.cfd.a(this, i);
        return this.a.c(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (!collection.isEmpty()) {
            defpackage.cfc cfcVar = this.a;
            int i = cfcVar.b;
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                cfcVar.m(it.next());
            }
            if (i != cfcVar.b) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.cfc cfcVar = this.a;
        int i = cfcVar.b;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(cfcVar.a[i2])) {
                cfcVar.c(i2);
            }
        }
        return i != cfcVar.b;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.cfd.a(this, i);
        return this.a.d(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.cfd.b(this, i, i2);
        return new cfa(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.aoob.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.aoob.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        this.a.f(i, obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new cfb(this, i, 0);
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        return this.a.k(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.m(obj);
    }
}
