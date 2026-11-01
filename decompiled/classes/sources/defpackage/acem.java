package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acem implements defpackage.acee {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private static final defpackage.acfb n = new defpackage.acfb();
    public final defpackage.aolr b;
    public final java.lang.String c;
    public final defpackage.amwu d;
    public final defpackage.acal e;
    private final defpackage.aedo f;
    private final defpackage.aduu g;
    private final defpackage.amwu h;
    private final defpackage.aeee i;
    private final defpackage.adzw j;
    private final defpackage.aefe k;
    private final defpackage.aoin l;
    private final defpackage.adye m;
    private final defpackage.adao o;
    private final defpackage.adao p;
    private final defpackage.acxg q;

    public acem(defpackage.aolr aolrVar, defpackage.aedo aedoVar, defpackage.aduu aduuVar, defpackage.amwu amwuVar, defpackage.aeee aeeeVar, defpackage.adao adaoVar, defpackage.adao adaoVar2, defpackage.adzw adzwVar, defpackage.aefe aefeVar, defpackage.aoin aoinVar, java.lang.String str, defpackage.amwu amwuVar2, defpackage.acal acalVar, defpackage.aazc aazcVar, defpackage.adye adyeVar, defpackage.acxg acxgVar) {
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(amwuVar, "gnpFetchOnlyAccountStorage");
        defpackage.aooh.f(aeeeVar, "gnpFcmAccountStorage");
        defpackage.aooh.f(adaoVar, "gnpFcmRegistrationDataHelper");
        defpackage.aooh.f(adaoVar2, "versionedIdentifierStore");
        defpackage.aooh.f(adzwVar, "deliveryAddressHelper");
        defpackage.aooh.f(aefeVar, "requestUtil");
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        defpackage.aooh.f(str, "appPackageName");
        defpackage.aooh.f(amwuVar2, "clientStreamz");
        defpackage.aooh.f(acalVar, "clearcutLogger");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(adyeVar, "gnpRasta");
        defpackage.aooh.f(acxgVar, "syncDataStore");
        this.b = aolrVar;
        this.f = aedoVar;
        this.g = aduuVar;
        this.h = amwuVar;
        this.i = aeeeVar;
        this.o = adaoVar;
        this.p = adaoVar2;
        this.j = adzwVar;
        this.k = aefeVar;
        this.l = aoinVar;
        this.c = str;
        this.d = amwuVar2;
        this.e = acalVar;
        this.m = adyeVar;
        this.q = acxgVar;
    }

    private static final aksc g(aksx aksxVar) {
        defpackage.xtq xtqVarO = aklu.o(aksc.a.m());
        java.lang.String str = aksxVar.e;
        defpackage.aooh.e(str, "getIdentifier(...)");
        xtqVarO.aq(str);
        if ((aksxVar.b & 512) != 0) {
            xtqVarO.ar(aksxVar.i);
        }
        if ((aksxVar.b & 32) != 0) {
            long j = aksxVar.h;
            defpackage.akzx akzxVar = (defpackage.akzx) xtqVarO.a;
            akzxVar.u();
            aksc akscVar = akzxVar.b;
            akscVar.b |= 4;
            akscVar.e = j;
        }
        if ((aksxVar.b & 4194304) != 0) {
            defpackage.akzc akzcVar = aksxVar.n;
            defpackage.aooh.e(akzcVar, "getOpaqueBackendData(...)");
            defpackage.aooh.f(akzcVar, "value");
            defpackage.akzx akzxVar2 = (defpackage.akzx) xtqVarO.a;
            akzxVar2.u();
            aksc akscVar2 = akzxVar2.b;
            j$.util.Objects.requireNonNull(akzcVar);
            akscVar2.b |= 8;
            akscVar2.f = akzcVar;
        }
        return xtqVarO.ap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(akrn akrnVar, java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Throwable {
        acef acefVar;
        ajyi ajyiVar;
        akhl akhlVarA;
        if (aolnVar instanceof acef) {
            acefVar = (acef) aolnVar;
            int i = acefVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acefVar.c = i - Integer.MIN_VALUE;
            } else {
                acefVar = new acef(this, aolnVar);
            }
        } else {
            acefVar = new acef(this, aolnVar);
        }
        java.lang.Object objD = acefVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acefVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            defpackage.akzx akzxVarM = akhn.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            ajyi ajyiVar2 = new ajyi(akzxVarM);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            defpackage.akzx akzxVar = (defpackage.akzx) ajyiVar2.a;
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVar.b.b);
            defpackage.aooh.e(listUnmodifiableList, "getPromoList(...)");
            new defpackage.alct(listUnmodifiableList);
            defpackage.alat<aksx> alatVar = akrnVar.b;
            defpackage.aooh.e(alatVar, "getNotificationThreadList(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (aksx aksxVar : alatVar) {
                if (aksxVar.c == 25) {
                    akhlVarA = acgm.a(aksxVar);
                    defpackage.aooh.c(aksxVar);
                    linkedHashMap.put(abxl.q(akhlVarA), g(aksxVar));
                } else {
                    akhlVarA = null;
                }
                if (akhlVarA != null) {
                    arrayList.add(akhlVarA);
                }
            }
            akzxVar.u();
            akhn akhnVar = akzxVar.b;
            defpackage.alat alatVar2 = akhnVar.b;
            if (!alatVar2.c()) {
                akhnVar.b = defpackage.alad.J(alatVar2);
            }
            defpackage.akyl.i(arrayList, akhnVar.b);
            defpackage.ajcq ajcqVarB = ((defpackage.acgr) this.p.o(str)).b(linkedHashMap);
            defpackage.aooh.e(ajcqVarB, "clearAndPutAll(...)");
            acefVar.d = ajyiVar2;
            acefVar.c = 1;
            objD = defpackage.aosv.D(ajcqVarB, acefVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            ajyiVar = ajyiVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ajyiVar = acefVar.d;
            defpackage.aooc.af(objD);
        }
        akhn akhnVarR = ((defpackage.akzx) ajyiVar.a).r();
        defpackage.aooh.e(akhnVarR, "build(...)");
        return akhnVarR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [aeee] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final java.lang.Object b(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.aoln aolnVar) {
        aceg acegVar;
        ?? r6;
        ?? r5;
        if (aolnVar instanceof aceg) {
            acegVar = (aceg) aolnVar;
            int i = acegVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acegVar.d = i - Integer.MIN_VALUE;
            } else {
                acegVar = new aceg(this, aolnVar);
            }
        } else {
            acegVar = new aceg(this, aolnVar);
        }
        java.lang.Object objK = acegVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acegVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            defpackage.adao adaoVar = this.o;
            acegVar.a = accountRepresentation;
            acegVar.d = 1;
            objK = adaoVar.k(acegVar);
            if (objK != aoluVar) {
            }
            r6 = accountRepresentation;
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
            return objK;
        }
        java.lang.Object obj = acegVar.a;
        defpackage.aooc.af(objK);
        r6 = obj;
        r6 = accountRepresentation;
        if (((java.lang.Boolean) objK).booleanValue()) {
            r5 = this.i;
        } else {
            java.lang.Object objA = this.h.a();
            defpackage.aooh.c(objA);
            r5 = (defpackage.aeee) objA;
        }
        acegVar.a = null;
        acegVar.d = 2;
        java.lang.Object objB = r5.b(r6, acegVar);
        if (objB != aoluVar) {
            return objB;
        }
        r6 = accountRepresentation;
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x010b  */
    /* JADX WARN: Code duplicated, block: B:43:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150  */
    /* JADX WARN: Code duplicated, block: B:58:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198 A[LOOP:1: B:64:0x0192->B:66:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0166 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object c(akhj akhjVar, java.lang.String str, akst akstVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        acei aceiVar;
        java.lang.String str2;
        java.lang.String str3;
        akst akstVar2;
        java.lang.String str4;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationBx;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation;
        java.lang.String str5;
        java.lang.String str6;
        defpackage.adtz adtzVar;
        int iR;
        java.lang.String str7;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation2;
        defpackage.adtz adtzVar2;
        int iR2;
        akrn akrnVar;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.Long l;
        java.lang.Object objBQ;
        aksx aksxVar;
        akhj akhjVar2 = akhjVar;
        if (aolnVar instanceof acei) {
            aceiVar = (acei) aolnVar;
            int i = aceiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aceiVar.f = i - Integer.MIN_VALUE;
            } else {
                aceiVar = new acei(this, aolnVar);
            }
        } else {
            aceiVar = new acei(this, aolnVar);
        }
        acei aceiVar2 = aceiVar;
        java.lang.Object objE = aceiVar2.d;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        switch (aceiVar2.f) {
            case 0:
                defpackage.aooc.af(objE);
                if (str == null) {
                    akhf akhfVar = akhjVar2.c;
                    if (akhfVar == null) {
                        akhfVar = akhf.a;
                    }
                    java.lang.String str8 = akhfVar.c;
                    defpackage.aooh.e(str8, "getPseudonymousId(...)");
                    if (str8.length() == 0) {
                        return new adtw("Syncing signed-out user, yet no Zwieback cookie is provided.", defpackage.adty.j);
                    }
                    akhf akhfVar2 = akhjVar2.c;
                    if (akhfVar2 == null) {
                        akhfVar2 = akhf.a;
                    }
                    str2 = akhfVar2.c;
                } else {
                    str2 = null;
                }
                defpackage.ajcq ajcqVarC = ((defpackage.acgr) this.p.o(str)).c();
                defpackage.aooh.e(ajcqVarC, "getAll(...)");
                aceiVar2.a = akhjVar2;
                aceiVar2.b = str;
                aceiVar2.c = akstVar;
                aceiVar2.g = str2;
                aceiVar2.f = 1;
                java.lang.Object objD = defpackage.aosv.D(ajcqVarC, aceiVar2);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                objE = objD;
                akstVar2 = akstVar;
                str4 = str;
                java.util.Map map = (java.util.Map) objE;
                accountRepresentationBx = defpackage.agab.bx(str4);
                defpackage.aooh.c(map);
                aceiVar2.a = str4;
                aceiVar2.b = str3;
                aceiVar2.c = accountRepresentationBx;
                aceiVar2.g = null;
                aceiVar2.f = 2;
                objE = e(akhjVar2, accountRepresentationBx, map, akstVar2, aceiVar2);
                if (objE != aoluVar) {
                    return aoluVar;
                }
                accountRepresentation = accountRepresentationBx;
                str5 = str4;
                str6 = str3;
                adtzVar = (defpackage.adtz) objE;
                iR = defpackage.anty.R(adtzVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return (defpackage.adtv) adtzVar;
                    }
                    throw new defpackage.aois();
                }
                akrm akrmVar = (akrm) ((defpackage.adub) adtzVar).a;
                defpackage.aedo aedoVar = this.f;
                aceiVar2.a = str5;
                aceiVar2.b = accountRepresentation;
                aceiVar2.c = null;
                aceiVar2.f = 3;
                defpackage.aeeb aeebVar = (defpackage.aeeb) aedoVar;
                objE = defpackage.aoov.aj(aeebVar.b, new uhy(aeebVar, accountRepresentation, str6, akrmVar, (defpackage.aoln) null, 8), aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                str7 = str5;
                accountRepresentation2 = accountRepresentation;
                adtzVar2 = (defpackage.adtz) objE;
                iR2 = defpackage.anty.R(adtzVar2);
                if (iR2 != 0) {
                    if (iR2 == 1) {
                        return (defpackage.adtv) adtzVar2;
                    }
                    throw new defpackage.aois();
                }
                akrnVar = (akrn) ((defpackage.adub) adtzVar2).a;
                defpackage.alat alatVar = akrnVar.b;
                defpackage.aooh.e(alatVar, "getNotificationThreadList(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : alatVar) {
                    aksxVar = (aksx) obj;
                    if (!aksxVar.k && aksxVar.j > 0) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Long(((aksx) it.next()).j));
                }
                l = (java.lang.Long) defpackage.ajsz.bB(arrayList);
                if (l != null) {
                    defpackage.acxg acxgVar = this.q;
                    defpackage.alcf alcfVarD = defpackage.aldi.d(l.longValue());
                    defpackage.aooh.e(alcfVarD, "fromMicros(...)");
                    aceiVar2.a = str7;
                    aceiVar2.b = accountRepresentation2;
                    aceiVar2.c = akrnVar;
                    aceiVar2.f = 4;
                    objBQ = defpackage.agab.bQ((defpackage.apdp) acxgVar.a, new defpackage.nhv(acxgVar, alcfVarD, (defpackage.aoln) null, 13), aceiVar2);
                    if (objBQ != aoluVar) {
                        objBQ = defpackage.aojh.a;
                    }
                    if (objBQ == aoluVar) {
                        return aoluVar;
                    }
                }
                aceiVar2.a = str7;
                aceiVar2.b = null;
                aceiVar2.c = null;
                aceiVar2.f = 5;
                objE = d(accountRepresentation2, str7, akrnVar, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                aceiVar2.a = null;
                aceiVar2.f = 6;
                objE = a((akrn) objE, str7, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.adub(objE);
            case 1:
                java.lang.String str9 = aceiVar2.g;
                akst akstVar3 = (akst) aceiVar2.c;
                java.lang.String str10 = (java.lang.String) aceiVar2.b;
                akhj akhjVar3 = (akhj) aceiVar2.a;
                defpackage.aooc.af(objE);
                str3 = str9;
                akhjVar2 = akhjVar3;
                str4 = str10;
                akstVar2 = akstVar3;
                java.util.Map map2 = (java.util.Map) objE;
                accountRepresentationBx = defpackage.agab.bx(str4);
                defpackage.aooh.c(map2);
                aceiVar2.a = str4;
                aceiVar2.b = str3;
                aceiVar2.c = accountRepresentationBx;
                aceiVar2.g = null;
                aceiVar2.f = 2;
                objE = e(akhjVar2, accountRepresentationBx, map2, akstVar2, aceiVar2);
                if (objE != aoluVar) {
                    return aoluVar;
                }
                accountRepresentation = accountRepresentationBx;
                str5 = str4;
                str6 = str3;
                adtzVar = (defpackage.adtz) objE;
                iR = defpackage.anty.R(adtzVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return (defpackage.adtv) adtzVar;
                    }
                    throw new defpackage.aois();
                }
                akrm akrmVar2 = (akrm) ((defpackage.adub) adtzVar).a;
                defpackage.aedo aedoVar2 = this.f;
                aceiVar2.a = str5;
                aceiVar2.b = accountRepresentation;
                aceiVar2.c = null;
                aceiVar2.f = 3;
                defpackage.aeeb aeebVar2 = (defpackage.aeeb) aedoVar2;
                objE = defpackage.aoov.aj(aeebVar2.b, new uhy(aeebVar2, accountRepresentation, str6, akrmVar2, (defpackage.aoln) null, 8), aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                str7 = str5;
                accountRepresentation2 = accountRepresentation;
                adtzVar2 = (defpackage.adtz) objE;
                iR2 = defpackage.anty.R(adtzVar2);
                if (iR2 != 0) {
                    if (iR2 == 1) {
                        return (defpackage.adtv) adtzVar2;
                    }
                    throw new defpackage.aois();
                }
                akrnVar = (akrn) ((defpackage.adub) adtzVar2).a;
                defpackage.alat alatVar2 = akrnVar.b;
                defpackage.aooh.e(alatVar2, "getNotificationThreadList(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (r4.hasNext()) {
                    aksxVar = (aksx) obj;
                    if (!aksxVar.k) {
                    }
                }
                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(arrayList3, 10));
                it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Long(((aksx) it.next()).j));
                }
                l = (java.lang.Long) defpackage.ajsz.bB(arrayList);
                if (l != null) {
                    defpackage.acxg acxgVar2 = this.q;
                    defpackage.alcf alcfVarD2 = defpackage.aldi.d(l.longValue());
                    defpackage.aooh.e(alcfVarD2, "fromMicros(...)");
                    aceiVar2.a = str7;
                    aceiVar2.b = accountRepresentation2;
                    aceiVar2.c = akrnVar;
                    aceiVar2.f = 4;
                    objBQ = defpackage.agab.bQ((defpackage.apdp) acxgVar2.a, new defpackage.nhv(acxgVar2, alcfVarD2, (defpackage.aoln) null, 13), aceiVar2);
                    if (objBQ != aoluVar) {
                        objBQ = defpackage.aojh.a;
                    }
                    if (objBQ == aoluVar) {
                        return aoluVar;
                    }
                }
                aceiVar2.a = str7;
                aceiVar2.b = null;
                aceiVar2.c = null;
                aceiVar2.f = 5;
                objE = d(accountRepresentation2, str7, akrnVar, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                aceiVar2.a = null;
                aceiVar2.f = 6;
                objE = a((akrn) objE, str7, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.adub(objE);
            case 2:
                com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation3 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) aceiVar2.c;
                java.lang.String str11 = (java.lang.String) aceiVar2.b;
                java.lang.String str12 = (java.lang.String) aceiVar2.a;
                defpackage.aooc.af(objE);
                accountRepresentation = accountRepresentation3;
                str6 = str11;
                str5 = str12;
                adtzVar = (defpackage.adtz) objE;
                iR = defpackage.anty.R(adtzVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return (defpackage.adtv) adtzVar;
                    }
                    throw new defpackage.aois();
                }
                akrm akrmVar3 = (akrm) ((defpackage.adub) adtzVar).a;
                defpackage.aedo aedoVar3 = this.f;
                aceiVar2.a = str5;
                aceiVar2.b = accountRepresentation;
                aceiVar2.c = null;
                aceiVar2.f = 3;
                defpackage.aeeb aeebVar3 = (defpackage.aeeb) aedoVar3;
                objE = defpackage.aoov.aj(aeebVar3.b, new uhy(aeebVar3, accountRepresentation, str6, akrmVar3, (defpackage.aoln) null, 8), aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                str7 = str5;
                accountRepresentation2 = accountRepresentation;
                adtzVar2 = (defpackage.adtz) objE;
                iR2 = defpackage.anty.R(adtzVar2);
                if (iR2 != 0) {
                    if (iR2 == 1) {
                        return (defpackage.adtv) adtzVar2;
                    }
                    throw new defpackage.aois();
                }
                akrnVar = (akrn) ((defpackage.adub) adtzVar2).a;
                defpackage.alat alatVar3 = akrnVar.b;
                defpackage.aooh.e(alatVar3, "getNotificationThreadList(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                while (r4.hasNext()) {
                    aksxVar = (aksx) obj;
                    if (!aksxVar.k) {
                    }
                }
                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Long(((aksx) it.next()).j));
                }
                l = (java.lang.Long) defpackage.ajsz.bB(arrayList);
                if (l != null) {
                    defpackage.acxg acxgVar3 = this.q;
                    defpackage.alcf alcfVarD3 = defpackage.aldi.d(l.longValue());
                    defpackage.aooh.e(alcfVarD3, "fromMicros(...)");
                    aceiVar2.a = str7;
                    aceiVar2.b = accountRepresentation2;
                    aceiVar2.c = akrnVar;
                    aceiVar2.f = 4;
                    objBQ = defpackage.agab.bQ((defpackage.apdp) acxgVar3.a, new defpackage.nhv(acxgVar3, alcfVarD3, (defpackage.aoln) null, 13), aceiVar2);
                    if (objBQ != aoluVar) {
                        objBQ = defpackage.aojh.a;
                    }
                    if (objBQ == aoluVar) {
                        return aoluVar;
                    }
                }
                aceiVar2.a = str7;
                aceiVar2.b = null;
                aceiVar2.c = null;
                aceiVar2.f = 5;
                objE = d(accountRepresentation2, str7, akrnVar, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                aceiVar2.a = null;
                aceiVar2.f = 6;
                objE = a((akrn) objE, str7, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.adub(objE);
            case 3:
                com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation4 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) aceiVar2.b;
                java.lang.String str13 = (java.lang.String) aceiVar2.a;
                defpackage.aooc.af(objE);
                accountRepresentation2 = accountRepresentation4;
                str7 = str13;
                adtzVar2 = (defpackage.adtz) objE;
                iR2 = defpackage.anty.R(adtzVar2);
                if (iR2 != 0) {
                    if (iR2 == 1) {
                        return (defpackage.adtv) adtzVar2;
                    }
                    throw new defpackage.aois();
                }
                akrnVar = (akrn) ((defpackage.adub) adtzVar2).a;
                defpackage.alat alatVar4 = akrnVar.b;
                defpackage.aooh.e(alatVar4, "getNotificationThreadList(...)");
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                while (r4.hasNext()) {
                    aksxVar = (aksx) obj;
                    if (!aksxVar.k) {
                    }
                }
                arrayList = new java.util.ArrayList(defpackage.ajsz.bl(arrayList5, 10));
                it = arrayList5.iterator();
                while (it.hasNext()) {
                    arrayList.add(new java.lang.Long(((aksx) it.next()).j));
                }
                l = (java.lang.Long) defpackage.ajsz.bB(arrayList);
                if (l != null) {
                    defpackage.acxg acxgVar4 = this.q;
                    defpackage.alcf alcfVarD4 = defpackage.aldi.d(l.longValue());
                    defpackage.aooh.e(alcfVarD4, "fromMicros(...)");
                    aceiVar2.a = str7;
                    aceiVar2.b = accountRepresentation2;
                    aceiVar2.c = akrnVar;
                    aceiVar2.f = 4;
                    objBQ = defpackage.agab.bQ((defpackage.apdp) acxgVar4.a, new defpackage.nhv(acxgVar4, alcfVarD4, (defpackage.aoln) null, 13), aceiVar2);
                    if (objBQ != aoluVar) {
                        objBQ = defpackage.aojh.a;
                    }
                    if (objBQ == aoluVar) {
                        return aoluVar;
                    }
                }
                aceiVar2.a = str7;
                aceiVar2.b = null;
                aceiVar2.c = null;
                aceiVar2.f = 5;
                objE = d(accountRepresentation2, str7, akrnVar, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                aceiVar2.a = null;
                aceiVar2.f = 6;
                objE = a((akrn) objE, str7, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.adub(objE);
            case 4:
                akrn akrnVar2 = (akrn) aceiVar2.c;
                accountRepresentation2 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) aceiVar2.b;
                java.lang.String str14 = (java.lang.String) aceiVar2.a;
                defpackage.aooc.af(objE);
                akrnVar = akrnVar2;
                str7 = str14;
                aceiVar2.a = str7;
                aceiVar2.b = null;
                aceiVar2.c = null;
                aceiVar2.f = 5;
                objE = d(accountRepresentation2, str7, akrnVar, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                aceiVar2.a = null;
                aceiVar2.f = 6;
                objE = a((akrn) objE, str7, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.adub(objE);
            case 5:
                str7 = (java.lang.String) aceiVar2.a;
                defpackage.aooc.af(objE);
                aceiVar2.a = null;
                aceiVar2.f = 6;
                objE = a((akrn) objE, str7, aceiVar2);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                return new defpackage.adub(objE);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(objE);
                return new defpackage.adub(objE);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0199  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [acal] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r1v15, types: [adye] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection, java.util.List] */
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
    public final java.lang.Object d(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.lang.String str, akrn akrnVar, defpackage.aoln aolnVar) {
        acej acejVar;
        akrn akrnVar2;
        ?? r4;
        java.lang.String str2;
        ?? r10;
        ?? r5;
        akrn akrnVar3;
        ?? r0;
        java.util.ArrayList arrayList;
        akrn akrnVar4;
        defpackage.alat alatVar;
        aksq aksqVar;
        int iAR;
        if (aolnVar instanceof acej) {
            acejVar = (acej) aolnVar;
            int i = acejVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                acejVar.g = i - Integer.MIN_VALUE;
            } else {
                acejVar = new acej(this, aolnVar);
            }
        } else {
            acejVar = new acej(this, aolnVar);
        }
        java.lang.Object obj = acejVar.e;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acejVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = acejVar.d;
                java.lang.Object obj3 = acejVar.c;
                akrnVar2 = (akrn) acejVar.b;
                str2 = (java.lang.String) acejVar.a;
                defpackage.aooc.af(obj);
                r4 = obj2;
                r10 = obj3;
            } else if (i2 == 2) {
                java.util.List list = (java.util.List) acejVar.b;
                akrn akrnVar5 = (akrn) acejVar.a;
                defpackage.aooc.af(obj);
                akrnVar2 = akrnVar5;
                r5 = list;
                r5 = r4;
                if (!r5.isEmpty()) {
                    r0 = this.e;
                    acejVar.a = akrnVar2;
                    acejVar.b = null;
                    acejVar.c = null;
                    acejVar.d = null;
                    acejVar.g = 3;
                    if (r0.r(r5) == aoluVar) {
                        return aoluVar;
                    }
                }
                akrnVar3 = akrnVar2;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                akrnVar3 = (akrn) acejVar.a;
                defpackage.aooc.af(obj);
            }
            defpackage.akzx akzxVarL = akrnVar3.L();
            defpackage.aooh.f(akzxVarL, "builder");
            aknx.b(akzxVarL);
            akzxVarL.u();
            akzxVarL.b.b = defpackage.albq.a;
            aknx.b(akzxVarL);
            defpackage.alat alatVar2 = akrnVar3.b;
            defpackage.aooh.e(alatVar2, "getNotificationThreadList(...)");
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj4 : alatVar2) {
                aksqVar = ((aksx) obj4).r;
                if (aksqVar == null) {
                    aksqVar = aksq.a;
                }
                iAR = defpackage.a.aR(aksqVar.b);
                if (iAR == 0) {
                    iAR = 1;
                }
                if (iAR != 4) {
                    arrayList.add(obj4);
                }
            }
            akzxVarL.u();
            akrnVar4 = akzxVarL.b;
            alatVar = akrnVar4.b;
            if (!alatVar.c()) {
                akrnVar4.b = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(arrayList, akrnVar4.b);
            akrn akrnVarR = akzxVarL.r();
            defpackage.aooh.e(akrnVarR, "build(...)");
            return akrnVarR;
        }
        defpackage.aooc.af(obj);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        acejVar.a = str;
        akrnVar2 = akrnVar;
        acejVar.b = akrnVar2;
        acejVar.c = arrayList2;
        acejVar.d = arrayList3;
        acejVar.g = 1;
        java.lang.Object objB = b(accountRepresentation, acejVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        r4 = arrayList3;
        obj = objB;
        str2 = str;
        r10 = arrayList2;
        defpackage.aduy aduyVar = (defpackage.aduy) ((defpackage.adtz) obj).d();
        java.lang.String str3 = aduyVar != null ? aduyVar.i : null;
        for (aksx aksxVar : akrnVar2.b) {
            defpackage.alat alatVar3 = aksxVar.q;
            defpackage.aooh.e(alatVar3, "getHealthExperimentsList(...)");
            java.util.ArrayList arrayList4 = new java.util.ArrayList(defpackage.ajsz.bl(alatVar3, 10));
            java.util.Iterator it = alatVar3.iterator();
            while (it.hasNext()) {
                arrayList4.add(new java.lang.Integer(((aksw) it.next()).b));
            }
            defpackage.ajsz.bv(r10, arrayList4);
            aksq aksqVar2 = aksxVar.r;
            if (aksqVar2 == null) {
                aksqVar2 = aksq.a;
            }
            int iAR2 = defpackage.a.aR(aksqVar2.b);
            if (iAR2 == 0) {
                iAR2 = 1;
            }
            if (iAR2 == 4) {
                defpackage.aooh.c(aksxVar);
                akhl akhlVarA = acgm.a(aksxVar);
                aksc akscVarG = g(aksxVar);
                adrp adrpVarH = com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext.h();
                adrpVarH.h(akhlVarA);
                adrpVarH.d = akscVarG;
                adrpVarH.i(j$.time.Instant.now().toEpochMilli());
                if (str2 != null) {
                    adrpVarH.a = str2;
                }
                if (str3 != null && str3.length() != 0) {
                    adrpVarH.c = str3;
                }
                r4.add(adrpVarH.f());
            }
        }
        if (str2 == null || r10.isEmpty()) {
            r5 = r4;
            if (!r10.isEmpty()) {
                ((defpackage.aiob) a.d()).v("Health experiment IDs are not empty but account name is null, skipping GNP Rasta processing.");
                r5 = r4;
            }
        } else {
            ?? r1 = this.m;
            defpackage.aokc aokcVar = defpackage.aokc.a;
            acejVar.a = akrnVar2;
            acejVar.b = r4;
            acejVar.c = null;
            acejVar.d = null;
            acejVar.g = 2;
            if (r1.b(str2, aokcVar, r10, acejVar) == aoluVar) {
                r5 = r4;
                return aoluVar;
            }
        }
        r5 = r4;
        if (!r5.isEmpty()) {
            r0 = this.e;
            acejVar.a = akrnVar2;
            acejVar.b = null;
            acejVar.c = null;
            acejVar.d = null;
            acejVar.g = 3;
            if (r0.r(r5) == aoluVar) {
                return aoluVar;
            }
        }
        akrnVar3 = akrnVar2;
        defpackage.akzx akzxVarL2 = akrnVar3.L();
        defpackage.aooh.f(akzxVarL2, "builder");
        aknx.b(akzxVarL2);
        akzxVarL2.u();
        akzxVarL2.b.b = defpackage.albq.a;
        aknx.b(akzxVarL2);
        defpackage.alat alatVar4 = akrnVar3.b;
        defpackage.aooh.e(alatVar4, "getNotificationThreadList(...)");
        arrayList = new java.util.ArrayList();
        while (r0.hasNext()) {
            aksqVar = ((aksx) obj4).r;
            if (aksqVar == null) {
                aksqVar = aksq.a;
            }
            iAR = defpackage.a.aR(aksqVar.b);
            if (iAR == 0) {
                iAR = 1;
            }
            if (iAR != 4) {
                arrayList.add(obj4);
            }
        }
        akzxVarL2.u();
        akrnVar4 = akzxVarL2.b;
        alatVar = akrnVar4.b;
        if (!alatVar.c()) {
            akrnVar4.b = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(arrayList, akrnVar4.b);
        akrn akrnVarR2 = akzxVarL2.r();
        defpackage.aooh.e(akrnVarR2, "build(...)");
        return akrnVarR2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0141  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0244  */
    /* JADX WARN: Code duplicated, block: B:50:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x024e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0253  */
    /* JADX WARN: Code duplicated, block: B:56:0x0256 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0258  */
    /* JADX WARN: Code duplicated, block: B:60:0x026a  */
    /* JADX WARN: Code duplicated, block: B:61:0x026d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0270  */
    /* JADX WARN: Code duplicated, block: B:63:0x0272  */
    /* JADX WARN: Code duplicated, block: B:66:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0306  */
    /* JADX WARN: Code duplicated, block: B:73:0x030e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0312  */
    /* JADX WARN: Code duplicated, block: B:78:0x0320  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x032e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0349  */
    /* JADX WARN: Code duplicated, block: B:87:0x036b  */
    /* JADX WARN: Code duplicated, block: B:90:0x037c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0380  */
    /* JADX WARN: Code duplicated, block: B:97:0x03b4  */
    public final java.lang.Object e(akhj akhjVar, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.util.Map map, akst akstVar, defpackage.aoln aolnVar) {
        acek acekVar;
        defpackage.xtq xtqVar;
        defpackage.aduw aduwVar;
        akhj akhjVar2;
        java.lang.Object objA;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation2;
        java.util.Map map2;
        akst akstVar2;
        defpackage.xtq xtqVar2;
        defpackage.akrw akrwVar;
        akhj akhjVar3;
        defpackage.xtq xtqVar3;
        java.util.Map map3;
        defpackage.xtq xtqVar4;
        defpackage.adtz adtzVar;
        int iR;
        akrm akrmVar;
        defpackage.alak alakVar;
        java.lang.String str;
        java.util.ArrayList arrayList;
        akrm akrmVar2;
        defpackage.alat alatVar;
        defpackage.akzx akzxVarM;
        int iAO;
        int i;
        int i2;
        akhh akhhVar;
        akhh akhhVar2;
        akhh akhhVarR;
        akhq akhqVar;
        aksc akscVarAp;
        defpackage.alcf alcfVar;
        aksa aksaVar;
        defpackage.alat alatVar2;
        defpackage.alcf alcfVar2;
        akhq akhqVar2;
        akhh akhhVar3;
        if (aolnVar instanceof acek) {
            acekVar = (acek) aolnVar;
            int i3 = acekVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                acekVar.h = i3 - Integer.MIN_VALUE;
            } else {
                acekVar = new acek(this, aolnVar);
            }
        } else {
            acekVar = new acek(this, aolnVar);
        }
        java.lang.Object objF = acekVar.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i4 = acekVar.h;
        int i5 = 1;
        if (i4 != 0) {
            if (i4 == 1) {
                defpackage.aduw aduwVar2 = (defpackage.aduw) acekVar.e;
                xtqVar = (defpackage.xtq) acekVar.d;
                defpackage.xtq xtqVar5 = acekVar.j;
                akstVar2 = (akst) acekVar.c;
                java.util.Map map4 = (java.util.Map) acekVar.b;
                accountRepresentation2 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) acekVar.a;
                akhj akhjVar4 = acekVar.i;
                defpackage.aooc.af(objF);
                aduwVar = aduwVar2;
                map2 = map4;
                akhjVar2 = akhjVar4;
                xtqVar2 = xtqVar5;
                objA = objF;
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xtqVar4 = (defpackage.xtq) acekVar.e;
                akrwVar = (defpackage.akrw) acekVar.d;
                xtqVar = acekVar.j;
                xtqVar3 = (defpackage.xtq) acekVar.c;
                akstVar2 = (akst) acekVar.b;
                map3 = (java.util.Map) acekVar.a;
                akhjVar3 = acekVar.i;
                defpackage.aooc.af(objF);
            }
            adtzVar = (defpackage.adtz) objF;
            iR = defpackage.anty.R(adtzVar);
            if (iR != 0) {
                if (iR == 1) {
                    return (defpackage.adtv) adtzVar;
                }
                throw new defpackage.aois();
            }
            akrz akrzVar = (akrz) ((defpackage.adub) adtzVar).a;
            defpackage.aooh.f(akrzVar, "value");
            defpackage.akzx akzxVar = (defpackage.akzx) xtqVar4.a;
            akzxVar.u();
            akrm akrmVar3 = akzxVar.b;
            defpackage.alal alalVar = akrm.a;
            j$.util.Objects.requireNonNull(akrzVar);
            akrmVar3.e = akrzVar;
            akrmVar3.c |= 2;
            defpackage.akzx akzxVar2 = (defpackage.akzx) xtqVar.a;
            new defpackage.alct(new defpackage.alam(akzxVar2.b.i, akrm.a));
            akte akteVar = akte.c;
            akzxVar2.u();
            akrmVar = akzxVar2.b;
            j$.util.Objects.requireNonNull(akteVar);
            alakVar = akrmVar.i;
            if (!alakVar.c()) {
                akrmVar.i = defpackage.alad.H(alakVar);
            }
            akrmVar.i.g(akteVar.d);
            defpackage.aooh.f(akstVar2, "value");
            akzxVar2.u();
            akrm akrmVar4 = akzxVar2.b;
            akrmVar4.h = akstVar2.q;
            akrmVar4.c |= 32;
            akzxVar2.u();
            akrm akrmVar5 = akzxVar2.b;
            akrmVar5.j = 2;
            akrmVar5.c |= 512;
            defpackage.aooh.f(akrwVar, "value");
            akzxVar2.u();
            akrm akrmVar6 = akzxVar2.b;
            j$.util.Objects.requireNonNull(akrwVar);
            akrmVar6.g = akrwVar;
            akrmVar6.c |= 16;
            str = this.g.a;
            if (str != null || str.length() == 0) {
                ((defpackage.aiob) a.d()).v("No client ID is found when syncing using Chime, sync might fail.");
            } else {
                akzxVar2.u();
                akrm akrmVar7 = akzxVar2.b;
                j$.util.Objects.requireNonNull(str);
                akrmVar7.c |= 1;
                akrmVar7.d = str;
            }
            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVar2.b.f);
            defpackage.aooh.e(listUnmodifiableList, "getThreadInteractionUpdateList(...)");
            new defpackage.alct(listUnmodifiableList);
            defpackage.alat<akhi> alatVar3 = akhjVar3.d;
            defpackage.aooh.e(alatVar3, "getPresentedPromoList(...)");
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(alatVar3, 10));
            for (akhi akhiVar : alatVar3) {
                defpackage.aooh.c(akhiVar);
                akzxVarM = aksa.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                defpackage.akzx akzxVarM2 = aktm.a.m();
                defpackage.aooh.f(akzxVarM2, "builder");
                akzxVarM2.u();
                aktm aktmVar = akzxVarM2.b;
                aktmVar.c = 4;
                aktmVar.b |= i5;
                aktm aktmVarR = akzxVarM2.r();
                defpackage.aooh.e(aktmVarR, "build(...)");
                aktm aktmVar2 = aktmVarR;
                defpackage.aooh.f(aktmVar2, "value");
                akzxVarM.u();
                aksa aksaVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(aktmVar2);
                aksaVar2.d = aktmVar2;
                aksaVar2.b |= i5;
                defpackage.akzx akzxVarM3 = akqv.a.m();
                defpackage.aooh.f(akzxVarM3, "builder");
                defpackage.akzx akzxVarM4 = akqu.a.m();
                defpackage.aooh.f(akzxVarM4, "builder");
                iAO = defpackage.a.aO(akhiVar.d);
                if (iAO == 0) {
                    iAO = i5;
                }
                i = iAO - 2;
                int i6 = i5;
                if (i != 0) {
                    i2 = 6;
                } else if (i != i5) {
                    i2 = 3;
                    if (i != 2) {
                        if (i != 3) {
                            i2 = 8;
                        } else if (i != 4) {
                            i2 = 9;
                        } else {
                            if (i == 6) {
                                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.Integer.toString(i)));
                            }
                            i2 = 7;
                        }
                    }
                } else {
                    i2 = 4;
                }
                akzxVarM4.u();
                akqu akquVar = akzxVarM4.b;
                akquVar.c = i2 - 1;
                akquVar.b |= 1;
                akzxVarM4.u();
                akqu akquVar2 = akzxVarM4.b;
                akquVar2.d = 4;
                akquVar2.b |= 4;
                akqu akquVarR = akzxVarM4.r();
                defpackage.aooh.e(akquVarR, "build(...)");
                akqu akquVar3 = akquVarR;
                defpackage.aooh.f(akquVar3, "value");
                akzxVarM3.u();
                akqv akqvVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(akquVar3);
                akqvVar.c = akquVar3;
                akqvVar.b = 4;
                akqv akqvVarR = akzxVarM3.r();
                defpackage.aooh.e(akqvVarR, "build(...)");
                akqv akqvVar2 = akqvVarR;
                defpackage.aooh.f(akqvVar2, "value");
                akzxVarM.u();
                aksa aksaVar3 = akzxVarM.b;
                j$.util.Objects.requireNonNull(akqvVar2);
                aksaVar3.e = akqvVar2;
                aksaVar3.b |= 2;
                java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.c);
                defpackage.aooh.e(listUnmodifiableList2, "getVersionedIdentifierList(...)");
                new defpackage.alct(listUnmodifiableList2);
                akhhVar = akhiVar.g;
                if (akhhVar == null) {
                    akhhVar = akhh.a;
                }
                akhhVar2 = akhh.a;
                defpackage.akzx akzxVarM5 = akhhVar2.m();
                defpackage.aooh.f(akzxVarM5, "builder");
                akhhVarR = akzxVarM5.r();
                defpackage.aooh.e(akhhVarR, "build(...)");
                if (defpackage.aooh.n(akhhVar, akhhVarR)) {
                    akhqVar = akhiVar.c;
                    if (akhqVar == null) {
                        akhqVar = akhq.a;
                    }
                    akscVarAp = (aksc) map3.get(abxl.r(akhqVar));
                } else {
                    defpackage.ahxq ahxqVarE = n.e();
                    akhhVar3 = akhiVar.g;
                    if (akhhVar3 != null) {
                        akhhVar2 = akhhVar3;
                    }
                    akscVarAp = (aksc) ahxqVarE.d(akhhVar2);
                }
                if (akscVarAp == null) {
                    defpackage.xtq xtqVarO = aklu.o(aksc.a.m());
                    akhqVar2 = akhiVar.c;
                    if (akhqVar2 == null) {
                        akhqVar2 = akhq.a;
                    }
                    xtqVarO.aq(java.lang.String.valueOf(akhqVar2.b));
                    akscVarAp = xtqVarO.ap();
                }
                defpackage.xtq xtqVarO2 = aklu.o(akscVarAp.L());
                alcfVar = akhiVar.e;
                if (alcfVar == null) {
                    alcfVar = defpackage.alcf.a;
                }
                xtqVarO2.ar(defpackage.aldi.a(alcfVar));
                aksc akscVarAp2 = xtqVarO2.ap();
                defpackage.aooh.f(akscVarAp2, "value");
                akzxVarM.u();
                aksaVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(akscVarAp2);
                alatVar2 = aksaVar.c;
                if (!alatVar2.c()) {
                    aksaVar.c = defpackage.alad.J(alatVar2);
                }
                aksaVar.c.add(akscVarAp2);
                if ((akhiVar.b & 4) == 0) {
                    alcfVar2 = akhiVar.f;
                    if (alcfVar2 == null) {
                        alcfVar2 = defpackage.alcf.a;
                    }
                    long jA = defpackage.aldi.a(alcfVar2);
                    akzxVarM.u();
                    aksa aksaVar4 = akzxVarM.b;
                    aksaVar4.b |= 4;
                    aksaVar4.f = jA;
                }
                aksa aksaVarR = akzxVarM.r();
                defpackage.aooh.e(aksaVarR, "build(...)");
                arrayList.add(aksaVarR);
                i5 = i6;
            }
            akzxVar2.u();
            akrmVar2 = akzxVar2.b;
            alatVar = akrmVar2.f;
            if (!alatVar.c()) {
                akrmVar2.f = defpackage.alad.J(alatVar);
            }
            defpackage.akyl.i(arrayList, akrmVar2.f);
            akrm akrmVarR = ((defpackage.akzx) xtqVar3.a).r();
            defpackage.aooh.e(akrmVarR, "build(...)");
            return new defpackage.adub(akrmVarR);
        }
        defpackage.aooc.af(objF);
        defpackage.akzx akzxVarM6 = akrm.b.m();
        defpackage.aooh.f(akzxVarM6, "builder");
        xtqVar = new defpackage.xtq(akzxVarM6);
        aduwVar = ((java.lang.Boolean) this.l.a()).booleanValue() ? defpackage.aduw.b : defpackage.aduw.c;
        defpackage.aefe aefeVar = this.k;
        java.util.Set setAF = defpackage.ajsz.aF(defpackage.aegl.IN_APP);
        akhjVar2 = akhjVar;
        acekVar.i = akhjVar2;
        acekVar.a = accountRepresentation;
        acekVar.b = map;
        acekVar.c = akstVar;
        acekVar.j = xtqVar;
        acekVar.d = xtqVar;
        acekVar.e = aduwVar;
        acekVar.h = 1;
        objA = aefeVar.a(accountRepresentation, setAF, aduwVar, acekVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        accountRepresentation2 = accountRepresentation;
        map2 = map;
        akstVar2 = akstVar;
        xtqVar2 = xtqVar;
        defpackage.akrw akrwVar2 = (defpackage.akrw) objA;
        acekVar.i = akhjVar2;
        acekVar.a = map2;
        acekVar.b = akstVar2;
        acekVar.c = xtqVar2;
        acekVar.j = xtqVar;
        acekVar.d = akrwVar2;
        acekVar.e = xtqVar;
        acekVar.h = 2;
        objF = f(accountRepresentation2, akhjVar2, aduwVar, acekVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        akrwVar = akrwVar2;
        akhjVar3 = akhjVar2;
        xtqVar3 = xtqVar2;
        map3 = map2;
        xtqVar4 = xtqVar;
        adtzVar = (defpackage.adtz) objF;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (iR == 1) {
                return (defpackage.adtv) adtzVar;
            }
            throw new defpackage.aois();
        }
        akrz akrzVar2 = (akrz) ((defpackage.adub) adtzVar).a;
        defpackage.aooh.f(akrzVar2, "value");
        defpackage.akzx akzxVar3 = (defpackage.akzx) xtqVar4.a;
        akzxVar3.u();
        akrm akrmVar8 = akzxVar3.b;
        defpackage.alal alalVar2 = akrm.a;
        j$.util.Objects.requireNonNull(akrzVar2);
        akrmVar8.e = akrzVar2;
        akrmVar8.c |= 2;
        defpackage.akzx akzxVar4 = (defpackage.akzx) xtqVar.a;
        new defpackage.alct(new defpackage.alam(akzxVar4.b.i, akrm.a));
        akte akteVar2 = akte.c;
        akzxVar4.u();
        akrmVar = akzxVar4.b;
        j$.util.Objects.requireNonNull(akteVar2);
        alakVar = akrmVar.i;
        if (!alakVar.c()) {
            akrmVar.i = defpackage.alad.H(alakVar);
        }
        akrmVar.i.g(akteVar2.d);
        defpackage.aooh.f(akstVar2, "value");
        akzxVar4.u();
        akrm akrmVar9 = akzxVar4.b;
        akrmVar9.h = akstVar2.q;
        akrmVar9.c |= 32;
        akzxVar4.u();
        akrm akrmVar10 = akzxVar4.b;
        akrmVar10.j = 2;
        akrmVar10.c |= 512;
        defpackage.aooh.f(akrwVar, "value");
        akzxVar4.u();
        akrm akrmVar11 = akzxVar4.b;
        j$.util.Objects.requireNonNull(akrwVar);
        akrmVar11.g = akrwVar;
        akrmVar11.c |= 16;
        str = this.g.a;
        if (str != null) {
            ((defpackage.aiob) a.d()).v("No client ID is found when syncing using Chime, sync might fail.");
        } else {
            ((defpackage.aiob) a.d()).v("No client ID is found when syncing using Chime, sync might fail.");
        }
        java.util.List listUnmodifiableList3 = j$.util.DesugarCollections.unmodifiableList(akzxVar4.b.f);
        defpackage.aooh.e(listUnmodifiableList3, "getThreadInteractionUpdateList(...)");
        new defpackage.alct(listUnmodifiableList3);
        defpackage.alat<akhi> alatVar4 = akhjVar3.d;
        defpackage.aooh.e(alatVar4, "getPresentedPromoList(...)");
        arrayList = new java.util.ArrayList(defpackage.ajsz.bl(alatVar4, 10));
        while (r0.hasNext()) {
            defpackage.aooh.c(akhiVar);
            akzxVarM = aksa.a.m();
            defpackage.aooh.f(akzxVarM, "builder");
            defpackage.akzx akzxVarM7 = aktm.a.m();
            defpackage.aooh.f(akzxVarM7, "builder");
            akzxVarM7.u();
            aktm aktmVar3 = akzxVarM7.b;
            aktmVar3.c = 4;
            aktmVar3.b |= i5;
            aktm aktmVarR2 = akzxVarM7.r();
            defpackage.aooh.e(aktmVarR2, "build(...)");
            aktm aktmVar4 = aktmVarR2;
            defpackage.aooh.f(aktmVar4, "value");
            akzxVarM.u();
            aksa aksaVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(aktmVar4);
            aksaVar5.d = aktmVar4;
            aksaVar5.b |= i5;
            defpackage.akzx akzxVarM8 = akqv.a.m();
            defpackage.aooh.f(akzxVarM8, "builder");
            defpackage.akzx akzxVarM9 = akqu.a.m();
            defpackage.aooh.f(akzxVarM9, "builder");
            iAO = defpackage.a.aO(akhiVar.d);
            if (iAO == 0) {
                iAO = i5;
            }
            i = iAO - 2;
            int i7 = i5;
            if (i != 0) {
                i2 = 6;
            } else if (i != i5) {
                i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        i2 = 8;
                    } else if (i != 4) {
                        i2 = 9;
                    } else {
                        if (i == 6) {
                            throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.Integer.toString(i)));
                        }
                        i2 = 7;
                    }
                }
            } else {
                i2 = 4;
            }
            akzxVarM9.u();
            akqu akquVar4 = akzxVarM9.b;
            akquVar4.c = i2 - 1;
            akquVar4.b |= 1;
            akzxVarM9.u();
            akqu akquVar5 = akzxVarM9.b;
            akquVar5.d = 4;
            akquVar5.b |= 4;
            akqu akquVarR2 = akzxVarM9.r();
            defpackage.aooh.e(akquVarR2, "build(...)");
            akqu akquVar6 = akquVarR2;
            defpackage.aooh.f(akquVar6, "value");
            akzxVarM8.u();
            akqv akqvVar3 = akzxVarM8.b;
            j$.util.Objects.requireNonNull(akquVar6);
            akqvVar3.c = akquVar6;
            akqvVar3.b = 4;
            akqv akqvVarR2 = akzxVarM8.r();
            defpackage.aooh.e(akqvVarR2, "build(...)");
            akqv akqvVar4 = akqvVarR2;
            defpackage.aooh.f(akqvVar4, "value");
            akzxVarM.u();
            aksa aksaVar6 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akqvVar4);
            aksaVar6.e = akqvVar4;
            aksaVar6.b |= 2;
            java.util.List listUnmodifiableList4 = j$.util.DesugarCollections.unmodifiableList(akzxVarM.b.c);
            defpackage.aooh.e(listUnmodifiableList4, "getVersionedIdentifierList(...)");
            new defpackage.alct(listUnmodifiableList4);
            akhhVar = akhiVar.g;
            if (akhhVar == null) {
                akhhVar = akhh.a;
            }
            akhhVar2 = akhh.a;
            defpackage.akzx akzxVarM10 = akhhVar2.m();
            defpackage.aooh.f(akzxVarM10, "builder");
            akhhVarR = akzxVarM10.r();
            defpackage.aooh.e(akhhVarR, "build(...)");
            if (defpackage.aooh.n(akhhVar, akhhVarR)) {
                defpackage.ahxq ahxqVarE2 = n.e();
                akhhVar3 = akhiVar.g;
                if (akhhVar3 != null) {
                    akhhVar2 = akhhVar3;
                }
                akscVarAp = (aksc) ahxqVarE2.d(akhhVar2);
            } else {
                akhqVar = akhiVar.c;
                if (akhqVar == null) {
                    akhqVar = akhq.a;
                }
                akscVarAp = (aksc) map3.get(abxl.r(akhqVar));
            }
            if (akscVarAp == null) {
                defpackage.xtq xtqVarO3 = aklu.o(aksc.a.m());
                akhqVar2 = akhiVar.c;
                if (akhqVar2 == null) {
                    akhqVar2 = akhq.a;
                }
                xtqVarO3.aq(java.lang.String.valueOf(akhqVar2.b));
                akscVarAp = xtqVarO3.ap();
            }
            defpackage.xtq xtqVarO4 = aklu.o(akscVarAp.L());
            alcfVar = akhiVar.e;
            if (alcfVar == null) {
                alcfVar = defpackage.alcf.a;
            }
            xtqVarO4.ar(defpackage.aldi.a(alcfVar));
            aksc akscVarAp3 = xtqVarO4.ap();
            defpackage.aooh.f(akscVarAp3, "value");
            akzxVarM.u();
            aksaVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(akscVarAp3);
            alatVar2 = aksaVar.c;
            if (!alatVar2.c()) {
                aksaVar.c = defpackage.alad.J(alatVar2);
            }
            aksaVar.c.add(akscVarAp3);
            if ((akhiVar.b & 4) == 0) {
                alcfVar2 = akhiVar.f;
                if (alcfVar2 == null) {
                    alcfVar2 = defpackage.alcf.a;
                }
                long jA2 = defpackage.aldi.a(alcfVar2);
                akzxVarM.u();
                aksa aksaVar7 = akzxVarM.b;
                aksaVar7.b |= 4;
                aksaVar7.f = jA2;
            }
            aksa aksaVarR2 = akzxVarM.r();
            defpackage.aooh.e(aksaVarR2, "build(...)");
            arrayList.add(aksaVarR2);
            i5 = i7;
        }
        akzxVar4.u();
        akrmVar2 = akzxVar4.b;
        alatVar = akrmVar2.f;
        if (!alatVar.c()) {
            akrmVar2.f = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(arrayList, akrmVar2.f);
        akrm akrmVarR2 = ((defpackage.akzx) xtqVar3.a).r();
        defpackage.aooh.e(akrmVarR2, "build(...)");
        return new defpackage.adub(akrmVarR2);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0152  */
    /* JADX WARN: Code duplicated, block: B:41:0x0155  */
    /* JADX WARN: Code duplicated, block: B:43:0x0159  */
    /* JADX WARN: Code duplicated, block: B:45:0x015f  */
    /* JADX WARN: Code duplicated, block: B:47:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0189  */
    /* JADX WARN: Code duplicated, block: B:52:0x018c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0190  */
    /* JADX WARN: Code duplicated, block: B:55:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v9, types: [adzw] */
    public final java.lang.Object f(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, akhj akhjVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        acel acelVar;
        defpackage.xtq xtqVar;
        defpackage.ajyk ajykVarAe;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation2;
        defpackage.aduw aduwVar2;
        defpackage.xtq xtqVar2;
        defpackage.ajyk ajykVar;
        defpackage.ajyk ajykVar2;
        ?? r4;
        defpackage.ajyk ajykVar3;
        defpackage.ajyk ajykVar4;
        defpackage.xtq xtqVar3;
        defpackage.adtz adtzVar;
        int iR;
        defpackage.ajyk ajykVar5;
        defpackage.xtq xtqVar4;
        defpackage.xtq xtqVar5;
        defpackage.ajyk ajykVar6;
        defpackage.adtz adtzVar2;
        int iR2;
        defpackage.aduy aduyVar;
        java.lang.String str;
        if (aolnVar instanceof acel) {
            acelVar = (acel) aolnVar;
            int i = acelVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                acelVar.j = i - Integer.MIN_VALUE;
            } else {
                acelVar = new acel(this, aolnVar);
            }
        } else {
            acelVar = new acel(this, aolnVar);
        }
        java.lang.Object objK = acelVar.h;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acelVar.j;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj = acelVar.g;
                ajykVar = acelVar.k;
                xtqVar = (defpackage.xtq) acelVar.f;
                ajykVarAe = (defpackage.ajyk) acelVar.e;
                ajykVar2 = (defpackage.ajyk) acelVar.d;
                xtqVar2 = (defpackage.xtq) acelVar.c;
                defpackage.aduw aduwVar3 = (defpackage.aduw) acelVar.b;
                com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation3 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) acelVar.a;
                defpackage.aooc.af(objK);
                aduwVar2 = aduwVar3;
                accountRepresentation2 = accountRepresentation3;
                r4 = obj;
            } else if (i2 == 2) {
                ajykVar3 = (defpackage.ajyk) acelVar.f;
                defpackage.xtq xtqVar6 = (defpackage.xtq) acelVar.e;
                ajykVar4 = (defpackage.ajyk) acelVar.d;
                defpackage.ajyk ajykVar7 = (defpackage.ajyk) acelVar.c;
                xtqVar3 = (defpackage.xtq) acelVar.b;
                com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation4 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) acelVar.a;
                defpackage.aooc.af(objK);
                accountRepresentation2 = accountRepresentation4;
                ajykVar2 = ajykVar7;
                xtqVar = xtqVar6;
                adtzVar = (defpackage.adtz) objK;
                iR = defpackage.anty.R(adtzVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return (defpackage.adtv) adtzVar;
                    }
                    throw new defpackage.aois();
                }
                ajykVar3.L((defpackage.akra) ((defpackage.adub) adtzVar).a);
                acelVar.a = xtqVar3;
                acelVar.b = ajykVar2;
                acelVar.c = ajykVar4;
                acelVar.d = xtqVar;
                acelVar.e = null;
                acelVar.f = null;
                acelVar.j = 3;
                objK = b(accountRepresentation2, acelVar);
                if (objK != aoluVar) {
                    return aoluVar;
                }
                ajykVar5 = ajykVar4;
                xtqVar4 = xtqVar;
                xtqVar5 = xtqVar3;
                ajykVar6 = ajykVar2;
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xtqVar4 = (defpackage.xtq) acelVar.d;
                ajykVar5 = (defpackage.ajyk) acelVar.c;
                ajykVar6 = (defpackage.ajyk) acelVar.b;
                xtqVar5 = (defpackage.xtq) acelVar.a;
                defpackage.aooc.af(objK);
            }
            adtzVar2 = (defpackage.adtz) objK;
            iR2 = defpackage.anty.R(adtzVar2);
            if (iR2 != 0) {
                if (iR2 == 1) {
                    return (defpackage.adtv) adtzVar2;
                }
                throw new defpackage.aois();
            }
            aduyVar = (defpackage.aduy) ((defpackage.adub) adtzVar2).a;
            if (aduyVar != null && (str = aduyVar.i) != null && str.length() != 0) {
                defpackage.akzx akzxVar = (defpackage.akzx) ajykVar5.b;
                akzxVar.u();
                defpackage.akry akryVar = (defpackage.akry) akzxVar.b;
                defpackage.akry akryVar2 = defpackage.akry.a;
                j$.util.Objects.requireNonNull(str);
                akryVar.b |= 4;
                akryVar.e = str;
            }
            defpackage.akry akryVarK = ajykVar6.K();
            defpackage.aooh.f(akryVarK, "value");
            defpackage.akzx akzxVar2 = (defpackage.akzx) xtqVar4.a;
            akzxVar2.u();
            akrz akrzVar = akzxVar2.b;
            akrz akrzVar2 = akrz.a;
            j$.util.Objects.requireNonNull(akryVarK);
            akrzVar.d = akryVarK;
            akrzVar.c = 1;
            akrz akrzVarR = ((defpackage.akzx) xtqVar5.a).r();
            defpackage.aooh.e(akrzVarR, "build(...)");
            return new defpackage.adub(akrzVarR);
        }
        defpackage.aooc.af(objK);
        defpackage.akzx akzxVarM = akrz.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        xtqVar = new defpackage.xtq(akzxVarM);
        akhf akhfVar = akhjVar.c;
        if (akhfVar == null) {
            akhfVar = akhf.a;
        }
        akha akhaVar = akhfVar.d;
        if (akhaVar == null) {
            akhaVar = akha.a;
        }
        akgx akgxVar = akhaVar.e;
        if (akgxVar == null) {
            akgxVar = akgx.a;
        }
        java.lang.String str2 = akgxVar.c == 4 ? (java.lang.String) akgxVar.d : "";
        defpackage.aooh.e(str2, "getAndroidPackageName(...)");
        defpackage.aooh.f(str2, "value");
        defpackage.akzx akzxVar3 = (defpackage.akzx) xtqVar.a;
        akzxVar3.u();
        akrz akrzVar3 = akzxVar3.b;
        j$.util.Objects.requireNonNull(str2);
        akrzVar3.b |= 1;
        akrzVar3.e = str2;
        ajykVarAe = defpackage.ajsz.ae(defpackage.akry.a.m());
        ajykVarAe.M();
        defpackage.adzw adzwVar = this.j;
        defpackage.adao adaoVar = this.o;
        accountRepresentation2 = accountRepresentation;
        acelVar.a = accountRepresentation2;
        aduwVar2 = aduwVar;
        acelVar.b = aduwVar2;
        acelVar.c = xtqVar;
        acelVar.d = ajykVarAe;
        acelVar.e = ajykVarAe;
        acelVar.f = xtqVar;
        acelVar.k = ajykVarAe;
        acelVar.g = adzwVar;
        acelVar.j = 1;
        objK = adaoVar.k(acelVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        xtqVar2 = xtqVar;
        ajykVar = ajykVarAe;
        ajykVar2 = ajykVar;
        r4 = adzwVar;
        defpackage.adzv adzvVar = new defpackage.adzv(((java.lang.Boolean) objK).booleanValue(), aduwVar2.b(), !accountRepresentation2.b());
        acelVar.a = accountRepresentation2;
        acelVar.b = xtqVar2;
        acelVar.c = ajykVar2;
        acelVar.d = ajykVarAe;
        acelVar.e = xtqVar;
        acelVar.f = ajykVar;
        acelVar.k = null;
        acelVar.g = null;
        acelVar.j = 2;
        objK = r4.b(adzvVar, acelVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        ajykVar3 = ajykVar;
        ajykVar4 = ajykVarAe;
        xtqVar3 = xtqVar2;
        adtzVar = (defpackage.adtz) objK;
        iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (iR == 1) {
                return (defpackage.adtv) adtzVar;
            }
            throw new defpackage.aois();
        }
        ajykVar3.L((defpackage.akra) ((defpackage.adub) adtzVar).a);
        acelVar.a = xtqVar3;
        acelVar.b = ajykVar2;
        acelVar.c = ajykVar4;
        acelVar.d = xtqVar;
        acelVar.e = null;
        acelVar.f = null;
        acelVar.j = 3;
        objK = b(accountRepresentation2, acelVar);
        if (objK != aoluVar) {
            return aoluVar;
        }
        ajykVar5 = ajykVar4;
        xtqVar4 = xtqVar;
        xtqVar5 = xtqVar3;
        ajykVar6 = ajykVar2;
        adtzVar2 = (defpackage.adtz) objK;
        iR2 = defpackage.anty.R(adtzVar2);
        if (iR2 != 0) {
            if (iR2 == 1) {
                return (defpackage.adtv) adtzVar2;
            }
            throw new defpackage.aois();
        }
        aduyVar = (defpackage.aduy) ((defpackage.adub) adtzVar2).a;
        if (aduyVar != null) {
            defpackage.akzx akzxVar4 = (defpackage.akzx) ajykVar5.b;
            akzxVar4.u();
            defpackage.akry akryVar3 = (defpackage.akry) akzxVar4.b;
            defpackage.akry akryVar4 = defpackage.akry.a;
            j$.util.Objects.requireNonNull(str);
            akryVar3.b |= 4;
            akryVar3.e = str;
        }
        defpackage.akry akryVarK2 = ajykVar6.K();
        defpackage.aooh.f(akryVarK2, "value");
        defpackage.akzx akzxVar5 = (defpackage.akzx) xtqVar4.a;
        akzxVar5.u();
        akrz akrzVar4 = akzxVar5.b;
        akrz akrzVar5 = akrz.a;
        j$.util.Objects.requireNonNull(akryVarK2);
        akrzVar4.d = akryVarK2;
        akrzVar4.c = 1;
        akrz akrzVarR2 = ((defpackage.akzx) xtqVar5.a).r();
        defpackage.aooh.e(akrzVarR2, "build(...)");
        return new defpackage.adub(akrzVarR2);
    }
}
