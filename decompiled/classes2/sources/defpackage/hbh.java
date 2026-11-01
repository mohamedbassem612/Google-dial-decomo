package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbh extends defpackage.hbk {
    public hbh(java.util.List list) {
        super(list);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        return java.lang.Float.valueOf(l(hgnVar, f));
    }

    public final float k() {
        return l(d(), b());
    }

    final float l(defpackage.hgn hgnVar, float f) {
        float f2;
        java.lang.Object obj = hgnVar.b;
        if (obj == null || hgnVar.c == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        defpackage.hgp hgpVar = this.d;
        if (hgpVar != null) {
            f2 = f;
            java.lang.Float f3 = (java.lang.Float) hgpVar.b(hgnVar.g, hgnVar.h.floatValue(), (java.lang.Float) obj, (java.lang.Float) hgnVar.c, f2, c(), this.c);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = hgnVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((java.lang.Float) obj).floatValue();
            hgnVar.i = fFloatValue;
        }
        float fFloatValue2 = hgnVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((java.lang.Float) hgnVar.c).floatValue();
            hgnVar.j = fFloatValue2;
        }
        int i = defpackage.hgh.a;
        return fFloatValue + (f2 * (fFloatValue2 - fFloatValue));
    }
}
