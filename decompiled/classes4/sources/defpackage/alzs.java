package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzs implements defpackage.allg, alld, defpackage.aljt {
    public static final /* synthetic */ int f = 0;
    private static final aimz g = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/voicemail/VoicemailFlowProcessor");
    private static final aihd h = aihd.s(defpackage.alwq.TYPE_WORK, defpackage.alwq.TYPE_FAVORITE, defpackage.alwq.TYPE_CONTACT);
    public final defpackage.alvv a;
    public alln b;
    public boolean c;
    public boolean d;
    public defpackage.alvx e;
    private final defpackage.aljq i;
    private java.util.concurrent.atomic.AtomicInteger j;
    private java.lang.Boolean k;
    private j$.util.Optional l;
    private defpackage.alyq m;
    private j$.util.Optional n;
    private float o;
    private int p;
    private java.util.concurrent.atomic.AtomicInteger q;
    private j$.util.Optional r;
    private aihd s;
    private defpackage.alwq t;
    private j$.util.Optional u;
    private j$.util.Optional v;
    private final defpackage.alqf w;
    private vqy x;

    public alzs(defpackage.alvv alvvVar, defpackage.aljq aljqVar, defpackage.alqf alqfVar) {
        this.a = alvvVar;
        this.i = aljqVar;
        this.w = alqfVar;
    }

    private final defpackage.alvu i(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnm.i;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alnm alnmVar = (defpackage.alnm) objJ;
        defpackage.almm almmVar = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
        if (almmVar == null) {
            almmVar = defpackage.almm.a;
        }
        float f2 = almmVar.d;
        defpackage.almm almmVar2 = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
        if (almmVar2 == null) {
            almmVar2 = defpackage.almm.a;
        }
        defpackage.alvv alvvVar = this.a;
        java.lang.String str = almmVar2.c;
        defpackage.alxx alxxVarC = alvvVar.c(str);
        if (str.equals("UNKNOWN_ROBOT_INTENT")) {
            return defpackage.alvu.b(defpackage.alys.UNKNOWN_PREDICTION_INTENT_TRIGGER, "GoodbyeThanksUnknownIfSpam", alxxVarC, almyVar);
        }
        if (this.b.c(str).equals(defpackage.alsy.END_SPAM_CALL)) {
            if (f2 <= this.o) {
                return defpackage.alvu.b(defpackage.alys.PREDICTION_LOW_CONFIDENCE_TRIGGER, "GoodbyeThanksUnknownIfSpam", alxxVarC, almyVar);
            }
            defpackage.almm almmVar3 = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
            if (almmVar3 == null) {
                almmVar3 = defpackage.almm.a;
            }
            return defpackage.alvu.a(almmVar3, alxxVarC, almyVar);
        }
        if (j(str).booleanValue()) {
            return defpackage.alvu.b(defpackage.alys.EXCEEDS_COUNT_REPEAT_TRIGGER, "GoodbyeThanksUnknownIfSpam", alxxVarC, almyVar);
        }
        if (this.r.isPresent() && !this.s.contains(str) && this.q.get() >= ((java.lang.Integer) this.r.get()).intValue() && this.b.c(str) == defpackage.alsy.NO_ACTION) {
            return defpackage.alvu.b(defpackage.alys.EXCEEDS_COUNT_MEANINGFUL_STATEMENTS_TRIGGER, "GoodbyeThanksUnknownIfSpam", alxxVarC, almyVar);
        }
        defpackage.almm almmVar4 = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
        if (almmVar4 == null) {
            almmVar4 = defpackage.almm.a;
        }
        return defpackage.alvu.a(almmVar4, alxxVarC, almyVar);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    private final java.lang.Boolean j(java.lang.String str) {
        return java.lang.Boolean.valueOf((boolean) (((m(this.i.a(), str) > this.b.a(str) ? 1 : (m(this.i.a(), str) == this.b.a(str) ? 0 : -1)) ^ (-1)) >>> 31));
    }

    private final boolean k() {
        return j$.util.Collection.-EL.stream(this.i.a()).filter(new defpackage.alzc(4)).map(new defpackage.alzr(0)).allMatch(new defpackage.alks(this, 19));
    }

    private final boolean l(defpackage.alnm alnmVar) {
        return alnmVar.g && k();
    }

    private static final long m(aify aifyVar, java.lang.String str) {
        return j$.util.Collection.-EL.stream(aifyVar).filter(new defpackage.alks(str, 18)).count();
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_TIMEOUT, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_FLOW_SIGNALS, defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL, defpackage.alnb.EVENT_START_CONVERSATION, new defpackage.alnb[]{defpackage.alnb.EVENT_CALLER_TYPE, defpackage.alnb.EVENT_BOT_SILENCE_DEADLINE_REACHED});
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.aljq aljqVar = this.i;
        aljqVar.c(almzVar);
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 23) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alow.b;
            almzVar3.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar3).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alsu alsuVar = (defpackage.alsu) objJ;
            defpackage.alss alssVarB = defpackage.alss.b(alsuVar.c);
            if (alssVarB == null) {
                alssVarB = defpackage.alss.SPAM_STATUS_UNKNOWN;
            }
            int iAQ = a.aQ(alsuVar.e);
            this.a.n(new defpackage.alvt(alssVarB, iAQ != 0 ? iAQ : 1), almyVar);
            return;
        }
        if (iOrdinal == 28) {
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alms.d;
            almzVar4.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar4).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            defpackage.alwq alwqVarB = defpackage.alwq.b(((defpackage.alms) objJ2).c);
            if (alwqVarB == null) {
                alwqVarB = defpackage.alwq.TYPE_UNSET;
            }
            this.t = alwqVarB;
            return;
        }
        if (this.d) {
            defpackage.almz almzVar5 = almyVar.h;
            if (almzVar5 == null) {
                almzVar5 = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar5.c);
            if (alnbVarB2 == null) {
                alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
            }
            if (alnbVarB2 == defpackage.alnb.EVENT_INTENT_EXTRACTION && !h.contains(this.t)) {
                defpackage.alvu alvuVarI = i(almyVar);
                if (this.b.c(alvuVarI.e.c) == defpackage.alsy.END_SPAM_CALL) {
                    this.v = j$.util.Optional.of(alvuVarI);
                }
            }
            j$.lang.Iterable.-EL.forEach(this.e.a(almyVar), new defpackage.agzo(this, almyVar, 14, null));
            return;
        }
        defpackage.almz almzVar6 = almyVar.h;
        if (almzVar6 == null) {
            almzVar6 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB3 = defpackage.alnb.b(almzVar6.c);
        if (alnbVarB3 == null) {
            alnbVarB3 = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal2 = alnbVarB3.ordinal();
        if (iOrdinal2 == 1) {
            defpackage.almz almzVar7 = almyVar.h;
            if (almzVar7 == null) {
                almzVar7 = defpackage.almz.a;
            }
            apdi apdiVar3 = defpackage.alnj.f;
            almzVar7.c(apdiVar3);
            java.lang.Object objJ3 = ((alaa) almzVar7).n.j((alac) apdiVar3.a);
            if (objJ3 == null) {
                objJ3 = apdiVar3.b;
            } else {
                apdiVar3.c(objJ3);
            }
            alqu alquVar = ((defpackage.alnj) objJ3).c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            if (this.k.booleanValue()) {
                return;
            }
            this.k = java.lang.Boolean.valueOf(alquVar.c == 1 && !defpackage.alph.c(alquVar));
            return;
        }
        if (iOrdinal2 != 2) {
            if (iOrdinal2 == 9) {
                this.u.ifPresentOrElse(new defpackage.agzo(this, almyVar, 13, null), new defpackage.alvh(this, almyVar, 3));
                return;
            }
            if (iOrdinal2 == 13) {
                if (!this.k.booleanValue()) {
                    long jM = m(aljqVar.a(), "Hello?") + 1;
                    if (this.n.isPresent() && jM >= ((java.lang.Long) this.n.get()).longValue()) {
                        this.a.g(defpackage.alvu.c(defpackage.alys.SILENT_CALL_TRIGGER, "GoodbyeThanksSpam", defpackage.alxx.NO_DECISION, almyVar, defpackage.alxw.SILENT_CALL));
                        return;
                    }
                }
                j$.util.Optional optionalOfNullable = this.l;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(anar.m((defpackage.almy) optionalOfNullable.get()));
                }
                defpackage.alnm alnmVar = (defpackage.alnm) optionalOfNullable.orElse(defpackage.alnm.a);
                if (alnmVar.f && !l(alnmVar)) {
                    defpackage.almm almmVar = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
                    if (almmVar == null) {
                        almmVar = defpackage.almm.a;
                    }
                    if (!almmVar.c.equals("SayNothing")) {
                        j$.util.Optional optional = this.l;
                        defpackage.alui aluiVar = new defpackage.alui(this, 14);
                        if (true == optional.isPresent()) {
                            ((defpackage.alzs) aluiVar.a).g((defpackage.almy) optional.get());
                        }
                        this.l = j$.util.Optional.empty();
                        return;
                    }
                }
                boolean zBooleanValue = j("Hello?").booleanValue();
                defpackage.alvv alvvVar = this.a;
                if (zBooleanValue) {
                    alvvVar.g(defpackage.alvu.b(defpackage.alys.TIMEOUT_BAILOUT, "GoodbyeThanksUnknownIfSpam", defpackage.alxx.NO_DECISION, almyVar));
                    return;
                } else {
                    alvvVar.k(defpackage.alys.TIMEOUT_TRIGGER, almyVar, "Hello?");
                    return;
                }
            }
            if (iOrdinal2 != 24) {
                if (iOrdinal2 == 41) {
                    this.a.g(defpackage.alvu.b(defpackage.alys.BOT_SILENCE_DEADLINE_REACHED, "GoodbyeThanksUnknownIfSpam", defpackage.alxx.NO_DECISION, almyVar));
                    return;
                }
                aimw aimwVarL = g.c().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/voicemail/VoicemailFlowProcessor", "consume", 301, "VoicemailFlowProcessor.java");
                defpackage.almz almzVar8 = almyVar.h;
                if (almzVar8 == null) {
                    almzVar8 = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB4 = defpackage.alnb.b(almzVar8.c);
                if (alnbVarB4 == null) {
                    alnbVarB4 = defpackage.alnb.EVENT_UNKNOWN;
                }
                aimwVarL.y("Unexpected event type %s", alnbVarB4.name());
                return;
            }
        }
        try {
            this.x.j(almyVar);
        } catch (defpackage.aljs e) {
            aimw aimwVarL2 = g.c().k(e).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/voicemail/VoicemailFlowProcessor", "consume", 286, "VoicemailFlowProcessor.java");
            defpackage.almz almzVar9 = almyVar.h;
            if (almzVar9 == null) {
                almzVar9 = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB5 = defpackage.alnb.b(almzVar9.c);
            if (alnbVarB5 == null) {
                alnbVarB5 = defpackage.alnb.EVENT_UNKNOWN;
            }
            aimwVarL2.y("Consuming event type %s failed.", alnbVarB5.name());
        }
    }

    public final void c(aigf aigfVar) {
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_SIGNALS;
        defpackage.almy almyVar = defpackage.almy.a;
        java.lang.String str = ((defpackage.almy) aigfVar.getOrDefault(alnbVar, almyVar)).f;
        defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_INTENT_EXTRACTION;
        if (str.equals(((defpackage.almy) aigfVar.getOrDefault(alnbVar2, almyVar)).f)) {
            defpackage.almz almzVar = ((defpackage.almy) aigfVar.getOrDefault(alnbVar, almyVar)).h;
            if (almzVar == null) {
                almzVar = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alng.f;
            almzVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alng alngVar = (defpackage.alng) objJ;
            defpackage.almy almyVar2 = (defpackage.almy) aigfVar.getOrDefault(alnbVar2, almyVar);
            defpackage.almz almzVar2 = almyVar2.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alnm.i;
            almzVar2.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar2).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            defpackage.alnm alnmVar = (defpackage.alnm) objJ2;
            if (aigfVar.containsKey(alnbVar2)) {
                if (alnmVar.f && !l(alnmVar)) {
                    this.l = j$.util.Optional.of(almyVar2);
                    return;
                }
                this.l = j$.util.Optional.empty();
            }
            if (alngVar.d) {
                this.a.k(defpackage.alys.POSSIBLY_INCOMPLETE_TRIGGER, almyVar2, "SayNothing");
                return;
            }
            if (!alngVar.c) {
                g(almyVar2);
                this.j.set(0);
                return;
            }
            int andIncrement = this.j.getAndIncrement();
            int i = this.p;
            defpackage.alvv alvvVar = this.a;
            if (andIncrement >= i) {
                alvvVar.g(defpackage.alvu.b(defpackage.alys.ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER, "GoodbyeThanksLowConfidence", defpackage.alxx.NO_DECISION, almyVar2));
            } else {
                alvvVar.k(defpackage.alys.ASR_LOW_CONFIDENCE_TRIGGER, almyVar2, "AskToRepeat");
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        apdi apdiVar = defpackage.alyq.m;
        almlVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alyq alyqVar = (defpackage.alyq) objJ;
        this.m = alyqVar;
        defpackage.alxz alxzVar = alyqVar.e;
        if (alxzVar == null) {
            alxzVar = defpackage.alxz.a;
        }
        this.o = alxzVar.d;
        apdi apdiVar2 = defpackage.alwn.r;
        alqkVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.alwn alwnVar = (defpackage.alwn) objJ2;
        this.p = this.m.j;
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        defpackage.alxz alxzVar2 = this.m.e;
        if (((alxzVar2 == null ? defpackage.alxz.a : alxzVar2).b & 1) != 0) {
            float f2 = (alxzVar2 == null ? defpackage.alxz.a : alxzVar2).c;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                if (alxzVar2 == null) {
                    alxzVar2 = defpackage.alxz.a;
                }
                optionalEmpty = j$.util.Optional.of(java.lang.Float.valueOf(alxzVar2.c));
                this.t = defpackage.alwq.TYPE_UNSET;
            }
        }
        this.n = j$.util.Optional.empty();
        akzm akzmVar = almlVar.e;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        if (akzmVar.b > 0) {
            defpackage.alyq alyqVar2 = this.m;
            if ((alyqVar2.b & 1) != 0) {
                akzm akzmVar2 = alyqVar2.c;
                if (akzmVar2 == null) {
                    akzmVar2 = akzm.a;
                }
                long j = akzmVar2.b;
                akzm akzmVar3 = almlVar.e;
                if (akzmVar3 == null) {
                    akzmVar3 = akzm.a;
                }
                this.n = j$.util.Optional.of(java.lang.Long.valueOf(j / akzmVar3.b));
            }
        }
        this.p = this.m.j;
        this.j = new java.util.concurrent.atomic.AtomicInteger(0);
        this.q = new java.util.concurrent.atomic.AtomicInteger(0);
        this.k = java.lang.Boolean.FALSE;
        this.x = new vqy(this, aihd.r(defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_FLOW_SIGNALS));
        this.b = alln.g(alqdVar, almbVar.f, alkfVar);
        defpackage.alzt alztVar = new defpackage.alzt();
        alztVar.a = this.b;
        this.a.e(this.b, (aigf) j$.util.Collection.-EL.stream(this.m.d).filter(new defpackage.alzc(5)).collect(aido.b(new defpackage.alzr(2), new defpackage.alzr(3))), optionalEmpty, alztVar);
        this.l = j$.util.Optional.empty();
        this.s = aihd.o(this.m.h);
        this.r = j$.util.Optional.empty();
        defpackage.alyq alyqVar3 = this.m;
        if ((alyqVar3.b & 16) != 0) {
            this.r = j$.util.Optional.of(java.lang.Integer.valueOf(alyqVar3.g));
        }
        this.v = j$.util.Optional.empty();
        this.d = false;
        defpackage.alyr alyrVar = alwnVar.g;
        if (alyrVar == null) {
            alyrVar = defpackage.alyr.a;
        }
        int iAQ = a.aQ(alyrVar.c);
        this.c = iAQ != 0 && iAQ == 2 && this.m.l;
        this.u = j$.util.Optional.empty();
        if (this.m.k && (alwnVar.b & 16384) != 0) {
            defpackage.alxa alxaVar = alwnVar.o;
            if (alxaVar == null) {
                alxaVar = defpackage.alxa.a;
            }
            this.u = j$.util.Optional.of(alxaVar);
            this.c = false;
        }
        defpackage.alyk alykVar = this.m.i;
        if (alykVar == null) {
            alykVar = defpackage.alyk.a;
        }
        this.e = new defpackage.alvx(alykVar, this.b, this.w, this);
    }

    public final void g(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnm.i;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        if (((defpackage.alnm) objJ).g && !k()) {
            this.a.k(defpackage.alys.PRE_CONV_EXTRACTION_DURING_CONVERSATION, almyVar, "AskToRepeat");
            return;
        }
        defpackage.alvu alvuVarI = i(almyVar);
        if (h.contains(this.t) && alvuVarI.e.c.equals("AskToIdentify")) {
            this.a.k(defpackage.alys.TRUSTED_CALLER_TRIGGER, almyVar, "TookMessageThanksBye");
            return;
        }
        if (!this.s.contains(alvuVarI.e.c)) {
            this.q.incrementAndGet();
        }
        this.a.g(alvuVarI);
    }

    public final void h(defpackage.almz almzVar, defpackage.almy almyVar) {
        apdi apdiVar = defpackage.alnf.k;
        almzVar.c(apdiVar);
        akzs akzsVar = ((alaa) almzVar).n;
        alac alacVar = (alac) apdiVar.a;
        if (!akzsVar.l(alacVar)) {
            aimw aimwVarL = g.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/voicemail/VoicemailFlowProcessor", "handleNonConversationalSubFlowEvent", 518, "VoicemailFlowProcessor.java");
            defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
            if (alnbVarB == null) {
                alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
            }
            aimwVarL.w("Ignoring invalid subflow event type: %s", alnbVarB.aN);
            return;
        }
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alnf alnfVar = (defpackage.alnf) objJ;
        defpackage.almm almmVar = alnfVar.c == 1 ? (defpackage.almm) alnfVar.d : defpackage.almm.a;
        defpackage.alvu alvuVar = (defpackage.alvu) this.v.orElse(defpackage.alvu.a(almmVar, defpackage.alxx.NO_DECISION, almyVar));
        defpackage.alvv alvvVar = this.a;
        java.lang.String str = almmVar.c;
        akzx akzxVarP = alvvVar.b(alvuVar).p();
        akzx akzxVarM = defpackage.almm.a.m();
        akzxVarM.u();
        defpackage.almm almmVar2 = (defpackage.almm) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almmVar2.b |= 1;
        almmVar2.c = str;
        akzxVarP.u();
        defpackage.alnf alnfVar2 = (defpackage.alnf) akzxVarP.b;
        defpackage.almm almmVar3 = (defpackage.almm) akzxVarM.p();
        j$.util.Objects.requireNonNull(almmVar3);
        alnfVar2.d = almmVar3;
        alnfVar2.c = 1;
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
        akzzVarM.u();
        defpackage.almz almzVar2 = akzzVarM.b;
        almzVar2.c = alnbVar.aN;
        almzVar2.b |= 1;
        akzzVarM.bV(apdiVar, (defpackage.alnf) akzxVarP.p());
        alvvVar.a.a(akzzVarM.p(), alvuVar.b);
    }

    @Override // defpackage.aljt
    public final void v(defpackage.almz almzVar, defpackage.almy almyVar) {
        h(almzVar, almyVar);
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
