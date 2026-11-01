package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aied extends java.util.AbstractSet implements java.io.Serializable {
    private static final long serialVersionUID = -6187423658046915740L;
    transient java.lang.Object[] a;
    public transient int b;
    private transient java.lang.Object c;
    private transient int[] d;
    private transient int e;

    aied() {
        f(3);
    }

    private final int h() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int i(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object objO = ahus.o(i2);
        if (i4 != 0) {
            ahus.q(objO, i3 & i5, i4 + 1);
        }
        java.lang.Object objJ = j();
        int[] iArrL = l();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM = ahus.m(objJ, i6);
            while (iM != 0) {
                int i7 = iM - 1;
                int i8 = iArrL[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM2 = ahus.m(objO, i10);
                ahus.q(objO, i10, iM);
                iArrL[i7] = (i9 & (~i5)) | (iM2 & i5);
                iM = i8 & i;
            }
        }
        this.c = objO;
        k(i5);
        return i5;
    }

    private final java.lang.Object j() {
        return j$.util.Objects.requireNonNull(this.c);
    }

    private final void k(int i) {
        this.b = (this.b & (-32)) | ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31);
    }

    private final int[] l() {
        return (int[]) j$.util.Objects.requireNonNull(this.d);
    }

    private final java.lang.Object[] m() {
        return (java.lang.Object[]) j$.util.Objects.requireNonNull(this.a);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(a.bj(i, "Invalid size: "));
        }
        f(java.lang.Math.min(i, 256));
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int iMin;
        if (g()) {
            ahvr.bZ(g(), "Arrays already allocated");
            int i = this.b;
            int iN = ahus.n(i);
            this.c = ahus.o(iN);
            k(iN - 1);
            this.d = new int[i];
            this.a = new java.lang.Object[i];
        }
        java.util.Set setD = d();
        if (setD != null) {
            return setD.add(obj);
        }
        int[] iArrL = l();
        java.lang.Object[] objArrM = m();
        int i2 = this.e;
        int i3 = i2 + 1;
        int iBz = ahvr.bz(obj);
        int iH = h();
        int i4 = iBz & iH;
        int iM = ahus.m(j(), i4);
        if (iM != 0) {
            int i5 = ~iH;
            int i6 = iBz & i5;
            int i7 = 0;
            while (true) {
                int i8 = iM - 1;
                int i9 = iArrL[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && j$.util.Objects.equals(obj, objArrM[i8])) {
                    return false;
                }
                int i11 = i9 & iH;
                int i12 = i7 + 1;
                if (i11 == 0) {
                    if (i12 < 9) {
                        if (i3 <= iH) {
                            iArrL[i8] = i10 | (i3 & iH);
                            break;
                        }
                        iH = i(iH, (iH < 32 ? 4 : 2) * (iH + 1), iBz, i2);
                        break;
                    }
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(h() + 1, 1.0f);
                    int iA = a();
                    while (iA >= 0) {
                        linkedHashSet.add(c(iA));
                        iA = b(iA);
                    }
                    this.c = linkedHashSet;
                    this.d = null;
                    this.a = null;
                    e();
                    return linkedHashSet.add(obj);
                }
                iM = i11;
                i7 = i12;
            }
        } else if (i3 > iH) {
            iH = i(iH, (iH < 32 ? 4 : 2) * (iH + 1), iBz, i2);
        } else {
            ahus.q(j(), i4, i3);
        }
        int length = l().length;
        if (i3 > length && (iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.d = java.util.Arrays.copyOf(l(), iMin);
            this.a = java.util.Arrays.copyOf(m(), iMin);
        }
        l()[i2] = iBz & (~iH);
        m()[i2] = obj;
        this.e = i3;
        e();
        return true;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 >= this.e) {
            return -1;
        }
        return i2;
    }

    public final java.lang.Object c(int i) {
        return m()[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (g()) {
            return;
        }
        e();
        java.util.Set setD = d();
        if (setD != null) {
            this.b = aiql.Q(size(), 3, 1073741823);
            setD.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        java.util.Arrays.fill(m(), 0, this.e, (java.lang.Object) null);
        ahus.p(j());
        java.util.Arrays.fill(l(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        if (g()) {
            return false;
        }
        java.util.Set setD = d();
        if (setD != null) {
            return setD.contains(obj);
        }
        int iBz = ahvr.bz(obj);
        int iH = h();
        int iM = ahus.m(j(), iBz & iH);
        if (iM == 0) {
            return false;
        }
        int i = ~iH;
        int i2 = iBz & i;
        do {
            int i3 = iM - 1;
            int i4 = l()[i3];
            if ((i4 & i) == i2 && j$.util.Objects.equals(obj, c(i3))) {
                return true;
            }
            iM = i4 & iH;
        } while (iM != 0);
        return false;
    }

    final java.util.Set d() {
        java.lang.Object obj = this.c;
        if (obj instanceof java.util.Set) {
            return (java.util.Set) obj;
        }
        return null;
    }

    final void e() {
        this.b += 32;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    final void f(int i) {
        ahvr.bN((boolean) ((i ^ (-1)) >>> 31), "Expected size must be >= 0");
        this.b = aiql.Q(i, 1, 1073741823);
    }

    final boolean g() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        java.util.Set setD = d();
        return setD != null ? setD.iterator() : new defpackage.aiec(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int i;
        int i2;
        if (g()) {
            return false;
        }
        java.util.Set setD = d();
        if (setD != null) {
            return setD.remove(obj);
        }
        int iH = h();
        int iL = ahus.l(obj, (java.lang.Object) null, iH, j(), l(), m(), (java.lang.Object[]) null);
        if (iL == -1) {
            return false;
        }
        java.lang.Object objJ = j();
        int[] iArrL = l();
        java.lang.Object[] objArrM = m();
        int size = size();
        int i3 = size - 1;
        if (iL < i3) {
            int i4 = iL + 1;
            java.lang.Object obj2 = objArrM[i3];
            objArrM[iL] = obj2;
            objArrM[i3] = null;
            iArrL[iL] = iArrL[i3];
            iArrL[i3] = 0;
            int iBz = ahvr.bz(obj2) & iH;
            int iM = ahus.m(objJ, iBz);
            if (iM == size) {
                ahus.q(objJ, iBz, i4);
            } else {
                while (true) {
                    i = iM - 1;
                    i2 = iArrL[i];
                    int i5 = i2 & iH;
                    if (i5 == size) {
                        break;
                    }
                    iM = i5;
                }
                iArrL[i] = (i2 & (~iH)) | (i4 & iH);
            }
        } else {
            objArrM[iL] = null;
            iArrL[iL] = 0;
        }
        this.e--;
        e();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Set setD = d();
        return setD != null ? setD.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (g()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        java.util.Set setD = d();
        if (setD != null) {
            return setD.toArray(objArr);
        }
        java.lang.Object[] objArrM = m();
        int i = this.e;
        ahvr.bX(0, i, objArrM.length);
        int length = objArr.length;
        if (length < i) {
            objArr = ahvr.aw(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        java.lang.System.arraycopy(objArrM, 0, objArr, 0, i);
        return objArr;
    }

    public aied(int i) {
        f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        if (g()) {
            return new java.lang.Object[0];
        }
        java.util.Set setD = d();
        return setD != null ? setD.toArray() : java.util.Arrays.copyOf(m(), this.e);
    }
}
