package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiyz {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.ahxn b = new defpackage.ahxd('.');
    private static final defpackage.ahxn c = new defpackage.ahxd(':');

    static {
    }

    public static java.net.InetAddress a(byte[] bArr, java.lang.String str) {
        int i;
        try {
            java.net.InetAddress byAddress = java.net.InetAddress.getByAddress(bArr);
            if (str == null) {
                return byAddress;
            }
            if (!(byAddress instanceof java.net.Inet6Address)) {
                throw new java.lang.IllegalArgumentException("Unexpected state, scope should only appear for ipv6");
            }
            java.net.Inet6Address inet6Address = (java.net.Inet6Address) byAddress;
            int length = str.length();
            long j = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    if (j <= 2147483647L) {
                        i = (int) j;
                        break;
                    }
                    break;
                }
                if (j <= 2147483647L) {
                    long j2 = j * 10;
                    int iDigit = java.lang.Character.digit(str.charAt(i2), 10);
                    if (iDigit >= 0) {
                        j = j2 + ((long) iDigit);
                        i2++;
                    }
                }
                i = -1;
                break;
            }
            if (i != -1) {
                return java.net.Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
            }
            try {
                java.net.NetworkInterface byName = java.net.NetworkInterface.getByName(str);
                if (byName != null) {
                    return java.net.Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw d("No such interface: '%s'", str);
            } catch (java.net.SocketException | java.net.UnknownHostException e) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bx(str, "No such interface: "), e);
            }
        } catch (java.net.UnknownHostException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    public static java.net.InetAddress b(java.lang.String str) {
        defpackage.aiyy aiyyVar = new defpackage.aiyy();
        byte[] bArrC = c(str, aiyyVar);
        if (bArrC != null) {
            return a(bArrC, (java.lang.String) aiyyVar.a);
        }
        throw d("'%s' is not an IP string literal.", str);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[PHI: r13
      0x0080: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v13 java.lang.String) binds: [B:19:0x0035, B:24:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106 A[Catch: NumberFormatException -> 0x0152, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x010c A[Catch: NumberFormatException -> 0x0152, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0116  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119 A[Catch: NumberFormatException -> 0x0152, LOOP:3: B:72:0x0117->B:73:0x0119, LOOP_END, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x011f A[Catch: NumberFormatException -> 0x0152, TryCatch #0 {NumberFormatException -> 0x0152, blocks: (B:61:0x00f9, B:64:0x0100, B:66:0x0106, B:68:0x010c, B:69:0x0110, B:73:0x0119, B:82:0x013b, B:74:0x011f, B:80:0x0129, B:81:0x0137, B:83:0x013e, B:84:0x0143), top: B:93:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    public static byte[] c(java.lang.String str, defpackage.aiyy aiyyVar) {
        int iL;
        int i;
        int i2;
        java.nio.ByteBuffer byteBufferAllocate;
        int i3;
        int iIndexOf;
        int i4;
        int i5;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (i6 >= str.length()) {
                i6 = -1;
                break;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt == '.') {
                z = true;
            } else {
                if (cCharAt != ':') {
                    if (cCharAt == '%') {
                        break;
                    }
                    if (java.lang.Character.digit(cCharAt, 16) != -1) {
                    }
                    return null;
                }
                if (z) {
                    return null;
                }
                z = false;
                z2 = true;
            }
            i6++;
        }
        if (z2) {
            if (z) {
                int iLastIndexOf = str.lastIndexOf(58) + 1;
                java.lang.String strSubstring = str.substring(0, iLastIndexOf);
                byte[] bArrE = e(str.substring(iLastIndexOf));
                str = bArrE == null ? null : strSubstring + java.lang.Integer.toHexString(((bArrE[0] & 255) << 8) | (bArrE[1] & 255)) + ':' + java.lang.Integer.toHexString(((bArrE[2] & 255) << 8) | (bArrE[3] & 255));
                if (str != null) {
                    if (i6 != -1) {
                        if (aiyyVar != null) {
                            aiyyVar.a = str.substring(i6 + 1);
                        }
                        str = str.substring(0, i6);
                    }
                    iL = c.l(str);
                    if (iL >= 2 && iL <= 8) {
                        int i7 = iL + 1;
                        i = 8 - i7;
                        i2 = 0;
                        boolean z3 = false;
                        while (i2 < str.length() - 1) {
                            if (str.charAt(i2) != ':' && str.charAt(i2 + 1) == ':') {
                                if (!z3) {
                                    int i8 = i + 1;
                                    if (i2 == 0) {
                                        i8 = i + 2;
                                        i2 = 0;
                                    }
                                    if (i2 == str.length() - 2) {
                                        i8++;
                                    }
                                    i = i8;
                                    z3 = true;
                                }
                            }
                            i2++;
                        }
                        if ((str.charAt(0) == ':' || str.charAt(1) == ':') && ((str.charAt(str.length() - 1) != ':' || str.charAt(str.length() - 2) == ':') && (!z3 ? i7 == 8 : i > 0))) {
                            byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
                            try {
                                i3 = str.charAt(0) != ':' ? 0 : 1;
                                while (i3 < str.length()) {
                                    iIndexOf = str.indexOf(58, i3);
                                    if (iIndexOf == -1) {
                                        iIndexOf = str.length();
                                    }
                                    if (str.charAt(i3) == ':') {
                                        for (i5 = 0; i5 < i; i5++) {
                                            byteBufferAllocate.putShort((short) 0);
                                        }
                                    } else {
                                        i4 = iIndexOf - i3;
                                        if (i4 > 0 || i4 > 4) {
                                            throw new java.lang.NumberFormatException();
                                        }
                                        int iDigit = 0;
                                        while (i3 < iIndexOf) {
                                            iDigit = (iDigit << 4) | java.lang.Character.digit(str.charAt(i3), 16);
                                            i3++;
                                        }
                                        byteBufferAllocate.putShort((short) iDigit);
                                    }
                                    i3 = iIndexOf + 1;
                                }
                                return byteBufferAllocate.array();
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if (i6 != -1) {
                    if (aiyyVar != null) {
                        aiyyVar.a = str.substring(i6 + 1);
                    }
                    str = str.substring(0, i6);
                }
                iL = c.l(str);
                if (iL >= 2) {
                    int i9 = iL + 1;
                    i = 8 - i9;
                    i2 = 0;
                    boolean z4 = false;
                    while (i2 < str.length() - 1) {
                        if (str.charAt(i2) != ':') {
                        }
                        i2++;
                    }
                    if (str.charAt(0) == ':') {
                        byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
                        if (str.charAt(0) != ':') {
                        }
                        while (i3 < str.length()) {
                            iIndexOf = str.indexOf(58, i3);
                            if (iIndexOf == -1) {
                                iIndexOf = str.length();
                            }
                            if (str.charAt(i3) == ':') {
                                i4 = iIndexOf - i3;
                                if (i4 > 0) {
                                }
                                throw new java.lang.NumberFormatException();
                            }
                            while (i5 < i) {
                                byteBufferAllocate.putShort((short) 0);
                            }
                            i3 = iIndexOf + 1;
                        }
                        return byteBufferAllocate.array();
                    }
                    byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
                    if (str.charAt(0) != ':') {
                    }
                    while (i3 < str.length()) {
                        iIndexOf = str.indexOf(58, i3);
                        if (iIndexOf == -1) {
                            iIndexOf = str.length();
                        }
                        if (str.charAt(i3) == ':') {
                            i4 = iIndexOf - i3;
                            if (i4 > 0) {
                            }
                            throw new java.lang.NumberFormatException();
                        }
                        while (i5 < i) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                        i3 = iIndexOf + 1;
                    }
                    return byteBufferAllocate.array();
                }
            }
        } else if (z && i6 == -1) {
            return e(str);
        }
        return null;
    }

    private static java.lang.IllegalArgumentException d(java.lang.String str, java.lang.Object... objArr) {
        return new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ROOT, str, objArr));
    }

    private static byte[] e(java.lang.String str) {
        if (b.l(str) + 1 == 4) {
            byte[] bArr = new byte[4];
            int i = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                int iIndexOf = str.indexOf(46, i);
                if (iIndexOf == -1) {
                    iIndexOf = str.length();
                }
                int i3 = iIndexOf - i;
                if (i3 <= 0 || i3 > 3) {
                    throw new java.lang.NumberFormatException();
                }
                if (i3 > 1) {
                    try {
                        if (str.charAt(i) == '0') {
                            throw new java.lang.NumberFormatException();
                        }
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                int i4 = 0;
                while (i < iIndexOf) {
                    int i5 = i4 * 10;
                    int iDigit = java.lang.Character.digit(str.charAt(i), 10);
                    if (iDigit < 0) {
                        throw new java.lang.NumberFormatException();
                    }
                    i4 = i5 + iDigit;
                    i++;
                }
                if (i4 > 255) {
                    throw new java.lang.NumberFormatException();
                }
                bArr[i2] = (byte) i4;
                i = iIndexOf + 1;
            }
            return bArr;
        }
        return null;
    }
}
