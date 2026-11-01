package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajks {
    public static final byte[] a = c(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;

    static {
        c(1, 2);
        b = c(2, 32);
        c = c(2, 16);
        d = c(2, 17);
        e = c(2, 18);
        c(2, 25722);
        f = c(2, 1);
        g = c(2, 2);
        h = c(2, 3);
        i = c(2, 1);
        j = c(2, 2);
        k = c(2, 3);
        l = new byte[0];
        n = "KEM".getBytes(defpackage.ajnf.a);
        m = "HPKE".getBytes(defpackage.ajnf.a);
        o = "HPKE-v1".getBytes(defpackage.ajnf.a);
    }

    public static int a(ajjp ajjpVar) {
        if (ajjpVar == ajjp.f) {
            return 32;
        }
        if (ajjpVar == ajjp.a) {
            return 65;
        }
        if (ajjpVar == ajjp.b) {
            return 97;
        }
        if (ajjpVar == ajjp.c) {
            return 133;
        }
        if (ajjpVar == ajjp.g) {
            return 1120;
        }
        throw new java.lang.IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(ajjpVar.toString()));
    }

    public static int b(ajjp ajjpVar) throws java.security.GeneralSecurityException {
        if (ajjpVar == ajjp.f || ajjpVar == ajjp.a) {
            return 32;
        }
        if (ajjpVar == ajjp.b) {
            return 48;
        }
        if (ajjpVar == ajjp.c) {
            return 66;
        }
        if (ajjpVar == ajjp.g) {
            return 32;
        }
        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static byte[] c(int i2, int i3) {
        if (i3 < 0 || i3 >= (1 << (i2 << 3))) {
            throw new java.lang.IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i3 >> (((i2 - i4) - 1) << 3)) & 255);
        }
        return bArr;
    }

    static byte[] d(byte[] bArr) {
        return agmc.aw(new byte[][]{n, bArr});
    }

    public static byte[] e(java.lang.String str, byte[] bArr, byte[] bArr2) {
        return agmc.aw(new byte[][]{o, bArr2, str.getBytes(defpackage.ajnf.a), bArr});
    }

    public static byte[] f(java.lang.String str, byte[] bArr, byte[] bArr2, int i2) {
        return agmc.aw(new byte[][]{c(2, i2), o, bArr2, str.getBytes(defpackage.ajnf.a), bArr});
    }
}
