package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acig implements defpackage.achv {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final android.content.Context b;
    public final defpackage.acee c;
    public final java.util.Set d;
    public final defpackage.ahyn e;
    public final defpackage.aoin f;
    public final defpackage.amwu g;
    public final defpackage.acci h;
    public final defpackage.adao i;
    private final java.lang.String j;
    private final defpackage.ahyn k;
    private final defpackage.ahyn l;
    private final defpackage.amwu m;
    private final defpackage.ahyn n;
    private final defpackage.amwu o;
    private final defpackage.amwu p;
    private final defpackage.aolr q;
    private final defpackage.aolr r;
    private final defpackage.amwu s;
    private final defpackage.adao t;

    public acig(android.content.Context context, defpackage.adao adaoVar, defpackage.adao adaoVar2, defpackage.acee aceeVar, java.lang.String str, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.amwu amwuVar, defpackage.aazc aazcVar, defpackage.ahyn ahynVar3, java.util.Set set, defpackage.ahyn ahynVar4, defpackage.aoin aoinVar, defpackage.amwu amwuVar2, defpackage.amwu amwuVar3, defpackage.amwu amwuVar4, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.acci acciVar, defpackage.amwu amwuVar5) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(adaoVar, "presentedPromoStoreProvider");
        defpackage.aooh.f(adaoVar2, "promotionStoreProvider");
        defpackage.aooh.f(str, "packageName");
        defpackage.aooh.f(ahynVar, "versionCode");
        defpackage.aooh.f(ahynVar2, "versionName");
        defpackage.aooh.f(amwuVar, "pseudonymousIdHelper");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        defpackage.aooh.f(amwuVar2, "clientStreamz");
        defpackage.aooh.f(amwuVar3, "gnpAccountUtil");
        defpackage.aooh.f(amwuVar4, "syncDataStore");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(aolrVar2, "blockingContext");
        defpackage.aooh.f(amwuVar5, "promotionsManager");
        this.b = context;
        this.i = adaoVar;
        this.t = adaoVar2;
        this.c = aceeVar;
        this.j = str;
        this.k = ahynVar;
        this.l = ahynVar2;
        this.m = amwuVar;
        this.n = ahynVar3;
        this.d = set;
        this.e = ahynVar4;
        this.f = aoinVar;
        this.o = amwuVar2;
        this.g = amwuVar3;
        this.p = amwuVar4;
        this.q = aolrVar;
        this.r = aolrVar2;
        this.h = acciVar;
        this.s = amwuVar5;
    }

    @Override // defpackage.achv
    public final java.lang.Object a(java.lang.String str, akst akstVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.q, new abos(akstVar, str, this, (defpackage.aoln) null, 3), aolnVar);
    }

    @Override // defpackage.achv
    public final java.lang.Object b(akst akstVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.q, new acic(akstVar, this, (defpackage.aoln) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.achv
    public final java.lang.Object c(akst akstVar, defpackage.aoln aolnVar) {
        acid acidVar;
        if (aolnVar instanceof acid) {
            acidVar = (acid) aolnVar;
            int i = acidVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acidVar.c = i - Integer.MIN_VALUE;
            } else {
                acidVar = new acid(this, aolnVar);
            }
        } else {
            acidVar = new acid(this, aolnVar);
        }
        java.lang.Object objAj = acidVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acidVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.aolr aolrVar = this.r;
            abvk abvkVar = new abvk(this, (defpackage.aoln) null, 2);
            acidVar.d = akstVar;
            acidVar.c = 1;
            objAj = defpackage.aoov.aj(aolrVar, abvkVar, acidVar);
            if (objAj != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
            return objAj;
        }
        akstVar = acidVar.d;
        defpackage.aooc.af(objAj);
        defpackage.adtz adtzVar = (defpackage.adtz) objAj;
        if (adtzVar instanceof defpackage.adtv) {
            defpackage.adtv adtvVar = (defpackage.adtv) adtzVar;
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(adtvVar.b())).v("Failed to install security provider, GrowthKit sync can't run.");
            return adtvVar;
        }
        acidVar.d = null;
        acidVar.c = 2;
        java.lang.Object objB = b(akstVar, acidVar);
        if (objB != aoluVar) {
            return objB;
        }
        return aoluVar;
    }

    public final akhf d() {
        ajyi ajyiVarK = akky.k(akhf.a.m());
        defpackage.akzx akzxVarM = akha.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        akha akhaVar = akzxVarM.b;
        akhaVar.c = 6;
        akhaVar.b |= 1;
        akzxVarM.u();
        akha akhaVar2 = akzxVarM.b;
        akhaVar2.b |= 2;
        akhaVar2.d = 1001915728;
        defpackage.akzx akzxVarM2 = akgx.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        java.lang.String str = this.j;
        defpackage.aooh.f(str, "value");
        akzxVarM2.u();
        akgx akgxVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        akgxVar.c = 4;
        akgxVar.d = str;
        defpackage.ahyn ahynVar = this.k;
        if (ahynVar.f()) {
            java.lang.String strValueOf = java.lang.String.valueOf(((java.lang.Number) ahynVar.b()).intValue());
            defpackage.aooh.f(strValueOf, "value");
            akzxVarM2.u();
            akgx akgxVar2 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(strValueOf);
            akgxVar2.b |= 1;
            akgxVar2.e = strValueOf;
        }
        defpackage.ahyn ahynVar2 = this.l;
        if (ahynVar2.f()) {
            java.lang.String str2 = (java.lang.String) ahynVar2.b();
            akzxVarM2.u();
            akgx akgxVar3 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str2);
            akgxVar3.b |= 2;
            akgxVar3.f = str2;
        }
        akgx akgxVarR = akzxVarM2.r();
        defpackage.aooh.e(akgxVarR, "build(...)");
        akgx akgxVar4 = akgxVarR;
        defpackage.aooh.f(akgxVar4, "value");
        akzxVarM.u();
        akha akhaVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akgxVar4);
        akhaVar3.e = akgxVar4;
        akhaVar3.b |= 4;
        akha akhaVarR = akzxVarM.r();
        defpackage.aooh.e(akhaVarR, "build(...)");
        akha akhaVar4 = akhaVarR;
        defpackage.aooh.f(akhaVar4, "value");
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarK.a;
        akzxVar.u();
        akhf akhfVar = akzxVar.b;
        j$.util.Objects.requireNonNull(akhaVar4);
        akhfVar.d = akhaVar4;
        akhfVar.b |= 1;
        defpackage.akzx akzxVarM3 = akhe.a.m();
        defpackage.aooh.f(akzxVarM3, "builder");
        java.lang.String strA = acax.a(this.b);
        if (strA == null) {
            strA = "";
        }
        akzxVarM3.u();
        akhe akheVar = akzxVarM3.b;
        j$.util.Objects.requireNonNull(strA);
        akheVar.b |= 4;
        akheVar.f = strA;
        akzxVarM3.u();
        akhe akheVar2 = akzxVarM3.b;
        akheVar2.g = 1;
        akheVar2.b |= 8;
        java.lang.String strValueOf2 = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
        defpackage.aooh.f(strValueOf2, "value");
        akzxVarM3.u();
        akhe akheVar3 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(strValueOf2);
        akheVar3.b |= 16;
        akheVar3.h = strValueOf2;
        defpackage.akzx akzxVarM4 = akhc.a.m();
        defpackage.aooh.f(akzxVarM4, "builder");
        java.lang.String str3 = android.os.Build.BRAND;
        defpackage.aooh.e(str3, "BRAND");
        defpackage.aooh.f(str3, "value");
        akzxVarM4.u();
        akhc akhcVar = akzxVarM4.b;
        j$.util.Objects.requireNonNull(str3);
        akhcVar.b |= 1;
        akhcVar.c = str3;
        java.lang.String str4 = android.os.Build.DISPLAY;
        defpackage.aooh.e(str4, "DISPLAY");
        defpackage.aooh.f(str4, "value");
        akzxVarM4.u();
        akhc akhcVar2 = akzxVarM4.b;
        j$.util.Objects.requireNonNull(str4);
        akhcVar2.b |= 2;
        akhcVar2.d = str4;
        java.lang.String str5 = android.os.Build.MODEL;
        defpackage.aooh.e(str5, "MODEL");
        defpackage.aooh.f(str5, "value");
        akzxVarM4.u();
        akhc akhcVar3 = akzxVarM4.b;
        j$.util.Objects.requireNonNull(str5);
        akhcVar3.b |= 4;
        akhcVar3.e = str5;
        akhc akhcVarR = akzxVarM4.r();
        defpackage.aooh.e(akhcVarR, "build(...)");
        akhc akhcVar4 = akhcVarR;
        defpackage.aooh.f(akhcVar4, "value");
        akzxVarM3.u();
        akhe akheVar4 = akzxVarM3.b;
        j$.util.Objects.requireNonNull(akhcVar4);
        akheVar4.d = akhcVar4;
        akheVar4.c = 7;
        java.lang.String strE = defpackage.angy.a.eZ().e();
        if (strE.length() != 0) {
            akzxVarM3.u();
            akhe akheVar5 = akzxVarM3.b;
            j$.util.Objects.requireNonNull(strE);
            akheVar5.b |= 2;
            akheVar5.e = strE;
        }
        akhe akheVarR = akzxVarM3.r();
        defpackage.aooh.e(akheVarR, "build(...)");
        akhe akheVar6 = akheVarR;
        defpackage.aooh.f(akheVar6, "value");
        akzxVar.u();
        akhf akhfVar2 = akzxVar.b;
        j$.util.Objects.requireNonNull(akheVar6);
        akhfVar2.e = akheVar6;
        akhfVar2.b |= 2;
        return ajyiVarK.i();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [aoin, java.lang.Object] */
    public final java.lang.Object e(akhl akhlVar, defpackage.aoln aolnVar) {
        achz achzVar;
        defpackage.adtz adtzVar;
        defpackage.adtz adtzVar2;
        if (aolnVar instanceof achz) {
            achzVar = (achz) aolnVar;
            int i = achzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                achzVar.c = i - Integer.MIN_VALUE;
            } else {
                achzVar = new achz(this, aolnVar);
            }
        } else {
            achzVar = new achz(this, aolnVar);
        }
        java.lang.Object objA = achzVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = achzVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            akjx akjxVar = akhlVar.h;
            if (akjxVar == null) {
                akjxVar = akjx.a;
            }
            if (akjxVar.c == 2) {
                acim acimVar = (acim) ((defpackage.ahys) this.n).a.a();
                akjx akjxVar2 = akhlVar.h;
                if (akjxVar2 == null) {
                    akjxVar2 = akjx.a;
                }
                akjh akjhVar = akjxVar2.c == 2 ? (akjh) akjxVar2.d : akjh.a;
                defpackage.aooh.e(akjhVar, "getRatingPromptUi(...)");
                achzVar.d = akhlVar;
                achzVar.c = 1;
                objA = acimVar.a(akjhVar, achzVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                adtzVar = (defpackage.adtz) objA;
                if (adtzVar instanceof defpackage.adtv) {
                    return (defpackage.adtv) adtzVar;
                }
            } else {
                akjx akjxVar3 = akhlVar.h;
                if (akjxVar3 == null) {
                    akjxVar3 = akjx.a;
                }
                if (akjxVar3.c == 6) {
                    acim acimVar2 = (acim) ((defpackage.ahys) this.n).a.a();
                    akjx akjxVar4 = akhlVar.h;
                    if (akjxVar4 == null) {
                        akjxVar4 = akjx.a;
                    }
                    akjh akjhVar2 = (akjxVar4.c == 6 ? (akju) akjxVar4.d : akju.a).d;
                    if (akjhVar2 == null) {
                        akjhVar2 = akjh.a;
                    }
                    defpackage.aooh.e(akjhVar2, "getWarmupPromptUi(...)");
                    achzVar.d = akhlVar;
                    achzVar.c = 2;
                    objA = acimVar2.a(akjhVar2, achzVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar2 = (defpackage.adtz) objA;
                    if (adtzVar2 instanceof defpackage.adtv) {
                        return (defpackage.adtv) adtzVar2;
                    }
                }
            }
        } else if (i2 == 1) {
            akhl akhlVar2 = achzVar.d;
            defpackage.aooc.af(objA);
            akhlVar = akhlVar2;
            adtzVar = (defpackage.adtz) objA;
            if (adtzVar instanceof defpackage.adtv) {
                return (defpackage.adtv) adtzVar;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            akhl akhlVar3 = achzVar.d;
            defpackage.aooc.af(objA);
            akhlVar = akhlVar3;
            adtzVar2 = (defpackage.adtz) objA;
            if (adtzVar2 instanceof defpackage.adtv) {
                return (defpackage.adtv) adtzVar2;
            }
        }
        return new defpackage.adub(akhlVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    public final java.lang.Object f(java.util.List list, java.lang.String str, akst akstVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        acia aciaVar;
        ?? r12;
        if (aolnVar instanceof acia) {
            aciaVar = (acia) aolnVar;
            int i = aciaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aciaVar.d = i - Integer.MIN_VALUE;
            } else {
                aciaVar = new acia(this, aolnVar);
            }
        } else {
            aciaVar = new acia(this, aolnVar);
        }
        java.lang.Object objD = aciaVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aciaVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objD);
            java.util.List listBS = defpackage.ajsz.bS(list);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(listBS, 10)), 16));
            for (java.lang.Object obj : listBS) {
                ((defpackage.afip) ((defpackage.aeey) this.o.a()).j.eZ()).b(1L, this.j);
                linkedHashMap.put(abxl.q((akhl) obj), obj);
            }
            defpackage.ajcq ajcqVarB = ((defpackage.acgr) this.t.o(str)).b(linkedHashMap);
            defpackage.aooh.e(ajcqVarB, "clearAndPutAll(...)");
            aciaVar.a = list;
            aciaVar.e = str;
            aciaVar.f = akstVar;
            aciaVar.d = 1;
            objD = defpackage.aosv.D(ajcqVarB, aciaVar);
            r12 = list;
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            akstVar = aciaVar.f;
            str = aciaVar.e;
            java.lang.Object obj2 = aciaVar.a;
            defpackage.aooc.af(objD);
            r12 = obj2;
        }
        new java.lang.Integer(r12.size());
        if (akstVar == akst.k) {
            ((defpackage.acdo) this.s.a()).a(str);
        }
        return new defpackage.adub(defpackage.aojh.a);
    }

    public final java.lang.Object g(defpackage.ajcq ajcqVar, akhf akhfVar, java.lang.String str, akst akstVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.m(new acib(ajcqVar, this, str, akstVar, akhfVar, (defpackage.aoln) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(akst akstVar, defpackage.aoln aolnVar) throws java.lang.Exception {
        acie acieVar;
        if (aolnVar instanceof acie) {
            acieVar = (acie) aolnVar;
            int i = acieVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acieVar.c = i - Integer.MIN_VALUE;
            } else {
                acieVar = new acie(this, aolnVar);
            }
        } else {
            acieVar = new acie(this, aolnVar);
        }
        acie acieVar2 = acieVar;
        java.lang.Object objK = acieVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acieVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objK);
            defpackage.tvn tvnVar = (defpackage.tvn) this.m.a();
            acieVar2.d = akstVar;
            acieVar2.c = 1;
            objK = tvnVar.K(acieVar2);
            if (objK != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objK);
            return objK;
        }
        akstVar = acieVar2.d;
        defpackage.aooc.af(objK);
        akst akstVar2 = akstVar;
        java.lang.String str = ((com.google.android.gms.pseudonymous.PseudonymousIdToken) objK).a;
        if (str == null) {
            ((defpackage.aiob) a.d()).v("Not syncing signed out user - token is null - can happen if device just started");
            return new defpackage.adub(defpackage.aojh.a);
        }
        defpackage.ajcq ajcqVarC = ((defpackage.acgr) this.i.o(null)).c();
        defpackage.aooh.e(ajcqVarC, "getAll(...)");
        ajyi ajyiVarK = akky.k(d().L());
        defpackage.akzx akzxVar = (defpackage.akzx) ajyiVarK.a;
        akzxVar.u();
        akhf akhfVar = akzxVar.b;
        j$.util.Objects.requireNonNull(str);
        akhfVar.c = str;
        akhf akhfVarI = ajyiVarK.i();
        acieVar2.d = null;
        acieVar2.c = 2;
        java.lang.Object objG = g(ajcqVarC, akhfVarI, null, akstVar2, acieVar2);
        if (objG != aoluVar) {
            return objG;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.aoln aolnVar) {
        acif acifVar;
        if (aolnVar instanceof acif) {
            acifVar = (acif) aolnVar;
            int i = acifVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                acifVar.c = i - Integer.MIN_VALUE;
            } else {
                acifVar = new acif(this, aolnVar);
            }
        } else {
            acifVar = new acif(this, aolnVar);
        }
        java.lang.Object obj = acifVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = acifVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return new defpackage.adub(defpackage.aojh.a);
        }
        defpackage.aooc.af(obj);
        java.lang.String strA = acax.a(this.b);
        if (strA == null) {
            strA = "";
        }
        defpackage.acxg acxgVar = (defpackage.acxg) this.p.a();
        acifVar.c = 1;
        if (acxgVar.d(strA, acifVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.acxg acxgVar2 = (defpackage.acxg) this.p.a();
        j$.time.Instant instantNow = j$.time.Instant.now();
        defpackage.aooh.e(instantNow, "instant(...)");
        defpackage.alcf alcfVarAu = defpackage.aooc.au(instantNow);
        acifVar.c = 2;
        if (acxgVar2.c(alcfVarAu, acifVar) == aoluVar) {
            return aoluVar;
        }
        return new defpackage.adub(defpackage.aojh.a);
    }
}
