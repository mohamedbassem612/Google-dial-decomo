package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ugs {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl");
    public final defpackage.aoss b;
    public final defpackage.rlv c;
    public final defpackage.ruc d;
    public final defpackage.apdp e;
    public final defpackage.zjm f;
    public final defpackage.zjm g;
    private final defpackage.aoss h;
    private final defpackage.aolr i;
    private final defpackage.aolr j;
    private final defpackage.zzx k;
    private final defpackage.zzx l;

    public ugs(defpackage.aoss aossVar, defpackage.aoss aossVar2, defpackage.aolr aolrVar, defpackage.aolr aolrVar2, defpackage.zjm zjmVar, defpackage.zzx zzxVar, defpackage.zzx zzxVar2, defpackage.zjm zjmVar2, defpackage.rlv rlvVar, defpackage.ruc rucVar) {
        if (aossVar == null) {
            defpackage.aooh.i("backgroundScope");
        }
        if (aossVar2 == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aolrVar2 == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (rucVar == null) {
            defpackage.aooh.i("metrics");
        }
        this.h = aossVar;
        this.b = aossVar2;
        this.i = aolrVar;
        this.j = aolrVar2;
        this.f = zjmVar;
        this.l = zzxVar;
        this.k = zzxVar2;
        this.g = zjmVar2;
        this.c = rlvVar;
        this.d = rucVar;
        this.e = new defpackage.apdp();
    }

    public final defpackage.ajcq a(zdm zdmVar) {
        return defpackage.aosv.F(this.b, 0, new ufr(this, zdmVar, (defpackage.aoln) null, 8, (boolean[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(zdm zdmVar, abba abbaVar, boolean z, defpackage.aoln aolnVar) {
        ugn ugnVar;
        defpackage.ugs ugsVar;
        zdm zdmVar2;
        zdm zdmVar3;
        if (aolnVar instanceof ugn) {
            ugnVar = (ugn) aolnVar;
            int i = ugnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugnVar.d = i - Integer.MIN_VALUE;
            } else {
                ugnVar = new ugn(this, aolnVar);
            }
        } else {
            ugnVar = new ugn(this, aolnVar);
        }
        java.lang.Object objAj = ugnVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ugnVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.aolr aolrVar = this.i;
            ugsVar = this;
            zdmVar2 = zdmVar;
            ugo ugoVar = new ugo(ugsVar, zdmVar2, z, abbaVar, (defpackage.aoln) null);
            ugnVar.a = zdmVar2;
            ugnVar.d = 1;
            objAj = defpackage.aoov.aj(aolrVar, ugoVar, ugnVar);
            if (objAj == aoluVar) {
                zdmVar3 = zdmVar2;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj = ugnVar.a;
            defpackage.aooc.af(objAj);
            ugsVar = this;
            zdmVar3 = obj;
        }
        zdmVar3 = zdmVar2;
        zdn zdnVar = (zdn) objAj;
        defpackage.aoub aoubVarAn = defpackage.aoov.an(ugsVar.h, null, 0, new ugg(ugsVar, zdmVar3, zdnVar, (defpackage.aoln) null, 2), 3);
        long j = defpackage.ahqx.a;
        aoubVarAn.p(defpackage.ahqx.m(new agvo(new java.lang.Object[0], 0)));
        return zdnVar;
    }

    public final java.lang.Object c(zdm zdmVar, defpackage.aoln aolnVar) {
        java.lang.Object objAj = defpackage.aoov.aj(this.i, new ufr(this, zdmVar, (defpackage.aoln) null, 3), aolnVar);
        return objAj != defpackage.aolu.a ? defpackage.aojh.a : objAj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zdm] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, zdm] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final java.lang.Object d(zdm zdmVar, boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ugp ugpVar;
        defpackage.abbe abbeVar;
        if (aolnVar instanceof ugp) {
            ugpVar = (ugp) aolnVar;
            int i = ugpVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugpVar.e = i - Integer.MIN_VALUE;
            } else {
                ugpVar = new ugp(this, aolnVar);
            }
        } else {
            ugpVar = new ugp(this, aolnVar);
        }
        java.lang.Object objH = ugpVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ugpVar.e;
        try {
            try {
                if (i2 == 0) {
                    defpackage.aooc.af(objH);
                    try {
                        defpackage.ruc rucVar = this.d;
                        ugm ugmVar = ugm.a;
                        defpackage.nhv nhvVar = new defpackage.nhv(this, (zdm) zdmVar, (defpackage.aoln) null, 8);
                        ugpVar.a = zdmVar;
                        ugpVar.b = z;
                        ugpVar.e = 1;
                        objH = h(rucVar, ugmVar, nhvVar, ugpVar);
                        zdmVar = zdmVar;
                        if (objH == aoluVar) {
                            return aoluVar;
                        }
                    } catch (defpackage.abbe e) {
                        abbeVar = e;
                        this.c.o(defpackage.rmx.MOIRAI_INITIALIZATION_FAILED);
                        throw new java.lang.IllegalStateException("Moirai API build failure", abbeVar);
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = ugpVar.b;
                    java.lang.Object obj = ugpVar.a;
                    defpackage.aooc.af(objH);
                    zdmVar = obj;
                }
                return (abai) objH;
            } catch (defpackage.abbe e2) {
                abbeVar = e2;
            }
        } catch (defpackage.zdo e3) {
            ?? r2 = zdmVar;
            this.c.o(defpackage.rmx.MOIRAI_PACKAGE_NOT_DOWNLOADED);
            if (z) {
                defpackage.agsm.i(914, defpackage.aosv.F(this.b, 0, new ufr(this, (zdm) r2, (defpackage.aoln) null, 4, (byte[]) null), 3), "Failed to download Moirai protections", new java.lang.Object[0]);
            }
            throw new java.lang.IllegalStateException("Moirai API not downloaded", e3);
        }
    }

    public final java.lang.Object e(zdm zdmVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.j, new ufr(this, zdmVar, (defpackage.aoln) null, 5, (char[]) null), aolnVar);
    }

    public final java.lang.Object f(zdm zdmVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.i, new ufr(this, zdmVar, (defpackage.aoln) null, 7, (int[]) null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(zdm zdmVar, defpackage.aoln aolnVar) {
        ugq ugqVar;
        java.lang.Object obj;
        if (aolnVar instanceof ugq) {
            ugqVar = (ugq) aolnVar;
            int i = ugqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugqVar.d = i - Integer.MIN_VALUE;
            } else {
                ugqVar = new ugq(this, aolnVar);
            }
        } else {
            ugqVar = new ugq(this, aolnVar);
        }
        java.lang.Object objA = ugqVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ugqVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objA);
            if (this.l.m()) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "isAvailable", 80, "MoiraiIntegrationImpl.kt")).v("disabled in directboot");
                return java.lang.Boolean.FALSE;
            }
            defpackage.aoin aoinVar = (defpackage.aoin) this.k.k().get(zdmVar.a());
            if (aoinVar == null) {
                ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "isAvailable", 90, "MoiraiIntegrationImpl.kt")).y("Disabled due to no availability implementation for client role: %s", zdmVar);
                return java.lang.Boolean.FALSE;
            }
            defpackage.zdq zdqVar = (defpackage.zdq) aoinVar.a();
            ugqVar.a = zdmVar;
            ugqVar.d = 1;
            objA = zdqVar.a(ugqVar);
            if (objA == aoluVar) {
                obj = zdmVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = ugqVar.a;
            defpackage.aooc.af(objA);
            obj = obj2;
        }
        obj = zdmVar;
        if (((java.lang.Boolean) objA).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/spam/moirai/impl/MoiraiIntegrationImpl", "isAvailable", 98, "MoiraiIntegrationImpl.kt")).y("Disabled due to availability returning false for role: %s", obj);
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:24:0x0059, B:26:0x006d), top: B:39:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v6, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aonj, java.lang.Object] */
    public final java.lang.Object h(defpackage.ruc rucVar, ugm ugmVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ugr ugrVar;
        ugm ugmVar2;
        j$.util.Optional optional;
        java.lang.Throwable th;
        ugm ugmVar3;
        java.lang.Object obj;
        ugm ugmVar4;
        ubv ubvVar;
        if (aolnVar instanceof ugr) {
            ugrVar = (ugr) aolnVar;
            int i = ugrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugrVar.d = i - Integer.MIN_VALUE;
            } else {
                ugrVar = new ugr(this, aolnVar);
            }
        } else {
            ugrVar = new ugr(this, aolnVar);
        }
        java.lang.Object obj2 = ugrVar.b;
        java.lang.Object obj3 = defpackage.aolu.a;
        int i2 = ugrVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj2);
            j$.util.Optional optionalA = rucVar.a();
            try {
                ugrVar.a = rucVar;
                ugrVar.e = ugmVar;
                ugrVar.f = optionalA;
                ugrVar.d = 1;
                java.lang.Object objA = aonjVar.a(ugrVar);
                if (objA == obj3) {
                    return obj3;
                }
                ugmVar3 = ugmVar;
                optional = optionalA;
                obj2 = objA;
                obj = rucVar;
                ugmVar4 = ugmVar3;
                ubvVar = new ubv(new slv(obj, ugmVar4, 19, (byte[]) null), 13);
                if (true == optional.isPresent()) {
                    ubvVar.a.a(optional.get());
                }
                return obj2;
            } catch (java.lang.Throwable th2) {
                ugmVar2 = ugmVar;
                optional = optionalA;
                th = th2;
                obj = rucVar;
                ugmVar4 = ugmVar2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j$.util.Optional optional2 = ugrVar.f;
            ugm ugmVar5 = ugrVar.e;
            java.lang.Object obj4 = ugrVar.a;
            try {
                defpackage.aooc.af(obj2);
                ugmVar3 = ugmVar5;
                optional = optional2;
                obj = obj4;
                ugmVar4 = ugmVar3;
                try {
                    ubvVar = new ubv(new slv(obj, ugmVar4, 19, (byte[]) null), 13);
                    if (true == optional.isPresent()) {
                        ubvVar.a.a(optional.get());
                    }
                    return obj2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                ugmVar2 = ugmVar5;
                optional = optional2;
                obj = obj4;
                ugmVar4 = ugmVar2;
            }
        }
        ubv ubvVar2 = new ubv(new slv(obj, ugmVar4, 20, (byte[]) null), 14);
        if (true == optional.isPresent()) {
            ubvVar2.a.a(optional.get());
        }
        throw th;
    }
}
