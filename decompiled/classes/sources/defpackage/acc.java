package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acc implements java.util.Collection, java.util.Set, defpackage.aoox, defpackage.aopb {
    public int[] a;
    public java.lang.Object[] b;
    public int c;

    public acc(int i) {
        this.a = defpackage.aei.a;
        this.b = defpackage.aei.c;
        if (i > 0) {
            this.a = new int[i];
            this.b = new java.lang.Object[i];
        }
    }

    public final int a(java.lang.Object obj) {
        return obj == null ? defpackage.den.bG(this, null, 0) : defpackage.den.bG(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i;
        int iBG;
        int i2 = this.c;
        if (obj == null) {
            iBG = defpackage.den.bG(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iBG = defpackage.den.bG(this, obj, iHashCode);
        }
        if (iBG >= 0) {
            return false;
        }
        int i3 = ~iBG;
        int[] iArr = this.a;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            java.lang.Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new java.lang.Object[i4];
            if (i2 != this.c) {
                throw new java.util.ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                defpackage.ajsz.df(iArr, iArr2, 0, length, 6);
                defpackage.ajsz.dl(objArr, this.b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            defpackage.ajsz.db(iArr3, iArr3, i5, i3, i2);
            java.lang.Object[] objArr2 = this.b;
            defpackage.ajsz.dd(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        int size = this.c + collection.size();
        int i = this.c;
        int[] iArr = this.a;
        boolean zAdd = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.b;
            int[] iArr2 = new int[size];
            this.a = iArr2;
            this.b = new java.lang.Object[size];
            if (i > 0) {
                defpackage.ajsz.df(iArr, iArr2, 0, i, 6);
                defpackage.ajsz.dl(objArr, this.b, 0, this.c, 6);
            }
        }
        if (this.c != i) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final java.lang.Object b(int i) {
        return this.b[i];
    }

    public final void c(int i) {
        int i2 = this.c;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.a;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                defpackage.ajsz.db(iArr, iArr, i, i4, i2);
                java.lang.Object[] objArr2 = this.b;
                defpackage.ajsz.dd(objArr2, objArr2, i, i4, i2);
            }
            this.b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.a = iArr2;
            this.b = new java.lang.Object[i5];
            if (i > 0) {
                defpackage.ajsz.df(iArr, iArr2, 0, i, 6);
                defpackage.ajsz.dl(objArr, this.b, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                defpackage.ajsz.db(iArr, this.a, i, i6, i2);
                defpackage.ajsz.dd(objArr, this.b, i, i6, i2);
            }
        }
        if (i2 != this.c) {
            throw new java.util.ConcurrentModificationException();
        }
        this.c = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = defpackage.aei.a;
            this.b = defpackage.aei.c;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof java.util.Set) && this.c == ((java.util.Set) obj).size()) {
            try {
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((java.util.Set) obj).contains(b(i2))) {
                    }
                }
                return true;
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.acb(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iA = a(obj);
        if (iA < 0) {
            return false;
        }
        c(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        java.util.Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        boolean z = false;
        for (int i = this.c - 1; i >= 0; i--) {
            if (!defpackage.ajsz.cj(collection, this.b[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("array");
        }
        int i = this.c;
        int length = objArr.length;
        if (length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        defpackage.ajsz.dd(this.b, objArr, 0, 0, this.c);
        return objArr;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object objB = b(i2);
            if (objB != this) {
                sb.append(objB);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public acc(java.util.Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        return defpackage.ajsz.cA(this.b, 0, this.c);
    }
}
