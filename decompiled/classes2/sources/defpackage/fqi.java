package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fqi implements defpackage.flj {
    private defpackage.fll A;
    private defpackage.fqh[] B;
    private long[][] C;
    private int D;
    public final int a;
    private final defpackage.frr b;
    private final defpackage.etx c;
    private final defpackage.etx d;
    private final defpackage.etx e;
    private final defpackage.etx f;
    private final java.util.ArrayDeque g;
    private final defpackage.fqk h;
    private final java.util.List i;
    private final java.util.List j;
    private final java.util.List k;
    private aify l = aike.a;
    private int m;
    private int n;
    private long o;
    private int p;
    private defpackage.etx q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private long z;

    public fqi(defpackage.frr frrVar, int i) {
        this.b = frrVar;
        this.a = i;
        this.m = (i & 4) != 0 ? 3 : 0;
        this.h = new defpackage.fqk();
        this.i = new java.util.ArrayList();
        this.f = new defpackage.etx(16);
        this.g = new java.util.ArrayDeque();
        this.c = new defpackage.etx(defpackage.evc.a);
        this.d = new defpackage.etx(6);
        this.e = new defpackage.etx();
        this.r = -1;
        this.A = defpackage.fll.w;
        this.B = new defpackage.fqh[0];
        this.j = new java.util.ArrayList();
        this.k = new java.util.ArrayList();
    }

    public static int h(defpackage.fqq fqqVar, long j) {
        int iA = fqqVar.a(j);
        return iA == -1 ? fqqVar.b(j) : iA;
    }

    public static long i(defpackage.fqq fqqVar, long j, long j2) {
        int iH = h(fqqVar, j);
        return iH != -1 ? java.lang.Math.min(fqqVar.c[iH], j2) : j2;
    }

    private static int j(int i) {
        return i != 1903435808 ? 0 : 1;
    }

    private final void k() {
        this.m = 0;
        this.p = 0;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:104:0x020c  */
    /* JADX WARN: Code duplicated, block: B:105:0x021e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0232  */
    /* JADX WARN: Code duplicated, block: B:109:0x0235  */
    /* JADX WARN: Code duplicated, block: B:112:0x025c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0279  */
    /* JADX WARN: Code duplicated, block: B:124:0x0287 A[EDGE_INSN: B:124:0x0287->B:125:0x0289 BREAK  A[LOOP:5: B:119:0x0273->B:204:?]] */
    /* JADX WARN: Code duplicated, block: B:126:0x028b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0294  */
    /* JADX WARN: Code duplicated, block: B:132:0x029c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:202:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[LOOP:5: B:119:0x0273->B:204:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0192  */
    /* JADX WARN: Code duplicated, block: B:68:0x0194  */
    private final void l(long j) throws defpackage.era {
        defpackage.eqy eqyVar;
        int i;
        long j2;
        java.util.ArrayDeque arrayDeque;
        java.util.List list;
        int i2;
        int i3;
        long j3;
        int i4;
        defpackage.fmk fmkVar;
        defpackage.eqg eqgVar;
        java.lang.String str;
        int i5;
        defpackage.eqy eqyVar2;
        defpackage.eqf eqfVar;
        defpackage.fqn fqnVar;
        defpackage.fmk fmkVar2;
        int i6;
        long j4;
        long j5;
        defpackage.eqy eqyVar3;
        java.util.List list2;
        defpackage.eqy eqyVar4;
        defpackage.eqg eqgVar2;
        boolean z;
        int i7;
        boolean z2;
        int i8;
        int i9;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int i10;
        int i11;
        int i12;
        while (true) {
            java.util.ArrayDeque arrayDeque2 = this.g;
            if (arrayDeque2.isEmpty() || ((defpackage.eus) arrayDeque2.peek()).a != j) {
                break;
            }
            defpackage.eus eusVar = (defpackage.eus) arrayDeque2.pop();
            if (eusVar.d == 1836019574) {
                long j6 = eusVar.a;
                defpackage.eus eusVarA = eusVar.a(1835365473);
                new java.util.ArrayList();
                defpackage.eqy eqyVarB = eusVarA != null ? defpackage.fpz.b(eusVarA) : null;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int i13 = this.D;
                defpackage.fls flsVar = new defpackage.fls();
                defpackage.eut eutVarB = eusVar.b(1969517665);
                if (eutVarB != null) {
                    defpackage.eqy eqyVarI = defpackage.fpz.i(eutVarB);
                    flsVar.b(eqyVarI);
                    eqyVar = eqyVarI;
                } else {
                    eqyVar = null;
                }
                boolean z3 = 1 == i13;
                defpackage.eut eutVarB2 = eusVar.b(1836476516);
                ahvr.ci(eutVarB2);
                java.util.ArrayList arrayList3 = arrayList2;
                long j7 = -9223372036854775807L;
                defpackage.eqy eqyVar5 = new defpackage.eqy(-9223372036854775807L, defpackage.fpz.c(eutVarB2.a));
                int i14 = this.a;
                java.util.List<defpackage.fqq> listH = defpackage.fpz.h(eusVar, flsVar, -9223372036854775807L, null, 1 == (i14 & 1), z3, new defpackage.etw(6));
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it2 = listH.iterator();
                while (true) {
                    i = -1;
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i15 = ((defpackage.fqq) it2.next()).a.l;
                    if (i15 != -1) {
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i15);
                        if (!arrayList4.contains(numValueOf)) {
                            arrayList4.add(numValueOf);
                        }
                    }
                }
                java.util.List list3 = this.j;
                list3.clear();
                for (defpackage.fqq fqqVar : listH) {
                    if (arrayList4.contains(java.lang.Integer.valueOf(fqqVar.a.a))) {
                        list3.add(fqqVar);
                    }
                }
                java.lang.String strK = defpackage.fsu.k(listH);
                int size = -1;
                long j8 = -9223372036854775807L;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    j2 = 0;
                    if (i16 >= listH.size()) {
                        break;
                    }
                    defpackage.fqq fqqVar2 = (defpackage.fqq) listH.get(i16);
                    int i18 = fqqVar2.b;
                    if (i18 == 0) {
                        arrayDeque = arrayDeque2;
                    } else {
                        defpackage.fqn fqnVar2 = fqqVar2.a;
                        arrayDeque = arrayDeque2;
                        if (fqnVar2.m) {
                            defpackage.fll fllVar = this.A;
                            int i19 = i17 + 1;
                            list = list3;
                            int i20 = fqnVar2.b;
                            defpackage.fqh fqhVar = new defpackage.fqh(fqnVar2, fqqVar2, fllVar.r(i17, i20));
                            if (fqnVar2.i == null) {
                                i2 = i16;
                                i3 = i18;
                                j3 = fqnVar2.f;
                                if (j3 == j8) {
                                }
                                i4 = i2;
                                fmkVar = fqhVar.c;
                                fmkVar.z();
                                long jMax = java.lang.Math.max(j7, j3);
                                int i21 = i3;
                                eqgVar = fqnVar2.g;
                                str = eqgVar.p;
                                if ("audio/true-hd".equals(str)) {
                                    i5 = fqqVar2.e << 4;
                                } else {
                                    i5 = fqqVar2.e + 30;
                                }
                                eqyVar2 = eqyVar;
                                eqfVar = new defpackage.eqf(eqgVar);
                                eqfVar.o = i5;
                                if (i20 == 2) {
                                    i11 = eqgVar.f;
                                    if ((i14 & 8) != 0) {
                                        if (size == -1) {
                                            i12 = 1;
                                        } else {
                                            i12 = 2;
                                        }
                                        i11 |= i12;
                                    }
                                    eqfVar.f = i11;
                                    i20 = 2;
                                }
                                if (defpackage.eqz.i(str) || !fqqVar2.c()) {
                                    fqnVar = fqnVar2;
                                    fmkVar2 = fmkVar;
                                    i6 = size;
                                } else {
                                    boolean z4 = fqqVar2.j;
                                    i6 = size;
                                    int iMin = java.lang.Math.min(!z4 ? fqqVar2.h.length : i21, 20);
                                    ahvr.bY(j3 != j8);
                                    fqnVar = fqnVar2;
                                    fmkVar2 = fmkVar;
                                    long jMin = java.lang.Math.min(j3, 10000000L);
                                    int i22 = 0;
                                    int i23 = 0;
                                    int i24 = -1;
                                    while (i22 < iMin) {
                                        long j9 = jMin;
                                        int i25 = z4 ? i22 : fqqVar2.h[i22];
                                        long j10 = fqqVar2.f[i25];
                                        if (j10 > j9) {
                                            break;
                                        }
                                        if (j10 >= 0 && (i10 = fqqVar2.d[i25]) > i23) {
                                            i24 = i25;
                                            i23 = i10;
                                        }
                                        i22++;
                                        jMin = j9;
                                    }
                                    if (i24 != -1) {
                                        j4 = fqqVar2.f[i24];
                                    }
                                    if (j4 != j8) {
                                        defpackage.eqx[] eqxVarArr = {new defpackage.fns(j4)};
                                        j5 = j8;
                                        eqyVar3 = new defpackage.eqy(j5, eqxVarArr);
                                    } else {
                                        j5 = j8;
                                        eqyVar3 = null;
                                    }
                                    defpackage.fsu.p(i20, flsVar, eqfVar);
                                    defpackage.eqy eqyVar6 = eqgVar.l;
                                    list2 = this.i;
                                    defpackage.eqy[] eqyVarArr = new defpackage.eqy[5];
                                    if (list2.isEmpty()) {
                                        eqyVar4 = null;
                                    } else {
                                        eqyVar4 = new defpackage.eqy(list2);
                                    }
                                    eqyVarArr[0] = eqyVar4;
                                    eqyVarArr[1] = eqyVar2;
                                    eqyVarArr[2] = eqyVar5;
                                    eqyVarArr[3] = eqyVar3;
                                    eqyVarArr[4] = null;
                                    defpackage.fsu.q(i20, eqyVarB, eqfVar, eqyVar6, eqyVarArr);
                                    eqfVar.a(strK);
                                    eqgVar2 = new defpackage.eqg(eqfVar);
                                    if (!j$.util.Objects.equals(str, "audio/mpeg") || defpackage.fli.g(str)) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    i7 = fqnVar.l;
                                    if (i7 == -1) {
                                        z2 = false;
                                        break;
                                    }
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((defpackage.fqq) it.next()).a.a == i7) {
                                                z2 = true;
                                                break;
                                            }
                                        } else {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    if (!z || z2) {
                                        fqhVar.h = eqgVar2;
                                    } else {
                                        fmkVar2.p(eqgVar2);
                                    }
                                    i8 = i6;
                                    i9 = -1;
                                    if (i20 == 2 || i8 != -1) {
                                        size = i8;
                                    } else {
                                        size = arrayList3.size();
                                    }
                                    arrayList = arrayList3;
                                    arrayList.add(fqhVar);
                                    i17 = i19;
                                    j7 = jMax;
                                }
                                j4 = j8;
                                if (j4 != j8) {
                                    defpackage.eqx[] eqxVarArr2 = {new defpackage.fns(j4)};
                                    j5 = j8;
                                    eqyVar3 = new defpackage.eqy(j5, eqxVarArr2);
                                } else {
                                    j5 = j8;
                                    eqyVar3 = null;
                                }
                                defpackage.fsu.p(i20, flsVar, eqfVar);
                                defpackage.eqy eqyVar7 = eqgVar.l;
                                list2 = this.i;
                                defpackage.eqy[] eqyVarArr2 = new defpackage.eqy[5];
                                if (list2.isEmpty()) {
                                    eqyVar4 = null;
                                } else {
                                    eqyVar4 = new defpackage.eqy(list2);
                                }
                                eqyVarArr2[0] = eqyVar4;
                                eqyVarArr2[1] = eqyVar2;
                                eqyVarArr2[2] = eqyVar5;
                                eqyVarArr2[3] = eqyVar3;
                                eqyVarArr2[4] = null;
                                defpackage.fsu.q(i20, eqyVarB, eqfVar, eqyVar7, eqyVarArr2);
                                eqfVar.a(strK);
                                eqgVar2 = new defpackage.eqg(eqfVar);
                                if (j$.util.Objects.equals(str, "audio/mpeg")) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                i7 = fqnVar.l;
                                if (i7 == -1) {
                                    z2 = false;
                                    break;
                                }
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((defpackage.fqq) it.next()).a.a == i7) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (z) {
                                    fqhVar.h = eqgVar2;
                                } else {
                                    fqhVar.h = eqgVar2;
                                }
                                i8 = i6;
                                i9 = -1;
                                if (i20 == 2) {
                                    size = i8;
                                } else {
                                    size = i8;
                                }
                                arrayList = arrayList3;
                                arrayList.add(fqhVar);
                                i17 = i19;
                                j7 = jMax;
                            } else {
                                i2 = i16;
                                i3 = i18;
                            }
                            j3 = fqnVar2.e;
                            if (j3 == j8) {
                                j3 = fqqVar2.i;
                            }
                            i4 = i2;
                            fmkVar = fqhVar.c;
                            fmkVar.z();
                            long jMax2 = java.lang.Math.max(j7, j3);
                            int i26 = i3;
                            eqgVar = fqnVar2.g;
                            str = eqgVar.p;
                            if ("audio/true-hd".equals(str)) {
                                i5 = fqqVar2.e << 4;
                            } else {
                                i5 = fqqVar2.e + 30;
                            }
                            eqyVar2 = eqyVar;
                            eqfVar = new defpackage.eqf(eqgVar);
                            eqfVar.o = i5;
                            if (i20 == 2) {
                                i11 = eqgVar.f;
                                if ((i14 & 8) != 0) {
                                    if (size == -1) {
                                        i12 = 1;
                                    } else {
                                        i12 = 2;
                                    }
                                    i11 |= i12;
                                }
                                eqfVar.f = i11;
                                i20 = 2;
                            }
                            if (defpackage.eqz.i(str)) {
                                fqnVar = fqnVar2;
                                fmkVar2 = fmkVar;
                                i6 = size;
                                j4 = j8;
                            } else {
                                fqnVar = fqnVar2;
                                fmkVar2 = fmkVar;
                                i6 = size;
                                j4 = j8;
                            }
                            if (j4 != j8) {
                                defpackage.eqx[] eqxVarArr3 = {new defpackage.fns(j4)};
                                j5 = j8;
                                eqyVar3 = new defpackage.eqy(j5, eqxVarArr3);
                            } else {
                                j5 = j8;
                                eqyVar3 = null;
                            }
                            defpackage.fsu.p(i20, flsVar, eqfVar);
                            defpackage.eqy eqyVar8 = eqgVar.l;
                            list2 = this.i;
                            defpackage.eqy[] eqyVarArr3 = new defpackage.eqy[5];
                            if (list2.isEmpty()) {
                                eqyVar4 = null;
                            } else {
                                eqyVar4 = new defpackage.eqy(list2);
                            }
                            eqyVarArr3[0] = eqyVar4;
                            eqyVarArr3[1] = eqyVar2;
                            eqyVarArr3[2] = eqyVar5;
                            eqyVarArr3[3] = eqyVar3;
                            eqyVarArr3[4] = null;
                            defpackage.fsu.q(i20, eqyVarB, eqfVar, eqyVar8, eqyVarArr3);
                            eqfVar.a(strK);
                            eqgVar2 = new defpackage.eqg(eqfVar);
                            if (j$.util.Objects.equals(str, "audio/mpeg")) {
                                z = true;
                            } else {
                                z = true;
                            }
                            i7 = fqnVar.l;
                            if (i7 == -1) {
                                z2 = false;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((defpackage.fqq) it.next()).a.a == i7) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            if (z) {
                                fqhVar.h = eqgVar2;
                            } else {
                                fqhVar.h = eqgVar2;
                            }
                            i8 = i6;
                            i9 = -1;
                            if (i20 == 2) {
                                size = i8;
                            } else {
                                size = i8;
                            }
                            arrayList = arrayList3;
                            arrayList.add(fqhVar);
                            i17 = i19;
                            j7 = jMax2;
                        }
                        i16 = i4 + 1;
                        i = i9;
                        j8 = j5;
                        arrayList3 = arrayList;
                        arrayDeque2 = arrayDeque;
                        listH = listH;
                        list3 = list;
                        eqyVar = eqyVar2;
                    }
                    list = list3;
                    i4 = i16;
                    eqyVar2 = eqyVar;
                    arrayList = arrayList3;
                    j5 = j8;
                    i9 = -1;
                    i16 = i4 + 1;
                    i = i9;
                    j8 = j5;
                    arrayList3 = arrayList;
                    arrayDeque2 = arrayDeque;
                    listH = listH;
                    list3 = list;
                    eqyVar = eqyVar2;
                }
                java.util.ArrayDeque arrayDeque3 = arrayDeque2;
                java.util.List list4 = list3;
                int i27 = i;
                int i28 = size;
                defpackage.fqh[] fqhVarArr = (defpackage.fqh[]) arrayList3.toArray(new defpackage.fqh[0]);
                this.B = fqhVarArr;
                int length = fqhVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i29 = 0; i29 < fqhVarArr.length; i29++) {
                    jArr[i29] = new long[fqhVarArr[i29].b.b];
                    jArr2[i29] = fqhVarArr[i29].b.f[0];
                }
                int i30 = 0;
                while (i30 < fqhVarArr.length) {
                    long j11 = Long.MAX_VALUE;
                    int i31 = i27;
                    for (int i32 = 0; i32 < fqhVarArr.length; i32++) {
                        if (!zArr[i32]) {
                            long j12 = jArr2[i32];
                            if (j12 <= j11) {
                                i31 = i32;
                                j11 = j12;
                            }
                        }
                    }
                    int i33 = iArr[i31];
                    long[] jArr3 = jArr[i31];
                    jArr3[i33] = j2;
                    defpackage.fqq fqqVar3 = fqhVarArr[i31].b;
                    long[][] jArr4 = jArr;
                    j2 += (long) fqqVar3.d[i33];
                    int i34 = i33 + 1;
                    iArr[i31] = i34;
                    if (i34 < jArr3.length) {
                        jArr2[i31] = fqqVar3.f[i34];
                    } else {
                        zArr[i31] = true;
                        i30++;
                    }
                    jArr = jArr4;
                    i27 = -1;
                }
                this.C = jArr;
                this.A.s();
                this.A.y(new defpackage.fqg(j7, this.B, i28));
                arrayDeque3.clear();
                this.m = true != list4.isEmpty() ? 4 : 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((defpackage.eus) arrayDeque2.peek()).c(eusVar);
            }
        }
        int i35 = this.m;
        if (i35 == 4 || i35 == 2) {
            return;
        }
        k();
    }

    @Override // defpackage.flj
    public final /* synthetic */ java.util.List a() {
        return this.l;
    }

    @Override // defpackage.flj
    public final void b(defpackage.fll fllVar) {
        if ((this.a & 16) == 0) {
            fllVar = new defpackage.fru(fllVar, this.b);
        }
        this.A = fllVar;
    }

    @Override // defpackage.flj
    public final void d(long j, long j2) {
        this.g.clear();
        this.p = 0;
        this.r = -1;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.x = 0;
        this.y = 0;
        this.j.clear();
        this.k.clear();
        if (j == 0) {
            if (this.m != 3) {
                k();
                return;
            }
            defpackage.fqk fqkVar = this.h;
            fqkVar.c.clear();
            fqkVar.d = 0;
            this.i.clear();
            return;
        }
        for (defpackage.fqh fqhVar : this.B) {
            defpackage.fqq fqqVar = fqhVar.b;
            int iA = fqqVar.a(j2);
            if (iA == -1) {
                iA = fqqVar.b(j2);
            }
            fqhVar.g = iA;
            defpackage.fml fmlVar = fqhVar.d;
            if (fmlVar != null) {
                fmlVar.b();
            }
        }
    }

    @Override // defpackage.flj
    public final boolean e(defpackage.flk flkVar) {
        defpackage.fme fmeVarA = defpackage.fql.a(flkVar, false);
        this.l = fmeVarA != null ? aify.p(fmeVarA) : aike.a;
        return fmeVarA == null;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x031b  */
    /* JADX WARN: Code duplicated, block: B:162:0x03af  */
    /* JADX WARN: Code duplicated, block: B:217:0x049f  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:251:0x0591 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0593  */
    /* JADX WARN: Code duplicated, block: B:258:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:261:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:263:0x05da  */
    /* JADX WARN: Code duplicated, block: B:264:0x05df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:265:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:410:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x023e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x04c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:470:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:474:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.flj
    public final int g(defpackage.flk flkVar, aesq aesqVar) throws defpackage.era {
        long j;
        byte b;
        long j2;
        char c;
        boolean z;
        long j3;
        int i;
        int i2;
        int[] iArr;
        int i3;
        int iC;
        int i4;
        int i5;
        long j4;
        long jF;
        long j5;
        long j6;
        char c2;
        int i6;
        java.util.ArrayList arrayList;
        java.util.List listJ;
        int i7;
        java.util.List listJ2;
        boolean z2;
        int i8;
        while (true) {
            int i9 = this.m;
            byte b2 = 0;
            boolean z3 = true;
            if (i9 != 0) {
                int i10 = 4;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            java.util.List list = this.j;
                            defpackage.fqq fqqVar = (defpackage.fqq) list.get(this.x);
                            int i11 = this.y;
                            int i12 = fqqVar.b;
                            if (i11 < i12) {
                                long j7 = fqqVar.c[i11];
                                if (flkVar.f() != j7) {
                                    aesqVar.a = j7;
                                    return 1;
                                }
                                int i13 = fqqVar.d[this.y];
                                defpackage.etx etxVar = this.e;
                                etxVar.M(i13);
                                flkVar.j(etxVar.b, 0, i13);
                                java.lang.String strC = etxVar.C(java.lang.Math.min(etxVar.s(), etxVar.d()));
                                long[] jArr = fqqVar.f;
                                long jC = eum.C(jArr[this.y]);
                                int i14 = this.y + 1;
                                this.k.add(new defpackage.fnn(jC, i14 < i12 ? eum.C(jArr[i14]) : eum.C(fqqVar.i), false, new defpackage.eqi(null, strC)));
                                this.y++;
                            } else {
                                defpackage.fqh[] fqhVarArr = this.B;
                                int length = fqhVarArr.length;
                                int i15 = 0;
                                while (i15 < length) {
                                    defpackage.fqh fqhVar = fqhVarArr[i15];
                                    if (fqhVar.a.l == fqqVar.a.a) {
                                        defpackage.eqg eqgVar = fqhVar.h;
                                        ahvr.ci(eqgVar);
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        defpackage.eqy eqyVar = eqgVar.l;
                                        if (eqyVar != null) {
                                            arrayList2.addAll(eqyVar.g(defpackage.eqx.class, new defpackage.evz(5)));
                                        }
                                        arrayList2.addAll(this.k);
                                        defpackage.eqf eqfVar = new defpackage.eqf(eqgVar);
                                        eqfVar.k = new defpackage.eqy(arrayList2);
                                        defpackage.eqg eqgVar2 = new defpackage.eqg(eqfVar);
                                        java.lang.String str = eqgVar2.p;
                                        if (j$.util.Objects.equals(str, "audio/mpeg") || defpackage.fli.g(str)) {
                                            fqhVar.h = eqgVar2;
                                        } else {
                                            fqhVar.c.p(eqgVar2);
                                            fqhVar.h = null;
                                        }
                                    } else {
                                        z3 = z3;
                                    }
                                    i15++;
                                    z3 = z3;
                                }
                                this.x++;
                                this.y = 0;
                                this.k.clear();
                                if (this.x == list.size()) {
                                    this.m = 2;
                                }
                            }
                            return 0;
                        }
                        defpackage.fqk fqkVar = this.h;
                        java.util.List list2 = this.i;
                        int i16 = fqkVar.d;
                        if (i16 != 0) {
                            if (i16 != 1) {
                                char c3 = 2817;
                                short s = 2816;
                                short s2 = 2192;
                                if (i16 != 2) {
                                    long jF2 = flkVar.f();
                                    int iD = (int) ((flkVar.d() - flkVar.f()) - ((long) fqkVar.e));
                                    defpackage.etx etxVar2 = new defpackage.etx(iD);
                                    flkVar.j(etxVar2.b, 0, iD);
                                    int i17 = 0;
                                    while (true) {
                                        java.util.List list3 = fqkVar.c;
                                        if (i17 < list3.size()) {
                                            ygr ygrVar = (ygr) list3.get(i17);
                                            etxVar2.Q((int) (ygrVar.b - jF2));
                                            etxVar2.R(i10);
                                            int iJ = etxVar2.j();
                                            java.lang.String strC2 = etxVar2.C(iJ);
                                            switch (strC2.hashCode()) {
                                                case -1711564334:
                                                    if (!strC2.equals("SlowMotion_Data")) {
                                                        throw new defpackage.era("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2192;
                                                    i6 = ygrVar.a - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new java.util.ArrayList();
                                                        listJ = defpackage.fqk.b.j(etxVar2.C(i6));
                                                        for (i7 = 0; i7 < listJ.size(); i7++) {
                                                            listJ2 = defpackage.fqk.a.j((java.lang.CharSequence) listJ.get(i7));
                                                            if (listJ2.size() != 3) {
                                                                throw new defpackage.era(null, null, true, 1);
                                                            }
                                                            try {
                                                                arrayList.add(new defpackage.foq(java.lang.Long.parseLong((java.lang.String) listJ2.get(0)), java.lang.Long.parseLong((java.lang.String) listJ2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listJ2.get(2)) - 1)));
                                                            } catch (java.lang.NumberFormatException e) {
                                                                throw new defpackage.era(null, e, true, 1);
                                                            }
                                                        }
                                                        list2.add(new defpackage.Cfor(arrayList));
                                                    } else if (c2 == 2816 && c2 != c3 && c2 != 2819 && c2 != 2820) {
                                                        throw new java.lang.IllegalStateException();
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case -1332107749:
                                                    if (!strC2.equals("Super_SlowMotion_Edit_Data")) {
                                                        throw new defpackage.era("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2819;
                                                    i6 = ygrVar.a - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new java.util.ArrayList();
                                                        listJ = defpackage.fqk.b.j(etxVar2.C(i6));
                                                        while (i7 < listJ.size()) {
                                                            listJ2 = defpackage.fqk.a.j((java.lang.CharSequence) listJ.get(i7));
                                                            if (listJ2.size() != 3) {
                                                                throw new defpackage.era(null, null, true, 1);
                                                            }
                                                            arrayList.add(new defpackage.foq(java.lang.Long.parseLong((java.lang.String) listJ2.get(0)), java.lang.Long.parseLong((java.lang.String) listJ2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listJ2.get(2)) - 1)));
                                                        }
                                                        list2.add(new defpackage.Cfor(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case -1251387154:
                                                    if (!strC2.equals("Super_SlowMotion_Data")) {
                                                        throw new defpackage.era("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2816;
                                                    i6 = ygrVar.a - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new java.util.ArrayList();
                                                        listJ = defpackage.fqk.b.j(etxVar2.C(i6));
                                                        while (i7 < listJ.size()) {
                                                            listJ2 = defpackage.fqk.a.j((java.lang.CharSequence) listJ.get(i7));
                                                            if (listJ2.size() != 3) {
                                                                throw new defpackage.era(null, null, true, 1);
                                                            }
                                                            arrayList.add(new defpackage.foq(java.lang.Long.parseLong((java.lang.String) listJ2.get(0)), java.lang.Long.parseLong((java.lang.String) listJ2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listJ2.get(2)) - 1)));
                                                        }
                                                        list2.add(new defpackage.Cfor(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case -830665521:
                                                    if (!strC2.equals("Super_SlowMotion_Deflickering_On")) {
                                                        throw new defpackage.era("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = 2820;
                                                    i6 = ygrVar.a - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new java.util.ArrayList();
                                                        listJ = defpackage.fqk.b.j(etxVar2.C(i6));
                                                        while (i7 < listJ.size()) {
                                                            listJ2 = defpackage.fqk.a.j((java.lang.CharSequence) listJ.get(i7));
                                                            if (listJ2.size() != 3) {
                                                                throw new defpackage.era(null, null, true, 1);
                                                            }
                                                            arrayList.add(new defpackage.foq(java.lang.Long.parseLong((java.lang.String) listJ2.get(0)), java.lang.Long.parseLong((java.lang.String) listJ2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listJ2.get(2)) - 1)));
                                                        }
                                                        list2.add(new defpackage.Cfor(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                case 1760745220:
                                                    if (!strC2.equals("Super_SlowMotion_BGM")) {
                                                        throw new defpackage.era("Invalid SEF name", null, true, 1);
                                                    }
                                                    c2 = c3;
                                                    i6 = ygrVar.a - (iJ + 8);
                                                    if (c2 == 2192) {
                                                        arrayList = new java.util.ArrayList();
                                                        listJ = defpackage.fqk.b.j(etxVar2.C(i6));
                                                        while (i7 < listJ.size()) {
                                                            listJ2 = defpackage.fqk.a.j((java.lang.CharSequence) listJ.get(i7));
                                                            if (listJ2.size() != 3) {
                                                                throw new defpackage.era(null, null, true, 1);
                                                            }
                                                            arrayList.add(new defpackage.foq(java.lang.Long.parseLong((java.lang.String) listJ2.get(0)), java.lang.Long.parseLong((java.lang.String) listJ2.get(1)), 1 << (java.lang.Integer.parseInt((java.lang.String) listJ2.get(2)) - 1)));
                                                        }
                                                        list2.add(new defpackage.Cfor(arrayList));
                                                    } else if (c2 == 2816) {
                                                        continue;
                                                    }
                                                    i17++;
                                                    i10 = 4;
                                                    c3 = 2817;
                                                    break;
                                                    break;
                                                default:
                                                    throw new defpackage.era("Invalid SEF name", null, true, 1);
                                            }
                                        } else {
                                            aesqVar.a = 0L;
                                        }
                                    }
                                } else {
                                    long jD = flkVar.d();
                                    int i18 = fqkVar.e - 20;
                                    defpackage.etx etxVar3 = new defpackage.etx(i18);
                                    flkVar.j(etxVar3.b, 0, i18);
                                    int i19 = 0;
                                    while (i19 < i18 / 12) {
                                        etxVar3.R(2);
                                        short sF = etxVar3.F();
                                        if (sF == s2 || sF == s || sF == 2817 || sF == 2819 || sF == 2820) {
                                            fqkVar.c.add(new ygr((jD - ((long) fqkVar.e)) - ((long) etxVar3.j()), etxVar3.j()));
                                        } else {
                                            etxVar3.R(8);
                                        }
                                        i19++;
                                        s = 2816;
                                        s2 = 2192;
                                    }
                                    java.util.List list4 = fqkVar.c;
                                    if (!list4.isEmpty()) {
                                        fqkVar.d = 3;
                                        long j8 = ((ygr) list4.get(0)).b;
                                        aesqVar.a = j8;
                                        j5 = j8;
                                        j6 = 0;
                                        if (j5 != j6) {
                                            return 1;
                                        }
                                        k();
                                        return 1;
                                    }
                                    aesqVar.a = 0L;
                                }
                            } else {
                                defpackage.etx etxVar4 = new defpackage.etx(8);
                                flkVar.j(etxVar4.b, 0, 8);
                                fqkVar.e = etxVar4.j() + 8;
                                if (etxVar4.i() != 1397048916) {
                                    aesqVar.a = 0L;
                                } else {
                                    jF = flkVar.f() - ((long) (fqkVar.e - 12));
                                    aesqVar.a = jF;
                                    fqkVar.d = 2;
                                }
                            }
                            j6 = 0;
                            j5 = 0;
                            if (j5 != j6) {
                                return 1;
                            }
                            k();
                            return 1;
                        }
                        long jD2 = flkVar.d();
                        jF = (jD2 == -1 || jD2 < 8) ? 0L : jD2 - 8;
                        aesqVar.a = jF;
                        fqkVar.d = 1;
                        j5 = jF;
                        j6 = 0;
                        if (j5 != j6) {
                            return 1;
                        }
                        k();
                        return 1;
                    }
                    long jF3 = flkVar.f();
                    int i20 = this.r;
                    if (i20 == -1) {
                        int i21 = 0;
                        byte b3 = 1;
                        byte b4 = 1;
                        int i22 = -1;
                        int i23 = -1;
                        long jMin = Long.MAX_VALUE;
                        int i24 = -1;
                        j2 = 262144;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        long j11 = Long.MAX_VALUE;
                        long j12 = Long.MAX_VALUE;
                        while (true) {
                            defpackage.fqh[] fqhVarArr2 = this.B;
                            if (i21 >= fqhVarArr2.length) {
                                break;
                            }
                            defpackage.fqh fqhVar2 = fqhVarArr2[i21];
                            int i25 = fqhVar2.g;
                            byte b5 = b2;
                            defpackage.fqq fqqVar2 = fqhVar2.b;
                            byte b6 = b3;
                            if (i25 == fqqVar2.b) {
                                j4 = jF3;
                            } else {
                                j4 = jF3;
                                long j13 = fqqVar2.f[i25];
                                if (fqhVar2.e) {
                                    jMin = java.lang.Math.min(jMin, j13);
                                } else if (fqhVar2.f && j13 < j10) {
                                    j10 = j13;
                                    i22 = i21;
                                }
                                long j14 = fqqVar2.c[i25];
                                long[][] jArr2 = this.C;
                                ahvr.ci(jArr2);
                                long j15 = jArr2[i21][i25];
                                long j16 = j14 - j4;
                                b3 = (j16 < 0 || j16 >= 262144) ? (byte) 1 : b5;
                                if (b3 != 0) {
                                    if (b3 == b4 && j16 < j12) {
                                        b4 = b3;
                                        j12 = j16;
                                        i24 = i21;
                                        j11 = j15;
                                    }
                                } else if (b4 == 0) {
                                    b4 = b5;
                                    if (b3 == b4) {
                                        b4 = b3;
                                        j12 = j16;
                                        i24 = i21;
                                        j11 = j15;
                                    }
                                } else {
                                    b4 = b3;
                                    j12 = j16;
                                    i24 = i21;
                                    j11 = j15;
                                }
                                if (j15 < j9) {
                                    i23 = i21;
                                    j9 = j15;
                                }
                                i21++;
                                b2 = b5;
                                jF3 = j4;
                            }
                            b3 = b6;
                            i21++;
                            b2 = b5;
                            jF3 = j4;
                        }
                        j = jF3;
                        b = b2;
                        i20 = (jMin == Long.MAX_VALUE || i22 == -1 || j10 > jMin) ? (j9 == Long.MAX_VALUE || b3 == 0 || j11 < j9 + 10485760) ? i24 : i23 : i22;
                        this.r = i20;
                        if (i20 == -1) {
                            return -1;
                        }
                    } else {
                        j = jF3;
                        b = 0;
                        j2 = 262144;
                    }
                    defpackage.fqh fqhVar3 = this.B[i20];
                    defpackage.fmk fmkVar = fqhVar3.c;
                    int i26 = fqhVar3.g;
                    defpackage.fqq fqqVar3 = fqhVar3.b;
                    long j17 = fqqVar3.c[i26] + this.z;
                    int[] iArr2 = fqqVar3.d;
                    int iD2 = iArr2[i26];
                    defpackage.fml fmlVar = fqhVar3.d;
                    long j18 = (j17 - j) + ((long) this.s);
                    if (j18 < 0 || j18 >= j2) {
                        aesqVar.a = j17;
                        return 1;
                    }
                    defpackage.fqn fqnVar = fqhVar3.a;
                    int i27 = fqnVar.h;
                    if (i27 == 1) {
                        j18 += 8;
                        iD2 -= 8;
                        i27 = 1;
                    }
                    flkVar.l((int) j18);
                    defpackage.eqg eqgVar3 = fqnVar.g;
                    java.lang.String str2 = eqgVar3.p;
                    if (j$.util.Objects.equals(str2, "video/avc") || j$.util.Objects.equals(str2, "video/hevc") || j$.util.Objects.equals(str2, "video/apv")) {
                        c = 1;
                    } else {
                        c = 1;
                        this.v = true;
                    }
                    int i28 = fqnVar.k;
                    if (i28 != 0) {
                        defpackage.etx etxVar5 = this.d;
                        byte[] bArr = etxVar5.b;
                        bArr[b] = b;
                        bArr[c] = b;
                        bArr[2] = b;
                        int i29 = 4 - i28;
                        iD2 += i29;
                        while (this.t < iD2) {
                            int i30 = this.u;
                            if (i30 == 0) {
                                if (this.v) {
                                    iArr = iArr2;
                                } else {
                                    iArr = iArr2;
                                    if (defpackage.evc.c(eqgVar3) + i28 <= iArr2[i26] - this.s) {
                                        iC = defpackage.evc.c(eqgVar3);
                                        i3 = i28 + iC;
                                    }
                                    flkVar.j(bArr, i29, i3);
                                    this.s += i3;
                                    i4 = b;
                                    etxVar5.Q(i4);
                                    i5 = etxVar5.i();
                                    if (i5 >= 0) {
                                        throw new defpackage.era("Invalid NAL length", null, true, 1);
                                    }
                                    this.u = i5 - iC;
                                    defpackage.etx etxVar6 = this.c;
                                    etxVar6.Q(i4);
                                    fmkVar.b(etxVar6, 4);
                                    this.t += 4;
                                    if (iC > 0) {
                                        fmkVar.b(etxVar5, iC);
                                        this.t += iC;
                                        if (defpackage.evc.j(bArr, iC, eqgVar3)) {
                                            this.v = true;
                                        }
                                    }
                                }
                                i3 = i28;
                                iC = b;
                                flkVar.j(bArr, i29, i3);
                                this.s += i3;
                                i4 = b;
                                etxVar5.Q(i4);
                                i5 = etxVar5.i();
                                if (i5 >= 0) {
                                    throw new defpackage.era("Invalid NAL length", null, true, 1);
                                }
                                this.u = i5 - iC;
                                defpackage.etx etxVar7 = this.c;
                                etxVar7.Q(i4);
                                fmkVar.b(etxVar7, 4);
                                this.t += 4;
                                if (iC > 0) {
                                    fmkVar.b(etxVar5, iC);
                                    this.t += iC;
                                    if (defpackage.evc.j(bArr, iC, eqgVar3)) {
                                        this.v = true;
                                    }
                                }
                            } else {
                                iArr = iArr2;
                                int iA = fmkVar.a(flkVar, i30, b);
                                this.s += iA;
                                this.t += iA;
                                this.u -= iA;
                            }
                            iArr2 = iArr;
                            b = 0;
                        }
                    } else {
                        if (i27 == 2) {
                            defpackage.etx etxVar8 = this.e;
                            etxVar8.M(iD2);
                            flkVar.j(etxVar8.b, 0, iD2);
                            this.s += iD2;
                            if (defpackage.fpz.g(etxVar8, fqnVar.n)) {
                                iD2 = etxVar8.d();
                                fmkVar.b(etxVar8, iD2);
                                this.t += iD2;
                            } else {
                                z = false;
                            }
                            j3 = fqqVar3.f[i26];
                            i = fqqVar3.g[i26];
                            if (!this.v) {
                                i |= 67108864;
                            }
                            i2 = i;
                            if (fmlVar != null) {
                                fmlVar.c(fmkVar, j3, i2, iD2, 0, null);
                                if (i26 + 1 == fqqVar3.b) {
                                    fmlVar.a(fmkVar, null);
                                }
                            } else if (z) {
                                fmkVar.d(j3, i2, iD2, 0, null);
                            }
                            fqhVar3.g++;
                            this.r = -1;
                            this.s = 0;
                            this.t = 0;
                            this.u = 0;
                            this.v = false;
                            return 0;
                        }
                        defpackage.eqg eqgVar4 = fqhVar3.h;
                        if ("audio/ac4".equals(str2)) {
                            if (this.t == 0) {
                                defpackage.etx etxVar9 = this.e;
                                defpackage.fkr.b(iD2, etxVar9);
                                fmkVar.b(etxVar9, 7);
                                this.t += 7;
                            }
                            iD2 += 7;
                        } else if (eqgVar4 == null) {
                            if (fmlVar != null) {
                                fmlVar.d(flkVar);
                            }
                        } else if (j$.util.Objects.equals(str2, "audio/mpeg")) {
                            defpackage.etx etxVar10 = this.e;
                            etxVar10.M(4);
                            flkVar.i(etxVar10.b, 0, 4);
                            flkVar.k();
                            defpackage.flv flvVar = new defpackage.flv();
                            if (flvVar.a(etxVar10.i()) && !j$.util.Objects.equals(eqgVar4.p, flvVar.b)) {
                                defpackage.eqf eqfVar2 = new defpackage.eqf(eqgVar4);
                                java.lang.String str3 = flvVar.b;
                                ahvr.ci(str3);
                                eqfVar2.c(str3);
                                eqgVar4 = new defpackage.eqg(eqfVar2);
                            }
                            fmkVar.p(eqgVar4);
                            fqhVar3.h = null;
                        } else if (defpackage.fli.g(str2)) {
                            fmkVar.p(defpackage.fli.d(flkVar, iD2, eqgVar4));
                            fqhVar3.h = null;
                        } else if (fmlVar != null) {
                            fmlVar.d(flkVar);
                        }
                        while (true) {
                            int i31 = this.t;
                            if (i31 >= iD2) {
                                break;
                            }
                            int iA2 = fmkVar.a(flkVar, iD2 - i31, false);
                            this.s += iA2;
                            this.t += iA2;
                            this.u -= iA2;
                        }
                    }
                    z = true;
                    j3 = fqqVar3.f[i26];
                    i = fqqVar3.g[i26];
                    if (!this.v) {
                        i |= 67108864;
                    }
                    i2 = i;
                    if (fmlVar != null) {
                        fmlVar.c(fmkVar, j3, i2, iD2, 0, null);
                        if (i26 + 1 == fqqVar3.b) {
                            fmlVar.a(fmkVar, null);
                        }
                    } else if (z) {
                        fmkVar.d(j3, i2, iD2, 0, null);
                    }
                    fqhVar3.g++;
                    this.r = -1;
                    this.s = 0;
                    this.t = 0;
                    this.u = 0;
                    this.v = false;
                    return 0;
                }
                long j19 = this.o - ((long) this.p);
                long jF4 = flkVar.f() + j19;
                defpackage.etx etxVar11 = this.q;
                if (etxVar11 != null) {
                    flkVar.j(etxVar11.b, this.p, (int) j19);
                    if (this.n == 1718909296) {
                        this.w = true;
                        etxVar11.Q(8);
                        if (j(etxVar11.i()) != 0) {
                            i8 = 1;
                            break;
                        }
                        etxVar11.R(4);
                        while (true) {
                            if (etxVar11.d() <= 0) {
                                i8 = 0;
                                break;
                            }
                            if (j(etxVar11.i()) != 0) {
                                i8 = 1;
                                break;
                            }
                        }
                        this.D = i8;
                    } else {
                        java.util.ArrayDeque arrayDeque = this.g;
                        if (!arrayDeque.isEmpty()) {
                            ((defpackage.eus) arrayDeque.peek()).d(new defpackage.eut(this.n, etxVar11));
                        }
                    }
                } else {
                    if (!this.w && this.n == 1835295092) {
                        this.D = 1;
                    }
                    if (j19 < 262144) {
                        flkVar.l((int) j19);
                    } else {
                        aesqVar.a = flkVar.f() + j19;
                        z2 = true;
                    }
                    l(jF4);
                    if (z2 && this.m != 2) {
                        return 1;
                    }
                }
                z2 = false;
                l(jF4);
                if (z2) {
                    continue;
                }
            } else {
                if (this.p == 0) {
                    defpackage.etx etxVar12 = this.f;
                    if (!flkVar.o(etxVar12.b, 0, 8, true)) {
                        return -1;
                    }
                    this.p = 8;
                    etxVar12.Q(0);
                    this.o = etxVar12.w();
                    this.n = etxVar12.i();
                }
                long j20 = this.o;
                if (j20 == 1) {
                    defpackage.etx etxVar13 = this.f;
                    flkVar.j(etxVar13.b, 8, 8);
                    this.p += 8;
                    this.o = etxVar13.x();
                } else if (j20 == 0) {
                    long jD3 = flkVar.d();
                    if (jD3 == -1) {
                        defpackage.eus eusVar = (defpackage.eus) this.g.peek();
                        jD3 = eusVar != null ? eusVar.a : -1L;
                    }
                    if (jD3 != -1) {
                        this.o = (jD3 - flkVar.f()) + ((long) this.p);
                    }
                }
                long j21 = this.o;
                int i32 = this.p;
                long j22 = i32;
                if (j21 < j22) {
                    if (this.n != 1718773093 || i32 != 8) {
                        throw new defpackage.era("Atom size less than header length (unsupported).", null, false, 1);
                    }
                    this.o = j22;
                    i32 = 8;
                }
                int i33 = this.n;
                if (i33 == 1836019574 || i33 == 1953653099 || i33 == 1835297121 || i33 == 1835626086 || i33 == 1937007212 || i33 == 1701082227 || i33 == 1835365473 || i33 == 1635284069 || i33 == 1953654118) {
                    long jF5 = flkVar.f();
                    long j23 = this.o;
                    long j24 = jF5 + j23;
                    long j25 = this.p;
                    if (j23 != j25 && this.n == 1835365473) {
                        defpackage.etx etxVar14 = this.e;
                        etxVar14.M(8);
                        flkVar.i(etxVar14.b, 0, 8);
                        defpackage.fpz.f(etxVar14);
                        flkVar.l(etxVar14.c);
                        flkVar.k();
                    }
                    long j26 = j24 - j25;
                    this.g.push(new defpackage.eus(this.n, j26));
                    if (this.o == this.p) {
                        l(j26);
                    } else {
                        k();
                    }
                } else {
                    if (i33 == 1835296868 || i33 == 1836476516 || i33 == 1751411826 || i33 == 1937011556 || i33 == 1937011827 || i33 == 1937011571 || i33 == 1668576371 || i33 == 1701606260 || i33 == 1937011555 || i33 == 1937011578 || i33 == 1937013298 || i33 == 1937007471 || i33 == 1668232756 || i33 == 1953196132 || i33 == 1718909296 || i33 == 1969517665 || i33 == 1801812339 || i33 == 1768715124 || i33 == 1667785072 || i33 == 1667527523 || i33 == 1919837298) {
                        ahvr.bY(i32 == 8);
                        ahvr.bY(this.o <= 2147483647L);
                        defpackage.etx etxVar15 = new defpackage.etx((int) this.o);
                        java.lang.System.arraycopy(this.f.b, 0, etxVar15.b, 0, 8);
                        this.q = etxVar15;
                    } else {
                        this.q = null;
                    }
                    this.m = 1;
                }
            }
        }
    }

    @Override // defpackage.flj
    public final void c() {
    }

    @Override // defpackage.flj
    public final /* synthetic */ void f() {
    }
}
