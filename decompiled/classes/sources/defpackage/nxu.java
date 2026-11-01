package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxu implements defpackage.aguq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker");
    public final defpackage.rlv b;
    public final defpackage.aoin c;
    private final defpackage.aoss d;
    private final defpackage.nxg e;
    private final defpackage.nwu f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.olc i;

    public nxu(defpackage.aoss aossVar, defpackage.olc olcVar, defpackage.nxg nxgVar, defpackage.rlv rlvVar, defpackage.nwu nwuVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        defpackage.aooh.f(aossVar, "backgroundScope");
        defpackage.aooh.f(olcVar, "dialerMeetLibrary");
        defpackage.aooh.f(nxgVar, "meetDataRepository");
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aooh.f(nwuVar, "meetCallController");
        this.d = aossVar;
        this.i = olcVar;
        this.e = nxgVar;
        this.b = rlvVar;
        this.f = nwuVar;
        this.g = aoinVar;
        this.h = aoinVar2;
        this.c = aoinVar3;
    }

    @Override // defpackage.agva
    public final /* synthetic */ defpackage.ajcq a(androidx.work.WorkerParameters workerParameters) {
        return defpackage.agab.aX();
    }

    @Override // defpackage.aguq, defpackage.agva
    public final defpackage.ajcq b(androidx.work.WorkerParameters workerParameters) {
        return defpackage.aosv.F(this.d, 0, new defpackage.nto(this, (defpackage.aoln) null, 14, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0151 A[Catch: DeadObjectException -> 0x01d8, TimeoutException -> 0x01fd, TRY_ENTER, TryCatch #2 {DeadObjectException -> 0x01d8, TimeoutException -> 0x01fd, blocks: (B:14:0x0037, B:46:0x0172, B:44:0x0151), top: B:64:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0196  */
    /* JADX WARN: Code duplicated, block: B:52:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    public final java.lang.Object c(defpackage.aoln aolnVar) throws java.lang.Throwable {
        nxt nxtVar;
        defpackage.aigf aigfVar;
        ?? r2;
        defpackage.aigf aigfVar2;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object objAj;
        nwx nwxVar;
        if (aolnVar instanceof nxt) {
            nxtVar = (nxt) aolnVar;
            int i = nxtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nxtVar.d = i - Integer.MIN_VALUE;
            } else {
                nxtVar = new nxt(this, aolnVar);
            }
        } else {
            nxtVar = new nxt(this, aolnVar);
        }
        java.lang.Object objD = nxtVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        try {
            switch (nxtVar.d) {
                case 0:
                    defpackage.aooc.af(objD);
                    ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 72, "MeetReachabilityMiniBatchWorker.kt")).v("Sync the meet reachability for a chunk of phone numbers.");
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_STARTED);
                    defpackage.ajcq ajcqVarB = this.f.b();
                    nxtVar.d = 1;
                    objD = defpackage.aosv.D(ajcqVarB, nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 78, "MeetReachabilityMiniBatchWorker.kt")).v("Bulk reachability API is ineligible to call, skip updating reachabilities.");
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar = this.i;
                    nxtVar.d = 2;
                    objD = olcVar.a(nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (!((defpackage.nwv) objD).equals(defpackage.nwv.AVAILABLE)) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 84, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is unavailable, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_UNAVAILABLE);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar2 = this.i;
                    nxtVar.d = 3;
                    objD = olcVar2.c(nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 92, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is on legacy client, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_LEGACY_MEET_CLIENT);
                        return defpackage.aojh.a;
                    }
                    defpackage.nxg nxgVar = this.e;
                    int iLongValue = (int) ((java.lang.Number) this.g.a()).longValue();
                    java.lang.Object objA = this.h.a();
                    defpackage.aooh.e(objA, "get(...)");
                    long jLongValue = ((java.lang.Number) objA).longValue();
                    nxtVar.d = 4;
                    objD = defpackage.aoov.aj(nxgVar.b, new nxb(nxgVar, iLongValue, jLongValue, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    aigfVar = (defpackage.aigf) objD;
                    if (aigfVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 107, "MeetReachabilityMiniBatchWorker.kt")).v("No valid phone number found, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_EMPTY_NUMBER);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar3 = this.i;
                    java.util.Set setKeySet = aigfVar.keySet();
                    defpackage.aooh.e(setKeySet, "<get-keys>(...)");
                    java.util.List listBZ = defpackage.ajsz.bZ(setKeySet);
                    nxtVar.a = aigfVar;
                    nxtVar.d = 5;
                    objD = defpackage.aoov.aj(olcVar3.d, new ola(olcVar3, listBZ, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        r2 = aigfVar;
                        return aoluVar;
                    }
                    r2 = aigfVar;
                    aigfVar2 = (defpackage.aigf) objD;
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_QUERY_COMPLETED);
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r2.size()));
                    for (java.util.Map.Entry entry : r2.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        nwxVar = (nwx) aigfVar2.get(entry.getKey());
                        if (nwxVar == null) {
                            nwxVar = (nwx) entry.getValue();
                        }
                        linkedHashMap.put(key, nwxVar);
                    }
                    defpackage.aigf aigfVarBw = defpackage.ahvr.bw(linkedHashMap);
                    defpackage.nxg nxgVar2 = this.e;
                    nxtVar.a = null;
                    nxtVar.d = 6;
                    objAj = defpackage.aoov.aj(nxgVar2.b, new iki(nxgVar2, aigfVarBw, (defpackage.aoln) null, 6), nxtVar);
                    if (objAj != defpackage.aolu.a) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    return defpackage.aojh.a;
                case 1:
                    defpackage.aooc.af(objD);
                    if (!((java.lang.Boolean) objD).booleanValue()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 78, "MeetReachabilityMiniBatchWorker.kt")).v("Bulk reachability API is ineligible to call, skip updating reachabilities.");
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar4 = this.i;
                    nxtVar.d = 2;
                    objD = olcVar4.a(nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (!((defpackage.nwv) objD).equals(defpackage.nwv.AVAILABLE)) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 84, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is unavailable, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_UNAVAILABLE);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar5 = this.i;
                    nxtVar.d = 3;
                    objD = olcVar5.c(nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 92, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is on legacy client, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_LEGACY_MEET_CLIENT);
                        return defpackage.aojh.a;
                    }
                    defpackage.nxg nxgVar3 = this.e;
                    int iLongValue2 = (int) ((java.lang.Number) this.g.a()).longValue();
                    java.lang.Object objA2 = this.h.a();
                    defpackage.aooh.e(objA2, "get(...)");
                    long jLongValue2 = ((java.lang.Number) objA2).longValue();
                    nxtVar.d = 4;
                    objD = defpackage.aoov.aj(nxgVar3.b, new nxb(nxgVar3, iLongValue2, jLongValue2, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    aigfVar = (defpackage.aigf) objD;
                    if (aigfVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 107, "MeetReachabilityMiniBatchWorker.kt")).v("No valid phone number found, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_EMPTY_NUMBER);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar6 = this.i;
                    java.util.Set setKeySet2 = aigfVar.keySet();
                    defpackage.aooh.e(setKeySet2, "<get-keys>(...)");
                    java.util.List listBZ2 = defpackage.ajsz.bZ(setKeySet2);
                    nxtVar.a = aigfVar;
                    nxtVar.d = 5;
                    objD = defpackage.aoov.aj(olcVar6.d, new ola(olcVar6, listBZ2, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        r2 = aigfVar;
                        return aoluVar;
                    }
                    r2 = aigfVar;
                    aigfVar2 = (defpackage.aigf) objD;
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_QUERY_COMPLETED);
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r2.size()));
                    while (r2.hasNext()) {
                        java.lang.Object key2 = entry.getKey();
                        nwxVar = (nwx) aigfVar2.get(entry.getKey());
                        if (nwxVar == null) {
                            nwxVar = (nwx) entry.getValue();
                        }
                        linkedHashMap.put(key2, nwxVar);
                    }
                    defpackage.aigf aigfVarBw2 = defpackage.ahvr.bw(linkedHashMap);
                    defpackage.nxg nxgVar4 = this.e;
                    nxtVar.a = null;
                    nxtVar.d = 6;
                    objAj = defpackage.aoov.aj(nxgVar4.b, new iki(nxgVar4, aigfVarBw2, (defpackage.aoln) null, 6), nxtVar);
                    if (objAj != defpackage.aolu.a) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    return defpackage.aojh.a;
                case 2:
                    defpackage.aooc.af(objD);
                    if (!((defpackage.nwv) objD).equals(defpackage.nwv.AVAILABLE)) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 84, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is unavailable, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_UNAVAILABLE);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar7 = this.i;
                    nxtVar.d = 3;
                    objD = olcVar7.c(nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 92, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is on legacy client, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_LEGACY_MEET_CLIENT);
                        return defpackage.aojh.a;
                    }
                    defpackage.nxg nxgVar5 = this.e;
                    int iLongValue3 = (int) ((java.lang.Number) this.g.a()).longValue();
                    java.lang.Object objA3 = this.h.a();
                    defpackage.aooh.e(objA3, "get(...)");
                    long jLongValue3 = ((java.lang.Number) objA3).longValue();
                    nxtVar.d = 4;
                    objD = defpackage.aoov.aj(nxgVar5.b, new nxb(nxgVar5, iLongValue3, jLongValue3, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    aigfVar = (defpackage.aigf) objD;
                    if (aigfVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 107, "MeetReachabilityMiniBatchWorker.kt")).v("No valid phone number found, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_EMPTY_NUMBER);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar8 = this.i;
                    java.util.Set setKeySet3 = aigfVar.keySet();
                    defpackage.aooh.e(setKeySet3, "<get-keys>(...)");
                    java.util.List listBZ3 = defpackage.ajsz.bZ(setKeySet3);
                    nxtVar.a = aigfVar;
                    nxtVar.d = 5;
                    objD = defpackage.aoov.aj(olcVar8.d, new ola(olcVar8, listBZ3, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        r2 = aigfVar;
                        return aoluVar;
                    }
                    r2 = aigfVar;
                    aigfVar2 = (defpackage.aigf) objD;
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_QUERY_COMPLETED);
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r2.size()));
                    while (r2.hasNext()) {
                        java.lang.Object key3 = entry.getKey();
                        nwxVar = (nwx) aigfVar2.get(entry.getKey());
                        if (nwxVar == null) {
                            nwxVar = (nwx) entry.getValue();
                        }
                        linkedHashMap.put(key3, nwxVar);
                    }
                    defpackage.aigf aigfVarBw3 = defpackage.ahvr.bw(linkedHashMap);
                    defpackage.nxg nxgVar6 = this.e;
                    nxtVar.a = null;
                    nxtVar.d = 6;
                    objAj = defpackage.aoov.aj(nxgVar6.b, new iki(nxgVar6, aigfVarBw3, (defpackage.aoln) null, 6), nxtVar);
                    if (objAj != defpackage.aolu.a) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    return defpackage.aojh.a;
                case 3:
                    defpackage.aooc.af(objD);
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 92, "MeetReachabilityMiniBatchWorker.kt")).v("Meet is on legacy client, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_LEGACY_MEET_CLIENT);
                        return defpackage.aojh.a;
                    }
                    defpackage.nxg nxgVar7 = this.e;
                    int iLongValue4 = (int) ((java.lang.Number) this.g.a()).longValue();
                    java.lang.Object objA4 = this.h.a();
                    defpackage.aooh.e(objA4, "get(...)");
                    long jLongValue4 = ((java.lang.Number) objA4).longValue();
                    nxtVar.d = 4;
                    objD = defpackage.aoov.aj(nxgVar7.b, new nxb(nxgVar7, iLongValue4, jLongValue4, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                    aigfVar = (defpackage.aigf) objD;
                    if (aigfVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 107, "MeetReachabilityMiniBatchWorker.kt")).v("No valid phone number found, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_EMPTY_NUMBER);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar9 = this.i;
                    java.util.Set setKeySet4 = aigfVar.keySet();
                    defpackage.aooh.e(setKeySet4, "<get-keys>(...)");
                    java.util.List listBZ4 = defpackage.ajsz.bZ(setKeySet4);
                    nxtVar.a = aigfVar;
                    nxtVar.d = 5;
                    objD = defpackage.aoov.aj(olcVar9.d, new ola(olcVar9, listBZ4, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        r2 = aigfVar;
                        return aoluVar;
                    }
                    r2 = aigfVar;
                    aigfVar2 = (defpackage.aigf) objD;
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_QUERY_COMPLETED);
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r2.size()));
                    while (r2.hasNext()) {
                        java.lang.Object key4 = entry.getKey();
                        nwxVar = (nwx) aigfVar2.get(entry.getKey());
                        if (nwxVar == null) {
                            nwxVar = (nwx) entry.getValue();
                        }
                        linkedHashMap.put(key4, nwxVar);
                    }
                    defpackage.aigf aigfVarBw4 = defpackage.ahvr.bw(linkedHashMap);
                    defpackage.nxg nxgVar8 = this.e;
                    nxtVar.a = null;
                    nxtVar.d = 6;
                    objAj = defpackage.aoov.aj(nxgVar8.b, new iki(nxgVar8, aigfVarBw4, (defpackage.aoln) null, 6), nxtVar);
                    if (objAj != defpackage.aolu.a) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    return defpackage.aojh.a;
                case 4:
                    defpackage.aooc.af(objD);
                    aigfVar = (defpackage.aigf) objD;
                    if (aigfVar.isEmpty()) {
                        ((defpackage.aimw) a.b().l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 107, "MeetReachabilityMiniBatchWorker.kt")).v("No valid phone number found, skip updating reachabilities");
                        this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_EMPTY_NUMBER);
                        return defpackage.aojh.a;
                    }
                    defpackage.olc olcVar10 = this.i;
                    java.util.Set setKeySet5 = aigfVar.keySet();
                    defpackage.aooh.e(setKeySet5, "<get-keys>(...)");
                    java.util.List listBZ5 = defpackage.ajsz.bZ(setKeySet5);
                    nxtVar.a = aigfVar;
                    nxtVar.d = 5;
                    objD = defpackage.aoov.aj(olcVar10.d, new ola(olcVar10, listBZ5, (defpackage.aoln) null), nxtVar);
                    if (objD == aoluVar) {
                        r2 = aigfVar;
                        return aoluVar;
                    }
                    r2 = aigfVar;
                    aigfVar2 = (defpackage.aigf) objD;
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_QUERY_COMPLETED);
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r2.size()));
                    while (r2.hasNext()) {
                        java.lang.Object key5 = entry.getKey();
                        nwxVar = (nwx) aigfVar2.get(entry.getKey());
                        if (nwxVar == null) {
                            nwxVar = (nwx) entry.getValue();
                        }
                        linkedHashMap.put(key5, nwxVar);
                    }
                    defpackage.aigf aigfVarBw5 = defpackage.ahvr.bw(linkedHashMap);
                    defpackage.nxg nxgVar9 = this.e;
                    nxtVar.a = null;
                    nxtVar.d = 6;
                    objAj = defpackage.aoov.aj(nxgVar9.b, new iki(nxgVar9, aigfVarBw5, (defpackage.aoln) null, 6), nxtVar);
                    if (objAj != defpackage.aolu.a) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    return defpackage.aojh.a;
                case 5:
                    java.lang.Object obj = nxtVar.a;
                    defpackage.aooc.af(objD);
                    r2 = obj;
                    r2 = aigfVar;
                    aigfVar2 = (defpackage.aigf) objD;
                    this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_QUERY_COMPLETED);
                    linkedHashMap = new java.util.LinkedHashMap(defpackage.ajsz.aL(r2.size()));
                    while (r2.hasNext()) {
                        java.lang.Object key6 = entry.getKey();
                        nwxVar = (nwx) aigfVar2.get(entry.getKey());
                        if (nwxVar == null) {
                            nwxVar = (nwx) entry.getValue();
                        }
                        linkedHashMap.put(key6, nwxVar);
                    }
                    defpackage.aigf aigfVarBw6 = defpackage.ahvr.bw(linkedHashMap);
                    defpackage.nxg nxgVar10 = this.e;
                    nxtVar.a = null;
                    nxtVar.d = 6;
                    objAj = defpackage.aoov.aj(nxgVar10.b, new iki(nxgVar10, aigfVarBw6, (defpackage.aoln) null, 6), nxtVar);
                    if (objAj != defpackage.aolu.a) {
                        objAj = defpackage.aojh.a;
                    }
                    if (objAj == aoluVar) {
                        return aoluVar;
                    }
                    return defpackage.aojh.a;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    defpackage.aooc.af(objD);
                    return defpackage.aojh.a;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (android.os.DeadObjectException e) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e).l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 129, "MeetReachabilityMiniBatchWorker.kt")).v("failed to get Meet reachabilities due to dead object exception");
            this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_DEAD_OBJECT_EXCEPTION);
            return defpackage.aojh.a;
        } catch (java.util.concurrent.TimeoutException e2) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e2).l("com/android/dialer/duo/data/synclet/MeetReachabilityMiniBatchWorker", "startWorkInternal", 120, "MeetReachabilityMiniBatchWorker.kt")).v("failed to get Meet reachabilities due to remote timeout");
            this.b.o(defpackage.rmx.MEET_REACHABILITY_SYNC_FAILED_TIMEOUT);
            return defpackage.aojh.a;
        }
    }

    @Override // defpackage.agva
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.agva
    public final /* synthetic */ void h(java.util.function.Supplier supplier) {
    }
}
