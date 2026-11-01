package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alyw implements defpackage.aljz {
    private final /* synthetic */ int $cid;
    public java.lang.Object a;

    public alyw(int i) {
        this.$cid = i;
        this.a = j$.util.Optional.empty();
    }

    public static final defpackage.almz b(defpackage.alro alroVar) {
        aooh.f(alroVar, "inboundEvent");
        apdi apdiVar = defpackage.alqv.f;
        aooh.e(apdiVar, "asrResultEvent");
        if (akmr.y(alroVar, apdiVar)) {
            defpackage.almz almzVarH = defpackage.aknx.h(alroVar);
            aooh.e(almzVarH, "convertAsrResultEvent(...)");
            return almzVarH;
        }
        apdi apdiVar2 = defpackage.altb.b;
        aooh.e(apdiVar2, "startConversationEvent");
        if (akmr.y(alroVar, apdiVar2)) {
            defpackage.almz almzVarD = defpackage.aknx.D();
            aooh.e(almzVarD, "convertStartConversationEvent(...)");
            return almzVarD;
        }
        apdi apdiVar3 = defpackage.alqy.f;
        aooh.e(apdiVar3, "botSpeechStartedEvent");
        if (akmr.y(alroVar, apdiVar3)) {
            defpackage.almz almzVarJ = defpackage.aknx.j(alroVar);
            aooh.e(almzVarJ, "convertBotSpeechStartedEvent(...)");
            return almzVarJ;
        }
        apdi apdiVar4 = defpackage.alqx.d;
        aooh.e(apdiVar4, "botSpeechEndedEvent");
        if (akmr.y(alroVar, apdiVar4)) {
            defpackage.almz almzVarI = defpackage.aknx.i(alroVar);
            aooh.e(almzVarI, "convertBotSpeechEndedEvent(...)");
            return almzVarI;
        }
        apdi apdiVar5 = defpackage.alsr.b;
        aooh.e(apdiVar5, "ringingStartedEvent");
        if (akmr.y(alroVar, apdiVar5)) {
            xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
            xtqVarO.ah(defpackage.alnb.EVENT_RINGING_STARTED);
            apdi apdiVar6 = defpackage.alok.b;
            aooh.e(apdiVar6, "ringingStartedTimingEvent");
            akzx akzxVarM = defpackage.alok.a.m();
            aooh.f(akzxVarM, "builder");
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            xtqVarO.ax(apdiVar6, (defpackage.alok) aladVarP);
            return xtqVarO.ag();
        }
        apdi apdiVar7 = defpackage.alsq.d;
        aooh.e(apdiVar7, "ringingEndedEvent");
        if (akmr.y(alroVar, apdiVar7)) {
            xtq xtqVarO2 = defpackage.alpv.o(defpackage.almz.a.m());
            xtqVarO2.ah(defpackage.alnb.EVENT_RINGING_ENDED);
            apdi apdiVar8 = defpackage.aloj.e;
            aooh.e(apdiVar8, "ringingEndedTimingEvent");
            akzx akzxVarM2 = defpackage.aloj.a.m();
            aooh.f(akzxVarM2, "builder");
            akzm akzmVarC = aldf.c(alroVar.c);
            aooh.e(akzmVarC, "fromMillis(...)");
            aooh.f(akzmVarC, "value");
            akzxVarM2.u();
            defpackage.aloj alojVar = (defpackage.aloj) akzxVarM2.b;
            j$.util.Objects.requireNonNull(akzmVarC);
            alojVar.c = akzmVarC;
            alojVar.b |= 1;
            aooh.e(apdiVar7, "ringingEndedEvent");
            defpackage.alsp alspVarB = defpackage.alsp.b(((defpackage.alsq) akmr.x(alroVar, apdiVar7)).c);
            if (alspVarB == null) {
                alspVarB = defpackage.alsp.UNKNOWN;
            }
            akzxVarM2.u();
            defpackage.aloj alojVar2 = (defpackage.aloj) akzxVarM2.b;
            alojVar2.d = alspVarB.e;
            alojVar2.b |= 2;
            alad aladVarP2 = akzxVarM2.p();
            aooh.e(aladVarP2, "build(...)");
            xtqVarO2.ax(apdiVar8, (defpackage.aloj) aladVarP2);
            return xtqVarO2.ag();
        }
        apdi apdiVar9 = defpackage.alrr.e;
        aooh.e(apdiVar9, "langIdEvent");
        if (akmr.y(alroVar, apdiVar9)) {
            defpackage.almz almzVarM = defpackage.aknx.m(alroVar);
            aooh.e(almzVarM, "convertLangIdEvent(...)");
            return almzVarM;
        }
        apdi apdiVar10 = defpackage.alsk.d;
        aooh.e(apdiVar10, "quickReplyChipClicked");
        if (akmr.y(alroVar, apdiVar10)) {
            defpackage.almz almzVarN = defpackage.aknx.n(alroVar);
            aooh.e(almzVarN, "convertQuickReplyChipClickedEvent(...)");
            return almzVarN;
        }
        apdi apdiVar11 = defpackage.aloo.f;
        aooh.e(apdiVar11, "selectedOptionInboundEvent");
        if (akmr.y(alroVar, apdiVar11)) {
            xtq xtqVarO3 = defpackage.alpv.o(defpackage.almz.a.m());
            xtqVarO3.ah(defpackage.alnb.EVENT_SELECTED_OPTION);
            apdi apdiVar12 = defpackage.aloo.e;
            aooh.e(apdiVar12, "selectedOptionEvent");
            aooh.e(apdiVar11, "selectedOptionInboundEvent");
            java.lang.Object objX = akmr.x(alroVar, apdiVar11);
            aooh.e(objX, "get(...)");
            xtqVarO3.ax(apdiVar12, (albh) objX);
            return xtqVarO3.ag();
        }
        apdi apdiVar13 = defpackage.alsu.f;
        aooh.e(apdiVar13, "spamSignalEvent");
        if (akmr.y(alroVar, apdiVar13)) {
            xtq xtqVarO4 = defpackage.alpv.o(defpackage.almz.a.m());
            xtqVarO4.ah(defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL);
            apdi apdiVar14 = defpackage.alow.b;
            aooh.e(apdiVar14, "spamSignalInternalEvent");
            aooh.e(apdiVar13, "spamSignalEvent");
            java.lang.Object objX2 = akmr.x(alroVar, apdiVar13);
            aooh.e(objX2, "get(...)");
            xtqVarO4.ax(apdiVar14, (albh) objX2);
            return xtqVarO4.ag();
        }
        apdi apdiVar15 = defpackage.alsc.b;
        aooh.e(apdiVar15, "manualAnswerCallEvent");
        if (akmr.y(alroVar, apdiVar15)) {
            defpackage.almz almzVarE = defpackage.aknx.e();
            aooh.e(almzVarE, "buildManualAnswerCallEvent(...)");
            return almzVarE;
        }
        apdi apdiVar16 = defpackage.alsd.b;
        aooh.e(apdiVar16, "manualEndCallEvent");
        if (!akmr.y(alroVar, apdiVar16)) {
            return defpackage.alpv.o(defpackage.almz.a.m()).ag();
        }
        defpackage.almz almzVarF = defpackage.aknx.f();
        aooh.e(almzVarF, "buildManualEndCallEvent(...)");
        return almzVarF;
    }

    @Override // defpackage.aljz
    public final /* synthetic */ defpackage.almz a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return b((defpackage.alro) obj);
        }
        defpackage.alro alroVar = (defpackage.alro) obj;
        apdi apdiVar = defpackage.alqv.f;
        alroVar.c(apdiVar);
        if (((alaa) alroVar).n.l((alac) apdiVar.a)) {
            return defpackage.aknx.h(alroVar);
        }
        apdi apdiVar2 = defpackage.altb.b;
        alroVar.c(apdiVar2);
        if (((alaa) alroVar).n.l((alac) apdiVar2.a)) {
            return defpackage.aknx.D();
        }
        apdi apdiVar3 = defpackage.alsc.b;
        alroVar.c(apdiVar3);
        if (((alaa) alroVar).n.l((alac) apdiVar3.a)) {
            return defpackage.aknx.e();
        }
        apdi apdiVar4 = defpackage.alsd.b;
        alroVar.c(apdiVar4);
        if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
            return defpackage.aknx.f();
        }
        apdi apdiVar5 = defpackage.alqy.f;
        alroVar.c(apdiVar5);
        if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
            return defpackage.aknx.j(alroVar);
        }
        apdi apdiVar6 = defpackage.alqx.d;
        alroVar.c(apdiVar6);
        if (((alaa) alroVar).n.l((alac) apdiVar6.a)) {
            return defpackage.aknx.i(alroVar);
        }
        apdi apdiVar7 = defpackage.aloo.f;
        alroVar.c(apdiVar7);
        akzs akzsVar = ((alaa) alroVar).n;
        alac alacVar = (alac) apdiVar7.a;
        if (akzsVar.l(alacVar)) {
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_SELECTED_OPTION;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            apdi apdiVar8 = defpackage.aloo.e;
            alroVar.c(apdiVar7);
            java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar7.b;
            } else {
                apdiVar7.c(objJ);
            }
            akzzVarM.bV(apdiVar8, (defpackage.aloo) objJ);
            return akzzVarM.p();
        }
        apdi apdiVar9 = defpackage.alwr.d;
        alroVar.c(apdiVar9);
        if (((alaa) alroVar).n.l((alac) apdiVar9.a)) {
            return defpackage.aknx.k(alroVar);
        }
        apdi apdiVar10 = defpackage.alrr.e;
        alroVar.c(apdiVar10);
        if (((alaa) alroVar).n.l((alac) apdiVar10.a)) {
            return defpackage.aknx.m(alroVar);
        }
        apdi apdiVar11 = defpackage.alte.b;
        alroVar.c(apdiVar11);
        if (((alaa) alroVar).n.l((alac) apdiVar11.a)) {
            akzz akzzVarM2 = defpackage.almz.a.m();
            defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_TTS_AVAILABLE;
            akzzVarM2.u();
            defpackage.almz almzVar2 = akzzVarM2.b;
            almzVar2.c = alnbVar2.aN;
            almzVar2.b |= 1;
            return akzzVarM2.p();
        }
        apdi apdiVar12 = defpackage.alth.b;
        alroVar.c(apdiVar12);
        if (!((alaa) alroVar).n.l((alac) apdiVar12.a)) {
            return defpackage.almz.a;
        }
        akzz akzzVarM3 = defpackage.almz.a.m();
        defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_USER_CONSENTED_TO_AI_GENERATED_REPLIES;
        akzzVarM3.u();
        defpackage.almz almzVar3 = akzzVarM3.b;
        almzVar3.c = alnbVar3.aN;
        almzVar3.b |= 1;
        return akzzVarM3.p();
    }

    public alyw(int i, byte[] bArr) {
        this.$cid = i;
    }
}
