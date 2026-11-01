package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahll implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ahll(ahlm ahlmVar, ahlv ahlvVar, long j, boolean z, int i) {
        this.$cid = i;
        this.c = ahlmVar;
        this.d = ahlvVar;
        this.a = j;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [aoin, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        akzx akzxVarM;
        java.util.Iterator it;
        ahmo ahmoVar;
        java.lang.Object obj;
        char c = '\b';
        if (this.$cid != 0) {
            if (!this.b) {
                return j$.util.Optional.empty();
            }
            java.lang.Object obj2 = this.c;
            ((kgl) this.d.a()).d(this.a, 8);
            defpackage.pmm pmmVar = new defpackage.pmm();
            pmmVar.e(defpackage.pms.SHARED_DATA);
            android.content.Context context = (android.content.Context) obj2;
            pmmVar.c(hmr.f(context, 2131232010));
            pmmVar.d(2131232010);
            pmmVar.b(context.getString(2132018121));
            return j$.util.Optional.of(pmmVar.a());
        }
        java.lang.Object obj3 = this.c;
        ahlm ahlmVar = (ahlm) obj3;
        ahlmVar.b.writeLock().lock();
        long j = this.a;
        try {
            ahmp ahmpVarA = ahmp.a;
            try {
                ahmpVarA = ((ahlm) obj3).a();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    obj = this.d;
                    if (!zHasNext) {
                        break;
                    }
                    ahmo ahmoVar2 = (ahmo) it.next();
                    char c2 = c;
                    ahmr ahmrVar = ahmoVar2.c;
                    if (ahmrVar == null) {
                        ahmrVar = ahmr.a;
                    }
                    if (((ahlv) obj).equals(new ahlv(ahmrVar))) {
                        ahmoVar = ahmoVar2;
                    } else {
                        akzxVarM.ar(ahmoVar2);
                    }
                    c = c2;
                }
            } catch (java.io.IOException e) {
                if (!((ahlm) obj3).g(e)) {
                    ahlm.a.c().k(e).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 324, "SyncManagerDataStore.java").v("Unable to read or clear store, will not update sync time. Sync may run too frequently.");
                }
            }
            akzxVarM = ahmp.a.m();
            akzxVarM.z(ahmpVarA);
            akzxVarM.u();
            akzxVarM.b.d = albq.a;
            it = ahmpVarA.d.iterator();
            ahmoVar = null;
            if (ahmoVar != null) {
                if (ahmpVarA.c < 0) {
                    long epochMilli = ((ahlm) obj3).e;
                    if (epochMilli < 0) {
                        epochMilli = j$.time.Instant.now().toEpochMilli();
                        ((ahlm) obj3).e = epochMilli;
                    }
                    akzxVarM.u();
                    ahmp ahmpVar = akzxVarM.b;
                    ahmpVar.b |= 1;
                    ahmpVar.c = epochMilli;
                }
                akzx akzxVarM2 = ahmo.a.m();
                ahmr ahmrVar2 = ((ahlv) obj).a;
                akzxVarM2.u();
                ahmo ahmoVar3 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(ahmrVar2);
                ahmoVar3.c = ahmrVar2;
                ahmoVar3.b |= 1;
                akzxVarM2.u();
                ahmo ahmoVar4 = akzxVarM2.b;
                ahmoVar4.b |= 4;
                ahmoVar4.e = j;
                if (this.b) {
                    akzxVarM2.u();
                    ahmo ahmoVar5 = akzxVarM2.b;
                    ahmoVar5.b |= 2;
                    ahmoVar5.d = j;
                    akzxVarM2.u();
                    ahmo ahmoVar6 = akzxVarM2.b;
                    ahmoVar6.b |= 8;
                    ahmoVar6.f = 0;
                } else {
                    long j2 = ahmoVar.d;
                    akzxVarM2.u();
                    ahmo ahmoVar7 = akzxVarM2.b;
                    ahmoVar7.b |= 2;
                    ahmoVar7.d = j2;
                    int i = ahmoVar.f + 1;
                    akzxVarM2.u();
                    ahmo ahmoVar8 = akzxVarM2.b;
                    ahmoVar8.b |= 8;
                    ahmoVar8.f = i;
                }
                akzxVarM.ar(akzxVarM2.p());
                try {
                    ((ahlm) obj3).f(akzxVarM.p());
                } catch (java.io.IOException e2) {
                    ahlm.a.c().k(e2).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateLastSyncTime", 384, "SyncManagerDataStore.java").v("Error writing sync data file after sync. Sync may run too frequently.");
                }
            }
            ahlmVar.b.writeLock().unlock();
            return null;
        } catch (java.lang.Throwable th) {
            ahlmVar.b.writeLock().unlock();
            throw th;
        }
    }

    public /* synthetic */ ahll(boolean z, aoin aoinVar, long j, android.content.Context context, int i) {
        this.$cid = i;
        this.b = z;
        this.d = aoinVar;
        this.a = j;
        this.c = context;
    }
}
