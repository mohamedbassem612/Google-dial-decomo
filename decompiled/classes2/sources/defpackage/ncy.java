package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ncy extends aomh implements aonj {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.nej d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncy(defpackage.nej nejVar, aoln aolnVar) {
        super(1, aolnVar);
        this.d = nejVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.ncy(this.d, (aoln) obj).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0156  */
    /* JADX WARN: Code duplicated, block: B:70:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0212  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        defpackage.nej nejVar;
        defpackage.lnl lnlVar;
        int iAb;
        int iAb2;
        defpackage.lnk lnkVar;
        defpackage.lnn lnnVarB;
        defpackage.lnn lnnVarB2;
        defpackage.nje njeVar;
        int iOrdinal;
        defpackage.mqt mqtVar;
        defpackage.nvp nvpVar;
        defpackage.mqt mqtVar2;
        defpackage.nvp nvpVar2;
        defpackage.mqt mqtVar3;
        defpackage.nvp nvpVar3;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        defpackage.nej nejVar2;
        defpackage.nmo nmoVar;
        defpackage.nmo nmoVar2;
        defpackage.nej nejVar3;
        defpackage.nmo nmoVar3;
        aolu aoluVar = aolu.a;
        switch (this.c) {
            case 0:
                aooc.af(obj);
                defpackage.nej nejVar4 = this.d;
                bpj bpjVar = new bpj(nejVar4, (aoln) null, 18);
                this.c = 1;
                if (aoov.aj(nejVar4.d, bpjVar, this) == aoluVar) {
                    return aoluVar;
                }
                nejVar = this.d;
                lnlVar = (defpackage.lnl) aooh.q(nejVar.h);
                if (lnlVar != null) {
                    defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "shouldAutoScreen", 2176, "DobbyLifecycleController.kt").v("shouldAutoScreen(): No IncomingCallScreeningResult available (voter skipped, passed, or timed out)");
                } else {
                    iAb = a.ab(lnlVar.c);
                    if (iAb == 0 && iAb == 4) {
                        defpackage.lnk lnkVar2 = lnlVar.d;
                        if (lnkVar2 == null) {
                            lnkVar2 = defpackage.lnk.a;
                        }
                        if (lnkVar2.b == 1) {
                            lnnVarB2 = defpackage.lnn.b(((java.lang.Integer) lnkVar2.c).intValue());
                            if (lnnVarB2 == null) {
                                lnnVarB2 = defpackage.lnn.UNRECOGNIZED;
                            }
                        } else {
                            lnnVarB2 = defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED;
                        }
                        if (lnnVarB2 != defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_DOBBY) {
                            defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "shouldAutoScreen", 2195, "DobbyLifecycleController.kt").y("Call was silenced for %s", lnnVarB2.name());
                        } else {
                            njeVar = defpackage.nje.b;
                        }
                        iOrdinal = njeVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                if (iOrdinal != 2 && iOrdinal != 3) {
                                    if (iOrdinal == 4) {
                                        throw new aois();
                                    }
                                    mqtVar3 = nejVar.j;
                                    nvpVar3 = defpackage.nvp.EVENT_DOBBY_USE_GEMINI_RUNNER_SELECTED;
                                    this.a = njeVar;
                                    this.c = 4;
                                    if (mqtVar3.x(nvpVar3, this) == aoluVar) {
                                        obj2 = njeVar;
                                        return aoluVar;
                                    }
                                }
                            } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                                mqtVar2 = nejVar.j;
                                nvpVar2 = defpackage.nvp.EVENT_DOBBY_USE_GACS_SELECTED;
                                this.a = njeVar;
                                this.c = 2;
                                if (mqtVar2.x(nvpVar2, this) == aoluVar) {
                                    obj2 = njeVar;
                                    obj2 = njeVar;
                                    obj2 = njeVar;
                                    obj2 = njeVar;
                                    return aoluVar;
                                }
                            }
                        } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                            mqtVar = nejVar.j;
                            nvpVar = defpackage.nvp.EVENT_DOBBY_USE_GACS_MANUAL_SCREENING_SELECTED;
                            this.a = njeVar;
                            this.c = 3;
                            if (mqtVar.x(nvpVar, this) == aoluVar) {
                                obj2 = njeVar;
                                obj2 = njeVar;
                                return aoluVar;
                            }
                        }
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        obj2 = njeVar;
                        java.lang.Object obj5 = obj2;
                        aimw aimwVarL = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 369, "DobbyLifecycleController.kt");
                        defpackage.nej nejVar5 = this.d;
                        aimwVarL.I("Selected DobbyUseCase: %s for callId: %s", obj5, nejVar5.c);
                        this.a = obj5;
                        this.b = nejVar5;
                        this.c = 5;
                        obj = nejVar5.t.a((defpackage.nje) obj5, this);
                        obj4 = nejVar5;
                        obj3 = obj5;
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        ((defpackage.nej) obj4).I = (defpackage.nfc) obj;
                        nejVar2 = this.d;
                        if (nejVar2.I.c) {
                            defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 398, "DobbyLifecycleController.kt").y("session.canStart() failed for use case %s. Transitioning lifecycle state to NOT_A_DOBBY_CALL", obj3);
                            nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                            this.a = null;
                            this.b = null;
                            this.c = 9;
                            if (nejVar2.O(nmoVar, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else if (obj3 == defpackage.nje.b) {
                            pci pciVar = nejVar2.Y;
                            this.a = null;
                            this.b = null;
                            this.c = 6;
                            obj = defpackage.nej.aa(pciVar, this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                                return aojh.a;
                            }
                            nejVar3 = this.d;
                            nejVar3.n.b(mce.cP);
                            nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                            this.c = 7;
                            if (nejVar3.O(nmoVar3, this) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVar2.n.b(mce.cQ);
                            nmoVar2 = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
                            this.a = null;
                            this.b = null;
                            this.c = 8;
                            if (nejVar2.O(nmoVar2, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        return aojh.a;
                    }
                    aimw aimwVarL2 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "shouldAutoScreen", 2185, "DobbyLifecycleController.kt");
                    iAb2 = a.ab(lnlVar.c);
                    if (iAb2 == 0) {
                        iAb2 = 1;
                    }
                    lnkVar = lnlVar.d;
                    if (lnkVar == null) {
                        lnkVar = defpackage.lnk.a;
                    }
                    if (lnkVar.b == 1) {
                        lnnVarB = defpackage.lnn.b(((java.lang.Integer) lnkVar.c).intValue());
                        if (lnnVarB == null) {
                            lnnVarB = defpackage.lnn.UNRECOGNIZED;
                        }
                    } else {
                        lnnVarB = defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED;
                    }
                    aimwVarL2.I("shouldAutoScreen(): Call was not silenced for audio processing. Actual response: %s, featureCause: %s", mni.cF(iAb2), lnnVarB.name());
                }
                njeVar = (((java.lang.Boolean) nejVar.A.a()).booleanValue() && ((java.lang.Boolean) nejVar.z.a()).booleanValue()) ? defpackage.nje.e : defpackage.nje.a;
                iOrdinal = njeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 4) {
                                throw new aois();
                            }
                            mqtVar3 = nejVar.j;
                            nvpVar3 = defpackage.nvp.EVENT_DOBBY_USE_GEMINI_RUNNER_SELECTED;
                            this.a = njeVar;
                            this.c = 4;
                            if (mqtVar3.x(nvpVar3, this) == aoluVar) {
                                obj2 = njeVar;
                                return aoluVar;
                            }
                        }
                    } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                        mqtVar2 = nejVar.j;
                        nvpVar2 = defpackage.nvp.EVENT_DOBBY_USE_GACS_SELECTED;
                        this.a = njeVar;
                        this.c = 2;
                        if (mqtVar2.x(nvpVar2, this) == aoluVar) {
                            obj2 = njeVar;
                            obj2 = njeVar;
                            obj2 = njeVar;
                            obj2 = njeVar;
                            return aoluVar;
                        }
                    }
                } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                    mqtVar = nejVar.j;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_USE_GACS_MANUAL_SCREENING_SELECTED;
                    this.a = njeVar;
                    this.c = 3;
                    if (mqtVar.x(nvpVar, this) == aoluVar) {
                        obj2 = njeVar;
                        obj2 = njeVar;
                        return aoluVar;
                    }
                }
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                java.lang.Object obj6 = obj2;
                aimw aimwVarL3 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 369, "DobbyLifecycleController.kt");
                defpackage.nej nejVar6 = this.d;
                aimwVarL3.I("Selected DobbyUseCase: %s for callId: %s", obj6, nejVar6.c);
                this.a = obj6;
                this.b = nejVar6;
                this.c = 5;
                obj = nejVar6.t.a((defpackage.nje) obj6, this);
                obj4 = nejVar6;
                obj3 = obj6;
                if (obj == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.nej) obj4).I = (defpackage.nfc) obj;
                nejVar2 = this.d;
                if (nejVar2.I.c) {
                    defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 398, "DobbyLifecycleController.kt").y("session.canStart() failed for use case %s. Transitioning lifecycle state to NOT_A_DOBBY_CALL", obj3);
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = 9;
                    if (nejVar2.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (obj3 == defpackage.nje.b) {
                    pci pciVar2 = nejVar2.Y;
                    this.a = null;
                    this.b = null;
                    this.c = 6;
                    obj = defpackage.nej.aa(pciVar2, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                        return aojh.a;
                    }
                    nejVar3 = this.d;
                    nejVar3.n.b(mce.cP);
                    nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                    this.c = 7;
                    if (nejVar3.O(nmoVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nejVar2.n.b(mce.cQ);
                    nmoVar2 = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
                    this.a = null;
                    this.b = null;
                    this.c = 8;
                    if (nejVar2.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                nejVar = this.d;
                lnlVar = (defpackage.lnl) aooh.q(nejVar.h);
                if (lnlVar != null) {
                    iAb = a.ab(lnlVar.c);
                    if (iAb == 0) {
                        aimw aimwVarL4 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "shouldAutoScreen", 2185, "DobbyLifecycleController.kt");
                        iAb2 = a.ab(lnlVar.c);
                        if (iAb2 == 0) {
                            iAb2 = 1;
                        }
                        lnkVar = lnlVar.d;
                        if (lnkVar == null) {
                            lnkVar = defpackage.lnk.a;
                        }
                        if (lnkVar.b == 1) {
                            lnnVarB = defpackage.lnn.b(((java.lang.Integer) lnkVar.c).intValue());
                            if (lnnVarB == null) {
                                lnnVarB = defpackage.lnn.UNRECOGNIZED;
                            }
                        } else {
                            lnnVarB = defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED;
                        }
                        aimwVarL4.I("shouldAutoScreen(): Call was not silenced for audio processing. Actual response: %s, featureCause: %s", mni.cF(iAb2), lnnVarB.name());
                    } else {
                        aimw aimwVarL5 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "shouldAutoScreen", 2185, "DobbyLifecycleController.kt");
                        iAb2 = a.ab(lnlVar.c);
                        if (iAb2 == 0) {
                            iAb2 = 1;
                        }
                        lnkVar = lnlVar.d;
                        if (lnkVar == null) {
                            lnkVar = defpackage.lnk.a;
                        }
                        if (lnkVar.b == 1) {
                            lnnVarB = defpackage.lnn.b(((java.lang.Integer) lnkVar.c).intValue());
                            if (lnnVarB == null) {
                                lnnVarB = defpackage.lnn.UNRECOGNIZED;
                            }
                        } else {
                            lnnVarB = defpackage.lnn.AUDIO_BASED_SCREENING_FEATURE_KEY_UNSPECIFIED;
                        }
                        aimwVarL5.I("shouldAutoScreen(): Call was not silenced for audio processing. Actual response: %s, featureCause: %s", mni.cF(iAb2), lnnVarB.name());
                    }
                    iOrdinal = njeVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal == 4) {
                                    throw new aois();
                                }
                                mqtVar3 = nejVar.j;
                                nvpVar3 = defpackage.nvp.EVENT_DOBBY_USE_GEMINI_RUNNER_SELECTED;
                                this.a = njeVar;
                                this.c = 4;
                                if (mqtVar3.x(nvpVar3, this) == aoluVar) {
                                    obj2 = njeVar;
                                    return aoluVar;
                                }
                            }
                        } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                            mqtVar2 = nejVar.j;
                            nvpVar2 = defpackage.nvp.EVENT_DOBBY_USE_GACS_SELECTED;
                            this.a = njeVar;
                            this.c = 2;
                            if (mqtVar2.x(nvpVar2, this) == aoluVar) {
                                obj2 = njeVar;
                                obj2 = njeVar;
                                obj2 = njeVar;
                                obj2 = njeVar;
                                return aoluVar;
                            }
                        }
                    } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                        mqtVar = nejVar.j;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_USE_GACS_MANUAL_SCREENING_SELECTED;
                        this.a = njeVar;
                        this.c = 3;
                        if (mqtVar.x(nvpVar, this) == aoluVar) {
                            obj2 = njeVar;
                            obj2 = njeVar;
                            return aoluVar;
                        }
                    }
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    obj2 = njeVar;
                    java.lang.Object obj7 = obj2;
                    aimw aimwVarL6 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 369, "DobbyLifecycleController.kt");
                    defpackage.nej nejVar7 = this.d;
                    aimwVarL6.I("Selected DobbyUseCase: %s for callId: %s", obj7, nejVar7.c);
                    this.a = obj7;
                    this.b = nejVar7;
                    this.c = 5;
                    obj = nejVar7.t.a((defpackage.nje) obj7, this);
                    obj4 = nejVar7;
                    obj3 = obj7;
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    ((defpackage.nej) obj4).I = (defpackage.nfc) obj;
                    nejVar2 = this.d;
                    if (nejVar2.I.c) {
                        defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 398, "DobbyLifecycleController.kt").y("session.canStart() failed for use case %s. Transitioning lifecycle state to NOT_A_DOBBY_CALL", obj3);
                        nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                        this.a = null;
                        this.b = null;
                        this.c = 9;
                        if (nejVar2.O(nmoVar, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (obj3 == defpackage.nje.b) {
                        pci pciVar3 = nejVar2.Y;
                        this.a = null;
                        this.b = null;
                        this.c = 6;
                        obj = defpackage.nej.aa(pciVar3, this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                            return aojh.a;
                        }
                        nejVar3 = this.d;
                        nejVar3.n.b(mce.cP);
                        nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                        this.c = 7;
                        if (nejVar3.O(nmoVar3, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        nejVar2.n.b(mce.cQ);
                        nmoVar2 = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
                        this.a = null;
                        this.b = null;
                        this.c = 8;
                        if (nejVar2.O(nmoVar2, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aojh.a;
                }
                defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "shouldAutoScreen", 2176, "DobbyLifecycleController.kt").v("shouldAutoScreen(): No IncomingCallScreeningResult available (voter skipped, passed, or timed out)");
                if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                    njeVar = defpackage.nje.a;
                }
                iOrdinal = njeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 4) {
                                throw new aois();
                            }
                            mqtVar3 = nejVar.j;
                            nvpVar3 = defpackage.nvp.EVENT_DOBBY_USE_GEMINI_RUNNER_SELECTED;
                            this.a = njeVar;
                            this.c = 4;
                            if (mqtVar3.x(nvpVar3, this) == aoluVar) {
                                obj2 = njeVar;
                                return aoluVar;
                            }
                        }
                    } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                        mqtVar2 = nejVar.j;
                        nvpVar2 = defpackage.nvp.EVENT_DOBBY_USE_GACS_SELECTED;
                        this.a = njeVar;
                        this.c = 2;
                        if (mqtVar2.x(nvpVar2, this) == aoluVar) {
                            obj2 = njeVar;
                            obj2 = njeVar;
                            obj2 = njeVar;
                            obj2 = njeVar;
                            return aoluVar;
                        }
                    }
                } else if (((java.lang.Boolean) nejVar.A.a()).booleanValue()) {
                    mqtVar = nejVar.j;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_USE_GACS_MANUAL_SCREENING_SELECTED;
                    this.a = njeVar;
                    this.c = 3;
                    if (mqtVar.x(nvpVar, this) == aoluVar) {
                        obj2 = njeVar;
                        obj2 = njeVar;
                        return aoluVar;
                    }
                }
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                java.lang.Object obj8 = obj2;
                aimw aimwVarL7 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 369, "DobbyLifecycleController.kt");
                defpackage.nej nejVar8 = this.d;
                aimwVarL7.I("Selected DobbyUseCase: %s for callId: %s", obj8, nejVar8.c);
                this.a = obj8;
                this.b = nejVar8;
                this.c = 5;
                obj = nejVar8.t.a((defpackage.nje) obj8, this);
                obj4 = nejVar8;
                obj3 = obj8;
                if (obj == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.nej) obj4).I = (defpackage.nfc) obj;
                nejVar2 = this.d;
                if (nejVar2.I.c) {
                    defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 398, "DobbyLifecycleController.kt").y("session.canStart() failed for use case %s. Transitioning lifecycle state to NOT_A_DOBBY_CALL", obj3);
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = 9;
                    if (nejVar2.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (obj3 == defpackage.nje.b) {
                    pci pciVar4 = nejVar2.Y;
                    this.a = null;
                    this.b = null;
                    this.c = 6;
                    obj = defpackage.nej.aa(pciVar4, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                        return aojh.a;
                    }
                    nejVar3 = this.d;
                    nejVar3.n.b(mce.cP);
                    nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                    this.c = 7;
                    if (nejVar3.O(nmoVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nejVar2.n.b(mce.cQ);
                    nmoVar2 = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
                    this.a = null;
                    this.b = null;
                    this.c = 8;
                    if (nejVar2.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 2:
            case 3:
            case 4:
                java.lang.Object obj9 = this.a;
                aooc.af(obj);
                obj2 = obj9;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                obj2 = njeVar;
                java.lang.Object obj10 = obj2;
                aimw aimwVarL8 = defpackage.nej.a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 369, "DobbyLifecycleController.kt");
                defpackage.nej nejVar9 = this.d;
                aimwVarL8.I("Selected DobbyUseCase: %s for callId: %s", obj10, nejVar9.c);
                this.a = obj10;
                this.b = nejVar9;
                this.c = 5;
                obj = nejVar9.t.a((defpackage.nje) obj10, this);
                obj4 = nejVar9;
                obj3 = obj10;
                if (obj == aoluVar) {
                    return aoluVar;
                }
                ((defpackage.nej) obj4).I = (defpackage.nfc) obj;
                nejVar2 = this.d;
                if (nejVar2.I.c) {
                    defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 398, "DobbyLifecycleController.kt").y("session.canStart() failed for use case %s. Transitioning lifecycle state to NOT_A_DOBBY_CALL", obj3);
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = 9;
                    if (nejVar2.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (obj3 == defpackage.nje.b) {
                    pci pciVar5 = nejVar2.Y;
                    this.a = null;
                    this.b = null;
                    this.c = 6;
                    obj = defpackage.nej.aa(pciVar5, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                        return aojh.a;
                    }
                    nejVar3 = this.d;
                    nejVar3.n.b(mce.cP);
                    nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                    this.c = 7;
                    if (nejVar3.O(nmoVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nejVar2.n.b(mce.cQ);
                    nmoVar2 = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
                    this.a = null;
                    this.b = null;
                    this.c = 8;
                    if (nejVar2.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 5:
                java.lang.Object obj11 = this.b;
                java.lang.Object obj12 = this.a;
                aooc.af(obj);
                obj4 = obj11;
                obj3 = obj12;
                ((defpackage.nej) obj4).I = (defpackage.nfc) obj;
                nejVar2 = this.d;
                if (nejVar2.I.c) {
                    defpackage.nej.a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 398, "DobbyLifecycleController.kt").y("session.canStart() failed for use case %s. Transitioning lifecycle state to NOT_A_DOBBY_CALL", obj3);
                    nmoVar = defpackage.nmo.NOT_A_DOBBY_CALL;
                    this.a = null;
                    this.b = null;
                    this.c = 9;
                    if (nejVar2.O(nmoVar, this) == aoluVar) {
                        return aoluVar;
                    }
                } else if (obj3 == defpackage.nje.b) {
                    pci pciVar6 = nejVar2.Y;
                    this.a = null;
                    this.b = null;
                    this.c = 6;
                    obj = defpackage.nej.aa(pciVar6, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                        return aojh.a;
                    }
                    nejVar3 = this.d;
                    nejVar3.n.b(mce.cP);
                    nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                    this.c = 7;
                    if (nejVar3.O(nmoVar3, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nejVar2.n.b(mce.cQ);
                    nmoVar2 = defpackage.nmo.READY_FOR_MANUAL_SCREENING;
                    this.a = null;
                    this.b = null;
                    this.c = 8;
                    if (nejVar2.O(nmoVar2, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 6:
                aooc.af(obj);
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.nej.a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "onCallScopeAdded$<anonymous>", 385, "DobbyLifecycleController.kt").v("Failed to start auto screening since arbiter rejects.");
                    return aojh.a;
                }
                nejVar3 = this.d;
                nejVar3.n.b(mce.cP);
                nmoVar3 = defpackage.nmo.AUTO_SCREENING;
                this.c = 7;
                if (nejVar3.O(nmoVar3, this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 7:
            case 8:
            default:
                aooc.af(obj);
                return aojh.a;
        }
    }
}
