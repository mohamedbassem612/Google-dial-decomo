package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abqi extends defpackage.ajca implements java.lang.AutoCloseable, defpackage.ajcu {
    public static final /* synthetic */ int b = 0;
    public final defpackage.ajcu a;
    private final defpackage.ajct c;

    public abqi(defpackage.ajct ajctVar, defpackage.ajcu ajcuVar) {
        this.c = ajctVar;
        this.a = ajcuVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: b */
    public final defpackage.ajcs schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajcr ajcrVar = new defpackage.ajcr(runnable);
        return j <= 0 ? new adup(this.c.submit(runnable), java.lang.System.nanoTime(), 1, (byte[]) null) : new defpackage.abqh(ajcrVar, this.a.schedule(new defpackage.an(this, ajcrVar, 20, (byte[]) null), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: c */
    public final defpackage.ajcs schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j <= 0) {
            return new adup(this.c.submit(callable), java.lang.System.nanoTime(), 1, (byte[]) null);
        }
        defpackage.ajcr ajcrVar = new defpackage.ajcr(callable);
        return new defpackage.abqh(ajcrVar, this.a.schedule(new defpackage.abqu(this, ajcrVar, 1), j, timeUnit));
    }

    @Override // defpackage.ajca, defpackage.ajbw, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: d */
    public final defpackage.ajcs scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajdc ajdcVar = new defpackage.ajdc(this);
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        return new defpackage.abqh(ajddVar, this.a.scheduleAtFixedRate(new abqd(ajdcVar, runnable, ajddVar), j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: e */
    public final defpackage.ajcs scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajdd ajddVar = new defpackage.ajdd();
        defpackage.abqh abqhVar = new defpackage.abqh(ajddVar, null);
        abqhVar.a = this.a.schedule(new abqf(this, runnable, ajddVar, abqhVar, j2, timeUnit), j, timeUnit);
        return abqhVar;
    }

    @Override // defpackage.ajca
    public final defpackage.ajct f() {
        return this.c;
    }

    @Override // defpackage.aiey
    public final /* synthetic */ java.lang.Object fp() {
        return this.c;
    }

    @Override // defpackage.ajca, defpackage.ajbw
    public final /* synthetic */ java.util.concurrent.ExecutorService g() {
        return this.c;
    }
}
