package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvx {
    public static final /* synthetic */ int b = 0;
    private static final aimz c = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/common/TakeAMessageSubFlow");
    private static final j$.time.Duration d = j$.time.Duration.ofMinutes(2);
    public final defpackage.aljt a;
    private final defpackage.alyk e;
    private final j$.time.Duration f;
    private final alln g;
    private aigf h;
    private final defpackage.alqf i;

    public alvx(defpackage.alyk alykVar, alln allnVar, defpackage.alqf alqfVar, defpackage.aljt aljtVar) {
        j$.time.Duration durationDJ;
        this.e = alykVar;
        this.g = allnVar;
        this.i = alqfVar;
        this.a = aljtVar;
        if ((alykVar.b & 1) != 0) {
            akzm akzmVar = alykVar.c;
            durationDJ = ajsz.dJ(akzmVar == null ? akzm.a : akzmVar);
        } else {
            durationDJ = d;
        }
        this.f = durationDJ;
    }

    public final aify a(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.ordinal() != 24) {
            return aike.a;
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alng.f;
        almzVar2.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alng alngVar = (defpackage.alng) objJ;
        if (alngVar.d) {
            return aify.p(b(defpackage.alyl.INCOMPLETE_TRIGGER, "SayNothing", defpackage.alsz.USER));
        }
        return alngVar.e ? aify.p(b(defpackage.alyl.ANCIENT_TRIGGER, "SayNothing", defpackage.alsz.USER)) : aify.p(b(defpackage.alyl.CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER, "AcknowledgeAndGoodbye", defpackage.alsz.USER));
    }

    public final defpackage.almz b(defpackage.alyl alylVar, java.lang.String str, defpackage.alsz alszVar) {
        java.lang.String str2 = (java.lang.String) this.h.getOrDefault(alylVar, str);
        akzx akzxVarM = defpackage.alnf.a.m();
        akzxVarM.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVarM.b;
        alnfVar.h = alszVar.d;
        alnfVar.b |= 2;
        akzxVarM.u();
        defpackage.alnf alnfVar2 = (defpackage.alnf) akzxVarM.b;
        alnfVar2.f = java.lang.Integer.valueOf(alylVar.h);
        alnfVar2.e = 10;
        defpackage.alsy alsyVarC = this.g.c(str2);
        akzxVarM.u();
        defpackage.alnf alnfVar3 = (defpackage.alnf) akzxVarM.b;
        alnfVar3.g = alsyVarC.j;
        alnfVar3.b |= 1;
        akzx akzxVarM2 = defpackage.almm.a.m();
        akzxVarM2.u();
        defpackage.almm almmVar = (defpackage.almm) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str2);
        almmVar.b |= 1;
        almmVar.c = str2;
        akzxVarM.u();
        defpackage.alnf alnfVar4 = (defpackage.alnf) akzxVarM.b;
        defpackage.almm almmVar2 = (defpackage.almm) akzxVarM2.p();
        j$.util.Objects.requireNonNull(almmVar2);
        alnfVar4.d = almmVar2;
        alnfVar4.c = 1;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.u();
        defpackage.almz almzVar2 = akzzVarM.b;
        almzVar2.d = 1;
        almzVar2.b |= 2;
        akzzVarM.bV(defpackage.alnf.k, (defpackage.alnf) akzxVarM.p());
        return akzzVarM.p();
    }

    public final defpackage.almz c(int i, defpackage.almy almyVar, defpackage.alsz alszVar) {
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(this.e.d).filter(new sst(i, 5)).findFirst();
        int i2 = 12;
        if (true == optionalFindFirst.isPresent()) {
            optionalFindFirst = j$.util.Optional.ofNullable((aigf) j$.util.Collection.-EL.stream(((defpackage.alyj) optionalFindFirst.get()).d).filter(new defpackage.altw(12)).collect(aido.b(new defpackage.alpp(14), new defpackage.alpp(15))));
        }
        this.h = (aigf) optionalFindFirst.orElse(aikj.b);
        try {
            this.i.c(new defpackage.alkh(this, i2), almyVar, this.f);
        } catch (defpackage.aljs e) {
            a.by(c.c(), "Scheduling cutting off hold finish failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/common/TakeAMessageSubFlow", "startSubFlowAndReturnFirstEvent", 'O', "TakeAMessageSubFlow.java", e);
        }
        return b(defpackage.alyl.START_TAKING_MESSAGE_TRIGGER, "SuggestLeavingMessage", alszVar);
    }
}
