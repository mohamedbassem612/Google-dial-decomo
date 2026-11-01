package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbt extends defpackage.ccb {
    public defpackage.can A;
    public final defpackage.den C;
    private final java.util.Set D;
    private defpackage.cbw F;
    private int G;
    private int H;
    private int I;
    private boolean K;
    private int L;
    private final java.util.ArrayList M;
    private defpackage.cfh N;
    private defpackage.cfs O;
    private defpackage.cma P;
    private defpackage.acj Q;
    public final defpackage.cah a;
    public final defpackage.caz b;
    public final defpackage.cfm c;
    public final defpackage.can d;
    public final defpackage.can e;
    public final defpackage.cbb f;
    public int[] g;
    public boolean h;
    public boolean i;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public defpackage.cfl p;
    public defpackage.cfm q;
    public defpackage.cfp r;
    public boolean s;
    public final defpackage.cfr t;
    public ceb u;
    public final defpackage.aolr v;
    public boolean w;
    public long x;
    public defpackage.aco y;
    public defpackage.cje z;
    private final java.util.ArrayList E = new java.util.ArrayList();
    private final defpackage.appu S = new defpackage.appu(null, null);
    public final java.util.List j = new java.util.ArrayList();
    private final defpackage.appu T = new defpackage.appu(null, null);
    private defpackage.cje R = defpackage.cje.d;
    public final defpackage.appu B = new defpackage.appu(null, null);
    private int J = -1;

    public cbt(defpackage.cah cahVar, defpackage.caz cazVar, defpackage.cfm cfmVar, java.util.Set set, defpackage.can canVar, defpackage.can canVar2, defpackage.den denVar, defpackage.cbb cbbVar) {
        this.a = cahVar;
        this.b = cazVar;
        this.c = cfmVar;
        this.D = set;
        this.d = canVar;
        this.e = canVar2;
        this.C = denVar;
        this.f = cbbVar;
        this.n = cazVar.n() || cazVar.l();
        this.M = new java.util.ArrayList();
        defpackage.cfl cflVarE = cfmVar.e();
        cflVarE.r();
        this.p = cflVarE;
        defpackage.cfm cfmVar2 = new defpackage.cfm();
        if (cazVar.n()) {
            cfmVar2.b();
        }
        if (cazVar.l()) {
            cfmVar2.a();
        }
        this.q = cfmVar2;
        defpackage.cfp cfpVarF = cfmVar2.f();
        cfpVarF.x(true);
        this.r = cfpVarF;
        this.t = new defpackage.cfr(this, defpackage.cfo.g(canVar));
        defpackage.cfl cflVarE2 = this.q.e();
        try {
            defpackage.cfh cfhVarG = cflVarE2.g(0);
            cflVarE2.r();
            this.N = cfhVarG;
            this.O = new defpackage.cfs();
            defpackage.aolr aolrVarD = cazVar.d();
            P();
            this.v = aolrVarD.plus(defpackage.aols.a);
        } catch (java.lang.Throwable th) {
            cflVarE2.r();
            throw th;
        }
    }

    private final void aA() {
        defpackage.cfl cflVar = this.p;
        int i = cflVar.h;
        this.H = i >= 0 ? cflVar.b[(i * 5) + 1] & 67108863 : 0;
        cflVar.u();
    }

    private final void aB(boolean z, java.lang.Object obj) {
        if (z) {
            defpackage.cfl cflVar = this.p;
            if (cflVar.i <= 0) {
                if ((cflVar.b[(cflVar.f * 5) + 1] & 1073741824) == 0) {
                    defpackage.cdh.a("Expected a node group");
                }
                cflVar.v();
                return;
            }
            return;
        }
        if (obj != null && this.p.h() != obj) {
            defpackage.cfr cfrVar = this.t;
            cfrVar.i(false);
            defpackage.chi chiVar = cfrVar.j.a;
            chiVar.i(cgy.a);
            defpackage.chh.a(chiVar, 0, obj);
        }
        this.p.v();
    }

    private final void aC(int i, int i2) {
        int iN = N(i);
        if (iN != i2) {
            java.util.ArrayList arrayList = this.E;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iN2 = N(i) + (i2 - iN);
                ac(i, iN2);
                int i3 = size;
                while (i3 >= 0) {
                    int i4 = i3 - 1;
                    defpackage.cbw cbwVar = (defpackage.cbw) arrayList.get(i3);
                    if (cbwVar != null && cbwVar.d(i, iN2)) {
                        size = i4;
                        break;
                    }
                    i3 = i4;
                }
                defpackage.cfl cflVar = this.p;
                if (i < 0) {
                    i = cflVar.h;
                } else if (cflVar.B(i)) {
                    return;
                } else {
                    i = this.p.e(i);
                }
            }
        }
    }

    private final void aD(java.lang.Object obj) {
        Q();
        ad(obj);
    }

    private final void aE() {
        if (!this.i) {
            defpackage.cax.b("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.i = false;
    }

    private final void aF() {
        if (this.i) {
            defpackage.cax.b("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final defpackage.cje aG(int i) {
        defpackage.cje cjeVar;
        defpackage.cje cjeVar2;
        if (this.w && this.s) {
            int iL = this.r.q;
            while (iL > 0) {
                if (this.r.i(iL) == 202 && defpackage.aooh.n(this.r.s(iL), defpackage.cax.c)) {
                    java.lang.Object objR = this.r.r(iL);
                    if (objR == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    }
                    defpackage.cje cjeVar3 = (defpackage.cje) objR;
                    this.z = cjeVar3;
                    return cjeVar3;
                }
                iL = this.r.l(iL);
            }
        }
        if (this.p.c > 0) {
            while (i > 0) {
                if (this.p.b(i) == 202 && defpackage.aooh.n(this.p.m(i), defpackage.cax.c)) {
                    defpackage.aco acoVar = this.y;
                    if (acoVar == null || (cjeVar2 = (defpackage.cje) acoVar.a(i)) == null) {
                        java.lang.Object objJ = this.p.j(i);
                        if (objJ == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        }
                        cjeVar = (defpackage.cje) objJ;
                    } else {
                        cjeVar = cjeVar2;
                    }
                    this.z = cjeVar;
                    return cjeVar;
                }
                i = this.p.e(i);
            }
        }
        defpackage.cje cjeVar4 = this.R;
        this.z = cjeVar4;
        return cjeVar4;
    }

    private final int an(int i) {
        int iE = this.p.e(i) + 1;
        int i2 = 0;
        while (iE < i) {
            if (!this.p.z(iE)) {
                i2++;
            }
            iE += this.p.c(iE);
        }
        return i2;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0176 */
    /* JADX WARN: Code duplicated, block: B:115:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:119:0x0204  */
    /* JADX WARN: Code duplicated, block: B:145:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0216, code lost:
    
        if (r4.B(r23) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int ao(defpackage.cbt r21, int r22, int r23, boolean r24, int r25) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbt.ao(cbt, int, int, boolean, int):int");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    private static final cck ap(defpackage.cbt cbtVar, int i) {
        java.util.ArrayList arrayList;
        int iB = cbtVar.p.b(i);
        java.lang.Object objM = cbtVar.p.m(i);
        if (iB != 126665345 || !(objM instanceof defpackage.ccj)) {
            return null;
        }
        if (cbtVar.p.w(i)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            az(cbtVar, arrayList2, i);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        java.lang.Object objM2 = cbtVar.p.m(i);
        if (objM2 == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        }
        defpackage.ccj ccjVar = (defpackage.ccj) objM2;
        java.lang.Object objL = cbtVar.p.l(i, 0);
        defpackage.cfh cfhVarG = cbtVar.p.g(i);
        int iC = cbtVar.p.c(i) + i;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.List list = cbtVar.j;
        for (int iB2 = defpackage.cbu.b(list, i); iB2 < list.size(); iB2++) {
            defpackage.aodd aoddVar = (defpackage.aodd) list.get(iB2);
            if (aoddVar.b >= iC) {
                break;
            }
            arrayList3.add(new defpackage.aoiu(aoddVar.a, aoddVar.c));
        }
        return new cck(ccjVar, objL, cbtVar.f, cbtVar.c, cfhVarG, arrayList3, cbtVar.aG(i), arrayList);
    }

    private final void aq(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        aq(this.p.e(i), i2);
        if (this.p.B(i)) {
            this.t.c(this.p.o(i));
        }
    }

    private final void ar() {
        if (this.r.r) {
            defpackage.cfp cfpVarF = this.q.f();
            this.r = cfpVarF;
            cfpVarF.I();
            this.s = false;
            this.z = null;
        }
    }

    private final void as(boolean z, defpackage.cbw cbwVar) {
        this.E.add(this.F);
        this.F = cbwVar;
        defpackage.appu appuVar = this.S;
        appuVar.g(this.H);
        appuVar.g(this.I);
        appuVar.g(this.G);
        if (z) {
            this.G = 0;
        }
        this.H = 0;
        this.I = 0;
    }

    private final void at(defpackage.cdk cdkVar) {
        cdkVar.d = this.L;
        cdkVar.k(false);
    }

    private final void au() {
        defpackage.cfm cfmVar = new defpackage.cfm();
        if (this.n) {
            cfmVar.b();
        }
        if (this.b.l()) {
            cfmVar.a();
        }
        this.q = cfmVar;
        defpackage.cfp cfpVarF = cfmVar.f();
        cfpVarF.x(true);
        this.r = cfpVarF;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x02b4 A[LOOP:5: B:120:0x026f->B:134:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x02bd A[EDGE_INSN: B:170:0x02bd->B:136:0x02bd BREAK  A[LOOP:5: B:120:0x026f->B:134:0x02b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0 A[LOOP:7: B:21:0x0083->B:40:0x00d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    private final void av() {
        int i;
        boolean z;
        long j;
        int i2;
        boolean zB;
        long j2;
        int i3;
        defpackage.ado adoVar;
        long j3;
        int iB;
        long j4;
        boolean z2 = this.o;
        this.o = true;
        defpackage.cfl cflVar = this.p;
        int i4 = cflVar.h;
        int iC = cflVar.c(i4) + i4;
        int i5 = this.G;
        long j5 = this.x;
        int i6 = this.H;
        int i7 = this.I;
        int i8 = this.p.f;
        java.util.List list = this.j;
        defpackage.aodd aoddVarI = defpackage.cbu.i(list, i8, iC);
        int i9 = i4;
        boolean z3 = false;
        while (aoddVarI != null) {
            int i10 = aoddVarI.b;
            defpackage.cbu.j(list, i10);
            java.lang.Object obj = aoddVarI.c;
            if (obj != null) {
                int i11 = 8;
                defpackage.adw adwVar = ((defpackage.cdk) aoddVarI.a).g;
                if (adwVar == null) {
                    i = i5;
                } else {
                    i = i5;
                    if (obj instanceof defpackage.ckg) {
                        defpackage.ckg ckgVar = (defpackage.ckg) obj;
                        zB = ckgVar.b(adwVar.a(ckgVar));
                        j = j5;
                        i2 = i6;
                        z = z3;
                    } else {
                        if (obj instanceof defpackage.ady) {
                            defpackage.ady adyVar = (defpackage.ady) obj;
                            if (adyVar.c()) {
                                java.lang.Object[] objArr = adyVar.b;
                                long[] jArr = adyVar.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    j = j5;
                                    i2 = i6;
                                    int i12 = 0;
                                    while (true) {
                                        long j6 = jArr[i12];
                                        long[] jArr2 = jArr;
                                        z = z3;
                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < i13) {
                                                    if ((j6 & 255) < 128) {
                                                        java.lang.Object obj2 = objArr[(i12 << 3) + i14];
                                                        if (obj2 instanceof defpackage.ckg) {
                                                            defpackage.ckg ckgVar2 = (defpackage.ckg) obj2;
                                                            if (ckgVar2 == null) {
                                                                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.IndirectState<kotlin.Any?>");
                                                            }
                                                            if (ckgVar2.b(adwVar.a(ckgVar2))) {
                                                            }
                                                        }
                                                    }
                                                    j6 >>= i11;
                                                    i14++;
                                                } else if (i13 == i11) {
                                                    if (i12 != length) {
                                                        i12++;
                                                        z3 = z;
                                                        jArr = jArr2;
                                                        i11 = 8;
                                                    }
                                                }
                                            }
                                        } else if (i12 != length) {
                                            i12++;
                                            z3 = z;
                                            jArr = jArr2;
                                            i11 = 8;
                                        }
                                    }
                                } else {
                                    j = j5;
                                    i2 = i6;
                                    z = z3;
                                }
                            } else {
                                j = j5;
                                i2 = i6;
                                z = z3;
                            }
                            zB = false;
                        }
                        zB = true;
                    }
                }
                j = j5;
                i2 = i6;
                z = z3;
                zB = true;
            } else {
                i = i5;
                j = j5;
                i2 = i6;
                z = z3;
                zB = true;
            }
            java.lang.Object obj3 = aoddVarI.a;
            if (zB) {
                this.p.t(i10);
                int i15 = this.p.f;
                ax(i9, i15, i4);
                int iE = this.p.e(i15);
                while (iE != i4 && !this.p.B(iE)) {
                    iE = this.p.e(iE);
                }
                int iN = true != this.p.B(iE) ? i : 0;
                if (iE != i15) {
                    int iN2 = (N(iE) - this.p.d(i15)) + iN;
                    while (iN < iN2 && iE != i10) {
                        iE++;
                        while (true) {
                            if (iE >= i10) {
                                break;
                            }
                            int iC2 = this.p.c(iE) + iE;
                            if (i10 >= iC2) {
                                iN += this.p.B(iE) ? 1 : N(iE);
                                iE = iC2;
                            }
                        }
                    }
                }
                this.G = iN;
                this.I = an(i15);
                int iE2 = this.p.e(i15);
                long jRotateLeft = 0;
                int i16 = 0;
                int i17 = 3;
                while (true) {
                    if (iE2 >= 0) {
                        j3 = j;
                        if (iE2 == i4) {
                            jRotateLeft ^= java.lang.Long.rotateLeft(j3, i16);
                        } else {
                            defpackage.cfl cflVar2 = this.p;
                            i15 = i15;
                            if (cflVar2.z(iE2)) {
                                java.lang.Object objM = cflVar2.m(iE2);
                                if (objM != null) {
                                    if (objM instanceof java.lang.Enum) {
                                        iB = ((java.lang.Enum) objM).ordinal();
                                    } else if (objM instanceof defpackage.ccj) {
                                        j4 = jRotateLeft;
                                        iB = 126665345;
                                    } else {
                                        iB = objM.hashCode();
                                    }
                                    j4 = jRotateLeft;
                                } else {
                                    j4 = jRotateLeft;
                                    iB = 0;
                                }
                            } else {
                                iB = cflVar2.b(iE2);
                                j4 = jRotateLeft;
                                if (iB == 207) {
                                    java.lang.Object objJ = cflVar2.j(iE2);
                                    iB = (objJ == null || defpackage.aooh.n(objJ, defpackage.cau.a)) ? 207 : objJ.hashCode();
                                }
                            }
                            if (iB == 126665345) {
                                jRotateLeft = j4 ^ java.lang.Long.rotateLeft(126665345L, i16);
                                break;
                            }
                            jRotateLeft = (j4 ^ java.lang.Long.rotateLeft(iB, i17)) ^ java.lang.Long.rotateLeft(this.p.z(iE2) ? 0 : an(iE2), i16);
                            iE2 = this.p.e(iE2);
                            i16 = (i16 + 6) % 64;
                            i17 = (i17 + 6) % 64;
                            j = j3;
                            i15 = i15;
                        }
                    } else {
                        j3 = j;
                    }
                    break;
                }
                this.x = jRotateLeft;
                this.z = null;
                defpackage.aonn aonnVar = ((defpackage.cdk) obj3).c;
                if (aonnVar == null) {
                    throw new java.lang.IllegalStateException("Invalid restart scope");
                }
                aonnVar.a(this, 1);
                this.z = null;
                defpackage.cfl cflVar3 = this.p;
                int i18 = cflVar3.b[(i4 * 5) + 3] + i4;
                int i19 = cflVar3.f;
                if (i19 < i4 || i19 > i18) {
                    defpackage.cax.b(defpackage.a.bf(i19, i4, "Index ", " is not a parent of "));
                }
                cflVar3.h = i4;
                cflVar3.g = i18;
                cflVar3.j = 0;
                cflVar3.k = 0;
                j2 = j3;
                i9 = i15;
                z3 = true;
            } else {
                j2 = j;
                java.util.ArrayList arrayList = this.M;
                arrayList.add(obj3);
                defpackage.cdk cdkVar = (defpackage.cdk) obj3;
                defpackage.cdl cdlVar = cdkVar.a;
                if (cdlVar == null || (adoVar = cdkVar.f) == null) {
                    i3 = i9;
                } else {
                    cdkVar.g(true);
                    try {
                        java.lang.Object[] objArr2 = adoVar.b;
                        int[] iArr = adoVar.c;
                        long[] jArr3 = adoVar.a;
                        int length2 = jArr3.length - 2;
                        if (length2 >= 0) {
                            int i20 = 0;
                            while (true) {
                                long j7 = jArr3[i20];
                                java.lang.Object[] objArr3 = objArr2;
                                i3 = i9;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                                    long j8 = j7;
                                    for (int i22 = 0; i22 < i21; i22++) {
                                        if ((j8 & 255) < 128) {
                                            int i23 = (i20 << 3) + i22;
                                            java.lang.Object obj4 = objArr3[i23];
                                            int i24 = iArr[i23];
                                            if (obj4 instanceof defpackage.cbg) {
                                                ((defpackage.cbg) obj4).a();
                                            } else {
                                                cdlVar.a(obj4);
                                            }
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i21 != 8) {
                                        break;
                                    }
                                    if (i20 != length2) {
                                        break;
                                    }
                                    i20++;
                                    i9 = i3;
                                    objArr2 = objArr3;
                                } else if (i20 != length2) {
                                    break;
                                    break;
                                } else {
                                    i20++;
                                    i9 = i3;
                                    objArr2 = objArr3;
                                }
                            }
                        } else {
                            i3 = i9;
                        }
                        cdkVar.g(false);
                    } catch (java.lang.Throwable th) {
                        cdkVar.g(false);
                        throw th;
                    }
                }
                arrayList.remove(arrayList.size() - 1);
                z3 = z;
                i9 = i3;
            }
            aoddVarI = defpackage.cbu.i(list, this.p.f, iC);
            i5 = i;
            i6 = i2;
            j5 = j2;
        }
        int i25 = i5;
        long j9 = j5;
        int i26 = i6;
        int i27 = i9;
        if (z3) {
            ax(i27, i4, i4);
            this.p.u();
            int iN3 = N(i4);
            this.G = i25 + iN3;
            this.H = i26 + iN3;
            this.I = i7;
        } else {
            aA();
        }
        this.x = j9;
        this.o = z2;
    }

    private final void aw() {
        ay(this.p.f);
        defpackage.cfr cfrVar = this.t;
        cfrVar.g();
        cfrVar.j.a.i(defpackage.cgq.a);
        int i = cfrVar.c;
        defpackage.cfl cflVarA = cfrVar.a();
        cfrVar.c = i + cflVarA.b[(cflVarA.f * 5) + 3];
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    private final void ax(int i, int i2, int i3) {
        defpackage.cfl cflVar = this.p;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (cflVar.e(i) == i2) {
                i3 = i2;
            } else if (cflVar.e(i2) == i) {
                i3 = i;
            } else if (cflVar.e(i) == cflVar.e(i2)) {
                i3 = cflVar.e(i);
            } else {
                int iA = defpackage.cbu.a(cflVar, i, i3);
                int iA2 = defpackage.cbu.a(cflVar, i2, i3);
                int i4 = iA - iA2;
                int iE = i;
                for (int i5 = 0; i5 < i4; i5++) {
                    iE = cflVar.e(iE);
                }
                int i6 = iA2 - iA;
                int iE2 = i2;
                for (int i7 = 0; i7 < i6; i7++) {
                    iE2 = cflVar.e(iE2);
                }
                while (iE != iE2) {
                    iE = cflVar.e(iE);
                    iE2 = cflVar.e(iE2);
                }
                i3 = iE;
            }
        }
        while (i > 0 && i != i3) {
            if (cflVar.B(i)) {
                this.t.e();
            }
            i = cflVar.e(i);
        }
        aq(i2, i3);
    }

    private final void ay(int i) {
        boolean zB = this.p.B(i);
        if (zB) {
            defpackage.cfr cfrVar = this.t;
            cfrVar.h();
            cfrVar.c(this.p.o(i));
        }
        ao(this, i, i, zB, 0);
        defpackage.cfr cfrVar2 = this.t;
        cfrVar2.h();
        if (zB) {
            cfrVar2.e();
        }
    }

    private static final void az(defpackage.cbt cbtVar, java.util.List list, int i) {
        int iC = cbtVar.p.c(i) + i;
        int iC2 = i + 1;
        while (iC2 < iC) {
            if (cbtVar.p.y(iC2)) {
                cck cckVarAp = ap(cbtVar, iC2);
                if (cckVarAp != null) {
                    list.add(cckVarAp);
                }
            } else if (cbtVar.p.w(iC2)) {
                az(cbtVar, list, iC2);
            }
            iC2 += cbtVar.p.c(iC2);
        }
    }

    @Override // defpackage.ccb, defpackage.cav
    public final boolean A(long j) {
        java.lang.Object objQ = Q();
        if ((objQ instanceof java.lang.Long) && j == ((java.lang.Number) objQ).longValue()) {
            return false;
        }
        ad(java.lang.Long.valueOf(j));
        return true;
    }

    @Override // defpackage.cav
    public final boolean B(java.lang.Object obj) {
        if (defpackage.aooh.n(Q(), obj)) {
            return false;
        }
        ad(obj);
        return true;
    }

    @Override // defpackage.ccb, defpackage.cav
    public final boolean C(boolean z) {
        java.lang.Object objQ = Q();
        if ((objQ instanceof java.lang.Boolean) && z == ((java.lang.Boolean) objQ).booleanValue()) {
            return false;
        }
        ad(java.lang.Boolean.valueOf(z));
        return true;
    }

    @Override // defpackage.ccb, defpackage.cav
    public final boolean D(java.lang.Object obj) {
        if (Q() == obj) {
            return false;
        }
        ad(obj);
        return true;
    }

    @Override // defpackage.cav
    public final boolean E() {
        if (!G() || this.k) {
            return true;
        }
        defpackage.cdk cdkVarO = O();
        return (cdkVarO == null || (cdkVarO.b & 4) == 0) ? false : true;
    }

    @Override // defpackage.cav
    public final boolean F() {
        return this.w;
    }

    @Override // defpackage.cav
    public final boolean G() {
        defpackage.cdk cdkVarO;
        return (this.w || this.l || this.k || (cdkVarO = O()) == null || (cdkVarO.b & 8) != 0) ? false : true;
    }

    @Override // defpackage.cav
    public final boolean H(boolean z, int i) {
        defpackage.cdk cdkVarO;
        if (i == 0 && (this.w || this.l)) {
            ceb cebVar = this.u;
            if (cebVar != null && (cdkVarO = O()) != null && cebVar.a() && !cdkVarO.l()) {
                cdkVarO.r();
                cdkVarO.j(this.l);
                cdkVarO.e(true);
                defpackage.chi chiVar = this.t.j.a;
                chiVar.i(cgp.a);
                defpackage.chh.a(chiVar, 0, cdkVarO);
                this.b.i(cdkVarO);
                return false;
            }
        } else if (!z && G()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[LOOP:0: B:15:0x0037->B:28:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x007b A[EDGE_INSN: B:29:0x007b->B:30:0x007c BREAK  A[LOOP:0: B:15:0x0037->B:28:0x0077]] */
    /* JADX WARN: Code duplicated, block: B:61:0x007b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.cav
    public final defpackage.cdk I() {
        boolean z;
        defpackage.cdk cdkVar;
        defpackage.cfh cfhVarG;
        defpackage.gxa gxaVar;
        ?? r5;
        java.util.ArrayList arrayList = this.M;
        defpackage.cdk cdkVar2 = !arrayList.isEmpty() ? (defpackage.cdk) arrayList.remove(arrayList.size() - 1) : 0;
        int i = 0;
        if (cdkVar2 != 0) {
            cdkVar2.f(false);
            int i2 = this.L;
            defpackage.ado adoVar = cdkVar2.f;
            int i3 = 1;
            if (adoVar != null && !cdkVar2.n()) {
                java.lang.Object[] objArr = adoVar.b;
                int[] iArr = adoVar.c;
                long[] jArr = adoVar.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    gxaVar = null;
                    break;
                }
                int i4 = 0;
                loop0: while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i4 == length) {
                            gxaVar = null;
                            break;
                        }
                        i4++;
                        i = 0;
                    } else {
                        int i5 = ~(i4 - length);
                        int i6 = i;
                        while (true) {
                            int i7 = 8 - (i5 >>> 31);
                            if (i6 >= i7) {
                                if (i7 == 8) {
                                    if (i4 == length) {
                                        i4++;
                                        i = 0;
                                    }
                                }
                                gxaVar = null;
                                break;
                            }
                            if ((j & 255) < 128) {
                                int i8 = (i4 << 3) + i6;
                                java.lang.Object obj = objArr[i8];
                                if (iArr[i8] != i2) {
                                    gxaVar = new defpackage.gxa(cdkVar2, i2, adoVar, i3);
                                    break loop0;
                                }
                            }
                            j >>= 8;
                            i6++;
                        }
                    }
                }
            } else {
                gxaVar = null;
                break;
            }
            if (gxaVar != null) {
                defpackage.cfr cfrVar = this.t;
                defpackage.cbb cbbVar = this.f;
                defpackage.chi chiVar = cfrVar.j.a;
                chiVar.i(defpackage.cgb.a);
                r5 = 0;
                defpackage.chh.b(chiVar, 0, gxaVar, 1, cbbVar);
            } else {
                r5 = 0;
            }
            if (cdkVar2.l()) {
                cdkVar2.i(r5);
                defpackage.chi chiVar2 = this.t.j.a;
                chiVar2.i(cge.a);
                defpackage.chh.a(chiVar2, r5, cdkVar2);
                cdkVar2.j(r5);
                if ((cdkVar2.b & 1024) != 0) {
                    cdkVar2.h(r5);
                    if (this.J == this.p.h) {
                        this.l = r5;
                        this.J = -1;
                    }
                }
            }
        }
        if (cdkVar2 == 0 || cdkVar2.n()) {
            z = false;
            cdkVar = null;
        } else if (cdkVar2.o() || this.h) {
            if (cdkVar2.e == null) {
                if (this.w) {
                    defpackage.cfp cfpVar = this.r;
                    cfhVarG = cfpVar.p(cfpVar.q);
                } else {
                    defpackage.cfl cflVar = this.p;
                    cfhVarG = cflVar.g(cflVar.h);
                }
                cdkVar2.e = cfhVarG;
            }
            z = false;
            cdkVar2.d(false);
            cdkVar = cdkVar2;
        } else {
            cdkVar = null;
            z = false;
        }
        W(z);
        return cdkVar;
    }

    @Override // defpackage.cav
    public final void J() {
        Z(1219399079, null, 0, null);
    }

    @Override // defpackage.cav
    public final void K(java.lang.Object obj) {
        if (!this.w && this.p.a() == 207 && !defpackage.aooh.n(this.p.h(), obj) && this.J < 0) {
            this.J = this.p.f;
            this.l = true;
        }
        Z(207, null, 0, obj);
    }

    @Override // defpackage.cav
    public final defpackage.cje M() {
        return ai();
    }

    public final int N(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.g;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.p.d(i) : i2;
        }
        defpackage.acj acjVar = this.Q;
        if (acjVar == null || acjVar.a(i) < 0) {
            return 0;
        }
        int iA = acjVar.a(i);
        if (iA < 0) {
            defpackage.un.d(defpackage.a.bj(i, "Cannot find value for key "));
        }
        return acjVar.c[iA];
    }

    @Override // defpackage.ccb
    public final defpackage.cdk O() {
        if (this.m == 0 && this.f.f == 0) {
            java.util.ArrayList arrayList = this.M;
            if (!arrayList.isEmpty()) {
                return (defpackage.cdk) arrayList.get(arrayList.size() - 1);
            }
        }
        return null;
    }

    @Override // defpackage.ccb
    public final defpackage.cmc P() {
        this.b.w();
        return null;
    }

    public final java.lang.Object Q() {
        if (this.w) {
            aF();
            return defpackage.cau.a;
        }
        java.lang.Object objN = this.p.n();
        return (!this.l || (objN instanceof defpackage.cdz)) ? objN : defpackage.cau.a;
    }

    public final java.lang.Object R() {
        if (this.w) {
            aF();
            return defpackage.cau.a;
        }
        java.lang.Object objN = this.p.n();
        if (!this.l || (objN instanceof defpackage.cdz)) {
            return objN instanceof defpackage.cdw ? ((defpackage.cdw) objN).a() : objN;
        }
        return defpackage.cau.a;
    }

    public final void S() {
        if (this.K) {
            this.K = false;
            this.b.f();
        }
        T();
        this.E.clear();
        this.S.f();
        this.T.f();
        this.B.f();
        this.y = null;
        defpackage.cfs cfsVar = this.O;
        cfsVar.b.h();
        cfsVar.a.h();
        this.x = 0L;
        this.m = 0;
        this.i = false;
        this.w = false;
        this.l = false;
        this.o = false;
        this.J = -1;
        defpackage.cfl cflVar = this.p;
        if (!cflVar.e) {
            cflVar.r();
        }
        if (this.r.r) {
            return;
        }
        au();
    }

    public final void T() {
        this.F = null;
        this.G = 0;
        this.H = 0;
        this.x = 0L;
        this.i = false;
        defpackage.cfr cfrVar = this.t;
        cfrVar.a = false;
        cfrVar.k.f();
        cfrVar.c = 0;
        cfrVar.b = true;
        cfrVar.d = 0;
        cfrVar.e.clear();
        cfrVar.f = -1;
        cfrVar.g = -1;
        cfrVar.h = -1;
        cfrVar.i = 0;
        this.M.clear();
        this.g = null;
        this.Q = null;
    }

    public final void U() {
        if (!this.r.r) {
            defpackage.cax.b("Check failed");
        }
        au();
    }

    @Override // defpackage.ccb
    public final void V() {
        this.M.clear();
        this.j.clear();
        this.d.i();
        this.y = null;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02a3 A[LOOP:4: B:103:0x024b->B:125:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:203:0x02c3 A[EDGE_INSN: B:203:0x02c3->B:129:0x02c3 BREAK  A[LOOP:4: B:103:0x024b->B:125:0x02a3], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void W(boolean z) {
        int iHashCode;
        long j;
        long jRotateRight;
        defpackage.appu appuVar;
        int i;
        boolean z2;
        ?? r8;
        int i2;
        defpackage.appu appuVar2;
        java.util.List list;
        java.util.List list2;
        java.util.HashSet hashSet;
        defpackage.ady adyVar;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        long j3;
        int i9;
        int iHashCode2;
        long j4;
        long jRotateRight2;
        defpackage.appu appuVar3 = this.S;
        int i10 = -1;
        int i11 = ((int[]) appuVar3.b)[appuVar3.a - 2] - 1;
        int i12 = 207;
        if (this.w) {
            defpackage.cfp cfpVar = this.r;
            int i13 = cfpVar.q;
            int i14 = cfpVar.i(i13);
            java.lang.Object objS = this.r.s(i13);
            java.lang.Object objR = this.r.r(i13);
            if (objS == null) {
                long j5 = i11;
                if (objR == null || i14 != 207) {
                    i12 = i14;
                } else {
                    if (!defpackage.aooh.n(objR, defpackage.cau.a)) {
                        iHashCode2 = objR.hashCode();
                        j4 = this.x ^ j5;
                    }
                    this.x = jRotateRight2;
                }
                jRotateRight2 = java.lang.Long.rotateRight(java.lang.Long.rotateRight(this.x ^ j5, 3) ^ ((long) i12), 3);
                this.x = jRotateRight2;
            } else if (objS instanceof java.lang.Enum) {
                iHashCode2 = ((java.lang.Enum) objS).ordinal();
                j4 = this.x;
            } else {
                iHashCode2 = objS.hashCode();
                j4 = this.x;
            }
            jRotateRight2 = java.lang.Long.rotateRight(java.lang.Long.rotateRight(j4, 3) ^ ((long) iHashCode2), 3);
            this.x = jRotateRight2;
        } else {
            defpackage.cfl cflVar = this.p;
            int i15 = cflVar.h;
            int iB = cflVar.b(i15);
            java.lang.Object objM = this.p.m(i15);
            java.lang.Object objJ = this.p.j(i15);
            if (objM == null) {
                long j6 = i11;
                if (objJ == null || iB != 207) {
                    i12 = iB;
                } else {
                    if (!defpackage.aooh.n(objJ, defpackage.cau.a)) {
                        iHashCode = objJ.hashCode();
                        j = this.x ^ j6;
                    }
                    this.x = jRotateRight;
                }
                jRotateRight = java.lang.Long.rotateRight(java.lang.Long.rotateRight(this.x ^ j6, 3) ^ ((long) i12), 3);
                this.x = jRotateRight;
            } else if (objM instanceof java.lang.Enum) {
                iHashCode = ((java.lang.Enum) objM).ordinal();
                j = this.x;
            } else {
                iHashCode = objM.hashCode();
                j = this.x;
            }
            jRotateRight = java.lang.Long.rotateRight(java.lang.Long.rotateRight(j, 3) ^ ((long) iHashCode), 3);
            this.x = jRotateRight;
        }
        int i16 = this.H;
        defpackage.cbw cbwVar = this.F;
        if (cbwVar != null) {
            java.util.List list3 = cbwVar.a;
            if (list3.size() > 0) {
                java.util.List list4 = cbwVar.d;
                java.util.HashSet hashSet2 = new java.util.HashSet(list4.size());
                int size = list4.size();
                for (int i17 = 0; i17 < size; i17++) {
                    hashSet2.add(list4.get(i17));
                }
                defpackage.ady adyVar2 = defpackage.adz.a;
                defpackage.ady adyVar3 = new defpackage.ady(6);
                int size2 = list4.size();
                int size3 = list3.size();
                int i18 = 0;
                int i19 = 0;
                int iB2 = 0;
                while (i18 < size3) {
                    defpackage.cfj cfjVar = (defpackage.cfj) list3.get(i18);
                    if (hashSet2.contains(cfjVar)) {
                        appuVar2 = appuVar3;
                        i2 = i10;
                        if (adyVar3.a(cfjVar)) {
                            i18++;
                        } else if (i19 < size2) {
                            defpackage.cfj cfjVar2 = (defpackage.cfj) list4.get(i19);
                            if (cfjVar2 != cfjVar) {
                                int iA = cbwVar.a(cfjVar2);
                                adyVar3.j(cfjVar2);
                                if (iA != iB2) {
                                    int iB3 = cbwVar.b(cfjVar2);
                                    defpackage.cfr cfrVar = this.t;
                                    list = list3;
                                    int i20 = cbwVar.b;
                                    if (iB3 > 0) {
                                        int i21 = iB2 + i20;
                                        list2 = list4;
                                        int i22 = iA + i20;
                                        hashSet = hashSet2;
                                        int i23 = cfrVar.i;
                                        if (i23 > 0) {
                                            adyVar = adyVar3;
                                            if (cfrVar.g == i22 - i23 && cfrVar.h == i21 - i23) {
                                                cfrVar.i = i23 + iB3;
                                            }
                                        } else {
                                            adyVar = adyVar3;
                                        }
                                        cfrVar.h();
                                        cfrVar.g = i22;
                                        cfrVar.h = i21;
                                        cfrVar.i = iB3;
                                    } else {
                                        list2 = list4;
                                        hashSet = hashSet2;
                                        adyVar = adyVar3;
                                    }
                                    if (iA <= iB2) {
                                        i3 = size2;
                                        i4 = size3;
                                        if (iB2 > iA) {
                                            defpackage.aco acoVar = cbwVar.f;
                                            java.lang.Object[] objArr = acoVar.c;
                                            long[] jArr = acoVar.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    long j7 = jArr[i24];
                                                    long[] jArr2 = jArr;
                                                    java.lang.Object[] objArr2 = objArr;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i25 = 8 - ((~(i24 - length)) >>> 31);
                                                        for (int i26 = 0; i26 < i25; i26 = i5 + 1) {
                                                            if ((j7 & 255) < 128) {
                                                                i5 = i26;
                                                                defpackage.aalk aalkVar = (defpackage.aalk) objArr2[(i24 << 3) + i26];
                                                                j2 = j7;
                                                                int i27 = aalkVar.b;
                                                                if (iA <= i27 && i27 < iA + iB3) {
                                                                    i6 = (i27 - iA) + iB2;
                                                                } else if (iA + 1 <= i27 && i27 < iB2) {
                                                                    i6 = i27 - iB3;
                                                                }
                                                                aalkVar.b = i6;
                                                            } else {
                                                                i5 = i26;
                                                                j2 = j7;
                                                            }
                                                            j7 = j2 >> 8;
                                                        }
                                                        if (i25 != 8) {
                                                            break;
                                                        }
                                                        if (i24 != length) {
                                                            break;
                                                        }
                                                        i24++;
                                                        objArr = objArr2;
                                                        jArr = jArr2;
                                                    } else if (i24 != length) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i24++;
                                                        objArr = objArr2;
                                                        jArr = jArr2;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        defpackage.aco acoVar2 = cbwVar.f;
                                        java.lang.Object[] objArr3 = acoVar2.c;
                                        long[] jArr3 = acoVar2.a;
                                        int length2 = jArr3.length - 2;
                                        if (length2 >= 0) {
                                            int i28 = 0;
                                            while (true) {
                                                long j8 = jArr3[i28];
                                                i3 = size2;
                                                i4 = size3;
                                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                                    int i30 = 0;
                                                    while (i30 < i29) {
                                                        if ((j8 & 255) < 128) {
                                                            i8 = iB3;
                                                            defpackage.aalk aalkVar2 = (defpackage.aalk) objArr3[(i28 << 3) + i30];
                                                            j3 = j8;
                                                            int i31 = aalkVar2.b;
                                                            if (iA <= i31 && i31 < iA + i8) {
                                                                i9 = (i31 - iA) + iB2;
                                                            } else if (iB2 <= i31 && i31 < iA) {
                                                                i9 = i31 + i8;
                                                            }
                                                            aalkVar2.b = i9;
                                                        } else {
                                                            i8 = iB3;
                                                            j3 = j8;
                                                        }
                                                        j8 = j3 >> 8;
                                                        i30++;
                                                        iB3 = i8;
                                                    }
                                                    i7 = iB3;
                                                    if (i29 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = iB3;
                                                }
                                                if (i28 == length2) {
                                                    break;
                                                }
                                                i28++;
                                                size2 = i3;
                                                size3 = i4;
                                                iB3 = i7;
                                            }
                                        }
                                    }
                                } else {
                                    list = list3;
                                    list2 = list4;
                                    hashSet = hashSet2;
                                    adyVar = adyVar3;
                                }
                                i3 = size2;
                                i4 = size3;
                            } else {
                                list = list3;
                                list2 = list4;
                                hashSet = hashSet2;
                                adyVar = adyVar3;
                                i3 = size2;
                                i4 = size3;
                                i18++;
                            }
                            i19++;
                            iB2 += cbwVar.b(cfjVar2);
                            appuVar3 = appuVar2;
                            i10 = i2;
                            list3 = list;
                            hashSet2 = hashSet;
                            list4 = list2;
                            adyVar3 = adyVar;
                            size2 = i3;
                            size3 = i4;
                        }
                    } else {
                        i18++;
                        int iA2 = cbwVar.a(cfjVar);
                        i2 = i10;
                        defpackage.cfr cfrVar2 = this.t;
                        int i32 = iA2 + cbwVar.b;
                        appuVar2 = appuVar3;
                        cfrVar2.k(i32, cfjVar.d);
                        int i33 = cfjVar.c;
                        cbwVar.d(i33, 0);
                        cfrVar2.d(i33);
                        this.p.t(i33);
                        aw();
                        this.p.f();
                        defpackage.cbu.g(this.j, i33, this.p.c(i33) + i33);
                    }
                    appuVar3 = appuVar2;
                    i10 = i2;
                }
                appuVar = appuVar3;
                i = i10;
                defpackage.cfr cfrVar3 = this.t;
                cfrVar3.h();
                if (list3.size() > 0) {
                    cfrVar3.d(this.p.g);
                    this.p.u();
                }
            } else {
                appuVar = appuVar3;
                i = -1;
            }
        } else {
            appuVar = appuVar3;
            i = -1;
        }
        boolean z3 = this.w;
        if (!z3) {
            defpackage.cfl cflVar2 = this.p;
            int i34 = cflVar2.k - cflVar2.j;
            if (i34 > 0) {
                defpackage.cfr cfrVar4 = this.t;
                cfrVar4.g();
                defpackage.chi chiVar = cfrVar4.j.a;
                chiVar.i(cgw.a);
                chiVar.c[chiVar.d - chiVar.a[chiVar.b - 1].b] = i34;
            }
        }
        int i35 = this.G;
        while (!this.p.A()) {
            int i36 = this.p.f;
            aw();
            this.t.k(i35, this.p.f());
            defpackage.cbu.g(this.j, i36, this.p.f);
        }
        if (z3) {
            if (z) {
                defpackage.cfs cfsVar = this.O;
                defpackage.chi chiVar2 = cfsVar.b;
                if (!chiVar2.k()) {
                    defpackage.cax.b("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                defpackage.chi chiVar3 = cfsVar.a;
                defpackage.chd[] chdVarArr = chiVar2.a;
                int i37 = chiVar2.b - 1;
                chiVar2.b = i37;
                defpackage.chd chdVar = chdVarArr[i37];
                chdVarArr[i37] = null;
                chiVar3.i(chdVar);
                java.lang.Object[] objArr4 = chiVar2.e;
                java.lang.Object[] objArr5 = chiVar3.e;
                int i38 = chiVar3.f;
                int i39 = chdVar.c;
                int i40 = chiVar2.f;
                int i41 = i40 - i39;
                java.lang.System.arraycopy(objArr4, i41, objArr5, i38 - i39, i40 - i41);
                java.lang.Object[] objArr6 = chiVar2.e;
                int i42 = chiVar2.f;
                int i43 = i42 - i39;
                if (objArr6 == null) {
                    defpackage.aooh.i("<this>");
                }
                java.util.Arrays.fill(objArr6, i43, i42, (java.lang.Object) null);
                int[] iArr = chiVar2.c;
                int[] iArr2 = chiVar3.c;
                int i44 = chiVar3.d;
                int i45 = chdVar.b;
                int i46 = chiVar2.d;
                defpackage.ajsz.db(iArr, iArr2, i44 - i45, i46 - i45, i46);
                chiVar2.f -= i39;
                chiVar2.d -= i45;
                i16 = 1;
            }
            defpackage.cfl cflVar3 = this.p;
            if (cflVar3.i <= 0) {
                defpackage.cdh.a("Unbalanced begin/end empty");
            }
            cflVar3.i--;
            defpackage.cfp cfpVar2 = this.r;
            int i47 = cfpVar2.q;
            cfpVar2.V();
            if (!this.p.x()) {
                int i48 = (-2) - i47;
                this.r.y();
                this.r.x(true);
                defpackage.cfh cfhVar = this.N;
                defpackage.cfs cfsVar2 = this.O;
                boolean zJ = cfsVar2.a.j();
                defpackage.cfr cfrVar5 = this.t;
                if (zJ) {
                    defpackage.cfm cfmVar = this.q;
                    cfrVar5.f();
                    cfrVar5.g();
                    cfrVar5.h();
                    defpackage.chi chiVar4 = cfrVar5.j.a;
                    chiVar4.i(defpackage.cgi.a);
                    r8 = 0;
                    defpackage.chh.b(chiVar4, 0, cfhVar, 1, cfmVar);
                } else {
                    defpackage.cfm cfmVar2 = this.q;
                    cfrVar5.f();
                    cfrVar5.g();
                    cfrVar5.h();
                    defpackage.chi chiVar5 = cfrVar5.j.a;
                    chiVar5.i(defpackage.cgj.a);
                    defpackage.chh.c(chiVar5, cfhVar, cfmVar2, cfsVar2);
                    this.O = new defpackage.cfs();
                    r8 = 0;
                }
                this.w = r8;
                if (!this.c.c()) {
                    ac(i48, r8);
                    aC(i48, i16);
                }
            }
        } else {
            if (z) {
                this.t.e();
                z2 = true;
            } else {
                z2 = false;
            }
            defpackage.cfr cfrVar6 = this.t;
            int i49 = cfrVar6.a().h;
            defpackage.appu appuVar4 = cfrVar6.k;
            int i50 = i;
            if (appuVar4.d(i50) > i49) {
                defpackage.cax.b("Missed recording an endGroup");
            }
            if (appuVar4.d(i50) == i49) {
                cfrVar6.i(false);
                appuVar4.e();
                cfrVar6.j.j();
            }
            int i51 = this.p.h;
            if (i16 != N(i51)) {
                aC(i51, i16);
            }
            if (true == z2) {
                i16 = 1;
            }
            this.p.s();
            cfrVar6.h();
        }
        java.util.ArrayList arrayList = this.E;
        defpackage.cbw cbwVar2 = (defpackage.cbw) arrayList.remove(arrayList.size() - 1);
        if (cbwVar2 != null && !z3) {
            cbwVar2.c++;
        }
        this.F = cbwVar2;
        this.G = appuVar.e() + i16;
        this.I = appuVar.e();
        this.H = appuVar.e() + i16;
    }

    @Override // defpackage.ccb
    public final void X() {
        if (this.o || this.J != 0) {
            defpackage.cdh.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.J = -1;
        this.l = false;
    }

    public final void Y() {
        this.H += this.p.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v35 */
    public final void Z(int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        int iHashCode;
        long j;
        int i3;
        int i4;
        defpackage.cbw cbwVar;
        boolean z;
        int i5;
        boolean z2;
        long[] jArr;
        long[] jArr2;
        char c;
        char c2;
        int i6;
        int i7;
        long jRotateLeft;
        java.lang.Object obj3 = obj;
        aF();
        int i8 = this.I;
        if (obj3 == null) {
            long j2 = i8;
            if (obj2 != null) {
                i3 = 207;
                i7 = i;
                if (i7 == 207) {
                    if (!defpackage.aooh.n(obj2, defpackage.cau.a)) {
                        jRotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.x, 3) ^ ((long) obj2.hashCode()), 3);
                    }
                    this.x = jRotateLeft ^ j2;
                }
                jRotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.x, 3) ^ ((long) i3), 3);
                this.x = jRotateLeft ^ j2;
            } else {
                i7 = i;
            }
            i3 = i7;
            jRotateLeft = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.x, 3) ^ ((long) i3), 3);
            this.x = jRotateLeft ^ j2;
        } else {
            if (obj3 instanceof java.lang.Enum) {
                iHashCode = ((java.lang.Enum) obj3).ordinal();
                j = this.x;
            } else {
                iHashCode = obj3.hashCode();
                j = this.x;
            }
            this.x = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(j, 3) ^ ((long) iHashCode), 3);
            i3 = i;
        }
        boolean z3 = true;
        if (obj3 == null) {
            this.I++;
        } else if (i3 == 201) {
            if (defpackage.aooh.n(obj3, defpackage.cax.b)) {
                i3 = 201;
                this.I++;
            } else {
                i3 = 201;
            }
        }
        boolean z4 = i2 != 0;
        int i9 = -1;
        if (this.w) {
            this.p.q();
            defpackage.cfp cfpVar = this.r;
            int i10 = cfpVar.o;
            if (z4) {
                cfpVar.M(i3, defpackage.cau.a);
            } else {
                if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = defpackage.cau.a;
                    }
                    cfpVar.L(i3, obj3, false, obj2);
                } else {
                    if (obj3 == null) {
                        obj3 = defpackage.cau.a;
                    }
                    cfpVar.K(i3, obj3);
                }
                z3 = false;
            }
            defpackage.cbw cbwVar2 = this.F;
            if (cbwVar2 != null) {
                defpackage.cfj cfjVar = new defpackage.cfj(i3, -1, (-2) - i10, -1);
                cbwVar2.c(cfjVar, this.G - cbwVar2.b);
                cbwVar2.e(cfjVar);
            }
            as(z3, null);
            return;
        }
        boolean z5 = i2 == 1 && this.l;
        if (this.F == null) {
            int iA = this.p.a();
            if (!z5 && iA == i3 && defpackage.aooh.n(obj3, this.p.i())) {
                aB(z4, obj2);
                i4 = -1;
            } else {
                defpackage.cfl cflVar = this.p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (cflVar.i <= 0) {
                    int i11 = cflVar.f;
                    while (i11 < cflVar.g) {
                        int i12 = i11 * 5;
                        int i13 = i9;
                        int[] iArr = cflVar.b;
                        int i14 = iArr[i12];
                        java.lang.Object objP = cflVar.p(iArr, i11);
                        int i15 = iArr[i12 + 1];
                        arrayList.add(new defpackage.cfj(i14, objP, i11, (i15 & 1073741824) != 0 ? 1 : i15 & 67108863));
                        i11 += iArr[i12 + 3];
                        i9 = i13;
                    }
                }
                i4 = i9;
                this.F = new defpackage.cbw(arrayList, this.G);
            }
        } else {
            i4 = -1;
        }
        defpackage.cbw cbwVar3 = this.F;
        if (cbwVar3 != null) {
            ccc cccVar = obj3 != null ? new ccc(java.lang.Integer.valueOf(i3), obj3) : java.lang.Integer.valueOf(i3);
            defpackage.adw adwVar = ((defpackage.cey) cbwVar3.e.a()).a;
            java.lang.Object objA = adwVar.a(cccVar);
            if (objA == null) {
                objA = null;
            } else if (objA instanceof defpackage.adq) {
                defpackage.adq adqVar = (defpackage.adq) objA;
                java.lang.Object objH = adqVar.h(0);
                if (adqVar.f()) {
                    adwVar.i(cccVar);
                }
                if (adqVar.b == 1) {
                    adwVar.n(cccVar, adqVar.b());
                }
                objA = objH;
            } else {
                adwVar.i(cccVar);
            }
            defpackage.cfj cfjVar2 = (defpackage.cfj) objA;
            if (z5 || cfjVar2 == null) {
                boolean z6 = z4;
                this.p.q();
                boolean z7 = true;
                this.w = true;
                this.z = null;
                ar();
                this.r.w();
                defpackage.cfp cfpVar2 = this.r;
                int i16 = cfpVar2.o;
                if (z6) {
                    cfpVar2.M(i3, defpackage.cau.a);
                    z = false;
                } else {
                    if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = defpackage.cau.a;
                        }
                        z = false;
                        cfpVar2.L(i3, obj3, false, obj2);
                    } else {
                        z = false;
                        if (obj3 == null) {
                            obj3 = defpackage.cau.a;
                        }
                        cfpVar2.K(i3, obj3);
                    }
                    z7 = z;
                }
                this.N = this.r.p(i16);
                defpackage.cfj cfjVar3 = new defpackage.cfj(i3, java.lang.Integer.valueOf(i4), (-2) - i16, i4);
                cbwVar3.c(cfjVar3, this.G - cbwVar3.b);
                cbwVar3.e(cfjVar3);
                cbwVar = new defpackage.cbw(new java.util.ArrayList(), z7 ? z : this.G);
                z4 = z7;
            } else {
                cbwVar3.e(cfjVar2);
                this.G = cbwVar3.a(cfjVar2) + cbwVar3.b;
                defpackage.aco acoVar = cbwVar3.f;
                int i17 = cfjVar2.c;
                defpackage.aalk aalkVar = (defpackage.aalk) acoVar.a(i17);
                int i18 = aalkVar != null ? aalkVar.c : i4;
                int i19 = cbwVar3.c;
                int i20 = i18 - i19;
                int i21 = 8;
                if (i18 <= i19) {
                    i5 = i20;
                    z2 = z4;
                    if (i19 > i18) {
                        java.lang.Object[] objArr = acoVar.c;
                        long[] jArr3 = acoVar.a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i22 = 0;
                            while (true) {
                                long j3 = jArr3[i22];
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i23 = 8 - ((~(i22 - length)) >>> 31);
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        if ((j3 & 255) >= 128) {
                                            jArr2 = jArr3;
                                        } else {
                                            defpackage.aalk aalkVar2 = (defpackage.aalk) objArr[(i22 << 3) + i24];
                                            int i25 = aalkVar2.c;
                                            if (i25 == i18) {
                                                aalkVar2.c = i19;
                                                jArr2 = jArr3;
                                            } else {
                                                jArr2 = jArr3;
                                                if (i18 + 1 <= i25 && i25 < i19) {
                                                    aalkVar2.c = i25 - 1;
                                                }
                                            }
                                        }
                                        j3 >>= 8;
                                        i24++;
                                        jArr3 = jArr2;
                                    }
                                    jArr = jArr3;
                                    if (i23 != 8) {
                                        break;
                                    }
                                } else {
                                    jArr = jArr3;
                                }
                                if (i22 == length) {
                                    break;
                                }
                                i22++;
                                jArr3 = jArr;
                            }
                        }
                    }
                } else {
                    java.lang.Object[] objArr2 = acoVar.c;
                    long[] jArr4 = acoVar.a;
                    int length2 = jArr4.length - 2;
                    if (length2 >= 0) {
                        int i26 = 0;
                        char c3 = 7;
                        while (true) {
                            long j4 = jArr4[i26];
                            i5 = i20;
                            z2 = z4;
                            if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                int i28 = 0;
                                while (i28 < i27) {
                                    if ((j4 & 255) < 128) {
                                        c2 = c3;
                                        defpackage.aalk aalkVar3 = (defpackage.aalk) objArr2[(i26 << 3) + i28];
                                        i6 = i21;
                                        int i29 = aalkVar3.c;
                                        if (i29 == i18) {
                                            aalkVar3.c = i19;
                                        } else if (i19 <= i29 && i29 < i18) {
                                            aalkVar3.c = i29 + 1;
                                        }
                                    } else {
                                        c2 = c3;
                                        i6 = i21;
                                    }
                                    j4 >>= i6;
                                    i28++;
                                    i21 = i6;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i27 != i21) {
                                    break;
                                }
                            } else {
                                c = c3;
                            }
                            if (i26 == length2) {
                                break;
                            }
                            i26++;
                            z4 = z2;
                            i20 = i5;
                            c3 = c;
                            i21 = 8;
                        }
                    } else {
                        i5 = i20;
                        z2 = z4;
                    }
                }
                defpackage.cfr cfrVar = this.t;
                cfrVar.d(i17);
                this.p.t(i17);
                if (i5 > 0) {
                    cfrVar.g();
                    defpackage.chi chiVar = cfrVar.j.a;
                    chiVar.i(cgk.a);
                    chiVar.c[chiVar.d - chiVar.a[chiVar.b - 1].b] = i5;
                }
                aB(z2, obj2);
                z4 = z2;
                cbwVar = null;
            }
        } else {
            cbwVar = null;
        }
        as(z4, cbwVar);
    }

    @Override // defpackage.cav
    public final long a() {
        return this.x;
    }

    @Override // defpackage.ccb
    public final void aa() {
        this.J = 0;
        this.l = true;
    }

    public final void ab(java.lang.Object obj) {
        if (obj instanceof defpackage.cdv) {
            defpackage.cbx cbxVar = new defpackage.cbx((defpackage.cdv) obj, this.I - 1);
            if (this.w) {
                defpackage.chi chiVar = this.t.j.a;
                chiVar.i(defpackage.cgo.a);
                defpackage.chh.a(chiVar, 0, cbxVar);
            }
            this.D.add(obj);
            obj = cbxVar;
        }
        ad(obj);
    }

    public final void ac(int i, int i2) {
        if (N(i) != i2) {
            if (i < 0) {
                defpackage.acj acjVar = this.Q;
                if (acjVar == null) {
                    acjVar = new defpackage.acj(6);
                    this.Q = acjVar;
                }
                acjVar.c(i, i2);
                return;
            }
            int[] iArr = this.g;
            if (iArr == null) {
                int i3 = this.p.c;
                int[] iArr2 = new int[i3];
                java.util.Arrays.fill(iArr2, 0, i3, -1);
                this.g = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final void ad(java.lang.Object obj) {
        if (this.w) {
            this.r.X(obj);
            return;
        }
        defpackage.cfl cflVar = this.p;
        if (!cflVar.l) {
            defpackage.cfr cfrVar = this.t;
            defpackage.cfh cfhVarG = cflVar.g(cflVar.h);
            defpackage.chi chiVar = cfrVar.j.a;
            chiVar.i(defpackage.cfu.a);
            defpackage.chh.b(chiVar, 0, cfhVarG, 1, obj);
            return;
        }
        int iD = cflVar.j - defpackage.cfo.d(cflVar.b, cflVar.h);
        defpackage.cfr cfrVar2 = this.t;
        int i = iD - 1;
        if (cfrVar2.a().h - cfrVar2.c >= 0) {
            cfrVar2.i(true);
            defpackage.chi chiVar2 = cfrVar2.j.a;
            chiVar2.i(defpackage.cha.a);
            defpackage.chh.a(chiVar2, 0, obj);
            chiVar2.c[chiVar2.d - chiVar2.a[chiVar2.b - 1].b] = i;
            return;
        }
        defpackage.cfl cflVar2 = this.p;
        defpackage.cfh cfhVarG2 = cflVar2.g(cflVar2.h);
        defpackage.chi chiVar3 = cfrVar2.j.a;
        chiVar3.i(cgx.a);
        defpackage.chh.b(chiVar3, 0, obj, 1, cfhVarG2);
        chiVar3.c[chiVar3.d - chiVar3.a[chiVar3.b - 1].b] = i;
    }

    @Override // defpackage.ccb
    public final boolean ae(defpackage.cdk cdkVar, java.lang.Object obj) {
        defpackage.cfh cfhVar = cdkVar.e;
        if (cfhVar == null) {
            return false;
        }
        int iD = this.p.a.d(defpackage.cfd.c(cfhVar));
        if (!this.o || iD < this.p.f) {
            return false;
        }
        java.util.List list = this.j;
        int iC = defpackage.cbu.c(list, iD);
        if (iC < 0) {
            int i = iC + 1;
            if (true != (obj instanceof defpackage.ckg)) {
                obj = null;
            }
            list.add(-i, new defpackage.aodd(cdkVar, iD, obj));
        } else {
            defpackage.aodd aoddVar = (defpackage.aodd) list.get(iC);
            if (obj instanceof defpackage.ckg) {
                java.lang.Object obj2 = aoddVar.c;
                if (obj2 == null) {
                    aoddVar.c = obj;
                } else if (obj2 instanceof defpackage.ady) {
                    ((defpackage.ady) obj2).j(obj);
                } else {
                    defpackage.ady adyVar = defpackage.adz.a;
                    defpackage.ady adyVar2 = new defpackage.ady(2);
                    adyVar2.h(obj2);
                    adyVar2.h(obj);
                    aoddVar.c = adyVar2;
                }
            } else {
                aoddVar.c = null;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:7:0x002e, B:9:0x0061, B:10:0x0067, B:12:0x006b, B:18:0x0088, B:20:0x0094, B:21:0x009e, B:24:0x00a6, B:27:0x00ad, B:73:0x01c5, B:75:0x01df, B:76:0x01e4, B:78:0x01ec, B:79:0x01f1, B:83:0x0203, B:28:0x00b9, B:31:0x00bf, B:33:0x00c7, B:34:0x00d9, B:36:0x00e1, B:38:0x00e9, B:42:0x0102, B:44:0x010a, B:53:0x015f, B:57:0x0172, B:61:0x0181, B:63:0x0189, B:71:0x01bd, B:72:0x01c3, B:65:0x0197, B:66:0x01a6, B:68:0x01aa, B:70:0x01b9, B:69:0x01b3, B:47:0x012b, B:48:0x013c, B:50:0x0143, B:52:0x0153, B:51:0x014d, B:14:0x0073, B:16:0x0079, B:17:0x007c), top: B:96:0x002e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0079 A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:7:0x002e, B:9:0x0061, B:10:0x0067, B:12:0x006b, B:18:0x0088, B:20:0x0094, B:21:0x009e, B:24:0x00a6, B:27:0x00ad, B:73:0x01c5, B:75:0x01df, B:76:0x01e4, B:78:0x01ec, B:79:0x01f1, B:83:0x0203, B:28:0x00b9, B:31:0x00bf, B:33:0x00c7, B:34:0x00d9, B:36:0x00e1, B:38:0x00e9, B:42:0x0102, B:44:0x010a, B:53:0x015f, B:57:0x0172, B:61:0x0181, B:63:0x0189, B:71:0x01bd, B:72:0x01c3, B:65:0x0197, B:66:0x01a6, B:68:0x01aa, B:70:0x01b9, B:69:0x01b3, B:47:0x012b, B:48:0x013c, B:50:0x0143, B:52:0x0153, B:51:0x014d, B:14:0x0073, B:16:0x0079, B:17:0x007c), top: B:96:0x002e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01df A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:7:0x002e, B:9:0x0061, B:10:0x0067, B:12:0x006b, B:18:0x0088, B:20:0x0094, B:21:0x009e, B:24:0x00a6, B:27:0x00ad, B:73:0x01c5, B:75:0x01df, B:76:0x01e4, B:78:0x01ec, B:79:0x01f1, B:83:0x0203, B:28:0x00b9, B:31:0x00bf, B:33:0x00c7, B:34:0x00d9, B:36:0x00e1, B:38:0x00e9, B:42:0x0102, B:44:0x010a, B:53:0x015f, B:57:0x0172, B:61:0x0181, B:63:0x0189, B:71:0x01bd, B:72:0x01c3, B:65:0x0197, B:66:0x01a6, B:68:0x01aa, B:70:0x01b9, B:69:0x01b3, B:47:0x012b, B:48:0x013c, B:50:0x0143, B:52:0x0153, B:51:0x014d, B:14:0x0073, B:16:0x0079, B:17:0x007c), top: B:96:0x002e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec A[Catch: all -> 0x0213, TryCatch #0 {all -> 0x0213, blocks: (B:7:0x002e, B:9:0x0061, B:10:0x0067, B:12:0x006b, B:18:0x0088, B:20:0x0094, B:21:0x009e, B:24:0x00a6, B:27:0x00ad, B:73:0x01c5, B:75:0x01df, B:76:0x01e4, B:78:0x01ec, B:79:0x01f1, B:83:0x0203, B:28:0x00b9, B:31:0x00bf, B:33:0x00c7, B:34:0x00d9, B:36:0x00e1, B:38:0x00e9, B:42:0x0102, B:44:0x010a, B:53:0x015f, B:57:0x0172, B:61:0x0181, B:63:0x0189, B:71:0x01bd, B:72:0x01c3, B:65:0x0197, B:66:0x01a6, B:68:0x01aa, B:70:0x01b9, B:69:0x01b3, B:47:0x012b, B:48:0x013c, B:50:0x0143, B:52:0x0153, B:51:0x014d, B:14:0x0073, B:16:0x0079, B:17:0x007c), top: B:96:0x002e, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0202  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void af(defpackage.adw adwVar, defpackage.aonn aonnVar) {
        defpackage.cbd cbdVar;
        int iHashCode;
        long j;
        int iHashCode2;
        long j2;
        long jRotateRight;
        long jRotateRight2;
        defpackage.cfr cfrVar;
        boolean z;
        if (this.o) {
            defpackage.cax.b("Reentrant composition is not supported");
        }
        android.os.Trace.beginSection("Compose:recompose");
        try {
            long jV = defpackage.ckw.b().v();
            this.L = (int) (jV ^ (jV >>> 32));
            this.y = null;
            ag(adwVar);
            this.G = 0;
            boolean z2 = true;
            this.o = true;
            try {
                this.I = 0;
                this.p = this.c.e();
                Z(100, null, 0, null);
                defpackage.caz cazVar = this.b;
                cazVar.j();
                this.K = true;
                defpackage.cje cjeVarU = cazVar.u();
                this.x = cazVar.a();
                defpackage.appu appuVar = this.B;
                appuVar.g(this.k ? 1 : 0);
                this.k = B(cjeVarU);
                this.z = null;
                if (!this.h) {
                    this.h = cazVar.m();
                }
                if (this.n) {
                    cbdVar = cmd.a;
                    if (cbdVar == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                    }
                    P();
                    cjeVarU = cjeVarU.i(cbdVar, new defpackage.ceu(null));
                } else {
                    boolean zN = cazVar.n();
                    this.n = zN;
                    if (zN) {
                        cbdVar = cmd.a;
                        if (cbdVar == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                        }
                        P();
                        cjeVarU = cjeVarU.i(cbdVar, new defpackage.ceu(null));
                    }
                }
                this.R = cjeVarU;
                java.util.Set set = (java.util.Set) defpackage.den.aa(cjeVarU, defpackage.cmf.a);
                if (set != null) {
                    set.add(d());
                    cazVar.g(set);
                }
                java.lang.Object objQ = Q();
                if (objQ != aonnVar && aonnVar != null) {
                    ad(aonnVar);
                }
                if (aonnVar != null) {
                    Z(200, defpackage.cax.a, 0, null);
                    defpackage.cfo.h(this, aonnVar);
                    W(false);
                } else {
                    if (!this.k || objQ == null || defpackage.aooh.n(objQ, defpackage.cau.a)) {
                        if (this.j.isEmpty()) {
                            Y();
                        } else {
                            defpackage.cfl cflVar = this.p;
                            int iA = cflVar.a();
                            java.lang.Object objI = cflVar.i();
                            java.lang.Object objH = cflVar.h();
                            int i = this.I;
                            int i2 = 207;
                            if (objI == null) {
                                if (objH != null && iA == 207) {
                                    if (defpackage.aooh.n(objH, defpackage.cau.a)) {
                                        iA = 207;
                                    } else {
                                        z2 = true;
                                        cazVar = cazVar;
                                        this.x = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.x, 3) ^ ((long) objH.hashCode()), 3) ^ ((long) i);
                                        iA = 207;
                                    }
                                }
                                this.x = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.x, 3) ^ ((long) iA), 3) ^ ((long) i);
                            } else {
                                z2 = true;
                                cazVar = cazVar;
                                if (objI instanceof java.lang.Enum) {
                                    iHashCode = ((java.lang.Enum) objI).ordinal();
                                    j = this.x;
                                } else {
                                    iHashCode = objI.hashCode();
                                    j = this.x;
                                }
                                this.x = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(j, 3) ^ ((long) iHashCode), 3);
                            }
                            aB((cflVar.b[(cflVar.f * 5) + 1] & 1073741824) != 0 ? z2 : false, null);
                            av();
                            cflVar.s();
                            if (objI == null) {
                                if (objH == null || iA != 207) {
                                    i2 = iA;
                                } else {
                                    if (!defpackage.aooh.n(objH, defpackage.cau.a)) {
                                        iHashCode2 = objH.hashCode();
                                        jRotateRight = java.lang.Long.rotateRight(this.x ^ ((long) i), 3);
                                    }
                                    this.x = jRotateRight2;
                                }
                                jRotateRight2 = java.lang.Long.rotateRight(java.lang.Long.rotateRight(this.x ^ ((long) i), 3) ^ ((long) i2), 3);
                                this.x = jRotateRight2;
                            } else {
                                if (objI instanceof java.lang.Enum) {
                                    iHashCode2 = ((java.lang.Enum) objI).ordinal();
                                    j2 = this.x;
                                } else {
                                    iHashCode2 = objI.hashCode();
                                    j2 = this.x;
                                }
                                jRotateRight = java.lang.Long.rotateRight(j2, 3);
                            }
                            jRotateRight2 = java.lang.Long.rotateRight(jRotateRight ^ ((long) iHashCode2), 3);
                            this.x = jRotateRight2;
                        }
                        this.K = false;
                        cazVar.f();
                        this.x = 0L;
                        W(false);
                        cfrVar = this.t;
                        cfrVar.b();
                        cfrVar.f();
                        if (cfrVar.k.a != 0) {
                            defpackage.cax.b("Missed recording an endGroup()");
                        }
                        if (!this.E.isEmpty()) {
                            defpackage.cax.b("Start/end imbalance");
                        }
                        T();
                        this.p.r();
                        if (appuVar.e() != 0) {
                            z = z2;
                        } else {
                            z = false;
                        }
                        this.k = z;
                        this.o = false;
                        this.j.clear();
                        U();
                        android.os.Trace.endSection();
                    }
                    Z(200, defpackage.cax.a, 0, null);
                    defpackage.aoov.f(objQ, 2);
                    defpackage.cfo.h(this, (defpackage.aonn) objQ);
                    W(false);
                }
                z2 = true;
                cazVar = cazVar;
                this.K = false;
                cazVar.f();
                this.x = 0L;
                W(false);
                cfrVar = this.t;
                cfrVar.b();
                cfrVar.f();
                if (cfrVar.k.a != 0) {
                    defpackage.cax.b("Missed recording an endGroup()");
                }
                if (!this.E.isEmpty()) {
                    defpackage.cax.b("Start/end imbalance");
                }
                T();
                this.p.r();
                if (appuVar.e() != 0) {
                    z = z2;
                } else {
                    z = false;
                }
                this.k = z;
                this.o = false;
                this.j.clear();
                U();
                android.os.Trace.endSection();
            } catch (java.lang.Throwable th) {
                try {
                    rs.h(th, new bup(this, 9));
                    throw th;
                } catch (java.lang.Throwable th2) {
                    this.o = false;
                    this.j.clear();
                    S();
                    U();
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            android.os.Trace.endSection();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0098 A[LOOP:1: B:19:0x0044->B:38:0x0098, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x009b A[EDGE_INSN: B:51:0x009b->B:39:0x009b BREAK  A[LOOP:1: B:19:0x0044->B:38:0x0098], SYNTHETIC] */
    @Override // defpackage.ccb
    public final void ag(defpackage.adw adwVar) {
        int i;
        java.util.List list = this.j;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.aodd aoddVar = (defpackage.aodd) list.get(size);
            defpackage.cfh cfhVar = ((defpackage.cdk) aoddVar.a).e;
            defpackage.cfh cfhVarC = cfhVar != null ? defpackage.cfd.c(cfhVar) : null;
            if (cfhVarC == null || !cfhVarC.a()) {
                list.remove(size);
            } else {
                int i2 = aoddVar.b;
                int i3 = cfhVarC.a;
                if (i2 != i3) {
                    aoddVar.b = i3;
                }
            }
        }
        java.lang.Object[] objArr = adwVar.b;
        java.lang.Object[] objArr2 = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i4 != length) {
                        break;
                        break;
                    }
                    i4++;
                } else {
                    int i5 = ~(i4 - length);
                    int i6 = 0;
                    while (true) {
                        i = 8 - (i5 >>> 31);
                        if (i6 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i7 = (i4 << 3) + i6;
                            java.lang.Object obj = objArr[i7];
                            java.lang.Object obj2 = objArr2[i7];
                            if (obj == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            }
                            defpackage.cdk cdkVar = (defpackage.cdk) obj;
                            defpackage.cfh cfhVar2 = cdkVar.e;
                            if (cfhVar2 != null) {
                                int i8 = defpackage.cfd.c(cfhVar2).a;
                                if (obj2 == defpackage.cea.a) {
                                    obj2 = null;
                                }
                                list.add(new defpackage.aodd(cdkVar, i8, obj2));
                            }
                        }
                        j >>= 8;
                        i6++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i4 != length) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        defpackage.ajsz.bo(list, defpackage.cbu.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:10:0x0027, B:9:0x0024, B:13:0x002e, B:16:0x0036, B:19:0x003e, B:21:0x0046, B:23:0x004c, B:24:0x0050, B:25:0x0051, B:27:0x0057, B:20:0x0042), top: B:35:0x0005, inners: #0 }] */
    public final void ah(defpackage.cbb cbbVar, defpackage.cbb cbbVar2, java.lang.Integer num, java.util.List list, defpackage.aomy aomyVar) {
        java.lang.Object objA;
        boolean z = this.o;
        int i = this.G;
        try {
            this.o = true;
            this.G = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.aoiu aoiuVar = (defpackage.aoiu) list.get(i2);
                defpackage.cdk cdkVar = (defpackage.cdk) aoiuVar.a;
                java.lang.Object obj = aoiuVar.b;
                if (obj != null) {
                    ae(cdkVar, obj);
                } else {
                    ae(cdkVar, null);
                }
            }
            if (cbbVar == null) {
                aomyVar.a();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (cbbVar2 == null || defpackage.aooh.n(cbbVar2, cbbVar) || iIntValue < 0) {
                    objA = aomyVar.a();
                } else {
                    cbbVar.j = cbbVar2;
                    cbbVar.k = iIntValue;
                    try {
                        objA = aomyVar.a();
                        cbbVar.j = null;
                        cbbVar.k = 0;
                    } catch (java.lang.Throwable th) {
                        cbbVar.j = null;
                        cbbVar.k = 0;
                        throw th;
                    }
                }
                if (objA == null) {
                    aomyVar.a();
                }
            }
            this.o = z;
            this.G = i;
        } catch (java.lang.Throwable th2) {
            this.o = z;
            this.G = i;
            throw th2;
        }
    }

    public final defpackage.cje ai() {
        defpackage.cje cjeVar = this.z;
        return cjeVar == null ? aG(this.p.h) : cjeVar;
    }

    public final defpackage.cje aj(defpackage.cje cjeVar, defpackage.cje cjeVar2) {
        defpackage.cjd cjdVar = new defpackage.cjd(cjeVar);
        cjdVar.putAll(cjeVar2);
        defpackage.cje cjeVarA = cjdVar.a();
        Z(204, defpackage.cax.d, 0, null);
        aD(cjeVarA);
        aD(cjeVar2);
        W(false);
        return cjeVarA;
    }

    public final void ak(defpackage.cje cjeVar) {
        defpackage.aco acoVar = this.y;
        if (acoVar == null) {
            acoVar = new defpackage.aco(6);
            this.y = acoVar;
        }
        acoVar.g(this.p.f, cjeVar);
    }

    public final void al(defpackage.ccj ccjVar, defpackage.cje cjeVar, java.lang.Object obj) {
        Z(126665345, ccjVar, 0, null);
        aD(obj);
        long j = this.x;
        try {
            this.x = 126665345L;
            if (this.w) {
                defpackage.cfp cfpVar = this.r;
                cfpVar.D(cfpVar.q);
            }
            boolean z = (this.w || defpackage.aooh.n(this.p.h(), cjeVar)) ? false : true;
            if (z) {
                ak(cjeVar);
            }
            Z(202, defpackage.cax.c, 0, cjeVar);
            this.z = null;
            boolean z2 = this.k;
            this.k = z;
            defpackage.cfo.h(this, new defpackage.cja(-59194059, true, new cmp(1)));
            this.k = z2;
            W(false);
            this.z = null;
            this.x = j;
            W(false);
        } catch (java.lang.Throwable th) {
            try {
                rs.h(th, new bup(this, 8));
                throw th;
            } catch (java.lang.Throwable th2) {
                W(false);
                this.z = null;
                this.x = j;
                W(false);
                throw th2;
            }
        }
    }

    public final akwb am() {
        this.b.w();
        return null;
    }

    @Override // defpackage.cav
    public final defpackage.cav b(int i) {
        defpackage.cdk cdkVar;
        boolean z;
        u(i);
        if (this.w) {
            defpackage.cdk cdkVar2 = new defpackage.cdk(this.f);
            this.M.add(cdkVar2);
            ad(cdkVar2);
            at(cdkVar2);
        } else {
            defpackage.aodd aoddVarJ = defpackage.cbu.j(this.j, this.p.h);
            java.lang.Object objN = this.p.n();
            if (defpackage.aooh.n(objN, defpackage.cau.a)) {
                cdkVar = new defpackage.cdk(this.f);
                ad(cdkVar);
            } else {
                if (objN == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                }
                cdkVar = (defpackage.cdk) objN;
            }
            if (aoddVarJ == null) {
                int i2 = cdkVar.b;
                if ((i2 & 64) != 0) {
                    cdkVar.b = i2 & (-65);
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            cdkVar.f(z);
            this.M.add(cdkVar);
            at(cdkVar);
            if ((cdkVar.b & 256) != 0) {
                cdkVar.e(false);
                cdkVar.i(true);
                defpackage.chi chiVar = this.t.j.a;
                chiVar.i(cgv.a);
                defpackage.chh.a(chiVar, 0, cdkVar);
                if (!this.l && cdkVar.m()) {
                    this.l = true;
                    this.J = this.p.h;
                    cdkVar.h(true);
                }
            }
        }
        return this;
    }

    @Override // defpackage.cav
    public final defpackage.caz c() {
        defpackage.cbt cbtVar;
        Z(206, defpackage.cax.e, 0, null);
        if (this.w) {
            defpackage.cfp cfpVar = this.r;
            cfpVar.D(cfpVar.q);
        }
        java.lang.Object objQ = Q();
        defpackage.cdw cdzVar = objQ instanceof defpackage.cdw ? (defpackage.cdw) objQ : null;
        if (cdzVar == null) {
            cbtVar = this;
            cdzVar = new defpackage.cdz(new defpackage.cbr(new defpackage.cbs(cbtVar, this.x, this.h, this.n)));
            cbtVar.ad(cdzVar);
        } else {
            cbtVar = this;
        }
        defpackage.cdv cdvVarA = cdzVar.a();
        if (cdvVarA == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.GapComposer.CompositionContextHolder");
        }
        defpackage.cbs cbsVar = ((defpackage.cbr) cdvVarA).a;
        defpackage.cje cjeVarAi = cbtVar.ai();
        long j = cbtVar.x;
        cbsVar.b.b(cjeVarAi);
        cbsVar.a = j;
        cbtVar.W(false);
        return cbsVar;
    }

    @Override // defpackage.cav
    public final defpackage.cma d() {
        defpackage.cma cmaVar = this.P;
        if (cmaVar != null) {
            return cmaVar;
        }
        cbv cbvVar = new cbv(this.f);
        this.P = cbvVar;
        return cbvVar;
    }

    @Override // defpackage.cav
    public final java.lang.Object e(defpackage.cbd cbdVar) {
        return defpackage.den.aa(ai(), cbdVar);
    }

    @Override // defpackage.cav
    public final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object objE = defpackage.cbu.e(this.p.i(), obj, obj2);
        return objE == null ? new ccc(obj, obj2) : objE;
    }

    @Override // defpackage.cav
    public final java.lang.Object g() {
        return R();
    }

    @Override // defpackage.cav
    public final defpackage.aolr h() {
        return this.v;
    }

    @Override // defpackage.cav
    public final void i(java.lang.Object obj, defpackage.aonn aonnVar) {
        if (this.w) {
            defpackage.chi chiVar = this.O.a;
            chiVar.i(defpackage.cgz.a);
            defpackage.chh.a(chiVar, 0, obj);
            if (aonnVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                aonnVar = null;
            }
            defpackage.aoov.f(aonnVar, 2);
            defpackage.chh.a(chiVar, 1, aonnVar);
            return;
        }
        defpackage.cfr cfrVar = this.t;
        cfrVar.f();
        defpackage.chi chiVar2 = cfrVar.j.a;
        chiVar2.i(defpackage.cgz.a);
        if (aonnVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            aonnVar = null;
        }
        defpackage.aoov.f(aonnVar, 2);
        defpackage.chh.b(chiVar2, 0, obj, 1, aonnVar);
    }

    @Override // defpackage.cav
    public final void j(defpackage.aomy aomyVar) {
        aE();
        if (!this.w) {
            defpackage.cax.b("createNode() can only be called when inserting");
        }
        defpackage.appu appuVar = this.S;
        int i = ((int[]) appuVar.b)[appuVar.a - 1];
        defpackage.cfp cfpVar = this.r;
        defpackage.cfh cfhVarP = cfpVar.p(cfpVar.q);
        this.H++;
        defpackage.cfs cfsVar = this.O;
        defpackage.chi chiVar = cfsVar.a;
        chiVar.i(defpackage.cgh.a);
        defpackage.chh.a(chiVar, 0, aomyVar);
        chiVar.c[chiVar.d - chiVar.a[chiVar.b - 1].b] = i;
        defpackage.chh.a(chiVar, 1, cfhVarP);
        defpackage.chi chiVar2 = cfsVar.b;
        chiVar2.i(defpackage.cgm.a);
        chiVar2.c[chiVar2.d - chiVar2.a[chiVar2.b - 1].b] = i;
        defpackage.chh.a(chiVar2, 0, cfhVarP);
    }

    @Override // defpackage.cav
    public final void k(boolean z) {
        if (this.H != 0) {
            defpackage.cax.b("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (this.w) {
            return;
        }
        if (!z) {
            aA();
            return;
        }
        defpackage.cfl cflVar = this.p;
        int i = cflVar.f;
        int i2 = cflVar.g;
        defpackage.cfr cfrVar = this.t;
        cfrVar.i(false);
        cfrVar.j.a.i(cfy.a);
        defpackage.cbu.g(this.j, i, i2);
        this.p.u();
    }

    @Override // defpackage.cav
    public final void l() {
        W(false);
        defpackage.cdk cdkVarO = O();
        if (cdkVarO == null || !cdkVarO.o()) {
            return;
        }
        cdkVarO.b |= 2;
    }

    @Override // defpackage.cav
    public final void m() {
        W(false);
    }

    @Override // defpackage.cav
    public final void n() {
        W(true);
    }

    @Override // defpackage.cav
    public final void o() {
        W(false);
    }

    @Override // defpackage.cav
    public final void p() {
        W(false);
    }

    @Override // defpackage.cav
    public final void q() {
        if (this.l && this.p.h == this.J) {
            this.J = -1;
            this.l = false;
        }
        W(false);
    }

    @Override // defpackage.cav
    public final void r(defpackage.aomy aomyVar) {
        defpackage.chi chiVar = this.t.j.a;
        chiVar.i(defpackage.cgt.a);
        defpackage.chh.a(chiVar, 0, aomyVar);
    }

    @Override // defpackage.cav
    public final void s() {
        if (this.H != 0) {
            defpackage.cax.b("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.w) {
            return;
        }
        defpackage.cdk cdkVarO = O();
        if (cdkVarO != null && !cdkVarO.m()) {
            cdkVarO.k(true);
        }
        if (this.j.isEmpty()) {
            aA();
        } else {
            av();
        }
    }

    @Override // defpackage.cav
    public final void t(int i, java.lang.Object obj) {
        Z(i, obj, 0, null);
    }

    @Override // defpackage.cav
    public final void u(int i) {
        int i2;
        if (this.F != null) {
            Z(i, null, 0, null);
            return;
        }
        aF();
        this.x = java.lang.Long.rotateLeft(java.lang.Long.rotateLeft(this.x, 3) ^ ((long) i), 3) ^ ((long) this.I);
        this.I++;
        defpackage.cfl cflVar = this.p;
        if (this.w) {
            cflVar.q();
            this.r.K(i, defpackage.cau.a);
            as(false, null);
            return;
        }
        if (cflVar.a() == i && ((i2 = cflVar.f) >= cflVar.g || (cflVar.b[(i2 * 5) + 1] & 536870912) == 0)) {
            cflVar.v();
            as(false, null);
            return;
        }
        if (!cflVar.A()) {
            int i3 = this.G;
            int i4 = cflVar.f;
            aw();
            this.t.k(i3, cflVar.f());
            defpackage.cbu.g(this.j, i4, cflVar.f);
        }
        cflVar.q();
        this.w = true;
        this.z = null;
        ar();
        defpackage.cfp cfpVar = this.r;
        cfpVar.w();
        int i5 = cfpVar.o;
        cfpVar.K(i, defpackage.cau.a);
        this.N = cfpVar.p(i5);
        as(false, null);
    }

    @Override // defpackage.cav
    public final void v() {
        Z(125, null, 2, null);
        this.i = true;
    }

    @Override // defpackage.cav
    public final void w(java.lang.Object obj) {
        ab(obj);
    }

    @Override // defpackage.cav
    public final void x() {
        boolean z;
        aE();
        if (this.w) {
            defpackage.cax.b("useNode() called while inserting");
        }
        defpackage.cfl cflVar = this.p;
        java.lang.Object objO = cflVar.o(cflVar.h);
        defpackage.cfr cfrVar = this.t;
        cfrVar.c(objO);
        if (this.l && ((z = objO instanceof defpackage.cap))) {
            cfrVar.f();
            defpackage.can canVar = cfrVar.j;
            if (z) {
                canVar.a.i(chc.a);
            }
        }
    }

    @Override // defpackage.ccb, defpackage.cav
    public final boolean y(float f) {
        java.lang.Object objQ = Q();
        if (objQ instanceof java.lang.Float) {
            float fFloatValue = ((java.lang.Number) objQ).floatValue();
            if (f == fFloatValue || (java.lang.Float.isNaN(f) && java.lang.Float.isNaN(fFloatValue))) {
                return false;
            }
        }
        ad(java.lang.Float.valueOf(f));
        return true;
    }

    @Override // defpackage.ccb, defpackage.cav
    public final boolean z(int i) {
        java.lang.Object objQ = Q();
        if ((objQ instanceof java.lang.Integer) && i == ((java.lang.Number) objQ).intValue()) {
            return false;
        }
        ad(java.lang.Integer.valueOf(i));
        return true;
    }

    @Override // defpackage.cav
    public final void L() {
    }
}
