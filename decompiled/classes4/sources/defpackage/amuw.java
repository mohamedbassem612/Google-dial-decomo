package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amuw {
    static final java.lang.String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] c;
    public static final int[][] d;
    public final byte[] e;

    static {
        int[][] iArr;
        int[][] iArr2;
        int[][] iArr3;
        int[][] iArr4 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 5, 256);
        c = iArr4;
        iArr4[0][32] = 1;
        int i = 65;
        while (true) {
            iArr = c;
            if (i > 90) {
                break;
            }
            iArr[0][i] = i - 63;
            i++;
        }
        iArr[1][32] = 1;
        int i2 = 97;
        while (true) {
            iArr2 = c;
            if (i2 > 122) {
                break;
            }
            iArr2[1][i2] = i2 - 95;
            i2++;
        }
        iArr2[2][32] = 1;
        int i3 = 48;
        while (true) {
            iArr3 = c;
            if (i3 > 57) {
                break;
            }
            iArr3[2][i3] = i3 - 46;
            i3++;
        }
        int[] iArr5 = iArr3[2];
        iArr5[44] = 12;
        iArr5[46] = 13;
        int[] iArr6 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            c[3][iArr6[i4]] = i4;
        }
        int[] iArr7 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr7[i5];
            if (i6 > 0) {
                c[4][i6] = i5;
            }
        }
        d = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, 6, 6);
        int i7 = 0;
        while (true) {
            int[][] iArr8 = d;
            if (i7 >= 6) {
                iArr8[0][4] = 0;
                int[] iArr9 = iArr8[1];
                iArr9[4] = 0;
                iArr9[0] = 28;
                iArr8[3][4] = 0;
                int[] iArr10 = iArr8[2];
                iArr10[4] = 0;
                iArr10[0] = 15;
                return;
            }
            java.util.Arrays.fill(iArr8[i7], -1);
            i7++;
        }
    }

    public amuw(byte[] bArr) {
        this.e = bArr;
    }

    public static java.util.Collection a(java.lang.Iterable iterable) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.amuy amuyVar = (defpackage.amuy) it.next();
            java.util.Iterator it2 = linkedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList.addFirst(amuyVar);
                    break;
                }
                defpackage.amuy amuyVar2 = (defpackage.amuy) it2.next();
                if (amuyVar2.e(amuyVar)) {
                    break;
                }
                if (amuyVar.e(amuyVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList;
    }
}
