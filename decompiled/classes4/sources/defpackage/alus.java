package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alus implements defpackage.aljv {
    private final defpackage.allj a;
    private defpackage.alle b;
    private final defpackage.alyw c;

    public alus(defpackage.alyw alywVar, defpackage.alli alliVar) {
        aooh.f(alliVar, "publisherFactory");
        this.c = alywVar;
        this.a = alliVar.a("AGENTIC_CALL_SCREEN_DIALER_EVENT_GATEWAY");
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarV = aihd.v(defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_STOP_BOT_SPEECH, defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE, defpackage.alnb.EVENT_LLM_FEATURE_AVAILABLE, defpackage.alnb.EVENT_LLM_FEATURE_MISSING, defpackage.alnb.EVENT_LLM_FEATURE_DOWNLOADING, new defpackage.alnb[]{defpackage.alnb.EVENT_QUICK_REPLY_CHIPS_READY, defpackage.alnb.EVENT_SMART_REPLY_OPTIONS, defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING, defpackage.alnb.EVENT_AGENTIC_NEW_MODEL_SUMMARY, defpackage.alnb.EVENT_STATE_UPDATE, defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST, defpackage.alnb.EVENT_LLM_INFERENCE_RESULT, defpackage.alnb.EVENT_LLM_CANCEL_REQUEST, defpackage.alnb.EVENT_ROBOCALL_DETECTED, defpackage.alnb.EVENT_EXTRACTION_RESULT});
        aooh.e(aihdVarV, "of(...)");
        return aihdVarV;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void b(defpackage.almy almyVar) {
        defpackage.alpv.k(this, almyVar);
    }

    @Override // defpackage.aljv
    public final defpackage.alsi c(defpackage.almy almyVar) {
        aooh.f(almyVar, "internalEvent");
        aooh.f(almyVar, "internalEvent");
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 3) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            defpackage.alsi alsiVarZ = defpackage.aknx.z(almzVar2);
            aooh.e(alsiVarZ, "convertExtractionResultToOutboundEvent(...)");
            return alsiVarZ;
        }
        if (iOrdinal == 5) {
            defpackage.alsi alsiVarC = defpackage.aknx.C(almyVar, j$.util.Optional.ofNullable(this.c.a));
            aooh.e(alsiVarC, "convertSayEventToStartBotSpeechEvent(...)");
            return alsiVarC;
        }
        if (iOrdinal == 8) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            aooh.e(almzVar3, "getData(...)");
            apdi apdiVar = defpackage.alox.b;
            aooh.e(apdiVar, "stateUpdateEvent");
            defpackage.alox aloxVar = (defpackage.alox) akmr.x(almzVar3, apdiVar);
            apdi apdiVar2 = defpackage.alou.b;
            aooh.e(apdiVar2, "spamDecisionEvent");
            if (!akmr.y(aloxVar, apdiVar2)) {
                return airh.H(defpackage.alsi.a.m()).al();
            }
            zoe zoeVarH = airh.H(defpackage.alsi.a.m());
            apdi apdiVar3 = defpackage.alwp.b;
            aooh.e(apdiVar3, "callAssistantOutboundEvent");
            vaa vaaVarG = airh.G(defpackage.alwp.a.m());
            apdi apdiVar4 = defpackage.alxy.i;
            aooh.e(apdiVar4, "spamDecisionOutboundEvent");
            aooh.e(apdiVar2, "spamDecisionEvent");
            java.lang.Object objX = akmr.x(aloxVar, apdiVar2);
            aooh.e(objX, "get(...)");
            vaaVarG.aH(apdiVar4, (albh) objX);
            zoeVarH.aE(apdiVar3, vaaVarG.ax());
            return zoeVarH.al();
        }
        if (iOrdinal == 17) {
            zoe zoeVarH2 = airh.H(defpackage.alsi.a.m());
            apdi apdiVar5 = defpackage.alwp.b;
            aooh.e(apdiVar5, "callAssistantOutboundEvent");
            vaa vaaVarG2 = airh.G(defpackage.alwp.a.m());
            apdi apdiVar6 = defpackage.alyf.e;
            aooh.e(apdiVar6, "suggestSmartRepliesOutboundEvent");
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            apdi apdiVar7 = defpackage.aloz.b;
            aooh.e(apdiVar7, "suggestSmartRepliesEvent");
            java.lang.Object objX2 = akmr.x(almzVar4, apdiVar7);
            aooh.e(objX2, "get(...)");
            vaaVarG2.aH(apdiVar6, (albh) objX2);
            zoeVarH2.aE(apdiVar5, vaaVarG2.ax());
            return zoeVarH2.al();
        }
        if (iOrdinal == 45) {
            defpackage.alsi alsiVarU = defpackage.aknx.u();
            aooh.e(alsiVarU, "buildLlmInferenceRequestOutboundEvent(...)");
            return alsiVarU;
        }
        if (iOrdinal == 47) {
            defpackage.almz almzVar5 = almyVar.h;
            if (almzVar5 == null) {
                almzVar5 = defpackage.almz.a;
            }
            defpackage.alsi alsiVarA = defpackage.aknx.A(almzVar5);
            aooh.e(alsiVarA, "convertLlmInferenceResultToOutboundEvent(...)");
            return alsiVarA;
        }
        if (iOrdinal == 49) {
            defpackage.alsi alsiVarQ = defpackage.aknx.q();
            aooh.e(alsiVarQ, "buildLlmCancelRequestOutboundEvent(...)");
            return alsiVarQ;
        }
        if (iOrdinal == 55) {
            defpackage.alsi alsiVarP = defpackage.aknx.p();
            aooh.e(alsiVarP, "buildLlmActiveEvent(...)");
            return alsiVarP;
        }
        if (iOrdinal == 59) {
            zoe zoeVarH3 = airh.H(defpackage.alsi.a.m());
            apdi apdiVar8 = defpackage.alsh.e;
            aooh.e(apdiVar8, "modelSummaryEvent");
            akzx akzxVarM = defpackage.alsh.a.m();
            aooh.f(akzxVarM, "builder");
            defpackage.almz almzVar6 = almyVar.h;
            if (almzVar6 == null) {
                almzVar6 = defpackage.almz.a;
            }
            apdi apdiVar9 = defpackage.alvn.e;
            aooh.e(apdiVar9, "modelProducedSummaryEvent");
            defpackage.alvn alvnVar = (defpackage.alvn) akmr.x(almzVar6, apdiVar9);
            java.lang.String str = alvnVar.c;
            aooh.e(str, "getSummary(...)");
            aooh.f(str, "value");
            akzxVarM.u();
            defpackage.alsh alshVar = (defpackage.alsh) akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            alshVar.b |= 1;
            alshVar.c = str;
            defpackage.alrp alrpVarB = defpackage.alrp.b(alvnVar.d);
            if (alrpVarB == null) {
                alrpVarB = defpackage.alrp.INTENT_LABEL_UNKNOWN;
            }
            akzxVarM.u();
            defpackage.alsh alshVar2 = (defpackage.alsh) akzxVarM.b;
            alshVar2.d = alrpVarB.j;
            alshVar2.b |= 2;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            zoeVarH3.aE(apdiVar8, (defpackage.alsh) aladVarP);
            return zoeVarH3.al();
        }
        if (iOrdinal == 65) {
            defpackage.alsi alsiVarR = defpackage.aknx.r();
            aooh.e(alsiVarR, "buildLlmFeatureAvailableEvent(...)");
            return alsiVarR;
        }
        if (iOrdinal == 30) {
            defpackage.alsi alsiVarV = defpackage.aknx.v();
            aooh.e(alsiVarV, "buildRobocallDetectedEvent(...)");
            return alsiVarV;
        }
        if (iOrdinal != 31) {
            if (iOrdinal == 33) {
                defpackage.alsi alsiVarW = defpackage.aknx.w();
                aooh.e(alsiVarW, "buildStopBotSpeechEvent(...)");
                return alsiVarW;
            }
            if (iOrdinal != 34) {
                if (iOrdinal == 62) {
                    defpackage.alsi alsiVarS = defpackage.aknx.s();
                    aooh.e(alsiVarS, "buildLlmFeatureDownloadingEvent(...)");
                    return alsiVarS;
                }
                if (iOrdinal != 63) {
                    return airh.H(defpackage.alsi.a.m()).al();
                }
                defpackage.alsi alsiVarT = defpackage.aknx.t();
                aooh.e(alsiVarT, "buildLlmFeatureMissingEvent(...)");
                return alsiVarT;
            }
            zoe zoeVarH4 = airh.H(defpackage.alsi.a.m());
            apdi apdiVar10 = defpackage.alsl.c;
            aooh.e(apdiVar10, "quickReplyChipsReadyEvent");
            defpackage.almz almzVar7 = almyVar.h;
            if (almzVar7 == null) {
                almzVar7 = defpackage.almz.a;
            }
            apdi apdiVar11 = defpackage.alog.b;
            aooh.e(apdiVar11, "quickReplyChipsReadyEvent");
            java.lang.Object objX3 = akmr.x(almzVar7, apdiVar11);
            aooh.e(objX3, "get(...)");
            zoeVarH4.aE(apdiVar10, (albh) objX3);
            return zoeVarH4.al();
        }
        zoe zoeVarH5 = airh.H(defpackage.alsi.a.m());
        apdi apdiVar12 = defpackage.alwp.b;
        aooh.e(apdiVar12, "callAssistantOutboundEvent");
        vaa vaaVarG3 = airh.G(defpackage.alwp.a.m());
        apdi apdiVar13 = defpackage.alwu.e;
        aooh.e(apdiVar13, "continueTranscribingOutboundEvent");
        akzx akzxVarM2 = defpackage.alwu.a.m();
        aooh.f(akzxVarM2, "builder");
        akzm akzmVar = almyVar.d;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        aooh.e(akzmVar, "getAudioRelativeTimestamp(...)");
        aooh.f(akzmVar, "value");
        akzxVarM2.u();
        defpackage.alwu alwuVar = (defpackage.alwu) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akzmVar);
        alwuVar.c = akzmVar;
        alwuVar.b |= 1;
        java.lang.String str2 = almyVar.f;
        aooh.e(str2, "getOriginatingEventId(...)");
        aooh.f(str2, "value");
        akzxVarM2.u();
        defpackage.alwu alwuVar2 = (defpackage.alwu) akzxVarM2.b;
        j$.util.Objects.requireNonNull(str2);
        alwuVar2.b |= 2;
        alwuVar2.d = str2;
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        vaaVarG3.aH(apdiVar13, (defpackage.alwu) aladVarP2);
        zoeVarH5.aE(apdiVar12, vaaVarG3.ax());
        return zoeVarH5.al();
    }

    @Override // defpackage.aljv
    public final void g(defpackage.alro alroVar) {
        aooh.f(alroVar, "inboundEvent");
        apdi apdiVar = defpackage.altd.d;
        alroVar.c(apdiVar);
        akzs akzsVar = ((alaa) alroVar).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            alroVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) alroVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            aooh.e(objJ, "getExtension(...)");
            akzx akzxVarM = defpackage.aloo.a.m();
            long j = ((defpackage.altd) objJ).c;
            akzxVarM.u();
            defpackage.aloo alooVar = (defpackage.aloo) akzxVarM.b;
            alooVar.b |= 2;
            alooVar.d = j;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            akzz akzzVarN = defpackage.alro.a.n(alroVar);
            akzzVarN.bV(defpackage.aloo.f, (defpackage.aloo) aladVarP);
            alroVar = (defpackage.alro) akzzVarN.p();
        }
        aooh.c(alroVar);
        this.a.b(defpackage.alyw.b(alroVar));
    }

    @Override // defpackage.aljv
    public final void h(defpackage.alsi alsiVar) {
        aooh.f(alsiVar, "outboundEvent");
        defpackage.alle alleVar = this.b;
        if (alleVar != null) {
            alleVar.a(alsiVar);
        }
    }

    @Override // defpackage.aljv
    public final void i(java.lang.String str) {
        aooh.f(str, "directoryPath");
        aooh.f(str, "directoryPath");
        this.c.a = str;
    }

    @Override // defpackage.aljv
    public final void j(defpackage.alle alleVar) {
        this.b = alleVar;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
    }
}
