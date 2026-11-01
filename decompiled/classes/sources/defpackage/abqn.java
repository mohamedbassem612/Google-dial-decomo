package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class abqn {
    private static final boolean a;

    static {
        boolean z = false;
        for (java.lang.String str : android.os.Build.SUPPORTED_32_BIT_ABIS) {
            if (android.os.Build.CPU_ABI.equals(str)) {
                z = true;
                break;
            }
        }
        a = z;
    }

    public static java.lang.Object a(java.util.concurrent.Future future, long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (!a || (future instanceof defpackage.ajac) || (future instanceof abqm) || java.util.concurrent.TimeUnit.NANOSECONDS.convert(j, timeUnit) <= 2147483647999999999L || future.isDone()) {
            future.get(j, timeUnit);
        }
        long nanos = timeUnit.toNanos(j);
        while (true) {
            try {
                return future.get(java.lang.Math.min(nanos, 2147483647999999999L), java.util.concurrent.TimeUnit.NANOSECONDS);
            } catch (java.util.concurrent.TimeoutException unused) {
                nanos = (java.lang.System.nanoTime() + nanos) - java.lang.System.nanoTime();
            }
        }
    }

    public static java.util.concurrent.RunnableScheduledFuture b(java.util.concurrent.RunnableScheduledFuture runnableScheduledFuture) {
        return a ? new abqm(runnableScheduledFuture) : runnableScheduledFuture;
    }
}
