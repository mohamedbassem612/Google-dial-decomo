package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewm {
    private static volatile defpackage.ahyn a;

    private aewm() {
    }

    public static defpackage.ahyn a(android.content.Context context) {
        defpackage.ahyn ahysVar;
        defpackage.ahyn ahysVar2;
        defpackage.ahyn ahynVar = a;
        if (ahynVar == null) {
            synchronized (defpackage.aewm.class) {
                ahynVar = a;
                if (ahynVar == null) {
                    java.lang.String str = android.os.Build.TYPE;
                    java.lang.String str2 = android.os.Build.TAGS;
                    int i = defpackage.aewo.a;
                    if ((str.equals("eng") || str.equals("userdebug")) && (str2.contains("dev-keys") || str2.contains("test-keys"))) {
                        int i2 = defpackage.abyl.a;
                        if (!aa$.ExternalSyntheticApiModelOutline1.m(context)) {
                            context = aa$.ExternalSyntheticApiModelOutline1.m(context);
                        }
                        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            android.os.StrictMode.allowThreadDiskWrites();
                            try {
                                java.io.File file = new java.io.File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                ahysVar = file.exists() ? new defpackage.ahys(file) : defpackage.ahwt.a;
                            } catch (java.lang.RuntimeException e) {
                                android.util.Log.e("HermeticFileOverrides", "no data dir", e);
                                ahysVar = defpackage.ahwt.a;
                            }
                            if (ahysVar.f()) {
                                java.lang.Object objB = ahysVar.b();
                                try {
                                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream((java.io.File) objB)));
                                    try {
                                        defpackage.aec aecVar = new defpackage.aec(0);
                                        java.util.HashMap map = new java.util.HashMap();
                                        while (true) {
                                            java.lang.String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            java.lang.String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                android.util.Log.e("HermeticFileOverrides", defpackage.a.bx(line, "Invalid: "));
                                            } else {
                                                java.lang.String str3 = new java.lang.String(strArrSplit[0]);
                                                java.lang.String strDecode = android.net.Uri.decode(new java.lang.String(strArrSplit[1]));
                                                java.lang.String strDecode2 = (java.lang.String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    java.lang.String str4 = new java.lang.String(strArrSplit[2]);
                                                    strDecode2 = android.net.Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                defpackage.aec aecVar2 = (defpackage.aec) aecVar.get(str3);
                                                if (aecVar2 == null) {
                                                    aecVar2 = new defpackage.aec(0);
                                                    aecVar.put(str3, aecVar2);
                                                }
                                                aecVar2.put(strDecode, strDecode2);
                                            }
                                        }
                                        android.util.Log.w("HermeticFileOverrides", "Parsed " + objB.toString() + " for Android package " + context.getPackageName());
                                        defpackage.xtq xtqVar = new defpackage.xtq(aecVar);
                                        bufferedReader.close();
                                        ahysVar2 = new defpackage.ahys(xtqVar);
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (java.lang.Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (java.io.IOException e2) {
                                    throw new java.lang.RuntimeException(e2);
                                }
                            } else {
                                ahysVar2 = defpackage.ahwt.a;
                            }
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (java.lang.Throwable th3) {
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        ahysVar2 = defpackage.ahwt.a;
                    }
                    a = ahysVar2;
                    ahynVar = ahysVar2;
                }
            }
        }
        return ahynVar;
    }
}
