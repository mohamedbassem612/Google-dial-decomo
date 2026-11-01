package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fuw {
    public boolean c;
    public boolean d;
    public boolean e;
    public final defpackage.euk a = new defpackage.euk(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final defpackage.etx b = new defpackage.etx();

    public fuw(byte[] bArr) {
    }

    public static long b(defpackage.etx etxVar) {
        int i = etxVar.c;
        if (etxVar.d() >= 9) {
            byte[] bArr = new byte[9];
            etxVar.L(bArr, 0, 9);
            etxVar.Q(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        long j3 = (j & 56) >> 3;
                        return (j3 << 30) | ((j & 3) << 28) | ((bArr[1] & 255) << 20) | (((248 & j2) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    public static final int d(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public final void a(defpackage.flk flkVar) {
        this.b.N(eum.b);
        this.c = true;
        flkVar.k();
    }

    public final void c(defpackage.flk flkVar) {
        this.b.N(eum.b);
        this.c = true;
        flkVar.k();
    }

    public fuw() {
    }
}
