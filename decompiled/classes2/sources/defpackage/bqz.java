package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqz implements awa {
    private final float a;
    private final boolean b;
    private final boolean c;
    private final float d;

    public bqz(float f, float f2, boolean z, boolean z2) {
        this.a = f;
        this.b = z;
        this.c = z2;
        this.d = (((f + f2) + 0.0f) / 2.0f) + 0.0f;
    }

    public final float a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[PHI: r3
      0x0030: PHI (r3v11 int) = (r3v10 int), (r3v9 int) binds: [B:22:0x002e, B:18:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0036 A[PHI: r3
      0x0036: PHI (r3v2 int) = (r3v1 int), (r3v10 int) binds: [B:7:0x0012, B:22:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void b(dpf dpfVar, int i, int[] iArr, dpq dpqVar, int[] iArr2) {
        int i2;
        int i3;
        int length = iArr.length;
        if (length != 0) {
            int iDp = dpfVar.dp(this.a);
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = iArr[i4];
                int i7 = i5 + 1;
                if (i5 != 0) {
                    i2 = 1;
                    if (i5 != 1) {
                        if (i5 != 1) {
                            i2 = i5;
                        } else if (this.b && this.c) {
                            i2 = i5;
                            i3 = i - i6;
                        } else {
                            i5 = 1;
                        }
                        if (i2 == 2) {
                            i2 = i5;
                            i3 = i - i6;
                        } else {
                            i2 = i5;
                            i3 = 0;
                        }
                    } else if (this.b) {
                        i3 = iArr[0] + iDp;
                    } else {
                        i5 = 1;
                        if (i5 != 1) {
                            if (this.b) {
                            }
                            i5 = 1;
                        } else {
                            i2 = i5;
                        }
                        if (i2 == 2) {
                            i2 = i5;
                            i3 = i - i6;
                        } else {
                            i2 = i5;
                            i3 = 0;
                        }
                    }
                } else {
                    i2 = i5;
                    i3 = 0;
                }
                if (dpqVar != dpq.a) {
                    i3 = (i - i3) - i6;
                }
                iArr2[i2] = i3;
                i4++;
                i5 = i7;
            }
        }
    }
}
