package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbo extends defpackage.hbk {
    private final defpackage.hgq e;

    public hbo(java.util.List list) {
        super(list);
        this.e = new defpackage.hgq(1.0f, 1.0f);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        java.lang.Object obj;
        float f2;
        java.lang.Object obj2 = hgnVar.b;
        if (obj2 == null || (obj = hgnVar.c) == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        defpackage.hgq hgqVar = (defpackage.hgq) obj2;
        defpackage.hgq hgqVar2 = (defpackage.hgq) obj;
        defpackage.hgp hgpVar = this.d;
        if (hgpVar != null) {
            f2 = f;
            defpackage.hgq hgqVar3 = (defpackage.hgq) hgpVar.b(hgnVar.g, hgnVar.h.floatValue(), hgqVar, hgqVar2, f2, c(), this.c);
            if (hgqVar3 != null) {
                return hgqVar3;
            }
        } else {
            f2 = f;
        }
        defpackage.hgq hgqVar4 = this.e;
        float f3 = hgqVar.a;
        float f4 = hgqVar2.a;
        int i = defpackage.hgh.a;
        float f5 = f3 + ((f4 - f3) * f2);
        float f6 = hgqVar.b;
        float f7 = f6 + ((hgqVar2.b - f6) * f2);
        hgqVar4.a = f5;
        hgqVar4.b = f7;
        return hgqVar4;
    }
}
