package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aojw extends defpackage.aojr {
    private static final java.lang.Object[] b = new java.lang.Object[0];
    public int a;
    private int c;
    private java.lang.Object[] d;

    public aojw(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = b;
        } else {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Illegal Capacity: "));
            }
            objArr = new java.lang.Object[i];
        }
        this.d = objArr;
    }

    private final int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        java.lang.Object[] objArr = this.d;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        return objArr.length - 1;
    }

    private final int i(int i) {
        java.lang.Object[] objArr = this.d;
        if (objArr == null) {
            defpackage.aooh.i("<this>");
        }
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    private final int j(int i) {
        return i < 0 ? i + this.d.length : i;
    }

    private final int k(int i) {
        int length = this.d.length;
        return i >= length ? i - length : i;
    }

    private final void l(int i, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.d.length;
        while (i < length && it.hasNext()) {
            this.d[i] = it.next();
            i++;
        }
        int i2 = this.c;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.d[i3] = it.next();
        }
        this.a += collection.size();
    }

    private final void m(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.d;
        int length = objArr.length;
        if (i > length) {
            if (objArr == b) {
                if (i < 10) {
                    i = 10;
                }
                this.d = new java.lang.Object[i];
                return;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[defpackage.ajsz.m0do(length, i)];
            defpackage.ajsz.dd(objArr, objArr2, 0, this.c, length);
            java.lang.Object[] objArr3 = this.d;
            int length2 = objArr3.length;
            int i2 = this.c;
            defpackage.ajsz.dd(objArr3, objArr2, length2 - i2, 0, i2);
            this.c = 0;
            this.d = objArr2;
        }
    }

    private final void n(int i, int i2) {
        java.lang.Object[] objArr = this.d;
        if (i < i2) {
            defpackage.ajsz.dm(objArr, i, i2);
        } else {
            defpackage.ajsz.dm(objArr, i, objArr.length);
            defpackage.ajsz.dm(this.d, 0, i2);
        }
    }

    private final void o() {
        this.modCount++;
    }

    public final java.lang.Object a() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        defpackage.a.ak(i, this.a);
        if (i == this.a) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        m(this.a + 1);
        int iK = k(this.c + i);
        int i2 = this.a;
        if (i < ((i2 + 1) >> 1)) {
            int iH = h(iK);
            int iH2 = h(this.c);
            int i3 = this.c;
            java.lang.Object[] objArr = this.d;
            if (iH >= i3) {
                objArr[iH2] = objArr[i3];
                defpackage.ajsz.dd(objArr, objArr, i3, i3 + 1, iH + 1);
            } else {
                defpackage.ajsz.dd(objArr, objArr, i3 - 1, i3, objArr.length);
                java.lang.Object[] objArr2 = this.d;
                objArr2[objArr2.length - 1] = objArr2[0];
                defpackage.ajsz.dd(objArr2, objArr2, 0, 1, iH + 1);
            }
            this.d[iH] = obj;
            this.c = iH2;
        } else {
            int iK2 = k(this.c + i2);
            java.lang.Object[] objArr3 = this.d;
            if (iK < iK2) {
                defpackage.ajsz.dd(objArr3, objArr3, iK + 1, iK, iK2);
            } else {
                defpackage.ajsz.dd(objArr3, objArr3, 1, 0, iK2);
                java.lang.Object[] objArr4 = this.d;
                int length = objArr4.length - 1;
                objArr4[0] = objArr4[length];
                defpackage.ajsz.dd(objArr4, objArr4, iK + 1, iK, length);
            }
            this.d[iK] = obj;
        }
        this.a++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        defpackage.a.ak(i, this.a);
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.a) {
            return addAll(collection);
        }
        o();
        m(this.a + collection.size());
        int iK = k(this.c + this.a);
        int iK2 = k(this.c + i);
        int size = collection.size();
        if (i < ((this.a + 1) >> 1)) {
            int i2 = this.c;
            int i3 = i2 - size;
            if (iK2 >= i2) {
                java.lang.Object[] objArr = this.d;
                if (i3 >= 0) {
                    defpackage.ajsz.dd(objArr, objArr, i3, i2, iK2);
                } else {
                    int length = objArr.length;
                    i3 += length;
                    int i4 = length - i3;
                    if (i4 >= iK2 - i2) {
                        defpackage.ajsz.dd(objArr, objArr, i3, i2, iK2);
                    } else {
                        defpackage.ajsz.dd(objArr, objArr, i3, i2, i2 + i4);
                        java.lang.Object[] objArr2 = this.d;
                        defpackage.ajsz.dd(objArr2, objArr2, 0, this.c + i4, iK2);
                    }
                }
            } else {
                java.lang.Object[] objArr3 = this.d;
                defpackage.ajsz.dd(objArr3, objArr3, i3, i2, objArr3.length);
                java.lang.Object[] objArr4 = this.d;
                if (size >= iK2) {
                    defpackage.ajsz.dd(objArr4, objArr4, objArr4.length - size, 0, iK2);
                } else {
                    defpackage.ajsz.dd(objArr4, objArr4, objArr4.length - size, 0, size);
                    java.lang.Object[] objArr5 = this.d;
                    defpackage.ajsz.dd(objArr5, objArr5, 0, size, iK2);
                }
            }
            this.c = i3;
            l(j(iK2 - size), collection);
        } else {
            int i5 = iK2 + size;
            java.lang.Object[] objArr6 = this.d;
            if (iK2 < iK) {
                int i6 = size + iK;
                int length2 = objArr6.length;
                if (i6 <= length2) {
                    defpackage.ajsz.dd(objArr6, objArr6, i5, iK2, iK);
                } else if (i5 >= length2) {
                    defpackage.ajsz.dd(objArr6, objArr6, i5 - length2, iK2, iK);
                } else {
                    int i7 = iK - (i6 - length2);
                    defpackage.ajsz.dd(objArr6, objArr6, 0, i7, iK);
                    java.lang.Object[] objArr7 = this.d;
                    defpackage.ajsz.dd(objArr7, objArr7, i5, iK2, i7);
                }
            } else {
                defpackage.ajsz.dd(objArr6, objArr6, size, 0, iK);
                java.lang.Object[] objArr8 = this.d;
                int length3 = objArr8.length;
                if (i5 >= length3) {
                    defpackage.ajsz.dd(objArr8, objArr8, i5 - length3, iK2, length3);
                } else {
                    defpackage.ajsz.dd(objArr8, objArr8, 0, length3 - size, length3);
                    java.lang.Object[] objArr9 = this.d;
                    defpackage.ajsz.dd(objArr9, objArr9, i5, iK2, objArr9.length - size);
                }
            }
            l(iK2, collection);
        }
        return true;
    }

    public final void addFirst(java.lang.Object obj) {
        o();
        m(this.a + 1);
        int iH = h(this.c);
        this.c = iH;
        this.d[iH] = obj;
        this.a++;
    }

    public final void addLast(java.lang.Object obj) {
        o();
        m(this.a + 1);
        this.d[k(this.c + this.a)] = obj;
        this.a++;
    }

    @Override // defpackage.aojr
    public final int b() {
        return this.a;
    }

    public final java.lang.Object c() {
        if (isEmpty()) {
            return null;
        }
        return this.d[this.c];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            n(this.c, k(this.c + this.a));
        }
        this.c = 0;
        this.a = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aojr
    public final java.lang.Object d(int i) {
        defpackage.a.aj(i, this.a);
        if (i == defpackage.ajsz.aZ(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iK = k(this.c + i);
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj = objArr[iK];
        int i2 = this.a >> 1;
        int i3 = this.c;
        if (i < i2) {
            if (iK >= i3) {
                defpackage.ajsz.dd(objArr, objArr, i3 + 1, i3, iK);
            } else {
                defpackage.ajsz.dd(objArr, objArr, 1, 0, iK);
                java.lang.Object[] objArr2 = this.d;
                int length = objArr2.length - 1;
                objArr2[0] = objArr2[length];
                int i4 = this.c;
                defpackage.ajsz.dd(objArr2, objArr2, i4 + 1, i4, length);
            }
            java.lang.Object[] objArr3 = this.d;
            int i5 = this.c;
            objArr3[i5] = null;
            this.c = i(i5);
        } else {
            int iK2 = k(i3 + defpackage.ajsz.aZ(this));
            java.lang.Object[] objArr4 = this.d;
            int i6 = iK + 1;
            if (iK <= iK2) {
                defpackage.ajsz.dd(objArr4, objArr4, iK, i6, iK2 + 1);
            } else {
                defpackage.ajsz.dd(objArr4, objArr4, iK, i6, objArr4.length);
                java.lang.Object[] objArr5 = this.d;
                objArr5[objArr5.length - 1] = objArr5[0];
                defpackage.ajsz.dd(objArr5, objArr5, 0, 1, iK2 + 1);
            }
            this.d[iK2] = null;
        }
        this.a--;
        return obj;
    }

    public final java.lang.Object e() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.d[k(this.c + defpackage.ajsz.aZ(this))];
    }

    public final java.lang.Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.d[k(this.c + (this.a - 1))];
    }

    public final java.lang.Object g() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        defpackage.a.aj(i, this.a);
        return this.d[k(this.c + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i;
        int iK = k(this.c + this.a);
        int length = this.c;
        if (length < iK) {
            while (length < iK) {
                if (defpackage.aooh.n(obj, this.d[length])) {
                    i = this.c;
                    break;
                }
                length++;
            }
            return -1;
        }
        if (!isEmpty() && length >= iK) {
            int length2 = this.d.length;
            while (true) {
                if (length >= length2) {
                    for (int i2 = 0; i2 < iK; i2++) {
                        if (defpackage.aooh.n(obj, this.d[i2])) {
                            length = i2 + this.d.length;
                            i = this.c;
                            break;
                        }
                    }
                } else {
                    if (defpackage.aooh.n(obj, this.d[length])) {
                        i = this.c;
                        break;
                    }
                    length++;
                }
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iCG;
        int i;
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 >= iK) {
            if (isEmpty() || i2 < iK) {
                return -1;
            }
            int i3 = iK - 1;
            while (true) {
                java.lang.Object[] objArr = this.d;
                if (i3 < 0) {
                    iCG = defpackage.ajsz.cG(objArr);
                    int i4 = this.c;
                    if (i4 > iCG) {
                        return -1;
                    }
                    while (!defpackage.aooh.n(obj, this.d[iCG])) {
                        if (iCG == i4) {
                            return -1;
                        }
                        iCG--;
                    }
                } else {
                    if (defpackage.aooh.n(obj, objArr[i3])) {
                        iCG = i3 + this.d.length;
                        i = this.c;
                        break;
                    }
                    i3--;
                }
            }
            return iCG - i;
        }
        iCG = iK - 1;
        if (i2 > iCG) {
            return -1;
        }
        while (!defpackage.aooh.n(obj, this.d[iCG])) {
            if (iCG == i2) {
                return -1;
            }
            iCG--;
        }
        i = this.c;
        return iCG - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        d(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        int iK;
        java.lang.Object[] objArr;
        defpackage.aooh.f(collection, "elements");
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (true) {
                objArr = this.d;
                if (i >= iK2) {
                    break;
                }
                java.lang.Object obj = objArr[i];
                if (collection.contains(obj)) {
                    z = true;
                } else {
                    this.d[iK] = obj;
                    iK++;
                }
                i++;
            }
            defpackage.ajsz.dm(objArr, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                java.lang.Object[] objArr2 = this.d;
                java.lang.Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    z2 = true;
                } else {
                    this.d[i2] = obj2;
                    i2++;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                java.lang.Object[] objArr3 = this.d;
                java.lang.Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    z2 = true;
                } else {
                    this.d[iK] = obj3;
                    iK = i(iK);
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        java.lang.Object[] objArr = this.d;
        int i = this.c;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.c = i(i);
        this.a--;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iK = k(this.c + (this.a - 1));
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj = objArr[iK];
        objArr[iK] = null;
        this.a--;
        return obj;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        defpackage.a.al(i, i2, this.a);
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == this.a) {
                clear();
                return;
            }
            if (i3 == 1) {
                d(i);
                return;
            }
            o();
            int i4 = this.a - i2;
            int i5 = this.c;
            if (i < i4) {
                int iK = k(i5 + (i - 1));
                int iK2 = k(this.c + (i2 - 1));
                while (i > 0) {
                    int i6 = iK + 1;
                    int iMin = java.lang.Math.min(i, java.lang.Math.min(i6, iK2 + 1));
                    java.lang.Object[] objArr = this.d;
                    int i7 = iK2 - iMin;
                    int i8 = iK - iMin;
                    defpackage.ajsz.dd(objArr, objArr, i7 + 1, i8 + 1, i6);
                    iK = j(i8);
                    iK2 = j(i7);
                    i -= iMin;
                }
                int iK3 = k(this.c + i3);
                n(this.c, iK3);
                this.c = iK3;
            } else {
                int iK4 = k(i5 + i2);
                int iK5 = k(this.c + i);
                int i9 = this.a;
                while (true) {
                    i9 -= i2;
                    if (i9 <= 0) {
                        break;
                    }
                    int length = this.d.length;
                    i2 = java.lang.Math.min(i9, java.lang.Math.min(length - iK4, length - iK5));
                    java.lang.Object[] objArr2 = this.d;
                    int i10 = iK4 + i2;
                    defpackage.ajsz.dd(objArr2, objArr2, iK5, iK4, i10);
                    iK4 = k(i10);
                    iK5 = k(iK5 + i2);
                }
                int iK6 = k(this.c + this.a);
                n(j(iK6 - i3), iK6);
            }
            this.a -= i3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        int iK;
        java.lang.Object[] objArr;
        defpackage.aooh.f(collection, "elements");
        boolean z = false;
        if (isEmpty() || this.d.length == 0) {
            return false;
        }
        int iK2 = k(this.c + this.a);
        int i = this.c;
        if (i < iK2) {
            iK = i;
            while (true) {
                objArr = this.d;
                if (i >= iK2) {
                    break;
                }
                java.lang.Object obj = objArr[i];
                if (collection.contains(obj)) {
                    this.d[iK] = obj;
                    iK++;
                } else {
                    z = true;
                }
                i++;
            }
            defpackage.ajsz.dm(objArr, iK, iK2);
        } else {
            int length = this.d.length;
            boolean z2 = false;
            int i2 = i;
            while (i < length) {
                java.lang.Object[] objArr2 = this.d;
                java.lang.Object obj2 = objArr2[i];
                objArr2[i] = null;
                if (collection.contains(obj2)) {
                    this.d[i2] = obj2;
                    i2++;
                } else {
                    z2 = true;
                }
                i++;
            }
            iK = k(i2);
            for (int i3 = 0; i3 < iK2; i3++) {
                java.lang.Object[] objArr3 = this.d;
                java.lang.Object obj3 = objArr3[i3];
                objArr3[i3] = null;
                if (collection.contains(obj3)) {
                    this.d[iK] = obj3;
                    iK = i(iK);
                } else {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (!z) {
            return z;
        }
        o();
        this.a = j(iK - this.c);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.a.aj(i, this.a);
        int iK = k(this.c + i);
        java.lang.Object[] objArr = this.d;
        java.lang.Object obj2 = objArr[iK];
        objArr[iK] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.aooh.f(objArr, "array");
        int length = objArr.length;
        int i = this.a;
        if (length < i) {
            defpackage.aooh.f(objArr, "reference");
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
            defpackage.aooh.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (java.lang.Object[]) objNewInstance;
        }
        int iK = k(this.c + this.a);
        int i2 = this.c;
        if (i2 < iK) {
            defpackage.ajsz.dl(this.d, objArr, i2, iK, 2);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.d;
            defpackage.ajsz.dd(objArr2, objArr, 0, i2, objArr2.length);
            java.lang.Object[] objArr3 = this.d;
            defpackage.ajsz.dd(objArr3, objArr, objArr3.length - this.c, 0, iK);
        }
        defpackage.ajsz.bk(this.a, objArr);
        return objArr;
    }

    public aojw() {
        this.d = b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[this.a]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        if (collection.isEmpty()) {
            return false;
        }
        o();
        m(this.a + collection.size());
        l(k(this.c + this.a), collection);
        return true;
    }
}
