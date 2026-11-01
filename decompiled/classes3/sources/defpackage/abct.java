package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abct {
    public static final aihd a = aihd.r(zvj.b, zvj.c);
    public final java.lang.String b;
    public final defpackage.zvl c;
    public final ahyn d;
    public final defpackage.abcq e;
    public boolean f;
    private final aihd g;
    private final java.util.Random h;
    private java.lang.String i;

    public abct(java.lang.String str, defpackage.zvl zvlVar, defpackage.zvz zvzVar, defpackage.abcq abcqVar, aihd aihdVar) {
        this.f = true;
        ahvr.bZ(!android.text.TextUtils.isEmpty(str), "Given String is empty or null");
        this.b = str;
        ahvr.ci(zvlVar);
        this.c = zvlVar;
        this.d = ahyn.g(zvzVar);
        this.e = abcqVar;
        ahvr.ci(aihdVar);
        this.g = aihdVar;
        this.f = false;
        this.h = new java.util.Random();
    }

    public final boolean a(defpackage.abcv abcvVar) {
        defpackage.abdk abdkVar;
        long j;
        defpackage.abcu abcuVar = new defpackage.abcu(abcvVar);
        abcuVar.g = this;
        defpackage.abcv abcvVarA = abcuVar.a();
        if (!this.g.contains(abcvVarA.a)) {
            return false;
        }
        java.lang.String str = this.b;
        int i = 0;
        while (true) {
            if (i >= abcvVarA.b().size()) {
                abdkVar = null;
                break;
            }
            abdkVar = (defpackage.abdk) abcvVarA.b().get(i);
            if (abdkVar.d.equals(str)) {
                break;
            }
            i++;
        }
        if (abdkVar == null) {
            j = 0;
        } else {
            defpackage.abdl abdlVar = abdkVar.e;
            if (abdlVar == null) {
                abdlVar = defpackage.abdl.a;
            }
            j = abdlVar.d;
        }
        return j <= j$.time.Instant.now().toEpochMilli();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0235  */
    /* JADX WARN: Code duplicated, block: B:114:0x0238 A[Catch: all -> 0x024c, TryCatch #8 {all -> 0x024c, blocks: (B:84:0x01cb, B:88:0x01da, B:110:0x0229, B:115:0x024b, B:114:0x0238), top: B:141:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:11:0x006a  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca A[PHI: r2
      0x01ca: PHI (r2v4 abcv) = (r2v3 abcv), (r2v6 abcv) binds: [B:69:0x0199, B:75:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    public final defpackage.abcs b(defpackage.abcv abcvVar, defpackage.afpl afplVar, defpackage.abcq abcqVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        int iAa;
        defpackage.abcv abcvVarA;
        int i;
        ahyn ahynVarH;
        int i2;
        defpackage.abcv abcvVarA2 = abcvVar;
        java.lang.String str = this.b;
        android.util.Log.i(str.substring(0, java.lang.Math.min(str.length(), 23)), "Running fixer!");
        akzx akzxVarM = defpackage.zvk.a.m();
        akzxVarM.u();
        defpackage.zvk zvkVar = (defpackage.zvk) akzxVarM.b;
        zvkVar.g = abcvVarA2.a.a();
        zvkVar.b |= 16;
        akzx akzxVarP = ((defpackage.zvk) akzxVarM.p()).p();
        java.lang.String strSubstring = this.i;
        if (strSubstring == null) {
            java.lang.String packageName = abcvVarA2.b.getPackageName();
            java.lang.String strAp = agab.ap();
            if (strAp == null) {
                strSubstring = "";
            } else if (packageName == null || !strAp.startsWith(packageName)) {
                strSubstring = strAp;
            } else {
                int length = packageName.length();
                if (strAp.length() == length) {
                    strSubstring = "";
                } else {
                    strSubstring = strAp.substring(length + 1);
                }
            }
            this.i = strSubstring;
        }
        int i3 = 2;
        if (!strSubstring.isEmpty()) {
            java.lang.String str2 = this.i;
            akzxVarP.u();
            defpackage.zvk zvkVar2 = (defpackage.zvk) akzxVarP.b;
            j$.util.Objects.requireNonNull(str2);
            zvkVar2.b |= 2;
            zvkVar2.d = str2;
        }
        java.util.concurrent.ExecutorService executorService = null;
        try {
            defpackage.abcu abcuVar = new defpackage.abcu(abcvVarA2);
            abcuVar.b(new defpackage.abcr(this.e.a, 2));
            abcvVarA2 = abcuVar.a();
            java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
            try {
                try {
                    ahyn ahynVar = this.d;
                    try {
                        try {
                            abcvVarA = abcqVar.a(abcvVarA2, ahynVar);
                            try {
                                int i4 = abcvVarA.a(abcqVar.a).b;
                                if (i4 == 2) {
                                    defpackage.abcu abcuVar2 = new defpackage.abcu(abcvVarA);
                                    abcuVar2.e(abcqVar, 4);
                                    abcvVarA = abcuVar2.a();
                                    i4 = 5;
                                }
                                if (i4 == 5 && ahynVar.f() && (((defpackage.zvz) ahynVar.b()).b & 1) != 0) {
                                    defpackage.zvu zvuVar = ((defpackage.zvz) ahynVar.b()).e;
                                    if (zvuVar == null) {
                                        zvuVar = defpackage.zvu.a;
                                    }
                                    ahvr.ci(zvuVar);
                                    int i5 = zvuVar.b;
                                    int iX = a.X(i5);
                                    int i6 = iX - 1;
                                    if (iX == 0) {
                                        throw null;
                                    }
                                    if (i6 != 0) {
                                        if (i6 == 1) {
                                            android.util.Log.w("AppDoctorRestartUtil", "Specific process_name in post_fix_restart is only supported by PROCESS_RESTART fix. Use current_process or all_processes instead.");
                                        } else if (i6 != 2) {
                                            if (i6 != 3) {
                                                throw new java.lang.RuntimeException(null, null);
                                            }
                                            android.util.Log.w("AppDoctorRestartUtil", "ProcessRestartFixConfig in post_fix_restart has no restart choice configured.");
                                        } else if (i5 == 3 && ((java.lang.Boolean) zvuVar.c).booleanValue()) {
                                            defpackage.abcu abcuVar3 = new defpackage.abcu(abcvVarA);
                                            abcuVar3.d();
                                            abcvVarA = abcuVar3.a();
                                        }
                                    } else if (i5 == 1 && ((java.lang.Boolean) zvuVar.c).booleanValue()) {
                                        defpackage.abcu abcuVar4 = new defpackage.abcu(abcvVarA);
                                        abcuVar4.c();
                                        abcvVarA = abcuVar4.a();
                                    }
                                }
                            } catch (java.lang.RuntimeException e) {
                                e = e;
                                java.lang.String strB = abcqVar.b();
                                afsq.cG(e, abcvVarA, strB.substring(0, java.lang.Math.min(strB.length(), 23)));
                                defpackage.abcu abcuVar5 = new defpackage.abcu(abcvVarA);
                                abcuVar5.e(abcqVar, 6);
                                abcvVarA = abcuVar5.a();
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            iAa = a.aa(((defpackage.zvk) akzxVarP.b).f);
                            if (iAa != 0) {
                                akzxVarP.u();
                                defpackage.zvk zvkVar3 = (defpackage.zvk) akzxVarP.b;
                                zvkVar3.f = a.S(i3);
                                zvkVar3.b |= 8;
                            } else {
                                akzxVarP.u();
                                defpackage.zvk zvkVar4 = (defpackage.zvk) akzxVarP.b;
                                zvkVar4.f = a.S(i3);
                                zvkVar4.b |= 8;
                            }
                            throw th;
                        }
                    } catch (java.lang.RuntimeException e2) {
                        e = e2;
                        abcvVarA = abcvVarA2;
                    }
                    try {
                        try {
                            ahynVarH = (ahyn) aiql.z(ahyn.h(abcvVarA)).get(-1L, java.util.concurrent.TimeUnit.MILLISECONDS);
                            i2 = 2;
                            i = 6;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            i = 6;
                            i3 = i;
                            iAa = a.aa(((defpackage.zvk) akzxVarP.b).f);
                            if (iAa != 0 || iAa != 4) {
                                akzxVarP.u();
                                defpackage.zvk zvkVar5 = (defpackage.zvk) akzxVarP.b;
                                zvkVar5.f = a.S(i3);
                                zvkVar5.b |= 8;
                            }
                            throw th;
                        }
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
                        defpackage.abcu abcuVar6 = new defpackage.abcu(abcvVarA2);
                        i = 6;
                        try {
                            abcuVar6.e(abcqVar, 6);
                            ahynVarH = ahyn.h(abcuVar6.a());
                            i2 = 6;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            i3 = i;
                            iAa = a.aa(((defpackage.zvk) akzxVarP.b).f);
                            if (iAa != 0) {
                                akzxVarP.u();
                                defpackage.zvk zvkVar6 = (defpackage.zvk) akzxVarP.b;
                                zvkVar6.f = a.S(i3);
                                zvkVar6.b |= 8;
                            } else {
                                akzxVarP.u();
                                defpackage.zvk zvkVar7 = (defpackage.zvk) akzxVarP.b;
                                zvkVar7.f = a.S(i3);
                                zvkVar7.b |= 8;
                            }
                            throw th;
                        }
                    }
                    try {
                        if (ahynVarH.f()) {
                            abcvVarA2 = c((defpackage.abcv) ahynVarH.b(), abcqVar, afplVar);
                            defpackage.zvl zvlVar = abcqVar.a;
                            if (abcvVarA2.a(zvlVar).b != 2) {
                                int i7 = abcvVarA2.a(zvlVar).b - 2;
                                if (i7 != 0) {
                                    if (i7 == 1) {
                                        i3 = 5;
                                    } else if (i7 != 3) {
                                        i3 = i7 != 4 ? 3 : i;
                                    } else {
                                        i3 = 4;
                                    }
                                }
                            } else {
                                i3 = i2;
                            }
                        } else {
                            i3 = 5;
                        }
                        int iAa2 = a.aa(((defpackage.zvk) akzxVarP.b).f);
                        if (iAa2 == 0 || iAa2 != 4) {
                            akzxVarP.u();
                            defpackage.zvk zvkVar8 = (defpackage.zvk) akzxVarP.b;
                            zvkVar8.f = a.S(i3);
                            zvkVar8.b |= 8;
                        }
                        if (executorServiceNewSingleThreadExecutor != null) {
                            try {
                                executorServiceNewSingleThreadExecutor.shutdownNow();
                            } catch (java.lang.SecurityException e3) {
                                android.util.Log.e("App_Doctor_Fixer", "Exception shutting down executor, we may leak a thread: ".concat(e3.toString()));
                            }
                        }
                        if (this.h.nextFloat() < 1.0d) {
                            abcvVarA2.c.a((defpackage.zvk) akzxVarP.p());
                        }
                        return new defpackage.abcs(this, abcvVarA2);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        i3 = i2;
                        iAa = a.aa(((defpackage.zvk) akzxVarP.b).f);
                        if (iAa != 0) {
                            akzxVarP.u();
                            defpackage.zvk zvkVar9 = (defpackage.zvk) akzxVarP.b;
                            zvkVar9.f = a.S(i3);
                            zvkVar9.b |= 8;
                        } else {
                            akzxVarP.u();
                            defpackage.zvk zvkVar10 = (defpackage.zvk) akzxVarP.b;
                            zvkVar10.f = a.S(i3);
                            zvkVar10.b |= 8;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                executorService = executorServiceNewSingleThreadExecutor;
                if (executorService != null) {
                    try {
                        executorService.shutdownNow();
                    } catch (java.lang.SecurityException e4) {
                        android.util.Log.e("App_Doctor_Fixer", "Exception shutting down executor, we may leak a thread: ".concat(e4.toString()));
                    }
                }
                if (this.h.nextFloat() >= 1.0d) {
                    throw th;
                }
                abcvVarA2.c.a((defpackage.zvk) akzxVarP.p());
                throw th;
            }
        } catch (java.lang.Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final defpackage.abcv c(defpackage.abcv abcvVar, defpackage.abcq abcqVar, defpackage.afpl afplVar) {
        long millis;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        defpackage.zvl zvlVar = abcqVar.a;
        int i = abcvVar.a(zvlVar).b;
        if (i == 5) {
            millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(abcqVar.b);
        } else {
            millis = 3600000;
        }
        long j = millis + epochMilli;
        akzx akzxVarM = defpackage.abdk.a.m();
        java.lang.String str = this.b;
        akzxVarM.u();
        defpackage.abdk abdkVar = (defpackage.abdk) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        abdkVar.d = str;
        akzxVarM.u();
        ((defpackage.abdk) akzxVarM.b).c = zvlVar.a();
        akzx akzxVarM2 = defpackage.abdl.a.m();
        akzxVarM2.u();
        defpackage.abdl abdlVar = (defpackage.abdl) akzxVarM2.b;
        abdlVar.e = a.S(i);
        abdlVar.b |= 4;
        akzxVarM2.u();
        defpackage.abdl abdlVar2 = (defpackage.abdl) akzxVarM2.b;
        abdlVar2.b |= 1;
        abdlVar2.c = epochMilli;
        akzxVarM2.u();
        defpackage.abdl abdlVar3 = (defpackage.abdl) akzxVarM2.b;
        abdlVar3.b |= 2;
        abdlVar3.d = j;
        defpackage.abdl abdlVar4 = (defpackage.abdl) akzxVarM2.p();
        akzxVarM.u();
        defpackage.abdk abdkVar2 = (defpackage.abdk) akzxVarM.b;
        j$.util.Objects.requireNonNull(abdlVar4);
        abdkVar2.e = abdlVar4;
        abdkVar2.b |= 1;
        defpackage.abdk abdkVar3 = (defpackage.abdk) akzxVarM.p();
        try {
            ((afhf) afplVar.a).a(new defpackage.zqi(abdkVar3, 7), (java.util.concurrent.Executor) afplVar.b).s();
            defpackage.abcu abcuVar = new defpackage.abcu(abcvVar);
            aift aiftVar = new aift(4);
            aiftVar.k(abcuVar.e);
            aiftVar.i(abdkVar3);
            abcuVar.e = aiftVar.h();
            return abcuVar.a();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.IllegalArgumentException("Update of recent fix data failed", e);
        }
    }
}
