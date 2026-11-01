package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaco {
    private static defpackage.aaco b;
    private static volatile java.util.HashSet c;
    private static volatile java.util.HashSet d;
    public final android.content.Context a;
    private volatile java.lang.String e;

    public aaco(android.content.Context context) {
        this.a = context.getApplicationContext();
    }

    public static defpackage.aaco a(android.content.Context context) {
        defpackage.aaco aacoVar;
        if (context == null) {
            throw new java.lang.NullPointerException("null reference");
        }
        synchronized (defpackage.aaco.class) {
            aacoVar = b;
            if (aacoVar == null) {
                defpackage.aaci.a(context);
                aacoVar = new defpackage.aaco(context);
                b = aacoVar;
            }
        }
        return aacoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    public static final boolean d(android.content.pm.PackageInfo packageInfo, boolean z) {
        defpackage.aify aifyVarG;
        int i;
        if (packageInfo == null) {
            return false;
        }
        if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        try {
            defpackage.aify aifyVar = z ? defpackage.aach.b : defpackage.aach.a;
            int i2 = defpackage.aail.a;
            android.content.pm.SigningInfo signingInfoM = ft$.ExternalSyntheticApiModelOutline0.m(packageInfo);
            if (signingInfoM == null || ft$.ExternalSyntheticApiModelOutline0.m(signingInfoM) || ft$.ExternalSyntheticApiModelOutline0.m(signingInfoM) == null) {
                aifyVarG = defpackage.aike.a;
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                for (android.content.pm.Signature signature : ft$.ExternalSyntheticApiModelOutline0.m(signingInfoM)) {
                    aiftVar.i(signature.toByteArray());
                }
                aifyVarG = aiftVar.g();
            }
            if (aifyVarG.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Unable to obtain package certificate history.");
            }
            defpackage.aify aifyVarA = aifyVarG.a();
            int size = aifyVarA.size();
            int i3 = 0;
            while (i3 < size) {
                byte[] bArr = (byte[]) aifyVarA.get(i3);
                defpackage.ailk ailkVarListIterator = aifyVar.listIterator(0);
                while (true) {
                    i = i3 + 1;
                    if (ailkVarListIterator.hasNext()) {
                        if (java.util.Arrays.equals(bArr, (byte[]) ailkVarListIterator.next())) {
                            return true;
                        }
                    }
                }
                i3 = i;
            }
            return false;
        } catch (java.lang.IllegalArgumentException unused) {
            android.util.Log.i("GoogleSignatureVerifier", "package info is not set correctly");
            if ((z ? e(packageInfo, defpackage.aach.c) : e(packageInfo, defpackage.aach.c[0])) == null) {
                return false;
            }
        }
    }

    private static defpackage.aahd e(android.content.pm.PackageInfo packageInfo, defpackage.aahd... aahdVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        aacf aacfVar = new aacf(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < aahdVarArr.length; i++) {
            if (aahdVarArr[i].equals(aacfVar)) {
                return aahdVarArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private final aack f(java.lang.String str) {
        aack aackVar;
        aack aackVar2;
        if (str == null) {
            return new aack(false, "null pkg", (java.lang.Throwable) null);
        }
        java.util.HashSet hashSet = c;
        java.util.HashSet hashSet2 = d;
        int i = aaij.a;
        if (str.equals(this.e)) {
            return aack.a;
        }
        android.content.Context context = defpackage.aaci.c;
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        try {
            try {
                defpackage.aaci.b();
                aahh aahhVar = defpackage.aaci.d;
                android.os.Parcel parcelEQ = aahhVar.eQ(7, aahhVar.eP());
                boolean zG = defpackage.yld.g(parcelEQ);
                parcelEQ.recycle();
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zG) {
                    boolean zE = defpackage.aacn.e(this.a);
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zE);
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    boolValueOf.getClass();
                    bool.booleanValue();
                    android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = android.os.StrictMode.allowThreadDiskReads();
                    try {
                        defpackage.aais.as(defpackage.aaci.c);
                        try {
                            defpackage.aaci.b();
                            defpackage.aais.as(defpackage.aaci.c);
                            com.google.android.gms.common.GoogleCertificatesLookupQuery googleCertificatesLookupQuery = new com.google.android.gms.common.GoogleCertificatesLookupQuery(str, zE, false, new aala(defpackage.aaci.c), false, true, false);
                            try {
                                aahh aahhVar2 = defpackage.aaci.d;
                                android.os.Parcel parcelEP = aahhVar2.eP();
                                defpackage.yld.d(parcelEP, googleCertificatesLookupQuery);
                                android.os.Parcel parcelEQ2 = aahhVar2.eQ(6, parcelEP);
                                com.google.android.gms.common.GoogleCertificatesLookupResponse googleCertificatesLookupResponseA = defpackage.yld.a(parcelEQ2, com.google.android.gms.common.GoogleCertificatesLookupResponse.CREATOR);
                                parcelEQ2.recycle();
                                if (googleCertificatesLookupResponseA.a) {
                                    googleCertificatesLookupResponseA.b();
                                    long j = googleCertificatesLookupResponseA.e;
                                    aackVar = new aack(true, (java.lang.String) null, (java.lang.Throwable) null);
                                } else {
                                    java.lang.String str2 = googleCertificatesLookupResponseA.b;
                                    android.content.pm.PackageManager.NameNotFoundException nameNotFoundException = googleCertificatesLookupResponseA.a() == 4 ? new android.content.pm.PackageManager.NameNotFoundException() : null;
                                    if (str2 == null) {
                                        str2 = "error checking package certificate";
                                    }
                                    googleCertificatesLookupResponseA.b();
                                    googleCertificatesLookupResponseA.a();
                                    aackVar = new aack(false, str2, nameNotFoundException);
                                }
                            } catch (android.os.RemoteException e) {
                                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                aackVar2 = new aack(false, "module call", e);
                                aackVar = aackVar2;
                            }
                        } catch (defpackage.aali e2) {
                            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                            aackVar2 = new aack(false, "module init: ".concat(java.lang.String.valueOf(e2.getMessage())), e2);
                        }
                    } finally {
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                    }
                } else {
                    try {
                        threadPolicyAllowThreadDiskReads = 134217792;
                        android.content.pm.PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 134217792);
                        boolean zE2 = defpackage.aacn.e(this.a);
                        if (packageInfo == null) {
                            aackVar = new aack(false, "null pkg", (java.lang.Throwable) null);
                        } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                            aackVar = new aack(false, "single cert required", (java.lang.Throwable) null);
                        } else {
                            aacf aacfVar = new aacf(packageInfo.signatures[0].toByteArray());
                            java.lang.String str3 = packageInfo.packageName;
                            aack aackVarC = defpackage.aaci.c(str3, aacfVar, zE2, false);
                            aackVar = (!aackVarC.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !defpackage.aaci.c(str3, aacfVar, false, true).b) ? aackVarC : new aack(false, "debuggable release cert app rejected", (java.lang.Throwable) null);
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                        return new aack(false, "no pkg ".concat(str), e3);
                    }
                }
            } catch (java.lang.Throwable th) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        } catch (defpackage.aali | android.os.RemoteException e4) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        if (!aackVar.b) {
            return aackVar;
        }
        this.e = str;
        return aackVar;
    }

    public final boolean b(java.lang.String str) {
        aack aackVarF = f(str);
        aackVarF.b();
        return aackVarF.b;
    }

    public final boolean c(int i) {
        java.lang.String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        aack aackVar = null;
        if (packagesForUid == null || (packagesForUid.length) == 0) {
            aackVar = new aack(false, "no pkgs", (java.lang.Throwable) null);
        } else {
            for (java.lang.String str : packagesForUid) {
                aackVar = f(str);
                if (!aackVar.b) {
                }
            }
            defpackage.aais.as(aackVar);
        }
        aackVar.b();
        return aackVar.b;
    }
}
