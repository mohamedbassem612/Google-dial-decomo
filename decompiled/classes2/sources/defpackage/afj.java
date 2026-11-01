package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afj extends cmv implements cwq, dan, dat {
    public cyb a;
    public defpackage.afk b;
    public aonn c;
    public boolean d = false;
    private boolean f = true;
    public final defpackage.afl e = new defpackage.afl();

    public afj(cyb cybVar, defpackage.afk afkVar, aonn aonnVar) {
        this.a = cybVar;
        this.b = afkVar;
        this.c = aonnVar;
    }

    public final /* synthetic */ int a(defpackage.cwo cwoVar, cxe cxeVar, int i) {
        return cwh.f(this, cwoVar, cxeVar, i);
    }

    public final /* synthetic */ cyf cX(cyi cyiVar, cyd cydVar, long j) {
        czc czcVarV = cydVar.v(j);
        return cyiVar.du(czcVarV.a, czcVarV.b, aokd.a, new clc(czcVarV, 15));
    }

    public final /* synthetic */ int d(defpackage.cwo cwoVar, cxe cxeVar, int i) {
        return cwh.g(this, cwoVar, cxeVar, i);
    }

    public final void dc() {
        this.f = true;
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

    public final cyf k(defpackage.cwr cwrVar, cyd cydVar, long j) {
        defpackage.afl aflVar = this.e;
        long jC = aflVar.f;
        if (jC == 9205357640488583168L) {
            jC = dpy.l(cwrVar.s());
        }
        cpn cpnVarB = aflVar.b();
        if (cpnVarB != null) {
            jC = cpnVarB.c();
        }
        long j2 = dpy.j(jC);
        long j3 = ((dpd) this.c.a(new dpp(j2), new dpd(j))).a;
        czc czcVarV = cydVar.v(j3);
        long jD = dpe.d(j3, j2);
        return den.z(cwrVar, (int) (jD >> 32), (int) (jD & 4294967295L), new nz(this, czcVarV, 2));
    }

    public final boolean n(long j) {
        defpackage.afl aflVar = this.e;
        long jL = dpy.l(j);
        if (aflVar.b != 9205357640488583168L && !anty.ah(dpy.j(jL), dpy.j(aflVar.b))) {
            aflVar.d = true;
        }
        aflVar.b = jL;
        if (aflVar.f == 9205357640488583168L) {
            aflVar.f = jL;
        }
        return !aflVar.c();
    }

    public final void o(dbm dbmVar) {
        dbmVar.D();
    }

    public final boolean p(czb czbVar) {
        long j;
        cpn cpnVar;
        cyb cybVar = this.a;
        aoss aossVarM = M();
        boolean z = this.f;
        defpackage.afk afkVar = this.b;
        cxi cxiVarO = czbVar.o();
        if (cxiVarO != null) {
            defpackage.afl aflVar = this.e;
            cxi cxiVarDd = cybVar.dd(czbVar);
            long jAM = 0;
            if (z) {
                java.util.List arrayList = aflVar.h;
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                cxi cxiVarR = cxiVarO;
                int i = 0;
                while (!aooh.n(cybVar.de(cxiVarR), cxiVarDd)) {
                    if (cxiVarR.t()) {
                        if (arrayList.size() == i) {
                            arrayList.add(cxiVarR);
                            jAM = mni.bl(jAM, den.D(cxiVarR));
                        } else if (!aooh.n(arrayList.get(i), cxiVarR)) {
                            long jAM2 = mni.aM(jAM, den.D((cxi) arrayList.get(i)));
                            arrayList.set(i, cxiVarR);
                            jAM = mni.bl(jAM2, den.D(cxiVarR));
                        }
                        i++;
                    }
                    cxiVarR = cxiVarR.r();
                    if (cxiVarR == null) {
                        break;
                    }
                }
                int size = arrayList.size() - 1;
                if (i <= size) {
                    while (true) {
                        jAM = mni.aM(jAM, den.D((cxi) arrayList.get(size)));
                        arrayList.remove(arrayList.size() - 1);
                        if (size == i) {
                            break;
                        }
                        size--;
                    }
                }
                aflVar.h = arrayList;
            }
            aflVar.i = mni.bl(aflVar.i, jAM);
            long jBl = mni.bl(cybVar.df(cxiVarDd, cxiVarO, false), aflVar.i);
            if ((aflVar.c & 9223372034707292159L) != 9205357640488583168L) {
                j = 9223372034707292159L;
                if (!anty.ah(dfd.l(jBl), dfd.l(aflVar.c))) {
                    aflVar.d = true;
                }
            } else {
                j = 9223372034707292159L;
            }
            aflVar.c = jBl;
            if ((aflVar.e & j) == 9205357640488583168L) {
                aflVar.e = jBl;
            }
            if ((jBl & j) != 9205357640488583168L) {
                long j2 = aflVar.b;
                if (j2 != 9205357640488583168L) {
                    cpn cpnVarX = cdh.x(jBl, j2);
                    aii aiiVar = aflVar.a;
                    if (aiiVar == null) {
                        aiiVar = new aii(cpnVarX, alo.i, (java.lang.Object) null, "Animatable");
                    }
                    aii aiiVar2 = aiiVar;
                    aflVar.a = aiiVar2;
                    if (aflVar.d) {
                        aflVar.d = false;
                        aoov.an(aossVarM, (aolr) null, 4, new defpackage.blv(aiiVar2, cpnVarX, afkVar, aflVar, (aoln) null, 1), 1);
                    }
                }
            }
            aii aiiVar3 = aflVar.a;
            if (aiiVar3 == null || (cpnVar = (cpn) aiiVar3.d()) == null) {
                cpnVar = cpn.a;
            }
            aflVar.g.b(cpnVar.g(aflVar.i ^ (-9223372034707292160L)));
        }
        this.f = false;
        return !this.e.c();
    }

    public final /* synthetic */ void m() {
    }
}
