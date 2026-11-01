package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cht extends aojr implements java.util.List, java.util.Collection, aoox, aooy {
    public int a;
    public java.lang.Object[] b;
    public java.lang.Object[] c;
    public int d;
    private chm e;
    private java.lang.Object[] f;
    private java.lang.Object[] g;
    private cfd h = new cfd();

    public cht(chm chmVar, java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        this.e = chmVar;
        this.f = objArr;
        this.g = objArr2;
        this.a = i;
        this.b = this.f;
        this.c = this.g;
        this.d = this.e.size();
    }

    private final int A(aonj aonjVar, java.lang.Object[] objArr, int i, xp xpVar) {
        java.lang.Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (((java.lang.Boolean) aonjVar.a(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        xpVar.a = objArrP;
        return i2;
    }

    private final int B(aonj aonjVar, int i, xp xpVar) {
        int iA = A(aonjVar, this.c, i, xpVar);
        if (iA == i) {
            return i;
        }
        java.lang.Object obj = xpVar.a;
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr = (java.lang.Object[]) obj;
        ajsz.dm(objArr, iA, i);
        this.c = objArr;
        this.d -= i - iA;
        return iA;
    }

    private final java.lang.Object[] C(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, xp xpVar) {
        java.lang.Object obj2;
        int i3 = (i2 >> i) & 31;
        int i4 = i3 + 1;
        if (i == 0) {
            xpVar.a = objArr[31];
            java.lang.Object[] objArrP = p(objArr);
            ajsz.dd(objArr, objArrP, i4, i3, 31);
            objArrP[i3] = obj;
            return objArrP;
        }
        java.lang.Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        java.lang.Object obj3 = objArrP2[i3];
        aooh.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[i3] = C((java.lang.Object[]) obj3, i5, i2, obj, xpVar);
        while (i4 < 32 && (obj2 = objArrP2[i4]) != null) {
            objArrP2[i4] = C((java.lang.Object[]) obj2, i5, 0, xpVar.a, xpVar);
            i4++;
        }
        return objArrP2;
    }

    private final java.lang.Object[] D(java.lang.Object[] objArr, int i, int i2, xp xpVar) {
        java.lang.Object[] objArrD;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            xpVar.a = objArr[i3];
            objArrD = null;
        } else {
            java.lang.Object obj = objArr[i3];
            aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrD = D((java.lang.Object[]) obj, i - 5, i2, xpVar);
        }
        if (objArrD == null && i3 == 0) {
            return null;
        }
        java.lang.Object[] objArrP = p(objArr);
        objArrP[i3] = objArrD;
        return objArrP;
    }

    private final java.lang.Object[] E(java.lang.Object[] objArr, int i, int i2, xp xpVar) {
        int i3 = (i2 >> i) & 31;
        int i4 = i3 + 1;
        if (i == 0) {
            java.lang.Object obj = objArr[i3];
            java.lang.Object[] objArrP = p(objArr);
            ajsz.dd(objArr, objArrP, i3, i4, 32);
            objArrP[31] = xpVar.a;
            xpVar.a = obj;
            return objArrP;
        }
        int iF = objArr[31] == null ? 31 & ((f() - 1) >> i) : 31;
        java.lang.Object[] objArrP2 = p(objArr);
        int i5 = i - 5;
        if (i4 <= iF) {
            while (true) {
                java.lang.Object obj2 = objArrP2[iF];
                aooh.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrP2[iF] = E((java.lang.Object[]) obj2, i5, 0, xpVar);
                if (iF == i4) {
                    break;
                }
                iF--;
            }
        }
        java.lang.Object obj3 = objArrP2[i3];
        aooh.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[i3] = E((java.lang.Object[]) obj3, i5, i2, xpVar);
        return objArrP2;
    }

    private final java.lang.Object[] F(java.lang.Object[] objArr, int i, int i2, java.lang.Object obj, xp xpVar) {
        java.lang.Object[] objArrP = p(objArr);
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (objArrP != objArr) {
                this.modCount++;
            }
            xpVar.a = objArrP[i3];
            objArrP[i3] = obj;
        } else {
            java.lang.Object obj2 = objArrP[i3];
            aooh.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP[i3] = F((java.lang.Object[]) obj2, i - 5, i2, obj, xpVar);
        }
        return objArrP;
    }

    private final int f() {
        int i = this.d;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    private final int g() {
        return y(this.d);
    }

    private final java.lang.Object h(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = this.d - i;
        java.lang.Object[] objArr2 = this.c;
        if (i4 == 1) {
            java.lang.Object obj = objArr2[0];
            l(objArr, i, i2);
            return obj;
        }
        java.lang.Object obj2 = objArr2[i3];
        java.lang.Object[] objArrP = p(objArr2);
        ajsz.dd(objArr2, objArrP, i3, i3 + 1, i4);
        objArrP[i4 - 1] = null;
        this.b = objArr;
        this.c = objArrP;
        this.d = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    private final java.util.ListIterator i(int i) {
        java.lang.Object[] objArr = this.b;
        if (objArr == null) {
            throw new java.lang.IllegalStateException("Invalid root");
        }
        int iF = f() >> 5;
        a.ak(i, iF);
        int i2 = this.a;
        return i2 == 0 ? new defpackage.chw(objArr, i) : new defpackage.chy(objArr, i, iF, i2 / 5);
    }

    private final void j(java.util.Collection collection, int i, int i2, java.lang.Object[][] objArr, int i3, java.lang.Object[] objArr2) {
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4 = this.b;
        if (objArr4 == null) {
            throw new java.lang.IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        if (objArr4 == null) {
            throw new java.lang.IllegalStateException("root is null");
        }
        java.util.ListIterator listIteratorI = i(f() >> 5);
        java.lang.Object[] objArrQ = objArr2;
        int i5 = i3;
        while (listIteratorI.previousIndex() != i4) {
            java.lang.Object[] objArr5 = (java.lang.Object[]) listIteratorI.previous();
            ajsz.dd(objArr5, objArrQ, 0, 32 - i2, 32);
            objArrQ = q(objArr5, i2);
            i5--;
            objArr[i5] = objArrQ;
        }
        java.lang.Object[] objArr6 = (java.lang.Object[]) listIteratorI.previous();
        int iF = i3 - (((f() >> 5) - 1) - i4);
        if (iF < i3) {
            java.lang.Object[] objArr7 = objArr[iF];
            aooh.c(objArr7);
            objArr3 = objArr7;
        } else {
            objArr3 = objArr2;
        }
        n(collection, i, objArr6, 32, objArr, iF, objArr3);
    }

    private final void k(java.lang.Object[] objArr, int i, java.lang.Object obj) {
        int iG = g();
        java.lang.Object[] objArrP = p(this.c);
        int i2 = i + 1;
        java.lang.Object[] objArr2 = this.c;
        if (iG >= 32) {
            java.lang.Object obj2 = objArr2[31];
            ajsz.dd(objArr2, objArrP, i2, i, 31);
            objArrP[i] = obj;
            m(objArr, objArrP, s(obj2));
            return;
        }
        ajsz.dd(objArr2, objArrP, i2, i, iG);
        objArrP[i] = obj;
        this.b = objArr;
        this.c = objArrP;
        this.d++;
    }

    private final void l(java.lang.Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.b = null;
            if (objArr == null) {
                objArr = new java.lang.Object[0];
            }
            this.c = objArr;
            this.d = i;
            this.a = 0;
            return;
        }
        xp xpVar = new xp((java.lang.Object) null);
        aooh.c(objArr);
        java.lang.Object[] objArrD = D(objArr, i2, i, xpVar);
        aooh.c(objArrD);
        java.lang.Object obj = xpVar.a;
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.c = (java.lang.Object[]) obj;
        this.d = i;
        if (objArrD[1] == null) {
            this.b = (java.lang.Object[]) objArrD[0];
            i2 -= 5;
        } else {
            this.b = objArrD;
        }
        this.a = i2;
    }

    private final void m(java.lang.Object[] objArr, java.lang.Object[] objArr2, java.lang.Object[] objArr3) {
        int i = this.d;
        int i2 = i >> 5;
        int i3 = this.a;
        if (i2 > (1 << i3)) {
            this.b = w(s(objArr), objArr2, this.a + 5);
            this.c = objArr3;
            this.a += 5;
            this.d++;
            return;
        }
        if (objArr == null) {
            this.b = objArr2;
            this.c = objArr3;
            this.d = i + 1;
        } else {
            this.b = w(objArr, objArr2, i3);
            this.c = objArr3;
            this.d++;
        }
    }

    private final void n(java.util.Collection collection, int i, java.lang.Object[] objArr, int i2, java.lang.Object[][] objArr2, int i3, java.lang.Object[] objArr3) {
        java.lang.Object[] objArrR;
        if (i3 <= 0) {
            cdh.a("requires at least one nullBuffer");
        }
        java.lang.Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        int i6 = size + 1;
        if (i5 < 32) {
            ajsz.dd(objArrP, objArr3, i6, i4, i2);
        } else {
            int i7 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i8 = i2 - i7;
            ajsz.dd(objArrP, objArr3, 0, i8, i2);
            ajsz.dd(objArrP, objArrR, i6, i4, i8);
            objArr3 = objArrR;
        }
        java.util.Iterator it = collection.iterator();
        x(objArrP, i4, it);
        for (int i9 = 1; i9 < i3; i9++) {
            java.lang.Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            objArr2[i9] = objArrR2;
        }
        x(objArr3, 0, it);
    }

    private final boolean o(java.lang.Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.h;
    }

    private final java.lang.Object[] p(java.lang.Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (o(objArr)) {
            return objArr;
        }
        java.lang.Object[] objArrR = r();
        ajsz.dl(objArr, objArrR, 0, aooc.u(objArr.length, 32), 6);
        return objArrR;
    }

    private final java.lang.Object[] q(java.lang.Object[] objArr, int i) {
        int i2 = 32 - i;
        if (o(objArr)) {
            ajsz.dd(objArr, objArr, i, 0, i2);
            return objArr;
        }
        java.lang.Object[] objArrR = r();
        ajsz.dd(objArr, objArrR, i, 0, i2);
        return objArrR;
    }

    private final java.lang.Object[] r() {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[32] = this.h;
        return objArr;
    }

    private final java.lang.Object[] s(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[33];
        objArr[0] = obj;
        objArr[32] = this.h;
        return objArr;
    }

    private final java.lang.Object[] t(java.lang.Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            cdh.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = (i >> i2) & 31;
        java.lang.Object obj = objArr[i3];
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object objT = t((java.lang.Object[]) obj, i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (o(objArr)) {
                    ajsz.dm(objArr, i4, 32);
                }
                java.lang.Object[] objArrR = r();
                ajsz.dd(objArr, objArrR, 0, 0, i4);
                objArr = objArrR;
            }
        }
        if (objT == objArr[i3]) {
            return objArr;
        }
        java.lang.Object[] objArrP = p(objArr);
        objArrP[i3] = objT;
        return objArrP;
    }

    private final java.lang.Object[] u(java.lang.Object[] objArr, int i, int i2, java.util.Iterator it) {
        if (!it.hasNext()) {
            cdh.a("invalid buffersIterator");
        }
        if (i2 < 0) {
            cdh.a("negative shift");
        }
        if (i2 == 0) {
            return (java.lang.Object[]) it.next();
        }
        java.lang.Object[] objArrP = p(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        objArrP[i3] = u((java.lang.Object[]) objArrP[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[i3] = u((java.lang.Object[]) objArrP[i3], 0, i4, it);
        }
        return objArrP;
    }

    private final java.lang.Object[] v(java.lang.Object[] objArr, int i, java.lang.Object[][] objArr2) {
        java.util.Iterator itH = aooc.H(objArr2);
        int i2 = this.a;
        java.lang.Object[] objArrU = (i >> 5) < (1 << i2) ? u(objArr, i, i2, itH) : p(objArr);
        while (itH.hasNext()) {
            this.a += 5;
            objArrU = s(objArrU);
            int i3 = this.a;
            u(objArrU, 1 << i3, i3, itH);
        }
        return objArrU;
    }

    private final java.lang.Object[] w(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        int i2 = (this.d - 1) >> i;
        java.lang.Object[] objArrP = p(objArr);
        int i3 = i2 & 31;
        if (i == 5) {
            objArrP[i3] = objArr2;
        } else {
            objArrP[i3] = w((java.lang.Object[]) objArrP[i3], objArr2, i - 5);
        }
        return objArrP;
    }

    private static final void x(java.lang.Object[] objArr, int i, java.util.Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    private static final int y(int i) {
        return i > 32 ? i - ((i - 1) & (-32)) : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int z(aonj aonjVar, java.lang.Object[] objArr, int i, int i2, xp xpVar, java.util.List list, java.util.List list2) {
        if (o(objArr)) {
            list.add(objArr);
        }
        java.lang.Object obj = xpVar.a;
        aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
        java.lang.Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj2 = objArr[i3];
            if (!((java.lang.Boolean) aonjVar.a(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !list.isEmpty() ? (java.lang.Object[]) list.remove(list.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        xpVar.a = objArrR;
        if (objArr2 != xpVar.a) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int a() {
        return this.modCount;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        a.ak(i, this.d);
        if (i == this.d) {
            add(obj);
            return;
        }
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            k(this.b, i - iF, obj);
            return;
        }
        xp xpVar = new xp((java.lang.Object) null);
        java.lang.Object[] objArr = this.b;
        aooh.c(objArr);
        k(C(objArr, this.a, i, obj, xpVar), 0, xpVar.a);
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        java.lang.Object[][] objArr;
        java.lang.Object[] objArrR;
        a.ak(i, this.d);
        if (i == this.d) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((this.d - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = (i + collection.size()) - 1;
            java.lang.Object[] objArr2 = this.c;
            java.lang.Object[] objArrP = p(objArr2);
            ajsz.dd(objArr2, objArrP, (size2 & 31) + 1, i3, g());
            x(objArrP, i3, collection.iterator());
            this.c = objArrP;
            this.d += collection.size();
        } else {
            java.lang.Object[][] objArr3 = new java.lang.Object[size][];
            int iG = g();
            int size3 = this.d + collection.size();
            if (i >= f()) {
                objArrR = r();
                n(collection, i, this.c, iG, objArr3, size, objArrR);
                objArr = objArr3;
            } else {
                objArr = objArr3;
                int iY = y(size3);
                java.lang.Object[] objArr4 = this.c;
                if (iY > iG) {
                    int i4 = iY - iG;
                    java.lang.Object[] objArrQ = q(objArr4, i4);
                    j(collection, i, i4, objArr, size, objArrQ);
                    objArrR = objArrQ;
                } else {
                    objArrR = r();
                    int i5 = iG - iY;
                    ajsz.dd(objArr4, objArrR, 0, i5, iG);
                    int i6 = 32 - i5;
                    java.lang.Object[] objArrQ2 = q(this.c, i6);
                    int i7 = size - 1;
                    objArr[i7] = objArrQ2;
                    j(collection, i, i6, objArr, i7, objArrQ2);
                }
            }
            this.b = v(this.b, i2, objArr);
            this.c = objArrR;
            this.d += collection.size();
        }
        return true;
    }

    public final int b() {
        return this.d;
    }

    public final chm c() {
        chm chsVar;
        java.lang.Object[] objArr = this.b;
        if (objArr == this.f && this.c == this.g) {
            chsVar = this.e;
        } else {
            this.h = new cfd();
            this.f = objArr;
            java.lang.Object[] objArr2 = this.c;
            this.g = objArr2;
            if (objArr != null) {
                chsVar = new defpackage.chs(objArr, objArr2, this.d, this.a);
            } else if (objArr2.length == 0) {
                chsVar = chx.a;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(this.c, this.d);
                aooh.e(objArrCopyOf, "copyOf(...)");
                chsVar = new chx(objArrCopyOf);
            }
        }
        this.e = chsVar;
        return chsVar;
    }

    public final java.lang.Object d(int i) {
        a.aj(i, this.d);
        this.modCount++;
        int iF = f();
        if (i >= iF) {
            return h(this.b, iF, this.a, i - iF);
        }
        xp xpVar = new xp(this.c[0]);
        java.lang.Object[] objArr = this.b;
        aooh.c(objArr);
        h(E(objArr, this.a, i, xpVar), iF, this.a, 0);
        return xpVar.a;
    }

    public final boolean e(aonj aonjVar) {
        int i;
        aonj aonjVar2 = aonjVar;
        int iG = g();
        java.lang.Object[] objArrT = null;
        xp xpVar = new xp((java.lang.Object) null);
        boolean z = false;
        if (this.b != null) {
            java.util.ListIterator listIteratorI = i(0);
            int iA = 32;
            while (iA == 32) {
                if (!listIteratorI.hasNext()) {
                    iA = 32;
                    break;
                }
                iA = A(aonjVar2, (java.lang.Object[]) listIteratorI.next(), 32, xpVar);
            }
            if (iA == 32) {
                int iB = B(aonjVar2, iG, xpVar);
                if (iB == 0) {
                    l(this.b, this.d, this.a);
                    iB = 0;
                }
                if (iB != iG) {
                }
            } else {
                int iPreviousIndex = listIteratorI.previousIndex() << 5;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int iZ = iA;
                while (listIteratorI.hasNext()) {
                    iZ = z(aonjVar2, (java.lang.Object[]) listIteratorI.next(), 32, iZ, xpVar, arrayList2, arrayList);
                    aonjVar2 = aonjVar;
                }
                int iZ2 = z(aonjVar, this.c, iG, iZ, xpVar, arrayList2, arrayList);
                java.lang.Object obj = xpVar.a;
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                ajsz.dm(objArr, iZ2, 32);
                boolean zIsEmpty = arrayList.isEmpty();
                java.lang.Object[] objArrU = this.b;
                if (zIsEmpty) {
                    aooh.c(objArrU);
                } else {
                    objArrU = u(objArrU, iPreviousIndex, this.a, arrayList.iterator());
                }
                int size = iPreviousIndex + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    cdh.a("invalid size");
                }
                if (size == 0) {
                    this.a = 0;
                } else {
                    int i2 = size - 1;
                    while (true) {
                        i = this.a;
                        if ((i2 >> i) != 0) {
                            break;
                        }
                        this.a = i - 5;
                        java.lang.Object[] objArr2 = objArrU[0];
                        aooh.d(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrU = objArr2;
                    }
                    objArrT = t(objArrU, i2, i);
                }
                this.b = objArrT;
                this.c = objArr;
                this.d = size + iZ2;
            }
            z = true;
        } else if (B(aonjVar2, iG, xpVar) != iG) {
            z = true;
        }
        if (z) {
            this.modCount++;
        }
        return z;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr;
        a.aj(i, this.d);
        if (f() <= i) {
            objArr = this.c;
        } else {
            java.lang.Object[] objArr2 = this.b;
            aooh.c(objArr2);
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                java.lang.Object[] objArr3 = objArr2[(i >> i2) & 31];
                aooh.d(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        a.ak(i, this.d);
        return new defpackage.chv(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return e(new clc(collection, 1));
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        a.aj(i, this.d);
        if (f() > i) {
            xp xpVar = new xp((java.lang.Object) null);
            java.lang.Object[] objArr = this.b;
            aooh.c(objArr);
            this.b = F(objArr, this.a, i, obj, xpVar);
            return xpVar.a;
        }
        java.lang.Object[] objArrP = p(this.c);
        if (objArrP != this.c) {
            this.modCount++;
        }
        int i2 = i & 31;
        java.lang.Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.c = objArrP;
        return obj2;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        this.modCount++;
        int iG = g();
        if (iG < 32) {
            java.lang.Object[] objArrP = p(this.c);
            objArrP[iG] = obj;
            this.c = objArrP;
            this.d++;
        } else {
            m(this.b, this.c, s(obj));
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int iG = g();
        java.util.Iterator it = collection.iterator();
        if (32 - iG >= collection.size()) {
            java.lang.Object[] objArrP = p(this.c);
            x(objArrP, iG, it);
            this.c = objArrP;
            this.d += collection.size();
        } else {
            int size = ((collection.size() + iG) - 1) / 32;
            java.lang.Object[][] objArr = new java.lang.Object[size][];
            java.lang.Object[] objArrP2 = p(this.c);
            x(objArrP2, iG, it);
            objArr[0] = objArrP2;
            for (int i = 1; i < size; i++) {
                java.lang.Object[] objArrR = r();
                x(objArrR, 0, it);
                objArr[i] = objArrR;
            }
            this.b = v(this.b, f(), objArr);
            java.lang.Object[] objArrR2 = r();
            x(objArrR2, 0, it);
            this.c = objArrR2;
            this.d += collection.size();
        }
        return true;
    }
}
