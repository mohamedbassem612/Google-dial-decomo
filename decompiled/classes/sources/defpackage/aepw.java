package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aepw {
    public static volatile android.app.ActivityManager a;
    static volatile boolean b;
    private static volatile java.lang.String c;

    private aepw() {
    }

    public static defpackage.aepx a(android.content.Context context, java.lang.String str) {
        try {
            android.os.Trace.beginSection(str);
            java.lang.Object systemService = context.getSystemService("activity");
            if (systemService == null) {
                throw null;
            }
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
            defpackage.aepx aepxVar = runningAppProcesses == null ? new defpackage.aepx(false, defpackage.aike.a) : new defpackage.aepx(true, defpackage.aify.n(runningAppProcesses));
            android.os.Trace.endSection();
            return aepxVar;
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public static java.lang.String b() throws java.lang.Throwable {
        java.io.BufferedReader bufferedReader;
        if (c == null) {
            int iMyPid = android.os.Process.myPid();
            java.lang.String strTrim = null;
            strTrim = null;
            strTrim = null;
            java.io.BufferedReader bufferedReader2 = null;
            if (iMyPid > 0) {
                try {
                    try {
                        bufferedReader = new java.io.BufferedReader(new java.io.FileReader(defpackage.a.bs(iMyPid, "/proc/", "/cmdline")));
                        try {
                            java.lang.String line = bufferedReader.readLine();
                            defpackage.ahvr.ci(line);
                            strTrim = line.trim();
                        } catch (java.io.IOException unused) {
                            if (bufferedReader != null) {
                            }
                            if (strTrim != null) {
                                c = strTrim;
                            }
                            return c;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (java.io.IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (java.io.IOException unused3) {
                        bufferedReader = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                    bufferedReader.close();
                } catch (java.io.IOException unused4) {
                }
            }
            if (strTrim != null) {
                c = strTrim;
            }
        }
        return c;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        if (str2 == null || str == null || !str2.startsWith(str)) {
            return str2;
        }
        int length = str.length();
        if (str2.length() == length) {
            return null;
        }
        return str2.substring(length + 1);
    }

    public static boolean d(android.content.Context context, defpackage.aepx aepxVar) {
        if (!aepxVar.a) {
            return false;
        }
        boolean z = b;
        defpackage.aify<android.app.ActivityManager.RunningAppProcessInfo> aifyVarA = aepxVar.a();
        java.lang.String packageName = context.getPackageName();
        java.lang.String strValueOf = java.lang.String.valueOf(packageName);
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : aifyVarA) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
