package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbe extends defpackage.hbk {
    public hbe(java.util.List list) {
        super(list);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        return java.lang.Integer.valueOf(l(hgnVar, f));
    }

    public final int k() {
        return l(d(), b());
    }

    public final int l(defpackage.hgn hgnVar, float f) {
        float f2;
        java.lang.Float f3;
        java.lang.Object obj = hgnVar.b;
        if (obj == null || hgnVar.c == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        defpackage.hgp hgpVar = this.d;
        if (hgpVar == null || (f3 = hgnVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            java.lang.Integer num = (java.lang.Integer) hgpVar.b(hgnVar.g, f3.floatValue(), (java.lang.Integer) obj, (java.lang.Integer) hgnVar.c, f2, c(), this.c);
            if (num != null) {
                return num.intValue();
            }
        }
        int i = defpackage.hgh.a;
        return defpackage.hgt.a(java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, f2)), ((java.lang.Integer) obj).intValue(), ((java.lang.Integer) hgnVar.c).intValue());
    }
}
