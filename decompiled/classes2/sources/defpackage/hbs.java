package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbs extends defpackage.hbk {
    public hbs(java.util.List list) {
        super(list);
    }

    @Override // defpackage.hbd
    public final /* bridge */ /* synthetic */ java.lang.Object f(defpackage.hgn hgnVar, float f) {
        java.lang.Object obj;
        defpackage.hgp hgpVar = this.d;
        if (hgpVar == null) {
            return (f != 1.0f || (obj = hgnVar.c) == null) ? (defpackage.hcu) hgnVar.b : (defpackage.hcu) obj;
        }
        float f2 = hgnVar.g;
        java.lang.Float f3 = hgnVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        defpackage.hcu hcuVar = (defpackage.hcu) hgnVar.b;
        java.lang.Object obj2 = hgnVar.c;
        return (defpackage.hcu) hgpVar.b(f2, fFloatValue, hcuVar, obj2 == null ? hcuVar : (defpackage.hcu) obj2, f, b(), this.c);
    }
}
