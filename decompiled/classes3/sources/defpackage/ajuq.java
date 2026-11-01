package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajuq extends dsc implements java.util.concurrent.ScheduledFuture {
    private final java.util.concurrent.ScheduledFuture d;

    public ajuq(defpackage.ajup ajupVar) {
        this.d = ajupVar.a(new defpackage.aprf(this));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.d.compareTo(delayed);
    }

    protected final void d() {
        java.lang.Object obj = ((dsc) this).value;
        boolean z = false;
        if ((obj instanceof dru) && ((dru) obj).c) {
            z = true;
        }
        this.d.cancel(z);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.d.getDelay(timeUnit);
    }
}
