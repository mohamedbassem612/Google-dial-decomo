package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bjn extends defpackage.cmv implements defpackage.dbd, defpackage.dat, defpackage.ddc {
    public defpackage.dji a;
    public defpackage.dkz b;
    public defpackage.dnx c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public defpackage.aonj h;
    public bjm i;
    public defpackage.gat j;
    private defpackage.aonj k;
    private java.util.List l;
    private defpackage.aonj m;
    private bjf n;
    private java.util.Map o;
    private defpackage.bjb p;
    private defpackage.aonj q;

    public bjn(defpackage.dji djiVar, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, defpackage.aonj aonjVar, int i, boolean z, int i2, int i3, java.util.List list, defpackage.aonj aonjVar2, bjf bjfVar, defpackage.aonj aonjVar3) {
        this.a = djiVar;
        this.b = dkzVar;
        this.j = gatVar;
        this.c = dnxVar;
        this.k = aonjVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.l = list;
        this.m = aonjVar2;
        this.n = bjfVar;
        this.h = aonjVar3;
    }

    private final defpackage.bjb s(defpackage.dpf dpfVar) {
        defpackage.bjb bjbVar;
        bjm bjmVar = this.i;
        if (bjmVar != null && bjmVar.c && (bjbVar = bjmVar.d) != null) {
            bjbVar.h(dpfVar);
            return bjbVar;
        }
        defpackage.bjb bjbVarD = d();
        bjbVarD.h(dpfVar);
        return bjbVarD;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        defpackage.aonj afzVar = this.q;
        int i = 19;
        if (afzVar == null) {
            afzVar = new defpackage.afz(this, i);
            this.q = afzVar;
        }
        defpackage.dji djiVar = this.a;
        defpackage.dip dipVar = defpackage.din.D;
        java.util.List listSingletonList = java.util.Collections.singletonList(djiVar);
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        diqVar.a(dipVar, listSingletonList);
        bjm bjmVar = this.i;
        if (bjmVar != null) {
            diqVar.a(defpackage.din.E, bjmVar.b);
            diqVar.a(defpackage.din.F, java.lang.Boolean.valueOf(bjmVar.c));
        }
        diqVar.a(defpackage.did.l, new defpackage.dhr(null, new defpackage.afz(this, 20)));
        diqVar.a(defpackage.did.m, new defpackage.dhr(null, new defpackage.bjp(this, 1)));
        diqVar.a(defpackage.did.n, new defpackage.dhr(null, new defpackage.ml(this, i)));
        diqVar.a(defpackage.did.a, new defpackage.dhr(null, afzVar));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007e A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:3:0x0005, B:5:0x0017, B:6:0x001b, B:8:0x0020, B:10:0x0024, B:12:0x002e, B:14:0x0034, B:16:0x003a, B:18:0x0044, B:20:0x004e, B:22:0x0059, B:24:0x005d, B:26:0x0061, B:27:0x0064, B:35:0x008a, B:37:0x0097, B:39:0x00a3, B:40:0x00a6, B:42:0x00aa, B:44:0x00b0, B:46:0x00be, B:48:0x00c6, B:49:0x00cd, B:50:0x00d7, B:52:0x00db, B:53:0x00e0, B:54:0x0100, B:56:0x0104, B:57:0x0109, B:59:0x0123, B:60:0x0126, B:30:0x006e, B:32:0x0072, B:33:0x0075, B:34:0x007e), top: B:66:0x0005 }] */
    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        android.os.Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            defpackage.bjb bjbVarS = s(cyiVar);
            defpackage.dpq dpqVarP = cyiVar.p();
            bjbVarS.g(3L);
            boolean z = true;
            if (bjbVarS.a > 1) {
                j = bjbVarS.b(j, dpqVarP);
            }
            defpackage.dkw dkwVar = bjbVarS.c;
            if (dkwVar == null || bjbVarS.d) {
                bjbVarS.c = bjbVarS.f(dpqVarP, j, bjbVarS.c(j, dpqVarP));
                bjbVarS.d = false;
            } else {
                defpackage.djy djyVar = dkwVar.b;
                if (djyVar.a.c()) {
                    bjbVarS.c = bjbVarS.f(dpqVarP, j, bjbVarS.c(j, dpqVarP));
                    bjbVarS.d = false;
                } else {
                    defpackage.dkv dkvVar = dkwVar.a;
                    if (dpqVarP == dkvVar.h) {
                        long j2 = dkvVar.j;
                        if (j == j2 || (defpackage.dpd.b(j) == defpackage.dpd.b(j2) && defpackage.dpd.d(j) == defpackage.dpd.d(j2) && defpackage.dpd.a(j) >= djyVar.e && !djyVar.c)) {
                            defpackage.dkw dkwVar2 = bjbVarS.c;
                            if (dkwVar2 == null) {
                                defpackage.aooh.g();
                            }
                            if (j == dkwVar2.a.j) {
                                z = false;
                            } else {
                                defpackage.dkw dkwVar3 = bjbVarS.c;
                                if (dkwVar3 == null) {
                                    defpackage.aooh.g();
                                }
                                bjbVarS.c = bjbVarS.f(dpqVarP, j, dkwVar3.b);
                            }
                        } else {
                            bjbVarS.c = bjbVarS.f(dpqVarP, j, bjbVarS.c(j, dpqVarP));
                            bjbVarS.d = false;
                        }
                    } else {
                        bjbVarS.c = bjbVarS.f(dpqVarP, j, bjbVarS.c(j, dpqVarP));
                        bjbVarS.d = false;
                    }
                }
            }
            defpackage.dkw dkwVarE = bjbVarS.e();
            dkwVarE.b.a.c();
            if (z) {
                defpackage.cfo.B(this, 2).am();
                defpackage.aonj aonjVar = this.k;
                if (aonjVar != null) {
                    aonjVar.a(dkwVarE);
                }
                bjf bjfVar = this.n;
                if (bjfVar != null) {
                    defpackage.dkw dkwVar4 = bjfVar.c.c;
                    if (dkwVar4 != null && !defpackage.aooh.n(dkwVar4.a.a, dkwVarE.a.a)) {
                        blz blzVar = bjfVar.f;
                        long j3 = bjfVar.a;
                        defpackage.aonj aonjVar2 = blzVar.i;
                        if (aonjVar2 != null) {
                            aonjVar2.a(java.lang.Long.valueOf(j3));
                        }
                    }
                    bjfVar.c = bjk.a(bjfVar.c, (defpackage.cxi) null, dkwVarE, (defpackage.bek) null, 5);
                }
                java.util.Map linkedHashMap = this.o;
                if (linkedHashMap == null) {
                    linkedHashMap = new java.util.LinkedHashMap(2);
                }
                linkedHashMap.put(defpackage.cwn.a, java.lang.Integer.valueOf(java.lang.Math.round(dkwVarE.d)));
                linkedHashMap.put(defpackage.cwn.b, java.lang.Integer.valueOf(java.lang.Math.round(dkwVarE.e)));
                this.o = linkedHashMap;
            }
            defpackage.aonj aonjVar3 = this.m;
            if (aonjVar3 != null) {
                aonjVar3.a(dkwVarE.f);
            }
            long j4 = dkwVarE.c;
            long j5 = j4 >> 32;
            int i = (int) (j4 & 4294967295L);
            int i2 = (int) j5;
            defpackage.czc czcVarV = cydVar.v(defpackage.dpe.k(i2, i2, i, i));
            java.util.Map map = this.o;
            if (map == null) {
                defpackage.aooh.g();
            }
            return cyiVar.du(i2, i, map, new defpackage.afz(czcVarV, 18));
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final defpackage.bjb d() {
        defpackage.bjb bjbVar = this.p;
        if (bjbVar == null) {
            bjbVar = new defpackage.bjb(this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.l);
            this.p = bjbVar;
        }
        if (bjbVar == null) {
            defpackage.aooh.g();
        }
        return bjbVar;
    }

    @Override // defpackage.dbd
    public final int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return s(cxfVar).a(i, cxfVar.p());
    }

    @Override // defpackage.dbd
    public final int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(s(cxfVar).d(cxfVar.p()).a()));
    }

    public final void g() {
        this.i = null;
    }

    public final void h(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            d().i(this.a, this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.l);
        }
        if (this.D) {
            if (z2 || (z && this.q != null)) {
                defpackage.cfo.A(this).I();
            }
            if (z2 || z3 || z4) {
                defpackage.cfo.A(this).H();
                defpackage.cfo.w(this);
            }
            if (z) {
                defpackage.cfo.w(this);
            }
        }
    }

    @Override // defpackage.dbd
    public final int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return s(cxfVar).a(i, cxfVar.p());
    }

    @Override // defpackage.dbd
    public final int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        return java.lang.Math.round((float) java.lang.Math.ceil(((java.lang.Number) s(cxfVar).d(cxfVar.p()).c.a()).floatValue()));
    }

    public final void k() {
        defpackage.cfo.A(this).I();
        defpackage.cfo.A(this).H();
        defpackage.cfo.w(this);
    }

    public final boolean n(defpackage.aonj aonjVar, defpackage.aonj aonjVar2, bjf bjfVar, defpackage.aonj aonjVar3) {
        boolean z;
        if (this.k != aonjVar) {
            this.k = aonjVar;
            z = true;
        } else {
            z = false;
        }
        if (this.m != aonjVar2) {
            this.m = aonjVar2;
            z = true;
        }
        if (!defpackage.aooh.n(this.n, bjfVar)) {
            this.n = bjfVar;
            z = true;
        }
        if (this.h == aonjVar3) {
            return z;
        }
        this.h = aonjVar3;
        return true;
    }

    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v3 ??, new type: crb
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // defpackage.dat
    public final void o(defpackage.dbm r22) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjn.o(dbm):void");
    }

    public final boolean p(defpackage.dji djiVar) {
        boolean zN = defpackage.aooh.n(this.a.c, djiVar.c);
        boolean zN2 = defpackage.aooh.n(this.a.b, djiVar.b);
        boolean z = true;
        if (zN && zN2) {
            z = false;
        }
        if (z) {
            this.a = djiVar;
        }
        if (!zN) {
            g();
        }
        return z;
    }

    public final boolean q(defpackage.dkz dkzVar) {
        return !dkzVar.w(this.b);
    }

    public final boolean r(defpackage.dkz dkzVar, java.util.List list, int i, int i2, boolean z, defpackage.gat gatVar, defpackage.dnx dnxVar, int i3) {
        boolean z2 = !this.b.x(dkzVar);
        this.b = dkzVar;
        if (!defpackage.aooh.n(this.l, list)) {
            this.l = list;
            z2 = true;
        }
        if (this.g != i) {
            this.g = i;
            z2 = true;
        }
        if (this.f != i2) {
            this.f = i2;
            z2 = true;
        }
        if (this.e != z) {
            this.e = z;
            z2 = true;
        }
        if (!defpackage.aooh.n(this.j, gatVar)) {
            this.j = gatVar;
            z2 = true;
        }
        if (!defpackage.aooh.n(this.c, dnxVar)) {
            this.c = dnxVar;
            z2 = true;
        }
        if (this.d == i3) {
            return z2;
        }
        this.d = i3;
        return true;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }
}
