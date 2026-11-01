package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gjc extends android.database.sqlite.SQLiteOpenHelper {
    private final android.content.Context a;
    private final defpackage.giq b;
    private final boolean c;
    private boolean d;
    private final defpackage.gjp e;
    private boolean f;
    private final defpackage.aiyy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjc(android.content.Context context, java.lang.String str, final defpackage.aiyy aiyyVar, defpackage.giq giqVar, boolean z) {
        java.lang.String string;
        super(context, str, null, giqVar.a, new android.database.DatabaseErrorHandler() { // from class: gja
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                defpackage.aooh.c(sQLiteDatabase);
                defpackage.giz gizVarT = defpackage.dzk.T(aiyyVar, sQLiteDatabase);
                android.util.Log.e("SupportSQLite", defpackage.a.bg(gizVarT, "Corruption reported by sqlite on database: ", ".path"));
                if (!gizVarT.m()) {
                    java.lang.String strD = gizVarT.d();
                    if (strD != null) {
                        defpackage.giq.a(strD);
                        return;
                    }
                    return;
                }
                java.util.List<android.util.Pair<java.lang.String, java.lang.String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = gizVarT.c.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            java.util.Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                java.lang.Object obj = ((android.util.Pair) it.next()).second;
                                defpackage.aooh.e(obj, "second");
                                defpackage.giq.a((java.lang.String) obj);
                            }
                        } else {
                            java.lang.String strD2 = gizVarT.d();
                            if (strD2 != null) {
                                defpackage.giq.a(strD2);
                            }
                        }
                    }
                } catch (android.database.sqlite.SQLiteException unused) {
                }
                try {
                    gizVarT.close();
                } catch (java.io.IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        if (context == null) {
            defpackage.aooh.i("context");
        }
        this.a = context;
        this.g = aiyyVar;
        this.b = giqVar;
        this.c = z;
        if (str == null) {
            string = java.util.UUID.randomUUID().toString();
            defpackage.aooh.e(string, "toString(...)");
        } else {
            string = str;
        }
        this.e = new defpackage.gjp(string, context.getCacheDir());
    }

    private final android.database.sqlite.SQLiteDatabase c() {
        android.database.sqlite.SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        defpackage.aooh.g();
        return null;
    }

    public final defpackage.giz a(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            defpackage.aooh.i("sqLiteDatabase");
        }
        return defpackage.dzk.T(this.g, sQLiteDatabase);
    }

    public final defpackage.gip b() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseC;
        defpackage.gip gipVarA;
        java.io.File parentFile;
        try {
            this.e.a((this.f || getDatabaseName() == null) ? false : true);
            this.d = false;
            java.lang.String databaseName = getDatabaseName();
            boolean z = this.f;
            if (databaseName != null && !z && (parentFile = this.a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    java.util.Objects.toString(parentFile);
                    android.util.Log.w("SupportSQLite", "Invalid database parent file, not a directory: ".concat(parentFile.toString()));
                }
            }
            try {
                sQLiteDatabaseC = c();
            } catch (java.lang.Throwable unused) {
                try {
                    java.lang.Thread.sleep(500L);
                } catch (java.lang.InterruptedException unused2) {
                }
                try {
                    sQLiteDatabaseC = c();
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (th instanceof defpackage.gjb) {
                        defpackage.gjb gjbVar = (defpackage.gjb) th;
                        java.lang.Throwable th2 = gjbVar.a;
                        int i = gjbVar.b;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                            throw th2;
                        }
                        if (i2 != 4) {
                            throw new defpackage.aois();
                        }
                        if (!(th2 instanceof android.database.sqlite.SQLiteException)) {
                            throw th2;
                        }
                        th = th2;
                    }
                    if (!(th instanceof android.database.sqlite.SQLiteException) || databaseName == null || !this.c) {
                        throw th;
                    }
                    this.a.deleteDatabase(databaseName);
                    try {
                        sQLiteDatabaseC = c();
                    } catch (defpackage.gjb e) {
                        throw e.a;
                    }
                }
            }
            if (this.d) {
                close();
                gipVarA = b();
            } else {
                gipVarA = a(sQLiteDatabaseC);
            }
            this.e.b();
            return gipVarA;
        } catch (java.lang.Throwable th3) {
            this.e.b();
            throw th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        try {
            defpackage.gjp gjpVar = this.e;
            java.util.Map map = defpackage.gjp.a;
            boolean z = gjpVar.b;
            gjpVar.a(false);
            super.close();
            this.g.a = null;
            this.f = false;
        } finally {
            this.e.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            defpackage.aooh.i("db");
        }
        if (!this.d && this.b.a != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            a(sQLiteDatabase);
        } catch (java.lang.Throwable th) {
            throw new defpackage.gjb(1, th);
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        defpackage.aooh.f(sQLiteDatabase, "sqLiteDatabase");
        try {
            defpackage.giq giqVar = this.b;
            defpackage.gjh gjhVar = new defpackage.gjh(a(sQLiteDatabase));
            defpackage.gin ginVarA = gjhVar.a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (ginVarA.m() && ginVarA.c(0) == 0) {
                    z = true;
                }
                defpackage.maw mawVar = giqVar.b;
                defpackage.aooc.M(ginVarA, null);
                java.lang.Object obj = mawVar.b;
                ((defpackage.gga) obj).a(gjhVar);
                if (!z) {
                    akwb akwbVarG = ((defpackage.gga) obj).g(gjhVar);
                    if (!akwbVarG.b) {
                        throw new java.lang.IllegalStateException("Pre-packaged database has an invalid schema: ".concat(java.lang.String.valueOf(akwbVarG.a)));
                    }
                }
                mawVar.a(gjhVar);
                ((defpackage.gga) obj).e();
                for (defpackage.gfz gfzVar : mawVar.a) {
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.aooc.M(ginVarA, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            throw new defpackage.gjb(2, th3);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        defpackage.aooh.f(sQLiteDatabase, "db");
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (java.lang.Throwable th) {
            throw new defpackage.gjb(4, th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.Object aoivVar;
        if (sQLiteDatabase == null) {
            defpackage.aooh.i("db");
        }
        if (!this.d) {
            try {
                defpackage.giq giqVar = this.b;
                defpackage.giz gizVarA = a(sQLiteDatabase);
                defpackage.maw mawVar = giqVar.b;
                defpackage.gjh gjhVar = new defpackage.gjh(gizVarA);
                defpackage.gin ginVarA = gjhVar.a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
                try {
                    boolean z = ginVarA.m() && ginVarA.c(0) != 0;
                    ginVarA.close();
                    if (z) {
                        defpackage.gin ginVarA2 = gjhVar.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            java.lang.String strE = ginVarA2.m() ? ginVarA2.e(0) : null;
                            ginVarA2.close();
                            java.lang.Object obj = mawVar.b;
                            java.lang.String str = ((defpackage.gga) obj).b;
                            if (!defpackage.aooh.n(str, strE) && !defpackage.aooh.n(((defpackage.gga) obj).c, strE)) {
                                throw new java.lang.IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + strE);
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                try {
                                    ginVarA2.close();
                                } catch (java.lang.Throwable th3) {
                                    aoil.b(th, th3);
                                }
                                throw th2;
                            }
                        }
                    } else {
                        defpackage.gin ginVarA3 = gjhVar.a("BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            ginVarA3.m();
                            ginVarA3.close();
                            try {
                                java.lang.Object obj2 = mawVar.b;
                                akwb akwbVarG = ((defpackage.gga) obj2).g(gjhVar);
                                if (!akwbVarG.b) {
                                    throw new java.lang.IllegalStateException("Pre-packaged database has an invalid schema: " + ((java.lang.String) akwbVarG.a));
                                }
                                ((defpackage.gga) obj2).f();
                                mawVar.a(gjhVar);
                                aoivVar = defpackage.aojh.a;
                                if (!(aoivVar instanceof defpackage.aoiv)) {
                                    defpackage.gin ginVarA4 = gjhVar.a("END TRANSACTION");
                                    try {
                                        ginVarA4.m();
                                        ginVarA4.close();
                                    } catch (java.lang.Throwable th4) {
                                        try {
                                            throw th4;
                                        } catch (java.lang.Throwable th5) {
                                            try {
                                                ginVarA4.close();
                                            } catch (java.lang.Throwable th6) {
                                                aoil.b(th4, th6);
                                            }
                                            throw th5;
                                        }
                                    }
                                }
                                java.lang.Throwable thC = defpackage.aoiw.c(aoivVar);
                                if (thC != null) {
                                    defpackage.gin ginVarA5 = gjhVar.a("ROLLBACK TRANSACTION");
                                    try {
                                        ginVarA5.m();
                                        ginVarA5.close();
                                        throw thC;
                                    } catch (java.lang.Throwable th7) {
                                        try {
                                            throw th7;
                                        } catch (java.lang.Throwable th8) {
                                            try {
                                                ginVarA5.close();
                                            } catch (java.lang.Throwable th9) {
                                                aoil.b(th7, th9);
                                            }
                                            throw th8;
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th10) {
                                aoivVar = new defpackage.aoiv(th10);
                            }
                        } catch (java.lang.Throwable th11) {
                            try {
                                throw th11;
                            } catch (java.lang.Throwable th12) {
                                try {
                                    ginVarA3.close();
                                } catch (java.lang.Throwable th13) {
                                    aoil.b(th11, th13);
                                }
                                throw th12;
                            }
                        }
                    }
                    ((defpackage.gga) mawVar.b).c(gjhVar);
                    java.util.Iterator it = mawVar.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.gfz) it.next()).a(gjhVar.a);
                    }
                    giqVar.b.d = gizVarA;
                } catch (java.lang.Throwable th14) {
                    try {
                        throw th14;
                    } catch (java.lang.Throwable th15) {
                        try {
                            ginVarA.close();
                        } catch (java.lang.Throwable th16) {
                            aoil.b(th14, th16);
                        }
                        throw th15;
                    }
                }
            } catch (java.lang.Throwable th17) {
                throw new defpackage.gjb(5, th17);
            }
        }
        this.f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        defpackage.aooh.f(sQLiteDatabase, "sqLiteDatabase");
        this.d = true;
        try {
            this.b.b(a(sQLiteDatabase), i, i2);
        } catch (java.lang.Throwable th) {
            throw new defpackage.gjb(3, th);
        }
    }
}
