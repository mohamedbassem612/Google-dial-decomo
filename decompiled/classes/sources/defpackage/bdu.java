package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bdu {
    public final java.util.List a;
    public defpackage.dat b;
    private int c;
    private int d;
    private final java.util.List e;
    private final java.util.List f;
    private final java.util.List g;
    private final java.util.List h;
    private final defpackage.adw i;
    private final defpackage.ady j;
    private defpackage.aaif k;

    public bdu() {
        long[] jArr = defpackage.adx.a;
        this.i = new defpackage.adw(6);
        defpackage.ady adyVar = defpackage.adz.a;
        this.j = new defpackage.ady(6);
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
        this.h = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
    }

    static /* synthetic */ void c(defpackage.bdu bduVar, defpackage.bef befVar, int i, boolean z) {
        java.lang.Object objA = bduVar.i.a(befVar.k());
        if (objA == null) {
            defpackage.aooh.g();
        }
        k(befVar, i, (defpackage.bds) objA, z);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[LOOP:0: B:7:0x0013->B:23:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005a A[EDGE_INSN: B:27:0x005a->B:24:0x005a BREAK  A[LOOP:0: B:7:0x0013->B:23:0x0057], SYNTHETIC] */
    private final void f() {
        int i;
        defpackage.adw adwVar = this.i;
        if (adwVar.e()) {
            java.lang.Object[] objArr = adwVar.c;
            long[] jArr = adwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i2++;
                    } else {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                for (defpackage.bfe bfeVar : ((defpackage.bds) objArr[(i2 << 3) + i4]).h) {
                                    if (bfeVar != null) {
                                        bfeVar.k();
                                    }
                                }
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            adwVar.k();
        }
    }

    private final void g(java.lang.Object obj) {
        defpackage.bfe[] bfeVarArr;
        defpackage.bds bdsVar = (defpackage.bds) this.i.i(obj);
        if (bdsVar == null || (bfeVarArr = bdsVar.h) == null) {
            return;
        }
        for (defpackage.bfe bfeVar : bfeVarArr) {
            if (bfeVar != null) {
                bfeVar.k();
            }
        }
    }

    private final void h(defpackage.bef befVar, boolean z, long j) {
        java.lang.Object objA = this.i.a(befVar.k());
        if (objA == null) {
            defpackage.aooh.g();
        }
        defpackage.bfe[] bfeVarArr = ((defpackage.bds) objA).h;
        int length = bfeVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            defpackage.bfe bfeVar = bfeVarArr[i];
            int i3 = i2 + 1;
            if (bfeVar != null) {
                long j2 = befVar.j(i2);
                long jD = bfeVar.d();
                if (jD != 9223372034707292159L && jD != j2) {
                    long jC = defpackage.dpn.c(defpackage.dpn.c(j2, jD), j);
                    if (jC != 0) {
                        bfeVar.h(jC, z);
                    }
                }
                bfeVar.q(j2);
            }
            i++;
            i2 = i3;
        }
    }

    private static final int i(defpackage.bef befVar, boolean z) {
        long j = befVar.j(0);
        return (int) (!z ? j & 4294967295L : j >> 32);
    }

    private static final boolean j(defpackage.bef befVar) {
        int size = befVar.l().size();
        for (int i = 0; i < size; i++) {
            java.lang.Object objB = defpackage.beh.b(befVar, i);
            if ((objB instanceof defpackage.bdg ? (defpackage.bdg) objB : null) != null) {
                return true;
            }
        }
        return false;
    }

    private static final void k(defpackage.bef befVar, int i, defpackage.bds bdsVar, boolean z) {
        int i2 = 0;
        long j = befVar.j(0);
        long jF = z ? defpackage.dpn.f(j, 0, i, 1) : defpackage.dpn.f(j, i, 0, 2);
        defpackage.bfe[] bfeVarArr = bdsVar.h;
        int length = bfeVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            defpackage.bfe bfeVar = bfeVarArr[i2];
            int i4 = i3 + 1;
            if (bfeVar != null) {
                bfeVar.q(defpackage.dpn.d(jF, defpackage.dpn.c(befVar.j(i3), j)));
            }
            i2++;
            i3 = i4;
        }
    }

    private static final int l(int[] iArr, defpackage.bef befVar, boolean z) {
        int iD = befVar.d();
        int iF = befVar.f() + iD;
        int iMax = 0;
        while (iD < iF) {
            int iA = iArr[iD] + defpackage.beh.a(befVar, z);
            iArr[iD] = iA;
            iMax = java.lang.Math.max(iMax, iA);
            iD++;
        }
        return iMax;
    }

    public final long a() {
        java.util.List list = this.a;
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            defpackage.bfe bfeVar = (defpackage.bfe) list.get(i);
            defpackage.cso csoVarE = bfeVar.e();
            if (csoVarE != null) {
                jMax = (java.lang.Math.max((int) (jMax >> 32), ((int) (bfeVar.d() >> 32)) + ((int) (csoVarE.k >> 32))) << 32) | (((long) java.lang.Math.max((int) (jMax & 4294967295L), ((int) (bfeVar.d() & 4294967295L)) + ((int) (csoVarE.k & 4294967295L)))) & 4294967295L);
            }
        }
        return jMax;
    }

    public final void b() {
        f();
        this.k = null;
        this.c = -1;
    }

    public final defpackage.bfe d(java.lang.Object obj, int i) {
        defpackage.bfe[] bfeVarArr;
        defpackage.bds bdsVar = (defpackage.bds) this.i.a(obj);
        if (bdsVar == null || (bfeVarArr = bdsVar.h) == null) {
            return null;
        }
        return bfeVarArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x029b  */
    /* JADX WARN: Code duplicated, block: B:262:0x00e8 A[EDGE_INSN: B:262:0x00e8->B:59:0x00e8 BREAK  A[LOOP:1: B:57:0x00e3->B:56:0x00df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00df A[LOOP:1: B:57:0x00e3->B:56:0x00df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0127 A[PHI: r11
      0x0127: PHI (r11v41 int) = (r11v40 int), (r11v47 int) binds: [B:68:0x0120, B:70:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e(int i, int i2, int i3, java.util.List list, defpackage.aaif aaifVar, defpackage.bei beiVar, boolean z, boolean z2, int i4, boolean z3, int i5, int i6, defpackage.aoss aossVar, defpackage.apkl apklVar, boolean z4) {
        long j;
        defpackage.aaif aaifVar2;
        defpackage.aaif aaifVar3;
        long j2;
        defpackage.ady adyVar;
        java.util.List list2;
        long j3;
        int i7;
        int i8;
        long[] jArr;
        int i9;
        long j4;
        long[] jArr2;
        defpackage.ady adyVar2;
        int i10;
        int i11;
        int i12;
        long j5;
        int i13;
        defpackage.aaif aaifVar4;
        boolean z5;
        defpackage.bfe[] bfeVarArr;
        defpackage.aaif aaifVar5 = this.k;
        this.k = aaifVar;
        boolean z6 = z2 || !z3;
        int i14 = true != z ? i2 : i3;
        int i15 = (z6 && z4) ? i14 - this.d : 0;
        if (z6) {
            this.d = i14;
        }
        long j6 = i15;
        long j7 = z ? j6 & 4294967295L : j6 << 32;
        int size = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                if (!this.i.d()) {
                    break;
                }
                f();
                return;
            } else if (j((defpackage.bef) list.get(i16))) {
                break;
            } else {
                i16++;
            }
        }
        long j8 = i;
        int i17 = this.c;
        defpackage.bef befVar = (defpackage.bef) (list.isEmpty() ? null : list.get(0));
        this.c = befVar != null ? befVar.c() : 0;
        long j9 = z ? j8 & 4294967295L : j8 << 32;
        defpackage.adw adwVar = this.i;
        java.lang.Object[] objArr = adwVar.b;
        long[] jArr3 = adwVar.a;
        boolean z7 = z6;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i18 = 0;
            while (true) {
                long j10 = jArr3[i18];
                j = j7;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length)) >>> 31);
                    for (int i20 = 0; i20 < i19; i20++) {
                        if ((j10 & 255) < 128) {
                            this.j.j(objArr[(i18 << 3) + i20]);
                        }
                        j10 >>= 8;
                    }
                    if (i19 != 8) {
                        break;
                    }
                    if (i18 != length) {
                        break;
                    }
                    i18++;
                    j7 = j;
                } else if (i18 != length) {
                    break;
                    break;
                } else {
                    i18++;
                    j7 = j;
                }
            }
        } else {
            j = j7;
        }
        int size2 = list.size();
        int i21 = 0;
        while (i21 < size2) {
            defpackage.bef befVar2 = (defpackage.bef) list.get(i21);
            this.j.l(befVar2.k());
            if (j(befVar2)) {
                defpackage.bds bdsVar = (defpackage.bds) adwVar.a(befVar2.k());
                if (aaifVar5 != null) {
                    i13 = aaifVar5.i(befVar2.k());
                    aaifVar4 = aaifVar5;
                } else {
                    i13 = -1;
                    aaifVar4 = null;
                }
                if (i13 == -1) {
                    i13 = -1;
                    if (aaifVar4 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (bdsVar == null) {
                    defpackage.bds bdsVar2 = new defpackage.bds(this);
                    bdsVar2.a(befVar2, aossVar, apklVar, i5, i6, i(befVar2, z));
                    i11 = size2;
                    adwVar.n(befVar2.k(), bdsVar2);
                    if (befVar2.c() == i13 || i13 == -1) {
                        long j11 = befVar2.j(0);
                        i12 = i21;
                        k(befVar2, (int) (z ? j11 & 4294967295L : j11 >> 32), bdsVar2, z);
                        if (z5) {
                            defpackage.bfe[] bfeVarArr2 = bdsVar2.h;
                            for (defpackage.bfe bfeVar : bfeVarArr2) {
                                if (bfeVar != null) {
                                    bfeVar.f();
                                }
                            }
                        }
                    } else {
                        if (i13 < i17) {
                            this.e.add(befVar2);
                        } else {
                            this.f.add(befVar2);
                        }
                        i12 = i21;
                    }
                } else {
                    i11 = size2;
                    i12 = i21;
                    if (z7) {
                        bdsVar.a(befVar2, aossVar, apklVar, i5, i6, i(befVar2, z));
                        defpackage.bfe[] bfeVarArr3 = bdsVar.h;
                        int length2 = bfeVarArr3.length;
                        int i22 = 0;
                        while (i22 < length2) {
                            int i23 = i22;
                            defpackage.bfe bfeVar2 = bfeVarArr3[i23];
                            if (bfeVar2 != null && bfeVar2.d() != 9223372034707292159L) {
                                bfeVar2.i(j9);
                            }
                            i22 = i23 + 1;
                        }
                        if (z5) {
                            defpackage.bfe[] bfeVarArr4 = bdsVar.h;
                            int length3 = bfeVarArr4.length;
                            int i24 = 0;
                            while (i24 < length3) {
                                defpackage.bfe bfeVar3 = bfeVarArr4[i24];
                                if (bfeVar3 != null) {
                                    if (bfeVar3.t()) {
                                        bfeVarArr = bfeVarArr4;
                                        this.a.remove(bfeVar3);
                                        defpackage.dat datVar = this.b;
                                        if (datVar != null) {
                                            defpackage.cfo.w(datVar);
                                        }
                                    } else {
                                        bfeVarArr = bfeVarArr4;
                                    }
                                    bfeVar3.f();
                                } else {
                                    bfeVarArr = bfeVarArr4;
                                }
                                i24++;
                                bfeVarArr4 = bfeVarArr;
                            }
                        }
                        j5 = j;
                        h(befVar2, false, j5);
                    }
                }
                j5 = j;
            } else {
                i11 = size2;
                i12 = i21;
                j5 = j;
                g(befVar2.k());
            }
            j = j5;
            i21 = i12 + 1;
            size2 = i11;
        }
        long j12 = j;
        int[] iArr = new int[i4];
        if (!z7) {
            aaifVar2 = aaifVar5;
            aaifVar3 = aaifVar2;
        } else if (aaifVar5 != null) {
            java.util.List list3 = this.e;
            if (!list3.isEmpty()) {
                if (list3.size() > 1) {
                    defpackage.ajsz.bo(list3, new bdt(aaifVar5, 2));
                }
                int size3 = list3.size();
                int i25 = 0;
                while (i25 < size3) {
                    defpackage.bef befVar3 = (defpackage.bef) list3.get(i25);
                    c(this, befVar3, i5 - l(iArr, befVar3, z), z);
                    h(befVar3, false, 0L);
                    i25++;
                    list3 = list3;
                }
                java.util.Arrays.fill(iArr, 0, i4, 0);
            }
            java.util.List list4 = this.f;
            if (list4.isEmpty()) {
                aaifVar2 = aaifVar5;
            } else {
                if (list4.size() > 1) {
                    defpackage.ajsz.bo(list4, new bdt(aaifVar5, 1));
                }
                int size4 = list4.size();
                int i26 = 0;
                while (i26 < size4) {
                    defpackage.bef befVar4 = (defpackage.bef) list4.get(i26);
                    c(this, befVar4, (i6 + l(iArr, befVar4, z)) - defpackage.beh.a(befVar4, z), z);
                    h(befVar4, false, 0L);
                    i26++;
                    aaifVar5 = aaifVar5;
                }
                aaifVar2 = aaifVar5;
                java.util.Arrays.fill(iArr, 0, i4, 0);
            }
            aaifVar3 = aaifVar2;
        } else {
            aaifVar3 = null;
        }
        defpackage.ady adyVar3 = this.j;
        java.lang.Object[] objArr2 = adyVar3.b;
        long[] jArr4 = adyVar3.a;
        int length4 = jArr4.length - 2;
        if (length4 >= 0) {
            defpackage.ady adyVar4 = adyVar3;
            int i27 = 0;
            while (true) {
                long j13 = jArr4[i27];
                j2 = j12;
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length4)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j13 & 255) < 128) {
                            i9 = i29;
                            java.lang.Object obj = objArr2[(i27 << 3) + i29];
                            j4 = j13;
                            defpackage.bds bdsVar3 = (defpackage.bds) adwVar.a(obj);
                            if (bdsVar3 != null) {
                                int i30 = aaifVar.i(obj);
                                jArr2 = jArr4;
                                int iMin = java.lang.Math.min(i4, bdsVar3.d);
                                bdsVar3.d = iMin;
                                adyVar2 = adyVar4;
                                bdsVar3.c = java.lang.Math.min(i4 - iMin, bdsVar3.c);
                                if (i30 == -1) {
                                    defpackage.bfe[] bfeVarArr5 = bdsVar3.h;
                                    int length5 = bfeVarArr5.length;
                                    int i31 = 0;
                                    boolean z8 = false;
                                    int i32 = 0;
                                    while (i31 < length5) {
                                        defpackage.bfe[] bfeVarArr6 = bfeVarArr5;
                                        defpackage.bfe bfeVar4 = bfeVarArr6[i31];
                                        int i33 = i32 + 1;
                                        if (bfeVar4 != null) {
                                            if (bfeVar4.t()) {
                                                i10 = i31;
                                            } else if (bfeVar4.s()) {
                                                bfeVar4.k();
                                                i10 = i31;
                                                bdsVar3.h[i32] = null;
                                                this.a.remove(bfeVar4);
                                                defpackage.dat datVar2 = this.b;
                                                if (datVar2 != null) {
                                                    defpackage.cfo.w(datVar2);
                                                }
                                            } else {
                                                i10 = i31;
                                                if (bfeVar4.e() != null) {
                                                    bfeVar4.g();
                                                }
                                                if (bfeVar4.t()) {
                                                    this.a.add(bfeVar4);
                                                    defpackage.dat datVar3 = this.b;
                                                    if (datVar3 != null) {
                                                        defpackage.cfo.w(datVar3);
                                                    }
                                                } else {
                                                    bfeVar4.k();
                                                    bdsVar3.h[i32] = null;
                                                }
                                            }
                                            z8 = true;
                                        } else {
                                            i10 = i31;
                                        }
                                        i31 = i10 + 1;
                                        bfeVarArr5 = bfeVarArr6;
                                        i32 = i33;
                                    }
                                    if (!z8) {
                                        g(obj);
                                    }
                                } else {
                                    defpackage.dpd dpdVar = bdsVar3.a;
                                    if (dpdVar == null) {
                                        defpackage.aooh.g();
                                    }
                                    defpackage.bef befVarB = beiVar.b(i30, bdsVar3.c, bdsVar3.d, dpdVar.a);
                                    befVarB.m();
                                    defpackage.bfe[] bfeVarArr7 = bdsVar3.h;
                                    int length6 = bfeVarArr7.length;
                                    int i34 = 0;
                                    while (true) {
                                        if (i34 < length6) {
                                            defpackage.bfe bfeVar5 = bfeVarArr7[i34];
                                            int i35 = i34;
                                            if (bfeVar5 != null && bfeVar5.u()) {
                                            }
                                            i34 = i35 + 1;
                                            length6 = length6;
                                        } else if (aaifVar3 != null && i30 == aaifVar3.i(obj)) {
                                            g(obj);
                                        }
                                        bdsVar3.a(befVarB, aossVar, apklVar, i5, i6, bdsVar3.b);
                                        if (i30 < this.c) {
                                            this.g.add(befVarB);
                                        } else {
                                            this.h.add(befVarB);
                                        }
                                    }
                                }
                            }
                            j13 = j4 >> 8;
                            i29 = i9 + 1;
                            jArr4 = jArr2;
                            adyVar4 = adyVar2;
                        } else {
                            i9 = i29;
                            j4 = j13;
                        }
                        jArr2 = jArr4;
                        adyVar2 = adyVar4;
                        j13 = j4 >> 8;
                        i29 = i9 + 1;
                        jArr4 = jArr2;
                        adyVar4 = adyVar2;
                    }
                    jArr = jArr4;
                    adyVar = adyVar4;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    adyVar = adyVar4;
                }
                if (i27 == length4) {
                    break;
                }
                i27++;
                j12 = j2;
                jArr4 = jArr;
                adyVar4 = adyVar;
            }
        } else {
            j2 = j12;
            adyVar = adyVar3;
        }
        java.util.List list5 = this.g;
        if (list5.isEmpty()) {
            list2 = list5;
            j3 = j2;
            i7 = 0;
        } else {
            if (list5.size() > 1) {
                defpackage.ajsz.bo(list5, new bdt(aaifVar, 3));
            }
            int size5 = list5.size();
            int i36 = 0;
            while (i36 < size5) {
                defpackage.bef befVar5 = (defpackage.bef) list5.get(i36);
                java.lang.Object objA = adwVar.a(befVar5.k());
                if (objA == null) {
                    defpackage.aooh.g();
                }
                defpackage.bds bdsVar4 = (defpackage.bds) objA;
                int iL = l(iArr, befVar5, z);
                if (!z2) {
                    i8 = bdsVar4.e;
                } else {
                    if (list.isEmpty()) {
                        throw new java.util.NoSuchElementException("List is empty.");
                    }
                    long j14 = ((defpackage.bef) list.get(0)).j(0);
                    i8 = (int) (z ? j14 & 4294967295L : j14 >> 32);
                }
                befVar5.p(i8 - iL, bdsVar4.b, i2, i3);
                java.util.List list6 = list5;
                int i37 = size5;
                long j15 = j2;
                if (z7) {
                    h(befVar5, true, j15);
                }
                i36++;
                j2 = j15;
                list5 = list6;
                size5 = i37;
            }
            list2 = list5;
            j3 = j2;
            i7 = 0;
            java.util.Arrays.fill(iArr, 0, i4, 0);
        }
        java.util.List list7 = this.h;
        if (!list7.isEmpty()) {
            if (list7.size() > 1) {
                defpackage.ajsz.bo(list7, new bdt(aaifVar, i7));
            }
            int size6 = list7.size();
            int i38 = 0;
            while (i38 < size6) {
                defpackage.bef befVar6 = (defpackage.bef) list7.get(i38);
                java.lang.Object objA2 = adwVar.a(befVar6.k());
                if (objA2 == null) {
                    defpackage.aooh.g();
                }
                defpackage.bds bdsVar5 = (defpackage.bds) objA2;
                int i39 = size6;
                befVar6.p((bdsVar5.f - defpackage.beh.a(befVar6, z)) + l(iArr, befVar6, z), bdsVar5.b, i2, i3);
                if (z7) {
                    h(befVar6, true, j3);
                }
                i38++;
                size6 = i39;
            }
        }
        java.util.Collections.reverse(list2);
        list.addAll(0, list2);
        list.addAll(list7);
        this.e.clear();
        this.f.clear();
        list2.clear();
        list7.clear();
        adyVar.d();
    }
}
