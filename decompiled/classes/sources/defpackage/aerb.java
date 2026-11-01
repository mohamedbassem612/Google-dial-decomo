package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerb {
    private final defpackage.ahzh c;
    private volatile java.lang.Process d;
    public volatile boolean b = false;
    public final defpackage.ahyc a = new adek(this, 11);

    public aerb(defpackage.ahzp ahzpVar) {
        this.c = new defpackage.ahzh(ahzpVar);
    }

    public final void a(java.lang.String str) {
        if (str.isEmpty()) {
            return;
        }
        java.lang.Process process = this.d;
        if (process != null) {
            try {
                if (process.exitValue() != 0) {
                    this.b = true;
                    this.d = null;
                }
            } catch (java.lang.IllegalThreadStateException unused) {
                return;
            }
        }
        if (this.b) {
            return;
        }
        synchronized (this) {
            defpackage.ahzh ahzhVar = this.c;
            if (!ahzhVar.a || ahzhVar.a(java.util.concurrent.TimeUnit.MILLISECONDS) >= 60000) {
                ahzhVar.d();
                ahzhVar.e();
                this.d = (java.lang.Process) this.a.apply(str);
            }
        }
    }
}
