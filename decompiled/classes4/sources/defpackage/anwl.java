package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class anwl extends ajsz {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anwl.class.getName());
    private static final ajsz o = new defpackage.anwi();
    public final defpackage.anmv c;
    public volatile boolean d;
    public defpackage.anwk f;
    public ajsz g;
    private final java.util.concurrent.ScheduledFuture j;
    private final java.util.concurrent.Executor k;
    private anph l;
    private anqw m;
    private anty n;
    public java.util.List e = new java.util.ArrayList();
    public final java.lang.String b = "name_resolver";

    protected anwl(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, anmw anmwVar) {
        defpackage.anwl anwlVar;
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule;
        long jB;
        java.lang.String str;
        ahvr.cj(executor, "callExecutor");
        this.k = executor;
        ahvr.cj(scheduledExecutorService, "scheduler");
        defpackage.anmv anmvVarK = defpackage.anmv.k();
        this.c = anmvVarK;
        anmw anmwVarB = anmvVarK.b();
        if (anmwVar == null || !(anmwVarB == null || anmwVar.e(anmwVarB))) {
            if (anmwVarB != null) {
                jB = anmwVarB.b(java.util.concurrent.TimeUnit.NANOSECONDS);
                java.util.logging.Logger logger = a;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.format(java.util.Locale.US, "Call timeout set to '%d' ns, due to context deadline.", java.lang.Long.valueOf(jB)));
                    if (anmwVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(java.lang.String.format(java.util.Locale.US, " Explicit call timeout was '%d' ns.", java.lang.Long.valueOf(anmwVar.b(java.util.concurrent.TimeUnit.NANOSECONDS))));
                    }
                    logger.logp(java.util.logging.Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
                str = "Context";
            } else {
                anwlVar = this;
                scheduledFutureSchedule = null;
            }
            anwlVar.j = scheduledFutureSchedule;
        }
        jB = anmwVar.b(java.util.concurrent.TimeUnit.NANOSECONDS);
        str = "CallOptions";
        long j = jB;
        anwlVar = this;
        scheduledFutureSchedule = scheduledExecutorService.schedule((java.lang.Runnable) new tbl(anwlVar, j, str, 4), j, java.util.concurrent.TimeUnit.NANOSECONDS);
        anwlVar.j = scheduledFutureSchedule;
    }

    private final void dN(java.lang.Runnable runnable) {
        synchronized (this) {
            if (this.d) {
                runnable.run();
            } else {
                this.e.add(runnable);
            }
        }
    }

    public final void a(anty antyVar, anph anphVar) {
        anqw anqwVar;
        boolean z;
        ahvr.cj(anphVar, "headers");
        ahvr.bZ(this.n == null, "already started");
        synchronized (this) {
            ahvr.cj(antyVar, "listener");
            this.n = antyVar;
            anqwVar = this.m;
            z = this.d;
            if (!z) {
                defpackage.anwk anwkVar = new defpackage.anwk(this, antyVar);
                this.f = anwkVar;
                this.l = anphVar;
                antyVar = anwkVar;
            }
        }
        if (anqwVar != null) {
            this.k.execute(new defpackage.anwj(this, antyVar, anqwVar));
        } else if (z) {
            this.g.a(antyVar, anphVar);
        }
    }

    public final void d(anqw anqwVar, boolean z) {
        anty antyVar;
        boolean z2;
        synchronized (this) {
            if (this.g == null) {
                dM(o);
                antyVar = this.n;
                this.m = anqwVar;
                z2 = false;
            } else {
                if (z) {
                    return;
                }
                antyVar = null;
                z2 = true;
            }
            if (z2) {
                dN(new defpackage.alvh(this, anqwVar, 7));
            } else {
                if (antyVar != null) {
                    this.k.execute(new defpackage.anwj(this, antyVar, anqwVar));
                }
                f(antyVar);
                e();
            }
            c();
        }
    }

    public final void dM(ajsz ajszVar) {
        ajsz ajszVar2 = this.g;
        ahvr.cc(ajszVar2 == null, "realCall already set to %s", ajszVar2);
        java.util.concurrent.ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.g = ajszVar;
    }

    public final boolean du() {
        if (this.d) {
            return this.g.du();
        }
        return false;
    }

    public final void dv(java.lang.String str, java.lang.Throwable th) {
        anqw anqwVar = anqw.c;
        anqw anqwVarF = str != null ? anqwVar.f(str) : anqwVar.f("Call cancelled without message");
        if (th != null) {
            anqwVarF = anqwVarF.e(th);
        }
        d(anqwVarF, false);
    }

    public final void dw() {
        dN(new defpackage.alvr(this, 17));
    }

    public final void dx(int i) {
        if (this.d) {
            this.g.dx(i);
        } else {
            dN(new defpackage.akbd(this, i, 5));
        }
    }

    public final void dy(java.lang.Object obj) {
        if (this.d) {
            this.g.dy(obj);
        } else {
            dN(new defpackage.alvh(this, obj, 8));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L44
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L24
            r0 = 0
            r3.e = r0     // Catch: java.lang.Throwable -> L44
            r0 = 1
            r3.d = r0     // Catch: java.lang.Throwable -> L44
            anwk r0 = r3.f     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.k
            anwh r2 = new anwh
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List r1 = r3.e     // Catch: java.lang.Throwable -> L44
            r3.e = r0     // Catch: java.lang.Throwable -> L44
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L44
            throw r0
        L44:
            r0 = move-exception
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwl.e():void");
    }

    public final void f(anty antyVar) {
        anph anphVar = this.l;
        this.l = null;
        defpackage.akaz akazVar = new defpackage.akaz((java.lang.Object) this, (java.lang.Object) antyVar, (java.lang.Object) anphVar, 12);
        defpackage.anmv anmvVar = this.c;
        defpackage.anmv anmvVarA = anmvVar.a();
        try {
            akazVar.run();
        } finally {
            anmvVar.f(anmvVarA);
        }
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("realCall", this.g);
        return ahymVarL.toString();
    }

    protected void c() {
    }
}
