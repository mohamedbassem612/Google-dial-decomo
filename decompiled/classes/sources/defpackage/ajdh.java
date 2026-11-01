package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajdh extends defpackage.ajbv {
    public defpackage.ajcq a;
    public java.util.concurrent.ScheduledFuture b;

    public ajdh(defpackage.ajcq ajcqVar) {
        ajcqVar.getClass();
        this.a = ajcqVar;
    }

    @Override // defpackage.ajac
    protected final void a() {
        m(this.a);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.ajcq ajcqVar = this.a;
        java.util.concurrent.ScheduledFuture scheduledFuture = this.b;
        if (ajcqVar == null) {
            return null;
        }
        java.lang.String strBG = defpackage.a.bG((byte) 93, ajcqVar, "inputFuture=[");
        if (scheduledFuture == null) {
            return strBG;
        }
        long delay = scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strBG;
        }
        return strBG + ", remaining delay=[" + delay + " ms]";
    }
}
