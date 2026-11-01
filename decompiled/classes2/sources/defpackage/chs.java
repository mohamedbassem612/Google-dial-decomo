package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chs extends chq implements j$.util.List, chm {
    private final java.lang.Object[] a;
    private final java.lang.Object[] b;
    private final int c;
    private final int d;

    public chs(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (i <= 32) {
            cdh.a(a.bj(i, "Trie-based persistent vector should have at least 33 elements, got "));
        }
        int length = objArr2.length;
    }

    private final int l() {
        return (this.c - 1) & (-32);
    }

    private final chm m(java.lang.Object[] objArr, int i, int i2, int i3) {
        defpackage.chs chsVar;
        int i4 = this.c - i;
        if (i4 != 1) {
            java.lang.Object[] objArr2 = this.b;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, 32);
            aooh.e(objArrCopyOf, "copyOf(...)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                ajsz.dd(objArr2, objArrCopyOf, i3, i3 + 1, i4);
            }
            objArrCopyOf[i5] = null;
            return new defpackage.chs(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = java.util.Arrays.copyOf(objArr, 32);
                aooh.e(objArr, "copyOf(...)");
            }
            return new chx(objArr);
        }
        xp xpVar = new xp((java.lang.Object) null);
        java.lang.Object[] objArrS = s(objArr, i2, i - 1, xpVar);
        aooh.c(objArrS);
        java.lang.Object obj = xpVar.a;
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
        if (objArrS[1] == null) {
            java.lang.Object obj2 = objArrS[0];
            aooh.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            chsVar = new defpackage.chs((java.lang.Object[]) obj2, objArr3, i, i2 - 5);
        } else {
            chsVar = new defpackage.chs(objArrS, objArr3, i, i2);
        }
        return chsVar;
    }

    private final defpackage.chs n(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int i2 = this.c;
        int iL = i2 - l();
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr2, 32);
        aooh.e(objArrCopyOf, "copyOf(...)");
        int i3 = i + 1;
        if (iL < 32) {
            ajsz.dd(objArr2, objArrCopyOf, i3, i, iL);
            objArrCopyOf[i] = obj;
            return new defpackage.chs(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        java.lang.Object obj2 = objArr2[31];
        ajsz.dd(objArr2, objArrCopyOf, i3, i, iL - 1);
        objArrCopyOf[i] = obj;
        return o(objArr, objArrCopyOf, den.X(obj2));
    }

    private final defpackage.chs o(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.c;
        int i2 = i + 1;
        int i3 = this.d;
        if ((i >> 5) <= (1 << i3)) {
            return new defpackage.chs(p(objArr, i3, objArr2), objArr3, i2, i3);
        }
        int i4 = i3 + 5;
        return new defpackage.chs(p(den.X(objArr), i4, objArr2), objArr3, i2, i4);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f  */
    private final java.lang.Object[] p(java.lang.Object[] objArr, int i, java.lang.Object[] objArr2) {
        java.lang.Object[] objArrCopyOf;
        if (objArr != null) {
            objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
            aooh.e(objArrCopyOf, "copyOf(...)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new java.lang.Object[32];
            }
        } else {
            objArrCopyOf = new java.lang.Object[32];
        }
        int i2 = ((this.c - 1) >> i) & 31;
        if (i == 5) {
            objArrCopyOf[i2] = objArr2;
        } else {
            objArrCopyOf[i2] = p((java.lang.Object[]) objArrCopyOf[i2], i - 5, objArr2);
        }
        return objArrCopyOf;
    }

    private final java.lang.Object[] q(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
        aooh.e(objArrCopyOf, "copyOf(...)");
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            objArrCopyOf[i3] = obj;
        } else {
            java.lang.Object obj2 = objArrCopyOf[i3];
            aooh.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[i3] = q((java.lang.Object[]) obj2, i - 5, i2, obj);
        }
        return objArrCopyOf;
    }

    private final java.lang.Object[] r(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, xp xpVar) {
        java.lang.Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new java.lang.Object[32];
            } else {
                objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
                aooh.e(objArrCopyOf, "copyOf(...)");
            }
            ajsz.dd(objArr, objArrCopyOf, i3 + 1, i3, 31);
            xpVar.a = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, 32);
        aooh.e(objArrCopyOf2, "copyOf(...)");
        int i4 = i - 5;
        java.lang.Object obj2 = objArr[i3];
        aooh.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = r((java.lang.Object[]) obj2, i4, i2, obj, xpVar);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            java.lang.Object obj3 = objArr[i3];
            aooh.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i3] = r((java.lang.Object[]) obj3, i4, 0, xpVar.a, xpVar);
        }
        return objArrCopyOf2;
    }

    private final java.lang.Object[] s(java.lang.Object[] objArr, int i, int i2, xp xpVar) {
        java.lang.Object[] objArrS;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            xpVar.a = objArr[i3];
            objArrS = null;
        } else {
            java.lang.Object obj = objArr[i3];
            aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrS = s((java.lang.Object[]) obj, i - 5, i2, xpVar);
        }
        if (objArrS == null && i3 == 0) {
            return null;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
        aooh.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i3] = objArrS;
        return objArrCopyOf;
    }

    private final java.lang.Object[] t(java.lang.Object[] objArr, int i, int i2, xp xpVar) {
        java.lang.Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new java.lang.Object[32];
            } else {
                objArrCopyOf = java.util.Arrays.copyOf(objArr, 32);
                aooh.e(objArrCopyOf, "copyOf(...)");
            }
            ajsz.dd(objArr, objArrCopyOf, i3, i3 + 1, 32);
            objArrCopyOf[31] = xpVar.a;
            xpVar.a = objArr[i3];
            return objArrCopyOf;
        }
        int iL = objArr[31] == null ? 31 & ((l() - 1) >> i) : 31;
        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArr, 32);
        aooh.e(objArrCopyOf2, "copyOf(...)");
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iL) {
            while (true) {
                java.lang.Object obj = objArrCopyOf2[iL];
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iL] = t((java.lang.Object[]) obj, i4, 0, xpVar);
                if (iL == i5) {
                    break;
                }
                iL--;
            }
        }
        java.lang.Object obj2 = objArrCopyOf2[i3];
        aooh.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = t((java.lang.Object[]) obj2, i4, i2, xpVar);
        return objArrCopyOf2;
    }

    public final int a() {
        return this.c;
    }

    public final chm b(java.lang.Object obj) {
        int i = this.c;
        int iL = i - l();
        if (iL >= 32) {
            return o(this.a, this.b, den.X(obj));
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, 32);
        aooh.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iL] = obj;
        return new defpackage.chs(this.a, objArrCopyOf, i + 1, this.d);
    }

    public final chm c(int i, java.lang.Object obj) {
        int i2 = this.c;
        a.ak(i, i2);
        if (i == i2) {
            return b(obj);
        }
        int iL = l();
        if (i >= iL) {
            return n(this.a, i - iL, obj);
        }
        xp xpVar = new xp((java.lang.Object) null);
        return n(r(this.a, this.d, i, obj, xpVar), 0, xpVar.a);
    }

    public final chm g(aonj aonjVar) {
        defpackage.cht chtVarJ = j();
        chtVarJ.e(aonjVar);
        return chtVarJ.c();
    }

    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr;
        a.aj(i, this.c);
        if (l() <= i) {
            objArr = this.b;
        } else {
            java.lang.Object[] objArr2 = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[(i >> i2) & 31];
                aooh.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final chm h(int i) {
        a.aj(i, this.c);
        int iL = l();
        java.lang.Object[] objArr = this.a;
        if (i >= iL) {
            return m(objArr, iL, this.d, i - iL);
        }
        int i2 = this.d;
        return m(t(objArr, i2, i, new xp(this.b[0])), iL, i2, 0);
    }

    public final chm i(int i, java.lang.Object obj) {
        int i2 = this.c;
        a.aj(i, i2);
        if (l() > i) {
            java.lang.Object[] objArr = this.a;
            int i3 = this.d;
            return new defpackage.chs(q(objArr, i3, i, obj), this.b, i2, i3);
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.b, 32);
        aooh.e(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i & 31] = obj;
        return new defpackage.chs(this.a, objArrCopyOf, i2, this.d);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final defpackage.cht j() {
        return new defpackage.cht(this, this.a, this.b, this.d);
    }

    public final java.util.ListIterator listIterator(int i) {
        int i2 = this.c;
        a.ak(i, i2);
        return new defpackage.chu(this.a, this.b, i, i2, (this.d / 5) + 1);
    }
}
