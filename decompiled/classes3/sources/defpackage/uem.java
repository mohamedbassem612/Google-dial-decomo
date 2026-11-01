package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uem implements aohy {
    final /* synthetic */ defpackage.uen a;
    final /* synthetic */ ueo b;
    private boolean c;

    public uem(ueo ueoVar, defpackage.uen uenVar) {
        this.a = uenVar;
        j$.util.Objects.requireNonNull(ueoVar);
        this.b = ueoVar;
        this.c = true;
    }

    public final void e() {
        ueo.a.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onCompleted", 232, "SpamAsyncTaskUtil.java").v("gRPC blocked list fetching completed.");
        this.a.a(this.c);
    }

    public final void f(java.lang.Throwable th) {
        a.bq(ueo.a.c(), "error while fetching list updates via gRPC", "com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onError", (char) 222, "SpamAsyncTaskUtil.java", th, zct.b);
        this.b.b.o(rmx.c);
        this.c = false;
        this.a.a(false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #0 {all -> 0x00b1, blocks: (B:23:0x00a1, B:29:0x00ad), top: B:77:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x0150 A[PHI: r9
      0x0150: PHI (r9v2 long) = (r9v0 long), (r9v7 long), (r9v9 long) binds: [B:49:0x0104, B:59:0x014e, B:64:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    public final /* synthetic */ void g(java.lang.Object obj) throws java.lang.Throwable {
        boolean z;
        long j;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        boolean z2;
        ajdy ajdyVar = (ajdy) obj;
        aimz aimzVar = ueo.a;
        aimzVar.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 165, "SpamAsyncTaskUtil.java").v("gRPC data received from server");
        long j2 = ajdyVar.c;
        long j3 = ajdyVar.d;
        java.lang.String[] strArr = (java.lang.String[]) ajdyVar.f.toArray(new java.lang.String[0]);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : strArr) {
            sb.append(str);
            sb.append(' ');
        }
        aimzVar.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 175, "SpamAsyncTaskUtil.java").H("updated spam list for countryIso: %s denylist version: %d", sb, j2);
        ajdz ajdzVar = ajdyVar.e;
        if (ajdzVar == null) {
            ajdzVar = ajdz.a;
        }
        if ((ajdyVar.b & 1) == 0 || j2 <= 0) {
            aimzVar.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 181, "SpamAsyncTaskUtil.java").v("spam list from server was empty");
            this.b.b.o(rmx.i);
            return;
        }
        int i = ajdzVar.b;
        if (i == 3) {
            ueo ueoVar = this.b;
            ajdt ajdtVar = i == 3 ? (ajdt) ajdzVar.c : ajdt.a;
            uex uexVar = ueoVar.c;
            gus.aJ();
            j$.util.Objects.requireNonNull(ajdtVar);
            ueu ueuVar = uexVar.b;
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB = ueuVar.b();
            sQLiteDatabaseB.beginTransactionNonExclusive();
            try {
                sQLiteDatabaseB.execSQL("DELETE FROM server_spam_table");
                if (ueuVar.c(sQLiteDatabaseB, ajdtVar.b)) {
                    sQLiteDatabase = sQLiteDatabaseB;
                    try {
                        z2 = ueu.d(ueuVar.b, j2, strArr, j3);
                        if (z2) {
                            sQLiteDatabase.setTransactionSuccessful();
                        }
                        sQLiteDatabase.endTransaction();
                        if (z2) {
                            this.b.b.o(rmx.e);
                            ueo.a.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 192, "SpamAsyncTaskUtil.java").x("updated spam list with complete list to denylist version: %d", j2);
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } else {
                    sQLiteDatabase = sQLiteDatabaseB;
                }
                if (z2) {
                    sQLiteDatabase.setTransactionSuccessful();
                }
                sQLiteDatabase.endTransaction();
                if (z2) {
                    this.b.b.o(rmx.e);
                    ueo.a.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 192, "SpamAsyncTaskUtil.java").x("updated spam list with complete list to denylist version: %d", j2);
                    return;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseB;
            }
        }
        int i2 = ajdzVar.b;
        if (i2 == 4) {
            ueo ueoVar2 = this.b;
            ajdu ajduVar = i2 == 4 ? (ajdu) ajdzVar.c : ajdu.a;
            uex uexVar2 = ueoVar2.c;
            gus.aJ();
            j$.util.Objects.requireNonNull(ajduVar);
            ueu ueuVar2 = uexVar2.b;
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseB2 = ueuVar2.b();
            sQLiteDatabaseB2.beginTransactionNonExclusive();
            try {
                if (ueuVar2.c(sQLiteDatabaseB2, ajduVar.b)) {
                    alat alatVar = ajduVar.c;
                    if (alatVar.size() == 0) {
                        ueu.a.b().l("com/android/dialer/spam/inapp/SpamDatabaseHelper", "bulkDeleteNumbersFromServerTable", 181, "SpamDatabaseHelper.java").v("no numbers removed from the spam list.");
                        j = j2;
                    } else {
                        java.util.Iterator it = alatVar.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                alat alatVar2 = alatVar;
                                long j4 = j2;
                                if (sQLiteDatabaseB2.delete("server_spam_table", "number = ?", new java.lang.String[]{(java.lang.String) it.next()}) < 0) {
                                    j2 = j4;
                                } else {
                                    alatVar = alatVar2;
                                    j2 = j4;
                                }
                            } else {
                                j = j2;
                                ueu.a.b().l("com/android/dialer/spam/inapp/SpamDatabaseHelper", "bulkDeleteNumbersFromServerTable", 194, "SpamDatabaseHelper.java").w("removed %d numbers from the server spam list.", alatVar.size());
                            }
                            z = false;
                        }
                    }
                    j2 = j;
                    if (ueu.d(ueuVar2.b, j2, strArr, j3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    sQLiteDatabaseB2.setTransactionSuccessful();
                }
                sQLiteDatabaseB2.endTransaction();
                if (z) {
                    this.b.b.o(rmx.f);
                    ueo.a.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 204, "SpamAsyncTaskUtil.java").x("updated spam list with difference list to denylist version: %d", j2);
                    return;
                }
            } catch (java.lang.Throwable th3) {
                sQLiteDatabaseB2.endTransaction();
                throw th3;
            }
        }
        ueo.a.b().l("com/android/dialer/spam/inapp/SpamAsyncTaskUtil$1", "onNext", 209, "SpamAsyncTaskUtil.java").x("could not update spam list to denylist version: %d", j2);
        this.b.b.o(rmx.d);
        this.c = false;
    }
}
