package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class alcb extends java.util.AbstractMap {
    private volatile defpackage.alca d;
    public boolean c = false;
    public java.lang.Object[] a = null;
    public int b = 0;
    private volatile boolean e = true;

    private final void e(int i) {
        int length;
        java.lang.Object[] objArr = this.a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.a = new java.lang.Object[java.lang.Math.max(16, i)];
            return;
        }
        if (i > length) {
            if (!this.e) {
                c();
                if (i <= this.a.length) {
                    return;
                }
            }
            java.lang.Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.a = java.util.Arrays.copyOf(objArr2, i);
        }
    }

    private final synchronized void f() {
        int i;
        if (this.e || (i = this.b) <= 1) {
            return;
        }
        java.util.Arrays.sort(this.a, 0, i);
        java.lang.Object[] objArr = this.a;
        int i2 = this.b;
        defpackage.alac alacVar = ((defpackage.alby) objArr[0]).c;
        int i3 = 1;
        for (int i4 = 1; i4 < i2; i4++) {
            defpackage.alby albyVar = (defpackage.alby) objArr[i4];
            defpackage.alac alacVar2 = albyVar.c;
            if (alacVar.equals(alacVar2)) {
                objArr[i3 - 1] = albyVar;
            } else {
                if (i3 != i4) {
                    objArr[i3] = albyVar;
                }
                i3++;
                alacVar = alacVar2;
            }
        }
        for (int i5 = i3; i5 < i2; i5++) {
            objArr[i5] = null;
        }
        this.b = i3;
        this.e = true;
    }

    private final int g(defpackage.alac alacVar) {
        int i = this.b - 1;
        if (i < 0) {
            return -1;
        }
        java.lang.Object[] objArr = this.a;
        int i2 = 0;
        do {
            int i3 = (i2 + i) >>> 1;
            defpackage.alac alacVar2 = ((defpackage.alby) objArr[i3]).c;
            if (alacVar2 != alacVar) {
                int iCompareTo = alacVar2.compareTo(alacVar);
                if (iCompareTo < 0) {
                    i2 = i3 + 1;
                } else if (iCompareTo > 0) {
                    i = i3 - 1;
                }
            }
            return i3;
        } while (i2 <= i);
        return -(i2 + 1);
    }

    public final java.util.Map.Entry a(int i) {
        c();
        if (i < this.b) {
            return (defpackage.alby) this.a[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    public final void b() {
        if (this.c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void c() {
        if (this.c || this.e) {
            return;
        }
        f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        c();
        return g((defpackage.alac) obj) >= 0;
    }

    public final void d(defpackage.alac alacVar, java.lang.Object obj) {
        b();
        j$.util.Objects.requireNonNull(alacVar);
        boolean z = this.e;
        int i = this.b;
        if (i > 0) {
            int iCompareTo = alacVar.compareTo(((defpackage.alby) this.a[i - 1]).c);
            if (iCompareTo < 0) {
                z = false;
            } else if (iCompareTo == 0) {
                ((defpackage.alby) this.a[this.b - 1]).setValue(obj);
                return;
            }
        }
        e(this.b + 1);
        java.lang.Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = new defpackage.alby(this, alacVar, obj);
        this.e = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        c();
        defpackage.alca alcaVar = this.d;
        if (alcaVar != null) {
            return alcaVar;
        }
        defpackage.alca alcaVar2 = new defpackage.alca(this);
        this.d = alcaVar2;
        return alcaVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.alcb)) {
            return super.equals(obj);
        }
        defpackage.alcb alcbVar = (defpackage.alcb) obj;
        int size = size();
        if (size == alcbVar.size()) {
            java.lang.Object[] objArr = this.a;
            java.lang.Object[] objArr2 = alcbVar.a;
            for (int i = 0; i < size; i++) {
                if (objArr[i].equals(objArr2[i])) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        c();
        int iG = g((defpackage.alac) obj);
        if (iG >= 0) {
            return ((defpackage.alby) this.a[iG]).a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.a[i].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        d((defpackage.alac) obj, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        b();
        if (!(map instanceof defpackage.alcb)) {
            e(this.b + map.size());
            for (java.util.Map.Entry entry : map.entrySet()) {
                d((defpackage.alac) entry.getKey(), entry.getValue());
            }
            return;
        }
        defpackage.alcb alcbVar = (defpackage.alcb) map;
        e(this.b + alcbVar.b);
        int i = this.b;
        int i2 = alcbVar.b + i;
        for (int i3 = i; i3 < i2; i3++) {
            defpackage.alby albyVar = (defpackage.alby) alcbVar.a[i3 - i];
            d(albyVar.c, albyVar.a);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        c();
        int iG = g((defpackage.alac) obj);
        if (iG < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj2 = ((defpackage.alby) objArr[iG]).a;
        java.lang.System.arraycopy(objArr, iG + 1, objArr, iG, (this.b - iG) - 1);
        java.lang.Object[] objArr2 = this.a;
        int i = this.b - 1;
        this.b = i;
        objArr2[i] = null;
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        c();
        return this.b;
    }
}
