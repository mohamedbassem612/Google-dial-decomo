package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahde implements defpackage.aezm {
    private static final defpackage.aimz f = defpackage.aimz.i("com/google/apps/tiktok/experiments/phenotype/TimedProcessReaper");
    public final j$.util.Optional a;
    public final defpackage.ahco b;
    public final defpackage.ahdl c;
    public final java.util.concurrent.atomic.AtomicLong d;
    public final defpackage.aoin e;
    private final android.content.Context g;
    private final defpackage.agsm h;
    private final defpackage.aoss i;
    private final defpackage.ajcu j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;
    private final java.util.Map m;
    private final defpackage.aoin n;
    private final defpackage.aoin o;
    private final defpackage.aoin p;
    private final defpackage.aoin q;
    private final rai r;

    public ahde(android.content.Context context, defpackage.agsm agsmVar, defpackage.aazc aazcVar, defpackage.aoss aossVar, defpackage.ajcu ajcuVar, j$.util.Optional optional, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, java.util.Map map, j$.util.Optional optional2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, rai raiVar, defpackage.ahco ahcoVar, defpackage.ahdl ahdlVar) {
        if (context == null) {
            defpackage.aooh.i("context");
        }
        if (agsmVar == null) {
            defpackage.aooh.i("androidFutures");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aossVar == null) {
            defpackage.aooh.i("unconfinedScope");
        }
        if (ajcuVar == null) {
            defpackage.aooh.i("bgExecutor");
        }
        if (optional == null) {
            defpackage.aooh.i("durationOptional");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("importantThreshold");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("currentProcessName");
        }
        if (optional2 == null) {
            defpackage.aooh.i("listenerOptional");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("trimMemoryExperimentProvider");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("trimMemoryDefaultValueProvider");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("traceCreation");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("enableTimedProcessReaperRefactor");
        }
        if (raiVar == null) {
            defpackage.aooh.i("processReaperConditionsCheckerFactory");
        }
        this.g = context;
        this.h = agsmVar;
        this.i = aossVar;
        this.j = ajcuVar;
        this.k = aoinVar;
        this.l = aoinVar2;
        this.m = map;
        this.a = optional2;
        this.n = aoinVar3;
        this.o = aoinVar4;
        this.p = aoinVar5;
        this.q = aoinVar6;
        this.r = raiVar;
        this.b = ahcoVar;
        this.c = ahdlVar;
        this.d = new java.util.concurrent.atomic.AtomicLong(-1L);
        optional.isPresent();
        this.e = new defpackage.vkl(20);
    }

    public static final android.app.ActivityManager.RunningAppProcessInfo e() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    private final void f() {
        boolean zBooleanValue;
        defpackage.aezm aezmVar;
        defpackage.ahvr.T();
        java.lang.String str = (java.lang.String) this.l.a();
        java.util.Map map = this.m;
        if (!map.isEmpty()) {
            if (str == null) {
                return;
            }
            defpackage.aoin aoinVar = (defpackage.aoin) map.get(str);
            if (aoinVar != null && (aezmVar = (defpackage.aezm) aoinVar.a()) != null) {
                aezmVar.a();
                return;
            }
        }
        java.util.concurrent.atomic.AtomicLong atomicLong = this.d;
        if (atomicLong.compareAndSet(-1L, android.os.SystemClock.elapsedRealtime())) {
            java.lang.Object objA = this.q.a();
            defpackage.aooh.e(objA, "get(...)");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) objA, bool)).booleanValue()) {
                rai raiVar = this.r;
                j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(atomicLong.get());
                defpackage.aooh.e(durationOfMillis, "ofMillis(...)");
                him himVar = ((hil) raiVar.a).a;
                defpackage.aoov.an(this.i, null, 0, new tgn(this, new ahcp((defpackage.aazc) himVar.l.a(), himVar.aW, durationOfMillis, str), (defpackage.aoln) null, 19), 3);
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                java.lang.Object obj = ((defpackage.amyw) this.n).b;
                defpackage.aooh.e(obj, "get(...)");
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    java.lang.Object obj2 = optional.get();
                    defpackage.aooh.e(obj2, "get(...)");
                    zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
                } else {
                    java.lang.Object objA2 = this.o.a();
                    defpackage.aooh.e(objA2, "get(...)");
                    zBooleanValue = ((java.lang.Boolean) defpackage.aooh.p((j$.util.Optional) objA2, bool)).booleanValue();
                }
                if (zBooleanValue) {
                    this.g.registerComponentCallbacks(new ahdd(this));
                }
            }
            long jLongValue = ((java.lang.Number) this.e.a()).longValue();
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
            if (jLongValue <= 2592000) {
                android.util.Log.w("TimedProcessReaper", "Scheduling killing of process to refresh configuration");
                c(str, jLongValue, false);
            }
        }
    }

    @Override // defpackage.aezm
    public final void a() throws java.io.IOException {
        if (defpackage.ahns.q()) {
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(1372, "TimedProcessReaper#scheduleReap()");
            try {
                f();
                defpackage.ajsz.ak(ahoqVarW, null);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        }
        defpackage.ahok ahokVarF = ((defpackage.ahpz) this.p.a()).f(1371, "TimedProcessReaper#scheduleReap()");
        try {
            f();
            defpackage.ajsz.ak(ahokVarF, null);
        } catch (java.lang.Throwable th3) {
            try {
                throw th3;
            } catch (java.lang.Throwable th4) {
                defpackage.ajsz.ak(ahokVarF, th3);
                throw th4;
            }
        }
    }

    public final void b(ahck ahckVar) {
        j$.util.Objects.checkIndex(0, 3);
        if (ahckVar != null) {
            if (ahckVar instanceof ahcj) {
                ((defpackage.aimw) f.b().l("com/google/apps/tiktok/experiments/phenotype/TimedProcessReaper", "processResult", 160, "TimedProcessReaper.kt")).v("Killing process to refresh configuration");
                android.os.Process.killProcess(android.os.Process.myPid());
                return;
            } else if (ahckVar instanceof ahcl) {
                ahdf ahdfVar = ((ahcl) ahckVar).a;
                if (!ahdfVar.b && !ahdfVar.a) {
                    ((defpackage.aimw) f.d().l("com/google/apps/tiktok/experiments/phenotype/TimedProcessReaper", "processResult", 170, "TimedProcessReaper.kt")).v("Reap rejected for unknown reason");
                }
                ahdg ahdgVar = (ahdg) defpackage.aooh.q(this.a);
                if (ahdgVar != null) {
                    ahdgVar.a();
                    return;
                }
                return;
            }
        }
        throw new defpackage.aois();
    }

    public final void c(final java.lang.String str, long j, final boolean z) {
        final long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(j) + defpackage.aazc.c().toMillis();
        this.h.g(this.j.schedule(new java.util.concurrent.Callable() { // from class: ahdb
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                android.os.Looper.getMainLooper().getQueue().addIdleHandler(new ahdc(this.a, millis, str, z));
                defpackage.afec.e(new ahlo(1));
                return null;
            }
        }, j, java.util.concurrent.TimeUnit.SECONDS), 1L, java.util.concurrent.TimeUnit.DAYS);
    }

    public final boolean d(int i) {
        android.util.Log.w("TimedProcessReaper", defpackage.a.bj(i, "Current importance is: "));
        java.lang.Object obj = ((defpackage.amyw) this.k).b;
        defpackage.aooh.e(obj, "get(...)");
        return i < ((java.lang.Number) defpackage.aooh.p((j$.util.Optional) obj, 400)).intValue();
    }
}
