package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class absd {
    private static final aimz a = aimz.i("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils");

    public static abse a(java.io.File file) {
        java.io.File file2;
        abse abseVar;
        if (file.isDirectory()) {
            return abse.a;
        }
        android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
        byte[] bArr = new byte[62];
        try {
            try {
                file2 = file;
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file2);
                    try {
                        int iD = aisk.d(fileInputStream, bArr, 62);
                        long j = -1;
                        boolean z = false;
                        int i = 0;
                        long j2 = 0;
                        long j3 = -1;
                        int i2 = 0;
                        while (i2 < iD) {
                            i2++;
                            byte b = bArr[i2];
                            if (b == 32) {
                                if (!z) {
                                    break;
                                }
                                if (i != 0) {
                                    if (i != 1) {
                                        break;
                                    }
                                    j = j2;
                                } else {
                                    j3 = j2;
                                }
                                i++;
                                z = false;
                                j2 = 0;
                            } else {
                                if (b < 48 || b > 57 || j2 > 922337203685477580L) {
                                    break;
                                }
                                j2 = (j2 * 10) + ((long) (b - 48));
                                z = true;
                            }
                            android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            return abseVar;
                        }
                        if (i != 2) {
                            throw new java.text.ParseException("Failed to parse SchedStat", i);
                        }
                        abse abseVar2 = new abse(j3, j, j2);
                        fileInputStream.close();
                        abseVar = abseVar2;
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        return abseVar;
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.io.IOException e) {
                    e = e;
                    a.d().k(e).l("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java").y("Failed to read SchedStat for thread %s", file2.getName());
                    abseVar = abse.a;
                } catch (java.text.ParseException e2) {
                    e = e2;
                    a.d().k(e).l("com/google/android/libraries/concurrent/threadpool/ProcSchedStatUtils", "getThreadSchedStat", 87, "ProcSchedStatUtils.java").y("Failed to read SchedStat for thread %s", file2.getName());
                    abseVar = abse.a;
                }
            } catch (java.lang.Throwable th3) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        } catch (java.io.IOException | java.text.ParseException e3) {
            e = e3;
            file2 = file;
        }
    }
}
