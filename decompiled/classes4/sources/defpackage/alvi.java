package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvi implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor");
    private static final j$.time.Duration g;
    private static final j$.time.Duration h;
    private static final j$.time.Duration i;
    private static final j$.time.Duration j;
    public final defpackage.alvg b;
    public final defpackage.allj c;
    public java.lang.String d;
    public boolean e;
    public j$.time.Duration f;
    private java.lang.String k;
    private java.lang.String l;
    private alln m;
    private j$.time.Duration n;
    private j$.time.Duration o;
    private j$.time.Duration p;
    private long q;
    private java.util.List r;
    private final defpackage.alqf s;

    static {
        j$.time.Duration durationOfMinutes = j$.time.Duration.ofMinutes(2L);
        aooh.e(durationOfMinutes, "ofMinutes(...)");
        g = durationOfMinutes;
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(10L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        h = durationOfSeconds;
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(500L);
        aooh.e(durationOfMillis, "ofMillis(...)");
        i = durationOfMillis;
        j$.time.Duration durationOfSeconds2 = j$.time.Duration.ofSeconds(5L);
        aooh.e(durationOfSeconds2, "ofSeconds(...)");
        j = durationOfSeconds2;
    }

    public alvi(defpackage.alvg alvgVar, defpackage.alli alliVar, defpackage.alqf alqfVar) {
        aooh.f(alvgVar, "stateManager");
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alqfVar, "timerManager");
        this.b = alvgVar;
        this.s = alqfVar;
        this.c = alliVar.a("AGENTIC_CALL_SCREEN_TAKE_A_MESSAGE");
        this.n = i;
        this.f = j;
        this.o = g;
        this.p = h;
        this.r = aokc.a;
    }

    private final void h() {
        java.lang.String str = this.d;
        if (str != null) {
            this.s.a(str);
        }
        this.d = null;
    }

    private final void i() {
        java.lang.String str = this.l;
        if (str != null) {
            this.s.a(str);
        }
        this.l = null;
    }

    private final void j() {
        java.lang.String str = this.k;
        if (str != null) {
            this.s.a(str);
        }
        this.k = null;
    }

    private final void k(defpackage.almy almyVar) {
        j();
        i();
        h();
        this.b.k(defpackage.alvd.h);
        defpackage.almz almzVar = defpackage.almz.a;
        xtq xtqVarO = defpackage.alpv.o(almzVar.m());
        xtqVarO.ah(defpackage.alnb.EVENT_STOP_BOT_SPEECH);
        defpackage.almz almzVarAg = xtqVarO.ag();
        defpackage.allj alljVar = this.c;
        alljVar.a(almzVarAg, almyVar);
        xtq xtqVarO2 = defpackage.alpv.o(almzVar.m());
        xtqVarO2.ah(defpackage.alnb.EVENT_SMART_REPLY_OPTIONS);
        apdi apdiVar = defpackage.aloz.b;
        aooh.e(apdiVar, "suggestSmartRepliesEvent");
        xtqVarO2.ax(apdiVar, airh.C(defpackage.alyf.a.m()).av());
        alljVar.a(xtqVarO2.ag(), almyVar);
        xtq xtqVarN = defpackage.alpv.n(defpackage.alnf.a.m());
        xtq xtqVarP = defpackage.alpv.p(defpackage.almm.a.m());
        xtqVarP.aj("SuggestLeavingMessage");
        xtqVarN.ad(xtqVarP.ai());
        xtqVarN.ae(defpackage.alsy.START_TAKING_MESSAGE);
        defpackage.alnf alnfVarAc = xtqVarN.ac();
        xtq xtqVarO3 = defpackage.alpv.o(almzVar.m());
        xtqVarO3.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
        apdi apdiVar2 = defpackage.alnf.k;
        aooh.e(apdiVar2, "flowOutputEvent");
        xtqVarO3.ax(apdiVar2, alnfVarAc);
        alljVar.a(xtqVarO3.ag(), almyVar);
        xtq xtqVarO4 = defpackage.alpv.o(almzVar.m());
        xtqVarO4.ah(defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING);
        alljVar.a(xtqVarO4.ag(), almyVar);
        try {
            java.lang.String strB = this.s.b(new defpackage.alvh(this, almyVar, 0), this.f);
            this.d = strB;
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "startFlow", 316, "AgenticCallScreenTakeAMessageProcessor.kt").y("Scheduled play suggestion safety timeout: %s", strB);
        } catch (defpackage.aljs e) {
            a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "startFlow", 321, "AgenticCallScreenTakeAMessageProcessor.kt").v("Failed to schedule play suggestion safety timeout. Transitioning to recording immediately.");
            akzm akzmVar = almyVar.d;
            if (akzmVar == null) {
                akzmVar = akzm.a;
            }
            aooh.e(akzmVar, "getAudioRelativeTimestamp(...)");
            g(almyVar, aooc.av(akzmVar).toNanos() / 1000);
        }
    }

    private final boolean l() {
        return this.b.c == defpackage.alvd.j;
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarV = aihd.v(defpackage.alnb.EVENT_QUICK_REPLY_CHIP_CLICKED, defpackage.alnb.EVENT_SELECTED_OPTION, defpackage.alnb.EVENT_RINGING_ENDED, defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE, defpackage.alnb.EVENT_SILENCE_DETECTED, defpackage.alnb.EVENT_END_SAY_TIMING, new defpackage.alnb[0]);
        aooh.e(aihdVarV, "of(...)");
        return aihdVarV;
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        aooh.f(almyVar, "event");
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 12) {
            if (this.b.c == defpackage.alvd.h) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleEndSayTiming", 333, "AgenticCallScreenTakeAMessageProcessor.kt").v("Bot finished speaking suggestion. Starting recording.");
                h();
                akzm akzmVar = almyVar.d;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                aooh.e(akzmVar, "getAudioRelativeTimestamp(...)");
                g(almyVar, aooc.av(akzmVar).toNanos() / 1000);
                return;
            }
            return;
        }
        if (iOrdinal == 20) {
            if (l()) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleRingingEnded", 226, "AgenticCallScreenTakeAMessageProcessor.kt").v("Ringing ended but session is FINISHED. Ignoring.");
                return;
            }
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            aooh.e(almzVar2, "getData(...)");
            apdi apdiVar = defpackage.aloj.e;
            aooh.e(apdiVar, "ringingEndedTimingEvent");
            if (akmr.y(almzVar2, apdiVar)) {
                aooh.e(apdiVar, "ringingEndedTimingEvent");
                defpackage.alsp alspVarB = defpackage.alsp.b(((defpackage.aloj) akmr.x(almzVar2, apdiVar)).d);
                if (alspVarB == null) {
                    alspVarB = defpackage.alsp.UNKNOWN;
                }
                if (alspVarB == defpackage.alsp.USER_NOT_REACHED) {
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleRingingEnded", 233, "AgenticCallScreenTakeAMessageProcessor.kt").v("Ringing ended with USER_NOT_REACHED, starting flow.");
                    k(almyVar);
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal == 35) {
            if (l()) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleQuickReplyClicked", 166, "AgenticCallScreenTakeAMessageProcessor.kt").v("Quick reply clicked but session is FINISHED. Ignoring.");
                return;
            }
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            aooh.e(almzVar3, "getData(...)");
            apdi apdiVar2 = defpackage.alof.b;
            aooh.e(apdiVar2, "quickReplyChipClickedEvent");
            if (akmr.y(almzVar3, apdiVar2)) {
                aooh.e(apdiVar2, "quickReplyChipClickedEvent");
                java.lang.String str = ((defpackage.alsk) akmr.x(almzVar3, apdiVar2)).c;
                aooh.e(str, "getReplyChipClickedContentId(...)");
                alln allnVar = this.m;
                if ((allnVar != null ? allnVar.c(str) : null) == defpackage.alsy.START_TAKING_MESSAGE) {
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleQuickReplyClicked", 177, "AgenticCallScreenTakeAMessageProcessor.kt").v("Quick reply clicked, starting flow.");
                    k(almyVar);
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 48) {
            if (iOrdinal != 53) {
                if (iOrdinal == 56 && this.b.c == defpackage.alvd.i) {
                    aimz aimzVar = a;
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSilenceDetected", 261, "AgenticCallScreenTakeAMessageProcessor.kt").v("Silence detected during recording.");
                    if (!this.e) {
                        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSilenceDetected", 270, "AgenticCallScreenTakeAMessageProcessor.kt").v("Silence detected but no complete sentence received yet. Continuing to wait.");
                        return;
                    } else {
                        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSilenceDetected", 265, "AgenticCallScreenTakeAMessageProcessor.kt").v("Silence detected after at least one complete sentence. Finishing flow.");
                        c(almyVar);
                        return;
                    }
                }
                return;
            }
            if (this.b.c == defpackage.alvd.i) {
                defpackage.almz almzVar4 = almyVar.h;
                if (almzVar4 == null) {
                    almzVar4 = defpackage.almz.a;
                }
                apdi apdiVar3 = defpackage.alvl.f;
                aooh.e(apdiVar3, "asrCompleteSentenceEvent");
                defpackage.alvl alvlVar = (defpackage.alvl) akmr.x(almzVar4, apdiVar3);
                long nanos = this.n.toNanos() / 1000;
                long j2 = alvlVar.e;
                long j3 = this.q + nanos;
                aimz aimzVar2 = a;
                if (j2 < j3) {
                    aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleAsrCompleteSentence", 249, "AgenticCallScreenTakeAMessageProcessor.kt").v("Ignoring sentence that started before or during the speech ignore buffer period.");
                    return;
                }
                aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleAsrCompleteSentence", 252, "AgenticCallScreenTakeAMessageProcessor.kt").v("Received complete sentence during recording.");
                this.e = true;
                i();
                return;
            }
            return;
        }
        if (l()) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSelectedOptionClicked", 186, "AgenticCallScreenTakeAMessageProcessor.kt").v("Selected option clicked but session is FINISHED. Ignoring.");
            return;
        }
        defpackage.almz almzVar5 = almyVar.h;
        if (almzVar5 == null) {
            almzVar5 = defpackage.almz.a;
        }
        aooh.e(almzVar5, "getData(...)");
        apdi apdiVar4 = defpackage.aloo.e;
        aooh.e(apdiVar4, "selectedOptionEvent");
        if (akmr.y(almzVar5, apdiVar4)) {
            aooh.e(apdiVar4, "selectedOptionEvent");
            defpackage.aloo alooVar = (defpackage.aloo) akmr.x(almzVar5, apdiVar4);
            int i2 = alooVar.b;
            java.lang.String str2 = "";
            if ((i2 & 1) != 0) {
                defpackage.alxf alxfVar = alooVar.c;
                if (alxfVar == null) {
                    alxfVar = defpackage.alxf.a;
                }
                if (alxfVar.c == 4) {
                    str2 = (java.lang.String) alxfVar.d;
                }
            } else if ((i2 & 2) != 0) {
                int i3 = (int) alooVar.d;
                if (i3 < 0 || i3 >= this.r.size()) {
                    a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSelectedOptionClicked", 200, "AgenticCallScreenTakeAMessageProcessor.kt").w("Received invalid suggested reply index: %d", i3);
                } else {
                    str2 = (java.lang.String) this.r.get(i3);
                }
            }
            aooh.c(str2);
            if (str2.length() == 0) {
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSelectedOptionClicked", 210, "AgenticCallScreenTakeAMessageProcessor.kt").v("Selected option has empty botIntentName or invalid suggestedReplyId.");
                return;
            }
            alln allnVar2 = this.m;
            if ((allnVar2 != null ? allnVar2.c(str2) : null) == defpackage.alsy.START_TAKING_MESSAGE) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "handleSelectedOptionClicked", 217, "AgenticCallScreenTakeAMessageProcessor.kt").v("Selected option clicked, starting flow.");
                k(almyVar);
            }
        }
    }

    public final void c(defpackage.almy almyVar) {
        j();
        i();
        xtq xtqVarN = defpackage.alpv.n(defpackage.alnf.a.m());
        xtq xtqVarP = defpackage.alpv.p(defpackage.almm.a.m());
        xtqVarP.aj("AcknowledgeAndGoodbye");
        xtqVarN.ad(xtqVarP.ai());
        xtqVarN.ae(defpackage.alsy.END_MISSED_CALL);
        defpackage.alnf alnfVarAc = xtqVarN.ac();
        xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
        xtqVarO.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
        apdi apdiVar = defpackage.alnf.k;
        aooh.e(apdiVar, "flowOutputEvent");
        xtqVarO.ax(apdiVar, alnfVarAc);
        this.c.a(xtqVarO.ag(), almyVar);
        this.b.k(defpackage.alvd.j);
    }

    @Override // defpackage.allg
    public final void e() {
        j();
        i();
        h();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        defpackage.alxd alxdVarT;
        java.lang.String str;
        alat alatVar;
        defpackage.alyk alykVar;
        akzm akzmVar;
        akzm akzmVar2;
        akzm akzmVar3;
        akzm akzmVar4;
        aooh.f(alqhVar, "callContext");
        aooh.f(alqkVar, "conversationContext");
        aooh.f(almbVar, "assetConfig");
        aooh.f(almlVar, "botConfig");
        aooh.f(alkfVar, "experimentChecker");
        if (this.m == null) {
            this.m = alln.g(alqdVar, almbVar.f, alkfVar);
        }
        j();
        i();
        h();
        this.e = false;
        this.n = i;
        apdi apdiVar = defpackage.alvz.p;
        aooh.e(apdiVar, "agenticBotConfig");
        defpackage.alvz alvzVar = (defpackage.alvz) akmr.x(almlVar, apdiVar);
        if (alvzVar != null) {
            if ((alvzVar.b & 2) != 0) {
                alykVar = alvzVar.d;
                if (alykVar == null) {
                    alykVar = defpackage.alyk.a;
                }
            } else {
                alykVar = null;
            }
            if (alykVar != null) {
                if ((alykVar.b & 2) != 0) {
                    akzmVar = alykVar.e;
                    if (akzmVar == null) {
                        akzmVar = akzm.a;
                    }
                } else {
                    akzmVar = null;
                }
                if (akzmVar != null) {
                    this.n = aooc.av(akzmVar);
                }
                if ((alykVar.b & 4) != 0) {
                    akzmVar2 = alykVar.f;
                    if (akzmVar2 == null) {
                        akzmVar2 = akzm.a;
                    }
                } else {
                    akzmVar2 = null;
                }
                if (akzmVar2 != null) {
                    this.f = aooc.av(akzmVar2);
                }
                if ((alykVar.b & 1) != 0) {
                    akzmVar3 = alykVar.c;
                    if (akzmVar3 == null) {
                        akzmVar3 = akzm.a;
                    }
                } else {
                    akzmVar3 = null;
                }
                if (akzmVar3 != null) {
                    this.o = aooc.av(akzmVar3);
                }
                if ((alykVar.b & 8) != 0) {
                    akzmVar4 = alykVar.g;
                    if (akzmVar4 == null) {
                        akzmVar4 = akzm.a;
                    }
                } else {
                    akzmVar4 = null;
                }
                if (akzmVar4 != null) {
                    this.p = aooc.av(akzmVar4);
                }
            }
        }
        this.q = 0L;
        aooh.e(apdiVar, "agenticBotConfig");
        defpackage.alvz alvzVar2 = (defpackage.alvz) akmr.x(almlVar, apdiVar);
        apdi apdiVar2 = defpackage.alwn.r;
        aooh.e(apdiVar2, "callAssistantConversationContext");
        defpackage.alwn alwnVar = (defpackage.alwn) akmr.x(alqkVar, apdiVar2);
        defpackage.alxe alxeVarS = alwnVar != null ? airh.s(alwnVar) : null;
        boolean z = alxeVarS != null ? alxeVarS.h : false;
        if (alvzVar2 == null || (alxdVarT = airh.t(alvzVar2)) == null) {
            return;
        }
        if (z) {
            alat alatVar2 = alxdVarT.d;
            aooh.e(alatVar2, "getIntentsForManualScreeningList(...)");
            if (alatVar2.isEmpty()) {
                str = alqhVar.b;
                aooh.e(str, "getCalleeNumber(...)");
                if (str.length() == 0) {
                    alatVar = alxdVarT.c;
                } else {
                    alatVar = alxdVarT.b;
                }
            } else {
                alatVar = alxdVarT.d;
            }
        } else {
            str = alqhVar.b;
            aooh.e(str, "getCalleeNumber(...)");
            if (str.length() == 0) {
                alatVar = alxdVarT.c;
            } else {
                alatVar = alxdVarT.b;
            }
        }
        aooh.c(alatVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
        java.util.Iterator it = alatVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.almm) it.next()).c);
        }
        this.r = arrayList;
    }

    public final void g(defpackage.almy almyVar, long j2) {
        this.b.k(defpackage.alvd.i);
        this.q = j2;
        try {
            java.lang.String strB = this.s.b(new defpackage.alvh(this, almyVar, 1), this.o);
            this.k = strB;
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "transitionToRecording", 349, "AgenticCallScreenTakeAMessageProcessor.kt").y("Scheduled max message duration timeout: %s", strB);
            try {
                java.lang.String strB2 = this.s.b(new defpackage.alvh(this, almyVar, 2), this.p);
                this.l = strB2;
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "scheduleShortSilenceTimeout", 391, "AgenticCallScreenTakeAMessageProcessor.kt").y("Scheduled short silence timeout: %s", strB2);
            } catch (defpackage.aljs e) {
                a.d().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "scheduleShortSilenceTimeout", 396, "AgenticCallScreenTakeAMessageProcessor.kt").v("Failed to schedule short silence timeout. Finishing flow.");
                c(almyVar);
            }
        } catch (defpackage.aljs e2) {
            a.d().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenTakeAMessageProcessor", "transitionToRecording", 354, "AgenticCallScreenTakeAMessageProcessor.kt").v("Failed to schedule max message duration timeout. Finishing flow.");
            c(almyVar);
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
