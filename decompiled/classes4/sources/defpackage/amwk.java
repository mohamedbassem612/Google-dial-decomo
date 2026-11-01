package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwk {
    public static final byte[] a;
    private static final byte[] d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] e = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    public static final byte[] b = new byte[128];
    public static final java.nio.charset.Charset c = java.nio.charset.StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        a = bArr;
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 30; i++) {
            byte b2 = d[i];
            if (b2 > 0) {
                a[b2] = (byte) i;
            }
        }
        java.util.Arrays.fill(b, (byte) -1);
        for (int i2 = 0; i2 < 30; i2++) {
            byte b3 = e[i2];
            if (b3 > 0) {
                b[b3] = (byte) i2;
            }
        }
    }

    public static boolean a(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    public static boolean b(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static boolean c(char c2) {
        return a[c2] != -1;
    }

    public static boolean d(char c2) {
        return b[c2] != -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x0010  */
    public static void e(byte[] bArr, int i, int i2, java.lang.StringBuilder sb) {
        int i3 = 1;
        if (i != 1) {
            if (i % 6 == 0) {
                sb.append((char) 924);
            } else {
                sb.append((char) 901);
            }
            i3 = i;
        } else if (i2 == 0) {
            sb.append((char) 913);
        } else {
            i = 1;
            if (i % 6 == 0) {
                sb.append((char) 924);
            } else {
                sb.append((char) 901);
            }
            i3 = i;
        }
        int i4 = 0;
        if (i3 >= 6) {
            char[] cArr = new char[5];
            int i5 = 0;
            while (i3 - i5 >= 6) {
                long j = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j = (j << 8) + ((long) (bArr[i5 + i6] & 255));
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) (j % 900);
                    j /= 900;
                }
                for (int i8 = 4; i8 >= 0; i8--) {
                    sb.append(cArr[i8]);
                }
                i5 += 6;
            }
            i4 = i5;
        }
        while (i4 < i3) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }
}
