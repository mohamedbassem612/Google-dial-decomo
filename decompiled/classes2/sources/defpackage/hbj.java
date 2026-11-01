package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbj extends defpackage.hbk {
    public hbj(java.util.List list) {
        super(list);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        return java.lang.Integer.valueOf(k(hgnVar, f));
    }

    public final int k(defpackage.hgn hgnVar, float f) {
        int iIntValue;
        float f2;
        java.lang.Object obj = hgnVar.b;
        if (obj == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        java.lang.Object obj2 = hgnVar.c;
        if (obj2 == null) {
            iIntValue = hgnVar.d();
        } else {
            int i = hgnVar.k;
            if (i == 784923401) {
                iIntValue = ((java.lang.Integer) obj2).intValue();
                hgnVar.k = iIntValue;
            } else {
                iIntValue = i;
            }
        }
        defpackage.hgp hgpVar = this.d;
        if (hgpVar != null) {
            f2 = f;
            java.lang.Integer num = (java.lang.Integer) hgpVar.b(hgnVar.g, hgnVar.h.floatValue(), (java.lang.Integer) obj, java.lang.Integer.valueOf(iIntValue), f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        } else {
            f2 = f;
        }
        int iD = hgnVar.d();
        int i2 = defpackage.hgh.a;
        return (int) (iD + (f2 * (iIntValue - iD)));
    }
}
