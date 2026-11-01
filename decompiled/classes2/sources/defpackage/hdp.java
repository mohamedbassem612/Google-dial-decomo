package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdp {
    public final float[] a;
    public final int[] b;

    public hdp(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final defpackage.hdp a(float[] fArr) {
        int iA;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = java.util.Arrays.binarySearch(fArr2, f);
            if (iBinarySearch >= 0) {
                iA = this.b[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                int[] iArr2 = this.b;
                if (i2 == 0) {
                    iA = iArr2[0];
                } else {
                    int length = iArr2.length - 1;
                    if (i2 == length) {
                        iA = iArr2[length];
                    } else {
                        int i3 = i2 - 1;
                        float f2 = fArr2[i3];
                        iA = defpackage.hgt.a((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                    }
                }
            }
            iArr[i] = iA;
        }
        return new defpackage.hdp(fArr, iArr);
    }

    public final void b(defpackage.hdp hdpVar) {
        int i = 0;
        while (true) {
            int[] iArr = hdpVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = hdpVar.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.hdp hdpVar = (defpackage.hdp) obj;
            if (java.util.Arrays.equals(this.a, hdpVar.a) && java.util.Arrays.equals(this.b, hdpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.a) * 31) + java.util.Arrays.hashCode(this.b);
    }
}
