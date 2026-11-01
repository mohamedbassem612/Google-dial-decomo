package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agsm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/concurrent/AndroidFutures");
    public final defpackage.agsn b;
    public final android.content.Context c;
    public final java.util.Map d;
    public final java.util.Map e;
    private final android.os.PowerManager f;
    private final defpackage.ajct g;
    private final defpackage.agsq h;
    private final defpackage.ajcu i;
    private final defpackage.ajcu j;
    private final defpackage.ahzi k = defpackage.ahvr.bI(new defpackage.aeex(this, 20));
    private final defpackage.ahzi l = defpackage.ahvr.bI(new defpackage.ahgh(this, 1));
    private boolean m = false;
    private final defpackage.adag n;
    private final defpackage.aogc o;

    public agsm(android.content.Context context, android.os.PowerManager powerManager, defpackage.agsn agsnVar, defpackage.ajct ajctVar, java.util.Map map, java.util.Map map2, defpackage.aogc aogcVar, defpackage.agsq agsqVar, defpackage.ajcu ajcuVar, defpackage.ajcu ajcuVar2, defpackage.adag adagVar) {
        this.c = context;
        this.f = powerManager;
        this.g = ajctVar;
        this.o = aogcVar;
        this.h = agsqVar;
        this.i = ajcuVar;
        this.j = ajcuVar2;
        this.b = agsnVar;
        this.d = map;
        this.e = map2;
        this.n = adagVar;
    }

    public static /* synthetic */ void b(defpackage.ajcq ajcqVar) {
        try {
            defpackage.aiql.H(ajcqVar);
        } catch (java.util.concurrent.CancellationException unused) {
        } catch (java.util.concurrent.ExecutionException e) {
            defpackage.ahrc.k(e.getCause());
        }
    }

    static /* synthetic */ void c(defpackage.ajcq ajcqVar, defpackage.ainp ainpVar, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.Object[] objArr) {
        try {
            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
            defpackage.a.h(ajcqVar);
        } catch (java.util.concurrent.CancellationException unused) {
        } catch (java.util.concurrent.ExecutionException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(ainpVar)).k(e.getCause())).l(str, str2, i, null)).S(str3, objArr);
        }
    }

    public static void d(final java.lang.String str, final java.lang.String str2, final int i, final defpackage.ajcq ajcqVar, final defpackage.ainp ainpVar, final java.lang.String str3, final java.lang.Object... objArr) {
        ajcqVar.c(defpackage.ahqx.h(new java.lang.Runnable() { // from class: agsj
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.agsm.c(ajcqVar, ainpVar, str, str2, i, str3, objArr);
            }
        }), defpackage.ajbm.INSTANCE);
    }

    public static void i(final int i, final defpackage.ajcq ajcqVar, final java.lang.String str, final java.lang.Object... objArr) {
        ajcqVar.c(defpackage.ahqx.h(new java.lang.Runnable() { // from class: agsk
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.agsm.m(ajcqVar, i, str, objArr);
            }
        }), defpackage.ajbm.INSTANCE);
    }

    static /* synthetic */ void m(defpackage.ajcq ajcqVar, int i, java.lang.String str, java.lang.Object[] objArr) {
        try {
            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
            defpackage.a.h(ajcqVar);
        } catch (java.util.concurrent.CancellationException unused) {
        } catch (java.util.concurrent.ExecutionException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e.getCause())).l("B", "a", i, null)).S(str, objArr);
        }
    }

    public final java.lang.String a() {
        defpackage.adag adagVar = this.n;
        java.lang.String strAp = defpackage.agab.ap();
        return adagVar.r() ? "main_process_service_key" : strAp.substring(strAp.lastIndexOf(":") + 1);
    }

    public final void e(defpackage.ajcq ajcqVar, java.lang.String str) {
        long jC;
        android.content.Intent intent = (android.content.Intent) this.k.eZ();
        if (ajcqVar.isDone()) {
            return;
        }
        defpackage.agsn agsnVar = this.b;
        agsnVar.e.put(ajcqVar, str);
        while (true) {
            java.util.concurrent.atomic.AtomicLong atomicLong = agsnVar.c;
            long j = atomicLong.get();
            int iA = defpackage.agsn.a(j);
            if (iA == 0) {
                int iB = defpackage.agsn.b(j) + 1;
                jC = ((long) iB) | 4294967296L;
                if (atomicLong.compareAndSet(j, jC)) {
                    synchronized (agsnVar.d) {
                        agsnVar.f.put(iB, new defpackage.ajdd());
                    }
                    android.content.Context context = agsnVar.i;
                    android.content.Intent intentPutExtra = intent.cloneFilter().putExtra("EXTRA_FUTURE_INDEX", iB);
                    java.util.UUID uuid = agsnVar.h;
                    if (context.startService(intentPutExtra.putExtra("EXTRA_PROCESS_UUID", uuid.getMostSignificantBits()).putExtra("EXTRA_PROCESS_UUID2", uuid.getLeastSignificantBits()).putExtra("EXTRA_PROCESS_PID", android.os.Process.myPid())) != null) {
                        break;
                    }
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.agsn.a.b()).l("com/google/apps/tiktok/concurrent/AndroidFuturesServiceCounter", "increment", 135, "AndroidFuturesServiceCounter.java")).v("startService() returned null");
                    break;
                }
            } else {
                jC = defpackage.agsn.c(iA + 1, j);
                if (atomicLong.compareAndSet(j, jC)) {
                    break;
                }
            }
        }
        ajcqVar.c(new mo(this, ajcqVar, defpackage.agsn.b(jC), 15, (byte[]) null), defpackage.ajbm.INSTANCE);
    }

    public final void f(defpackage.ajcq ajcqVar, java.lang.String str) {
        if (ajcqVar.isDone()) {
            return;
        }
        try {
            android.os.PowerManager.WakeLock wakeLockNewWakeLock = this.f.newWakeLock(1, str);
            wakeLockNewWakeLock.acquire();
            defpackage.ajcq ajcqVarA = defpackage.ahrc.a(defpackage.aiql.A(ajcqVar), 45L, java.util.concurrent.TimeUnit.SECONDS, this.i);
            defpackage.ajcb ajcbVarF = defpackage.ahqx.f(new defpackage.agsl(this, str, 0));
            defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
            defpackage.aiql.I(ajcqVarA, ajcbVarF, ajbmVar);
            defpackage.ajcq ajcqVarG = defpackage.aiql.G(defpackage.aiql.A(ajcqVar), 3600L, java.util.concurrent.TimeUnit.SECONDS, this.j);
            j$.util.Objects.requireNonNull(wakeLockNewWakeLock);
            ajcqVarG.c(new defpackage.abqg(wakeLockNewWakeLock, 19), ajbmVar);
        } catch (java.lang.SecurityException e) {
            if (this.m) {
                return;
            }
            try {
                android.content.Context context = this.c;
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (java.lang.String str2 : packageInfo.requestedPermissions) {
                        if ("android.permission.WAKE_LOCK".equals(str2)) {
                            this.m = true;
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e)).l("com/google/apps/tiktok/concurrent/AndroidFutures", "checkPermissionRequested", 189, "AndroidFutures.java")).v("Failed to acquire wakelock");
                            return;
                        }
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public final void g(final defpackage.ajcq ajcqVar, final long j, final java.util.concurrent.TimeUnit timeUnit) {
        ajcqVar.c(defpackage.ahqx.h(new defpackage.abqu(this.i.schedule(defpackage.ahqx.h(new java.lang.Runnable() { // from class: agsi
            @Override // java.lang.Runnable
            public final void run() {
                defpackage.ajcq ajcqVar2 = ajcqVar;
                if (ajcqVar2.isDone()) {
                    return;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.agsm.a.c()).k(defpackage.ahrc.c())).l("com/google/apps/tiktok/concurrent/AndroidFutures", "crashApplicationOnFailure", 382, "AndroidFutures.java")).M("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", java.lang.Long.valueOf(j), timeUnit, ajcqVar2);
            }
        }), j, timeUnit), ajcqVar, 11, null)), this.g);
    }

    public final void h(defpackage.ajcq ajcqVar, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ajcq ajcqVarA = defpackage.ahrc.a(ajcqVar, 10L, timeUnit, this.i);
        ajcqVarA.c(defpackage.ahqx.h(new agdr(ajcqVarA, 7)), this.g);
    }

    public final void j(defpackage.ajcq ajcqVar, android.app.Notification notification) {
        agsu agsuVarE = this.o.E((java.lang.Class) this.l.eZ());
        int iA = this.h.a();
        defpackage.ahvr.cj(notification, "A notification is required to use a foreground service");
        if (ajcqVar.isDone()) {
            return;
        }
        android.app.NotificationManager notificationManager = agsuVarE.g;
        if (!aa$.ExternalSyntheticApiModelOutline1.m(notificationManager)) {
            ((defpackage.aimw) ((defpackage.aimw) agsu.a.d()).l("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 180, "ForegroundServiceTracker.java")).v("User disabled notifications for app");
        }
        android.app.NotificationChannel notificationChannelM = aa$.ExternalSyntheticApiModelOutline0.m(notificationManager, aa$.ExternalSyntheticApiModelOutline0.m(notification));
        int iM = aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM);
        if (aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM) < 2) {
            ((defpackage.aimw) ((defpackage.aimw) agsu.a.d()).l("com/google/apps/tiktok/concurrent/ForegroundServiceTracker", "attachForegroundService", 188, "ForegroundServiceTracker.java")).v("User blocked notification channel");
        }
        notification.category = "service";
        notification.flags |= 256;
        notification.flags |= 34;
        agsr agsrVar = new agsr(notification, iM, defpackage.ahvr.S());
        synchronized (agsuVarE.b) {
            ((defpackage.aida) agsuVarE.i).a(java.lang.Integer.valueOf(iA), 1);
            agsuVarE.d.t(ajcqVar, defpackage.ahqz.b());
            java.util.IdentityHashMap identityHashMap = agsuVarE.c;
            agsr agsrVar2 = (agsr) identityHashMap.get(ajcqVar);
            if (agsrVar2 == null) {
                ajcqVar.c(new mo(agsuVarE, ajcqVar, iA, 16, (byte[]) null), agsuVarE.f);
                identityHashMap.put(ajcqVar, agsrVar);
            } else if (agsrVar2.b <= agsrVar.b) {
                identityHashMap.put(ajcqVar, agsrVar);
            }
            defpackage.agsp agspVar = agsuVarE.e;
            java.lang.Runnable runnable = agsuVarE.h;
            synchronized (agspVar.a) {
                try {
                    agspVar.b.add(runnable);
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (!agsuVarE.e.b()) {
                int iOrdinal = agsuVarE.j.ordinal();
                if (iOrdinal == 0) {
                    agsuVarE.b(agsrVar.a);
                } else if (iOrdinal == 2) {
                    agsuVarE.e(agsuVarE.m);
                }
            }
        }
    }

    public final void k(defpackage.ajcq ajcqVar) {
        e(ajcqVar, defpackage.ahvr.S());
    }

    public final void l(defpackage.ajcq ajcqVar) {
        f(ajcqVar, defpackage.ahvr.S());
    }
}
