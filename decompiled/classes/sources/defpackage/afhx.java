package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class afhx implements android.content.ComponentCallbacks2 {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/storage/sqlite/AsyncSQLiteOpenHelper");
    public final android.content.Context b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final defpackage.ahyn d;
    public final java.util.List e;
    public final java.util.List f;
    public final java.lang.String g;
    public final java.util.concurrent.Executor j;
    public defpackage.ajcq k;
    public boolean n;
    public final defpackage.ahcc o;
    public final defpackage.zzx p;
    private final defpackage.ajas r;
    private java.util.concurrent.ScheduledFuture u;
    public final java.util.Set h = new java.util.HashSet();
    public final java.lang.Object i = new java.lang.Object();
    public final defpackage.apnt q = new defpackage.apnt(this);
    private final defpackage.ajcb s = new defpackage.acgy(this, 2);
    public int l = 0;
    private boolean t = false;
    public boolean m = false;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @java.lang.Deprecated
    public afhx(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.zzx zzxVar, defpackage.ajas ajasVar, defpackage.ahbq ahbqVar, java.lang.String str) {
        this.r = ajasVar;
        this.c = scheduledExecutorService;
        this.p = zzxVar;
        this.j = new defpackage.ajdc(scheduledExecutorService);
        this.b = context;
        this.d = (defpackage.ahyn) ahbqVar.d;
        this.e = ahbqVar.b;
        this.f = ahbqVar.a;
        this.o = (defpackage.ahcc) ahbqVar.c;
        this.g = str;
    }

    public static defpackage.ajbg a(defpackage.ajcq ajcqVar, java.io.Closeable... closeableArr) {
        ajcqVar.getClass();
        defpackage.apnt apntVar = new defpackage.apnt(closeableArr);
        defpackage.ajcp ajcpVar = defpackage.ajbg.a;
        defpackage.ajbb ajbbVar = new defpackage.ajbb();
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(apntVar, ajbbVar, 0));
        ajdkVar.run();
        return new defpackage.ajbg(ajdkVar, ajbbVar).d(new defpackage.afhl(ajcqVar, 5), defpackage.ajbm.INSTANCE);
    }

    public static void e(java.io.File file) throws defpackage.afhu {
        java.io.File file2 = new java.io.File(java.lang.String.valueOf(file.getPath()).concat("-wal"));
        java.io.File file3 = new java.io.File(java.lang.String.valueOf(file.getPath()).concat("-journal"));
        java.io.File file4 = new java.io.File(java.lang.String.valueOf(file.getPath()).concat("-shm"));
        try {
            if ((!file2.exists() || file2.delete()) && ((!file3.exists() || file3.delete()) && ((!file4.exists() || file4.delete()) && file.delete()))) {
            } else {
                throw new defpackage.afhu(java.lang.String.format("Unable to clean up database %s", file.getAbsolutePath()));
            }
        } catch (java.lang.Throwable th) {
            throw new defpackage.afhu(java.lang.String.format("Unable to clean up database %s", file.getAbsolutePath()), th);
        }
    }

    public static android.database.sqlite.SQLiteDatabase f(android.content.Context context, java.io.File file, defpackage.ahcc ahccVar, defpackage.ahyn ahynVar, java.util.List list, java.util.List list2) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseJ = j(context, ahccVar, file);
        try {
            if (ahynVar.f()) {
                ahynVar.b();
                if (sQLiteDatabaseJ.getVersion() < 3) {
                    defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1264, "Dropping tables.", defpackage.ahot.a, true);
                    try {
                        sQLiteDatabaseJ.close();
                        e(file);
                        sQLiteDatabaseJ = j(context, ahccVar, file);
                        ahynVar.b();
                        sQLiteDatabaseJ.setVersion(3);
                        ahoqVarX.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarX.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            try {
                if (k(sQLiteDatabaseJ, ahccVar, ahynVar, list, list2)) {
                    sQLiteDatabaseJ.close();
                    sQLiteDatabaseJ = j(context, ahccVar, file);
                    try {
                        defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(1263, "Configuring reopened database.", defpackage.ahot.a, true);
                        try {
                            defpackage.ahvr.bZ(!k(sQLiteDatabaseJ, ahccVar, ahynVar, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                            ahoqVarX2.close();
                        } catch (java.lang.Throwable th3) {
                            try {
                                ahoqVarX2.close();
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        sQLiteDatabaseJ.close();
                        throw new defpackage.afht("Failed to open database.", e);
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        sQLiteDatabaseJ.close();
                        throw new defpackage.afht("Failed to open database.", e);
                    } catch (java.lang.Throwable th5) {
                        sQLiteDatabaseJ.close();
                        throw th5;
                    }
                }
                return sQLiteDatabaseJ;
            } catch (android.database.sqlite.SQLiteException e3) {
                sQLiteDatabaseJ.close();
                throw new defpackage.afht("Failed to open database.", e3);
            } catch (java.lang.Throwable th6) {
                sQLiteDatabaseJ.close();
                throw th6;
            }
        } catch (defpackage.afhu e4) {
            throw new defpackage.afht("Failed to drop tables to apply new schema.", e4);
        }
    }

    public static boolean g(android.content.Context context, defpackage.ahcc ahccVar) {
        int i = ahccVar.a;
        return !((android.app.ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    private static int h(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.ahyn ahynVar) {
        if (!ahynVar.f()) {
            return sQLiteDatabase.getVersion();
        }
        int version = sQLiteDatabase.getVersion();
        ahynVar.b();
        return version - 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.ahyn ahynVar, java.util.List list, java.util.List list2) {
        int i = ((defpackage.aike) list).d;
        int iH = h(sQLiteDatabase, ahynVar);
        defpackage.ahvr.cd(iH <= i, "Can't downgrade from version %s to version %s", iH, i);
        defpackage.adag adagVar = new defpackage.adag(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (iH != i) {
                try {
                    try {
                        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1266, "Applying upgrade steps", defpackage.ahot.a, true);
                        try {
                            java.util.Iterator it = ((defpackage.aify) list).subList(iH, i).iterator();
                            while (it.hasNext()) {
                                ((defpackage.afid) it.next()).a(adagVar);
                            }
                            ahoqVarX.close();
                            if (ahynVar.f()) {
                                ahynVar.b();
                                sQLiteDatabase.setVersion(i + 3);
                            } else {
                                sQLiteDatabase.setVersion(i);
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                ahoqVarX.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e) {
                        e = e;
                        throw new defpackage.afhw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                    } catch (java.lang.InterruptedException e2) {
                        throw new defpackage.afhw("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e2);
                    }
                } catch (android.database.sqlite.SQLiteDiskIOException e3) {
                    e = e3;
                    throw new defpackage.afhw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (android.database.sqlite.SQLiteFullException e4) {
                    e = e4;
                    throw new defpackage.afhw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (android.database.sqlite.SQLiteOutOfMemoryException e5) {
                    e = e5;
                    throw new defpackage.afhw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (android.database.sqlite.SQLiteTableLockedException e6) {
                    e = e6;
                    throw new defpackage.afhw("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
                } catch (java.lang.Throwable th3) {
                    throw new defpackage.afhv(th3);
                }
            }
            defpackage.ailk ailkVarListIterator = ((defpackage.aify) list2).listIterator(0);
            if (ailkVarListIterator.hasNext()) {
                throw null;
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return iH != h(sQLiteDatabase, ahynVar);
        } catch (java.lang.Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    private static android.database.sqlite.SQLiteDatabase j(android.content.Context context, defpackage.ahcc ahccVar, java.io.File file) {
        boolean zG = g(context, ahccVar);
        int i = zG ? 805306368 : 268435456;
        file.getParentFile().mkdirs();
        try {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseOpenDatabase = android.database.sqlite.SQLiteDatabase.openDatabase(file.getPath(), null, i, null);
            if (zG) {
                sQLiteDatabaseOpenDatabase.enableWriteAheadLogging();
            }
            return sQLiteDatabaseOpenDatabase;
        } catch (java.lang.Throwable th) {
            throw new defpackage.afht("Failed to open database.", th);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    private static boolean k(android.database.sqlite.SQLiteDatabase sQLiteDatabase, defpackage.ahcc ahccVar, defpackage.ahyn ahynVar, java.util.List list, java.util.List list2) {
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        java.util.Iterator it = ahccVar.b.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("PRAGMA ".concat(java.lang.String.valueOf((java.lang.String) it.next())));
        }
        return i(sQLiteDatabase, ahynVar, list, list2);
    }

    public final defpackage.ajbg b() {
        defpackage.ajcq ajddVar;
        int i = 0;
        defpackage.ahns.t(false);
        defpackage.ahoq ahoqVar = null;
        try {
            synchronized (this.i) {
                try {
                    int i2 = this.l + 1;
                    this.l = i2;
                    if (this.k == null) {
                        defpackage.ahvr.bZ(i2 == 1, "DB was null with nonzero refcount");
                        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1265, "Opening database", defpackage.ahot.a, true);
                        try {
                            try {
                                defpackage.ajas ajasVar = this.r;
                                java.util.concurrent.Executor executor = this.j;
                                defpackage.ajdk ajdkVar = new defpackage.ajdk(ajasVar);
                                executor.execute(ajdkVar);
                                defpackage.ajcb ajcbVar = this.s;
                                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
                                if (ajcbVar == null) {
                                    throw null;
                                }
                                ajdkVar.c(new defpackage.ajcc(ajdkVar, ajcbVar), scheduledExecutorService);
                                defpackage.vut vutVar = new defpackage.vut(this, 16);
                                long j = defpackage.ahqx.a;
                                defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), vutVar);
                                int i3 = defpackage.ajan.c;
                                defpackage.ajam ajamVar = new defpackage.ajam(ajdkVar, ahqvVar);
                                ajdkVar.c(ajamVar, defpackage.aiql.t(executor, ajamVar));
                                ajddVar = ajamVar;
                                this.k = ajddVar;
                                ahoqVar = ahoqVarX;
                            } catch (java.lang.Exception e) {
                                ajddVar = new defpackage.ajdd(e);
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    defpackage.ajcq ajcqVar = this.k;
                    java.util.concurrent.ScheduledFuture scheduledFuture = this.u;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    defpackage.ajcq ajcqVarA = defpackage.aiql.A(ajcqVar);
                    if (ahoqVar != null) {
                        ahoqVar.a(ajcqVarA);
                    }
                    defpackage.ajbg ajbgVarA = a(ajcqVarA, new defpackage.afhs(this, i));
                    defpackage.afhl afhlVar = new defpackage.afhl(this, 4);
                    long j2 = defpackage.ahqx.a;
                    defpackage.ajbg ajbgVarD = ajbgVarA.d(new defpackage.ahqo(defpackage.ahns.c(false), afhlVar), defpackage.ajbm.INSTANCE);
                    if (ahoqVar != null) {
                        ahoqVar.close();
                    }
                    return ajbgVarD;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            if (0 != 0) {
                ahoqVar.close();
            }
            throw th3;
        }
    }

    public final void c() {
        if (this.l != 0 || this.k == null) {
            return;
        }
        if (this.t) {
            d();
            return;
        }
        this.u = this.c.schedule(new defpackage.abqg(this, 16), 60L, java.util.concurrent.TimeUnit.SECONDS);
        if (this.n) {
            return;
        }
        defpackage.ajcq ajcqVar = this.k;
        defpackage.acgy acgyVar = new defpackage.acgy(this, 3, (byte[]) null);
        ajcqVar.c(new defpackage.ajcc(ajcqVar, acgyVar), this.j);
    }

    public final void d() {
        this.j.execute(new defpackage.abqg(this, 17));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        synchronized (this.i) {
            this.t = i >= 40;
            c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
