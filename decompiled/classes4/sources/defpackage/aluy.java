package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aluy implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInferenceTriggerProcessor");
    private final defpackage.alvg b;
    private final defpackage.allj c;
    private boolean d;
    private java.lang.String e;
    private java.lang.String f;
    private java.lang.String g;

    public aluy(defpackage.alli alliVar, defpackage.alvg alvgVar) {
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alvgVar, "stateManager");
        this.b = alvgVar;
        this.c = alliVar.a("AGENTIC_CALL_SCREEN_LLM_INFERENCE_TRIGGER");
        this.e = "";
        this.f = "";
        this.g = "";
    }

    @Override // defpackage.allg
    public final aihd a() {
        return new aile(defpackage.alnb.EVENT_AGENTIC_TRIGGER_INFERENCE);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        aooh.f(almyVar, "event");
        if (!this.d) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInferenceTriggerProcessor", "consume", 73, "AgenticCallScreenLlmInferenceTriggerProcessor.kt").v("AgenticCallScreenLlmInferenceTriggerProcessor is not active.");
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
        if (alnbVarB == defpackage.alnb.EVENT_AGENTIC_TRIGGER_INFERENCE) {
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInferenceTriggerProcessor", "consume", 86, "AgenticCallScreenLlmInferenceTriggerProcessor.kt").v("AgenticCallScreenLlmInferenceTriggerProcessor received EVENT_AGENTIC_TRIGGER_INFERENCE");
            defpackage.alnr alnrVarC = alvgVar.c();
            if (alnrVarC == null) {
                aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInferenceTriggerProcessor", "publishTriggerInference", 96, "AgenticCallScreenLlmInferenceTriggerProcessor.kt").v("Cannot trigger LLM inference because activeFeatureInfo is null.");
                return;
            }
            java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
            reentrantLock.lock();
            try {
                alvgVar.n();
                java.lang.String strD = alvgVar.d(false);
                reentrantLock.unlock();
                defpackage.alvg alvgVar2 = this.b;
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = alvgVar2.b;
                reentrantLock2.lock();
                try {
                    alvgVar2.n();
                    java.lang.String strD2 = alvgVar2.d(true);
                    reentrantLock2.unlock();
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmInferenceTriggerProcessor", "publishTriggerInference", 104, "AgenticCallScreenLlmInferenceTriggerProcessor.kt").N("AgenticCallScreenLlmInferenceTriggerProcessor: Triggering inference with params:\nremoteLanguage: %s\nuserPreferredLanguage: %s\nmarket: %s\ntranscript:\n[%s]", this.e, this.f, this.g, strD2);
                    defpackage.alvg alvgVar3 = this.b;
                    java.lang.String strE = alvgVar3.e();
                    if (strE != null && strE.length() != 0 && !aooh.n(strE, almyVar.e)) {
                        defpackage.allj alljVar = this.c;
                        xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                        xtqVarO.ah(defpackage.alnb.EVENT_LLM_CANCEL_REQUEST);
                        apdi apdiVar = defpackage.alnp.d;
                        aooh.e(apdiVar, "llmCancelRequestEvent");
                        akzx akzxVarM = defpackage.alnp.a.m();
                        akzxVarM.u();
                        defpackage.alnp alnpVar = (defpackage.alnp) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strE);
                        alnpVar.b |= 1;
                        alnpVar.c = strE;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, "build(...)");
                        xtqVarO.ax(apdiVar, aladVarP);
                        alljVar.a(xtqVarO.ag(), almyVar);
                    }
                    java.lang.String str = almyVar.e;
                    aooh.e(str, "getEventId(...)");
                    alvgVar3.h(str);
                    xtq xtqVarM = defpackage.alpv.m(defpackage.alnt.a.m());
                    xtqVarM.X(alnrVarC);
                    xtqVarM.Y(str);
                    xtqVarM.ab();
                    xtqVarM.aa(this.e);
                    xtqVarM.ab();
                    xtqVarM.aa(this.f);
                    xtqVarM.ab();
                    xtqVarM.aa(this.g);
                    xtqVarM.ab();
                    xtqVarM.aa(strD);
                    akzm akzmVarF = aldf.f(10L, 0);
                    aooh.e(akzmVarF, "fromSeconds(...)");
                    xtqVarM.Z(akzmVarF);
                    xtq xtqVarK = defpackage.aknx.K(defpackage.akzv.a.m());
                    xtqVarK.ao(0.0f);
                    defpackage.akzv akzvVarAn = xtqVarK.an();
                    aooh.f(akzvVarAn, "value");
                    akzx akzxVar = (akzx) xtqVarM.a;
                    akzxVar.u();
                    defpackage.alnt alntVar = (defpackage.alnt) akzxVar.b;
                    j$.util.Objects.requireNonNull(akzvVarAn);
                    alntVar.j = akzvVarAn;
                    alntVar.b |= 64;
                    defpackage.alnt alntVarW = xtqVarM.W();
                    defpackage.allj alljVar2 = this.c;
                    xtq xtqVarO2 = defpackage.alpv.o(defpackage.almz.a.m());
                    xtqVarO2.ah(defpackage.alnb.EVENT_LLM_INFERENCE_REQUEST);
                    apdi apdiVar2 = defpackage.alnt.k;
                    aooh.e(apdiVar2, "llmInferenceRequestEvent");
                    xtqVarO2.ax(apdiVar2, alntVarW);
                    alljVar2.a(xtqVarO2.ag(), almyVar);
                } catch (java.lang.Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.d = true;
        if (alqkVar != null) {
            apdi apdiVar = defpackage.alwn.r;
            aooh.e(apdiVar, "callAssistantConversationContext");
            defpackage.alwn alwnVar = (defpackage.alwn) akmr.x(alqkVar, apdiVar);
            if (alwnVar != null) {
                java.lang.String str = alwnVar.m;
                aooh.e(str, "getLocale(...)");
                if (str.length() > 0) {
                    java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str);
                    aooh.e(localeForLanguageTag, "forLanguageTag(...)");
                    java.lang.String displayLanguage = localeForLanguageTag.getDisplayLanguage(java.util.Locale.US);
                    aooh.e(displayLanguage, "getDisplayLanguage(...)");
                    this.f = displayLanguage;
                    java.lang.String displayCountry = "US";
                    if (!aooh.n(localeForLanguageTag.getCountry(), "US")) {
                        displayCountry = localeForLanguageTag.getDisplayCountry(java.util.Locale.US);
                        aooh.e(displayCountry, "getDisplayCountry(...)");
                    }
                    this.g = displayCountry;
                    this.e = this.f;
                }
            }
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
