package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class amwd extends anar {
    static final int[] b = {1, 1, 1};
    static final int[] c = {1, 1, 1, 1, 1};
    static final int[] d = {1, 1, 1, 1, 1, 1};
    static final int[][] e;
    static final int[][] f;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        e = iArr;
        int[][] iArr2 = new int[20][];
        f = iArr2;
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = e[i - 10];
            int[] iArr4 = new int[iArr3.length];
            int i2 = 0;
            while (true) {
                int length = iArr3.length;
                if (i2 < length) {
                    iArr4[i2] = iArr3[(length - i2) - 1];
                    i2++;
                }
            }
            f[i] = iArr4;
        }
    }

    static int a(java.lang.CharSequence charSequence) throws defpackage.amuo {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw defpackage.amuo.a();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        while (true) {
            length -= 2;
            if (length < 0) {
                return (1000 - i3) % 10;
            }
            int iCharAt2 = charSequence.charAt(length) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                break;
            }
            i3 += iCharAt2;
        }
        throw defpackage.amuo.a();
    }

    static boolean b(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return a(charSequence.subSequence(0, i)) == java.lang.Character.digit(charSequence.charAt(i), 10);
    }
}
