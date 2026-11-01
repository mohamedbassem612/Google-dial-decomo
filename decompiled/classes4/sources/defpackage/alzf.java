package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alzf implements defpackage.allg {
    private static final aimz b = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmInitializationProcessor");
    public final defpackage.allj a;
    private boolean c;
    private aify d;
    private defpackage.alzh e;
    private j$.util.Optional f;

    public alzf(defpackage.alli alliVar) {
        this.a = alliVar.a(defpackage.allh.r.name());
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.s(defpackage.alnb.EVENT_AVAILABLE_LLM_FEATURES, defpackage.alnb.EVENT_TTS_AVAILABLE, defpackage.alnb.EVENT_USER_CONSENTED_TO_AI_GENERATED_REPLIES);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:68:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x0332  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        int i;
        defpackage.alzg alzgVar;
        int i2;
        j$.util.Optional optional;
        whq whqVar;
        if (this.c) {
            defpackage.alzh alzhVar = this.e;
            defpackage.almz almzVar = almyVar.h;
            if (almzVar == null) {
                almzVar = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
            if (alnbVarB == null) {
                alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
            }
            int iOrdinal = alnbVarB.ordinal();
            if (iOrdinal == 60) {
                alzhVar.c = true;
            } else if (iOrdinal == 64) {
                alzhVar.e = 3;
            }
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
            if (alnbVarB2 == null) {
                alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
            }
            int i3 = 2;
            if (alnbVarB2.ordinal() == 43) {
                defpackage.almz almzVar3 = almyVar.h;
                if (almzVar3 == null) {
                    almzVar3 = defpackage.almz.a;
                }
                apdi apdiVar = defpackage.almg.d;
                almzVar3.c(apdiVar);
                java.lang.Object objJ = ((alaa) almzVar3).n.j((alac) apdiVar.a);
                if (objJ == null) {
                    objJ = apdiVar.b;
                } else {
                    apdiVar.c(objJ);
                }
                defpackage.almg almgVar = (defpackage.almg) objJ;
                aihd aihdVarO = aihd.o(almgVar.b);
                aihd aihdVarO2 = aihd.o(almgVar.c);
                java.util.List list = this.d;
                int i4 = ((aike) list).d;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        this.c = false;
                        defpackage.allj alljVar = this.a;
                        akzz akzzVarM = defpackage.almz.a.m();
                        defpackage.alnb alnbVar = defpackage.alnb.EVENT_LLM_FEATURE_MISSING;
                        akzzVarM.u();
                        defpackage.almz almzVar4 = akzzVarM.b;
                        almzVar4.c = alnbVar.aN;
                        almzVar4.b |= 1;
                        alljVar.a((defpackage.almz) akzzVarM.p(), almyVar);
                        break;
                    }
                    defpackage.alnr alnrVar = (defpackage.alnr) list.get(i5);
                    if (ahvr.ao(aihdVarO, aihdVarO2).contains(alnrVar)) {
                        defpackage.allj alljVar2 = this.a;
                        defpackage.almz almzVar5 = defpackage.almz.a;
                        akzz akzzVarM2 = almzVar5.m();
                        defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_SELECTED_LLM_FEATURES;
                        akzzVarM2.u();
                        defpackage.almz almzVar6 = akzzVarM2.b;
                        almzVar6.c = alnbVar2.aN;
                        almzVar6.b |= 1;
                        apdi apdiVar2 = defpackage.alon.c;
                        akzx akzxVarM = defpackage.alon.a.m();
                        akzxVarM.aM(alnrVar);
                        akzzVarM2.bV(apdiVar2, (defpackage.alon) akzxVarM.p());
                        alljVar2.a((defpackage.almz) akzzVarM2.p(), almyVar);
                        if (!aihdVarO.contains(alnrVar)) {
                            akzz akzzVarM3 = almzVar5.m();
                            defpackage.alnb alnbVar3 = defpackage.alnb.EVENT_LLM_FEATURE_DOWNLOADING;
                            akzzVarM3.u();
                            defpackage.almz almzVar7 = akzzVarM3.b;
                            almzVar7.c = alnbVar3.aN;
                            almzVar7.b |= 1;
                            alljVar2.a((defpackage.almz) akzzVarM3.p(), almyVar);
                            break;
                        }
                        akzz akzzVarM4 = almzVar5.m();
                        defpackage.alnb alnbVar4 = defpackage.alnb.EVENT_LLM_FEATURE_AVAILABLE;
                        akzzVarM4.u();
                        defpackage.almz almzVar8 = akzzVarM4.b;
                        almzVar8.c = alnbVar4.aN;
                        almzVar8.b |= 1;
                        alljVar2.a((defpackage.almz) akzzVarM4.p(), almyVar);
                        this.e.b = true;
                        this.f = j$.util.Optional.of(alnrVar);
                        java.lang.String str = almyVar.f;
                        akzx akzxVarM2 = defpackage.alnt.a.m();
                        akzxVarM2.u();
                        defpackage.alnt alntVar = (defpackage.alnt) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(alnrVar);
                        alntVar.c = alnrVar;
                        alntVar.b |= 1;
                        akzxVarM2.u();
                        defpackage.alnt alntVar2 = (defpackage.alnt) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str);
                        alntVar2.b |= i3;
                        alntVar2.d = str;
                        akzxVarM2.u();
                        defpackage.alnt alntVar3 = (defpackage.alnt) akzxVarM2.b;
                        j$.util.Objects.requireNonNull("Prewarm");
                        alntVar3.b |= 4;
                        alntVar3.e = "Prewarm";
                        akzm akzmVarF = aldf.f(10L, 0);
                        akzxVarM2.u();
                        defpackage.alnt alntVar4 = (defpackage.alnt) akzxVarM2.b;
                        j$.util.Objects.requireNonNull(akzmVarF);
                        alntVar4.f = akzmVarF;
                        alntVar4.b |= 8;
                        defpackage.alnt alntVar5 = (defpackage.alnt) akzxVarM2.p();
                        akzz akzzVarM5 = almzVar5.m();
                        defpackage.alnb alnbVar5 = defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST;
                        akzzVarM5.u();
                        defpackage.almz almzVar9 = akzzVarM5.b;
                        almzVar9.c = alnbVar5.aN;
                        almzVar9.b |= 1;
                        akzzVarM5.bV(defpackage.alnt.k, alntVar5);
                        alljVar2.a((defpackage.almz) akzzVarM5.p(), almyVar);
                        break;
                    }
                    aimw aimwVarL = b.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmInitializationProcessor", "handleAvailableLlmFeatures", 143, "SmartReplyLlmInitializationProcessor.java");
                    defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
                    if (alnqVarB == null) {
                        alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
                    }
                    aimwVarL.M("LLM feature ID [%s - version %s] not found. %s", alnqVarB.name(), java.lang.Long.valueOf(alnrVar.d), new defpackage.alpm(aihdVarO, aihdVarO2).c());
                    i5++;
                    list = list;
                    i3 = 2;
                }
            }
            defpackage.alzh alzhVar2 = this.e;
            if (!alzhVar2.b) {
                defpackage.alzh.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmStatusHandler", "getLlmStatus", 66, "SmartReplyLlmStatusHandler.java").v("LLM is not active yet, running V1 for now.");
            } else if (alzhVar2.c) {
                int i6 = alzhVar2.e;
                int i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 != 0) {
                    if (i7 != 1) {
                        i = 3;
                        if (i7 == 2) {
                            defpackage.alzh.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmStatusHandler", "getLlmStatus", 84, "SmartReplyLlmStatusHandler.java").v("TTS and LLM are available, and user has consented, running V2.");
                        } else if (i7 != 3) {
                            throw new java.lang.RuntimeException(null, null);
                        }
                    } else {
                        defpackage.alzh.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmStatusHandler", "getLlmStatus", 80, "SmartReplyLlmStatusHandler.java").v("LLM consent pending, running V1 for now.");
                        i = 2;
                    }
                    boolean z = i == alzhVar2.d;
                    alzhVar2.d = i;
                    alzgVar = new defpackage.alzg(i, !z);
                    b.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmInitializationProcessor", "updateAndHandleLlmStatus", 172, "SmartReplyLlmInitializationProcessor.java").y("LLM status update: %s", alzgVar);
                    if (alzgVar.a) {
                        i2 = alzgVar.b - 1;
                        if (i2 != 1) {
                            defpackage.allj alljVar3 = this.a;
                            akzz akzzVarM6 = defpackage.almz.a.m();
                            defpackage.alnb alnbVar6 = defpackage.alnb.EVENT_SHOULD_ASK_FOR_LLM_CONSENT;
                            akzzVarM6.u();
                            defpackage.almz almzVar10 = akzzVarM6.b;
                            almzVar10.c = alnbVar6.aN;
                            almzVar10.b |= 1;
                            alljVar3.a((defpackage.almz) akzzVarM6.p(), almyVar);
                            return;
                        }
                        if (i2 == 2) {
                            optional = this.f;
                            whqVar = new whq(this, almyVar, 16, (byte[]) null);
                            if (true == optional.isPresent()) {
                                java.lang.Object obj = optional.get();
                                java.lang.Object obj2 = whqVar.b;
                                java.lang.Object obj3 = whqVar.a;
                                akzz akzzVarM7 = defpackage.almz.a.m();
                                defpackage.alnb alnbVar7 = defpackage.alnb.EVENT_SMART_REPLY_LLM_ACTIVE;
                                akzzVarM7.u();
                                defpackage.almz almzVar11 = akzzVarM7.b;
                                almzVar11.c = alnbVar7.aN;
                                almzVar11.b |= 1;
                                apdi apdiVar3 = defpackage.aloq.d;
                                akzx akzxVarM3 = defpackage.aloq.a.m();
                                akzxVarM3.u();
                                defpackage.aloq aloqVar = (defpackage.aloq) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(obj);
                                aloqVar.c = (defpackage.alnr) obj;
                                aloqVar.b |= 1;
                                akzzVarM7.bV(apdiVar3, (defpackage.aloq) akzxVarM3.p());
                                ((defpackage.alzf) obj2).a.a(akzzVarM7.p(), (defpackage.almy) obj3);
                            }
                        }
                    }
                }
                defpackage.alzh.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmStatusHandler", "getLlmStatus", 76, "SmartReplyLlmStatusHandler.java").v("LLM consent missing, running V1.");
            } else {
                defpackage.alzh.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmStatusHandler", "getLlmStatus", 70, "SmartReplyLlmStatusHandler.java").v("TTS is not available yet, running V1 for now.");
            }
            i = 1;
            if (i == alzhVar2.d) {
            }
            alzhVar2.d = i;
            alzgVar = new defpackage.alzg(i, !z);
            b.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmInitializationProcessor", "updateAndHandleLlmStatus", 172, "SmartReplyLlmInitializationProcessor.java").y("LLM status update: %s", alzgVar);
            if (alzgVar.a) {
                i2 = alzgVar.b - 1;
                if (i2 != 1) {
                    defpackage.allj alljVar4 = this.a;
                    akzz akzzVarM8 = defpackage.almz.a.m();
                    defpackage.alnb alnbVar8 = defpackage.alnb.EVENT_SHOULD_ASK_FOR_LLM_CONSENT;
                    akzzVarM8.u();
                    defpackage.almz almzVar12 = akzzVarM8.b;
                    almzVar12.c = alnbVar8.aN;
                    almzVar12.b |= 1;
                    alljVar4.a((defpackage.almz) akzzVarM8.p(), almyVar);
                    return;
                }
                if (i2 == 2) {
                    optional = this.f;
                    whqVar = new whq(this, almyVar, 16, (byte[]) null);
                    if (true == optional.isPresent()) {
                        java.lang.Object obj4 = optional.get();
                        java.lang.Object obj5 = whqVar.b;
                        java.lang.Object obj6 = whqVar.a;
                        akzz akzzVarM9 = defpackage.almz.a.m();
                        defpackage.alnb alnbVar9 = defpackage.alnb.EVENT_SMART_REPLY_LLM_ACTIVE;
                        akzzVarM9.u();
                        defpackage.almz almzVar13 = akzzVarM9.b;
                        almzVar13.c = alnbVar9.aN;
                        almzVar13.b |= 1;
                        apdi apdiVar4 = defpackage.aloq.d;
                        akzx akzxVarM4 = defpackage.aloq.a.m();
                        akzxVarM4.u();
                        defpackage.aloq aloqVar2 = (defpackage.aloq) akzxVarM4.b;
                        j$.util.Objects.requireNonNull(obj4);
                        aloqVar2.c = (defpackage.alnr) obj4;
                        aloqVar2.b |= 1;
                        akzzVarM9.bV(apdiVar4, (defpackage.aloq) akzxVarM4.p());
                        ((defpackage.alzf) obj5).a.a(akzzVarM9.p(), (defpackage.almy) obj6);
                    }
                }
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        apdi apdiVar = defpackage.alwn.r;
        alqkVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) alqkVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alwn alwnVar = (defpackage.alwn) objJ;
        defpackage.alxj alxjVar = alwnVar.e;
        if (alxjVar == null) {
            alxjVar = defpackage.alxj.a;
        }
        int iQ = airh.q(alxjVar.c);
        if (iQ == 0) {
            iQ = 1;
        }
        this.c = iQ == 5;
        if (iQ != 5) {
            b.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmInitializationProcessor", "init", 81, "SmartReplyLlmInitializationProcessor.java").v("SmartReplyLlmInitializationProcessor is not active. Skipping init and won't consume events.");
            return;
        }
        this.e = new defpackage.alzh(alwnVar);
        this.f = j$.util.Optional.empty();
        defpackage.alnq alnqVar = defpackage.alze.a;
        aift aiftVar = new aift(4);
        defpackage.alnr alnrVar = defpackage.alnr.a;
        akzx akzxVarM = alnrVar.m();
        defpackage.alnq alnqVar2 = defpackage.alze.a;
        akzxVarM.u();
        defpackage.alnr alnrVar2 = (defpackage.alnr) akzxVarM.b;
        int i = alnqVar2.j;
        alnrVar2.c = i;
        alnrVar2.b |= 1;
        akzxVarM.u();
        defpackage.alnr alnrVar3 = (defpackage.alnr) akzxVarM.b;
        alnrVar3.b |= 2;
        alnrVar3.d = 4L;
        aiftVar.i((defpackage.alnr) akzxVarM.p());
        if (alxjVar.h) {
            akzx akzxVarM2 = alnrVar.m();
            akzxVarM2.u();
            defpackage.alnr alnrVar4 = (defpackage.alnr) akzxVarM2.b;
            alnrVar4.c = i;
            alnrVar4.b |= 1;
            akzxVarM2.u();
            defpackage.alnr alnrVar5 = (defpackage.alnr) akzxVarM2.b;
            alnrVar5.b |= 2;
            alnrVar5.d = 3L;
            aiftVar.i((defpackage.alnr) akzxVarM2.p());
        }
        aiftVar.k(defpackage.alze.b);
        this.d = aiftVar.h();
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
