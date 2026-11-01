package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aify extends defpackage.aifo implements java.util.List, java.util.RandomAccess, j$.util.List {
    private static final long serialVersionUID = -889275714;

    public static defpackage.aift d(int i) {
        defpackage.ahvr.bC(i, "expectedSize");
        return new defpackage.aift(i);
    }

    public static defpackage.aify h(java.lang.Object[] objArr) {
        return i(objArr, objArr.length);
    }

    public static defpackage.aify i(java.lang.Object[] objArr, int i) {
        return i == 0 ? defpackage.aike.a : new defpackage.aike(objArr, i);
    }

    public static defpackage.aify j(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return n((java.util.Collection) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return defpackage.aike.a;
        }
        java.lang.Object next = it.next();
        if (!it.hasNext()) {
            return p(next);
        }
        defpackage.aift aiftVar = new defpackage.aift(4);
        aiftVar.i(next);
        aiftVar.l(it);
        return aiftVar.g();
    }

    public static defpackage.aify n(java.util.Collection collection) {
        if (!(collection instanceof defpackage.aifo)) {
            java.lang.Object[] array = collection.toArray();
            int length = array.length;
            defpackage.ahvr.ay(array, length);
            return i(array, length);
        }
        defpackage.aify aifyVarG = ((defpackage.aifo) collection).g();
        if (!aifyVarG.l()) {
            return aifyVarG;
        }
        java.lang.Object[] array2 = aifyVarG.toArray();
        return i(array2, array2.length);
    }

    public static defpackage.aify o(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return defpackage.aike.a;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        int length = objArr2.length;
        defpackage.ahvr.ay(objArr2, length);
        return i(objArr2, length);
    }

    public static defpackage.aify p(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        defpackage.ahvr.ay(objArr, 1);
        return new defpackage.aike(objArr, 1);
    }

    public static defpackage.aify q(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        defpackage.ahvr.ay(objArr, 2);
        return new defpackage.aike(objArr, 2);
    }

    public static defpackage.aify r(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object[] objArr = {obj, obj2, obj3};
        defpackage.ahvr.ay(objArr, 3);
        return new defpackage.aike(objArr, 3);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    public static defpackage.aify s(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4};
        defpackage.ahvr.ay(objArr, 4);
        return new defpackage.aike(objArr, 4);
    }

    public static defpackage.aify t(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        defpackage.ahvr.ay(objArr, 5);
        return i(objArr, 5);
    }

    public static defpackage.aify u(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        defpackage.ahvr.ay(objArr, 6);
        return new defpackage.aike(objArr, 6);
    }

    public static defpackage.aify v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        java.lang.Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8};
        defpackage.ahvr.ay(objArr, 8);
        return new defpackage.aike(objArr, 8);
    }

    @java.lang.SafeVarargs
    public static defpackage.aify w(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        java.lang.Object[] objArr2 = new java.lang.Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        java.lang.System.arraycopy(objArr, 0, objArr2, 12, length);
        defpackage.ahvr.ay(objArr2, i);
        return new defpackage.aike(objArr2, i);
    }

    public static defpackage.aify x(java.util.Comparator comparator, java.lang.Iterable iterable) {
        comparator.getClass();
        java.lang.Object[] array = defpackage.ahvr.bo(iterable).toArray();
        int length = array.length;
        defpackage.ahvr.ay(array, length);
        java.util.Arrays.sort(array, comparator);
        return i(array, length);
    }

    public defpackage.aify a() {
        return size() > 1 ? new defpackage.aifv(this) : this;
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public defpackage.aify subList(int i, int i2) {
        defpackage.ahvr.bX(i, i2, size());
        int i3 = i2 - i;
        if (i3 != size()) {
            return i3 == 0 ? defpackage.aike.a : new defpackage.aifx(this, i, i3);
        }
        return this;
    }

    @Override // defpackage.aifo
    public int c(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        return defpackage.ahvr.aP(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.aifo
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.-CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final /* synthetic */ void sort(java.util.Comparator comparator) {
        j$.util.List.-CC.$default$sort(this, comparator);
    }

    @Override // defpackage.aifo
    public java.lang.Object writeReplace() {
        return new aifw(toArray());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final defpackage.ailk listIterator(int i) {
        defpackage.ahvr.cm(i, size());
        return isEmpty() ? defpackage.aike.b : new defpackage.aifu(this, i);
    }

    @Override // defpackage.aifo
    @java.lang.Deprecated
    public final defpackage.aify g() {
        return this;
    }
}
