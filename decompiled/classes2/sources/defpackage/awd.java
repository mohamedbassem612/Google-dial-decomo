package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class awd implements awb {
    public final float a;
    private final float b;
    private final boolean c;
    private final defpackage.awe d;

    public awd(float f, boolean z, defpackage.awe aweVar) {
        this.b = f;
        this.c = z;
        this.d = aweVar;
        this.a = f;
    }

    public final float a() {
        return this.a;
    }

    public final void b(dpf dpfVar, int i, int[] iArr, dpq dpqVar, int[] iArr2) {
        int i2;
        int length = iArr.length;
        if (length != 0) {
            int iDp = dpfVar.dp(this.b);
            boolean z = this.c && dpqVar == dpq.b;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            if (z) {
                while (i3 < length) {
                    int iMax = java.lang.Math.max(0, i - iArr[i3]);
                    iArr2[i4] = iMax;
                    iMin = java.lang.Math.min(iDp, iMax);
                    i = iArr2[i4] - iMin;
                    i3++;
                    i4++;
                }
                i2 = i + iMin;
            } else {
                int i5 = 0;
                while (i3 < length) {
                    int i6 = iArr[i3];
                    int iMin2 = java.lang.Math.min(iMin, i - i6);
                    iArr2[i5] = iMin2;
                    int iMin3 = java.lang.Math.min(iDp, (i - iMin2) - i6);
                    int i7 = iArr2[i5] + i6 + iMin3;
                    i3++;
                    i4 = iMin3;
                    iMin = i7;
                    i5++;
                }
                i2 = i - (iMin - i4);
            }
            if (i2 > 0) {
                int iA = this.d.a(i2, dpqVar);
                if (z) {
                    iA -= i2;
                }
                if (iA != 0) {
                    int length2 = iArr2.length;
                    for (int i8 = 0; i8 < length2; i8++) {
                        iArr2[i8] = iArr2[i8] + iA;
                    }
                }
            }
        }
    }

    public final void c(dpf dpfVar, int i, int[] iArr, int[] iArr2) {
        b(dpfVar, i, iArr, dpq.a, iArr2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.awd) {
            defpackage.awd awdVar = (defpackage.awd) obj;
            if (java.lang.Float.compare(this.b, awdVar.b) == 0 && this.c == awdVar.c && aooh.n(this.d, awdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.b) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return (true != this.c ? "Absolute" : "") + "Arrangement#spacedAligned(" + dpi.b(this.b) + ", " + this.d + ')';
    }
}
