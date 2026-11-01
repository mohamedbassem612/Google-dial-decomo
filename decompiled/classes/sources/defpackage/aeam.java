package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeam implements defpackage.adzx {
    public static final /* synthetic */ int c = 0;
    private static final defpackage.aiof d = defpackage.aiof.i("GnpSdk");
    public final defpackage.aedo a;
    public final defpackage.aoin b;
    private final defpackage.amwu e;
    private final defpackage.aolr f;
    private final defpackage.aolr g;
    private final defpackage.aduu h;
    private final defpackage.aeey i;
    private final android.content.Context j;
    private final defpackage.adao k;
    private final defpackage.adag l;
    private final defpackage.aogc m;

    public aeam(defpackage.aedo aedoVar, defpackage.aogc aogcVar, defpackage.adao adaoVar, defpackage.amwu amwuVar, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.aduu aduuVar, defpackage.aeey aeeyVar, android.content.Context context, defpackage.aazc aazcVar, defpackage.adag adagVar, defpackage.aoin aoinVar) {
        defpackage.aooh.f(adaoVar, "gnpFcmRegistrationDataHelper");
        defpackage.aooh.f(amwuVar, "gnpFetchRegistrationDataHelper");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(aolrVar2, "backgroundContext");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aazcVar, "clock");
        defpackage.aooh.f(aoinVar, "gnpServerHostname");
        this.a = aedoVar;
        this.m = aogcVar;
        this.k = adaoVar;
        this.e = amwuVar;
        this.f = aolrVar;
        this.g = aolrVar2;
        this.h = aduuVar;
        this.i = aeeyVar;
        this.j = context;
        this.l = adagVar;
        this.b = aoinVar;
    }

    private static final boolean h(java.util.List list, defpackage.aduy aduyVar) {
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (defpackage.aooh.n(((defpackage.akri) it.next()).h, java.lang.String.valueOf(aduyVar.a))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.adzx
    public final java.lang.Object a(java.util.List list, java.util.Map map, aeaa aeaaVar, java.lang.String str, int i, defpackage.adzy adzyVar, defpackage.aduw aduwVar, defpackage.akti aktiVar, java.lang.String str2, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.g, new aeai(this, list, map, aeaaVar, aduwVar, aktiVar, i, adzyVar, str, str2, (defpackage.aoln) null), aolnVar);
    }

    @Override // defpackage.adzx
    public final java.lang.Object b(java.util.List list, java.util.Map map, java.lang.String str, defpackage.akrj akrjVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.f, new yud(list, this, str, akrjVar, map, (defpackage.aoln) null, 6), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6 */
    public final java.lang.Object c(defpackage.aduy aduyVar, aeaa aeaaVar, java.util.Map map, java.util.Map map2, java.util.List list, java.lang.StringBuilder sb, defpackage.aduw aduwVar, long j, defpackage.aoln aolnVar) {
        aeah aeahVar;
        adud adudVar;
        java.lang.Object obj;
        ?? r15;
        adud aeclVar;
        if (aolnVar instanceof aeah) {
            aeahVar = (aeah) aolnVar;
            int i = aeahVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeahVar.e = i - Integer.MIN_VALUE;
            } else {
                aeahVar = new aeah(this, aolnVar);
            }
        } else {
            aeahVar = new aeah(this, aolnVar);
        }
        aeah aeahVar2 = aeahVar;
        java.lang.Object objE = aeahVar2.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeahVar2.e;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            boolean z = ((akrk) defpackage.ajsz.aN(map2, aduyVar.b())).h;
            adud adudVar2 = (defpackage.adtz) defpackage.ajsz.aN(aeaaVar.c, aduyVar.b());
            j$.util.Objects.checkIndex(0, 3);
            if (adudVar2 == null) {
                adudVar = adudVar2;
            } else {
                if (adudVar2 instanceof adud) {
                    aeclVar = new aecm(adudVar2.b(), z, defpackage.adty.ah);
                } else if (adudVar2 instanceof adua) {
                    aeclVar = new aecl(((adua) adudVar2).b(), z, defpackage.adty.ah);
                } else {
                    adudVar = adudVar2;
                }
                adudVar = aeclVar;
            }
            map.put(aduyVar.b(), adudVar);
            if (!z) {
                java.lang.String str = "Account id " + aduyVar.a + " registration removed by GNP backend";
                sb.append(str);
                defpackage.aooh.e(sb, "append(...)");
                sb.append('\n');
                ((defpackage.aiob) d.d()).y("%s", str);
                defpackage.adux aduxVar = new defpackage.adux(aduyVar);
                aduxVar.i(3);
                return aduxVar.a();
            }
            map.put(aduyVar.b(), adudVar);
            java.lang.Object obj2 = map2.get(aduyVar.b());
            if (obj2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            akrl akrlVar = aeaaVar.b;
            java.lang.String str2 = akrlVar.c;
            defpackage.aooh.e(str2, "getInternalTargetId(...)");
            aeahVar2.a = list;
            aeahVar2.b = adudVar;
            aeahVar2.e = 1;
            objE = e(aduyVar, (akrk) obj2, str2, j, aduwVar, akrlVar.d, adudVar instanceof defpackage.adub, aeahVar2);
            if (objE == aoluVar) {
                return aoluVar;
            }
            obj = adudVar;
            r15 = list;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = aeahVar2.b;
            java.lang.Object obj3 = aeahVar2.a;
            defpackage.aooc.af(objE);
            r15 = obj3;
        }
        defpackage.aduy aduyVar2 = (defpackage.aduy) objE;
        if (!(obj instanceof defpackage.adub)) {
            return aduyVar2;
        }
        r15.add(aduyVar2);
        return aduyVar2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x040f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0412  */
    /* JADX WARN: Code duplicated, block: B:103:0x0415  */
    /* JADX WARN: Code duplicated, block: B:104:0x0418  */
    /* JADX WARN: Code duplicated, block: B:105:0x041b  */
    /* JADX WARN: Code duplicated, block: B:106:0x041e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0421  */
    /* JADX WARN: Code duplicated, block: B:110:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:124:0x0526  */
    /* JADX WARN: Code duplicated, block: B:131:0x055f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0290  */
    /* JADX WARN: Code duplicated, block: B:66:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0314  */
    /* JADX WARN: Code duplicated, block: B:72:0x0325  */
    /* JADX WARN: Code duplicated, block: B:74:0x0329  */
    /* JADX WARN: Code duplicated, block: B:76:0x0348  */
    /* JADX WARN: Code duplicated, block: B:78:0x0356  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x035c  */
    /* JADX WARN: Code duplicated, block: B:83:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:89:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:94:0x0406  */
    /* JADX WARN: Code duplicated, block: B:96:0x0409  */
    /* JADX WARN: Code duplicated, block: B:98:0x040c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [aeam] */
    /* JADX WARN: Type inference failed for: r1v26, types: [aeam] */
    /* JADX WARN: Type inference failed for: r1v27, types: [aeam] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aeam] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r29v0, types: [aeam] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r30v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v38, types: [adxm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0423 -> B:109:0x048f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x03a2 -> B:84:0x03b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:89:0x03e4
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(java.util.List r30, java.util.Map r31, aeaa r32, defpackage.aduw r33, long r34, defpackage.akti r36, defpackage.aoln r37) {
        /*
            Method dump skipped, instruction units count: 1595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeam.d(java.util.List, java.util.Map, aeaa, aduw, long, akti, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aduy aduyVar, akrk akrkVar, java.lang.String str, long j, defpackage.aduw aduwVar, long j2, boolean z, defpackage.aoln aolnVar) {
        aeal aealVar;
        defpackage.adux aduxVar;
        if (aolnVar instanceof aeal) {
            aealVar = (aeal) aolnVar;
            int i = aealVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aealVar.d = i - Integer.MIN_VALUE;
            } else {
                aealVar = new aeal(this, aolnVar);
            }
        } else {
            aealVar = new aeal(this, aolnVar);
        }
        java.lang.Object obj = aealVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aealVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            aduxVar = new defpackage.adux(aduyVar);
            aduxVar.i(1);
            if (z) {
                aduxVar.h(j);
            }
            defpackage.akry akryVar = akrkVar.d;
            if (akryVar == null) {
                akryVar = defpackage.akry.a;
            }
            if ((akryVar.b & 4) != 0) {
                defpackage.akry akryVar2 = akrkVar.d;
                if (akryVar2 == null) {
                    akryVar2 = defpackage.akry.a;
                }
                aduxVar.f = akryVar2.e;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                aduxVar.g = str;
                defpackage.adao adaoVarG = g(aduwVar);
                aealVar.g = aduyVar;
                aealVar.e = akrkVar;
                aealVar.f = aduxVar;
                aealVar.a = j2;
                aealVar.d = 1;
                if (adaoVarG.m(str, aealVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = aealVar.a;
            defpackage.adux aduxVar2 = aealVar.f;
            akrk akrkVar2 = aealVar.e;
            defpackage.aduy aduyVar2 = aealVar.g;
            defpackage.aooc.af(obj);
            j2 = j3;
            aduxVar = aduxVar2;
            akrkVar = akrkVar2;
            aduyVar = aduyVar2;
        }
        if (!aduyVar.c() && (akrkVar.b & 4) != 0) {
            aduxVar.a = akrkVar.e;
        }
        java.lang.String str2 = akrkVar.f;
        defpackage.aooh.e(str2, "getObfuscatedActualUserGaiaId(...)");
        if (str2.length() > 0) {
            aduxVar.c = akrkVar.f;
        }
        if (j2 != 0 && aduyVar.m == 0) {
            aduxVar.d(j2);
        }
        aduxVar.g(-1);
        return aduxVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        aeak aeakVar;
        if (aolnVar instanceof aeak) {
            aeakVar = (aeak) aolnVar;
            int i = aeakVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeakVar.c = i - Integer.MIN_VALUE;
            } else {
                aeakVar = new aeak(this, aolnVar);
            }
        } else {
            aeakVar = new aeak(this, aolnVar);
        }
        java.lang.Object obj = aeakVar.a;
        int i2 = aeakVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            aduwVar.a();
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                defpackage.aooc.af(obj);
            } catch (java.lang.Exception e) {
                ((defpackage.aiob) ((defpackage.aiob) d.d()).k(e)).v("Failed to report registration results");
            }
        }
        return defpackage.aojh.a;
    }

    public final defpackage.adao g(defpackage.aduw aduwVar) {
        if (aduwVar.a()) {
            return this.k;
        }
        if (!aduwVar.b()) {
            throw new java.lang.IllegalStateException("targetType is not supported");
        }
        java.lang.Object objA = this.e.a();
        defpackage.aooh.e(objA, "get(...)");
        return (defpackage.adao) objA;
    }
}
