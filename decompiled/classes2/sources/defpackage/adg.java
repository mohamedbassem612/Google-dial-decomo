package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class adg implements java.util.List, aooy {
    private final adq a;

    public adg(adq adqVar) {
        this.a = adqVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        this.a.q(obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        adq adqVar = this.a;
        if (i < 0 || i > adqVar.b) {
            adqVar.o(i);
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = adqVar.b + collection.size();
        java.lang.Object[] objArr = adqVar.a;
        if (objArr.length < size) {
            adqVar.n(size, objArr);
        }
        java.lang.Object[] objArr2 = adqVar.a;
        if (i != adqVar.b) {
            ajsz.dd(objArr2, objArr2, collection.size() + i, i, adqVar.b);
        }
        for (java.lang.Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ajsz.bh();
            }
            objArr2[i2 + i] = obj;
            i2 = i3;
        }
        adqVar.b += collection.size();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.l();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.e(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.e(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        adr.a(this, i);
        return this.a.c(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.a.a(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.cfb(this, 0, 1, null);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i;
        adq adqVar = this.a;
        if (obj == null) {
            java.lang.Object[] objArr = adqVar.a;
            i = adqVar.b - 1;
            while (i >= 0) {
                if (objArr[i] != null) {
                    i--;
                }
            }
            return -1;
        }
        java.lang.Object[] objArr2 = adqVar.a;
        i = adqVar.b - 1;
        while (i >= 0) {
            if (!obj.equals(objArr2[i])) {
                i--;
            }
        }
        return -1;
        return i;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.cfb(this, 0, 1, null);
    }

    @Override // java.util.List
    public final /* bridge */ java.lang.Object remove(int i) {
        adr.a(this, i);
        return this.a.h(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        adq adqVar = this.a;
        int i = adqVar.b;
        aooh.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            adqVar.p(it.next());
        }
        return i != adqVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        adq adqVar = this.a;
        int i = adqVar.b;
        java.lang.Object[] objArr = adqVar.a;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(objArr[i2])) {
                adqVar.h(i2);
            }
        }
        return i != adqVar.b;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        adr.a(this, i);
        return this.a.i(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        adr.b(this, i, i2);
        return new defpackage.cfa(this, i, i2, 1);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        aooh.f(objArr, "array");
        return aoob.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        this.a.k(i, obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.cfb(this, i, 1, null);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.p(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return aoob.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        aooh.f(collection, "elements");
        adq adqVar = this.a;
        int i = adqVar.b;
        aooh.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            adqVar.q(it.next());
        }
        return i != adqVar.b;
    }
}
