package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahaj implements defpackage.ahag {
    private final defpackage.ahaf a;

    public ahaj(defpackage.ahaf ahafVar) {
        this.a = ahafVar;
    }

    public static defpackage.ahaj b() {
        return new defpackage.ahaj(new defpackage.ahah(0));
    }

    private static final int c(java.util.List list, java.util.List list2, int i, int i2, int i3, int i4, ahxt ahxtVar) {
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * i4;
            if (!ahxtVar.d(list.get(i + i6), list2.get(i6 + i2))) {
                return i5;
            }
        }
        return i3;
    }

    private final void d(java.util.List list, java.util.List list2, int i, int i2, kh khVar) {
        int size;
        if (i < 0) {
            size = list.size() + i;
            i += list2.size();
        } else {
            size = i;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = size + i3;
            if (!this.a.a(list.get(i4), list2.get(i + i3))) {
                khVar.f(i4);
            }
        }
    }

    @Override // defpackage.ahag
    public final void a(java.util.List list, java.util.List list2, ahxt ahxtVar, kh khVar) {
        int i;
        int[] iArr;
        int[] iArr2;
        boolean z;
        if (android.util.Log.isLoggable("TTDataService", 3)) {
            android.util.Log.d("TTDataService", "Source Items:      ".concat(java.lang.String.valueOf(java.lang.String.valueOf(list))));
            android.util.Log.d("TTDataService", "Destination Items: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(list2))));
        }
        int size = list.size();
        int size2 = list2.size();
        int iMin = java.lang.Math.min(size, size2);
        int iC = c(list, list2, 0, 0, iMin, 1, ahxtVar);
        if (iC == size && size == size2) {
            d(list, list2, 0, iC, khVar);
            return;
        }
        int iC2 = c(list, list2, size - 1, size2 - 1, iMin - iC, -1, ahxtVar);
        if (android.util.Log.isLoggable("TTDataService", 3)) {
            android.util.Log.d("TTDataService", a.bj(iC, "Start Index:  "));
            android.util.Log.d("TTDataService", a.bj(iC2, "End Trim:     "));
        }
        int i2 = size - iC2;
        int i3 = size2 - iC2;
        if (iC > java.lang.Math.min(i2, i3)) {
            khVar.e();
            return;
        }
        d(list, list2, 0, iC, khVar);
        d(list, list2, -iC2, iC2, khVar);
        int i4 = i3 - iC;
        int[] iArr3 = new int[java.lang.Math.min(i2 - iC, i4)];
        int[] iArr4 = new int[i4];
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        while (i < i2) {
            java.lang.Object obj = list.get(i);
            int i7 = iC;
            while (true) {
                if (i7 >= i3) {
                    i = iC;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    z = false;
                    break;
                }
                iArr = iArr3;
                java.lang.Object obj2 = list2.get(i7);
                iArr2 = iArr4;
                if (ahxtVar.d(obj, obj2)) {
                    i = iC;
                    int i8 = i7 - iC;
                    if (iArr2[i8] != 1) {
                        iArr[i5] = i8;
                        iArr2[i8] = 1;
                        z2 |= !(i == i7);
                        i5++;
                        if (!this.a.a(obj, obj2)) {
                            khVar.f(i - i6);
                        }
                        z = true;
                        break;
                    }
                    khVar.e();
                    return;
                }
                i = iC;
                i7++;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            if (!z) {
                khVar.b.e(i - i6, 1);
                i6++;
            }
            i++;
            iArr3 = iArr;
            iArr4 = iArr2;
            i2 = i2;
        }
        i = iC;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        if (i5 == 0) {
            khVar.j(iC, i4);
            return;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            if (iArr6[i10] == 1) {
                iArr6[i10] = i9;
                i9++;
            } else {
                iArr6[i10] = -1;
            }
        }
        for (int i11 = 0; i11 < i5; i11++) {
            iArr5[i11] = iArr6[iArr5[i11]];
        }
        if (i4 - i5 != 0) {
            int i12 = 0;
            for (int i13 = i4 - 1; i13 >= 0; i13--) {
                if (iArr6[i13] == -1) {
                    i12++;
                    iArr6[i4 - i12] = i13;
                }
            }
        }
        if (z2) {
            for (int i14 = 0; i14 < i5; i14++) {
                iArr6[i14] = i14;
            }
            if (android.util.Log.isLoggable("TTDataService", 3)) {
                android.util.Log.d("TTDataService", "Async Source Positions:      ".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr6))));
                android.util.Log.d("TTDataService", "Async Destination Positions: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr5))));
            }
            int i15 = i5 - 1;
            int i16 = 0;
            while (i16 < i5) {
                int i17 = i16 + 1;
                for (int i18 = i17; i18 < i5; i18++) {
                    int i19 = iArr6[i16];
                    int i20 = iArr6[i18];
                    if (i19 < i20) {
                        iArr6[i18] = i20 - 1;
                    }
                }
                for (int i21 = i15; i21 >= 0; i21--) {
                    int i22 = iArr5[i15];
                    int i23 = iArr5[i21];
                    if (i22 < i23) {
                        iArr5[i21] = i23 - 1;
                    }
                }
                i15--;
                i16 = i17;
            }
            int i24 = 0;
            while (i24 < i5) {
                int i25 = i24 + 1;
                for (int i26 = i25; i26 < i5; i26++) {
                    int i27 = iArr5[i24];
                    int i28 = iArr6[i26];
                    if (i27 > i28) {
                        iArr5[i24] = i27 + 1;
                    } else {
                        iArr6[i26] = i28 + 1;
                    }
                }
                i24 = i25;
            }
            if (android.util.Log.isLoggable("TTDataService", 3)) {
                android.util.Log.d("TTDataService", "Sync Source Positions:      ".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr6))));
                android.util.Log.d("TTDataService", "Sync Destination Positions: ".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr5))));
            }
            for (int i29 = 0; i29 < i5; i29++) {
                int i30 = iC + iArr6[i29];
                int i31 = iArr5[i29] + iC;
                if (i30 != i31) {
                    khVar.h(i30, i31);
                }
            }
        }
        while (i5 < i4) {
            khVar.g(iC + iArr6[i5]);
            i5++;
        }
    }
}
