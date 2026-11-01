package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appi implements apqd {
    private byte a;
    private final appx b;
    private final java.util.zip.Inflater c;
    private final defpackage.appj d;
    private final java.util.zip.CRC32 e;

    public appi(apqd apqdVar) {
        appx appxVar = new appx(apqdVar);
        this.b = appxVar;
        java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
        this.c = inflater;
        this.d = new defpackage.appj(appxVar, inflater);
        this.e = new java.util.zip.CRC32();
    }

    private final void c(apoy apoyVar, long j, long j2) {
        appy appyVar = apoyVar.a;
        aooh.c(appyVar);
        while (true) {
            long j3 = appyVar.c - appyVar.b;
            if (j < j3) {
                break;
            }
            appyVar = appyVar.f;
            aooh.c(appyVar);
            j -= j3;
        }
        while (j2 > 0) {
            int i = (int) (((long) appyVar.b) + j);
            int iMin = (int) java.lang.Math.min(appyVar.c - i, j2);
            this.e.update(appyVar.a, i, iMin);
            appyVar = appyVar.f;
            aooh.c(appyVar);
            j2 -= (long) iMin;
            j = 0;
        }
    }

    private static final void d(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (i2 == i) {
            return;
        }
        throw new java.io.IOException(str + ": actual 0x" + aoov.O(aoov.aU(i2), 8) + " != expected 0x" + aoov.O(aoov.aU(i), 8));
    }

    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        long j2;
        defpackage.appi appiVar = this;
        byte b = appiVar.a;
        long j3 = -1;
        if (b == 0) {
            appx appxVar = appiVar.b;
            appxVar.z(10L);
            apoy apoyVar2 = appxVar.b;
            byte bC = apoyVar2.c(3L);
            int i = (bC >> 1) & 1;
            if (i != 0) {
                appiVar.c(apoyVar2, 0L, 10L);
            }
            d("ID1ID2", 8075, appxVar.w());
            appxVar.A(8L);
            if (((bC >> 2) & 1) == 1) {
                appxVar.z(2L);
                if (i != 0) {
                    c(apoyVar2, 0L, 2L);
                }
                short sW = apoyVar2.w();
                long j4 = (char) ((short) (((sW >>> 8) & 255) | ((sW & 255) << 8)));
                appxVar.z(j4);
                if (i != 0) {
                    c(apoyVar2, 0L, j4);
                }
                appxVar.A(j4);
            }
            if (((bC >> 3) & 1) == 1) {
                long jC = appxVar.c((byte) 0, Long.MAX_VALUE);
                if (jC == -1) {
                    throw new java.io.EOFException();
                }
                long j5 = jC + 1;
                if (i != 0) {
                    j2 = Long.MAX_VALUE;
                    c(apoyVar2, 0L, j5);
                } else {
                    j2 = Long.MAX_VALUE;
                }
                appxVar.A(j5);
            } else {
                j3 = -1;
                j2 = Long.MAX_VALUE;
            }
            if (((bC >> 4) & 1) == 1) {
                long jC2 = appxVar.c((byte) 0, j2);
                if (jC2 == j3) {
                    throw new java.io.EOFException();
                }
                long j6 = jC2 + 1;
                if (i != 0) {
                    appiVar = this;
                    appiVar.c(apoyVar2, 0L, j6);
                } else {
                    appiVar = this;
                }
                appxVar.A(j6);
            } else {
                appiVar = this;
            }
            if (i != 0) {
                short sX = appxVar.x();
                java.util.zip.CRC32 crc32 = appiVar.e;
                d("FHCRC", sX, (short) crc32.getValue());
                crc32.reset();
            }
            appiVar.a = (byte) 1;
            b = 1;
        } else {
            j3 = -1;
        }
        if (b != 1) {
            if (b == 2) {
            }
            return j3;
        }
        long j7 = apoyVar.b;
        long jB = appiVar.d.b(apoyVar, 8192L);
        if (jB != j3) {
            appiVar.c(apoyVar, j7, jB);
            return jB;
        }
        appiVar.a = (byte) 2;
        appx appxVar2 = appiVar.b;
        d("CRC", appxVar2.g(), (int) appiVar.e.getValue());
        d("ISIZE", appxVar2.g(), (int) appiVar.c.getBytesWritten());
        appiVar.a = (byte) 3;
        if (!appxVar2.B()) {
            throw new java.io.IOException("gzip finished without exhausting source");
        }
        return j3;
    }

    public final void close() {
        this.d.close();
    }

    public final apqf fP() {
        return this.b.fP();
    }
}
