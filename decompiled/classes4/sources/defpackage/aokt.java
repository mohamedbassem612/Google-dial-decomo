package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aokt extends aojr implements java.util.List, java.util.RandomAccess, java.io.Serializable, aooy {
    public java.lang.Object[] a;
    public final int b;
    public int c;
    public final aokv d;
    private final defpackage.aokt e;

    public aokt(java.lang.Object[] objArr, int i, int i2, defpackage.aokt aoktVar, aokv aokvVar) {
        aooh.f(objArr, "backing");
        aooh.f(aokvVar, "root");
        this.a = objArr;
        this.b = i;
        this.c = i2;
        this.e = aoktVar;
        this.d = aokvVar;
        int i3 = aokv.d;
        this.modCount = aokvVar.modCount;
    }

    private final int c(int i, int i2, java.util.Collection collection, boolean z) {
        int iC;
        defpackage.aokt aoktVar = this.e;
        if (aoktVar != null) {
            iC = aoktVar.c(i, i2, collection, z);
        } else {
            aokv aokvVar = this.d;
            int i3 = aokv.d;
            iC = aokvVar.c(i, i2, collection, z);
        }
        if (iC > 0) {
            j();
        }
        this.c -= iC;
        return iC;
    }

    private final java.lang.Object e(int i) {
        java.lang.Object objE;
        j();
        defpackage.aokt aoktVar = this.e;
        if (aoktVar != null) {
            objE = aoktVar.e(i);
        } else {
            aokv aokvVar = this.d;
            int i2 = aokv.d;
            objE = aokvVar.e(i);
        }
        this.c--;
        return objE;
    }

    private final void f(int i, java.util.Collection collection, int i2) {
        j();
        defpackage.aokt aoktVar = this.e;
        if (aoktVar != null) {
            aoktVar.f(i, collection, i2);
        } else {
            aokv aokvVar = this.d;
            int i3 = aokv.d;
            aokvVar.g(i, collection, i2);
        }
        aokv aokvVar2 = this.d;
        int i4 = aokv.d;
        this.a = aokvVar2.a;
        this.c += i2;
    }

    private final void g(int i, java.lang.Object obj) {
        j();
        defpackage.aokt aoktVar = this.e;
        if (aoktVar != null) {
            aoktVar.g(i, obj);
        } else {
            aokv aokvVar = this.d;
            int i2 = aokv.d;
            aokvVar.h(i, obj);
        }
        aokv aokvVar2 = this.d;
        int i3 = aokv.d;
        this.a = aokvVar2.a;
        this.c++;
    }

    private final void h() {
        int i = aokv.d;
        if (this.d.modCount != this.modCount) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void i() {
        if (l()) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final void j() {
        this.modCount++;
    }

    private final void k(int i, int i2) {
        if (i2 > 0) {
            j();
        }
        defpackage.aokt aoktVar = this.e;
        if (aoktVar != null) {
            aoktVar.k(i, i2);
        } else {
            aokv aokvVar = this.d;
            int i3 = aokv.d;
            aokvVar.i(i, i2);
        }
        this.c -= i2;
    }

    private final boolean l() {
        int i = aokv.d;
        return this.d.c;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (l()) {
            return new defpackage.aole(this, 0);
        }
        throw new java.io.NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        i();
        h();
        a.ak(i, this.c);
        g(this.b + i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        aooh.f(collection, "elements");
        i();
        h();
        a.ak(i, this.c);
        int size = collection.size();
        f(this.b + i, collection, size);
        return size > 0;
    }

    public final int b() {
        h();
        return this.c;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i();
        h();
        k(this.b, this.c);
    }

    public final java.lang.Object d(int i) {
        i();
        h();
        a.aj(i, this.c);
        return e(this.b + i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (ajsz.aB(this.a, this.b, this.c, (java.util.List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        h();
        a.aj(i, this.c);
        return this.a[this.b + i];
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        h();
        return ajsz.ax(this.a, this.b, this.c);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        h();
        for (int i = 0; i < this.c; i++) {
            if (aooh.n(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        h();
        return this.c == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        h();
        for (int i = this.c - 1; i >= 0; i--) {
            if (aooh.n(this.a[this.b + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        h();
        a.ak(i, this.c);
        return new defpackage.aoks(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        i();
        h();
        return c(this.b, this.c, collection, false) > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        i();
        h();
        return c(this.b, this.c, collection, true) > 0;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        i();
        h();
        a.aj(i, this.c);
        java.lang.Object[] objArr = this.a;
        int i2 = this.b + i;
        java.lang.Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        a.al(i, i2, this.c);
        return new defpackage.aokt(this.a, this.b + i, i2 - i, this, this.d);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        aooh.f(objArr, "array");
        h();
        int length = objArr.length;
        int i = this.c;
        java.lang.Object[] objArr2 = this.a;
        if (length >= i) {
            int i2 = this.b;
            ajsz.dd(objArr2, objArr, 0, i2, i + i2);
            ajsz.bk(this.c, objArr);
            return objArr;
        }
        int i3 = this.b;
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr2, i3, i + i3, objArr.getClass());
        aooh.e(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public final java.lang.String toString() {
        h();
        return ajsz.ay(this.a, this.b, this.c, this);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        i();
        h();
        g(this.b + this.c, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        i();
        h();
        int size = collection.size();
        f(this.b + this.c, collection, size);
        return size > 0;
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        h();
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        return ajsz.cA(objArr, i, this.c + i);
    }
}
