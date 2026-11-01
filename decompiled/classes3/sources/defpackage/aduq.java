package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aduq extends ajca implements java.lang.AutoCloseable, ajcu {
    public static final /* synthetic */ int b = 0;
    public final ajcu a;
    private final ajct c;

    public aduq(ajct ajctVar, ajcu ajcuVar) {
        this.c = ajctVar;
        this.a = ajcuVar;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ajcs schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        ajcr ajcrVar = new ajcr(runnable);
        return j <= 0 ? new defpackage.adup(this.c.eT(runnable), java.lang.System.nanoTime(), 0) : new defpackage.aduo(ajcrVar, this.a.b(new defpackage.aawj(this, ajcrVar, 14), j, timeUnit));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ajcs schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (j <= 0) {
            return new defpackage.adup(this.c.eU(callable), java.lang.System.nanoTime(), 0);
        }
        ajcr ajcrVar = new ajcr(callable);
        return new defpackage.aduo(ajcrVar, this.a.b(new defpackage.aawj(this, ajcrVar, 15), j, timeUnit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        anty.aj(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ajcs scheduleAtFixedRate(final java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        final ajdc ajdcVar = new ajdc(this);
        final ajdd ajddVar = new ajdd();
        return new defpackage.aduo(ajddVar, this.a.d(new java.lang.Runnable() { // from class: aduk
            @Override // java.lang.Runnable
            public final void run() {
                int i = defpackage.aduq.b;
                final java.lang.Runnable runnable2 = runnable;
                final ajdd ajddVar2 = ajddVar;
                ajdcVar.execute(new java.lang.Runnable() { // from class: adul
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = defpackage.aduq.b;
                        try {
                            runnable2.run();
                        } catch (java.lang.Throwable th) {
                            ajddVar2.p(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ajcs scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        ajdd ajddVar = new ajdd();
        defpackage.aduo aduoVar = new defpackage.aduo(ajddVar, null);
        aduoVar.a = this.a.b(new defpackage.adun(this, runnable, ajddVar, aduoVar, j2, timeUnit), j, timeUnit);
        return aduoVar;
    }

    public final ajct f() {
        return this.c;
    }

    public final /* synthetic */ java.lang.Object fp() {
        return this.c;
    }

    public final /* synthetic */ java.util.concurrent.ExecutorService g() {
        return this.c;
    }
}
