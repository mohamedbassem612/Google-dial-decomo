package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class boc implements defpackage.awa {
    private final float a;
    private final float b;
    private final float c;

    public boc(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = (((f + f2) + 0.0f) / 2.0f) + 0.0f;
    }

    @Override // defpackage.awa, defpackage.awh
    public final float a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    @Override // defpackage.awa
    public final void b(defpackage.dpf dpfVar, int i, int[] iArr, defpackage.dpq dpqVar, int[] iArr2) {
        int i2;
        int length = iArr.length;
        if (length != 0) {
            int iDp = dpfVar.dp(this.a);
            int iDp2 = dpfVar.dp(this.b);
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = iArr[i3];
                int i6 = i4 + 1;
                if (i4 == 0) {
                    i2 = 0;
                } else if (i4 == 1) {
                    int i7 = iArr[0];
                    i2 = i7 + (i7 > 0 ? iDp : iDp2);
                } else if (i4 == 2) {
                    i2 = i - i5;
                } else {
                    i2 = 0;
                }
                if (dpqVar != defpackage.dpq.a) {
                    i2 = (i - i2) - i5;
                }
                iArr2[i4] = i2;
                i3++;
                i4 = i6;
            }
        }
    }
}
