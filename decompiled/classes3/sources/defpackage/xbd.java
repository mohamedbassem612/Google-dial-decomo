package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xbd implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ xbd(java.lang.Object obj, long j, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.xbe xbeVar = (defpackage.xbe) this.b;
            long j = xbeVar.e - xbeVar.f;
            long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(((java.lang.Long) xbeVar.b.a()).longValue());
            boolean z = xbeVar.f < 0 && xbeVar.e > 0;
            if (j > millis || z) {
                return java.lang.Boolean.FALSE;
            }
            long j2 = xbeVar.g + 1;
            xbeVar.g = j2;
            if (j2 < ((java.lang.Long) xbeVar.c.a()).longValue()) {
                return java.lang.Boolean.FALSE;
            }
            return java.lang.Boolean.valueOf(this.a - xbeVar.e <= java.util.concurrent.TimeUnit.MINUTES.toMillis(((java.lang.Long) xbeVar.a.a()).longValue()));
        }
        if (i == 1) {
            ((defpackage.xbe) this.b).f = this.a;
            return null;
        }
        ahmp ahmpVar = ahmp.a;
        java.lang.Object obj = this.b;
        ahlm ahlmVar = (ahlm) obj;
        ahlmVar.b.writeLock().lock();
        long j3 = this.a;
        try {
            try {
                ahmp ahmpVarA = ((ahlm) obj).a();
                akzx akzxVarP = ahmpVarA.p();
                akzxVarP.u();
                ahmp ahmpVar2 = akzxVarP.b;
                ahmpVar2.b |= 2;
                ahmpVar2.e = j3;
                try {
                    ((ahlm) obj).f(akzxVarP.p());
                } catch (java.io.IOException e) {
                    ahlm.a.d().k(e).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", 500, "SyncManagerDataStore.java").v("Error writing sync data file. Cannot update last wakeup.");
                }
                ahlmVar.b.writeLock().unlock();
                int i2 = ahmpVarA.b;
                if ((i2 & 2) != 0) {
                    return java.lang.Long.valueOf(ahmpVarA.e);
                }
                if ((i2 & 1) != 0) {
                    return java.lang.Long.valueOf(ahmpVarA.c);
                }
                return -1L;
            } catch (java.io.IOException e2) {
                ahzn.c(e2);
                throw new java.lang.RuntimeException(e2);
            }
        } catch (java.lang.Throwable th) {
            ahlmVar.b.writeLock().unlock();
            throw th;
        }
    }
}
