package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apzu {
    public static final /* synthetic */ int a = 0;

    static {
        java.lang.Class cls = defpackage.apxh.a;
    }

    static int a(java.lang.String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i += (127 - cCharAt2) >>> 31;
                        } else {
                            i += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (java.lang.Character.codePointAt(str, i2) < 65536) {
                                    throw new defpackage.apzt(i2, length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i;
                    break;
                } catch (defpackage.apzt unused) {
                    return str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0 A[PHI: r4
      0x00a0: PHI (r4v7 byte) = (r4v6 byte), (r4v12 byte) binds: [B:41:0x009b, B:43:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00b8 A[SYNTHETIC] */
    static java.lang.String b(byte[] bArr, int i, int i2) throws defpackage.apym {
        if (i2 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!anty.aQ(b)) {
                break;
            }
            i++;
            anty.aO(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (anty.aQ(b2)) {
                anty.aO(b2, cArr, i4);
                i4++;
                i = i5;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (!anty.aQ(b3)) {
                        break;
                    }
                    i++;
                    anty.aO(b3, cArr, i4);
                    i4++;
                }
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw new defpackage.apym("Protocol message had invalid UTF-8.");
                }
                int i6 = i4 + 1;
                i += 2;
                byte b4 = bArr[i5];
                if (b2 < -62 || anty.aP(b4)) {
                    throw new defpackage.apym("Protocol message had invalid UTF-8.");
                }
                cArr[i4] = (char) (((b2 & 31) << 6) | (b4 & 63));
                i4 = i6;
            } else {
                if (b2 < -16) {
                    if (i5 >= i3 - 1) {
                        throw new defpackage.apym("Protocol message had invalid UTF-8.");
                    }
                    int i7 = i4 + 1;
                    int i8 = i + 2;
                    byte b5 = bArr[i5];
                    i += 3;
                    byte b6 = bArr[i8];
                    if (!anty.aP(b5)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!anty.aP(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i4 = i7;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!anty.aP(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i4 = i7;
                                }
                            }
                        } else if (b5 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!anty.aP(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i4 = i7;
                                }
                            } else if (b5 < -96) {
                                b2 = -19;
                                if (!anty.aP(b6)) {
                                    cArr[i4] = (char) (((b2 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                    i4 = i7;
                                }
                            }
                        }
                    }
                    throw new defpackage.apym("Protocol message had invalid UTF-8.");
                }
                if (i5 >= i3 - 2) {
                    throw new defpackage.apym("Protocol message had invalid UTF-8.");
                }
                byte b7 = bArr[i5];
                int i9 = i + 3;
                byte b8 = bArr[i + 2];
                i += 4;
                byte b9 = bArr[i9];
                if (anty.aP(b7) || (((b2 << 28) + (b7 + 112)) >> 30) != 0 || anty.aP(b8) || anty.aP(b9)) {
                    throw new defpackage.apym("Protocol message had invalid UTF-8.");
                }
                int i10 = ((b2 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                cArr[i4] = (char) ((i10 >>> 10) + 55232);
                cArr[i4 + 1] = (char) ((i10 & 1023) + 56320);
                i4 += 2;
            }
        }
        return new java.lang.String(cArr, 0, i4);
    }
}
