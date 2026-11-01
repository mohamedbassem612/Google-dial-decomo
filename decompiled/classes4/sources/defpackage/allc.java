package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allc implements defpackage.allg {
    public float a;
    private final defpackage.allj b;
    private int c;

    public allc(defpackage.alli alliVar) {
        this.b = alliVar.a(defpackage.allh.c.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return new aile(defpackage.alnb.EVENT_PARSING_MODEL_OUTPUT);
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
        if (alnbVarB.ordinal() == 78) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alod.b;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.amaw amawVar = (defpackage.amaw) objJ;
            akzx akzxVarM = defpackage.alsg.a.m();
            defpackage.amat amatVar = amawVar.b == 2 ? (defpackage.amat) amawVar.c : defpackage.amat.a;
            j$.util.Objects.requireNonNull("robot_intent_classes");
            defpackage.aqag aqagVar = (defpackage.aqag) amatVar.b.get("robot_intent_classes");
            if (aqagVar == null) {
                throw new java.lang.IllegalArgumentException();
            }
            alat alatVar = aqagVar.g;
            defpackage.amat amatVar2 = amawVar.b == 2 ? (defpackage.amat) amawVar.c : defpackage.amat.a;
            j$.util.Objects.requireNonNull("robot_intent_score_distributions");
            defpackage.aqag aqagVar2 = (defpackage.aqag) amatVar2.b.get("robot_intent_score_distributions");
            if (aqagVar2 == null) {
                throw new java.lang.IllegalArgumentException();
            }
            j$.util.stream.Stream streamD = aitj.m(aitt.m(aitt.n(alatVar, aqagVar2.e).j(new defpackage.alks(this, 7)).a.sorted(j$.util.Map.Entry.-CC.comparingByValue(j$.util.Comparator.-CC.reverseOrder()))).a.limit(this.c)).d(new defpackage.aitf(3));
            j$.util.Objects.requireNonNull(akzxVarM);
            streamD.forEach(new defpackage.alkh(akzxVarM, 4));
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_COMPACT_MODEL_OUTPUT;
            akzzVarM.u();
            defpackage.almz almzVar3 = akzzVarM.b;
            almzVar3.c = alnbVar.aN;
            almzVar3.b |= 1;
            apdi apdiVar2 = defpackage.alny.b;
            akzx akzxVarM2 = defpackage.alse.a.m();
            akzxVarM2.u();
            defpackage.alse alseVar = (defpackage.alse) akzxVarM2.b;
            defpackage.alsg alsgVar = (defpackage.alsg) akzxVarM.p();
            j$.util.Objects.requireNonNull(alsgVar);
            alseVar.c = alsgVar;
            alseVar.b |= 1;
            akzzVarM.bV(apdiVar2, (defpackage.alse) akzxVarM2.p());
            this.b.a(akzzVarM.p(), almyVar);
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.a = 0.0f;
        this.c = 1;
        if ((almlVar.b & 65536) != 0) {
            defpackage.almh almhVar = almlVar.w;
            if (almhVar == null) {
                almhVar = defpackage.almh.a;
            }
            this.a = almhVar.b;
            defpackage.almh almhVar2 = almlVar.w;
            if (almhVar2 == null) {
                almhVar2 = defpackage.almh.a;
            }
            this.c = almhVar2.c;
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
