package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class j implements j$.time.format.e {
    public static final java.lang.String[] d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final j$.time.format.j e = new j$.time.format.j("+HH:MM:ss", "Z");
    public static final j$.time.format.j f = new j$.time.format.j("+HH:MM:ss", "0");
    public final java.lang.String a;
    public final int b;
    public final int c;

    public j(java.lang.String str, java.lang.String str2) {
        j$.util.Objects.requireNonNull(str, "pattern");
        j$.util.Objects.requireNonNull(str2, "noOffsetText");
        for (int i = 0; i < 22; i++) {
            if (d[i].equals(str)) {
                this.b = i;
                this.c = i % 11;
                this.a = str2;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid zone offset pattern: " + str);
    }

    public static void a(boolean z, int i, java.lang.StringBuilder sb) {
        sb.append(z ? ":" : "");
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static boolean b(java.lang.CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2 = iArr[0];
        if (i2 >= 0) {
            if (z && i != 1) {
                int i3 = i2 + 1;
                if (i3 > charSequence.length() || charSequence.charAt(i2) != ':') {
                    return false;
                }
                i2 = i3;
            }
            int i4 = i2 + 2;
            if (i4 > charSequence.length()) {
                return false;
            }
            int i5 = i2 + 1;
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence.charAt(i5);
            if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9') {
                return false;
            }
            int i6 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
            if (i6 < 0 || i6 > 59) {
                return false;
            }
            iArr[i] = i6;
            iArr[0] = i4;
        }
        return true;
    }

    public static void c(java.lang.CharSequence charSequence, boolean z, int[] iArr) {
        if (!z) {
            e(charSequence, 1, 2, iArr);
        } else {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
        }
    }

    public static void d(java.lang.CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (b(charSequence, z, 2, iArr) || !z2) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    public static void e(java.lang.CharSequence charSequence, int i, int i2, int[] iArr) {
        int i3;
        char cCharAt;
        int i4 = iArr[0];
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2 && (i3 = i4 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i4)) >= '0' && cCharAt <= '9') {
            cArr[i5] = cCharAt;
            i6++;
            i5++;
            i4 = i3;
        }
        if (i6 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i6) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i4;
    }

    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        java.lang.Long lA = wVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z = false;
        if (lA == null) {
            return false;
        }
        int iB = j$.com.android.tools.r8.a.B(lA.longValue());
        java.lang.String str = this.a;
        if (iB == 0) {
            sb.append(str);
        } else {
            int iAbs = java.lang.Math.abs((iB / 3600) % 100);
            int iAbs2 = java.lang.Math.abs((iB / 60) % 60);
            int iAbs3 = java.lang.Math.abs(iB % 60);
            int length = sb.length();
            sb.append(iB < 0 ? "-" : "+");
            if (this.b < 11 || iAbs >= 10) {
                a(false, iAbs, sb);
            } else {
                sb.append((char) (iAbs + 48));
            }
            int i = this.c;
            if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
                a(i > 0 && i % 2 == 0, iAbs2, sb);
                iAbs += iAbs2;
                if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                    if (i > 0 && i % 2 == 0) {
                        z = true;
                    }
                    a(z, iAbs3, sb);
                    iAbs += iAbs3;
                }
            }
            if (iAbs == 0) {
                sb.setLength(length);
                sb.append(str);
            }
        }
        return true;
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        java.lang.CharSequence charSequence2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int length = charSequence.length();
        java.lang.String str = this.a;
        int length2 = str.length();
        if (length2 != 0) {
            if (i6 != length) {
                charSequence2 = charSequence;
                if (vVar.g(charSequence2, i, str, 0, length2)) {
                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i + length2);
                }
            }
            return ~i6;
        }
        if (i6 == length) {
            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i6, i);
        }
        charSequence2 = charSequence;
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i7 = cCharAt == '-' ? -1 : 1;
            int i8 = this.c;
            boolean z = i8 > 0 && i8 % 2 == 0;
            int i9 = this.b;
            boolean z2 = i9 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!vVar.c) {
                if (z2) {
                    if (z || (i9 == 0 && length > (i5 = i + 3) && charSequence2.charAt(i5) == ':')) {
                        i9 = 10;
                        z = true;
                    } else {
                        i9 = 9;
                    }
                } else if (z || (i9 == 11 && length > (i4 = i + 3) && (charSequence2.charAt(i + 2) == ':' || charSequence2.charAt(i4) == ':'))) {
                    i9 = 21;
                    z = true;
                } else {
                    i9 = 20;
                }
            }
            switch (i9) {
                case 0:
                case 11:
                    c(charSequence2, z2, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, true, iArr);
                    b(charSequence2, z, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z2, iArr);
                    d(charSequence2, z, true, iArr);
                    if (!b(charSequence2, z, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z2, iArr);
                    if (b(charSequence2, z, 2, iArr)) {
                        b(charSequence2, z, 3, iArr);
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i10 = iArr[0];
            if (i10 > 0) {
                int i11 = iArr[1];
                if (i11 <= 23 && (i2 = iArr[2]) <= 59 && (i3 = iArr[3]) <= 59) {
                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((((long) i2) * 60) + (((long) i11) * 3600) + ((long) i3)) * ((long) i7), i, i10);
                }
                j$.time.g.h("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                return 0;
            }
        }
        if (length2 == 0) {
            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i, i);
        }
        i6 = i;
        return ~i6;
    }

    public final java.lang.String toString() {
        java.lang.String strReplace = this.a.replace("'", "''");
        return "Offset(" + d[this.b] + ",'" + strReplace + "')";
    }
}
