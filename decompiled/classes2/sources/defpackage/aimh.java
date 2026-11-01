package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aimh extends defpackage.ailq {
    private static final int[] c = new int[0];
    private int[] d;
    private int[] e;
    private int[] f;
    private int[] g;
    private int[] h;
    private int[] i;

    public aimh(defpackage.aizh aizhVar) {
        super(aizhVar);
        int[] iArr = c;
        this.d = iArr;
        this.e = iArr;
        this.f = iArr;
        this.g = iArr;
        this.h = iArr;
        this.i = iArr;
    }

    private final void b(int i, boolean z) {
        if (this.d.length <= i) {
            int i2 = i + 1;
            this.f = e(this.f, i2, z);
            this.e = e(this.e, i2, z);
            this.d = e(this.d, i2, false);
        }
    }

    private final void c(int i, boolean z) {
        if (this.g.length <= i) {
            int i2 = i + 1;
            this.i = e(this.i, i2, z);
            this.h = e(this.h, i2, z);
            this.g = e(this.g, i2, false);
        }
    }

    private static final int d(int i, int i2, defpackage.aizh aizhVar, defpackage.aizh aizhVar2, int i3, int i4, int i5) {
        int iMax = i2 == 0 ? 0 : java.lang.Math.max(java.lang.Math.max(i4, i5) + 1, i3);
        int iMin = java.lang.Math.min(aizhVar2.c, aizhVar.c - i);
        while (iMax < iMin && aizhVar.a(iMax + i) == aizhVar2.a(iMax)) {
            iMax++;
        }
        return iMax;
    }

    private static final int[] e(int[] iArr, int i, boolean z) {
        int[] iArr2 = new int[i];
        if (z) {
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        }
        return iArr2;
    }

    @Override // defpackage.ailq
    public final int a(defpackage.aizh aizhVar, int i) {
        char c2;
        defpackage.aizh aizhVar2 = this.b;
        int i2 = aizhVar2.c;
        defpackage.aizh aizhVar3 = aizhVar;
        int i3 = aizhVar3.c;
        int i4 = i2 - i3;
        int iAbs = java.lang.Math.abs(i4);
        if (iAbs > i) {
            return androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        }
        char c3 = 0;
        int i5 = -1;
        if (i4 <= 0) {
            c(iAbs, false);
            for (int i6 = 0; i6 <= iAbs; i6++) {
                this.h[i6] = (iAbs - i6) - 1;
                this.i[i6] = -1;
            }
        } else {
            b(iAbs, false);
            for (int i7 = 0; i7 <= iAbs; i7++) {
                this.e[i7] = -1;
                this.f[i7] = -1;
            }
        }
        int i8 = iAbs;
        int i9 = 1;
        while (true) {
            int i10 = (i8 - i4) / 2;
            c(i10, true);
            if (i9 != 0) {
                this.h[i10] = i5;
            }
            int i11 = i10;
            int iD = i5;
            while (i11 > 0) {
                int[] iArr = this.g;
                int i12 = i11 - 1;
                iD = d(i4 + i11, i8 - i11, aizhVar2, aizhVar3, this.i[i12], this.h[i11], iD);
                iArr[i11] = iD;
                aizhVar3 = aizhVar;
                i10 = i10;
                c3 = c3;
                i11 = i12;
            }
            int i13 = iD;
            char c4 = c3;
            int i14 = i10;
            int i15 = (i8 + i4) / 2;
            b(i15, true);
            if (i9 != 0) {
                this.e[i15] = i14 - 1;
                c2 = 1;
            } else {
                c2 = c4;
            }
            if (c2 != 0) {
                i14 = -1;
            }
            int iD2 = i14;
            int i16 = i15;
            while (i16 > 0) {
                int[] iArr2 = this.d;
                int i17 = i16 - 1;
                iD2 = d(i4 - i16, i8 - i16, aizhVar2, aizhVar, iD2, this.e[i16], this.f[i17]);
                iArr2[i16] = iD2;
                i16 = i17;
            }
            int i18 = i4;
            int i19 = i8;
            int iD3 = d(i18, i19, aizhVar2, aizhVar, iD2, this.e[c4], i13);
            if (iD3 == i3) {
                return i19;
            }
            i8 = i19 + 1;
            if (i8 > i || i8 < 0) {
                break;
            }
            int[] iArr3 = this.d;
            int[] iArr4 = this.g;
            iArr4[c4] = iD3;
            iArr3[c4] = iD3;
            int[] iArr5 = this.e;
            this.f = iArr5;
            this.e = iArr3;
            this.d = iArr5;
            int[] iArr6 = this.i;
            this.i = this.h;
            this.h = iArr4;
            this.g = iArr6;
            i9 = c2 ^ 1;
            aizhVar3 = aizhVar;
            i4 = i18;
            c3 = c4;
            i5 = -1;
        }
        return i8;
    }
}
