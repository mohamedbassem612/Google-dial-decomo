package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aauq extends defpackage.aaum {
    public boolean b;
    public volatile boolean c;
    public java.lang.Exception d;
    private java.lang.Object f;
    public final java.lang.Object a = new java.lang.Object();
    public final defpackage.aeza e = new defpackage.aeza((byte[]) null);

    private final void v() {
        if (!this.b) {
            throw new java.lang.IllegalStateException("Task is not yet complete");
        }
    }

    private final void w() {
        if (this.c) {
            throw new java.util.concurrent.CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        java.lang.String strConcat;
        if (this.b) {
            if (!j()) {
                throw new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            java.lang.Exception excF = f();
            if (excF != null) {
                strConcat = "failure";
            } else if (k()) {
                strConcat = "result ".concat(java.lang.String.valueOf(java.lang.String.valueOf(g())));
            } else {
                strConcat = this.c ? "cancellation" : "unknown issue";
            }
        }
    }

    private final void y() {
        synchronized (this.a) {
            if (this.b) {
                this.e.i(this);
            }
        }
    }

    @Override // defpackage.aaum
    public final defpackage.aaum a(defpackage.aaui aauiVar) {
        p(defpackage.aaup.a, aauiVar);
        return this;
    }

    @Override // defpackage.aaum
    public final defpackage.aaum b(java.util.concurrent.Executor executor, defpackage.aaua aauaVar) {
        defpackage.aauq aauqVar = new defpackage.aauq();
        this.e.h(new defpackage.aauf(executor, aauaVar, aauqVar, 1));
        y();
        return aauqVar;
    }

    @Override // defpackage.aaum
    public final defpackage.aaum c(java.util.concurrent.Executor executor, defpackage.aaua aauaVar) {
        defpackage.aauq aauqVar = new defpackage.aauq();
        this.e.h(new defpackage.aaub(executor, aauaVar, aauqVar));
        y();
        return aauqVar;
    }

    @Override // defpackage.aaum
    public final defpackage.aaum d(aaul aaulVar) {
        return e(defpackage.aaup.a, aaulVar);
    }

    @Override // defpackage.aaum
    public final defpackage.aaum e(java.util.concurrent.Executor executor, aaul aaulVar) {
        defpackage.aauq aauqVar = new defpackage.aauq();
        this.e.h(new aauj(executor, aaulVar, aauqVar));
        y();
        return aauqVar;
    }

    @Override // defpackage.aaum
    public final java.lang.Exception f() {
        java.lang.Exception exc;
        synchronized (this.a) {
            exc = this.d;
        }
        return exc;
    }

    @Override // defpackage.aaum
    public final java.lang.Object g() {
        java.lang.Object obj;
        synchronized (this.a) {
            v();
            w();
            java.lang.Exception exc = this.d;
            if (exc != null) {
                throw new defpackage.aauk(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.aaum
    public final java.lang.Object h(java.lang.Class cls) {
        java.lang.Object obj;
        synchronized (this.a) {
            v();
            w();
            boolean zIsInstance = cls.isInstance(this.d);
            java.lang.Exception exc = this.d;
            if (zIsInstance) {
                throw ((java.lang.Throwable) cls.cast(exc));
            }
            if (exc != null) {
                throw new defpackage.aauk(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.aaum
    public final boolean i() {
        return this.c;
    }

    @Override // defpackage.aaum
    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        return z;
    }

    @Override // defpackage.aaum
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.b && !this.c && this.d == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.aaum
    public final void l(java.util.concurrent.Executor executor, defpackage.aaue aaueVar) {
        this.e.h(new defpackage.aaud(aaueVar));
        y();
    }

    @Override // defpackage.aaum
    public final void m(defpackage.aaug aaugVar) {
        n(defpackage.aaup.a, aaugVar);
    }

    @Override // defpackage.aaum
    public final void n(java.util.concurrent.Executor executor, defpackage.aaug aaugVar) {
        this.e.h(new defpackage.aauf(executor, aaugVar, 0));
        y();
    }

    @Override // defpackage.aaum
    public final void o(java.util.concurrent.Executor executor, defpackage.aauh aauhVar) {
        this.e.h(new defpackage.aauf(executor, aauhVar, 2));
        y();
    }

    @Override // defpackage.aaum
    public final void p(java.util.concurrent.Executor executor, defpackage.aaui aauiVar) {
        this.e.h(new defpackage.aauf(executor, aauiVar, 3));
        y();
    }

    @Override // defpackage.aaum
    public final void q(defpackage.aauh aauhVar) {
        o(defpackage.aaup.a, aauhVar);
    }

    public final void r(java.lang.Exception exc) {
        defpackage.aais.at(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.b = true;
            this.d = exc;
        }
        this.e.i(this);
    }

    public final void s(java.lang.Object obj) {
        synchronized (this.a) {
            x();
            this.b = true;
            this.f = obj;
        }
        this.e.i(this);
    }

    public final boolean t(java.lang.Object obj) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f = obj;
            this.e.i(this);
            return true;
        }
    }

    public final void u() {
        synchronized (this.a) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c = true;
            this.e.i(this);
        }
    }
}
