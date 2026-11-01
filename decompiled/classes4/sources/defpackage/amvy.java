package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvy extends defpackage.amwe {
    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.h);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + defpackage.amwd.a(str);
            } catch (defpackage.amuo e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            if (length != 13) {
                throw new java.lang.IllegalArgumentException(a.bj(length, "Requested contents should be 12 or 13 digits long, but got "));
            }
            try {
                if (!defpackage.amwd.b(str)) {
                    throw new java.lang.IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (defpackage.amuo unused) {
                throw new java.lang.IllegalArgumentException("Illegal contents");
            }
        }
        g(str);
        int i = defpackage.amvx.a[java.lang.Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int[] iArr = defpackage.amwd.b;
        int iE = e(zArr, 0, iArr, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = java.lang.Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iE += e(zArr, iE, defpackage.amwd.f[iDigit], false);
        }
        int iE2 = iE + e(zArr, iE, defpackage.amwd.c, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iE2 += e(zArr, iE2, defpackage.amwd.e[java.lang.Character.digit(str.charAt(i3), 10)], true);
        }
        e(zArr, iE2, iArr, true);
        return zArr;
    }
}
