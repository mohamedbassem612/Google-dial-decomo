package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzn implements defpackage.allg, alld, defpackage.aljt {
    public static final /* synthetic */ int c = 0;
    private static final aimz d = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/spamfilter/SpamFilterFlowProcessor");
    private static final j$.time.Duration e = j$.time.Duration.ofMinutes(2);
    public final defpackage.alvv a;
    public alln b;
    private final defpackage.aljq f;
    private java.util.concurrent.atomic.AtomicBoolean g;
    private java.util.concurrent.atomic.AtomicBoolean h;
    private java.util.concurrent.atomic.AtomicInteger i;
    private aihd j;
    private boolean k;
    private boolean l;
    private java.lang.Boolean m = java.lang.Boolean.FALSE;
    private j$.util.Optional n;
    private defpackage.alyb o;
    private java.lang.Boolean p;
    private j$.time.Duration q;
    private defpackage.alvx r;
    private long s;
    private float t;
    private int u;
    private final defpackage.alqf v;
    private vqy w;

    public alzn(defpackage.alvv alvvVar, defpackage.aljq aljqVar, defpackage.alqf alqfVar) {
        this.a = alvvVar;
        this.f = aljqVar;
        this.v = alqfVar;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    private final java.lang.Boolean h(java.lang.String str) {
        return java.lang.Boolean.valueOf((boolean) (((n(this.f.a(), str) > this.b.a(str) ? 1 : (n(this.f.a(), str) == this.b.a(str) ? 0 : -1)) ^ (-1)) >>> 31));
    }

    private final java.lang.String i() {
        try {
            this.b.d("Hello?");
            return "Hello?";
        } catch (java.lang.IllegalArgumentException unused) {
            return "AskToRepeat";
        }
    }

    private final void j(defpackage.almy almyVar) {
        if (this.k && this.l) {
            defpackage.alvv alvvVar = this.a;
            alvvVar.e = true;
            alvvVar.a.a(defpackage.alvv.a(alvvVar.d()), almyVar);
        }
    }

    private final void k(defpackage.almy almyVar) {
        this.g.set(false);
        this.h.set(true);
        if (this.p.booleanValue()) {
            defpackage.alvv alvvVar = this.a;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_CONTINUE_TRANSCRIBING;
            akzzVarM.u();
            defpackage.almz almzVar = akzzVarM.b;
            almzVar.c = alnbVar.aN;
            almzVar.b |= 1;
            alvvVar.h((defpackage.almz) akzzVarM.p(), almyVar);
        }
    }

    private final boolean l() {
        return j$.util.Collection.-EL.stream(this.f.a()).filter(new defpackage.alzc(2)).map(new defpackage.alyz(16)).allMatch(new defpackage.alks(this, 17));
    }

    private final boolean m(defpackage.alnm alnmVar) {
        return alnmVar.g && l();
    }

    private static final long n(aify aifyVar, java.lang.String str) {
        return j$.util.Collection.-EL.stream(aifyVar).filter(new defpackage.alks(str, 16)).count();
    }

    private static final boolean o(float f) {
        return f >= 0.0f && f <= 1.0f;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_TIMEOUT, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_RINGING_STARTED, defpackage.alnb.EVENT_SAY, defpackage.alnb.EVENT_FLOW_SIGNALS, new defpackage.alnb[]{defpackage.alnb.EVENT_RINGING_ENDED, defpackage.alnb.EVENT_USER_END_CALL, defpackage.alnb.EVENT_USER_JOIN_CALL, defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL, defpackage.alnb.EVENT_START_CONVERSATION, defpackage.alnb.EVENT_QUICK_REPLY_CHIP_CLICKED, defpackage.alnb.EVENT_LANGUAGE_DETECTED, defpackage.alnb.EVENT_SPAM_AUDIO_MATCH, defpackage.alnb.EVENT_BOT_SILENCE_DEADLINE_REACHED});
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        this.f.c(almzVar);
        int i = this.u;
        byte[] bArr = null;
        if (i == 0) {
            throw null;
        }
        int i2 = 12;
        if (i == 2) {
            j$.lang.Iterable.-EL.forEach(this.r.a(almyVar), new defpackage.agzo(this, almyVar, i2, bArr));
            return;
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB.equals(defpackage.alnb.EVENT_FLOW_SIGNALS) || alnbVarB.equals(defpackage.alnb.EVENT_INTENT_EXTRACTION)) {
            try {
                this.w.j(almyVar);
                return;
            } catch (defpackage.aljs e2) {
                aimw aimwVarL = d.c().k(e2).l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/spamfilter/SpamFilterFlowProcessor", "consume", 287, "SpamFilterFlowProcessor.java");
                defpackage.almz almzVar3 = almyVar.h;
                if (almzVar3 == null) {
                    almzVar3 = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar3.c);
                if (alnbVarB2 == null) {
                    alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
                }
                aimwVarL.y("Consuming event type %s failed.", alnbVarB2.name());
                return;
            }
        }
        defpackage.almz almzVar4 = almyVar.h;
        if (almzVar4 == null) {
            almzVar4 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB3 = defpackage.alnb.b(almzVar4.c);
        if (alnbVarB3 == null) {
            alnbVarB3 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB3.equals(defpackage.alnb.EVENT_TIMEOUT)) {
            if (this.g.get()) {
                return;
            }
            if (!this.m.booleanValue() && n(this.f.a(), i()) + 1 >= this.s) {
                this.a.g(defpackage.alvu.c(defpackage.alyd.SILENT_CALL_TRIGGER, "KnownSpamBailout", defpackage.alxx.NO_DECISION, almyVar, defpackage.alxw.SILENT_CALL));
                return;
            }
            j$.util.Optional optionalOfNullable = this.n;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(anar.m((defpackage.almy) optionalOfNullable.get()));
            }
            defpackage.alnm alnmVar = (defpackage.alnm) optionalOfNullable.orElse(defpackage.alnm.a);
            if (alnmVar.f && !this.h.get() && !m(alnmVar)) {
                defpackage.almm almmVar = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
                if (almmVar == null) {
                    almmVar = defpackage.almm.a;
                }
                if (!almmVar.c.equals("SayNothing")) {
                    j$.util.Optional optional = this.n;
                    defpackage.alui aluiVar = new defpackage.alui(this, i2);
                    if (true == optional.isPresent()) {
                        ((defpackage.alzn) aluiVar.a).g((defpackage.almy) optional.get());
                    }
                    this.n = j$.util.Optional.empty();
                    return;
                }
            }
            boolean zBooleanValue = h(i()).booleanValue();
            defpackage.alvv alvvVar = this.a;
            if (zBooleanValue) {
                alvvVar.g(defpackage.alvu.b(defpackage.alyd.TIMEOUT_BAILOUT, "ConnectToUserUnknownIfSpam", defpackage.alxx.NO_DECISION, almyVar));
                return;
            } else {
                alvvVar.k(defpackage.alyd.TIMEOUT_TRIGGER, almyVar, i());
                return;
            }
        }
        defpackage.almz almzVar5 = almyVar.h;
        if (almzVar5 == null) {
            almzVar5 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB4 = defpackage.alnb.b(almzVar5.c);
        if (alnbVarB4 == null) {
            alnbVarB4 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB4.equals(defpackage.alnb.EVENT_SCOOBY_SPAM_SIGNAL)) {
            defpackage.almz almzVar6 = almyVar.h;
            if (almzVar6 == null) {
                almzVar6 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alow.b;
            almzVar6.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar6).n.j((alac) apdiVar.a);
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
        defpackage.almz almzVar7 = almyVar.h;
        if (almzVar7 == null) {
            almzVar7 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB5 = defpackage.alnb.b(almzVar7.c);
        if (alnbVarB5 == null) {
            alnbVarB5 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB5.equals(defpackage.alnb.EVENT_RINGING_STARTED)) {
            this.g.set(true);
            return;
        }
        defpackage.almz almzVar8 = almyVar.h;
        if (almzVar8 == null) {
            almzVar8 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB6 = defpackage.alnb.b(almzVar8.c);
        if (alnbVarB6 == null) {
            alnbVarB6 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB6.equals(defpackage.alnb.EVENT_RINGING_ENDED)) {
            k(almyVar);
            defpackage.almz almzVar9 = almyVar.h;
            if (almzVar9 == null) {
                almzVar9 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.aloj.e;
            almzVar9.c(apdiVar2);
            java.lang.Object objJ2 = ((alaa) almzVar9).n.j((alac) apdiVar2.a);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            defpackage.alsp alspVarB = defpackage.alsp.b(((defpackage.aloj) objJ2).d);
            if (alspVarB == null) {
                alspVarB = defpackage.alsp.UNKNOWN;
            }
            int iOrdinal = alspVarB.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    this.a.l(defpackage.alyd.USER_DECLINED_TRIGGER, almyVar, "CustomerRejectionBailout", defpackage.alsz.USER);
                    return;
                }
                return;
            } else if (!this.p.booleanValue()) {
                this.a.k(defpackage.alyd.USER_NOT_REACHED_TRIGGER, almyVar, "CustomerNotReachedBailout");
                return;
            } else {
                this.u = 2;
                this.a.m(this.r.c(2, almyVar, defpackage.alsz.BOT), almyVar);
                return;
            }
        }
        defpackage.almz almzVar10 = almyVar.h;
        if (almzVar10 == null) {
            almzVar10 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB7 = defpackage.alnb.b(almzVar10.c);
        if (alnbVarB7 == null) {
            alnbVarB7 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB7.equals(defpackage.alnb.EVENT_ASR_RESULT)) {
            defpackage.almz almzVar11 = almyVar.h;
            if (almzVar11 == null) {
                almzVar11 = defpackage.almz.a;
            }
            apdi apdiVar3 = defpackage.alnj.f;
            almzVar11.c(apdiVar3);
            java.lang.Object objJ3 = ((alaa) almzVar11).n.j((alac) apdiVar3.a);
            if (objJ3 == null) {
                objJ3 = apdiVar3.b;
            } else {
                apdiVar3.c(objJ3);
            }
            alqu alquVar = ((defpackage.alnj) objJ3).c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            if (this.m.booleanValue()) {
                return;
            }
            this.m = java.lang.Boolean.valueOf(alquVar.c == 1 && !defpackage.alph.c(alquVar));
            return;
        }
        defpackage.almz almzVar12 = almyVar.h;
        if (almzVar12 == null) {
            almzVar12 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB8 = defpackage.alnb.b(almzVar12.c);
        if (alnbVarB8 == null) {
            alnbVarB8 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB8.equals(defpackage.alnb.EVENT_USER_END_CALL)) {
            defpackage.alvv alvvVar2 = this.a;
            akzz akzzVarM = defpackage.almz.a.m();
            defpackage.alnb alnbVar = defpackage.alnb.EVENT_STOP_BOT_SPEECH;
            akzzVarM.u();
            defpackage.almz almzVar13 = akzzVarM.b;
            almzVar13.c = alnbVar.aN;
            almzVar13.b |= 1;
            alvvVar2.h((defpackage.almz) akzzVarM.p(), almyVar);
            alvvVar2.l(defpackage.alyd.USER_END_CALL_TRIGGER, almyVar, "EndCall", defpackage.alsz.USER);
            return;
        }
        defpackage.almz almzVar14 = almyVar.h;
        if (almzVar14 == null) {
            almzVar14 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB9 = defpackage.alnb.b(almzVar14.c);
        if (alnbVarB9 == null) {
            alnbVarB9 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB9.equals(defpackage.alnb.EVENT_USER_JOIN_CALL)) {
            defpackage.alvv alvvVar3 = this.a;
            akzz akzzVarM2 = defpackage.almz.a.m();
            defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_STOP_BOT_SPEECH;
            akzzVarM2.u();
            defpackage.almz almzVar15 = akzzVarM2.b;
            almzVar15.c = alnbVar2.aN;
            almzVar15.b |= 1;
            alvvVar3.h((defpackage.almz) akzzVarM2.p(), almyVar);
            alvvVar3.l(defpackage.alyd.USER_JOIN_CALL_TRIGGER, almyVar, "JoinCall", defpackage.alsz.USER);
            return;
        }
        defpackage.almz almzVar16 = almyVar.h;
        if (almzVar16 == null) {
            almzVar16 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB10 = defpackage.alnb.b(almzVar16.c);
        if (alnbVarB10 == null) {
            alnbVarB10 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB10.equals(defpackage.alnb.EVENT_START_CONVERSATION)) {
            this.a.f(almyVar);
            return;
        }
        defpackage.almz almzVar17 = almyVar.h;
        if (almzVar17 == null) {
            almzVar17 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB11 = defpackage.alnb.b(almzVar17.c);
        if (alnbVarB11 == null) {
            alnbVarB11 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB11.equals(defpackage.alnb.EVENT_QUICK_REPLY_CHIP_CLICKED)) {
            defpackage.alvv alvvVar4 = this.a;
            defpackage.almz almzVar18 = almyVar.h;
            if (almzVar18 == null) {
                almzVar18 = defpackage.almz.a;
            }
            apdi apdiVar4 = defpackage.alof.b;
            almzVar18.c(apdiVar4);
            akzs akzsVar = ((alaa) almzVar18).n;
            alac alacVar = (alac) apdiVar4.a;
            java.lang.Object objJ4 = akzsVar.j(alacVar);
            if (objJ4 == null) {
                objJ4 = apdiVar4.b;
            } else {
                apdiVar4.c(objJ4);
            }
            if (alvvVar4.b.a(((defpackage.alsk) objJ4).c, j$.util.Optional.empty()).equals(defpackage.alsy.START_TAKING_MESSAGE)) {
                this.u = 2;
                alvvVar4.m(this.r.c(3, almyVar, defpackage.alsz.USER), almyVar);
            } else {
                defpackage.almz almzVar19 = almyVar.h;
                if (almzVar19 == null) {
                    almzVar19 = defpackage.almz.a;
                }
                almzVar19.c(apdiVar4);
                java.lang.Object objJ5 = ((alaa) almzVar19).n.j(alacVar);
                if (objJ5 == null) {
                    objJ5 = apdiVar4.b;
                } else {
                    apdiVar4.c(objJ5);
                }
                alvvVar4.i(((defpackage.alsk) objJ5).c, almyVar, j$.util.Optional.empty(), defpackage.alsz.USER);
            }
            k(almyVar);
            return;
        }
        defpackage.almz almzVar20 = almyVar.h;
        if (almzVar20 == null) {
            almzVar20 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB12 = defpackage.alnb.b(almzVar20.c);
        if (alnbVarB12 == null) {
            alnbVarB12 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB12.equals(defpackage.alnb.EVENT_LANGUAGE_DETECTED)) {
            defpackage.almz almzVar21 = almyVar.h;
            if (almzVar21 == null) {
                almzVar21 = defpackage.almz.a;
            }
            apdi apdiVar5 = defpackage.alno.d;
            almzVar21.c(apdiVar5);
            java.lang.Object objJ6 = ((alaa) almzVar21).n.j((alac) apdiVar5.a);
            if (objJ6 == null) {
                objJ6 = apdiVar5.b;
            } else {
                apdiVar5.c(objJ6);
            }
            if (this.j.contains(((defpackage.alno) objJ6).c)) {
                this.k = true;
                j(almyVar);
                return;
            }
            return;
        }
        defpackage.almz almzVar22 = almyVar.h;
        if (almzVar22 == null) {
            almzVar22 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB13 = defpackage.alnb.b(almzVar22.c);
        if (alnbVarB13 == null) {
            alnbVarB13 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB13.equals(defpackage.alnb.EVENT_SPAM_AUDIO_MATCH)) {
            this.l = true;
            j(almyVar);
            return;
        }
        defpackage.almz almzVar23 = almyVar.h;
        if (almzVar23 == null) {
            almzVar23 = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB14 = defpackage.alnb.b(almzVar23.c);
        if (alnbVarB14 == null) {
            alnbVarB14 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB14.equals(defpackage.alnb.EVENT_BOT_SILENCE_DEADLINE_REACHED)) {
            this.a.g(defpackage.alvu.b(defpackage.alyd.BOT_SILENCE_DEADLINE_REACHED, "ConnectToUserUnknownIfSpam", defpackage.alxx.NO_DECISION, almyVar));
        }
    }

    public final void c(aigf aigfVar) {
        if (this.g.get()) {
            return;
        }
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
                if (alnmVar.f && !m(alnmVar)) {
                    this.n = j$.util.Optional.of(almyVar2);
                    return;
                }
                this.n = j$.util.Optional.empty();
            }
            if (alngVar.d) {
                this.a.k(defpackage.alyd.POSSIBLY_INCOMPLETE_TRIGGER, almyVar2, "SayNothing");
                return;
            }
            if (!alngVar.c) {
                g(almyVar2);
                this.i.set(0);
                return;
            }
            long andIncrement = this.i.getAndIncrement();
            defpackage.alvv alvvVar = this.a;
            if (andIncrement >= 2) {
                alvvVar.g(defpackage.alvu.b(defpackage.alyd.ASR_LOW_CONFIDENCE_BAILOUT_TRIGGER, "LowConfidenceConnectToUser", defpackage.alxx.NO_DECISION, almyVar2));
            } else {
                alvvVar.k(defpackage.alyd.ASR_LOW_CONFIDENCE_TRIGGER, almyVar2, "AskToRepeat");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        defpackage.alyk alykVar;
        this.u = 1;
        apdi apdiVar = defpackage.alyb.n;
        almlVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        this.o = (defpackage.alyb) objJ;
        apdi apdiVar2 = defpackage.alwn.r;
        alqkVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.alwn alwnVar = (defpackage.alwn) objJ2;
        defpackage.alyc alycVar = alwnVar.f;
        if (alycVar == null) {
            alycVar = defpackage.alyc.a;
        }
        if ((alycVar.b & 4) == 0) {
            this.t = this.o.f;
        } else {
            defpackage.alyc alycVar2 = alwnVar.f;
            if (o((alycVar2 == null ? defpackage.alyc.a : alycVar2).e)) {
                if (alycVar2 == null) {
                    alycVar2 = defpackage.alyc.a;
                }
                this.t = alycVar2.e;
            } else {
                this.t = this.o.f;
            }
        }
        akzm akzmVar = this.o.e;
        if (akzmVar == null) {
            akzmVar = akzm.a;
        }
        long j = akzmVar.b;
        akzm akzmVar2 = almlVar.e;
        if (akzmVar2 == null) {
            akzmVar2 = akzm.a;
        }
        this.s = j / akzmVar2.b;
        this.g = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.h = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.i = new java.util.concurrent.atomic.AtomicInteger(0);
        this.m = java.lang.Boolean.FALSE;
        this.p = java.lang.Boolean.valueOf(alwnVar.d);
        this.w = new vqy(this, aihd.r(defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_FLOW_SIGNALS));
        this.b = alln.g(alqdVar, almbVar.f, alkfVar);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        defpackage.alyc alycVar3 = alwnVar.f;
        float f = (alycVar3 == null ? defpackage.alyc.a : alycVar3).d;
        if (alycVar3 == null) {
            alycVar3 = defpackage.alyc.a;
        }
        if ((alycVar3.b & 2) == 0 || !o(f)) {
            defpackage.alyb alybVar = this.o;
            if ((alybVar.b & 16) != 0) {
                optionalEmpty = j$.util.Optional.of(java.lang.Float.valueOf(alybVar.j));
            }
        } else {
            optionalEmpty = j$.util.Optional.of(java.lang.Float.valueOf(f));
        }
        defpackage.alzo alzoVar = new defpackage.alzo();
        alzoVar.a = this.b;
        aigf aigfVar = (aigf) j$.util.Collection.-EL.stream(this.o.g).filter(new defpackage.alzc(3)).collect(aido.b(new defpackage.alyz(17), new defpackage.alyz(18)));
        this.a.e(this.b, aigfVar, optionalEmpty, alzoVar);
        defpackage.alyb alybVar2 = this.o;
        if ((alybVar2.b & 8) != 0) {
            akzm akzmVar3 = alybVar2.i;
            if (akzmVar3 == null) {
                akzmVar3 = akzm.a;
            }
            this.q = ajsz.dJ(akzmVar3);
        } else {
            this.q = e;
        }
        defpackage.alwh alwhVar = this.o.k;
        if (alwhVar == null) {
            alwhVar = defpackage.alwh.a;
        }
        this.j = aihd.o(alwhVar.d);
        this.k = false;
        this.l = false;
        this.n = j$.util.Optional.empty();
        defpackage.alyb alybVar3 = this.o;
        if ((alybVar3.b & 128) != 0) {
            alykVar = alybVar3.m;
            if (alykVar == null) {
                alykVar = defpackage.alyk.a;
            }
        } else {
            j$.time.Duration duration = this.q;
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(aigf.o(defpackage.alyd.USER_NOT_REACHED_TAKING_MESSAGE_TRIGGER, defpackage.alyl.START_TAKING_MESSAGE_TRIGGER, defpackage.alyd.CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER, defpackage.alyl.CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER, defpackage.alyd.TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER, defpackage.alyl.TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER, defpackage.alyd.MESSAGE_TOO_LONG_TRIGGER, defpackage.alyl.MESSAGE_TOO_LONG_TRIGGER, defpackage.alyd.POSSIBLY_INCOMPLETE_TRIGGER, defpackage.alyl.INCOMPLETE_TRIGGER).e()).map(new defpackage.alyy(aigfVar, 10)).flatMap(new defpackage.alyz(15)).collect(aido.a);
            akzx akzxVarM = defpackage.alyk.a.m();
            akzm akzmVarDH = ajsz.dH(duration);
            akzxVarM.u();
            defpackage.alyk alykVar2 = (defpackage.alyk) akzxVarM.b;
            j$.util.Objects.requireNonNull(akzmVarDH);
            alykVar2.c = akzmVarDH;
            alykVar2.b |= 1;
            defpackage.alyj alyjVar = defpackage.alyj.a;
            akzx akzxVarM2 = alyjVar.m();
            akzxVarM2.u();
            defpackage.alyj alyjVar2 = (defpackage.alyj) akzxVarM2.b;
            alyjVar2.c = 1;
            alyjVar2.b |= 1;
            akzxVarM2.ba(aifyVar);
            akzxVarM.bQ(akzxVarM2);
            akzx akzxVarM3 = alyjVar.m();
            akzxVarM3.u();
            defpackage.alyj alyjVar3 = (defpackage.alyj) akzxVarM3.b;
            alyjVar3.c = 2;
            alyjVar3.b |= 1;
            akzxVarM3.ba(aifyVar);
            akzxVarM.bQ(akzxVarM3);
            alykVar = (defpackage.alyk) akzxVarM.p();
        }
        this.r = new defpackage.alvx(alykVar, this.b, this.v, this);
    }

    public final void g(defpackage.almy almyVar) {
        defpackage.alvu alvuVarA;
        if (this.g.get()) {
            return;
        }
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        apdi apdiVar = defpackage.alnm.i;
        almzVar.c(apdiVar);
        akzs akzsVar = ((alaa) almzVar).n;
        alac alacVar = (alac) apdiVar.a;
        java.lang.Object objJ = akzsVar.j(alacVar);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        if (((defpackage.alnm) objJ).g && !l()) {
            this.a.k(defpackage.alyd.PRE_CONV_EXTRACTION_DURING_CONVERSATION, almyVar, "AskToRepeat");
            return;
        }
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        almzVar2.c(apdiVar);
        java.lang.Object objJ2 = ((alaa) almzVar2).n.j(alacVar);
        if (objJ2 == null) {
            objJ2 = apdiVar.b;
        } else {
            apdiVar.c(objJ2);
        }
        defpackage.alnm alnmVar = (defpackage.alnm) objJ2;
        defpackage.almm almmVar = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
        if (almmVar == null) {
            almmVar = defpackage.almm.a;
        }
        float f = almmVar.d;
        defpackage.almm almmVar2 = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
        if (almmVar2 == null) {
            almmVar2 = defpackage.almm.a;
        }
        defpackage.alvv alvvVar = this.a;
        java.lang.String str = almmVar2.c;
        defpackage.alxx alxxVarC = alvvVar.c(str);
        if (str.equals("UNKNOWN_ROBOT_INTENT")) {
            alvuVarA = defpackage.alvu.b(defpackage.alyd.UNKNOWN_PREDICTION_INTENT_TRIGGER, "ConnectToUserUnknownIfSpam", alxxVarC, almyVar);
        } else if (this.b.c(str).equals(defpackage.alsy.END_SPAM_CALL)) {
            if (f > this.t) {
                defpackage.almm almmVar3 = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
                if (almmVar3 == null) {
                    almmVar3 = defpackage.almm.a;
                }
                alvuVarA = defpackage.alvu.a(almmVar3, alxxVarC, almyVar);
            } else {
                alvuVarA = defpackage.alvu.b(defpackage.alyd.PREDICTION_LOW_CONFIDENCE_TRIGGER, "ConnectToUserUnknownIfSpam", alxxVarC, almyVar);
            }
        } else if (h(str).booleanValue()) {
            alvuVarA = defpackage.alvu.b(defpackage.alyd.EXCEEDS_COUNT_REPEAT_TRIGGER, "ConnectToUserUnknownIfSpam", alxxVarC, almyVar);
        } else {
            defpackage.almm almmVar4 = (alnmVar.c == 8 ? (defpackage.almn) alnmVar.d : defpackage.almn.a).c;
            if (almmVar4 == null) {
                almmVar4 = defpackage.almm.a;
            }
            alvuVarA = defpackage.alvu.a(almmVar4, alxxVarC, almyVar);
        }
        alvvVar.g(alvuVarA);
    }

    @Override // defpackage.aljt
    public final void v(defpackage.almz almzVar, defpackage.almy almyVar) {
        int iAQ;
        int i = this.u;
        if (i == 0) {
            throw null;
        }
        if (i == 2 && (iAQ = a.aQ(almzVar.d)) != 0 && iAQ == 2) {
            this.a.m(almzVar, almyVar);
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
