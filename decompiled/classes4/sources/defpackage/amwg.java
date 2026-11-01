package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwg extends defpackage.amwe {
    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.p);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + defpackage.amwd.a(defpackage.amwf.c(str));
            } catch (defpackage.amuo e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new java.lang.IllegalArgumentException(a.bj(length, "Requested contents should be 7 or 8 digits long, but got "));
            }
            try {
                if (!defpackage.amwd.b(defpackage.amwf.c(str))) {
                    throw new java.lang.IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (defpackage.amuo unused) {
                throw new java.lang.IllegalArgumentException("Illegal contents");
            }
        }
        g(str);
        int iDigit = java.lang.Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new java.lang.IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = defpackage.amwf.a[iDigit][java.lang.Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iE = e(zArr, 0, defpackage.amwd.b, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = java.lang.Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iE += e(zArr, iE, defpackage.amwd.f[iDigit2], false);
        }
        e(zArr, iE, defpackage.amwd.d, false);
        return zArr;
    }
}
