package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fxy {
    public boolean a;
    public boolean b;
    public java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public final java.lang.Object h;

    public fxy(defpackage.apnt apntVar) {
        this.c = null;
        this.h = apntVar;
        this.b = true;
        this.d = new defpackage.fye();
        defpackage.ads adsVar = defpackage.adt.a;
        this.e = new defpackage.ads(6);
        this.f = new defpackage.ads(6);
        this.g = new defpackage.ads(6);
    }

    private final void k(defpackage.dtr dtrVar, int i, java.util.ArrayList arrayList) {
        defpackage.fxy fxyVar;
        dtj dtjVar = dtrVar.h;
        for (defpackage.dti dtiVar : dtjVar.j) {
            if (dtiVar instanceof dtj) {
                this.m((dtj) dtiVar, i, dtrVar.i, arrayList, null);
            } else {
                this = this;
                int i2 = i;
                java.util.ArrayList arrayList2 = arrayList;
                if (dtiVar instanceof defpackage.dtr) {
                    this.m(((defpackage.dtr) dtiVar).h, i2, dtrVar.i, arrayList2, null);
                    i = i2;
                } else {
                    i = i2;
                }
                arrayList = arrayList2;
            }
        }
        defpackage.fxy fxyVar2 = this;
        int i3 = i;
        java.util.ArrayList arrayList3 = arrayList;
        for (defpackage.dti dtiVar2 : dtrVar.i.j) {
            if (dtiVar2 instanceof dtj) {
                fxyVar = fxyVar2;
                fxyVar.m((dtj) dtiVar2, i3, dtjVar, arrayList3, null);
            } else if (dtiVar2 instanceof defpackage.dtr) {
                fxyVar = fxyVar2;
                fxyVar.m(((defpackage.dtr) dtiVar2).i, i3, dtjVar, arrayList3, null);
            }
            fxyVar2 = fxyVar;
        }
        if (i3 == 1) {
            for (defpackage.dti dtiVar3 : ((dtp) dtrVar).a.j) {
                if (dtiVar3 instanceof dtj) {
                    fxyVar2.m((dtj) dtiVar3, 1, null, arrayList3, null);
                }
            }
        }
    }

    private final void l(defpackage.dsy dsyVar, int i, int i2, int i3, int i4) {
        defpackage.dtg dtgVar = (defpackage.dtg) this.g;
        dtgVar.i = i;
        dtgVar.j = i3;
        dtgVar.a = i2;
        dtgVar.b = i4;
        ((defpackage.dtw) this.c).a(dsyVar, dtgVar);
        dsyVar.C(dtgVar.c);
        dsyVar.x(dtgVar.d);
        dsyVar.F = dtgVar.f;
        dsyVar.u(dtgVar.e);
    }

    private final void m(dtj dtjVar, int i, dtj dtjVar2, java.util.ArrayList arrayList, hjx hjxVar) {
        dtp dtpVar = dtjVar.d;
        if (dtpVar.l == null) {
            defpackage.dsz dszVar = (defpackage.dsz) this.f;
            if (dtpVar == dszVar.h || dtpVar == dszVar.i) {
                return;
            }
            if (hjxVar == null) {
                hjxVar = new hjx(dtpVar);
                arrayList.add(hjxVar);
            }
            hjx hjxVar2 = hjxVar;
            dtpVar.l = hjxVar2;
            ((java.util.ArrayList) hjxVar2.b).add(dtpVar);
            dtj dtjVar3 = dtpVar.h;
            for (defpackage.dti dtiVar : dtjVar3.j) {
                if (dtiVar instanceof dtj) {
                    m((dtj) dtiVar, i, dtjVar2, arrayList, hjxVar2);
                }
            }
            dtj dtjVar4 = dtpVar.i;
            for (defpackage.dti dtiVar2 : dtjVar4.j) {
                if (dtiVar2 instanceof dtj) {
                    m((dtj) dtiVar2, i, dtjVar2, arrayList, hjxVar2);
                }
            }
            if (i == 1 && (dtpVar instanceof dtp)) {
                for (defpackage.dti dtiVar3 : dtpVar.a.j) {
                    if (dtiVar3 instanceof dtj) {
                        m((dtj) dtiVar3, 1, dtjVar2, arrayList, hjxVar2);
                    }
                }
            }
            java.util.Iterator it = dtjVar3.k.iterator();
            while (it.hasNext()) {
                m((dtj) it.next(), i, dtjVar2, arrayList, hjxVar2);
            }
            java.util.Iterator it2 = dtjVar4.k.iterator();
            while (it2.hasNext()) {
                m((dtj) it2.next(), i, dtjVar2, arrayList, hjxVar2);
            }
            if (i == 1 && (dtpVar instanceof dtp)) {
                java.util.Iterator it3 = dtpVar.a.k.iterator();
                while (it3.hasNext()) {
                    m((dtj) it3.next(), 1, dtjVar2, arrayList, hjxVar2);
                }
            }
        }
    }

    public final void a(defpackage.fyd fydVar) {
        if (fydVar == null) {
            defpackage.aooh.i("input");
        }
        c();
        if (((defpackage.ads) this.g).f(fydVar)) {
            ((defpackage.fye) this.d).b(this, fydVar, -1);
        }
    }

    public final void b(defpackage.fyd fydVar, int i) {
        c();
        if (i != 1) {
            i = 0;
        }
        if (((defpackage.ads) this.g).f(fydVar)) {
            ((defpackage.fye) this.d).b(this, fydVar, i);
        }
    }

    public final void c() {
        if (this.a) {
            throw new java.lang.IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void d(boolean z) {
        c();
        if (this.b != z) {
            this.b = z;
            ((defpackage.fye) this.d).c();
        }
    }

    public final void e(defpackage.fya fyaVar) {
        if (fyaVar == null) {
            defpackage.aooh.i("handler");
        }
        c();
        if (((defpackage.ads) this.f).f(fyaVar)) {
            java.lang.Object obj = this.d;
            if (fyaVar == null) {
                defpackage.aooh.i("handler");
            }
            if (fyaVar.e != null) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bg(fyaVar, "Handler '", "' is already registered with a dispatcher"));
            }
            defpackage.fye fyeVar = (defpackage.fye) obj;
            fyeVar.b.addFirst(fyaVar);
            fyaVar.e = this;
            fyeVar.c();
        }
    }

    public final void f(defpackage.fyd fydVar, fxx fxxVar) {
        c();
        if (this.b) {
            defpackage.fye fyeVar = (defpackage.fye) this.d;
            if (fyeVar.d == 0) {
                defpackage.fya fyaVarA = fyeVar.a(-1);
                fyeVar.c = fyaVarA;
                fyeVar.d = -1;
                fyeVar.e = fydVar;
                if (fxxVar != null) {
                    if (fyaVarA != null) {
                        fyaVarA.d(fxxVar);
                    }
                    fyeVar.f.e(new fyg(fxxVar));
                }
            }
        }
    }

    public final int g(defpackage.dsz dszVar, int i) {
        java.util.ArrayList arrayList;
        long jA;
        dtj dtjVar;
        dtj dtjVar2;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) this.d;
        int size = arrayList2.size();
        int i2 = 0;
        long j = 0;
        long jMax = 0;
        while (i2 < size) {
            hjx hjxVar = (hjx) arrayList2.get(i2);
            java.lang.Object obj = hjxVar.a;
            if (!(obj instanceof dth) ? !(i != 0 ? (obj instanceof dtp) : (obj instanceof dto)) : ((dth) obj).f != i) {
                if (i == 0) {
                    dtjVar = dszVar.h.h;
                    dtjVar2 = dszVar.h.i;
                } else {
                    dtjVar = dszVar.i.h;
                    dtjVar2 = dszVar.i.i;
                }
                boolean zContains = ((defpackage.dtr) obj).h.k.contains(dtjVar);
                boolean zContains2 = ((defpackage.dtr) hjxVar.a).i.k.contains(dtjVar2);
                long jA2 = ((defpackage.dtr) hjxVar.a).a();
                if (!zContains) {
                    arrayList = arrayList2;
                    if (zContains2) {
                        dtj dtjVar3 = ((defpackage.dtr) hjxVar.a).i;
                        jA = java.lang.Math.max(-hjxVar.j(dtjVar3, dtjVar3.e), ((long) (-((defpackage.dtr) hjxVar.a).i.e)) + jA2);
                    } else {
                        defpackage.dtr dtrVar = (defpackage.dtr) hjxVar.a;
                        jA = (((long) dtrVar.h.e) + dtrVar.a()) - ((long) ((defpackage.dtr) hjxVar.a).i.e);
                    }
                } else if (zContains2) {
                    long jK = hjxVar.k(((defpackage.dtr) hjxVar.a).h, j);
                    long j2 = hjxVar.j(((defpackage.dtr) hjxVar.a).i, j);
                    long j3 = jK - jA2;
                    defpackage.dtr dtrVar2 = (defpackage.dtr) hjxVar.a;
                    int i3 = dtrVar2.i.e;
                    arrayList = arrayList2;
                    long j4 = i3;
                    if (j3 >= (-i3)) {
                        j3 += j4;
                    }
                    long j5 = (-j2) - jA2;
                    long j6 = dtrVar2.h.e;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    defpackage.dsy dsyVar = dtrVar2.d;
                    float f = i == 0 ? dsyVar.ae : dsyVar.af;
                    float f2 = 1.0f - f;
                    float f3 = f > 0.0f ? (long) ((j7 / f) + (j3 / f2)) : 0L;
                    jA = (j6 + ((((long) ((f * f3) + 0.5f)) + jA2) + ((long) ((f3 * f2) + 0.5f)))) - j4;
                } else {
                    arrayList = arrayList2;
                    dtj dtjVar4 = ((defpackage.dtr) hjxVar.a).h;
                    jA = java.lang.Math.max(hjxVar.k(dtjVar4, dtjVar4.e), ((long) ((defpackage.dtr) hjxVar.a).h.e) + jA2);
                }
            } else {
                arrayList = arrayList2;
                jA = j;
            }
            jMax = java.lang.Math.max(jMax, jA);
            i2++;
            arrayList2 = arrayList;
            j = 0;
        }
        return (int) jMax;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final void h() {
        ?? r0 = this.h;
        java.util.ArrayList arrayList = (java.util.ArrayList) r0;
        arrayList.clear();
        java.lang.Object obj = this.e;
        defpackage.dsz dszVar = (defpackage.dsz) obj;
        dszVar.h.d();
        dszVar.i.d();
        arrayList.add(dszVar.h);
        arrayList.add(dszVar.i);
        java.util.ArrayList arrayList2 = dszVar.aI;
        int size = arrayList2.size();
        java.util.HashSet hashSet = null;
        for (int i = 0; i < size; i++) {
            defpackage.dsy dsyVar = (defpackage.dsy) arrayList2.get(i);
            if (dsyVar instanceof defpackage.dtb) {
                arrayList.add(new dtm(dsyVar));
            } else {
                if (dsyVar.H()) {
                    if (dsyVar.f == null) {
                        dsyVar.f = new dth(dsyVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(dsyVar.f);
                } else {
                    arrayList.add(dsyVar.h);
                }
                if (dsyVar.I()) {
                    if (dsyVar.g == null) {
                        dsyVar.g = new dth(dsyVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new java.util.HashSet();
                    }
                    hashSet.add(dsyVar.g);
                } else {
                    arrayList.add(dsyVar.i);
                }
                if (dsyVar instanceof defpackage.dtc) {
                    arrayList.add(new dtn(dsyVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        int size2 = r0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((defpackage.dtr) r0.get(i2)).d();
        }
        int size3 = r0.size();
        for (int i3 = 0; i3 < size3; i3++) {
            defpackage.dtr dtrVar = (defpackage.dtr) r0.get(i3);
            if (dtrVar.d != obj) {
                dtrVar.b();
            }
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.d;
        arrayList3.clear();
        hjx.c = 0;
        defpackage.dsz dszVar2 = (defpackage.dsz) this.f;
        k(dszVar2.h, 0, arrayList3);
        k(dszVar2.i, 1, arrayList3);
        this.a = false;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    public final void i() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        defpackage.fxy fxyVar;
        dtk dtkVar;
        java.util.ArrayList arrayList = ((defpackage.dsz) this.f).aI;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            defpackage.dsy dsyVar = (defpackage.dsy) arrayList.get(i3);
            if (dsyVar.e) {
                fxyVar = this;
            } else {
                int[] iArr = dsyVar.aq;
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = dsyVar.s;
                int i7 = dsyVar.t;
                if (i4 == 2) {
                    i = i4;
                    z = true;
                } else if (i4 == 3) {
                    z = i6 == 1;
                    i = 3;
                } else {
                    i = i4;
                    z = false;
                }
                if (i5 == 2) {
                    i2 = i5;
                    z2 = true;
                } else if (i5 == 3) {
                    z2 = i7 == 1;
                    i2 = 3;
                } else {
                    i2 = i5;
                    z2 = false;
                }
                dtk dtkVar2 = dsyVar.h.e;
                boolean z3 = dtkVar2.i;
                dtk dtkVar3 = dsyVar.i.e;
                boolean z4 = dtkVar3.i;
                if (!z3) {
                    fxyVar = this;
                    if (z4 && z) {
                        fxyVar.l(dsyVar, 2, dtkVar2.f, 1, dtkVar3.f);
                        if (i == 3) {
                            dsyVar.h.e.m = dsyVar.j();
                        } else {
                            dsyVar.h.e.c(dsyVar.j());
                            dsyVar.e = true;
                        }
                    }
                } else if (z4) {
                    fxyVar = this;
                    fxyVar.l(dsyVar, 1, dtkVar2.f, 1, dtkVar3.f);
                    dsyVar.e = true;
                } else if (z2) {
                    fxyVar = this;
                    fxyVar.l(dsyVar, 1, dtkVar2.f, 2, dtkVar3.f);
                    if (i2 == 3) {
                        dsyVar.i.e.m = dsyVar.h();
                    } else {
                        dsyVar.i.e.c(dsyVar.h());
                        dsyVar.e = true;
                    }
                } else {
                    fxyVar = this;
                    if (z4) {
                        fxyVar.l(dsyVar, 2, dtkVar2.f, 1, dtkVar3.f);
                        if (i == 3) {
                            dsyVar.h.e.m = dsyVar.j();
                        } else {
                            dsyVar.h.e.c(dsyVar.j());
                            dsyVar.e = true;
                        }
                    }
                }
                if (dsyVar.e && (dtkVar = dsyVar.i.b) != null) {
                    dtkVar.c(dsyVar.ab);
                }
            }
            i3++;
            this = fxyVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0242  */
    /* JADX WARN: Code duplicated, block: B:103:0x0244 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:120:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[PHI: r7
      0x00af: PHI (r7v6 int) = (r7v3 int), (r7v2 int) binds: [B:56:0x00ad, B:52:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    /* JADX WARN: Code duplicated, block: B:80:0x017e A[ADDED_TO_REGION] */
    public final void j(defpackage.dsz dszVar) {
        char c;
        int iJ;
        int iH;
        int i;
        int i2;
        float f;
        float f2;
        java.util.ArrayList arrayList = dszVar.aI;
        int size = arrayList.size();
        char c2 = 0;
        int i3 = 0;
        while (i3 < size) {
            defpackage.dsy dsyVar = (defpackage.dsy) arrayList.get(i3);
            int[] iArr = dsyVar.aq;
            int i4 = iArr[c2];
            int i5 = iArr[1];
            if (dsyVar.ah == 8) {
                dsyVar.e = true;
                c = c2;
            } else {
                float f3 = dsyVar.x;
                int i6 = 2;
                if (f3 < 1.0f && i4 == 3) {
                    dsyVar.s = 2;
                    i4 = 3;
                }
                float f4 = dsyVar.A;
                if (f4 < 1.0f && i5 == 3) {
                    dsyVar.t = 2;
                    i5 = 3;
                }
                if (dsyVar.X > 0.0f) {
                    if (i4 == 3 && (i5 == 2 || i5 == 1)) {
                        dsyVar.s = 3;
                    } else if (i5 == 3 && (i4 == 2 || i4 == 1)) {
                        dsyVar.t = 3;
                    } else if (i4 == 3 && i5 == 3) {
                        if (dsyVar.s == 0) {
                            dsyVar.s = 3;
                        }
                        if (dsyVar.t == 0) {
                            dsyVar.t = 3;
                        }
                    }
                }
                if (i4 == 3 && dsyVar.s == 1 && (dsyVar.J.e == null || dsyVar.L.e == null)) {
                    i4 = 2;
                }
                if (i5 == 3 && dsyVar.t == 1 && (dsyVar.K.e == null || dsyVar.M.e == null)) {
                    i5 = 2;
                }
                dto dtoVar = dsyVar.h;
                dtoVar.j = i4;
                int i7 = dsyVar.s;
                dtoVar.c = i7;
                dtp dtpVar = dsyVar.i;
                dtpVar.j = i5;
                c = c2;
                int i8 = dsyVar.t;
                dtpVar.c = i8;
                if (i4 == 4 || i4 == 1) {
                    if (i5 != 4 || i5 == 1) {
                        i6 = i5;
                    } else if (i5 != 2) {
                        if (i4 == 3 || !(i5 == 2 || i5 == 1)) {
                            i2 = i5;
                            f = f4;
                            f2 = 1.0f;
                        } else if (i7 == 3) {
                            if (i5 == 2) {
                                l(dsyVar, 2, 0, 2, 0);
                            }
                            int iH2 = dsyVar.h();
                            l(dsyVar, 1, (int) ((iH2 * dsyVar.X) + 0.5f), 1, iH2);
                            dsyVar.h.e.c(dsyVar.j());
                            dsyVar.i.e.c(dsyVar.h());
                            dsyVar.e = true;
                        } else if (i7 == 1) {
                            l(dsyVar, 2, 0, i5, 0);
                            dsyVar.h.e.m = dsyVar.j();
                        } else {
                            i2 = i5;
                            f = f4;
                            f2 = 1.0f;
                            if (i7 == 2) {
                                int i9 = dszVar.aq[c];
                                if (i9 == 1 || i9 == 4) {
                                    l(dsyVar, 1, (int) ((f3 * dszVar.j()) + 0.5f), i2, dsyVar.h());
                                    dsyVar.h.e.c(dsyVar.j());
                                    dsyVar.i.e.c(dsyVar.h());
                                    dsyVar.e = true;
                                }
                            } else {
                                defpackage.dsx[] dsxVarArr = dsyVar.R;
                                if (dsxVarArr[c].e == null || dsxVarArr[1].e == null) {
                                    l(dsyVar, 2, 0, i2, 0);
                                    dsyVar.h.e.c(dsyVar.j());
                                    dsyVar.i.e.c(dsyVar.h());
                                    dsyVar.e = true;
                                }
                            }
                        }
                        if (i2 == 3 || !(i4 == 2 || i4 == 1)) {
                            if (i4 != 3 && i2 == 3) {
                                if (i7 == 1 || i8 == 1) {
                                    l(dsyVar, 2, 0, 2, 0);
                                    dsyVar.h.e.m = dsyVar.j();
                                    dsyVar.i.e.m = dsyVar.h();
                                } else if (i8 == 2 && i7 == 2) {
                                    int[] iArr2 = dszVar.aq;
                                    if (iArr2[c] == 1 && iArr2[1] == 1) {
                                        l(dsyVar, 1, (int) ((f3 * dszVar.j()) + 0.5f), 1, (int) ((f * dszVar.h()) + 0.5f));
                                        dsyVar.h.e.c(dsyVar.j());
                                        dsyVar.i.e.c(dsyVar.h());
                                        dsyVar.e = true;
                                    }
                                }
                            }
                        } else if (i8 == 3) {
                            if (i4 == 2) {
                                l(dsyVar, 2, 0, 2, 0);
                            }
                            int iJ2 = dsyVar.j();
                            float f5 = dsyVar.X;
                            if (dsyVar.Y == -1) {
                                f5 = f2 / f5;
                            }
                            l(dsyVar, 1, iJ2, 1, (int) ((iJ2 * f5) + 0.5f));
                            dsyVar.h.e.c(dsyVar.j());
                            dsyVar.i.e.c(dsyVar.h());
                            dsyVar.e = true;
                        } else if (i8 == 1) {
                            l(dsyVar, i4, 0, 2, 0);
                            dsyVar.i.e.m = dsyVar.h();
                        } else if (i8 == 2) {
                            int i10 = dszVar.aq[1];
                            if (i10 == 1 || i10 == 4) {
                                l(dsyVar, i4, dsyVar.j(), 1, (int) ((f * dszVar.h()) + 0.5f));
                                dsyVar.h.e.c(dsyVar.j());
                                dsyVar.i.e.c(dsyVar.h());
                                dsyVar.e = true;
                            } else if (i4 != 3) {
                            }
                        } else {
                            defpackage.dsx[] dsxVarArr2 = dsyVar.R;
                            if (dsxVarArr2[2].e == null || dsxVarArr2[3].e == null) {
                                l(dsyVar, 2, 0, 3, 0);
                                dsyVar.h.e.c(dsyVar.j());
                                dsyVar.i.e.c(dsyVar.h());
                                dsyVar.e = true;
                            } else if (i4 != 3) {
                            }
                        }
                    }
                    iJ = dsyVar.j();
                    if (i4 == 4) {
                        iJ = (dszVar.j() - dsyVar.J.f) - dsyVar.L.f;
                        i4 = 1;
                    }
                    int i11 = iJ;
                    iH = dsyVar.h();
                    if (i6 == 4) {
                        iH = (dszVar.h() - dsyVar.K.f) - dsyVar.M.f;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    l(dsyVar, i4, i11, i, iH);
                    dsyVar.h.e.c(dsyVar.j());
                    dsyVar.i.e.c(dsyVar.h());
                    dsyVar.e = true;
                } else if (i4 == 2) {
                    i4 = 2;
                    if (i5 != 4) {
                        i6 = i5;
                    } else {
                        i6 = i5;
                    }
                    iJ = dsyVar.j();
                    if (i4 == 4) {
                        iJ = (dszVar.j() - dsyVar.J.f) - dsyVar.L.f;
                        i4 = 1;
                    }
                    int i12 = iJ;
                    iH = dsyVar.h();
                    if (i6 == 4) {
                        iH = (dszVar.h() - dsyVar.K.f) - dsyVar.M.f;
                        i = 1;
                    } else {
                        i = i6;
                    }
                    l(dsyVar, i4, i12, i, iH);
                    dsyVar.h.e.c(dsyVar.j());
                    dsyVar.i.e.c(dsyVar.h());
                    dsyVar.e = true;
                } else if (i4 == 3) {
                    i2 = i5;
                    f = f4;
                    f2 = 1.0f;
                    if (i2 == 3) {
                        if (i4 != 3) {
                        }
                    } else if (i4 != 3) {
                    }
                } else {
                    i2 = i5;
                    f = f4;
                    f2 = 1.0f;
                    if (i2 == 3) {
                        if (i4 != 3) {
                        }
                    } else if (i4 != 3) {
                    }
                }
            }
            i3++;
            c2 = c;
        }
    }

    public fxy() {
        throw null;
    }

    public fxy(defpackage.dsz dszVar) {
        this.a = true;
        this.b = true;
        this.h = new java.util.ArrayList();
        new java.util.ArrayList();
        this.c = null;
        this.g = new defpackage.dtg();
        this.d = new java.util.ArrayList();
        this.f = dszVar;
        this.e = dszVar;
    }
}
