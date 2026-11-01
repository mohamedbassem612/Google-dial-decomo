package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agfq {
    private static volatile defpackage.agfq d;
    private final android.content.Context e;
    public static final xtq c = new xtq("SetupCompatServiceProvider", (byte[]) null);
    static final android.content.Intent a = new android.content.Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");
    final android.content.ServiceConnection b = new defpackage.agfp(this);
    private volatile defpackage.amwp g = new defpackage.amwp(1, (defpackage.agff) null);
    private final java.util.concurrent.atomic.AtomicReference f = new java.util.concurrent.atomic.AtomicReference();

    public agfq(android.content.Context context) {
        this.e = context.getApplicationContext();
    }

    public static defpackage.agff a(android.content.Context context, long j, java.util.concurrent.TimeUnit timeUnit) {
        anty.aI(context, "Context object cannot be null.");
        defpackage.agfq agfqVar = d;
        if (agfqVar == null) {
            synchronized (defpackage.agfq.class) {
                agfqVar = d;
                if (agfqVar == null) {
                    agfqVar = new defpackage.agfq(context.getApplicationContext());
                    d = agfqVar;
                    d.c();
                }
            }
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("getService blocks and should not be called from the main thread.");
        }
        defpackage.amwp amwpVarE = agfqVar.e();
        int i = amwpVarE.a - 1;
        if (i == 0) {
            c.B("NOT_STARTED state only possible before instance is created.");
            return null;
        }
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            if (i == 3) {
                return (defpackage.agff) amwpVarE.b;
            }
            if (i != 4) {
                if (i == 5) {
                    return null;
                }
                agfqVar.c();
                return agfqVar.d(j, timeUnit);
            }
        }
        return agfqVar.d(j, timeUnit);
    }

    private final synchronized void c() {
        int i = e().a;
        if (i == 4) {
            c.x("Refusing to rebind since current state is already connected");
            return;
        }
        if (i != 1) {
            c.x("Unbinding existing service connection.");
            this.e.unbindService(this.b);
        }
        try {
            if (this.e.bindService(a, this.b, 1)) {
                if (this.g.a != 4) {
                    b(new defpackage.amwp(3, (defpackage.agff) null));
                    c.x("Context#bindService went through, now waiting for service connection");
                }
                return;
            }
        } catch (java.lang.SecurityException e) {
            c.z("Unable to bind to compat service. ".concat(e.toString()));
        }
        b(new defpackage.amwp(2, (defpackage.agff) null));
        c.z("Context#bindService did not succeed.");
    }

    private final defpackage.agff d(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.TimeoutException {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        java.util.concurrent.CountDownLatch countDownLatch;
        defpackage.amwp amwpVarE = e();
        if (amwpVarE.a == 4) {
            return (defpackage.agff) amwpVarE.b;
        }
        do {
            atomicReference = this.f;
            countDownLatch = (java.util.concurrent.CountDownLatch) atomicReference.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new java.util.concurrent.CountDownLatch(1);
        } while (!anty.aq(atomicReference, countDownLatch));
        xtq xtqVar = c;
        xtqVar.x("Waiting for service to get connected");
        if (!countDownLatch.await(j, timeUnit)) {
            c();
            throw new java.util.concurrent.TimeoutException(java.lang.String.format("Failed to acquire connection after [%s %s]", java.lang.Long.valueOf(j), timeUnit));
        }
        defpackage.amwp amwpVarE2 = e();
        xtqVar.x(java.lang.String.format("Finished waiting for service to get connected. Current state = %s", afsq.r(amwpVarE2.a)));
        return (defpackage.agff) amwpVarE2.b;
    }

    private final synchronized defpackage.amwp e() {
        return this.g;
    }

    final void b(defpackage.amwp amwpVar) {
        c.x(java.lang.String.format("State changed: %s -> %s", afsq.r(this.g.a), afsq.r(amwpVar.a)));
        this.g = amwpVar;
        java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) this.f.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
