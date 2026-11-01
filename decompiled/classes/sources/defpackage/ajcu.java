package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public interface ajcu extends java.util.concurrent.ScheduledExecutorService, defpackage.ajct {
    defpackage.ajcs b(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit);

    defpackage.ajcs c(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit);

    defpackage.ajcs d(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit);

    defpackage.ajcs e(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit);
}
