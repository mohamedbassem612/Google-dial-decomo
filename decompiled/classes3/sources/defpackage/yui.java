package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yui {
    public static final aimz a = aimz.i("com/google/android/callcoreshared/aicore/session/impl/AiCoreRequestCoordinator");
    public static final aiue b = aiue.c(j$.time.Duration.ofSeconds(5), 2.0d, 3);
    public static final long c;
    public final aoss d;
    public final aoss e;
    public final ahzp f;
    public final j$.util.concurrent.ConcurrentHashMap g;
    public final defpackage.ysu h;
    public final zzx i;
    public final ahda j;
    private final java.util.Map k;
    private final j$.util.concurrent.ConcurrentHashMap l;

    static {
        long j = aorh.a;
        c = aooh.A(45, aorj.d);
    }

    public yui(defpackage.ysu ysuVar, aoss aossVar, aoss aossVar2, ahzp ahzpVar, java.util.Map map, zzx zzxVar) {
        aooh.f(ysuVar, "aiCoreClient");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(aossVar2, "lightweightScope");
        this.h = ysuVar;
        this.d = aossVar;
        this.e = aossVar2;
        this.f = ahzpVar;
        this.k = map;
        this.i = zzxVar;
        this.g = new j$.util.concurrent.ConcurrentHashMap();
        this.j = new ahda((byte[]) null);
        this.l = new j$.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object a(defpackage.yts ytsVar, aoln aolnVar) {
        defpackage.yub yubVar;
        defpackage.uyg uygVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.yub) {
            yubVar = (defpackage.yub) aolnVar;
            int i = yubVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yubVar.c = i - Integer.MIN_VALUE;
            } else {
                yubVar = new defpackage.yub(this, aolnVar);
            }
        } else {
            yubVar = new defpackage.yub(this, aolnVar);
        }
        java.lang.Object obj2 = yubVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yubVar.c;
        if (i2 == 0) {
            aooc.af(obj2);
            defpackage.uyg uygVar2 = (defpackage.uyg) this.l.get(ytsVar);
            if (uygVar2 == null) {
                return aokc.a;
            }
            yubVar.e = uygVar2;
            java.lang.Object obj3 = uygVar2.a;
            apdp apdpVar = (apdp) obj3;
            yubVar.d = apdpVar;
            yubVar.c = 1;
            if (apdpVar.b(yubVar) == aoluVar) {
                return aoluVar;
            }
            uygVar = uygVar2;
            obj = obj3;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = yubVar.d;
            uygVar = yubVar.e;
            aooc.af(obj2);
        }
        try {
            ?? r8 = uygVar.b;
            java.util.ArrayList<java.util.UUID> arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r8, 10));
            java.util.Iterator it = r8.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.yua) it.next()).a);
            }
            ((apdp) obj).d();
            aokv aokvVar = new aokv(10);
            for (java.util.UUID uuid : arrayList) {
                aoub aoubVar = (aoub) this.g.get(uuid);
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                    aokvVar.add(aoubVar);
                    a.b().l("com/google/android/callcoreshared/aicore/session/impl/AiCoreRequestCoordinator", "cancelJobsForFeature$<anonymous>", 396, "AiCoreRequestCoordinator.kt").y("Cancellation initiated for request %s", uuid);
                }
            }
            return ajsz.aX(aokvVar);
        } catch (java.lang.Throwable th) {
            ((apdp) obj).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object b(defpackage.yts ytsVar, java.lang.Object obj, aowv aowvVar, defpackage.ymj ymjVar, defpackage.ymk ymkVar, aoln aolnVar) {
        defpackage.yue yueVar;
        defpackage.uyg uygVar;
        defpackage.yua yuaVar;
        java.util.UUID uuid;
        java.lang.Object obj2;
        java.lang.Object objPutIfAbsent;
        java.lang.Object obj3;
        aoub aoubVar;
        if (aolnVar instanceof defpackage.yue) {
            yueVar = (defpackage.yue) aolnVar;
            int i = yueVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yueVar.d = i - Integer.MIN_VALUE;
            } else {
                yueVar = new defpackage.yue(this, aolnVar);
            }
        } else {
            yueVar = new defpackage.yue(this, aolnVar);
        }
        defpackage.yue yueVar2 = yueVar;
        java.lang.Object obj4 = yueVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = yueVar2.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    java.lang.Object obj5 = yueVar2.a;
                    defpackage.yua yuaVar2 = yueVar2.f;
                    defpackage.uyg uygVar2 = yueVar2.h;
                    java.util.UUID uuid2 = yueVar2.e;
                    aooc.af(obj4);
                    uuid = uuid2;
                    uygVar = uygVar2;
                    yuaVar = yuaVar2;
                    obj2 = obj5;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj3 = yueVar2.g;
                    java.lang.Object obj6 = yueVar2.a;
                    yuaVar = yueVar2.f;
                    uygVar = yueVar2.h;
                    uuid = yueVar2.e;
                    aooc.af(obj4);
                    aoubVar = obj6;
                }
                uygVar.b.add(yuaVar);
                ((apdp) obj3).d();
                java.util.UUID uuid3 = uuid;
                aoubVar.p(new mkm(this, uuid3, uygVar, 9, (byte[]) null));
                aooh.c(uuid3);
                return uuid3;
            }
            aooc.af(obj4);
            java.util.Map map = this.k;
            int i3 = ymkVar.c;
            java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
            aoin aoinVar = (aoin) map.get(new java.lang.Integer(i3));
            if (aoinVar == null) {
                throw new java.lang.IllegalArgumentException(a.bj(i3, "No AiCoreFeatureProcessor bound for "));
            }
            java.lang.Object objA = aoinVar.a();
            aooh.d(objA, "null cannot be cast to non-null type com.google.android.callcoreshared.aicore.session.impl.AiCoreFeatureProcessor<RequestT of com.google.android.callcoreshared.aicore.session.impl.AiCoreRequestCoordinator.runInference, ResultT of com.google.android.callcoreshared.aicore.session.impl.AiCoreRequestCoordinator.runInference>");
            defpackage.ytz ytzVar = (defpackage.ytz) objA;
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.l;
            java.lang.Object uygVar3 = concurrentHashMap.get(ytsVar);
            if (uygVar3 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(ytsVar, (uygVar3 = new defpackage.uyg((char[]) null)))) != null) {
                uygVar3 = objPutIfAbsent;
            }
            defpackage.uyg uygVar4 = (defpackage.uyg) uygVar3;
            aooh.c(uuidRandomUUID);
            defpackage.yua yuaVar3 = new defpackage.yua(uuidRandomUUID);
            aoub aoubVarAn = aoov.an(this.d, (aolr) null, 0, new defpackage.yuh(this, aowvVar, uygVar4, ytsVar, obj, ytzVar, ymjVar, yuaVar3, null), 3);
            this.g.put(uuidRandomUUID, aoubVarAn);
            yueVar2.e = uuidRandomUUID;
            yueVar2.h = uygVar4;
            yueVar2.f = yuaVar3;
            yueVar2.a = aoubVarAn;
            yueVar2.d = 1;
            if (c(uygVar4, ytsVar, yueVar2) == aoluVar) {
                return aoluVar;
            }
            uygVar = uygVar4;
            yuaVar = yuaVar3;
            uuid = uuidRandomUUID;
            obj2 = aoubVarAn;
            uygVar.b.add(yuaVar);
            ((apdp) obj3).d();
            java.util.UUID uuid4 = uuid;
            aoubVar.p(new mkm(this, uuid4, uygVar, 9, (byte[]) null));
            aooh.c(uuid4);
            return uuid4;
        } catch (java.lang.Throwable th) {
            ((apdp) obj3).d();
            throw th;
        }
        yueVar2.e = uuid;
        yueVar2.h = uygVar;
        yueVar2.f = yuaVar;
        yueVar2.a = obj2;
        obj3 = uygVar.a;
        apdp apdpVar = (apdp) obj3;
        yueVar2.g = apdpVar;
        yueVar2.d = 2;
        aoubVar = obj2;
        if (apdpVar.b(yueVar2) == aoluVar) {
            return aoluVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object c(defpackage.uyg uygVar, defpackage.yts ytsVar, aoln aolnVar) {
        defpackage.yuc yucVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.yuc) {
            yucVar = (defpackage.yuc) aolnVar;
            int i = yucVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yucVar.c = i - Integer.MIN_VALUE;
            } else {
                yucVar = new defpackage.yuc(this, aolnVar);
            }
        } else {
            yucVar = new defpackage.yuc(this, aolnVar);
        }
        java.lang.Object obj2 = yucVar.a;
        aolu aoluVar = aolu.a;
        int i2 = yucVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                if (ytsVar.c == 3) {
                    obj = uygVar.a;
                    yucVar.f = uygVar;
                    yucVar.d = ytsVar;
                    apdp apdpVar = (apdp) obj;
                    yucVar.e = apdpVar;
                    yucVar.c = 1;
                    if (apdpVar.b(yucVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = yucVar.e;
            ytsVar = yucVar.d;
            defpackage.uyg uygVar2 = yucVar.f;
            aooc.af(obj2);
            obj = apdpVar2;
            uygVar = uygVar2;
            ?? r7 = uygVar.b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : r7) {
                if (!((defpackage.yua) obj3).b) {
                    arrayList.add(obj3);
                }
            }
            java.util.ArrayList<java.util.UUID> arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((defpackage.yua) it.next()).a);
            }
            ((apdp) obj).d();
            for (java.util.UUID uuid : arrayList2) {
                aoub aoubVar = (aoub) this.g.get(uuid);
                if (aoubVar != null) {
                    a.b().l("com/google/android/callcoreshared/aicore/session/impl/AiCoreRequestCoordinator", "cancelQueuedJobsForFeature", 303, "AiCoreRequestCoordinator.kt").I("Cancelling queued request %s for feature %s", uuid, ytsVar.a);
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            ((apdp) obj).d();
            throw th;
        }
    }
}
