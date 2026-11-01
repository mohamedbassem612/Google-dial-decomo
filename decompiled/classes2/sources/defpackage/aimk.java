package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aimk extends defpackage.aimi {
    final int e;

    /* JADX WARN: Illegal instructions before constructor call */
    public aimk(defpackage.aizh aizhVar, int i) {
        int[] iArr = new int[i];
        int i2 = aizhVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = aizhVar.a(i3);
            iArr[iA] = iArr[iA] | (1 << i3);
        }
        super(aizhVar, iArr);
        this.e = 1 << (this.c - 1);
    }

    @Override // defpackage.ailq
    public final int a(defpackage.aizh aizhVar, int i) {
        int i2 = aizhVar.c;
        int i3 = this.c;
        if (i2 - i3 > i || i3 - i2 > i) {
            return i + 1;
        }
        int i4 = (i + i2) - i3;
        if (i4 < 0) {
            i4 = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        int i5 = -1;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = ((int[]) this.d)[aizhVar.a(i7)] | i6;
            int i9 = i8 | (((i8 & i5) + i5) ^ i5);
            int i10 = i6 | (~(i9 | i5));
            int i11 = i5 & i9;
            int i12 = this.e;
            if ((i11 & i12) != 0) {
                i3--;
            } else if ((i12 & i10) != 0) {
                i3++;
                i4 -= 2;
                if (i4 < 0) {
                    return i3;
                }
            } else {
                i4--;
                if (i4 < 0) {
                    return i3;
                }
            }
            int i13 = (i10 << 1) | 1;
            int i14 = ~(i9 | i13);
            i6 = i13 & i9;
            i5 = (i11 << 1) | i14;
        }
        return i3;
    }
}
