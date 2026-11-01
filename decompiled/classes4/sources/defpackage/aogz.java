package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogz {
    public java.lang.String a;
    public java.lang.String b;
    public int c = -1;

    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[LOOP:3: B:28:0x0057->B:38:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078 A[LOOP:2: B:21:0x0045->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:1: B:46:0x0089->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x009b A[EDGE_INSN: B:72:0x009b->B:50:0x009b BREAK  A[LOOP:1: B:46:0x0089->B:49:0x0095], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00b6 A[SYNTHETIC] */
    public static java.net.InetAddress b(java.lang.String str, int i) {
        int i2;
        int i3;
        char cCharAt;
        int i4;
        int i5;
        int iA;
        byte[] bArr = new byte[16];
        int i6 = 1;
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        while (i6 < i) {
            if (i9 != 16) {
                int i10 = i6 + 2;
                if (i10 > i || !str.regionMatches(i6, "::", 0, 2)) {
                    if (i9 != 0) {
                        if (!str.regionMatches(i6, ":", 0, 1)) {
                            if (str.regionMatches(i6, ".", 0, 1)) {
                                int i11 = i9 - 2;
                                int i12 = i11;
                                while (i8 < i) {
                                    if (i12 != 16) {
                                        if (i12 == i11) {
                                            i2 = 0;
                                            i3 = i8;
                                            while (i3 < i) {
                                                cCharAt = str.charAt(i3);
                                                if (cCharAt < '0' || cCharAt > '9') {
                                                    break;
                                                }
                                                if (i2 != 0) {
                                                    i2 = ((i2 * 10) + cCharAt) - 48;
                                                    if (i2 <= 255) {
                                                        i3++;
                                                    }
                                                } else if (i8 == i3) {
                                                    i2 = 0;
                                                    i2 = ((i2 * 10) + cCharAt) - 48;
                                                    if (i2 <= 255) {
                                                        i3++;
                                                    }
                                                }
                                            }
                                            if (i3 - i8 != 0) {
                                                bArr[i12] = (byte) i2;
                                                i12++;
                                                i8 = i3;
                                            }
                                        } else if (str.charAt(i8) == '.') {
                                            i8++;
                                            i2 = 0;
                                            i3 = i8;
                                            while (i3 < i) {
                                                cCharAt = str.charAt(i3);
                                                if (cCharAt < '0') {
                                                    break;
                                                }
                                                break;
                                                break;
                                            }
                                            if (i3 - i8 != 0) {
                                                bArr[i12] = (byte) i2;
                                                i12++;
                                                i8 = i3;
                                            }
                                        }
                                    }
                                }
                                if (i12 == i9 + 2) {
                                    i9 += 2;
                                    break;
                                }
                            }
                        } else {
                            i6++;
                        }
                    }
                    i8 = i6;
                    i4 = 0;
                    i6 = i8;
                    while (i6 < i) {
                        iA = defpackage.aoha.a(str.charAt(i6));
                        if (iA != -1) {
                            break;
                        }
                        i6++;
                        i4 = (i4 << 4) + iA;
                    }
                    i5 = i6 - i8;
                    if (i5 == 0 && i5 <= 4) {
                        int i13 = i9 + 1;
                        bArr[i9] = (byte) ((i4 >>> 8) & 255);
                        i9 += 2;
                        bArr[i13] = (byte) (i4 & 255);
                    }
                } else if (i7 == -1) {
                    i9 += 2;
                    i7 = i9;
                    if (i10 == i) {
                        break;
                    }
                    i8 = i10;
                    i4 = 0;
                    i6 = i8;
                    while (i6 < i) {
                        iA = defpackage.aoha.a(str.charAt(i6));
                        if (iA != -1) {
                            break;
                            break;
                        }
                        i6++;
                        i4 = (i4 << 4) + iA;
                    }
                    i5 = i6 - i8;
                    if (i5 == 0) {
                    }
                }
            }
            return null;
        }
        if (i9 != 16) {
            if (i7 != -1) {
                int i14 = i9 - i7;
                java.lang.System.arraycopy(bArr, i7, bArr, 16 - i14, i14);
                java.util.Arrays.fill(bArr, i7, (16 - i9) + i7, (byte) 0);
            }
            return null;
        }
        try {
            return java.net.InetAddress.getByAddress(bArr);
        } catch (java.net.UnknownHostException unused) {
            throw new java.lang.AssertionError();
        }
    }

    final int a() {
        int i = this.c;
        return i == -1 ? defpackage.aoha.b(this.a) : i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (this.b.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
        } else {
            sb.append(this.b);
        }
        int iA = a();
        if (iA != defpackage.aoha.b(this.a)) {
            sb.append(':');
            sb.append(iA);
        }
        return sb.toString();
    }
}
