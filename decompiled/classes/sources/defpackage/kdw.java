package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kdw {
    public final android.content.Context c;
    public final defpackage.aolr d;
    public final defpackage.aoss e;
    public final defpackage.kdx f;
    public java.util.Map g;
    public java.util.Map h;
    public final defpackage.zzx j;
    private final defpackage.abwh l;
    private final defpackage.kdu m;
    private final defpackage.apdp n;
    public static final defpackage.kcq i = new defpackage.kcq();
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/database/AnnotatedCallLogDataRepository");
    private static final java.util.Comparator k = new defpackage.agl(4);
    public static final java.lang.String[] b = {"_id", "timestamp", "number", "raw_number", "formatted_number", "presentation", "is_read", "new", "geocoded_location", "phone_account_component_name", "phone_account_id", "features", "number_attributes", "is_voicemail_call", "voicemail_call_tag", "call_type", "data_usage", "duration", "call_mapping_id", "spam_status", "atlas_call_details", "call_screen_details", "call_recording_details", "fides_details", "calling_networks_attributes", "xatu_call_details", "dobby_calllog_details", "uuid", "name", "lookup_uri"};

    public kdw(android.content.Context context, defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.kdx kdxVar, defpackage.zzx zzxVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("backgroundContext");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (kdxVar == null) {
            defpackage.aooh.i("databaseHelper");
        }
        this.c = context;
        this.d = aolrVar;
        this.e = aossVar;
        this.f = kdxVar;
        this.j = zzxVar;
        this.n = new defpackage.apdp();
        this.l = new defpackage.abwh(new defpackage.kdt(this), new defpackage.aeza());
        this.m = new defpackage.kdu(this, 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.List list, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.kdi kdiVar;
        java.util.List list2;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof defpackage.kdi) {
            kdiVar = (defpackage.kdi) aolnVar;
            int i2 = kdiVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdiVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kdiVar = new defpackage.kdi(this, aolnVar);
            }
        } else {
            kdiVar = new defpackage.kdi(this, aolnVar);
        }
        java.lang.Object objAj = kdiVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = kdiVar.d;
        try {
            if (i3 == 0) {
                defpackage.aooc.af(objAj);
                defpackage.apdp apdpVar3 = this.n;
                kdiVar.a = list;
                kdiVar.e = apdpVar3;
                kdiVar.d = 1;
                if (apdpVar3.b(kdiVar) == aoluVar) {
                    return aoluVar;
                }
                list2 = list;
                apdpVar = apdpVar3;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = (defpackage.apdp) kdiVar.a;
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
                apdpVar = kdiVar.e;
                list2 = (java.util.List) kdiVar.a;
                defpackage.aooc.af(objAj);
            }
            defpackage.abwh abwhVar = this.l;
            defpackage.kdu kduVar = this.m;
            kdiVar.a = apdpVar;
            kdiVar.e = null;
            kdiVar.d = 2;
            objAj = defpackage.aoov.aj(defpackage.aour.a, new defpackage.abwq(list2, abwhVar, kduVar, null), kdiVar);
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
    public final java.lang.Object b(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.kdj kdjVar;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof defpackage.kdj) {
            kdjVar = (defpackage.kdj) aolnVar;
            int i2 = kdjVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdjVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kdjVar = new defpackage.kdj(this, aolnVar);
            }
        } else {
            kdjVar = new defpackage.kdj(this, aolnVar);
        }
        java.lang.Object obj = kdjVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i3 = kdjVar.c;
        try {
            if (i3 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.n;
                kdjVar.d = apdpVar;
                kdjVar.c = 1;
                if (apdpVar.b(kdjVar) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = kdjVar.d;
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
            defpackage.apdp apdpVar3 = kdjVar.d;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar3;
            kdjVar.d = apdpVar;
            kdjVar.c = 2;
            java.lang.Object objH = h(kdjVar);
            if (objH != obj2) {
                defpackage.apdp apdpVar4 = apdpVar;
                obj = objH;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.kdk kdkVar;
        defpackage.apdp apdpVar;
        java.lang.Throwable th;
        defpackage.apdp apdpVar2;
        if (aolnVar instanceof defpackage.kdk) {
            kdkVar = (defpackage.kdk) aolnVar;
            int i2 = kdkVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdkVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kdkVar = new defpackage.kdk(this, aolnVar);
            }
        } else {
            kdkVar = new defpackage.kdk(this, aolnVar);
        }
        java.lang.Object obj = kdkVar.a;
        java.lang.Object obj2 = defpackage.aolu.a;
        int i3 = kdkVar.c;
        try {
            if (i3 == 0) {
                defpackage.aooc.af(obj);
                apdpVar = this.n;
                kdkVar.d = apdpVar;
                kdkVar.c = 1;
                if (apdpVar.b(kdkVar) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = kdkVar.d;
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
            defpackage.apdp apdpVar3 = kdkVar.d;
            defpackage.aooc.af(obj);
            apdpVar = apdpVar3;
            kdkVar.d = apdpVar;
            kdkVar.c = 2;
            java.lang.Object objI = i(kdkVar);
            if (objI != obj2) {
                defpackage.apdp apdpVar4 = apdpVar;
                obj = objI;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final java.lang.Object d(java.util.Set set, defpackage.aoln aolnVar) throws java.lang.Throwable {
        kdl kdlVar;
        ?? r5;
        if (aolnVar instanceof kdl) {
            kdlVar = (kdl) aolnVar;
            int i2 = kdlVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdlVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kdlVar = new kdl(this, aolnVar);
            }
        } else {
            kdlVar = new kdl(this, aolnVar);
        }
        java.lang.Object objB = kdlVar.b;
        ?? linkedHashMap = defpackage.aolu.a;
        int i3 = kdlVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objB);
            kdlVar.a = set;
            kdlVar.d = 1;
            objB = b(kdlVar);
            if (objB != linkedHashMap) {
            }
            r5 = set;
            return linkedHashMap;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = kdlVar.a;
        defpackage.aooc.af(objB);
        r5 = obj;
        r5 = set;
        linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.Map) objB).entrySet()) {
            if (r5.contains(new java.lang.Long(((java.lang.Number) entry.getKey()).longValue()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        r5 = set;
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(long j, defpackage.aoln aolnVar) throws java.lang.Throwable {
        kdm kdmVar;
        if (aolnVar instanceof kdm) {
            kdmVar = (kdm) aolnVar;
            int i2 = kdmVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdmVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kdmVar = new kdm(this, aolnVar);
            }
        } else {
            kdmVar = new kdm(this, aolnVar);
        }
        java.lang.Object objC = kdmVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = kdmVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objC);
            kdmVar.a = j;
            kdmVar.d = 1;
            objC = c(kdmVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = kdmVar.a;
            defpackage.aooc.af(objC);
        }
        return ((java.util.Map) objC).get(new java.lang.Long(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [aolu] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kdw] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public final java.lang.Object f(java.util.Set set, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.kdn kdnVar;
        ?? r5;
        if (aolnVar instanceof defpackage.kdn) {
            kdnVar = (defpackage.kdn) aolnVar;
            int i2 = kdnVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdnVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kdnVar = new defpackage.kdn(this, aolnVar);
            }
        } else {
            kdnVar = new defpackage.kdn(this, aolnVar);
        }
        java.lang.Object objC = kdnVar.b;
        ?? linkedHashMap = defpackage.aolu.a;
        int i3 = kdnVar.d;
        if (i3 == 0) {
            defpackage.aooc.af(objC);
            kdnVar.a = set;
            kdnVar.d = 1;
            objC = c(kdnVar);
            if (objC != linkedHashMap) {
            }
            r5 = set;
            return linkedHashMap;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        java.lang.Object obj = kdnVar.a;
        defpackage.aooc.af(objC);
        r5 = obj;
        r5 = set;
        linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : ((java.util.Map) objC).entrySet()) {
            if (r5.contains(new java.lang.Long(((java.lang.Number) entry.getKey()).longValue()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        r5 = set;
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:24:0x007e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(java.util.Set r7, defpackage.aoln r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdw.g(java.util.Set, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        defpackage.kdp kdpVar;
        if (aolnVar instanceof defpackage.kdp) {
            kdpVar = (defpackage.kdp) aolnVar;
            int i2 = kdpVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdpVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kdpVar = new defpackage.kdp(this, aolnVar);
            }
        } else {
            kdpVar = new defpackage.kdp(this, aolnVar);
        }
        java.lang.Object objD = kdpVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = kdpVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objD);
            java.util.Map map = this.g;
            if (map != null) {
                return map;
            }
            defpackage.abwh abwhVar = this.l;
            kdpVar.c = 1;
            objD = abwhVar.d(kdpVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objD);
        }
        java.util.List listBX = defpackage.ajsz.bX(((java.util.Map) objD).values(), k);
        int iAL = defpackage.ajsz.aL(defpackage.ajsz.bl(listBX, 10));
        if (iAL < 16) {
            iAL = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL);
        for (java.lang.Object obj : listBX) {
            linkedHashMap.put(new java.lang.Long(((kdy) obj).a), obj);
        }
        this.g = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.aoln aolnVar) {
        defpackage.kdq kdqVar;
        if (aolnVar instanceof defpackage.kdq) {
            kdqVar = (defpackage.kdq) aolnVar;
            int i2 = kdqVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdqVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kdqVar = new defpackage.kdq(this, aolnVar);
            }
        } else {
            kdqVar = new defpackage.kdq(this, aolnVar);
        }
        java.lang.Object objH = kdqVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i3 = kdqVar.c;
        if (i3 == 0) {
            defpackage.aooc.af(objH);
            java.util.Map map = this.h;
            if (map != null) {
                return map;
            }
            kdqVar.c = 1;
            objH = h(kdqVar);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objH);
        }
        java.util.Collection<kdy> collectionValues = ((java.util.Map) objH).values();
        defpackage.aola aolaVar = new defpackage.aola(collectionValues.size());
        for (kdy kdyVar : collectionValues) {
            j$.util.Map.-EL.putIfAbsent(aolaVar, new java.lang.Long(kdyVar.b), kdyVar);
        }
        java.util.Map mapE = aolaVar.e();
        this.h = mapE;
        return mapE;
    }

    public final java.lang.Object j(defpackage.rsr rsrVar, defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.d, new defpackage.kdv(this, rsrVar, null), aolnVar);
    }
}
