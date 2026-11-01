package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class det extends defpackage.aosp {
    public static final defpackage.aoir a = defpackage.aooc.ah(1, new defpackage.cbz(12));
    public static final java.lang.ThreadLocal b = new defpackage.der();
    public final android.view.Choreographer c;
    public final android.os.Handler d;
    public boolean h;
    public final defpackage.cci j;
    private boolean n;
    public final java.lang.Object e = new java.lang.Object();
    private final defpackage.aojw m = new defpackage.aojw();
    public java.util.List f = new java.util.ArrayList();
    public java.util.List g = new java.util.ArrayList();
    public final defpackage.des i = new defpackage.des(this);

    public det(android.view.Choreographer choreographer, android.os.Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.j = new defpackage.ccx(choreographer, this, 2);
    }

    private final java.lang.Runnable c() {
        java.lang.Runnable runnable;
        synchronized (this.e) {
            runnable = (java.lang.Runnable) this.m.g();
        }
        return runnable;
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        synchronized (this.e) {
            this.m.addLast(runnable);
            if (!this.n) {
                this.n = true;
                android.os.Handler handler = this.d;
                defpackage.des desVar = this.i;
                handler.post(desVar);
                if (!this.h) {
                    this.h = true;
                    this.c.postFrameCallback(desVar);
                }
            }
        }
    }

    public final void b() {
        boolean z;
        do {
            java.lang.Runnable runnableC = c();
            while (runnableC != null) {
                runnableC.run();
                runnableC = c();
            }
            synchronized (this.e) {
                if (this.m.isEmpty()) {
                    z = false;
                    this.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }
}
