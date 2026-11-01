package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nbo extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    final /* synthetic */ defpackage.nbr f;
    final /* synthetic */ alro g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbo(defpackage.nbr nbrVar, alro alroVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = nbrVar;
        this.g = alroVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0113  */
    /* JADX WARN: Code duplicated, block: B:43:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:54:0x015b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aimw] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object obj2;
        java.lang.Object obj3;
        ?? BooleanValue;
        defpackage.nbr nbrVar;
        defpackage.nvp nvpVarD;
        ?? r0;
        defpackage.mqt mqtVar;
        ?? r8;
        defpackage.nbr nbrVar2;
        alro alroVar;
        apdi apdiVar;
        apdi apdiVar2;
        apdi apdiVar3;
        apdi apdiVar4;
        apdi apdiVar5;
        apdi apdiVar6;
        apdi apdiVar7;
        akzs akzsVar;
        alac alacVar;
        java.lang.Object objJ;
        alsp alspVarB;
        int iOrdinal;
        aolu aoluVar = aolu.a;
        int i = this.e;
        defpackage.mtq mtqVar = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    aooc.af(obj);
                } else if (i != 2) {
                    int i2 = this.d;
                    aooc.af(obj);
                    r0 = i2;
                } else {
                    obj3 = this.c;
                    obj2 = this.b;
                    java.lang.Object obj4 = this.a;
                    aooc.af(obj);
                    r8 = obj4;
                    r8.I((java.lang.String) obj2, obj3, new aepg((aenj) obj));
                    BooleanValue = 0;
                    nbrVar = this.f;
                    nvpVarD = defpackage.nbr.d(this.g);
                    if (nvpVarD != null) {
                        mqtVar = nbrVar.c;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = BooleanValue;
                        this.e = 3;
                        if (mqtVar.x(nvpVarD, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    r0 = BooleanValue;
                }
                nbrVar2 = this.f;
                alroVar = this.g;
                apdiVar = alqy.f;
                alroVar.c(apdiVar);
                if (((alaa) alroVar).n.l((alac) apdiVar.a)) {
                    mtqVar = defpackage.mtq.EVT_ACK_BOT_SPEECH_STARTED;
                } else {
                    apdiVar2 = alqx.d;
                    alroVar.c(apdiVar2);
                    if (((alaa) alroVar).n.l((alac) apdiVar2.a)) {
                        mtqVar = defpackage.mtq.EVT_ACK_BOT_SPEECH_ENDED;
                    } else {
                        apdiVar3 = altd.d;
                        alroVar.c(apdiVar3);
                        if (((alaa) alroVar).n.l((alac) apdiVar3.a)) {
                            mtqVar = defpackage.mtq.EVT_ACK_SUGGESTED_REPLY_SELECTED;
                        } else {
                            apdiVar4 = alsd.b;
                            alroVar.c(apdiVar4);
                            if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
                                mtqVar = defpackage.mtq.EVT_ACK_MANUAL_END_CALL;
                            } else {
                                apdiVar5 = alsc.b;
                                alroVar.c(apdiVar5);
                                if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
                                    mtqVar = defpackage.mtq.EVT_ACK_MANUAL_ANSWER_CALL;
                                } else {
                                    apdiVar6 = alsr.b;
                                    alroVar.c(apdiVar6);
                                    if (((alaa) alroVar).n.l((alac) apdiVar6.a)) {
                                        mtqVar = defpackage.mtq.EVT_ACK_RINGING_STARTED;
                                    } else {
                                        apdiVar7 = alsq.d;
                                        alroVar.c(apdiVar7);
                                        akzsVar = ((alaa) alroVar).n;
                                        alacVar = (alac) apdiVar7.a;
                                        if (akzsVar.l(alacVar)) {
                                            alroVar.c(apdiVar7);
                                            objJ = ((alaa) alroVar).n.j(alacVar);
                                            if (objJ == null) {
                                                objJ = apdiVar7.b;
                                            } else {
                                                apdiVar7.c(objJ);
                                            }
                                            aooh.e(objJ, "getExtension(...)");
                                            alspVarB = alsp.b(((alsq) objJ).c);
                                            if (alspVarB == null) {
                                                alspVarB = alsp.a;
                                            }
                                            iOrdinal = alspVarB.ordinal();
                                            if (iOrdinal == 0) {
                                                mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_ANSWERED;
                                            } else if (iOrdinal != 1) {
                                                mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_NOT_REACHED;
                                            } else if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    throw new aois();
                                                }
                                                mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_ANSWERED;
                                            } else {
                                                mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_DECLINED;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (mtqVar != null) {
                    defpackage.mfz mfzVar = nbrVar2.d;
                    gus.aw(mtqVar.name());
                    mfzVar.c();
                }
                return java.lang.Boolean.valueOf(1 == r0);
            }
            aooc.af(obj);
            defpackage.ihi ihiVar = this.f.b;
            ifv ifvVar = ifv.b;
            alro alroVar2 = this.g;
            this.e = 1;
            obj = ihiVar.c(ifvVar, alroVar2, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            BooleanValue = ((java.lang.Boolean) obj).booleanValue();
        } catch (java.lang.Exception e) {
            aimw aimwVarL = defpackage.nbr.a.c().k(e).l("com/android/dialer/dobby/impl/service/DobbyDuplexRelay", "relay$<anonymous>", 67, "DobbyDuplexRelay.kt");
            defpackage.nbr nbrVar3 = this.f;
            defpackage.nvp nvpVarD2 = defpackage.nbr.d(this.g);
            if (nvpVarD2 == null) {
                nvpVarD2 = defpackage.nvp.EVENT_UNKNOWN;
            }
            aepg aepgVar = new aepg(nvpVarD2);
            defpackage.mqt mqtVar2 = nbrVar3.c;
            this.a = aimwVarL;
            this.b = "DobbyDuplexRelay failed to relay inboundEvent:%s, events:%s";
            this.c = aepgVar;
            this.e = 2;
            obj = mqtVar2.a(this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = "DobbyDuplexRelay failed to relay inboundEvent:%s, events:%s";
            obj3 = aepgVar;
            r8 = aimwVarL;
        }
        nbrVar = this.f;
        nvpVarD = defpackage.nbr.d(this.g);
        if (nvpVarD != null) {
            mqtVar = nbrVar.c;
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = BooleanValue;
            this.e = 3;
            if (mqtVar.x(nvpVarD, this) == aoluVar) {
                return aoluVar;
            }
        }
        r0 = BooleanValue;
        nbrVar2 = this.f;
        alroVar = this.g;
        apdiVar = alqy.f;
        alroVar.c(apdiVar);
        if (((alaa) alroVar).n.l((alac) apdiVar.a)) {
            mtqVar = defpackage.mtq.EVT_ACK_BOT_SPEECH_STARTED;
        } else {
            apdiVar2 = alqx.d;
            alroVar.c(apdiVar2);
            if (((alaa) alroVar).n.l((alac) apdiVar2.a)) {
                mtqVar = defpackage.mtq.EVT_ACK_BOT_SPEECH_ENDED;
            } else {
                apdiVar3 = altd.d;
                alroVar.c(apdiVar3);
                if (((alaa) alroVar).n.l((alac) apdiVar3.a)) {
                    mtqVar = defpackage.mtq.EVT_ACK_SUGGESTED_REPLY_SELECTED;
                } else {
                    apdiVar4 = alsd.b;
                    alroVar.c(apdiVar4);
                    if (((alaa) alroVar).n.l((alac) apdiVar4.a)) {
                        mtqVar = defpackage.mtq.EVT_ACK_MANUAL_END_CALL;
                    } else {
                        apdiVar5 = alsc.b;
                        alroVar.c(apdiVar5);
                        if (((alaa) alroVar).n.l((alac) apdiVar5.a)) {
                            mtqVar = defpackage.mtq.EVT_ACK_MANUAL_ANSWER_CALL;
                        } else {
                            apdiVar6 = alsr.b;
                            alroVar.c(apdiVar6);
                            if (((alaa) alroVar).n.l((alac) apdiVar6.a)) {
                                mtqVar = defpackage.mtq.EVT_ACK_RINGING_STARTED;
                            } else {
                                apdiVar7 = alsq.d;
                                alroVar.c(apdiVar7);
                                akzsVar = ((alaa) alroVar).n;
                                alacVar = (alac) apdiVar7.a;
                                if (akzsVar.l(alacVar)) {
                                    alroVar.c(apdiVar7);
                                    objJ = ((alaa) alroVar).n.j(alacVar);
                                    if (objJ == null) {
                                        objJ = apdiVar7.b;
                                    } else {
                                        apdiVar7.c(objJ);
                                    }
                                    aooh.e(objJ, "getExtension(...)");
                                    alspVarB = alsp.b(((alsq) objJ).c);
                                    if (alspVarB == null) {
                                        alspVarB = alsp.a;
                                    }
                                    iOrdinal = alspVarB.ordinal();
                                    if (iOrdinal == 0) {
                                        mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_ANSWERED;
                                    } else if (iOrdinal != 1) {
                                        mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_NOT_REACHED;
                                    } else if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            throw new aois();
                                        }
                                        mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_ANSWERED;
                                    } else {
                                        mtqVar = defpackage.mtq.EVT_ACK_RINGING_ENDED_USER_DECLINED;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (mtqVar != null) {
            defpackage.mfz mfzVar2 = nbrVar2.d;
            gus.aw(mtqVar.name());
            mfzVar2.c();
        }
        return java.lang.Boolean.valueOf(1 == r0);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nbo(this.f, this.g, aolnVar);
    }
}
