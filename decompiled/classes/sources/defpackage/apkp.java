package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkp implements java.lang.Runnable {
    public volatile java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(0);
    public final /* synthetic */ defpackage.apks b;
    private final defpackage.apol c;

    public apkp(defpackage.apks apksVar, defpackage.apol apolVar) {
        this.b = apksVar;
        this.c = apolVar;
    }

    public final java.lang.String a() {
        return this.b.b.a.b;
    }

    public final void b(java.util.concurrent.ExecutorService executorService) {
        if (executorService == null) {
            defpackage.aooh.i("executorService");
        }
        defpackage.apks apksVar = this.b;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        if (apksVar.a.c == null) {
            defpackage.aooh.i("<this>");
        }
        try {
            try {
                executorService.execute(this);
            } catch (java.util.concurrent.RejectedExecutionException e) {
                c(e);
                this.b.a.c.b(null, null, this);
            }
        } catch (java.lang.Throwable th) {
            this.b.a.c.b(null, null, this);
            throw th;
        }
    }

    public final void c(java.util.concurrent.RejectedExecutionException rejectedExecutionException) {
        java.io.InterruptedIOException interruptedIOException = new java.io.InterruptedIOException("executor rejected");
        interruptedIOException.initCause(rejectedExecutionException);
        this.b.c(interruptedIOException);
        this.c.c(interruptedIOException);
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.apio apioVar;
        defpackage.apks apksVar = this.b;
        java.lang.String strD = apksVar.d();
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.String name = threadCurrentThread.getName();
        threadCurrentThread.setName("OkHttp ".concat(strD));
        try {
            apksVar.d.d();
            boolean z = false;
            try {
                try {
                    try {
                        this.c.d(apksVar.f());
                        apioVar = apksVar.a.c;
                    } catch (java.io.IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            defpackage.apnn apnnVar = defpackage.apnn.b;
                            java.lang.String str = true != apksVar.n ? "" : "canceled ";
                            apnnVar.b(defpackage.a.bx(str + "call to " + apksVar.d(), "Callback failure for "), e);
                        } else {
                            this.c.c(e);
                        }
                        apioVar = apksVar.a.c;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        z = true;
                        apksVar.a();
                        if (!z) {
                            java.io.IOException iOException = new java.io.IOException(defpackage.a.bh(th, "canceled due to "));
                            iOException.initCause(th);
                            this.c.c(iOException);
                        }
                        if (!(th instanceof java.lang.InterruptedException)) {
                            throw th;
                        }
                        java.lang.Thread.currentThread().interrupt();
                        apioVar = apksVar.a.c;
                    }
                } catch (java.lang.Throwable th2) {
                    apksVar.a.c.b(null, null, this);
                    throw th2;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
            apioVar.b(null, null, this);
            threadCurrentThread.setName(name);
        } catch (java.lang.Throwable th4) {
            threadCurrentThread.setName(name);
            throw th4;
        }
    }
}
