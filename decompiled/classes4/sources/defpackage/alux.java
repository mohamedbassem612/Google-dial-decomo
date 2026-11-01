package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alux implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor");
    private static final java.util.Map b = ajsz.aO(new aoiu[]{new aoiu("greeting", "Disclosure"), new aoiu("who", "AskWhoIsThis"), new aoiu("company", "AskCompany"), new aoiu("target", "AskWhoLookingFor"), new aoiu("reason", "AskReason"), new aoiu("pitch", "AskIfSales"), new aoiu("ref", "AskReferenceNumber"), new aoiu("emergency", "AskIfEmergency"), new aoiu("callback", "AskCallbackNumber")});
    private static final defpackage.alrm c;
    private static final defpackage.alrm d;
    private static final defpackage.alrm e;
    private final defpackage.alvg f;
    private final defpackage.allj g;

    static {
        defpackage.ajyi ajyiVarJ = ahus.J(defpackage.alrm.a.m());
        akzx akzxVarM = defpackage.alrn.a.m();
        aooh.f(akzxVarM, "builder");
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.alrn alrnVar = (defpackage.alrn) aladVarP;
        aooh.f(alrnVar, "value");
        akzx akzxVar = (akzx) ajyiVarJ.a;
        akzxVar.u();
        defpackage.alrm alrmVar = (defpackage.alrm) akzxVar.b;
        j$.util.Objects.requireNonNull(alrnVar);
        alrmVar.c = alrnVar;
        alrmVar.b = 1;
        c = ajyiVarJ.bc();
        defpackage.ajyi ajyiVarJ2 = ahus.J(defpackage.alrm.a.m());
        vaa vaaVarE = ahus.E(defpackage.alrk.a.m());
        akzx akzxVarM2 = defpackage.alrj.a.m();
        aooh.f(akzxVarM2, "builder");
        alad aladVarP2 = akzxVarM2.p();
        aooh.e(aladVarP2, "build(...)");
        defpackage.alrj alrjVar = (defpackage.alrj) aladVarP2;
        aooh.f(alrjVar, "value");
        akzx akzxVar2 = (akzx) vaaVarE.a;
        akzxVar2.u();
        defpackage.alrk alrkVar = (defpackage.alrk) akzxVar2.b;
        j$.util.Objects.requireNonNull(alrjVar);
        alrkVar.c = alrjVar;
        alrkVar.b = 3;
        ajyiVarJ2.bd(vaaVarE.ay());
        d = ajyiVarJ2.bc();
        defpackage.ajyi ajyiVarJ3 = ahus.J(defpackage.alrm.a.m());
        vaa vaaVarE2 = ahus.E(defpackage.alrk.a.m());
        akzx akzxVarM3 = defpackage.alrl.a.m();
        aooh.f(akzxVarM3, "builder");
        alad aladVarP3 = akzxVarM3.p();
        aooh.e(aladVarP3, "build(...)");
        defpackage.alrl alrlVar = (defpackage.alrl) aladVarP3;
        aooh.f(alrlVar, "value");
        akzx akzxVar3 = (akzx) vaaVarE2.a;
        akzxVar3.u();
        defpackage.alrk alrkVar2 = (defpackage.alrk) akzxVar3.b;
        j$.util.Objects.requireNonNull(alrlVar);
        alrkVar2.c = alrlVar;
        alrkVar2.b = 2;
        ajyiVarJ3.bd(vaaVarE2.ay());
        e = ajyiVarJ3.bc();
    }

    public alux(defpackage.alli alliVar, defpackage.alvg alvgVar) {
        aooh.f(alliVar, "publisherFactory");
        aooh.f(alvgVar, "stateManager");
        this.f = alvgVar;
        this.g = alliVar.a("AGENTIC_CALL_SCREEN_LLM_EXTRACTION");
    }

    private final void c(defpackage.almy almyVar, defpackage.alrm alrmVar) {
        xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
        xtqVarO.ah(defpackage.alnb.EVENT_EXTRACTION_RESULT);
        apdi apdiVar = defpackage.alne.b;
        aooh.e(apdiVar, "extractionResultEvent");
        xtqVarO.ax(apdiVar, alrmVar);
        this.g.a(xtqVarO.ag(), almyVar);
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarR = aihd.r(defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE, defpackage.alnb.EVENT_LLM_INFERENCE_RESPONSE);
        aooh.e(aihdVarR, "of(...)");
        return aihdVarR;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:120:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:126:0x0320  */
    /* JADX WARN: Code duplicated, block: B:128:0x0339  */
    /* JADX WARN: Code duplicated, block: B:130:0x036e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0371  */
    /* JADX WARN: Code duplicated, block: B:133:0x0373  */
    /* JADX WARN: Code duplicated, block: B:136:0x038c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0392  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:141:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:146:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:152:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:155:0x0408  */
    /* JADX WARN: Code duplicated, block: B:158:0x0412  */
    /* JADX WARN: Code duplicated, block: B:161:0x041b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0424  */
    /* JADX WARN: Code duplicated, block: B:167:0x042d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0436  */
    /* JADX WARN: Code duplicated, block: B:172:0x043e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0442  */
    /* JADX WARN: Code duplicated, block: B:175:0x044a  */
    /* JADX WARN: Code duplicated, block: B:176:0x044d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0455  */
    /* JADX WARN: Code duplicated, block: B:179:0x0458  */
    /* JADX WARN: Code duplicated, block: B:181:0x0460  */
    /* JADX WARN: Code duplicated, block: B:182:0x0463  */
    /* JADX WARN: Code duplicated, block: B:185:0x046c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0474  */
    /* JADX WARN: Code duplicated, block: B:188:0x0477  */
    /* JADX WARN: Code duplicated, block: B:190:0x047f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0482  */
    /* JADX WARN: Code duplicated, block: B:193:0x048a  */
    /* JADX WARN: Code duplicated, block: B:194:0x048d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0495  */
    /* JADX WARN: Code duplicated, block: B:197:0x0498  */
    /* JADX WARN: Code duplicated, block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0204 A[PHI: r5
      0x0204: PHI (r5v17 java.lang.Integer) = (r5v16 java.lang.Integer), (r5v50 java.lang.Integer) binds: [B:79:0x01ef, B:83:0x0202] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        defpackage.alnv alnvVar;
        java.lang.Object next;
        int iIntValue;
        java.lang.String str;
        java.lang.String str2;
        int i;
        int i2;
        java.lang.String str3;
        defpackage.aluw aluvVar;
        defpackage.aluw alutVar;
        defpackage.allj alljVar;
        defpackage.almz almzVar;
        java.lang.String str4;
        int iA;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String lowerCase;
        defpackage.alrp alrpVar;
        defpackage.alnr alnrVar;
        aooh.f(almyVar, "event");
        defpackage.almz almzVar2 = almyVar.h;
        if (almzVar2 == null) {
            almzVar2 = defpackage.almz.a;
        }
        aooh.e(almzVar2, "getData(...)");
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB == defpackage.alnb.EVENT_AGENTIC_LLM_ACTIVE) {
            apdi apdiVar = defpackage.alvj.d;
            aooh.e(apdiVar, "agenticLlmActiveEvent");
            defpackage.alvj alvjVar = (defpackage.alvj) akmr.x(almzVar2, apdiVar);
            if (alvjVar == null || (alvjVar.b & 1) == 0) {
                alnrVar = null;
            } else {
                alnrVar = alvjVar.c;
                if (alnrVar == null) {
                    alnrVar = defpackage.alnr.a;
                }
            }
            if (alnrVar == null) {
                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "consume", 81, "AgenticCallScreenLlmExtractionProcessor.kt").v("Received EVENT_AGENTIC_LLM_ACTIVE without feature_info.");
                return;
            }
            defpackage.alvg alvgVar = this.f;
            java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
            reentrantLock.lock();
            try {
                alvgVar.l = alnrVar;
                reentrantLock.unlock();
                aimw aimwVarL = a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "consume", 75, "AgenticCallScreenLlmExtractionProcessor.kt");
                defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
                if (alnqVarB == null) {
                    alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
                }
                aimwVarL.H("AgenticLlmExtractionProcessor is now active for feature: %s (version %s)", alnqVarB.name(), alnrVar.d);
                return;
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        defpackage.alvg alvgVar2 = this.f;
        if (alvgVar2.c() == null) {
            a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "consume", 87, "AgenticCallScreenLlmExtractionProcessor.kt").v("AgenticLlmExtractionProcessor is not active.");
            return;
        }
        defpackage.alnb alnbVarB2 = defpackage.alnb.b(almzVar2.c);
        if (alnbVarB2 == null) {
            alnbVarB2 = defpackage.alnb.EVENT_UNKNOWN;
        }
        if (alnbVarB2 == defpackage.alnb.EVENT_LLM_INFERENCE_RESPONSE) {
            aimz aimzVar = a;
            aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "consume", 92, "AgenticCallScreenLlmExtractionProcessor.kt").v("AgenticLlmExtractionProcessor received EVENT_LLM_INFERENCE_RESPONSE");
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alnw.f;
            aooh.e(apdiVar2, "llmInferenceResponseEvent");
            defpackage.alnw alnwVar = (defpackage.alnw) akmr.x(almzVar3, apdiVar2);
            if (alnwVar != null) {
                java.lang.String strE = alvgVar2.e();
                if (strE.length() == 0) {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "handleLlmInferenceResponse", 106, "AgenticCallScreenLlmExtractionProcessor.kt").y("Ignoring prewarm or unknown LLM inference response with requestId=%s (no active conversation)", alnwVar.c);
                    return;
                }
                if (!aooh.n(alnwVar.c, strE)) {
                    aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "handleLlmInferenceResponse", 115, "AgenticCallScreenLlmExtractionProcessor.kt").I("Ignoring obsolete LLM inference response with requestId=%s (expected %s)", alnwVar.c, strE);
                    return;
                }
                if ((alnwVar.b & 2) != 0) {
                    alnvVar = alnwVar.e;
                    if (alnvVar == null) {
                        alnvVar = defpackage.alnv.a;
                    }
                } else {
                    alnvVar = null;
                }
                if (alnvVar != null && alnvVar.c) {
                    aimw aimwVarL2 = aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "handleLlmInferenceResponse", 125, "AgenticCallScreenLlmExtractionProcessor.kt");
                    defpackage.alnu alnuVarB = defpackage.alnu.b(alnvVar.d);
                    if (alnuVarB == null) {
                        alnuVarB = defpackage.alnu.UNKNOWN_ERROR_TYPE;
                    }
                    aimwVarL2.y("LLM inference failed with error type: %s.", alnuVarB.name());
                    defpackage.alnu alnuVarB2 = defpackage.alnu.b(alnvVar.d);
                    if (alnuVarB2 == null) {
                        alnuVarB2 = defpackage.alnu.UNKNOWN_ERROR_TYPE;
                    }
                    defpackage.alrx alrxVarY = ahus.y(alnuVarB2);
                    defpackage.ajyi ajyiVarJ = ahus.J(defpackage.alrm.a.m());
                    vaa vaaVarE = ahus.E(defpackage.alrk.a.m());
                    akzx akzxVarM = defpackage.alry.a.m();
                    aooh.f(akzxVarM, "builder");
                    akzxVarM.u();
                    defpackage.alry alryVar = (defpackage.alry) akzxVarM.b;
                    alryVar.c = alrxVarY.g;
                    alryVar.b |= 1;
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    defpackage.alry alryVar2 = (defpackage.alry) aladVarP;
                    aooh.f(alryVar2, "value");
                    akzx akzxVar = (akzx) vaaVarE.a;
                    akzxVar.u();
                    defpackage.alrk alrkVar = (defpackage.alrk) akzxVar.b;
                    j$.util.Objects.requireNonNull(alryVar2);
                    alrkVar.c = alryVar2;
                    alrkVar.b = 1;
                    ajyiVarJ.bd(vaaVarE.ay());
                    c(almyVar, ajyiVarJ.bc());
                    return;
                }
                alat alatVar = alnwVar.d;
                aooh.e(alatVar, "getTextList(...)");
                java.util.Iterator it = alatVar.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((java.lang.String) next).length() <= 0);
                java.lang.String str8 = (java.lang.String) next;
                if (str8 == null) {
                    aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "publishNewModelVerdict", 177, "AgenticCallScreenLlmExtractionProcessor.kt").v("No response text found in LLM inference response.");
                    c(almyVar, d);
                    return;
                }
                aimzVar.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "publishNewModelVerdict", 182, "AgenticCallScreenLlmExtractionProcessor.kt").y("AgenticLlmExtractionProcessor received response text: %s", str8);
                alvgVar2.n();
                java.lang.String string = aoov.x(str8).toString();
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(aoov.M(string, ':', 0));
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf == null) {
                    numValueOf = java.lang.Integer.valueOf(aoov.M(string, ';', 0));
                    if (numValueOf.intValue() == -1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = -1;
                    }
                } else {
                    iIntValue = numValueOf.intValue();
                }
                java.lang.String str9 = "SPEAK";
                if (iIntValue == -1) {
                    java.util.Map map = b;
                    java.util.Locale locale = java.util.Locale.US;
                    aooh.e(locale, "US");
                    java.lang.String lowerCase2 = string.toLowerCase(locale);
                    aooh.e(lowerCase2, "toLowerCase(...)");
                    java.lang.String str10 = (java.lang.String) map.get(lowerCase2);
                    if (str10 == null) {
                        aimzVar.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "parseLoraResponse", 274, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unknown SPEAK intent token or malformed response: '%s'", string);
                        str = "build(...)";
                        str2 = "builder";
                        aluvVar = null;
                    } else {
                        aluvVar = new defpackage.aluv(str10);
                        str = "build(...)";
                        str2 = "builder";
                    }
                } else {
                    str = "build(...)";
                    java.lang.String strSubstring = string.substring(0, iIntValue);
                    aooh.e(strSubstring, "substring(...)");
                    java.lang.String string2 = aoov.x(strSubstring).toString();
                    int i3 = iIntValue;
                    java.util.Locale locale2 = java.util.Locale.US;
                    aooh.e(locale2, "US");
                    java.lang.String upperCase = string2.toUpperCase(locale2);
                    aooh.e(upperCase, "toUpperCase(...)");
                    java.lang.String strSubstring2 = string.substring(i3 + 1);
                    aooh.e(strSubstring2, "substring(...)");
                    java.lang.String string3 = aoov.x(strSubstring2).toString();
                    try {
                        int iHashCode = upperCase.hashCode();
                        str2 = "builder";
                        if (iHashCode == 2515504) {
                            if (upperCase.equals("RING")) {
                                i = 3;
                                i2 = i - 1;
                                if (i2 != 0) {
                                    if (i2 != 1) {
                                        alutVar = new defpackage.aluu(string3);
                                    } else {
                                        alutVar = new defpackage.alut(string3);
                                    }
                                    aluvVar = alutVar;
                                } else {
                                    java.util.Map map2 = b;
                                    java.util.Locale locale3 = java.util.Locale.US;
                                    aooh.e(locale3, "US");
                                    java.lang.String lowerCase3 = string3.toLowerCase(locale3);
                                    aooh.e(lowerCase3, "toLowerCase(...)");
                                    str3 = (java.lang.String) map2.get(lowerCase3);
                                    if (str3 == null) {
                                        a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "parseLoraResponse", 295, "AgenticCallScreenLlmExtractionProcessor.kt").I("Unknown SPEAK intent token: '%s' in '%s'", string3, string);
                                        aluvVar = null;
                                    } else {
                                        aluvVar = new defpackage.aluv(str3);
                                    }
                                }
                            }
                            throw new java.lang.IllegalArgumentException();
                        }
                        if (iHashCode == 63294573) {
                            if (upperCase.equals("BLOCK")) {
                                i = 2;
                                i2 = i - 1;
                                if (i2 != 0) {
                                    if (i2 != 1) {
                                        alutVar = new defpackage.aluu(string3);
                                    } else {
                                        alutVar = new defpackage.alut(string3);
                                    }
                                    aluvVar = alutVar;
                                } else {
                                    java.util.Map map3 = b;
                                    java.util.Locale locale4 = java.util.Locale.US;
                                    aooh.e(locale4, "US");
                                    java.lang.String lowerCase4 = string3.toLowerCase(locale4);
                                    aooh.e(lowerCase4, "toLowerCase(...)");
                                    str3 = (java.lang.String) map3.get(lowerCase4);
                                    if (str3 == null) {
                                        a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "parseLoraResponse", 295, "AgenticCallScreenLlmExtractionProcessor.kt").I("Unknown SPEAK intent token: '%s' in '%s'", string3, string);
                                        aluvVar = null;
                                    } else {
                                        aluvVar = new defpackage.aluv(str3);
                                    }
                                }
                            }
                            throw new java.lang.IllegalArgumentException();
                        }
                        if (iHashCode == 79103922 && upperCase.equals("SPEAK")) {
                            i = 1;
                            i2 = i - 1;
                            if (i2 != 0) {
                                if (i2 != 1) {
                                    alutVar = new defpackage.aluu(string3);
                                } else {
                                    alutVar = new defpackage.alut(string3);
                                }
                                aluvVar = alutVar;
                            } else {
                                java.util.Map map4 = b;
                                java.util.Locale locale5 = java.util.Locale.US;
                                aooh.e(locale5, "US");
                                java.lang.String lowerCase5 = string3.toLowerCase(locale5);
                                aooh.e(lowerCase5, "toLowerCase(...)");
                                str3 = (java.lang.String) map4.get(lowerCase5);
                                if (str3 == null) {
                                    a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "parseLoraResponse", 295, "AgenticCallScreenLlmExtractionProcessor.kt").I("Unknown SPEAK intent token: '%s' in '%s'", string3, string);
                                    aluvVar = null;
                                } else {
                                    aluvVar = new defpackage.aluv(str3);
                                }
                            }
                        }
                        try {
                            throw new java.lang.IllegalArgumentException();
                        } catch (java.lang.IllegalArgumentException unused) {
                            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "parseLoraResponse", 287, "AgenticCallScreenLlmExtractionProcessor.kt").I("Unknown LLM action: '%s' in '%s'", upperCase, string);
                            aluvVar = null;
                            if (aluvVar == null) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "publishNewModelVerdict", 186, "AgenticCallScreenLlmExtractionProcessor.kt").v("Failed to parse LLM response.");
                                c(almyVar, e);
                                return;
                            }
                            c(almyVar, c);
                            alljVar = this.g;
                            almzVar = defpackage.almz.a;
                            xtq xtqVarO = defpackage.alpv.o(almzVar.m());
                            xtqVarO.ah(defpackage.alnb.EVENT_AGENTIC_NEW_MODEL_VERDICT);
                            apdi apdiVar3 = defpackage.alvk.e;
                            aooh.e(apdiVar3, "agenticNewModelVerdictEvent");
                            akzx akzxVarM2 = defpackage.alvk.a.m();
                            str4 = str2;
                            aooh.f(akzxVarM2, str4);
                            iA = aluvVar.a();
                            if (iA != 1) {
                                if (iA != 2) {
                                    str9 = "RING";
                                } else {
                                    str9 = "BLOCK";
                                }
                            }
                            akzxVarM2.u();
                            defpackage.alvk alvkVar = (defpackage.alvk) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(str9);
                            alvkVar.b |= 1;
                            alvkVar.c = str9;
                            str5 = "";
                            if (aluvVar instanceof defpackage.aluv) {
                                str6 = ((defpackage.aluv) aluvVar).a;
                            } else {
                                str6 = "";
                            }
                            akzxVarM2.u();
                            defpackage.alvk alvkVar2 = (defpackage.alvk) akzxVarM2.b;
                            j$.util.Objects.requireNonNull(str6);
                            alvkVar2.b |= 2;
                            alvkVar2.d = str6;
                            alad aladVarP2 = akzxVarM2.p();
                            str7 = str;
                            aooh.e(aladVarP2, str7);
                            xtqVarO.ax(apdiVar3, (defpackage.alvk) aladVarP2);
                            alljVar.a(xtqVarO.ag(), almyVar);
                            j$.util.Objects.checkIndex(0, 3);
                            if (aluvVar instanceof defpackage.alut) {
                                str5 = ((defpackage.alut) aluvVar).a;
                            } else if (aluvVar instanceof defpackage.aluu) {
                                str5 = ((defpackage.aluu) aluvVar).a;
                            }
                            if (str5.length() > 0) {
                                java.lang.String string4 = aoov.x(str5).toString();
                                java.util.Locale locale6 = java.util.Locale.US;
                                aooh.e(locale6, "US");
                                lowerCase = string4.toLowerCase(locale6);
                                aooh.e(lowerCase, "toLowerCase(...)");
                                switch (lowerCase) {
                                    case "family":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_FAMILY_CARE;
                                        break;
                                    case "business":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_BUSINESS_WORK;
                                        break;
                                    case "public":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_PUBLIC_INFO;
                                        break;
                                    case "delivery / logistics":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_DELIVERY_LOGISTICS;
                                        break;
                                    case "public / info":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_PUBLIC_INFO;
                                        break;
                                    case "personal / friend":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_PERSONAL_FRIEND;
                                        break;
                                    case "spam":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_LIKELY_SPAM;
                                        break;
                                    case "medical / account alert":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_MEDICAL_ALERT;
                                        break;
                                    case "sales":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_SOLICITATION_SALES;
                                        break;
                                    case "priority: family / care":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_FAMILY_CARE;
                                        break;
                                    case "likely spam":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_LIKELY_SPAM;
                                        break;
                                    case "personal":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_PERSONAL_FRIEND;
                                        break;
                                    case "solicitation / sales":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_SOLICITATION_SALES;
                                        break;
                                    case "delivery":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_DELIVERY_LOGISTICS;
                                        break;
                                    case "medical":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_MEDICAL_ALERT;
                                        break;
                                    case "business / work":
                                        alrpVar = defpackage.alrp.INTENT_LABEL_BUSINESS_WORK;
                                        break;
                                    default:
                                        a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                        alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                                        break;
                                }
                                xtq xtqVarO2 = defpackage.alpv.o(almzVar.m());
                                xtqVarO2.ah(defpackage.alnb.EVENT_AGENTIC_NEW_MODEL_SUMMARY);
                                apdi apdiVar4 = defpackage.alvn.e;
                                aooh.e(apdiVar4, "modelProducedSummaryEvent");
                                akzx akzxVarM3 = defpackage.alvn.a.m();
                                aooh.f(akzxVarM3, str4);
                                aooh.f(str5, "value");
                                akzxVarM3.u();
                                defpackage.alvn alvnVar = (defpackage.alvn) akzxVarM3.b;
                                j$.util.Objects.requireNonNull(str5);
                                alvnVar.b |= 1;
                                alvnVar.c = str5;
                                akzxVarM3.u();
                                defpackage.alvn alvnVar2 = (defpackage.alvn) akzxVarM3.b;
                                alvnVar2.d = alrpVar.j;
                                alvnVar2.b |= 2;
                                alad aladVarP3 = akzxVarM3.p();
                                aooh.e(aladVarP3, str7);
                                xtqVarO2.ax(apdiVar4, (defpackage.alvn) aladVarP3);
                                alljVar.a(xtqVarO2.ag(), almyVar);
                                a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "publishModelProducedSummary", 156, "AgenticCallScreenLlmExtractionProcessor.kt").I("Published EVENT_AGENTIC_NEW_MODEL_SUMMARY event with summary: %s, label: %s", str5, alrpVar);
                            }
                        }
                    } catch (java.lang.IllegalArgumentException unused2) {
                        str2 = "builder";
                    }
                }
                if (aluvVar == null) {
                    a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "publishNewModelVerdict", 186, "AgenticCallScreenLlmExtractionProcessor.kt").v("Failed to parse LLM response.");
                    c(almyVar, e);
                    return;
                }
                c(almyVar, c);
                alljVar = this.g;
                almzVar = defpackage.almz.a;
                xtq xtqVarO3 = defpackage.alpv.o(almzVar.m());
                xtqVarO3.ah(defpackage.alnb.EVENT_AGENTIC_NEW_MODEL_VERDICT);
                apdi apdiVar5 = defpackage.alvk.e;
                aooh.e(apdiVar5, "agenticNewModelVerdictEvent");
                akzx akzxVarM4 = defpackage.alvk.a.m();
                str4 = str2;
                aooh.f(akzxVarM4, str4);
                iA = aluvVar.a();
                if (iA != 1) {
                    if (iA != 2) {
                        str9 = "RING";
                    } else {
                        str9 = "BLOCK";
                    }
                }
                akzxVarM4.u();
                defpackage.alvk alvkVar3 = (defpackage.alvk) akzxVarM4.b;
                j$.util.Objects.requireNonNull(str9);
                alvkVar3.b |= 1;
                alvkVar3.c = str9;
                str5 = "";
                if (aluvVar instanceof defpackage.aluv) {
                    str6 = ((defpackage.aluv) aluvVar).a;
                } else {
                    str6 = "";
                }
                akzxVarM4.u();
                defpackage.alvk alvkVar4 = (defpackage.alvk) akzxVarM4.b;
                j$.util.Objects.requireNonNull(str6);
                alvkVar4.b |= 2;
                alvkVar4.d = str6;
                alad aladVarP4 = akzxVarM4.p();
                str7 = str;
                aooh.e(aladVarP4, str7);
                xtqVarO3.ax(apdiVar5, (defpackage.alvk) aladVarP4);
                alljVar.a(xtqVarO3.ag(), almyVar);
                j$.util.Objects.checkIndex(0, 3);
                if (aluvVar instanceof defpackage.alut) {
                    str5 = ((defpackage.alut) aluvVar).a;
                } else if (aluvVar instanceof defpackage.aluu) {
                    str5 = ((defpackage.aluu) aluvVar).a;
                }
                if (str5.length() > 0) {
                    java.lang.String string5 = aoov.x(str5).toString();
                    java.util.Locale locale7 = java.util.Locale.US;
                    aooh.e(locale7, "US");
                    lowerCase = string5.toLowerCase(locale7);
                    aooh.e(lowerCase, "toLowerCase(...)");
                    switch (lowerCase) {
                        case -1281860764:
                            if (lowerCase.equals("family")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_FAMILY_CARE;
                            }
                            break;
                        case -1146830912:
                            if (lowerCase.equals("business")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_BUSINESS_WORK;
                            }
                            break;
                        case -977423767:
                            if (lowerCase.equals("public")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_PUBLIC_INFO;
                            }
                            break;
                        case -815707850:
                            if (lowerCase.equals("delivery / logistics")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_DELIVERY_LOGISTICS;
                            }
                            break;
                        case -685705322:
                            if (lowerCase.equals("public / info")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_PUBLIC_INFO;
                            }
                            break;
                        case -500207217:
                            if (lowerCase.equals("personal / friend")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_PERSONAL_FRIEND;
                            }
                            break;
                        case 3536713:
                            if (lowerCase.equals("spam")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_LIKELY_SPAM;
                            }
                            break;
                        case 70540265:
                            if (lowerCase.equals("medical / account alert")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_MEDICAL_ALERT;
                            }
                            break;
                        case 109201676:
                            if (lowerCase.equals("sales")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_SOLICITATION_SALES;
                            }
                            break;
                        case 242562324:
                            if (lowerCase.equals("priority: family / care")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_FAMILY_CARE;
                            }
                            break;
                        case 413151877:
                            if (lowerCase.equals("likely spam")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_LIKELY_SPAM;
                            }
                            break;
                        case 443164224:
                            if (lowerCase.equals("personal")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_PERSONAL_FRIEND;
                            }
                            break;
                        case 728445051:
                            if (lowerCase.equals("solicitation / sales")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_SOLICITATION_SALES;
                            }
                            break;
                        case 823466996:
                            if (lowerCase.equals("delivery")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_DELIVERY_LOGISTICS;
                            }
                            break;
                        case 940776081:
                            if (lowerCase.equals("medical")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_MEDICAL_ALERT;
                            }
                            break;
                        case 2083384514:
                            if (lowerCase.equals("business / work")) {
                                a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                                alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            } else {
                                alrpVar = defpackage.alrp.INTENT_LABEL_BUSINESS_WORK;
                            }
                            break;
                        default:
                            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "mapStringToIntentLabel", 254, "AgenticCallScreenLlmExtractionProcessor.kt").y("Unrecognized GACS model summary: %s", str5);
                            alrpVar = defpackage.alrp.INTENT_LABEL_UNKNOWN;
                            break;
                    }
                    xtq xtqVarO4 = defpackage.alpv.o(almzVar.m());
                    xtqVarO4.ah(defpackage.alnb.EVENT_AGENTIC_NEW_MODEL_SUMMARY);
                    apdi apdiVar6 = defpackage.alvn.e;
                    aooh.e(apdiVar6, "modelProducedSummaryEvent");
                    akzx akzxVarM5 = defpackage.alvn.a.m();
                    aooh.f(akzxVarM5, str4);
                    aooh.f(str5, "value");
                    akzxVarM5.u();
                    defpackage.alvn alvnVar3 = (defpackage.alvn) akzxVarM5.b;
                    j$.util.Objects.requireNonNull(str5);
                    alvnVar3.b |= 1;
                    alvnVar3.c = str5;
                    akzxVarM5.u();
                    defpackage.alvn alvnVar4 = (defpackage.alvn) akzxVarM5.b;
                    alvnVar4.d = alrpVar.j;
                    alvnVar4.b |= 2;
                    alad aladVarP5 = akzxVarM5.p();
                    aooh.e(aladVarP5, str7);
                    xtqVarO4.ax(apdiVar6, (defpackage.alvn) aladVarP5);
                    alljVar.a(xtqVarO4.ag(), almyVar);
                    a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenLlmExtractionProcessor", "publishModelProducedSummary", 156, "AgenticCallScreenLlmExtractionProcessor.kt").I("Published EVENT_AGENTIC_NEW_MODEL_SUMMARY event with summary: %s, label: %s", str5, alrpVar);
                }
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        this.f.h("");
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
