package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apqh {
    public static final byte[] a = aoov.aI("0123456789abcdef");
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final java.lang.String a(apoy apoyVar, long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (apoyVar.c(j2) == 13) {
                java.lang.String strP = apoyVar.p(j2);
                apoyVar.A(2L);
                return strP;
            }
        }
        java.lang.String strP2 = apoyVar.p(j);
        apoyVar.A(1L);
        return strP2;
    }

    public static final long b(apoy apoyVar, appb appbVar, long j, long j2, int i) {
        appy appyVar;
        long j3 = j;
        long j4 = j2;
        aooh.f(appbVar, "bytes");
        long j5 = i;
        aoov.aV(appbVar.c(), 0L, j5);
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("byteCount == 0");
        }
        long j6 = 0;
        if (j3 < 0) {
            throw new java.lang.IllegalArgumentException(a.bz(j3, "fromIndex < 0: "));
        }
        if (j3 > j4) {
            throw new java.lang.IllegalArgumentException("fromIndex > toIndex: " + j3 + " > " + j4);
        }
        long j7 = apoyVar.b;
        if (j4 > j7) {
            j4 = j7;
        }
        if (j3 != j4 && (appyVar = apoyVar.a) != null) {
            if (j7 - j3 < j3) {
                while (j7 > j3) {
                    appyVar = appyVar.g;
                    aooh.c(appyVar);
                    j7 -= (long) (appyVar.c - appyVar.b);
                }
                if (appyVar != null) {
                    byte[] bArr = appbVar.b;
                    byte b2 = bArr[0];
                    long jMin = java.lang.Math.min(j4, (apoyVar.b - j5) + 1);
                    long j8 = j7;
                    while (j8 < jMin) {
                        byte[] bArr2 = appyVar.a;
                        int iMin = (int) java.lang.Math.min(appyVar.c, (((long) appyVar.b) + jMin) - j8);
                        int i2 = (int) ((((long) appyVar.b) + j3) - j8);
                        while (i2 < iMin) {
                            int i3 = i2 + 1;
                            if (bArr2[i2] == b2 && c(appyVar, i3, bArr, i)) {
                                return ((long) (i2 - appyVar.b)) + j8;
                            }
                            i2 = i3;
                        }
                        j8 += (long) (appyVar.c - appyVar.b);
                        appyVar = appyVar.f;
                        aooh.c(appyVar);
                        j3 = j8;
                    }
                }
            } else {
                while (true) {
                    long j9 = ((long) (appyVar.c - appyVar.b)) + j6;
                    if (j9 > j3) {
                        break;
                    }
                    appyVar = appyVar.f;
                    aooh.c(appyVar);
                    j6 = j9;
                }
                if (appyVar != null) {
                    byte[] bArr3 = appbVar.b;
                    byte b3 = bArr3[0];
                    long jMin2 = java.lang.Math.min(j4, (apoyVar.b - j5) + 1);
                    long j10 = j6;
                    while (j10 < jMin2) {
                        byte[] bArr4 = appyVar.a;
                        int iMin2 = (int) java.lang.Math.min(appyVar.c, (((long) appyVar.b) + jMin2) - j10);
                        int i4 = (int) ((((long) appyVar.b) + j3) - j10);
                        while (i4 < iMin2) {
                            int i5 = i4 + 1;
                            if (bArr4[i4] == b3 && c(appyVar, i5, bArr3, i)) {
                                return ((long) (i4 - appyVar.b)) + j10;
                            }
                            i4 = i5;
                        }
                        j10 += (long) (appyVar.c - appyVar.b);
                        appyVar = appyVar.f;
                        aooh.c(appyVar);
                        j3 = j10;
                    }
                }
            }
        }
        return -1L;
    }

    public static final boolean c(appy appyVar, int i, byte[] bArr, int i2) {
        aooh.f(appyVar, "segment");
        aooh.f(bArr, "bytes");
        int i3 = appyVar.c;
        byte[] bArr2 = appyVar.a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                appyVar = appyVar.f;
                aooh.c(appyVar);
                bArr2 = appyVar.a;
                i = appyVar.b;
                i3 = appyVar.c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
