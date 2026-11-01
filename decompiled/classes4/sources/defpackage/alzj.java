package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzj implements defpackage.allg {
    public alln a;
    private final defpackage.allj b;
    private aify c;
    private int d;

    public alzj(defpackage.alli alliVar) {
        this.b = alliVar.a(defpackage.allh.u.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return new aile(defpackage.alnb.EVENT_FLOW_OUTPUT);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.ordinal() == 4) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnf.k;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alsy alsyVarB = defpackage.alsy.b(((defpackage.alnf) objJ).g);
            if (alsyVarB == null) {
                alsyVarB = defpackage.alsy.NO_ACTION;
            }
            if (alsyVarB.equals(defpackage.alsy.START_RINGING)) {
                int i = this.d;
                int i2 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    defpackage.allj alljVar = this.b;
                    akzz akzzVarM = defpackage.almz.a.m();
                    defpackage.alnb alnbVar = defpackage.alnb.EVENT_QUICK_REPLY_CHIPS_READY;
                    akzzVarM.u();
                    defpackage.almz almzVar3 = akzzVarM.b;
                    almzVar3.c = alnbVar.aN;
                    almzVar3.b |= 1;
                    apdi apdiVar2 = defpackage.alog.b;
                    akzx akzxVarM = defpackage.alsl.a.m();
                    java.lang.Iterable iterable = (java.lang.Iterable) j$.util.Collection.-EL.stream(this.c).map(new defpackage.alyy(this, 7)).collect(aido.a);
                    akzxVarM.u();
                    defpackage.alsl alslVar = (defpackage.alsl) akzxVarM.b;
                    alslVar.b();
                    akyl.i(iterable, alslVar.b);
                    akzzVarM.bV(apdiVar2, (defpackage.alsl) akzxVarM.p());
                    alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
                }
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.a = alln.g(alqdVar, almbVar.f, alkfVar);
        java.lang.String str = alqhVar.b;
        apdi apdiVar = defpackage.alyb.n;
        almlVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alyb alybVar = (defpackage.alyb) objJ;
        defpackage.alxd alxdVar = alybVar.c == 6 ? (defpackage.alxd) alybVar.d : defpackage.alxd.a;
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(str.isEmpty() ? alxdVar.c : alxdVar.b).map(new defpackage.alyz(8)).collect(aido.a);
        this.c = aifyVar;
        int i = 1;
        if (!aifyVar.isEmpty()) {
            apdi apdiVar2 = defpackage.alwn.r;
            alqkVar.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            int iAe = a.ae(((defpackage.alwn) objJ2).j);
            if (iAe != 0 && iAe == 2) {
                i = 2;
            }
        }
        this.d = i;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
