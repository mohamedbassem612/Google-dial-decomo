package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mzp {
    private final mns a;
    private final defpackage.neu b;
    private final aoin c;
    private final aoin d;
    private final aoin e;
    private final aoin f;
    private final aoin g;
    private final aoin h;
    private final aoin i;
    private final boolean j;
    private final nnx k;
    private final zjm l;

    public mzp(mns mnsVar, defpackage.neu neuVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7, boolean z, nnx nnxVar, zjm zjmVar) {
        aooh.f(mnsVar, "singletonConfigProvider");
        aooh.f(aoinVar, "enableLlmSmartReplyConsentFlow");
        aooh.f(aoinVar2, "enableAgenticCallScreen");
        aooh.f(aoinVar3, "enableGacsManualScreenPrompt");
        aooh.f(aoinVar4, "gacsManualScreenMaxTurns");
        aooh.f(aoinVar5, "gacsTimeoutThresholdMillis");
        aooh.f(aoinVar6, "gacsSilenceThresholdMillis");
        aooh.f(aoinVar7, "gacsLoraModelMaxVersion");
        this.a = mnsVar;
        this.b = neuVar;
        this.c = aoinVar;
        this.d = aoinVar2;
        this.e = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
        this.h = aoinVar6;
        this.i = aoinVar7;
        this.j = z;
        this.k = nnxVar;
        this.l = zjmVar;
    }

    static /* synthetic */ alro d(alta altaVar) {
        ajyi ajyiVarI = ahus.I(alro.a.m());
        apdi apdiVar = alqx.d;
        aooh.e(apdiVar, "botSpeechEndedEvent");
        akzx akzxVarM = alqx.a.m();
        aooh.f(akzxVarM, "builder");
        java.lang.String str = altaVar.c;
        aooh.e(str, "getOriginatingEventId(...)");
        aooh.f(str, "value");
        akzxVarM.u();
        alqx alqxVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alqxVar.b |= 1;
        alqxVar.c = str;
        alqx alqxVarP = akzxVarM.p();
        aooh.e(alqxVarP, "build(...)");
        ajyiVarI.be(apdiVar, alqxVarP);
        return ajyiVarI.ba();
    }

    static /* synthetic */ alro e(alta altaVar, int i) {
        ajyi ajyiVarI = ahus.I(alro.a.m());
        apdi apdiVar = alqy.f;
        aooh.e(apdiVar, "botSpeechStartedEvent");
        akzx akzxVarM = alqy.a.m();
        aooh.f(akzxVarM, "builder");
        java.lang.String str = altaVar.c;
        aooh.e(str, "getOriginatingEventId(...)");
        aooh.f(str, "value");
        akzxVarM.u();
        alqy alqyVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        alqyVar.b |= 1;
        alqyVar.c = str;
        alsw alswVar = altaVar.d;
        if (alswVar == null) {
            alswVar = alsw.a;
        }
        aooh.e(alswVar, "getSpeech(...)");
        aooh.f(alswVar, "value");
        akzxVarM.u();
        alqy alqyVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(alswVar);
        alqyVar2.d = alswVar;
        alqyVar2.b |= 2;
        akzxVarM.u();
        alqy alqyVar3 = akzxVarM.b;
        alqyVar3.b |= 4;
        alqyVar3.e = i;
        alqy alqyVarP = akzxVarM.p();
        aooh.e(alqyVarP, "build(...)");
        ajyiVarI.be(apdiVar, alqyVarP);
        return ajyiVarI.ba();
    }

    public static /* synthetic */ java.lang.String f(aoqa aoqaVar, defpackage.mtq mtqVar) {
        return (java.lang.String) aoqaVar.a(mtqVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5021. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final java.lang.Object a(igf r11, defpackage.nje r12, aoln r13) throws aois {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzp.a(igf, nje, aoln):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.nje njeVar, aoln aolnVar) throws aois {
        defpackage.mzn mznVar;
        java.lang.Object objA;
        java.lang.Object objA2;
        if (aolnVar instanceof defpackage.mzn) {
            mznVar = (defpackage.mzn) aolnVar;
            int i = mznVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mznVar.c = i - Integer.MIN_VALUE;
            } else {
                mznVar = new defpackage.mzn(this, aolnVar);
            }
        } else {
            mznVar = new defpackage.mzn(this, aolnVar);
        }
        java.lang.Object objA3 = mznVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mznVar.c;
        if (i2 == 0) {
            aooc.af(objA3);
            j$.util.Optional optionalG = this.l.g();
            aooh.e(optionalG, "getFeature(...)");
            defpackage.irl irlVar = (defpackage.irl) aooh.q(optionalG);
            if (irlVar == null || njeVar != defpackage.nje.d) {
                mns mnsVar = this.a;
                mznVar.d = njeVar;
                mznVar.e = this;
                mznVar.c = 3;
                objA3 = mnsVar.a(mznVar);
                if (objA3 != aoluVar) {
                    mznVar.d = null;
                    mznVar.e = null;
                    mznVar.c = 4;
                    objA2 = this.a((igf) objA3, njeVar, mznVar);
                    if (objA2 != aoluVar) {
                        return objA2;
                    }
                }
            } else {
                mznVar.d = njeVar;
                mznVar.e = this;
                mznVar.c = 1;
                objA3 = irlVar.b.b(mznVar);
                if (objA3 != aoluVar) {
                    mznVar.d = null;
                    mznVar.e = null;
                    mznVar.c = 2;
                    objA = this.a((igf) objA3, njeVar, mznVar);
                    if (objA != aoluVar) {
                        return objA;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this = mznVar.e;
                        njeVar = mznVar.d;
                        aooc.af(objA3);
                        mznVar.d = null;
                        mznVar.e = null;
                        mznVar.c = 4;
                        objA2 = this.a((igf) objA3, njeVar, mznVar);
                        if (objA2 != aoluVar) {
                            return objA2;
                        }
                    } else if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                aooc.af(objA3);
                return objA3;
            }
            this = mznVar.e;
            njeVar = mznVar.d;
            aooc.af(objA3);
            mznVar.d = null;
            mznVar.e = null;
            mznVar.c = 2;
            objA = this.a((igf) objA3, njeVar, mznVar);
            if (objA != aoluVar) {
                return objA;
            }
        }
        return aoluVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:31:0x011d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:35:0x0125  */
    /* JADX WARN: Code duplicated, block: B:39:0x0163  */
    /* JADX WARN: Code duplicated, block: B:42:0x0169  */
    /* JADX WARN: Code duplicated, block: B:44:0x016c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0238  */
    /* JADX WARN: Code duplicated, block: B:49:0x0242  */
    /* JADX WARN: Code duplicated, block: B:50:0x0244  */
    /* JADX WARN: Code duplicated, block: B:52:0x0262  */
    /* JADX WARN: Code duplicated, block: B:55:0x02bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object c(alqk alqkVar, defpackage.nje njeVar, alyo alyoVar, aoln aolnVar) throws aois {
        defpackage.mzo mzoVar;
        zoe zoeVarD;
        defpackage.nje njeVar2;
        alyo alyoVar2;
        zoe zoeVar;
        java.lang.Object obj;
        zoe zoeVar2;
        alqk alqkVar2;
        zoe zoeVar3;
        zoe zoeVar4;
        alxj alxjVarAg;
        alxe alxeVarS;
        int i;
        zoe zoeVarE;
        alyo alyoVar3;
        java.lang.Object objC;
        alqk alqkVar3;
        zoe zoeVar5;
        zoe zoeVar6;
        alyo alyoVar4;
        int i2;
        defpackage.nof nofVarB;
        int i3;
        ajyi ajyiVarI;
        boolean z;
        alqk alqkVar4 = alqkVar;
        if (aolnVar instanceof defpackage.mzo) {
            mzoVar = (defpackage.mzo) aolnVar;
            int i4 = mzoVar.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mzoVar.h = i4 - Integer.MIN_VALUE;
            } else {
                mzoVar = new defpackage.mzo(this, aolnVar);
            }
        } else {
            mzoVar = new defpackage.mzo(this, aolnVar);
        }
        java.lang.Object objB = mzoVar.f;
        aolu aoluVar = aolu.a;
        int i5 = mzoVar.h;
        java.lang.String str = "value";
        if (i5 != 0) {
            if (i5 == 1) {
                zoe zoeVar7 = mzoVar.j;
                zoeVar2 = (zoe) mzoVar.d;
                zoe zoeVar8 = (zoe) mzoVar.c;
                alyoVar2 = (alyo) mzoVar.b;
                njeVar2 = (defpackage.nje) mzoVar.a;
                alqk alqkVar5 = mzoVar.i;
                aooc.af(objB);
                zoeVarD = zoeVar7;
                alqkVar4 = alqkVar5;
                zoeVar = zoeVar8;
                obj = objB;
            } else {
                if (i5 == 2) {
                    zoeVar3 = (zoe) mzoVar.d;
                    zoeVar4 = (zoe) mzoVar.c;
                    alyoVar2 = (alyo) mzoVar.b;
                    njeVar2 = (defpackage.nje) mzoVar.a;
                    alqkVar2 = mzoVar.i;
                    aooc.af(objB);
                    nofVarB = defpackage.nof.b(((nok) objB).j);
                    if (nofVarB == null) {
                        nofVarB = defpackage.nof.UNRECOGNIZED;
                    }
                    if (nofVarB == defpackage.nof.CONSENT_USER_OPTED_IN) {
                        i3 = 3;
                    } else {
                        i3 = 2;
                    }
                    akzx akzxVar = (akzx) zoeVar3.a;
                    akzxVar.u();
                    alxj alxjVar = akzxVar.b;
                    alxj alxjVar2 = alxj.a;
                    alxjVar.f = i3 - 1;
                    alxjVar.b |= 8;
                    zoeVar = zoeVar4;
                    alqkVar4 = alqkVar2;
                    alxjVarAg = zoeVar.ag();
                    apdi apdiVar = alwn.r;
                    aooh.e(apdiVar, "callAssistantConversationContext");
                    java.lang.Object objX = akmr.x(alqkVar4, apdiVar);
                    aooh.e(objX, "get(...)");
                    alxeVarS = defpackage.airh.s((defpackage.alwo) objX);
                    if (((java.lang.Boolean) this.d.a()).booleanValue() || njeVar2 != defpackage.nje.a) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    if (i != 0) {
                        zoeVarE = defpackage.airh.E(alxe.a.m());
                        java.lang.Object objA = this.g.a();
                        aooh.e(objA, "get(...)");
                        akzm akzmVarC = aldf.c(((java.lang.Number) objA).longValue());
                        aooh.e(akzmVarC, "fromMillis(...)");
                        zoeVarE.ak(akzmVarC);
                        java.lang.Object objA2 = this.h.a();
                        aooh.e(objA2, "get(...)");
                        akzm akzmVarC2 = aldf.c(((java.lang.Number) objA2).longValue());
                        aooh.e(akzmVarC2, "fromMillis(...)");
                        zoeVarE.aj(akzmVarC2);
                        java.lang.Object objA3 = this.i.a();
                        aooh.e(objA3, "get(...)");
                        zoeVarE.ai(((java.lang.Number) objA3).longValue());
                        akzx akzxVar2 = (akzx) zoeVarE.a;
                        akzxVar2.u();
                        alxe alxeVar = akzxVar2.b;
                        alxeVar.b |= 16;
                        alxeVar.g = true;
                        akzxVar2.u();
                        alxe alxeVar2 = akzxVar2.b;
                        alxeVar2.b |= 32;
                        alxeVar2.h = true;
                        java.lang.Object objA4 = this.e.a();
                        aooh.e(objA4, "get(...)");
                        boolean zBooleanValue = ((java.lang.Boolean) objA4).booleanValue();
                        akzxVar2.u();
                        alxe alxeVar3 = akzxVar2.b;
                        alxeVar3.b |= 64;
                        alxeVar3.i = zBooleanValue;
                        alyoVar3 = alyoVar2;
                        int iLongValue = (int) ((java.lang.Number) this.f.a()).longValue();
                        akzxVar2.u();
                        alxe alxeVar4 = akzxVar2.b;
                        alxeVar4.b |= 128;
                        alxeVar4.j = iLongValue;
                        defpackage.neu neuVar = this.b;
                        mzoVar.i = alqkVar4;
                        mzoVar.a = alyoVar3;
                        mzoVar.b = alxjVarAg;
                        mzoVar.c = zoeVarE;
                        mzoVar.d = zoeVarE;
                        mzoVar.j = null;
                        mzoVar.e = 1;
                        mzoVar.h = 3;
                        objC = neuVar.c(mzoVar);
                        if (objC == aoluVar) {
                            return aoluVar;
                        }
                        alqkVar3 = alqkVar4;
                        zoeVar5 = zoeVarE;
                        zoeVar6 = zoeVar5;
                        alyoVar4 = alyoVar3;
                        objB = objC;
                        i2 = i;
                    } else {
                        str = "value";
                    }
                    vqu vquVarH = ahus.H(alqkVar4.p());
                    apdi apdiVar2 = alwn.r;
                    aooh.e(apdiVar2, "callAssistantConversationContext");
                    aooh.e(apdiVar2, "callAssistantConversationContext");
                    java.lang.Object objX2 = akmr.x(alqkVar4, apdiVar2);
                    aooh.e(objX2, "get(...)");
                    ajyiVarI = defpackage.airh.I(((alwn) objX2).p());
                    aooh.f(alyoVar2, str);
                    akzx akzxVar3 = (akzx) ajyiVarI.a;
                    akzxVar3.u();
                    alwn alwnVar = akzxVar3.b;
                    alwnVar.c = alyoVar2.j;
                    alwnVar.b |= 2;
                    ajyiVarI.aW();
                    ajyiVarI.aV(alxjVarAg);
                    akzxVar3.u();
                    alwn alwnVar2 = akzxVar3.b;
                    alwnVar2.j = 1;
                    alwnVar2.b |= 512;
                    if (i != 0 && alxeVarS != null) {
                        ajyiVarI.aT(alxeVarS);
                    }
                    vquVarH.aY(apdiVar2, ajyiVarI.aS());
                    return vquVarH.aQ();
                }
                if (i5 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = mzoVar.e;
                zoeVar5 = (zoe) mzoVar.d;
                zoeVar6 = (zoe) mzoVar.c;
                alxjVarAg = (alxj) mzoVar.b;
                alyoVar4 = (alyo) mzoVar.a;
                alqkVar3 = mzoVar.i;
                aooc.af(objB);
            }
            if (objB == defpackage.nev.TYPE_ASK_IF_URGENT) {
                z = true;
            } else {
                z = false;
            }
            akzx akzxVar4 = (akzx) zoeVar5.a;
            akzxVar4.u();
            alxe alxeVar5 = akzxVar4.b;
            alxe alxeVar6 = alxe.a;
            alxeVar5.b |= 256;
            alxeVar5.k = z;
            alxeVarS = zoeVar6.ah();
            i = i2;
            alqkVar4 = alqkVar3;
            alyoVar2 = alyoVar4;
            vqu vquVarH2 = ahus.H(alqkVar4.p());
            apdi apdiVar3 = alwn.r;
            aooh.e(apdiVar3, "callAssistantConversationContext");
            aooh.e(apdiVar3, "callAssistantConversationContext");
            java.lang.Object objX3 = akmr.x(alqkVar4, apdiVar3);
            aooh.e(objX3, "get(...)");
            ajyiVarI = defpackage.airh.I(((alwn) objX3).p());
            aooh.f(alyoVar2, str);
            akzx akzxVar5 = (akzx) ajyiVarI.a;
            akzxVar5.u();
            alwn alwnVar3 = akzxVar5.b;
            alwnVar3.c = alyoVar2.j;
            alwnVar3.b |= 2;
            ajyiVarI.aW();
            ajyiVarI.aV(alxjVarAg);
            akzxVar5.u();
            alwn alwnVar4 = akzxVar5.b;
            alwnVar4.j = 1;
            alwnVar4.b |= 512;
            if (i != 0) {
                ajyiVarI.aT(alxeVarS);
            }
            vquVarH2.aY(apdiVar3, ajyiVarI.aS());
            return vquVarH2.aQ();
        }
        aooc.af(objB);
        apdi apdiVar4 = alwn.r;
        aooh.e(apdiVar4, "callAssistantConversationContext");
        alxj alxjVar3 = ((alwn) akmr.x(alqkVar4, apdiVar4)).e;
        if (alxjVar3 == null) {
            alxjVar3 = alxj.a;
        }
        aooh.e(alxjVar3, "getSmartReplyContext(...)");
        zoeVarD = defpackage.airh.D(alxjVar3.p());
        defpackage.neu neuVar2 = this.b;
        mzoVar.i = alqkVar4;
        mzoVar.a = njeVar;
        mzoVar.b = alyoVar;
        mzoVar.c = zoeVarD;
        mzoVar.d = zoeVarD;
        mzoVar.j = zoeVarD;
        mzoVar.h = 1;
        java.lang.Object objE = neuVar2.e(mzoVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        njeVar2 = njeVar;
        alyoVar2 = alyoVar;
        zoeVar = zoeVarD;
        obj = objE;
        zoeVar2 = zoeVar;
        alxi alxiVar = (alxi) obj;
        aooh.f(alxiVar, "value");
        akzx akzxVar6 = (akzx) zoeVarD.a;
        akzxVar6.u();
        alxj alxjVar4 = akzxVar6.b;
        alxj alxjVar5 = alxj.a;
        alxjVar4.d = alxiVar.d;
        alxjVar4.b |= 2;
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            nnx nnxVar = this.k;
            mzoVar.i = alqkVar4;
            mzoVar.a = njeVar2;
            mzoVar.b = alyoVar2;
            mzoVar.c = zoeVar;
            mzoVar.d = zoeVar2;
            mzoVar.j = null;
            mzoVar.h = 2;
            objB = nnxVar.b(mzoVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            alqkVar2 = alqkVar4;
            zoeVar3 = zoeVar2;
            zoeVar4 = zoeVar;
            nofVarB = defpackage.nof.b(((nok) objB).j);
            if (nofVarB == null) {
                nofVarB = defpackage.nof.UNRECOGNIZED;
            }
            if (nofVarB == defpackage.nof.CONSENT_USER_OPTED_IN) {
                i3 = 3;
            } else {
                i3 = 2;
            }
            akzx akzxVar7 = (akzx) zoeVar3.a;
            akzxVar7.u();
            alxj alxjVar6 = akzxVar7.b;
            alxj alxjVar7 = alxj.a;
            alxjVar6.f = i3 - 1;
            alxjVar6.b |= 8;
            zoeVar = zoeVar4;
            alqkVar4 = alqkVar2;
            alxjVarAg = zoeVar.ag();
            apdi apdiVar5 = alwn.r;
            aooh.e(apdiVar5, "callAssistantConversationContext");
            java.lang.Object objX4 = akmr.x(alqkVar4, apdiVar5);
            aooh.e(objX4, "get(...)");
            alxeVarS = defpackage.airh.s((defpackage.alwo) objX4);
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                i = 0;
            } else {
                i = 0;
            }
            if (i != 0) {
                zoeVarE = defpackage.airh.E(alxe.a.m());
                java.lang.Object objA5 = this.g.a();
                aooh.e(objA5, "get(...)");
                akzm akzmVarC3 = aldf.c(((java.lang.Number) objA5).longValue());
                aooh.e(akzmVarC3, "fromMillis(...)");
                zoeVarE.ak(akzmVarC3);
                java.lang.Object objA6 = this.h.a();
                aooh.e(objA6, "get(...)");
                akzm akzmVarC4 = aldf.c(((java.lang.Number) objA6).longValue());
                aooh.e(akzmVarC4, "fromMillis(...)");
                zoeVarE.aj(akzmVarC4);
                java.lang.Object objA7 = this.i.a();
                aooh.e(objA7, "get(...)");
                zoeVarE.ai(((java.lang.Number) objA7).longValue());
                akzx akzxVar8 = (akzx) zoeVarE.a;
                akzxVar8.u();
                alxe alxeVar7 = akzxVar8.b;
                alxeVar7.b |= 16;
                alxeVar7.g = true;
                akzxVar8.u();
                alxe alxeVar8 = akzxVar8.b;
                alxeVar8.b |= 32;
                alxeVar8.h = true;
                java.lang.Object objA8 = this.e.a();
                aooh.e(objA8, "get(...)");
                boolean zBooleanValue2 = ((java.lang.Boolean) objA8).booleanValue();
                akzxVar8.u();
                alxe alxeVar9 = akzxVar8.b;
                alxeVar9.b |= 64;
                alxeVar9.i = zBooleanValue2;
                alyoVar3 = alyoVar2;
                int iLongValue2 = (int) ((java.lang.Number) this.f.a()).longValue();
                akzxVar8.u();
                alxe alxeVar10 = akzxVar8.b;
                alxeVar10.b |= 128;
                alxeVar10.j = iLongValue2;
                defpackage.neu neuVar3 = this.b;
                mzoVar.i = alqkVar4;
                mzoVar.a = alyoVar3;
                mzoVar.b = alxjVarAg;
                mzoVar.c = zoeVarE;
                mzoVar.d = zoeVarE;
                mzoVar.j = null;
                mzoVar.e = 1;
                mzoVar.h = 3;
                objC = neuVar3.c(mzoVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                alqkVar3 = alqkVar4;
                zoeVar5 = zoeVarE;
                zoeVar6 = zoeVar5;
                alyoVar4 = alyoVar3;
                objB = objC;
                i2 = i;
                if (objB == defpackage.nev.TYPE_ASK_IF_URGENT) {
                    z = true;
                } else {
                    z = false;
                }
                akzx akzxVar9 = (akzx) zoeVar5.a;
                akzxVar9.u();
                alxe alxeVar11 = akzxVar9.b;
                alxe alxeVar12 = alxe.a;
                alxeVar11.b |= 256;
                alxeVar11.k = z;
                alxeVarS = zoeVar6.ah();
                i = i2;
                alqkVar4 = alqkVar3;
                alyoVar2 = alyoVar4;
            } else {
                str = "value";
            }
        } else {
            alxjVarAg = zoeVar.ag();
            apdi apdiVar6 = alwn.r;
            aooh.e(apdiVar6, "callAssistantConversationContext");
            java.lang.Object objX5 = akmr.x(alqkVar4, apdiVar6);
            aooh.e(objX5, "get(...)");
            alxeVarS = defpackage.airh.s((defpackage.alwo) objX5);
            if (((java.lang.Boolean) this.d.a()).booleanValue()) {
                i = 0;
            } else {
                i = 0;
            }
            if (i != 0) {
                zoeVarE = defpackage.airh.E(alxe.a.m());
                java.lang.Object objA9 = this.g.a();
                aooh.e(objA9, "get(...)");
                akzm akzmVarC5 = aldf.c(((java.lang.Number) objA9).longValue());
                aooh.e(akzmVarC5, "fromMillis(...)");
                zoeVarE.ak(akzmVarC5);
                java.lang.Object objA10 = this.h.a();
                aooh.e(objA10, "get(...)");
                akzm akzmVarC6 = aldf.c(((java.lang.Number) objA10).longValue());
                aooh.e(akzmVarC6, "fromMillis(...)");
                zoeVarE.aj(akzmVarC6);
                java.lang.Object objA11 = this.i.a();
                aooh.e(objA11, "get(...)");
                zoeVarE.ai(((java.lang.Number) objA11).longValue());
                akzx akzxVar10 = (akzx) zoeVarE.a;
                akzxVar10.u();
                alxe alxeVar13 = akzxVar10.b;
                alxeVar13.b |= 16;
                alxeVar13.g = true;
                akzxVar10.u();
                alxe alxeVar14 = akzxVar10.b;
                alxeVar14.b |= 32;
                alxeVar14.h = true;
                java.lang.Object objA12 = this.e.a();
                aooh.e(objA12, "get(...)");
                boolean zBooleanValue3 = ((java.lang.Boolean) objA12).booleanValue();
                akzxVar10.u();
                alxe alxeVar15 = akzxVar10.b;
                alxeVar15.b |= 64;
                alxeVar15.i = zBooleanValue3;
                alyoVar3 = alyoVar2;
                int iLongValue3 = (int) ((java.lang.Number) this.f.a()).longValue();
                akzxVar10.u();
                alxe alxeVar16 = akzxVar10.b;
                alxeVar16.b |= 128;
                alxeVar16.j = iLongValue3;
                defpackage.neu neuVar4 = this.b;
                mzoVar.i = alqkVar4;
                mzoVar.a = alyoVar3;
                mzoVar.b = alxjVarAg;
                mzoVar.c = zoeVarE;
                mzoVar.d = zoeVarE;
                mzoVar.j = null;
                mzoVar.e = 1;
                mzoVar.h = 3;
                objC = neuVar4.c(mzoVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                alqkVar3 = alqkVar4;
                zoeVar5 = zoeVarE;
                zoeVar6 = zoeVar5;
                alyoVar4 = alyoVar3;
                objB = objC;
                i2 = i;
                if (objB == defpackage.nev.TYPE_ASK_IF_URGENT) {
                    z = true;
                } else {
                    z = false;
                }
                akzx akzxVar11 = (akzx) zoeVar5.a;
                akzxVar11.u();
                alxe alxeVar17 = akzxVar11.b;
                alxe alxeVar18 = alxe.a;
                alxeVar17.b |= 256;
                alxeVar17.k = z;
                alxeVarS = zoeVar6.ah();
                i = i2;
                alqkVar4 = alqkVar3;
                alyoVar2 = alyoVar4;
            } else {
                str = "value";
            }
        }
        vqu vquVarH3 = ahus.H(alqkVar4.p());
        apdi apdiVar7 = alwn.r;
        aooh.e(apdiVar7, "callAssistantConversationContext");
        aooh.e(apdiVar7, "callAssistantConversationContext");
        java.lang.Object objX6 = akmr.x(alqkVar4, apdiVar7);
        aooh.e(objX6, "get(...)");
        ajyiVarI = defpackage.airh.I(((alwn) objX6).p());
        aooh.f(alyoVar2, str);
        akzx akzxVar12 = (akzx) ajyiVarI.a;
        akzxVar12.u();
        alwn alwnVar5 = akzxVar12.b;
        alwnVar5.c = alyoVar2.j;
        alwnVar5.b |= 2;
        ajyiVarI.aW();
        ajyiVarI.aV(alxjVarAg);
        akzxVar12.u();
        alwn alwnVar6 = akzxVar12.b;
        alwnVar6.j = 1;
        alwnVar6.b |= 512;
        if (i != 0) {
            ajyiVarI.aT(alxeVarS);
        }
        vquVarH3.aY(apdiVar7, ajyiVarI.aS());
        return vquVarH3.aQ();
    }
}
