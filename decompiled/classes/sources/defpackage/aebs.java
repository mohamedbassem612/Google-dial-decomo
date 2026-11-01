package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aebs implements defpackage.adzz {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.apdp b;
    private final defpackage.ahyn c;
    private final defpackage.ahyn d;
    private final defpackage.aecg e;
    private final defpackage.adzw f;
    private final defpackage.aolr g;
    private final defpackage.amwu h;
    private final defpackage.adzx i;
    private final defpackage.adzf j;
    private final defpackage.adzh k;
    private final defpackage.amwu l;
    private final defpackage.aduu m;
    private final defpackage.aoin n;
    private final defpackage.adzq o;
    private final android.content.Context p;
    private final defpackage.aeey q;
    private final defpackage.aoin r;
    private final defpackage.aoin s;
    private final defpackage.adao t;
    private final defpackage.adag u;
    private final defpackage.adag v;
    private final defpackage.aogc w;
    private final defpackage.aogc x;

    public aebs(defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.aogc aogcVar, defpackage.aogc aogcVar2, defpackage.aecg aecgVar, defpackage.adzw adzwVar, defpackage.aolr aolrVar, defpackage.adao adaoVar, defpackage.amwu amwuVar, defpackage.adzx adzxVar, defpackage.adzf adzfVar, defpackage.adzh adzhVar, defpackage.adag adagVar, defpackage.amwu amwuVar2, defpackage.aazc aazcVar, defpackage.aduu aduuVar, defpackage.aoin aoinVar, defpackage.adzq adzqVar, android.content.Context context, defpackage.aeey aeeyVar, defpackage.adag adagVar2, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        defpackage.aooh.f(aogcVar, "gnpAccountUtil");
        defpackage.aooh.f(adzwVar, "deliveryAddressHelper");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(adaoVar, "gnpFcmRegistrationDataHelper");
        defpackage.aooh.f(amwuVar, "gnpFetchRegistrationDataHelper");
        defpackage.aooh.f(adzxVar, "gnpChimeRegistrator");
        defpackage.aooh.f(adzfVar, "registrationJob");
        defpackage.aooh.f(adzhVar, "gnpJobSchedulingApi");
        defpackage.aooh.f(adagVar, "gnpRegistrationStatusUpdater");
        defpackage.aooh.f(amwuVar2, "pseudonymousCookieHelper");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(aoinVar, "gnpServerHostname");
        defpackage.aooh.f(adzqVar, "registrationTokenManager");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        defpackage.aooh.f(aoinVar2, "inappPushEnabledFlag");
        defpackage.aooh.f(aoinVar3, "hasChime");
        this.c = ahynVar;
        this.d = ahynVar2;
        this.w = aogcVar;
        this.x = aogcVar2;
        this.e = aecgVar;
        this.f = adzwVar;
        this.g = aolrVar;
        this.t = adaoVar;
        this.h = amwuVar;
        this.i = adzxVar;
        this.j = adzfVar;
        this.k = adzhVar;
        this.u = adagVar;
        this.l = amwuVar2;
        this.m = aduuVar;
        this.n = aoinVar;
        this.o = adzqVar;
        this.p = context;
        this.q = aeeyVar;
        this.v = adagVar2;
        this.r = aoinVar2;
        this.s = aoinVar3;
        this.b = new defpackage.apdp();
    }

    private static final void o(defpackage.aebs aebsVar, defpackage.akti aktiVar, defpackage.aduw aduwVar, java.lang.String str) {
        ((defpackage.afip) aebsVar.q.h.eZ()).b(1L, aebsVar.p.getPackageName(), aebsVar.m.a, aktiVar.name(), str, aduwVar.name());
    }

    private final defpackage.adao p(defpackage.aduw aduwVar) {
        if (aduwVar.a()) {
            return this.t;
        }
        if (!aduwVar.b()) {
            throw new java.lang.IllegalStateException("Unsupported targetType for GnpRegistrationHandlerImpl");
        }
        java.lang.Object objA = this.h.a();
        defpackage.aooh.e(objA, "get(...)");
        return (defpackage.adao) objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.adzz
    public final java.lang.Object a(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        aebe aebeVar;
        defpackage.aeuh aeuhVar;
        if (aolnVar instanceof aebe) {
            aebeVar = (aebe) aolnVar;
            int i = aebeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebeVar.d = i - Integer.MIN_VALUE;
            } else {
                aebeVar = new aebe(this, aolnVar);
            }
        } else {
            aebeVar = new aebe(this, aolnVar);
        }
        java.lang.Object objB = aebeVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebeVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aduwVar = (defpackage.aduw) aebeVar.a;
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aeuhVar = (defpackage.aeuh) aebeVar.a;
                defpackage.aooc.af(objB);
            }
            aeuhVar.c((java.lang.String) objB);
            return defpackage.ahyn.g(aeuhVar.b());
        }
        defpackage.aooc.af(objB);
        defpackage.aeee aeeeVarX = this.x.X(aduwVar);
        aebeVar.a = aduwVar;
        aebeVar.d = 1;
        objB = aeeeVarX.b(accountRepresentation, aebeVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.adtz adtzVar = (defpackage.adtz) objB;
        if (adtzVar instanceof defpackage.adtv) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(((defpackage.adtv) adtzVar).b())).v("Failed to get account from storage.");
        }
        defpackage.aduy aduyVar = (defpackage.aduy) adtzVar.d();
        if (aduyVar == null) {
            return defpackage.ahwt.a;
        }
        defpackage.aeuh aeuhVar2 = new defpackage.aeuh(null);
        aeuhVar2.d(aduyVar.f);
        defpackage.adao adaoVarP = p(aduwVar);
        aebeVar.a = aeuhVar2;
        aebeVar.d = 2;
        java.lang.Object objE = adaoVarP.e(aebeVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        objB = objE;
        aeuhVar = aeuhVar2;
        aeuhVar.c((java.lang.String) objB);
        return defpackage.ahyn.g(aeuhVar.b());
    }

    @Override // defpackage.adzz
    public final java.lang.Object b(defpackage.akti aktiVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new aebj(this, aktiVar, aduwVar, (defpackage.aoln) null), aolnVar);
    }

    @Override // defpackage.adzz
    public final java.lang.Object c(defpackage.akti aktiVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new defpackage.aebr(this, aktiVar, aduwVar, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0151  */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b A[LOOP:0: B:70:0x0165->B:72:0x016b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0181  */
    /* JADX WARN: Code duplicated, block: B:78:0x0196  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [aeee] */
    /* JADX WARN: Type inference failed for: r1v9, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22 */
    public final java.lang.Object d(java.util.Map map, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aebd aebdVar;
        java.util.Map map2;
        defpackage.aduw aduwVar2;
        java.util.Map map3;
        java.lang.Object obj;
        defpackage.aduw aduwVar3;
        ?? r2;
        java.util.Map map4;
        defpackage.adtz adtzVar;
        int iR;
        defpackage.adtz adtzVar2;
        int iR2;
        defpackage.aduw aduwVar4 = aduwVar;
        if (aolnVar instanceof defpackage.aebd) {
            aebdVar = (defpackage.aebd) aolnVar;
            int i = aebdVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebdVar.f = i - Integer.MIN_VALUE;
            } else {
                aebdVar = new defpackage.aebd(this, aolnVar);
            }
        } else {
            aebdVar = new defpackage.aebd(this, aolnVar);
        }
        java.lang.Object objC = aebdVar.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebdVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                aduwVar4 = (defpackage.aduw) aebdVar.b;
                map2 = (java.util.Map) aebdVar.a;
                defpackage.aooc.af(objC);
            } else {
                if (i2 == 2) {
                    java.lang.Object obj2 = aebdVar.c;
                    map3 = (java.util.Map) aebdVar.b;
                    aduwVar3 = (defpackage.aduw) aebdVar.a;
                    defpackage.aooc.af(objC);
                    obj = obj2;
                    adtzVar = (defpackage.adtz) objC;
                    iR = defpackage.anty.R(adtzVar);
                    if (iR != 0) {
                        if (iR == 1) {
                            return (defpackage.adtv) adtzVar;
                        }
                        throw new defpackage.aois();
                    }
                    for (defpackage.aduy aduyVar : (java.util.List) ((defpackage.adub) adtzVar).a) {
                        map3.put(aduyVar.b(), aduyVar);
                    }
                    r2 = obj;
                    aduwVar2 = aduwVar3;
                    if (!r2.isEmpty()) {
                        ?? X = this.x.X(aduwVar2);
                        aebdVar.a = map3;
                        aebdVar.b = null;
                        aebdVar.c = null;
                        aebdVar.f = 3;
                        objC = X.e(r2, aebdVar);
                        if (objC == aoluVar) {
                            return aoluVar;
                        }
                        map4 = map3;
                    }
                    return new defpackage.adub(map3);
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map4 = (java.util.Map) aebdVar.a;
                defpackage.aooc.af(objC);
            }
            adtzVar2 = (defpackage.adtz) objC;
            iR2 = defpackage.anty.R(adtzVar2);
            if (iR2 != 0) {
                if (iR2 == 1) {
                    return (defpackage.adtv) adtzVar2;
                }
                throw new defpackage.aois();
            }
            ((java.lang.Number) ((defpackage.adub) adtzVar2).a).intValue();
            map3 = map4;
            return new defpackage.adub(map3);
        }
        defpackage.aooc.af(objC);
        defpackage.aeee aeeeVarX = this.x.X(aduwVar4);
        map2 = map;
        aebdVar.a = map2;
        aebdVar.b = aduwVar4;
        aebdVar.f = 1;
        objC = aeeeVarX.c(aebdVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        aduwVar2 = aduwVar4;
        java.util.Map map5 = map2;
        defpackage.adtz adtzVar3 = (defpackage.adtz) objC;
        int iR3 = defpackage.anty.R(adtzVar3);
        if (iR3 != 0) {
            if (iR3 == 1) {
                return (defpackage.adtv) adtzVar3;
            }
            throw new defpackage.aois();
        }
        java.util.List<defpackage.aduy> list = (java.util.List) ((defpackage.adub) adtzVar3).a;
        map3 = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.aduy aduyVar2 : list) {
            com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationB = aduyVar2.b();
            map3.put(accountRepresentationB, aduyVar2);
            defpackage.aefx aefxVar = (defpackage.aefx) map5.get(accountRepresentationB);
            if (aefxVar != null) {
                defpackage.aihd aihdVar = aduyVar2.h;
                if (aihdVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                java.util.Set set = aefxVar.a;
                boolean zContainsAll = aihdVar.containsAll(set);
                boolean z = false;
                if ((accountRepresentationB instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) && !defpackage.aooh.n(aduyVar2.d, null)) {
                    z = true;
                }
                if (zContainsAll) {
                    if (z) {
                        z = true;
                    }
                }
                defpackage.adux aduxVar = new defpackage.adux(aduyVar2);
                if (!zContainsAll) {
                    aduxVar.e = defpackage.ahvr.bx(set);
                }
                if (z) {
                    aduxVar.b = null;
                    aduxVar.c = null;
                }
                defpackage.aduy aduyVarA = aduxVar.a();
                arrayList.add(aduyVarA);
                map3.put(accountRepresentationB, aduyVarA);
            }
        }
        java.util.Set setKeySet = map5.keySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : setKeySet) {
            if (!map3.containsKey((com.google.android.libraries.notifications.platform.registration.AccountRepresentation) obj3)) {
                arrayList2.add(obj3);
            }
        }
        r2 = arrayList;
        if (!arrayList2.isEmpty()) {
            defpackage.aogc aogcVar = this.w;
            aebdVar.a = aduwVar2;
            aebdVar.b = map3;
            aebdVar.c = arrayList;
            aebdVar.f = 2;
            java.lang.Object objAj = defpackage.aoov.aj(aogcVar.b, new sim(aogcVar, arrayList2, aduwVar2, map5, (defpackage.aoln) null, 2), aebdVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            objC = objAj;
            obj = arrayList;
            aduwVar3 = aduwVar2;
            adtzVar = (defpackage.adtz) objC;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                if (iR == 1) {
                    return (defpackage.adtv) adtzVar;
                }
                throw new defpackage.aois();
            }
            while (r2.hasNext()) {
                map3.put(aduyVar.b(), aduyVar);
            }
            r2 = obj;
            aduwVar2 = aduwVar3;
            if (!r2.isEmpty()) {
                ?? X2 = this.x.X(aduwVar2);
                aebdVar.a = map3;
                aebdVar.b = null;
                aebdVar.c = null;
                aebdVar.f = 3;
                objC = X2.e(r2, aebdVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                map4 = map3;
                adtzVar2 = (defpackage.adtz) objC;
                iR2 = defpackage.anty.R(adtzVar2);
                if (iR2 != 0) {
                    if (iR2 == 1) {
                        return (defpackage.adtv) adtzVar2;
                    }
                    throw new defpackage.aois();
                }
                ((java.lang.Number) ((defpackage.adub) adtzVar2).a).intValue();
                map3 = map4;
            }
        } else if (!r2.isEmpty()) {
            ?? X3 = this.x.X(aduwVar2);
            aebdVar.a = map3;
            aebdVar.b = null;
            aebdVar.c = null;
            aebdVar.f = 3;
            objC = X3.e(r2, aebdVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
            map4 = map3;
            adtzVar2 = (defpackage.adtz) objC;
            iR2 = defpackage.anty.R(adtzVar2);
            if (iR2 != 0) {
                if (iR2 == 1) {
                    return (defpackage.adtv) adtzVar2;
                }
                throw new defpackage.aois();
            }
            ((java.lang.Number) ((defpackage.adub) adtzVar2).a).intValue();
            map3 = map4;
        }
        return new defpackage.adub(map3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aegd aegdVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aebf aebfVar;
        defpackage.adzy adzyVar;
        if (aolnVar instanceof defpackage.aebf) {
            aebfVar = (defpackage.aebf) aolnVar;
            int i = aebfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebfVar.c = i - Integer.MIN_VALUE;
            } else {
                aebfVar = new defpackage.aebf(this, aolnVar);
            }
        } else {
            aebfVar = new defpackage.aebf(this, aolnVar);
        }
        java.lang.Object objD = aebfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebfVar.c;
        boolean z = false;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            if (defpackage.agab.bL(aegdVar) != defpackage.adzy.UNKNOWN) {
                defpackage.adzy adzyVarBL = defpackage.agab.bL(aegdVar);
                defpackage.adao adaoVarP = p(aduwVar);
                aebfVar.d = adzyVarBL;
                aebfVar.c = 1;
                objD = adaoVarP.d(aebfVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                adzyVar = adzyVarBL;
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        adzyVar = aebfVar.d;
        defpackage.aooc.af(objD);
        if (adzyVar != objD) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aegd aegdVar, java.lang.String str, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aebg aebgVar;
        defpackage.adzy adzyVarBL;
        java.lang.String str2;
        if (aolnVar instanceof defpackage.aebg) {
            aebgVar = (defpackage.aebg) aolnVar;
            int i = aebgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebgVar.c = i - Integer.MIN_VALUE;
            } else {
                aebgVar = new defpackage.aebg(this, aolnVar);
            }
        } else {
            aebgVar = new defpackage.aebg(this, aolnVar);
        }
        java.lang.Object objD = aebgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebgVar.c;
        boolean z = false;
        if (i2 != 0) {
            if (i2 == 1) {
                adzyVarBL = aebgVar.f;
                aduwVar = aebgVar.e;
                str = aebgVar.d;
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = aebgVar.d;
                defpackage.aooc.af(objD);
            }
            if (!defpackage.aooh.n(str2, objD)) {
                z = true;
            }
            return java.lang.Boolean.valueOf(z);
        }
        defpackage.aooc.af(objD);
        if (aduwVar.a()) {
            return java.lang.Boolean.FALSE;
        }
        adzyVarBL = defpackage.agab.bL(aegdVar);
        defpackage.adao adaoVarP = p(aduwVar);
        aebgVar.d = str;
        aebgVar.e = aduwVar;
        aebgVar.f = adzyVarBL;
        aebgVar.c = 1;
        objD = adaoVarP.d(aebgVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (objD == adzyVarBL && adzyVarBL == defpackage.adzy.SIGNED_OUT_ZWIEBACK) {
            defpackage.adao adaoVarP2 = p(aduwVar);
            aebgVar.d = str;
            aebgVar.e = null;
            aebgVar.f = null;
            aebgVar.c = 2;
            objD = adaoVarP2.g(aebgVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            str2 = str;
            if (!defpackage.aooh.n(str2, objD)) {
                z = true;
            }
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(int i, int i2, java.lang.String str, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aebh aebhVar;
        java.lang.String str2;
        defpackage.aduw aduwVar2;
        long epochMilli;
        if (aolnVar instanceof defpackage.aebh) {
            aebhVar = (defpackage.aebh) aolnVar;
            int i3 = aebhVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aebhVar.f = i3 - Integer.MIN_VALUE;
            } else {
                aebhVar = new defpackage.aebh(this, aolnVar);
            }
        } else {
            aebhVar = new defpackage.aebh(this, aolnVar);
        }
        java.lang.Object objE = aebhVar.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i4 = aebhVar.f;
        if (i4 == 0) {
            defpackage.aooc.af(objE);
            if (i != 0 && i == i2) {
                defpackage.adao adaoVarP = p(aduwVar);
                aebhVar.a = str;
                aebhVar.b = aduwVar;
                aebhVar.f = 1;
                objE = adaoVarP.e(aebhVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
            }
            return java.lang.Boolean.TRUE;
        }
        if (i4 == 1) {
            aduwVar = (defpackage.aduw) aebhVar.b;
            str = (java.lang.String) aebhVar.a;
            defpackage.aooc.af(objE);
        } else {
            if (i4 == 2) {
                str2 = (java.lang.String) aebhVar.b;
                aduwVar2 = (defpackage.aduw) aebhVar.a;
                defpackage.aooc.af(objE);
                if (defpackage.aooh.n(str2, objE)) {
                    return java.lang.Boolean.TRUE;
                }
                aduwVar = aduwVar2;
                if (aduwVar.a()) {
                    if (defpackage.ango.a.eZ().h()) {
                        return java.lang.Boolean.TRUE;
                    }
                    epochMilli = j$.time.Instant.now().toEpochMilli();
                    defpackage.adao adaoVarP2 = p(aduwVar);
                    aebhVar.a = null;
                    aebhVar.b = null;
                    aebhVar.c = epochMilli;
                    aebhVar.f = 3;
                    objE = adaoVarP2.h(aebhVar);
                    if (objE == aoluVar) {
                        return aoluVar;
                    }
                }
                return java.lang.Boolean.FALSE;
            }
            if (i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            epochMilli = aebhVar.c;
            defpackage.aooc.af(objE);
        }
        if (epochMilli - ((java.lang.Number) objE).longValue() > java.lang.Math.max(0L, this.m.e)) {
            return java.lang.Boolean.TRUE;
        }
        return java.lang.Boolean.FALSE;
        if (defpackage.aooh.n(objE, this.n.a())) {
            if (str != null) {
                defpackage.adao adaoVarP3 = p(aduwVar);
                aebhVar.a = aduwVar;
                aebhVar.b = str;
                aebhVar.f = 2;
                objE = adaoVarP3.g(aebhVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                aduwVar2 = aduwVar;
                if (defpackage.aooh.n(str2, objE)) {
                    return java.lang.Boolean.TRUE;
                }
                aduwVar = aduwVar2;
                if (aduwVar.a()) {
                    if (defpackage.ango.a.eZ().h()) {
                        return java.lang.Boolean.TRUE;
                    }
                    epochMilli = j$.time.Instant.now().toEpochMilli();
                    defpackage.adao adaoVarP4 = p(aduwVar);
                    aebhVar.a = null;
                    aebhVar.b = null;
                    aebhVar.c = epochMilli;
                    aebhVar.f = 3;
                    objE = adaoVarP4.h(aebhVar);
                    if (objE == aoluVar) {
                        return aoluVar;
                    }
                    if (epochMilli - ((java.lang.Number) objE).longValue() > java.lang.Math.max(0L, this.m.e)) {
                        return java.lang.Boolean.TRUE;
                    }
                }
            } else if (aduwVar.a()) {
                if (defpackage.ango.a.eZ().h()) {
                    return java.lang.Boolean.TRUE;
                }
                epochMilli = j$.time.Instant.now().toEpochMilli();
                defpackage.adao adaoVarP5 = p(aduwVar);
                aebhVar.a = null;
                aebhVar.b = null;
                aebhVar.c = epochMilli;
                aebhVar.f = 3;
                objE = adaoVarP5.h(aebhVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                if (epochMilli - ((java.lang.Number) objE).longValue() > java.lang.Math.max(0L, this.m.e)) {
                    return java.lang.Boolean.TRUE;
                }
            }
            return java.lang.Boolean.FALSE;
        }
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [adzq] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [aecd] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        aebi aebiVar;
        defpackage.adzq adzqVar;
        defpackage.aecd aecdVar;
        ?? r6;
        ?? r2;
        defpackage.adtz adtzVar;
        int iR;
        if (aolnVar instanceof aebi) {
            aebiVar = (aebi) aolnVar;
            int i = aebiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebiVar.d = i - Integer.MIN_VALUE;
            } else {
                aebiVar = new aebi(this, aolnVar);
            }
        } else {
            aebiVar = new aebi(this, aolnVar);
        }
        java.lang.Object objC = aebiVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebiVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = aebiVar.a;
                defpackage.aecd aecdVar2 = aebiVar.e;
                defpackage.aooc.af(objC);
                r2 = obj;
                r6 = aecdVar2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objC);
            }
            adtzVar = (defpackage.adtz) objC;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                return ((java.lang.Boolean) ((defpackage.adub) adtzVar).a).booleanValue() ? this.o.a() : new defpackage.adub(defpackage.aojh.a);
            }
            if (iR == 1) {
                return new adzs(((defpackage.adtv) adtzVar).b(), defpackage.adty.aG, false);
            }
            throw new defpackage.aois();
        }
        defpackage.aooc.af(objC);
        adzqVar = this.o;
        defpackage.adao adaoVar = this.t;
        aecdVar = defpackage.aecd.a;
        aebiVar.e = aecdVar;
        aebiVar.a = adzqVar;
        aebiVar.d = 1;
        objC = adaoVar.c(aebiVar);
        if (objC == aoluVar) {
            r2 = adzqVar;
            r6 = aecdVar;
            return aoluVar;
        }
        r2 = adzqVar;
        r6 = aecdVar;
        aebiVar.e = null;
        aebiVar.a = null;
        aebiVar.d = 2;
        objC = r6.b(r2, (java.lang.String) objC, false);
        if (objC == aoluVar) {
            return aoluVar;
        }
        adtzVar = (defpackage.adtz) objC;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (((java.lang.Boolean) ((defpackage.adub) adtzVar).a).booleanValue()) {
            }
        }
        if (iR == 1) {
            return new adzs(((defpackage.adtv) adtzVar).b(), defpackage.adty.aG, false);
        }
        throw new defpackage.aois();
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0136  */
    /* JADX WARN: Code duplicated, block: B:38:0x0158  */
    /* JADX WARN: Code duplicated, block: B:40:0x017f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0190  */
    /* JADX WARN: Code duplicated, block: B:45:0x0193  */
    /* JADX WARN: Code duplicated, block: B:47:0x0196  */
    /* JADX WARN: Code duplicated, block: B:49:0x019c  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d6 A[LOOP:1: B:52:0x01d0->B:54:0x01d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0222  */
    /* JADX WARN: Code duplicated, block: B:60:0x0228  */
    /* JADX WARN: Code duplicated, block: B:62:0x0264 A[PHI: r0 r1 r2 r3 r4 r6 r12 r13 r14 r15 r16
      0x0264: PHI (r0v7 akrj) = (r0v4 akrj), (r0v25 akrj) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r1v29 java.lang.Object) = (r1v20 java.lang.Object), (r1v1 java.lang.Object) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r2v17 aebs) = (r2v13 aebs), (r2v20 aebs) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r3v11 int) = (r3v4 int), (r3v16 int) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r4v12 java.util.Map) = (r4v5 java.util.Map), (r4v14 java.util.Map) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r6v10 aduw) = (r6v6 aduw), (r6v12 aduw) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r12v9 akti) = (r12v6 akti), (r12v11 akti) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r13v9 aegd) = (r13v6 aegd), (r13v11 aegd) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r14v18 java.lang.String) = (r14v14 java.lang.String), (r14v21 java.lang.String) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r15v11 java.util.List) = (r15v8 java.util.List), (r15v13 java.util.List) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0264: PHI (r16v3 java.lang.String) = (r8v0 java.lang.String), (r16v5 java.lang.String) binds: [B:61:0x0262, B:14:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x026c  */
    /* JADX WARN: Code duplicated, block: B:66:0x028c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0296  */
    /* JADX WARN: Code duplicated, block: B:71:0x029c  */
    /* JADX WARN: Code duplicated, block: B:73:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x02be  */
    /* JADX WARN: Code duplicated, block: B:95:0x0342  */
    /* JADX WARN: Code duplicated, block: B:97:0x034a  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (k(r11, r12, r2, r5) != r7) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f4, code lost:
    
        if (r1 != r7) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r19, java.util.Map r20, java.lang.String r21, defpackage.adtz r22, int r23, int r24, defpackage.aegd r25, boolean r26, defpackage.akti r27, defpackage.aduw r28, java.lang.String r29, defpackage.aoln r30) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebs.i(java.util.List, java.util.Map, java.lang.String, adtz, int, int, aegd, boolean, akti, aduw, java.lang.String, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0104  */
    /* JADX WARN: Code duplicated, block: B:34:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [adzx] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object j(java.util.List list, java.util.Map map, java.lang.String str, defpackage.akrj akrjVar, defpackage.aduw aduwVar, java.util.Map map2, defpackage.akti aktiVar, java.lang.String str2, defpackage.aoln aolnVar) {
        aebo aeboVar;
        java.lang.String str3;
        defpackage.aduw aduwVar2;
        java.lang.Object obj;
        defpackage.akti aktiVar2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str4;
        defpackage.akti aktiVar3;
        java.lang.String str5;
        java.lang.Object obj4;
        java.lang.Object obj5;
        ?? r4;
        defpackage.adtz adtzVar;
        java.lang.Object objB;
        if (aolnVar instanceof aebo) {
            aeboVar = (aebo) aolnVar;
            int i = aeboVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeboVar.f = i - Integer.MIN_VALUE;
            } else {
                aeboVar = new aebo(this, aolnVar);
            }
        } else {
            aeboVar = new aebo(this, aolnVar);
        }
        aebo aeboVar2 = aeboVar;
        java.lang.Object objB2 = aeboVar2.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeboVar2.f;
        if (i2 == 0) {
            defpackage.aooc.af(objB2);
            defpackage.adzx adzxVar = this.i;
            aeboVar2.a = list;
            aeboVar2.b = map;
            aeboVar2.g = str;
            aeboVar2.h = aduwVar;
            aeboVar2.c = map2;
            aeboVar2.i = aktiVar;
            str3 = str2;
            aeboVar2.j = str3;
            aeboVar2.f = 1;
            objB2 = adzxVar.b(list, map, str, akrjVar, aeboVar2);
            if (objB2 != aoluVar) {
                aduwVar2 = aduwVar;
                obj = map2;
                aktiVar2 = aktiVar;
                obj2 = list;
                obj3 = map;
                str4 = str;
            }
            return aoluVar;
        }
        if (i2 == 1) {
            java.lang.String str6 = aeboVar2.j;
            aktiVar2 = aeboVar2.i;
            obj = aeboVar2.c;
            aduwVar2 = aeboVar2.h;
            str4 = aeboVar2.g;
            obj3 = aeboVar2.b;
            obj2 = aeboVar2.a;
            defpackage.aooc.af(objB2);
            str3 = str6;
        } else {
            if (i2 == 2) {
                java.lang.String str7 = aeboVar2.j;
                defpackage.akti aktiVar4 = aeboVar2.i;
                obj = aeboVar2.c;
                aduwVar2 = aeboVar2.h;
                java.lang.String str8 = aeboVar2.g;
                java.lang.Object obj6 = aeboVar2.b;
                obj5 = aeboVar2.a;
                defpackage.aooc.af(objB2);
                str3 = str7;
                aktiVar3 = aktiVar4;
                str5 = str8;
                obj4 = obj6;
                ((defpackage.aiob) a.b()).v("Conflict detected and tokens were reset, recreating request and trying to register again.");
                defpackage.aecg aecgVar = this.e;
                aeboVar2.a = obj5;
                aeboVar2.b = obj4;
                aeboVar2.g = str5;
                aeboVar2.h = null;
                aeboVar2.c = null;
                aeboVar2.i = null;
                aeboVar2.j = null;
                aeboVar2.f = 3;
                ?? r18 = obj5;
                objB2 = defpackage.aoov.aj(aecgVar.j, new defpackage.aece(aecgVar, aduwVar2, r18, aktiVar3, str3, obj, null), aeboVar2);
                r4 = r18;
                if (objB2 != aoluVar) {
                }
                return aoluVar;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB2);
                return objB2;
            }
            str5 = aeboVar2.g;
            obj4 = aeboVar2.b;
            java.lang.Object obj7 = aeboVar2.a;
            defpackage.aooc.af(objB2);
            r4 = obj7;
        }
        adtzVar = (defpackage.adtz) objB2;
        if (!(adtzVar instanceof defpackage.adub)) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtzVar.f())).v("Failed to recreate registration request after token was reset.");
            defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
            return (defpackage.adtv) adtzVar;
        }
        ?? r0 = this.i;
        defpackage.akrj akrjVar2 = (defpackage.akrj) ((defpackage.adub) adtzVar).a;
        aeboVar2.a = null;
        aeboVar2.b = null;
        aeboVar2.g = null;
        aeboVar2.f = 4;
        ?? r17 = r4;
        objB = r0.b(r17, obj4, str5, akrjVar2, aeboVar2);
        if (objB != aoluVar) {
            return objB;
        }
        return aoluVar;
        defpackage.adtz adtzVar2 = (defpackage.adtz) objB2;
        if (!(adtzVar2 instanceof aedm)) {
            return adtzVar2;
        }
        aeboVar2.a = obj2;
        aeboVar2.b = obj3;
        aeboVar2.g = str4;
        aeboVar2.h = aduwVar2;
        aeboVar2.c = obj;
        aeboVar2.i = aktiVar2;
        aeboVar2.j = str3;
        aeboVar2.f = 2;
        if (l(aduwVar2, aeboVar2) != aoluVar) {
            aktiVar3 = aktiVar2;
            str5 = str4;
            obj4 = obj3;
            obj5 = obj2;
            ((defpackage.aiob) a.b()).v("Conflict detected and tokens were reset, recreating request and trying to register again.");
            defpackage.aecg aecgVar2 = this.e;
            aeboVar2.a = obj5;
            aeboVar2.b = obj4;
            aeboVar2.g = str5;
            aeboVar2.h = null;
            aeboVar2.c = null;
            aeboVar2.i = null;
            aeboVar2.j = null;
            aeboVar2.f = 3;
            ?? r19 = obj5;
            objB2 = defpackage.aoov.aj(aecgVar2.j, new defpackage.aece(aecgVar2, aduwVar2, r19, aktiVar3, str3, obj, null), aeboVar2);
            r4 = r19;
            if (objB2 != aoluVar) {
                adtzVar = (defpackage.adtz) objB2;
                if (!(adtzVar instanceof defpackage.adub)) {
                    ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtzVar.f())).v("Failed to recreate registration request after token was reset.");
                    defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar;
                }
                ?? r1 = this.i;
                defpackage.akrj akrjVar3 = (defpackage.akrj) ((defpackage.adub) adtzVar).a;
                aeboVar2.a = null;
                aeboVar2.b = null;
                aeboVar2.g = null;
                aeboVar2.f = 4;
                ?? r110 = r4;
                objB = r1.b(r110, obj4, str5, akrjVar3, aeboVar2);
                if (objB != aoluVar) {
                    return objB;
                }
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(java.util.List list, java.util.Map map, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aebp aebpVar;
        if (aolnVar instanceof defpackage.aebp) {
            aebpVar = (defpackage.aebp) aolnVar;
            int i = aebpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebpVar.c = i - Integer.MIN_VALUE;
            } else {
                aebpVar = new defpackage.aebp(this, aolnVar);
            }
        } else {
            aebpVar = new defpackage.aebp(this, aolnVar);
        }
        java.lang.Object obj = aebpVar.a;
        int i2 = aebpVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (aduwVar.a()) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(list, 10)), 16));
                for (java.lang.Object obj2 : list) {
                    linkedHashMap.put(obj2, new defpackage.adub(defpackage.aojh.a));
                }
                java.util.Set setAH = defpackage.ajsz.aH(map.keySet(), defpackage.ajsz.cf(list));
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(setAH, 10)), 16));
                for (java.lang.Object obj3 : setAH) {
                    linkedHashMap2.put(obj3, new defpackage.adub(defpackage.aojh.a));
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                defpackage.aooc.af(obj);
            } catch (java.lang.Exception e) {
                ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e)).v("Failed to report registration results");
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [adzq] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [aecd] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final java.lang.Object l(defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        aebq aebqVar;
        defpackage.aduw aduwVar2;
        ?? r10;
        ?? r2;
        defpackage.adzw adzwVar;
        defpackage.adtz adtzVar;
        int iR;
        java.lang.Object obj;
        if (aolnVar instanceof aebq) {
            aebqVar = (aebq) aolnVar;
            int i = aebqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebqVar.d = i - Integer.MIN_VALUE;
            } else {
                aebqVar = new aebq(this, aolnVar);
            }
        } else {
            aebqVar = new aebq(this, aolnVar);
        }
        java.lang.Object objB = aebqVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebqVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            if (aduwVar.a()) {
                defpackage.adzq adzqVar = this.o;
                defpackage.adao adaoVar = this.t;
                defpackage.aecd aecdVar = defpackage.aecd.a;
                aebqVar.e = aduwVar;
                aebqVar.f = aecdVar;
                aebqVar.a = adzqVar;
                aebqVar.d = 1;
                java.lang.Object objC = adaoVar.c(aebqVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                aduwVar2 = aduwVar;
                r10 = adzqVar;
                objB = objC;
                r2 = aecdVar;
            } else if (aduwVar.b()) {
                adzwVar = this.f;
                aebqVar.e = null;
                aebqVar.d = 3;
                if (adzwVar.c(aebqVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return defpackage.aojh.a;
        }
        if (i2 == 1) {
            java.lang.Object obj2 = aebqVar.a;
            defpackage.aecd aecdVar2 = aebqVar.f;
            aduwVar2 = aebqVar.e;
            defpackage.aooc.af(objB);
            r2 = aecdVar2;
            r10 = obj2;
        } else if (i2 == 2) {
            aduwVar = aebqVar.e;
            defpackage.aooc.af(objB);
            adtzVar = (defpackage.adtz) objB;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                obj = ((defpackage.adub) adtzVar).a;
            } else {
                if (iR == 1) {
                    throw new defpackage.aois();
                }
                obj = java.lang.Boolean.TRUE;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                this.o.a();
            }
            if (aduwVar.b()) {
                adzwVar = this.f;
                aebqVar.e = null;
                aebqVar.d = 3;
                if (adzwVar.c(aebqVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        return defpackage.aojh.a;
        aebqVar.e = aduwVar2;
        aebqVar.f = null;
        aebqVar.a = null;
        aebqVar.d = 2;
        objB = r2.b(r10, (java.lang.String) objB, true);
        if (objB == aoluVar) {
            return aoluVar;
        }
        aduwVar = aduwVar2;
        adtzVar = (defpackage.adtz) objB;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            obj = ((defpackage.adub) adtzVar).a;
        } else {
            if (iR == 1) {
                throw new defpackage.aois();
            }
            obj = java.lang.Boolean.TRUE;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.o.a();
        }
        if (aduwVar.b()) {
            adzwVar = this.f;
            aebqVar.e = null;
            aebqVar.d = 3;
            if (adzwVar.c(aebqVar) == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cf A[PHI: r2 r4 r5 r6 r7 r8 r9 r10 r11 r14
      0x00cf: PHI (r2v19 int) = (r2v15 int), (r2v15 int), (r2v20 int) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r4v14 boolean) = (r4v10 boolean), (r4v10 boolean), (r4v15 boolean) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r5v14 java.lang.String) = (r5v11 java.lang.String), (r5v11 java.lang.String), (r5v15 java.lang.String) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r6v16 java.lang.String) = (r6v12 java.lang.String), (r6v12 java.lang.String), (r6v18 java.lang.String) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r7v17 aegd) = (r7v12 aegd), (r7v12 aegd), (r7v20 aegd) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r8v18 aduw) = (r8v13 aduw), (r8v13 aduw), (r8v21 aduw) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r9v18 java.util.Map) = (r9v13 java.util.Map), (r9v13 java.util.Map), (r9v21 java.util.Map) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r10v18 java.util.List) = (r10v13 java.util.List), (r10v13 java.util.List), (r10v21 java.util.List) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r11v16 akti) = (r11v12 akti), (r11v12 akti), (r11v19 akti) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r14v11 aoss) = (r14v7 aoss), (r14v7 aoss), (r14v13 aoss) binds: [B:47:0x0251, B:49:0x0270, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x0209  */
    /* JADX WARN: Code duplicated, block: B:41:0x021f  */
    /* JADX WARN: Code duplicated, block: B:46:0x024d A[PHI: r2 r4 r5 r6 r7 r8 r9 r10 r11 r14
      0x024d: PHI (r2v15 int) = (r2v13 int), (r2v16 int) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r4v10 boolean) = (r4v8 boolean), (r4v11 boolean) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r5v11 java.lang.String) = (r5v9 java.lang.String), (r5v12 java.lang.String) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r6v12 java.lang.String) = (r6v10 java.lang.String), (r6v13 java.lang.String) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r7v12 aegd) = (r7v9 aegd), (r7v13 aegd) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r8v13 aduw) = (r8v10 aduw), (r8v14 aduw) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r9v13 java.util.Map) = (r9v10 java.util.Map), (r9v14 java.util.Map) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r10v13 java.util.List) = (r10v10 java.util.List), (r10v14 java.util.List) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r11v12 akti) = (r11v9 akti), (r11v13 akti) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]
      0x024d: PHI (r14v7 aoss) = (r14v4 aoss), (r14v8 aoss) binds: [B:40:0x021d, B:44:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0253  */
    /* JADX WARN: Code duplicated, block: B:53:0x027a  */
    /* JADX WARN: Code duplicated, block: B:59:0x02a4 A[PHI: r2 r4 r5 r6 r7 r8 r9 r10
      0x02a4: PHI (r2v23 int) = (r2v19 int), (r2v25 int), (r2v25 int) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r4v18 boolean) = (r4v14 boolean), (r4v20 boolean), (r4v20 boolean) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r5v19 java.lang.String) = (r5v14 java.lang.String), (r5v20 java.lang.String), (r5v20 java.lang.String) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r6v21 aegd) = (r6v17 aegd), (r6v22 aegd), (r6v22 aegd) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r7v22 aduw) = (r7v18 aduw), (r7v23 aduw), (r7v23 aduw) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r8v23 java.util.Map) = (r8v19 java.util.Map), (r8v24 java.util.Map), (r8v24 java.util.Map) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r9v23 java.util.List) = (r9v19 java.util.List), (r9v24 java.util.List), (r9v24 java.util.List) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]
      0x02a4: PHI (r10v23 akti) = (r10v19 akti), (r10v24 akti), (r10v24 akti) binds: [B:52:0x0278, B:56:0x029b, B:58:0x02a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x02a7 A[PHI: r1 r2 r4 r6 r7 r8 r9 r10
      0x02a7: PHI (r1v31 int) = (r1v14 int), (r1v27 int), (r1v33 int) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r2v21 boolean) = (r2v10 boolean), (r2v17 boolean), (r2v24 boolean) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r4v16 java.lang.String) = (r4v5 java.lang.String), (r4v12 java.lang.String), (r4v19 java.lang.String) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r6v19 aegd) = (r6v6 aegd), (r6v14 aegd), (r6v21 aegd) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r7v21 aduw) = (r7v5 aduw), (r7v14 aduw), (r7v22 aduw) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r8v22 java.util.Map) = (r8v6 java.util.Map), (r8v15 java.util.Map), (r8v23 java.util.Map) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r9v22 java.util.List) = (r9v6 java.util.List), (r9v15 java.util.List), (r9v23 java.util.List) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]
      0x02a7: PHI (r10v22 akti) = (r10v6 akti), (r10v15 akti), (r10v23 akti) binds: [B:35:0x01ea, B:45:0x0244, B:59:0x02a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x0308  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x023a, code lost:
    
        if (r1 != r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
    
        if (r1 != r13) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.aoss r18, defpackage.akti r19, java.util.List r20, java.util.Map r21, boolean r22, defpackage.aduw r23, defpackage.aegd r24, defpackage.aoln r25) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebs.m(aoss, akti, java.util.List, java.util.Map, boolean, aduw, aegd, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x015f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0172  */
    /* JADX WARN: Code duplicated, block: B:47:0x0178  */
    /* JADX WARN: Code duplicated, block: B:50:0x0191  */
    /* JADX WARN: Code duplicated, block: B:55:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [aebs] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [aegd] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r7v4, types: [aegd] */
    public final java.lang.Object n(defpackage.aoss aossVar, defpackage.akti aktiVar, boolean z, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aebk aebkVar;
        defpackage.aoss aossVar2;
        boolean z2;
        defpackage.akti aktiVar2;
        defpackage.aduw aduwVar2;
        long j;
        java.lang.Object obj;
        boolean z3;
        ?? r4;
        ?? r3;
        defpackage.aduw aduwVar3;
        defpackage.akti aktiVar3;
        defpackage.aoss aossVar3;
        defpackage.adtz adtzVar;
        int iR;
        java.util.LinkedHashMap linkedHashMap;
        java.util.Map map;
        defpackage.adtz adtzVar2;
        if (aolnVar instanceof defpackage.aebk) {
            aebkVar = (defpackage.aebk) aolnVar;
            int i = aebkVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebkVar.h = i - Integer.MIN_VALUE;
            } else {
                aebkVar = new defpackage.aebk(this, aolnVar);
            }
        } else {
            aebkVar = new defpackage.aebk(this, aolnVar);
        }
        defpackage.aebk aebkVar2 = aebkVar;
        java.lang.Object objA = aebkVar2.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebkVar2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                j = aebkVar2.e;
                z2 = aebkVar2.d;
                aduwVar2 = aebkVar2.j;
                aktiVar2 = aebkVar2.i;
                aossVar2 = (defpackage.aoss) aebkVar2.a;
                defpackage.aooc.af(objA);
            } else if (i2 == 2) {
                z3 = aebkVar2.d;
                java.lang.Object obj2 = aebkVar2.c;
                java.lang.Object obj3 = aebkVar2.b;
                aduwVar3 = aebkVar2.j;
                aktiVar3 = aebkVar2.i;
                aossVar3 = (defpackage.aoss) aebkVar2.a;
                defpackage.aooc.af(objA);
                r3 = obj2;
                obj = objA;
                r4 = obj3;
                adtzVar = (defpackage.adtz) obj;
                iR = defpackage.anty.R(adtzVar);
                if (iR != 0) {
                    if (iR == 1) {
                        throw new defpackage.aois();
                    }
                    defpackage.adtv adtvVar = (defpackage.adtv) adtzVar;
                    ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar.b())).v("Failed creating GNP accounts.");
                    return adtvVar;
                }
                java.util.Map map2 = (java.util.Map) ((defpackage.adub) adtzVar).a;
                linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry entry : map2.entrySet()) {
                    if (((defpackage.aikj) r4.a()).keySet().contains((com.google.android.libraries.notifications.platform.registration.AccountRepresentation) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.size();
                aebkVar2.a = linkedHashMap;
                aebkVar2.i = null;
                aebkVar2.j = null;
                aebkVar2.b = null;
                aebkVar2.c = null;
                aebkVar2.h = 3;
                objA = m(aossVar3, aktiVar3, r3, map2, z3, aduwVar3, r4, aebkVar2);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                map = linkedHashMap;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (java.util.Map) aebkVar2.a;
                defpackage.aooc.af(objA);
            }
            adtzVar2 = (defpackage.adtz) objA;
            if (adtzVar2 instanceof defpackage.adtv) {
                return adtzVar2;
            }
            this.v.e(adtzVar2, defpackage.ajsz.cf(map.values()));
            return adtzVar2;
        }
        defpackage.aooc.af(objA);
        if (!aduwVar.b() && !((java.lang.Boolean) this.r.a()).booleanValue() && !((java.lang.Boolean) this.s.a()).booleanValue()) {
            ((defpackage.aiob) a.d()).v("Non fetch registrations shouldn't be made for non-push-flow clients.");
            return new defpackage.adub(defpackage.aojh.a);
        }
        if (aktiVar == defpackage.akti.REGISTRATION_REASON_UNSPECIFIED) {
            return new adtw("Registration reason is unspecified.", defpackage.adty.af);
        }
        if (new defpackage.alam(defpackage.ango.a.eZ().a().c, defpackage.adyh.a).contains(aktiVar)) {
            ((defpackage.aiob) a.d()).y("Registration is disabled for %s.", aktiVar);
            o(this, aktiVar, aduwVar, "DISABLED");
            java.util.Objects.toString(aktiVar);
            return new adtw("Registration is disabled for registration reason ".concat(java.lang.String.valueOf(aktiVar)), defpackage.adty.ag);
        }
        o(this, aktiVar, aduwVar, "SUCCESS");
        defpackage.aegf aegfVarBJ = defpackage.agab.bJ(this.d, this.c, aduwVar, this.r);
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        aebkVar2.a = aossVar;
        aebkVar2.i = aktiVar;
        aebkVar2.j = aduwVar;
        aebkVar2.d = z;
        aebkVar2.e = epochMilli;
        aebkVar2.h = 1;
        objA = aegfVarBJ.a(aebkVar2);
        if (objA == aoluVar) {
            return aoluVar;
        }
        aossVar2 = aossVar;
        z2 = z;
        aktiVar2 = aktiVar;
        aduwVar2 = aduwVar;
        j = epochMilli;
        defpackage.aegd aegdVar = (defpackage.aegd) objA;
        if (aegdVar instanceof defpackage.aege) {
            return new adtx("Failed to get registration data.", defpackage.adty.an);
        }
        this.q.m(j$.time.Instant.now().toEpochMilli() - j, this.p.getPackageName(), this.m.a, android.os.Build.VERSION.SDK_INT, "REGISTRATION_DATA_FETCH");
        java.util.Map mapA = aegdVar.a();
        java.util.List listBZ = defpackage.ajsz.bZ(((defpackage.aikj) mapA).keySet());
        aebkVar2.a = aossVar2;
        aebkVar2.i = aktiVar2;
        aebkVar2.j = aduwVar2;
        aebkVar2.b = aegdVar;
        aebkVar2.c = listBZ;
        aebkVar2.d = z2;
        aebkVar2.h = 2;
        java.lang.Object objD = d(mapA, aduwVar2, aebkVar2);
        if (objD == aoluVar) {
            return aoluVar;
        }
        obj = objD;
        z3 = z2;
        r4 = aegdVar;
        r3 = listBZ;
        aduwVar3 = aduwVar2;
        aktiVar3 = aktiVar2;
        aossVar3 = aossVar2;
        adtzVar = (defpackage.adtz) obj;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (iR == 1) {
                throw new defpackage.aois();
            }
            defpackage.adtv adtvVar2 = (defpackage.adtv) adtzVar;
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar2.b())).v("Failed creating GNP accounts.");
            return adtvVar2;
        }
        java.util.Map map3 = (java.util.Map) ((defpackage.adub) adtzVar).a;
        linkedHashMap = new java.util.LinkedHashMap();
        while (r7.hasNext()) {
            if (((defpackage.aikj) r4.a()).keySet().contains((com.google.android.libraries.notifications.platform.registration.AccountRepresentation) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        linkedHashMap.size();
        aebkVar2.a = linkedHashMap;
        aebkVar2.i = null;
        aebkVar2.j = null;
        aebkVar2.b = null;
        aebkVar2.c = null;
        aebkVar2.h = 3;
        objA = m(aossVar3, aktiVar3, r3, map3, z3, aduwVar3, r4, aebkVar2);
        if (objA != aoluVar) {
            return aoluVar;
        }
        map = linkedHashMap;
        adtzVar2 = (defpackage.adtz) objA;
        if (adtzVar2 instanceof defpackage.adtv) {
            return adtzVar2;
        }
        this.v.e(adtzVar2, defpackage.ajsz.cf(map.values()));
        return adtzVar2;
    }
}
