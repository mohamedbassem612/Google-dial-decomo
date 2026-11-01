package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahtx {
    private static final defpackage.aimz c = defpackage.aimz.i("com/google/apps/tiktok/ui/locale/LocaleDataStore");
    public static final defpackage.ahtx a = new defpackage.ahtx();
    private volatile defpackage.ahyn d = null;
    public volatile boolean b = false;

    public static java.io.File b(android.content.Context context, defpackage.ahua ahuaVar) {
        if (ahuaVar == defpackage.ahua.b) {
            java.io.File filesDir = aa$.ExternalSyntheticApiModelOutline1.m(context).getFilesDir();
            if (filesDir == null) {
                throw new java.lang.IllegalStateException("Unable to get a device protected storage directory");
            }
            return filesDir;
        }
        java.io.File filesDir2 = context.getFilesDir();
        if (filesDir2 == null) {
            try {
                android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo.applicationInfo.dataDir == null) {
                    throw new java.lang.IllegalStateException("PackageInfo was invalid.");
                }
                filesDir2 = new java.io.File(packageInfo.applicationInfo.dataDir, "files");
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new java.lang.RuntimeException("Could not find our own package, this should be impossible.", e);
            }
        }
        return filesDir2;
    }

    public static void c(android.content.Context context, defpackage.ahua ahuaVar) throws java.io.IOException {
        defpackage.ahua ahuaVar2 = defpackage.ahua.b;
        if (ahuaVar == ahuaVar2) {
            g(b(context, ahuaVar2));
            h(context, defpackage.ahtv.a, ahuaVar2);
        }
        g(b(context, defpackage.ahua.a));
    }

    public static void d(java.io.File file, java.io.File file2) throws java.io.IOException {
        if (file2.exists() && !file2.delete()) {
            throw new java.io.IOException("Unable to remove destination file");
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException("Unable to rename source file");
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3 A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #4 {all -> 0x0108, blocks: (B:59:0x00e6, B:61:0x00f3, B:66:0x0102, B:67:0x0107), top: B:107:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd A[Catch: all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x0135, blocks: (B:25:0x0054, B:34:0x0091, B:64:0x00fd, B:81:0x011f, B:93:0x0134, B:92:0x0131, B:26:0x0068, B:28:0x0075, B:32:0x008c, B:44:0x00a7, B:43:0x00a4, B:56:0x00db, B:58:0x00e1, B:62:0x00f8, B:74:0x0112, B:73:0x010f, B:79:0x011b, B:77:0x0115, B:78:0x011a, B:48:0x00ab, B:50:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00bc, B:88:0x012b), top: B:114:0x0054, inners: #3, #8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0102 A[Catch: all -> 0x0108, TRY_ENTER, TryCatch #4 {all -> 0x0108, blocks: (B:59:0x00e6, B:61:0x00f3, B:66:0x0102, B:67:0x0107), top: B:107:0x00e6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x011b A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #3 {all -> 0x0127, blocks: (B:26:0x0068, B:28:0x0075, B:32:0x008c, B:44:0x00a7, B:43:0x00a4, B:56:0x00db, B:58:0x00e1, B:62:0x00f8, B:74:0x0112, B:73:0x010f, B:79:0x011b, B:77:0x0115, B:78:0x011a, B:48:0x00ab, B:50:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00bc), top: B:106:0x0068, outer: #10, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x011f A[Catch: all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x0135, blocks: (B:25:0x0054, B:34:0x0091, B:64:0x00fd, B:81:0x011f, B:93:0x0134, B:92:0x0131, B:26:0x0068, B:28:0x0075, B:32:0x008c, B:44:0x00a7, B:43:0x00a4, B:56:0x00db, B:58:0x00e1, B:62:0x00f8, B:74:0x0112, B:73:0x010f, B:79:0x011b, B:77:0x0115, B:78:0x011a, B:48:0x00ab, B:50:0x00b1, B:52:0x00b5, B:53:0x00ba, B:54:0x00bb, B:55:0x00bc, B:88:0x012b), top: B:114:0x0054, inners: #3, #8 }] */
    public static final defpackage.ahyn e(java.io.File file, defpackage.akzq akzqVar) throws java.io.IOException {
        defpackage.ahyn ahynVar;
        java.io.FileInputStream fileInputStream;
        defpackage.ahtv ahtvVar;
        java.io.File file2 = new java.io.File(file, "tiktok_configuration");
        java.io.File file3 = new java.io.File(file2, "CustomConfiguration.lock");
        if (!file3.exists()) {
            return defpackage.ahwt.a;
        }
        java.io.File file4 = new java.io.File(file2, "CustomConfiguration");
        if (file4.exists()) {
            try {
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file4);
                try {
                    defpackage.alad aladVarC = defpackage.alad.C(defpackage.ahtv.a, fileInputStream2, akzqVar);
                    defpackage.alad.V(aladVarC);
                    defpackage.ahtv ahtvVar2 = (defpackage.ahtv) aladVarC;
                    if (ahtvVar2 == null) {
                        throw null;
                    }
                    defpackage.ahys ahysVar = new defpackage.ahys(ahtvVar2);
                    fileInputStream2.close();
                    return ahysVar;
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream2.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (defpackage.alaz | java.io.FileNotFoundException | java.lang.RuntimeException unused) {
            }
        }
        java.io.FileInputStream fileInputStream3 = new java.io.FileInputStream(file3);
        try {
            java.nio.channels.FileLock fileLockLock = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream3.getChannel()).lock(0L, Long.MAX_VALUE, true);
            try {
                java.io.File file5 = new java.io.File(file2, "CustomConfiguration.bak");
                if (file4.exists()) {
                    try {
                        java.io.FileInputStream fileInputStream4 = new java.io.FileInputStream(file4);
                        try {
                            defpackage.alad aladVarC2 = defpackage.alad.C(defpackage.ahtv.a, fileInputStream4, akzqVar);
                            defpackage.alad.V(aladVarC2);
                            defpackage.ahtv ahtvVar3 = (defpackage.ahtv) aladVarC2;
                            if (ahtvVar3 == null) {
                                throw new defpackage.ahtw();
                            }
                            defpackage.ahys ahysVar2 = new defpackage.ahys(ahtvVar3);
                            fileInputStream4.close();
                            if (fileLockLock != null) {
                                fileLockLock.close();
                            }
                            ahynVar = ahysVar2;
                        } catch (java.lang.Throwable th3) {
                            try {
                                fileInputStream4.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (defpackage.alaz | java.lang.RuntimeException e) {
                        if (!file5.exists()) {
                            if (e instanceof defpackage.alaz) {
                                throw new defpackage.ahtw(e);
                            }
                            throw e;
                        }
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.c()).k(e)).l("com/google/apps/tiktok/ui/locale/LocaleDataStore", "readLocaleFromFile", 452, "LocaleDataStore.java")).v("Failed to read locale, trying back up");
                        if (file5.exists()) {
                            try {
                                fileInputStream = new java.io.FileInputStream(file5);
                                try {
                                    defpackage.alad aladVarC3 = defpackage.alad.C(defpackage.ahtv.a, fileInputStream, akzqVar);
                                    defpackage.alad.V(aladVarC3);
                                    ahtvVar = (defpackage.ahtv) aladVarC3;
                                    if (ahtvVar != null) {
                                        throw new defpackage.ahtw();
                                    }
                                    defpackage.ahys ahysVar3 = new defpackage.ahys(ahtvVar);
                                    fileInputStream.close();
                                    if (fileLockLock != null) {
                                        fileLockLock.close();
                                    }
                                    ahynVar = ahysVar3;
                                } catch (java.lang.Throwable th5) {
                                    try {
                                        fileInputStream.close();
                                        throw th5;
                                    } catch (java.lang.Throwable th6) {
                                        th5.addSuppressed(th6);
                                        throw th5;
                                    }
                                }
                            } catch (defpackage.alaz e2) {
                                throw new defpackage.ahtw(e2);
                            }
                        } else {
                            defpackage.ahwt ahwtVar = defpackage.ahwt.a;
                            if (fileLockLock != null) {
                                fileLockLock.close();
                            }
                            ahynVar = ahwtVar;
                        }
                    }
                } else if (file5.exists()) {
                    fileInputStream = new java.io.FileInputStream(file5);
                    defpackage.alad aladVarC4 = defpackage.alad.C(defpackage.ahtv.a, fileInputStream, akzqVar);
                    defpackage.alad.V(aladVarC4);
                    ahtvVar = (defpackage.ahtv) aladVarC4;
                    if (ahtvVar != null) {
                        throw new defpackage.ahtw();
                    }
                    defpackage.ahys ahysVar4 = new defpackage.ahys(ahtvVar);
                    fileInputStream.close();
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    ahynVar = ahysVar4;
                } else {
                    defpackage.ahwt ahwtVar2 = defpackage.ahwt.a;
                    if (fileLockLock != null) {
                        fileLockLock.close();
                    }
                    ahynVar = ahwtVar2;
                }
                fileInputStream3.close();
                return ahynVar;
            } catch (java.lang.Throwable th7) {
                if (fileLockLock == null) {
                    throw th7;
                }
                try {
                    fileLockLock.close();
                    throw th7;
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (java.lang.Throwable th9) {
            try {
                fileInputStream3.close();
                throw th9;
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    private static void g(java.io.File file) throws java.io.IOException {
        java.io.File file2 = new java.io.File(file, "tiktok_configuration");
        file2.mkdirs();
        java.io.File file3 = new java.io.File(file2, "CustomConfiguration.lock");
        file3.createNewFile();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file3);
        try {
            java.nio.channels.FileLock fileLockLock = ahus.h(fileOutputStream).lock();
            try {
                java.io.File file4 = new java.io.File(file2, "CustomConfiguration");
                if (file4.exists()) {
                    file4.delete();
                }
                java.io.File file5 = new java.io.File(file2, "CustomConfiguration.bak");
                if (file5.exists()) {
                    file5.delete();
                }
                if (fileLockLock != null) {
                    fileLockLock.close();
                }
                fileOutputStream.close();
            } catch (java.lang.Throwable th) {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private static void h(android.content.Context context, defpackage.ahtv ahtvVar, defpackage.ahua ahuaVar) throws java.io.IOException {
        java.io.File file = new java.io.File(b(context, ahuaVar), "tiktok_configuration");
        file.mkdirs();
        java.io.File file2 = new java.io.File(file, "CustomConfiguration.lock");
        file2.createNewFile();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
        try {
            java.nio.channels.FileLock fileLockLock = ahus.h(fileOutputStream).lock();
            try {
                java.io.File file3 = new java.io.File(file, "CustomConfiguration.tmp");
                if (file3.exists() && !file3.delete()) {
                    throw new java.io.IOException("Could not delete temp file");
                }
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file3);
                try {
                    ahtvVar.g(fileOutputStream2);
                    fileOutputStream2.getFD().sync();
                    fileOutputStream2.close();
                    try {
                        java.io.File file4 = new java.io.File(file, "CustomConfiguration");
                        java.io.File file5 = new java.io.File(file, "CustomConfiguration.bak");
                        if (file4.exists()) {
                            d(file4, file5);
                        }
                        d(file3, file4);
                        file3.delete();
                        if (fileLockLock != null) {
                            fileLockLock.close();
                        }
                        fileOutputStream.close();
                        return;
                    } catch (java.lang.Throwable th) {
                        file3.delete();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    try {
                        fileOutputStream2.close();
                    } catch (java.lang.Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (java.lang.Throwable th4) {
                if (fileLockLock != null) {
                    try {
                        fileLockLock.close();
                    } catch (java.lang.Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (java.lang.Throwable th6) {
            fileOutputStream.close();
            throw th6;
        }
        try {
            fileOutputStream.close();
        } catch (java.lang.Throwable th7) {
            th6.addSuppressed(th7);
        }
        throw th6;
    }

    public final defpackage.ahyn a(android.content.Context context, defpackage.akzq akzqVar, defpackage.ahua ahuaVar) {
        defpackage.ahyn ahynVarE = this.d;
        if (ahynVarE == null) {
            synchronized (this) {
                ahynVarE = this.d;
                if (ahynVarE == null) {
                    ahynVarE = e(b(context, ahuaVar), akzqVar);
                    if (ahuaVar == defpackage.ahua.b && !ahynVarE.f()) {
                        this.b = true;
                        ahynVarE = e(b(context, defpackage.ahua.a), akzqVar);
                    }
                    this.d = ahynVarE;
                }
            }
        }
        return ahynVarE;
    }

    public final synchronized void f(android.content.Context context, java.lang.Integer num, defpackage.ahua ahuaVar) {
        defpackage.ahyn ahynVarA;
        try {
            ahynVarA = a(context, defpackage.akzq.a, ahuaVar);
        } catch (defpackage.ahtw e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) c.c()).k(e)).l("com/google/apps/tiktok/ui/locale/LocaleDataStore", "writeInternal", (char) 244, "LocaleDataStore.java")).v("Custom config files seem corrupted. Overwriting files.");
            ahynVarA = defpackage.ahwt.a;
        }
        defpackage.akzz akzzVar = ahynVarA.f() ? (defpackage.akzz) ((defpackage.alad) ahynVarA.b()).L() : (defpackage.akzz) defpackage.ahtv.a.m();
        int iIntValue = num.intValue();
        akzzVar.u();
        defpackage.ahtv ahtvVar = (defpackage.ahtv) akzzVar.b;
        ahtvVar.b |= 1;
        ahtvVar.c = iIntValue;
        defpackage.ahtv ahtvVar2 = (defpackage.ahtv) akzzVar.r();
        h(context, ahtvVar2, ahuaVar);
        this.d = defpackage.ahyn.h(ahtvVar2);
        if (ahuaVar == defpackage.ahua.b) {
            c(context, defpackage.ahua.a);
        }
    }
}
