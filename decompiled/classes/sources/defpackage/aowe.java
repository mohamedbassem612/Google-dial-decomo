package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aowe implements defpackage.aowi {
    public final defpackage.aonj a;
    public final defpackage.aorp b;
    public final defpackage.aorp c;
    public final defpackage.aorq d;
    public final defpackage.aorq e;
    private final int g;
    private final defpackage.aorp h;
    private final defpackage.aorp i;
    private final defpackage.aorq j;
    private final defpackage.aono k;
    private final defpackage.aorq l;
    private final defpackage.aorq m;

    public aowe(int i, defpackage.aonj aonjVar) {
        this.g = i;
        this.a = aonjVar;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bs(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        defpackage.aorr aorrVar = defpackage.aorr.a;
        this.b = new defpackage.aorp(0L, aorrVar);
        this.c = new defpackage.aorp(0L, aorrVar);
        defpackage.aown aownVar = defpackage.aowg.a;
        this.h = new defpackage.aorp(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, aorrVar);
        this.i = new defpackage.aorp(D(), aorrVar);
        defpackage.aown aownVar2 = new defpackage.aown(0L, null, this, 3);
        this.d = new defpackage.aorq(aownVar2, aorrVar);
        this.e = new defpackage.aorq(aownVar2, aorrVar);
        if (M() && (aownVar2 = defpackage.aowg.a) == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.j = new defpackage.aorq(aownVar2, aorrVar);
        this.k = aonjVar != null ? new abkx(this, 9) : null;
        this.l = new defpackage.aorq(defpackage.aowg.s, aorrVar);
        this.m = new defpackage.aorq(null, aorrVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0000 A[SYNTHETIC] */
    private final int C(defpackage.aown aownVar, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
        while (true) {
            java.lang.Object objD = aownVar.d(i);
            if (objD == null) {
                if (L(j)) {
                    if (z) {
                        if (aownVar.j(i, null, defpackage.aowg.j)) {
                            aownVar.g(i, false);
                            return 4;
                        }
                    } else if (aownVar.j(i, null, defpackage.aowg.d)) {
                        break;
                    }
                } else if (z) {
                    if (aownVar.j(i, null, defpackage.aowg.j)) {
                        aownVar.g(i, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (aownVar.j(i, null, obj2)) {
                        return 2;
                    }
                }
            } else {
                if (objD != defpackage.aowg.e) {
                    defpackage.apcm apcmVar = defpackage.aowg.k;
                    if (objD == apcmVar || objD == defpackage.aowg.h) {
                        aownVar.h(i, null);
                    } else {
                        if (objD == defpackage.aowg.l) {
                            aownVar.h(i, null);
                            f();
                            return 4;
                        }
                        boolean z2 = defpackage.aosu.a;
                        aownVar.h(i, null);
                        if (objD instanceof defpackage.aoww) {
                            objD = ((defpackage.aoww) objD).a;
                        }
                        if (N(objD, obj)) {
                            aownVar.i(i, defpackage.aowg.i);
                            return 0;
                        }
                        if (aownVar.b(i, apcmVar) != apcmVar) {
                            aownVar.g(i, true);
                        }
                    }
                    return 5;
                }
                if (aownVar.j(i, objD, defpackage.aowg.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    private final long D() {
        return this.h.b;
    }

    private final java.lang.Object E(java.lang.Object obj, defpackage.aoln aolnVar) {
        java.lang.Throwable thD;
        defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(aolnVar), 1);
        aoscVar.z();
        defpackage.aonj aonjVar = this.a;
        if (aonjVar == null || (thD = aoil.d(aonjVar, obj, (apcv) null)) == null) {
            java.lang.Throwable thQ = q();
            if (defpackage.aosu.b) {
                thQ = defpackage.apcl.a(thQ, aoscVar);
            }
            aoscVar.w(defpackage.aooc.ae(thQ));
        } else {
            aoil.b(thD, q());
            if (defpackage.aosu.b) {
                thD = defpackage.apcl.a(thD, aoscVar);
            }
            aoscVar.w(defpackage.aooc.ae(thD));
        }
        java.lang.Object objK = aoscVar.k();
        if (objK != defpackage.aolu.a) {
            return defpackage.aojh.a;
        }
        defpackage.aooh.f(aolnVar, "frame");
        return objK;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    private final defpackage.aown F(long j) throws apcv {
        java.lang.Object objA;
        long j2;
        java.lang.Object obj = this.j.a;
        defpackage.aown aownVar = (defpackage.aown) this.d.a;
        if (aownVar.b > ((defpackage.aown) obj).b) {
            obj = aownVar;
        }
        defpackage.aown aownVar2 = (defpackage.aown) this.e.a;
        if (aownVar2.b > ((defpackage.aown) obj).b) {
            obj = aownVar2;
        }
        defpackage.apbi apbiVar = (defpackage.apbi) obj;
        while (true) {
            java.lang.Object objL = apbiVar.l();
            defpackage.apcm apcmVar = defpackage.apbh.a;
            objA = null;
            if (objL == apcmVar) {
                break;
            }
            defpackage.apbi apbiVar2 = (defpackage.apbi) objL;
            if (apbiVar2 == null) {
                if (apbiVar.a.d(null, apcmVar)) {
                    break;
                }
            } else {
                apbiVar = apbiVar2;
            }
        }
        defpackage.aown aownVar3 = (defpackage.aown) apbiVar;
        if (z()) {
            defpackage.aown aownVar4 = aownVar3;
            loop1: while (true) {
                int i = defpackage.aowg.b;
                int i2 = i - 1;
                while (true) {
                    if (i2 >= 0) {
                        j2 = (aownVar4.b * ((long) i)) + ((long) i2);
                        if (j2 >= g()) {
                            while (true) {
                                java.lang.Object objD = aownVar4.d(i2);
                                if (objD != null && objD != defpackage.aowg.e) {
                                    if (objD != defpackage.aowg.d) {
                                        break;
                                    }
                                    break loop1;
                                }
                                if (aownVar4.j(i2, objD, defpackage.aowg.l)) {
                                    aownVar4.r();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        aownVar4 = (defpackage.aown) aownVar4.n();
                        if (aownVar4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                u(j2);
            }
        }
        loop4: for (defpackage.aown aownVar5 = aownVar3; aownVar5 != null; aownVar5 = (defpackage.aown) aownVar5.n()) {
            int i3 = defpackage.aowg.b;
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if ((aownVar5.b * ((long) i3)) + ((long) i4) < j) {
                    break loop4;
                }
                while (true) {
                    java.lang.Object objD2 = aownVar5.d(i4);
                    if (objD2 != null && objD2 != defpackage.aowg.e) {
                        if (!(objD2 instanceof defpackage.aoww)) {
                            if (!(objD2 instanceof defpackage.aovq)) {
                                break;
                            }
                            if (aownVar5.j(i4, objD2, defpackage.aowg.l)) {
                                objA = defpackage.apbx.a(objA, objD2);
                                aownVar5.g(i4, true);
                                break;
                            }
                        } else {
                            if (aownVar5.j(i4, objD2, defpackage.aowg.l)) {
                                objA = defpackage.apbx.a(objA, ((defpackage.aoww) objD2).a);
                                aownVar5.g(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (aownVar5.j(i4, objD2, defpackage.aowg.l)) {
                            aownVar5.r();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (objA instanceof java.util.ArrayList) {
                java.util.ArrayList arrayList = (java.util.ArrayList) objA;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    K((defpackage.aovq) arrayList.get(size), true);
                }
            } else {
                K((defpackage.aovq) objA, true);
            }
        }
        return aownVar3;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x000e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00a9 A[SYNTHETIC] */
    private final void G() {
        long j;
        java.lang.Object objA;
        defpackage.apcm apcmVar;
        defpackage.aown aownVar;
        if (M()) {
            return;
        }
        defpackage.aorq aorqVar = this.j;
        defpackage.aown aownVar2 = (defpackage.aown) aorqVar.a;
        loop0: while (true) {
            defpackage.aorp aorpVar = this.h;
            long jB = aorpVar.b();
            long j2 = defpackage.aowg.b;
            long j3 = jB / j2;
            if (h() <= jB) {
                if (aownVar2.b < j3 && aownVar2.m() != null) {
                    I(j3, aownVar2);
                }
                H(1L);
                return;
            }
            if (aownVar2.b != j3) {
                aowf aowfVar = aowf.a;
                while (true) {
                    objA = defpackage.apbh.a(aownVar2, j3, aowfVar);
                    apcmVar = defpackage.apbh.a;
                    if (objA == apcmVar) {
                        j = jB;
                        break;
                    }
                    defpackage.apbi apbiVarB = defpackage.apck.b(objA);
                    while (true) {
                        defpackage.apbi apbiVar = (defpackage.apbi) aorqVar.a;
                        j = jB;
                        if (apbiVar.b >= apbiVarB.b) {
                            break;
                        }
                        if (!apbiVarB.u()) {
                            break;
                        }
                        if (aorqVar.d(apbiVar, apbiVarB)) {
                            if (!apbiVar.s()) {
                                break;
                            }
                            apbiVar.p();
                            break;
                        } else {
                            if (apbiVarB.s()) {
                                apbiVarB.p();
                            }
                            jB = j;
                        }
                    }
                    jB = j;
                }
                if (objA == apcmVar) {
                    f();
                    I(j3, aownVar2);
                    H(1L);
                } else {
                    aownVar = (defpackage.aown) defpackage.apck.b(objA);
                    long j4 = aownVar.b;
                    if (j4 > j3) {
                        long j5 = j4 * j2;
                        if (aorpVar.c(j + 1, j5)) {
                            H(j5 - j);
                        } else {
                            H(1L);
                        }
                    } else {
                        boolean z = defpackage.aosu.a;
                    }
                    if (aownVar != null) {
                        aownVar2 = aownVar;
                    } else {
                        continue;
                    }
                }
                aownVar = null;
                if (aownVar != null) {
                    aownVar2 = aownVar;
                } else {
                    continue;
                }
            } else {
                j = jB;
            }
            int i = (int) (j % j2);
            java.lang.Object objD = aownVar2.d(i);
            if (!(objD instanceof defpackage.aovq) || j < this.c.b || !aownVar2.j(i, objD, defpackage.aowg.g)) {
                while (true) {
                    java.lang.Object objD2 = aownVar2.d(i);
                    if (objD2 instanceof defpackage.aovq) {
                        if (j < this.c.b) {
                            if (aownVar2.j(i, objD2, new defpackage.aoww((defpackage.aovq) objD2))) {
                                break loop0;
                            }
                        } else if (aownVar2.j(i, objD2, defpackage.aowg.g)) {
                            if (!O(objD2, aownVar2, i)) {
                                aownVar2.i(i, defpackage.aowg.j);
                                aownVar2.g(i, false);
                                break;
                            } else {
                                aownVar2.i(i, defpackage.aowg.d);
                                break;
                            }
                        }
                    } else {
                        if (objD2 == defpackage.aowg.j) {
                            break;
                        }
                        if (objD2 == null) {
                            if (aownVar2.j(i, null, defpackage.aowg.e)) {
                                break loop0;
                            }
                        } else if (objD2 == defpackage.aowg.d || objD2 == defpackage.aowg.h || objD2 == defpackage.aowg.i || objD2 == defpackage.aowg.k || objD2 == defpackage.aowg.l) {
                            break loop0;
                        } else if (objD2 != defpackage.aowg.f) {
                            java.util.Objects.toString(objD2);
                            throw new java.lang.IllegalStateException("Unexpected cell state: ".concat(objD2.toString()));
                        }
                    }
                }
                H(1L);
            } else if (O(objD, aownVar2, i)) {
                aownVar2.i(i, defpackage.aowg.d);
                break;
            } else {
                aownVar2.i(i, defpackage.aowg.j);
                aownVar2.g(i, false);
                H(1L);
            }
        }
        H(1L);
    }

    private final void H(long j) {
        defpackage.aorp aorpVar = this.i;
        if ((aorpVar.a(j) & 4611686018427387904L) != 0) {
            while ((aorpVar.b & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void I(long j, defpackage.aown aownVar) {
        defpackage.aown aownVar2;
        defpackage.aown aownVar3;
        while (aownVar.b < j && (aownVar3 = (defpackage.aown) aownVar.m()) != null) {
            aownVar = aownVar3;
        }
        while (true) {
            if (!aownVar.t() || (aownVar2 = (defpackage.aown) aownVar.m()) == null) {
                defpackage.aorq aorqVar = this.j;
                while (true) {
                    defpackage.apbi apbiVar = (defpackage.apbi) aorqVar.a;
                    if (apbiVar.b >= aownVar.b) {
                        return;
                    }
                    if (!aownVar.u()) {
                        break;
                    }
                    if (aorqVar.d(apbiVar, aownVar)) {
                        if (apbiVar.s()) {
                            apbiVar.p();
                            return;
                        }
                        return;
                    } else if (aownVar.s()) {
                        aownVar.p();
                    }
                }
            } else {
                aownVar = aownVar2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J(java.lang.Object obj, defpackage.aosb aosbVar) {
        defpackage.aonj aonjVar = this.a;
        if (aonjVar != null) {
            aoil.e(aonjVar, obj, aosbVar.u());
        }
        java.lang.Throwable thQ = q();
        if (defpackage.aosu.b) {
            thQ = defpackage.apcl.a(thQ, aosbVar);
        }
        aosbVar.w(defpackage.aooc.ae(thQ));
    }

    private final void K(defpackage.aovq aovqVar, boolean z) {
        j$.util.Objects.checkIndex(0, 6);
        if (aovqVar != null) {
            if (aovqVar instanceof defpackage.aovy) {
                throw null;
            }
            if (aovqVar instanceof defpackage.aosb) {
                ((defpackage.aoln) aovqVar).w(new defpackage.aoiv(z ? p() : q()));
                return;
            }
            if (aovqVar instanceof defpackage.aowt) {
                ((defpackage.aowt) aovqVar).a.w(new defpackage.aowm(new defpackage.aowk(o())));
                return;
            }
            if (aovqVar instanceof defpackage.aovx) {
                defpackage.aovx aovxVar = (defpackage.aovx) aovqVar;
                defpackage.aosc aoscVar = aovxVar.b;
                if (aoscVar == null) {
                    defpackage.aooh.g();
                }
                aovxVar.b = null;
                aovxVar.a = defpackage.aowg.l;
                java.lang.Throwable thO = aovxVar.c.o();
                if (thO == null) {
                    aoscVar.w(java.lang.Boolean.FALSE);
                    return;
                }
                if (defpackage.aosu.b && (aoscVar instanceof defpackage.aome)) {
                    thO = defpackage.apcl.a(thO, aoscVar);
                }
                if (thO == null) {
                    defpackage.aooh.i("exception");
                }
                aoscVar.w(new defpackage.aoiv(thO));
                return;
            }
            if (aovqVar instanceof defpackage.apdm) {
                ((defpackage.apdm) aovqVar).g(this, defpackage.aowg.l);
                return;
            }
        }
        java.util.Objects.toString(aovqVar);
        throw new java.lang.IllegalStateException("Unexpected waiter: ".concat(java.lang.String.valueOf(aovqVar)));
    }

    private final boolean L(long j) {
        return j < D() || j < g() + ((long) this.g);
    }

    private final boolean M() {
        long jD = D();
        return jD == 0 || jD == Long.MAX_VALUE;
    }

    private final boolean N(java.lang.Object obj, java.lang.Object obj2) {
        j$.util.Objects.checkIndex(0, 5);
        if (obj != null) {
            if (obj instanceof defpackage.apdm) {
                return ((defpackage.apdm) obj).g(this, obj2);
            }
            if (obj instanceof defpackage.aowt) {
                return defpackage.aowg.a(((defpackage.aowt) obj).a, new defpackage.aowm(obj2), this.a != null ? new aovz(this, 2, (char[]) null) : null);
            }
            if (obj instanceof defpackage.aovx) {
                defpackage.aovx aovxVar = (defpackage.aovx) obj;
                defpackage.aosc aoscVar = aovxVar.b;
                if (aoscVar == null) {
                    defpackage.aooh.g();
                }
                aovxVar.b = null;
                aovxVar.a = obj2;
                defpackage.aonj aonjVar = aovxVar.c.a;
                return defpackage.aowg.a(aoscVar, java.lang.Boolean.TRUE, aonjVar != null ? new bli(aonjVar, obj2, 18, (byte[]) null) : null);
            }
            if (obj instanceof defpackage.aosb) {
                return defpackage.aowg.a((defpackage.aosb) obj, obj2, this.a != null ? new aovz(this, 0) : null);
            }
        }
        java.util.Objects.toString(obj);
        throw new java.lang.IllegalStateException("Unexpected receiver type: ".concat(java.lang.String.valueOf(obj)));
    }

    private final boolean O(java.lang.Object obj, defpackage.aown aownVar, int i) {
        char c = 4;
        j$.util.Objects.checkIndex(0, 4);
        if (obj != null) {
            if (obj instanceof defpackage.aosb) {
                return defpackage.aowg.a((defpackage.aosb) obj, defpackage.aojh.a, null);
            }
            if (obj instanceof defpackage.apdm) {
                int iA = ((defpackage.apdm) obj).a(this, defpackage.aojh.a);
                if (iA == 0) {
                    c = 1;
                } else if (iA == 1) {
                    c = 2;
                } else if (iA == 2) {
                    c = 3;
                }
                if (c != 2) {
                    return c == 1;
                }
                aownVar.h(i, null);
                return false;
            }
            if (obj instanceof defpackage.aovy) {
                throw null;
            }
        }
        java.util.Objects.toString(obj);
        throw new java.lang.IllegalStateException("Unexpected waiter: ".concat(java.lang.String.valueOf(obj)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ java.lang.Object k(defpackage.aowe aoweVar, defpackage.aoln aolnVar) {
        defpackage.aowc aowcVar;
        defpackage.aown aownVar;
        if (aolnVar instanceof defpackage.aowc) {
            aowcVar = (defpackage.aowc) aolnVar;
            int i = aowcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aowcVar.c = i - Integer.MIN_VALUE;
            } else {
                aowcVar = new defpackage.aowc(aoweVar, aolnVar);
            }
        } else {
            aowcVar = new defpackage.aowc(aoweVar, aolnVar);
        }
        defpackage.aowc aowcVar2 = aowcVar;
        java.lang.Object obj = aowcVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aowcVar2.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
            return ((defpackage.aowm) obj).b;
        }
        defpackage.aooc.af(obj);
        defpackage.aown aownVar2 = (defpackage.aown) aoweVar.e.a;
        while (!aoweVar.y()) {
            long jB = aoweVar.c.b();
            long j = defpackage.aowg.b;
            long j2 = jB / j;
            int i3 = (int) (jB % j);
            if (aownVar2.b != j2) {
                defpackage.aown aownVarR = aoweVar.r(j2, aownVar2);
                if (aownVarR != null) {
                    aownVar = aownVarR;
                } else {
                    continue;
                }
            } else {
                aownVar = aownVar2;
            }
            defpackage.aowe aoweVar2 = aoweVar;
            java.lang.Object objN = aoweVar2.n(aownVar, i3, jB, null);
            if (objN == defpackage.aowg.m) {
                throw new java.lang.IllegalStateException("unexpected");
            }
            if (objN != defpackage.aowg.o) {
                if (objN == defpackage.aowg.n) {
                    aowcVar2.c = 1;
                    objN = aoweVar2.l(aownVar, i3, jB, aowcVar2);
                    if (objN == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    aownVar.o();
                }
                return objN;
            }
            if (jB < aoweVar2.h()) {
                aownVar.o();
            }
            aoweVar = aoweVar2;
            aownVar2 = aownVar;
        }
        return new defpackage.aowk(aoweVar.o());
    }

    @Override // defpackage.aowu
    public final defpackage.aovx A() {
        return new defpackage.aovx(this);
    }

    @Override // defpackage.aowu
    public final defpackage.apdi B() {
        defpackage.aowa aowaVar = defpackage.aowa.a;
        defpackage.aoov.f(aowaVar, 3);
        defpackage.aowb aowbVar = defpackage.aowb.a;
        defpackage.aoov.f(aowbVar, 3);
        return new defpackage.apdi(this, aowaVar, aowbVar, this.k);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    @Override // defpackage.aowv
    public java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) throws apcv {
        defpackage.aojh aojhVar;
        java.lang.Object objK;
        defpackage.aolu aoluVar;
        defpackage.aowe aoweVar = this;
        defpackage.aorq aorqVar = aoweVar.d;
        defpackage.aown aownVar = (defpackage.aown) aorqVar.a;
        while (true) {
            defpackage.aorp aorpVar = aoweVar.b;
            long jB = aorpVar.b();
            long j = jB & 1152921504606846975L;
            boolean zX = aoweVar.x(jB, false);
            int i = defpackage.aowg.b;
            long j2 = i;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (aownVar.b != j3) {
                defpackage.aown aownVarT = aoweVar.t(j3, aownVar);
                if (aownVarT != null) {
                    aownVar = aownVarT;
                } else if (zX) {
                    java.lang.Object objE = E(obj, aolnVar);
                    if (objE != defpackage.aolu.a) {
                        break;
                    }
                    return objE;
                }
            }
            int iC = aoweVar.c(aownVar, i2, obj, j, null, zX);
            if (iC == 0) {
                aownVar.o();
                break;
            }
            if (iC != 1) {
                if (iC == 2) {
                    if (!zX) {
                        boolean z = defpackage.aosu.a;
                        break;
                    }
                    aownVar.r();
                    java.lang.Object objE2 = E(obj, aolnVar);
                    if (objE2 != defpackage.aolu.a) {
                        break;
                    }
                    return objE2;
                }
                if (iC == 3) {
                    defpackage.aosc aoscVarAf = defpackage.aoov.af(defpackage.ajsz.ap(aolnVar));
                    try {
                        int iC2 = c(aownVar, i2, obj, j, aoscVarAf, false);
                        if (iC2 == 0) {
                            aownVar.o();
                            aojhVar = defpackage.aojh.a;
                        } else {
                            if (iC2 != 1) {
                                if (iC2 != 2) {
                                    if (iC2 != 4) {
                                        java.lang.String str = "unexpected";
                                        if (iC2 != 5) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        aownVar.o();
                                        defpackage.aown aownVar2 = (defpackage.aown) aorqVar.a;
                                        while (true) {
                                            long jB2 = aorpVar.b();
                                            long j4 = jB2 & 1152921504606846975L;
                                            boolean zX2 = x(jB2, false);
                                            int i3 = i;
                                            long j5 = j4 / j2;
                                            int i4 = (int) (j4 % j2);
                                            if (aownVar2.b != j5) {
                                                defpackage.aown aownVarT2 = t(j5, aownVar2);
                                                if (aownVarT2 != null) {
                                                    aownVar2 = aownVarT2;
                                                } else if (!zX2) {
                                                    i = i3;
                                                }
                                            }
                                            int iC3 = c(aownVar2, i4, obj, j4, aoscVarAf, zX2);
                                            if (iC3 == 0) {
                                                aownVar2.o();
                                                aojhVar = defpackage.aojh.a;
                                            } else if (iC3 == 1) {
                                                aojhVar = defpackage.aojh.a;
                                            } else if (iC3 == 2) {
                                                if (!zX2) {
                                                    aoscVarAf.E(aownVar2, i4 + i3);
                                                    break;
                                                }
                                                aownVar2.r();
                                            } else {
                                                if (iC3 == 3) {
                                                    throw new java.lang.IllegalStateException(str);
                                                }
                                                if (iC3 != 4) {
                                                    aownVar2.o();
                                                    str = str;
                                                    i = i3;
                                                } else if (j4 < g()) {
                                                    aownVar2.o();
                                                }
                                            }
                                        }
                                    } else if (j < g()) {
                                        aownVar.o();
                                    }
                                    J(obj, aoscVarAf);
                                    break;
                                } else {
                                    aoscVarAf.E(aownVar, i2 + i);
                                }
                                objK = aoscVarAf.k();
                                aoluVar = defpackage.aolu.a;
                                if (objK == aoluVar && aolnVar == null) {
                                    defpackage.aooh.i("frame");
                                }
                                if (objK != aoluVar) {
                                    objK = defpackage.aojh.a;
                                }
                                if (objK == aoluVar) {
                                    break;
                                }
                                return objK;
                            }
                            aojhVar = defpackage.aojh.a;
                        }
                        aoscVarAf.w(aojhVar);
                        objK = aoscVarAf.k();
                        aoluVar = defpackage.aolu.a;
                        if (objK == aoluVar) {
                            defpackage.aooh.i("frame");
                        }
                        if (objK != aoluVar) {
                            objK = defpackage.aojh.a;
                        }
                        if (objK == aoluVar) {
                            break;
                        }
                        return objK;
                    } catch (java.lang.Throwable th) {
                        aoscVarAf.B();
                        throw th;
                    }
                }
                if (iC == 4) {
                    if (j < g()) {
                        aownVar.o();
                    }
                    java.lang.Object objE3 = E(obj, aolnVar);
                    if (objE3 != defpackage.aolu.a) {
                        break;
                    }
                    return objE3;
                }
                aownVar.o();
                aoweVar = this;
            } else {
                break;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    @Override // defpackage.aowv
    public java.lang.Object b(java.lang.Object obj) throws apcv {
        defpackage.aowk aowkVar;
        defpackage.aowe aoweVar = this;
        defpackage.aorp aorpVar = aoweVar.b;
        long j = aorpVar.b;
        if (!aoweVar.x(j, false) && !aoweVar.L(j & 1152921504606846975L)) {
            return defpackage.aowm.a;
        }
        defpackage.aorq aorqVar = aoweVar.d;
        defpackage.apcm apcmVar = defpackage.aowg.j;
        defpackage.aown aownVar = (defpackage.aown) aorqVar.a;
        while (true) {
            long jB = aorpVar.b();
            long j2 = jB & 1152921504606846975L;
            boolean zX = aoweVar.x(jB, false);
            long j3 = defpackage.aowg.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (aownVar.b != j4) {
                defpackage.aown aownVarT = aoweVar.t(j4, aownVar);
                if (aownVarT != null) {
                    aownVar = aownVarT;
                } else if (zX) {
                    aowkVar = new defpackage.aowk(aoweVar.q());
                    break;
                }
            }
            int iC = aoweVar.c(aownVar, i, obj, j2, apcmVar, zX);
            if (iC == 0) {
                aownVar.o();
                return defpackage.aojh.a;
            }
            if (iC == 1) {
                return defpackage.aojh.a;
            }
            if (iC == 2) {
                if (!zX) {
                    aownVar.r();
                    return defpackage.aowm.a;
                }
                aownVar.r();
                aowkVar = new defpackage.aowk(q());
                break;
            }
            if (iC == 3) {
                throw new java.lang.IllegalStateException("unexpected");
            }
            if (iC == 4) {
                if (j2 < g()) {
                    aownVar.o();
                }
                aowkVar = new defpackage.aowk(q());
                break;
            }
            aownVar.o();
            aoweVar = this;
        }
        return aowkVar;
    }

    public final int c(defpackage.aown aownVar, int i, java.lang.Object obj, long j, java.lang.Object obj2, boolean z) {
        aownVar.h(i, obj);
        if (z) {
            return C(aownVar, i, obj, j, obj2, true);
        }
        java.lang.Object objD = aownVar.d(i);
        if (objD == null) {
            if (L(j)) {
                if (aownVar.j(i, null, defpackage.aowg.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (aownVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof defpackage.aovq) {
            aownVar.h(i, null);
            if (N(objD, obj)) {
                aownVar.i(i, defpackage.aowg.i);
                return 0;
            }
            defpackage.apcm apcmVar = defpackage.aowg.k;
            if (aownVar.b(i, apcmVar) != apcmVar) {
                aownVar.g(i, true);
            }
            return 5;
        }
        return C(aownVar, i, obj, j, obj2, false);
    }

    @Override // defpackage.aowv
    public final void d(defpackage.aonj aonjVar) {
        defpackage.apcm apcmVar;
        defpackage.aorq aorqVar = this.m;
        if (aorqVar.d(null, aonjVar)) {
            return;
        }
        do {
            java.lang.Object obj = aorqVar.a;
            apcmVar = defpackage.aowg.q;
            if (obj != apcmVar) {
                if (obj == defpackage.aowg.r) {
                    throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked");
                }
                java.util.Objects.toString(obj);
                throw new java.lang.IllegalStateException("Another handler is already registered: ".concat(java.lang.String.valueOf(obj)));
            }
        } while (!aorqVar.d(apcmVar, defpackage.aowg.r));
        aonjVar.a(o());
    }

    @Override // defpackage.aowv
    public final boolean e(java.lang.Throwable th) {
        return w(th, false);
    }

    @Override // defpackage.aowv
    public final boolean f() {
        return x(this.b.b, false);
    }

    public final long g() {
        return this.c.b;
    }

    public final long h() {
        return this.b.b & 1152921504606846975L;
    }

    @Override // defpackage.aowu
    public final java.lang.Object i(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.aowe aoweVar = this;
        defpackage.aorq aorqVar = aoweVar.e;
        defpackage.aown aownVar = (defpackage.aown) aorqVar.a;
        while (!aoweVar.y()) {
            defpackage.aorp aorpVar = aoweVar.c;
            long jB = aorpVar.b();
            long j = defpackage.aowg.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (aownVar.b != j2) {
                defpackage.aown aownVarR = aoweVar.r(j2, aownVar);
                if (aownVarR != null) {
                    aownVar = aownVarR;
                } else {
                    continue;
                }
            }
            java.lang.Object objN = aoweVar.n(aownVar, i, jB, null);
            defpackage.apcm apcmVar = defpackage.aowg.m;
            if (objN == apcmVar) {
                throw new java.lang.IllegalStateException("unexpected");
            }
            defpackage.apcm apcmVar2 = defpackage.aowg.o;
            if (objN != apcmVar2) {
                defpackage.apcm apcmVar3 = defpackage.aowg.n;
                if (objN == apcmVar3) {
                    defpackage.aosc aoscVarAf = defpackage.aoov.af(defpackage.ajsz.ap(aolnVar));
                    try {
                        java.lang.Object objN2 = n(aownVar, i, jB, aoscVarAf);
                        if (objN2 == apcmVar) {
                            aoscVarAf.E(aownVar, i);
                        } else if (objN2 == apcmVar2) {
                            if (jB < h()) {
                                aownVar.o();
                            }
                            defpackage.aown aownVar2 = (defpackage.aown) aorqVar.a;
                            while (true) {
                                if (y()) {
                                    aoscVarAf.w(new defpackage.aoiv(p()));
                                    break;
                                }
                                long jB2 = aorpVar.b();
                                long j3 = jB2 / j;
                                defpackage.aosc aoscVar = aoscVarAf;
                                try {
                                    int i2 = (int) (jB2 % j);
                                    if (aownVar2.b != j3) {
                                        defpackage.aown aownVarR2 = r(j3, aownVar2);
                                        if (aownVarR2 != null) {
                                            aownVar2 = aownVarR2;
                                        } else {
                                            aoscVarAf = aoscVar;
                                        }
                                    }
                                    aoscVarAf = aoscVar;
                                    java.lang.Object objN3 = n(aownVar2, i2, jB2, aoscVarAf);
                                    if (objN3 == apcmVar) {
                                        aoscVarAf.E(aownVar2, i2);
                                        break;
                                    }
                                    if (objN3 != apcmVar2) {
                                        if (objN3 == apcmVar3) {
                                            throw new java.lang.IllegalStateException("unexpected");
                                        }
                                        aownVar2.o();
                                        aoscVarAf.e(objN3, this.a != null ? new aovz(this, 0) : null);
                                        break;
                                    }
                                    if (jB2 < h()) {
                                        aownVar2.o();
                                    }
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    aoscVarAf = aoscVar;
                                    aoscVarAf.B();
                                    throw th;
                                }
                            }
                        } else {
                            aownVar.o();
                            aoscVarAf.e(objN2, this.a != null ? new aovz(this, 0) : null);
                        }
                        objN = aoscVarAf.k();
                        if (objN == defpackage.aolu.a && aolnVar == null) {
                            defpackage.aooh.i("frame");
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                } else {
                    aownVar.o();
                }
                return objN;
            }
            if (jB < h()) {
                aownVar.o();
            }
            aoweVar = this;
        }
        throw defpackage.apcl.b(aoweVar.p());
    }

    @Override // defpackage.aowu
    public final java.lang.Object j(defpackage.aoln aolnVar) {
        return k(this, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object l(defpackage.aown aownVar, int i, long j, defpackage.aoln aolnVar) {
        defpackage.aowd aowdVar;
        defpackage.aowm aowmVar;
        aovz aovzVar;
        aovz aovzVar2;
        defpackage.aown aownVarR;
        if (aolnVar instanceof defpackage.aowd) {
            aowdVar = (defpackage.aowd) aolnVar;
            int i2 = aowdVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aowdVar.c = i2 - Integer.MIN_VALUE;
            } else {
                aowdVar = new defpackage.aowd(this, aolnVar);
            }
        } else {
            aowdVar = new defpackage.aowd(this, aolnVar);
        }
        java.lang.Object objK = aowdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = aowdVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objK);
            aowdVar.c = 1;
            defpackage.aosc aoscVarAf = defpackage.aoov.af(defpackage.ajsz.ap(aowdVar));
            try {
                defpackage.aowt aowtVar = new defpackage.aowt(aoscVarAf);
                java.lang.Object objN = n(aownVar, i, j, aowtVar);
                java.lang.Object obj = defpackage.aowg.m;
                if (objN == obj) {
                    aowtVar.E(aownVar, i);
                } else {
                    java.lang.Object obj2 = defpackage.aowg.o;
                    if (objN == obj2) {
                        if (j < h()) {
                            aownVar.o();
                        }
                        defpackage.aown aownVar2 = (defpackage.aown) this.e.a;
                        while (true) {
                            if (y()) {
                                aoscVarAf.w(new defpackage.aowm(new defpackage.aowk(o())));
                            } else {
                                long jB = this.c.b();
                                long j2 = defpackage.aowg.b;
                                long j3 = jB / j2;
                                int i4 = (int) (jB % j2);
                                if (aownVar2.b != j3) {
                                    aownVarR = r(j3, aownVar2);
                                    if (aownVarR == null) {
                                        continue;
                                    }
                                } else {
                                    aownVarR = aownVar2;
                                }
                                java.lang.Object objN2 = n(aownVarR, i4, jB, aowtVar);
                                if (objN2 == obj) {
                                    aowtVar.E(aownVarR, i4);
                                } else if (objN2 == obj2) {
                                    if (jB < h()) {
                                        aownVarR.o();
                                    }
                                    aownVar2 = aownVarR;
                                } else {
                                    if (objN2 == defpackage.aowg.n) {
                                        throw new java.lang.IllegalStateException("unexpected");
                                    }
                                    aownVarR.o();
                                    aowmVar = new defpackage.aowm(objN2);
                                    if (this.a != null) {
                                        aovzVar2 = new aovz(this, 2, (char[]) null);
                                        aovzVar = aovzVar2;
                                    } else {
                                        aovzVar = null;
                                    }
                                    aoscVarAf.e(aowmVar, aovzVar);
                                }
                            }
                        }
                    } else {
                        aownVar.o();
                        aowmVar = new defpackage.aowm(objN);
                        if (this.a != null) {
                            aovzVar2 = new aovz(this, 2, (char[]) null);
                            aovzVar = aovzVar2;
                        } else {
                            aovzVar = null;
                        }
                        aoscVarAf.e(aowmVar, aovzVar);
                    }
                }
                objK = aoscVarAf.k();
                if (objK == aoluVar) {
                    return aoluVar;
                }
            } catch (java.lang.Throwable th) {
                aoscVarAf.B();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
        }
        return ((defpackage.aowm) objK).b;
    }

    @Override // defpackage.aowu
    public final java.lang.Object m() {
        defpackage.aown aownVar;
        defpackage.aorp aorpVar = this.c;
        long j = aorpVar.b;
        long j2 = this.b.b;
        if (x(j2, true)) {
            return new defpackage.aowk(o());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return defpackage.aowm.a;
        }
        defpackage.aorq aorqVar = this.e;
        defpackage.apcm apcmVar = defpackage.aowg.k;
        defpackage.aown aownVar2 = (defpackage.aown) aorqVar.a;
        while (!this.y()) {
            long jB = aorpVar.b();
            long j3 = defpackage.aowg.b;
            long j4 = jB / j3;
            int i = (int) (jB % j3);
            if (aownVar2.b != j4) {
                defpackage.aown aownVarR = this.r(j4, aownVar2);
                if (aownVarR != null) {
                    aownVar = aownVarR;
                } else {
                    continue;
                }
            } else {
                aownVar = aownVar2;
            }
            defpackage.aowe aoweVar = this;
            java.lang.Object objN = aoweVar.n(aownVar, i, jB, apcmVar);
            aownVar2 = aownVar;
            if (objN == defpackage.aowg.m) {
                aoweVar.v(jB);
                aownVar2.r();
                return defpackage.aowm.a;
            }
            if (objN != defpackage.aowg.o) {
                if (objN == defpackage.aowg.n) {
                    throw new java.lang.IllegalStateException("unexpected");
                }
                aownVar2.o();
                return objN;
            }
            if (jB < aoweVar.h()) {
                aownVar2.o();
            }
            this = aoweVar;
        }
        return new defpackage.aowk(this.o());
    }

    public final java.lang.Object n(defpackage.aown aownVar, int i, long j, java.lang.Object obj) {
        java.lang.Object objD = aownVar.d(i);
        if (objD == null) {
            if (j >= (this.b.b & 1152921504606846975L)) {
                if (obj == null) {
                    return defpackage.aowg.n;
                }
                if (aownVar.j(i, null, obj)) {
                    G();
                    return defpackage.aowg.m;
                }
            }
        } else if (objD == defpackage.aowg.d && aownVar.j(i, objD, defpackage.aowg.i)) {
            G();
            return aownVar.e(i);
        }
        while (true) {
            java.lang.Object objD2 = aownVar.d(i);
            if (objD2 == null || objD2 == defpackage.aowg.e) {
                if (j < (this.b.b & 1152921504606846975L)) {
                    if (aownVar.j(i, objD2, defpackage.aowg.h)) {
                        G();
                        return defpackage.aowg.o;
                    }
                } else {
                    if (obj == null) {
                        return defpackage.aowg.n;
                    }
                    if (aownVar.j(i, objD2, obj)) {
                        G();
                        return defpackage.aowg.m;
                    }
                }
            } else if (objD2 != defpackage.aowg.d) {
                defpackage.apcm apcmVar = defpackage.aowg.j;
                if (objD2 == apcmVar || objD2 == defpackage.aowg.h) {
                    return defpackage.aowg.o;
                }
                if (objD2 == defpackage.aowg.l) {
                    G();
                    return defpackage.aowg.o;
                }
                if (objD2 != defpackage.aowg.g && aownVar.j(i, objD2, defpackage.aowg.f)) {
                    boolean z = objD2 instanceof defpackage.aoww;
                    if (z) {
                        objD2 = ((defpackage.aoww) objD2).a;
                    }
                    if (O(objD2, aownVar, i)) {
                        aownVar.i(i, defpackage.aowg.i);
                        G();
                        return aownVar.e(i);
                    }
                    aownVar.i(i, apcmVar);
                    aownVar.g(i, false);
                    if (z) {
                        G();
                    }
                    return defpackage.aowg.o;
                }
            } else if (aownVar.j(i, objD2, defpackage.aowg.i)) {
                G();
                return aownVar.e(i);
            }
        }
    }

    protected final java.lang.Throwable o() {
        return (java.lang.Throwable) this.l.a;
    }

    public final java.lang.Throwable p() {
        java.lang.Throwable thO = o();
        return thO == null ? new aowo() : thO;
    }

    protected final java.lang.Throwable q() {
        java.lang.Throwable thO = o();
        return thO == null ? new defpackage.aowp("Channel was closed") : thO;
    }

    public final defpackage.aown r(long j, defpackage.aown aownVar) {
        java.lang.Object objA;
        long j2;
        long j3;
        defpackage.aown aownVar2 = defpackage.aowg.a;
        aowf aowfVar = aowf.a;
        loop0: while (true) {
            objA = defpackage.apbh.a(aownVar, j, aowfVar);
            if (defpackage.apck.a(objA)) {
                break;
            }
            defpackage.apbi apbiVarB = defpackage.apck.b(objA);
            while (true) {
                defpackage.aorq aorqVar = this.e;
                defpackage.apbi apbiVar = (defpackage.apbi) aorqVar.a;
                if (apbiVar.b >= apbiVarB.b) {
                    break loop0;
                }
                if (apbiVarB.u()) {
                    if (aorqVar.d(apbiVar, apbiVarB)) {
                        if (!apbiVar.s()) {
                            break loop0;
                        }
                        apbiVar.p();
                        break loop0;
                    }
                    if (apbiVarB.s()) {
                        apbiVarB.p();
                    }
                }
            }
        }
        if (defpackage.apck.a(objA)) {
            f();
            if (aownVar.b * ((long) defpackage.aowg.b) >= h()) {
                return null;
            }
            aownVar.o();
            return null;
        }
        defpackage.aown aownVar3 = (defpackage.aown) defpackage.apck.b(objA);
        if (!M() && j <= D() / ((long) defpackage.aowg.b)) {
            defpackage.aorq aorqVar2 = this.j;
            while (true) {
                defpackage.apbi apbiVar2 = (defpackage.apbi) aorqVar2.a;
                if (apbiVar2.b >= aownVar3.b || !aownVar3.u()) {
                    break;
                }
                if (aorqVar2.d(apbiVar2, aownVar3)) {
                    if (!apbiVar2.s()) {
                        break;
                    }
                    apbiVar2.p();
                    break;
                }
                if (aownVar3.s()) {
                    aownVar3.p();
                }
            }
        }
        long j4 = aownVar3.b;
        if (j4 <= j) {
            boolean z = defpackage.aosu.a;
            return aownVar3;
        }
        long j5 = defpackage.aowg.b;
        defpackage.aorp aorpVar = this.c;
        do {
            j2 = j4 * j5;
            j3 = aorpVar.b;
            if (j3 >= j2) {
                break;
            }
        } while (!aorpVar.c(j3, j2));
        if (j2 >= h()) {
            return null;
        }
        aownVar3.o();
        return null;
    }

    @Override // defpackage.aowu
    public final void s(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        w(cancellationException, true);
    }

    public final defpackage.aown t(long j, defpackage.aown aownVar) {
        java.lang.Object objA;
        long j2;
        long j3;
        long j4;
        defpackage.aown aownVar2 = defpackage.aowg.a;
        aowf aowfVar = aowf.a;
        loop0: while (true) {
            objA = defpackage.apbh.a(aownVar, j, aowfVar);
            if (defpackage.apck.a(objA)) {
                break;
            }
            defpackage.apbi apbiVarB = defpackage.apck.b(objA);
            while (true) {
                defpackage.aorq aorqVar = this.d;
                defpackage.apbi apbiVar = (defpackage.apbi) aorqVar.a;
                if (apbiVar.b >= apbiVarB.b) {
                    break loop0;
                }
                if (apbiVarB.u()) {
                    if (aorqVar.d(apbiVar, apbiVarB)) {
                        if (!apbiVar.s()) {
                            break loop0;
                        }
                        apbiVar.p();
                        break loop0;
                    }
                    if (apbiVarB.s()) {
                        apbiVarB.p();
                    }
                }
            }
        }
        if (defpackage.apck.a(objA)) {
            f();
            if (aownVar.b * ((long) defpackage.aowg.b) >= g()) {
                return null;
            }
            aownVar.o();
            return null;
        }
        defpackage.aown aownVar3 = (defpackage.aown) defpackage.apck.b(objA);
        long j5 = aownVar3.b;
        if (j5 <= j) {
            boolean z = defpackage.aosu.a;
            return aownVar3;
        }
        long j6 = defpackage.aowg.b;
        defpackage.aorp aorpVar = this.b;
        do {
            j2 = j5 * j6;
            j3 = aorpVar.b;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!aorpVar.c(j3, (((long) ((int) (j3 >> 60))) << 60) + j4));
        if (j2 >= g()) {
            return null;
        }
        aownVar3.o();
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String string;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = (int) (this.b.b >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.g + ',');
        sb.append("data=[");
        java.util.List listBb = defpackage.ajsz.bb((defpackage.aown) this.e.a, (defpackage.aown) this.d.a, (defpackage.aown) this.j.a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listBb) {
            if (((defpackage.aown) obj) != defpackage.aowg.a) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((defpackage.aown) next).b;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((defpackage.aown) next2).b;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        defpackage.aown aownVar = (defpackage.aown) next;
        long jG = g();
        long jH = h();
        loop2: do {
            int i2 = defpackage.aowg.b;
            for (int i3 = 0; i3 < i2; i3++) {
                long j3 = (aownVar.b * ((long) i2)) + ((long) i3);
                if (j3 >= jH && j3 >= jG) {
                    break loop2;
                }
                java.lang.Object objD = aownVar.d(i3);
                java.lang.Object objC = aownVar.c(i3);
                if (objD instanceof defpackage.aosb) {
                    string = (jH > j3 || j3 >= jG) ? (jG > j3 || j3 >= jH) ? "cont" : "send" : "receive";
                } else if (objD instanceof defpackage.apdm) {
                    string = (jH > j3 || j3 >= jG) ? (jG > j3 || j3 >= jH) ? "select" : "onSend" : "onReceive";
                } else if (objD instanceof defpackage.aowt) {
                    string = "receiveCatching";
                } else if (objD instanceof defpackage.aovy) {
                    string = "sendBroadcast";
                } else if (objD instanceof defpackage.aoww) {
                    string = defpackage.a.bF((byte) 41, objD, "EB(");
                } else if (defpackage.aooh.n(objD, defpackage.aowg.f) || defpackage.aooh.n(objD, defpackage.aowg.g)) {
                    string = "resuming_sender";
                } else {
                    if (objD != null && !defpackage.aooh.n(objD, defpackage.aowg.e) && !defpackage.aooh.n(objD, defpackage.aowg.i) && !defpackage.aooh.n(objD, defpackage.aowg.h) && !defpackage.aooh.n(objD, defpackage.aowg.k) && !defpackage.aooh.n(objD, defpackage.aowg.j) && !defpackage.aooh.n(objD, defpackage.aowg.l)) {
                        string = objD.toString();
                    }
                }
                if (objC != null) {
                    sb.append("(" + string + ',' + objC + "),");
                } else {
                    sb.append(java.lang.String.valueOf(string).concat(","));
                }
            }
            aownVar = (defpackage.aown) aownVar.m();
        } while (aownVar != null);
        if (defpackage.aoov.W(sb) == ',') {
            defpackage.aooh.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    protected final void u(long j) throws apcv {
        defpackage.aown aownVar;
        apcv apcvVarD;
        boolean z = defpackage.aosu.a;
        defpackage.aown aownVar2 = (defpackage.aown) this.e.a;
        while (true) {
            defpackage.aorp aorpVar = this.c;
            int i = this.g;
            long j2 = aorpVar.b;
            if (j < java.lang.Math.max(((long) i) + j2, this.D())) {
                return;
            }
            if (aorpVar.c(j2, 1 + j2)) {
                long j3 = defpackage.aowg.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (aownVar2.b != j4) {
                    defpackage.aown aownVarR = this.r(j4, aownVar2);
                    if (aownVarR != null) {
                        aownVar = aownVarR;
                    }
                } else {
                    aownVar = aownVar2;
                }
                defpackage.aowe aoweVar = this;
                java.lang.Object objN = aoweVar.n(aownVar, i2, j2, null);
                if (objN != defpackage.aowg.o) {
                    aownVar.o();
                    defpackage.aonj aonjVar = aoweVar.a;
                    if (aonjVar != null && (apcvVarD = aoil.d(aonjVar, objN, (apcv) null)) != null) {
                        throw apcvVarD;
                    }
                } else if (j2 < aoweVar.h()) {
                    aownVar.o();
                }
                this = aoweVar;
                aownVar2 = aownVar;
            }
            this = this;
        }
    }

    public final void v(long j) {
        long j2;
        long j3;
        if (M()) {
            return;
        }
        while (D() <= j) {
        }
        int i = defpackage.aowg.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jD = D();
            if (jD == (this.i.b & 4611686018427387903L) && jD == D()) {
                return;
            }
        }
        defpackage.aorp aorpVar = this.i;
        do {
            j2 = aorpVar.b;
        } while (!aorpVar.c(j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
        while (true) {
            long jD2 = D();
            long j4 = aorpVar.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = j4 & 4611686018427387904L;
            if (jD2 == j5 && jD2 == D()) {
                break;
            } else if (j6 == 0) {
                aorpVar.c(j4, j5 + 4611686018427387904L);
            }
        }
        do {
            j3 = aorpVar.b;
        } while (!aorpVar.c(j3, j3 & 4611686018427387903L));
    }

    protected final boolean w(java.lang.Throwable th, boolean z) {
        long j;
        long j2;
        java.lang.Object obj;
        long j3;
        long j4;
        if (z) {
            defpackage.aorp aorpVar = this.b;
            do {
                j4 = aorpVar.b;
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                defpackage.aown aownVar = defpackage.aowg.a;
            } while (!aorpVar.c(j4, (j4 & 1152921504606846975L) + 1152921504606846976L));
        }
        boolean zD = this.l.d(defpackage.aowg.s, th);
        defpackage.aorp aorpVar2 = this.b;
        if (z) {
            do {
                j3 = aorpVar2.b;
            } while (!aorpVar2.c(j3, (j3 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                j = aorpVar2.b;
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!aorpVar2.c(j, j2));
        }
        f();
        if (!zD) {
            return zD;
        }
        defpackage.aorq aorqVar = this.m;
        do {
            obj = aorqVar.a;
        } while (!aorqVar.d(obj, obj == null ? defpackage.aowg.q : defpackage.aowg.r));
        if (obj == null) {
            return zD;
        }
        defpackage.aoov.f(obj, 1);
        ((defpackage.aonj) obj).a(o());
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: apcv */
    public final boolean x(long j, boolean z) throws apcv {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            F(j & 1152921504606846975L);
            if (z) {
                while (true) {
                    defpackage.aorq aorqVar = this.e;
                    defpackage.aown aownVarR = (defpackage.aown) aorqVar.a;
                    long jG = g();
                    if (h() <= jG) {
                        break;
                    }
                    long j2 = defpackage.aowg.b;
                    long j3 = jG / j2;
                    if (aownVarR.b != j3 && (aownVarR = r(j3, aownVarR)) == null) {
                        if (((defpackage.aown) aorqVar.a).b < j3) {
                            break;
                        }
                    } else {
                        aownVarR.o();
                        int i2 = (int) (jG % j2);
                        while (true) {
                            java.lang.Object objD = aownVarR.d(i2);
                            if (objD != null && objD != defpackage.aowg.e) {
                                if (objD == defpackage.aowg.d) {
                                    return false;
                                }
                                if (objD == defpackage.aowg.j || objD == defpackage.aowg.l || objD == defpackage.aowg.i || objD == defpackage.aowg.h) {
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                if (objD == defpackage.aowg.g) {
                                    return false;
                                }
                                if (objD == defpackage.aowg.f || jG != g()) {
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (aownVarR.j(i2, objD, defpackage.aowg.h)) {
                                G();
                                break;
                            }
                        }
                        this.c.c(jG, 1 + jG);
                    }
                }
            }
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException(defpackage.a.bj(i, "unexpected close status: "));
            }
            defpackage.aown aownVarF = F(j & 1152921504606846975L);
            defpackage.aonj aonjVar = this.a;
            apcv apcvVarD = null;
            java.lang.Object objA = null;
            loop0: do {
                int i3 = defpackage.aowg.b;
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    long j4 = aownVarF.b * ((long) i3);
                    while (true) {
                        java.lang.Object objD2 = aownVarF.d(i4);
                        if (objD2 == defpackage.aowg.i) {
                            break loop0;
                        }
                        long j5 = ((long) i4) + j4;
                        if (objD2 != defpackage.aowg.d) {
                            if (objD2 != defpackage.aowg.e && objD2 != null) {
                                if (!(objD2 instanceof defpackage.aovq) && !(objD2 instanceof defpackage.aoww)) {
                                    defpackage.apcm apcmVar = defpackage.aowg.g;
                                    if (objD2 == apcmVar || objD2 == defpackage.aowg.f) {
                                        break loop0;
                                    }
                                    if (objD2 != apcmVar) {
                                        break;
                                    }
                                } else {
                                    if (j5 < g()) {
                                        break loop0;
                                    }
                                    defpackage.aovq aovqVar = objD2 instanceof defpackage.aoww ? ((defpackage.aoww) objD2).a : (defpackage.aovq) objD2;
                                    if (aownVarF.j(i4, objD2, defpackage.aowg.l)) {
                                        if (aonjVar != null) {
                                            apcvVarD = aoil.d(aonjVar, aownVarF.c(i4), apcvVarD);
                                        }
                                        objA = defpackage.apbx.a(objA, aovqVar);
                                        aownVarF.h(i4, null);
                                        aownVarF.r();
                                        break;
                                    }
                                }
                            } else {
                                if (aownVarF.j(i4, objD2, defpackage.aowg.l)) {
                                    aownVarF.r();
                                    break;
                                }
                            }
                        } else {
                            if (j5 < g()) {
                                break loop0;
                            }
                            if (aownVarF.j(i4, objD2, defpackage.aowg.l)) {
                                if (aonjVar != null) {
                                    apcvVarD = aoil.d(aonjVar, aownVarF.c(i4), apcvVarD);
                                }
                                aownVarF.h(i4, null);
                                aownVarF.r();
                                break;
                            }
                        }
                    }
                }
                aownVarF = (defpackage.aown) aownVarF.n();
            } while (aownVarF != null);
            if (objA != null) {
                if (objA instanceof java.util.ArrayList) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) objA;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        K((defpackage.aovq) arrayList.get(size), false);
                    }
                } else {
                    K((defpackage.aovq) objA, false);
                }
            }
            if (apcvVarD != null) {
                throw apcvVarD;
            }
        }
        return true;
    }

    public final boolean y() {
        return x(this.b.b, true);
    }

    protected boolean z() {
        return false;
    }
}
