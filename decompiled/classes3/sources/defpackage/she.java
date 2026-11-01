package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class she {
    public final aoss b;
    public final defpackage.zno c;
    public final defpackage.znk d;
    public final defpackage.zoi e;
    public final defpackage.pqo f;
    private final defpackage.sfa h;
    private final defpackage.rzs i;
    private final defpackage.ryf j;
    private final sbw k;
    private final defpackage.zot l;
    private final defpackage.qbe m;
    private final defpackage.aeok n;
    private final tvn o;
    private final kgl p;
    private final ipc q;
    private final defpackage.afpl r;
    private static final aimz g = aimz.i("com/android/dialer/patrick/impl/sharing/CallingCardSharingController");
    public static final defpackage.scx[] a = {defpackage.scx.c, defpackage.scx.d};

    public she(aoss aossVar, defpackage.sfa sfaVar, defpackage.aeok aeokVar, defpackage.rzs rzsVar, defpackage.ryf ryfVar, defpackage.qbe qbeVar, defpackage.afpl afplVar, zjs zjsVar, ipc ipcVar, sbw sbwVar, tvn tvnVar, kgl kglVar, android.content.Context context, defpackage.zot zotVar, defpackage.pqo pqoVar, hgz hgzVar, aais aaisVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aeokVar, "callingCardSharingState");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(kglVar, "blocking");
        aooh.f(context, "appContext");
        aooh.f(zotVar, "blockingInCallCache");
        aooh.f(pqoVar, "callDirection");
        aooh.f(hgzVar, "phoneLookupInfoConsolidatorFactory");
        aooh.f(aaisVar, "sanitizer");
        this.b = aossVar;
        this.h = sfaVar;
        this.n = aeokVar;
        this.i = rzsVar;
        this.j = ryfVar;
        this.m = qbeVar;
        this.r = afplVar;
        this.q = ipcVar;
        this.k = sbwVar;
        this.o = tvnVar;
        this.p = kglVar;
        this.l = zotVar;
        this.f = pqoVar;
        this.c = new defpackage.otk(this, 5);
        this.d = new defpackage.pva(this, 4);
        this.e = new jwb(this, 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.sgq sgqVar;
        if (aolnVar instanceof defpackage.sgq) {
            sgqVar = (defpackage.sgq) aolnVar;
            int i = sgqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgqVar.c = i - Integer.MIN_VALUE;
            } else {
                sgqVar = new defpackage.sgq(this, aolnVar);
            }
        } else {
            sgqVar = new defpackage.sgq(this, aolnVar);
        }
        java.lang.Object objE = sgqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgqVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            sgqVar.c = 1;
            objE = e(sgqVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        return new defpackage.sql((defpackage.spn) objE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.sgr sgrVar;
        alat alatVar;
        if (aolnVar instanceof defpackage.sgr) {
            sgrVar = (defpackage.sgr) aolnVar;
            int i = sgrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgrVar.c = i - Integer.MIN_VALUE;
            } else {
                sgrVar = new defpackage.sgr(this, aolnVar);
            }
        } else {
            sgrVar = new defpackage.sgr(this, aolnVar);
        }
        java.lang.Object objE = sgrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgrVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            sgrVar.c = 1;
            objE = e(sgrVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        defpackage.spe speVarA = defpackage.sns.a((defpackage.spo) objE);
        if (speVarA == null || (alatVar = speVarA.b) == null) {
            return null;
        }
        return (defpackage.spd) ajsz.bG(alatVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v28 */
    public final java.lang.Object c(java.lang.String str, aoln aolnVar) {
        defpackage.sgs sgsVar;
        java.util.List list;
        java.lang.Object objD;
        java.lang.Object obj;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        java.lang.String str2;
        java.lang.Object objC;
        java.lang.String str3;
        java.lang.String str4;
        ?? r12;
        java.lang.String str5;
        if (aolnVar instanceof defpackage.sgs) {
            sgsVar = (defpackage.sgs) aolnVar;
            int i = sgsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgsVar.e = i - Integer.MIN_VALUE;
            } else {
                sgsVar = new defpackage.sgs(this, aolnVar);
            }
        } else {
            sgsVar = new defpackage.sgs(this, aolnVar);
        }
        java.lang.Object objAF = sgsVar.c;
        aolu aoluVar = aolu.a;
        int i2 = 3;
        switch (sgsVar.e) {
            case 0:
                aooc.af(objAF);
                ipc ipcVar = this.q;
                if (str == null) {
                    sgsVar.e = 1;
                    objAF = ipcVar.aG(sgsVar);
                    if (objAF == aoluVar) {
                        return aoluVar;
                    }
                    list = (java.util.List) objAF;
                    sgsVar.a = list;
                    sgsVar.e = 3;
                    objD = d(sgsVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    obj = list;
                    objAF = objD;
                    phoneAccountHandle = (android.telecom.PhoneAccountHandle) objAF;
                    if (phoneAccountHandle == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 254, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                    } else {
                        sbw sbwVar = this.k;
                        sgsVar.a = obj;
                        sgsVar.b = phoneAccountHandle;
                        sgsVar.e = 4;
                        objAF = sbwVar.e(phoneAccountHandle, sgsVar);
                        if (objAF == aoluVar) {
                            return aoluVar;
                        }
                        str2 = (java.lang.String) objAF;
                        if (str2 == null) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 261, "CallingCardSharingController.kt").v("Could not get a device number from the Telecom");
                        } else {
                            sbw sbwVar2 = this.k;
                            sgsVar.a = obj;
                            sgsVar.b = str2;
                            sgsVar.e = 5;
                            objC = sbwVar2.c(phoneAccountHandle, sgsVar);
                            if (objC != aoluVar) {
                                return aoluVar;
                            }
                            objAF = objC;
                            str3 = str2;
                            sgsVar.a = obj;
                            sgsVar.b = str3;
                            sgsVar.e = 6;
                            objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                            if (objAF == aoluVar) {
                                return aoluVar;
                            }
                            str4 = str3;
                            r12 = obj;
                            str5 = (java.lang.String) objAF;
                            if (str5 == null) {
                                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                            } else {
                                if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                                    return str5;
                                }
                                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                            }
                        }
                    }
                    return null;
                }
                sgsVar.e = 2;
                objAF = ipcVar.aF(str, sgsVar);
                if (objAF == aoluVar) {
                    return aoluVar;
                }
                list = (java.util.List) objAF;
                sgsVar.a = list;
                sgsVar.e = 3;
                objD = d(sgsVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                obj = list;
                objAF = objD;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objAF;
                if (phoneAccountHandle == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 254, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                } else {
                    sbw sbwVar3 = this.k;
                    sgsVar.a = obj;
                    sgsVar.b = phoneAccountHandle;
                    sgsVar.e = 4;
                    objAF = sbwVar3.e(phoneAccountHandle, sgsVar);
                    if (objAF == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objAF;
                    if (str2 == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 261, "CallingCardSharingController.kt").v("Could not get a device number from the Telecom");
                    } else {
                        sbw sbwVar4 = this.k;
                        sgsVar.a = obj;
                        sgsVar.b = str2;
                        sgsVar.e = 5;
                        objC = sbwVar4.c(phoneAccountHandle, sgsVar);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        objAF = objC;
                        str3 = str2;
                        sgsVar.a = obj;
                        sgsVar.b = str3;
                        sgsVar.e = 6;
                        objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                        if (objAF == aoluVar) {
                            return aoluVar;
                        }
                        str4 = str3;
                        r12 = obj;
                        str5 = (java.lang.String) objAF;
                        if (str5 == null) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                        } else {
                            if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                                return str5;
                            }
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                        }
                    }
                }
                return null;
            case 1:
                aooc.af(objAF);
                list = (java.util.List) objAF;
                sgsVar.a = list;
                sgsVar.e = 3;
                objD = d(sgsVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                obj = list;
                objAF = objD;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objAF;
                if (phoneAccountHandle == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 254, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                } else {
                    sbw sbwVar5 = this.k;
                    sgsVar.a = obj;
                    sgsVar.b = phoneAccountHandle;
                    sgsVar.e = 4;
                    objAF = sbwVar5.e(phoneAccountHandle, sgsVar);
                    if (objAF == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objAF;
                    if (str2 == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 261, "CallingCardSharingController.kt").v("Could not get a device number from the Telecom");
                    } else {
                        sbw sbwVar6 = this.k;
                        sgsVar.a = obj;
                        sgsVar.b = str2;
                        sgsVar.e = 5;
                        objC = sbwVar6.c(phoneAccountHandle, sgsVar);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        objAF = objC;
                        str3 = str2;
                        sgsVar.a = obj;
                        sgsVar.b = str3;
                        sgsVar.e = 6;
                        objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                        if (objAF == aoluVar) {
                            return aoluVar;
                        }
                        str4 = str3;
                        r12 = obj;
                        str5 = (java.lang.String) objAF;
                        if (str5 == null) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                        } else {
                            if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                                return str5;
                            }
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                        }
                    }
                }
                return null;
            case 2:
                aooc.af(objAF);
                list = (java.util.List) objAF;
                sgsVar.a = list;
                sgsVar.e = 3;
                objD = d(sgsVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                obj = list;
                objAF = objD;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objAF;
                if (phoneAccountHandle == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 254, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                } else {
                    sbw sbwVar7 = this.k;
                    sgsVar.a = obj;
                    sgsVar.b = phoneAccountHandle;
                    sgsVar.e = 4;
                    objAF = sbwVar7.e(phoneAccountHandle, sgsVar);
                    if (objAF == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objAF;
                    if (str2 == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 261, "CallingCardSharingController.kt").v("Could not get a device number from the Telecom");
                    } else {
                        sbw sbwVar8 = this.k;
                        sgsVar.a = obj;
                        sgsVar.b = str2;
                        sgsVar.e = 5;
                        objC = sbwVar8.c(phoneAccountHandle, sgsVar);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        objAF = objC;
                        str3 = str2;
                        sgsVar.a = obj;
                        sgsVar.b = str3;
                        sgsVar.e = 6;
                        objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                        if (objAF == aoluVar) {
                            return aoluVar;
                        }
                        str4 = str3;
                        r12 = obj;
                        str5 = (java.lang.String) objAF;
                        if (str5 == null) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                        } else {
                            if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                                return str5;
                            }
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                        }
                    }
                }
                return null;
            case 3:
                java.lang.Object obj2 = sgsVar.a;
                aooc.af(objAF);
                obj = obj2;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objAF;
                if (phoneAccountHandle == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 254, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                } else {
                    sbw sbwVar9 = this.k;
                    sgsVar.a = obj;
                    sgsVar.b = phoneAccountHandle;
                    sgsVar.e = 4;
                    objAF = sbwVar9.e(phoneAccountHandle, sgsVar);
                    if (objAF == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objAF;
                    if (str2 == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 261, "CallingCardSharingController.kt").v("Could not get a device number from the Telecom");
                    } else {
                        sbw sbwVar10 = this.k;
                        sgsVar.a = obj;
                        sgsVar.b = str2;
                        sgsVar.e = 5;
                        objC = sbwVar10.c(phoneAccountHandle, sgsVar);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        objAF = objC;
                        str3 = str2;
                        sgsVar.a = obj;
                        sgsVar.b = str3;
                        sgsVar.e = 6;
                        objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                        if (objAF == aoluVar) {
                            return aoluVar;
                        }
                        str4 = str3;
                        r12 = obj;
                        str5 = (java.lang.String) objAF;
                        if (str5 == null) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                        } else {
                            if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                                return str5;
                            }
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                        }
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) sgsVar.b;
                obj = sgsVar.a;
                aooc.af(objAF);
                str2 = (java.lang.String) objAF;
                if (str2 == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 261, "CallingCardSharingController.kt").v("Could not get a device number from the Telecom");
                } else {
                    sbw sbwVar11 = this.k;
                    sgsVar.a = obj;
                    sgsVar.b = str2;
                    sgsVar.e = 5;
                    objC = sbwVar11.c(phoneAccountHandle, sgsVar);
                    if (objC != aoluVar) {
                        return aoluVar;
                    }
                    objAF = objC;
                    str3 = str2;
                    sgsVar.a = obj;
                    sgsVar.b = str3;
                    sgsVar.e = 6;
                    objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                    if (objAF == aoluVar) {
                        return aoluVar;
                    }
                    str4 = str3;
                    r12 = obj;
                    str5 = (java.lang.String) objAF;
                    if (str5 == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                    } else {
                        if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                            return str5;
                        }
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                str3 = (java.lang.String) sgsVar.b;
                obj = sgsVar.a;
                aooc.af(objAF);
                sgsVar.a = obj;
                sgsVar.b = str3;
                sgsVar.e = 6;
                objAF = this.k.b(str3, (java.lang.String) objAF, sgsVar);
                if (objAF == aoluVar) {
                    return aoluVar;
                }
                str4 = str3;
                r12 = obj;
                str5 = (java.lang.String) objAF;
                if (str5 == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                } else {
                    if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                        return str5;
                    }
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                }
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                str4 = (java.lang.String) sgsVar.b;
                java.lang.Object obj3 = sgsVar.a;
                aooc.af(objAF);
                r12 = obj3;
                str5 = (java.lang.String) objAF;
                if (str5 == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 273, "CallingCardSharingController.kt").y("Can't convert number to e164 standard - number: %s", aais.aC(str4));
                } else {
                    if (!j$.util.Collection.-EL.stream((java.util.Collection) r12).anyMatch(new defpackage.ree(new defpackage.rzt(str5, 10), i2))) {
                        return str5;
                    }
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "getLocalVerifiedE164Number$<anonymous>", 290, "CallingCardSharingController.kt").y("Local number (e164) is not verified - number: %s", aais.aC(str5));
                }
                return null;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.sgt sgtVar;
        if (aolnVar instanceof defpackage.sgt) {
            sgtVar = (defpackage.sgt) aolnVar;
            int i = sgtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgtVar.c = i - Integer.MIN_VALUE;
            } else {
                sgtVar = new defpackage.sgt(this, aolnVar);
            }
        } else {
            sgtVar = new defpackage.sgt(this, aolnVar);
        }
        java.lang.Object objI = sgtVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgtVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objI);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            return aooh.q((j$.util.Optional) objI);
        }
        aooc.af(objI);
        sgtVar.c = 1;
        objI = i(sgtVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBe = ((defpackage.sgp) objI).be();
        sgtVar.c = 2;
        objI = aosv.D(ajcqVarBe, sgtVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objI);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.sgu sguVar;
        if (aolnVar instanceof defpackage.sgu) {
            sguVar = (defpackage.sgu) aolnVar;
            int i = sguVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sguVar.c = i - Integer.MIN_VALUE;
            } else {
                sguVar = new defpackage.sgu(this, aolnVar);
            }
        } else {
            sguVar = new defpackage.sgu(this, aolnVar);
        }
        java.lang.Object objI = sguVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sguVar.c;
        if (i2 == 0) {
            aooc.af(objI);
            sguVar.c = 1;
            objI = i(sguVar);
            if (objI != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objI);
            return objI;
        }
        aooc.af(objI);
        ajcq ajcqVarP = ((defpackage.sgp) objI).P();
        sguVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarP, sguVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.sgv sgvVar;
        if (aolnVar instanceof defpackage.sgv) {
            sgvVar = (defpackage.sgv) aolnVar;
            int i = sgvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgvVar.c = i - Integer.MIN_VALUE;
            } else {
                sgvVar = new defpackage.sgv(this, aolnVar);
            }
        } else {
            sgvVar = new defpackage.sgv(this, aolnVar);
        }
        java.lang.Object objI = sgvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objI);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            return aooh.q((j$.util.Optional) objI);
        }
        aooc.af(objI);
        sgvVar.c = 1;
        objI = i(sgvVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBn = ((defpackage.sgp) objI).bn();
        sgvVar.c = 2;
        objI = aosv.D(ajcqVarBn, sgvVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objI);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.sgw sgwVar;
        if (aolnVar instanceof defpackage.sgw) {
            sgwVar = (defpackage.sgw) aolnVar;
            int i = sgwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgwVar.c = i - Integer.MIN_VALUE;
            } else {
                sgwVar = new defpackage.sgw(this, aolnVar);
            }
        } else {
            sgwVar = new defpackage.sgw(this, aolnVar);
        }
        java.lang.Object objF = sgwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgwVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            sgwVar.c = 1;
            objF = f(sgwVar);
            if (objF != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
            return objF;
        }
        aooc.af(objF);
        hkd hkdVar = (hkd) objF;
        if (hkdVar == null) {
            return null;
        }
        sbw sbwVar = this.k;
        sgwVar.c = 2;
        java.lang.Object objA = sbwVar.a(hkdVar, sgwVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) throws aois {
        defpackage.sgx sgxVar;
        defpackage.ser serVar;
        java.lang.String str;
        android.accounts.Account account;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        defpackage.aeok aeokVar;
        if (aolnVar instanceof defpackage.sgx) {
            sgxVar = (defpackage.sgx) aolnVar;
            int i = sgxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgxVar.c = i - Integer.MIN_VALUE;
            } else {
                sgxVar = new defpackage.sgx(this, aolnVar);
            }
        } else {
            sgxVar = new defpackage.sgx(this, aolnVar);
        }
        java.lang.Object objM = sgxVar.a;
        aolu aoluVar = aolu.a;
        switch (sgxVar.c) {
            case 0:
                aooc.af(objM);
                sgxVar.c = 1;
                objM = m(sgxVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objM).booleanValue()) {
                    defpackage.sfa sfaVar = this.h;
                    sgxVar.c = 2;
                    objM = sfaVar.d(sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    serVar = (defpackage.ser) objM;
                    if (serVar != null || (account = serVar.a) == null) {
                        str = null;
                    } else {
                        str = account.name;
                    }
                    if (str == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 125, "CallingCardSharingController.kt").v("No calling card account found");
                        return aojh.a;
                    }
                    sgxVar.c = 3;
                    objM = c(str, sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objM;
                    if (str2 != null) {
                        sgxVar.d = str2;
                        sgxVar.c = 4;
                        objM = g(sgxVar);
                        if (objM == aoluVar) {
                            return aoluVar;
                        }
                        str3 = str2;
                        str4 = (java.lang.String) objM;
                        if (str4 != null) {
                            defpackage.rzs rzsVar = this.i;
                            sgxVar.d = null;
                            sgxVar.c = 5;
                            objM = aoov.aj(rzsVar.c, new njb(rzsVar, str4, str3, (aoln) null, 2), sgxVar);
                            if (objM == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) objM).booleanValue()) {
                                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 138, "CallingCardSharingController.kt").v("CallingCard ACL granted");
                                this.m.c(qbc.nK);
                                aeokVar = this.n;
                                sgxVar.c = 6;
                                if (aeokVar.b(true, sgxVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(objM);
                if (((java.lang.Boolean) objM).booleanValue()) {
                    defpackage.sfa sfaVar2 = this.h;
                    sgxVar.c = 2;
                    objM = sfaVar2.d(sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    serVar = (defpackage.ser) objM;
                    if (serVar != null) {
                        str = null;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 125, "CallingCardSharingController.kt").v("No calling card account found");
                        return aojh.a;
                    }
                    sgxVar.c = 3;
                    objM = c(str, sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objM;
                    if (str2 != null) {
                        sgxVar.d = str2;
                        sgxVar.c = 4;
                        objM = g(sgxVar);
                        if (objM == aoluVar) {
                            return aoluVar;
                        }
                        str3 = str2;
                        str4 = (java.lang.String) objM;
                        if (str4 != null) {
                            defpackage.rzs rzsVar2 = this.i;
                            sgxVar.d = null;
                            sgxVar.c = 5;
                            objM = aoov.aj(rzsVar2.c, new njb(rzsVar2, str4, str3, (aoln) null, 2), sgxVar);
                            if (objM == aoluVar) {
                                return aoluVar;
                            }
                            if (((java.lang.Boolean) objM).booleanValue()) {
                                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 138, "CallingCardSharingController.kt").v("CallingCard ACL granted");
                                this.m.c(qbc.nK);
                                aeokVar = this.n;
                                sgxVar.c = 6;
                                if (aeokVar.b(true, sgxVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case 2:
                aooc.af(objM);
                serVar = (defpackage.ser) objM;
                if (serVar != null) {
                    str = null;
                } else {
                    str = null;
                }
                if (str == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 125, "CallingCardSharingController.kt").v("No calling card account found");
                    return aojh.a;
                }
                sgxVar.c = 3;
                objM = c(str, sgxVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
                str2 = (java.lang.String) objM;
                if (str2 != null) {
                    sgxVar.d = str2;
                    sgxVar.c = 4;
                    objM = g(sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    str3 = str2;
                    str4 = (java.lang.String) objM;
                    if (str4 != null) {
                        defpackage.rzs rzsVar3 = this.i;
                        sgxVar.d = null;
                        sgxVar.c = 5;
                        objM = aoov.aj(rzsVar3.c, new njb(rzsVar3, str4, str3, (aoln) null, 2), sgxVar);
                        if (objM == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objM).booleanValue()) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 138, "CallingCardSharingController.kt").v("CallingCard ACL granted");
                            this.m.c(qbc.nK);
                            aeokVar = this.n;
                            sgxVar.c = 6;
                            if (aeokVar.b(true, sgxVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case 3:
                aooc.af(objM);
                str2 = (java.lang.String) objM;
                if (str2 != null) {
                    sgxVar.d = str2;
                    sgxVar.c = 4;
                    objM = g(sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    str3 = str2;
                    str4 = (java.lang.String) objM;
                    if (str4 != null) {
                        defpackage.rzs rzsVar4 = this.i;
                        sgxVar.d = null;
                        sgxVar.c = 5;
                        objM = aoov.aj(rzsVar4.c, new njb(rzsVar4, str4, str3, (aoln) null, 2), sgxVar);
                        if (objM == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objM).booleanValue()) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 138, "CallingCardSharingController.kt").v("CallingCard ACL granted");
                            this.m.c(qbc.nK);
                            aeokVar = this.n;
                            sgxVar.c = 6;
                            if (aeokVar.b(true, sgxVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str2 = sgxVar.d;
                aooc.af(objM);
                str3 = str2;
                str4 = (java.lang.String) objM;
                if (str4 != null) {
                    defpackage.rzs rzsVar5 = this.i;
                    sgxVar.d = null;
                    sgxVar.c = 5;
                    objM = aoov.aj(rzsVar5.c, new njb(rzsVar5, str4, str3, (aoln) null, 2), sgxVar);
                    if (objM == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objM).booleanValue()) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 138, "CallingCardSharingController.kt").v("CallingCard ACL granted");
                        this.m.c(qbc.nK);
                        aeokVar = this.n;
                        sgxVar.c = 6;
                        if (aeokVar.b(true, sgxVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(objM);
                if (((java.lang.Boolean) objM).booleanValue()) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "grantAclPermissionToCallingCard", 138, "CallingCardSharingController.kt").v("CallingCard ACL granted");
                    this.m.c(qbc.nK);
                    aeokVar = this.n;
                    sgxVar.c = 6;
                    if (aeokVar.b(true, sgxVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(objM);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.sgy sgyVar;
        if (aolnVar instanceof defpackage.sgy) {
            sgyVar = (defpackage.sgy) aolnVar;
            int i = sgyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgyVar.c = i - Integer.MIN_VALUE;
            } else {
                sgyVar = new defpackage.sgy(this, aolnVar);
            }
        } else {
            sgyVar = new defpackage.sgy(this, aolnVar);
        }
        java.lang.Object objD = sgyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.r.X();
            sgyVar.c = 1;
            objD = aosv.D(ajcqVarX, sgyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.sgp.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(aoln aolnVar) {
        defpackage.sgz sgzVar;
        if (aolnVar instanceof defpackage.sgz) {
            sgzVar = (defpackage.sgz) aolnVar;
            int i = sgzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgzVar.c = i - Integer.MIN_VALUE;
            } else {
                sgzVar = new defpackage.sgz(this, aolnVar);
            }
        } else {
            sgzVar = new defpackage.sgz(this, aolnVar);
        }
        java.lang.Object objF = sgzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = sgzVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aooc.af(objF);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objF);
                }
                return java.lang.Boolean.valueOf(((aigf) objF).values().contains(java.lang.Boolean.TRUE));
            }
            aooc.af(objF);
            sgzVar.c = 1;
            objF = f(sgzVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
            hkd hkdVar = (hkd) objF;
            if (hkdVar == null) {
                return java.lang.Boolean.FALSE;
            }
            ajcq ajcqVarK = this.p.k(aify.p(hkdVar.c), hkdVar.d);
            sgzVar.c = 2;
            objF = aosv.D(ajcqVarK, sgzVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
            return java.lang.Boolean.valueOf(((aigf) objF).values().contains(java.lang.Boolean.TRUE));
        } catch (java.lang.SecurityException e) {
            g.b().k(e).l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "isBlockedNumber", 335, "CallingCardSharingController.kt").v("Failed to check if number is blocked");
            return java.lang.Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(aoln aolnVar) {
        defpackage.sha shaVar;
        tvn tvnVar;
        if (aolnVar instanceof defpackage.sha) {
            shaVar = (defpackage.sha) aolnVar;
            int i = shaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shaVar.c = i - Integer.MIN_VALUE;
            } else {
                shaVar = new defpackage.sha(this, aolnVar);
            }
        } else {
            shaVar = new defpackage.sha(this, aolnVar);
        }
        java.lang.Object objD = shaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = shaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                tvnVar = shaVar.d;
                aooc.af(objD);
            } else if (i2 == 2) {
                tvnVar = shaVar.d;
                aooc.af(objD);
                shaVar.d = null;
                shaVar.c = 3;
                objD = tvnVar.g((android.telecom.Call.Details) objD, shaVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return java.lang.Boolean.valueOf(((uip) objD).j() == udj.c);
        }
        aooc.af(objD);
        tvn tvnVar2 = this.o;
        shaVar.d = tvnVar2;
        shaVar.c = 1;
        java.lang.Object objI = i(shaVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        objD = objI;
        tvnVar = tvnVar2;
        ajcq ajcqVarQ = ((defpackage.sgp) objD).q();
        shaVar.d = tvnVar;
        shaVar.c = 2;
        objD = aosv.D(ajcqVarQ, shaVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        shaVar.d = null;
        shaVar.c = 3;
        objD = tvnVar.g((android.telecom.Call.Details) objD, shaVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(((uip) objD).j() == udj.c);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(aoln aolnVar) {
        defpackage.shb shbVar;
        if (aolnVar instanceof defpackage.shb) {
            shbVar = (defpackage.shb) aolnVar;
            int i = shbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shbVar.c = i - Integer.MIN_VALUE;
            } else {
                shbVar = new defpackage.shb(this, aolnVar);
            }
        } else {
            shbVar = new defpackage.shb(this, aolnVar);
        }
        java.lang.Object objK = shbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = shbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objK);
            } else if (i2 == 2) {
                aooc.af(objK);
                if (((java.lang.Boolean) objK).booleanValue()) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 225, "CallingCardSharingController.kt").v("Number blocked. Not fetching CallingCard");
                    return java.lang.Boolean.FALSE;
                }
                shbVar.c = 3;
                objK = a(shbVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
                if (!((defpackage.sql) objK).q()) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 230, "CallingCardSharingController.kt").v("Number is not a contact, not fetching CallingCard");
                    return java.lang.Boolean.FALSE;
                }
                shbVar.c = 4;
                objK = c(null, shbVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                aooc.af(objK);
                if (!((defpackage.sql) objK).q()) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 230, "CallingCardSharingController.kt").v("Number is not a contact, not fetching CallingCard");
                    return java.lang.Boolean.FALSE;
                }
                shbVar.c = 4;
                objK = c(null, shbVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objK);
            }
            if (((java.lang.String) objK) == null) {
                return java.lang.Boolean.TRUE;
            }
            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 236, "CallingCardSharingController.kt").v("Local number is not verified, not fetching CallingCard");
            return java.lang.Boolean.FALSE;
        }
        aooc.af(objK);
        shbVar.c = 1;
        objK = k(shbVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 220, "CallingCardSharingController.kt").v("Number classified as Spam, not fetching CallingCard");
            return java.lang.Boolean.FALSE;
        }
        shbVar.c = 2;
        objK = j(shbVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 225, "CallingCardSharingController.kt").v("Number blocked. Not fetching CallingCard");
            return java.lang.Boolean.FALSE;
        }
        shbVar.c = 3;
        objK = a(shbVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (!((defpackage.sql) objK).q()) {
            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 230, "CallingCardSharingController.kt").v("Number is not a contact, not fetching CallingCard");
            return java.lang.Boolean.FALSE;
        }
        shbVar.c = 4;
        objK = c(null, shbVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.String) objK) == null) {
            return java.lang.Boolean.TRUE;
        }
        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldFetchMyCallingCard", 236, "CallingCardSharingController.kt").v("Local number is not verified, not fetching CallingCard");
        return java.lang.Boolean.FALSE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(aoln aolnVar) throws aois {
        defpackage.shc shcVar;
        defpackage.sfb sfbVar;
        int iOrdinal;
        if (aolnVar instanceof defpackage.shc) {
            shcVar = (defpackage.shc) aolnVar;
            int i = shcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                shcVar.c = i - Integer.MIN_VALUE;
            } else {
                shcVar = new defpackage.shc(this, aolnVar);
            }
        } else {
            shcVar = new defpackage.shc(this, aolnVar);
        }
        java.lang.Object objK = shcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = shcVar.c;
        boolean zQ = true;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objK);
            } else {
                if (i2 == 2) {
                    aooc.af(objK);
                    if (((java.lang.Boolean) objK).booleanValue()) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 197, "CallingCardSharingController.kt").v("Number blocked. Not sharing CallingCard");
                        return java.lang.Boolean.FALSE;
                    }
                    defpackage.sfa sfaVar = this.h;
                    shcVar.c = 3;
                    objK = sfaVar.g(shcVar);
                    if (objK == aoluVar) {
                        return aoluVar;
                    }
                    sfbVar = (defpackage.sfb) objK;
                    if (sfbVar == null) {
                        zQ = false;
                    } else {
                        iOrdinal = sfbVar.ordinal();
                        if (iOrdinal == 0) {
                            shcVar.c = 4;
                            objK = a(shcVar);
                            if (objK == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new aois();
                            }
                            zQ = false;
                        } else {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 203, "CallingCardSharingController.kt").v("Sharing MCC with everyone");
                        }
                    }
                    return java.lang.Boolean.valueOf(zQ);
                }
                if (i2 == 3) {
                    aooc.af(objK);
                    sfbVar = (defpackage.sfb) objK;
                    if (sfbVar == null) {
                        zQ = false;
                    } else {
                        iOrdinal = sfbVar.ordinal();
                        if (iOrdinal == 0) {
                            shcVar.c = 4;
                            objK = a(shcVar);
                            if (objK == aoluVar) {
                                return aoluVar;
                            }
                        } else if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new aois();
                            }
                            zQ = false;
                        } else {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 203, "CallingCardSharingController.kt").v("Sharing MCC with everyone");
                        }
                    }
                    return java.lang.Boolean.valueOf(zQ);
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objK);
            }
            zQ = ((defpackage.sql) objK).q();
            if (zQ) {
                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 209, "CallingCardSharingController.kt").v("Sharing MCC with contact");
            }
            return java.lang.Boolean.valueOf(zQ);
        }
        aooc.af(objK);
        shcVar.c = 1;
        objK = k(shcVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 192, "CallingCardSharingController.kt").v("Number classified as Spam, not sharing CallingCard");
            return java.lang.Boolean.FALSE;
        }
        shcVar.c = 2;
        objK = j(shcVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 197, "CallingCardSharingController.kt").v("Number blocked. Not sharing CallingCard");
            return java.lang.Boolean.FALSE;
        }
        defpackage.sfa sfaVar2 = this.h;
        shcVar.c = 3;
        objK = sfaVar2.g(shcVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        sfbVar = (defpackage.sfb) objK;
        if (sfbVar == null) {
            zQ = false;
        } else {
            iOrdinal = sfbVar.ordinal();
            if (iOrdinal == 0) {
                shcVar.c = 4;
                objK = a(shcVar);
                if (objK == aoluVar) {
                    return aoluVar;
                }
                zQ = ((defpackage.sql) objK).q();
                if (zQ) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 209, "CallingCardSharingController.kt").v("Sharing MCC with contact");
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new aois();
                }
                zQ = false;
            } else {
                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "shouldShareMyCallingCard", 203, "CallingCardSharingController.kt").v("Sharing MCC with everyone");
            }
        }
        return java.lang.Boolean.valueOf(zQ);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:65:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(aoln aolnVar) throws aois {
        defpackage.shd shdVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        java.lang.String str;
        java.lang.Object objE;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Object objG;
        java.lang.String str5;
        java.lang.String str6;
        defpackage.spd spdVar;
        java.lang.String str7;
        int iOrdinal;
        aimz aimzVar;
        defpackage.zot zotVar;
        defpackage.zor zorVar;
        if (aolnVar instanceof defpackage.shd) {
            shdVar = (defpackage.shd) aolnVar;
            int i = shdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shdVar.d = i - Integer.MIN_VALUE;
            } else {
                shdVar = new defpackage.shd(this, aolnVar);
            }
        } else {
            shdVar = new defpackage.shd(this, aolnVar);
        }
        java.lang.Object objL = shdVar.b;
        aolu aoluVar = aolu.a;
        switch (shdVar.d) {
            case 0:
                aooc.af(objL);
                shdVar.d = 1;
                objL = l(shdVar);
                if (objL == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objL).booleanValue()) {
                    shdVar.d = 2;
                    objL = d(shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle = (android.telecom.PhoneAccountHandle) objL;
                    if (phoneAccountHandle == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch$<anonymous>", 151, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                        return aojh.a;
                    }
                    sbw sbwVar = this.k;
                    shdVar.a = phoneAccountHandle;
                    shdVar.d = 3;
                    objL = sbwVar.c(phoneAccountHandle, shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    sbw sbwVar2 = this.k;
                    str = (java.lang.String) objL;
                    shdVar.a = str;
                    shdVar.d = 4;
                    objE = sbwVar2.e(phoneAccountHandle, shdVar);
                    if (objE != aoluVar) {
                        return aoluVar;
                    }
                    str2 = str;
                    objL = objE;
                    str3 = (java.lang.String) objL;
                    if (str3 != null) {
                        sbw sbwVar3 = this.k;
                        shdVar.a = null;
                        shdVar.d = 5;
                        objL = sbwVar3.b(str3, str2, shdVar);
                        if (objL == aoluVar) {
                            return aoluVar;
                        }
                        str4 = (java.lang.String) objL;
                        if (str4 != null) {
                            shdVar.a = str4;
                            shdVar.d = 6;
                            objG = g(shdVar);
                            if (objG != aoluVar) {
                                return aoluVar;
                            }
                            str5 = str4;
                            objL = objG;
                            str6 = (java.lang.String) objL;
                            if (str6 != null) {
                                shdVar.a = str5;
                                shdVar.e = str6;
                                shdVar.d = 7;
                                objL = b(shdVar);
                                if (objL == aoluVar) {
                                    return aoluVar;
                                }
                                spdVar = (defpackage.spd) objL;
                                if (spdVar != null && (str7 = spdVar.l) != null) {
                                    defpackage.ryf ryfVar = this.j;
                                    shdVar.a = null;
                                    shdVar.e = null;
                                    shdVar.d = 8;
                                    objL = ryfVar.a(str6, str7, str5, shdVar);
                                    if (objL == aoluVar) {
                                        return aoluVar;
                                    }
                                    iOrdinal = ((defpackage.rya) objL).ordinal();
                                    if (iOrdinal == 0) {
                                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                                    } else if (iOrdinal == 1) {
                                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new aois();
                                        }
                                        aimzVar = g;
                                        aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                                        zotVar = this.l;
                                        zorVar = defpackage.zor.c;
                                        if (zotVar.c.remove(zorVar) != null) {
                                            defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                            zotVar.d.a(ajcm.a);
                                        } else {
                                            aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(objL);
                if (((java.lang.Boolean) objL).booleanValue()) {
                    shdVar.d = 2;
                    objL = d(shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle = (android.telecom.PhoneAccountHandle) objL;
                    if (phoneAccountHandle == null) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch$<anonymous>", 151, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                        return aojh.a;
                    }
                    sbw sbwVar4 = this.k;
                    shdVar.a = phoneAccountHandle;
                    shdVar.d = 3;
                    objL = sbwVar4.c(phoneAccountHandle, shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    sbw sbwVar5 = this.k;
                    str = (java.lang.String) objL;
                    shdVar.a = str;
                    shdVar.d = 4;
                    objE = sbwVar5.e(phoneAccountHandle, shdVar);
                    if (objE != aoluVar) {
                        return aoluVar;
                    }
                    str2 = str;
                    objL = objE;
                    str3 = (java.lang.String) objL;
                    if (str3 != null) {
                        sbw sbwVar6 = this.k;
                        shdVar.a = null;
                        shdVar.d = 5;
                        objL = sbwVar6.b(str3, str2, shdVar);
                        if (objL == aoluVar) {
                            return aoluVar;
                        }
                        str4 = (java.lang.String) objL;
                        if (str4 != null) {
                            shdVar.a = str4;
                            shdVar.d = 6;
                            objG = g(shdVar);
                            if (objG != aoluVar) {
                                return aoluVar;
                            }
                            str5 = str4;
                            objL = objG;
                            str6 = (java.lang.String) objL;
                            if (str6 != null) {
                                shdVar.a = str5;
                                shdVar.e = str6;
                                shdVar.d = 7;
                                objL = b(shdVar);
                                if (objL == aoluVar) {
                                    return aoluVar;
                                }
                                spdVar = (defpackage.spd) objL;
                                if (spdVar != null) {
                                    defpackage.ryf ryfVar2 = this.j;
                                    shdVar.a = null;
                                    shdVar.e = null;
                                    shdVar.d = 8;
                                    objL = ryfVar2.a(str6, str7, str5, shdVar);
                                    if (objL == aoluVar) {
                                        return aoluVar;
                                    }
                                    iOrdinal = ((defpackage.rya) objL).ordinal();
                                    if (iOrdinal == 0) {
                                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                                    } else if (iOrdinal == 1) {
                                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new aois();
                                        }
                                        aimzVar = g;
                                        aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                                        zotVar = this.l;
                                        zorVar = defpackage.zor.c;
                                        if (zotVar.c.remove(zorVar) != null) {
                                            defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                            zotVar.d.a(ajcm.a);
                                        } else {
                                            aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case 2:
                aooc.af(objL);
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objL;
                if (phoneAccountHandle == null) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch$<anonymous>", 151, "CallingCardSharingController.kt").v("Could not get a phone account from the Telecom");
                    return aojh.a;
                }
                sbw sbwVar7 = this.k;
                shdVar.a = phoneAccountHandle;
                shdVar.d = 3;
                objL = sbwVar7.c(phoneAccountHandle, shdVar);
                if (objL == aoluVar) {
                    return aoluVar;
                }
                sbw sbwVar8 = this.k;
                str = (java.lang.String) objL;
                shdVar.a = str;
                shdVar.d = 4;
                objE = sbwVar8.e(phoneAccountHandle, shdVar);
                if (objE != aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objL = objE;
                str3 = (java.lang.String) objL;
                if (str3 != null) {
                    sbw sbwVar9 = this.k;
                    shdVar.a = null;
                    shdVar.d = 5;
                    objL = sbwVar9.b(str3, str2, shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    str4 = (java.lang.String) objL;
                    if (str4 != null) {
                        shdVar.a = str4;
                        shdVar.d = 6;
                        objG = g(shdVar);
                        if (objG != aoluVar) {
                            return aoluVar;
                        }
                        str5 = str4;
                        objL = objG;
                        str6 = (java.lang.String) objL;
                        if (str6 != null) {
                            shdVar.a = str5;
                            shdVar.e = str6;
                            shdVar.d = 7;
                            objL = b(shdVar);
                            if (objL == aoluVar) {
                                return aoluVar;
                            }
                            spdVar = (defpackage.spd) objL;
                            if (spdVar != null) {
                                defpackage.ryf ryfVar3 = this.j;
                                shdVar.a = null;
                                shdVar.e = null;
                                shdVar.d = 8;
                                objL = ryfVar3.a(str6, str7, str5, shdVar);
                                if (objL == aoluVar) {
                                    return aoluVar;
                                }
                                iOrdinal = ((defpackage.rya) objL).ordinal();
                                if (iOrdinal == 0) {
                                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                                } else if (iOrdinal == 1) {
                                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                                } else {
                                    if (iOrdinal != 2) {
                                        throw new aois();
                                    }
                                    aimzVar = g;
                                    aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                                    zotVar = this.l;
                                    zorVar = defpackage.zor.c;
                                    if (zotVar.c.remove(zorVar) != null) {
                                        defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                        zotVar.d.a(ajcm.a);
                                    } else {
                                        aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                                    }
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case 3:
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) shdVar.a;
                aooc.af(objL);
                sbw sbwVar10 = this.k;
                str = (java.lang.String) objL;
                shdVar.a = str;
                shdVar.d = 4;
                objE = sbwVar10.e(phoneAccountHandle, shdVar);
                if (objE != aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objL = objE;
                str3 = (java.lang.String) objL;
                if (str3 != null) {
                    sbw sbwVar11 = this.k;
                    shdVar.a = null;
                    shdVar.d = 5;
                    objL = sbwVar11.b(str3, str2, shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    str4 = (java.lang.String) objL;
                    if (str4 != null) {
                        shdVar.a = str4;
                        shdVar.d = 6;
                        objG = g(shdVar);
                        if (objG != aoluVar) {
                            return aoluVar;
                        }
                        str5 = str4;
                        objL = objG;
                        str6 = (java.lang.String) objL;
                        if (str6 != null) {
                            shdVar.a = str5;
                            shdVar.e = str6;
                            shdVar.d = 7;
                            objL = b(shdVar);
                            if (objL == aoluVar) {
                                return aoluVar;
                            }
                            spdVar = (defpackage.spd) objL;
                            if (spdVar != null) {
                                defpackage.ryf ryfVar4 = this.j;
                                shdVar.a = null;
                                shdVar.e = null;
                                shdVar.d = 8;
                                objL = ryfVar4.a(str6, str7, str5, shdVar);
                                if (objL == aoluVar) {
                                    return aoluVar;
                                }
                                iOrdinal = ((defpackage.rya) objL).ordinal();
                                if (iOrdinal == 0) {
                                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                                } else if (iOrdinal == 1) {
                                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                                } else {
                                    if (iOrdinal != 2) {
                                        throw new aois();
                                    }
                                    aimzVar = g;
                                    aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                                    zotVar = this.l;
                                    zorVar = defpackage.zor.c;
                                    if (zotVar.c.remove(zorVar) != null) {
                                        defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                        zotVar.d.a(ajcm.a);
                                    } else {
                                        aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                                    }
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                str2 = (java.lang.String) shdVar.a;
                aooc.af(objL);
                str3 = (java.lang.String) objL;
                if (str3 != null) {
                    sbw sbwVar12 = this.k;
                    shdVar.a = null;
                    shdVar.d = 5;
                    objL = sbwVar12.b(str3, str2, shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    str4 = (java.lang.String) objL;
                    if (str4 != null) {
                        shdVar.a = str4;
                        shdVar.d = 6;
                        objG = g(shdVar);
                        if (objG != aoluVar) {
                            return aoluVar;
                        }
                        str5 = str4;
                        objL = objG;
                        str6 = (java.lang.String) objL;
                        if (str6 != null) {
                            shdVar.a = str5;
                            shdVar.e = str6;
                            shdVar.d = 7;
                            objL = b(shdVar);
                            if (objL == aoluVar) {
                                return aoluVar;
                            }
                            spdVar = (defpackage.spd) objL;
                            if (spdVar != null) {
                                defpackage.ryf ryfVar5 = this.j;
                                shdVar.a = null;
                                shdVar.e = null;
                                shdVar.d = 8;
                                objL = ryfVar5.a(str6, str7, str5, shdVar);
                                if (objL == aoluVar) {
                                    return aoluVar;
                                }
                                iOrdinal = ((defpackage.rya) objL).ordinal();
                                if (iOrdinal == 0) {
                                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                                } else if (iOrdinal == 1) {
                                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                                } else {
                                    if (iOrdinal != 2) {
                                        throw new aois();
                                    }
                                    aimzVar = g;
                                    aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                                    zotVar = this.l;
                                    zorVar = defpackage.zor.c;
                                    if (zotVar.c.remove(zorVar) != null) {
                                        defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                        zotVar.d.a(ajcm.a);
                                    } else {
                                        aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                                    }
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(objL);
                str4 = (java.lang.String) objL;
                if (str4 != null) {
                    shdVar.a = str4;
                    shdVar.d = 6;
                    objG = g(shdVar);
                    if (objG != aoluVar) {
                        return aoluVar;
                    }
                    str5 = str4;
                    objL = objG;
                    str6 = (java.lang.String) objL;
                    if (str6 != null) {
                        shdVar.a = str5;
                        shdVar.e = str6;
                        shdVar.d = 7;
                        objL = b(shdVar);
                        if (objL == aoluVar) {
                            return aoluVar;
                        }
                        spdVar = (defpackage.spd) objL;
                        if (spdVar != null) {
                            defpackage.ryf ryfVar6 = this.j;
                            shdVar.a = null;
                            shdVar.e = null;
                            shdVar.d = 8;
                            objL = ryfVar6.a(str6, str7, str5, shdVar);
                            if (objL == aoluVar) {
                                return aoluVar;
                            }
                            iOrdinal = ((defpackage.rya) objL).ordinal();
                            if (iOrdinal == 0) {
                                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                            } else if (iOrdinal == 1) {
                                g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                            } else {
                                if (iOrdinal != 2) {
                                    throw new aois();
                                }
                                aimzVar = g;
                                aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                                zotVar = this.l;
                                zorVar = defpackage.zor.c;
                                if (zotVar.c.remove(zorVar) != null) {
                                    defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                    zotVar.d.a(ajcm.a);
                                } else {
                                    aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                                }
                            }
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.String str8 = (java.lang.String) shdVar.a;
                aooc.af(objL);
                str5 = str8;
                str6 = (java.lang.String) objL;
                if (str6 != null) {
                    shdVar.a = str5;
                    shdVar.e = str6;
                    shdVar.d = 7;
                    objL = b(shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    spdVar = (defpackage.spd) objL;
                    if (spdVar != null) {
                        defpackage.ryf ryfVar7 = this.j;
                        shdVar.a = null;
                        shdVar.e = null;
                        shdVar.d = 8;
                        objL = ryfVar7.a(str6, str7, str5, shdVar);
                        if (objL == aoluVar) {
                            return aoluVar;
                        }
                        iOrdinal = ((defpackage.rya) objL).ordinal();
                        if (iOrdinal == 0) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                        } else if (iOrdinal == 1) {
                            g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                        } else {
                            if (iOrdinal != 2) {
                                throw new aois();
                            }
                            aimzVar = g;
                            aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                            zotVar = this.l;
                            zorVar = defpackage.zor.c;
                            if (zotVar.c.remove(zorVar) != null) {
                                defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                                zotVar.d.a(ajcm.a);
                            } else {
                                aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                            }
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                str6 = shdVar.e;
                str5 = (java.lang.String) shdVar.a;
                aooc.af(objL);
                spdVar = (defpackage.spd) objL;
                if (spdVar != null) {
                    defpackage.ryf ryfVar8 = this.j;
                    shdVar.a = null;
                    shdVar.e = null;
                    shdVar.d = 8;
                    objL = ryfVar8.a(str6, str7, str5, shdVar);
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    iOrdinal = ((defpackage.rya) objL).ordinal();
                    if (iOrdinal == 0) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                    } else if (iOrdinal == 1) {
                        g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                    } else {
                        if (iOrdinal != 2) {
                            throw new aois();
                        }
                        aimzVar = g;
                        aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                        zotVar = this.l;
                        zorVar = defpackage.zor.c;
                        if (zotVar.c.remove(zorVar) != null) {
                            defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                            zotVar.d.a(ajcm.a);
                        } else {
                            aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                        }
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooc.af(objL);
                iOrdinal = ((defpackage.rya) objL).ordinal();
                if (iOrdinal == 0) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 185, "CallingCardSharingController.kt").v("Error fetching and storing MyCallingCard to CPG");
                } else if (iOrdinal == 1) {
                    g.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 182, "CallingCardSharingController.kt").v("MyCallingCard is already up-to-date in CPG");
                } else {
                    if (iOrdinal != 2) {
                        throw new aois();
                    }
                    aimzVar = g;
                    aimzVar.b().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 172, "CallingCardSharingController.kt").v("Successfully fetched and stored new MyCallingCard to CPG");
                    zotVar = this.l;
                    zorVar = defpackage.zor.c;
                    if (zotVar.c.remove(zorVar) != null) {
                        defpackage.zot.a.b().l("com/google/android/dialershared/incall/core/callscope/cache/BlockingInCallCache", "resetCachedValue", 117, "BlockingInCallCache.kt").y("Cache reset for key: %s", zorVar);
                        zotVar.d.a(ajcm.a);
                    } else {
                        aimzVar.d().l("com/android/dialer/patrick/impl/sharing/CallingCardSharingController", "triggerCallingCardFetch", 178, "CallingCardSharingController.kt").v("Failed to reset BlockingInCallCache for CALLING_CARD_DATA");
                    }
                }
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
