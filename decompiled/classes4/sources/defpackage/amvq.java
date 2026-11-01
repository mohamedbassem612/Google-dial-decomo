package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvq extends defpackage.amwb {
    private static final char[] a;
    private static final char[] b = {'T', 'N', '*', 'E'};
    private static final char[] c = {'/', ':', '+', '.'};
    private static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        a = cArr;
        d = cArr[0];
    }

    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.b);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int i;
        if (str.length() < 2) {
            char c2 = d;
            str = c2 + str + c2;
        } else {
            char upperCase = java.lang.Character.toUpperCase(str.charAt(0));
            char upperCase2 = java.lang.Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = a;
            boolean zA = defpackage.amvp.a(cArr, upperCase);
            boolean zA2 = defpackage.amvp.a(cArr, upperCase2);
            char[] cArr2 = b;
            boolean zA3 = defpackage.amvp.a(cArr2, upperCase);
            boolean zA4 = defpackage.amvp.a(cArr2, upperCase2);
            if (zA) {
                if (!zA2) {
                    throw new java.lang.IllegalArgumentException("Invalid start/end guards: ".concat(java.lang.String.valueOf(str)));
                }
            } else if (!zA3) {
                if (zA2 || zA4) {
                    throw new java.lang.IllegalArgumentException("Invalid start/end guards: ".concat(java.lang.String.valueOf(str)));
                }
                char c3 = d;
                str = c3 + str + c3;
            } else if (!zA4) {
                throw new java.lang.IllegalArgumentException("Invalid start/end guards: ".concat(java.lang.String.valueOf(str)));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (java.lang.Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!defpackage.amvp.a(c, str.charAt(i3))) {
                    throw new java.lang.IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = java.lang.Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = defpackage.amvp.a;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = defpackage.amvp.b[i6];
                    break;
                }
                i6++;
            }
            boolean z = true;
            int i7 = 0;
            int i8 = 0;
            while (i7 < 7) {
                int i9 = i4 + 1;
                zArr[i4] = z;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
                i4 = i9;
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
