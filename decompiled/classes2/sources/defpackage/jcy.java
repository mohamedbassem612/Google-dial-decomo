package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcy {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/shared/RoamingChecker");
    public final oko b;
    private final aoin c;
    private final aolr d;
    private final zpm e;

    public jcy(aoin aoinVar, oko okoVar, zpm zpmVar, aolr aolrVar) {
        aooh.f(aoinVar, "bypassRoamingCheck");
        aooh.f(zpmVar, "callScopes");
        aooh.f(aolrVar, "blockingContext");
        this.c = aoinVar;
        this.b = okoVar;
        this.e = zpmVar;
        this.d = aolrVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.jcv jcvVar;
        java.lang.String str;
        java.lang.Object objP;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.jcv) {
            jcvVar = (defpackage.jcv) aolnVar;
            int i = jcvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jcvVar.d = i - Integer.MIN_VALUE;
            } else {
                jcvVar = new defpackage.jcv(this, aolnVar);
            }
        } else {
            jcvVar = new defpackage.jcv(this, aolnVar);
        }
        java.lang.Object objAj = jcvVar.b;
        aolu aoluVar = aolu.a;
        int i2 = jcvVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) jcvVar.a;
                aooc.af(objAj);
            } else if (i2 == 2) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) jcvVar.a;
                aooc.af(objAj);
                jcvVar.a = phoneAccountHandle;
                jcvVar.d = 3;
                objAj = ((oko) objAj).I(jcvVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                str = (java.lang.String) objAj;
                oko okoVar = this.b;
                jcvVar.a = str;
                jcvVar.d = 4;
                objP = okoVar.P(phoneAccountHandle, jcvVar);
                if (objP == aoluVar) {
                    return aoluVar;
                }
                java.lang.String str3 = str;
                objAj = objP;
                str2 = str3;
                jcvVar.a = str2;
                jcvVar.d = 5;
                objAj = ((oko) objAj).G(jcvVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) jcvVar.a;
                aooc.af(objAj);
                str = (java.lang.String) objAj;
                oko okoVar2 = this.b;
                jcvVar.a = str;
                jcvVar.d = 4;
                objP = okoVar2.P(phoneAccountHandle, jcvVar);
                if (objP == aoluVar) {
                    return aoluVar;
                }
                java.lang.String str4 = str;
                objAj = objP;
                str2 = str4;
                jcvVar.a = str2;
                jcvVar.d = 5;
                objAj = ((oko) objAj).G(jcvVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 4) {
                str2 = (java.lang.String) jcvVar.a;
                aooc.af(objAj);
                jcvVar.a = str2;
                jcvVar.d = 5;
                objAj = ((oko) objAj).G(jcvVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) jcvVar.a;
                aooc.af(objAj);
            }
            java.lang.String str5 = (java.lang.String) objAj;
            return (str5 != null || aoov.H(str5)) ? java.lang.Boolean.TRUE : java.lang.Boolean.valueOf(aoov.s(str2, str5, false));
        }
        aooc.af(objAj);
        jcvVar.a = phoneAccountHandle;
        jcvVar.d = 1;
        if (android.os.Build.VERSION.SDK_INT > 33) {
            a.b().l("com/android/dialer/beesly/impl/shared/RoamingChecker", "getSimCountryOverride", 108, "RoamingChecker.kt").v("Ignore checking sim country override");
            objAj = null;
        } else {
            objAj = aoov.aj(this.d, new defpackage.jcu(this, phoneAccountHandle, (aoln) null, 0), jcvVar);
        }
        if (objAj == aoluVar) {
            return aoluVar;
        }
        str = (java.lang.String) objAj;
        if (str == null) {
            oko okoVar3 = this.b;
            jcvVar.a = phoneAccountHandle;
            jcvVar.d = 2;
            objAj = okoVar3.P(phoneAccountHandle, jcvVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            jcvVar.a = phoneAccountHandle;
            jcvVar.d = 3;
            objAj = ((oko) objAj).I(jcvVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objAj;
        }
        oko okoVar4 = this.b;
        jcvVar.a = str;
        jcvVar.d = 4;
        objP = okoVar4.P(phoneAccountHandle, jcvVar);
        if (objP == aoluVar) {
            return aoluVar;
        }
        java.lang.String str6 = str;
        objAj = objP;
        str2 = str6;
        jcvVar.a = str2;
        jcvVar.d = 5;
        objAj = ((oko) objAj).G(jcvVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        java.lang.String str7 = (java.lang.String) objAj;
        if (str7 != null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.jcx jcxVar;
        if (aolnVar instanceof defpackage.jcx) {
            jcxVar = (defpackage.jcx) aolnVar;
            int i = jcxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jcxVar.c = i - Integer.MIN_VALUE;
            } else {
                jcxVar = new defpackage.jcx(this, aolnVar);
            }
        } else {
            jcxVar = new defpackage.jcx(this, aolnVar);
        }
        java.lang.Object objD = jcxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jcxVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            zpm zpmVar = this.e;
            j$.util.Optional optionalH = zpmVar.h();
            if (!optionalH.isPresent()) {
                return null;
            }
            aooh.c(optionalH);
            if (!optionalH.isPresent()) {
                throw new java.lang.IllegalArgumentException("CallScope required");
            }
            ajcq ajcqVarK = zpmVar.k((apqr) optionalH.get(), defpackage.jct.class, new defpackage.iry(2));
            aooh.e(ajcqVarK, "fromCallProductionComponent(...)");
            jcxVar.c = 1;
            objD = aosv.D(ajcqVarK, jcxVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.jcw jcwVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        oko okoVar;
        java.lang.Object objP;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        java.lang.Object objG;
        java.lang.Object obj;
        boolean z;
        if (aolnVar instanceof defpackage.jcw) {
            jcwVar = (defpackage.jcw) aolnVar;
            int i = jcwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jcwVar.d = i - Integer.MIN_VALUE;
            } else {
                jcwVar = new defpackage.jcw(this, aolnVar);
            }
        } else {
            jcwVar = new defpackage.jcw(this, aolnVar);
        }
        java.lang.Object objB = jcwVar.b;
        aolu aoluVar = aolu.a;
        switch (jcwVar.d) {
            case 0:
                aooc.af(objB);
                if (((java.lang.Boolean) this.c.a()).booleanValue()) {
                    return java.lang.Boolean.FALSE;
                }
                jcwVar.d = 1;
                objB = b(jcwVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objB;
                okoVar = this.b;
                if (phoneAccountHandle == null) {
                    jcwVar.a = phoneAccountHandle;
                    jcwVar.d = 5;
                    objP = okoVar.P(phoneAccountHandle, jcwVar);
                    if (objP != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    objB = objP;
                    jcwVar.a = phoneAccountHandle2;
                    jcwVar.d = 6;
                    objB = ((oko) objB).L(jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objB).booleanValue()) {
                        jcwVar.a = null;
                        jcwVar.d = 7;
                        objB = a(phoneAccountHandle2, jcwVar);
                        if (objB == aoluVar) {
                            return aoluVar;
                        }
                        z = ((java.lang.Boolean) objB).booleanValue() ? false : true;
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                jcwVar.d = 2;
                objB = okoVar.L(jcwVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objB).booleanValue()) {
                    oko okoVar2 = this.b;
                    jcwVar.d = 3;
                    objB = okoVar2.I(jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    oko okoVar3 = this.b;
                    jcwVar.a = objB;
                    jcwVar.d = 4;
                    objG = okoVar3.G(jcwVar);
                    if (objG != aoluVar) {
                        return aoluVar;
                    }
                    java.lang.Object obj2 = objB;
                    objB = objG;
                    obj = obj2;
                    z = aooh.n(obj, objB) ? false : true;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                aooc.af(objB);
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) objB;
                okoVar = this.b;
                if (phoneAccountHandle == null) {
                    jcwVar.a = phoneAccountHandle;
                    jcwVar.d = 5;
                    objP = okoVar.P(phoneAccountHandle, jcwVar);
                    if (objP != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    objB = objP;
                    jcwVar.a = phoneAccountHandle2;
                    jcwVar.d = 6;
                    objB = ((oko) objB).L(jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objB).booleanValue()) {
                        jcwVar.a = null;
                        jcwVar.d = 7;
                        objB = a(phoneAccountHandle2, jcwVar);
                        if (objB == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objB).booleanValue()) {
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                jcwVar.d = 2;
                objB = okoVar.L(jcwVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objB).booleanValue()) {
                    oko okoVar4 = this.b;
                    jcwVar.d = 3;
                    objB = okoVar4.I(jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    oko okoVar5 = this.b;
                    jcwVar.a = objB;
                    jcwVar.d = 4;
                    objG = okoVar5.G(jcwVar);
                    if (objG != aoluVar) {
                        return aoluVar;
                    }
                    java.lang.Object obj3 = objB;
                    objB = objG;
                    obj = obj3;
                    if (aooh.n(obj, objB)) {
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                aooc.af(objB);
                if (!((java.lang.Boolean) objB).booleanValue()) {
                    oko okoVar6 = this.b;
                    jcwVar.d = 3;
                    objB = okoVar6.I(jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    oko okoVar7 = this.b;
                    jcwVar.a = objB;
                    jcwVar.d = 4;
                    objG = okoVar7.G(jcwVar);
                    if (objG != aoluVar) {
                        return aoluVar;
                    }
                    java.lang.Object obj4 = objB;
                    objB = objG;
                    obj = obj4;
                    if (aooh.n(obj, objB)) {
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 3:
                aooc.af(objB);
                oko okoVar8 = this.b;
                jcwVar.a = objB;
                jcwVar.d = 4;
                objG = okoVar8.G(jcwVar);
                if (objG != aoluVar) {
                    return aoluVar;
                }
                java.lang.Object obj5 = objB;
                objB = objG;
                obj = obj5;
                if (aooh.n(obj, objB)) {
                }
                return java.lang.Boolean.valueOf(z);
            case 4:
                obj = jcwVar.a;
                aooc.af(objB);
                if (aooh.n(obj, objB)) {
                }
                return java.lang.Boolean.valueOf(z);
            case 5:
                phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) jcwVar.a;
                aooc.af(objB);
                jcwVar.a = phoneAccountHandle2;
                jcwVar.d = 6;
                objB = ((oko) objB).L(jcwVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                if (!((java.lang.Boolean) objB).booleanValue()) {
                    jcwVar.a = null;
                    jcwVar.d = 7;
                    objB = a(phoneAccountHandle2, jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objB).booleanValue()) {
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 6:
                phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) jcwVar.a;
                aooc.af(objB);
                if (!((java.lang.Boolean) objB).booleanValue()) {
                    jcwVar.a = null;
                    jcwVar.d = 7;
                    objB = a(phoneAccountHandle2, jcwVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objB).booleanValue()) {
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 7:
                aooc.af(objB);
                if (((java.lang.Boolean) objB).booleanValue()) {
                }
                return java.lang.Boolean.valueOf(z);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
