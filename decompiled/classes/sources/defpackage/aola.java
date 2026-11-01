package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aola implements java.util.Map, java.io.Serializable, defpackage.aopa {
    public static final defpackage.aola a;
    public java.lang.Object[] b;
    public java.lang.Object[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    private int[] i;
    private int j;
    private int k;
    private aolc l;
    private defpackage.aold m;
    private defpackage.aolb n;

    static {
        defpackage.aola aolaVar = new defpackage.aola(0);
        aolaVar.h = true;
        a = aolaVar;
    }

    public aola(int i) {
        java.lang.Object[] objArrAC = defpackage.ajsz.aC(i);
        int[] iArr = new int[i];
        int[] iArr2 = new int[defpackage.ajsz.aw(i)];
        this.b = objArrAC;
        this.c = null;
        this.d = iArr;
        this.i = iArr2;
        this.j = 2;
        this.e = 0;
        this.k = java.lang.Integer.numberOfLeadingZeros(l()) + 1;
    }

    private final int l() {
        return this.i.length;
    }

    private final int m(java.lang.Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.k;
    }

    private final void n(boolean z) {
        int i;
        java.lang.Object[] objArr = this.c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.e;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.d;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                int i5 = i3 + 1;
                java.lang.Object[] objArr2 = this.b;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.i[i4] = i5;
                }
                i3 = i5;
            }
            i2++;
        }
        defpackage.ajsz.aA(this.b, i3, i);
        if (objArr != null) {
            defpackage.ajsz.aA(objArr, i3, this.e);
        }
        this.e = i3;
    }

    private final void o(int i) {
        int iD = d();
        int i2 = this.e;
        int i3 = iD - i2;
        int i4 = i2 - this.g;
        if (i3 < i && i3 + i4 >= i && i4 >= (d() >> 2)) {
            n(true);
            return;
        }
        int i5 = this.e + i;
        if (i5 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        if (i5 > d()) {
            int iM0do = defpackage.ajsz.m0do(d(), i5);
            this.b = defpackage.ajsz.aD(this.b, iM0do);
            java.lang.Object[] objArr = this.c;
            this.c = objArr != null ? defpackage.ajsz.aD(objArr, iM0do) : null;
            int[] iArrCopyOf = java.util.Arrays.copyOf(this.d, iM0do);
            defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
            this.d = iArrCopyOf;
            int iAw = defpackage.ajsz.aw(iM0do);
            if (iAw > l()) {
                q(iAw);
            }
        }
    }

    private final void p() {
        this.f++;
    }

    private final void q(int i) {
        int[] iArr;
        p();
        int i2 = 0;
        if (this.e > this.g) {
            n(false);
        }
        this.i = new int[i];
        this.k = java.lang.Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.e) {
            int i3 = i2 + 1;
            int iM = m(this.b[i2]);
            int i4 = this.j;
            while (true) {
                iArr = this.i;
                if (iArr[iM] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new java.lang.IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM = iM == 0 ? l() - 1 : iM - 1;
            }
            iArr[iM] = i3;
            this.d[i2] = iM;
            i2 = i3;
        }
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() throws java.io.NotSerializableException {
        if (this.h) {
            return new aolf(this);
        }
        throw new java.io.NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int a(java.lang.Object obj) {
        f();
        while (true) {
            int iM = m(obj);
            int i = this.j << 1;
            int iL = l() >> 1;
            int i2 = 0;
            while (true) {
                int i3 = this.i[iM];
                if (i3 == 0) {
                    if (this.e >= d()) {
                        o(1);
                        break;
                    }
                    int i4 = this.e;
                    int i5 = i4 + 1;
                    this.e = i5;
                    this.b[i4] = obj;
                    this.d[i4] = iM;
                    this.i[iM] = i5;
                    this.g++;
                    p();
                    if (i2 <= this.j) {
                        return i4;
                    }
                    this.j = i2;
                    return i4;
                }
                if (defpackage.aooh.n(this.b[i3 - 1], obj)) {
                    return -i3;
                }
                i2++;
                if (i2 > (i > iL ? iL : i)) {
                    q(l() << 1);
                    break;
                }
                iM = iM == 0 ? l() - 1 : iM - 1;
            }
        }
    }

    public final int b(java.lang.Object obj) {
        int iM = m(obj);
        int i = this.j;
        while (true) {
            int i2 = this.i[iM];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (defpackage.aooh.n(this.b[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM = iM == 0 ? l() - 1 : iM - 1;
        }
    }

    public final int c(java.lang.Object obj) {
        int i = this.e;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.d[i] >= 0) {
                java.lang.Object[] objArr = this.c;
                defpackage.aooh.c(objArr);
                if (defpackage.aooh.n(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        f();
        int i = this.e - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.i[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        defpackage.ajsz.aA(this.b, 0, this.e);
        java.lang.Object[] objArr = this.c;
        if (objArr != null) {
            defpackage.ajsz.aA(objArr, 0, this.e);
        }
        this.g = 0;
        this.e = 0;
        p();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return b(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return c(obj) >= 0;
    }

    public final int d() {
        return this.b.length;
    }

    public final java.util.Map e() {
        f();
        this.h = true;
        if (this.g <= 0 && (this = a) == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        return this;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        defpackage.aolb aolbVar = this.n;
        if (aolbVar != null) {
            return aolbVar;
        }
        defpackage.aolb aolbVar2 = new defpackage.aolb(this);
        this.n = aolbVar2;
        return aolbVar2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (this.g == map.size() && h(map.entrySet())) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.h) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void g(int i) {
        int i2;
        int i3;
        defpackage.ajsz.az(this.b, i);
        java.lang.Object[] objArr = this.c;
        if (objArr != null) {
            defpackage.ajsz.az(objArr, i);
        }
        int iL = this.d[i];
        loop0: while (true) {
            int i4 = iL;
            int i5 = 0;
            do {
                iL = iL == 0 ? l() - 1 : iL - 1;
                int[] iArr = this.i;
                i2 = iArr[iL];
                i5++;
                if (i5 > this.j) {
                    iArr[i4] = 0;
                    break loop0;
                } else {
                    if (i2 == 0) {
                        iArr[i4] = 0;
                        break loop0;
                    }
                    i3 = i2 - 1;
                }
            } while (((m(this.b[i3]) - iL) & (l() - 1)) < i5);
            this.i[i4] = i2;
            this.d[i3] = i4;
        }
        this.d[i] = -1;
        this.g--;
        p();
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.c;
        defpackage.aooh.c(objArr);
        return objArr[iB];
    }

    public final boolean h(java.util.Collection collection) {
        defpackage.aooh.f(collection, "m");
        for (java.lang.Object obj : collection) {
            if (obj == null) {
                return false;
            }
            try {
                if (!i((java.util.Map.Entry) obj)) {
                    return false;
                }
            } catch (java.lang.ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        defpackage.aokw aokwVar = new defpackage.aokw(this);
        int i = 0;
        while (aokwVar.hasNext()) {
            int i2 = aokwVar.b;
            defpackage.aola aolaVar = aokwVar.a;
            if (i2 >= aolaVar.e) {
                throw new java.util.NoSuchElementException();
            }
            aokwVar.b = i2 + 1;
            aokwVar.c = i2;
            java.lang.Object obj = aolaVar.b[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            java.lang.Object[] objArr = aolaVar.c;
            defpackage.aooh.c(objArr);
            java.lang.Object obj2 = objArr[aokwVar.c];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            aokwVar.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final boolean i(java.util.Map.Entry entry) {
        defpackage.aooh.f(entry, "entry");
        int iB = b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        java.lang.Object[] objArr = this.c;
        defpackage.aooh.c(objArr);
        return defpackage.aooh.n(objArr[iB], entry.getValue());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    public final boolean j(java.lang.Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return false;
        }
        g(iB);
        return true;
    }

    public final java.lang.Object[] k() {
        java.lang.Object[] objArr = this.c;
        if (objArr != null) {
            return objArr;
        }
        java.lang.Object[] objArrAC = defpackage.ajsz.aC(d());
        this.c = objArrAC;
        return objArrAC;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set keySet() {
        aolc aolcVar = this.l;
        if (aolcVar != null) {
            return aolcVar;
        }
        aolc aolcVar2 = new aolc(this);
        this.l = aolcVar2;
        return aolcVar2;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        f();
        int iA = a(obj);
        java.lang.Object[] objArrK = k();
        if (iA >= 0) {
            objArrK[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        java.lang.Object obj3 = objArrK[i];
        objArrK[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        defpackage.aooh.f(map, "from");
        f();
        java.util.Set<java.util.Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        o(setEntrySet.size());
        for (java.util.Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            java.lang.Object[] objArrK = k();
            if (iA >= 0) {
                objArrK[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!defpackage.aooh.n(entry.getValue(), objArrK[i])) {
                    objArrK[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        f();
        int iB = b(obj);
        if (iB < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.c;
        defpackage.aooh.c(objArr);
        java.lang.Object obj2 = objArr[iB];
        g(iB);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((this.g * 3) + 2);
        sb.append('{');
        defpackage.aokw aokwVar = new defpackage.aokw(this);
        int i = 0;
        while (aokwVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = aokwVar.b;
            defpackage.aola aolaVar = aokwVar.a;
            if (i2 >= aolaVar.e) {
                throw new java.util.NoSuchElementException();
            }
            aokwVar.b = i2 + 1;
            aokwVar.c = i2;
            java.lang.Object obj = aolaVar.b[i2];
            if (obj == aolaVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            java.lang.Object[] objArr = aolaVar.c;
            defpackage.aooh.c(objArr);
            java.lang.Object obj2 = objArr[aokwVar.c];
            if (obj2 == aolaVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            aokwVar.b();
            i++;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        defpackage.aold aoldVar = this.m;
        if (aoldVar != null) {
            return aoldVar;
        }
        defpackage.aold aoldVar2 = new defpackage.aold(this);
        this.m = aoldVar2;
        return aoldVar2;
    }

    public aola() {
        throw null;
    }
}
