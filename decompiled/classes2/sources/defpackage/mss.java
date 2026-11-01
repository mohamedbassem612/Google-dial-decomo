package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mss {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker");
    private final aolr b;
    private final oko c;

    public mss(aolr aolrVar, zjs zjsVar, oko okoVar) {
        aooh.f(aolrVar, "blockingContext");
        aooh.f(zjsVar, "dialerTelecom");
        this.b = aolrVar;
        this.c = okoVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.msq msqVar;
        oko okoVar;
        java.lang.Object objAj;
        oko okoVar2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (aolnVar instanceof defpackage.msq) {
            msqVar = (defpackage.msq) aolnVar;
            int i = msqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                msqVar.d = i - Integer.MIN_VALUE;
            } else {
                msqVar = new defpackage.msq(this, aolnVar);
            }
        } else {
            msqVar = new defpackage.msq(this, aolnVar);
        }
        java.lang.Object objP = msqVar.b;
        aolu aoluVar = aolu.a;
        int i2 = msqVar.d;
        boolean zS = true;
        if (i2 == 0) {
            aooc.af(objP);
            okoVar = this.c;
            if (phoneAccountHandle != null) {
                msqVar.d = 1;
                objP = okoVar.P(phoneAccountHandle, msqVar);
                if (objP == aoluVar) {
                    return aoluVar;
                }
            }
            msqVar.a = okoVar;
            msqVar.d = 2;
            if (android.os.Build.VERSION.SDK_INT > 33) {
                a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "getSimCountryOverride", 97, "DobbyCallRoamingChecker.kt").v("Ignore checking sim country override");
                objAj = null;
            } else {
                objAj = aoov.aj(this.b, new defpackage.muz(okoVar, (aoln) null, 1), msqVar);
            }
            if (objAj != aoluVar) {
                return aoluVar;
            }
            oko okoVar3 = okoVar;
            objP = objAj;
            okoVar2 = okoVar3;
            str = (java.lang.String) objP;
            if (str == null) {
                msqVar.a = okoVar2;
                msqVar.d = 3;
                objP = okoVar2.I(msqVar);
                if (objP == aoluVar) {
                    return aoluVar;
                }
                str = (java.lang.String) objP;
            }
            oko okoVar4 = okoVar2;
            str2 = str;
            msqVar.a = str2;
            msqVar.d = 4;
            objP = okoVar4.G(msqVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
            str3 = (java.lang.String) objP;
            a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "isInHomeCountry", 73, "DobbyCallRoamingChecker.kt").I("isInHomeCountry check: simCountryIso='%s', networkCountryIso='%s'", str2, str3);
            if (str3 != null) {
                zS = aoov.s(str2, str3, false);
            }
            return java.lang.Boolean.valueOf(zS);
        }
        if (i2 == 1) {
            aooc.af(objP);
        } else if (i2 == 2) {
            okoVar2 = (oko) msqVar.a;
            aooc.af(objP);
            str = (java.lang.String) objP;
            if (str == null) {
                msqVar.a = okoVar2;
                msqVar.d = 3;
                objP = okoVar2.I(msqVar);
                if (objP == aoluVar) {
                    return aoluVar;
                }
                str = (java.lang.String) objP;
            }
            oko okoVar5 = okoVar2;
            str2 = str;
            msqVar.a = str2;
            msqVar.d = 4;
            objP = okoVar5.G(msqVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
        } else if (i2 == 3) {
            okoVar2 = (oko) msqVar.a;
            aooc.af(objP);
            str = (java.lang.String) objP;
            oko okoVar6 = okoVar2;
            str2 = str;
            msqVar.a = str2;
            msqVar.d = 4;
            objP = okoVar6.G(msqVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 4) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) msqVar.a;
            aooc.af(objP);
        }
        str3 = (java.lang.String) objP;
        a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "isInHomeCountry", 73, "DobbyCallRoamingChecker.kt").I("isInHomeCountry check: simCountryIso='%s', networkCountryIso='%s'", str2, str3);
        if (str3 != null && !aoov.H(str3)) {
            zS = aoov.s(str2, str3, false);
        }
        return java.lang.Boolean.valueOf(zS);
        okoVar = (oko) objP;
        msqVar.a = okoVar;
        msqVar.d = 2;
        if (android.os.Build.VERSION.SDK_INT > 33) {
            a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "getSimCountryOverride", 97, "DobbyCallRoamingChecker.kt").v("Ignore checking sim country override");
            objAj = null;
        } else {
            objAj = aoov.aj(this.b, new defpackage.muz(okoVar, (aoln) null, 1), msqVar);
        }
        if (objAj != aoluVar) {
            return aoluVar;
        }
        oko okoVar7 = okoVar;
        objP = objAj;
        okoVar2 = okoVar7;
        str = (java.lang.String) objP;
        if (str == null) {
            msqVar.a = okoVar2;
            msqVar.d = 3;
            objP = okoVar2.I(msqVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objP;
        }
        oko okoVar8 = okoVar2;
        str2 = str;
        msqVar.a = str2;
        msqVar.d = 4;
        objP = okoVar8.G(msqVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        str3 = (java.lang.String) objP;
        a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "isInHomeCountry", 73, "DobbyCallRoamingChecker.kt").I("isInHomeCountry check: simCountryIso='%s', networkCountryIso='%s'", str2, str3);
        if (str3 != null) {
            zS = aoov.s(str2, str3, false);
        }
        return java.lang.Boolean.valueOf(zS);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.msr msrVar;
        oko okoVar;
        boolean zBooleanValue;
        java.lang.Object objA;
        boolean z;
        if (aolnVar instanceof defpackage.msr) {
            msrVar = (defpackage.msr) aolnVar;
            int i = msrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                msrVar.d = i - Integer.MIN_VALUE;
            } else {
                msrVar = new defpackage.msr(this, aolnVar);
            }
        } else {
            msrVar = new defpackage.msr(this, aolnVar);
        }
        java.lang.Object objP = msrVar.b;
        aolu aoluVar = aolu.a;
        int i2 = msrVar.d;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = msrVar.e;
                aooc.af(objP);
            } else if (i2 == 2) {
                phoneAccountHandle = msrVar.e;
                aooc.af(objP);
                zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
                msrVar.e = null;
                msrVar.a = zBooleanValue;
                msrVar.d = 3;
                objA = a(phoneAccountHandle, msrVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                objP = objA;
                z = zBooleanValue;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = msrVar.a;
                aooc.af(objP);
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) objP).booleanValue();
            a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "isRoamingCall", 52, "DobbyCallRoamingChecker.kt").L("isRoamingCall check: isNetworkRoaming=%s, isInHomeCountry=%s", z, zBooleanValue2);
            if (!z && zBooleanValue2) {
                z2 = false;
            }
            return java.lang.Boolean.valueOf(z2);
        }
        aooc.af(objP);
        okoVar = this.c;
        if (phoneAccountHandle != null) {
            msrVar.e = phoneAccountHandle;
            msrVar.d = 1;
            objP = okoVar.P(phoneAccountHandle, msrVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
        }
        msrVar.e = phoneAccountHandle;
        msrVar.d = 2;
        objP = okoVar.L(msrVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
        msrVar.e = null;
        msrVar.a = zBooleanValue;
        msrVar.d = 3;
        objA = a(phoneAccountHandle, msrVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        objP = objA;
        z = zBooleanValue;
        boolean zBooleanValue3 = ((java.lang.Boolean) objP).booleanValue();
        a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "isRoamingCall", 52, "DobbyCallRoamingChecker.kt").L("isRoamingCall check: isNetworkRoaming=%s, isInHomeCountry=%s", z, zBooleanValue3);
        if (!z) {
            z2 = false;
        }
        return java.lang.Boolean.valueOf(z2);
        okoVar = (oko) objP;
        msrVar.e = phoneAccountHandle;
        msrVar.d = 2;
        objP = okoVar.L(msrVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
        msrVar.e = null;
        msrVar.a = zBooleanValue;
        msrVar.d = 3;
        objA = a(phoneAccountHandle, msrVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        objP = objA;
        z = zBooleanValue;
        boolean zBooleanValue4 = ((java.lang.Boolean) objP).booleanValue();
        a.b().l("com/android/dialer/dobby/impl/callscreeningservice/DobbyCallRoamingChecker", "isRoamingCall", 52, "DobbyCallRoamingChecker.kt").L("isRoamingCall check: isNetworkRoaming=%s, isInHomeCountry=%s", z, zBooleanValue4);
        if (!z) {
            z2 = false;
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
