package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ewx implements defpackage.ewr {
    public final defpackage.ewu[] a;
    public int b;
    private final java.lang.Thread c;
    private final defpackage.ewv[] g;
    private int h;
    private defpackage.ewu i;
    private defpackage.ews j;
    private boolean k;
    private boolean l;
    private int m;
    private final java.lang.Object d = new java.lang.Object();
    private long n = -9223372036854775807L;
    private final java.util.ArrayDeque e = new java.util.ArrayDeque();
    private final java.util.ArrayDeque f = new java.util.ArrayDeque();

    protected ewx(defpackage.ewu[] ewuVarArr, defpackage.ewv[] ewvVarArr) {
        this.a = ewuVarArr;
        this.b = ewuVarArr.length;
        for (int i = 0; i < this.b; i++) {
            this.a[i] = i();
        }
        this.g = ewvVarArr;
        this.h = ewvVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.g[i2] = k();
        }
        defpackage.eww ewwVar = new defpackage.eww(this);
        this.c = ewwVar;
        ewwVar.start();
    }

    private final void p() {
        if (r()) {
            this.d.notify();
        }
    }

    private final void q() throws defpackage.ews {
        defpackage.ews ewsVar = this.j;
        if (ewsVar != null) {
            throw ewsVar;
        }
    }

    private final boolean r() {
        return !this.e.isEmpty() && this.h > 0;
    }

    private final void s(defpackage.ewu ewuVar) {
        ewuVar.dJ();
        int i = this.b;
        this.b = i + 1;
        this.a[i] = ewuVar;
    }

    @Override // defpackage.ewr
    public final void c() {
        synchronized (this.d) {
            this.k = true;
            this.m = 0;
            defpackage.ewu ewuVar = this.i;
            if (ewuVar != null) {
                s(ewuVar);
                this.i = null;
            }
            while (true) {
                java.util.ArrayDeque arrayDeque = this.e;
                if (arrayDeque.isEmpty()) {
                    break;
                } else {
                    s((defpackage.ewu) arrayDeque.removeFirst());
                }
            }
            while (true) {
                java.util.ArrayDeque arrayDeque2 = this.f;
                if (!arrayDeque2.isEmpty()) {
                    ((defpackage.ewv) arrayDeque2.removeFirst()).d();
                }
            }
        }
    }

    @Override // defpackage.ewr
    public final void e() {
        java.lang.Object obj = this.d;
        synchronized (obj) {
            this.l = true;
            obj.notify();
        }
        try {
            this.c.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.ewr
    public final void f(long j) {
        synchronized (this.d) {
            boolean z = true;
            if (this.b != this.a.length && !this.k) {
                z = false;
            }
            ahvr.bY(z);
            this.n = j;
        }
    }

    protected abstract defpackage.ews g(java.lang.Throwable th);

    protected abstract defpackage.ews h(defpackage.ewu ewuVar, defpackage.ewv ewvVar, boolean z);

    protected abstract defpackage.ewu i();

    @Override // defpackage.ewr
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final defpackage.ewu a() {
        defpackage.ewu ewuVar;
        synchronized (this.d) {
            q();
            ahvr.bY(this.i == null);
            int i = this.b;
            if (i == 0) {
                ewuVar = null;
            } else {
                defpackage.ewu[] ewuVarArr = this.a;
                int i2 = i - 1;
                this.b = i2;
                ewuVar = ewuVarArr[i2];
            }
            this.i = ewuVar;
        }
        return ewuVar;
    }

    protected abstract defpackage.ewv k();

    @Override // defpackage.ewr
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final defpackage.ewv b() {
        synchronized (this.d) {
            q();
            java.util.ArrayDeque arrayDeque = this.f;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            return (defpackage.ewv) arrayDeque.removeFirst();
        }
    }

    @Override // defpackage.ewr
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void d(defpackage.ewu ewuVar) {
        synchronized (this.d) {
            q();
            ahvr.bM(ewuVar == this.i);
            this.e.addLast(ewuVar);
            p();
            this.i = null;
        }
    }

    public final void n(defpackage.ewv ewvVar) {
        synchronized (this.d) {
            ewvVar.dJ();
            defpackage.ewv[] ewvVarArr = this.g;
            int i = this.h;
            this.h = i + 1;
            ewvVarArr[i] = ewvVar;
            p();
        }
    }

    public final boolean o() {
        boolean z;
        defpackage.ews ewsVarG;
        java.lang.Object obj = this.d;
        synchronized (obj) {
            while (!this.l && !r()) {
                obj.wait();
            }
            if (this.l) {
                return false;
            }
            defpackage.ewu ewuVar = (defpackage.ewu) this.e.removeFirst();
            defpackage.ewv[] ewvVarArr = this.g;
            int i = this.h - 1;
            this.h = i;
            defpackage.ewv ewvVar = ewvVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (ewuVar.dL(4)) {
                ewvVar.dK(4);
            } else {
                ewvVar.b = ewuVar.f;
                if (ewuVar.dL(134217728)) {
                    ewvVar.dK(134217728);
                }
                long j = ewuVar.f;
                synchronized (this.d) {
                    long j2 = this.n;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    ewvVar.d = true;
                }
                try {
                    ewsVarG = h(ewuVar, ewvVar, z2);
                } catch (java.lang.OutOfMemoryError e) {
                    ewsVarG = g(e);
                } catch (java.lang.RuntimeException e2) {
                    ewsVarG = g(e2);
                }
                if (ewsVarG != null) {
                    synchronized (this.d) {
                        this.j = ewsVarG;
                    }
                    return false;
                }
            }
            synchronized (this.d) {
                if (this.k) {
                    ewvVar.d();
                } else {
                    boolean z3 = ewvVar.d;
                    int i2 = this.m;
                    if (z3) {
                        this.m = i2 + 1;
                        ewvVar.d();
                    } else {
                        ewvVar.c = i2;
                        this.m = 0;
                        this.f.addLast(ewvVar);
                    }
                }
                s(ewuVar);
            }
            return true;
        }
    }
}
