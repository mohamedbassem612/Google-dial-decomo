package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvu extends defpackage.amwb {
    private static void h(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.c);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int length = str.length();
        if (length > 80) {
            throw new java.lang.IllegalArgumentException(a.bj(length, "Requested contents should be less than 80 digits long, but got "));
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                int length2 = str.length();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i2 = 0; i2 < length2; i2++) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == 0) {
                        sb.append("%U");
                    } else if (cCharAt == ' ') {
                        sb.append(cCharAt);
                    } else if (cCharAt == '@') {
                        sb.append("%V");
                    } else if (cCharAt == '`') {
                        sb.append("%W");
                    } else if (cCharAt == '-' || cCharAt == '.') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= 26) {
                        sb.append('$');
                        sb.append((char) (cCharAt + '@'));
                    } else if (cCharAt < ' ') {
                        sb.append('%');
                        sb.append((char) (cCharAt + '&'));
                    } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                        sb.append('/');
                        sb.append((char) (cCharAt + ' '));
                    } else if (cCharAt <= '9') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= '?') {
                        sb.append('%');
                        sb.append((char) (cCharAt + 11));
                    } else if (cCharAt <= 'Z') {
                        sb.append(cCharAt);
                    } else if (cCharAt <= '_') {
                        sb.append('%');
                        sb.append((char) (cCharAt - 16));
                    } else if (cCharAt <= 'z') {
                        sb.append('+');
                        sb.append((char) (cCharAt - ' '));
                    } else {
                        if (cCharAt > 127) {
                            throw new java.lang.IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + '\'');
                        }
                        sb.append('%');
                        sb.append((char) (cCharAt - '+'));
                    }
                }
                str = sb.toString();
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new java.lang.IllegalArgumentException(a.bs(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        h(148, iArr);
        int iE = e(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iE2 = iE + e(zArr, iE, iArr2, false);
        for (int i3 = 0; i3 < length; i3++) {
            h(defpackage.amvt.a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            int iE3 = iE2 + e(zArr, iE2, iArr, true);
            iE2 = iE3 + e(zArr, iE3, iArr2, false);
        }
        h(148, iArr);
        e(zArr, iE2, iArr, true);
        return zArr;
    }
}
