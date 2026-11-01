package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajdf implements java.lang.Runnable {
    defpackage.ajdh a;

    public ajdf(defpackage.ajdh ajdhVar) {
        this.a = ajdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.ajcq ajcqVar;
        defpackage.ajdh ajdhVar = this.a;
        if (ajdhVar == null || (ajcqVar = ajdhVar.a) == null) {
            return;
        }
        this.a = null;
        if (ajcqVar.isDone()) {
            ajdhVar.q(ajcqVar);
            return;
        }
        try {
            java.util.concurrent.ScheduledFuture scheduledFuture = ajdhVar.b;
            ajdhVar.b = null;
            java.lang.String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = java.lang.Math.abs(scheduledFuture.getDelay(java.util.concurrent.TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (java.lang.Throwable th) {
                    ajdhVar.p(new ajdg(str));
                    throw th;
                }
            }
            ajdhVar.p(new ajdg(str + ": " + ajcqVar.toString()));
            ajcqVar.cancel(true);
        } catch (java.lang.Throwable th2) {
            ajcqVar.cancel(true);
            throw th2;
        }
    }
}
