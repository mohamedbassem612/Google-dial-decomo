package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cil {
    public static final defpackage.cil a = new defpackage.cil(0, 0, new java.lang.Object[0], null);
    public java.lang.Object[] b;
    private int c;
    private int d;
    private final defpackage.cfd e;

    public cil(int i, int i2, java.lang.Object[] objArr, defpackage.cfd cfdVar) {
        this.c = i;
        this.d = i2;
        this.e = cfdVar;
        this.b = objArr;
    }

    private final int n() {
        if (this.d == 0) {
            return this.b.length >> 1;
        }
        int iBitCount = java.lang.Integer.bitCount(this.c);
        int length = this.b.length;
        for (int i = iBitCount << 1; i < length; i++) {
            iBitCount += i(i).n();
        }
        return iBitCount;
    }

    private final defpackage.cil o(int i, defpackage.cie cieVar) {
        cieVar.g(cieVar.b() - 1);
        cieVar.b = s(i);
        java.lang.Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != cieVar.e) {
            return new defpackage.cil(0, 0, defpackage.cfd.e(objArr, i), cieVar.e);
        }
        this.b = defpackage.cfd.e(objArr, i);
        return this;
    }

    private final defpackage.cil p(int i, int i2, defpackage.cie cieVar) {
        cieVar.g(cieVar.b() - 1);
        cieVar.b = s(i);
        java.lang.Object[] objArr = this.b;
        if (objArr.length == 2) {
            return null;
        }
        if (this.e != cieVar.e) {
            return new defpackage.cil(this.c ^ i2, this.d, defpackage.cfd.e(objArr, i), cieVar.e);
        }
        this.b = defpackage.cfd.e(objArr, i);
        this.c ^= i2;
        return this;
    }

    private final defpackage.cil q(int i, int i2, defpackage.cil cilVar) {
        java.lang.Object[] objArr = cilVar.b;
        if (objArr.length != 2 || cilVar.d != 0) {
            java.lang.Object[] objArr2 = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, objArr2.length);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = cilVar;
            return new defpackage.cil(this.c, this.d, objArrCopyOf, null);
        }
        if (this.b.length == 1) {
            cilVar.c = this.d;
            return cilVar;
        }
        int iB = b(i2);
        java.lang.Object[] objArr3 = this.b;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = objArr[1];
        int length = objArr3.length;
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr3, length + 1);
        defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
        defpackage.ajsz.dd(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, length);
        defpackage.ajsz.dd(objArrCopyOf2, objArrCopyOf2, iB + 2, iB, i);
        objArrCopyOf2[iB] = obj;
        objArrCopyOf2[iB + 1] = obj2;
        return new defpackage.cil(this.c ^ i2, this.d ^ i2, objArrCopyOf2, null);
    }

    private final java.lang.Object r(int i) {
        return this.b[i];
    }

    private final java.lang.Object s(int i) {
        return this.b[i + 1];
    }

    private final boolean t(java.lang.Object obj) {
        defpackage.aopo aopoVarB = defpackage.aooc.B(defpackage.aooc.C(0, this.b.length), 2);
        int i = aopoVarB.a;
        int i2 = aopoVarB.b;
        int i3 = aopoVarB.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return false;
        }
        while (!defpackage.aooh.n(obj, this.b[i])) {
            if (i == i2) {
                return false;
            }
            i += i3;
        }
        return true;
    }

    private final boolean u(defpackage.cil cilVar) {
        if (this == cilVar) {
            return true;
        }
        if (this.d == cilVar.d && this.c == cilVar.c) {
            int length = this.b.length;
            for (int i = 0; i < length; i++) {
                if (this.b[i] == cilVar.b[i]) {
                }
            }
            return true;
        }
        return false;
    }

    private final boolean v(int i) {
        return (this.d & i) != 0;
    }

    private final defpackage.cil w(int i, java.lang.Object obj, java.lang.Object obj2, int i2, java.lang.Object obj3, java.lang.Object obj4, int i3, defpackage.cfd cfdVar) {
        defpackage.cil cilVar;
        if (i3 > 30) {
            return new defpackage.cil(0, 0, new java.lang.Object[]{obj, obj2, obj3, obj4}, cfdVar);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 != i5) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            if (i4 < i5) {
                objArr[0] = obj;
                objArr[1] = obj2;
                objArr[2] = obj3;
                objArr[3] = obj4;
            } else {
                objArr[0] = obj3;
                objArr[1] = obj4;
                objArr[2] = obj;
                objArr[3] = obj2;
            }
            cilVar = new defpackage.cil((1 << i4) | (1 << i5), 0, objArr, cfdVar);
        } else {
            cilVar = new defpackage.cil(0, 1 << i4, new java.lang.Object[]{w(i, obj, obj2, i2, obj3, obj4, i3 + 5, cfdVar)}, cfdVar);
        }
        return cilVar;
    }

    private final defpackage.cil x(defpackage.cil cilVar, defpackage.cil cilVar2, int i, int i2, defpackage.cfd cfdVar) {
        if (cilVar2 != null) {
            return (this.e == cfdVar || cilVar != cilVar2) ? y(i, cilVar2, cfdVar) : this;
        }
        java.lang.Object[] objArr = this.b;
        if (objArr.length == 1) {
            return null;
        }
        if (this.e != cfdVar) {
            return new defpackage.cil(this.c, this.d ^ i2, defpackage.cfd.f(objArr, i), cfdVar);
        }
        this.b = defpackage.cfd.f(objArr, i);
        this.d ^= i2;
        return this;
    }

    private final defpackage.cil y(int i, defpackage.cil cilVar, defpackage.cfd cfdVar) {
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        if (length == 1) {
            if (cilVar.b.length == 2 && cilVar.d == 0) {
                cilVar.c = this.d;
                return cilVar;
            }
            length = 1;
        }
        if (this.e == cfdVar) {
            objArr[i] = cilVar;
            return this;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = cilVar;
        return new defpackage.cil(this.c, this.d, objArrCopyOf, cfdVar);
    }

    private final java.lang.Object[] z(int i, int i2, int i3, java.lang.Object obj, java.lang.Object obj2, int i4, defpackage.cfd cfdVar) {
        java.lang.Object objR = r(i);
        defpackage.cil cilVarW = w(objR != null ? objR.hashCode() : 0, objR, s(i), i3, obj, obj2, i4 + 5, cfdVar);
        int iC = c(i2);
        int i5 = iC + 1;
        java.lang.Object[] objArr = this.b;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[length - 1];
        defpackage.ajsz.dl(objArr, objArr2, 0, i, 6);
        defpackage.ajsz.dd(objArr, objArr2, i, i + 2, i5);
        objArr2[iC - 1] = cilVarW;
        defpackage.ajsz.dd(objArr, objArr2, iC, i5, length);
        return objArr2;
    }

    public final int a() {
        return java.lang.Integer.bitCount(this.c);
    }

    public final int b(int i) {
        return java.lang.Integer.bitCount(this.c & (i - 1)) << 1;
    }

    public final int c(int i) {
        return (this.b.length - 1) - java.lang.Integer.bitCount(this.d & (i - 1));
    }

    public final defpackage.cik d(int i, java.lang.Object obj, java.lang.Object obj2, int i2) {
        defpackage.cik cikVarD;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (!defpackage.aooh.n(obj, r(iB))) {
                return new defpackage.cik(new defpackage.cil(this.c ^ i3, this.d | i3, z(iB, i3, i, obj, obj2, i2, null), null), 1);
            }
            if (s(iB) == obj2) {
                return null;
            }
            java.lang.Object[] objArr = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iB + 1] = obj2;
            return new defpackage.cik(new defpackage.cil(this.c, this.d, objArrCopyOf, null), 0);
        }
        if (!v(i3)) {
            return new defpackage.cik(new defpackage.cil(this.c | i3, this.d, defpackage.cfd.d(this.b, b(i3), obj, obj2), null), 1);
        }
        int iC = c(i3);
        defpackage.cil cilVarI = i(iC);
        if (i2 == 30) {
            defpackage.aopo aopoVarB = defpackage.aooc.B(new defpackage.aopq(0, cilVarI.b.length - 1), 2);
            int i4 = aopoVarB.a;
            int i5 = aopoVarB.b;
            int i6 = aopoVarB.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!defpackage.aooh.n(obj, cilVarI.r(i4))) {
                        if (i4 == i5) {
                            cikVarD = new defpackage.cik(new defpackage.cil(0, 0, defpackage.cfd.d(cilVarI.b, 0, obj, obj2), null), 1);
                            break;
                        }
                        i4 += i6;
                    } else {
                        if (obj2 != cilVarI.s(i4)) {
                            java.lang.Object[] objArr2 = cilVarI.b;
                            java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                            defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i4 + 1] = obj2;
                            cikVarD = new defpackage.cik(new defpackage.cil(0, 0, objArrCopyOf2, null), 0);
                            break;
                        }
                        cikVarD = null;
                        break;
                    }
                }
            } else {
                cikVarD = new defpackage.cik(new defpackage.cil(0, 0, defpackage.cfd.d(cilVarI.b, 0, obj, obj2), null), 1);
                break;
            }
            if (cikVarD == null) {
                return null;
            }
        } else {
            cikVarD = cilVarI.d(i, obj, obj2, i2 + 5);
            if (cikVarD == null) {
                return null;
            }
        }
        defpackage.cik cikVar = cikVarD;
        cikVar.a = q(iC, i3, cikVar.a);
        return cikVar;
    }

    public final defpackage.cil e(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.cie cieVar) {
        defpackage.cil cilVar;
        defpackage.cil cilVar2;
        defpackage.cie cieVar2 = cieVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (defpackage.aooh.n(obj, r(iB))) {
                cieVar2.b = s(iB);
                if (s(iB) == obj2) {
                    return this;
                }
                int i4 = iB + 1;
                if (this.e == cieVar2.e) {
                    this.b[i4] = obj2;
                    return this;
                }
                cieVar2.c++;
                java.lang.Object[] objArr = this.b;
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
                defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[i4] = obj2;
                cilVar = new defpackage.cil(this.c, this.d, objArrCopyOf, cieVar2.e);
            } else {
                cieVar2.g(cieVar2.b() + 1);
                defpackage.cfd cfdVar = cieVar2.e;
                if (this.e == cfdVar) {
                    this.b = z(iB, i3, i, obj, obj2, i2, cfdVar);
                    this.c ^= i3;
                    this.d |= i3;
                    return this;
                }
                cilVar = new defpackage.cil(this.c ^ i3, this.d | i3, z(iB, i3, i, obj, obj2, i2, cfdVar), cfdVar);
            }
        } else {
            if (v(i3)) {
                int iC = c(i3);
                defpackage.cil cilVarI = i(iC);
                if (i2 == 30) {
                    defpackage.aopo aopoVarB = defpackage.aooc.B(new defpackage.aopq(0, cilVarI.b.length - 1), 2);
                    int i5 = aopoVarB.a;
                    int i6 = aopoVarB.b;
                    int i7 = aopoVarB.c;
                    if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                        while (true) {
                            if (!defpackage.aooh.n(obj, cilVarI.r(i5))) {
                                if (i5 == i6) {
                                    cieVar2.g(cieVar2.b() + 1);
                                    cilVar2 = cilVarI;
                                    cilVarI = new defpackage.cil(0, 0, defpackage.cfd.d(cilVarI.b, 0, obj, obj2), cieVar2.e);
                                    break;
                                }
                                i5 += i7;
                            } else {
                                int i8 = i5 + 1;
                                cieVar2.b = cilVarI.s(i5);
                                if (cilVarI.e != cieVar2.e) {
                                    cieVar2.c++;
                                    java.lang.Object[] objArr2 = cilVarI.b;
                                    java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr2, objArr2.length);
                                    defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
                                    objArrCopyOf2[i8] = obj2;
                                    cilVarI = new defpackage.cil(0, 0, objArrCopyOf2, cieVar2.e);
                                    cilVar2 = cilVarI;
                                    break;
                                }
                                cilVarI.b[i8] = obj2;
                                cilVar2 = cilVarI;
                                break;
                            }
                        }
                    } else {
                        cieVar2.g(cieVar2.b() + 1);
                        cilVar2 = cilVarI;
                        cilVarI = new defpackage.cil(0, 0, defpackage.cfd.d(cilVarI.b, 0, obj, obj2), cieVar2.e);
                        break;
                    }
                } else {
                    cilVarI = cilVarI.e(i, obj, obj2, i2 + 5, cieVar2);
                    cilVar2 = cilVarI;
                }
                if (cilVar2 != cilVarI) {
                    cieVar2 = cieVar2;
                    return y(iC, cilVarI, cieVar2.e);
                }
                cieVar2 = cieVar2;
                return this;
            }
            cieVar2.g(cieVar2.b() + 1);
            defpackage.cfd cfdVar2 = cieVar2.e;
            int iB2 = b(i3);
            defpackage.cfd cfdVar3 = this.e;
            java.lang.Object[] objArr3 = this.b;
            if (cfdVar3 == cfdVar2) {
                this.b = defpackage.cfd.d(objArr3, iB2, obj, obj2);
                this.c |= i3;
                return this;
            }
            cilVar = new defpackage.cil(this.c | i3, this.d, defpackage.cfd.d(objArr3, iB2, obj, obj2), cfdVar2);
        }
        return cilVar;
    }

    public final defpackage.cil f(defpackage.cil cilVar, int i, defpackage.cit citVar, defpackage.cie cieVar) {
        defpackage.cie cieVar2;
        int i2;
        defpackage.cil cilVarW;
        defpackage.cie cieVar3 = cieVar;
        if (this == cilVar) {
            citVar.a += n();
            return this;
        }
        int i3 = 0;
        if (i > 30) {
            defpackage.cfd cfdVar = cieVar3.e;
            int i4 = cilVar.d;
            int i5 = cilVar.c;
            java.lang.Object[] objArr = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length + cilVar.b.length);
            defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
            int length = this.b.length;
            defpackage.aopo aopoVarB = defpackage.aooc.B(new defpackage.aopq(0, cilVar.b.length - 1), 2);
            int i6 = aopoVarB.a;
            int i7 = aopoVarB.b;
            int i8 = aopoVarB.c;
            if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                while (true) {
                    if (t(cilVar.b[i6])) {
                        citVar.a++;
                    } else {
                        java.lang.Object[] objArr2 = cilVar.b;
                        objArrCopyOf[length] = objArr2[i6];
                        objArrCopyOf[length + 1] = objArr2[i6 + 1];
                        length += 2;
                    }
                    if (i6 == i7) {
                        break;
                    }
                    i6 += i8;
                }
            }
            if (length == this.b.length) {
                return this;
            }
            if (length != cilVar.b.length) {
                if (length == objArrCopyOf.length) {
                    return new defpackage.cil(0, 0, objArrCopyOf, cfdVar);
                }
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, length);
                defpackage.aooh.e(objArrCopyOf2, "copyOf(...)");
                return new defpackage.cil(0, 0, objArrCopyOf2, cfdVar);
            }
        } else {
            int i9 = this.d | cilVar.d;
            int i10 = this.c;
            int i11 = cilVar.c;
            int i12 = i10 & i11;
            int i13 = (i10 ^ i11) & (~i9);
            while (i12 != 0) {
                int iLowestOneBit = java.lang.Integer.lowestOneBit(i12);
                if (defpackage.aooh.n(r(b(iLowestOneBit)), cilVar.r(cilVar.b(iLowestOneBit)))) {
                    i13 |= iLowestOneBit;
                } else {
                    i9 |= iLowestOneBit;
                }
                i12 ^= iLowestOneBit;
            }
            if ((i9 & i13) != 0) {
                defpackage.cdh.b("Check failed.");
            }
            defpackage.cil cilVar2 = (defpackage.aooh.n(this.e, cieVar3.e) && this.c == i13 && this.d == i9) ? this : new defpackage.cil(i13, i9, new java.lang.Object[(java.lang.Integer.bitCount(i13) << 1) + java.lang.Integer.bitCount(i9)], null);
            int i14 = i9;
            int i15 = 0;
            while (i14 != 0) {
                int iLowestOneBit2 = java.lang.Integer.lowestOneBit(i14);
                java.lang.Object[] objArr3 = cilVar2.b;
                int length2 = (objArr3.length - 1) - i15;
                if (v(iLowestOneBit2)) {
                    cilVarW = i(c(iLowestOneBit2));
                    if (cilVar.v(iLowestOneBit2)) {
                        cilVarW = cilVarW.f(cilVar.i(cilVar.c(iLowestOneBit2)), i + 5, citVar, cieVar3);
                        cieVar2 = cieVar3;
                        i2 = iLowestOneBit2;
                    } else {
                        if (cilVar.m(iLowestOneBit2)) {
                            int i16 = i + 5;
                            int iB = cilVar.b(iLowestOneBit2);
                            java.lang.Object objR = cilVar.r(iB);
                            java.lang.Object objS = cilVar.s(iB);
                            int iB2 = cieVar3.b();
                            cilVarW = cilVarW.e(objR != null ? objR.hashCode() : i3, objR, objS, i16, cieVar3);
                            if (cieVar.b() == iB2) {
                                citVar.a++;
                            }
                        }
                        cieVar2 = cieVar;
                        i2 = iLowestOneBit2;
                    }
                } else if (cilVar.v(iLowestOneBit2)) {
                    cilVarW = cilVar.i(cilVar.c(iLowestOneBit2));
                    if (m(iLowestOneBit2)) {
                        int i17 = i + 5;
                        int iB3 = b(iLowestOneBit2);
                        java.lang.Object objR2 = r(iB3);
                        if (cilVarW.l(objR2 != null ? objR2.hashCode() : 0, objR2, i17)) {
                            citVar.a++;
                        } else {
                            cieVar3 = cieVar;
                            cilVarW = cilVarW.e(objR2 != null ? objR2.hashCode() : 0, objR2, s(iB3), i17, cieVar3);
                            cieVar2 = cieVar3;
                            i2 = iLowestOneBit2;
                        }
                    }
                    cieVar2 = cieVar;
                    i2 = iLowestOneBit2;
                } else {
                    cieVar2 = cieVar;
                    int i18 = i + 5;
                    int iB4 = b(iLowestOneBit2);
                    java.lang.Object objR3 = r(iB4);
                    java.lang.Object objS2 = s(iB4);
                    int iB5 = cilVar.b(iLowestOneBit2);
                    java.lang.Object objR4 = cilVar.r(iB5);
                    i2 = iLowestOneBit2;
                    cilVarW = w(objR3 != null ? objR3.hashCode() : 0, objR3, objS2, objR4 != null ? objR4.hashCode() : 0, objR4, cilVar.s(iB5), i18, cieVar2.e);
                }
                objArr3[length2] = cilVarW;
                i14 ^= i2;
                i15++;
                cieVar3 = cieVar2;
                i3 = 0;
            }
            int i19 = 0;
            while (i13 != 0) {
                int i20 = i19 << 1;
                int i21 = i20 + 1;
                int iLowestOneBit3 = java.lang.Integer.lowestOneBit(i13);
                if (cilVar.m(iLowestOneBit3)) {
                    int iB6 = cilVar.b(iLowestOneBit3);
                    cilVar2.b[i20] = cilVar.r(iB6);
                    cilVar2.b[i21] = cilVar.s(iB6);
                    if (m(iLowestOneBit3)) {
                        citVar.a++;
                    }
                } else {
                    int iB7 = b(iLowestOneBit3);
                    cilVar2.b[i20] = r(iB7);
                    cilVar2.b[i21] = s(iB7);
                }
                i13 ^= iLowestOneBit3;
                i19++;
            }
            if (u(cilVar2)) {
                return this;
            }
            if (!cilVar.u(cilVar2)) {
                return cilVar2;
            }
        }
        return cilVar;
    }

    public final defpackage.cil g(int i, java.lang.Object obj, int i2, defpackage.cie cieVar) {
        defpackage.cil cilVarG;
        defpackage.cil cilVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            return defpackage.aooh.n(obj, r(iB)) ? p(iB, i3, cieVar) : this;
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        defpackage.cil cilVarI = i(iC);
        if (i2 == 30) {
            defpackage.aopo aopoVarB = defpackage.aooc.B(defpackage.aooc.C(0, cilVarI.b.length), 2);
            int i4 = aopoVarB.a;
            int i5 = aopoVarB.b;
            int i6 = aopoVarB.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (defpackage.aooh.n(obj, cilVarI.r(i4))) {
                        cilVarG = cilVarI.o(i4, cieVar);
                    } else if (i4 != i5) {
                        i4 += i6;
                    }
                }
            }
            cilVar = cilVarI;
            return x(cilVarI, cilVar, iC, i3, cieVar.e);
        }
        cilVarG = cilVarI.g(i, obj, i2 + 5, cieVar);
        cilVar = cilVarG;
        return x(cilVarI, cilVar, iC, i3, cieVar.e);
    }

    public final defpackage.cil h(int i, java.lang.Object obj, java.lang.Object obj2, int i2, defpackage.cie cieVar) {
        defpackage.cie cieVar2;
        defpackage.cil cilVarH;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            return (defpackage.aooh.n(obj, r(iB)) && defpackage.aooh.n(obj2, s(iB))) ? p(iB, i3, cieVar) : this;
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        defpackage.cil cilVarI = i(iC);
        if (i2 == 30) {
            defpackage.aopo aopoVarB = defpackage.aooc.B(defpackage.aooc.C(0, cilVarI.b.length), 2);
            int i4 = aopoVarB.a;
            int i5 = aopoVarB.b;
            int i6 = aopoVarB.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!defpackage.aooh.n(obj, cilVarI.r(i4)) || !defpackage.aooh.n(obj2, cilVarI.s(i4))) {
                        if (i4 == i5) {
                            cieVar2 = cieVar;
                            cilVarH = cilVarI;
                            break;
                        }
                        i4 += i6;
                    } else {
                        cilVarH = cilVarI.o(i4, cieVar);
                        cieVar2 = cieVar;
                        break;
                    }
                }
            } else {
                cieVar2 = cieVar;
                cilVarH = cilVarI;
                break;
            }
        } else {
            cieVar2 = cieVar;
            cilVarH = cilVarI.h(i, obj, obj2, i2 + 5, cieVar2);
        }
        return x(cilVarI, cilVarH, iC, i3, cieVar2.e);
    }

    public final defpackage.cil i(int i) {
        java.lang.Object obj = this.b[i];
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        }
        return (defpackage.cil) obj;
    }

    public final defpackage.cil j(int i, java.lang.Object obj, int i2) {
        defpackage.cil cilVarJ;
        defpackage.cil cilVar;
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (!defpackage.aooh.n(obj, r(iB))) {
                return this;
            }
            java.lang.Object[] objArr = this.b;
            if (objArr.length != 2) {
                cilVar = new defpackage.cil(this.c ^ i3, this.d, defpackage.cfd.e(objArr, iB), null);
                return cilVar;
            }
            return null;
        }
        if (!v(i3)) {
            return this;
        }
        int iC = c(i3);
        defpackage.cil cilVarI = i(iC);
        if (i2 == 30) {
            defpackage.aopo aopoVarB = defpackage.aooc.B(defpackage.aooc.C(0, cilVarI.b.length), 2);
            int i4 = aopoVarB.a;
            int i5 = aopoVarB.b;
            int i6 = aopoVarB.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!defpackage.aooh.n(obj, cilVarI.r(i4))) {
                        if (i4 == i5) {
                            cilVarJ = cilVarI;
                            break;
                        }
                        i4 += i6;
                    } else {
                        java.lang.Object[] objArr2 = cilVarI.b;
                        if (objArr2.length != 2) {
                            cilVarJ = new defpackage.cil(0, 0, defpackage.cfd.e(objArr2, i4), null);
                            break;
                        }
                        cilVarJ = null;
                        break;
                    }
                }
            } else {
                cilVarJ = cilVarI;
                break;
            }
        } else {
            cilVarJ = cilVarI.j(i, obj, i2 + 5);
        }
        if (cilVarJ != null) {
            return cilVarI != cilVarJ ? q(iC, i3, cilVarJ) : this;
        }
        java.lang.Object[] objArr3 = this.b;
        if (objArr3.length != 1) {
            cilVar = new defpackage.cil(this.c, this.d ^ i3, defpackage.cfd.f(objArr3, iC), null);
            return cilVar;
        }
        return null;
    }

    public final java.lang.Object k(int i, java.lang.Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            int iB = b(i3);
            if (defpackage.aooh.n(obj, r(iB))) {
                return s(iB);
            }
            return null;
        }
        if (!v(i3)) {
            return null;
        }
        defpackage.cil cilVarI = i(c(i3));
        if (i2 != 30) {
            return cilVarI.k(i, obj, i2 + 5);
        }
        defpackage.aopo aopoVarB = defpackage.aooc.B(new defpackage.aopq(0, cilVarI.b.length - 1), 2);
        int i4 = aopoVarB.a;
        int i5 = aopoVarB.b;
        int i6 = aopoVarB.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        while (!defpackage.aooh.n(obj, cilVarI.r(i4))) {
            if (i4 == i5) {
                return null;
            }
            i4 += i6;
        }
        return cilVarI.s(i4);
    }

    public final boolean l(int i, java.lang.Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (m(i3)) {
            return defpackage.aooh.n(obj, r(b(i3)));
        }
        if (!v(i3)) {
            return false;
        }
        defpackage.cil cilVarI = i(c(i3));
        return i2 == 30 ? cilVarI.t(obj) : cilVarI.l(i, obj, i2 + 5);
    }

    public final boolean m(int i) {
        return (this.c & i) != 0;
    }
}
