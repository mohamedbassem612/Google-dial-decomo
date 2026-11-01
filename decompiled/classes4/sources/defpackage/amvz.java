package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amvz extends defpackage.amwe {
    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.g);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + defpackage.amwd.a(str);
            } catch (defpackage.amuo e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new java.lang.IllegalArgumentException(a.bj(length, "Requested contents should be 7 or 8 digits long, but got "));
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
        boolean[] zArr = new boolean[67];
        int[] iArr = defpackage.amwd.b;
        int iE = e(zArr, 0, iArr, true);
        for (int i = 0; i <= 3; i++) {
            iE += e(zArr, iE, defpackage.amwd.e[java.lang.Character.digit(str.charAt(i), 10)], false);
        }
        int iE2 = iE + e(zArr, iE, defpackage.amwd.c, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iE2 += e(zArr, iE2, defpackage.amwd.e[java.lang.Character.digit(str.charAt(i2), 10)], true);
        }
        e(zArr, iE2, iArr, true);
        return zArr;
    }
}
