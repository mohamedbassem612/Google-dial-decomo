package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iwy {
    private static final aimz b = aimz.i("com/android/dialer/beesly/impl/service/BeeslyLifecycleController");
    public final oko a;
    private final jbm c;
    private final aoin d;
    private final iwk e;
    private final defpackage.jcy f;
    private final defpackage.ihr g;
    private final ish h;
    private final zrw i;
    private final long j;
    private final j$.util.Optional k;
    private final zpm l;
    private final oud m;
    private final zjm n;
    private final kaw o;
    private final afpl p;

    public iwy(jbm jbmVar, zjm zjmVar, aoin aoinVar, aoin aoinVar2, oud oudVar, iwk iwkVar, defpackage.jcy jcyVar, defpackage.ihr ihrVar, zpm zpmVar, ish ishVar, zrw zrwVar, afpl afplVar, oko okoVar, kaw kawVar, long j, j$.util.Optional optional) {
        aooh.f(jbmVar, "beeslySettings");
        aooh.f(aoinVar, "enableBeeslySmartActions");
        aooh.f(aoinVar2, "enableDobbyStateCheck");
        aooh.f(oudVar, "inCallActivityMinimizer");
        aooh.f(ihrVar, "audioPrismSession");
        aooh.f(zpmVar, "callScopes");
        aooh.f(ishVar, "beeslySingletonAudioPrismConfigProvider");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(kawVar, "hasAnotherActiveCallCache");
        aooh.f(optional, "testingOverrides");
        this.c = jbmVar;
        this.n = zjmVar;
        this.d = aoinVar2;
        this.m = oudVar;
        this.e = iwkVar;
        this.f = jcyVar;
        this.g = ihrVar;
        this.l = zpmVar;
        this.h = ishVar;
        this.i = zrwVar;
        this.p = afplVar;
        this.a = okoVar;
        this.o = kawVar;
        this.j = j;
        this.k = optional;
    }

    private final qbe e() {
        defpackage.iws iwsVar;
        j$.util.Optional optionalH = this.l.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar == null || (iwsVar = (defpackage.iws) apqrVar.a(defpackage.iws.class)) == null) {
            return null;
        }
        return iwsVar.cp();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0269  */
    /* JADX WARN: Code duplicated, block: B:104:0x027d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0296  */
    /* JADX WARN: Code duplicated, block: B:108:0x029e  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:44:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:61:0x017c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0186  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0211  */
    /* JADX WARN: Code duplicated, block: B:89:0x0222  */
    /* JADX WARN: Code duplicated, block: B:90:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x023d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0248  */
    /* JADX WARN: Code duplicated, block: B:97:0x0261  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [ihr] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v7 */
    public final java.lang.Object a(java.lang.String str, boolean z, aoln aolnVar) {
        defpackage.iwu iwuVar;
        qbe qbeVarE;
        java.lang.String str2;
        boolean z2;
        qbe qbeVarE2;
        defpackage.ihr ihrVar;
        java.lang.Object objB;
        java.lang.String str3;
        ?? r13;
        qbe qbeVarE3;
        java.lang.String str4;
        mnp mnpVar;
        qbe qbeVarE4;
        qbe qbeVarE5;
        qbe qbeVarE6;
        java.lang.Boolean boolQ;
        java.lang.Boolean bool;
        mnp mnpVar2;
        qbe qbeVarE7;
        qbe qbeVarE8;
        defpackage.jim jimVar;
        defpackage.iwy iwyVar;
        qbe qbeVarE9;
        qbe qbeVarE10;
        if (aolnVar instanceof defpackage.iwu) {
            iwuVar = (defpackage.iwu) aolnVar;
            int i = iwuVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwuVar.f = i - Integer.MIN_VALUE;
            } else {
                iwuVar = new defpackage.iwu(this, aolnVar);
            }
        } else {
            iwuVar = new defpackage.iwu(this, aolnVar);
        }
        java.lang.Object objG = iwuVar.d;
        aolu aoluVar = aolu.a;
        switch (iwuVar.f) {
            case 0:
                aooc.af(objG);
                jbm jbmVar = this.c;
                iwuVar.a = str;
                iwuVar.c = z;
                iwuVar.f = 1;
                objG = jbmVar.g(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 75, "BeeslyLifecycleController.kt").v("Beesly is not enrolled.");
                    qbeVarE2 = e();
                    if (qbeVarE2 != null) {
                        qbeVarE2.c(qbc.cE);
                    }
                    return java.lang.Boolean.FALSE;
                }
                qbeVarE = e();
                if (qbeVarE != null) {
                    qbeVarE.c(qbc.cF);
                }
                iwk iwkVar = this.e;
                iwuVar.a = str;
                iwuVar.c = z;
                iwuVar.f = 2;
                objG = iwkVar.a(iwuVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                boolean z3 = z;
                str2 = str;
                z2 = z3;
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 84, "BeeslyLifecycleController.kt").v("Beesly model is not available.");
                    qbeVarE3 = e();
                    if (qbeVarE3 != null) {
                        qbeVarE3.c(qbc.cG);
                    }
                    return java.lang.Boolean.FALSE;
                }
                ihrVar = this.g;
                ish ishVar = this.h;
                iwuVar.a = str2;
                iwuVar.b = ihrVar;
                iwuVar.c = z2;
                iwuVar.f = 3;
                objB = ishVar.b(iwuVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                r13 = ihrVar;
                objG = objB;
                iwuVar.a = str3;
                iwuVar.b = null;
                iwuVar.c = z2;
                iwuVar.f = 4;
                objG = r13.a((igf) objG, iwuVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                str4 = str3;
                if ((((defpackage.igi) objG).c & 1) != 0) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 93, "BeeslyLifecycleController.kt").v("Beesly soda package is not available.");
                    qbeVarE5 = e();
                    if (qbeVarE5 != null) {
                        qbeVarE5.c(qbc.cH);
                    }
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalG = this.n.g();
                aooh.e(optionalG, "getFeature(...)");
                mnpVar = (mnp) aooh.q(optionalG);
                if (mnpVar == null) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 104, "BeeslyLifecycleController.kt").v("Dobby feature is not available.");
                    qbeVarE4 = e();
                    if (qbeVarE4 != null) {
                        qbeVarE4.c(qbc.cI);
                    }
                    return java.lang.Boolean.FALSE;
                }
                if (z2 && ((java.lang.Boolean) this.d.a()).booleanValue()) {
                    iwuVar.a = null;
                    iwuVar.f = 5;
                    objG = mnpVar.c(str4, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 115, "BeeslyLifecycleController.kt").v("Current state is not READY_FOR_MANUAL_SCREENING or NOT_A_DOBBY_CALL.");
                        qbeVarE6 = e();
                        if (qbeVarE6 != null) {
                            qbeVarE6.c(qbc.cJ);
                        }
                        return java.lang.Boolean.FALSE;
                    }
                }
                defpackage.jcy jcyVar = this.f;
                iwuVar.a = null;
                iwuVar.f = 6;
                objG = jcyVar.c(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    objG = bool;
                } else {
                    j$.util.Optional optionalG2 = this.n.g();
                    aooh.e(optionalG2, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG2);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar = this.i;
                iwuVar.f = 8;
                objG = zrwVar.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null || !jimVar.a()) {
                    ajcq ajcqVarX = this.p.X();
                    iwuVar.a = this;
                    iwuVar.f = 9;
                    objG = aosv.D(ajcqVarX, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    iwyVar = this;
                    java.lang.Object objAr = aooc.ar(objG, defpackage.iwt.class);
                    aooh.e(objAr, "get(...)");
                    iwuVar.a = null;
                    iwuVar.f = 10;
                    objG = iwyVar.b((defpackage.iwt) objAr, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objG).booleanValue()) {
                        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                        qbeVarE10 = e();
                        if (qbeVarE10 != null) {
                            qbeVarE10.c(qbc.cN);
                        }
                        return java.lang.Boolean.FALSE;
                    }
                }
                return java.lang.Boolean.TRUE;
            case 1:
                z = iwuVar.c;
                str = (java.lang.String) iwuVar.a;
                aooc.af(objG);
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 75, "BeeslyLifecycleController.kt").v("Beesly is not enrolled.");
                    qbeVarE2 = e();
                    if (qbeVarE2 != null) {
                        qbeVarE2.c(qbc.cE);
                    }
                    return java.lang.Boolean.FALSE;
                }
                qbeVarE = e();
                if (qbeVarE != null) {
                    qbeVarE.c(qbc.cF);
                }
                iwk iwkVar2 = this.e;
                iwuVar.a = str;
                iwuVar.c = z;
                iwuVar.f = 2;
                objG = iwkVar2.a(iwuVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                boolean z4 = z;
                str2 = str;
                z2 = z4;
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 84, "BeeslyLifecycleController.kt").v("Beesly model is not available.");
                    qbeVarE3 = e();
                    if (qbeVarE3 != null) {
                        qbeVarE3.c(qbc.cG);
                    }
                    return java.lang.Boolean.FALSE;
                }
                ihrVar = this.g;
                ish ishVar2 = this.h;
                iwuVar.a = str2;
                iwuVar.b = ihrVar;
                iwuVar.c = z2;
                iwuVar.f = 3;
                objB = ishVar2.b(iwuVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                r13 = ihrVar;
                objG = objB;
                iwuVar.a = str3;
                iwuVar.b = null;
                iwuVar.c = z2;
                iwuVar.f = 4;
                objG = r13.a((igf) objG, iwuVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                str4 = str3;
                if ((((defpackage.igi) objG).c & 1) != 0) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 93, "BeeslyLifecycleController.kt").v("Beesly soda package is not available.");
                    qbeVarE5 = e();
                    if (qbeVarE5 != null) {
                        qbeVarE5.c(qbc.cH);
                    }
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalG3 = this.n.g();
                aooh.e(optionalG3, "getFeature(...)");
                mnpVar = (mnp) aooh.q(optionalG3);
                if (mnpVar == null) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 104, "BeeslyLifecycleController.kt").v("Dobby feature is not available.");
                    qbeVarE4 = e();
                    if (qbeVarE4 != null) {
                        qbeVarE4.c(qbc.cI);
                    }
                    return java.lang.Boolean.FALSE;
                }
                if (z2) {
                    iwuVar.a = null;
                    iwuVar.f = 5;
                    objG = mnpVar.c(str4, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 115, "BeeslyLifecycleController.kt").v("Current state is not READY_FOR_MANUAL_SCREENING or NOT_A_DOBBY_CALL.");
                        qbeVarE6 = e();
                        if (qbeVarE6 != null) {
                            qbeVarE6.c(qbc.cJ);
                        }
                        return java.lang.Boolean.FALSE;
                    }
                }
                defpackage.jcy jcyVar2 = this.f;
                iwuVar.a = null;
                iwuVar.f = 6;
                objG = jcyVar2.c(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    j$.util.Optional optionalG4 = this.n.g();
                    aooh.e(optionalG4, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG4);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                } else {
                    objG = bool;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar2 = this.i;
                iwuVar.f = 8;
                objG = zrwVar2.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX2 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX2, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr2 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr2, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr2, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 2:
                z2 = iwuVar.c;
                str2 = (java.lang.String) iwuVar.a;
                aooc.af(objG);
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 84, "BeeslyLifecycleController.kt").v("Beesly model is not available.");
                    qbeVarE3 = e();
                    if (qbeVarE3 != null) {
                        qbeVarE3.c(qbc.cG);
                    }
                    return java.lang.Boolean.FALSE;
                }
                ihrVar = this.g;
                ish ishVar3 = this.h;
                iwuVar.a = str2;
                iwuVar.b = ihrVar;
                iwuVar.c = z2;
                iwuVar.f = 3;
                objB = ishVar3.b(iwuVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                r13 = ihrVar;
                objG = objB;
                iwuVar.a = str3;
                iwuVar.b = null;
                iwuVar.c = z2;
                iwuVar.f = 4;
                objG = r13.a((igf) objG, iwuVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                str4 = str3;
                if ((((defpackage.igi) objG).c & 1) != 0) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 93, "BeeslyLifecycleController.kt").v("Beesly soda package is not available.");
                    qbeVarE5 = e();
                    if (qbeVarE5 != null) {
                        qbeVarE5.c(qbc.cH);
                    }
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalG5 = this.n.g();
                aooh.e(optionalG5, "getFeature(...)");
                mnpVar = (mnp) aooh.q(optionalG5);
                if (mnpVar == null) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 104, "BeeslyLifecycleController.kt").v("Dobby feature is not available.");
                    qbeVarE4 = e();
                    if (qbeVarE4 != null) {
                        qbeVarE4.c(qbc.cI);
                    }
                    return java.lang.Boolean.FALSE;
                }
                if (z2) {
                    iwuVar.a = null;
                    iwuVar.f = 5;
                    objG = mnpVar.c(str4, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 115, "BeeslyLifecycleController.kt").v("Current state is not READY_FOR_MANUAL_SCREENING or NOT_A_DOBBY_CALL.");
                        qbeVarE6 = e();
                        if (qbeVarE6 != null) {
                            qbeVarE6.c(qbc.cJ);
                        }
                        return java.lang.Boolean.FALSE;
                    }
                }
                defpackage.jcy jcyVar3 = this.f;
                iwuVar.a = null;
                iwuVar.f = 6;
                objG = jcyVar3.c(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    j$.util.Optional optionalG6 = this.n.g();
                    aooh.e(optionalG6, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG6);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                } else {
                    objG = bool;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar3 = this.i;
                iwuVar.f = 8;
                objG = zrwVar3.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX3 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX3, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr3 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr3, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr3, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 3:
                z2 = iwuVar.c;
                java.lang.Object obj = iwuVar.b;
                str3 = (java.lang.String) iwuVar.a;
                aooc.af(objG);
                r13 = obj;
                iwuVar.a = str3;
                iwuVar.b = null;
                iwuVar.c = z2;
                iwuVar.f = 4;
                objG = r13.a((igf) objG, iwuVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                str4 = str3;
                if ((((defpackage.igi) objG).c & 1) != 0) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 93, "BeeslyLifecycleController.kt").v("Beesly soda package is not available.");
                    qbeVarE5 = e();
                    if (qbeVarE5 != null) {
                        qbeVarE5.c(qbc.cH);
                    }
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalG7 = this.n.g();
                aooh.e(optionalG7, "getFeature(...)");
                mnpVar = (mnp) aooh.q(optionalG7);
                if (mnpVar == null) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 104, "BeeslyLifecycleController.kt").v("Dobby feature is not available.");
                    qbeVarE4 = e();
                    if (qbeVarE4 != null) {
                        qbeVarE4.c(qbc.cI);
                    }
                    return java.lang.Boolean.FALSE;
                }
                if (z2) {
                    iwuVar.a = null;
                    iwuVar.f = 5;
                    objG = mnpVar.c(str4, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 115, "BeeslyLifecycleController.kt").v("Current state is not READY_FOR_MANUAL_SCREENING or NOT_A_DOBBY_CALL.");
                        qbeVarE6 = e();
                        if (qbeVarE6 != null) {
                            qbeVarE6.c(qbc.cJ);
                        }
                        return java.lang.Boolean.FALSE;
                    }
                }
                defpackage.jcy jcyVar4 = this.f;
                iwuVar.a = null;
                iwuVar.f = 6;
                objG = jcyVar4.c(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    j$.util.Optional optionalG8 = this.n.g();
                    aooh.e(optionalG8, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG8);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                } else {
                    objG = bool;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar4 = this.i;
                iwuVar.f = 8;
                objG = zrwVar4.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX4 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX4, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr4 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr4, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr4, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 4:
                z2 = iwuVar.c;
                str4 = (java.lang.String) iwuVar.a;
                aooc.af(objG);
                if ((((defpackage.igi) objG).c & 1) != 0) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 93, "BeeslyLifecycleController.kt").v("Beesly soda package is not available.");
                    qbeVarE5 = e();
                    if (qbeVarE5 != null) {
                        qbeVarE5.c(qbc.cH);
                    }
                    return java.lang.Boolean.FALSE;
                }
                j$.util.Optional optionalG9 = this.n.g();
                aooh.e(optionalG9, "getFeature(...)");
                mnpVar = (mnp) aooh.q(optionalG9);
                if (mnpVar == null) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 104, "BeeslyLifecycleController.kt").v("Dobby feature is not available.");
                    qbeVarE4 = e();
                    if (qbeVarE4 != null) {
                        qbeVarE4.c(qbc.cI);
                    }
                    return java.lang.Boolean.FALSE;
                }
                if (z2) {
                    iwuVar.a = null;
                    iwuVar.f = 5;
                    objG = mnpVar.c(str4, iwuVar);
                    if (objG == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objG).booleanValue()) {
                        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 115, "BeeslyLifecycleController.kt").v("Current state is not READY_FOR_MANUAL_SCREENING or NOT_A_DOBBY_CALL.");
                        qbeVarE6 = e();
                        if (qbeVarE6 != null) {
                            qbeVarE6.c(qbc.cJ);
                        }
                        return java.lang.Boolean.FALSE;
                    }
                }
                defpackage.jcy jcyVar5 = this.f;
                iwuVar.a = null;
                iwuVar.f = 6;
                objG = jcyVar5.c(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    j$.util.Optional optionalG10 = this.n.g();
                    aooh.e(optionalG10, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG10);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                } else {
                    objG = bool;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar5 = this.i;
                iwuVar.f = 8;
                objG = zrwVar5.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX5 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX5, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr5 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr5, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr5, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 5:
                aooc.af(objG);
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 115, "BeeslyLifecycleController.kt").v("Current state is not READY_FOR_MANUAL_SCREENING or NOT_A_DOBBY_CALL.");
                    qbeVarE6 = e();
                    if (qbeVarE6 != null) {
                        qbeVarE6.c(qbc.cJ);
                    }
                    return java.lang.Boolean.FALSE;
                }
                defpackage.jcy jcyVar6 = this.f;
                iwuVar.a = null;
                iwuVar.f = 6;
                objG = jcyVar6.c(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    j$.util.Optional optionalG11 = this.n.g();
                    aooh.e(optionalG11, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG11);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                } else {
                    objG = bool;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar6 = this.i;
                iwuVar.f = 8;
                objG = zrwVar6.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX6 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX6, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr6 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr6, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr6, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 6:
                aooc.af(objG);
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 122, "BeeslyLifecycleController.kt").v("user is roaming and there is no bypassing roaming check.");
                    qbeVarE7 = e();
                    if (qbeVarE7 != null) {
                        qbeVarE7.c(qbc.cK);
                    }
                    return java.lang.Boolean.FALSE;
                }
                iwuVar.f = 7;
                boolQ = this.o.q(this.j);
                bool = java.lang.Boolean.TRUE;
                if (aooh.n(boolQ, bool)) {
                    j$.util.Optional optionalG12 = this.n.g();
                    aooh.e(optionalG12, "getFeature(...)");
                    mnpVar2 = (mnp) aooh.q(optionalG12);
                    if (mnpVar2 != null) {
                        objG = mnpVar2.d(iwuVar);
                    } else {
                        b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "hasAnotherActiveCall", 209, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
                        objG = bool;
                    }
                } else {
                    objG = bool;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar7 = this.i;
                iwuVar.f = 8;
                objG = zrwVar7.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX7 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX7, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr7 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr7, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr7, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 7:
                aooc.af(objG);
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 127, "BeeslyLifecycleController.kt").v("another active call.");
                    qbeVarE8 = e();
                    if (qbeVarE8 != null) {
                        qbeVarE8.c(qbc.cL);
                    }
                    return java.lang.Boolean.FALSE;
                }
                zrw zrwVar8 = this.i;
                iwuVar.f = 8;
                objG = zrwVar8.p(iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX8 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX8, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr8 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr8, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr8, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 8:
                aooc.af(objG);
                if (!((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 134, "BeeslyLifecycleController.kt").v("Missing microphone permission.");
                    qbeVarE9 = e();
                    if (qbeVarE9 != null) {
                        qbeVarE9.c(qbc.cM);
                    }
                    return java.lang.Boolean.FALSE;
                }
                jimVar = (defpackage.jim) aooh.q(this.k);
                if (jimVar != null) {
                    break;
                }
                ajcq ajcqVarX9 = this.p.X();
                iwuVar.a = this;
                iwuVar.f = 9;
                objG = aosv.D(ajcqVarX9, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                iwyVar = this;
                java.lang.Object objAr9 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr9, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr9, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 9:
                iwyVar = (defpackage.iwy) iwuVar.a;
                aooc.af(objG);
                java.lang.Object objAr10 = aooc.ar(objG, defpackage.iwt.class);
                aooh.e(objAr10, "get(...)");
                iwuVar.a = null;
                iwuVar.f = 10;
                objG = iwyVar.b((defpackage.iwt) objAr10, iwuVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            case 10:
                aooc.af(objG);
                if (((java.lang.Boolean) objG).booleanValue()) {
                    b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "isBeeslyEligible", 151, "BeeslyLifecycleController.kt").v("Fi wifi calling / VoIP is under fixing, not allowing Beesly to start");
                    qbeVarE10 = e();
                    if (qbeVarE10 != null) {
                        qbeVarE10.c(qbc.cN);
                    }
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.TRUE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [iwt] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [iwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final java.lang.Object b(defpackage.iwt iwtVar, aoln aolnVar) {
        defpackage.iwv iwvVar;
        ?? r9;
        ?? r2;
        boolean z;
        java.lang.Boolean bool;
        boolean zBooleanValue;
        java.lang.Integer num;
        if (aolnVar instanceof defpackage.iwv) {
            iwvVar = (defpackage.iwv) aolnVar;
            int i = iwvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwvVar.e = i - Integer.MIN_VALUE;
            } else {
                iwvVar = new defpackage.iwv(this, aolnVar);
            }
        } else {
            iwvVar = new defpackage.iwv(this, aolnVar);
        }
        java.lang.Object objD = iwvVar.c;
        aolu aoluVar = aolu.a;
        int i2 = iwvVar.e;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = iwvVar.a;
                aooc.af(objD);
                r9 = obj;
            } else if (i2 == 2) {
                z = iwvVar.b;
                java.lang.Object obj2 = iwvVar.a;
                aooc.af(objD);
                r2 = obj2;
                bool = (java.lang.Boolean) aooh.q((j$.util.Optional) objD);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                if (z && !zBooleanValue) {
                    return java.lang.Boolean.FALSE;
                }
                aiuo aiuoVar = new aiuo(new defpackage.njr(this, (defpackage.iwt) r2, (aoln) null, 1));
                iwvVar.a = null;
                iwvVar.e = 3;
                objD = aiuoVar.a(iwvVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            num = (java.lang.Integer) objD;
            if (num != null && num.intValue() == 1989) {
                z2 = true;
            }
            return java.lang.Boolean.valueOf(z2);
        }
        aooc.af(objD);
        ajcq ajcqVarAV = iwtVar.aV();
        iwvVar.a = iwtVar;
        iwvVar.e = 1;
        objD = aosv.D(ajcqVarAV, iwvVar);
        if (objD == aoluVar) {
            r9 = iwtVar;
            return aoluVar;
        }
        r9 = iwtVar;
        boolean zBooleanValue2 = ((java.lang.Boolean) objD).booleanValue();
        ajcq ajcqVarAA = r9.aA();
        iwvVar.a = r9;
        iwvVar.b = zBooleanValue2;
        iwvVar.e = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAA, iwvVar);
        if (objD2 == aoluVar) {
            return aoluVar;
        }
        r2 = r9;
        z = zBooleanValue2;
        objD = objD2;
        bool = (java.lang.Boolean) aooh.q((j$.util.Optional) objD);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (z) {
        }
        aiuo aiuoVar2 = new aiuo(new defpackage.njr(this, (defpackage.iwt) r2, (aoln) null, 1));
        iwvVar.a = null;
        iwvVar.e = 3;
        objD = aiuoVar2.a(iwvVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        num = (java.lang.Integer) objD;
        if (num != null) {
            z2 = true;
        }
        return java.lang.Boolean.valueOf(z2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.iww iwwVar;
        if (aolnVar instanceof defpackage.iww) {
            iwwVar = (defpackage.iww) aolnVar;
            int i = iwwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwwVar.c = i - Integer.MIN_VALUE;
            } else {
                iwwVar = new defpackage.iww(this, aolnVar);
            }
        } else {
            iwwVar = new defpackage.iww(this, aolnVar);
        }
        java.lang.Object objD = iwwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iwwVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarA = this.m.a();
            iwwVar.c = 1;
            objD = aosv.D(ajcqVarA, iwwVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objD;
        bool.booleanValue();
        b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "requestInCallMinimization", 187, "BeeslyLifecycleController.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", bool);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.lang.String str, defpackage.mmv mmvVar, aoln aolnVar) {
        defpackage.iwx iwxVar;
        defpackage.iws iwsVar;
        java.lang.String str2;
        defpackage.mmv mmvVar2;
        mnp mnpVar;
        defpackage.nej nejVarA;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.iwx) {
            iwxVar = (defpackage.iwx) aolnVar;
            int i = iwxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwxVar.c = i - Integer.MIN_VALUE;
            } else {
                iwxVar = new defpackage.iwx(this, aolnVar);
            }
        } else {
            iwxVar = new defpackage.iwx(this, aolnVar);
        }
        java.lang.Object objA2 = iwxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iwxVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                mmvVar = iwxVar.e;
                str = iwxVar.d;
                aooc.af(objA2);
            } else if (i2 == 2) {
                mnpVar = iwxVar.f;
                mmvVar2 = iwxVar.e;
                str2 = iwxVar.d;
                aooc.af(objA2);
                iwxVar.d = null;
                iwxVar.e = null;
                iwxVar.f = null;
                iwxVar.c = 3;
                nejVarA = mnpVar.a(str2);
                if (nejVarA != null || (objA = nejVarA.A(mmvVar2, iwxVar)) != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA2);
            }
            return aojh.a;
        }
        aooc.af(objA2);
        iwxVar.d = str;
        iwxVar.e = mmvVar;
        iwxVar.c = 1;
        objA2 = a(str, true, iwxVar);
        if (objA2 == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objA2).booleanValue()) {
            j$.util.Optional optionalG = this.n.g();
            aooh.e(optionalG, "getFeature(...)");
            mnp mnpVar2 = (mnp) aooh.q(optionalG);
            if (mnpVar2 != null) {
                iwxVar.d = str;
                iwxVar.e = mmvVar;
                iwxVar.f = mnpVar2;
                iwxVar.c = 2;
                if (c(iwxVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.mmv mmvVar3 = mmvVar;
                str2 = str;
                mmvVar2 = mmvVar3;
                mnpVar = mnpVar2;
                iwxVar.d = null;
                iwxVar.e = null;
                iwxVar.f = null;
                iwxVar.c = 3;
                nejVarA = mnpVar.a(str2);
                if (nejVarA != null) {
                    objA = aojh.a;
                } else {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
            } else {
                b.d().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "startBeeslyCall", 173, "BeeslyLifecycleController.kt").v("Dobby enabled but feature is not present, code somewhere is likely incorrect.");
            }
        } else {
            b.b().l("com/android/dialer/beesly/impl/service/BeeslyLifecycleController", "startBeeslyCall", 176, "BeeslyLifecycleController.kt").v("beesly call cannot be started due to precondition failed.");
            j$.util.Optional optionalH = this.l.h();
            aooh.e(optionalH, "getPrimaryCallScope(...)");
            apqr apqrVar = (apqr) aooh.q(optionalH);
            pqm pqmVarCq = (apqrVar == null || (iwsVar = (defpackage.iws) apqrVar.a(defpackage.iws.class)) == null) ? null : iwsVar.cq();
            if (pqmVarCq != null) {
                ajcq ajcqVarF = pqmVarCq.f();
                iwxVar.d = null;
                iwxVar.e = null;
                iwxVar.c = 4;
                if (aosv.D(ajcqVarF, iwxVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }
}
