package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoew implements defpackage.aode {
    private final /* synthetic */ int $cid;

    public aoew(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aode
    public final /* synthetic */ java.lang.Object a() {
        if (this.$cid == 0) {
            return java.util.concurrent.Executors.newCachedThreadPool(defpackage.anxo.j("grpc-okhttp-%d"));
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = java.util.concurrent.Executors.newScheduledThreadPool(1, defpackage.anxo.j("grpc-timer-%d"));
        try {
            scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", java.lang.Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, java.lang.Boolean.TRUE);
        } catch (java.lang.NoSuchMethodException unused) {
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
        return java.util.concurrent.Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // defpackage.aode
    public final /* synthetic */ void b(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((java.util.concurrent.ScheduledExecutorService) obj).shutdown();
        } else {
            ((java.util.concurrent.ExecutorService) obj).shutdown();
        }
    }
}
