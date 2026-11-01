package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ark extends defpackage.dap implements defpackage.ddb, defpackage.cug, defpackage.dan, defpackage.arn {
    private rm G;
    private defpackage.kaw H;
    private defpackage.avb a;
    private boolean b;
    private aqp c;
    public defpackage.aso e;
    public defpackage.aonj f;
    public boolean g;
    public defpackage.aowi h;
    public boolean i;
    private defpackage.dao j;
    private defpackage.dao k;
    private aqs l;
    private aqr m;
    private aqq n;
    private defpackage.adb q;
    private aty r;
    private asa s;
    private long d = 0;
    private long o = 0;
    private long p = 9205357640488583168L;

    public ark(defpackage.aonj aonjVar, boolean z, defpackage.kaw kawVar, defpackage.aso asoVar) {
        this.e = asoVar;
        this.f = aonjVar;
        this.g = z;
        this.H = kawVar;
    }

    private final void A() {
        this.o = 0L;
        this.p = 9205357640488583168L;
    }

    private final void B() {
        g().b(aqt.a);
    }

    static /* synthetic */ void G(defpackage.ark arkVar, cvm cvmVar, long j, long j2, int i) {
        aqr aqrVar = arkVar.m;
        if (aqrVar == null) {
            aqrVar = new aqr((byte[]) null);
            arkVar.m = aqrVar;
        }
        aqrVar.a = cvmVar;
        aqrVar.b = j;
        aty atyVar = arkVar.r;
        if (atyVar == null) {
            arkVar.r = new aty(arkVar.e, 0L);
        } else {
            if ((i & 4) != 0) {
                j2 = 0;
            }
            atyVar.a = arkVar.e;
            atyVar.b = j2;
        }
        aqrVar.c = false;
        arkVar.G = aqrVar;
    }

    private final void K(cvm cvmVar, cvm cvmVar2, long j) {
        long jAM = defpackage.mni.aM(cvmVar2.c, j);
        if (((java.lang.Boolean) this.f.a(new cvu(cvmVar.i))).booleanValue()) {
            if (!this.i) {
                if (this.h == null) {
                    this.h = defpackage.aooh.H(Integer.MAX_VALUE, 0, null, 6);
                }
                W();
            }
            g().b(new aqv(jAM));
        }
    }

    private final void W() {
        this.i = true;
        if (this.h == null) {
            this.h = defpackage.aooh.H(Integer.MAX_VALUE, 0, null, 6);
        }
        defpackage.aoov.an(M(), null, 0, new auk(this, (defpackage.aoln) null, 1), 3);
    }

    private final void X(long j) {
        this.d = defpackage.mni.bl(this.d, j);
        g().b(new aqu(j, false));
    }

    private final void cT(long j, boolean z) {
        aqs aqsVar = this.l;
        if (aqsVar == null) {
            aqsVar = new aqs((byte[]) null);
            this.l = aqsVar;
        }
        aqsVar.a = j;
        aqsVar.b = false;
        aqsVar.c = z;
        this.G = aqsVar;
    }

    private final void cU() {
        j();
        if (this.i) {
            B();
        }
        this.q = null;
    }

    private final void cV() {
        defpackage.dao daoVar = this.k;
        if (daoVar != null) {
            U(daoVar);
        }
        defpackage.dao daoVar2 = this.j;
        if (daoVar2 != null) {
            U(daoVar2);
        }
        this.k = null;
        this.j = null;
    }

    private final aqp e() {
        aqp aqpVar = this.c;
        if (aqpVar != null) {
            return aqpVar;
        }
        aqp aqpVar2 = new aqp((byte[]) null);
        this.c = aqpVar2;
        return aqpVar2;
    }

    private final defpackage.aowi g() {
        defpackage.aowi aowiVar = this.h;
        if (aowiVar != null) {
            return aowiVar;
        }
        throw new java.lang.IllegalArgumentException("Events channel not initialized.");
    }

    private final void j() {
        this.d = 0L;
        aqp aqpVarE = e();
        aqpVarE.c = 3;
        aqpVarE.a = false;
        aqpVarE.b = false;
        this.G = aqpVarE;
    }

    private final void k(cvm cvmVar, long j, aty atyVar) {
        aqq aqqVar = this.n;
        if (aqqVar == null) {
            aqqVar = new aqq((byte[]) null);
            this.n = aqqVar;
        }
        aqqVar.a = cvmVar;
        aqqVar.b = j;
        atyVar.b = 0L;
        this.G = aqqVar;
    }

    @Override // defpackage.ddb
    public final /* synthetic */ boolean C() {
        return false;
    }

    protected final void E() {
        if (this.j == null) {
            ank ankVar = new ank(this);
            V(ankVar);
            this.j = ankVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.cug
    public final void F(alic alicVar, cvg cvgVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (this.g) {
            asa asaVar = this.s;
            if (asaVar == null) {
                asaVar = new asa(this);
                this.s = asaVar;
            }
            if (this.k == null) {
                if (asaVar == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.foundation.gestures.DraggableGestureConnection");
                }
                ank ankVar = new ank(asaVar);
                V(ankVar);
                this.k = ankVar;
            }
            asa asaVar2 = this.s;
            if (asaVar2 != null) {
                if (asaVar2.d == null) {
                    asaVar2.d = asaVar2.a();
                }
                arw arwVar = asaVar2.d;
                if (arwVar == null) {
                    throw new java.lang.IllegalArgumentException("currentDragState should not be null");
                }
                java.lang.Object obj4 = null;
                boolean z = true;
                if (arwVar instanceof arw) {
                    arw arwVar2 = arwVar;
                    ?? r4 = alicVar.c;
                    if (r4.isEmpty()) {
                        return;
                    }
                    int size = r4.size();
                    for (int i = 0; i < size; i++) {
                        if (!rq.i((cuf) r4.get(i))) {
                            return;
                        }
                    }
                    if (r4.isEmpty()) {
                        throw new java.util.NoSuchElementException("List is empty.");
                    }
                    cuf cufVar = (cuf) r4.get(0);
                    int i2 = arwVar2.c;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    }
                    int i4 = 2;
                    if (i3 == 2) {
                        i2 = !asaVar2.a.i() ? 1 : 2;
                    }
                    arwVar2.c = i2;
                    if (cvgVar == cvg.a) {
                        if (i2 == 2) {
                            cufVar.a();
                            arwVar2.a = true;
                        } else {
                            i4 = i2;
                        }
                        arwVar2.b = true;
                        i2 = i4;
                    }
                    if (cvgVar == cvg.b) {
                        if (i2 == 1) {
                            asa.j(asaVar2, cufVar, cufVar.a, 0L, 12);
                            return;
                        } else {
                            if (arwVar2.a) {
                                int i5 = alicVar.a;
                                asaVar2.i(cufVar, cufVar, new defpackage.cue(i5), 0L);
                                asaVar2.h(cufVar, new defpackage.cue(i5), 0L);
                                asaVar2.e(cufVar.a);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (arwVar instanceof ary) {
                    ary aryVar = (ary) arwVar;
                    if (cvgVar != cvg.a) {
                        ?? r3 = alicVar.c;
                        int size2 = r3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = r3.get(i6);
                            if (((cuf) obj2).a == aryVar.b) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        cuf cufVar2 = (cuf) obj2;
                        if (cufVar2 == null) {
                            int size3 = r3.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size3) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = r3.get(i7);
                                if (((cuf) obj3).d) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            cufVar2 = (cuf) obj3;
                            if (cufVar2 == null) {
                                asaVar2.c();
                                return;
                            }
                            aryVar.b = cufVar2.a;
                        }
                        cuf cufVar3 = cufVar2;
                        if (cvgVar == cvg.b) {
                            if (cufVar3.g) {
                                cuf cufVar4 = aryVar.a;
                                if (cufVar4 == null) {
                                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                }
                                long j = aryVar.b;
                                aty atyVar = asaVar2.c;
                                if (atyVar == null) {
                                    throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                                }
                                asaVar2.d(cufVar4, j, atyVar);
                            } else if (rq.j(cufVar3)) {
                                int size4 = r3.size();
                                for (int i8 = 0; i8 < size4; i8++) {
                                    java.lang.Object obj5 = r3.get(i8);
                                    if (((cuf) obj5).d) {
                                        obj4 = obj5;
                                        break;
                                    }
                                }
                                cuf cufVar5 = (cuf) obj4;
                                if (cufVar5 == null) {
                                    asaVar2.c();
                                } else {
                                    aryVar.b = cufVar5.a;
                                }
                            } else {
                                defpackage.ark arkVar = asaVar2.a;
                                float fG = ro.g((defpackage.dgk) defpackage.cfo.G(arkVar, defpackage.dfo.n), 1);
                                aty atyVar2 = asaVar2.c;
                                if (atyVar2 == null) {
                                    throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.");
                                }
                                defpackage.aso asoVar = arkVar.e;
                                int i9 = alicVar.a;
                                defpackage.cue cueVar = new defpackage.cue(i9);
                                long jB = atyVar2.b(defpackage.mni.aM(rq.g(cufVar3, asoVar, cueVar), rq.h(cufVar3, asoVar, cueVar)), fG);
                                if ((9223372034707292159L & jB) != 9205357640488583168L) {
                                    cufVar3.a();
                                    cuf cufVar6 = aryVar.a;
                                    if (cufVar6 == null) {
                                        defpackage.aooh.g();
                                    }
                                    asaVar2.i(cufVar6, cufVar3, new defpackage.cue(i9), jB);
                                    asaVar2.h(cufVar3, new defpackage.cue(i9), jB);
                                    asaVar2.e(cufVar3.a);
                                } else {
                                    aryVar.c = true;
                                }
                            }
                        }
                        if (cvgVar == cvg.c && aryVar.c) {
                            if (!cufVar3.g) {
                                aryVar.c = false;
                                return;
                            }
                            cuf cufVar7 = aryVar.a;
                            if (cufVar7 == null) {
                                throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                            }
                            long j2 = aryVar.b;
                            aty atyVar3 = asaVar2.c;
                            if (atyVar3 == null) {
                                throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                            }
                            asaVar2.d(cufVar7, j2, atyVar3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (arwVar instanceof arx) {
                    arx arxVar = (arx) arwVar;
                    if (cvgVar == cvg.c) {
                        ?? r2 = alicVar.c;
                        int size5 = r2.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            if (((cuf) r2.get(i10)).g) {
                                z = false;
                                break;
                            }
                        }
                        int size6 = r2.size();
                        for (int i11 = 0; i11 < size6; i11++) {
                            if (((cuf) r2.get(i11)).d) {
                                if (r2.isEmpty()) {
                                    break;
                                }
                                if (z) {
                                    if (r2.isEmpty()) {
                                        throw new java.util.NoSuchElementException("List is empty.");
                                    }
                                    cuf cufVar8 = (cuf) r2.get(0);
                                    defpackage.ark arkVar2 = asaVar2.a;
                                    int i12 = alicVar.a;
                                    long jG = rq.g(cufVar8, arkVar2.e, new defpackage.cue(i12));
                                    cuf cufVar9 = arxVar.a;
                                    if (cufVar9 == null) {
                                        defpackage.aooh.g();
                                    }
                                    long jAM = defpackage.mni.aM(jG, rq.g(cufVar9, arkVar2.e, new defpackage.cue(i12)));
                                    cuf cufVar10 = arxVar.a;
                                    if (cufVar10 == null) {
                                        throw new java.lang.IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                    }
                                    asa.j(asaVar2, cufVar10, arxVar.b, jAM, 8);
                                    return;
                                }
                                return;
                            }
                        }
                        asaVar2.c();
                        return;
                    }
                    return;
                }
                if (!(arwVar instanceof arz)) {
                    throw new defpackage.aois();
                }
                arz arzVar = (arz) arwVar;
                if (cvgVar == cvg.b) {
                    long j3 = arzVar.a;
                    ?? r5 = alicVar.c;
                    int size7 = r5.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size7) {
                            obj = null;
                            break;
                        }
                        obj = r5.get(i13);
                        if (((cuf) obj).a == j3) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    cuf cufVar11 = (cuf) obj;
                    if (cufVar11 != null) {
                        if (!rq.j(cufVar11)) {
                            if (cufVar11.g) {
                                asaVar2.g();
                                return;
                            }
                            defpackage.ark arkVar3 = asaVar2.a;
                            int i14 = alicVar.a;
                            defpackage.aso asoVar2 = arkVar3.e;
                            defpackage.cue cueVar2 = new defpackage.cue(i14);
                            asaVar2.h(cufVar11, new defpackage.cue(i14), true != cufVar11.g ? defpackage.mni.aM(rq.g(cufVar11, asoVar2, cueVar2), rq.h(cufVar11, asoVar2, cueVar2)) : 0L);
                            cufVar11.a();
                            return;
                        }
                        int size8 = r5.size();
                        for (int i15 = 0; i15 < size8; i15++) {
                            java.lang.Object obj6 = r5.get(i15);
                            if (((cuf) obj6).d) {
                                obj4 = obj6;
                                break;
                            }
                        }
                        cuf cufVar12 = (cuf) obj4;
                        if (cufVar12 != null) {
                            arzVar.a = cufVar12.a;
                            return;
                        }
                        if (cufVar11.g || !rq.j(cufVar11)) {
                            asaVar2.g();
                        } else {
                            defpackage.cue cueVar3 = new defpackage.cue(alicVar.a);
                            oq oqVarK = asaVar2.k();
                            defpackage.ark arkVar4 = asaVar2.a;
                            oqVarK.e(cufVar11.b, defpackage.mni.bl(rq.g(cufVar11, arkVar4.e, cueVar3), asaVar2.b));
                            float fA = ((defpackage.dgk) defpackage.cfo.G(arkVar4, defpackage.dfo.n)).a();
                            long jD = asaVar2.k().d(defpackage.mni.bj(fA, fA));
                            asaVar2.k().f();
                            arkVar4.I(new aqw(arp.b(jD), true));
                        }
                        asaVar2.c();
                    }
                }
            }
        }
    }

    @Override // defpackage.cug
    public final void H() {
        asa asaVar = this.s;
        if (asaVar != null) {
            asaVar.f();
        }
    }

    public final void I(rm rmVar) {
        if ((rmVar instanceof aqv) && !this.i) {
            this.i = true;
            W();
        }
        g().b(rmVar);
    }

    public final void J(defpackage.aonj aonjVar, boolean z, defpackage.kaw kawVar, defpackage.aso asoVar, boolean z2) {
        this.f = aonjVar;
        if (this.g != z) {
            this.g = z;
            z2 = true;
            if (!z) {
                cV();
                z();
                this.s = null;
            }
        }
        if (!defpackage.aooh.n(this.H, kawVar)) {
            z();
            this.H = kawVar;
        }
        if (this.e != asoVar) {
            this.e = asoVar;
        } else if (!z2) {
            return;
        }
        if (this.b) {
            cU();
        }
        asa asaVar = this.s;
        if (asaVar != null) {
            asaVar.f();
        }
    }

    @Override // defpackage.anj
    public final java.lang.String b() {
        if (!this.g) {
            return "idle";
        }
        aqp aqpVar = this.G;
        if (aqpVar instanceof aqp) {
            if (!aqpVar.b) {
                return "idle";
            }
        } else if (!(aqpVar instanceof aqr) && !(aqpVar instanceof aqq)) {
            return aqpVar instanceof aqs ? "recognized" : "idle";
        }
        return "waiting";
    }

    @Override // defpackage.cmv
    public /* synthetic */ void cM() {
        n();
    }

    public abstract java.lang.Object cR(defpackage.aonn aonnVar, defpackage.aoln aolnVar);

    public abstract void cS(aqw aqwVar);

    public abstract void h(long j);

    public abstract boolean i();

    @Override // defpackage.arn
    public final defpackage.aso m() {
        return this.e;
    }

    @Override // defpackage.ddb
    public final void n() {
        if (this.b) {
            cU();
        }
        this.b = false;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d1 A[LOOP:10: B:148:0x02c2->B:152:0x02d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x02da  */
    /* JADX WARN: Code duplicated, block: B:157:0x02df  */
    /* JADX WARN: Code duplicated, block: B:158:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:162:0x030e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0346  */
    /* JADX WARN: Code duplicated, block: B:165:0x0348  */
    /* JADX WARN: Code duplicated, block: B:171:0x036d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0374  */
    /* JADX WARN: Code duplicated, block: B:175:0x0384  */
    /* JADX WARN: Code duplicated, block: B:176:0x0394  */
    /* JADX WARN: Code duplicated, block: B:178:0x039c  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:183:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:299:0x0564  */
    /* JADX WARN: Code duplicated, block: B:301:0x056d  */
    /* JADX WARN: Code duplicated, block: B:340:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public void p(defpackage.cvf cvfVar, cvg cvgVar, long j) {
        ?? r16;
        long j2;
        ?? r13;
        int i;
        ?? r6;
        oq oqVar;
        ?? r7;
        boolean z;
        ?? r5;
        cvm cvmVar;
        long j3;
        aty atyVar;
        float fG;
        aty atyVar2;
        long j4;
        long j5;
        long jB;
        defpackage.aso asoVar;
        float f;
        boolean zC;
        cvm cvmVar2;
        int size;
        int i2;
        ?? r8;
        cvm cvmVar3;
        java.lang.Object obj;
        ?? r9;
        java.util.List list;
        int size2;
        int i3;
        cvm cvmVar4;
        defpackage.adb adbVar;
        ?? r10;
        boolean z2;
        int i4;
        int i5;
        defpackage.adb adbVar2;
        char[] cArr;
        long j6;
        this.b = true;
        if (this.g) {
            E();
            if (this.G == null) {
                this.G = e();
            }
            cvg cvgVar2 = cvg.b;
            char[] cArr2 = null;
            if (cvgVar == cvgVar2) {
                defpackage.adb adbVar3 = this.q;
                if (adbVar3 == null) {
                    adbVar3 = new defpackage.adb(10);
                    this.q = adbVar3;
                }
                if (adbVar3.j()) {
                    A();
                }
                java.util.List list2 = cvfVar.a;
                int size3 = list2.size();
                int i6 = 0;
                while (i6 < size3) {
                    long j7 = ((cvm) list2.get(i6)).a;
                    if (adbVar3.d(j7) == null) {
                        oq oqVar2 = new oq(cArr2);
                        cArr = cArr2;
                        int i7 = adbVar3.d;
                        if (i7 == 0 || j7 > adbVar3.b[i7 - 1]) {
                            if (adbVar3.a) {
                                long[] jArr = adbVar3.b;
                                if (i7 >= jArr.length) {
                                    java.lang.Object[] objArr = adbVar3.c;
                                    int i8 = 0;
                                    int i9 = 0;
                                    while (i8 < i7) {
                                        long[] jArr2 = jArr;
                                        java.lang.Object obj2 = objArr[i8];
                                        long j8 = j7;
                                        if (obj2 != adc.a) {
                                            if (i8 != i9) {
                                                jArr2[i9] = jArr2[i8];
                                                objArr[i9] = obj2;
                                                objArr[i8] = cArr;
                                            }
                                            i9++;
                                        }
                                        i8++;
                                        jArr = jArr2;
                                        j7 = j8;
                                    }
                                    j6 = j7;
                                    adbVar3.a = false;
                                    adbVar3.d = i9;
                                    i7 = i9;
                                } else {
                                    j6 = j7;
                                }
                            } else {
                                j6 = j7;
                            }
                            long[] jArr3 = adbVar3.b;
                            if (i7 >= jArr3.length) {
                                int iC = defpackage.aei.c((i7 + 1) << 3) / 8;
                                long[] jArrCopyOf = java.util.Arrays.copyOf(jArr3, iC);
                                defpackage.aooh.e(jArrCopyOf, "copyOf(...)");
                                adbVar3.b = jArrCopyOf;
                                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(adbVar3.c, iC);
                                defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
                                adbVar3.c = objArrCopyOf;
                            }
                            adbVar3.b[i7] = j6;
                            adbVar3.c[i7] = oqVar2;
                            adbVar3.d = i7 + 1;
                        } else {
                            adbVar3.g(j7, oqVar2);
                        }
                    } else {
                        cArr = cArr2;
                    }
                    i6++;
                    cArr2 = cArr;
                }
                r16 = cArr2;
                j2 = 9205357640488583168L;
                long jL = defpackage.den.G(defpackage.cfo.y(this)).l(0L);
                long j9 = this.p;
                if (j9 != 9205357640488583168L && jL != j9) {
                    this.o = defpackage.mni.bl(this.o, defpackage.mni.aM(jL, j9));
                }
                this.p = jL;
                int size4 = list2.size();
                int i10 = 0;
                while (i10 < size4) {
                    cvm cvmVar5 = (cvm) list2.get(i10);
                    java.lang.Object objD = adbVar3.d(cvmVar5.a);
                    if (objD == null) {
                        defpackage.aooh.g();
                    }
                    long j10 = this.o;
                    java.lang.Object obj3 = ((oq) objD).a;
                    if (defpackage.uu.r(cvmVar5)) {
                        ((cwf) obj3).b();
                    }
                    if (defpackage.uu.t(cvmVar5)) {
                        i4 = size4;
                        i5 = i10;
                        adbVar2 = adbVar3;
                    } else {
                        java.util.List listA = cvmVar5.a();
                        int size5 = listA.size();
                        int i11 = 0;
                        while (i11 < size5) {
                            cuy cuyVar = (cuy) listA.get(i11);
                            ((cwf) obj3).a(cuyVar.a, defpackage.mni.bl(cuyVar.e, j10));
                            i11++;
                            size4 = size4;
                            i10 = i10;
                            adbVar3 = adbVar3;
                            listA = listA;
                        }
                        i4 = size4;
                        i5 = i10;
                        adbVar2 = adbVar3;
                        ((cwf) obj3).a(cvmVar5.b, defpackage.mni.bl(cvmVar5.m, j10));
                    }
                    if (defpackage.uu.t(cvmVar5)) {
                        cwf cwfVar = (cwf) obj3;
                        if (cvmVar5.b - cwfVar.c > 40) {
                            cwfVar.b();
                        }
                    }
                    ((cwf) obj3).c = cvmVar5.b;
                    i10 = i5 + 1;
                    size4 = i4;
                    adbVar3 = adbVar2;
                }
            } else {
                r16 = 0;
                j2 = 9205357640488583168L;
            }
            aqp aqpVar = this.G;
            if (aqpVar == null) {
                throw new java.lang.IllegalArgumentException("currentDragState should not be null");
            }
            if (!(aqpVar instanceof aqp)) {
                if (aqpVar instanceof aqr) {
                    aqr aqrVar = (aqr) aqpVar;
                    if (cvgVar != cvg.a) {
                        java.util.List list3 = cvfVar.a;
                        int size6 = list3.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size6) {
                                r5 = r16;
                                break;
                            }
                            r5 = list3.get(i12);
                            if (((cvm) r5).a == aqrVar.b) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        cvm cvmVar6 = (cvm) r5;
                        if (cvmVar6 == null) {
                            int size7 = list3.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size7) {
                                    r9 = r16;
                                    break;
                                }
                                r9 = list3.get(i13);
                                if (((cvm) r9).d) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            cvmVar6 = (cvm) r9;
                            if (cvmVar6 == null) {
                                j();
                            } else {
                                aqrVar.b = cvmVar6.a;
                                if (cvgVar == cvgVar2) {
                                    if (!cvmVar6.c()) {
                                        cvmVar = aqrVar.a;
                                        if (cvmVar != null) {
                                            throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                        }
                                        j3 = aqrVar.b;
                                        atyVar = this.r;
                                        if (atyVar != null) {
                                            throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        }
                                        k(cvmVar, j3, atyVar);
                                    } else if (defpackage.uu.t(cvmVar6)) {
                                        size = list3.size();
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < size) {
                                                r8 = r16;
                                                break;
                                            }
                                            obj = list3.get(i2);
                                            if (((cvm) obj).d) {
                                                r8 = obj;
                                                break;
                                            }
                                            i2++;
                                        }
                                        cvmVar3 = (cvm) r8;
                                        if (cvmVar3 == null) {
                                            j();
                                        } else {
                                            aqrVar.b = cvmVar3.a;
                                        }
                                    } else {
                                        fG = ro.g((defpackage.dgk) defpackage.cfo.G(this, defpackage.dfo.n), cvmVar6.i);
                                        atyVar2 = this.r;
                                        if (atyVar2 != null) {
                                            throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.");
                                        }
                                        j4 = cvmVar6.g;
                                        j5 = cvmVar6.c;
                                        jB = atyVar2.b(defpackage.mni.aM(j5, j4), fG);
                                        if ((jB & 9223372034707292159L) != j2) {
                                            long jBl = defpackage.mni.bl(this.d, defpackage.uu.x(cvmVar6));
                                            this.d = jBl;
                                            float fAtan2 = (float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.d & 4294967295L))), java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jBl >> 32))));
                                            asoVar = this.e;
                                            f = fAtan2 * 57.29578f;
                                            if (asoVar == null) {
                                                zC = true;
                                            } else {
                                                zC = arp.c(asoVar, f);
                                            }
                                            defpackage.aoop aoopVar = new defpackage.aoop();
                                            arg argVar = new arg(f, aoopVar, 0);
                                            defpackage.aono aonoVar = arp.a;
                                            defpackage.rd.h(this, new defpackage.agb(argVar, 19));
                                            if (zC && aoopVar.a) {
                                                aqrVar.c = true;
                                            } else {
                                                cvmVar6.b();
                                                cvmVar2 = aqrVar.a;
                                                if (cvmVar2 == null) {
                                                    defpackage.aooh.g();
                                                }
                                                K(cvmVar2, cvmVar6, jB);
                                                X(jB);
                                                cT(cvmVar6.a, false);
                                            }
                                        } else {
                                            aqrVar.c = true;
                                            this.d = defpackage.mni.bl(this.d, defpackage.mni.aM(j5, j4));
                                        }
                                    }
                                }
                                if (cvgVar == cvg.c || !aqrVar.c) {
                                    break;
                                }
                                if (cvmVar6.c()) {
                                    cvm cvmVar7 = aqrVar.a;
                                    if (cvmVar7 == null) {
                                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                    long j11 = aqrVar.b;
                                    aty atyVar3 = this.r;
                                    if (atyVar3 == null) {
                                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    }
                                    k(cvmVar7, j11, atyVar3);
                                } else {
                                    i = 0;
                                    aqrVar.c = false;
                                }
                            }
                        } else {
                            if (cvgVar == cvgVar2) {
                                if (!cvmVar6.c()) {
                                    cvmVar = aqrVar.a;
                                    if (cvmVar != null) {
                                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.initialDown was not initialized");
                                    }
                                    j3 = aqrVar.b;
                                    atyVar = this.r;
                                    if (atyVar != null) {
                                        throw new java.lang.IllegalArgumentException("AwaitTouchSlop.touchSlopDetector was not initialized");
                                    }
                                    k(cvmVar, j3, atyVar);
                                } else if (defpackage.uu.t(cvmVar6)) {
                                    size = list3.size();
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < size) {
                                            r8 = r16;
                                            break;
                                        }
                                        obj = list3.get(i2);
                                        if (((cvm) obj).d) {
                                            r8 = obj;
                                            break;
                                        }
                                        i2++;
                                    }
                                    cvmVar3 = (cvm) r8;
                                    if (cvmVar3 == null) {
                                        j();
                                    } else {
                                        aqrVar.b = cvmVar3.a;
                                    }
                                } else {
                                    fG = ro.g((defpackage.dgk) defpackage.cfo.G(this, defpackage.dfo.n), cvmVar6.i);
                                    atyVar2 = this.r;
                                    if (atyVar2 != null) {
                                        throw new java.lang.IllegalArgumentException("Touch slop detector not initialized.");
                                    }
                                    j4 = cvmVar6.g;
                                    j5 = cvmVar6.c;
                                    jB = atyVar2.b(defpackage.mni.aM(j5, j4), fG);
                                    if ((jB & 9223372034707292159L) != j2) {
                                        long jBl2 = defpackage.mni.bl(this.d, defpackage.uu.x(cvmVar6));
                                        this.d = jBl2;
                                        float fAtan3 = (float) java.lang.Math.atan2(java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (this.d & 4294967295L))), java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jBl2 >> 32))));
                                        asoVar = this.e;
                                        f = fAtan3 * 57.29578f;
                                        if (asoVar == null) {
                                            zC = true;
                                        } else {
                                            zC = arp.c(asoVar, f);
                                        }
                                        defpackage.aoop aoopVar2 = new defpackage.aoop();
                                        arg argVar2 = new arg(f, aoopVar2, 0);
                                        defpackage.aono aonoVar2 = arp.a;
                                        defpackage.rd.h(this, new defpackage.agb(argVar2, 19));
                                        if (zC) {
                                            cvmVar6.b();
                                            cvmVar2 = aqrVar.a;
                                            if (cvmVar2 == null) {
                                                defpackage.aooh.g();
                                            }
                                            K(cvmVar2, cvmVar6, jB);
                                            X(jB);
                                            cT(cvmVar6.a, false);
                                        } else {
                                            cvmVar6.b();
                                            cvmVar2 = aqrVar.a;
                                            if (cvmVar2 == null) {
                                                defpackage.aooh.g();
                                            }
                                            K(cvmVar2, cvmVar6, jB);
                                            X(jB);
                                            cT(cvmVar6.a, false);
                                        }
                                    } else {
                                        aqrVar.c = true;
                                        this.d = defpackage.mni.bl(this.d, defpackage.mni.aM(j5, j4));
                                    }
                                }
                            }
                            if (cvgVar == cvg.c) {
                            }
                        }
                    }
                } else if (aqpVar instanceof aqq) {
                    aqq aqqVar = (aqq) aqpVar;
                    if (cvgVar == cvg.c) {
                        java.util.List list4 = cvfVar.a;
                        int size8 = list4.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size8) {
                                z = true;
                                break;
                            } else {
                                if (((cvm) list4.get(i14)).c()) {
                                    z = false;
                                    break;
                                }
                                i14++;
                            }
                        }
                        int size9 = list4.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size9) {
                                if (((cvm) list4.get(i15)).d) {
                                    if (!list4.isEmpty()) {
                                        if (!z) {
                                            break;
                                        }
                                        if (list4.isEmpty()) {
                                            throw new java.util.NoSuchElementException("List is empty.");
                                        }
                                        long j12 = ((cvm) list4.get(0)).c;
                                        cvm cvmVar8 = aqqVar.a;
                                        if (cvmVar8 == null) {
                                            defpackage.aooh.g();
                                        }
                                        long jAM = defpackage.mni.aM(j12, cvmVar8.c);
                                        cvm cvmVar9 = aqqVar.a;
                                        if (cvmVar9 == null) {
                                            throw new java.lang.IllegalArgumentException("AwaitGesturePickup.initialDown was not initialized.");
                                        }
                                        G(this, cvmVar9, aqqVar.b, jAM, 8);
                                        break;
                                    }
                                } else {
                                    i15++;
                                }
                            }
                            j();
                            break;
                        }
                    }
                } else {
                    if (!(aqpVar instanceof aqs)) {
                        throw new defpackage.aois();
                    }
                    aqs aqsVar = (aqs) aqpVar;
                    if (cvgVar == cvg.a && aqsVar.c) {
                        long j13 = aqsVar.a;
                        java.util.List list5 = cvfVar.a;
                        int size10 = list5.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size10) {
                                r7 = r16;
                                break;
                            }
                            java.lang.Object obj4 = list5.get(i16);
                            if (((cvm) obj4).a == j13) {
                                r7 = obj4;
                                break;
                            }
                            i16++;
                        }
                        cvm cvmVar10 = (cvm) r7;
                        if (cvmVar10 != null && !cvmVar10.c()) {
                            cvmVar10.b();
                            aqsVar.b = true;
                        }
                    } else if (cvgVar == cvgVar2) {
                        long j14 = aqsVar.a;
                        java.util.List list6 = cvfVar.a;
                        int size11 = list6.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size11) {
                                r13 = r16;
                                break;
                            }
                            r13 = list6.get(i17);
                            if (((cvm) r13).a == j14) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        cvm cvmVar11 = (cvm) r13;
                        if (cvmVar11 != null) {
                            boolean z3 = aqsVar.b;
                            boolean z4 = cvmVar11.c() && !z3;
                            aqsVar.b = false;
                            if (defpackage.uu.t(cvmVar11)) {
                                int size12 = list6.size();
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= size12) {
                                        r6 = r16;
                                        break;
                                    }
                                    r6 = list6.get(i18);
                                    if (((cvm) r6).d) {
                                        break;
                                    } else {
                                        i18++;
                                    }
                                }
                                cvm cvmVar12 = (cvm) r6;
                                if (cvmVar12 == null) {
                                    if (z4 || !defpackage.uu.t(cvmVar11)) {
                                        i = 0;
                                        B();
                                    } else {
                                        float fA = ((defpackage.dgk) defpackage.cfo.G(this, defpackage.dfo.n)).a();
                                        defpackage.adb adbVar4 = this.q;
                                        i = 0;
                                        g().b(new aqw(arp.b((adbVar4 == null || (oqVar = (oq) adbVar4.d(cvmVar11.a)) == null) ? 0L : oqVar.d(defpackage.mni.bj(fA, fA))), false));
                                        this.b = false;
                                    }
                                    j();
                                } else {
                                    i = 0;
                                    aqsVar.a = cvmVar12.a;
                                }
                            } else {
                                i = 0;
                                if (z4) {
                                    B();
                                } else {
                                    X(z3 ? defpackage.mni.aM(cvmVar11.c, cvmVar11.g) : defpackage.uu.x(cvmVar11));
                                    cvmVar11.b();
                                }
                            }
                        }
                    }
                }
                if (cvgVar == cvgVar2) {
                    list = cvfVar.a;
                    size2 = list.size();
                    for (i3 = i; i3 < size2; i3++) {
                        cvmVar4 = (cvm) list.get(i3);
                        if (!defpackage.uu.t(cvmVar4) && (adbVar = this.q) != null) {
                            adbVar.h(cvmVar4.a);
                        }
                    }
                }
            }
            aqp aqpVar2 = aqpVar;
            java.util.List list7 = cvfVar.a;
            if (!list7.isEmpty()) {
                defpackage.aono aonoVar3 = arp.a;
                int size13 = list7.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size13) {
                        int size14 = list7.size();
                        for (int i20 = 0; i20 < size14; i20++) {
                            if (defpackage.uu.r((cvm) list7.get(i20))) {
                                int size15 = list7.size();
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= size15) {
                                        r10 = r16;
                                        break;
                                    }
                                    r10 = list7.get(i21);
                                    if (defpackage.uu.r((cvm) r10)) {
                                        break;
                                    } else {
                                        i21++;
                                    }
                                }
                                cvm cvmVar13 = (cvm) r10;
                                if (cvmVar13 == null) {
                                    break;
                                }
                                int i22 = aqpVar2.c;
                                int i23 = i22 - 1;
                                if (i22 == 0) {
                                    throw r16;
                                }
                                int i24 = 2;
                                if (i23 == 2) {
                                    i22 = !i() ? 1 : 2;
                                }
                                aqpVar2.c = i22;
                                if (cvgVar == cvg.a) {
                                    if (i22 == 2) {
                                        cvmVar13.b();
                                        z2 = true;
                                        aqpVar2.a = true;
                                    } else {
                                        z2 = true;
                                        i24 = i22;
                                    }
                                    aqpVar2.b = z2;
                                    i22 = i24;
                                } else {
                                    z2 = true;
                                }
                                if (cvgVar != cvgVar2) {
                                    break;
                                }
                                if (i22 != z2) {
                                    if (!aqpVar2.a) {
                                        break;
                                    }
                                    K(cvmVar13, cvmVar13, 0L);
                                    X(0L);
                                    cT(cvmVar13.a, z2);
                                    break;
                                }
                                G(this, cvmVar13, cvmVar13.a, 0L, 12);
                                break;
                            }
                        }
                        break;
                    }
                    cvm cvmVar14 = (cvm) list7.get(i19);
                    if (cvmVar14.d && !defpackage.uu.r(cvmVar14)) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            i = 0;
            if (cvgVar == cvgVar2) {
                list = cvfVar.a;
                size2 = list.size();
                while (i3 < size2) {
                    cvmVar4 = (cvm) list.get(i3);
                    if (!defpackage.uu.t(cvmVar4)) {
                    }
                }
            }
        }
    }

    @Override // defpackage.ddb
    public final /* synthetic */ void q() {
        n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(defpackage.aoln aolnVar) {
        arh arhVar;
        if (aolnVar instanceof arh) {
            arhVar = (arh) aolnVar;
            int i = arhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                arhVar.c = i - Integer.MIN_VALUE;
            } else {
                arhVar = new arh(this, aolnVar);
            }
        } else {
            arhVar = new arh(this, aolnVar);
        }
        java.lang.Object obj = arhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = arhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.avb avbVar = this.a;
            if (avbVar != null) {
                defpackage.kaw kawVar = this.H;
                if (kawVar != null) {
                    ava avaVar = new ava(avbVar);
                    arhVar.c = 1;
                    if (kawVar.av(avaVar, arhVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            cS(new aqw(0L, false));
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(obj);
        this.a = null;
        cS(new aqw(0L, false));
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(aqv aqvVar, defpackage.aoln aolnVar) {
        ari ariVar;
        defpackage.kaw kawVar;
        aqv aqvVar2;
        defpackage.avb avbVar;
        if (aolnVar instanceof ari) {
            ariVar = (ari) aolnVar;
            int i = ariVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ariVar.c = i - Integer.MIN_VALUE;
            } else {
                ariVar = new ari(this, aolnVar);
            }
        } else {
            ariVar = new ari(this, aolnVar);
        }
        java.lang.Object obj = ariVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ariVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aqvVar = ariVar.d;
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                avbVar = ariVar.e;
                aqvVar2 = ariVar.d;
                defpackage.aooc.af(obj);
            }
            this.a = avbVar;
            h(aqvVar2.a);
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        defpackage.avb avbVar2 = this.a;
        if (avbVar2 != null && (kawVar = this.H) != null) {
            ava avaVar = new ava(avbVar2);
            ariVar.d = aqvVar;
            ariVar.e = null;
            ariVar.c = 1;
            if (kawVar.av(avaVar, ariVar) == aoluVar) {
                return aoluVar;
            }
        }
        defpackage.avb avbVar3 = new defpackage.avb();
        defpackage.kaw kawVar2 = this.H;
        if (kawVar2 != null) {
            ariVar.d = aqvVar;
            ariVar.e = avbVar3;
            ariVar.c = 2;
            if (kawVar2.av(avbVar3, ariVar) == aoluVar) {
                return aoluVar;
            }
        }
        aqvVar2 = aqvVar;
        avbVar = avbVar3;
        this.a = avbVar;
        h(aqvVar2.a);
        return defpackage.aojh.a;
    }

    @Override // defpackage.cmv
    public final void u() {
        this.i = false;
        z();
        A();
        cV();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(aqw aqwVar, defpackage.aoln aolnVar) {
        arj arjVar;
        if (aolnVar instanceof arj) {
            arjVar = (arj) aolnVar;
            int i = arjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                arjVar.c = i - Integer.MIN_VALUE;
            } else {
                arjVar = new arj(this, aolnVar);
            }
        } else {
            arjVar = new arj(this, aolnVar);
        }
        java.lang.Object obj = arjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = arjVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.avb avbVar = this.a;
            if (avbVar != null) {
                defpackage.kaw kawVar = this.H;
                if (kawVar != null) {
                    avc avcVar = new avc(avbVar);
                    arjVar.d = aqwVar;
                    arjVar.c = 1;
                    if (kawVar.av(avcVar, arjVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            cS(aqwVar);
            return defpackage.aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aqwVar = arjVar.d;
        defpackage.aooc.af(obj);
        this.a = null;
        cS(aqwVar);
        return defpackage.aojh.a;
    }

    public final void z() {
        defpackage.avb avbVar = this.a;
        if (avbVar != null) {
            defpackage.kaw kawVar = this.H;
            if (kawVar != null) {
                kawVar.aw(new ava(avbVar));
            }
            this.a = null;
        }
    }

    @Override // defpackage.ddb
    public final /* synthetic */ void D() {
    }
}
