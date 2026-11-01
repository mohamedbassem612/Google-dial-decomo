package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alza implements defpackage.allg {
    public static final /* synthetic */ int h = 0;
    private static final aimz i = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyFlowProcessor");
    private static final j$.time.Duration j = j$.time.Duration.ofSeconds(5);
    private static final aigf k = aigf.k(java.util.Locale.JAPAN, "Disclosure2");
    private aigf A;
    private defpackage.alxi B;
    private boolean C;
    private java.lang.Boolean D = java.lang.Boolean.FALSE;
    private aify E;
    private java.util.Map F;
    private defpackage.altg G;
    private boolean H;
    private boolean I;
    private final defpackage.alqf J;
    private int K;
    public boolean a;
    public java.util.concurrent.atomic.AtomicBoolean b;
    public alln c;
    public aigf d;
    public aigf e;
    public java.util.Locale f;
    public aigf g;
    private final defpackage.allj l;
    private defpackage.alxh m;
    private boolean n;
    private boolean o;
    private boolean p;
    private aigf q;
    private aigf r;
    private aigf s;
    private aify t;
    private boolean u;
    private j$.util.Optional v;
    private aify w;
    private aify x;
    private defpackage.alwq y;
    private java.lang.String z;

    public alza(defpackage.alli alliVar, defpackage.alqf alqfVar) {
        this.l = alliVar.a(defpackage.allh.o.name());
        this.J = alqfVar;
    }

    private final aify g(aify aifyVar) {
        if (this.z.isEmpty()) {
            aifyVar = (aify) j$.util.Collection.-EL.stream(aifyVar).filter(new defpackage.alks(this, 10)).collect(aido.a);
        }
        if (this.C && !this.E.isEmpty()) {
            aifyVar = (aify) airh.d(new j$.util.stream.Stream[]{j$.util.Collection.-EL.stream(aifyVar).filter(new defpackage.altw(13)), j$.util.Collection.-EL.stream(this.E), j$.util.Collection.-EL.stream(aifyVar).filter(new defpackage.altw(14))}).collect(aido.a);
        }
        if (this.H) {
            aift aiftVar = new aift(4);
            akzx akzxVarM = defpackage.alxf.a.m();
            akzxVarM.u();
            defpackage.alxf alxfVar = (defpackage.alxf) akzxVarM.b;
            j$.util.Objects.requireNonNull("AI replies");
            alxfVar.b |= 1;
            alxfVar.e = "AI replies";
            defpackage.alsy alsyVar = defpackage.alsy.ASK_FOR_CONSENT_FOR_AI_REPLIES;
            akzxVarM.u();
            defpackage.alxf alxfVar2 = (defpackage.alxf) akzxVarM.b;
            alxfVar2.f = alsyVar.j;
            alxfVar2.b |= 2;
            akzxVarM.u();
            defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVarM.b;
            alxfVar3.g = 5;
            alxfVar3.b |= 4;
            aiftVar.i((defpackage.alxf) akzxVarM.p());
            aiftVar.k(aifyVar);
            aifyVar = aiftVar.h();
        }
        return aify.n(((java.util.LinkedHashMap) j$.util.Collection.-EL.stream(aifyVar).collect(j$.util.stream.Collectors.toMap(new defpackage.alyy(this, 5), new defpackage.alyz(3), new defpackage.vfd(4), new defpackage.ahuq(9)))).values());
    }

    private final aify h() {
        return aify.n((java.util.Collection) this.r.getOrDefault(this.B, (java.util.List) this.q.getOrDefault(this.y, this.x)));
    }

    private final aify i(java.util.Collection collection) {
        return (aify) j$.util.Collection.-EL.stream(c(collection)).map(new defpackage.alpp(16)).collect(aido.a);
    }

    private final defpackage.almz j(java.lang.String str) {
        return p(defpackage.alnf.a.m(), str);
    }

    private final defpackage.almz k(defpackage.alxn alxnVar, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) this.A.getOrDefault(alxnVar, str);
        akzx akzxVarM = defpackage.alnf.a.m();
        akzxVarM.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVarM.b;
        alnfVar.f = java.lang.Integer.valueOf(alxnVar.g);
        alnfVar.e = 6;
        return p(akzxVarM, str2);
    }

    private final defpackage.almz l() {
        return (defpackage.almz) this.v.orElse(o(g(h()), defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT, j$.util.Optional.empty()));
    }

    private static j$.util.Optional m(java.util.List list) {
        return j$.util.Collection.-EL.stream(list).filter(new defpackage.altw(20)).findFirst();
    }

    private static final defpackage.almz n(defpackage.alnf alnfVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnf.k, alnfVar);
        return akzzVarM.p();
    }

    private static final defpackage.almz o(java.util.List list, defpackage.alnb alnbVar, j$.util.Optional optional) {
        akzx akzxVarM = defpackage.alnf.a.m();
        akzx akzxVarM2 = defpackage.alob.a.m();
        akzxVarM2.aL(list);
        akzxVarM.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVarM.b;
        defpackage.alob alobVar = (defpackage.alob) akzxVarM2.p();
        j$.util.Objects.requireNonNull(alobVar);
        alnfVar.d = alobVar;
        alnfVar.c = 12;
        j$.util.Objects.requireNonNull(akzxVarM);
        defpackage.alui aluiVar = new defpackage.alui(akzxVarM, 10);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            akzx akzxVar = (akzx) aluiVar.a;
            akzxVar.u();
            defpackage.alnf alnfVar2 = (defpackage.alnf) akzxVar.b;
            j$.util.Objects.requireNonNull(obj);
            alnfVar2.i = (defpackage.almm) obj;
            alnfVar2.b |= 4;
        }
        akzz akzzVarM = defpackage.almz.a.m();
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        akzzVarM.bV(defpackage.alnf.k, (defpackage.alnf) akzxVarM.p());
        return akzzVarM.p();
    }

    private final defpackage.almz p(akzx akzxVar, java.lang.String str) {
        defpackage.alsy alsyVarC = this.c.c(str);
        akzxVar.u();
        defpackage.alnf alnfVar = (defpackage.alnf) akzxVar.b;
        defpackage.alnf alnfVar2 = defpackage.alnf.a;
        alnfVar.g = alsyVarC.j;
        alnfVar.b |= 1;
        akzx akzxVarM = defpackage.almm.a.m();
        akzxVarM.u();
        defpackage.almm almmVar = (defpackage.almm) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        almmVar.b |= 1;
        almmVar.c = str;
        akzxVar.u();
        defpackage.alnf alnfVar3 = (defpackage.alnf) akzxVar.b;
        defpackage.almm almmVar2 = (defpackage.almm) akzxVarM.p();
        j$.util.Objects.requireNonNull(almmVar2);
        alnfVar3.d = almmVar2;
        alnfVar3.c = 1;
        return n((defpackage.alnf) akzxVar.p());
    }

    private static defpackage.alnb q(int i2) {
        if (i2 != 0) {
            return i2 + (-1) != 1 ? defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT : defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT_DARK_LAUNCH;
        }
        throw null;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_INTENT_EXTRACTION, defpackage.alnb.EVENT_USER_END_CALL, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_END_SAY_TIMING, defpackage.alnb.EVENT_CALLER_TYPE, defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT, new defpackage.alnb[]{defpackage.alnb.EVENT_USER_JOIN_CALL, defpackage.alnb.EVENT_START_CONVERSATION, defpackage.alnb.EVENT_SELECTED_OPTION, defpackage.alnb.EVENT_TIMEOUT, defpackage.alnb.EVENT_TIMEOUT_AFTER_HUMAN_SPEECH, defpackage.alnb.EVENT_SMART_REPLY_LLM_ACTIVE, defpackage.alnb.EVENT_SHOULD_ASK_FOR_LLM_CONSENT});
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.alrf alrfVarB;
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        if (iOrdinal == 1) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alnj.f;
            almzVar2.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar2).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            alqu alquVar = ((defpackage.alnj) objJ).c;
            if (alquVar == null) {
                alquVar = alqu.a;
            }
            if (alquVar.c != 1 || defpackage.alph.c(alquVar)) {
                return;
            }
            this.D = java.lang.Boolean.TRUE;
            if (!this.o || this.b.getAndSet(true)) {
                return;
            }
            this.l.a(k(defpackage.alxn.WAIT_FOR_USER_RESPONSE_TRIGGER, "SRWaitForUserResponse"), almyVar);
            try {
                this.J.b(new defpackage.alvr(this, 3), j);
                return;
            } catch (defpackage.aljs e) {
                a.by(i.c(), "Setting a throttle timeout to bot response failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyFlowProcessor", "handleAsrResultEvent", (char) 484, "SmartReplyFlowProcessor.java", e);
                this.b.set(false);
                return;
            }
        }
        if (iOrdinal == 2) {
            if (this.n) {
                return;
            }
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alnm.i;
            almzVar3.c(apdiVar2);
            akzs akzsVar = ((alaa) almzVar3).n;
            alac alacVar = (alac) apdiVar2.a;
            java.lang.Object objJ2 = akzsVar.j(alacVar);
            if (objJ2 == null) {
                objJ2 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ2);
            }
            if (((defpackage.alnm) objJ2).f) {
                return;
            }
            defpackage.almz almzVar4 = almyVar.h;
            if (almzVar4 == null) {
                almzVar4 = defpackage.almz.a;
            }
            almzVar4.c(apdiVar2);
            java.lang.Object objJ3 = ((alaa) almzVar4).n.j(alacVar);
            if (objJ3 == null) {
                objJ3 = apdiVar2.b;
            } else {
                apdiVar2.c(objJ3);
            }
            defpackage.alnm alnmVar = (defpackage.alnm) objJ3;
            int iOrdinal2 = defpackage.alnl.a(alnmVar.c).ordinal();
            if (iOrdinal2 == 1) {
                defpackage.alnb alnbVarQ = q(this.K);
                int i2 = this.K;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    defpackage.almz almzVarL = l();
                    apdi apdiVar3 = defpackage.alnf.k;
                    almzVarL.c(apdiVar3);
                    java.lang.Object objJ4 = ((alaa) almzVarL).n.j((alac) apdiVar3.a);
                    if (objJ4 == null) {
                        objJ4 = apdiVar3.b;
                    } else {
                        apdiVar3.c(objJ4);
                    }
                    defpackage.alnf alnfVar = (defpackage.alnf) objJ4;
                    this.l.a(o(g(aify.n((alnfVar.c == 12 ? (defpackage.alob) alnfVar.d : defpackage.alob.a).b)), alnbVarQ, j$.util.Optional.empty()), almyVar);
                    return;
                }
                defpackage.almz almzVar5 = almyVar.h;
                if (almzVar5 == null) {
                    almzVar5 = defpackage.almz.a;
                }
                almzVar5.c(apdiVar2);
                java.lang.Object objJ5 = ((alaa) almzVar5).n.j(alacVar);
                if (objJ5 == null) {
                    objJ5 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ5);
                }
                defpackage.alnm alnmVar2 = (defpackage.alnm) objJ5;
                defpackage.almm almmVar = (alnmVar2.c == 8 ? (defpackage.almn) alnmVar2.d : defpackage.almn.a).c;
                if (almmVar == null) {
                    almmVar = defpackage.almm.a;
                }
                aify aifyVarN = aify.n((java.util.Collection) this.s.getOrDefault(almmVar.c, aike.a));
                j$.util.stream.Stream streamFlatMap = j$.util.Collection.-EL.stream(almmVar.e).sorted(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingDouble(new defpackage.alyx(0)))).map(new defpackage.alpp(17)).flatMap(new defpackage.alyy(this, 0));
                j$.util.stream.Collector collector = aido.a;
                aify aifyVarH = (aify) j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(aifyVarN), j$.util.Collection.-EL.stream((aify) streamFlatMap.collect(collector))).filter(new defpackage.alks(this, 11)).collect(collector);
                if (this.t.contains(almmVar.c) || aifyVarH.isEmpty()) {
                    aifyVarH = h();
                }
                defpackage.almz almzVarO = o(g(aifyVarH), alnbVarQ, j$.util.Optional.of(almmVar));
                int i3 = this.K;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == 5) {
                    this.F.put(almyVar.f, almzVarO);
                    return;
                } else {
                    this.l.a(almzVarO, almyVar);
                    return;
                }
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    i.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyFlowProcessor", "handleIntentExtractionEvent", 528, "SmartReplyFlowProcessor.java").y("Unsupported IntentExtractionEvent extraction case: %s.", defpackage.alnl.a(alnmVar.c));
                    return;
                }
                int i4 = this.K;
                if (i4 == 0) {
                    throw null;
                }
                if (i4 == 5) {
                    defpackage.almz almzVar6 = almyVar.h;
                    if (almzVar6 == null) {
                        almzVar6 = defpackage.almz.a;
                    }
                    almzVar6.c(apdiVar2);
                    java.lang.Object objJ6 = ((alaa) almzVar6).n.j(alacVar);
                    if (objJ6 == null) {
                        objJ6 = apdiVar2.b;
                    } else {
                        apdiVar2.c(objJ6);
                    }
                    defpackage.allj alljVar = this.l;
                    defpackage.alnm alnmVar3 = (defpackage.alnm) objJ6;
                    akzz akzzVarM = defpackage.almz.a.m();
                    defpackage.alnb alnbVar = defpackage.alnb.EVENT_FLOW_OUTPUT;
                    akzzVarM.u();
                    defpackage.almz almzVar7 = akzzVarM.b;
                    almzVar7.c = alnbVar.aN;
                    almzVar7.b |= 1;
                    apdi apdiVar4 = defpackage.alnf.k;
                    akzx akzxVarM = defpackage.alnf.a.m();
                    defpackage.alni alniVar = alnmVar3.c == 10 ? (defpackage.alni) alnmVar3.d : defpackage.alni.a;
                    akzxVarM.u();
                    defpackage.alnf alnfVar2 = (defpackage.alnf) akzxVarM.b;
                    j$.util.Objects.requireNonNull(alniVar);
                    alnfVar2.d = alniVar;
                    alnfVar2.c = 13;
                    defpackage.alsz alszVarB = defpackage.alsz.b(alnmVar3.h);
                    if (alszVarB == null) {
                        alszVarB = defpackage.alsz.UNKNOWN_ENTITY;
                    }
                    akzxVarM.u();
                    defpackage.alnf alnfVar3 = (defpackage.alnf) akzxVarM.b;
                    alnfVar3.h = alszVarB.d;
                    alnfVar3.b |= 2;
                    akzzVarM.bV(apdiVar4, (defpackage.alnf) akzxVarM.p());
                    alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
                    return;
                }
                return;
            }
            int i5 = this.K;
            if (i5 == 0) {
                throw null;
            }
            if (i5 == 5) {
                defpackage.almz almzVar8 = almyVar.h;
                if (almzVar8 == null) {
                    almzVar8 = defpackage.almz.a;
                }
                almzVar8.c(apdiVar2);
                java.lang.Object objJ7 = ((alaa) almzVar8).n.j(alacVar);
                if (objJ7 == null) {
                    objJ7 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ7);
                }
                defpackage.alnm alnmVar4 = (defpackage.alnm) objJ7;
                defpackage.alob alobVar = alnmVar4.c == 9 ? (defpackage.alob) alnmVar4.d : defpackage.alob.a;
                if (alobVar.b.isEmpty() && this.F.containsKey(almyVar.f)) {
                    this.l.a((defpackage.almz) this.F.get(almyVar.f), almyVar);
                    return;
                }
                aift aiftVar = new aift(4);
                aiftVar.k(alobVar.b);
                aiftVar.k(h());
                aify aifyVarH2 = aiftVar.h();
                defpackage.allj alljVar2 = this.l;
                akzz akzzVarM2 = defpackage.almz.a.m();
                defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_SMART_REPLY_FLOW_OUTPUT;
                akzzVarM2.u();
                defpackage.almz almzVar9 = akzzVarM2.b;
                almzVar9.c = alnbVar2.aN;
                almzVar9.b |= 1;
                apdi apdiVar5 = defpackage.alnf.k;
                akzx akzxVarM2 = defpackage.alnf.a.m();
                akzx akzxVarM3 = defpackage.alob.a.m();
                akzxVarM3.aL(g(aifyVarH2));
                akzxVarM2.u();
                defpackage.alnf alnfVar4 = (defpackage.alnf) akzxVarM2.b;
                defpackage.alob alobVar2 = (defpackage.alob) akzxVarM3.p();
                j$.util.Objects.requireNonNull(alobVar2);
                alnfVar4.d = alobVar2;
                alnfVar4.c = 12;
                akzzVarM2.bV(apdiVar5, (defpackage.alnf) akzxVarM2.p());
                alljVar2.a((defpackage.almz) akzzVarM2.p(), almyVar);
                return;
            }
            return;
        }
        if (iOrdinal == 9) {
            int iOrdinal3 = this.B.ordinal();
            if (iOrdinal3 == 0) {
                this.l.a(j((java.lang.String) this.c.b), almyVar);
            } else if (iOrdinal3 == 1) {
                this.l.a(j((java.lang.String) j$.util.Optional.ofNullable((java.lang.String) k.get(this.f)).orElse("SRIsItUrgentDisclosure")), almyVar);
            } else if (iOrdinal3 == 2) {
                this.l.a(j("SRTakeAMessage"), almyVar);
            }
            if (!this.I || this.G.equals(defpackage.altg.TTS_VOICE_UNSPECIFIED)) {
                return;
            }
            defpackage.allj alljVar3 = this.l;
            akzz akzzVarM3 = defpackage.almz.a.m();
            defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_SET_TTS_VOICE;
            akzzVarM3.u();
            defpackage.almz almzVar10 = akzzVarM3.b;
            almzVar10.c = alnbVar3.aN;
            almzVar10.b |= 1;
            apdi apdiVar6 = defpackage.alop.b;
            akzx akzxVarM4 = defpackage.alst.a.m();
            defpackage.altg altgVar = this.G;
            akzxVarM4.u();
            defpackage.alst alstVar = (defpackage.alst) akzxVarM4.b;
            alstVar.c = altgVar.e;
            alstVar.b |= 1;
            akzzVarM3.bV(apdiVar6, (defpackage.alst) akzxVarM4.p());
            alljVar3.a((defpackage.almz) akzzVarM3.p(), almyVar);
            return;
        }
        if (iOrdinal == 16) {
            this.u = true;
            defpackage.almz almzVar11 = almyVar.h;
            if (almzVar11 == null) {
                almzVar11 = defpackage.almz.a;
            }
            this.v = j$.util.Optional.of(almzVar11);
            return;
        }
        if (iOrdinal == 28) {
            if (this.u) {
                return;
            }
            defpackage.almz almzVar12 = almyVar.h;
            if (almzVar12 == null) {
                almzVar12 = defpackage.almz.a;
            }
            apdi apdiVar7 = defpackage.alms.d;
            almzVar12.c(apdiVar7);
            java.lang.Object objJ8 = ((alaa) almzVar12).n.j((alac) apdiVar7.a);
            if (objJ8 == null) {
                objJ8 = apdiVar7.b;
            } else {
                apdiVar7.c(objJ8);
            }
            defpackage.alwq alwqVarB = defpackage.alwq.b(((defpackage.alms) objJ8).c);
            if (alwqVarB == null) {
                alwqVarB = defpackage.alwq.TYPE_UNSET;
            }
            this.y = alwqVarB;
            return;
        }
        if (iOrdinal == 42) {
            if (this.p) {
                aigf aigfVar = this.A;
                defpackage.alxn alxnVar = defpackage.alxn.WAIT_FOR_USER_RESPONSE_AFTER_HUMAN_SPEECH_TIMEOUT_TRIGGER;
                if (aigfVar.containsKey(alxnVar)) {
                    this.l.a(k(alxnVar, "SRWaitForUserResponse"), almyVar);
                    this.p = false;
                    return;
                }
                return;
            }
            return;
        }
        if (iOrdinal != 48) {
            if (iOrdinal == 51) {
                this.K = 5;
                this.H = false;
                return;
            }
            if (iOrdinal == 64) {
                defpackage.almz almzVarL2 = l();
                apdi apdiVar8 = defpackage.alnf.k;
                almzVarL2.c(apdiVar8);
                java.lang.Object objJ9 = ((alaa) almzVarL2).n.j((alac) apdiVar8.a);
                if (objJ9 == null) {
                    objJ9 = apdiVar8.b;
                } else {
                    apdiVar8.c(objJ9);
                }
                defpackage.alnf alnfVar5 = (defpackage.alnf) objJ9;
                akzx akzxVarP = alnfVar5.p();
                defpackage.alob alobVar3 = defpackage.alob.a;
                akzx akzxVarM5 = alobVar3.m();
                if (alnfVar5.c == 12) {
                    alobVar3 = (defpackage.alob) alnfVar5.d;
                }
                akzxVarM5.aL((java.lang.Iterable) j$.util.Collection.-EL.stream(alobVar3.b).filter(new defpackage.altw(16)).collect(aido.a));
                akzxVarP.u();
                defpackage.alnf alnfVar6 = (defpackage.alnf) akzxVarP.b;
                defpackage.alob alobVar4 = (defpackage.alob) akzxVarM5.p();
                j$.util.Objects.requireNonNull(alobVar4);
                alnfVar6.d = alobVar4;
                alnfVar6.c = 12;
                defpackage.alnf alnfVar7 = (defpackage.alnf) akzxVarP.p();
                defpackage.allj alljVar4 = this.l;
                akzz akzzVarP = almzVarL2.p();
                akzzVarP.bV(apdiVar8, alnfVar7);
                alljVar4.a((defpackage.almz) akzzVarP.p(), almyVar);
                return;
            }
            if (iOrdinal == 66) {
                this.H = true;
                return;
            }
            if (iOrdinal == 12) {
                this.l.a(l(), almyVar);
                return;
            }
            if (iOrdinal == 13) {
                if (this.w.isEmpty() || this.D.booleanValue()) {
                    return;
                }
                aihd aihdVar = (aihd) j$.util.Collection.-EL.stream(this.w).map(new defpackage.alpp(20)).collect(aido.b);
                defpackage.almz almzVarL3 = l();
                apdi apdiVar9 = defpackage.alnf.k;
                almzVarL3.c(apdiVar9);
                java.lang.Object objJ10 = ((alaa) almzVarL3).n.j((alac) apdiVar9.a);
                if (objJ10 == null) {
                    objJ10 = apdiVar9.b;
                } else {
                    apdiVar9.c(objJ10);
                }
                defpackage.alnf alnfVar8 = (defpackage.alnf) objJ10;
                aify aifyVarN2 = aify.n((alnfVar8.c == 12 ? (defpackage.alob) alnfVar8.d : defpackage.alob.a).b);
                j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(aifyVarN2).filter(new defpackage.altw(17)).findFirst();
                j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(aifyVarN2).filter(new defpackage.alks(aihdVar, 12)).filter(new defpackage.altw(18));
                j$.util.stream.Collector collector2 = aido.a;
                this.l.a(o((aify) airh.d(new j$.util.stream.Stream[]{ahus.x(optionalFindFirst), j$.util.Collection.-EL.stream(this.w), j$.util.Collection.-EL.stream((aify) streamFilter.collect(collector2))}).collect(collector2), q(this.K), j$.util.Optional.empty()), almyVar);
                return;
            }
            if (iOrdinal == 21) {
                defpackage.allj alljVar5 = this.l;
                akzz akzzVarM4 = defpackage.almz.a.m();
                defpackage.alnb alnbVar4 = defpackage.alnb.EVENT_STOP_BOT_SPEECH;
                akzzVarM4.u();
                defpackage.almz almzVar13 = akzzVarM4.b;
                almzVar13.c = alnbVar4.aN;
                almzVar13.b |= 1;
                alljVar5.a((defpackage.almz) akzzVarM4.p(), almyVar);
                alljVar5.a(k(defpackage.alxn.USER_END_CALL_TRIGGER, "SREndCallMessage"), almyVar);
                return;
            }
            if (iOrdinal == 22) {
                defpackage.allj alljVar6 = this.l;
                akzz akzzVarM5 = defpackage.almz.a.m();
                defpackage.alnb alnbVar5 = defpackage.alnb.EVENT_STOP_BOT_SPEECH;
                akzzVarM5.u();
                defpackage.almz almzVar14 = akzzVarM5.b;
                almzVar14.c = alnbVar5.aN;
                almzVar14.b |= 1;
                alljVar6.a((defpackage.almz) akzzVarM5.p(), almyVar);
                alljVar6.a(k(defpackage.alxn.USER_JOIN_CALL_TRIGGER, "SRJoinCall"), almyVar);
                return;
            }
            return;
        }
        this.C = true;
        defpackage.almz almzVar15 = almyVar.h;
        if (almzVar15 == null) {
            almzVar15 = defpackage.almz.a;
        }
        apdi apdiVar10 = defpackage.aloo.e;
        almzVar15.c(apdiVar10);
        java.lang.Object objJ11 = ((alaa) almzVar15).n.j((alac) apdiVar10.a);
        if (objJ11 == null) {
            objJ11 = apdiVar10.b;
        } else {
            apdiVar10.c(objJ11);
        }
        defpackage.alxf alxfVar = ((defpackage.aloo) objJ11).c;
        if (alxfVar == null) {
            alxfVar = defpackage.alxf.a;
        }
        int i6 = alxfVar.c;
        if (i6 == 6) {
            defpackage.allj alljVar7 = this.l;
            akzx akzxVarM6 = defpackage.alnf.a.m();
            akzx akzxVarM7 = defpackage.alrg.b.m();
            if (alxfVar.c != 6 || (alrfVarB = defpackage.alrf.b(((java.lang.Integer) alxfVar.d).intValue())) == null) {
                alrfVarB = defpackage.alrf.DTMF_UNDEFINED;
            }
            akzxVarM7.u();
            defpackage.alrg alrgVar = (defpackage.alrg) akzxVarM7.b;
            j$.util.Objects.requireNonNull(alrfVarB);
            alak alakVar = alrgVar.c;
            if (!alakVar.c()) {
                alrgVar.c = alad.H(alakVar);
            }
            alrgVar.c.g(alrfVarB.n);
            akzxVarM6.u();
            defpackage.alnf alnfVar9 = (defpackage.alnf) akzxVarM6.b;
            defpackage.alrg alrgVar2 = (defpackage.alrg) akzxVarM7.p();
            j$.util.Objects.requireNonNull(alrgVar2);
            alnfVar9.d = alrgVar2;
            alnfVar9.c = 14;
            defpackage.alsz alszVar = defpackage.alsz.USER;
            akzxVarM6.u();
            defpackage.alnf alnfVar10 = (defpackage.alnf) akzxVarM6.b;
            alnfVar10.h = alszVar.d;
            alnfVar10.b |= 2;
            defpackage.alsy alsyVarB = defpackage.alsy.b(alxfVar.f);
            if (alsyVarB == null) {
                alsyVarB = defpackage.alsy.NO_ACTION;
            }
            akzxVarM6.u();
            defpackage.alnf alnfVar11 = (defpackage.alnf) akzxVarM6.b;
            alnfVar11.g = alsyVarB.j;
            alnfVar11.b |= 1;
            alljVar7.a(n((defpackage.alnf) akzxVarM6.p()), almyVar);
            return;
        }
        if (i6 == 4) {
            defpackage.allj alljVar8 = this.l;
            akzx akzxVarM8 = defpackage.alnf.a.m();
            akzx akzxVarM9 = defpackage.almm.a.m();
            java.lang.String str = alxfVar.c == 4 ? (java.lang.String) alxfVar.d : "";
            akzxVarM9.u();
            defpackage.almm almmVar2 = (defpackage.almm) akzxVarM9.b;
            j$.util.Objects.requireNonNull(str);
            almmVar2.b |= 1;
            almmVar2.c = str;
            akzxVarM8.u();
            defpackage.alnf alnfVar12 = (defpackage.alnf) akzxVarM8.b;
            defpackage.almm almmVar3 = (defpackage.almm) akzxVarM9.p();
            j$.util.Objects.requireNonNull(almmVar3);
            alnfVar12.d = almmVar3;
            alnfVar12.c = 1;
            defpackage.alsz alszVar2 = defpackage.alsz.USER;
            akzxVarM8.u();
            defpackage.alnf alnfVar13 = (defpackage.alnf) akzxVarM8.b;
            alnfVar13.h = alszVar2.d;
            alnfVar13.b |= 2;
            defpackage.alsy alsyVarB2 = defpackage.alsy.b(alxfVar.f);
            if (alsyVarB2 == null) {
                alsyVarB2 = defpackage.alsy.NO_ACTION;
            }
            akzxVarM8.u();
            defpackage.alnf alnfVar14 = (defpackage.alnf) akzxVarM8.b;
            alnfVar14.g = alsyVarB2.j;
            alnfVar14.b |= 1;
            alljVar8.a(n((defpackage.alnf) akzxVarM8.p()), almyVar);
            return;
        }
        int i7 = this.K;
        if (i7 == 0) {
            throw null;
        }
        if (i7 != 5) {
            aimw aimwVarL = i.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyFlowProcessor", "handleSelectedOptionEvent", 661, "SmartReplyFlowProcessor.java");
            java.lang.String str2 = alxfVar.e;
            int i8 = this.K;
            int i9 = i8 - 1;
            if (i8 == 0) {
                throw null;
            }
            aimwVarL.G("Got selected option without bot intent in unsupported SmartReplyMode. Selected option text: %s. SmartReplyMode: %s.", str2, i9);
            return;
        }
        defpackage.allj alljVar9 = this.l;
        akzz akzzVarM6 = defpackage.almz.a.m();
        defpackage.alnb alnbVar6 = defpackage.alnb.EVENT_RESOLVE_OPTION_FULL_TEXT;
        akzzVarM6.u();
        defpackage.almz almzVar16 = akzzVarM6.b;
        almzVar16.c = alnbVar6.aN;
        almzVar16.b |= 1;
        apdi apdiVar11 = defpackage.aloi.e;
        akzx akzxVarM10 = defpackage.aloi.a.m();
        akzxVarM10.u();
        defpackage.aloi aloiVar = (defpackage.aloi) akzxVarM10.b;
        j$.util.Objects.requireNonNull(alxfVar);
        aloiVar.c = alxfVar;
        aloiVar.b |= 1;
        defpackage.alsz alszVar3 = defpackage.alsz.USER;
        akzxVarM10.u();
        defpackage.aloi aloiVar2 = (defpackage.aloi) akzxVarM10.b;
        aloiVar2.d = alszVar3.d;
        aloiVar2.b |= 2;
        akzzVarM6.bV(apdiVar11, (defpackage.aloi) akzxVarM10.p());
        alljVar9.a((defpackage.almz) akzzVarM6.p(), almyVar);
    }

    public final aify c(java.util.Collection collection) {
        return (aify) j$.util.Collection.-EL.stream(collection).filter(new defpackage.alks(this, 13)).map(new defpackage.alyy(this, 6)).collect(aido.a);
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.c = alln.g(alqdVar, almbVar.f, alkfVar);
        apdi apdiVar = defpackage.alxh.o;
        almlVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alxh alxhVar = (defpackage.alxh) objJ;
        this.m = alxhVar;
        this.n = alxhVar.c;
        apdi apdiVar2 = defpackage.alwn.r;
        alqkVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.alwn alwnVar = (defpackage.alwn) objJ2;
        defpackage.alxj alxjVar = alwnVar.e;
        if (alxjVar == null) {
            alxjVar = defpackage.alxj.a;
        }
        defpackage.alxi alxiVarB = defpackage.alxi.b(alxjVar.d);
        if (alxiVarB == null) {
            alxiVarB = defpackage.alxi.ENTRY_POINT_DEFAULT;
        }
        this.B = alxiVarB;
        this.f = java.util.Locale.forLanguageTag(alwnVar.m);
        this.p = alxjVar.e;
        this.s = (aigf) j$.util.Collection.-EL.stream(this.m.g).collect(aido.b(new defpackage.alyz(0), new defpackage.alyy(this, 3)));
        this.t = (aify) j$.util.Collection.-EL.stream(this.m.g).filter(new defpackage.alzc(1)).map(new defpackage.alyz(4)).collect(aido.a);
        this.d = aitt.k(j$.util.DesugarCollections.unmodifiableMap(this.m.h)).j(new defpackage.alks(this, 13)).c(new defpackage.alyy(this, 6)).f();
        this.e = aigf.i(j$.util.DesugarCollections.unmodifiableMap(this.m.i));
        this.a = alwnVar.n;
        this.o = this.m.e;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        alat alatVar = this.m.d;
        aigb aigbVar = new aigb(4);
        j$.util.Optional optionalM = m(alatVar);
        whq whqVar = new whq(this, aigbVar, 11, (byte[]) null);
        if (true == optionalM.isPresent()) {
            java.lang.Object obj = optionalM.get();
            java.lang.Object obj2 = whqVar.b;
            java.lang.Object obj3 = whqVar.a;
            defpackage.alws alwsVar = (defpackage.alws) obj;
            defpackage.alwq alwqVarB = defpackage.alwq.b(alwsVar.b);
            if (alwqVarB == null) {
                alwqVarB = defpackage.alwq.TYPE_UNSET;
            }
            ((aigb) obj3).i(alwqVarB, ((defpackage.alza) obj2).c(alwsVar.c));
        }
        j$.util.Collection.-EL.stream(alatVar).filter(new defpackage.altw(19)).forEach(new defpackage.agzo(this, aigbVar, 10, null));
        this.q = aigbVar.e(true);
        this.r = (aigf) j$.util.Collection.-EL.stream(this.m.j).collect(aido.b(new defpackage.alyz(2), new defpackage.alyy(this, 4)));
        j$.util.Optional optionalM2 = m(this.m.d);
        if (true == optionalM2.isPresent()) {
            optionalM2 = j$.util.Optional.ofNullable(((defpackage.alws) optionalM2.get()).c);
        }
        this.x = c((java.util.Collection) optionalM2.orElse(this.m.b));
        this.y = defpackage.alwq.TYPE_UNSET;
        this.z = alqhVar.b;
        this.u = false;
        this.A = (aigf) j$.util.Collection.-EL.stream(this.m.f).filter(new defpackage.altw(15)).collect(aido.b(new defpackage.alpp(18), new defpackage.alpp(19)));
        this.v = j$.util.Optional.empty();
        this.C = false;
        this.E = i(this.m.k);
        this.w = i(this.m.l);
        this.D = java.lang.Boolean.FALSE;
        this.F = new java.util.HashMap();
        defpackage.alxh alxhVar2 = this.m;
        defpackage.altg altgVarB = defpackage.altg.b(alxhVar2.m);
        if (altgVarB == null) {
            altgVarB = defpackage.altg.TTS_VOICE_UNSPECIFIED;
        }
        this.G = altgVarB;
        defpackage.alxl alxlVar = alxhVar2.n;
        if (alxlVar == null) {
            alxlVar = defpackage.alxl.a;
        }
        this.g = aitt.m(aitt.k(j$.util.DesugarCollections.unmodifiableMap(alxlVar.b)).d(new defpackage.aitf(6)).filter(new zun(7)).flatMap(new defpackage.ailg(4))).f();
        int iQ = airh.q(alxjVar.c);
        if (iQ == 0) {
            iQ = 1;
        }
        this.K = iQ;
        this.I = iQ == 5;
        if (iQ == 5) {
            this.K = 3;
        }
        this.H = false;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
