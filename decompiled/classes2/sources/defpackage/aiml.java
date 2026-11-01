package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiml extends defpackage.aimi {
    final long e;

    /* JADX WARN: Illegal instructions before constructor call */
    public aiml(defpackage.aizh aizhVar, int i) {
        long[] jArr = new long[i];
        int i2 = aizhVar.c;
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = aizhVar.a(i3);
            jArr[iA] = jArr[iA] | (1 << i3);
        }
        super(aizhVar, jArr);
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
        long j = -1;
        long j2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            long j3 = ((long[]) this.d)[aizhVar.a(i5)] | j2;
            long j4 = j3 | (((j3 & j) + j) ^ j);
            long j5 = j2 | (~(j4 | j));
            long j6 = j & j4;
            long j7 = this.e;
            if ((j6 & j7) != 0) {
                i3--;
            } else if ((j7 & j5) != 0) {
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
            long j8 = (j5 << 1) | 1;
            long j9 = ~(j4 | j8);
            j2 = j8 & j4;
            j = (j6 << 1) | j9;
        }
        return i3;
    }
}
