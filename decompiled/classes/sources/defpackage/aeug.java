package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeug {
    public static volatile defpackage.ahyn a;
    private static volatile defpackage.ahyn b;

    public static defpackage.ahyn a() {
        defpackage.ahyn ahysVar;
        defpackage.ahyn ahysVar2;
        long jSysconf = android.system.Os.sysconf(android.system.OsConstants._SC_CLK_TCK);
        long j = 0;
        defpackage.ahyn ahysVar3 = jSysconf > 0 ? new defpackage.ahys(java.lang.Long.valueOf(jSysconf)) : defpackage.ahwt.a;
        if (ahysVar3.f()) {
            android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
            byte[] bArr = new byte[440];
            boolean z = false;
            try {
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File("/proc/self/stat"));
                    try {
                        int i = fileInputStream.read(bArr);
                        fileInputStream.close();
                        android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr, 0, i);
                        byteBufferWrap.getClass();
                        ahysVar = new defpackage.ahys(byteBufferWrap);
                        if (ahysVar.f()) {
                            java.lang.Object objB = ahysVar.b();
                            long jLongValue = ((java.lang.Long) ahysVar3.b()).longValue();
                            while (true) {
                                java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) objB;
                                if (byteBuffer.remaining() > 17) {
                                    if (byteBuffer.get() == 40) {
                                        int i2 = 16;
                                        while (true) {
                                            if (i2 >= 0) {
                                                if (byteBuffer.get(byteBuffer.position() + i2) == 41) {
                                                    byteBuffer.position(byteBuffer.position() + i2 + 1);
                                                    if (byteBuffer.get() != 32 || !b(byteBuffer, 1) || !b(byteBuffer, 18)) {
                                                        break;
                                                    }
                                                    while (true) {
                                                        if (byteBuffer.hasRemaining()) {
                                                            byte b2 = byteBuffer.get();
                                                            if (b2 == 32) {
                                                                if (z) {
                                                                    ahysVar2 = new defpackage.ahys(java.lang.Long.valueOf(j));
                                                                    break;
                                                                }
                                                            } else if (b2 >= 48 && b2 <= 57 && j <= 922337203685477580L) {
                                                                j = (j * 10) + ((long) (b2 - 48));
                                                                z = true;
                                                            }
                                                        }
                                                        ahysVar2 = defpackage.ahwt.a;
                                                        break;
                                                    }
                                                }
                                                i2--;
                                            }
                                        }
                                    }
                                }
                                ahysVar2 = defpackage.ahwt.a;
                                break;
                            }
                            return !ahysVar2.f() ? defpackage.ahwt.a : new defpackage.ahys(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.SECONDS.toMillis(((java.lang.Long) ahysVar2.b()).longValue()) / jLongValue));
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.io.IOException unused) {
                    ahysVar = defpackage.ahwt.a;
                    android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            } catch (java.lang.Throwable th3) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        }
        return defpackage.ahwt.a;
    }

    private static boolean b(java.nio.ByteBuffer byteBuffer, int i) {
        while (byteBuffer.hasRemaining()) {
            if (i > 0) {
                if (byteBuffer.get() == 32) {
                    i--;
                }
            }
        }
        return i == 0;
    }
}
