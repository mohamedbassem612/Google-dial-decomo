package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahiu implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ long a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    public ahiu(defpackage.aezj aezjVar, java.lang.Runnable runnable, ajcu ajcuVar, long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        this.$cid = i;
        this.c = runnable;
        this.d = ajcuVar;
        this.a = j;
        this.b = timeUnit;
        j$.util.Objects.requireNonNull(aezjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [ajcu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.$cid != 0) {
            this.c.run();
            agab.aq(this.d.b(this, this.a, (java.util.concurrent.TimeUnit) this.b));
            return;
        }
        if (((java.util.concurrent.atomic.AtomicBoolean) this.b).get()) {
            ((android.app.Application) this.c).unregisterActivityLifecycleCallbacks(this.d);
            long j = this.a;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (jElapsedRealtime < j) {
                defpackage.ahiv.a.c().l("com/google/apps/tiktok/monitoring/primes/PrimesStartupMetricsModule$2", "run", 99, "PrimesStartupMetricsModule.java").I("Startup time is in the future. startupTime: %s, currentTime: %s", new defpackage.aepb(j), new defpackage.aepb(jElapsedRealtime));
            } else {
                aenl.a().d(new aenj("ColdLaunchBackground"), j, jElapsedRealtime);
                aenl.a().g(new aenj("ColdLaunchBackgroundMemory"));
            }
        }
    }

    public ahiu(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.app.Application application, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks, long j, int i) {
        this.$cid = i;
        this.b = atomicBoolean;
        this.c = application;
        this.d = activityLifecycleCallbacks;
        this.a = j;
    }
}
