package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvc implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor");
    public static final j$.time.Duration b;
    public static final j$.time.Duration c;
    public final defpackage.alvg d;
    public final defpackage.allj e;
    public final java.util.concurrent.locks.ReentrantLock f;
    public boolean g;
    public java.lang.String h;
    private boolean i;
    private long j;
    private j$.time.Duration k;
    private j$.time.Duration l;
    private boolean m;
    private final defpackage.alqf n;

    static {
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(2L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        b = durationOfSeconds;
        j$.time.Duration durationOfSeconds2 = j$.time.Duration.ofSeconds(5L);
        aooh.e(durationOfSeconds2, "ofSeconds(...)");
        c = durationOfSeconds2;
    }

    public alvc(defpackage.alli alliVar, defpackage.alqf alqfVar, defpackage.alvg alvgVar) {
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alqfVar, "timerManager");
        aooh.f(alvgVar, "stateManager");
        this.n = alqfVar;
        this.d = alvgVar;
        this.e = alliVar.a("AGENTIC_CALL_SCREEN_SILENCE_DETECTOR");
        this.f = new java.util.concurrent.locks.ReentrantLock();
        this.k = b;
        this.l = c;
    }

    private final void c(defpackage.almy almyVar) {
        j$.time.Duration duration;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "cancelAndScheduleTimer$<anonymous>", 224, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Scheduling silence timer.");
            g();
            try {
                defpackage.alvg alvgVar = this.d;
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = alvgVar.b;
                reentrantLock2.lock();
                try {
                    boolean z = alvgVar.e;
                    reentrantLock2.unlock();
                    if (!z) {
                        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "cancelAndScheduleTimer$<anonymous>", 252, "AgenticCallScreenSilenceDetectorProcessor.kt").y("Using standard silence duration: %.2f seconds", java.lang.Double.valueOf(this.k.toMillis() / 1000.0d));
                        duration = this.k;
                    } else if (this.m) {
                        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "cancelAndScheduleTimer$<anonymous>", 232, "AgenticCallScreenSilenceDetectorProcessor.kt").y("Using standard silence duration on reset during initial disclosure: %.2f seconds", java.lang.Double.valueOf(this.k.toMillis() / 1000.0d));
                        duration = this.k;
                    } else {
                        aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "cancelAndScheduleTimer$<anonymous>", 240, "AgenticCallScreenSilenceDetectorProcessor.kt").y("Using initial disclosure silence duration: %.2f seconds", java.lang.Double.valueOf(this.l.toMillis() / 1000.0d));
                        if (!this.g) {
                            this.m = true;
                        }
                        duration = this.l;
                    }
                    this.h = this.n.b(new defpackage.akbr(this, almyVar, 20), duration);
                    reentrantLock.unlock();
                } catch (java.lang.Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (defpackage.aljs e) {
                a.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "cancelAndScheduleTimer$<anonymous>", 260, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Failed to schedule silence timer.");
            }
        } catch (java.lang.Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    private final void g() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            java.lang.String str = this.h;
            if (str != null) {
                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "cancelTimer$<anonymous>$<anonymous>", 268, "AgenticCallScreenSilenceDetectorProcessor.kt").y("Canceling timer %s", str);
                this.n.a(str);
            }
            this.h = null;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarV = aihd.v(defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE, defpackage.alnb.EVENT_ASR_PARTIAL_CHUNK, defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_END_SAY_TIMING, defpackage.alnb.EVENT_ENDPOINT_SPEECH_START, new defpackage.alnb[]{defpackage.alnb.EVENT_ENDPOINT_SPEECH_END, defpackage.alnb.EVENT_RINGING_STARTED, defpackage.alnb.EVENT_RINGING_ENDED});
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
        aooh.e(almzVar, "getData(...)");
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 5) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 156, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Bot started speaking.");
            this.g = true;
            this.m = false;
            g();
        } else if (iOrdinal == 12) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 162, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Bot finished speaking.");
            this.g = false;
            if (this.i) {
                c(almyVar);
            }
        } else if (iOrdinal == 55) {
            this.i = true;
            if (!this.g) {
                c(almyVar);
            }
        } else if (iOrdinal == 19) {
            this.i = false;
            g();
        } else if (iOrdinal == 20) {
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 143, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Ringing ended.");
            if (this.d.c == defpackage.alvd.h) {
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 147, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Ringing ended with AgentState.TAM_PLAYING_SUGGESTION. Reactivating silence detector for the TAM flow.");
                this.i = true;
                c(almyVar);
            }
        } else if (!this.i) {
            return;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal2 = alnbVarB2.ordinal();
        if (iOrdinal2 == 26) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 176, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Speech started. Canceling timer.");
            g();
            return;
        }
        if (iOrdinal2 == 27) {
            aimz aimzVar2 = a;
            aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 180, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Speech ended.");
            if (this.g) {
                aimzVar2.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 184, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Ignoring speech end while bot is speaking.");
                return;
            } else {
                c(almyVar);
                return;
            }
        }
        if (iOrdinal2 == 53) {
            aimz aimzVar3 = a;
            aimzVar3.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 204, "AgenticCallScreenSilenceDetectorProcessor.kt").v("ASR complete sentence.");
            apdi apdiVar = defpackage.alvl.f;
            aooh.e(apdiVar, "asrCompleteSentenceEvent");
            defpackage.alvl alvlVar = (defpackage.alvl) akmr.x(almzVar, apdiVar);
            if (alvlVar != null) {
                java.lang.String str = alvlVar.c;
                aooh.e(str, "getText(...)");
                if (aoov.x(str).toString().length() > 0) {
                    this.j = aooc.x(this.j, alvlVar.d);
                    if (this.g) {
                        aimzVar3.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume$<anonymous>", 213, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Ignoring complete sentence while bot is speaking.");
                        return;
                    } else {
                        this.d.j(false);
                        c(almyVar);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (iOrdinal2 == 54) {
            aimz aimzVar4 = a;
            aimzVar4.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 188, "AgenticCallScreenSilenceDetectorProcessor.kt").v("ASR partial chunk.");
            apdi apdiVar2 = defpackage.alvm.f;
            aooh.e(apdiVar2, "asrPartialChunkEvent");
            defpackage.alvm alvmVar = (defpackage.alvm) akmr.x(almzVar, apdiVar2);
            if (alvmVar != null) {
                java.lang.String str2 = alvmVar.c;
                aooh.e(str2, "getText(...)");
                if (aoov.x(str2).toString().length() == 0 || alvmVar.e < this.j) {
                    aimzVar4.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 194, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Ignoring out-of-order partial chunk.");
                } else if (this.g) {
                    aimzVar4.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "consume", 198, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Ignoring partial chunk while bot is speaking.");
                } else {
                    c(almyVar);
                }
            }
        }
    }

    @Override // defpackage.allg
    public final void e() {
        g();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        defpackage.alxe alxeVarS;
        akzm akzmVar;
        akzm akzmVar2;
        g();
        this.i = false;
        this.g = false;
        this.j = 0L;
        this.d.j(true);
        this.m = false;
        akzm akzmVar3 = null;
        if (almlVar != null) {
            apdi apdiVar = defpackage.alvz.p;
            aooh.e(apdiVar, "agenticBotConfig");
            defpackage.alvz alvzVar = (defpackage.alvz) akmr.x(almlVar, apdiVar);
            if (alvzVar != null) {
                if ((alvzVar.b & 4) != 0) {
                    akzmVar = alvzVar.e;
                    if (akzmVar == null) {
                        akzmVar = akzm.a;
                    }
                } else {
                    akzmVar = null;
                }
                if (akzmVar != null) {
                    j$.time.Duration durationAv = aooc.av(akzmVar);
                    if (a.a(durationAv)) {
                        this.k = durationAv;
                    }
                }
                if ((alvzVar.b & 65536) != 0) {
                    akzmVar2 = alvzVar.n;
                    if (akzmVar2 == null) {
                        akzmVar2 = akzm.a;
                    }
                } else {
                    akzmVar2 = null;
                }
                if (akzmVar2 != null) {
                    j$.time.Duration durationAv2 = aooc.av(akzmVar2);
                    if (a.a(durationAv2)) {
                        this.l = durationAv2;
                    }
                }
            }
        }
        if (alqkVar != null) {
            apdi apdiVar2 = defpackage.alwn.r;
            aooh.e(apdiVar2, "callAssistantConversationContext");
            defpackage.alwn alwnVar = (defpackage.alwn) akmr.x(alqkVar, apdiVar2);
            if (alwnVar == null || (alxeVarS = airh.s(alwnVar)) == null) {
                return;
            }
            akzm akzmVar4 = alxeVarS.d;
            if (akzmVar4 == null) {
                akzmVar4 = akzm.a;
            }
            aooh.e(akzmVar4, "getSilenceThresholdDuration(...)");
            j$.time.Duration durationAv3 = aooc.av(akzmVar4);
            if (a.a(durationAv3)) {
                this.k = durationAv3;
            }
            if ((alxeVarS.b & 8) != 0 && (akzmVar3 = alxeVarS.f) == null) {
                akzmVar3 = akzm.a;
            }
            if (akzmVar3 != null) {
                j$.time.Duration durationAv4 = aooc.av(akzmVar3);
                if (a.a(durationAv4)) {
                    this.l = durationAv4;
                }
            }
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
