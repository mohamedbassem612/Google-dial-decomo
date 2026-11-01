package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aetc {
    private static final defpackage.aetb g = new defpackage.aesz();
    public final defpackage.amwu a;
    public final java.util.concurrent.Executor b;
    public final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public volatile defpackage.aetb d = g;
    public java.util.concurrent.ScheduledFuture e;
    public java.util.concurrent.ScheduledFuture f;

    public aetc(defpackage.aepm aepmVar, defpackage.ajcu ajcuVar, java.util.concurrent.Executor executor, defpackage.amwu amwuVar, defpackage.amwu amwuVar2) {
        this.a = amwuVar;
        this.b = executor;
        aepmVar.a(new defpackage.aeta(this, amwuVar2, ajcuVar));
    }

    public final void a() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.e = null;
        }
        java.util.concurrent.ScheduledFuture scheduledFuture2 = this.f;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.f = null;
        }
    }
}
