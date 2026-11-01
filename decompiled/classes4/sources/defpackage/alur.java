package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alur implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor");
    private final defpackage.alvg b;
    private final defpackage.allj c;
    private boolean d;
    private final j$.util.concurrent.ConcurrentHashMap e;
    private alln f;

    public alur(defpackage.alli alliVar, defpackage.alvg alvgVar) {
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alvgVar, "stateManager");
        this.b = alvgVar;
        this.c = alliVar.a("AGENTIC_CALL_SCREEN_CONVERSATION_HISTORY");
        this.e = new j$.util.concurrent.ConcurrentHashMap();
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarS = aihd.s(defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_SAY_INITIATED_TIMING);
        aooh.e(aihdVarS, "of(...)");
        return aihdVarS;
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strE;
        aooh.f(almyVar, "event");
        if (!this.d) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 75, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor is not active.");
            return;
        }
        defpackage.alvg alvgVar = this.b;
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
        defpackage.alsw alswVar = null;
        alswVar = null;
        if (iOrdinal == 5) {
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 86, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor received EVENT_SAY");
            apdi apdiVar = defpackage.alol.f;
            aooh.e(apdiVar, "sayEvent");
            defpackage.alol alolVar = (defpackage.alol) akmr.x(almzVar, apdiVar);
            if (alolVar != null && (alolVar.b & 4) != 0 && (alswVar = alolVar.e) == null) {
                alswVar = defpackage.alsw.a;
            }
            if (alswVar != null) {
                int i = alswVar.b;
                if (i == 1) {
                    defpackage.alsn alsnVar = (defpackage.alsn) alswVar.c;
                    aooh.e(alsnVar, "getRecording(...)");
                    defpackage.alsm alsmVar = alsnVar.d;
                    if (alsmVar == null) {
                        alsmVar = defpackage.alsm.a;
                    }
                    if ((alsmVar.b & 2) != 0) {
                        defpackage.alsm alsmVar2 = alsnVar.d;
                        if (alsmVar2 == null) {
                            alsmVar2 = defpackage.alsm.a;
                        }
                        str = alsmVar2.d;
                    } else {
                        str = alsnVar.c;
                        aooh.e(str, "getIntentName(...)");
                        alln allnVar = this.f;
                        if (allnVar != null && (strE = allnVar.e(str)) != null) {
                            str = strE;
                        }
                    }
                } else if (i == 2) {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 102, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor has TtsRequest");
                    str = (alswVar.b == 2 ? (defpackage.altf) alswVar.c : defpackage.altf.a).c;
                } else {
                    str = "";
                }
                aooh.c(str);
                if (str.length() > 0) {
                    defpackage.alsy alsyVarB = defpackage.alsy.b(alolVar.c);
                    if (alsyVarB == null) {
                        alsyVarB = defpackage.alsy.NO_ACTION;
                    }
                    java.lang.String strName = alsyVarB.name();
                    int i2 = alswVar.b;
                    if (i2 == 1) {
                        str2 = (i2 == 1 ? (defpackage.alsn) alswVar.c : defpackage.alsn.a).c;
                    } else {
                        str2 = "TTS";
                    }
                    aooh.c(str2);
                    this.e.put(almyVar.e, new defpackage.aluq(str, strName, str2));
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 11) {
            if (iOrdinal == 53) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 137, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor received EVENT_ASR_COMPLETE_SENTENCE");
                apdi apdiVar2 = defpackage.alvl.f;
                aooh.e(apdiVar2, "asrCompleteSentenceEvent");
                defpackage.alvl alvlVar = (defpackage.alvl) akmr.x(almzVar, apdiVar2);
                java.lang.String str3 = alvlVar != null ? alvlVar.c : null;
                if (str3 == null || str3.length() <= 0) {
                    return;
                }
                java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
                reentrantLock.lock();
                try {
                    alvgVar.h = true;
                    alvgVar.d.add(new defpackage.alvf(2, aoov.P(str3, '\n', ' '), null, "UNKNOWN_ACTION", "UNKNOWN_INTENT", false));
                    reentrantLock.unlock();
                    if (this.b.m()) {
                        return;
                    }
                    defpackage.allj alljVar = this.c;
                    xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                    xtqVarO.ah(defpackage.alnb.EVENT_AGENTIC_TRIGGER_INFERENCE);
                    alljVar.a(xtqVarO.ag(), almyVar);
                    return;
                } catch (java.lang.Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            return;
        }
        aimz aimzVar2 = a;
        aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 117, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor received EVENT_SAY_INITIATED_TIMING");
        apdi apdiVar3 = defpackage.alom.e;
        aooh.e(apdiVar3, "sayInitiatedTimingEvent");
        defpackage.alom alomVar = (defpackage.alom) akmr.x(almzVar, apdiVar3);
        java.lang.String str4 = alomVar != null ? alomVar.d : null;
        if (str4 != null) {
            defpackage.aluq aluqVar = (defpackage.aluq) this.e.remove(str4);
            if (aluqVar == null) {
                aimzVar2.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 128, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor did not find expected botSpeechInfo in botSpeechMap.");
                return;
            }
            aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenConversationHistoryProcessor", "consume", 123, "AgenticCallScreenConversationHistoryProcessor.kt").v("AgenticConversationHistoryProcessor has botSpeechMap");
            defpackage.alvg alvgVar2 = this.b;
            java.lang.String str5 = aluqVar.a;
            aooh.f(str5, "text");
            java.lang.String str6 = aluqVar.b;
            aooh.f(str6, "action");
            java.lang.String str7 = aluqVar.c;
            aooh.f(str7, "intent");
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = alvgVar2.b;
            reentrantLock2.lock();
            try {
                alvgVar2.d.add(new defpackage.alvf(1, aoov.P(str5, '\n', ' '), (java.lang.String) defpackage.alvg.a.get(str7), str6, str7, false));
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        aooh.f(alqhVar, "callContext");
        aooh.f(alqkVar, "conversationContext");
        aooh.f(almbVar, "assetConfig");
        aooh.f(almlVar, "botConfig");
        aooh.f(alkfVar, "experimentChecker");
        defpackage.alvg alvgVar = this.b;
        java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
        reentrantLock.lock();
        try {
            alvgVar.d.clear();
            alvgVar.k = 0;
            reentrantLock.unlock();
            this.e.clear();
            this.f = alln.g(alqdVar, almbVar.f, alkfVar);
            this.d = true;
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
