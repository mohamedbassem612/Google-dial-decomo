package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahlm {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore");
    public final defpackage.ajct c;
    private final android.content.Context f;
    private final defpackage.adag g;
    public final java.util.concurrent.locks.ReentrantReadWriteLock b = new java.util.concurrent.locks.ReentrantReadWriteLock();
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean(false);
    public long e = -1;

    public ahlm(android.content.Context context, defpackage.ajct ajctVar, defpackage.adag adagVar) {
        this.g = adagVar;
        this.f = context;
        this.c = ajctVar;
    }

    static java.io.File e(android.content.Context context) {
        return new java.io.File(context.getFilesDir(), "103795117_".concat(java.lang.String.valueOf(defpackage.agab.ap().replaceAll("[^A-Za-z0-9\\-_:]", "_"))));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067 A[Catch: RuntimeException -> 0x007d, all -> 0x00c4, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x007d, blocks: (B:8:0x001f, B:10:0x0034, B:13:0x0042, B:15:0x004c, B:16:0x0061, B:18:0x0067), top: B:44:0x001f, outer: #1 }] */
    public final defpackage.ahmp a() {
        android.content.Context context = this.f;
        java.io.File fileE = e(context);
        this.b.readLock().lock();
        try {
            if (!fileE.exists() && this.g.r()) {
                try {
                    java.io.File file = new java.io.File(context.getFilesDir().getPath(), "103795117");
                    if (file.exists()) {
                        if (e(context).exists()) {
                            if (!file.delete()) {
                                ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 205, "SyncManagerDataStore.java")).v("Unable to delete old Sync database file.");
                            }
                        } else if (!file.renameTo(e(context))) {
                            ((defpackage.aimw) ((defpackage.aimw) a.d()).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 199, "SyncManagerDataStore.java")).v("Failed to rename old sync database file.");
                            if (!file.delete()) {
                                ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", 205, "SyncManagerDataStore.java")).v("Unable to delete old Sync database file.");
                            }
                        }
                    }
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "tryMigrateToPerProcessDatabase", (char) 210, "SyncManagerDataStore.java")).v("Error while migrating Sync datastore file.");
                }
            }
            defpackage.ahmp ahmpVar = null;
            java.io.FileInputStream fileInputStream = null;
            if (fileE.exists()) {
                try {
                    java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(fileE);
                    try {
                        defpackage.alad aladVarC = defpackage.alad.C(defpackage.ahmp.a, fileInputStream2, defpackage.akzq.a);
                        defpackage.alad.V(aladVarC);
                        ahmpVar = (defpackage.ahmp) aladVarC;
                        defpackage.agab.am(fileInputStream2);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        defpackage.agab.am(fileInputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
            this.b.readLock().unlock();
            return ahmpVar == null ? defpackage.ahmp.a : ahmpVar;
        } catch (java.lang.Throwable th3) {
            this.b.readLock().unlock();
            throw th3;
        }
    }

    public final defpackage.ajcq b() {
        return defpackage.ajan.f(c(), defpackage.ahqx.a(new defpackage.ahbx(this, 9)), this.c);
    }

    final defpackage.ajcq c() {
        return this.d.get() ? defpackage.aiql.z(java.lang.Long.valueOf(this.e)) : this.c.submit(defpackage.ahqx.i(new defpackage.vcz(this, 18)));
    }

    final defpackage.ajcq d(defpackage.ahlv ahlvVar, long j, boolean z) {
        return this.c.submit(new ahll(this, ahlvVar, j, z, 0));
    }

    public final void f(defpackage.ahmp ahmpVar) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new java.io.FileOutputStream(e(this.f));
            try {
                ahmpVar.g(fileOutputStream);
                fileOutputStream.close();
            } catch (java.lang.Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }

    public final boolean g(java.lang.Throwable th) {
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(th)).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", (char) 577, "SyncManagerDataStore.java")).v("Could not read sync datastore. There was probably a write error. Wiping store.");
        this.b.writeLock().lock();
        try {
            boolean z = false;
            this.d.set(false);
            long epochMilli = this.e;
            if (epochMilli <= 0) {
                epochMilli = j$.time.Instant.now().toEpochMilli();
            }
            defpackage.akzx akzxVarM = defpackage.ahmp.a.m();
            akzxVarM.u();
            defpackage.ahmp ahmpVar = (defpackage.ahmp) akzxVarM.b;
            ahmpVar.b |= 1;
            ahmpVar.c = epochMilli;
            try {
                try {
                    f((defpackage.ahmp) akzxVarM.r());
                    this.d.set(true);
                    z = true;
                } catch (java.io.IOException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e)).l("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "clearStore", 597, "SyncManagerDataStore.java")).v("Could not write to datastore to clear store.");
                    this.d.set(false);
                }
                this.b.writeLock().unlock();
                return z;
            } catch (java.lang.Throwable th2) {
                this.d.set(true);
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            this.b.writeLock().unlock();
            throw th3;
        }
    }
}
