package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvb implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenRobocallProcessor");
    private static final j$.time.Duration e;
    public final defpackage.alvg b;
    public final defpackage.allj c;
    public java.lang.String d;
    private j$.time.Duration f;
    private final defpackage.alqf g;

    static {
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(30L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        e = durationOfSeconds;
    }

    public alvb(defpackage.alvg alvgVar, defpackage.alli alliVar, defpackage.alqf alqfVar) {
        aooh.f(alvgVar, "stateManager");
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alqfVar, "timerManager");
        this.b = alvgVar;
        this.g = alqfVar;
        this.c = alliVar.a("AGENTIC_CALL_SCREEN_ROBOCALL");
        this.f = e;
    }

    private final synchronized void c() {
        java.lang.String str = this.d;
        if (str != null) {
            this.g.a(str);
        }
        this.d = null;
    }

    private final synchronized void g(defpackage.almy almyVar) {
        if (this.d == null) {
            try {
                this.d = this.g.b(new defpackage.akbr(this, almyVar, 19), this.f);
            } catch (defpackage.aljs e2) {
                a.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenRobocallProcessor", "startTimerIfNeeded", 101, "AgenticCallScreenRobocallProcessor.kt").v("Failed to schedule robocall timer.");
            }
        }
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarT = aihd.t(defpackage.alnb.EVENT_ASR_PARTIAL_CHUNK, defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE, defpackage.alnb.EVENT_ENDPOINT_SPEECH_START, defpackage.alnb.EVENT_SILENCE_DETECTED);
        aooh.e(aihdVarT, "of(...)");
        return aihdVarT;
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        aooh.f(almyVar, "event");
        defpackage.alvg alvgVar = this.b;
        if (alvgVar.c == defpackage.alvd.g || alvgVar.l() || alvgVar.m()) {
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
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal != 26) {
            if (iOrdinal == 56) {
                c();
                return;
            } else if (iOrdinal != 53 && iOrdinal != 54) {
                return;
            }
        }
        g(almyVar);
    }

    @Override // defpackage.allg
    public final void e() {
        c();
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        akzm akzmVar;
        if (almlVar != null) {
            apdi apdiVar = defpackage.alvz.p;
            aooh.e(apdiVar, "agenticBotConfig");
            defpackage.alvz alvzVar = (defpackage.alvz) akmr.x(almlVar, apdiVar);
            if (alvzVar != null) {
                if ((alvzVar.b & 8192) != 0) {
                    akzmVar = alvzVar.k;
                    if (akzmVar == null) {
                        akzmVar = akzm.a;
                    }
                } else {
                    akzmVar = null;
                }
                if (akzmVar != null) {
                    j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(akzmVar.b);
                    aooh.e(durationOfSeconds, "ofSeconds(...)");
                    this.f = durationOfSeconds;
                }
            }
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }
}
