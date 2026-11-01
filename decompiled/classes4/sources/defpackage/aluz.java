package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluz implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor");
    private final defpackage.allj b;
    private boolean c;
    private java.lang.Long d;

    public aluz(defpackage.alli alliVar) {
        aooh.f(alliVar, "publisherFactory");
        this.b = alliVar.a("AGENTIC_CALL_SCREEN_LLM_INITIALIZATION");
    }

    private static final defpackage.alnr c(java.util.Set set, java.lang.Long l) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : set) {
            defpackage.alnr alnrVar = (defpackage.alnr) obj2;
            defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
            if (alnqVarB == null) {
                alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
            }
            if (alnqVarB == defpackage.alnq.AICORE_DIALER_AGENTIC_CALL_SCREEN_FEATURE) {
                long j = alnrVar.d;
                if (j >= 3 && (l == null || j <= l.longValue())) {
                    arrayList.add(obj2);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                long j2 = ((defpackage.alnr) next).d;
                do {
                    java.lang.Object next2 = it.next();
                    long j3 = ((defpackage.alnr) next2).d;
                    if (j2 < j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (defpackage.alnr) obj;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return new aile(defpackage.alnb.EVENT_AVAILABLE_LLM_FEATURES);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        aooh.f(almyVar, "event");
        if (this.c) {
            defpackage.almz almzVar = almyVar.h;
            if (almzVar == null) {
                almzVar = defpackage.almz.a;
            }
            defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
            if (alnbVarB == null) {
                alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
            }
            if (alnbVarB == defpackage.alnb.EVENT_AVAILABLE_LLM_FEATURES) {
                defpackage.almz almzVar2 = almyVar.h;
                if (almzVar2 == null) {
                    almzVar2 = defpackage.almz.a;
                }
                apdi apdiVar = defpackage.almg.d;
                aooh.e(apdiVar, "availableLlmFeaturesEvent");
                java.lang.Object objX = akmr.x(almzVar2, apdiVar);
                if (objX == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                defpackage.almg almgVar = (defpackage.almg) objX;
                alat alatVar = almgVar.b;
                aooh.e(alatVar, "getFeatureInfosList(...)");
                aihd aihdVarBx = ahvr.bx(alatVar);
                alat alatVar2 = almgVar.c;
                aooh.e(alatVar2, "getDownloadableFeatureInfosList(...)");
                aihd aihdVarBx2 = ahvr.bx(alatVar2);
                defpackage.alnr alnrVarC = c(aihdVarBx, this.d);
                if (alnrVarC == null) {
                    alnrVarC = c(aihdVarBx2, this.d);
                }
                aimz aimzVar = a;
                if (alnrVarC == null) {
                    aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor", "handleAvailableLlmFeatures", 126, "AgenticCallScreenLlmInitializationProcessor.kt").I("LLM feature %s not found. %s", "AICORE_DIALER_AGENTIC_CALL_SCREEN_FEATURE", new defpackage.alpm(aihdVarBx, aihdVarBx2).c());
                    this.c = false;
                    defpackage.allj alljVar = this.b;
                    xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                    xtqVarO.ah(defpackage.alnb.EVENT_LLM_FEATURE_MISSING);
                    alljVar.a(xtqVarO.ag(), almyVar);
                    return;
                }
                aimw aimwVarL = aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor", "handleAvailableLlmFeatures", 90, "AgenticCallScreenLlmInitializationProcessor.kt");
                defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVarC.c);
                if (alnqVarB == null) {
                    alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
                }
                aimwVarL.H("Found required LLM feature: %s (version %s)", alnqVarB.name(), alnrVarC.d);
                defpackage.allj alljVar2 = this.b;
                defpackage.almz almzVar3 = defpackage.almz.a;
                xtq xtqVarO2 = defpackage.alpv.o(almzVar3.m());
                xtqVarO2.ah(defpackage.alnb.EVENT_SELECTED_LLM_FEATURES);
                apdi apdiVar2 = defpackage.alon.c;
                aooh.e(apdiVar2, "selectedLlmFeaturesEvent");
                akzx akzxVarM = defpackage.alon.a.m();
                aooh.f(akzxVarM, "builder");
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.alon) akzxVarM.b).b);
                aooh.e(listUnmodifiableList, "getFeatureInfosList(...)");
                new alct(listUnmodifiableList);
                akzxVarM.aM(alnrVarC);
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                xtqVarO2.ax(apdiVar2, (defpackage.alon) aladVarP);
                alljVar2.a(xtqVarO2.ag(), almyVar);
                if (!aihdVarBx.contains(alnrVarC)) {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor", "handleAvailableLlmFeatures", 118, "AgenticCallScreenLlmInitializationProcessor.kt").v("LLM feature is downloadable. Requesting download.");
                    xtq xtqVarO3 = defpackage.alpv.o(almzVar3.m());
                    xtqVarO3.ah(defpackage.alnb.EVENT_LLM_FEATURE_DOWNLOADING);
                    alljVar2.a(xtqVarO3.ag(), almyVar);
                    return;
                }
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor", "handleAvailableLlmFeatures", 107, "AgenticCallScreenLlmInitializationProcessor.kt").v("LLM feature is already available on device.");
                xtq xtqVarO4 = defpackage.alpv.o(almzVar3.m());
                xtqVarO4.ah(defpackage.alnb.EVENT_LLM_FEATURE_AVAILABLE);
                alljVar2.a(xtqVarO4.ag(), almyVar);
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor", "handleAvailableLlmFeatures", 110, "AgenticCallScreenLlmInitializationProcessor.kt").v("AgenticLlmInitializationProcessor: Publishing LLM prewarm request");
                java.lang.String str = almyVar.f;
                aooh.e(str, "getOriginatingEventId(...)");
                xtq xtqVarO5 = defpackage.alpv.o(almzVar3.m());
                xtqVarO5.ah(defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST);
                apdi apdiVar3 = defpackage.alnt.k;
                aooh.e(apdiVar3, "llmInferenceRequestEvent");
                xtq xtqVarM = defpackage.alpv.m(defpackage.alnt.a.m());
                xtqVarM.X(alnrVarC);
                xtqVarM.Y(str);
                akzx akzxVar = (akzx) xtqVarM.a;
                akzxVar.u();
                defpackage.alnt alntVar = (defpackage.alnt) akzxVar.b;
                j$.util.Objects.requireNonNull("Prewarm");
                alntVar.b |= 4;
                alntVar.e = "Prewarm";
                akzm akzmVarF = aldf.f(10L, 0);
                aooh.e(akzmVarF, "fromSeconds(...)");
                xtqVarM.Z(akzmVarF);
                xtqVarO5.ax(apdiVar3, xtqVarM.W());
                alljVar2.a(xtqVarO5.ag(), almyVar);
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInitializationProcessor", "publishLlmActive", 150, "AgenticCallScreenLlmInitializationProcessor.kt").v("AgenticLlmInitializationProcessor: Publishing EVENT_AGENTIC_LLM_ACTIVE");
                xtq xtqVarO6 = defpackage.alpv.o(almzVar3.m());
                xtqVarO6.ah(defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE);
                apdi apdiVar4 = defpackage.alvj.d;
                aooh.e(apdiVar4, "agenticLlmActiveEvent");
                akzx akzxVarM2 = defpackage.alvj.a.m();
                aooh.f(akzxVarM2, "builder");
                akzxVarM2.u();
                defpackage.alvj alvjVar = (defpackage.alvj) akzxVarM2.b;
                j$.util.Objects.requireNonNull(alnrVarC);
                alvjVar.c = alnrVarC;
                alvjVar.b |= 1;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                xtqVarO6.ax(apdiVar4, (defpackage.alvj) aladVarP2);
                alljVar2.a(xtqVarO6.ag(), almyVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        defpackage.alxe alxeVarS;
        this.c = true;
        if (alqkVar != null) {
            apdi apdiVar = defpackage.alwn.r;
            aooh.e(apdiVar, "callAssistantConversationContext");
            defpackage.alwn alwnVar = (defpackage.alwn) akmr.x(alqkVar, apdiVar);
            if (alwnVar != null) {
                alxeVarS = airh.s(alwnVar);
            } else {
                alxeVarS = null;
            }
        } else {
            alxeVarS = null;
        }
        long j = alxeVarS != null ? alxeVarS.e : 0L;
        this.d = j > 0 ? java.lang.Long.valueOf(j) : null;
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
