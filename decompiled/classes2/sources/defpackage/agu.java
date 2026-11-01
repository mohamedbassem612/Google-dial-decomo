package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agu extends cmv implements cwq, dat, dad, dcp, dan {
    public cpn a;
    public aiv b;
    public cpn c;
    public boolean d;
    public defpackage.agy e;
    private ahc f;
    private final dac g;

    public agu(defpackage.agy agyVar) {
        this.e = agyVar;
        this.g = wl.g(new aoiu(defpackage.agw.a, agyVar));
    }

    private final void x(cso csoVar) {
        cso csoVarG = this.e.g();
        if (aooh.n(csoVar, csoVarG)) {
            return;
        }
        if (csoVarG != null) {
            cfo.H(this).k(csoVarG);
        }
        this.e.l(csoVar);
    }

    private static final void y(dbm dbmVar, cso csoVar) {
        if (csoVar == null) {
            dbmVar.D();
            return;
        }
        agb agbVar = new agb(dbmVar, 5);
        csoVar.g(dbmVar.q().c(), dbmVar.q().d(), dpy.k(dbmVar.o()), new afx(dbmVar, dbmVar.a, agbVar, 14, (short[]) null));
    }

    public final /* synthetic */ int a(defpackage.cwo cwoVar, cxe cxeVar, int i) {
        return cwh.f(this, cwoVar, cxeVar, i);
    }

    public final dac cN() {
        return this.g;
    }

    public final cyf cX(cyi cyiVar, cyd cydVar, long j) {
        czc czcVarV = cydVar.v(j);
        return den.z(cyiVar, czcVarV.a, czcVarV.b, new nz(czcVarV, this, 7, (byte[]) null));
    }

    public final void cZ() {
        this.c = null;
        x(null);
    }

    public final /* synthetic */ int d(defpackage.cwo cwoVar, cxe cxeVar, int i) {
        return cwh.g(this, cwoVar, cxeVar, i);
    }

    public final void dc() {
        w();
        this.e.k(true);
        v();
    }

    public final /* synthetic */ int e(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.f(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int f(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.g(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int g(defpackage.cwo cwoVar, cxe cxeVar, int i) {
        return cwh.h(this, cwoVar, cxeVar, i);
    }

    public final /* synthetic */ int h(defpackage.cwo cwoVar, cxe cxeVar, int i) {
        return cwh.i(this, cwoVar, cxeVar, i);
    }

    public final /* synthetic */ int i(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.h(this, cxfVar, cxeVar, i);
    }

    public final /* synthetic */ int j(cxf cxfVar, cxe cxeVar, int i) {
        return defpackage.wo.i(this, cxfVar, cxeVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    public final cyf k(defpackage.cwr cwrVar, cyd cydVar, long j) {
        char c;
        long j2;
        long jL;
        long jH;
        int i;
        cpn cpnVarB;
        cxi cxiVar;
        float f;
        if (r().a().h() == null || (cpnVarB = r().a().b()) == null) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            ahc ahcVarF = this.e.f();
            if (ahcVarF == null || !ahcVarF.j()) {
                c = ' ';
                j2 = 4294967295L;
                this.e.i = false;
            } else if (this.e.i || (cxiVar = ahcVarF.c) == null || !cxiVar.u() || !t().u()) {
                c = ' ';
                j2 = 4294967295L;
            } else {
                float f2 = ahcVarF.i;
                long jA = defpackage.agw.a(cxiVar, t(), ahcVarF.g);
                long jB = defpackage.agw.b(cpnVarB.d(), jA, f2);
                defpackage.agu aguVar = this.e.m;
                boolean z = !this.e.o() && (aguVar != null ? aguVar.s() : null) == ahcVarF;
                if (true == z) {
                    f2 = 1.0f;
                }
                j2 = 4294967295L;
                float f3 = cpnVarB.d;
                c = ' ';
                float f4 = cpnVarB.b;
                int i2 = (int) (jB >> 32);
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2) + ((f3 - f4) * f2);
                float f5 = cpnVarB.e;
                float f6 = cpnVarB.c;
                int i3 = (int) (jB & 4294967295L);
                this.a = new cpn(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3), fIntBitsToFloat, java.lang.Float.intBitsToFloat(i3) + ((f5 - f6) * f2));
                if (z) {
                    this.b = null;
                } else {
                    ais aisVar = ahcVarF.t;
                    float f7 = 0.0f;
                    float f8 = aisVar != null ? aisVar.a : 0.0f;
                    ait aitVar = ahcVarF.u;
                    if (aitVar != null) {
                        float f9 = aitVar.a;
                        float f10 = aitVar.b;
                        f = f9;
                        f7 = f10;
                    } else {
                        f = 0.0f;
                    }
                    int i4 = (int) (jA >> 32);
                    int i5 = (int) (jA & 4294967295L);
                    this.b = new aiv(((f4 - java.lang.Float.intBitsToFloat(i4)) * f8) + f, ((f6 - java.lang.Float.intBitsToFloat(i5)) * f8) + f7, ((f3 - java.lang.Float.intBitsToFloat(i4)) * f8) + f, ((f5 - java.lang.Float.intBitsToFloat(i5)) * f8) + f7);
                }
                this.e.i = true;
            }
        }
        cpn cpnVarB2 = this.a;
        if (cpnVarB2 == null && (cpnVarB2 = q().b()) == null) {
            defpackage.aho ahoVar = r().c;
            ahoVar.d();
            cpnVarB2 = ahoVar.a().c(ahoVar.a);
        }
        if (cpnVarB2 != null) {
            long j3 = dpy.j(cpnVarB2.c());
            long j4 = j3 >> c;
            long j5 = j3 & j2;
            int i6 = (int) j4;
            if (i6 == Integer.MAX_VALUE || (i = (int) j5) == Integer.MAX_VALUE) {
                throw new java.lang.IllegalArgumentException("Error: Infinite width/height is invalid. animated bounds: " + q().b() + ", current bounds: " + r().a().b());
            }
            jL = dpe.l(aooc.t(i6, 0), aooc.t(i, 0));
        } else {
            jL = j;
        }
        final czc czcVarV = cydVar.v(jL);
        if (r().a().i()) {
            defpackage.ahg ahgVar = (defpackage.ahg) this.e.e.a();
            jH = this.e.e().b.de(cfo.y(this)).h();
            ahgVar.a();
        } else {
            jH = (((long) czcVarV.b) & j2) | (((long) czcVarV.a) << c);
        }
        return den.z(cwrVar, (int) (jH >> c), (int) (jH & j2), new aonj() { // from class: agt
            public final java.lang.Object a(java.lang.Object obj) {
                long j6;
                long jB2;
                cpn cpnVarX;
                defpackage.agu aguVar2 = this.a;
                czb czbVar = (czb) obj;
                aguVar2.d = true;
                cpm cpmVar = null;
                aguVar2.c = null;
                defpackage.ahn ahnVarA = aguVar2.r().a();
                boolean zR = aguVar2.e.r();
                czc czcVar = czcVarV;
                if (zR && ahnVarA.i()) {
                    defpackage.bhm bhmVarH = ahnVarA.h();
                    if (bhmVarH == null) {
                        java.util.Objects.toString(ahnVarA);
                        throw new java.lang.IllegalArgumentException("Match State is configured, but target data is null. State = ".concat(java.lang.String.valueOf(ahnVarA)));
                    }
                    cpn cpnVarB3 = ahnVarA.b();
                    if (cpnVarB3 == null) {
                        java.util.Objects.toString(ahnVarA);
                        throw new java.lang.IllegalArgumentException("Match State is configured, but current bounds is null. State = ".concat(java.lang.String.valueOf(ahnVarA)));
                    }
                    long jL2 = 0;
                    if (aguVar2.r().b.i()) {
                        cxi cxiVarO = czbVar.o();
                        if (cxiVarO == null) {
                            czbVar.s(czcVar, 0, 0, 0.0f);
                        } else {
                            boolean zE = aguVar2.r().a().e();
                            long jI = aguVar2.t().i(cxiVarO, 0L);
                            wl.c(bhmVarH);
                            if (zE) {
                                j6 = jI;
                                aguVar2.q().c(cpnVarB3, wl.c(bhmVarH), null, aguVar2.a, aguVar2.b);
                            } else {
                                j6 = jI;
                                aguVar2.q().c(cpnVarB3, wl.c(bhmVarH), new defpackage.ahd(1), aguVar2.a, aguVar2.b);
                            }
                            aguVar2.a = null;
                            aguVar2.b = null;
                            cpn cpnVarB4 = aguVar2.q().b();
                            cpm cpmVar2 = cpnVarB4 != null ? new cpm(mni.bl(mni.aM(cpnVarB4.d(), bhmVarH.c()), bhmVarH.b())) : null;
                            if (aguVar2.q().e() || !zE) {
                                if (cpmVar2 != null) {
                                    jB2 = cpmVar2.a;
                                    cpmVar = cpmVar2;
                                } else {
                                    jB2 = j6;
                                }
                                if (cpmVar == null) {
                                    cpnVarX = cdh.x(j6, dpy.l(cxiVarO.h()));
                                } else {
                                    cpnVarX = cdh.x(cpmVar.a, cpnVarB4.c());
                                }
                                aguVar2.r().a().d(cpnVarX);
                            } else {
                                jB2 = cpmVar2 != null ? cpmVar2.a : cpnVarB3.d();
                            }
                            ahc ahcVarF2 = aguVar2.e.f();
                            if (ahcVarF2 != null && ahcVarF2.k()) {
                                if (true == aguVar2.q().f()) {
                                    j6 = jB2;
                                }
                                cxi cxiVar2 = ahcVarF2.c;
                                if (cxiVar2 != null && cxiVar2.u() && aguVar2.t().u()) {
                                    jB2 = defpackage.agw.b(jB2, defpackage.agw.a(cxiVar2, aguVar2.t(), ahcVarF2.b()), ahcVarF2.a());
                                } else {
                                    jB2 = j6;
                                }
                            }
                            long jI2 = cxiVarO.i(aguVar2.t(), jB2);
                            czbVar.s(czcVar, java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jI2 >> 32))), java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (jI2 & 4294967295L))), 0.0f);
                        }
                    } else if (aguVar2.q().e()) {
                        czbVar.s(czcVar, 0, 0, 0.0f);
                    } else {
                        cxi cxiVarO2 = czbVar.o();
                        if (cxiVarO2 != null) {
                            jL2 = dfd.l(mni.aM(cpnVarB3.d(), aguVar2.t().i(cxiVarO2, 0L)));
                        }
                        czbVar.s(czcVar, dpn.a(jL2), dpn.b(jL2), 0.0f);
                    }
                } else {
                    czbVar.s(czcVar, 0, 0, 0.0f);
                }
                return aojh.a;
            }
        });
    }

    public final boolean n(long j) {
        return this.e.r() && r().f() && r().b.i();
    }

    public final void o(dbm dbmVar) {
        cpn cpnVarB = r().a().b();
        if (!this.e.o()) {
            x(null);
            if (this.e.p()) {
                y(dbmVar, null);
                return;
            }
            return;
        }
        if (cpnVarB != null) {
            izg izgVarS = this.e.s();
            cfo.D(this);
            defpackage.agy agyVar = izgVarS.x().j;
            izg izgVarS2 = agyVar != null ? agyVar.s() : null;
            if (izgVarS2 != null) {
                izgVarS2.x();
            }
        }
        if (this.e.g() == null) {
            x(cfo.H(this).i());
        }
        cso csoVarG = this.e.g();
        if (csoVarG == null) {
            throw new java.lang.IllegalStateException("Error: shared element does not have a layer for rendering in the overlay.");
        }
        y(dbmVar, csoVarG);
        if (this.e.p()) {
            den.H(dbmVar, csoVarG);
        }
    }

    public final /* synthetic */ boolean p(czb czbVar) {
        return false;
    }

    public final defpackage.afg q() {
        return this.e.d();
    }

    public final defpackage.agx r() {
        return this.e.e();
    }

    public final ahc s() {
        if (!((cmv) this).D) {
            return null;
        }
        ahc ahcVar = this.f;
        if (ahcVar == null) {
            ahcVar = (ahc) wl.h(this, afq.a);
            this.f = ahcVar;
        }
        return ahcVar;
    }

    public final cxi t() {
        return r().b.d();
    }

    public final void u() {
        this.f = null;
        cxi cxiVar = r().b.b;
        if (cxiVar != null) {
            this.c = (cxiVar.u() && this.d) ? cdh.x(mni.aM(cfo.y(this).k(0L), cxiVar.k(0L)), dpy.l(cfo.y(this).h())) : null;
        }
        x(null);
        this.e.m(null);
        defpackage.agy agyVar = this.e;
        agyVar.m = null;
        agyVar.k(false);
        this.d = false;
    }

    public final void v() {
        r().d();
        den.u(this, this.e.k);
    }

    public final void w() {
        defpackage.oq oqVar = defpackage.agw.a;
        wl.i(this, oqVar, this.e);
        this.e.m((defpackage.agy) wl.h(this, oqVar));
        x(null);
        this.d = false;
        this.e.m = this;
    }

    public final /* synthetic */ void m() {
    }
}
