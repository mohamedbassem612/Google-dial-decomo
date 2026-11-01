package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anyk {
    public static final long a;
    public static final long b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final ahzh d;
    public java.util.concurrent.ScheduledFuture e;
    public java.util.concurrent.ScheduledFuture f;
    public final java.lang.Runnable g;
    public final java.lang.Runnable h;
    public final long i;
    public final long j;
    public int k;
    public final vqf l;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        a = 10000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        b = 10000000L;
    }

    public anyk(vqf vqfVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        ahzh ahzhVar = new ahzh();
        this.k = 1;
        this.g = new defpackage.anyl(new defpackage.anwo(this, 11));
        this.h = new defpackage.anyl(new defpackage.anwo(this, 12, (byte[]) null));
        this.l = vqfVar;
        ahvr.cj(scheduledExecutorService, "scheduler");
        this.c = scheduledExecutorService;
        this.d = ahzhVar;
        this.i = j;
        this.j = j2;
        ahzhVar.d();
        ahzhVar.e();
    }

    public final synchronized void a() {
        ahzh ahzhVar = this.d;
        ahzhVar.d();
        ahzhVar.e();
        int i = this.k;
        if (i == 2) {
            this.k = 3;
            return;
        }
        if (i == 4 || i == 5) {
            java.util.concurrent.ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.k == 5) {
                this.k = 1;
            } else {
                this.k = 2;
                ahvr.bZ(this.f == null, "There should be no outstanding pingFuture");
                this.f = this.c.schedule(this.h, this.i, java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        }
    }

    public final synchronized void b() {
        int i = this.k;
        if (i == 1) {
            this.k = 2;
            if (this.f == null) {
                this.f = this.c.schedule(this.h, this.i - this.d.a(java.util.concurrent.TimeUnit.NANOSECONDS), java.util.concurrent.TimeUnit.NANOSECONDS);
            }
        } else if (i == 5) {
            this.k = 4;
        }
    }

    public final synchronized void c() {
        int i = this.k;
        if (i == 2 || i == 3) {
            this.k = 1;
        } else if (i == 4) {
            this.k = 5;
        }
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
        if (this.k != 6) {
            this.k = 6;
            java.util.concurrent.ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            java.util.concurrent.ScheduledFuture scheduledFuture2 = this.f;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f = null;
            }
        }
    }
}
