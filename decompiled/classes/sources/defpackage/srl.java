package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class srl {
    public final android.content.Context c;
    public final defpackage.aolr d;
    public final defpackage.ojo e;
    public final defpackage.aoin f;
    public final defpackage.zzx h;
    public final defpackage.aogc i;
    private final defpackage.aoir j;
    private final defpackage.abwh k;
    private final defpackage.apdp l;
    private final defpackage.tto m;
    private final defpackage.aeza n;
    public static final defpackage.ttj g = new defpackage.ttj();
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonelookup/database/PhoneLookupHistoryDataRepository");
    public static final java.lang.String[] b = {"normalized_number", "phone_lookup_info", "last_modified"};

    public srl(android.content.Context context, defpackage.aolr aolrVar, defpackage.zzx zzxVar, defpackage.ojo ojoVar, defpackage.aogc aogcVar, defpackage.aoin aoinVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("notifyObserversFlag");
        }
        this.c = context;
        this.d = aolrVar;
        this.h = zzxVar;
        this.e = ojoVar;
        this.i = aogcVar;
        this.f = aoinVar;
        this.m = new defpackage.tto(this, 1);
        defpackage.aeza aezaVar = new defpackage.aeza();
        this.n = aezaVar;
        this.l = new defpackage.apdp();
        this.j = new defpackage.aoiy(new defpackage.mbe(this, 19));
        this.k = new defpackage.abwh(new defpackage.sri(this), aezaVar);
    }

    public final defpackage.srm a() {
        return (defpackage.srm) this.j.a();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.List list, defpackage.aoln aolnVar) {
        defpackage.src srcVar;
        java.util.List list2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof defpackage.src) {
            srcVar = (defpackage.src) aolnVar;
            int i = srcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                srcVar.d = i - Integer.MIN_VALUE;
            } else {
                srcVar = new defpackage.src(this, aolnVar);
            }
        } else {
            srcVar = new defpackage.src(this, aolnVar);
        }
        java.lang.Object objAj = srcVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = srcVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objAj);
                defpackage.apdp apdpVar3 = this.l;
                srcVar.a = list;
                srcVar.e = apdpVar3;
                srcVar.d = 1;
                if (apdpVar3.b(srcVar) == aoluVar) {
                    return aoluVar;
                }
                list2 = list;
                apdpVar = apdpVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (defpackage.apdp) srcVar.a;
                    try {
                        defpackage.aooc.af(objAj);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objAj;
                        apdpVar2.d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdpVar = srcVar.e;
                list2 = (java.util.List) srcVar.a;
                defpackage.aooc.af(objAj);
            }
            defpackage.abwh abwhVar = this.k;
            defpackage.tto ttoVar = this.m;
            srcVar.a = apdpVar;
            srcVar.e = null;
            srcVar.d = 2;
            objAj = defpackage.aoov.aj(defpackage.aour.a, new defpackage.abwq(list2, abwhVar, ttoVar, null), srcVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
            apdpVar2 = apdpVar;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objAj;
            apdpVar2.d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, defpackage.aoln aolnVar) throws java.lang.Throwable {
        srd srdVar;
        java.lang.String str2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof srd) {
            srdVar = (srd) aolnVar;
            int i = srdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                srdVar.d = i - Integer.MIN_VALUE;
            } else {
                srdVar = new srd(this, aolnVar);
            }
        } else {
            srdVar = new srd(this, aolnVar);
        }
        java.lang.Object objB = srdVar.b;
        srn srnVar = defpackage.aolu.a;
        int i2 = srdVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                defpackage.apdp apdpVar3 = this.l;
                srdVar.a = str;
                srdVar.e = apdpVar3;
                srdVar.d = 1;
                if (apdpVar3.b(srdVar) != srnVar) {
                    str2 = str;
                    apdpVar = apdpVar3;
                }
                return srnVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (defpackage.apdp) srdVar.a;
                try {
                    defpackage.aooc.af(objB);
                    srnVar = (srn) objB;
                    apdpVar2.d();
                    return srnVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = srdVar.e;
            str2 = (java.lang.String) srdVar.a;
            defpackage.aooc.af(objB);
            defpackage.abwh abwhVar = this.k;
            srdVar.a = apdpVar;
            srdVar.e = null;
            srdVar.d = 2;
            objB = abwhVar.b(str2, srdVar);
            if (objB != srnVar) {
                apdpVar2 = apdpVar;
                srnVar = (srn) objB;
                apdpVar2.d();
            }
            return srnVar;
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(java.util.Set set, defpackage.aoln aolnVar) throws java.lang.Throwable {
        sre sreVar;
        java.util.Set set2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof sre) {
            sreVar = (sre) aolnVar;
            int i = sreVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sreVar.d = i - Integer.MIN_VALUE;
            } else {
                sreVar = new sre(this, aolnVar);
            }
        } else {
            sreVar = new sre(this, aolnVar);
        }
        java.lang.Object objC = sreVar.b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = sreVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objC);
                defpackage.apdp apdpVar3 = this.l;
                sreVar.a = set;
                sreVar.e = apdpVar3;
                sreVar.d = 1;
                if (apdpVar3.b(sreVar) != obj) {
                    set2 = set;
                    apdpVar = apdpVar3;
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (defpackage.apdp) sreVar.a;
                try {
                    defpackage.aooc.af(objC);
                    obj = (java.util.Map) objC;
                    apdpVar2.d();
                    return obj;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = sreVar.e;
            set2 = (java.util.Set) sreVar.a;
            defpackage.aooc.af(objC);
            defpackage.abwh abwhVar = this.k;
            sreVar.a = apdpVar;
            sreVar.e = null;
            sreVar.d = 2;
            objC = abwhVar.c(set2, sreVar);
            if (objC != obj) {
                apdpVar2 = apdpVar;
                obj = (java.util.Map) objC;
                apdpVar2.d();
            }
            return obj;
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.srf srfVar;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof defpackage.srf) {
            srfVar = (defpackage.srf) aolnVar;
            int i = srfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                srfVar.c = i - Integer.MIN_VALUE;
            } else {
                srfVar = new defpackage.srf(this, aolnVar);
            }
        } else {
            srfVar = new defpackage.srf(this, aolnVar);
        }
        java.lang.Object obj = srfVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i2 = srfVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.l;
                srfVar.d = apdpVar;
                srfVar.c = 1;
                if (apdpVar.b(srfVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = srfVar.d;
                try {
                    defpackage.aooc.af(obj);
                    obj2 = (java.util.Map) obj;
                    apdpVar2.d();
                    return obj2;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar3 = srfVar.d;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar3;
            defpackage.abwh abwhVar = this.k;
            srfVar.d = apdpVar;
            srfVar.c = 2;
            java.lang.Object objD = abwhVar.d(srfVar);
            if (objD != obj2) {
                defpackage.apdp apdpVar4 = apdpVar;
                obj = objD;
                apdpVar2 = apdpVar4;
                obj2 = (java.util.Map) obj;
                apdpVar2.d();
            }
            return obj2;
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar5 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar5;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007e -> B:24:0x007f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.util.Set r7, defpackage.aoln r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.srl.f(java.util.Set, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[Catch: all -> 0x00c7, TryCatch #0 {all -> 0x00c7, blocks: (B:13:0x0029, B:39:0x00a3, B:41:0x00b1, B:42:0x00bf), top: B:51:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        srj srjVar;
        defpackage.apdp apdpVar;
        defpackage.apdp apdpVar2;
        java.util.Map.Entry entry;
        if (aolnVar instanceof srj) {
            srjVar = (srj) aolnVar;
            int i = srjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                srjVar.d = i - Integer.MIN_VALUE;
            } else {
                srjVar = new srj(this, aolnVar);
            }
        } else {
            srjVar = new srj(this, aolnVar);
        }
        java.lang.Object obj = srjVar.b;
        java.lang.Object objValueOf = defpackage.aolu.a;
        int i2 = srjVar.d;
        boolean z = false;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.l;
                srjVar.e = apdpVar;
                srjVar.a = j;
                srjVar.d = 1;
                if (apdpVar.b(srjVar) != objValueOf) {
                }
                return objValueOf;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = srjVar.e;
                try {
                    defpackage.aooc.af(obj);
                    entry = (java.util.Map.Entry) defpackage.ajsz.bN(((java.util.Map) obj).entrySet());
                    if (entry != null) {
                        this.n.f(entry.getKey(), entry.getValue());
                        z = true;
                    }
                    objValueOf = java.lang.Boolean.valueOf(z);
                    apdpVar2.d();
                    return objValueOf;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            j = srjVar.a;
            defpackage.apdp apdpVar3 = srjVar.e;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar3;
            defpackage.aeza aezaVar = this.n;
            java.util.Collection collectionValues = aezaVar.d().values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (true) {
                    if (it.hasNext()) {
                        srn srnVar = (srn) it.next();
                        if (srnVar != null && srnVar.c > j) {
                            apdpVar2 = apdpVar;
                        }
                    }
                    z = true;
                    objValueOf = java.lang.Boolean.valueOf(z);
                    apdpVar2.d();
                    return objValueOf;
                }
            }
            if (aezaVar.a) {
                apdpVar2 = apdpVar;
                objValueOf = java.lang.Boolean.valueOf(z);
                apdpVar2.d();
            } else {
                defpackage.rsr rsrVarAz = defpackage.rsr.az(defpackage.a.bz(j, "last_modified > "), new java.lang.String[0]);
                java.lang.Integer num = new java.lang.Integer(1);
                srjVar.e = apdpVar;
                srjVar.d = 2;
                java.lang.Object objI = i(rsrVarAz, num, srjVar);
                if (objI != objValueOf) {
                    defpackage.apdp apdpVar4 = apdpVar;
                    obj = objI;
                    apdpVar2 = apdpVar4;
                    entry = (java.util.Map.Entry) defpackage.ajsz.bN(((java.util.Map) obj).entrySet());
                    if (entry != null) {
                        this.n.f(entry.getKey(), entry.getValue());
                        z = true;
                    }
                    objValueOf = java.lang.Boolean.valueOf(z);
                    apdpVar2.d();
                }
            }
            return objValueOf;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        srb srbVar;
        afpl afplVar2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof srb) {
            srbVar = (srb) aolnVar;
            int i = srbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                srbVar.d = i - Integer.MIN_VALUE;
            } else {
                srbVar = new srb(this, aolnVar);
            }
        } else {
            srbVar = new srb(this, aolnVar);
        }
        java.lang.Object objB = srbVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = srbVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                defpackage.apdp apdpVar3 = this.l;
                srbVar.a = afplVar;
                srbVar.e = apdpVar3;
                srbVar.d = 1;
                if (apdpVar3.b(srbVar) == aoluVar) {
                    return aoluVar;
                }
                afplVar2 = afplVar;
                apdpVar = apdpVar3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (defpackage.apdp) srbVar.a;
                    try {
                        defpackage.aooc.af(objB);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objB;
                        apdpVar2.d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdpVar = srbVar.e;
                afplVar2 = (afpl) srbVar.a;
                defpackage.aooc.af(objB);
            }
            defpackage.abwh abwhVar = this.k;
            defpackage.tto ttoVar = this.m;
            srbVar.a = apdpVar;
            srbVar.e = null;
            srbVar.d = 2;
            objB = defpackage.aazc.B(abwhVar, afplVar2, ttoVar, srbVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            apdpVar2 = apdpVar;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objB;
            apdpVar2.d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            defpackage.apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    public final java.lang.Object i(defpackage.rsr rsrVar, java.lang.Integer num, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.srk(this, rsrVar, num, (defpackage.aoln) null, 0), aolnVar);
    }
}
