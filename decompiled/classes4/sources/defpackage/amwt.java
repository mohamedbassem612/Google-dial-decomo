package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amwt {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static int a(int i, int i2) {
        int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i << (31 - iNumberOfLeadingZeros);
        while (32 - java.lang.Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i3) {
            iNumberOfLeadingZeros2 ^= i2 << ((32 - java.lang.Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i3);
        }
        return iNumberOfLeadingZeros2;
    }

    public static void b(defpackage.amva amvaVar, defpackage.amwm amwmVar, defpackage.amwq amwqVar, int i, defpackage.amwr amwrVar) throws defpackage.amus {
        int i2;
        char c2;
        boolean zE;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        while (true) {
            byte[][] bArr = amwrVar.a;
            if (i9 >= bArr.length) {
                break;
            }
            java.util.Arrays.fill(bArr[i9], (byte) -1);
            i9++;
        }
        int length = a[0].length;
        d(0, 0, amwrVar);
        int i10 = amwrVar.b;
        int i11 = i10 - length;
        d(i11, 0, amwrVar);
        d(0, i11, amwrVar);
        c(0, 7, amwrVar);
        int i12 = i10 - 8;
        c(i12, 7, amwrVar);
        c(0, i12, amwrVar);
        e(7, 0, amwrVar);
        int i13 = amwrVar.c;
        int i14 = i13 - 8;
        e(i14, 0, amwrVar);
        int i15 = i13 - 7;
        e(7, i15, amwrVar);
        int i16 = 8;
        if (amwrVar.a(8, i14) == 0) {
            throw new defpackage.amus();
        }
        char c3 = 1;
        amwrVar.b(8, i14, 1);
        int i17 = amwqVar.a;
        int i18 = 5;
        if (i17 < 2) {
            i2 = 0;
            c2 = 1;
        } else {
            int[] iArr = c[i17 - 1];
            i2 = 0;
            int length2 = iArr.length;
            int i19 = 0;
            while (true) {
                c2 = c3;
                if (i19 >= length2) {
                    break;
                }
                int i20 = iArr[i19];
                if (i20 >= 0) {
                    int length3 = iArr.length;
                    int i21 = 0;
                    while (i21 < length3) {
                        int i22 = iArr[i21];
                        if (i22 >= 0 && f(amwrVar.a(i22, i20))) {
                            int i23 = i22 - 2;
                            int i24 = i20 - 2;
                            int i25 = 0;
                            while (i25 < i18) {
                                int[] iArr2 = b[i25];
                                int i26 = i25;
                                int i27 = 0;
                                while (i27 < i18) {
                                    int i28 = i27;
                                    amwrVar.b(i23 + i27, i24 + i26, iArr2[i28]);
                                    i27 = i28 + 1;
                                    i21 = i21;
                                    i18 = 5;
                                }
                                i25 = i26 + 1;
                                i18 = 5;
                            }
                        }
                        i21++;
                        length2 = length2;
                        i18 = 5;
                    }
                }
                i19++;
                c3 = c2;
                length2 = length2;
                i18 = 5;
            }
            i16 = 8;
        }
        while (i16 < i12) {
            int i29 = i16 + 1;
            int i30 = i29 % 2;
            if (f(amwrVar.a(i16, 6))) {
                amwrVar.b(i16, 6, i30);
            }
            if (f(amwrVar.a(6, i16))) {
                amwrVar.b(6, i16, i30);
            }
            i16 = i29;
        }
        defpackage.amva amvaVar2 = new defpackage.amva();
        if (i < 0 || i >= 8) {
            throw new defpackage.amus("Invalid mask pattern");
        }
        int i31 = (amwmVar.e << 3) | i;
        amvaVar2.d(i31, 5);
        amvaVar2.d(a(i31, 1335), 10);
        defpackage.amva amvaVar3 = new defpackage.amva();
        amvaVar3.d(21522, 15);
        if (amvaVar2.b != amvaVar3.b) {
            throw new java.lang.IllegalArgumentException("Sizes don't match");
        }
        int i32 = i2;
        while (true) {
            int[] iArr3 = amvaVar2.a;
            if (i32 >= iArr3.length) {
                break;
            }
            iArr3[i32] = iArr3[i32] ^ amvaVar3.a[i32];
            i32++;
        }
        int i33 = amvaVar2.b;
        if (i33 != 15) {
            throw new defpackage.amus(a.bj(i33, "should not happen but we got: "));
        }
        int i34 = i2;
        while (true) {
            int i35 = amvaVar2.b;
            if (i34 >= i35) {
                break;
            }
            boolean zE2 = amvaVar2.e((i35 - 1) - i34);
            int[] iArr4 = d[i34];
            amwrVar.c(iArr4[i2], iArr4[c2], zE2);
            if (i34 < 8) {
                i8 = (i10 - i34) - 1;
                i7 = 8;
            } else {
                i7 = (i34 - 8) + i15;
                i8 = 8;
            }
            amwrVar.c(i8, i7, zE2);
            i34++;
        }
        if (i17 >= 7) {
            defpackage.amva amvaVar4 = new defpackage.amva();
            amvaVar4.d(i17, 6);
            amvaVar4.d(a(i17, 7973), 12);
            int i36 = amvaVar4.b;
            if (i36 != 18) {
                throw new defpackage.amus(a.bj(i36, "should not happen but we got: "));
            }
            int i37 = 17;
            for (int i38 = i2; i38 < 6; i38++) {
                for (int i39 = i2; i39 < 3; i39++) {
                    boolean zE3 = amvaVar4.e(i37);
                    i37--;
                    int i40 = (i13 - 11) + i39;
                    amwrVar.c(i38, i40, zE3);
                    amwrVar.c(i40, i38, zE3);
                }
            }
        }
        int i41 = i13 - 1;
        int i42 = i10 - 1;
        int i43 = i2;
        int i44 = -1;
        while (i42 > 0) {
            if (i42 == 6) {
                i42 = 5;
            }
            while (i41 >= 0 && i41 < i13) {
                for (int i45 = i2; i45 < 2; i45++) {
                    int i46 = i42 - i45;
                    if (f(amwrVar.a(i46, i41))) {
                        if (i43 < amvaVar.b) {
                            zE = amvaVar.e(i43);
                            i43++;
                        } else {
                            zE = i2;
                        }
                        switch (i) {
                            case 0:
                                i3 = i41 + i46;
                                i4 = i3 & 1;
                                break;
                            case 1:
                                i4 = i41 & 1;
                                break;
                            case 2:
                                i4 = i46 % 3;
                                break;
                            case 3:
                                i4 = (i41 + i46) % 3;
                                break;
                            case 4:
                                i5 = i41 >> 1;
                                i6 = i46 / 3;
                                i3 = i5 + i6;
                                i4 = i3 & 1;
                                break;
                            case 5:
                                int i47 = i41 * i46;
                                i4 = (i47 & 1) + (i47 % 3);
                                break;
                            case 6:
                                int i48 = i41 * i46;
                                i4 = ((i48 & 1) + (i48 % 3)) & 1;
                                break;
                            default:
                                i6 = (i41 + i46) & 1;
                                i5 = (i41 * i46) % 3;
                                i3 = i5 + i6;
                                i4 = i3 & 1;
                                break;
                        }
                        if (i4 == 0) {
                            zE = !zE;
                        }
                        amwrVar.c(i46, i41, zE);
                    }
                }
                i41 += i44;
            }
            i44 = -i44;
            i42 -= 2;
            i41 += i44;
        }
        int i49 = amvaVar.b;
        if (i43 == i49) {
            return;
        }
        throw new defpackage.amus("Not all bits consumed: " + i43 + '/' + i49);
    }

    private static void c(int i, int i2, defpackage.amwr amwrVar) throws defpackage.amus {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!f(amwrVar.a(i4, i2))) {
                throw new defpackage.amus();
            }
            amwrVar.b(i4, i2, 0);
        }
    }

    private static void d(int i, int i2, defpackage.amwr amwrVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                amwrVar.b(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    private static void e(int i, int i2, defpackage.amwr amwrVar) throws defpackage.amus {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!f(amwrVar.a(i, i4))) {
                throw new defpackage.amus();
            }
            amwrVar.b(i, i4, 0);
        }
    }

    private static boolean f(int i) {
        return i == -1;
    }
}
