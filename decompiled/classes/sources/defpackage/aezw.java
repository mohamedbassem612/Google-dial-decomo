package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezw {
    public static final java.lang.Object a = new java.lang.Object();
    public static final java.lang.Object b = new java.lang.Object();
    public final defpackage.ahzi c;
    public final defpackage.ahzi d;
    public final defpackage.ahzi e;
    public final defpackage.ahzi f;
    public volatile defpackage.aexv g;
    public final defpackage.ahzi h;
    public volatile defpackage.aexw i;
    private final android.content.Context j;
    private final defpackage.ahzi k;

    public aezw(android.content.Context context, defpackage.ahzi ahziVar, defpackage.ahzi ahziVar2) {
        this.j = context;
        this.d = ahziVar;
        this.c = ahziVar2;
        int i = 14;
        this.f = defpackage.ahvr.bI(new defpackage.jvu(context, "storage-info.pb", i));
        int i2 = defpackage.abyl.a;
        this.h = defpackage.ahvr.bI(new defpackage.jvu(aa$.ExternalSyntheticApiModelOutline1.m(context) ? context : aa$.ExternalSyntheticApiModelOutline1.m(context), "device-encrypted-storage-info.pb", i));
        this.e = defpackage.ahvr.bI(new defpackage.aeex(this, 17));
        this.k = defpackage.ahvr.bI(new defpackage.aeex(ahziVar, 18));
    }

    public static void e(java.lang.String str, defpackage.albh albhVar, java.lang.String str2) throws java.io.IOException {
        java.io.File file = new java.io.File(str);
        defpackage.aisq.b(file);
        java.io.File fileCreateTempFile = java.io.File.createTempFile(str2, ".pb", file.getParentFile());
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
            try {
                albhVar.h(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new java.io.IOException(java.lang.String.valueOf(fileCreateTempFile) + " could not be renamed to " + file.toString());
            } catch (java.lang.Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            fileCreateTempFile.delete();
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.StrictMode$ThreadPolicy] */
    public final defpackage.aexv a() {
        defpackage.aexv aexvVar;
        defpackage.aexv aexvVar2 = this.g;
        if (aexvVar2 == null) {
            synchronized (a) {
                aexvVar2 = this.g;
                if (aexvVar2 == null) {
                    android.os.StrictMode.ThreadPolicy threadPolicyH = defpackage.abyl.h(this.j);
                    if (threadPolicyH != 0) {
                        try {
                            threadPolicyH = android.os.StrictMode.allowThreadDiskWrites();
                            try {
                                java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.lang.String) this.f.eZ());
                                try {
                                    defpackage.akzq akzqVar = defpackage.akzq.a;
                                    defpackage.aexv aexvVar3 = defpackage.aexv.b;
                                    int i = defpackage.akzf.i;
                                    defpackage.alad aladVarD = defpackage.alad.D(aexvVar3, new defpackage.akze(fileInputStream, 4096), akzqVar);
                                    defpackage.alad.V(aladVarD);
                                    aexvVar = (defpackage.aexv) aladVarD;
                                    fileInputStream.close();
                                    android.os.StrictMode.setThreadPolicy(threadPolicyH);
                                    this.g = aexvVar;
                                    aexvVar2 = aexvVar;
                                } catch (java.lang.Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (java.io.IOException | java.lang.IllegalStateException unused) {
                                aexvVar = defpackage.aexv.b;
                            }
                        } catch (java.lang.Throwable th3) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyH);
                            throw th3;
                        }
                    } else {
                        aexvVar2 = defpackage.aexv.b;
                    }
                }
            }
        }
        return aexvVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [aexw] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aexw] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final defpackage.aexw b() {
        defpackage.aexw aexwVar;
        ?? r0;
        defpackage.aexw aexwVar2 = this.i;
        ?? r1 = aexwVar2;
        if (aexwVar2 == null) {
            synchronized (b) {
                ?? AllowThreadDiskWrites = this.i;
                r0 = AllowThreadDiskWrites;
                if (AllowThreadDiskWrites == 0) {
                    try {
                        AllowThreadDiskWrites = android.os.StrictMode.allowThreadDiskWrites();
                        try {
                            java.io.FileInputStream fileInputStream = new java.io.FileInputStream((java.lang.String) this.h.eZ());
                            try {
                                defpackage.akzq akzqVar = defpackage.akzq.a;
                                defpackage.aexw aexwVar3 = defpackage.aexw.b;
                                int i = defpackage.akzf.i;
                                defpackage.alad aladVarD = defpackage.alad.D(aexwVar3, new defpackage.akze(fileInputStream, 4096), akzqVar);
                                defpackage.alad.V(aladVarD);
                                aexwVar = (defpackage.aexw) aladVarD;
                                fileInputStream.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    fileInputStream.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (java.io.IOException | java.lang.IllegalStateException unused) {
                            aexwVar = defpackage.aexw.b;
                        }
                        android.os.StrictMode.setThreadPolicy(AllowThreadDiskWrites);
                        this.i = aexwVar;
                        r0 = aexwVar;
                    } catch (java.lang.Throwable th3) {
                        android.os.StrictMode.setThreadPolicy(AllowThreadDiskWrites);
                        throw th3;
                    }
                }
            }
            r1 = r0;
        }
        return r1;
    }

    public final defpackage.aezn c(boolean z) {
        boolean z2;
        defpackage.aify aifyVarN;
        defpackage.akzc akzcVar;
        java.lang.String str;
        defpackage.aify aifyVarN2;
        defpackage.aify aifyVarN3;
        int i;
        boolean z3;
        boolean z4;
        defpackage.aexu aexuVar;
        java.lang.String str2 = "";
        if (z) {
            defpackage.aexw aexwVarB = b();
            z2 = aexwVarB.e;
            aifyVarN = defpackage.aify.n(new defpackage.alam(aexwVarB.i, defpackage.aexw.a));
            akzcVar = aexwVarB.d;
            str = aexwVarB.f;
            aifyVarN2 = defpackage.aify.n(aexwVarB.g);
            aifyVarN3 = defpackage.aify.n(aexwVarB.h);
            if ((aexwVarB.c & 8) != 0) {
                defpackage.aexx aexxVar = aexwVarB.j;
                if (aexxVar == null) {
                    aexxVar = defpackage.aexx.a;
                }
                if (aexxVar.c == android.os.Build.VERSION.SDK_INT) {
                    defpackage.aexx aexxVar2 = aexwVarB.j;
                    if (aexxVar2 == null) {
                        aexxVar2 = defpackage.aexx.a;
                    }
                    str2 = aexxVar2.b;
                }
            }
            i = aexwVarB.c & 1;
            z3 = aexwVarB.l;
            z4 = aexwVarB.k;
            aexuVar = aexwVarB.m;
            if (aexuVar == null) {
                aexuVar = defpackage.aexu.a;
            }
        } else {
            defpackage.aexv aexvVarA = a();
            z2 = aexvVarA.e;
            aifyVarN = defpackage.aify.n(new defpackage.alam(aexvVarA.j, defpackage.aexv.a));
            akzcVar = aexvVarA.d;
            str = aexvVarA.f;
            aifyVarN2 = defpackage.aify.n(aexvVarA.h);
            aifyVarN3 = defpackage.aify.n(aexvVarA.i);
            if ((aexvVarA.c & 16) != 0) {
                defpackage.aexx aexxVar3 = aexvVarA.k;
                if (aexxVar3 == null) {
                    aexxVar3 = defpackage.aexx.a;
                }
                if (aexxVar3.c == android.os.Build.VERSION.SDK_INT) {
                    defpackage.aexx aexxVar4 = aexvVarA.k;
                    if (aexxVar4 == null) {
                        aexxVar4 = defpackage.aexx.a;
                    }
                    str2 = aexxVar4.b;
                }
            }
            i = aexvVarA.c & 1;
            z3 = aexvVarA.m;
            z4 = aexvVarA.l;
            aexuVar = aexvVarA.n;
            if (aexuVar == null) {
                aexuVar = defpackage.aexu.a;
            }
        }
        defpackage.aexu aexuVar2 = aexuVar;
        int i2 = i;
        defpackage.aify aifyVar = aifyVarN2;
        java.lang.String str3 = str;
        return new defpackage.aezn(z2, aifyVarN, akzcVar, str3, str2, aifyVar, aifyVarN3, 1 == i2, z3, z4, aexuVar2);
    }

    public final defpackage.ajcq d(boolean z) {
        defpackage.ajcu ajcuVar = (defpackage.ajcu) this.d.eZ();
        ajcuVar.getClass();
        return defpackage.ajck.w(z ? defpackage.aiql.A((defpackage.ajcq) this.k.eZ()) : defpackage.ajcm.a).y(new defpackage.afgz(this, 1), ajcuVar);
    }

    public final void f() {
        if (defpackage.abyl.h(this.j)) {
            long j = a().g;
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
            if (j + 86400000 < java.lang.System.currentTimeMillis()) {
                d(true);
                return;
            }
        }
        defpackage.ajcq ajcqVar = defpackage.ajcm.a;
    }
}
