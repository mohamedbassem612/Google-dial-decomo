package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ujb implements defpackage.ucr {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/stirshaken/StirShakenSpam");
    public final defpackage.aolr b;
    public final defpackage.aoss c;
    public final defpackage.tvn d;
    private final defpackage.jql e;
    private final defpackage.rlv f;
    private final defpackage.oko g;

    public ujb(defpackage.jql jqlVar, defpackage.tvn tvnVar, defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.rlv rlvVar, defpackage.aais aaisVar, defpackage.oko okoVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (aaisVar == null) {
            defpackage.aooh.i("sanitizer");
        }
        this.e = jqlVar;
        this.d = tvnVar;
        this.b = aolrVar;
        this.c = aossVar;
        this.f = rlvVar;
        this.g = okoVar;
    }

    @Override // defpackage.ucr
    public final /* synthetic */ defpackage.ajcq a(defpackage.aify aifyVar) {
        throw null;
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq b(defpackage.aihd aihdVar) {
        throw null;
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq c(android.telecom.Call.Details details) {
        throw null;
    }

    @Override // defpackage.ucr
    public final /* synthetic */ defpackage.ajcq d(j$.time.Instant instant, defpackage.udj udjVar) {
        throw null;
    }

    @Override // defpackage.ucr
    public final defpackage.ajcq e(defpackage.akzx akzxVar) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object f(android.telecom.Call.Details details, defpackage.aoln aolnVar) {
        uiy uiyVar;
        int iM;
        defpackage.udk udkVar;
        defpackage.uin uinVar;
        defpackage.uin uinVar2;
        defpackage.udk udkVar2;
        java.lang.Object obj;
        android.telecom.Call.Details details2 = details;
        if (aolnVar instanceof uiy) {
            uiyVar = (uiy) aolnVar;
            int i = uiyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                uiyVar.d = i - Integer.MIN_VALUE;
            } else {
                uiyVar = new uiy(this, aolnVar);
            }
        } else {
            uiyVar = new uiy(this, aolnVar);
        }
        java.lang.Object objH = uiyVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = uiyVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objH);
            java.lang.String strB = ura.b(details2);
            defpackage.aimz aimzVar = a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/stirshaken/StirShakenSpam", "getSpamStatus", 86, "StirShakenSpam.kt")).y("number: %s", defpackage.aais.aC(strB));
            if (android.os.Build.VERSION.SDK_INT <= 30) {
                if (android.os.Build.VERSION.SDK_INT > 30 || details2.getExtras() == null) {
                    uinVar2 = null;
                } else {
                    int i3 = details2.getExtras().getInt("VerstatVerificationStatus", 0);
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/stirshaken/StirShakenSpam", "getSpamStatusFromQCommExtras", 120, "StirShakenSpam.kt")).w("verstat extra value: %d", i3);
                    if (i3 != 0) {
                        this.f.o(defpackage.rmx.STIR_SHAKEN_FROM_QCOMM_EXTRA);
                        defpackage.udj udjVar = defpackage.udj.SPAM_STATUS_UNKNOWN;
                        if (i3 != 1) {
                            udkVar2 = i3 != 2 ? defpackage.udk.STIR_SHAKEN_UNKNOWN : defpackage.udk.STIR_SHAKEN_FAILED;
                        } else {
                            udkVar2 = defpackage.udk.STIR_SHAKEN_VERIFIED;
                        }
                        uinVar2 = new defpackage.uin(udjVar, 0, null, defpackage.ttj.F(udkVar2), 6);
                    } else {
                        uinVar2 = null;
                    }
                }
                if (uinVar2 != null) {
                    return uinVar2;
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                defpackage.aooh.f(details2, "callDetails");
                iM = baa$.ExternalSyntheticApiModelOutline1.m(details2);
            } else {
                iM = baa$.ExternalSyntheticApiModelOutline1.m(details2);
            }
            if (iM != 1) {
                udkVar = iM != 2 ? defpackage.udk.STIR_SHAKEN_UNKNOWN : defpackage.udk.STIR_SHAKEN_FAILED;
            } else {
                udkVar = defpackage.udk.STIR_SHAKEN_VERIFIED;
            }
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/spam/stirshaken/StirShakenSpam$Companion", "fromVerificationStatus", 250, "StirShakenSpam.kt")).y("Stir/Shaken status from verification status: %s", udkVar);
            uinVar = new defpackage.uin(defpackage.udj.SPAM_STATUS_UNKNOWN, 0, null, defpackage.ttj.F(udkVar), 6);
            if (android.os.Build.VERSION.SDK_INT == 30) {
                uiyVar.a = details2;
                uiyVar.e = uinVar;
                uiyVar.d = 1;
                objH = h(details2, uiyVar);
                if (objH != aoluVar) {
                }
                obj = details2;
                return aoluVar;
            }
            defpackage.uin uinVar3 = uinVar;
            this.f.o(defpackage.rmx.STIR_SHAKEN_FROM_VERIFICATION_STATUS);
            return uinVar3;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objH);
            return objH;
        }
        defpackage.uin uinVar4 = uiyVar.e;
        java.lang.Object obj2 = uiyVar.a;
        defpackage.aooc.af(objH);
        uinVar = uinVar4;
        obj = obj2;
        obj = details2;
        if (((java.lang.Boolean) objH).booleanValue()) {
            defpackage.udk udkVarB = defpackage.udk.b(((defpackage.udm) defpackage.aooh.p(uinVar.b.f(), defpackage.wsc.cc(defpackage.udm.a.m()).k())).f);
            if (udkVarB == null) {
                udkVarB = defpackage.udk.STIR_SHAKEN_UNKNOWN;
            }
            if (udkVarB == defpackage.udk.STIR_SHAKEN_UNKNOWN) {
                uiyVar.a = null;
                uiyVar.e = null;
                uiyVar.d = 2;
                java.lang.Object objG = g((android.telecom.Call.Details) obj, uiyVar);
                if (objG != aoluVar) {
                    return objG;
                }
                obj = details2;
                return aoluVar;
            }
        }
        defpackage.uin uinVar5 = uinVar;
        this.f.o(defpackage.rmx.STIR_SHAKEN_FROM_VERIFICATION_STATUS);
        return uinVar5;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0219, code lost:
    
        r5 = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.telecom.Call.Details r18, defpackage.aoln r19) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujb.g(android.telecom.Call$Details, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(android.telecom.Call.Details details, defpackage.aoln aolnVar) {
        uja ujaVar;
        if (aolnVar instanceof uja) {
            ujaVar = (uja) aolnVar;
            int i = ujaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujaVar.c = i - Integer.MIN_VALUE;
            } else {
                ujaVar = new uja(this, aolnVar);
            }
        } else {
            ujaVar = new uja(this, aolnVar);
        }
        java.lang.Object objO = ujaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ujaVar.c;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objO);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objO);
            }
            if (((java.lang.Number) objO).intValue() == 1989) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        defpackage.aooc.af(objO);
        android.telecom.PhoneAccountHandle accountHandle = details.getAccountHandle();
        if (accountHandle == null) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.oko okoVar = this.g;
        ujaVar.c = 1;
        objO = okoVar.O(accountHandle, ujaVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        defpackage.oko okoVar2 = (defpackage.oko) objO;
        if (okoVar2 != null) {
            ujaVar.c = 2;
            objO = okoVar2.H(ujaVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Number) objO).intValue() == 1989) {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }
}
