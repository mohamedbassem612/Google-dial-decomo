package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agac extends agab {
    private final float a;

    public agac(float f) {
        this.a = f - 0.001f;
    }

    public final void c(float f, float f2, float f3, agav agavVar) {
        double d = this.a;
        double d2 = 1.4142135623730951d * d;
        float f4 = (float) (d2 / 2.0d);
        float fSqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(d, 2.0d) - java.lang.Math.pow(f4, 2.0d));
        float f5 = (float) (-(d2 - d));
        float f6 = fSqrt + f5;
        agavVar.e(f2 - f4, f6, 270.0f, 0.0f);
        agavVar.d(f2, f5);
        agavVar.d(f2 + f4, f6);
    }

    public final boolean d() {
        return true;
    }
}
