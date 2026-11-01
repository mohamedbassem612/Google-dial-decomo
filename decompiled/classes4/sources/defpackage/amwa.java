package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwa extends defpackage.amwb {
    private static final int[] a = {1, 1, 1, 1};
    private static final int[] b = {3, 1, 1};
    private static final int[][] c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // defpackage.amwb
    protected final java.util.Collection b() {
        return java.util.Collections.singleton(defpackage.amun.i);
    }

    @Override // defpackage.amwb
    public final boolean[] c(java.lang.String str) {
        int length = str.length();
        if ((length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new java.lang.IllegalArgumentException(a.bj(length, "Requested contents should be less than 80 digits long, but got "));
        }
        g(str);
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iE = e(zArr, 0, a, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = java.lang.Character.digit(str.charAt(i), 10);
            int iDigit2 = java.lang.Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int[][] iArr2 = c;
                int i3 = i2 << 1;
                iArr[i3] = iArr2[iDigit][i2];
                iArr[i3 + 1] = iArr2[iDigit2][i2];
            }
            iE += e(zArr, iE, iArr, true);
        }
        e(zArr, iE, b, true);
        return zArr;
    }
}
