package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcz implements defpackage.alkw {
    public final defpackage.alzu a;
    public final defpackage.aljy f;
    private final aigf g;
    private final defpackage.alkb j;
    private final java.util.List h = j$.util.DesugarCollections.synchronizedList(new java.util.ArrayList());
    public final defpackage.amcq b = new defpackage.amcq();
    public final defpackage.amcy c = new defpackage.amcy();
    private j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional d = j$.util.Optional.empty();
    public java.lang.Boolean e = java.lang.Boolean.FALSE;

    public amcz(defpackage.aljy aljyVar, defpackage.alzu alzuVar) {
        int i = 18;
        this.g = aigf.p(defpackage.alnb.EVENT_ASR_RESULT, new defpackage.alkh(this, 16), defpackage.alnb.EVENT_DAREDEVIL, new defpackage.alkh(this, 17), defpackage.alnb.EVENT_CALL_MENU_STATE, new defpackage.alkh(this, i), defpackage.alnb.EVENT_CALL_MENU_STATE_PARSING_RESULT, new defpackage.alkh(this, i), defpackage.alnb.EVENT_USER_ACTION, new defpackage.alkh(this, 19), defpackage.alnb.EVENT_AUDIO_TICK, new defpackage.aljd(5));
        this.f = aljyVar;
        this.a = alzuVar;
        this.j = new defpackage.alkb(aljyVar, new defpackage.amda(0));
    }

    public static defpackage.almy f(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alpe.d;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alpe alpeVar = (defpackage.alpe) objJ;
        int i = alpeVar.b;
        if (i != 1) {
            return almyVar;
        }
        akzx akzxVarP = (i == 1 ? (alre) alpeVar.c : alre.a).p();
        akzxVarP.u();
        alre alreVar = akzxVarP.b;
        alreVar.b &= -3;
        alreVar.d = alre.a.d;
        alre alreVarP = akzxVarP.p();
        akzz akzzVarP = almzVar.p();
        akzx akzxVarP2 = alpeVar.p();
        akzxVarP2.u();
        defpackage.alpe alpeVar2 = (defpackage.alpe) akzxVarP2.b;
        j$.util.Objects.requireNonNull(alreVarP);
        alpeVar2.c = alreVarP;
        alpeVar2.b = 1;
        akzzVarP.bV(apdiVar, (defpackage.alpe) akzxVarP2.p());
        defpackage.almz almzVarP = akzzVarP.p();
        akzx akzxVarP3 = almyVar.p();
        akzxVarP3.u();
        defpackage.almy almyVar2 = (defpackage.almy) akzxVarP3.b;
        j$.util.Objects.requireNonNull(almzVarP);
        almyVar2.h = almzVarP;
        almyVar2.b |= 32;
        return (defpackage.almy) akzxVarP3.p();
    }

    @Override // defpackage.alkw
    public final synchronized void a(defpackage.almy almyVar) {
        if (this.e.booleanValue()) {
            this.j.a(almyVar);
            return;
        }
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        aigf aigfVar = this.g;
        if (aigfVar.containsKey(alnbVarB)) {
            defpackage.aa$$ExternalSyntheticApiModelOutline1.m16m(aigfVar.get(alnbVarB)).accept(almyVar);
        } else {
            g(almyVar);
        }
    }

    @Override // defpackage.alkw
    public final void c(defpackage.aloa aloaVar) {
        if (this.e.booleanValue()) {
            this.j.c(aloaVar);
            return;
        }
        try {
            j$.util.Optional optional = this.i;
            defpackage.alui aluiVar = new defpackage.alui(aloaVar, 19);
            if (true == optional.isPresent()) {
                ((defpackage.amgv) optional.get()).g((defpackage.aloa) aluiVar.a);
            }
        } catch (java.lang.RuntimeException e) {
            this.f.a(e, "Error while calling the listener.", "logModelConfig", defpackage.aljr.e);
        }
    }

    @Override // defpackage.alkw
    public final void d() {
        this.j.d();
    }

    @Override // defpackage.alkw
    public final void e(defpackage.amgv amgvVar, java.lang.Boolean bool) {
        this.i = j$.util.Optional.of(amgvVar);
        this.e = bool;
        if (bool.booleanValue()) {
            this.j.e(amgvVar, java.lang.Boolean.TRUE);
        }
    }

    public final void g(defpackage.almy almyVar) {
        this.h.add(almyVar);
        try {
            j$.util.Optional optional = this.i;
            defpackage.alui aluiVar = new defpackage.alui(almyVar, 20);
            if (true == optional.isPresent()) {
                ((defpackage.amgv) optional.get()).d((defpackage.almy) aluiVar.a);
            }
        } catch (java.lang.RuntimeException e) {
            this.f.a(e, "Error while calling the listener.", "log", defpackage.aljr.e);
        }
    }

    @Override // defpackage.alkw
    public final /* synthetic */ void b(defpackage.altk altkVar) {
    }
}
