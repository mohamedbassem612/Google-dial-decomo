package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class elw {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public long h;
    private final defpackage.elk i;
    private final float j;
    private final float k;

    public elw(long j, long j2, long j3, defpackage.elk elkVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.i = elkVar;
        long jL = defpackage.akf.l(j, j2);
        long jL2 = defpackage.akf.l(j3, j2);
        float fG = defpackage.akf.g(jL);
        float fG2 = defpackage.akf.g(jL2);
        if (fG <= 0.0f || fG2 <= 0.0f) {
            this.d = mni.bj(0.0f, 0.0f);
            this.e = mni.bj(0.0f, 0.0f);
            this.f = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.g = 0.0f;
        } else {
            long j4 = defpackage.akf.j(jL, fG);
            this.d = j4;
            long j5 = defpackage.akf.j(jL2, fG2);
            this.e = j5;
            float f = elkVar != null ? elkVar.b : 0.0f;
            this.f = f;
            this.j = elkVar != null ? elkVar.c : 0.0f;
            float f2 = defpackage.akf.f(j4, j5);
            this.k = f2;
            float f3 = defpackage.ema.a;
            float fSqrt = (float) java.lang.Math.sqrt(1.0f - (f2 * f2));
            this.g = ((double) fSqrt) > 0.001d ? (f * (f2 + 1.0f)) / fSqrt : 0.0f;
        }
        this.h = mni.bj(0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0099  */
    public static final defpackage.ell c(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        ace aceVar;
        long jK = defpackage.akf.k(defpackage.akf.l(j2, j));
        long jM = defpackage.akf.m(j, defpackage.akf.n(defpackage.akf.n(jK, f), f2 + 1.0f));
        long j6 = defpackage.akf.j(defpackage.akf.m(j3, j4), 2.0f);
        float f4 = 1.0f - f2;
        float fH = defpackage.akf.h(j3) * f4;
        float fH2 = defpackage.akf.h(j6) * f2;
        float f5 = defpackage.ema.a;
        long jBj = mni.bj(fH + fH2, (f4 * defpackage.akf.i(j3)) + (defpackage.akf.i(j6) * f2));
        long jM2 = defpackage.akf.m(j5, defpackage.akf.n(defpackage.ema.b(defpackage.akf.h(jBj) - defpackage.akf.h(j5), defpackage.akf.i(jBj) - defpackage.akf.i(j5)), f3));
        long jC = defpackage.ema.c(defpackage.ema.c(defpackage.akf.l(jM2, j5)));
        float f6 = defpackage.akf.f(jK, jC);
        if (java.lang.Math.abs(f6) >= 1.0E-4f) {
            float f7 = defpackage.akf.f(defpackage.akf.l(jM2, j2), jC);
            if (java.lang.Math.abs(f6) < java.lang.Math.abs(f7) * 1.0E-4f) {
                aceVar = null;
            } else {
                aceVar = new ace(defpackage.akf.m(j2, defpackage.akf.n(jK, f7 / f6)));
            }
        } else {
            aceVar = null;
        }
        long j7 = aceVar != null ? aceVar.a : j3;
        long j8 = defpackage.akf.j(defpackage.akf.m(jM, defpackage.akf.n(j7, 2.0f)), 3.0f);
        return new defpackage.ell(new float[]{defpackage.akf.h(jM), defpackage.akf.i(jM), defpackage.akf.h(j8), defpackage.akf.i(j8), defpackage.akf.h(j7), defpackage.akf.i(j7), defpackage.akf.h(jM2), defpackage.akf.i(jM2)});
    }

    public final float a(float f) {
        if (f > b()) {
            return this.j;
        }
        float f2 = this.g;
        if (f <= f2) {
            return 0.0f;
        }
        return (this.j * (f - f2)) / (b() - f2);
    }

    public final float b() {
        return (this.j + 1.0f) * this.g;
    }
}
