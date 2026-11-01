package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nbl extends aomh implements aonj {
    int a;
    final /* synthetic */ defpackage.nbn b;
    final /* synthetic */ alsi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbl(defpackage.nbn nbnVar, alsi alsiVar, aoln aolnVar) {
        super(1, aolnVar);
        this.b = nbnVar;
        this.c = alsiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.nbl(this.b, this.c, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:164:0x0683  */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objO;
        defpackage.nmn nmnVar;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        if (i == 0) {
            defpackage.nbn nbnVar = this.b;
            alsi alsiVar = this.c;
            this.a = 1;
            apdi apdiVar = alsh.e;
            alsiVar.c(apdiVar);
            if (((alaa) alsiVar).n.l((alac) apdiVar.a)) {
                aooh.e(apdiVar, "modelSummaryEvent");
                alsh alshVar = (alsh) akmr.x(alsiVar, apdiVar);
                aimz aimzVar = defpackage.nbn.a;
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleModelSummaryEvent", 479, "DobbyDuplexListener.kt").y("received ModelSummaryEvent with summary: %s", alshVar.c);
                if ((alshVar.b & 2) != 0) {
                    alrp alrpVarB = alrp.b(alshVar.d);
                    if (alrpVarB == null) {
                        alrpVarB = alrp.a;
                    }
                    switch (alrpVarB.ordinal()) {
                        case 1:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_FAMILY_CARE;
                            break;
                        case 2:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_MEDICAL_ALERT;
                            break;
                        case 3:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_DELIVERY_LOGISTICS;
                            break;
                        case 4:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_BUSINESS_WORK;
                            break;
                        case 5:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_PERSONAL_FRIEND;
                            break;
                        case 6:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_PUBLIC_INFO;
                            break;
                        case 7:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_SOLICITATION_SALES;
                            break;
                        case 8:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_LIKELY_SPAM;
                            break;
                        default:
                            nmnVar = defpackage.nmn.CALL_SCREEN_INTENT_LABEL_UNKNOWN;
                            break;
                    }
                    defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                    defpackage.npw npwVarAC = mni.aC(defpackage.nln.a.m());
                    npwVarAC.O(nmnVar);
                    npwVarAB.E(npwVarAC.N());
                    objO = nbnVar.l.b(npwVarAB.D(), this);
                    if (objO != aoluVar) {
                        objO = aojh.a;
                    }
                } else {
                    aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleModelSummaryEvent", 481, "DobbyDuplexListener.kt").v("ModelSummaryEvent missing intent_label");
                    objO = aojh.a;
                }
                if (objO != aoluVar) {
                    objO = aojh.a;
                }
            } else {
                apdi apdiVar2 = alsl.c;
                alsiVar.c(apdiVar2);
                if (((alaa) alsiVar).n.l((alac) apdiVar2.a)) {
                    new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_QUICK_REPLY_CHIP_READY).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: nas
                        public final java.lang.Object b(java.lang.Object obj2) {
                            return ((defpackage.mtq) obj2).name();
                        }
                    }, 14));
                    objO = nbnVar.k(alsiVar, this);
                    if (objO != aoluVar) {
                        objO = aojh.a;
                    }
                } else if (defpackage.nbn.x(alsiVar)) {
                    new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_BOT_SPEECH_START).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: nat
                        public final java.lang.Object b(java.lang.Object obj2) {
                            return ((defpackage.mtq) obj2).name();
                        }
                    }, 16));
                    objO = nbnVar.n(alsiVar, this);
                    if (objO != aoluVar) {
                        objO = aojh.a;
                    }
                } else {
                    apdi apdiVar3 = altc.b;
                    alsiVar.c(apdiVar3);
                    int i2 = 0;
                    if (((alaa) alsiVar).n.l((alac) apdiVar3.a)) {
                        new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_BOT_SPEECH_STOP).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: nau
                            public final java.lang.Object b(java.lang.Object obj2) {
                                return ((defpackage.mtq) obj2).name();
                            }
                        }, 17));
                        defpackage.nej nejVar = nbnVar.b;
                        defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "stopPlayingWithoutAwaiting", 2129, "DobbyLifecycleController.kt").v("stopPlayingWithoutAwaiting");
                        aoov.an(nejVar.f, (aolr) null, 0, new defpackage.ndu(nejVar, (aoln) null, 3, (short[]) null), 3);
                        objO = aojh.a;
                    } else {
                        apdi apdiVar4 = alri.e;
                        alsiVar.c(apdiVar4);
                        if (((alaa) alsiVar).n.l((alac) apdiVar4.a)) {
                            new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_EXPERIMENT_SUMMERY).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: nav
                                public final java.lang.Object b(java.lang.Object obj2) {
                                    return ((defpackage.mtq) obj2).name();
                                }
                            }, 18));
                            defpackage.mqt mqtVar = nbnVar.c;
                            aooh.e(apdiVar4, "experimentSummaryEvent");
                            java.lang.Object objX = akmr.x(alsiVar, apdiVar4);
                            aooh.e(objX, "get(...)");
                            objO = mqtVar.y((alri) objX, this);
                            if (objO != aoluVar) {
                                objO = aojh.a;
                            }
                        } else {
                            apdi apdiVar5 = alse.d;
                            alsiVar.c(apdiVar5);
                            if (((alaa) alsiVar).n.l((alac) apdiVar5.a)) {
                                new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_MODEL_COMPACT_OUTPUT).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: naw
                                    public final java.lang.Object b(java.lang.Object obj2) {
                                        return ((defpackage.mtq) obj2).name();
                                    }
                                }, 19));
                                defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleModelCompactOutputEvent", 876, "DobbyDuplexListener.kt").v("handling model compact output event");
                                defpackage.mqt mqtVar2 = nbnVar.c;
                                aooh.e(apdiVar5, "modelCompactOutputEvent");
                                alsg alsgVar = ((alse) akmr.x(alsiVar, apdiVar5)).c;
                                if (alsgVar == null) {
                                    alsgVar = alsg.a;
                                }
                                aooh.e(alsgVar, "getModelIntentsPrediction(...)");
                                objO = mqtVar2.t(alsgVar, this);
                                if (objO != aoluVar) {
                                    objO = aojh.a;
                                }
                            } else if (defpackage.nbn.v(alsiVar)) {
                                objO = nbnVar.l(alsiVar, this);
                                if (objO != aoluVar) {
                                    objO = aojh.a;
                                }
                            } else {
                                apdi apdiVar6 = alrs.b;
                                alsiVar.c(apdiVar6);
                                if (((alaa) alsiVar).n.l((alac) apdiVar6.a)) {
                                    new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_ACTIVE).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: nax
                                        public final java.lang.Object b(java.lang.Object obj2) {
                                            return ((defpackage.mtq) obj2).name();
                                        }
                                    }, 20));
                                    defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmActiveEvent", 915, "DobbyDuplexListener.kt").v("handling llm active event");
                                    objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_ACTIVE, this);
                                    if (objO != aoluVar) {
                                        objO = aojh.a;
                                    }
                                } else {
                                    apdi apdiVar7 = alru.b;
                                    alsiVar.c(apdiVar7);
                                    if (((alaa) alsiVar).n.l((alac) apdiVar7.a)) {
                                        new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_FEATURE_AVAILABLE).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nay
                                            public final java.lang.Object b(java.lang.Object obj2) {
                                                return ((defpackage.mtq) obj2).name();
                                            }
                                        }, 1));
                                        defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmFeatureAvailableEvent", 920, "DobbyDuplexListener.kt").v("handling llm feature available event");
                                        objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_FEATURE_AVAILABLE, this);
                                        if (objO != aoluVar) {
                                            objO = aojh.a;
                                        }
                                    } else {
                                        apdi apdiVar8 = alrv.b;
                                        alsiVar.c(apdiVar8);
                                        if (((alaa) alsiVar).n.l((alac) apdiVar8.a)) {
                                            new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_FEATURE_DOWNLOADING).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: naz
                                                public final java.lang.Object b(java.lang.Object obj2) {
                                                    return ((defpackage.mtq) obj2).name();
                                                }
                                            }, 0));
                                            defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmFeatureDownloadingEvent", 925, "DobbyDuplexListener.kt").v("handling llm feature downloading event");
                                            objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_FEATURE_DOWNLOADING, this);
                                            if (objO != aoluVar) {
                                                objO = aojh.a;
                                            }
                                        } else {
                                            apdi apdiVar9 = alrw.b;
                                            alsiVar.c(apdiVar9);
                                            if (((alaa) alsiVar).n.l((alac) apdiVar9.a)) {
                                                new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_FEATURE_MISSING).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nag
                                                    public final java.lang.Object b(java.lang.Object obj2) {
                                                        return ((defpackage.mtq) obj2).name();
                                                    }
                                                }, 2));
                                                defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmFeatureMissingEvent", 930, "DobbyDuplexListener.kt").v("handling llm feature missing event");
                                                objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_FEATURE_MISSING, this);
                                                if (objO != aoluVar) {
                                                    objO = aojh.a;
                                                }
                                            } else {
                                                apdi apdiVar10 = alrz.b;
                                                alsiVar.c(apdiVar10);
                                                if (((alaa) alsiVar).n.l((alac) apdiVar10.a)) {
                                                    new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_INFERENCE_REQUEST).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nah
                                                        public final java.lang.Object b(java.lang.Object obj2) {
                                                            return ((defpackage.mtq) obj2).name();
                                                        }
                                                    }, 3));
                                                    defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmInferenceRequestOutboundEvent", 935, "DobbyDuplexListener.kt").v("handling llm inference request outbound event");
                                                    objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_INFERENCE_REQUEST, this);
                                                    if (objO != aoluVar) {
                                                        objO = aojh.a;
                                                    }
                                                } else {
                                                    apdi apdiVar11 = alrt.b;
                                                    alsiVar.c(apdiVar11);
                                                    if (((alaa) alsiVar).n.l((alac) apdiVar11.a)) {
                                                        new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_CANCEL_REQUEST).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nai
                                                            public final java.lang.Object b(java.lang.Object obj2) {
                                                                return ((defpackage.mtq) obj2).name();
                                                            }
                                                        }, 4));
                                                        defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmCancelRequestOutboundEvent", 940, "DobbyDuplexListener.kt").v("handling llm cancel inference request outbound event");
                                                        objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_CANCEL_INFERENCE_REQUEST, this);
                                                        if (objO != aoluVar) {
                                                            objO = aojh.a;
                                                        }
                                                    } else {
                                                        apdi apdiVar12 = alsa.d;
                                                        alsiVar.c(apdiVar12);
                                                        if (((alaa) alsiVar).n.l((alac) apdiVar12.a)) {
                                                            new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_LLM_INFERENCE_RESULT).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: naj
                                                                public final java.lang.Object b(java.lang.Object obj2) {
                                                                    return ((defpackage.mtq) obj2).name();
                                                                }
                                                            }, 5));
                                                            aimz aimzVar2 = defpackage.nbn.a;
                                                            aimzVar2.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmInferenceResultEvent", 945, "DobbyDuplexListener.kt").v("handling llm inference result event");
                                                            aooh.e(apdiVar12, "llmInferenceResultEvent");
                                                            alsa alsaVar = (alsa) akmr.x(alsiVar, apdiVar12);
                                                            int i3 = alsaVar.b;
                                                            if (i3 == 0) {
                                                                i2 = 3;
                                                            } else if (i3 == 1) {
                                                                i2 = 1;
                                                            } else if (i3 == 2) {
                                                                i2 = 2;
                                                            }
                                                            if (i2 == 0) {
                                                                throw null;
                                                            }
                                                            int i4 = i2 - 1;
                                                            if (i4 == 0) {
                                                                objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_INFERENCE_FAILURE, this);
                                                                if (objO != aoluVar) {
                                                                    objO = aojh.a;
                                                                }
                                                            } else if (i4 == 1) {
                                                                if ((i3 == 2 ? (alsb) alsaVar.c : alsb.a).c == 0) {
                                                                    objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_INFERENCE_SUCCESS_EMPTY, this);
                                                                    if (objO != aoluVar) {
                                                                        objO = aojh.a;
                                                                    }
                                                                } else {
                                                                    objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_LLM_INFERENCE_SUCCESS, this);
                                                                    if (objO != aoluVar) {
                                                                        objO = aojh.a;
                                                                    }
                                                                }
                                                            } else {
                                                                if (i4 != 2) {
                                                                    throw new aois();
                                                                }
                                                                aimzVar2.d().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleLlmInferenceResultEvent", 957, "DobbyDuplexListener.kt").v("LlmInferenceResultEvent has no result");
                                                                objO = aojh.a;
                                                            }
                                                            if (objO != aoluVar) {
                                                                objO = aojh.a;
                                                            }
                                                        } else {
                                                            apdi apdiVar13 = alrm.d;
                                                            alsiVar.c(apdiVar13);
                                                            if (((alaa) alsiVar).n.l((alac) apdiVar13.a)) {
                                                                new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_EXTRACTION_RESULT).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nak
                                                                    public final java.lang.Object b(java.lang.Object obj2) {
                                                                        return ((defpackage.mtq) obj2).name();
                                                                    }
                                                                }, 6));
                                                                objO = nbnVar.i(alsiVar, this);
                                                                if (objO != aoluVar) {
                                                                    objO = aojh.a;
                                                                }
                                                            } else {
                                                                apdi apdiVar14 = alwp.b;
                                                                aooh.e(apdiVar14, "callAssistantOutboundEvent");
                                                                alwp alwpVar = (alwp) akmr.x(alsiVar, apdiVar14);
                                                                aooh.c(alwpVar);
                                                                if (defpackage.nbn.t(alwpVar)) {
                                                                    new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_CONVERSATION_STATE).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nal
                                                                        public final java.lang.Object b(java.lang.Object obj2) {
                                                                            return ((defpackage.mtq) obj2).name();
                                                                        }
                                                                    }, 7));
                                                                    objO = nbnVar.h(alwpVar, this);
                                                                    if (objO != aoluVar) {
                                                                        objO = aojh.a;
                                                                    }
                                                                } else {
                                                                    apdi apdiVar15 = alyn.e;
                                                                    alwpVar.c(apdiVar15);
                                                                    if (((alaa) alwpVar).n.l((alac) apdiVar15.a)) {
                                                                        new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_TRANSCRIPT_SUMMARY).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nam
                                                                            public final java.lang.Object b(java.lang.Object obj2) {
                                                                                return ((defpackage.mtq) obj2).name();
                                                                            }
                                                                        }, 8));
                                                                        objO = nbnVar.p(alwpVar, this);
                                                                        if (objO != aoluVar) {
                                                                            objO = aojh.a;
                                                                        }
                                                                    } else if (defpackage.nbn.w(alwpVar)) {
                                                                        new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_SPAM_DECISION).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nan
                                                                            public final java.lang.Object b(java.lang.Object obj2) {
                                                                                return ((defpackage.mtq) obj2).name();
                                                                            }
                                                                        }, 9));
                                                                        objO = nbnVar.m(alwpVar, this);
                                                                        if (objO != aoluVar) {
                                                                            objO = aojh.a;
                                                                        }
                                                                    } else if (defpackage.nbn.u(alwpVar)) {
                                                                        new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_ROBOCALL_DETECTED).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nao
                                                                            public final java.lang.Object b(java.lang.Object obj2) {
                                                                                return ((defpackage.mtq) obj2).name();
                                                                            }
                                                                        }, 10));
                                                                        defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleRobocallDetectedEvent", 992, "DobbyDuplexListener.kt").v("handling robocall detected event");
                                                                        objO = nbnVar.c.x(defpackage.nvp.EVENT_DUPLEX_ROBOCALL_DETECTED, this);
                                                                        if (objO != aoluVar) {
                                                                            objO = aojh.a;
                                                                        }
                                                                    } else {
                                                                        apdi apdiVar16 = alwg.c;
                                                                        alwpVar.c(apdiVar16);
                                                                        if (((alaa) alwpVar).n.l((alac) apdiVar16.a)) {
                                                                            new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_AUDIO_MATCH).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: nap
                                                                                public final java.lang.Object b(java.lang.Object obj2) {
                                                                                    return ((defpackage.mtq) obj2).name();
                                                                                }
                                                                            }, 11));
                                                                            objO = nbnVar.g(alwpVar, this);
                                                                            if (objO != aoluVar) {
                                                                                objO = aojh.a;
                                                                            }
                                                                        } else {
                                                                            apdi apdiVar17 = alxb.d;
                                                                            alwpVar.c(apdiVar17);
                                                                            if (((alaa) alwpVar).n.l((alac) apdiVar17.a)) {
                                                                                new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_DARK_LAUNCH_SMART_REPLY).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.naa(new aoom() { // from class: naq
                                                                                    public final java.lang.Object b(java.lang.Object obj2) {
                                                                                        return ((defpackage.mtq) obj2).name();
                                                                                    }
                                                                                }, 12));
                                                                                defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleDarkLaunchSmartReplyEvent", 1009, "DobbyDuplexListener.kt").v("handling dark launch smart reply event");
                                                                                defpackage.mqt mqtVar3 = nbnVar.c;
                                                                                aooh.e(apdiVar17, "darkLaunchSmartReplyOutboundEvent");
                                                                                java.lang.String str = ((alxb) akmr.x(alwpVar, apdiVar17)).c;
                                                                                aooh.e(str, "getPredictedGroupIntent(...)");
                                                                                objO = mqtVar3.A(str, this);
                                                                                if (objO != aoluVar) {
                                                                                    objO = aojh.a;
                                                                                }
                                                                            } else {
                                                                                apdi apdiVar18 = alyf.e;
                                                                                alwpVar.c(apdiVar18);
                                                                                if (((alaa) alwpVar).n.l((alac) apdiVar18.a)) {
                                                                                    new mgr(nbnVar.f, defpackage.mtq.EVT_CMD_SUGGESTED_SMART_REPLY).b(defpackage.mfy.DUPLEX_CONVERSATION_EVENTS).c(new defpackage.jil(new aoom() { // from class: nar
                                                                                        public final java.lang.Object b(java.lang.Object obj2) {
                                                                                            return ((defpackage.mtq) obj2).name();
                                                                                        }
                                                                                    }, 15));
                                                                                    objO = nbnVar.o(alwpVar, this);
                                                                                    if (objO != aoluVar) {
                                                                                        objO = aojh.a;
                                                                                    }
                                                                                } else {
                                                                                    defpackage.nbn.a.b().l("com/android/dialer/dobby/impl/service/DobbyDuplexListener", "handleOutboundEvent", 399, "DobbyDuplexListener.kt").y("received unhandled Duplex event with id: %s", alsiVar.c);
                                                                                    objO = aojh.a;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (objO != aoluVar) {
                            objO = aojh.a;
                        }
                    }
                }
            }
            if (objO == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
