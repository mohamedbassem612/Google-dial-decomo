package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dce {
    public final defpackage.dbk a;
    public final defpackage.dcd b;
    public final defpackage.daz c;
    public defpackage.dck d;
    public final defpackage.cmv e;
    public defpackage.cmv f;
    public defpackage.adq g;
    public defpackage.adq h;
    public defpackage.adq i;
    private defpackage.dcc j;

    public dce(defpackage.dbk dbkVar) {
        this.a = dbkVar;
        defpackage.dcd dcdVar = new defpackage.dcd();
        dcdVar.v = -1;
        this.b = dcdVar;
        defpackage.daz dazVar = new defpackage.daz(dbkVar);
        this.c = dazVar;
        this.d = dazVar;
        defpackage.ddf ddfVar = dazVar.f;
        this.e = ddfVar;
        this.f = ddfVar;
        this.g = new defpackage.adq(16);
    }

    public static final defpackage.cmv k(defpackage.cmu cmuVar, defpackage.cmv cmvVar) {
        defpackage.cmv dajVar;
        if (cmuVar instanceof defpackage.dca) {
            dajVar = ((defpackage.dca) cmuVar).d();
            dajVar.u = defpackage.dcl.c(dajVar);
        } else {
            dajVar = new defpackage.daj(cmuVar);
        }
        if (dajVar.D) {
            defpackage.cwh.d("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        dajVar.A = true;
        defpackage.cmv cmvVar2 = cmvVar.x;
        if (cmvVar2 != null) {
            cmvVar2.w = dajVar;
            dajVar.x = cmvVar2;
        }
        cmvVar.x = dajVar;
        dajVar.w = cmvVar;
        return dajVar;
    }

    public static final defpackage.cmv l(defpackage.cmv cmvVar) {
        if (cmvVar.D) {
            defpackage.dcl.f(cmvVar);
            cmvVar.R();
            cmvVar.O();
        }
        defpackage.cmv cmvVar2 = cmvVar.x;
        defpackage.cmv cmvVar3 = cmvVar.w;
        if (cmvVar2 != null) {
            cmvVar2.w = cmvVar3;
            cmvVar.x = null;
        }
        if (cmvVar3 != null) {
            cmvVar3.x = cmvVar2;
            cmvVar.w = null;
        } else {
            defpackage.aooh.g();
        }
        return cmvVar3;
    }

    public static final void m(defpackage.cmu cmuVar, defpackage.cmu cmuVar2, defpackage.cmv cmvVar) {
        if ((cmuVar instanceof defpackage.dca) && (cmuVar2 instanceof defpackage.dca)) {
            defpackage.dca dcaVar = (defpackage.dca) cmuVar2;
            if (cmvVar == null) {
                defpackage.aooh.h("null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            }
            dcaVar.e(cmvVar);
            if (cmvVar.D) {
                defpackage.dcl.g(cmvVar);
                return;
            } else {
                cmvVar.B = true;
                return;
            }
        }
        if (!(cmvVar instanceof defpackage.daj)) {
            defpackage.cwh.d("Unknown Modifier.Node type");
            return;
        }
        defpackage.daj dajVar = (defpackage.daj) cmvVar;
        if (dajVar.D) {
            dajVar.z();
        }
        dajVar.a = cmuVar2;
        dajVar.u = defpackage.dcl.a(cmuVar2);
        if (dajVar.D) {
            dajVar.v(false);
        }
        if (cmvVar.D) {
            defpackage.dcl.g(cmvVar);
        } else {
            cmvVar.B = true;
        }
    }

    public final int a() {
        return this.f.v;
    }

    public final void b() {
        for (defpackage.cmv cmvVar = this.f; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.N();
        }
    }

    public final void c() {
        for (defpackage.cmv cmvVar = this.e; cmvVar != null; cmvVar = cmvVar.w) {
            if (cmvVar.D) {
                cmvVar.O();
            }
        }
    }

    public final void d(defpackage.cmv cmvVar, defpackage.dck dckVar) {
        for (defpackage.cmv cmvVar2 = cmvVar.w; cmvVar2 != null; cmvVar2 = cmvVar2.w) {
            if (cmvVar2 == this.b) {
                defpackage.dbk dbkVarK = this.a.k();
                dckVar.A = dbkVarK != null ? dbkVarK.o() : null;
                this.d = dckVar;
                return;
            } else {
                if ((cmvVar2.u & 2) != 0) {
                    return;
                }
                cmvVar2.T(dckVar);
            }
        }
    }

    public final void e() {
        for (defpackage.cmv cmvVar = this.f; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.Q();
            if (cmvVar.A) {
                defpackage.dcl.d(cmvVar);
            }
            if (cmvVar.B) {
                defpackage.dcl.g(cmvVar);
            }
            cmvVar.A = false;
            cmvVar.B = false;
        }
    }

    public final void f() {
        for (defpackage.cmv cmvVar = this.e; cmvVar != null; cmvVar = cmvVar.w) {
            if (cmvVar.D) {
                cmvVar.R();
            }
        }
    }

    public final void g() {
        int i = 0;
        for (defpackage.cmv cmvVar = this.e.w; cmvVar != null && cmvVar != this.b; cmvVar = cmvVar.w) {
            i |= cmvVar.u;
            cmvVar.v = i;
        }
    }

    public final void h() {
        defpackage.dbg dbgVar;
        defpackage.dck dckVar = this.c;
        for (defpackage.cmv cmvVar = this.e.w; cmvVar != null; cmvVar = cmvVar.w) {
            defpackage.dbd dbdVarZ = defpackage.cfo.z(cmvVar);
            if (dbdVarZ != null) {
                defpackage.dck dckVar2 = cmvVar.z;
                if (dckVar2 != null) {
                    dbgVar = (defpackage.dbg) dckVar2;
                    defpackage.dbd dbdVar = dbgVar.f;
                    dbgVar.I(dbdVarZ);
                    if (dbdVar != cmvVar) {
                        dbgVar.ao();
                    }
                } else {
                    defpackage.dbg dbgVar2 = new defpackage.dbg(this.a, dbdVarZ);
                    cmvVar.T(dbgVar2);
                    dbgVar = dbgVar2;
                }
                dckVar.A = dbgVar;
                dbgVar.z = dckVar;
                dckVar = dbgVar;
            } else {
                cmvVar.T(dckVar);
            }
        }
        defpackage.dbk dbkVarK = this.a.k();
        dckVar.A = dbkVarK != null ? dbkVarK.o() : null;
        this.d = dckVar;
    }

    public final boolean i(int i) {
        return (a() & i) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x011c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:71:0x0172
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void j(int r31, defpackage.adq r32, defpackage.adq r33, defpackage.cmv r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dce.j(int, adq, adq, cmv, boolean):void");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        defpackage.cmv cmvVar = this.f;
        defpackage.cmv cmvVar2 = this.e;
        if (cmvVar == cmvVar2) {
            sb.append(']');
        } else {
            while (cmvVar != null && cmvVar != cmvVar2) {
                sb.append(cmvVar.toString());
                if (cmvVar.x == cmvVar2) {
                    sb.append(']');
                    break;
                }
                sb.append(',');
                cmvVar = cmvVar.x;
            }
        }
        return sb.toString();
    }
}
