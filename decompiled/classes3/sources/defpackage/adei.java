package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adei implements defpackage.addb {
    public final android.content.Context b;
    public final defpackage.adcz c;
    public final aoss d;
    public final defpackage.adem e;
    public final xtq j;
    private final java.util.concurrent.Executor m;
    private final java.lang.String r;
    public static final afsq k = new afsq((char[]) null);
    public static final aimz a = aimz.i("com/google/android/libraries/mdi/search/g3appsearch/app/impl/G3GlobalSearchSessionImpl");
    private static final qz l = new afbd((byte[]) null).b();
    public final defpackage.aljf i = new defpackage.aljf();
    public final defpackage.akxm h = new defpackage.akxm();
    public final defpackage.vqy g = new defpackage.vqy();
    private final defpackage.vaa s = new defpackage.vaa((byte[]) null, (byte[]) null);
    private final java.util.Map n = new aca();
    private final java.util.Set o = new acc(0);
    public final apdp f = new apdp();
    private final java.util.concurrent.locks.ReentrantLock p = new java.util.concurrent.locks.ReentrantLock();
    private final defpackage.adec q = new defpackage.adec(this);

    public adei(defpackage.adem ademVar, android.content.Context context, xtq xtqVar, defpackage.adcz adczVar, java.util.concurrent.Executor executor, aoss aossVar) {
        this.e = ademVar;
        this.b = context;
        this.j = xtqVar;
        this.c = adczVar;
        this.m = executor;
        this.d = aossVar;
        java.lang.String packageName = context.getPackageName();
        aooh.e(packageName, "getPackageName(...)");
        this.r = packageName;
    }

    public static final com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo m(java.lang.String str) {
        akxp akxpVar = (akxp) defpackage.addg.a.get(str);
        if (akxpVar == null) {
            return null;
        }
        return afsq.aA(defpackage.afpl.r(akxpVar));
    }

    private final pd n(pd pdVar, java.lang.String str) {
        we weVar = new we((byte[]) null);
        java.util.Map mapB = pdVar.b();
        aooh.e(mapB, "getSuccesses(...)");
        for (java.util.Map.Entry entry : mapB.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            pw pwVar = (pw) entry.getValue();
            if (str == null) {
                aooh.c(pwVar);
                weVar.d(str2, new defpackage.adda(pwVar));
            } else {
                aooh.c(pwVar);
                weVar.d(str2, new defpackage.addq(this, str, pwVar));
            }
        }
        java.util.Map mapA = pdVar.a();
        aooh.e(mapA, "getFailures(...)");
        for (java.util.Map.Entry entry2 : mapA.entrySet()) {
            java.lang.String str3 = (java.lang.String) entry2.getKey();
            pg pgVar = (pg) entry2.getValue();
            weVar.b(str3, pgVar.a, pgVar.b);
        }
        return weVar.a();
    }

    private final void o(java.util.Set set) {
        acb acbVar = new acb((acc) set);
        while (acbVar.hasNext()) {
            java.lang.String str = (java.lang.String) acbVar.next();
            java.util.Set set2 = this.o;
            if (!set2.contains(str)) {
                try {
                    this.e.d(str, l, this.m, this.q);
                    set2.add(str);
                } catch (qv e) {
                    a.d().k(e).l("com/google/android/libraries/mdi/search/g3appsearch/app/impl/G3GlobalSearchSessionImpl", "registerTagStoreObserver", 313, "G3GlobalSearchSessionImpl.kt").y("Could not register TagStore observer for package '%s'", str);
                }
            }
        }
    }

    @Override // defpackage.addb
    public final defpackage.addd a(java.lang.String str, qt qtVar, adde addeVar) {
        aooh.f(str, "queryExpression");
        aooh.f(qtVar, "searchSpec");
        aooh.f(addeVar, "readerContext");
        defpackage.ades.a.a(qtVar);
        return new defpackage.addz(this, str, qtVar, addeVar);
    }

    @Override // defpackage.addb
    public final ajcq b(java.lang.String str, java.lang.String str2, px pxVar, adde addeVar) {
        aooh.f(str, "packageName");
        aooh.f(str2, "databaseName");
        aooh.f(pxVar, "request");
        aooh.f(addeVar, "readerContext");
        return aosv.F(this.d, 0, new defpackage.yud(this, str, str2, pxVar, addeVar, (aoln) null, 3), 3);
    }

    @Override // defpackage.addb
    public final ajcq c(java.lang.String str, java.lang.String str2) {
        return str2.startsWith("__G3_TS__") ? aiql.z(new py().a()) : this.e.c(str, str2);
    }

    @Override // defpackage.addb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.p.lock();
        try {
            acb acbVar = new acb(this.o);
            while (acbVar.hasNext()) {
                this.e.e((java.lang.String) acbVar.next(), this.q);
            }
            this.p.unlock();
            this.e.close();
        } catch (java.lang.Throwable th) {
            this.p.unlock();
            throw th;
        }
    }

    @Override // defpackage.addb
    public final void d(java.lang.String str, qz qzVar, java.util.concurrent.Executor executor, qy qyVar) {
        aooh.f(str, "targetPackageName");
        aooh.f(qzVar, "spec");
        aooh.f(executor, "executor");
        aooh.f(qyVar, "observer");
        this.e.d(str, qzVar, executor, qyVar);
    }

    @Override // defpackage.addb
    public final void e(java.lang.String str, qy qyVar) {
        aooh.f(str, "targetPackageName");
        aooh.f(qyVar, "observer");
        this.e.e(str, qyVar);
    }

    @Override // defpackage.addb
    public final oq f() {
        return this.e.f();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0113  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x014c  */
    /* JADX WARN: Code duplicated, block: B:47:0x016a  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01be  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0200  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object g(java.lang.String str, java.lang.String str2, px pxVar, adde addeVar, aoln aolnVar) {
        defpackage.aded adedVar;
        px pxVar2;
        java.lang.String str3;
        adde addeVar2;
        java.lang.String str4;
        apdp apdpVar;
        int i;
        akxp akxpVar;
        java.lang.String str5;
        java.lang.String str6;
        px pxVar3;
        defpackage.adei adeiVar;
        px pxVar4;
        java.lang.String str7;
        pd pdVarN;
        apdp apdpVar2;
        java.lang.String str8;
        java.lang.String str9;
        apdp apdpVar3;
        apdp apdpVar4;
        defpackage.adei adeiVar2 = this;
        if (aolnVar instanceof defpackage.aded) {
            adedVar = (defpackage.aded) aolnVar;
            int i2 = adedVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adedVar.f = i2 - Integer.MIN_VALUE;
            } else {
                adedVar = new defpackage.aded(adeiVar2, aolnVar);
            }
        } else {
            adedVar = new defpackage.aded(adeiVar2, aolnVar);
        }
        defpackage.aded adedVar2 = adedVar;
        java.lang.Object objC = adedVar2.d;
        aolu aoluVar = aolu.a;
        switch (adedVar2.f) {
            case 0:
                aooc.af(objC);
                aooh.f(pxVar, "request");
                if (j$.util.Collection.-EL.stream(pxVar.a().values()).anyMatch(new defpackage.abdh(new defpackage.acsb(10), 5))) {
                    aify aifyVar = com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.a;
                    aooh.e(aifyVar, "INDEXED_PROPERTY_PATH_LIST");
                    throw new java.lang.IllegalArgumentException("The projections for each schema type specified in GetByDocumentIdRequest must include either 'g3attrinfo' or all of ".concat(ajsz.cr(aifyVar, ", ", "[", "]", (aonj) null, 56)));
                }
                if (str2.startsWith("__G3_TS__")) {
                    return defpackage.ades.c(pxVar);
                }
                apdp apdpVar5 = adeiVar2.f;
                adedVar2.a = str;
                adedVar2.b = str2;
                adedVar2.g = pxVar;
                adedVar2.h = addeVar;
                adedVar2.c = apdpVar5;
                adedVar2.f = 1;
                if (apdpVar5.b(adedVar2) == aoluVar) {
                    return aoluVar;
                }
                pxVar2 = pxVar;
                str3 = str;
                addeVar2 = addeVar;
                str4 = str2;
                apdpVar = apdpVar5;
                try {
                    int iK = adeiVar2.i.k(str3);
                    apdpVar.d();
                    i = iK - 1;
                    if (i != 0) {
                        akxpVar = (akxp) defpackage.addg.a.get(str3);
                        if (akxpVar != null) {
                            android.content.Context context = adeiVar2.b;
                            xtq xtqVar = adeiVar2.j;
                            adeu adeuVar = adeu.a;
                            adedVar2.a = str3;
                            adedVar2.b = str4;
                            adedVar2.g = pxVar2;
                            adedVar2.h = null;
                            adedVar2.c = null;
                            adedVar2.f = 2;
                            objC = adeuVar.c(context, xtqVar, addeVar2, akxpVar, adedVar2);
                            if (objC != aoluVar) {
                                return aoluVar;
                            }
                            str5 = str4;
                            str6 = str3;
                            pxVar3 = pxVar2;
                            if (!((java.lang.Boolean) objC).booleanValue()) {
                                ajcq ajcqVarB = adeiVar2.e.b(str6, str5, pxVar3);
                                adedVar2.a = str6;
                                adedVar2.b = adeiVar2;
                                adedVar2.g = null;
                                adedVar2.f = 3;
                                objC = aosv.D(ajcqVarB, adedVar2);
                                if (objC == aoluVar) {
                                    return aoluVar;
                                }
                                str7 = str6;
                                return adeiVar2.n((pd) objC, str7);
                            }
                            pxVar2 = pxVar3;
                        }
                        return defpackage.ades.c(pxVar2);
                    }
                    if (i != 1) {
                        if (i != 2) {
                            return defpackage.ades.c(pxVar2);
                        }
                        ajcq ajcqVarB2 = adeiVar2.e.b(str3, str4, pxVar2);
                        adedVar2.a = adeiVar2;
                        adedVar2.b = null;
                        adedVar2.g = null;
                        adedVar2.h = null;
                        adedVar2.c = null;
                        adedVar2.f = 7;
                        objC = aosv.D(ajcqVarB2, adedVar2);
                        if (objC == aoluVar) {
                            return aoluVar;
                        }
                        return adeiVar2.n((pd) objC, null);
                    }
                    ajcq ajcqVarB3 = adeiVar2.e.b(str3, str4, pxVar2);
                    adedVar2.a = str3;
                    adedVar2.b = str4;
                    adedVar2.g = pxVar2;
                    adedVar2.h = addeVar2;
                    adedVar2.c = adeiVar2;
                    adedVar2.f = 4;
                    objC = aosv.D(ajcqVarB3, adedVar2);
                    if (objC != aoluVar) {
                        return aoluVar;
                    }
                    adeiVar = adeiVar2;
                    pxVar4 = pxVar2;
                    pdVarN = adeiVar.n((pd) objC, null);
                    apdpVar2 = adeiVar2.f;
                    adedVar2.a = str3;
                    adedVar2.b = str4;
                    adedVar2.g = pxVar4;
                    adedVar2.h = addeVar2;
                    adedVar2.c = pdVarN;
                    adedVar2.i = apdpVar2;
                    adedVar2.f = 5;
                    if (apdpVar2.b(adedVar2) == aoluVar) {
                        return aoluVar;
                    }
                    str8 = str4;
                    str9 = str3;
                    apdpVar3 = apdpVar2;
                    adde addeVar3 = addeVar2;
                    try {
                        defpackage.ades adesVar = defpackage.ades.a;
                        android.content.Context context2 = adeiVar2.b;
                        java.lang.String str10 = adeiVar2.r;
                        java.lang.String str11 = pxVar4.a;
                        aooh.e(str11, "getNamespace(...)");
                        java.lang.String str12 = str9;
                        defpackage.vqy vqyVar = adeiVar2.g;
                        defpackage.vaa vaaVar = adeiVar2.s;
                        java.util.Map map = adeiVar2.n;
                        xtq xtqVar2 = adeiVar2.j;
                        adedVar2.a = apdpVar3;
                        adedVar2.b = null;
                        adedVar2.g = null;
                        adedVar2.h = null;
                        adedVar2.c = null;
                        adedVar2.i = null;
                        adedVar2.f = 6;
                        objC = adesVar.f(context2, pdVarN, addeVar3, str10, str12, str8, str11, vqyVar, vaaVar, map, xtqVar2, adedVar2);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        apdpVar4 = apdpVar3;
                        pd pdVar = (pd) objC;
                        apdpVar4.d();
                        return pdVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar4 = apdpVar3;
                        apdpVar4.d();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    apdpVar.d();
                    throw th2;
                }
            case 1:
                apdpVar = (apdp) adedVar2.c;
                adde addeVar4 = adedVar2.h;
                px pxVar5 = adedVar2.g;
                str4 = (java.lang.String) adedVar2.b;
                str3 = (java.lang.String) adedVar2.a;
                aooc.af(objC);
                pxVar2 = pxVar5;
                addeVar2 = addeVar4;
                int iK2 = adeiVar2.i.k(str3);
                apdpVar.d();
                i = iK2 - 1;
                if (i != 0) {
                    akxpVar = (akxp) defpackage.addg.a.get(str3);
                    if (akxpVar != null) {
                        android.content.Context context3 = adeiVar2.b;
                        xtq xtqVar3 = adeiVar2.j;
                        adeu adeuVar2 = adeu.a;
                        adedVar2.a = str3;
                        adedVar2.b = str4;
                        adedVar2.g = pxVar2;
                        adedVar2.h = null;
                        adedVar2.c = null;
                        adedVar2.f = 2;
                        objC = adeuVar2.c(context3, xtqVar3, addeVar2, akxpVar, adedVar2);
                        if (objC != aoluVar) {
                            return aoluVar;
                        }
                        str5 = str4;
                        str6 = str3;
                        pxVar3 = pxVar2;
                        if (!((java.lang.Boolean) objC).booleanValue()) {
                            ajcq ajcqVarB4 = adeiVar2.e.b(str6, str5, pxVar3);
                            adedVar2.a = str6;
                            adedVar2.b = adeiVar2;
                            adedVar2.g = null;
                            adedVar2.f = 3;
                            objC = aosv.D(ajcqVarB4, adedVar2);
                            if (objC == aoluVar) {
                                return aoluVar;
                            }
                            str7 = str6;
                            return adeiVar2.n((pd) objC, str7);
                        }
                        pxVar2 = pxVar3;
                    }
                    return defpackage.ades.c(pxVar2);
                }
                if (i != 1) {
                    if (i != 2) {
                        return defpackage.ades.c(pxVar2);
                    }
                    ajcq ajcqVarB5 = adeiVar2.e.b(str3, str4, pxVar2);
                    adedVar2.a = adeiVar2;
                    adedVar2.b = null;
                    adedVar2.g = null;
                    adedVar2.h = null;
                    adedVar2.c = null;
                    adedVar2.f = 7;
                    objC = aosv.D(ajcqVarB5, adedVar2);
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    return adeiVar2.n((pd) objC, null);
                }
                ajcq ajcqVarB6 = adeiVar2.e.b(str3, str4, pxVar2);
                adedVar2.a = str3;
                adedVar2.b = str4;
                adedVar2.g = pxVar2;
                adedVar2.h = addeVar2;
                adedVar2.c = adeiVar2;
                adedVar2.f = 4;
                objC = aosv.D(ajcqVarB6, adedVar2);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                adeiVar = adeiVar2;
                pxVar4 = pxVar2;
                pdVarN = adeiVar.n((pd) objC, null);
                apdpVar2 = adeiVar2.f;
                adedVar2.a = str3;
                adedVar2.b = str4;
                adedVar2.g = pxVar4;
                adedVar2.h = addeVar2;
                adedVar2.c = pdVarN;
                adedVar2.i = apdpVar2;
                adedVar2.f = 5;
                if (apdpVar2.b(adedVar2) == aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str3;
                apdpVar3 = apdpVar2;
                adde addeVar5 = addeVar2;
                defpackage.ades adesVar2 = defpackage.ades.a;
                android.content.Context context4 = adeiVar2.b;
                java.lang.String str13 = adeiVar2.r;
                java.lang.String str14 = pxVar4.a;
                aooh.e(str14, "getNamespace(...)");
                java.lang.String str15 = str9;
                defpackage.vqy vqyVar2 = adeiVar2.g;
                defpackage.vaa vaaVar2 = adeiVar2.s;
                java.util.Map map2 = adeiVar2.n;
                xtq xtqVar4 = adeiVar2.j;
                adedVar2.a = apdpVar3;
                adedVar2.b = null;
                adedVar2.g = null;
                adedVar2.h = null;
                adedVar2.c = null;
                adedVar2.i = null;
                adedVar2.f = 6;
                objC = adesVar2.f(context4, pdVarN, addeVar5, str13, str15, str8, str14, vqyVar2, vaaVar2, map2, xtqVar4, adedVar2);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                apdpVar4 = apdpVar3;
                pd pdVar2 = (pd) objC;
                apdpVar4.d();
                return pdVar2;
            case 2:
                pxVar3 = adedVar2.g;
                str5 = (java.lang.String) adedVar2.b;
                str6 = (java.lang.String) adedVar2.a;
                aooc.af(objC);
                if (!((java.lang.Boolean) objC).booleanValue()) {
                    pxVar2 = pxVar3;
                    return defpackage.ades.c(pxVar2);
                }
                ajcq ajcqVarB7 = adeiVar2.e.b(str6, str5, pxVar3);
                adedVar2.a = str6;
                adedVar2.b = adeiVar2;
                adedVar2.g = null;
                adedVar2.f = 3;
                objC = aosv.D(ajcqVarB7, adedVar2);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                str7 = str6;
                return adeiVar2.n((pd) objC, str7);
            case 3:
                adeiVar2 = (defpackage.adei) adedVar2.b;
                str7 = (java.lang.String) adedVar2.a;
                aooc.af(objC);
                return adeiVar2.n((pd) objC, str7);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                adeiVar = (defpackage.adei) adedVar2.c;
                adde addeVar6 = adedVar2.h;
                px pxVar6 = adedVar2.g;
                java.lang.String str16 = (java.lang.String) adedVar2.b;
                java.lang.String str17 = (java.lang.String) adedVar2.a;
                aooc.af(objC);
                str3 = str17;
                str4 = str16;
                pxVar4 = pxVar6;
                addeVar2 = addeVar6;
                pdVarN = adeiVar.n((pd) objC, null);
                apdpVar2 = adeiVar2.f;
                adedVar2.a = str3;
                adedVar2.b = str4;
                adedVar2.g = pxVar4;
                adedVar2.h = addeVar2;
                adedVar2.c = pdVarN;
                adedVar2.i = apdpVar2;
                adedVar2.f = 5;
                if (apdpVar2.b(adedVar2) == aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str3;
                apdpVar3 = apdpVar2;
                adde addeVar7 = addeVar2;
                defpackage.ades adesVar3 = defpackage.ades.a;
                android.content.Context context5 = adeiVar2.b;
                java.lang.String str18 = adeiVar2.r;
                java.lang.String str19 = pxVar4.a;
                aooh.e(str19, "getNamespace(...)");
                java.lang.String str110 = str9;
                defpackage.vqy vqyVar3 = adeiVar2.g;
                defpackage.vaa vaaVar3 = adeiVar2.s;
                java.util.Map map3 = adeiVar2.n;
                xtq xtqVar5 = adeiVar2.j;
                adedVar2.a = apdpVar3;
                adedVar2.b = null;
                adedVar2.g = null;
                adedVar2.h = null;
                adedVar2.c = null;
                adedVar2.i = null;
                adedVar2.f = 6;
                objC = adesVar3.f(context5, pdVarN, addeVar7, str18, str110, str8, str19, vqyVar3, vaaVar3, map3, xtqVar5, adedVar2);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                apdpVar4 = apdpVar3;
                pd pdVar3 = (pd) objC;
                apdpVar4.d();
                return pdVar3;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                apdpVar2 = adedVar2.i;
                pdVarN = (pd) adedVar2.c;
                addeVar2 = adedVar2.h;
                pxVar4 = adedVar2.g;
                str8 = (java.lang.String) adedVar2.b;
                str9 = (java.lang.String) adedVar2.a;
                aooc.af(objC);
                apdpVar3 = apdpVar2;
                adde addeVar8 = addeVar2;
                defpackage.ades adesVar4 = defpackage.ades.a;
                android.content.Context context6 = adeiVar2.b;
                java.lang.String str111 = adeiVar2.r;
                java.lang.String str112 = pxVar4.a;
                aooh.e(str112, "getNamespace(...)");
                java.lang.String str113 = str9;
                defpackage.vqy vqyVar4 = adeiVar2.g;
                defpackage.vaa vaaVar4 = adeiVar2.s;
                java.util.Map map4 = adeiVar2.n;
                xtq xtqVar6 = adeiVar2.j;
                adedVar2.a = apdpVar3;
                adedVar2.b = null;
                adedVar2.g = null;
                adedVar2.h = null;
                adedVar2.c = null;
                adedVar2.i = null;
                adedVar2.f = 6;
                objC = adesVar4.f(context6, pdVarN, addeVar8, str111, str113, str8, str112, vqyVar4, vaaVar4, map4, xtqVar6, adedVar2);
                if (objC != aoluVar) {
                    return aoluVar;
                }
                apdpVar4 = apdpVar3;
                pd pdVar4 = (pd) objC;
                apdpVar4.d();
                return pdVar4;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                apdpVar4 = (apdp) adedVar2.a;
                try {
                    aooc.af(objC);
                    pd pdVar5 = (pd) objC;
                    apdpVar4.d();
                    return pdVar5;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    apdpVar4.d();
                    throw th;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                adeiVar2 = (defpackage.adei) adedVar2.a;
                aooc.af(objC);
                return adeiVar2.n((pd) objC, null);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:13:0x002c, B:33:0x00c0, B:25:0x008f, B:27:0x0098, B:28:0x009c, B:30:0x00a2, B:31:0x00ae, B:18:0x003f, B:24:0x008d, B:21:0x0078), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2 A[Catch: all -> 0x00c9, LOOP:0: B:28:0x009c->B:30:0x00a2, LOOP_END, TryCatch #0 {all -> 0x00c9, blocks: (B:13:0x002c, B:33:0x00c0, B:25:0x008f, B:27:0x0098, B:28:0x009c, B:30:0x00a2, B:31:0x00ae, B:18:0x003f, B:24:0x008d, B:21:0x0078), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qr] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [adei] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00be -> B:33:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(aoln r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adei.h(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a A[Catch: all -> 0x00bb, TryCatch #0 {all -> 0x00bb, blocks: (B:13:0x002c, B:33:0x00b2, B:25:0x0081, B:27:0x008a, B:28:0x008e, B:30:0x0094, B:31:0x00a0, B:18:0x003f, B:24:0x007f, B:21:0x006a), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0094 A[Catch: all -> 0x00bb, LOOP:0: B:28:0x008e->B:30:0x0094, LOOP_END, TryCatch #0 {all -> 0x00bb, blocks: (B:13:0x002c, B:33:0x00b2, B:25:0x0081, B:27:0x008a, B:28:0x008e, B:30:0x0094, B:31:0x00a0, B:18:0x003f, B:24:0x007f, B:21:0x006a), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qr] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [adei] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b0 -> B:33:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(aoln r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.adef
            if (r0 == 0) goto L13
            r0 = r8
            adef r0 = (defpackage.adef) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            adef r0 = new adef
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            aolu r1 = aolu.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            acc r4 = r0.f
            aooc.af(r8)     // Catch: java.lang.Throwable -> Lbb
            goto Lb2
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.b
            java.lang.Object r2 = r0.a
            acc r4 = r0.f
            aooc.af(r8)     // Catch: java.lang.Throwable -> Lbb
            goto L7f
        L43:
            aooc.af(r8)
            acc r8 = new acc
            r2 = 0
            r8.<init>(r2)
            qs r2 = new qs
            r2.<init>()
            r2.i()
            r2.h()
            java.lang.String r5 = "*"
            aokc r6 = aokc.a
            r2.d(r5, r6)
            qt r2 = r2.a()
            adem r7 = r7.e
            java.lang.String r5 = ""
            qr r7 = r7.a(r5, r2)
            ajcq r2 = r7.a()     // Catch: java.lang.Throwable -> Lbb
            r0.f = r8     // Catch: java.lang.Throwable -> Lbb
            r0.a = r7     // Catch: java.lang.Throwable -> Lbb
            r0.b = r7     // Catch: java.lang.Throwable -> Lbb
            r0.e = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r2 = aosv.D(r2, r0)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == r1) goto Lba
            r4 = r8
            r8 = r2
            r2 = r7
        L7f:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Lbb
        L81:
            aooh.c(r8)     // Catch: java.lang.Throwable -> Lbb
            boolean r5 = r8.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r5 != 0) goto Lb5
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> Lbb
        L8e:
            boolean r5 = r8.hasNext()     // Catch: java.lang.Throwable -> Lbb
            if (r5 == 0) goto La0
            java.lang.Object r5 = r8.next()     // Catch: java.lang.Throwable -> Lbb
            qq r5 = (qq) r5     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = r5.c     // Catch: java.lang.Throwable -> Lbb
            r4.add(r5)     // Catch: java.lang.Throwable -> Lbb
            goto L8e
        La0:
            ajcq r8 = r2.a()     // Catch: java.lang.Throwable -> Lbb
            r0.f = r4     // Catch: java.lang.Throwable -> Lbb
            r0.a = r2     // Catch: java.lang.Throwable -> Lbb
            r0.b = r7     // Catch: java.lang.Throwable -> Lbb
            r0.e = r3     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r8 = aosv.D(r8, r0)     // Catch: java.lang.Throwable -> Lbb
            if (r8 == r1) goto Lba
        Lb2:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> Lbb
            goto L81
        Lb5:
            r8 = 0
            ajsz.ak(r7, r8)
            r1 = r4
        Lba:
            return r1
        Lbb:
            r8 = move-exception
            throw r8     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r0 = move-exception
            ajsz.ak(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adei.i(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #0 {all -> 0x0114, blocks: (B:15:0x002e, B:39:0x00e4, B:41:0x00f0, B:43:0x0101, B:45:0x0108, B:46:0x010d, B:47:0x010e, B:42:0x00f5), top: B:56:0x002e, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [apdp] */
    /* JADX WARN: Type inference failed for: r0v9, types: [apdp] */
    /* JADX WARN: Type inference failed for: r10v0, types: [adei] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v5, types: [apdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.Set] */
    public final java.lang.Object j(aoln aolnVar) throws java.lang.Throwable {
        defpackage.adeg adegVar;
        ?? r0;
        apdp apdpVar;
        defpackage.aljf aljfVar;
        apdp apdpVar2;
        java.util.Set set;
        java.lang.Object objH;
        java.lang.Object obj;
        defpackage.aljf aljfVar2;
        if (aolnVar instanceof defpackage.adeg) {
            adegVar = (defpackage.adeg) aolnVar;
            int i = adegVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                adegVar.d = i - Integer.MIN_VALUE;
            } else {
                adegVar = new defpackage.adeg(this, aolnVar);
            }
        } else {
            adegVar = new defpackage.adeg(this, aolnVar);
        }
        java.lang.Object obj2 = adegVar.b;
        aojh aojhVar = aolu.a;
        int i2 = adegVar.d;
        ?? r5 = 2;
        try {
            try {
                if (i2 == 0) {
                    aooc.af(obj2);
                    apdpVar = this.f;
                    adegVar.e = apdpVar;
                    adegVar.d = 1;
                    if (apdpVar.b(adegVar) != aojhVar) {
                    }
                    return aojhVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        aljfVar = adegVar.f;
                        apdp apdpVar3 = adegVar.e;
                        aooc.af(obj2);
                        apdpVar2 = apdpVar3;
                        set = (java.util.Set) obj2;
                        adegVar.e = apdpVar2;
                        adegVar.f = aljfVar;
                        adegVar.a = set;
                        adegVar.d = 3;
                        objH = h(adegVar);
                        if (objH != aojhVar) {
                            defpackage.aljf aljfVar3 = aljfVar;
                            obj = set;
                            obj2 = objH;
                            aljfVar2 = aljfVar3;
                            r5 = apdpVar2;
                            java.util.Set set2 = (java.util.Set) obj2;
                            defpackage.adcz adczVar = this.c;
                            aooh.f(obj, "visiblePackages");
                            aooh.f(set2, "migrated1pPackages");
                            aooh.f(adczVar, "corporaProvider");
                            ?? r6 = aljfVar2.a;
                            r6.addAll(set2);
                            ?? r11 = aljfVar2.d;
                            r11.addAll(defpackage.addg.a.f());
                            r11.removeAll(r6);
                            ?? r7 = aljfVar2.c;
                            r7.addAll(obj);
                            r7.removeAll(r6);
                            r7.removeAll(r11);
                            ajsz.bt((java.lang.Iterable) r7, new defpackage.acsb(9));
                            ?? r2 = aljfVar2.b;
                            r2.addAll(r11);
                            r2.addAll(r6);
                            r2.addAll(r7);
                            adegVar.e = r5;
                            adegVar.f = null;
                            adegVar.a = null;
                            adegVar.d = 4;
                            if (k(adegVar) != aojhVar) {
                                r0 = r5;
                                if (f().a("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK")) {
                                    this.p.lock();
                                    defpackage.aljf aljfVar4 = this.i;
                                    o(aljfVar4.a);
                                    o(aljfVar4.d);
                                    this.p.unlock();
                                }
                                aojhVar = aojh.a;
                                r0.d();
                            }
                        }
                        return aojhVar;
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r0 = adegVar.e;
                        try {
                            aooc.af(obj2);
                            r0 = r0;
                            if (f().a("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK")) {
                                this.p.lock();
                                try {
                                    defpackage.aljf aljfVar5 = this.i;
                                    o(aljfVar5.a);
                                    o(aljfVar5.d);
                                    this.p.unlock();
                                } catch (java.lang.Throwable th) {
                                    this.p.unlock();
                                    throw th;
                                }
                            }
                            aojhVar = aojh.a;
                            r0.d();
                            return aojhVar;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            r0.d();
                            throw th;
                        }
                    }
                    obj = adegVar.a;
                    aljfVar2 = adegVar.f;
                    apdp apdpVar4 = adegVar.e;
                    aooc.af(obj2);
                    r5 = apdpVar4;
                    java.util.Set set3 = (java.util.Set) obj2;
                    defpackage.adcz adczVar2 = this.c;
                    aooh.f(obj, "visiblePackages");
                    aooh.f(set3, "migrated1pPackages");
                    aooh.f(adczVar2, "corporaProvider");
                    ?? r8 = aljfVar2.a;
                    r8.addAll(set3);
                    ?? r12 = aljfVar2.d;
                    r12.addAll(defpackage.addg.a.f());
                    r12.removeAll(r8);
                    ?? r9 = aljfVar2.c;
                    r9.addAll(obj);
                    r9.removeAll(r8);
                    r9.removeAll(r12);
                    ajsz.bt((java.lang.Iterable) r9, new defpackage.acsb(9));
                    ?? r3 = aljfVar2.b;
                    r3.addAll(r12);
                    r3.addAll(r8);
                    r3.addAll(r9);
                    adegVar.e = r5;
                    adegVar.f = null;
                    adegVar.a = null;
                    adegVar.d = 4;
                    if (k(adegVar) != aojhVar) {
                        r0 = r5;
                        if (f().a("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK")) {
                            this.p.lock();
                            defpackage.aljf aljfVar6 = this.i;
                            o(aljfVar6.a);
                            o(aljfVar6.d);
                            this.p.unlock();
                        }
                        aojhVar = aojh.a;
                        r0.d();
                    }
                    return aojhVar;
                }
                apdp apdpVar5 = adegVar.e;
                aooc.af(obj2);
                apdpVar = apdpVar5;
                aljfVar = this.i;
                adegVar.e = apdpVar;
                adegVar.f = aljfVar;
                adegVar.d = 2;
                java.lang.Object objI = i(adegVar);
                if (objI != aojhVar) {
                    apdpVar2 = apdpVar;
                    obj2 = objI;
                    set = (java.util.Set) obj2;
                    adegVar.e = apdpVar2;
                    adegVar.f = aljfVar;
                    adegVar.a = set;
                    adegVar.d = 3;
                    objH = h(adegVar);
                    if (objH != aojhVar) {
                        defpackage.aljf aljfVar7 = aljfVar;
                        obj = set;
                        obj2 = objH;
                        aljfVar2 = aljfVar7;
                        r5 = apdpVar2;
                        java.util.Set set4 = (java.util.Set) obj2;
                        defpackage.adcz adczVar3 = this.c;
                        aooh.f(obj, "visiblePackages");
                        aooh.f(set4, "migrated1pPackages");
                        aooh.f(adczVar3, "corporaProvider");
                        ?? r10 = aljfVar2.a;
                        r10.addAll(set4);
                        ?? r13 = aljfVar2.d;
                        r13.addAll(defpackage.addg.a.f());
                        r13.removeAll(r10);
                        ?? r14 = aljfVar2.c;
                        r14.addAll(obj);
                        r14.removeAll(r10);
                        r14.removeAll(r13);
                        ajsz.bt((java.lang.Iterable) r14, new defpackage.acsb(9));
                        ?? r4 = aljfVar2.b;
                        r4.addAll(r13);
                        r4.addAll(r10);
                        r4.addAll(r14);
                        adegVar.e = r5;
                        adegVar.f = null;
                        adegVar.a = null;
                        adegVar.d = 4;
                        if (k(adegVar) != aojhVar) {
                            r0 = r5;
                            if (f().a("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK")) {
                                this.p.lock();
                                defpackage.aljf aljfVar8 = this.i;
                                o(aljfVar8.a);
                                o(aljfVar8.d);
                                this.p.unlock();
                            }
                            aojhVar = aojh.a;
                            r0.d();
                        }
                    }
                }
                return aojhVar;
            } catch (java.lang.Throwable th3) {
                th = th3;
                r0 = apdpVar;
                r0.d();
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            r0 = r5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:13:0x002a, B:37:0x00c8, B:25:0x0077, B:27:0x0080, B:28:0x0087, B:30:0x008d, B:32:0x009d, B:34:0x00b2, B:35:0x00b8, B:18:0x003b, B:24:0x0075, B:21:0x0064), top: B:46:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: all -> 0x00d2, TryCatch #0 {all -> 0x00d2, blocks: (B:13:0x002a, B:37:0x00c8, B:25:0x0077, B:27:0x0080, B:28:0x0087, B:30:0x008d, B:32:0x009d, B:34:0x00b2, B:35:0x00b8, B:18:0x003b, B:24:0x0075, B:21:0x0064), top: B:46:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, qr] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c6 -> B:37:0x00c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(aoln r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adei.k(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    public final void l(java.lang.String str, java.lang.String str2, pw pwVar) {
        aihd aihdVarP;
        if (pwVar.g().startsWith("__G3_TAG__")) {
            java.lang.String[] strArrP = pwVar.p("tsparenttypes");
            if (strArrP != null) {
                aihdVarP = aihd.p(strArrP);
                aooh.e(aihdVarP, "copyOf(...)");
                if (aihdVarP == null) {
                    aihdVarP = aikn.a;
                    aooh.e(aihdVarP, "of(...)");
                }
            } else {
                aihdVarP = aikn.a;
                aooh.e(aihdVarP, "of(...)");
            }
            defpackage.adeo adeoVar = new defpackage.adeo(aihdVarP);
            defpackage.vqy vqyVar = this.g;
            java.lang.String strSubstring = str2.substring(9);
            aooh.e(strSubstring, "getUnprefixedDatabaseName(...)");
            java.lang.String strSubstring2 = pwVar.j().substring(10);
            aooh.e(strSubstring2, "getUnprefixedSchemaType(...)");
            aooh.f(str, "packageName");
            aooh.f(strSubstring, "databaseName");
            aooh.f(strSubstring2, "schemaType");
            ?? r0 = vqyVar.b;
            java.lang.Object acaVar = r0.get(str);
            if (acaVar == null) {
                acaVar = new aca();
                r0.put(str, acaVar);
            }
            java.util.Map map = (java.util.Map) acaVar;
            java.lang.Object acaVar2 = map.get(strSubstring);
            if (acaVar2 == null) {
                acaVar2 = new aca();
                map.put(strSubstring, acaVar2);
            }
            defpackage.adeo adeoVar2 = (defpackage.adeo) ((java.util.Map) acaVar2).put(strSubstring2, adeoVar);
            aihd aihdVar = adeoVar.a;
            if (adeoVar2 != null) {
                aihd aihdVar2 = adeoVar2.a;
                if (!aihdVar2.isEmpty() && !aooh.n(aihdVar, aihdVar2)) {
                    java.lang.String strC = defpackage.vqy.c(str, strSubstring, strSubstring2);
                    ailj ailjVarK = aihdVar2.k();
                    aooh.e(ailjVarK, "iterator(...)");
                    while (ailjVarK.hasNext()) {
                        java.lang.Object next = ailjVarK.next();
                        aooh.e(next, "next(...)");
                        java.lang.String str3 = (java.lang.String) next;
                        ?? r6 = vqyVar.a;
                        defpackage.vaa vaaVar = (defpackage.vaa) r6.get(str);
                        if (vaaVar != null) {
                            vaaVar.B(str3, strSubstring2, strC);
                            if (((aec) vaaVar.a).isEmpty()) {
                                r6.remove(str);
                            }
                        }
                        ((defpackage.vaa) vqyVar.c).B(str3, strSubstring2, strC);
                    }
                }
            }
            if (aihdVar.isEmpty()) {
                return;
            }
            java.lang.String strC2 = defpackage.vqy.c(str, strSubstring, strSubstring2);
            ailj ailjVarK2 = aihdVar.k();
            aooh.e(ailjVarK2, "iterator(...)");
            while (ailjVarK2.hasNext()) {
                java.lang.Object next2 = ailjVarK2.next();
                aooh.e(next2, "next(...)");
                java.lang.String str4 = (java.lang.String) next2;
                ?? r3 = vqyVar.a;
                java.lang.Object vaaVar2 = r3.get(str);
                if (vaaVar2 == null) {
                    vaaVar2 = new defpackage.vaa((byte[]) null);
                    r3.put(str, vaaVar2);
                }
                ((defpackage.vaa) vaaVar2).A(str4, strSubstring2, strC2);
                ((defpackage.vaa) vqyVar.c).A(str4, strSubstring2, strC2);
            }
            return;
        }
        pw pwVarC = pwVar.c("g3tsattrinfo");
        if (pwVarC != null) {
            try {
                com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo g3AttributionInfo = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) pwVarC.f(com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.class);
                java.lang.String str5 = g3AttributionInfo.c;
                if (str5 != null) {
                    java.lang.String str6 = g3AttributionInfo.d;
                    if (str6 != null) {
                        this.n.put(str6, str5);
                    }
                    g3AttributionInfo.e = (akxp) j$.util.Objects.requireNonNull(this.s.C(str5));
                    defpackage.akxm akxmVar = this.h;
                    java.lang.String strSubstring3 = str2.substring(9);
                    aooh.e(strSubstring3, "getUnprefixedDatabaseName(...)");
                    java.lang.String strSubstring4 = pwVar.j().substring(10);
                    aooh.e(strSubstring4, "getUnprefixedSchemaType(...)");
                    java.lang.String strG = pwVar.g();
                    aooh.e(strG, "getId(...)");
                    aooh.f(str, "packageName");
                    aooh.f(strSubstring3, "databaseName");
                    aooh.f(strSubstring4, "schemaType");
                    aooh.f(strG, "id");
                    java.lang.String strH = defpackage.akxm.h(str, strSubstring3, strSubstring4, strG);
                    ?? r1 = akxmVar.d;
                    java.lang.Object acaVar3 = r1.get(str);
                    if (acaVar3 == null) {
                        acaVar3 = new aca();
                        r1.put(str, acaVar3);
                    }
                    java.util.Map map2 = (java.util.Map) acaVar3;
                    java.lang.Object acaVar4 = map2.get(strSubstring3);
                    if (acaVar4 == null) {
                        acaVar4 = new aca();
                        map2.put(strSubstring3, acaVar4);
                    }
                    java.util.Map map3 = (java.util.Map) acaVar4;
                    java.lang.Object acaVar5 = map3.get(strSubstring4);
                    if (acaVar5 == null) {
                        acaVar5 = new aca();
                        map3.put(strSubstring4, acaVar5);
                    }
                    ((java.util.Map) acaVar5).put(strH, g3AttributionInfo);
                    ?? r13 = akxmVar.a;
                    java.lang.Object acaVar6 = r13.get(str);
                    if (acaVar6 == null) {
                        acaVar6 = new aca();
                        r13.put(str, acaVar6);
                    }
                    java.util.Map map4 = (java.util.Map) acaVar6;
                    java.lang.Object acaVar7 = map4.get(strSubstring4);
                    if (acaVar7 == null) {
                        acaVar7 = new aca();
                        map4.put(strSubstring4, acaVar7);
                    }
                    java.util.Map map5 = (java.util.Map) acaVar7;
                    java.lang.Object accVar = map5.get(g3AttributionInfo);
                    if (accVar == null) {
                        accVar = new acc(0);
                        map5.put(g3AttributionInfo, accVar);
                    }
                    ((java.util.Set) accVar).add(strH);
                    ?? r14 = akxmVar.c;
                    java.lang.Object acaVar8 = r14.get(str);
                    if (acaVar8 == null) {
                        acaVar8 = new aca();
                        r14.put(str, acaVar8);
                    }
                    java.util.Map map6 = (java.util.Map) acaVar8;
                    java.lang.Object accVar2 = map6.get(g3AttributionInfo);
                    if (accVar2 == null) {
                        accVar2 = new acc(0);
                        map6.put(g3AttributionInfo, accVar2);
                    }
                    ((java.util.Set) accVar2).add(strH);
                    ?? r12 = akxmVar.b;
                    java.lang.Object acaVar9 = r12.get(strSubstring4);
                    if (acaVar9 == null) {
                        acaVar9 = new aca();
                        r12.put(strSubstring4, acaVar9);
                    }
                    java.util.Map map7 = (java.util.Map) acaVar9;
                    java.lang.Object accVar3 = map7.get(g3AttributionInfo);
                    if (accVar3 == null) {
                        accVar3 = new acc(0);
                        map7.put(g3AttributionInfo, accVar3);
                    }
                    ((java.util.Set) accVar3).add(strH);
                    ?? r11 = akxmVar.e;
                    java.lang.Object accVar4 = r11.get(g3AttributionInfo);
                    if (accVar4 == null) {
                        accVar4 = new acc(0);
                        r11.put(g3AttributionInfo, accVar4);
                    }
                    ((java.util.Set) accVar4).add(strH);
                }
            } catch (java.lang.Exception e) {
                a.d().k(e).l("com/google/android/libraries/mdi/search/g3appsearch/app/impl/G3GlobalSearchSessionImpl", "processTagDocument", 283, "G3GlobalSearchSessionImpl.kt").v("Failed to convert tag document to tag");
            }
        }
    }
}
