package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amfh implements defpackage.allg {
    public static final /* synthetic */ int e = 0;
    private static final defpackage.alqk f;
    private static final defpackage.amgv g;
    public final defpackage.allj a;
    public final defpackage.alzw b;
    public j$.util.Optional c = j$.util.Optional.empty();
    public defpackage.almy d;
    private final defpackage.alzu h;
    private final defpackage.amcz i;
    private defpackage.alqh j;

    static {
        akzz akzzVarM = defpackage.alqk.a.m();
        apdi apdiVar = defpackage.amaf.d;
        akzx akzxVarM = defpackage.amaf.a.m();
        akzxVarM.u();
        defpackage.amaf amafVar = (defpackage.amaf) akzxVarM.b;
        amafVar.c = 1;
        amafVar.b |= 1;
        akzzVarM.bV(apdiVar, (defpackage.amaf) akzxVarM.p());
        f = akzzVarM.p();
        g = new defpackage.amgv(new defpackage.amff(), defpackage.amgt.a(new defpackage.amfg()));
    }

    public amfh(defpackage.alli alliVar, defpackage.alzw alzwVar, defpackage.alzu alzuVar, defpackage.amcz amczVar) {
        this.a = alliVar.a(defpackage.allh.F.name());
        this.b = alzwVar;
        this.h = alzuVar;
        this.i = amczVar;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.t(defpackage.alnb.EVENT_RECOGNITION_HUMAN_INTENT_EXTRACTION, defpackage.alnb.EVENT_DAREDEVIL, defpackage.alnb.EVENT_AUDIO_TICK, defpackage.alnb.EVENT_USER_ACTION);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        this.d = almyVar;
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 25) {
            defpackage.alzw alzwVar = this.b;
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.almu.b;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            alzwVar.a((alrc) objJ);
            return;
        }
        if (iOrdinal == 83) {
            defpackage.alzw alzwVar2 = this.b;
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.almf.b;
            almzVar3.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar3).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            alzwVar2.f((defpackage.aljk) objJ2);
            return;
        }
        if (iOrdinal != 85) {
            if (iOrdinal == 89) {
                defpackage.alzw alzwVar3 = this.b;
                defpackage.almz almzVar4 = almyVar.h;
                if (almzVar4 == null) {
                    almzVar4 = defpackage.almz.a;
                }
                apdi apdiVar3 = defpackage.alnm.i;
                almzVar4.c(apdiVar3);
                java.lang.Object objJ3 = ((alaa) almzVar4).n.j((alac) apdiVar3.a);
                if (objJ3 == null) {
                    objJ3 = apdiVar3.b;
                } else {
                    apdiVar3.c(objJ3);
                }
                alzwVar3.c((defpackage.alub) j$.util.Optional.ofNullable((defpackage.alzx) defpackage.alzx.j.get(((defpackage.alnm) objJ3).e)).orElse(defpackage.alzx.f));
                return;
            }
            return;
        }
        defpackage.almz almzVar5 = almyVar.h;
        if (almzVar5 == null) {
            almzVar5 = defpackage.almz.a;
        }
        apdi apdiVar4 = defpackage.alpe.d;
        almzVar5.c(apdiVar4);
        java.lang.Object objJ4 = ((alaa) almzVar5).n.j((alac) apdiVar4.a);
        if (objJ4 == null) {
            objJ4 = apdiVar4.b;
        } else {
            apdiVar4.c(objJ4);
        }
        defpackage.alpe alpeVar = (defpackage.alpe) objJ4;
        int i = alpeVar.b;
        if (i == 3) {
            this.b.j(i == 3 ? (defpackage.amai) alpeVar.c : defpackage.amai.a);
        }
        int i2 = alpeVar.b;
        if (i2 == 4) {
            this.b.k(i2 == 4 ? (defpackage.also) alpeVar.c : defpackage.also.a);
        }
    }

    @Override // defpackage.allg
    public final void d() {
        j$.util.Optional.empty();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) throws defpackage.aljs {
        this.b.a = new defpackage.amfc(this, 2);
        this.j = alqhVar;
        this.h.a = j$.util.Optional.of(alqdVar);
        defpackage.amcz amczVar = this.i;
        if (!amczVar.e.booleanValue()) {
            try {
                if (!amczVar.d.isPresent()) {
                    amczVar.d = j$.util.Optional.of(new defpackage.amdb(amczVar.a.a()));
                }
            } catch (defpackage.alio e2) {
                amczVar.f.a(e2, "Error while initializing the DMCLogger's DaredevilStateTracker.", "initDaredevilEventLogger", defpackage.aljr.c);
            }
        }
        try {
            this.b.d("", this.j, f, aiql.s(java.util.concurrent.Executors.newScheduledThreadPool(0)), g);
        } catch (java.lang.Exception e3) {
            throw new defpackage.aljs("Failed to initiate holdDetectionResultHandler with assets.", defpackage.aljr.d, e3);
        }
    }

    @Override // defpackage.allg
    public final void e() {
    }
}
