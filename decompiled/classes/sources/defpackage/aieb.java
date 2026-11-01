package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aieb implements java.util.Map, java.io.Serializable {
    public static final java.lang.Object a = new java.lang.Object();
    private static final long serialVersionUID = -1932773068922399442L;
    transient int[] b;
    transient java.lang.Object[] c;
    transient java.lang.Object[] d;
    public transient int e;
    public transient int f;
    private transient java.lang.Object g;

    public aieb() {
        l(3);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new java.io.InvalidObjectException(defpackage.a.bj(i, "Invalid size: "));
        }
        l(java.lang.Math.min(i, 256));
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int s(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        java.lang.Object objO = ahus.o(i2);
        if (i4 != 0) {
            ahus.q(objO, i3 & i5, i4 + 1);
        }
        java.lang.Object objG = g();
        int[] iArrP = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int iM = ahus.m(objG, i6);
            while (iM != 0) {
                int i7 = iM - 1;
                int i8 = iArrP[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iM2 = ahus.m(objO, i10);
                ahus.q(objO, i10, iM);
                iArrP[i7] = (i9 & (~i5)) | (iM2 & i5);
                iM = i8 & i;
            }
        }
        this.g = objO;
        t(i5);
        return i5;
    }

    private final void t(int i) {
        this.e = (this.e & (-32)) | ((32 - java.lang.Integer.numberOfLeadingZeros(i)) & 31);
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator itI = i();
        while (itI.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) itI.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    final int a() {
        return isEmpty() ? -1 : 0;
    }

    final int b(int i) {
        int i2 = i + 1;
        if (i2 >= this.f) {
            return -1;
        }
        return i2;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.Map
    public final void clear() {
        if (o()) {
            return;
        }
        k();
        java.util.Map mapJ = j();
        if (mapJ != null) {
            this.e = defpackage.aiql.Q(size(), 3, 1073741823);
            mapJ.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        java.util.Arrays.fill(q(), 0, this.f, (java.lang.Object) null);
        java.util.Arrays.fill(r(), 0, this.f, (java.lang.Object) null);
        ahus.p(g());
        java.util.Arrays.fill(p(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.util.Map mapJ = j();
        if (mapJ != null) {
            return mapJ.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (j$.util.Objects.equals(obj, h(i))) {
                return true;
            }
        }
        return false;
    }

    public final int d(java.lang.Object obj) {
        if (o()) {
            return -1;
        }
        int iBz = defpackage.ahvr.bz(obj);
        int iC = c();
        int iM = ahus.m(g(), iBz & iC);
        if (iM == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iBz & i;
        do {
            int i3 = iM - 1;
            int i4 = p()[i3];
            if ((i4 & i) == i2 && j$.util.Objects.equals(obj, e(i3))) {
                return i3;
            }
            iM = i4 & iC;
        } while (iM != 0);
        return -1;
    }

    public final java.lang.Object e(int i) {
        return q()[i];
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        return new defpackage.aidw(this);
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return defpackage.ahvr.aJ(this, obj);
    }

    public final java.lang.Object f(java.lang.Object obj) {
        int iC;
        int iL;
        if (o() || (iL = ahus.l(obj, (java.lang.Object) null, (iC = c()), g(), p(), q(), (java.lang.Object[]) null)) == -1) {
            return a;
        }
        java.lang.Object objH = h(iL);
        m(iL, iC);
        this.f--;
        k();
        return objH;
    }

    public final java.lang.Object g() {
        return j$.util.Objects.requireNonNull(this.g);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.util.Map mapJ = j();
        if (mapJ != null) {
            return mapJ.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return h(iD);
    }

    public final java.lang.Object h(int i) {
        return r()[i];
    }

    @Override // java.util.Map
    public final int hashCode() {
        return new defpackage.aidw(this).hashCode();
    }

    final java.util.Iterator i() {
        java.util.Map mapJ = j();
        return mapJ != null ? mapJ.entrySet().iterator() : new defpackage.aidu(this);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    final java.util.Map j() {
        java.lang.Object obj = this.g;
        if (obj instanceof java.util.Map) {
            return (java.util.Map) obj;
        }
        return null;
    }

    final void k() {
        this.e += 32;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        return new aidy(this);
    }

    final void l(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Expected size must be >= 0");
        }
        this.e = defpackage.aiql.Q(i, 1, 1073741823);
    }

    final void m(int i, int i2) {
        java.lang.Object objG = g();
        int[] iArrP = p();
        java.lang.Object[] objArrQ = q();
        java.lang.Object[] objArrR = r();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrQ[i] = null;
            objArrR[i] = null;
            iArrP[i] = 0;
            return;
        }
        int i4 = i + 1;
        java.lang.Object obj = objArrQ[i3];
        objArrQ[i] = obj;
        objArrR[i] = objArrR[i3];
        objArrQ[i3] = null;
        objArrR[i3] = null;
        iArrP[i] = iArrP[i3];
        iArrP[i3] = 0;
        int iBz = defpackage.ahvr.bz(obj) & i2;
        int iM = ahus.m(objG, iBz);
        if (iM == size) {
            ahus.q(objG, iBz, i4);
            return;
        }
        while (true) {
            int i5 = iM - 1;
            int i6 = iArrP[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrP[i5] = (i6 & (~i2)) | (i4 & i2);
                return;
            }
            iM = i7;
        }
    }

    public final void n(int i, java.lang.Object obj) {
        r()[i] = obj;
    }

    final boolean o() {
        return this.g == null;
    }

    public final int[] p() {
        return (int[]) j$.util.Objects.requireNonNull(this.b);
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int i;
        java.lang.Object obj3;
        if (o()) {
            defpackage.ahvr.bZ(o(), "Arrays already allocated");
            int i2 = this.e;
            int iN = ahus.n(i2);
            this.g = ahus.o(iN);
            t(iN - 1);
            this.b = new int[i2];
            this.c = new java.lang.Object[i2];
            this.d = new java.lang.Object[i2];
        }
        java.util.Map mapJ = j();
        if (mapJ != null) {
            return mapJ.put(obj, obj2);
        }
        int[] iArrP = p();
        java.lang.Object[] objArrQ = q();
        java.lang.Object[] objArrR = r();
        int i3 = this.f;
        int i4 = i3 + 1;
        int iBz = defpackage.ahvr.bz(obj);
        int iC = c();
        int i5 = iBz & iC;
        int iM = ahus.m(g(), i5);
        if (iM == 0) {
            if (i4 > iC) {
                iC = s(iC, (iC < 32 ? 4 : 2) * (iC + 1), iBz, i3);
            } else {
                ahus.q(g(), i5, i4);
            }
            obj3 = null;
            i = 1;
        } else {
            int i6 = ~iC;
            int i7 = iBz & i6;
            int i8 = 0;
            while (true) {
                int i9 = iM - 1;
                int i10 = iArrP[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && j$.util.Objects.equals(obj, objArrQ[i9])) {
                    java.lang.Object obj4 = objArrR[i9];
                    objArrR[i9] = obj2;
                    return obj4;
                }
                int i12 = i10 & iC;
                int i13 = i8 + 1;
                if (i12 == 0) {
                    if (i13 < 9) {
                        obj3 = null;
                        if (i4 <= iC) {
                            iArrP[i9] = i11 | (i4 & iC);
                            break;
                        }
                        iC = s(iC, (iC < 32 ? 4 : 2) * (iC + 1), iBz, i3);
                        break;
                    }
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(c() + 1, 1.0f);
                    int iA = a();
                    while (iA >= 0) {
                        linkedHashMap.put(e(iA), h(iA));
                        iA = b(iA);
                    }
                    this.g = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    k();
                    return linkedHashMap.put(obj, obj2);
                }
                iM = i12;
                i8 = i13;
            }
        }
        int length = p().length;
        if (i4 > length) {
            int i14 = i;
            int iMin = java.lang.Math.min(1073741823, (java.lang.Math.max(i14, length >>> 1) + length) | i14);
            if (iMin != length) {
                this.b = java.util.Arrays.copyOf(p(), iMin);
                this.c = java.util.Arrays.copyOf(q(), iMin);
                this.d = java.util.Arrays.copyOf(r(), iMin);
            }
        }
        p()[i3] = iBz & (~iC);
        q()[i3] = obj;
        n(i3, obj2);
        this.f = i4;
        k();
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        for (java.util.Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final java.lang.Object[] q() {
        return (java.lang.Object[]) j$.util.Objects.requireNonNull(this.c);
    }

    public final java.lang.Object[] r() {
        return (java.lang.Object[]) j$.util.Objects.requireNonNull(this.d);
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Map mapJ = j();
        if (mapJ != null) {
            return mapJ.remove(obj);
        }
        java.lang.Object objF = f(obj);
        if (objF == a) {
            return null;
        }
        return objF;
    }

    @Override // java.util.Map
    public final int size() {
        java.util.Map mapJ = j();
        return mapJ != null ? mapJ.size() : this.f;
    }

    public final java.lang.String toString() {
        return defpackage.ahvr.aF(this);
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return new aiea(this);
    }

    public aieb(int i) {
        l(i);
    }
}
