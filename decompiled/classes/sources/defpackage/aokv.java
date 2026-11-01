package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aokv extends defpackage.aojr implements java.util.List, java.util.RandomAccess, java.io.Serializable, defpackage.aooy {
    public static final /* synthetic */ int d = 0;
    private static final defpackage.aokv e;
    public java.lang.Object[] a;
    public int b;
    public boolean c;

    static {
        defpackage.aokv aokvVar = new defpackage.aokv(0);
        aokvVar.c = true;
        e = aokvVar;
    }

    public aokv(int i) {
        this.a = defpackage.ajsz.aC(i);
    }

    private final void j() {
        if (this.c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    private final void k(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i3 > length) {
            if (objArrCopyOf == null) {
                defpackage.aooh.i("<this>");
            }
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, defpackage.ajsz.m0do(length, i3));
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            this.a = objArrCopyOf;
        }
        defpackage.ajsz.dd(objArrCopyOf, objArrCopyOf, i + i2, i, this.b);
        this.b += i2;
    }

    private final void l() {
        this.modCount++;
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (this.c) {
            return new aole(this, 0);
        }
        throw new java.io.NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        j();
        defpackage.a.ak(i, this.b);
        h(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        j();
        defpackage.a.ak(i, this.b);
        int size = collection.size();
        g(i, collection, size);
        return size > 0;
    }

    @Override // defpackage.aojr
    public final int b() {
        return this.b;
    }

    public final int c(int i, int i2, java.util.Collection collection, boolean z) {
        java.lang.Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.a;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            int i6 = i3 + i;
            if (collection.contains(objArr[i6]) == z) {
                java.lang.Object[] objArr2 = this.a;
                objArr2[i + i4] = objArr2[i6];
                i4++;
            }
            i3 = i5;
        }
        int i7 = i2 - i4;
        defpackage.ajsz.dd(objArr, objArr, i + i4, i + i2, this.b);
        java.lang.Object[] objArr3 = this.a;
        int i8 = this.b;
        defpackage.ajsz.aA(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            l();
        }
        this.b -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i(0, this.b);
    }

    @Override // defpackage.aojr
    public final java.lang.Object d(int i) {
        j();
        defpackage.a.aj(i, this.b);
        return e(i);
    }

    public final java.lang.Object e(int i) {
        l();
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj = objArr[i];
        defpackage.ajsz.dd(objArr, objArr, i, i + 1, this.b);
        defpackage.ajsz.az(this.a, this.b - 1);
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (defpackage.ajsz.aB(this.a, 0, this.b, (java.util.List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List f() {
        j();
        this.c = true;
        return this.b <= 0 ? e : this;
    }

    public final void g(int i, java.util.Collection collection, int i2) {
        l();
        k(i, i2);
        java.util.Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        defpackage.a.aj(i, this.b);
        return this.a[i];
    }

    public final void h(int i, java.lang.Object obj) {
        l();
        k(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return defpackage.ajsz.ax(this.a, 0, this.b);
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            l();
        }
        java.lang.Object[] objArr = this.a;
        defpackage.ajsz.dd(objArr, objArr, i, i + i2, this.b);
        java.lang.Object[] objArr2 = this.a;
        int i3 = this.b;
        defpackage.ajsz.aA(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (defpackage.aooh.n(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (defpackage.aooh.n(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.a.ak(i, this.b);
        return new defpackage.aoku(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        j();
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        j();
        return c(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        j();
        return c(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        j();
        defpackage.a.aj(i, this.b);
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.a.al(i, i2, this.b);
        return new aokt(this.a, i, i2 - i, (aokt) null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        int length = objArr.length;
        int i = this.b;
        java.lang.Object[] objArr2 = this.a;
        if (length < i) {
            java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            defpackage.aooh.e(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        defpackage.ajsz.dd(objArr2, objArr, 0, 0, i);
        defpackage.ajsz.bk(this.b, objArr);
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return defpackage.ajsz.ay(this.a, 0, this.b, this);
    }

    public aokv() {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        j();
        h(this.b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        j();
        int size = collection.size();
        g(this.b, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return defpackage.ajsz.cA(this.a, 0, this.b);
    }
}
