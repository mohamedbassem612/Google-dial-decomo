package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbi extends defpackage.hbk {
    private final defpackage.hdp e;

    public hbi(java.util.List list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            defpackage.hdp hdpVar = (defpackage.hdp) ((defpackage.hgn) list.get(i)).b;
            if (hdpVar != null) {
                iMax = java.lang.Math.max(iMax, hdpVar.b.length);
            }
        }
        this.e = new defpackage.hdp(new float[iMax], new int[iMax]);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        int length;
        defpackage.hdp hdpVar = (defpackage.hdp) hgnVar.b;
        defpackage.hdp hdpVar2 = (defpackage.hdp) hgnVar.c;
        boolean zEquals = hdpVar.equals(hdpVar2);
        defpackage.hdp hdpVar3 = this.e;
        if (zEquals || f <= 0.0f) {
            hdpVar3.b(hdpVar);
        } else if (f >= 1.0f) {
            hdpVar3.b(hdpVar2);
        } else {
            int[] iArr = hdpVar.b;
            int length2 = iArr.length;
            int[] iArr2 = hdpVar2.b;
            int length3 = iArr2.length;
            if (length2 != length3) {
                throw new java.lang.IllegalArgumentException(a.bv((byte) 41, length3, length2, "Cannot interpolate between gradients. Lengths vary (", " vs "));
            }
            int i = 0;
            while (true) {
                length = iArr.length;
                if (i >= length) {
                    break;
                }
                float[] fArr = hdpVar3.a;
                float f2 = hdpVar.a[i];
                float f3 = hdpVar2.a[i];
                int i2 = defpackage.hgh.a;
                fArr[i] = f2 + ((f3 - f2) * f);
                hdpVar3.b[i] = defpackage.hgt.a(f, iArr[i], iArr2[i]);
                i++;
            }
            while (true) {
                float[] fArr2 = hdpVar3.a;
                if (length >= fArr2.length) {
                    break;
                }
                int length4 = iArr.length - 1;
                fArr2[length] = fArr2[length4];
                int[] iArr3 = hdpVar3.b;
                iArr3[length] = iArr3[length4];
                length++;
            }
        }
        return hdpVar3;
    }
}
