package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aodf {
    public static final defpackage.aodf a = new defpackage.aodf();
    public final java.util.IdentityHashMap b = new java.util.IdentityHashMap();
    public java.util.concurrent.ScheduledExecutorService c;

    public static void b(defpackage.aode aodeVar, java.lang.Object obj) throws java.lang.Throwable {
        a.c(aodeVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final synchronized java.lang.Object a(defpackage.aode aodeVar) {
        defpackage.aodd aoddVar;
        java.util.IdentityHashMap identityHashMap = this.b;
        aoddVar = (defpackage.aodd) identityHashMap.get(aodeVar);
        if (aoddVar == null) {
            aoddVar = new defpackage.aodd(aodeVar.a());
            identityHashMap.put(aodeVar, aoddVar);
        }
        ?? r4 = aoddVar.c;
        if (r4 != 0) {
            r4.cancel(false);
            aoddVar.c = null;
        }
        aoddVar.b++;
        return aoddVar.a;
    }

    final synchronized void c(defpackage.aode aodeVar, java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Throwable th;
        defpackage.aodf aodfVar;
        try {
            try {
                defpackage.aodd aoddVar = (defpackage.aodd) this.b.get(aodeVar);
                if (aoddVar == null) {
                    throw new java.lang.IllegalArgumentException("No cached instance found for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aodeVar))));
                }
                defpackage.ahvr.bN(obj == aoddVar.a, "Releasing the wrong instance");
                defpackage.ahvr.bZ(aoddVar.b > 0, "Refcount has already reached zero");
                int i = aoddVar.b - 1;
                aoddVar.b = i;
                if (i == 0) {
                    defpackage.ahvr.bZ(aoddVar.c == null, "Destroy task already scheduled");
                    java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.c;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        try {
                            scheduledExecutorServiceNewSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(defpackage.anxo.j("grpc-shared-destroyer-%d"));
                            this.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                        }
                    }
                    aodfVar = this;
                    aoddVar.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule((java.lang.Runnable) new anyl(new abb(aodfVar, aoddVar, aodeVar, obj, 19)), 1L, java.util.concurrent.TimeUnit.SECONDS);
                } else {
                    aodfVar = this;
                }
                return;
            } catch (java.lang.Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        throw th;
    }
}
