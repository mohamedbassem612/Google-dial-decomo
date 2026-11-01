package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aec {
    private int[] a;
    private java.lang.Object[] b;
    public int d;

    public aec(int i) {
        this.a = i == 0 ? defpackage.aei.a : new int[i];
        this.b = i == 0 ? defpackage.aei.c : new java.lang.Object[i << 1];
    }

    private final int a(java.lang.Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = defpackage.aei.a(this.a, i2, i);
        if (iA < 0 || defpackage.aooh.n(obj, this.b[iA << 1])) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (defpackage.aooh.n(obj, this.b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (defpackage.aooh.n(obj, this.b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int iA = defpackage.aei.a(this.a, i, 0);
        if (iA < 0 || this.b[iA << 1] == null) {
            return iA;
        }
        int i2 = iA + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iA - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int b(java.lang.Object obj) {
        int i = this.d << 1;
        java.lang.Object[] objArr = this.b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (defpackage.aooh.n(obj, objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public final int c(java.lang.Object obj) {
        return obj == null ? j() : a(obj, obj.hashCode());
    }

    public void clear() {
        if (this.d > 0) {
            this.a = defpackage.aei.a;
            this.b = defpackage.aei.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(java.lang.Object obj) {
        return c(obj) >= 0;
    }

    public final boolean containsValue(java.lang.Object obj) {
        return b(obj) >= 0;
    }

    public final java.lang.Object d(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.un.a(defpackage.a.bj(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[i << 1];
    }

    public java.lang.Object e(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.un.a(defpackage.a.bj(i, "Expected index to be within 0..size()-1, but was "));
        }
        java.lang.Object[] objArr = this.b;
        int i2 = i << 1;
        java.lang.Object obj = objArr[i2 + 1];
        int i3 = this.d;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.a;
            int length = iArr.length;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    defpackage.ajsz.db(iArr, iArr, i, i5, i3);
                    java.lang.Object[] objArr2 = this.b;
                    defpackage.ajsz.dd(objArr2, objArr2, i2, i5 << 1, i3 << 1);
                }
                java.lang.Object[] objArr3 = this.b;
                int i6 = i4 << 1;
                objArr3[i6] = null;
                objArr3[i6 + 1] = null;
            } else {
                int i7 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i7);
                defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
                this.a = iArrCopyOf;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, i7 << 1);
                defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                this.b = objArrCopyOf;
                if (i3 != this.d) {
                    throw new java.util.ConcurrentModificationException();
                }
                if (i > 0) {
                    defpackage.ajsz.db(iArr, this.a, 0, 0, i);
                    defpackage.ajsz.dd(objArr, this.b, 0, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    defpackage.ajsz.db(iArr, this.a, i, i8, i3);
                    defpackage.ajsz.dd(objArr, this.b, i2, i8 << 1, i3 << 1);
                }
            }
            if (i3 != this.d) {
                throw new java.util.ConcurrentModificationException();
            }
            this.d = i4;
        }
        return obj;
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        int i2;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof defpackage.aec) {
                int i3 = this.d;
                defpackage.aec aecVar = (defpackage.aec) obj;
                if (i3 == aecVar.d) {
                    for (0; i2 < i3; i2 + 1) {
                        java.lang.Object objD = d(i2);
                        java.lang.Object objG = g(i2);
                        java.lang.Object obj2 = aecVar.get(objD);
                        if (objG == null) {
                            i2 = (obj2 == null && aecVar.containsKey(objD)) ? i2 + 1 : 0;
                        } else if (defpackage.aooh.n(objG, obj2)) {
                        }
                    }
                    return true;
                }
            } else if ((obj instanceof java.util.Map) && this.d == ((java.util.Map) obj).size()) {
                int i4 = this.d;
                for (0; i < i4; i + 1) {
                    java.lang.Object objD2 = d(i);
                    java.lang.Object objG2 = g(i);
                    java.util.Map map = (java.util.Map) obj;
                    java.lang.Object obj3 = map.get(objD2);
                    if (objG2 == null) {
                        i = (obj3 == null && map.containsKey(objD2)) ? i + 1 : 0;
                    } else if (defpackage.aooh.n(objG2, obj3)) {
                    }
                }
                return true;
            }
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public java.lang.Object f(int i, java.lang.Object obj) {
        if (i < 0 || i >= this.d) {
            defpackage.un.a(defpackage.a.bj(i, "Expected index to be within 0..size()-1, but was "));
        }
        java.lang.Object[] objArr = this.b;
        int i2 = (i << 1) + 1;
        java.lang.Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final java.lang.Object g(int i) {
        if (i < 0 || i >= this.d) {
            defpackage.un.a(defpackage.a.bj(i, "Expected index to be within 0..size()-1, but was "));
        }
        return this.b[(i << 1) + 1];
    }

    public final java.lang.Object get(java.lang.Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.b[(iC << 1) + 1];
        }
        return null;
    }

    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.b[(iC << 1) + 1] : obj2;
    }

    public final void h(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i);
            defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, i << 1);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            this.b = objArrCopyOf;
        }
        if (this.d != i2) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public int hashCode() {
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            java.lang.Object obj = objArr[i2];
            iHashCode += iArr[i3] ^ (obj != null ? obj.hashCode() : 0);
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public void i(defpackage.aec aecVar) {
        int i = aecVar.d;
        h(this.d + i);
        if (this.d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(aecVar.d(i2), aecVar.g(i2));
            }
        } else if (i > 0) {
            defpackage.ajsz.db(aecVar.a, this.a, 0, 0, i);
            defpackage.ajsz.dd(aecVar.b, this.b, 0, 0, i << 1);
            this.d = i;
        }
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        int iJ;
        int iHashCode;
        int i = this.d;
        if (obj != null) {
            iHashCode = obj.hashCode();
            iJ = a(obj, iHashCode);
        } else {
            iJ = j();
            iHashCode = 0;
        }
        if (iJ >= 0) {
            int i2 = (iJ << 1) + 1;
            java.lang.Object[] objArr = this.b;
            java.lang.Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iJ;
        int[] iArr = this.a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i4);
            defpackage.aooh.e(iArrCopyOf, "copyOf(...)");
            this.a = iArrCopyOf;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, i4 << 1);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            this.b = objArrCopyOf;
            if (i != this.d) {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.a;
            int i5 = i3 + 1;
            defpackage.ajsz.db(iArr2, iArr2, i5, i3, i);
            java.lang.Object[] objArr2 = this.b;
            defpackage.ajsz.dd(objArr2, objArr2, i5 << 1, i3 << 1, this.d << 1);
        }
        int i6 = this.d;
        if (i == i6) {
            int[] iArr3 = this.a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                java.lang.Object[] objArr3 = this.b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.d = i6 + 1;
                return null;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !defpackage.aooh.n(obj2, g(iC))) {
            return false;
        }
        e(iC);
        return true;
    }

    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !defpackage.aooh.n(obj2, g(iC))) {
            return false;
        }
        f(iC, obj3);
        return true;
    }

    public final int size() {
        return this.d;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object objD = d(i2);
            if (objD != sb) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            java.lang.Object objG = g(i2);
            if (objG != sb) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final java.lang.Object remove(java.lang.Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return e(iC);
        }
        return null;
    }

    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC, obj2);
        }
        return null;
    }

    public aec() {
        throw null;
    }
}
