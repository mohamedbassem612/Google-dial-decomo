package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aimj extends defpackage.aimi {
    private final int e;
    private final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    public aimj(defpackage.aizh aizhVar, int i) {
        int[][] iArr = new int[i][];
        int i2 = aizhVar.c;
        int i3 = (i2 + 30) / 31;
        int[] iArr2 = new int[i3];
        java.util.Arrays.fill(iArr, iArr2);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int iA = aizhVar.a(i6);
            int[] iArr3 = iArr[iA];
            if (iArr3 == iArr2) {
                iArr3 = new int[i3];
                iArr[iA] = iArr3;
            }
            iArr3[i4] = iArr3[i4] | (1 << i5);
            i5++;
            if (i5 == 31) {
                i4++;
                i5 = 0;
            }
        }
        super(aizhVar, iArr);
        int i7 = this.c;
        this.f = (i7 + 30) / 31;
        this.e = 1 << ((i7 - 1) % 31);
    }

    @Override // defpackage.ailq
    public final int a(defpackage.aizh aizhVar, int i) {
        int i2 = this.f;
        int[] iArr = new int[i2];
        int i3 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        java.util.Arrays.fill(iArr, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        int i4 = aizhVar.c;
        int i5 = this.c;
        int i6 = (i + i4) - i5;
        if (i6 < 0) {
            i6 = Integer.MAX_VALUE;
        }
        int[] iArr2 = new int[i2];
        loop0: for (int i7 = 0; i7 < i4; i7++) {
            int[] iArr3 = ((int[][]) this.d)[aizhVar.a(i7)];
            int i8 = 1;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < i2) {
                int i12 = iArr2[i9];
                int i13 = iArr3[i9] | i12;
                int i14 = iArr[i9];
                i10 = (i14 & i13) + i14 + (i10 >>> 31);
                int i15 = ((i10 & i3) ^ i14) | i13;
                int i16 = i3;
                int i17 = i12 | (~(i15 | i14));
                int i18 = i15 & i14;
                if (i9 == i2 - 1) {
                    int i19 = this.e;
                    if ((i18 & i19) != 0) {
                        i5--;
                    } else if ((i17 & i19) != 0) {
                        i5++;
                        i6 -= 2;
                        if (i6 < 0) {
                            break loop0;
                        }
                    } else {
                        i6--;
                        if (i6 < 0) {
                            break loop0;
                        }
                    }
                }
                int i20 = (i17 << 1) | i8;
                i8 = i20 >>> 31;
                int i21 = (i18 << 1) | i11;
                i11 = i21 >>> 31;
                iArr[i9] = (i21 | (~(i15 | i20))) & i16;
                iArr2[i9] = i15 & i20 & i16;
                i9++;
                i3 = i16;
            }
        }
        return i5;
    }
}
