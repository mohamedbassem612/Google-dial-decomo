package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class ckk extends defpackage.cko {
    private static final int[] l = new int[0];
    public final defpackage.aonj a;
    public final defpackage.aonj b;
    public int c;
    public defpackage.ckv d;
    public int[] e;
    public boolean f;
    public defpackage.ady g;
    private java.util.List m;
    private int n;

    public ckk(long j, defpackage.ckv ckvVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        super(j, ckvVar);
        this.a = aonjVar;
        this.b = aonjVar2;
        this.d = defpackage.ckv.a;
        this.e = l;
        this.n = 1;
    }

    private final void D() {
        if (!this.f || this.k >= 0) {
            return;
        }
        defpackage.cdh.b("Unsupported operation on a disposed or applied snapshot");
    }

    public defpackage.ckk a(defpackage.aonj aonjVar, defpackage.aonj aonjVar2) {
        ckl cklVar;
        C();
        D();
        o(v());
        synchronized (defpackage.ckw.b) {
            long j = defpackage.ckw.d;
            defpackage.ckw.d = j + 1;
            defpackage.ckw.c = defpackage.ckw.c.d(j);
            defpackage.ckv ckvVarX = x();
            A(ckvVarX.d(j));
            cklVar = new ckl(j, defpackage.ckw.d(ckvVarX, v() + 1, j), defpackage.ckw.o(aonjVar, i(), true), defpackage.ckw.p(aonjVar2, k()), this);
        }
        if (!this.f && !this.j) {
            long jV = v();
            synchronized (defpackage.ckw.b) {
                long j2 = defpackage.ckw.d;
                defpackage.ckw.d = j2 + 1;
                B(j2);
                defpackage.ckw.c = defpackage.ckw.c.d(v());
            }
            A(defpackage.ckw.d(x(), jV + 1, v()));
        }
        return cklVar;
    }

    @Override // defpackage.cko
    public defpackage.cko b(defpackage.aonj aonjVar) {
        ckm ckmVar;
        C();
        D();
        long jV = v();
        o(v());
        synchronized (defpackage.ckw.b) {
            long j = defpackage.ckw.d;
            defpackage.ckw.d = j + 1;
            defpackage.ckw.c = defpackage.ckw.c.d(j);
            ckmVar = new ckm(j, defpackage.ckw.d(x(), jV + 1, j), defpackage.ckw.o(aonjVar, i(), true), this);
        }
        if (!this.f && !this.j) {
            long jV2 = v();
            synchronized (defpackage.ckw.b) {
                long j2 = defpackage.ckw.d;
                defpackage.ckw.d = j2 + 1;
                B(j2);
                defpackage.ckw.c = defpackage.ckw.c.d(v());
            }
            A(defpackage.ckw.d(x(), jV2 + 1, v()));
        }
        return ckmVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013f A[EDGE_INSN: B:100:0x013f->B:74:0x013f BREAK  A[LOOP:4: B:63:0x0110->B:73:0x013c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[Catch: all -> 0x015c, LOOP:2: B:47:0x00ce->B:57:0x00fd, LOOP_END, TryCatch #0 {, blocks: (B:42:0x00b2, B:44:0x00c2, B:47:0x00ce, B:49:0x00da, B:51:0x00e4, B:53:0x00ea, B:54:0x00f5, B:60:0x0106, B:63:0x0110, B:65:0x011a, B:67:0x0124, B:69:0x012a, B:70:0x0134, B:73:0x013c, B:74:0x013f, B:76:0x0143, B:78:0x014a, B:79:0x0156, B:57:0x00fd), top: B:89:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:72:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x013c A[Catch: all -> 0x015c, LOOP:4: B:63:0x0110->B:73:0x013c, LOOP_END, TryCatch #0 {, blocks: (B:42:0x00b2, B:44:0x00c2, B:47:0x00ce, B:49:0x00da, B:51:0x00e4, B:53:0x00ea, B:54:0x00f5, B:60:0x0106, B:63:0x0110, B:65:0x011a, B:67:0x0124, B:69:0x012a, B:70:0x0134, B:73:0x013c, B:74:0x013f, B:76:0x0143, B:78:0x014a, B:79:0x0156, B:57:0x00fd), top: B:89:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0104 A[EDGE_INSN: B:95:0x0104->B:59:0x0104 BREAK  A[LOOP:2: B:47:0x00ce->B:57:0x00fd], SYNTHETIC] */
    public defpackage.cks c() {
        java.util.List list;
        defpackage.ady adyVar;
        long j;
        long j2;
        defpackage.ady adyVarS = s();
        java.util.Map mapN = (adyVarS == null || !adyVarS.c()) ? null : defpackage.ckw.n(defpackage.ckw.h.i, this, defpackage.ckw.c);
        defpackage.aokc aokcVar = defpackage.aokc.a;
        synchronized (defpackage.ckw.b) {
            defpackage.ckw.t(this);
            if (adyVarS == null || adyVarS.d == 0) {
                m();
                defpackage.ckf ckfVar = defpackage.ckw.h;
                defpackage.ady adyVar2 = ckfVar.g;
                defpackage.ckw.m(ckfVar, defpackage.ckw.a);
                if (adyVar2 == null || !adyVar2.c()) {
                    list = aokcVar;
                    adyVar = null;
                } else {
                    list = defpackage.ckw.f;
                    adyVar = adyVar2;
                }
            } else {
                defpackage.ckf ckfVar2 = defpackage.ckw.h;
                defpackage.cks cksVarT = t(defpackage.ckw.d, adyVarS, mapN, defpackage.ckw.c);
                if (!defpackage.aooh.n(cksVarT, defpackage.ckr.a)) {
                    return cksVarT;
                }
                m();
                adyVar = ckfVar2.g;
                defpackage.ckw.m(ckfVar2, defpackage.ckw.a);
                u(null);
                ckfVar2.g = null;
                list = defpackage.ckw.f;
            }
            this.f = true;
            if (adyVar != null) {
                defpackage.cff cffVar = new defpackage.cff(adyVar);
                if (!cffVar.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((defpackage.aonn) list.get(i)).a(cffVar, this);
                    }
                }
            }
            if (adyVarS != null && adyVarS.c()) {
                defpackage.cff cffVar2 = new defpackage.cff(adyVarS);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((defpackage.aonn) list.get(i2)).a(cffVar2, this);
                }
            }
            synchronized (defpackage.ckw.b) {
                p();
                defpackage.ckw.q();
                if (adyVar != null) {
                    java.lang.Object[] objArr = adyVar.b;
                    long[] jArr = adyVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        j = 128;
                        while (true) {
                            long j3 = jArr[i3];
                            j2 = 255;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j3 & 255) < 128) {
                                        defpackage.ckw.s((defpackage.clr) objArr[(i3 << 3) + i5]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    } else {
                        j = 128;
                        j2 = 255;
                    }
                } else {
                    j = 128;
                    j2 = 255;
                }
                if (adyVarS != null) {
                    java.lang.Object[] objArr2 = adyVarS.b;
                    long[] jArr2 = adyVarS.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j4 = jArr2[i6];
                            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i6 != length2) {
                                    break;
                                    break;
                                }
                                i6++;
                            } else {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j4 & j2) < j) {
                                        defpackage.ckw.s((defpackage.clr) objArr2[(i6 << 3) + i8]);
                                    }
                                    j4 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                                if (i6 != length2) {
                                    break;
                                }
                                i6++;
                            }
                        }
                    }
                }
                java.util.List list2 = this.m;
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        defpackage.ckw.s((defpackage.clr) list2.get(i9));
                    }
                }
                this.m = null;
            }
            return defpackage.ckr.a;
        }
    }

    @Override // defpackage.cko
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.cko
    public void e() {
        if (this.f || this.j) {
            return;
        }
        l();
    }

    @Override // defpackage.cko
    public void f() {
        this.n++;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d A[LOOP:0: B:17:0x0038->B:35:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090 A[EDGE_INSN: B:39:0x0090->B:36:0x0090 BREAK  A[LOOP:0: B:17:0x0038->B:35:0x008d], SYNTHETIC] */
    @Override // defpackage.cko
    public void g() {
        int i;
        if (this.n <= 0) {
            defpackage.cdh.a("no pending nested snapshots");
        }
        int i2 = this.n - 1;
        this.n = i2;
        if (i2 != 0 || this.f) {
            return;
        }
        defpackage.ady adyVarS = s();
        if (adyVarS != null) {
            if (this.f) {
                defpackage.cdh.b("Unsupported operation on a snapshot that has been applied");
            }
            u(null);
            long jV = v();
            java.lang.Object[] objArr = adyVarS.b;
            long[] jArr = adyVarS.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = ~(i3 - length);
                        int i5 = 0;
                        while (true) {
                            i = 8 - (i4 >>> 31);
                            if (i5 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                for (defpackage.clt cltVarD = ((defpackage.clr) objArr[(i3 << 3) + i5]).d(); cltVarD != null; cltVarD = cltVarD.h) {
                                    long j2 = cltVarD.g;
                                    if (j2 == jV || defpackage.ajsz.cj(this.d, java.lang.Long.valueOf(j2))) {
                                        defpackage.aonj aonjVar = defpackage.ckw.a;
                                        cltVarD.g = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        y();
    }

    @Override // defpackage.cko
    public int h() {
        return this.c;
    }

    @Override // defpackage.cko
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public defpackage.aonj i() {
        return this.a;
    }

    @Override // defpackage.cko
    public defpackage.aonj k() {
        return this.b;
    }

    public final void l() {
        o(v());
        if (this.f || this.j) {
            return;
        }
        long jV = v();
        synchronized (defpackage.ckw.b) {
            long j = defpackage.ckw.d;
            defpackage.ckw.d = j + 1;
            B(j);
            defpackage.ckw.c = defpackage.ckw.c.d(v());
        }
        A(defpackage.ckw.d(x(), jV + 1, v()));
    }

    @Override // defpackage.cko
    public final void m() {
        defpackage.ckw.c = defpackage.ckw.c.b(v()).a(this.d);
    }

    @Override // defpackage.cko
    public void n(defpackage.clr clrVar) {
        defpackage.ady adyVarS = s();
        if (adyVarS == null) {
            defpackage.ady adyVar = defpackage.adz.a;
            adyVarS = new defpackage.ady(6);
            u(adyVarS);
        }
        adyVarS.j(clrVar);
    }

    public final void o(long j) {
        synchronized (defpackage.ckw.b) {
            this.d = this.d.d(j);
        }
    }

    @Override // defpackage.cko
    public final void p() {
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            defpackage.ckw.e.b(this.e[i]);
        }
        z();
    }

    @Override // defpackage.cko
    public void q(int i) {
        this.c = i;
    }

    @Override // defpackage.cko
    public boolean r() {
        return false;
    }

    public defpackage.ady s() {
        return this.g;
    }

    public final defpackage.cks t(long j, defpackage.ady adyVar, java.util.Map map, defpackage.ckv ckvVar) {
        java.lang.Object[] objArr;
        long[] jArr;
        java.util.ArrayList arrayList;
        java.lang.Object[] objArr2;
        long[] jArr2;
        char c;
        java.util.ArrayList arrayList2;
        java.util.List list;
        long j2;
        defpackage.clt cltVarJ;
        defpackage.clt cltVarG;
        defpackage.ckv ckvVarC = x().d(v()).c(this.d);
        java.lang.Object[] objArr3 = adyVar.b;
        long[] jArr3 = adyVar.a;
        int length = jArr3.length - 2;
        java.util.ArrayList arrayList3 = null;
        java.util.List listBT = null;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j3 = jArr3[i];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            objArr = objArr3;
                            jArr = jArr3;
                            java.util.ArrayList arrayList4 = arrayList3;
                            java.util.List list2 = listBT;
                            if (i4 != 8) {
                                arrayList3 = arrayList4;
                                listBT = list2;
                                break;
                            }
                            arrayList = arrayList4;
                            listBT = list2;
                            break;
                        }
                        if ((j3 & 255) < 128) {
                            defpackage.clr clrVar = (defpackage.clr) objArr3[(i << 3) + i3];
                            c = '\b';
                            defpackage.clt cltVarD = clrVar.d();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            arrayList2 = arrayList3;
                            list = listBT;
                            defpackage.clt cltVarJ2 = defpackage.ckw.j(cltVarD, j, ckvVar);
                            if (cltVarJ2 != null && (cltVarJ = defpackage.ckw.j(cltVarD, v(), ckvVarC)) != null) {
                                j2 = j3;
                                if (cltVarJ.g != 1 && !defpackage.aooh.n(cltVarJ2, cltVarJ)) {
                                    defpackage.clt cltVarJ3 = defpackage.ckw.j(cltVarD, v(), x());
                                    if (cltVarJ3 == null) {
                                        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
                                    }
                                    if (map == null || (cltVarG = (defpackage.clt) map.get(cltVarJ2)) == null) {
                                        cltVarG = clrVar.g(cltVarJ, cltVarJ2, cltVarJ3);
                                    }
                                    if (cltVarG == null) {
                                        return new defpackage.ckq(this);
                                    }
                                    if (!defpackage.aooh.n(cltVarG, cltVarJ3)) {
                                        if (defpackage.aooh.n(cltVarG, cltVarJ2)) {
                                            java.util.ArrayList arrayList5 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                                            arrayList5.add(new defpackage.aoiu(clrVar, cltVarJ2.b(v())));
                                            listBT = list == null ? new java.util.ArrayList() : list;
                                            listBT.add(clrVar);
                                            arrayList2 = arrayList5;
                                        } else {
                                            java.util.ArrayList arrayList6 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                                            arrayList6.add(!defpackage.aooh.n(cltVarG, cltVarJ) ? new defpackage.aoiu(clrVar, cltVarG) : new defpackage.aoiu(clrVar, cltVarJ.b(v())));
                                            arrayList2 = arrayList6;
                                        }
                                    }
                                }
                                j3 = j2 >> c;
                                i3++;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                                arrayList3 = arrayList2;
                            }
                            listBT = list;
                            j3 = j2 >> c;
                            i3++;
                            objArr3 = objArr2;
                            jArr3 = jArr2;
                            arrayList3 = arrayList2;
                        } else {
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            c = '\b';
                            arrayList2 = arrayList3;
                            list = listBT;
                        }
                        j2 = j3;
                        listBT = list;
                        j3 = j2 >> c;
                        i3++;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        arrayList3 = arrayList2;
                    }
                } else {
                    objArr = objArr3;
                    jArr = jArr3;
                    arrayList = arrayList3;
                }
                if (i == length) {
                    arrayList3 = arrayList;
                    break;
                }
                i++;
                arrayList3 = arrayList;
                objArr3 = objArr;
                jArr3 = jArr;
            }
        }
        if (arrayList3 != null) {
            l();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                defpackage.aoiu aoiuVar = (defpackage.aoiu) arrayList3.get(i5);
                defpackage.clr clrVar2 = (defpackage.clr) aoiuVar.a;
                defpackage.clt cltVar = (defpackage.clt) aoiuVar.b;
                cltVar.g = v();
                synchronized (defpackage.ckw.b) {
                    cltVar.h = clrVar2.d();
                    clrVar2.e(cltVar);
                }
            }
        }
        if (listBT != null) {
            int size2 = listBT.size();
            for (int i6 = 0; i6 < size2; i6++) {
                adyVar.l((defpackage.clr) listBT.get(i6));
            }
            java.util.List list3 = this.m;
            if (list3 != null) {
                listBT = defpackage.ajsz.bT(list3, listBT);
            }
            this.m = listBT;
        }
        return defpackage.ckr.a;
    }

    public void u(defpackage.ady adyVar) {
        this.g = adyVar;
    }
}
