package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aebz implements defpackage.adzf {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.aiof c = defpackage.aiof.i("GnpSdk");
    public final defpackage.adag a;
    private final defpackage.adzx d;
    private final defpackage.aeee e;
    private final defpackage.aolr f;
    private final defpackage.aecg g;
    private final defpackage.aeey h;
    private final android.content.Context i;
    private final defpackage.aecj j;
    private final defpackage.adzq k;
    private final defpackage.adzw l;
    private final defpackage.adzh m;
    private final defpackage.adzf n;
    private final defpackage.aduu o;
    private final java.lang.String p;
    private final defpackage.adao q;
    private final defpackage.adag r;

    public aebz(defpackage.adzx adzxVar, defpackage.aeee aeeeVar, defpackage.aolr aolrVar, defpackage.adag adagVar, defpackage.adao adaoVar, defpackage.aecg aecgVar, defpackage.aeey aeeyVar, android.content.Context context, defpackage.aecj aecjVar, defpackage.adzq adzqVar, defpackage.adzw adzwVar, defpackage.adzh adzhVar, defpackage.adzf adzfVar, defpackage.aduu aduuVar, defpackage.adag adagVar2) {
        defpackage.aooh.f(adzxVar, "gnpChimeRegistrator");
        defpackage.aooh.f(aeeeVar, "gnpAccountStorage");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(adagVar, "gnpRegistrationStatusUpdater");
        defpackage.aooh.f(adaoVar, "gnpRegistrationDataHelper");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aecjVar, "pseudonymousCookieHelper");
        defpackage.aooh.f(adzqVar, "registrationTokenManager");
        defpackage.aooh.f(adzwVar, "deliveryAddressHelper");
        defpackage.aooh.f(adzhVar, "gnpJobSchedulingApi");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        this.d = adzxVar;
        this.e = aeeeVar;
        this.f = aolrVar;
        this.r = adagVar;
        this.q = adaoVar;
        this.g = aecgVar;
        this.h = aeeyVar;
        this.i = context;
        this.j = aecjVar;
        this.k = adzqVar;
        this.l = adzwVar;
        this.m = adzhVar;
        this.n = adzfVar;
        this.o = aduuVar;
        this.a = adagVar2;
        this.p = "GNP_REGISTRATION";
    }

    @Override // defpackage.adzf
    public final int a() {
        return 15;
    }

    @Override // defpackage.adzf
    public final long b() {
        return 0L;
    }

    @Override // defpackage.adzf
    public final java.lang.Long c() {
        return null;
    }

    @Override // defpackage.adzf
    public final java.lang.Object d(android.os.Bundle bundle, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.f, new yzh(this, bundle, (defpackage.aoln) null, 4), aolnVar);
    }

    @Override // defpackage.adzf
    public final java.lang.String e() {
        return this.p;
    }

    @Override // defpackage.adzf
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adzf
    public final boolean g() {
        return true;
    }

    @Override // defpackage.adzf
    public final int h() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.aoln aolnVar) {
        aebt aebtVar;
        if (aolnVar instanceof aebt) {
            aebtVar = (aebt) aolnVar;
            int i = aebtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebtVar.c = i - Integer.MIN_VALUE;
            } else {
                aebtVar = new aebt(this, aolnVar);
            }
        } else {
            aebtVar = new aebt(this, aolnVar);
        }
        java.lang.Object objC = aebtVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebtVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            defpackage.aeee aeeeVar = this.e;
            aebtVar.c = 1;
            objC = aeeeVar.c(aebtVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
        }
        defpackage.adtz adtzVar = (defpackage.adtz) objC;
        int iR = defpackage.anty.R(adtzVar);
        if (iR != 0) {
            if (iR == 1) {
                return (defpackage.adtv) adtzVar;
            }
            throw new defpackage.aois();
        }
        java.util.List list = (java.util.List) ((defpackage.adub) adtzVar).a;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(defpackage.aooc.t(defpackage.ajsz.aL(defpackage.ajsz.bl(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(((defpackage.aduy) obj).b(), obj);
        }
        return new defpackage.adub(linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v1, types: [adag] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6 */
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
    public final java.lang.Object l(defpackage.adtz adtzVar, java.util.List list, java.util.Map map, defpackage.akti aktiVar, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        aebu aebuVar;
        defpackage.aduw aduwVar2;
        ?? r13;
        ?? r0;
        if (aolnVar instanceof aebu) {
            aebuVar = (aebu) aolnVar;
            int i = aebuVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebuVar.e = i - Integer.MIN_VALUE;
            } else {
                aebuVar = new aebu(this, aolnVar);
            }
        } else {
            aebuVar = new aebu(this, aolnVar);
        }
        java.lang.Object obj = aebuVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebuVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aduw aduwVar3 = aebuVar.f;
                java.lang.Object obj2 = aebuVar.b;
                java.lang.Object obj3 = aebuVar.a;
                defpackage.aooc.af(obj);
                r0 = obj2;
                aduwVar2 = aduwVar3;
                r13 = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        defpackage.aeey aeeyVar = this.h;
        android.content.Context context = this.i;
        defpackage.aduu aduuVar = this.o;
        java.lang.String packageName = context.getPackageName();
        java.lang.String strName = aktiVar.name();
        java.lang.String strName2 = aduwVar.name();
        java.lang.String str = aduuVar.a;
        aeeyVar.g(packageName, str, "FAILURE", strName, strName2);
        aeeyVar.h(list.size(), context.getPackageName(), str, "FAILURE");
        defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
        aebuVar.a = list;
        aebuVar.b = map;
        aduwVar2 = aduwVar;
        aebuVar.f = aduwVar2;
        aebuVar.e = 1;
        if (p(aebuVar) == aoluVar) {
            return aoluVar;
        }
        r13 = list;
        r0 = map;
        ?? r12 = this.r;
        aebn aebnVar = new aebn((java.util.List) r13, 2);
        aebuVar.a = null;
        aebuVar.b = null;
        aebuVar.f = null;
        aebuVar.e = 2;
        if (r12.d(r0, aebnVar, aduwVar2, aebuVar) == aoluVar) {
            return aoluVar;
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
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [adzq] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [aecd] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final java.lang.Object m(defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        aebv aebvVar;
        defpackage.aduw aduwVar2;
        ?? r10;
        ?? r2;
        defpackage.adzw adzwVar;
        defpackage.adtz adtzVar;
        int iR;
        java.lang.Object obj;
        if (aolnVar instanceof aebv) {
            aebvVar = (aebv) aolnVar;
            int i = aebvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebvVar.d = i - Integer.MIN_VALUE;
            } else {
                aebvVar = new aebv(this, aolnVar);
            }
        } else {
            aebvVar = new aebv(this, aolnVar);
        }
        java.lang.Object objB = aebvVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebvVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            if (aduwVar.a()) {
                defpackage.adzq adzqVar = this.k;
                defpackage.adao adaoVar = this.q;
                defpackage.aecd aecdVar = defpackage.aecd.a;
                aebvVar.e = aduwVar;
                aebvVar.f = aecdVar;
                aebvVar.a = adzqVar;
                aebvVar.d = 1;
                java.lang.Object objC = adaoVar.c(aebvVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                aduwVar2 = aduwVar;
                r10 = adzqVar;
                objB = objC;
                r2 = aecdVar;
            } else if (aduwVar.b()) {
                adzwVar = this.l;
                aebvVar.e = null;
                aebvVar.d = 3;
                if (adzwVar.c(aebvVar) == aoluVar) {
                    return aoluVar;
                }
            }
            ((defpackage.aiob) c.b()).v("Conflict detected and token was reset, retrying registration job.");
            return defpackage.aojh.a;
        }
        if (i2 == 1) {
            java.lang.Object obj2 = aebvVar.a;
            defpackage.aecd aecdVar2 = aebvVar.f;
            aduwVar2 = aebvVar.e;
            defpackage.aooc.af(objB);
            r2 = aecdVar2;
            r10 = obj2;
        } else if (i2 == 2) {
            aduwVar = aebvVar.e;
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
                this.k.a();
            }
            if (aduwVar.b()) {
                adzwVar = this.l;
                aebvVar.e = null;
                aebvVar.d = 3;
                if (adzwVar.c(aebvVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objB);
        }
        ((defpackage.aiob) c.b()).v("Conflict detected and token was reset, retrying registration job.");
        return defpackage.aojh.a;
        aebvVar.e = aduwVar2;
        aebvVar.f = null;
        aebvVar.a = null;
        aebvVar.d = 2;
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
            this.k.a();
        }
        if (aduwVar.b()) {
            adzwVar = this.l;
            aebvVar.e = null;
            aebvVar.d = 3;
            if (adzwVar.c(aebvVar) == aoluVar) {
                return aoluVar;
            }
        }
        ((defpackage.aiob) c.b()).v("Conflict detected and token was reset, retrying registration job.");
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0128  */
    /* JADX WARN: Code duplicated, block: B:29:0x0134  */
    /* JADX WARN: Code duplicated, block: B:31:0x013b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0141  */
    /* JADX WARN: Code duplicated, block: B:35:0x015c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0177  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x01db  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0203  */
    /* JADX WARN: Code duplicated, block: B:64:0x020f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0217  */
    /* JADX WARN: Code duplicated, block: B:68:0x0223  */
    /* JADX WARN: Code duplicated, block: B:70:0x0227  */
    /* JADX WARN: Code duplicated, block: B:73:0x022d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0234  */
    /* JADX WARN: Code duplicated, block: B:77:0x0239  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0240  */
    /* JADX WARN: Code duplicated, block: B:85:0x0276  */
    /* JADX WARN: Code duplicated, block: B:86:0x0278  */
    /* JADX WARN: Code duplicated, block: B:88:0x027e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0286  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [adzx] */
    /* JADX WARN: Type inference failed for: r10v4, types: [adzx] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v7, types: [aebz] */
    /* JADX WARN: Type inference failed for: r12v9, types: [aebz] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v0, types: [aebz] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.Map] */
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
    public final java.lang.Object n(java.util.List list, java.util.Map map, defpackage.akti aktiVar, defpackage.aduw aduwVar, defpackage.adzy adzyVar, defpackage.aoln aolnVar) {
        aebw aebwVar;
        defpackage.aduw aduwVar2;
        java.util.List list2;
        defpackage.akti aktiVar2;
        java.util.List list3;
        java.util.Map map2;
        defpackage.adzy adzyVar2;
        defpackage.aecg aecgVar;
        java.lang.Object obj;
        defpackage.akti aktiVar3;
        java.lang.Object obj2;
        defpackage.adzy adzyVar3;
        aebw aebwVar2;
        defpackage.aduw aduwVar3;
        defpackage.akti aktiVar4;
        defpackage.adzy adzyVar4;
        java.util.List list4;
        java.lang.Object obj3;
        defpackage.adtz adtzVar;
        java.lang.Object objD;
        defpackage.akrj akrjVar;
        java.lang.Object objA;
        defpackage.adzy adzyVar5;
        defpackage.akrj akrjVar2;
        defpackage.aduw aduwVar4;
        defpackage.akti aktiVar5;
        defpackage.adtz adtzVar2;
        java.lang.Object obj4;
        defpackage.adtz adtzVar3;
        defpackage.akrj akrjVar3;
        java.lang.Object objB;
        defpackage.adtz adtzVar4;
        defpackage.akti aktiVar6;
        defpackage.akrj akrjVar4;
        ?? r15;
        defpackage.aduw aduwVar5;
        defpackage.adzy adzyVar6;
        defpackage.adtz adtzVar5;
        defpackage.akti aktiVar7;
        ?? r12;
        defpackage.adtz adtzVar6;
        java.util.List list5;
        java.lang.Object objD2;
        aeaa aeaaVar;
        java.lang.Object objD3;
        java.lang.String str;
        defpackage.akry akryVar;
        defpackage.akra akraVar;
        defpackage.akrg akrgVar;
        java.lang.Object objL;
        defpackage.adtz adtzVar7;
        ?? r13;
        defpackage.adtz adtzVar8;
        if (aolnVar instanceof aebw) {
            aebwVar = (aebw) aolnVar;
            int i = aebwVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebwVar.h = i - Integer.MIN_VALUE;
            } else {
                aebwVar = new aebw((defpackage.aebz) this, aolnVar);
            }
        } else {
            aebwVar = new aebw((defpackage.aebz) this, aolnVar);
        }
        aebw aebwVar3 = aebwVar;
        java.lang.Object objAj = aebwVar3.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        switch (aebwVar3.h) {
            case 0:
                defpackage.aooc.af(objAj);
                defpackage.aecg aecgVar2 = this.g;
                defpackage.adao adaoVar = this.q;
                aebwVar3.a = list;
                aebwVar3.b = map;
                aebwVar3.i = aktiVar;
                aduwVar2 = aduwVar;
                aebwVar3.j = aduwVar2;
                aebwVar3.k = adzyVar;
                aebwVar3.c = aecgVar2;
                aebwVar3.d = list;
                aebwVar3.e = map;
                aebwVar3.l = aktiVar;
                aebwVar3.h = 1;
                java.lang.Object objB2 = adaoVar.b(aebwVar3);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                list2 = list;
                java.util.Map map3 = map;
                aktiVar2 = aktiVar;
                list3 = list2;
                map2 = map3;
                adzyVar2 = adzyVar;
                aecgVar = aecgVar2;
                obj = objB2;
                aktiVar3 = aktiVar2;
                obj2 = map3;
                aebwVar3.a = list2;
                aebwVar3.b = obj2;
                aebwVar3.i = aktiVar2;
                aebwVar3.j = aduwVar2;
                aebwVar3.k = adzyVar2;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.l = null;
                aebwVar3.h = 2;
                adzyVar3 = adzyVar2;
                defpackage.aecg aecgVar3 = aecgVar;
                aebwVar2 = aebwVar3;
                objAj = defpackage.aoov.aj(aecgVar3.j, new defpackage.aece(aecgVar3, aduwVar2, list3, aktiVar3, (java.lang.String) obj, map2, null), aebwVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                aduwVar3 = aduwVar2;
                aktiVar4 = aktiVar2;
                adzyVar4 = adzyVar3;
                list4 = list2;
                obj3 = obj2;
                adtzVar = (defpackage.adtz) objAj;
                if (adtzVar.g()) {
                    defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar;
                }
                objD = adtzVar.d();
                if (objD == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                defpackage.aecj aecjVar = this.j;
                akrjVar = (defpackage.akrj) objD;
                aebwVar2.a = list4;
                aebwVar2.b = obj3;
                aebwVar2.i = aktiVar4;
                aebwVar2.j = aduwVar3;
                aebwVar2.k = adzyVar4;
                aebwVar2.c = adtzVar;
                aebwVar2.d = akrjVar;
                aebwVar2.h = 3;
                objA = aecjVar.a(adzyVar4, aebwVar2);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                adzyVar5 = adzyVar4;
                akrjVar2 = akrjVar;
                aduwVar4 = aduwVar3;
                aktiVar5 = aktiVar4;
                adtzVar2 = adtzVar;
                objAj = objA;
                obj4 = obj3;
                adtzVar3 = (defpackage.adtz) objAj;
                if (adtzVar3.g()) {
                    defpackage.aooh.d(adtzVar3, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar3;
                }
                ?? r10 = this.d;
                java.lang.String str2 = (java.lang.String) adtzVar3.d();
                aebwVar2.a = list4;
                aebwVar2.b = obj4;
                aebwVar2.i = aktiVar5;
                aebwVar2.j = aduwVar4;
                aebwVar2.k = adzyVar5;
                aebwVar2.c = adtzVar2;
                aebwVar2.d = akrjVar2;
                aebwVar2.e = adtzVar3;
                aebwVar2.h = 4;
                akrjVar3 = akrjVar2;
                aebw aebwVar4 = aebwVar2;
                objB = r10.b(list4, obj4, str2, akrjVar3, aebwVar4);
                aebwVar3 = aebwVar4;
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objAj = objB;
                adtzVar4 = adtzVar3;
                aktiVar6 = aktiVar5;
                akrjVar4 = akrjVar3;
                r15 = obj4;
                aduwVar5 = aduwVar4;
                adzyVar6 = adzyVar5;
                adtzVar5 = (defpackage.adtz) objAj;
                if (adtzVar5.g()) {
                    aebwVar3.a = adtzVar5;
                    aebwVar3.b = null;
                    aebwVar3.i = null;
                    aebwVar3.j = null;
                    aebwVar3.k = null;
                    aebwVar3.c = null;
                    aebwVar3.d = null;
                    aebwVar3.e = null;
                    aebwVar3.h = 5;
                    j$.util.Objects.checkIndex(0, 3);
                    if (adtzVar5 == null) {
                        objL = defpackage.aojh.a;
                    } else if (adtzVar5 instanceof aedm) {
                        objL = m(aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            objL = defpackage.aojh.a;
                        }
                    } else if (adtzVar5 instanceof adua) {
                        objL = l(adtzVar5, list4, r15, aktiVar6, aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            adtzVar5 = adtzVar5;
                            objL = defpackage.aojh.a;
                        }
                    } else {
                        objL = defpackage.aojh.a;
                    }
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar7 = adtzVar5;
                    defpackage.aooh.d(adtzVar7, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar7;
                }
                aktiVar7 = aktiVar6;
                r12 = this;
                adtzVar6 = adtzVar4;
                list5 = list4;
                objD2 = adtzVar5.d();
                if (objD2 == null) {
                    throw new java.lang.IllegalStateException("Registration response is null");
                }
                aeaaVar = (aeaa) objD2;
                objD3 = adtzVar2.d();
                if (objD3 == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                int iBK = defpackage.agab.bK((defpackage.akrj) objD3, list5, r15);
                if (aduwVar5.a()) {
                    akryVar = akrjVar4.d;
                    if (akryVar == null) {
                        akryVar = defpackage.akry.a;
                    }
                    akraVar = akryVar.d;
                    if (akraVar == null) {
                        akraVar = defpackage.akra.a;
                    }
                    if (akraVar.b == 1) {
                        akrgVar = (defpackage.akrg) akraVar.c;
                    } else {
                        akrgVar = defpackage.akrg.a;
                    }
                    str = akrgVar.c;
                } else {
                    str = null;
                }
                ?? r0 = r12.d;
                java.lang.String str3 = (java.lang.String) adtzVar6.d();
                aebwVar3.a = list5;
                aebwVar3.b = null;
                aebwVar3.i = null;
                aebwVar3.j = null;
                aebwVar3.k = null;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.h = 6;
                objAj = r0.a(list5, r15, aeaaVar, str3, iBK, adzyVar6, aduwVar5, aktiVar7, str, aebwVar3);
                r13 = r12;
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                adtzVar8 = (defpackage.adtz) objAj;
                aebwVar3.a = adtzVar8;
                aebwVar3.h = 7;
                if (r13.o(adtzVar8, list5, aebwVar3) != aoluVar) {
                    return adtzVar8;
                }
                return aoluVar;
            case 1:
                defpackage.akti aktiVar8 = aebwVar3.l;
                java.util.Map map4 = (java.util.Map) aebwVar3.e;
                java.util.List list6 = (java.util.List) aebwVar3.d;
                defpackage.aecg aecgVar4 = (defpackage.aecg) aebwVar3.c;
                defpackage.adzy adzyVar7 = aebwVar3.k;
                defpackage.aduw aduwVar6 = aebwVar3.j;
                aktiVar2 = aebwVar3.i;
                java.lang.Object obj5 = aebwVar3.b;
                list2 = (java.util.List) aebwVar3.a;
                defpackage.aooc.af(objAj);
                aktiVar3 = aktiVar8;
                adzyVar2 = adzyVar7;
                aduwVar2 = aduwVar6;
                aecgVar = aecgVar4;
                obj = objAj;
                map2 = map4;
                list3 = list6;
                obj2 = obj5;
                aebwVar3.a = list2;
                aebwVar3.b = obj2;
                aebwVar3.i = aktiVar2;
                aebwVar3.j = aduwVar2;
                aebwVar3.k = adzyVar2;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.l = null;
                aebwVar3.h = 2;
                adzyVar3 = adzyVar2;
                defpackage.aecg aecgVar5 = aecgVar;
                aebwVar2 = aebwVar3;
                objAj = defpackage.aoov.aj(aecgVar5.j, new defpackage.aece(aecgVar5, aduwVar2, list3, aktiVar3, (java.lang.String) obj, map2, null), aebwVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                aduwVar3 = aduwVar2;
                aktiVar4 = aktiVar2;
                adzyVar4 = adzyVar3;
                list4 = list2;
                obj3 = obj2;
                adtzVar = (defpackage.adtz) objAj;
                if (adtzVar.g()) {
                    defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar;
                }
                objD = adtzVar.d();
                if (objD == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                defpackage.aecj aecjVar2 = this.j;
                akrjVar = (defpackage.akrj) objD;
                aebwVar2.a = list4;
                aebwVar2.b = obj3;
                aebwVar2.i = aktiVar4;
                aebwVar2.j = aduwVar3;
                aebwVar2.k = adzyVar4;
                aebwVar2.c = adtzVar;
                aebwVar2.d = akrjVar;
                aebwVar2.h = 3;
                objA = aecjVar2.a(adzyVar4, aebwVar2);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                adzyVar5 = adzyVar4;
                akrjVar2 = akrjVar;
                aduwVar4 = aduwVar3;
                aktiVar5 = aktiVar4;
                adtzVar2 = adtzVar;
                objAj = objA;
                obj4 = obj3;
                adtzVar3 = (defpackage.adtz) objAj;
                if (adtzVar3.g()) {
                    defpackage.aooh.d(adtzVar3, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar3;
                }
                ?? r11 = this.d;
                java.lang.String str4 = (java.lang.String) adtzVar3.d();
                aebwVar2.a = list4;
                aebwVar2.b = obj4;
                aebwVar2.i = aktiVar5;
                aebwVar2.j = aduwVar4;
                aebwVar2.k = adzyVar5;
                aebwVar2.c = adtzVar2;
                aebwVar2.d = akrjVar2;
                aebwVar2.e = adtzVar3;
                aebwVar2.h = 4;
                akrjVar3 = akrjVar2;
                aebw aebwVar5 = aebwVar2;
                objB = r11.b(list4, obj4, str4, akrjVar3, aebwVar5);
                aebwVar3 = aebwVar5;
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objAj = objB;
                adtzVar4 = adtzVar3;
                aktiVar6 = aktiVar5;
                akrjVar4 = akrjVar3;
                r15 = obj4;
                aduwVar5 = aduwVar4;
                adzyVar6 = adzyVar5;
                adtzVar5 = (defpackage.adtz) objAj;
                if (adtzVar5.g()) {
                    aebwVar3.a = adtzVar5;
                    aebwVar3.b = null;
                    aebwVar3.i = null;
                    aebwVar3.j = null;
                    aebwVar3.k = null;
                    aebwVar3.c = null;
                    aebwVar3.d = null;
                    aebwVar3.e = null;
                    aebwVar3.h = 5;
                    j$.util.Objects.checkIndex(0, 3);
                    if (adtzVar5 == null) {
                        objL = defpackage.aojh.a;
                    } else if (adtzVar5 instanceof aedm) {
                        objL = m(aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            objL = defpackage.aojh.a;
                        }
                    } else if (adtzVar5 instanceof adua) {
                        objL = l(adtzVar5, list4, r15, aktiVar6, aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            adtzVar5 = adtzVar5;
                            objL = defpackage.aojh.a;
                        }
                    } else {
                        objL = defpackage.aojh.a;
                    }
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar7 = adtzVar5;
                    defpackage.aooh.d(adtzVar7, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar7;
                }
                aktiVar7 = aktiVar6;
                r12 = this;
                adtzVar6 = adtzVar4;
                list5 = list4;
                objD2 = adtzVar5.d();
                if (objD2 == null) {
                    throw new java.lang.IllegalStateException("Registration response is null");
                }
                aeaaVar = (aeaa) objD2;
                objD3 = adtzVar2.d();
                if (objD3 == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                int iBK2 = defpackage.agab.bK((defpackage.akrj) objD3, list5, r15);
                if (aduwVar5.a()) {
                    akryVar = akrjVar4.d;
                    if (akryVar == null) {
                        akryVar = defpackage.akry.a;
                    }
                    akraVar = akryVar.d;
                    if (akraVar == null) {
                        akraVar = defpackage.akra.a;
                    }
                    if (akraVar.b == 1) {
                        akrgVar = (defpackage.akrg) akraVar.c;
                    } else {
                        akrgVar = defpackage.akrg.a;
                    }
                    str = akrgVar.c;
                } else {
                    str = null;
                }
                ?? r1 = r12.d;
                java.lang.String str5 = (java.lang.String) adtzVar6.d();
                aebwVar3.a = list5;
                aebwVar3.b = null;
                aebwVar3.i = null;
                aebwVar3.j = null;
                aebwVar3.k = null;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.h = 6;
                objAj = r1.a(list5, r15, aeaaVar, str5, iBK2, adzyVar6, aduwVar5, aktiVar7, str, aebwVar3);
                r13 = r12;
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                adtzVar8 = (defpackage.adtz) objAj;
                aebwVar3.a = adtzVar8;
                aebwVar3.h = 7;
                if (r13.o(adtzVar8, list5, aebwVar3) != aoluVar) {
                    return adtzVar8;
                }
                return aoluVar;
            case 2:
                adzyVar4 = aebwVar3.k;
                aduwVar3 = aebwVar3.j;
                aktiVar4 = aebwVar3.i;
                java.lang.Object obj6 = aebwVar3.b;
                java.util.List list7 = (java.util.List) aebwVar3.a;
                defpackage.aooc.af(objAj);
                obj3 = obj6;
                list4 = list7;
                aebwVar2 = aebwVar3;
                adtzVar = (defpackage.adtz) objAj;
                if (adtzVar.g()) {
                    defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar;
                }
                objD = adtzVar.d();
                if (objD == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                defpackage.aecj aecjVar3 = this.j;
                akrjVar = (defpackage.akrj) objD;
                aebwVar2.a = list4;
                aebwVar2.b = obj3;
                aebwVar2.i = aktiVar4;
                aebwVar2.j = aduwVar3;
                aebwVar2.k = adzyVar4;
                aebwVar2.c = adtzVar;
                aebwVar2.d = akrjVar;
                aebwVar2.h = 3;
                objA = aecjVar3.a(adzyVar4, aebwVar2);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                adzyVar5 = adzyVar4;
                akrjVar2 = akrjVar;
                aduwVar4 = aduwVar3;
                aktiVar5 = aktiVar4;
                adtzVar2 = adtzVar;
                objAj = objA;
                obj4 = obj3;
                adtzVar3 = (defpackage.adtz) objAj;
                if (adtzVar3.g()) {
                    defpackage.aooh.d(adtzVar3, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar3;
                }
                ?? r14 = this.d;
                java.lang.String str6 = (java.lang.String) adtzVar3.d();
                aebwVar2.a = list4;
                aebwVar2.b = obj4;
                aebwVar2.i = aktiVar5;
                aebwVar2.j = aduwVar4;
                aebwVar2.k = adzyVar5;
                aebwVar2.c = adtzVar2;
                aebwVar2.d = akrjVar2;
                aebwVar2.e = adtzVar3;
                aebwVar2.h = 4;
                akrjVar3 = akrjVar2;
                aebw aebwVar6 = aebwVar2;
                objB = r14.b(list4, obj4, str6, akrjVar3, aebwVar6);
                aebwVar3 = aebwVar6;
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objAj = objB;
                adtzVar4 = adtzVar3;
                aktiVar6 = aktiVar5;
                akrjVar4 = akrjVar3;
                r15 = obj4;
                aduwVar5 = aduwVar4;
                adzyVar6 = adzyVar5;
                adtzVar5 = (defpackage.adtz) objAj;
                if (adtzVar5.g()) {
                    aebwVar3.a = adtzVar5;
                    aebwVar3.b = null;
                    aebwVar3.i = null;
                    aebwVar3.j = null;
                    aebwVar3.k = null;
                    aebwVar3.c = null;
                    aebwVar3.d = null;
                    aebwVar3.e = null;
                    aebwVar3.h = 5;
                    j$.util.Objects.checkIndex(0, 3);
                    if (adtzVar5 == null) {
                        objL = defpackage.aojh.a;
                    } else if (adtzVar5 instanceof aedm) {
                        objL = m(aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            objL = defpackage.aojh.a;
                        }
                    } else if (adtzVar5 instanceof adua) {
                        objL = l(adtzVar5, list4, r15, aktiVar6, aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            adtzVar5 = adtzVar5;
                            objL = defpackage.aojh.a;
                        }
                    } else {
                        objL = defpackage.aojh.a;
                    }
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar7 = adtzVar5;
                    defpackage.aooh.d(adtzVar7, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar7;
                }
                aktiVar7 = aktiVar6;
                r12 = this;
                adtzVar6 = adtzVar4;
                list5 = list4;
                objD2 = adtzVar5.d();
                if (objD2 == null) {
                    throw new java.lang.IllegalStateException("Registration response is null");
                }
                aeaaVar = (aeaa) objD2;
                objD3 = adtzVar2.d();
                if (objD3 == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                int iBK3 = defpackage.agab.bK((defpackage.akrj) objD3, list5, r15);
                if (aduwVar5.a()) {
                    akryVar = akrjVar4.d;
                    if (akryVar == null) {
                        akryVar = defpackage.akry.a;
                    }
                    akraVar = akryVar.d;
                    if (akraVar == null) {
                        akraVar = defpackage.akra.a;
                    }
                    if (akraVar.b == 1) {
                        akrgVar = (defpackage.akrg) akraVar.c;
                    } else {
                        akrgVar = defpackage.akrg.a;
                    }
                    str = akrgVar.c;
                } else {
                    str = null;
                }
                ?? r2 = r12.d;
                java.lang.String str7 = (java.lang.String) adtzVar6.d();
                aebwVar3.a = list5;
                aebwVar3.b = null;
                aebwVar3.i = null;
                aebwVar3.j = null;
                aebwVar3.k = null;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.h = 6;
                objAj = r2.a(list5, r15, aeaaVar, str7, iBK3, adzyVar6, aduwVar5, aktiVar7, str, aebwVar3);
                r13 = r12;
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                adtzVar8 = (defpackage.adtz) objAj;
                aebwVar3.a = adtzVar8;
                aebwVar3.h = 7;
                if (r13.o(adtzVar8, list5, aebwVar3) != aoluVar) {
                    return adtzVar8;
                }
                return aoluVar;
            case 3:
                akrjVar2 = (defpackage.akrj) aebwVar3.d;
                defpackage.adtz adtzVar9 = (defpackage.adtz) aebwVar3.c;
                defpackage.adzy adzyVar8 = aebwVar3.k;
                defpackage.aduw aduwVar7 = aebwVar3.j;
                defpackage.akti aktiVar9 = aebwVar3.i;
                java.lang.Object obj7 = aebwVar3.b;
                list4 = (java.util.List) aebwVar3.a;
                defpackage.aooc.af(objAj);
                adtzVar2 = adtzVar9;
                aktiVar5 = aktiVar9;
                aduwVar4 = aduwVar7;
                adzyVar5 = adzyVar8;
                obj4 = obj7;
                aebwVar2 = aebwVar3;
                adtzVar3 = (defpackage.adtz) objAj;
                if (adtzVar3.g()) {
                    defpackage.aooh.d(adtzVar3, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar3;
                }
                ?? r16 = this.d;
                java.lang.String str8 = (java.lang.String) adtzVar3.d();
                aebwVar2.a = list4;
                aebwVar2.b = obj4;
                aebwVar2.i = aktiVar5;
                aebwVar2.j = aduwVar4;
                aebwVar2.k = adzyVar5;
                aebwVar2.c = adtzVar2;
                aebwVar2.d = akrjVar2;
                aebwVar2.e = adtzVar3;
                aebwVar2.h = 4;
                akrjVar3 = akrjVar2;
                aebw aebwVar7 = aebwVar2;
                objB = r16.b(list4, obj4, str8, akrjVar3, aebwVar7);
                aebwVar3 = aebwVar7;
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objAj = objB;
                adtzVar4 = adtzVar3;
                aktiVar6 = aktiVar5;
                akrjVar4 = akrjVar3;
                r15 = obj4;
                aduwVar5 = aduwVar4;
                adzyVar6 = adzyVar5;
                adtzVar5 = (defpackage.adtz) objAj;
                if (adtzVar5.g()) {
                    aebwVar3.a = adtzVar5;
                    aebwVar3.b = null;
                    aebwVar3.i = null;
                    aebwVar3.j = null;
                    aebwVar3.k = null;
                    aebwVar3.c = null;
                    aebwVar3.d = null;
                    aebwVar3.e = null;
                    aebwVar3.h = 5;
                    j$.util.Objects.checkIndex(0, 3);
                    if (adtzVar5 == null) {
                        objL = defpackage.aojh.a;
                    } else if (adtzVar5 instanceof aedm) {
                        objL = m(aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            objL = defpackage.aojh.a;
                        }
                    } else if (adtzVar5 instanceof adua) {
                        objL = l(adtzVar5, list4, r15, aktiVar6, aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            adtzVar5 = adtzVar5;
                            objL = defpackage.aojh.a;
                        }
                    } else {
                        objL = defpackage.aojh.a;
                    }
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar7 = adtzVar5;
                    defpackage.aooh.d(adtzVar7, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar7;
                }
                aktiVar7 = aktiVar6;
                r12 = this;
                adtzVar6 = adtzVar4;
                list5 = list4;
                objD2 = adtzVar5.d();
                if (objD2 == null) {
                    throw new java.lang.IllegalStateException("Registration response is null");
                }
                aeaaVar = (aeaa) objD2;
                objD3 = adtzVar2.d();
                if (objD3 == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                int iBK4 = defpackage.agab.bK((defpackage.akrj) objD3, list5, r15);
                if (aduwVar5.a()) {
                    akryVar = akrjVar4.d;
                    if (akryVar == null) {
                        akryVar = defpackage.akry.a;
                    }
                    akraVar = akryVar.d;
                    if (akraVar == null) {
                        akraVar = defpackage.akra.a;
                    }
                    if (akraVar.b == 1) {
                        akrgVar = (defpackage.akrg) akraVar.c;
                    } else {
                        akrgVar = defpackage.akrg.a;
                    }
                    str = akrgVar.c;
                } else {
                    str = null;
                }
                ?? r3 = r12.d;
                java.lang.String str9 = (java.lang.String) adtzVar6.d();
                aebwVar3.a = list5;
                aebwVar3.b = null;
                aebwVar3.i = null;
                aebwVar3.j = null;
                aebwVar3.k = null;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.h = 6;
                objAj = r3.a(list5, r15, aeaaVar, str9, iBK4, adzyVar6, aduwVar5, aktiVar7, str, aebwVar3);
                r13 = r12;
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                adtzVar8 = (defpackage.adtz) objAj;
                aebwVar3.a = adtzVar8;
                aebwVar3.h = 7;
                if (r13.o(adtzVar8, list5, aebwVar3) != aoluVar) {
                    return adtzVar8;
                }
                return aoluVar;
            case 4:
                adtzVar4 = (defpackage.adtz) aebwVar3.e;
                akrjVar4 = (defpackage.akrj) aebwVar3.d;
                adtzVar2 = (defpackage.adtz) aebwVar3.c;
                adzyVar5 = aebwVar3.k;
                aduwVar4 = aebwVar3.j;
                aktiVar6 = aebwVar3.i;
                java.lang.Object obj8 = aebwVar3.b;
                list4 = (java.util.List) aebwVar3.a;
                defpackage.aooc.af(objAj);
                r15 = obj8;
                aduwVar5 = aduwVar4;
                adzyVar6 = adzyVar5;
                adtzVar5 = (defpackage.adtz) objAj;
                if (adtzVar5.g()) {
                    aebwVar3.a = adtzVar5;
                    aebwVar3.b = null;
                    aebwVar3.i = null;
                    aebwVar3.j = null;
                    aebwVar3.k = null;
                    aebwVar3.c = null;
                    aebwVar3.d = null;
                    aebwVar3.e = null;
                    aebwVar3.h = 5;
                    j$.util.Objects.checkIndex(0, 3);
                    if (adtzVar5 == null) {
                        objL = defpackage.aojh.a;
                    } else if (adtzVar5 instanceof aedm) {
                        objL = m(aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            objL = defpackage.aojh.a;
                        }
                    } else if (adtzVar5 instanceof adua) {
                        objL = l(adtzVar5, list4, r15, aktiVar6, aduwVar5, aebwVar3);
                        if (objL != aoluVar) {
                            adtzVar5 = adtzVar5;
                            objL = defpackage.aojh.a;
                        }
                    } else {
                        objL = defpackage.aojh.a;
                    }
                    if (objL == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar7 = adtzVar5;
                    defpackage.aooh.d(adtzVar7, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar7;
                }
                aktiVar7 = aktiVar6;
                r12 = this;
                adtzVar6 = adtzVar4;
                list5 = list4;
                objD2 = adtzVar5.d();
                if (objD2 == null) {
                    throw new java.lang.IllegalStateException("Registration response is null");
                }
                aeaaVar = (aeaa) objD2;
                objD3 = adtzVar2.d();
                if (objD3 == null) {
                    throw new java.lang.IllegalStateException("Registration request is null");
                }
                int iBK5 = defpackage.agab.bK((defpackage.akrj) objD3, list5, r15);
                if (aduwVar5.a()) {
                    akryVar = akrjVar4.d;
                    if (akryVar == null) {
                        akryVar = defpackage.akry.a;
                    }
                    akraVar = akryVar.d;
                    if (akraVar == null) {
                        akraVar = defpackage.akra.a;
                    }
                    if (akraVar.b == 1) {
                        akrgVar = (defpackage.akrg) akraVar.c;
                    } else {
                        akrgVar = defpackage.akrg.a;
                    }
                    str = akrgVar.c;
                } else {
                    str = null;
                }
                ?? r4 = r12.d;
                java.lang.String str10 = (java.lang.String) adtzVar6.d();
                aebwVar3.a = list5;
                aebwVar3.b = null;
                aebwVar3.i = null;
                aebwVar3.j = null;
                aebwVar3.k = null;
                aebwVar3.c = null;
                aebwVar3.d = null;
                aebwVar3.e = null;
                aebwVar3.h = 6;
                objAj = r4.a(list5, r15, aeaaVar, str10, iBK5, adzyVar6, aduwVar5, aktiVar7, str, aebwVar3);
                r13 = r12;
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                adtzVar8 = (defpackage.adtz) objAj;
                aebwVar3.a = adtzVar8;
                aebwVar3.h = 7;
                if (r13.o(adtzVar8, list5, aebwVar3) != aoluVar) {
                    return adtzVar8;
                }
                return aoluVar;
            case 5:
                adtzVar7 = (defpackage.adtz) aebwVar3.a;
                defpackage.aooc.af(objAj);
                defpackage.aooh.d(adtzVar7, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                return (defpackage.adtv) adtzVar7;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                list5 = (java.util.List) aebwVar3.a;
                defpackage.aooc.af(objAj);
                r13 = this;
                adtzVar8 = (defpackage.adtz) objAj;
                aebwVar3.a = adtzVar8;
                aebwVar3.h = 7;
                if (r13.o(adtzVar8, list5, aebwVar3) != aoluVar) {
                    return adtzVar8;
                }
                return aoluVar;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.adtz adtzVar10 = (defpackage.adtz) aebwVar3.a;
                defpackage.aooc.af(objAj);
                return adtzVar10;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(defpackage.adtz adtzVar, java.util.List list, defpackage.aoln aolnVar) {
        aeby aebyVar;
        if (aolnVar instanceof aeby) {
            aebyVar = (aeby) aolnVar;
            int i = aebyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebyVar.c = i - Integer.MIN_VALUE;
            } else {
                aebyVar = new aeby(this, aolnVar);
            }
        } else {
            aebyVar = new aeby(this, aolnVar);
        }
        aeby aebyVar2 = aebyVar;
        java.lang.Object objS = aebyVar2.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aebyVar2.c;
        if (i2 == 0) {
            defpackage.aooc.af(objS);
            if (this.o.h == 0 || (adtzVar.i() && list.isEmpty())) {
                defpackage.adzh adzhVar = this.m;
                aebyVar2.c = 1;
                if (adzhVar.a(17, aebyVar2) == aoluVar) {
                    return aoluVar;
                }
            } else if (adtzVar.i()) {
                defpackage.adzh adzhVar2 = this.m;
                defpackage.adzf adzfVar = this.n;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.Long l = new java.lang.Long(((defpackage.aeao) adzfVar).a);
                aebyVar2.c = 2;
                objS = defpackage.aesg.s(adzhVar2, adzfVar, null, bundle, l, aebyVar2, 16);
                if (objS == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i2 == 1) {
            defpackage.aooc.af(objS);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objS);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(defpackage.aoln aolnVar) {
        aebx aebxVar;
        if (aolnVar instanceof aebx) {
            aebxVar = (aebx) aolnVar;
            int i = aebxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aebxVar.c = i - Integer.MIN_VALUE;
            } else {
                aebxVar = new aebx(this, aolnVar);
            }
        } else {
            aebxVar = new aebx(this, aolnVar);
        }
        java.lang.Object obj = aebxVar.a;
        int i2 = aebxVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                defpackage.aooc.af(obj);
            } catch (java.lang.Exception e) {
                ((defpackage.aiob) ((defpackage.aiob) c.d()).k(e)).v("Failed to report registration results");
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.adzf
    public final void i() {
    }

    @Override // defpackage.adzf
    public final /* synthetic */ void j() {
    }
}
