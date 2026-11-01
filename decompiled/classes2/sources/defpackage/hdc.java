package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hdc extends defpackage.hdm {
    public hdc(java.util.List list) {
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        for (int i = 0; i < list.size(); i++) {
            defpackage.hgn hgnVar = (defpackage.hgn) list.get(i);
            defpackage.hdp hdpVar = (defpackage.hdp) hgnVar.b;
            defpackage.hdp hdpVar2 = (defpackage.hdp) hgnVar.c;
            if (hdpVar != null && hdpVar2 != null && (length = (fArr = hdpVar.a).length) != (length2 = (fArr2 = hdpVar2.a).length)) {
                int i2 = length + length2;
                float[] fArr3 = new float[i2];
                java.lang.System.arraycopy(fArr, 0, fArr3, 0, length);
                java.lang.System.arraycopy(fArr2, 0, fArr3, length, length2);
                java.util.Arrays.sort(fArr3);
                float f = Float.NaN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    float f2 = fArr3[i4];
                    if (f2 != f) {
                        fArr3[i3] = f2;
                        i3++;
                        f = fArr3[i4];
                    }
                }
                float[] fArrCopyOfRange = java.util.Arrays.copyOfRange(fArr3, 0, i3);
                hgnVar = new defpackage.hgn(hdpVar.a(fArrCopyOfRange), hdpVar2.a(fArrCopyOfRange));
            }
            list.set(i, hgnVar);
        }
        super(list);
    }

    @Override // defpackage.hdl
    public final defpackage.hbd a() {
        return new defpackage.hbi(this.a);
    }
}
