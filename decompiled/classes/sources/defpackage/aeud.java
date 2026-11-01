package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeud {
    public static final defpackage.aeud a = new defpackage.aeud();
    public volatile defpackage.aera b;
    public volatile defpackage.aera c;
    public volatile defpackage.aera d;
    public volatile defpackage.aera e;
    public volatile defpackage.aera f;
    public volatile defpackage.aera g;
    public volatile defpackage.aera h;
    public volatile defpackage.aera i;
    public volatile defpackage.aera j;
    public volatile defpackage.aera k;
    public volatile defpackage.aera l;
    public volatile defpackage.aenj m;
    private volatile int p = Integer.MAX_VALUE;
    public final defpackage.aetz n = new defpackage.aetz();
    public final defpackage.aetz o = new defpackage.aetz();

    public final void a(int i) {
        if (this.n.b != null) {
            this.p = i;
        } else if (i < 4) {
            defpackage.afec.a().post(new defpackage.kjo(this, i, 2));
        }
    }

    public final void b(android.app.Activity activity) {
        if (defpackage.afec.h(java.lang.Thread.currentThread()) && this.l == null) {
            this.l = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), android.os.SystemClock.uptimeMillis());
            da$.ExternalSyntheticApiModelOutline0.m("Primes-tti-end-and-length-ms", this.l.a - aa$.ExternalSyntheticApiModelOutline1.m());
            da$.ExternalSyntheticApiModelOutline0.m("Primes-tti-end-and-length-ms", 0L);
            if (activity != null) {
                try {
                    activity.reportFullyDrawn();
                } catch (java.lang.RuntimeException e) {
                    android.util.Log.d("PrimesStartupMeasure", "Failed to report App usable time.", e);
                }
            }
        }
    }

    public final void c(defpackage.aenj aenjVar) {
        if (this.m == null) {
            this.m = aenjVar;
        }
    }

    final boolean d(long j) {
        return ((long) this.p) < j;
    }
}
