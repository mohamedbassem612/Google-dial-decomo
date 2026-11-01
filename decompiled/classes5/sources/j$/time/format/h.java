package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class h implements j$.time.format.e {
    public final /* synthetic */ byte a;
    public final java.lang.Object b;

    public /* synthetic */ h(byte b, java.lang.Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static void a(java.lang.StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(java.lang.CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                java.lang.Long lA = wVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA == null) {
                    return false;
                }
                sb.append("GMT");
                int iB = j$.com.android.tools.r8.a.B(lA.longValue());
                if (iB == 0) {
                    return true;
                }
                int iAbs = java.lang.Math.abs((iB / 3600) % 100);
                int iAbs2 = java.lang.Math.abs((iB / 60) % 60);
                int iAbs3 = java.lang.Math.abs(iB % 60);
                sb.append(iB < 0 ? "-" : "+");
                if (((j$.time.format.TextStyle) obj) == j$.time.format.TextStyle.FULL) {
                    a(sb, iAbs);
                    sb.append(':');
                    a(sb, iAbs2);
                    if (iAbs3 == 0) {
                        return true;
                    }
                    sb.append(':');
                    a(sb, iAbs3);
                    return true;
                }
                if (iAbs >= 10) {
                    sb.append((char) ((iAbs / 10) + 48));
                }
                sb.append((char) ((iAbs % 10) + 48));
                if (iAbs2 == 0 && iAbs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, iAbs2);
                if (iAbs3 == 0) {
                    return true;
                }
                sb.append(':');
                a(sb, iAbs3);
                return true;
            default:
                sb.append((java.lang.String) obj);
                return true;
        }
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        int i2;
        int i3;
        int iB;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                int length = charSequence.length();
                i2 = i;
                if (vVar.g(charSequence, i, "GMT", 0, 3)) {
                    int i8 = i2 + 3;
                    if (i8 == length) {
                        return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i8);
                    }
                    char cCharAt = charSequence.charAt(i8);
                    if (cCharAt == '+') {
                        i3 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i2, i8);
                        }
                        i3 = -1;
                    }
                    int i9 = i2 + 4;
                    int i10 = 0;
                    if (((j$.time.format.TextStyle) obj) == j$.time.format.TextStyle.FULL) {
                        int iB2 = b(charSequence, i9);
                        int i11 = i2 + 6;
                        int iB3 = b(charSequence, i2 + 5);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i12 = i2 + 7;
                            if (charSequence.charAt(i11) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i12);
                                i7 = i2 + 9;
                                int iB5 = b(charSequence, i2 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i6 = (iB4 * 10) + iB5;
                                    int i13 = i2 + 11;
                                    if (i13 < length && charSequence.charAt(i7) == ':') {
                                        int iB6 = b(charSequence, i2 + 10);
                                        int iB7 = b(charSequence, i13);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i10 = (iB6 * 10) + iB7;
                                            i7 = i2 + 12;
                                        }
                                    }
                                    i4 = i10;
                                    i5 = i7;
                                }
                            }
                        }
                    } else {
                        int i14 = i2 + 5;
                        iB = b(charSequence, i9);
                        if (iB >= 0) {
                            if (i14 < length) {
                                int iB8 = b(charSequence, i14);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i14 = i2 + 6;
                                }
                                int i15 = i14 + 2;
                                if (i15 < length && charSequence.charAt(i14) == ':' && i15 < length && charSequence.charAt(i14) == ':') {
                                    int iB9 = b(charSequence, i14 + 1);
                                    int iB10 = b(charSequence, i15);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i6 = (iB9 * 10) + iB10;
                                        int i16 = i14 + 3;
                                        int i17 = i14 + 5;
                                        if (i17 < length && charSequence.charAt(i16) == ':') {
                                            int iB11 = b(charSequence, i14 + 4);
                                            int iB12 = b(charSequence, i17);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i10 = (iB11 * 10) + iB12;
                                                i7 = i14 + 6;
                                                i4 = i10;
                                                i5 = i7;
                                            }
                                        }
                                        i5 = i16;
                                        i4 = 0;
                                    }
                                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i10) * 60) + (((long) iB) * 3600) + ((long) i4)) * ((long) i3), i2, i5);
                                }
                            }
                            i4 = 0;
                            i5 = i14;
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i10) * 60) + (((long) iB) * 3600) + ((long) i4)) * ((long) i3), i2, i5);
                        }
                    }
                    i10 = i6;
                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i10) * 60) + (((long) iB) * 3600) + ((long) i4)) * ((long) i3), i2, i5);
                }
                break;
            default:
                java.lang.String str = (java.lang.String) obj;
                if (i > charSequence.length() || i < 0) {
                    throw new java.lang.IndexOutOfBoundsException();
                }
                i2 = i;
                if (vVar.g(charSequence, i, str, 0, str.length())) {
                    return str.length() + i2;
                }
                break;
        }
        return ~i2;
    }

    public final java.lang.String toString() {
        byte b = this.a;
        java.lang.Object obj = this.b;
        switch (b) {
            case 0:
                return j$.desugar.sun.nio.fs.h.a("LocalizedOffset(", java.lang.String.valueOf((j$.time.format.TextStyle) obj), ")");
            default:
                return j$.desugar.sun.nio.fs.h.a("'", ((java.lang.String) obj).replace("'", "''"), "'");
        }
    }
}
