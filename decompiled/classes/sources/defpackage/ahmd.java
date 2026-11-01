package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahmd implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahmd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [ajcq, java.lang.Object] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String str;
        defpackage.ahmd ahmdVar = this;
        if (ahmdVar.$cid != 0) {
            return ahmdVar.a;
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = map.entrySet().iterator();
        while (true) {
            obj2 = ahmdVar.a;
            if (!it.hasNext()) {
                break;
            }
            defpackage.ahlw ahlwVar = (defpackage.ahlw) ((java.util.Map.Entry) it.next()).getValue();
            defpackage.ipc ipcVar = new defpackage.ipc((char[]) null);
            defpackage.grn grnVarA = defpackage.ahme.a(ahlwVar.a);
            defpackage.ahme ahmeVar = (defpackage.ahme) obj2;
            defpackage.ahmk ahmkVar = ahmeVar.f;
            long j = ahlwVar.b;
            j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(j);
            java.util.Iterator it2 = ((java.util.Set) ahmkVar.c.a()).iterator();
            while (it2.hasNext()) {
                try {
                    if (((akxm) it2.next()).b()) {
                        long epochMilli = j$.time.Instant.now().toEpochMilli();
                        ipcVar.w("scheduled_execution_time_epoch_millis", instantOfEpochMilli.toEpochMilli());
                        ipcVar.w("worker_enqueue_time_epoch_millis", epochMilli);
                    }
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.ahmk.a.c()).k(e)).l("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl", "reportWorkerScheduled", (char) 130, "SyncMonitoringDispatcherImpl.java")).v("SyncWorkerMonitor failed during onWorkerSchedule.");
                }
            }
            defpackage.agux aguxVar = new defpackage.agux(((java.lang.Long) ((defpackage.ahys) ahmeVar.e).a).longValue(), java.util.concurrent.TimeUnit.HOURS);
            defpackage.ahbz ahbzVar = ahmeVar.g;
            java.lang.String strC = defpackage.ahme.c(grnVarA, ahmeVar.b());
            defpackage.ahyn ahynVarB = ahmeVar.b();
            java.lang.Boolean.FALSE.booleanValue();
            defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.ahmc.class);
            aguvVarA.e = defpackage.ahyn.h(java.lang.Long.valueOf(j));
            aguvVarA.d(new defpackage.aguw(aguxVar, defpackage.ahwt.a));
            aguvVarA.f(new defpackage.aguy(strC, 3));
            aguvVarA.b(grnVarA);
            java.lang.String strC2 = defpackage.ahmc.c(ahynVarB);
            if (grnVarA.d) {
                defpackage.gsi gsiVar = grnVarA.b;
                if (gsiVar == defpackage.gsi.c) {
                    str = "charger_unmetered";
                } else {
                    str = gsiVar == defpackage.gsi.b ? "charger_connected" : "charger";
                }
            } else {
                defpackage.gsi gsiVar2 = grnVarA.b;
                if (gsiVar2 == defpackage.gsi.c) {
                    str = "unmetered";
                } else {
                    str = gsiVar2 == defpackage.gsi.b ? "connected" : "none";
                }
            }
            aguvVarA.e(defpackage.aihd.r(strC2, "sync_constraint:".concat(str)));
            aguvVarA.f = ipcVar.q();
            arrayList.add(defpackage.ajan.f(ahbzVar.i(aguvVarA.a()), defpackage.ahqx.a(new defpackage.ahbx(ahlwVar, 11)), defpackage.ajbm.INSTANCE));
            ahmdVar = this;
        }
        java.util.Set setKeySet = map.keySet();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            hashSet.add(defpackage.ahme.a((java.util.Set) it3.next()));
        }
        defpackage.ahme ahmeVar2 = (defpackage.ahme) obj2;
        arrayList.add(defpackage.ajan.g(ahmeVar2.g.j(defpackage.ahmc.c(ahmeVar2.b())), defpackage.ahqx.c(new defpackage.adpx(obj2, hashSet, 12)), ahmeVar2.c));
        return defpackage.aiql.aa(arrayList).b(defpackage.ahqx.i(new defpackage.kve(9)), defpackage.ajbm.INSTANCE);
    }
}
