package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class els {
    public final defpackage.ell a;
    public float b;
    public float c;
    final /* synthetic */ defpackage.elt d;
    private final float e;

    public els(defpackage.elt eltVar, defpackage.ell ellVar, float f, float f2) {
        aooh.f(ellVar, "cubic");
        this.d = eltVar;
        this.a = ellVar;
        if (f2 < f) {
            throw new java.lang.IllegalArgumentException("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        }
        this.e = defpackage.akf.p(ellVar);
        this.b = f;
        this.c = f2;
    }

    public final aoiu a(float f) {
        float fS = aooc.s(f, this.b, this.c);
        float f2 = this.c;
        float f3 = this.b;
        defpackage.ell ellVar = this.a;
        aooh.f(ellVar, "c");
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (defpackage.akf.o(ellVar, ((fS - f3) / (f2 - f3)) * this.e) >> 32));
        if (fIntBitsToFloat < 0.0f || fIntBitsToFloat > 1.0f) {
            throw new java.lang.IllegalArgumentException("Cubic cut point is expected to be between 0 and 1");
        }
        defpackage.elt eltVar = this.d;
        aoiu aoiuVarK = ellVar.k(fIntBitsToFloat);
        return new aoiu(new defpackage.els(eltVar, (defpackage.ell) aoiuVarK.a, this.b, fS), new defpackage.els(eltVar, (defpackage.ell) aoiuVarK.b, fS, this.c));
    }

    public final java.lang.String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.b + " .. " + this.c + "], size=" + this.e + ", cubic=" + this.a + ')';
    }
}
