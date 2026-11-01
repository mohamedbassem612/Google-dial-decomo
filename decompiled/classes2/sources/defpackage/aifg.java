package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aifg extends java.util.AbstractMap implements java.io.Serializable, defpackage.aidh {
    public transient java.lang.Object[] a;
    public transient java.lang.Object[] b;
    public transient int c;
    public transient int d;
    public transient int e;
    public transient int[] f;
    private transient int[] g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int k;
    private transient int[] l;
    private transient java.util.Set m;
    private transient java.util.Set n;
    private transient java.util.Set o;

    public aifg() {
        f();
    }

    private final int i(int i) {
        return i & (this.g.length - 1);
    }

    private final int j(java.lang.Object obj, int i, int[] iArr, int[] iArr2, java.lang.Object[] objArr) {
        int i2 = iArr[i(i)];
        while (i2 != -1) {
            if (j$.util.Objects.equals(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    private final void k(int i, int i2) {
        ahvr.bM(i != -1);
        int i3 = i(i2);
        int[] iArr = this.h;
        int i4 = iArr[i3];
        int[] iArr2 = this.j;
        if (i4 == i) {
            iArr[i3] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i5 = iArr2[i4];
        while (true) {
            int i6 = i4;
            i4 = i5;
            if (i4 == -1) {
                throw new java.lang.AssertionError("Expected to find entry with value ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b[i]))));
            }
            int[] iArr3 = this.j;
            if (i4 == i) {
                iArr3[i6] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i5 = iArr3[i4];
        }
    }

    private final void l(int i, int i2) {
        ahvr.bM(i != -1);
        int i3 = i(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[i3];
        iArr2[i3] = i;
    }

    private final void m(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.k = i;
        } else {
            this.l[i2] = i;
        }
    }

    private static int[] n(int i) {
        int[] iArr = new int[i];
        java.util.Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] o(int[] iArr, int i) {
        int length = iArr.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i);
        java.util.Arrays.fill(iArrCopyOf, length, i, -1);
        return iArrCopyOf;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        f();
        for (int i2 = 0; i2 < i; i2++) {
            g(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        java.util.Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final int a(java.lang.Object obj) {
        return b(obj, ahvr.bz(obj));
    }

    public final int b(java.lang.Object obj, int i) {
        return j(obj, i, this.g, this.i, this.a);
    }

    public final int c(java.lang.Object obj, int i) {
        return j(obj, i, this.h, this.j, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        java.util.Arrays.fill(this.a, 0, this.c, (java.lang.Object) null);
        java.util.Arrays.fill(this.b, 0, this.c, (java.lang.Object) null);
        java.util.Arrays.fill(this.g, -1);
        java.util.Arrays.fill(this.h, -1);
        java.util.Arrays.fill(this.i, 0, this.c, -1);
        java.util.Arrays.fill(this.j, 0, this.c, -1);
        java.util.Arrays.fill(this.l, 0, this.c, -1);
        java.util.Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.k = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return a(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return c(obj, ahvr.bz(obj)) != -1;
    }

    public final void d(int i, int i2, int i3) {
        int i4;
        int[] iArr;
        int i5;
        int[] iArr2;
        boolean z = i != -1;
        ahvr.bM(z);
        ahvr.bM(z);
        int i6 = i(i2);
        int[] iArr3 = this.g;
        int i7 = iArr3[i6];
        int[] iArr4 = this.i;
        if (i7 == i) {
            iArr3[i6] = iArr4[i];
            iArr4[i] = -1;
        } else {
            int i8 = iArr4[i7];
            while (true) {
                int i9 = i7;
                i7 = i8;
                if (i7 == -1) {
                    throw new java.lang.AssertionError("Expected to find entry with key ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.a[i]))));
                }
                int[] iArr5 = this.i;
                if (i7 == i) {
                    iArr5[i9] = iArr5[i];
                    iArr5[i] = -1;
                    break;
                }
                i8 = iArr5[i7];
            }
        }
        k(i, i3);
        m(this.l[i], this.f[i]);
        int i10 = this.c - 1;
        if (i10 != i) {
            int i11 = this.l[i10];
            int i12 = this.f[i10];
            m(i11, i);
            m(i, i12);
            java.lang.Object[] objArr = this.a;
            java.lang.Object obj = objArr[i10];
            java.lang.Object[] objArr2 = this.b;
            java.lang.Object obj2 = objArr2[i10];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int i13 = i(ahvr.bz(obj));
            int[] iArr6 = this.g;
            int i14 = iArr6[i13];
            if (i14 == i10) {
                iArr6[i13] = i;
            } else {
                int i15 = this.i[i14];
                while (true) {
                    i4 = i14;
                    i14 = i15;
                    iArr = this.i;
                    if (i14 == i10) {
                        break;
                    } else {
                        i15 = iArr[i14];
                    }
                }
                iArr[i4] = i;
            }
            int[] iArr7 = this.i;
            iArr7[i] = iArr7[i10];
            iArr7[i10] = -1;
            int i16 = i(ahvr.bz(obj2));
            int[] iArr8 = this.h;
            int i17 = iArr8[i16];
            if (i17 == i10) {
                iArr8[i16] = i;
            } else {
                int i18 = this.j[i17];
                while (true) {
                    i5 = i17;
                    i17 = i18;
                    iArr2 = this.j;
                    if (i17 == i10) {
                        break;
                    } else {
                        i18 = iArr2[i17];
                    }
                }
                iArr2[i5] = i;
            }
            int[] iArr9 = this.j;
            iArr9[i] = iArr9[i10];
            iArr9[i10] = -1;
        }
        java.lang.Object[] objArr3 = this.a;
        int i19 = this.c - 1;
        objArr3[i19] = null;
        this.b[i19] = null;
        this.c = i19;
        this.d++;
    }

    public final void e(int i, int i2) {
        d(i, i2, ahvr.bz(this.b[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        java.util.Set set = this.o;
        if (set != null) {
            return set;
        }
        defpackage.aifb aifbVar = new defpackage.aifb(this);
        this.o = aifbVar;
        return aifbVar;
    }

    final void f() {
        int iBA = ahvr.bA(16);
        this.c = 0;
        this.a = new java.lang.Object[16];
        this.b = new java.lang.Object[16];
        this.g = n(iBA);
        this.h = n(iBA);
        this.i = n(16);
        this.j = n(16);
        this.e = -2;
        this.k = -2;
        this.l = n(16);
        this.f = n(16);
    }

    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2) {
        int iBz = ahvr.bz(obj);
        int iB = b(obj, iBz);
        if (iB != -1) {
            java.lang.Object obj3 = this.b[iB];
            if (j$.util.Objects.equals(obj3, obj2)) {
                return obj2;
            }
            h(iB, obj2);
            return obj3;
        }
        int iBz2 = ahvr.bz(obj2);
        ahvr.bR(c(obj2, iBz2) == -1, "Value already present: %s", obj2);
        int i = this.c + 1;
        int length = this.i.length;
        if (length < i) {
            int iF = aifn.f(length, i);
            this.a = java.util.Arrays.copyOf(this.a, iF);
            this.b = java.util.Arrays.copyOf(this.b, iF);
            this.i = o(this.i, iF);
            this.j = o(this.j, iF);
            this.l = o(this.l, iF);
            this.f = o(this.f, iF);
        }
        if (this.g.length < i) {
            int iBA = ahvr.bA(i);
            this.g = n(iBA);
            this.h = n(iBA);
            for (int i2 = 0; i2 < this.c; i2++) {
                int i3 = i(ahvr.bz(this.a[i2]));
                int[] iArr = this.i;
                int[] iArr2 = this.g;
                iArr[i2] = iArr2[i3];
                iArr2[i3] = i2;
                int i4 = i(ahvr.bz(this.b[i2]));
                int[] iArr3 = this.j;
                int[] iArr4 = this.h;
                iArr3[i2] = iArr4[i4];
                iArr4[i4] = i2;
            }
        }
        java.lang.Object[] objArr = this.a;
        int i5 = this.c;
        objArr[i5] = obj;
        this.b[i5] = obj2;
        ahvr.bM(i5 != -1);
        int i6 = i(iBz);
        int[] iArr5 = this.i;
        int[] iArr6 = this.g;
        iArr5[i5] = iArr6[i6];
        iArr6[i6] = i5;
        l(this.c, iBz2);
        m(this.k, this.c);
        m(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        int iA = a(obj);
        if (iA == -1) {
            return null;
        }
        return this.b[iA];
    }

    public final void h(int i, java.lang.Object obj) {
        ahvr.bM(i != -1);
        int iBz = ahvr.bz(obj);
        if (c(obj, iBz) != -1) {
            throw new java.lang.IllegalArgumentException("Value already present in map: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj))));
        }
        k(i, ahvr.bz(this.b[i]));
        this.b[i] = obj;
        l(i, iBz);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        java.util.Set set = this.m;
        if (set != null) {
            return set;
        }
        defpackage.aifc aifcVar = new defpackage.aifc(this);
        this.m = aifcVar;
        return aifcVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        return g(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        int iBz = ahvr.bz(obj);
        int iB = b(obj, iBz);
        if (iB == -1) {
            return null;
        }
        java.lang.Object obj2 = this.b[iB];
        e(iB, iBz);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        java.util.Set set = this.n;
        if (set != null) {
            return set;
        }
        defpackage.aifd aifdVar = new defpackage.aifd(this);
        this.n = aifdVar;
        return aifdVar;
    }
}
