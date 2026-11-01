package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajcx extends defpackage.ajbz implements defpackage.ajcs {
    private final java.util.concurrent.ScheduledFuture a;

    public ajcx(defpackage.ajcq ajcqVar, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(ajcqVar);
        this.a = scheduledFuture;
    }

    @Override // defpackage.ajby, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = super.cancel(z);
        if (zCancel) {
            this.a.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
