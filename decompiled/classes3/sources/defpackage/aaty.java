package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaty {
    public static volatile aaoo h;
    private static final long i;
    private static volatile java.util.concurrent.ScheduledExecutorService j;
    private static final java.lang.Object k;
    public final java.lang.Object a;
    public int b;
    public boolean c;
    defpackage.aand d;
    public final java.lang.String e;
    public final java.util.Map f;
    public java.util.concurrent.atomic.AtomicInteger g;
    private final android.os.PowerManager.WakeLock l;
    private java.util.concurrent.Future m;
    private long n;
    private final java.util.Set o;
    private int p;
    private android.os.WorkSource q;
    private final java.util.concurrent.ScheduledExecutorService r;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        i = 31622400000L;
        j = null;
        k = new java.lang.Object();
        h = new aaoo();
    }

    public aaty(android.content.Context context) {
        java.lang.String packageName = context.getPackageName();
        this.a = new java.lang.Object();
        this.b = 0;
        this.o = new java.util.HashSet();
        this.c = true;
        this.f = new java.util.HashMap();
        this.g = new java.util.concurrent.atomic.AtomicInteger(0);
        aais.at(context, "WakeLock: context must not be null");
        aais.aq("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        android.os.WorkSource workSource = null;
        this.d = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            aaoo aaooVar = h;
            this.e = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.e = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) context.getSystemService("power");
        ahvr.bH(powerManager);
        this.l = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (defpackage.aaiu.b(context)) {
            packageName = aait.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    android.content.pm.ApplicationInfo applicationInfoB = aaiy.b(context).b(packageName, 0);
                    if (applicationInfoB == null) {
                        android.util.Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoB.uid;
                        workSource = new android.os.WorkSource();
                        defpackage.aaiu.a(workSource, i2, packageName);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    android.util.Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.q = workSource;
            if (workSource != null) {
                f(this.l, workSource);
            }
        }
        java.util.concurrent.ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (k) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = j;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    aazc aazcVar = aang.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new aanf(0)));
                    j = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void f(android.os.PowerManager.WakeLock wakeLock, android.os.WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException e) {
            android.util.Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.g.incrementAndGet();
        aaoo aaooVar = h;
        long jMax = java.lang.Math.max(java.lang.Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            jMax = java.lang.Math.min(j2, jMax);
        }
        synchronized (this.a) {
            if (!c()) {
                aaoo aaooVar2 = h;
                aaoo aaooVar3 = h;
                this.d = defpackage.aand.a;
                this.l.acquire();
                android.os.SystemClock.elapsedRealtime();
            }
            this.b++;
            this.p++;
            d();
            java.util.Map map = this.f;
            xm xmVar = (xm) map.get(null);
            if (xmVar == null) {
                xmVar = new xm((short[]) null);
                map.put(null, xmVar);
            }
            aaoo aaooVar4 = h;
            xmVar.a++;
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.n) {
                this.n = j3;
                java.util.concurrent.Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                }
                this.m = this.r.schedule(new defpackage.yne(this, 10), jMax, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        java.util.Set set = this.o;
        if (set.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void e() {
        synchronized (this.a) {
            if (c()) {
                if (this.c) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                b();
                java.util.Map map = this.f;
                java.util.Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((xm) it.next()).a = 0;
                }
                map.clear();
                java.util.concurrent.Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                    this.m = null;
                    this.n = 0L;
                }
                aaoo aaooVar = h;
                this.p = 0;
                android.os.PowerManager.WakeLock wakeLock = this.l;
                try {
                    if (wakeLock.isHeld()) {
                        try {
                            wakeLock.release();
                            if (this.d != null) {
                                this.d = null;
                            }
                        } catch (java.lang.RuntimeException e) {
                            if (!e.getClass().equals(java.lang.RuntimeException.class)) {
                                throw e;
                            }
                            aaoo aaooVar2 = h;
                            android.util.Log.e("WakeLock", java.lang.String.format("%s failed to release!", this.e), e);
                            if (this.d != null) {
                                this.d = null;
                            }
                        }
                    } else {
                        aaoo aaooVar3 = h;
                        aaoo.F("%s should be held!", new java.lang.Object[]{this.e});
                    }
                } catch (java.lang.Throwable th) {
                    if (this.d != null) {
                        this.d = null;
                    }
                    throw th;
                }
            }
        }
    }

    public final void d() {
    }
}
