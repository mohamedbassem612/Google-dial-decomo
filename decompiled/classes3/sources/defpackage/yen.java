package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yen implements java.util.concurrent.Future, defpackage.yeo, defpackage.yfa {
    private java.lang.Object a;
    private defpackage.yek b;
    private boolean c;
    private boolean d;
    private boolean e;
    private defpackage.xxa f;

    private final synchronized java.lang.Object n(java.lang.Long l) {
        if (!isDone()) {
            defpackage.ygc.f();
        }
        if (this.c) {
            throw new java.util.concurrent.CancellationException();
        }
        if (this.e) {
            throw new java.util.concurrent.ExecutionException(this.f);
        }
        if (!this.d) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                }
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            if (this.e) {
                throw new java.util.concurrent.ExecutionException(this.f);
            }
            if (this.c) {
                throw new java.util.concurrent.CancellationException();
            }
            if (!this.d) {
                throw new java.util.concurrent.TimeoutException();
            }
        }
        return this.a;
    }

    @Override // defpackage.yfa
    public final synchronized void a(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.yfa
    public final synchronized void c(java.lang.Object obj, defpackage.yfi yfiVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.c = true;
            notifyAll();
            defpackage.yek yekVar = null;
            if (z) {
                defpackage.yek yekVar2 = this.b;
                this.b = null;
                yekVar = yekVar2;
            }
            if (yekVar != null) {
                yekVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.yeo
    public final synchronized boolean d(defpackage.xxa xxaVar, defpackage.yfa yfaVar) {
        this.e = true;
        this.f = xxaVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.yeo
    public final synchronized boolean e(java.lang.Object obj, defpackage.yfa yfaVar, defpackage.xuc xucVar) {
        this.d = true;
        this.a = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.yfa
    public final synchronized defpackage.yek f() {
        return this.b;
    }

    @Override // defpackage.yfa
    public final void g(defpackage.yez yezVar) {
        yezVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        try {
            return n(null);
        } catch (java.util.concurrent.TimeoutException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.c || this.d || this.e;
    }

    @Override // defpackage.yfa
    public final synchronized void m(defpackage.yek yekVar) {
        this.b = yekVar;
    }

    public final java.lang.String toString() {
        defpackage.yek yekVar;
        java.lang.String str;
        java.lang.String strValueOf = java.lang.String.valueOf(super.toString());
        synchronized (this) {
            yekVar = null;
            if (this.c) {
                str = "CANCELLED";
            } else if (this.e) {
                str = "FAILURE";
            } else if (this.d) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                yekVar = this.b;
            }
        }
        java.lang.String strConcat = strValueOf.concat("[status=");
        if (yekVar == null) {
            return strConcat + str + ']';
        }
        return strConcat + str + ", request=[" + yekVar.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return n(java.lang.Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.ydm
    public final void i() {
    }

    @Override // defpackage.ydm
    public final void j() {
    }

    @Override // defpackage.ydm
    public final void k() {
    }

    @Override // defpackage.yfa
    public final void ei(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.yfa
    public final void h(android.graphics.drawable.Drawable drawable) {
    }

    @Override // defpackage.yfa
    public final void l(defpackage.yez yezVar) {
    }
}
