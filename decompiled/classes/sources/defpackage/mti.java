package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mti {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl");
    private final defpackage.zpm b;

    public mti(defpackage.zpm zpmVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableWinkyPhaseTwo");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableWinkyFullFunctionality");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableManualScreeningWithoutUi");
        }
        this.b = zpmVar;
    }

    private final mtf c(java.lang.String str) {
        j$.util.Optional optionalE = this.b.e(str);
        defpackage.aooh.e(optionalE, "get(...)");
        apqr apqrVar = (apqr) defpackage.aooh.q(optionalE);
        if (apqrVar != null) {
            return (mtf) apqrVar.a(mtf.class);
        }
        ((defpackage.aimw) a.d().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "getEntryPoint$<anonymous>", 165, "DobbyClientControllerImpl.kt")).y("Call scope not found for callId: %s", str);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x0169  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(java.lang.String str, int i, defpackage.aoln aolnVar) {
        mtg mtgVar;
        mtf mtfVarC;
        mtf mtfVar;
        mtf mtfVar2;
        ogj ogjVarCI;
        nmk nmkVarD;
        mtf mtfVar3;
        mtf mtfVar4;
        nmu nmuVar;
        int i2;
        nmo nmoVarB;
        nej nejVarH;
        nmo nmoVarB2;
        nmo nmoVarB3;
        alro alroVarBa;
        nbr nbrVarF;
        defpackage.ajcq ajcqVarB;
        if (aolnVar instanceof mtg) {
            mtgVar = (mtg) aolnVar;
            int i3 = mtgVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtgVar.d = i3 - Integer.MIN_VALUE;
            } else {
                mtgVar = new mtg(this, aolnVar);
            }
        } else {
            mtgVar = new mtg(this, aolnVar);
        }
        java.lang.Object objD = mtgVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        switch (mtgVar.d) {
            case 0:
                defpackage.aooc.af(objD);
                ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "answerCall", 84, "DobbyClientControllerImpl.kt")).y("Received remote request to answer call: %s", str);
                mtfVarC = c(str);
                if (mtfVarC != null) {
                    int i4 = i - 1;
                    pci pciVarCB = mtfVarC.cB();
                    if (i == 0) {
                        throw null;
                    }
                    if (i4 != 0) {
                        throw new defpackage.aois();
                    }
                    zie zieVar = zie.c;
                    mtgVar.a = mtfVarC;
                    mtgVar.d = 1;
                    if (pciVarCB.e(zieVar, mtgVar) == aoluVar) {
                        mtfVar = mtfVarC;
                        return aoluVar;
                    }
                    mtfVar = mtfVarC;
                    tpf tpfVarLC = mtfVar.lC();
                    mtgVar.a = mtfVar;
                    mtgVar.d = 3;
                    objD = tpfVarLC.d(mtgVar);
                    mtfVar2 = mtfVar;
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (objD != null) {
                        mtfVar2.M().r();
                        return defpackage.aojh.a;
                    }
                    ogjVarCI = mtfVar2.cI();
                    npw npwVarAB = defpackage.mni.aB(nmk.a.m());
                    nwj nwjVarK = defpackage.mni.K(nmj.a.m());
                    nwjVarK.u();
                    npwVarAB.M(nwjVarK.t());
                    nmkVarD = npwVarAB.D();
                    mtgVar.a = mtfVar2;
                    mtgVar.d = 4;
                    if (ogjVarCI.b(nmkVarD, mtgVar) == aoluVar) {
                        mtfVar3 = mtfVar2;
                        return aoluVar;
                    }
                    mtfVar3 = mtfVar2;
                    ogj ogjVarCI2 = mtfVar3.cI();
                    mtgVar.a = mtfVar3;
                    mtgVar.d = 5;
                    objD = ogjVarCI2.a(mtgVar);
                    mtfVar4 = mtfVar3;
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    nmuVar = (nmu) objD;
                    i2 = nmuVar.c;
                    nmoVarB = nmo.b(i2);
                    if (nmoVarB == null) {
                        nmoVarB = nmo.q;
                    }
                    if (nmoVarB == nmo.j) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "answerCall", 118, "DobbyClientControllerImpl.kt")).v("Dobby in RINGING_DURING_NOT_ACTIVE_SESSION, answering via regular CallController.");
                        ajcqVarB = mtfVar4.cr().b();
                        mtgVar.a = null;
                        mtgVar.d = 6;
                        if (defpackage.aosv.D(ajcqVarB, mtgVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (nmuVar.r) {
                        nmoVarB2 = nmo.b(i2);
                        if (nmoVarB2 == null) {
                            nmoVarB2 = nmo.q;
                        }
                        if (nmoVarB2 == nmo.p) {
                            nejVarH = mtfVar4.H();
                            mtgVar.a = null;
                            mtgVar.d = 7;
                            if (nejVarH.a(mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nmoVarB3 = nmo.b(i2);
                            if (nmoVarB3 == null) {
                                nmoVarB3 = nmo.q;
                            }
                            if (nmoVarB3 != nmo.o) {
                                ajyi ajyiVarI = ahus.I((defpackage.akzz) alro.a.m());
                                defpackage.apdi apdiVar = alsc.b;
                                defpackage.aooh.e(apdiVar, "manualAnswerCallEvent");
                                ajyiVarI.be(apdiVar, ahus.D(alsc.a.m()).am());
                                alroVarBa = ajyiVarI.ba();
                                nbrVarF = mtfVar4.F();
                                mtgVar.a = null;
                                mtgVar.d = 8;
                                if (nbrVarF.a(alroVarBa, mtgVar) == aoluVar) {
                                    return aoluVar;
                                }
                            } else {
                                nejVarH = mtfVar4.H();
                                mtgVar.a = null;
                                mtgVar.d = 7;
                                if (nejVarH.a(mtgVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    } else {
                        nejVarH = mtfVar4.H();
                        mtgVar.a = null;
                        mtgVar.d = 7;
                        if (nejVarH.a(mtgVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return defpackage.aojh.a;
            case 1:
            case 2:
                java.lang.Object obj = mtgVar.a;
                defpackage.aooc.af(objD);
                mtfVar = obj;
                mtfVar = mtfVarC;
                tpf tpfVarLC2 = mtfVar.lC();
                mtgVar.a = mtfVar;
                mtgVar.d = 3;
                objD = tpfVarLC2.d(mtgVar);
                mtfVar2 = mtfVar;
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (objD != null) {
                    mtfVar2.M().r();
                    return defpackage.aojh.a;
                }
                ogjVarCI = mtfVar2.cI();
                npw npwVarAB2 = defpackage.mni.aB(nmk.a.m());
                nwj nwjVarK2 = defpackage.mni.K(nmj.a.m());
                nwjVarK2.u();
                npwVarAB2.M(nwjVarK2.t());
                nmkVarD = npwVarAB2.D();
                mtgVar.a = mtfVar2;
                mtgVar.d = 4;
                if (ogjVarCI.b(nmkVarD, mtgVar) == aoluVar) {
                    mtfVar3 = mtfVar2;
                    return aoluVar;
                }
                mtfVar3 = mtfVar2;
                ogj ogjVarCI3 = mtfVar3.cI();
                mtgVar.a = mtfVar3;
                mtgVar.d = 5;
                objD = ogjVarCI3.a(mtgVar);
                mtfVar4 = mtfVar3;
                if (objD == aoluVar) {
                    return aoluVar;
                }
                nmuVar = (nmu) objD;
                i2 = nmuVar.c;
                nmoVarB = nmo.b(i2);
                if (nmoVarB == null) {
                    nmoVarB = nmo.q;
                }
                if (nmoVarB == nmo.j) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "answerCall", 118, "DobbyClientControllerImpl.kt")).v("Dobby in RINGING_DURING_NOT_ACTIVE_SESSION, answering via regular CallController.");
                    ajcqVarB = mtfVar4.cr().b();
                    mtgVar.a = null;
                    mtgVar.d = 6;
                    if (defpackage.aosv.D(ajcqVarB, mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (nmuVar.r) {
                    nejVarH = mtfVar4.H();
                    mtgVar.a = null;
                    mtgVar.d = 7;
                    if (nejVarH.a(mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nmoVarB2 = nmo.b(i2);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = nmo.q;
                    }
                    if (nmoVarB2 == nmo.p) {
                        nejVarH = mtfVar4.H();
                        mtgVar.a = null;
                        mtgVar.d = 7;
                        if (nejVarH.a(mtgVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        nmoVarB3 = nmo.b(i2);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = nmo.q;
                        }
                        if (nmoVarB3 != nmo.o) {
                            ajyi ajyiVarI2 = ahus.I((defpackage.akzz) alro.a.m());
                            defpackage.apdi apdiVar2 = alsc.b;
                            defpackage.aooh.e(apdiVar2, "manualAnswerCallEvent");
                            ajyiVarI2.be(apdiVar2, ahus.D(alsc.a.m()).am());
                            alroVarBa = ajyiVarI2.ba();
                            nbrVarF = mtfVar4.F();
                            mtgVar.a = null;
                            mtgVar.d = 8;
                            if (nbrVarF.a(alroVarBa, mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVarH = mtfVar4.H();
                            mtgVar.a = null;
                            mtgVar.d = 7;
                            if (nejVarH.a(mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return defpackage.aojh.a;
            case 3:
                java.lang.Object obj2 = mtgVar.a;
                defpackage.aooc.af(objD);
                mtfVar2 = obj2;
                if (objD != null) {
                    mtfVar2.M().r();
                    return defpackage.aojh.a;
                }
                ogjVarCI = mtfVar2.cI();
                npw npwVarAB3 = defpackage.mni.aB(nmk.a.m());
                nwj nwjVarK3 = defpackage.mni.K(nmj.a.m());
                nwjVarK3.u();
                npwVarAB3.M(nwjVarK3.t());
                nmkVarD = npwVarAB3.D();
                mtgVar.a = mtfVar2;
                mtgVar.d = 4;
                if (ogjVarCI.b(nmkVarD, mtgVar) == aoluVar) {
                    mtfVar3 = mtfVar2;
                    return aoluVar;
                }
                mtfVar3 = mtfVar2;
                ogj ogjVarCI4 = mtfVar3.cI();
                mtgVar.a = mtfVar3;
                mtgVar.d = 5;
                objD = ogjVarCI4.a(mtgVar);
                mtfVar4 = mtfVar3;
                if (objD == aoluVar) {
                    return aoluVar;
                }
                nmuVar = (nmu) objD;
                i2 = nmuVar.c;
                nmoVarB = nmo.b(i2);
                if (nmoVarB == null) {
                    nmoVarB = nmo.q;
                }
                if (nmoVarB == nmo.j) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "answerCall", 118, "DobbyClientControllerImpl.kt")).v("Dobby in RINGING_DURING_NOT_ACTIVE_SESSION, answering via regular CallController.");
                    ajcqVarB = mtfVar4.cr().b();
                    mtgVar.a = null;
                    mtgVar.d = 6;
                    if (defpackage.aosv.D(ajcqVarB, mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (nmuVar.r) {
                    nejVarH = mtfVar4.H();
                    mtgVar.a = null;
                    mtgVar.d = 7;
                    if (nejVarH.a(mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nmoVarB2 = nmo.b(i2);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = nmo.q;
                    }
                    if (nmoVarB2 == nmo.p) {
                        nejVarH = mtfVar4.H();
                        mtgVar.a = null;
                        mtgVar.d = 7;
                        if (nejVarH.a(mtgVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        nmoVarB3 = nmo.b(i2);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = nmo.q;
                        }
                        if (nmoVarB3 != nmo.o) {
                            ajyi ajyiVarI3 = ahus.I((defpackage.akzz) alro.a.m());
                            defpackage.apdi apdiVar3 = alsc.b;
                            defpackage.aooh.e(apdiVar3, "manualAnswerCallEvent");
                            ajyiVarI3.be(apdiVar3, ahus.D(alsc.a.m()).am());
                            alroVarBa = ajyiVarI3.ba();
                            nbrVarF = mtfVar4.F();
                            mtgVar.a = null;
                            mtgVar.d = 8;
                            if (nbrVarF.a(alroVarBa, mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVarH = mtfVar4.H();
                            mtgVar.a = null;
                            mtgVar.d = 7;
                            if (nejVarH.a(mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return defpackage.aojh.a;
            case 4:
                java.lang.Object obj3 = mtgVar.a;
                defpackage.aooc.af(objD);
                mtfVar3 = obj3;
                mtfVar3 = mtfVar2;
                ogj ogjVarCI5 = mtfVar3.cI();
                mtgVar.a = mtfVar3;
                mtgVar.d = 5;
                objD = ogjVarCI5.a(mtgVar);
                mtfVar4 = mtfVar3;
                if (objD == aoluVar) {
                    return aoluVar;
                }
                nmuVar = (nmu) objD;
                i2 = nmuVar.c;
                nmoVarB = nmo.b(i2);
                if (nmoVarB == null) {
                    nmoVarB = nmo.q;
                }
                if (nmoVarB == nmo.j) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "answerCall", 118, "DobbyClientControllerImpl.kt")).v("Dobby in RINGING_DURING_NOT_ACTIVE_SESSION, answering via regular CallController.");
                    ajcqVarB = mtfVar4.cr().b();
                    mtgVar.a = null;
                    mtgVar.d = 6;
                    if (defpackage.aosv.D(ajcqVarB, mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (nmuVar.r) {
                    nejVarH = mtfVar4.H();
                    mtgVar.a = null;
                    mtgVar.d = 7;
                    if (nejVarH.a(mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nmoVarB2 = nmo.b(i2);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = nmo.q;
                    }
                    if (nmoVarB2 == nmo.p) {
                        nejVarH = mtfVar4.H();
                        mtgVar.a = null;
                        mtgVar.d = 7;
                        if (nejVarH.a(mtgVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        nmoVarB3 = nmo.b(i2);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = nmo.q;
                        }
                        if (nmoVarB3 != nmo.o) {
                            ajyi ajyiVarI4 = ahus.I((defpackage.akzz) alro.a.m());
                            defpackage.apdi apdiVar4 = alsc.b;
                            defpackage.aooh.e(apdiVar4, "manualAnswerCallEvent");
                            ajyiVarI4.be(apdiVar4, ahus.D(alsc.a.m()).am());
                            alroVarBa = ajyiVarI4.ba();
                            nbrVarF = mtfVar4.F();
                            mtgVar.a = null;
                            mtgVar.d = 8;
                            if (nbrVarF.a(alroVarBa, mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVarH = mtfVar4.H();
                            mtgVar.a = null;
                            mtgVar.d = 7;
                            if (nejVarH.a(mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return defpackage.aojh.a;
            case 5:
                java.lang.Object obj4 = mtgVar.a;
                defpackage.aooc.af(objD);
                mtfVar4 = obj4;
                nmuVar = (nmu) objD;
                i2 = nmuVar.c;
                nmoVarB = nmo.b(i2);
                if (nmoVarB == null) {
                    nmoVarB = nmo.q;
                }
                if (nmoVarB == nmo.j) {
                    ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "answerCall", 118, "DobbyClientControllerImpl.kt")).v("Dobby in RINGING_DURING_NOT_ACTIVE_SESSION, answering via regular CallController.");
                    ajcqVarB = mtfVar4.cr().b();
                    mtgVar.a = null;
                    mtgVar.d = 6;
                    if (defpackage.aosv.D(ajcqVarB, mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (nmuVar.r) {
                    nejVarH = mtfVar4.H();
                    mtgVar.a = null;
                    mtgVar.d = 7;
                    if (nejVarH.a(mtgVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    nmoVarB2 = nmo.b(i2);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = nmo.q;
                    }
                    if (nmoVarB2 == nmo.p) {
                        nejVarH = mtfVar4.H();
                        mtgVar.a = null;
                        mtgVar.d = 7;
                        if (nejVarH.a(mtgVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        nmoVarB3 = nmo.b(i2);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = nmo.q;
                        }
                        if (nmoVarB3 != nmo.o) {
                            ajyi ajyiVarI5 = ahus.I((defpackage.akzz) alro.a.m());
                            defpackage.apdi apdiVar5 = alsc.b;
                            defpackage.aooh.e(apdiVar5, "manualAnswerCallEvent");
                            ajyiVarI5.be(apdiVar5, ahus.D(alsc.a.m()).am());
                            alroVarBa = ajyiVarI5.ba();
                            nbrVarF = mtfVar4.F();
                            mtgVar.a = null;
                            mtgVar.d = 8;
                            if (nbrVarF.a(alroVarBa, mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            nejVarH = mtfVar4.H();
                            mtgVar.a = null;
                            mtgVar.d = 7;
                            if (nejVarH.a(mtgVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(objD);
                return defpackage.aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.String str, int i, defpackage.aoln aolnVar) {
        mth mthVar;
        mtf mtfVarC;
        mtf mtfVar;
        mtf mtfVar2;
        nbr nbrVarF;
        java.lang.Object obj;
        if (aolnVar instanceof mth) {
            mthVar = (mth) aolnVar;
            int i2 = mthVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mthVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mthVar = new mth(this, aolnVar);
            }
        } else {
            mthVar = new mth(this, aolnVar);
        }
        java.lang.Object objD = mthVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = mthVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objD);
            ((defpackage.aimw) a.b().l("com/android/dialer/dobby/impl/client/DobbyClientControllerImpl", "declineCall", 140, "DobbyClientControllerImpl.kt")).y("Received client request to decline call for callId: %s", str);
            mtfVarC = c(str);
            if (mtfVarC != null) {
                int i4 = i - 1;
                pci pciVarCB = mtfVarC.cB();
                if (i == 0) {
                    throw null;
                }
                if (i4 != 0) {
                    throw new defpackage.aois();
                }
                zie zieVar = zie.c;
                mthVar.a = mtfVarC;
                mthVar.d = 1;
                if (pciVarCB.e(zieVar, mthVar) == aoluVar) {
                    mtfVar = mtfVarC;
                    return aoluVar;
                }
                mtfVar = mtfVarC;
                tpf tpfVarLC = mtfVar.lC();
                mthVar.a = mtfVar;
                mthVar.d = 3;
                objD = tpfVarLC.d(mthVar);
                mtfVar2 = mtfVar;
                if (objD == aoluVar) {
                    return aoluVar;
                }
                if (objD != null) {
                    mtfVar2 = obj;
                    mtfVar2.M().s();
                    return defpackage.aojh.a;
                }
                nbrVarF = mtfVar2.F();
                mthVar.a = null;
                mthVar.d = 4;
                if (nbrVarF.b(mthVar) == aoluVar) {
                    mtfVar2 = obj;
                    return aoluVar;
                }
            }
        } else if (i3 == 1 || i3 == 2) {
            java.lang.Object obj2 = mthVar.a;
            defpackage.aooc.af(objD);
            mtfVar = obj2;
            mtfVar = mtfVarC;
            tpf tpfVarLC2 = mtfVar.lC();
            mthVar.a = mtfVar;
            mthVar.d = 3;
            objD = tpfVarLC2.d(mthVar);
            mtfVar2 = mtfVar;
            if (objD == aoluVar) {
                return aoluVar;
            }
            if (objD != null) {
                mtfVar2 = obj;
                mtfVar2.M().s();
                return defpackage.aojh.a;
            }
            nbrVarF = mtfVar2.F();
            mthVar.a = null;
            mthVar.d = 4;
            if (nbrVarF.b(mthVar) == aoluVar) {
                mtfVar2 = obj;
                return aoluVar;
            }
        } else if (i3 == 3) {
            obj = mthVar.a;
            defpackage.aooc.af(objD);
            if (objD != null) {
                mtfVar2 = obj;
                mtfVar2.M().s();
                return defpackage.aojh.a;
            }
            nbrVarF = mtfVar2.F();
            mthVar.a = null;
            mthVar.d = 4;
            if (nbrVarF.b(mthVar) == aoluVar) {
                mtfVar2 = obj;
                return aoluVar;
            }
        } else {
            if (i3 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        mtfVar2 = obj;
        return defpackage.aojh.a;
    }
}
