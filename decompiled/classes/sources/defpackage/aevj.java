package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aevj implements defpackage.aevg {
    private final defpackage.aoin b;
    private final java.lang.Object a = new java.lang.Object();
    private int c = 0;
    private long d = 0;

    public aevj(defpackage.aoin aoinVar) {
        this.b = aoinVar;
    }

    @Override // defpackage.aevg
    public final void a() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        synchronized (this.a) {
            this.c++;
            if (jElapsedRealtime - this.d > 1000) {
                this.c = 0;
                this.d = jElapsedRealtime;
            }
        }
    }

    @Override // defpackage.aevg
    public final boolean b() {
        int iIntValue = ((java.lang.Integer) this.b.a()).intValue();
        if (iIntValue == 0) {
            return true;
        }
        if (iIntValue != Integer.MAX_VALUE) {
            synchronized (this.a) {
                if (this.c >= iIntValue) {
                    long j = this.d;
                    if (android.os.SystemClock.elapsedRealtime() - j <= 1000) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
