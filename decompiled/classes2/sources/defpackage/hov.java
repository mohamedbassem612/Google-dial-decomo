package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hov {
    private static final aimz a = aimz.i("com/android/dialer/androidauto/impl/incall/accountselector/CarAccountSelectorRepository");
    private final zjs b;
    private final okj c;
    private final ssq d;
    private final zpm e;
    private final suf f;
    private final rsr g;

    public hov(zpm zpmVar, suf sufVar, zjs zjsVar, okj okjVar, ssq ssqVar, rsr rsrVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(ssqVar, "phoneNumberHelper");
        this.e = zpmVar;
        this.f = sufVar;
        this.b = zjsVar;
        this.c = okjVar;
        this.d = ssqVar;
        this.g = rsrVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[PHI: r2 r4
      0x00b4: PHI (r2v5 suf) = (r2v4 suf), (r2v7 suf), (r2v7 suf) binds: [B:25:0x0095, B:29:0x00aa, B:31:0x00b2] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r4v3 hoo) = (r4v1 hoo), (r4v8 hoo), (r4v8 hoo) binds: [B:25:0x0095, B:29:0x00aa, B:31:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b  */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.hoq hoqVar;
        defpackage.hoo hooVar;
        suf sufVar;
        java.lang.String str;
        defpackage.hoo hooVar2;
        java.lang.Object objM;
        java.lang.String str2;
        j$.util.Optional optional;
        java.util.List list;
        boolean zBooleanValue;
        java.lang.Object objD;
        java.util.List list2;
        suf sufVar2;
        suc sucVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        java.util.List list3;
        if (aolnVar instanceof defpackage.hoq) {
            hoqVar = (defpackage.hoq) aolnVar;
            int i = hoqVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoqVar.f = i - Integer.MIN_VALUE;
            } else {
                hoqVar = new defpackage.hoq(this, aolnVar);
            }
        } else {
            hoqVar = new defpackage.hoq(this, aolnVar);
        }
        java.lang.Object objF = hoqVar.d;
        aolu aoluVar = aolu.a;
        switch (hoqVar.f) {
            case 0:
                aooc.af(objF);
                aihd aihdVarB = this.e.b(zpo.h);
                aooh.e(aihdVarB, "getCallScopesWithState(...)");
                apqr apqrVar = (apqr) ajsz.bF(aihdVarB);
                if (apqrVar != null) {
                    hoqVar.f = 1;
                    objF = f(apqrVar, hoqVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    hooVar = (defpackage.hoo) objF;
                } else {
                    hooVar = null;
                }
                sufVar = this.f;
                if (hooVar != null) {
                    ajcq ajcqVarAo = hooVar.ao();
                    hoqVar.a = hooVar;
                    hoqVar.b = sufVar;
                    hoqVar.f = 2;
                    objF = aosv.D(ajcqVarAo, hoqVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    optional = (j$.util.Optional) objF;
                    if (optional != null || (str = (java.lang.String) aooh.q(optional)) == null) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                hooVar2 = hooVar;
                zjs zjsVar = this.b;
                hoqVar.a = hooVar2;
                hoqVar.b = sufVar;
                hoqVar.c = str;
                hoqVar.f = 3;
                objM = zjsVar.m(hoqVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objF = objM;
                list = (java.util.List) objF;
                if (hooVar2 != null) {
                    ajcq ajcqVarAS = hooVar2.aS();
                    hoqVar.a = sufVar;
                    hoqVar.b = str2;
                    hoqVar.c = list;
                    hoqVar.f = 4;
                    objD = aosv.D(ajcqVarAS, hoqVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    suf sufVar3 = sufVar;
                    list2 = list;
                    objF = objD;
                    sufVar2 = sufVar3;
                    suf sufVar4 = sufVar2;
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    list = list2;
                    sufVar = sufVar4;
                } else {
                    zBooleanValue = false;
                }
                ajcq ajcqVarA = sufVar.a(str2, list, zBooleanValue);
                aooh.e(ajcqVarA, "selectAccount(...)");
                hoqVar.a = null;
                hoqVar.b = null;
                hoqVar.c = null;
                hoqVar.f = 5;
                objF = aosv.D(ajcqVarA, hoqVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                sucVar = (suc) objF;
                j$.util.Optional optional2 = sucVar.a;
                aooh.e(optional2, "getSelectedPhoneAccountHandle(...)");
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional2);
                if (phoneAccountHandle != null) {
                    list3 = aokc.a;
                } else {
                    j$.util.Optional optional3 = sucVar.b;
                    aooh.e(optional3, "getDialogOptionsBuilder(...)");
                    akzx akzxVar = (akzx) aooh.q(optional3);
                    hoqVar.a = null;
                    hoqVar.f = 6;
                    objF = e(akzxVar, hoqVar);
                    if (objF != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    phoneAccountHandle = phoneAccountHandle2;
                    list3 = (java.util.List) objF;
                }
                return new defpackage.hon(phoneAccountHandle, list3);
            case 1:
                aooc.af(objF);
                hooVar = (defpackage.hoo) objF;
                sufVar = this.f;
                if (hooVar != null) {
                    ajcq ajcqVarAo2 = hooVar.ao();
                    hoqVar.a = hooVar;
                    hoqVar.b = sufVar;
                    hoqVar.f = 2;
                    objF = aosv.D(ajcqVarAo2, hoqVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    optional = (j$.util.Optional) objF;
                    if (optional != null) {
                        str = "";
                    } else {
                        str = "";
                    }
                } else {
                    str = "";
                }
                hooVar2 = hooVar;
                zjs zjsVar2 = this.b;
                hoqVar.a = hooVar2;
                hoqVar.b = sufVar;
                hoqVar.c = str;
                hoqVar.f = 3;
                objM = zjsVar2.m(hoqVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objF = objM;
                list = (java.util.List) objF;
                if (hooVar2 != null) {
                    ajcq ajcqVarAS2 = hooVar2.aS();
                    hoqVar.a = sufVar;
                    hoqVar.b = str2;
                    hoqVar.c = list;
                    hoqVar.f = 4;
                    objD = aosv.D(ajcqVarAS2, hoqVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    suf sufVar5 = sufVar;
                    list2 = list;
                    objF = objD;
                    sufVar2 = sufVar5;
                    suf sufVar6 = sufVar2;
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    list = list2;
                    sufVar = sufVar6;
                } else {
                    zBooleanValue = false;
                }
                ajcq ajcqVarA2 = sufVar.a(str2, list, zBooleanValue);
                aooh.e(ajcqVarA2, "selectAccount(...)");
                hoqVar.a = null;
                hoqVar.b = null;
                hoqVar.c = null;
                hoqVar.f = 5;
                objF = aosv.D(ajcqVarA2, hoqVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                sucVar = (suc) objF;
                j$.util.Optional optional4 = sucVar.a;
                aooh.e(optional4, "getSelectedPhoneAccountHandle(...)");
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional4);
                if (phoneAccountHandle != null) {
                    list3 = aokc.a;
                } else {
                    j$.util.Optional optional5 = sucVar.b;
                    aooh.e(optional5, "getDialogOptionsBuilder(...)");
                    akzx akzxVar2 = (akzx) aooh.q(optional5);
                    hoqVar.a = null;
                    hoqVar.f = 6;
                    objF = e(akzxVar2, hoqVar);
                    if (objF != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    phoneAccountHandle = phoneAccountHandle2;
                    list3 = (java.util.List) objF;
                }
                return new defpackage.hon(phoneAccountHandle, list3);
            case 2:
                sufVar = (suf) hoqVar.b;
                hooVar = (defpackage.hoo) hoqVar.a;
                aooc.af(objF);
                optional = (j$.util.Optional) objF;
                if (optional != null) {
                    str = "";
                } else {
                    str = "";
                }
                hooVar2 = hooVar;
                zjs zjsVar3 = this.b;
                hoqVar.a = hooVar2;
                hoqVar.b = sufVar;
                hoqVar.c = str;
                hoqVar.f = 3;
                objM = zjsVar3.m(hoqVar);
                if (objM == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                objF = objM;
                list = (java.util.List) objF;
                if (hooVar2 != null) {
                    ajcq ajcqVarAS3 = hooVar2.aS();
                    hoqVar.a = sufVar;
                    hoqVar.b = str2;
                    hoqVar.c = list;
                    hoqVar.f = 4;
                    objD = aosv.D(ajcqVarAS3, hoqVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    suf sufVar7 = sufVar;
                    list2 = list;
                    objF = objD;
                    sufVar2 = sufVar7;
                    suf sufVar8 = sufVar2;
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    list = list2;
                    sufVar = sufVar8;
                } else {
                    zBooleanValue = false;
                }
                ajcq ajcqVarA3 = sufVar.a(str2, list, zBooleanValue);
                aooh.e(ajcqVarA3, "selectAccount(...)");
                hoqVar.a = null;
                hoqVar.b = null;
                hoqVar.c = null;
                hoqVar.f = 5;
                objF = aosv.D(ajcqVarA3, hoqVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                sucVar = (suc) objF;
                j$.util.Optional optional6 = sucVar.a;
                aooh.e(optional6, "getSelectedPhoneAccountHandle(...)");
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional6);
                if (phoneAccountHandle != null) {
                    list3 = aokc.a;
                } else {
                    j$.util.Optional optional7 = sucVar.b;
                    aooh.e(optional7, "getDialogOptionsBuilder(...)");
                    akzx akzxVar3 = (akzx) aooh.q(optional7);
                    hoqVar.a = null;
                    hoqVar.f = 6;
                    objF = e(akzxVar3, hoqVar);
                    if (objF != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    phoneAccountHandle = phoneAccountHandle2;
                    list3 = (java.util.List) objF;
                }
                return new defpackage.hon(phoneAccountHandle, list3);
            case 3:
                java.lang.String str3 = (java.lang.String) hoqVar.c;
                suf sufVar9 = (suf) hoqVar.b;
                hooVar2 = (defpackage.hoo) hoqVar.a;
                aooc.af(objF);
                str2 = str3;
                sufVar = sufVar9;
                list = (java.util.List) objF;
                if (hooVar2 != null) {
                    ajcq ajcqVarAS4 = hooVar2.aS();
                    hoqVar.a = sufVar;
                    hoqVar.b = str2;
                    hoqVar.c = list;
                    hoqVar.f = 4;
                    objD = aosv.D(ajcqVarAS4, hoqVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    suf sufVar10 = sufVar;
                    list2 = list;
                    objF = objD;
                    sufVar2 = sufVar10;
                    suf sufVar11 = sufVar2;
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    list = list2;
                    sufVar = sufVar11;
                } else {
                    zBooleanValue = false;
                }
                ajcq ajcqVarA4 = sufVar.a(str2, list, zBooleanValue);
                aooh.e(ajcqVarA4, "selectAccount(...)");
                hoqVar.a = null;
                hoqVar.b = null;
                hoqVar.c = null;
                hoqVar.f = 5;
                objF = aosv.D(ajcqVarA4, hoqVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                sucVar = (suc) objF;
                j$.util.Optional optional8 = sucVar.a;
                aooh.e(optional8, "getSelectedPhoneAccountHandle(...)");
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional8);
                if (phoneAccountHandle != null) {
                    list3 = aokc.a;
                } else {
                    j$.util.Optional optional9 = sucVar.b;
                    aooh.e(optional9, "getDialogOptionsBuilder(...)");
                    akzx akzxVar4 = (akzx) aooh.q(optional9);
                    hoqVar.a = null;
                    hoqVar.f = 6;
                    objF = e(akzxVar4, hoqVar);
                    if (objF != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    phoneAccountHandle = phoneAccountHandle2;
                    list3 = (java.util.List) objF;
                }
                return new defpackage.hon(phoneAccountHandle, list3);
            case 4:
                list2 = (java.util.List) hoqVar.c;
                str2 = (java.lang.String) hoqVar.b;
                sufVar2 = (suf) hoqVar.a;
                aooc.af(objF);
                suf sufVar12 = sufVar2;
                zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                list = list2;
                sufVar = sufVar12;
                ajcq ajcqVarA5 = sufVar.a(str2, list, zBooleanValue);
                aooh.e(ajcqVarA5, "selectAccount(...)");
                hoqVar.a = null;
                hoqVar.b = null;
                hoqVar.c = null;
                hoqVar.f = 5;
                objF = aosv.D(ajcqVarA5, hoqVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                sucVar = (suc) objF;
                j$.util.Optional optional10 = sucVar.a;
                aooh.e(optional10, "getSelectedPhoneAccountHandle(...)");
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional10);
                if (phoneAccountHandle != null) {
                    list3 = aokc.a;
                } else {
                    j$.util.Optional optional11 = sucVar.b;
                    aooh.e(optional11, "getDialogOptionsBuilder(...)");
                    akzx akzxVar5 = (akzx) aooh.q(optional11);
                    hoqVar.a = null;
                    hoqVar.f = 6;
                    objF = e(akzxVar5, hoqVar);
                    if (objF != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    phoneAccountHandle = phoneAccountHandle2;
                    list3 = (java.util.List) objF;
                }
                return new defpackage.hon(phoneAccountHandle, list3);
            case 5:
                aooc.af(objF);
                sucVar = (suc) objF;
                j$.util.Optional optional12 = sucVar.a;
                aooh.e(optional12, "getSelectedPhoneAccountHandle(...)");
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q(optional12);
                if (phoneAccountHandle != null) {
                    list3 = aokc.a;
                } else {
                    j$.util.Optional optional13 = sucVar.b;
                    aooh.e(optional13, "getDialogOptionsBuilder(...)");
                    akzx akzxVar6 = (akzx) aooh.q(optional13);
                    hoqVar.a = null;
                    hoqVar.f = 6;
                    objF = e(akzxVar6, hoqVar);
                    if (objF != aoluVar) {
                        return aoluVar;
                    }
                    phoneAccountHandle2 = phoneAccountHandle;
                    phoneAccountHandle = phoneAccountHandle2;
                    list3 = (java.util.List) objF;
                }
                return new defpackage.hon(phoneAccountHandle, list3);
            case 6:
                phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) hoqVar.a;
                aooc.af(objF);
                phoneAccountHandle = phoneAccountHandle2;
                list3 = (java.util.List) objF;
                return new defpackage.hon(phoneAccountHandle, list3);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.hor horVar;
        java.lang.String countryIso;
        java.lang.String strV;
        if (aolnVar instanceof defpackage.hor) {
            horVar = (defpackage.hor) aolnVar;
            int i = horVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                horVar.c = i - Integer.MIN_VALUE;
            } else {
                horVar = new defpackage.hor(this, aolnVar);
            }
        } else {
            horVar = new defpackage.hor(this, aolnVar);
        }
        java.lang.Object objL = horVar.a;
        aolu aoluVar = aolu.a;
        int i2 = horVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objL);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objL);
            }
            return ahvr.v((java.lang.String) objL);
        }
        aooc.af(objL);
        okj okjVar = this.c;
        horVar.c = 1;
        objL = okjVar.l(phoneAccountHandle, horVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        android.telephony.SubscriptionInfo subscriptionInfo = (android.telephony.SubscriptionInfo) objL;
        if (subscriptionInfo != null && (countryIso = subscriptionInfo.getCountryIso()) != null && (strV = ahvr.v(countryIso)) != null) {
            return strV;
        }
        rsr rsrVar = this.g;
        horVar.c = 2;
        objL = rsrVar.b(horVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        return ahvr.v((java.lang.String) objL);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r12 != r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.telecom.PhoneAccountHandle r11, aoln r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.hot
            if (r0 == 0) goto L13
            r0 = r12
            hot r0 = (defpackage.hot) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hot r0 = new hot
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            aolu r1 = aolu.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "getNumberFromSubscriptionInfo"
            r5 = 3
            r6 = 2
            r7 = 1
            java.lang.String r8 = "com/android/dialer/androidauto/impl/incall/accountselector/CarAccountSelectorRepository"
            java.lang.String r9 = "CarAccountSelectorRepository.kt"
            if (r2 == 0) goto L44
            if (r2 == r7) goto L40
            if (r2 == r6) goto L3c
            if (r2 != r5) goto L34
            aooc.af(r12)
            return r12
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            aooc.af(r12)
            goto L7d
        L40:
            aooc.af(r12)
            goto L6a
        L44:
            aooc.af(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r12 >= r2) goto L73
            aimz r12 = defpackage.hov.a
            ainm r12 = r12.b()
            r2 = 108(0x6c, float:1.51E-43)
            ainm r12 = r12.l(r8, r4, r2, r9)
            aimw r12 = (aimw) r12
            java.lang.String r2 = "getSchemeSpecificPart is empty. use fallback from SubscriptionManager.getSubscriptionInfo.getNumber"
            r12.v(r2)
            okj r10 = r10.c
            r0.c = r7
            java.lang.Object r12 = r10.l(r11, r0)
            if (r12 == r1) goto Lba
        L6a:
            android.telephony.SubscriptionInfo r12 = (android.telephony.SubscriptionInfo) r12
            if (r12 == 0) goto Lb8
            java.lang.String r12 = r12.getNumber()
            goto Lbb
        L73:
            okj r12 = r10.c
            r0.c = r6
            java.lang.Object r12 = r12.l(r11, r0)
            if (r12 == r1) goto Lba
        L7d:
            android.telephony.SubscriptionInfo r12 = (android.telephony.SubscriptionInfo) r12
            if (r12 == 0) goto La5
            int r11 = r12.getSubscriptionId()
            aimz r12 = defpackage.hov.a
            ainm r12 = r12.b()
            java.lang.String r2 = "getNumberFromSubscriptionInfo$<anonymous>"
            r3 = 119(0x77, float:1.67E-43)
            ainm r12 = r12.l(r8, r2, r3, r9)
            aimw r12 = (aimw) r12
            java.lang.String r2 = "getSchemeSpecificPart is empty. use fallback from SubscriptionManager.getPhoneNumber"
            r12.v(r2)
            okj r10 = r10.c
            r0.c = r5
            java.lang.Object r12 = r10.j(r11, r0)
            if (r12 != r1) goto Lbb
            goto Lba
        La5:
            aimz r10 = defpackage.hov.a
            ainm r10 = r10.d()
            r11 = 127(0x7f, float:1.78E-43)
            ainm r10 = r10.l(r8, r4, r11, r9)
            aimw r10 = (aimw) r10
            java.lang.String r11 = "getSchemeSpecificPart is empty. use fallback from SubscriptionManager.getPhoneNumber, but subscriptionId is empty for the phone account"
            r10.v(r11)
        Lb8:
            r12 = r3
            goto Lbb
        Lba:
            r12 = r1
        Lbb:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hov.c(android.telecom.PhoneAccountHandle, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.net.Uri uri, android.telecom.PhoneAccountHandle phoneAccountHandle, aoln aolnVar) {
        defpackage.hou houVar;
        java.lang.String schemeSpecificPart;
        ssq ssqVar;
        java.lang.Object objB;
        java.lang.String str;
        ssq ssqVar2;
        if (aolnVar instanceof defpackage.hou) {
            houVar = (defpackage.hou) aolnVar;
            int i = houVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                houVar.d = i - Integer.MIN_VALUE;
            } else {
                houVar = new defpackage.hou(this, aolnVar);
            }
        } else {
            houVar = new defpackage.hou(this, aolnVar);
        }
        java.lang.Object objC = houVar.b;
        aolu aoluVar = aolu.a;
        int i2 = houVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) houVar.a;
                aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = houVar.e;
                ssqVar2 = (ssq) houVar.a;
                aooc.af(objC);
            }
            return ssqVar2.a(str, (java.lang.String) objC);
        }
        aooc.af(objC);
        if (uri != null) {
            schemeSpecificPart = uri.getSchemeSpecificPart();
            aooh.c(schemeSpecificPart);
            if (schemeSpecificPart.length() == 0) {
                houVar.a = phoneAccountHandle;
                houVar.d = 1;
                objC = c(phoneAccountHandle, houVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
            } else if (schemeSpecificPart != null && schemeSpecificPart.length() != 0) {
                ssqVar = this.d;
                houVar.a = ssqVar;
                houVar.e = schemeSpecificPart;
                houVar.d = 2;
                objB = b(phoneAccountHandle, houVar);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objC = objB;
                str = schemeSpecificPart;
                ssqVar2 = ssqVar;
                return ssqVar2.a(str, (java.lang.String) objC);
            }
        }
        return null;
        schemeSpecificPart = (java.lang.String) objC;
        if (schemeSpecificPart != null) {
            ssqVar = this.d;
            houVar.a = ssqVar;
            houVar.e = schemeSpecificPart;
            houVar.d = 2;
            objB = b(phoneAccountHandle, houVar);
            if (objB != aoluVar) {
                return aoluVar;
            }
            objC = objB;
            str = schemeSpecificPart;
            ssqVar2 = ssqVar;
            return ssqVar2.a(str, (java.lang.String) objC);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:21:0x006d->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b4 -> B:33:0x00bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d3 -> B:21:0x006d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(akzx r13, aoln r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hov.e(akzx, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(apqr apqrVar, aoln aolnVar) {
        defpackage.hos hosVar;
        defpackage.hkl hklVar;
        afpl afplVarLD;
        if (aolnVar instanceof defpackage.hos) {
            hosVar = (defpackage.hos) aolnVar;
            int i = hosVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hosVar.c = i - Integer.MIN_VALUE;
            } else {
                hosVar = new defpackage.hos(this, aolnVar);
            }
        } else {
            hosVar = new defpackage.hos(this, aolnVar);
        }
        java.lang.Object objD = hosVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hosVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            defpackage.hom homVar = (defpackage.hom) apqrVar.a(defpackage.hom.class);
            hklVar = null;
            if (homVar != null && (afplVarLD = homVar.lD()) != null) {
                ajcq ajcqVarX = afplVarLD.X();
                hosVar.c = 1;
                objD = aosv.D(ajcqVarX, hosVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            if (hklVar != null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            java.lang.Object objAr = aooc.ar(hklVar, defpackage.hoo.class);
            aooh.e(objAr, "get(...)");
            return objAr;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        hklVar = (defpackage.hkl) objD;
        if (hklVar != null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        java.lang.Object objAr2 = aooc.ar(hklVar, defpackage.hoo.class);
        aooh.e(objAr2, "get(...)");
        return objAr2;
    }
}
