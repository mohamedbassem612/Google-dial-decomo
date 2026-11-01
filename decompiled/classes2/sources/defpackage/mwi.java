package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mwi extends aomh implements aonn {
    int a;
    final /* synthetic */ defpackage.mwj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwi(defpackage.mwj mwjVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = mwjVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:30:0x0101  */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x0149  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.mwj mwjVar;
        defpackage.nmk nmkVarD;
        defpackage.mwj mwjVar2;
        defpackage.nmk nmkVarD2;
        defpackage.nmo nmoVarB;
        defpackage.nmo nmoVarB2;
        defpackage.nmo nmoVarB3;
        defpackage.mwj mwjVar3;
        defpackage.nmo nmoVarB4;
        defpackage.mwj mwjVar4;
        alro alroVarBa;
        defpackage.mwj mwjVar5;
        aolu aoluVar = aolu.a;
        switch (this.a) {
            case 0:
                aooc.af(obj);
                defpackage.mwj mwjVar6 = this.b;
                defpackage.nvp nvpVar = defpackage.nvp.EVENT_USER_NOTIFICATION_ANSWER_CALL_BUTTON_CLICKED;
                this.a = 1;
                if (mwjVar6.f.x(nvpVar, this) == aoluVar) {
                    return aoluVar;
                }
                mwjVar = this.b;
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                defpackage.nwj nwjVarK = mni.K(defpackage.nmj.a.m());
                nwjVarK.u();
                npwVarAB.M(nwjVarK.t());
                nmkVarD = npwVarAB.D();
                this.a = 2;
                if (mwjVar.p.b(nmkVarD, this) == aoluVar) {
                    return aoluVar;
                }
                mwjVar2 = this.b;
                defpackage.npw npwVarAB2 = mni.aB(defpackage.nmk.a.m());
                akzx akzxVarM = defpackage.nmg.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                ((defpackage.nmg) akzxVarM.b).b = false;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.nmg nmgVar = (defpackage.nmg) aladVarP;
                aooh.f(nmgVar, "value");
                akzx akzxVar = (akzx) npwVarAB2.a;
                akzxVar.u();
                defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
                j$.util.Objects.requireNonNull(nmgVar);
                nmkVar.c = nmgVar;
                nmkVar.b = 9;
                nmkVarD2 = npwVarAB2.D();
                this.a = 3;
                if (mwjVar2.p.b(nmkVarD2, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.mwj mwjVar7 = this.b;
                this.a = 4;
                obj = mwjVar7.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.AUTO_SCREENING) {
                    defpackage.mwj mwjVar8 = this.b;
                    this.a = 5;
                    obj = mwjVar8.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB2 != defpackage.nmo.AUTO_SCREENING_WITH_UI) {
                        defpackage.mwj mwjVar9 = this.b;
                        this.a = 6;
                        obj = mwjVar9.p.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                        }
                        if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                            mwjVar3 = this.b;
                            if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                                defpackage.ogj ogjVar = mwjVar3.p;
                                this.a = 7;
                                obj = ogjVar.a(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                                if (nmoVarB4 == null) {
                                    nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                                }
                                if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                                }
                            }
                            return aojh.a;
                        }
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                        mwjVar4 = this.b;
                        this.a = 10;
                        if (mwjVar4.g.a(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                }
                defpackage.mwj mwjVar10 = this.b;
                this.a = 8;
                obj = mwjVar10.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI = ahus.I(alro.a.m());
                    apdi apdiVar = alsc.b;
                    aooh.e(apdiVar, "manualAnswerCallEvent");
                    ajyiVarI.be(apdiVar, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(obj);
                mwjVar = this.b;
                defpackage.npw npwVarAB3 = mni.aB(defpackage.nmk.a.m());
                defpackage.nwj nwjVarK2 = mni.K(defpackage.nmj.a.m());
                nwjVarK2.u();
                npwVarAB3.M(nwjVarK2.t());
                nmkVarD = npwVarAB3.D();
                this.a = 2;
                if (mwjVar.p.b(nmkVarD, this) == aoluVar) {
                    return aoluVar;
                }
                mwjVar2 = this.b;
                defpackage.npw npwVarAB4 = mni.aB(defpackage.nmk.a.m());
                akzx akzxVarM2 = defpackage.nmg.a.m();
                aooh.f(akzxVarM2, "builder");
                akzxVarM2.u();
                ((defpackage.nmg) akzxVarM2.b).b = false;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.nmg nmgVar2 = (defpackage.nmg) aladVarP2;
                aooh.f(nmgVar2, "value");
                akzx akzxVar2 = (akzx) npwVarAB4.a;
                akzxVar2.u();
                defpackage.nmk nmkVar2 = (defpackage.nmk) akzxVar2.b;
                j$.util.Objects.requireNonNull(nmgVar2);
                nmkVar2.c = nmgVar2;
                nmkVar2.b = 9;
                nmkVarD2 = npwVarAB4.D();
                this.a = 3;
                if (mwjVar2.p.b(nmkVarD2, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.mwj mwjVar11 = this.b;
                this.a = 4;
                obj = mwjVar11.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.AUTO_SCREENING) {
                    defpackage.mwj mwjVar12 = this.b;
                    this.a = 5;
                    obj = mwjVar12.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB2 != defpackage.nmo.AUTO_SCREENING_WITH_UI) {
                        defpackage.mwj mwjVar13 = this.b;
                        this.a = 6;
                        obj = mwjVar13.p.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                        }
                        if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                            mwjVar3 = this.b;
                            if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                                defpackage.ogj ogjVar2 = mwjVar3.p;
                                this.a = 7;
                                obj = ogjVar2.a(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                                if (nmoVarB4 == null) {
                                    nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                                }
                                if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                                }
                            }
                            return aojh.a;
                        }
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                        mwjVar4 = this.b;
                        this.a = 10;
                        if (mwjVar4.g.a(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                }
                defpackage.mwj mwjVar14 = this.b;
                this.a = 8;
                obj = mwjVar14.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI2 = ahus.I(alro.a.m());
                    apdi apdiVar2 = alsc.b;
                    aooh.e(apdiVar2, "manualAnswerCallEvent");
                    ajyiVarI2.be(apdiVar2, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI2.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 2:
                aooc.af(obj);
                mwjVar2 = this.b;
                defpackage.npw npwVarAB5 = mni.aB(defpackage.nmk.a.m());
                akzx akzxVarM3 = defpackage.nmg.a.m();
                aooh.f(akzxVarM3, "builder");
                akzxVarM3.u();
                ((defpackage.nmg) akzxVarM3.b).b = false;
                alad aladVarP3 = akzxVarM3.p();
                aooh.e(aladVarP3, "build(...)");
                defpackage.nmg nmgVar3 = (defpackage.nmg) aladVarP3;
                aooh.f(nmgVar3, "value");
                akzx akzxVar3 = (akzx) npwVarAB5.a;
                akzxVar3.u();
                defpackage.nmk nmkVar3 = (defpackage.nmk) akzxVar3.b;
                j$.util.Objects.requireNonNull(nmgVar3);
                nmkVar3.c = nmgVar3;
                nmkVar3.b = 9;
                nmkVarD2 = npwVarAB5.D();
                this.a = 3;
                if (mwjVar2.p.b(nmkVarD2, this) == aoluVar) {
                    return aoluVar;
                }
                defpackage.mwj mwjVar15 = this.b;
                this.a = 4;
                obj = mwjVar15.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.AUTO_SCREENING) {
                    defpackage.mwj mwjVar16 = this.b;
                    this.a = 5;
                    obj = mwjVar16.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB2 != defpackage.nmo.AUTO_SCREENING_WITH_UI) {
                        defpackage.mwj mwjVar17 = this.b;
                        this.a = 6;
                        obj = mwjVar17.p.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                        }
                        if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                            mwjVar3 = this.b;
                            if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                                defpackage.ogj ogjVar3 = mwjVar3.p;
                                this.a = 7;
                                obj = ogjVar3.a(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                                if (nmoVarB4 == null) {
                                    nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                                }
                                if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                                }
                            }
                            return aojh.a;
                        }
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                        mwjVar4 = this.b;
                        this.a = 10;
                        if (mwjVar4.g.a(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                }
                defpackage.mwj mwjVar18 = this.b;
                this.a = 8;
                obj = mwjVar18.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI3 = ahus.I(alro.a.m());
                    apdi apdiVar3 = alsc.b;
                    aooh.e(apdiVar3, "manualAnswerCallEvent");
                    ajyiVarI3.be(apdiVar3, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI3.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 3:
                aooc.af(obj);
                defpackage.mwj mwjVar19 = this.b;
                this.a = 4;
                obj = mwjVar19.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.AUTO_SCREENING) {
                    defpackage.mwj mwjVar110 = this.b;
                    this.a = 5;
                    obj = mwjVar110.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB2 != defpackage.nmo.AUTO_SCREENING_WITH_UI) {
                        defpackage.mwj mwjVar111 = this.b;
                        this.a = 6;
                        obj = mwjVar111.p.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                        }
                        if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                            mwjVar3 = this.b;
                            if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                                defpackage.ogj ogjVar4 = mwjVar3.p;
                                this.a = 7;
                                obj = ogjVar4.a(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                                if (nmoVarB4 == null) {
                                    nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                                }
                                if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                                }
                            }
                            return aojh.a;
                        }
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                        mwjVar4 = this.b;
                        this.a = 10;
                        if (mwjVar4.g.a(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                }
                defpackage.mwj mwjVar112 = this.b;
                this.a = 8;
                obj = mwjVar112.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI4 = ahus.I(alro.a.m());
                    apdi apdiVar4 = alsc.b;
                    aooh.e(apdiVar4, "manualAnswerCallEvent");
                    ajyiVarI4.be(apdiVar4, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI4.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 4:
                aooc.af(obj);
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.AUTO_SCREENING) {
                    defpackage.mwj mwjVar113 = this.b;
                    this.a = 5;
                    obj = mwjVar113.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB2 == null) {
                        nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB2 != defpackage.nmo.AUTO_SCREENING_WITH_UI) {
                        defpackage.mwj mwjVar114 = this.b;
                        this.a = 6;
                        obj = mwjVar114.p.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                        if (nmoVarB3 == null) {
                            nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                        }
                        if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                            mwjVar3 = this.b;
                            if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                                defpackage.ogj ogjVar5 = mwjVar3.p;
                                this.a = 7;
                                obj = ogjVar5.a(this);
                                if (obj == aoluVar) {
                                    return aoluVar;
                                }
                                nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                                if (nmoVarB4 == null) {
                                    nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                                }
                                if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                                }
                            }
                            return aojh.a;
                        }
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                        mwjVar4 = this.b;
                        this.a = 10;
                        if (mwjVar4.g.a(this) == aoluVar) {
                            return aoluVar;
                        }
                        return aojh.a;
                    }
                }
                defpackage.mwj mwjVar115 = this.b;
                this.a = 8;
                obj = mwjVar115.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI5 = ahus.I(alro.a.m());
                    apdi apdiVar5 = alsc.b;
                    aooh.e(apdiVar5, "manualAnswerCallEvent");
                    ajyiVarI5.be(apdiVar5, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI5.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 5:
                aooc.af(obj);
                nmoVarB2 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB2 == null) {
                    nmoVarB2 = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB2 != defpackage.nmo.AUTO_SCREENING_WITH_UI) {
                    defpackage.mwj mwjVar116 = this.b;
                    this.a = 6;
                    obj = mwjVar116.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB3 == null) {
                        nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                        mwjVar3 = this.b;
                        if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                            defpackage.ogj ogjVar6 = mwjVar3.p;
                            this.a = 7;
                            obj = ogjVar6.a(this);
                            if (obj == aoluVar) {
                                return aoluVar;
                            }
                            nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                            if (nmoVarB4 == null) {
                                nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                            }
                            if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                            }
                        }
                        return aojh.a;
                    }
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                    return aojh.a;
                }
                defpackage.mwj mwjVar117 = this.b;
                this.a = 8;
                obj = mwjVar117.p.a(this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI6 = ahus.I(alro.a.m());
                    apdi apdiVar6 = alsc.b;
                    aooh.e(apdiVar6, "manualAnswerCallEvent");
                    ajyiVarI6.be(apdiVar6, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI6.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 6:
                aooc.af(obj);
                nmoVarB3 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB3 == null) {
                    nmoVarB3 = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB3 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
                    defpackage.mwj mwjVar118 = this.b;
                    this.a = 8;
                    obj = mwjVar118.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((defpackage.nmu) obj).r) {
                        ajyi ajyiVarI7 = ahus.I(alro.a.m());
                        apdi apdiVar7 = alsc.b;
                        aooh.e(apdiVar7, "manualAnswerCallEvent");
                        ajyiVarI7.be(apdiVar7, ahus.D(alsc.a.m()).am());
                        alroVarBa = ajyiVarI7.ba();
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                        mwjVar5 = this.b;
                        this.a = 9;
                        if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return aojh.a;
                }
                mwjVar3 = this.b;
                if (((java.lang.Boolean) mwjVar3.k.a()).booleanValue()) {
                    defpackage.ogj ogjVar7 = mwjVar3.p;
                    this.a = 7;
                    obj = ogjVar7.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                    if (nmoVarB4 == null) {
                        nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                        defpackage.mwj mwjVar119 = this.b;
                        this.a = 8;
                        obj = mwjVar119.p.a(this);
                        if (obj == aoluVar) {
                            return aoluVar;
                        }
                        if (((defpackage.nmu) obj).r) {
                            ajyi ajyiVarI8 = ahus.I(alro.a.m());
                            apdi apdiVar8 = alsc.b;
                            aooh.e(apdiVar8, "manualAnswerCallEvent");
                            ajyiVarI8.be(apdiVar8, ahus.D(alsc.a.m()).am());
                            alroVarBa = ajyiVarI8.ba();
                            defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                            mwjVar5 = this.b;
                            this.a = 9;
                            if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
                defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                mwjVar4 = this.b;
                this.a = 10;
                if (mwjVar4.g.a(this) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 7:
                aooc.af(obj);
                nmoVarB4 = defpackage.nmo.b(((defpackage.nmu) obj).c);
                if (nmoVarB4 == null) {
                    nmoVarB4 = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB4 == defpackage.nmo.MANUAL_SCREENING) {
                    defpackage.mwj mwjVar1110 = this.b;
                    this.a = 8;
                    obj = mwjVar1110.p.a(this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    if (((defpackage.nmu) obj).r) {
                        ajyi ajyiVarI9 = ahus.I(alro.a.m());
                        apdi apdiVar9 = alsc.b;
                        aooh.e(apdiVar9, "manualAnswerCallEvent");
                        ajyiVarI9.be(apdiVar9, ahus.D(alsc.a.m()).am());
                        alroVarBa = ajyiVarI9.ba();
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                        mwjVar5 = this.b;
                        this.a = 9;
                        if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                        mwjVar4 = this.b;
                        this.a = 10;
                        if (mwjVar4.g.a(this) == aoluVar) {
                            return aoluVar;
                        }
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 8:
                aooc.af(obj);
                if (((defpackage.nmu) obj).r) {
                    ajyi ajyiVarI10 = ahus.I(alro.a.m());
                    apdi apdiVar10 = alsc.b;
                    aooh.e(apdiVar10, "manualAnswerCallEvent");
                    ajyiVarI10.be(apdiVar10, ahus.D(alsc.a.m()).am());
                    alroVarBa = ajyiVarI10.ba();
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 126, "DobbyNotificationController.kt").v("relay answer call to duplex");
                    mwjVar5 = this.b;
                    this.a = 9;
                    if (mwjVar5.e.a(alroVarBa, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked$<anonymous>", 129, "DobbyNotificationController.kt").v("answer call directly");
                    mwjVar4 = this.b;
                    this.a = 10;
                    if (mwjVar4.g.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 9:
            default:
                aooc.af(obj);
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.mwi(this.b, aolnVar);
    }
}
