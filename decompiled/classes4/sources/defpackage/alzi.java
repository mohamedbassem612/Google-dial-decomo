package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzi implements defpackage.allg {
    private final defpackage.allj a;
    private alln b;
    private final defpackage.allu c;

    public alzi(defpackage.alli alliVar, defpackage.allu alluVar) {
        this.a = alliVar.a(defpackage.allh.p.name());
        this.c = alluVar;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.r(defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT, defpackage.alnb.EVENT_END_SAY_TIMING);
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
        if (alnbVarB.equals(defpackage.alnb.EVENT_END_SAY_TIMING)) {
            this.c.c();
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB2.equals(defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT)) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnf.k;
            almzVar3.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar3).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alnf alnfVar = (defpackage.alnf) objJ;
            if (alnfVar.c == 12) {
                akzx akzxVarM = defpackage.alyf.a.m();
                alat alatVar = (alnfVar.c == 12 ? (defpackage.alob) alnfVar.d : defpackage.alob.a).b;
                akzxVarM.u();
                defpackage.alyf alyfVar = (defpackage.alyf) akzxVarM.b;
                alyfVar.b();
                akyl.i(alatVar, alyfVar.c);
                if ((alnfVar.b & 4) != 0) {
                    defpackage.almm almmVar = alnfVar.i;
                    if (almmVar == null) {
                        almmVar = defpackage.almm.a;
                    }
                    java.lang.String str = almmVar.c;
                    akzxVarM.u();
                    defpackage.alyf alyfVar2 = (defpackage.alyf) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str);
                    alyfVar2.b |= 1;
                    alyfVar2.d = str;
                }
                defpackage.allj alljVar = this.a;
                akzz akzzVarM = defpackage.almz.a.m();
                defpackage.alnb alnbVar = defpackage.alnb.EVENT_SMART_REPLY_OPTIONS;
                akzzVarM.u();
                defpackage.almz almzVar4 = akzzVarM.b;
                almzVar4.c = alnbVar.aN;
                almzVar4.b |= 1;
                akzzVarM.bV(defpackage.aloz.b, (defpackage.alyf) akzxVarM.p());
                alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
            }
        }
    }

    @Override // defpackage.allg
    public final void e() {
        this.c.f();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) throws defpackage.aljs {
        alln allnVarG = alln.g(alqdVar, almbVar.f, alkfVar);
        this.b = allnVarG;
        this.c.e(allnVarG);
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
