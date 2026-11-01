package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aisb extends defpackage.airl implements java.io.Serializable {
    public static final defpackage.airr a = new defpackage.aisb(false);
    public static final defpackage.airr b = new defpackage.aisb(true);
    private static final long serialVersionUID = 0;
    private final int c = 0;
    private final boolean d;

    static {
        int i = defpackage.airu.a;
    }

    public aisb(boolean z) {
        this.d = z;
    }

    public static int f(byte[] bArr, int i) {
        return (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static long g(char c) {
        return ((long) (c >>> '\f')) | 224 | ((long) ((((c >>> 6) & 63) | 128) << 8)) | ((long) (((c & '?') | 128) << 16));
    }

    public static long h(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | 128) << 8));
    }

    public static long i(int i) {
        return ((long) (i >>> 18)) | 240 | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    public static defpackage.airq j(int i, int i2) {
        int i3 = defpackage.airq.b;
        int i4 = i ^ i2;
        int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
        int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
        return new defpackage.airp(i6 ^ (i6 >>> 16));
    }

    @Override // defpackage.airl, defpackage.airr
    public final defpackage.airq b(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
        char c;
        int i;
        int i2;
        int i3;
        if (!charset.equals(java.nio.charset.StandardCharsets.UTF_8)) {
            return a(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int i4 = 0;
        int iRotateLeft = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + 4;
            c = 128;
            if (i6 > length) {
                i = -430675100;
                i2 = 461845907;
                i3 = -862048943;
                break;
            }
            char cCharAt = charSequence.charAt(i4);
            i = -430675100;
            char cCharAt2 = charSequence.charAt(i4 + 1);
            i2 = 461845907;
            char cCharAt3 = charSequence.charAt(i4 + 2);
            i3 = -862048943;
            char cCharAt4 = charSequence.charAt(i4 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iRotateLeft = (java.lang.Integer.rotateLeft(iRotateLeft ^ (java.lang.Integer.rotateLeft((((cCharAt | (cCharAt2 << '\b')) | (cCharAt3 << 16)) | (cCharAt4 << 24)) * (-862048943), 15) * 461845907), 13) * 5) - 430675100;
            i5 += 4;
            i4 = i6;
        }
        long jG = 0;
        int i7 = 0;
        while (i4 < length) {
            char cCharAt5 = charSequence.charAt(i4);
            if (cCharAt5 < c) {
                jG |= ((long) cCharAt5) << i7;
                i5++;
                i7 += 8;
            } else if (cCharAt5 < 2048) {
                jG |= h(cCharAt5) << i7;
                i5 += 2;
                i7 += 16;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jG |= g(cCharAt5) << i7;
                i5 += 3;
                i7 += 24;
            } else {
                int iCodePointAt = java.lang.Character.codePointAt(charSequence, i4);
                if (iCodePointAt == cCharAt5) {
                    return a(charSequence.toString().getBytes(charset));
                }
                i4++;
                jG |= i(iCodePointAt) << i7;
                if (this.d) {
                    i7 += 32;
                }
                i5 += 4;
            }
            if (i7 >= 32) {
                int iRotateLeft2 = java.lang.Integer.rotateLeft(iRotateLeft ^ (java.lang.Integer.rotateLeft(((int) jG) * i3, 15) * i2), 13) * 5;
                jG >>>= 32;
                iRotateLeft = iRotateLeft2 + i;
                i7 -= 32;
            }
            i4++;
            c = 128;
        }
        return j(iRotateLeft ^ (java.lang.Integer.rotateLeft(((int) jG) * i3, 15) * i2), i5);
    }

    @Override // defpackage.airl
    public final defpackage.airq d(byte[] bArr, int i) {
        int i2 = 0;
        defpackage.ahvr.bX(0, i, bArr.length);
        int i3 = 0;
        int iRotateLeft = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i) {
                break;
            }
            iRotateLeft = (-430675100) + (java.lang.Integer.rotateLeft(iRotateLeft ^ (java.lang.Integer.rotateLeft(f(bArr, i3) * (-862048943), 15) * 461845907), 13) * 5);
            i3 = i4;
        }
        int i5 = 0;
        while (i3 < i) {
            i2 ^= (bArr[i3] & 255) << i5;
            i3++;
            i5 += 8;
        }
        return j(iRotateLeft ^ (java.lang.Integer.rotateLeft(i2 * (-862048943), 15) * 461845907), i);
    }

    @Override // defpackage.airr
    public final defpackage.airs e() {
        return new aisa();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aisb)) {
            return false;
        }
        defpackage.aisb aisbVar = (defpackage.aisb) obj;
        int i = aisbVar.c;
        return this.d == aisbVar.d;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public final java.lang.String toString() {
        return "Hashing.murmur3_32(0)";
    }
}
