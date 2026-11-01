package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class BasePendingResult extends defpackage.aadh {
    public static final java.lang.ThreadLocal b = new defpackage.aaef();
    private final java.util.concurrent.CountDownLatch a;
    public final java.lang.Object c;
    protected final defpackage.aaeg d;
    public defpackage.aadl e;
    public boolean f;
    public aahc g;
    private final java.util.ArrayList h;
    private aadm i;
    private final java.util.concurrent.atomic.AtomicReference j;
    private com.google.android.gms.common.api.Status k;
    private volatile boolean l;
    private boolean m;
    private boolean n;
    private volatile aadn o;
    private aaeh resultGuardian;

    protected BasePendingResult(defpackage.aade aadeVar) {
        this.c = new java.lang.Object();
        this.a = new java.util.concurrent.CountDownLatch(1);
        this.h = new java.util.ArrayList();
        this.j = new java.util.concurrent.atomic.AtomicReference();
        this.f = false;
        this.d = new defpackage.aaeg(aadeVar != null ? ((defpackage.aaeu) aadeVar).a.g : android.os.Looper.getMainLooper());
        new java.lang.ref.WeakReference(aadeVar);
    }

    private final defpackage.aadl b() {
        defpackage.aadl aadlVar;
        synchronized (this.c) {
            if (this.l) {
                throw new java.lang.IllegalStateException("Result has already been consumed.");
            }
            if (!m()) {
                throw new java.lang.IllegalStateException("Result is not ready.");
            }
            aadlVar = this.e;
            this.e = null;
            this.i = null;
            this.l = true;
        }
        defpackage.aafs aafsVar = (defpackage.aafs) this.j.getAndSet(null);
        if (aafsVar != null) {
            aafsVar.a();
        }
        if (aadlVar != null) {
            return aadlVar;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    public static void k(defpackage.aadl aadlVar) {
        if (aadlVar instanceof defpackage.aadj) {
            try {
                ((defpackage.aadj) aadlVar).a();
            } catch (java.lang.RuntimeException e) {
                android.util.Log.w("BasePendingResult", "Unable to release ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aadlVar))), e);
            }
        }
    }

    private final void o(defpackage.aadl aadlVar) {
        this.e = aadlVar;
        this.k = aadlVar.b();
        this.g = null;
        this.a.countDown();
        if (this.m) {
            this.i = null;
        } else {
            aadm aadmVar = this.i;
            if (aadmVar != null) {
                defpackage.aaeg aaegVar = this.d;
                aaegVar.removeMessages(2);
                aaegVar.a(aadmVar, b());
            } else if (this.e instanceof defpackage.aadj) {
                this.resultGuardian = new aaeh(this);
            }
        }
        java.util.ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.aadg) arrayList.get(i)).a(this.k);
        }
        arrayList.clear();
    }

    protected abstract defpackage.aadl a(com.google.android.gms.common.api.Status status);

    @Override // defpackage.aadh
    public final void d(defpackage.aadg aadgVar) {
        synchronized (this.c) {
            if (m()) {
                aadgVar.a(this.k);
            } else {
                this.h.add(aadgVar);
            }
        }
    }

    @Override // defpackage.aadh
    public final void e() {
        synchronized (this.c) {
            if (this.m || this.l) {
                return;
            }
            aahc aahcVar = this.g;
            if (aahcVar != null) {
                try {
                    aahcVar.eS(2, aahcVar.eP());
                } catch (android.os.RemoteException unused) {
                }
            }
            k(this.e);
            this.m = true;
            o(a(com.google.android.gms.common.api.Status.e));
        }
    }

    @Override // defpackage.aadh
    public final defpackage.aadl f(java.util.concurrent.TimeUnit timeUnit) {
        if (this.l) {
            throw new java.lang.IllegalStateException("Result has already been consumed.");
        }
        aadn aadnVar = this.o;
        try {
            if (!this.a.await(0L, timeUnit)) {
                j(com.google.android.gms.common.api.Status.d);
            }
        } catch (java.lang.InterruptedException unused) {
            j(com.google.android.gms.common.api.Status.b);
        }
        if (m()) {
            return b();
        }
        throw new java.lang.IllegalStateException("Result is not ready.");
    }

    @Override // defpackage.aadh
    public final void g(aadm aadmVar, java.util.concurrent.TimeUnit timeUnit) {
        boolean z;
        java.lang.Object obj = this.c;
        synchronized (obj) {
            defpackage.aais.ao(!this.l, "Result has already been consumed.");
            aadn aadnVar = this.o;
            synchronized (obj) {
                try {
                    z = this.m;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            return;
        }
        if (m()) {
            this.d.a(aadmVar, b());
        } else {
            this.i = aadmVar;
            defpackage.aaeg aaegVar = this.d;
            aaegVar.sendMessageDelayed(aaegVar.obtainMessage(2, this), timeUnit.toMillis(3L));
        }
    }

    @java.lang.Deprecated
    public final void j(com.google.android.gms.common.api.Status status) {
        synchronized (this.c) {
            if (!m()) {
                l(a(status));
                this.n = true;
            }
        }
    }

    public final void l(defpackage.aadl aadlVar) {
        synchronized (this.c) {
            if (this.n || this.m) {
                k(aadlVar);
                return;
            }
            m();
            if (m()) {
                throw new java.lang.IllegalStateException("Results have already been set");
            }
            if (this.l) {
                throw new java.lang.IllegalStateException("Result has already been consumed");
            }
            o(aadlVar);
        }
    }

    public final boolean m() {
        return this.a.getCount() == 0;
    }

    @java.lang.Deprecated
    BasePendingResult() {
        this.c = new java.lang.Object();
        this.a = new java.util.concurrent.CountDownLatch(1);
        this.h = new java.util.ArrayList();
        this.j = new java.util.concurrent.atomic.AtomicReference();
        this.f = false;
        this.d = new defpackage.aaeg(android.os.Looper.getMainLooper());
        new java.lang.ref.WeakReference(null);
    }
}
