package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zth {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public zth(android.content.Context context, android.content.Context context2, defpackage.aolr aolrVar, defpackage.aoss aossVar) {
        if (context == null) {
            defpackage.aooh.i("unencryptedStorageContext");
        }
        if (context2 == null) {
            defpackage.aooh.i("applicationContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.a = context;
        this.b = context2;
        this.c = aolrVar;
        this.d = new defpackage.aoiy(new defpackage.uob(this, 13));
        new defpackage.aoiy(new defpackage.uob(this, 14));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoir, java.lang.Object] */
    public final android.content.SharedPreferences a() {
        java.lang.Object objA = this.d.a();
        defpackage.aooh.e(objA, "<get-value>(...)");
        return (android.content.SharedPreferences) objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [aoir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        defpackage.ztg ztgVar;
        if (aolnVar instanceof defpackage.ztg) {
            ztgVar = (defpackage.ztg) aolnVar;
            int i = ztgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ztgVar.c = i - Integer.MIN_VALUE;
            } else {
                ztgVar = new defpackage.ztg(this, aolnVar);
            }
        } else {
            ztgVar = new defpackage.ztg(this, aolnVar);
        }
        java.lang.Object objAj = ztgVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ztgVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            ?? r7 = this.d;
            if (r7.b()) {
                java.lang.Object objA = r7.a();
                defpackage.aooh.e(objA, "<get-value>(...)");
                return objA;
            }
            ?? r8 = this.c;
            defpackage.zhb zhbVar = new defpackage.zhb(this, (defpackage.aoln) null, 16);
            ztgVar.c = 1;
            objAj = defpackage.aoov.aj(r8, zhbVar, ztgVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        defpackage.aooh.e(objAj, "withContext(...)");
        return objAj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final defpackage.zjv c(defpackage.ainp ainpVar) {
        defpackage.mgw mgwVar = (defpackage.mgw) this.a.a();
        mgwVar.getClass();
        defpackage.zth zthVar = (defpackage.zth) this.b.a();
        zthVar.getClass();
        defpackage.ajcu ajcuVar = (defpackage.ajcu) this.c.a();
        ajcuVar.getClass();
        ((defpackage.aais) this.d.a()).getClass();
        return new defpackage.zjv(mgwVar, zthVar, ajcuVar, ainpVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aoir, java.lang.Object] */
    public final defpackage.zas d(java.lang.String str) {
        java.lang.Object objPutIfAbsent;
        if (str == null) {
            return (defpackage.zas) this.a.a();
        }
        ?? r0 = this.d;
        java.lang.Object objL = r0.get(str);
        if (objL == null && (objPutIfAbsent = r0.putIfAbsent(str, (objL = ((rai) this.b).l(str)))) != null) {
            objL = objPutIfAbsent;
        }
        return (defpackage.zas) objL;
    }

    public final defpackage.ysg e(yse yseVar) {
        defpackage.aoin aoinVar = (defpackage.aoin) ((defpackage.zzx) this.b).k().get(yseVar);
        defpackage.ysg ysgVar = aoinVar != null ? (defpackage.ysg) aoinVar.a() : null;
        if (ysgVar != null) {
            return ysgVar;
        }
        java.util.Objects.toString(yseVar);
        throw new java.lang.IllegalStateException("AiCoreIntegration not found for AiCoreFeature: ".concat(java.lang.String.valueOf(yseVar)));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aolr, java.lang.Object] */
    public final defpackage.aoxh f(yse yseVar) {
        defpackage.aooh.f(yseVar, "feature");
        ytm ytmVar = (ytm) this.a;
        yry yryVar = new yry(ytmVar.e, this, yseVar, 0);
        yrv yrvVar = new yrv((defpackage.aoln) null, this, yseVar);
        int i = defpackage.aoyc.a;
        return defpackage.aoov.aC(new defpackage.aoyp(new defpackage.apaa(yrvVar, yryVar), new yry(ytmVar.f, this, yseVar, 2), new yrx((defpackage.aoln) null)), this.d);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [abwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object g(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ttm ttmVar;
        java.util.List list2;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof ttm) {
            ttmVar = (ttm) aolnVar;
            int i = ttmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttmVar.c = i - Integer.MIN_VALUE;
            } else {
                ttmVar = new ttm(this, aolnVar);
            }
        } else {
            ttmVar = new ttm(this, aolnVar);
        }
        java.lang.Object objJ = ttmVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ttmVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objJ);
                java.lang.Object obj3 = this.a;
                ttmVar.a = list;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                ttmVar.d = apdpVar;
                ttmVar.c = 1;
                if (apdpVar.b(ttmVar) == aoluVar) {
                    return aoluVar;
                }
                list2 = list;
                obj = obj3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (defpackage.apdp) ttmVar.a;
                    try {
                        defpackage.aooc.af(objJ);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objJ;
                        ((defpackage.apdp) obj2).d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((defpackage.apdp) obj2).d();
                        throw th;
                    }
                }
                obj = ttmVar.d;
                list2 = (java.util.List) ttmVar.a;
                defpackage.aooc.af(objJ);
            }
            ?? r9 = this.c;
            ?? r7 = this.b;
            ttmVar.a = obj;
            ttmVar.d = null;
            ttmVar.c = 2;
            objJ = defpackage.aazc.j(r9, list2, r7, ttmVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objJ;
            ((defpackage.apdp) obj2).d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj4 = obj;
            th = th3;
            obj2 = obj4;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object h(defpackage.aoln aolnVar) throws java.lang.Throwable {
        ttp ttpVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof ttp) {
            ttpVar = (ttp) aolnVar;
            int i = ttpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttpVar.b = i - Integer.MIN_VALUE;
            } else {
                ttpVar = new ttp(this, aolnVar);
            }
        } else {
            ttpVar = new ttp(this, aolnVar);
        }
        java.lang.Object obj3 = ttpVar.a;
        java.lang.Object obj4 = defpackage.aolu.a;
        int i2 = ttpVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                obj = this.a;
                defpackage.apdp apdpVar = (defpackage.apdp) obj;
                ttpVar.c = apdpVar;
                ttpVar.b = 1;
                if (apdpVar.b(ttpVar) != obj4) {
                }
                return obj4;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = ttpVar.c;
                try {
                    defpackage.aooc.af(obj3);
                    obj4 = (java.util.Map) obj3;
                    ((defpackage.apdp) obj2).d();
                    return obj4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.apdp) obj2).d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar2 = ttpVar.c;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            ?? r6 = this.c;
            ttpVar.c = (defpackage.apdp) obj;
            ttpVar.b = 2;
            java.lang.Object objD = r6.d(ttpVar);
            if (objD != obj4) {
                java.lang.Object obj5 = obj;
                obj3 = objD;
                obj2 = obj5;
                obj4 = (java.util.Map) obj3;
                ((defpackage.apdp) obj2).d();
            }
            return obj4;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [abwn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object i(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ttl ttlVar;
        afpl afplVar2;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof ttl) {
            ttlVar = (ttl) aolnVar;
            int i = ttlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ttlVar.c = i - Integer.MIN_VALUE;
            } else {
                ttlVar = new ttl(this, aolnVar);
            }
        } else {
            ttlVar = new ttl(this, aolnVar);
        }
        java.lang.Object objB = ttlVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ttlVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                java.lang.Object obj3 = this.a;
                ttlVar.a = afplVar;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                ttlVar.d = apdpVar;
                ttlVar.c = 1;
                if (apdpVar.b(ttlVar) == aoluVar) {
                    return aoluVar;
                }
                afplVar2 = afplVar;
                obj = obj3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (defpackage.apdp) ttlVar.a;
                    try {
                        defpackage.aooc.af(objB);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objB;
                        ((defpackage.apdp) obj2).d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((defpackage.apdp) obj2).d();
                        throw th;
                    }
                }
                obj = ttlVar.d;
                afplVar2 = (afpl) ttlVar.a;
                defpackage.aooc.af(objB);
            }
            ?? r9 = this.c;
            ?? r7 = this.b;
            ttlVar.a = obj;
            ttlVar.d = null;
            ttlVar.c = 2;
            objB = defpackage.aazc.B(r9, afplVar2, r7, ttlVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objB;
            ((defpackage.apdp) obj2).d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj4 = obj;
            th = th3;
            obj2 = obj4;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    public zth(j$.util.Optional optional, defpackage.stw stwVar, defpackage.ajcu ajcuVar, defpackage.ipc ipcVar) {
        this.c = optional;
        this.b = stwVar;
        this.d = ajcuVar;
        this.a = ipcVar;
    }

    public zth(defpackage.zzx zzxVar, defpackage.ucm ucmVar, defpackage.aolr aolrVar, ytm ytmVar, uyg uygVar) {
        defpackage.aooh.f(ucmVar, "aiCoreModelAvailabilityFlow");
        defpackage.aooh.f(aolrVar, "lightweightContext");
        defpackage.aooh.f(ytmVar, "onDeviceVersionFlow");
        defpackage.aooh.f(uygVar, "aiCoreModelDownloadProgressFlow");
        this.b = zzxVar;
        this.c = ucmVar;
        this.d = aolrVar;
        this.a = ytmVar;
    }

    public zth(defpackage.ajct ajctVar, defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.zjs zjsVar) {
        this.d = ajctVar;
        this.a = zjmVar;
        this.c = zjmVar2;
        this.b = zjsVar;
    }

    public zth(rai raiVar, defpackage.zpm zpmVar) {
        if (raiVar == null) {
            defpackage.aooh.i("semanticLoggerFactory");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        this.b = raiVar;
        this.c = zpmVar;
        this.a = new defpackage.aoiy(new defpackage.uob(this, 10));
        this.d = new j$.util.concurrent.ConcurrentHashMap();
    }

    public zth(defpackage.zzx zzxVar, defpackage.ttx ttxVar) {
        if (ttxVar == null) {
            defpackage.aooh.i("sharpieDao");
        }
        this.d = zzxVar;
        this.c = defpackage.aazc.n("sharpie_data", "callCreatedTimestampMs", ttxVar, new defpackage.rou(3), new defpackage.rou(4), new defpackage.dkm(6), defpackage.ttq.a, new defpackage.aeza());
        this.a = new defpackage.apdp();
        this.b = new defpackage.tto(this, 0);
    }

    public zth(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.c = aoinVar3;
        aoinVar4.getClass();
        this.d = aoinVar4;
    }

    public zth(defpackage.rlv rlvVar, defpackage.nwu nwuVar, defpackage.gpd gpdVar, defpackage.acxg acxgVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (nwuVar == null) {
            defpackage.aooh.i("meetCallController");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.c = rlvVar;
        this.d = nwuVar;
        this.b = gpdVar;
        this.a = acxgVar;
    }
}
