package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alun implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor");
    public static final j$.time.Duration b;
    public final defpackage.alvg c;
    public java.lang.String d;
    public int e;
    private final defpackage.allj f;
    private alln g;
    private boolean h;
    private defpackage.alvk i;
    private defpackage.alsu j;
    private j$.time.Duration k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private volatile java.util.Map r;
    private final defpackage.alqf s;

    static {
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(2L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        b = durationOfSeconds;
    }

    public alun(defpackage.alli alliVar, defpackage.alvg alvgVar, defpackage.alqf alqfVar) {
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alvgVar, "stateManager");
        aooh.f(alqfVar, "timerManager");
        this.c = alvgVar;
        this.s = alqfVar;
        this.f = alliVar.a("AGENTIC_CALL_SCREEN_ACTION_EXECUTOR");
        this.k = b;
        this.l = 2;
        this.e = 2;
        this.m = 2;
        this.n = 3;
        this.r = aokd.a;
    }

    public static /* synthetic */ void i(defpackage.alun alunVar, java.lang.String str, defpackage.alsy alsyVar, defpackage.alsz alszVar, defpackage.almy almyVar, defpackage.alxx alxxVar, int i) {
        if ((i & 4) != 0) {
            alszVar = defpackage.alsz.BOT;
        }
        if ((i & 8) != 0) {
            akzx akzxVarM = defpackage.almy.a.m();
            aooh.f(akzxVarM, "builder");
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            almyVar = (defpackage.almy) aladVarP;
        }
        if ((i & 16) != 0) {
            alxxVar = defpackage.alxx.NO_DECISION;
        }
        if (alxxVar != defpackage.alxx.NO_DECISION) {
            alunVar.p(alxxVar, alxxVar, almyVar);
        }
        xtq xtqVarN = defpackage.alpv.n(defpackage.alnf.a.m());
        xtqVarN.af(alszVar);
        if (str != null) {
            xtq xtqVarP = defpackage.alpv.p(defpackage.almm.a.m());
            xtqVarP.aj(str);
            xtqVarN.ad(xtqVarP.ai());
        }
        xtqVarN.ae(alsyVar);
        defpackage.alnf alnfVarAc = xtqVarN.ac();
        defpackage.allj alljVar = alunVar.f;
        xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
        xtqVarO.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
        apdi apdiVar = defpackage.alnf.k;
        aooh.e(apdiVar, "flowOutputEvent");
        xtqVarO.ax(apdiVar, alnfVarAc);
        alljVar.a(xtqVarO.ag(), almyVar);
    }

    private final int j() {
        if (this.q) {
            return 0;
        }
        return this.n;
    }

    private final defpackage.alum k(defpackage.alsy alsyVar, defpackage.alxx alxxVar) {
        defpackage.alsu alsuVar;
        defpackage.alsz alszVar = defpackage.alsz.BOT;
        java.lang.String strL = null;
        if (!this.p && (alsuVar = this.j) != null) {
            defpackage.alss alssVarB = defpackage.alss.b(alsuVar.c);
            if (alssVarB == null) {
                alssVarB = defpackage.alss.SPAM_STATUS_UNKNOWN;
            }
            int iOrdinal = alssVarB.ordinal();
            if (iOrdinal == 1) {
                int iAQ = a.aQ(alsuVar.e);
                if (iAQ != 0 && iAQ == 3) {
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "calculateScoobyOverride$<anonymous>", 658, "AgenticCallScreenActionExecutorProcessor.kt").v("Scooby signal is USER marked NOT_SPAM. Overriding action to START_RINGING.");
                    alsyVar = defpackage.alsy.START_RINGING;
                    alxxVar = defpackage.alxx.DECISION_NOT_SPAM;
                    strL = l(false);
                    alszVar = defpackage.alsz.USER;
                }
            } else if (iOrdinal == 2) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "calculateScoobyOverride$<anonymous>", 646, "AgenticCallScreenActionExecutorProcessor.kt").v("Scooby signal is SPAM. Overriding action to BLOCK.");
                alsyVar = defpackage.alsy.END_SPAM_CALL;
                alxxVar = defpackage.alxx.DECISION_SPAM;
                strL = l(true);
            }
        }
        return new defpackage.alum(alsyVar, alxxVar, strL, alszVar);
    }

    private final java.lang.String l(boolean z) {
        return z ? c(defpackage.alwb.SCOOBY_SPAM_VERDICT_TRIGGER, "KnownSpamBailout") : c(defpackage.alwb.SCOOBY_NOT_SPAM_VERDICT_SOURCE_IS_USER, "ConnectToUserNotSpam");
    }

    private final void m() {
        java.lang.String str = this.d;
        if (str != null) {
            this.s.a(str);
        }
        this.d = null;
    }

    private final void n(boolean z) {
        defpackage.alvg alvgVar = this.c;
        java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
        reentrantLock.lock();
        try {
            alvgVar.f = 0;
            reentrantLock.unlock();
            defpackage.alvg alvgVar2 = this.c;
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = alvgVar2.b;
            reentrantLock2.lock();
            try {
                alvgVar2.j = 0;
                reentrantLock2.unlock();
                defpackage.alvg alvgVar3 = this.c;
                java.util.concurrent.locks.ReentrantLock reentrantLock3 = alvgVar3.b;
                reentrantLock3.lock();
                try {
                    alvgVar3.h = true;
                    reentrantLock3.unlock();
                    defpackage.alvg alvgVar4 = this.c;
                    alvgVar4.f();
                    if (z) {
                        this.i = null;
                    }
                    if (alvgVar4.c == defpackage.alvd.d) {
                        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleNewSpeech", 523, "AgenticCallScreenActionExecutorProcessor.kt").v("Caller began speaking. Cancelling LLM verdict timeout.");
                        m();
                        alvgVar4.k(defpackage.alvd.b);
                    }
                } catch (java.lang.Throwable th) {
                    reentrantLock3.unlock();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cc A[PHI: r4
      0x00cc: PHI (r4v14 java.lang.String) = (r4v6 java.lang.String), (r4v16 java.lang.String) binds: [B:36:0x00bc, B:38:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    private final void o(defpackage.almy almyVar, defpackage.alvk alvkVar) {
        defpackage.alsy alsyVar;
        java.lang.String strC;
        java.lang.String str;
        defpackage.alvg alvgVar = this.c;
        java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
        reentrantLock.lock();
        try {
            alvgVar.g = 0;
            reentrantLock.unlock();
            defpackage.alvg alvgVar2 = this.c;
            alvgVar2.i(false);
            java.lang.String str2 = alvkVar.c;
            aooh.e(str2, "getAction(...)");
            if (aooh.n(str2, "BLOCK")) {
                alsyVar = this.o ? defpackage.alsy.START_RINGING : defpackage.alsy.END_SPAM_CALL;
            } else if (aooh.n(str2, "RING")) {
                alsyVar = defpackage.alsy.START_RINGING;
            } else {
                boolean zQ = q();
                aimz aimzVar = a;
                if (zQ) {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "getCallActionFromVerdict", 603, "AgenticCallScreenActionExecutorProcessor.kt").z("Exceeded maximum manual screen turns (%d > %d). Connecting call to user.", alvgVar2.b(), j());
                    alsyVar = defpackage.alsy.START_RINGING;
                } else {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "getCallActionFromVerdict", 613, "AgenticCallScreenActionExecutorProcessor.kt").y("Ignoring action: %s", str2);
                    alsyVar = defpackage.alsy.NO_ACTION;
                }
            }
            defpackage.alxx alxxVar = aooh.n(str2, "BLOCK") ? defpackage.alxx.DECISION_SPAM : defpackage.alxx.NO_DECISION;
            defpackage.alum alumVarK = k(alsyVar, alxxVar);
            p(alumVarK.b, alxxVar, almyVar);
            if (aooh.n(str2, "BLOCK")) {
                strC = this.o ? l(false) : l(true);
            } else if (aooh.n(str2, "RING")) {
                strC = l(false);
            } else {
                strC = q() ? c(defpackage.alwb.MAX_MANUAL_SCREEN_TURNS_TRIGGER, "ConnectToUserNotSpam") : null;
            }
            java.lang.String str3 = alumVarK.c;
            if (str3 != null) {
                str = str3;
            } else if (strC == null) {
                strC = alvkVar.d;
                aooh.c(strC);
                if (strC.length() <= 0) {
                    str = null;
                } else {
                    str = strC;
                }
            } else {
                str = strC;
            }
            defpackage.alsy alsyVar2 = alumVarK.a;
            h(alsyVar2);
            this.i = null;
            alvgVar2.f();
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "publishFlowOutputFromVerdict", 573, "AgenticCallScreenActionExecutorProcessor.kt").I("Emitting action %s, final callAction %s", str2, alsyVar2);
            i(this, str, alsyVar2, alumVarK.d, almyVar, null, 16);
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final void p(defpackage.alxx alxxVar, defpackage.alxx alxxVar2, defpackage.almy almyVar) {
        akzx akzxVarM = defpackage.alxy.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(alxxVar, "value");
        akzxVarM.u();
        defpackage.alxy alxyVar = (defpackage.alxy) akzxVarM.b;
        alxyVar.c = alxxVar.e;
        alxyVar.b |= 1;
        aooh.f(alxxVar2, "value");
        akzxVarM.u();
        defpackage.alxy alxyVar2 = (defpackage.alxy) akzxVarM.b;
        alxyVar2.e = alxxVar2.e;
        alxyVar2.b |= 4;
        defpackage.alsu alsuVar = this.j;
        if (alsuVar != null) {
            defpackage.alss alssVarB = defpackage.alss.b(alsuVar.c);
            if (alssVarB == null) {
                alssVarB = defpackage.alss.SPAM_STATUS_UNKNOWN;
            }
            akzxVarM.u();
            defpackage.alxy alxyVar3 = (defpackage.alxy) akzxVarM.b;
            alxyVar3.f = alssVarB.e;
            alxyVar3.b |= 8;
            int iAQ = a.aQ(alsuVar.e);
            int i = iAQ != 0 ? iAQ : 1;
            akzxVarM.u();
            defpackage.alxy alxyVar4 = (defpackage.alxy) akzxVarM.b;
            alxyVar4.g = i - 1;
            alxyVar4.b |= 16;
        }
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.alxy alxyVar5 = (defpackage.alxy) aladVarP;
        akzz akzzVarM = defpackage.alox.a.m();
        aooh.f(akzzVarM, "builder");
        apdi apdiVar = defpackage.alou.b;
        aooh.e(apdiVar, "spamDecisionEvent");
        aooh.f(apdiVar, "extension");
        aooh.f(alxyVar5, "value");
        akzzVarM.bV(apdiVar, alxyVar5);
        defpackage.alox aloxVarP = akzzVarM.p();
        aooh.e(aloxVarP, "build(...)");
        defpackage.allj alljVar = this.f;
        xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
        xtqVarO.ah(defpackage.alnb.EVENT_STATE_UPDATE);
        apdi apdiVar2 = defpackage.alox.b;
        aooh.e(apdiVar2, "stateUpdateEvent");
        xtqVarO.ax(apdiVar2, aloxVarP);
        alljVar.a(xtqVarO.ag(), almyVar);
        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "publishSpamDecisionEventForAnalytics", 728, "AgenticCallScreenActionExecutorProcessor.kt").y("Published SpamDecisionEvent: %s", alxxVar);
    }

    private final boolean q() {
        return this.p && this.c.b() > j();
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarV = aihd.v(defpackage.alnb.EVENT_START_CONVERSATION, defpackage.alnb.EVENT_AGENTIC_NEW_MODEL_VERDICT, defpackage.alnb.EVENT_SILENCE_DETECTED, defpackage.alnb.EVENT_ASR_PARTIAL_CHUNK, defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE, defpackage.alnb.EVENT_ENDPOINT_SPEECH_START, new defpackage.alnb[]{defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL, defpackage.alnb.EVENT_USER_JOIN_CALL, defpackage.alnb.EVENT_USER_END_CALL, defpackage.alnb.EVENT_END_SAY_TIMING, defpackage.alnb.EVENT_LLM_FEATURE_MISSING});
        aooh.e(aihdVarV, "of(...)");
        return aihdVarV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        java.lang.Object obj;
        ?? r0;
        java.lang.String strC;
        defpackage.alsy alsyVar;
        aooh.f(almyVar, "event");
        defpackage.alvg alvgVar = this.c;
        if (alvgVar.m()) {
            return;
        }
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        aooh.e(almzVar, "getData(...)");
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        int i = 1;
        if (iOrdinal == 9) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
            reentrantLock.lock();
            try {
                alvgVar.k = 0;
                reentrantLock.unlock();
                defpackage.alsy alsyVarC = defpackage.alsy.NO_ACTION;
                xtq xtqVarN = defpackage.alpv.n(defpackage.alnf.a.m());
                xtqVarN.af(defpackage.alsz.BOT);
                try {
                    if (this.q) {
                        r0 = "DisclosureUrgent";
                    } else {
                        alln allnVar = this.g;
                        if (allnVar == null || (obj = allnVar.b) == null) {
                            r0 = obj;
                            r0 = "";
                        }
                    }
                    r0 = obj;
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleStartConversation$<anonymous>", 777, "AgenticCallScreenActionExecutorProcessor.kt").y("Starting conversation with initial intent: %s", (java.lang.Object) r0);
                    if (r0.length() > 0) {
                        alln allnVar2 = this.g;
                        if (allnVar2 != null) {
                            alsyVarC = allnVar2.c((java.lang.String) r0);
                        }
                        xtq xtqVarP = defpackage.alpv.p(defpackage.almm.a.m());
                        xtqVarP.aj((java.lang.String) r0);
                        xtqVarN.ad(xtqVarP.ai());
                        this.c.i(true);
                    }
                } catch (java.lang.RuntimeException e) {
                    a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleStartConversation$<anonymous>", 787, "AgenticCallScreenActionExecutorProcessor.kt").v("Failed to get initial bot intent or action");
                }
                xtqVarN.ae(alsyVarC);
                defpackage.alnf alnfVarAc = xtqVarN.ac();
                this.c.k(defpackage.alvd.c);
                defpackage.allj alljVar = this.f;
                xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                xtqVarO.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
                apdi apdiVar = defpackage.alnf.k;
                aooh.e(apdiVar, "flowOutputEvent");
                xtqVarO.ax(apdiVar, alnfVarAc);
                alljVar.a(xtqVarO.ag(), almyVar);
                return;
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (iOrdinal == 12) {
            defpackage.alvg alvgVar2 = this.c;
            if (alvgVar2.c == defpackage.alvd.c) {
                alvgVar2.k(defpackage.alvd.b);
            }
            alvgVar2.i(false);
            return;
        }
        if (iOrdinal == 26) {
            defpackage.alvg alvgVar3 = this.c;
            if (alvgVar3.c == defpackage.alvd.d) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "consume", 225, "AgenticCallScreenActionExecutorProcessor.kt").v("Caller began speaking (ENDPOINT_SPEECH_START). Cancelling LLM verdict timeout.");
                m();
                alvgVar3.k(defpackage.alvd.b);
                return;
            }
            return;
        }
        if (iOrdinal == 63) {
            defpackage.alvg alvgVar4 = this.c;
            defpackage.alvd alvdVar = alvgVar4.c;
            if (alvdVar == defpackage.alvd.j || alvdVar == defpackage.alvd.f || alvdVar == defpackage.alvd.e) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleLlmFeatureMissing", 739, "AgenticCallScreenActionExecutorProcessor.kt").y("Ignoring EVENT_LLM_FEATURE_MISSING in state %s", alvgVar4.c);
                return;
            }
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleLlmFeatureMissing", 744, "AgenticCallScreenActionExecutorProcessor.kt").v("LLM feature missing or incompatible. Connecting call to user immediately.");
            m();
            defpackage.allj alljVar2 = this.f;
            xtq xtqVarO2 = defpackage.alpv.o(defpackage.almz.a.m());
            xtqVarO2.ah(defpackage.alnb.EVENT_STOP_BOT_SPEECH);
            alljVar2.a(xtqVarO2.ag(), almyVar);
            java.lang.String strC2 = c(defpackage.alwb.LLM_FEATURE_MISSING_BAILOUT_TRIGGER, "ConnectToUserNotSpam");
            defpackage.alsy alsyVar2 = defpackage.alsy.START_RINGING;
            i(this, strC2, alsyVar2, null, almyVar, defpackage.alxx.DECISION_NOT_SPAM, 4);
            h(alsyVar2);
            return;
        }
        if (iOrdinal == 53) {
            n(true);
            return;
        }
        if (iOrdinal == 54) {
            apdi apdiVar2 = defpackage.alvm.f;
            aooh.e(apdiVar2, "asrPartialChunkEvent");
            defpackage.alvm alvmVar = (defpackage.alvm) akmr.x(almzVar, apdiVar2);
            if (alvmVar != null) {
                if (alvmVar.d) {
                    n(this.h);
                    return;
                }
                defpackage.alvg alvgVar5 = this.c;
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = alvgVar5.b;
                reentrantLock2.lock();
                try {
                    alvgVar5.i = true;
                    return;
                } finally {
                    reentrantLock2.unlock();
                }
            }
            return;
        }
        if (iOrdinal == 56) {
            defpackage.alvg alvgVar6 = this.c;
            java.util.concurrent.locks.ReentrantLock reentrantLock3 = alvgVar6.b;
            reentrantLock3.lock();
            try {
                alvgVar6.k++;
                reentrantLock3.unlock();
                defpackage.alvk alvkVar = this.i;
                if (alvkVar != null) {
                    o(almyVar, alvkVar);
                    return;
                }
                defpackage.alvg alvgVar7 = this.c;
                java.util.concurrent.locks.ReentrantLock reentrantLock4 = alvgVar7.b;
                reentrantLock4.lock();
                try {
                    boolean z = alvgVar7.h;
                    reentrantLock4.unlock();
                    if (!z) {
                        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "consume", 198, "AgenticCallScreenActionExecutorProcessor.kt").v("Silence detected, no remote speech, playing fallback immediately.");
                        g(false);
                        return;
                    }
                    this.c.k(defpackage.alvd.d);
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "consume", 205, "AgenticCallScreenActionExecutorProcessor.kt").v("Silence detected but no cached LLM verdict exists. Starting LLM verdict timeout.");
                    m();
                    try {
                        this.d = this.s.b(new defpackage.alvr(this, i), this.k);
                        return;
                    } catch (defpackage.aljs e2) {
                        a.d().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "startLlmVerdictTimeoutDuringSilence", 253, "AgenticCallScreenActionExecutorProcessor.kt").v("Failed to schedule LLM verdict timeout");
                        return;
                    }
                } catch (java.lang.Throwable th2) {
                    reentrantLock4.unlock();
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                reentrantLock3.unlock();
                throw th3;
            }
        }
        if (iOrdinal == 57) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar3 = defpackage.alvk.e;
            aooh.e(apdiVar3, "agenticNewModelVerdictEvent");
            defpackage.alvk alvkVar2 = (defpackage.alvk) akmr.x(almzVar2, apdiVar3);
            if (alvkVar2 != null) {
                java.lang.String str = alvkVar2.c;
                aooh.e(str, "getAction(...)");
                int i2 = (str.equals("BLOCK") || str.equals("RING")) ? 1 : 0;
                defpackage.alvg alvgVar8 = this.c;
                defpackage.alvd alvdVar2 = alvgVar8.c;
                defpackage.alvd alvdVar3 = defpackage.alvd.d;
                if (alvdVar2 == alvdVar3 || alvdVar2 == defpackage.alvd.b) {
                    i = i2;
                } else if (alvdVar2 != defpackage.alvd.c || i2 == 0) {
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleNewModelVerdict", 822, "AgenticCallScreenActionExecutorProcessor.kt").y("Ignoring verdict received in state %s", alvgVar8.c);
                    return;
                }
                this.i = alvkVar2;
                aimz aimzVar = a;
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleNewModelVerdict", 828, "AgenticCallScreenActionExecutorProcessor.kt").I("Cached new model verdict: action=%s, intent=%s", alvkVar2.c, alvkVar2.d);
                defpackage.alvd alvdVar4 = alvgVar8.c;
                if (alvdVar4 == alvdVar3 || !(alvdVar4 != defpackage.alvd.c || i == 0 || alvgVar8.l())) {
                    if (alvgVar8.c == defpackage.alvd.c) {
                        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleNewModelVerdict", 840, "AgenticCallScreenActionExecutorProcessor.kt").v("Interrupting bot speech with terminal verdict.");
                        defpackage.allj alljVar3 = this.f;
                        xtq xtqVarO3 = defpackage.alpv.o(defpackage.almz.a.m());
                        xtqVarO3.ah(defpackage.alnb.EVENT_STOP_BOT_SPEECH);
                        alljVar3.a(xtqVarO3.ag(), almyVar);
                    }
                    m();
                    o(almyVar, alvkVar2);
                    return;
                }
                return;
            }
            return;
        }
        switch (iOrdinal) {
            case 21:
            case 22:
                aimw aimwVarL = a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleUserIntervention", 265, "AgenticCallScreenActionExecutorProcessor.kt");
                defpackage.almz almzVar3 = almyVar.h;
                if (almzVar3 == null) {
                    almzVar3 = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar3.c);
                if (alnbVarB2 == null) {
                    alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
                }
                aimwVarL.y("User intervention detected: %s. Stopping bot and finishing session.", alnbVarB2);
                m();
                defpackage.allj alljVar4 = this.f;
                defpackage.almz almzVar4 = defpackage.almz.a;
                xtq xtqVarO4 = defpackage.alpv.o(almzVar4.m());
                xtqVarO4.ah(defpackage.alnb.EVENT_STOP_BOT_SPEECH);
                alljVar4.a(xtqVarO4.ag(), almyVar);
                defpackage.almz almzVar5 = almyVar.h;
                if (almzVar5 != null) {
                    almzVar4 = almzVar5;
                }
                defpackage.alnb alnbVarB3 = defpackage.alnb.b(almzVar4.c);
                if (alnbVarB3 == null) {
                    alnbVarB3 = defpackage.alnb.EVENT_UNKNOWN;
                }
                if (alnbVarB3.ordinal() != 21) {
                    strC = c(defpackage.alwb.USER_JOIN_CALL_TRIGGER, "JoinCall");
                    alsyVar = defpackage.alsy.ANSWER_CALL;
                } else {
                    strC = c(defpackage.alwb.USER_END_CALL_TRIGGER, "EndCall");
                    alsyVar = defpackage.alsy.END_CALL;
                }
                defpackage.alsy alsyVarC2 = alsyVar;
                java.lang.String str2 = strC;
                try {
                    alln allnVar3 = this.g;
                    if (allnVar3 != null) {
                        alsyVarC2 = allnVar3.c(str2);
                    }
                    break;
                } catch (java.lang.RuntimeException e3) {
                    a.d().k(e3).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleUserIntervention", 285, "AgenticCallScreenActionExecutorProcessor.kt").y("Failed to find %s intent mapping.", str2);
                }
                xtq xtqVarN2 = defpackage.alpv.n(defpackage.alnf.a.m());
                xtqVarN2.af(defpackage.alsz.USER);
                xtq xtqVarP2 = defpackage.alpv.p(defpackage.almm.a.m());
                xtqVarP2.aj(str2);
                xtqVarN2.ad(xtqVarP2.ai());
                xtqVarN2.ae(alsyVarC2);
                defpackage.alnf alnfVarAc2 = xtqVarN2.ac();
                defpackage.allj alljVar5 = this.f;
                xtq xtqVarO5 = defpackage.alpv.o(defpackage.almz.a.m());
                xtqVarO5.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
                apdi apdiVar4 = defpackage.alnf.k;
                aooh.e(apdiVar4, "flowOutputEvent");
                xtqVarO5.ax(apdiVar4, alnfVarAc2);
                alljVar5.a(xtqVarO5.ag(), almyVar);
                this.c.k(defpackage.alvd.j);
                return;
            case 23:
                defpackage.almz almzVar6 = almyVar.h;
                if (almzVar6 == null) {
                    almzVar6 = defpackage.almz.a;
                }
                apdi apdiVar5 = defpackage.alow.b;
                aooh.e(apdiVar5, "spamSignalInternalEvent");
                defpackage.alsu alsuVar = (defpackage.alsu) akmr.x(almzVar6, apdiVar5);
                if (alsuVar != null) {
                    this.j = alsuVar;
                    aimw aimwVarL2 = a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleScoobySpamSignal$<anonymous>", 852, "AgenticCallScreenActionExecutorProcessor.kt");
                    defpackage.alss alssVarB = defpackage.alss.b(alsuVar.c);
                    if (alssVarB == null) {
                        alssVarB = defpackage.alss.SPAM_STATUS_UNKNOWN;
                    }
                    aimwVarL2.y("Cached Scooby spam signal: %s", alssVarB);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final java.lang.String c(defpackage.alwb alwbVar, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.r.get(alwbVar);
        return str2 != null ? str2 : str;
    }

    @Override // defpackage.allg
    public final void e() {
        m();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        akzm akzmVar;
        aooh.f(alqhVar, "callContext");
        aooh.f(alqkVar, "conversationContext");
        aooh.f(almbVar, "assetConfig");
        aooh.f(almlVar, "botConfig");
        aooh.f(alkfVar, "experimentChecker");
        this.g = alln.g(alqdVar, almbVar.f, alkfVar);
        apdi apdiVar = defpackage.alvz.p;
        aooh.e(apdiVar, "agenticBotConfig");
        defpackage.alvz alvzVar = (defpackage.alvz) akmr.x(almlVar, apdiVar);
        if (alvzVar != null) {
            this.h = alvzVar.g;
            if ((alvzVar.b & 512) != 0) {
                akzmVar = alvzVar.h;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
            } else {
                akzmVar = null;
            }
            if (akzmVar != null) {
                j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(akzmVar.b);
                aooh.e(durationOfSeconds, "ofSeconds(...)");
                if (a.a(durationOfSeconds)) {
                    this.k = durationOfSeconds;
                }
            }
            int i = alvzVar.b;
            if ((i & 2048) != 0) {
                this.l = alvzVar.i;
            }
            if ((i & 4096) != 0) {
                this.e = alvzVar.j;
            }
            if ((i & 32768) != 0) {
                this.m = alvzVar.m;
            }
            int i2 = alvzVar.o;
            if (i2 > 0) {
                this.n = i2;
            }
            alat alatVar = alvzVar.f;
            aooh.e(alatVar, "getIntentTriggerList(...)");
            java.util.ArrayList<defpackage.alwc> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : alatVar) {
                defpackage.alwc alwcVar = (defpackage.alwc) obj;
                java.lang.String str = alwcVar.c;
                aooh.e(str, "getTriggeredIntentName(...)");
                if (aoov.H(str)) {
                    aimw aimwVarL = a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "init$<anonymous>$<anonymous>", 129, "AgenticCallScreenActionExecutorProcessor.kt");
                    defpackage.alwb alwbVarB = defpackage.alwb.b(alwcVar.b);
                    if (alwbVarB == null) {
                        alwbVarB = defpackage.alwb.NO_TRIGGER;
                    }
                    aimwVarL.y("Trigger %s has blank intent name.", alwbVarB);
                } else {
                    try {
                        alln allnVar = this.g;
                        if (allnVar != null) {
                            allnVar.c(str);
                        }
                        arrayList.add(obj);
                    } catch (java.lang.RuntimeException e) {
                        aimw aimwVarL2 = a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "init$<anonymous>$<anonymous>", 139, "AgenticCallScreenActionExecutorProcessor.kt");
                        defpackage.alwb alwbVarB2 = defpackage.alwb.b(alwcVar.b);
                        if (alwbVarB2 == null) {
                            alwbVarB2 = defpackage.alwb.NO_TRIGGER;
                        }
                        aimwVarL2.I("Trigger %s maps to unknown intent: %s", alwbVarB2, str);
                    }
                }
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(arrayList, 10)), 16));
            for (defpackage.alwc alwcVar2 : arrayList) {
                defpackage.alwb alwbVarB3 = defpackage.alwb.b(alwcVar2.b);
                if (alwbVarB3 == null) {
                    alwbVarB3 = defpackage.alwb.NO_TRIGGER;
                }
                aoiu aoiuVar = new aoiu(alwbVarB3, alwcVar2.c);
                linkedHashMap.put(aoiuVar.a, aoiuVar.b);
            }
            this.r = linkedHashMap;
        }
        this.q = false;
        apdi apdiVar2 = defpackage.alwn.r;
        aooh.e(apdiVar2, "callAssistantConversationContext");
        java.lang.Object objX = akmr.x(alqkVar, apdiVar2);
        aooh.e(objX, "get(...)");
        defpackage.alxe alxeVarS = airh.s((alwo) objX);
        if (alxeVarS != null) {
            akzm akzmVar2 = alxeVarS.c;
            if (akzmVar2 == null) {
                akzmVar2 = akzm.a;
            }
            aooh.e(akzmVar2, "getTimeoutThresholdDuration(...)");
            j$.time.Duration durationAv = aooc.av(akzmVar2);
            if (a.a(durationAv)) {
                this.k = durationAv;
            }
            this.o = alxeVarS.g;
            this.p = alxeVarS.h;
            this.q = alxeVarS.k;
            int i3 = alxeVarS.j;
            if (i3 > 0) {
                this.n = i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0095  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:24:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0114  */
    /* JADX WARN: Code duplicated, block: B:27:0x0126  */
    /* JADX WARN: Code duplicated, block: B:33:0x0155 A[Catch: RuntimeException -> 0x015a, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x015a, blocks: (B:31:0x0151, B:33:0x0155), top: B:57:0x0151 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0180  */
    /* JADX WARN: Code duplicated, block: B:40:0x0182  */
    public final void g(boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        int i;
        defpackage.alun alunVar;
        aimz aimzVar;
        java.util.concurrent.locks.ReentrantLock reentrantLock2;
        java.lang.String strC;
        defpackage.alsy alsyVarC;
        java.lang.String str;
        java.lang.String str2;
        alln allnVar;
        defpackage.alvg alvgVar = this.c;
        java.util.concurrent.locks.ReentrantLock reentrantLock3 = alvgVar.b;
        reentrantLock3.lock();
        try {
            defpackage.alve alveVar = new defpackage.alve(alvgVar.h, alvgVar.i);
            reentrantLock3.unlock();
            if (!alveVar.b || alveVar.a) {
                defpackage.alvg alvgVar2 = this.c;
                reentrantLock = alvgVar2.b;
                reentrantLock.lock();
                try {
                    i = alvgVar2.f;
                    reentrantLock.unlock();
                    if (i >= this.l) {
                        a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeSpamBailoutAction", 412, "AgenticCallScreenActionExecutorProcessor.kt").v("Reached maximum consecutive silence events without remote speech. Ending call as spam.");
                        java.lang.String strC2 = c(defpackage.alwb.MAX_SILENCE_TIMEOUT_TRIGGER, "KnownSpamBailout");
                        defpackage.alsy alsyVar = defpackage.alsy.END_SPAM_CALL;
                        alunVar = this;
                        i(alunVar, strC2, alsyVar, null, null, defpackage.alxx.DECISION_SPAM, 12);
                        h(alsyVar);
                    } else if (q()) {
                        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeFallbackAction", 380, "AgenticCallScreenActionExecutorProcessor.kt").z("Exceeded maximum manual screen turns (%d > %d) during fallback. Connecting call to user.", this.c.b(), j());
                        java.lang.String strC3 = c(defpackage.alwb.MAX_MANUAL_SCREEN_TURNS_TRIGGER, "ConnectToUserNotSpam");
                        defpackage.alsy alsyVar2 = defpackage.alsy.START_RINGING;
                        alunVar = this;
                        i(alunVar, strC3, alsyVar2, null, null, defpackage.alxx.DECISION_NOT_SPAM, 12);
                        alunVar.h(alsyVar2);
                    } else {
                        alunVar = this;
                        aimzVar = a;
                        if (z) {
                            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeRepeatRequestAction", 458, "AgenticCallScreenActionExecutorProcessor.kt").v("LLM verdict timeout reached during silence. Repeating request to remote to speak.");
                        } else {
                            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeRepeatRequestAction", 460, "AgenticCallScreenActionExecutorProcessor.kt").v("Remote remained silent. Repeating request to remote to speak.");
                        }
                        defpackage.alvg alvgVar3 = alunVar.c;
                        reentrantLock2 = alvgVar3.b;
                        reentrantLock2.lock();
                        try {
                            alvgVar3.f++;
                            reentrantLock2.unlock();
                            strC = alunVar.c(defpackage.alwb.TIMEOUT_TRIGGER, "Fallback");
                            alsyVarC = defpackage.alsy.NO_ACTION;
                            try {
                                allnVar = alunVar.g;
                                if (allnVar != null) {
                                    alsyVarC = allnVar.c(strC);
                                }
                            } catch (java.lang.RuntimeException e) {
                                a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeRepeatRequestAction", 475, "AgenticCallScreenActionExecutorProcessor.kt").v("Failed to find fallback intent mapping.");
                            }
                            defpackage.alum alumVarK = alunVar.k(alsyVarC, defpackage.alxx.NO_DECISION);
                            defpackage.alsy alsyVar3 = alumVarK.a;
                            str = alumVarK.c;
                            if (str == null) {
                                str2 = strC;
                            } else {
                                str2 = str;
                            }
                            i(alunVar, str2, alsyVar3, alumVarK.d, null, alumVarK.b, 8);
                            alunVar.h(alsyVar3);
                        } catch (java.lang.Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } else {
                defpackage.alvg alvgVar4 = this.c;
                java.util.concurrent.locks.ReentrantLock reentrantLock4 = alvgVar4.b;
                reentrantLock4.lock();
                try {
                    alvgVar4.j++;
                    reentrantLock4.unlock();
                    aimz aimzVar2 = a;
                    aimw aimwVarL = aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeFallbackAction", 361, "AgenticCallScreenActionExecutorProcessor.kt");
                    defpackage.alvg alvgVar5 = this.c;
                    aimwVarL.w("Low confidence turn detected. Consecutive count: %d", alvgVar5.a());
                    if (alvgVar5.a() >= this.m) {
                        aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeFallbackAction", 373, "AgenticCallScreenActionExecutorProcessor.kt").v("Reached maximum consecutive low confidence turns. Connecting call to user.");
                        aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeLowConfidenceBailoutAction", 428, "AgenticCallScreenActionExecutorProcessor.kt").v("Ending screening due to consecutive low confidence ASR. Connecting to user.");
                        java.lang.String strC4 = c(defpackage.alwb.ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER, "ConnectToUserNotSpam");
                        defpackage.alsy alsyVar4 = defpackage.alsy.START_RINGING;
                        alunVar = this;
                        i(alunVar, strC4, alsyVar4, null, null, defpackage.alxx.DECISION_NOT_SPAM, 12);
                        h(alsyVar4);
                    } else {
                        defpackage.alvg alvgVar6 = this.c;
                        reentrantLock = alvgVar6.b;
                        reentrantLock.lock();
                        i = alvgVar6.f;
                        reentrantLock.unlock();
                        if (i >= this.l) {
                            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeSpamBailoutAction", 412, "AgenticCallScreenActionExecutorProcessor.kt").v("Reached maximum consecutive silence events without remote speech. Ending call as spam.");
                            java.lang.String strC5 = c(defpackage.alwb.MAX_SILENCE_TIMEOUT_TRIGGER, "KnownSpamBailout");
                            defpackage.alsy alsyVar5 = defpackage.alsy.END_SPAM_CALL;
                            alunVar = this;
                            i(alunVar, strC5, alsyVar5, null, null, defpackage.alxx.DECISION_SPAM, 12);
                            h(alsyVar5);
                        } else if (q()) {
                            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeFallbackAction", 380, "AgenticCallScreenActionExecutorProcessor.kt").z("Exceeded maximum manual screen turns (%d > %d) during fallback. Connecting call to user.", this.c.b(), j());
                            java.lang.String strC6 = c(defpackage.alwb.MAX_MANUAL_SCREEN_TURNS_TRIGGER, "ConnectToUserNotSpam");
                            defpackage.alsy alsyVar6 = defpackage.alsy.START_RINGING;
                            alunVar = this;
                            i(alunVar, strC6, alsyVar6, null, null, defpackage.alxx.DECISION_NOT_SPAM, 12);
                            alunVar.h(alsyVar6);
                        } else {
                            alunVar = this;
                            aimzVar = a;
                            if (z) {
                                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeRepeatRequestAction", 458, "AgenticCallScreenActionExecutorProcessor.kt").v("LLM verdict timeout reached during silence. Repeating request to remote to speak.");
                            } else {
                                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "executeRepeatRequestAction", 460, "AgenticCallScreenActionExecutorProcessor.kt").v("Remote remained silent. Repeating request to remote to speak.");
                            }
                            defpackage.alvg alvgVar7 = alunVar.c;
                            reentrantLock2 = alvgVar7.b;
                            reentrantLock2.lock();
                            alvgVar7.f++;
                            reentrantLock2.unlock();
                            strC = alunVar.c(defpackage.alwb.TIMEOUT_TRIGGER, "Fallback");
                            alsyVarC = defpackage.alsy.NO_ACTION;
                            allnVar = alunVar.g;
                            if (allnVar != null) {
                                alsyVarC = allnVar.c(strC);
                            }
                            defpackage.alum alumVarK2 = alunVar.k(alsyVarC, defpackage.alxx.NO_DECISION);
                            defpackage.alsy alsyVar7 = alumVarK2.a;
                            str = alumVarK2.c;
                            if (str == null) {
                                str2 = strC;
                            } else {
                                str2 = str;
                            }
                            i(alunVar, str2, alsyVar7, alumVarK2.d, null, alumVarK2.b, 8);
                            alunVar.h(alsyVar7);
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    reentrantLock4.unlock();
                    throw th3;
                }
            }
            defpackage.alvg alvgVar8 = alunVar.c;
            alvgVar8.g();
            alvgVar8.f();
        } catch (java.lang.Throwable th4) {
            reentrantLock3.unlock();
            throw th4;
        }
    }

    public final void h(defpackage.alsy alsyVar) {
        defpackage.alvd alvdVar;
        int iOrdinal = alsyVar.ordinal();
        if (iOrdinal != 2) {
            alvdVar = iOrdinal != 3 ? defpackage.alvd.c : defpackage.alvd.f;
        } else {
            alvdVar = defpackage.alvd.e;
        }
        this.c.k(alvdVar);
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
