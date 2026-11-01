package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvw extends defpackage.amwb {
    private static int h(java.lang.String str, int i) {
        int iIndexOf = 0;
        int i2 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i2;
            i2++;
            if (i2 > i) {
                i2 = 1;
            }
        }
        return iIndexOf % 47;
    }

    private static void i(boolean[] zArr, int i, int i2) {
        for (int i3 = 0; i3 < 9; i3++) {
            boolean z = true;
            int i4 = i + i3;
            if (((1 << (8 - i3)) & i2) == 0) {
                z = false;
            }
            zArr[i4] = z;
        }
    }

    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.d);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int length = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length << 1);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == 0) {
                sb.append("bU");
            } else if (cCharAt <= 26) {
                sb.append('a');
                sb.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb.append('b');
                sb.append((char) (cCharAt + '&'));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb.append('c');
                sb.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb.append(cCharAt);
            } else if (cCharAt == ':') {
                sb.append("cZ");
            } else if (cCharAt <= '?') {
                sb.append('b');
                sb.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb.append("bV");
            } else if (cCharAt <= 'Z') {
                sb.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb.append('b');
                sb.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb.append("bW");
            } else if (cCharAt <= 'z') {
                sb.append('d');
                sb.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new java.lang.IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + '\'');
                }
                sb.append('b');
                sb.append((char) (cCharAt - '+'));
            }
        }
        java.lang.String string = sb.toString();
        int length2 = string.length();
        if (length2 > 80) {
            throw new java.lang.IllegalArgumentException(a.bj(length2, "Requested contents should be less than 80 digits long after converting to extended encoding, but got "));
        }
        int i3 = 9;
        boolean[] zArr = new boolean[((string.length() + 4) * 9) + 1];
        int i4 = defpackage.amvv.b;
        i(zArr, 0, i4);
        while (true) {
            int i5 = i3 + 9;
            if (i >= length2) {
                int iH = h(string, 20);
                int[] iArr = defpackage.amvv.a;
                i(zArr, i3, iArr[iH]);
                i(zArr, i5, iArr[h(string + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iH), 15)]);
                i(zArr, i3 + 18, i4);
                zArr[i3 + 27] = true;
                return zArr;
            }
            i(zArr, i3, defpackage.amvv.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(string.charAt(i))]);
            i++;
            i3 = i5;
        }
    }
}
