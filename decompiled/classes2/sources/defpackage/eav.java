package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class eav {
    static int a(int i) {
        int iM$3;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$3();
                } else if (i3 == 2) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m();
                } else if (i3 == 4) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$8();
                } else if (i3 == 8) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$7();
                } else if (i3 == 16) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$6();
                } else if (i3 == 32) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$5();
                } else if (i3 == 64) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$4();
                } else if (i3 == 128) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$1();
                }
                i2 |= iM$3;
            }
        }
        return i2;
    }

    public static egm h(egv egvVar, byte[] bArr) {
        if (egvVar.b() > 0) {
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        }
        if (egvVar.b() >= 0) {
            return new egk(bArr);
        }
        throw new java.lang.IllegalStateException("Wrote more data than expected.");
    }

    public static java.io.IOException i(java.io.File file, java.io.IOException iOException) {
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            return j(file, iOException);
        }
        if (!parentFile.exists()) {
            return j(file, iOException);
        }
        if (parentFile.isFile()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? j(file, iOException) : j(file, iOException);
            }
            return parentFile.canWrite() ? j(file, iOException) : j(file, iOException);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? j(file, iOException) : j(file, iOException);
        }
        return parentFile.canWrite() ? j(file, iOException) : j(file, iOException);
    }

    private static java.io.IOException j(java.io.File file, java.io.IOException iOException) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (java.io.IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new java.io.IOException(sb.toString(), iOException);
    }

    public boolean g() {
        throw null;
    }

    public void b(int i) {
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }

    public void e(int i) {
    }

    public void f(int i) {
    }
}
