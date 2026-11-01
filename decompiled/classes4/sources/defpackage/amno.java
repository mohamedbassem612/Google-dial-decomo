package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amno {
    public static final defpackage.amno a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double[] g;
    public final double h;
    public final double i;
    public final double j;
    public final double f = 0.69d;
    private final double k = 1.0d;

    static {
        double[][] dArr = defpackage.amnp.a;
        double[] dArr2 = defpackage.amnp.b;
        double[][] dArr3 = defpackage.amnl.a;
        double d = dArr2[0];
        double[] dArr4 = dArr3[0];
        double d2 = dArr4[0] * d;
        double d3 = dArr2[1];
        double d4 = dArr4[1] * d3;
        double d5 = dArr2[2];
        double d6 = dArr4[2] * d5;
        double[] dArr5 = dArr3[1];
        double d7 = dArr5[0] * d;
        double d8 = dArr5[1] * d3;
        double d9 = dArr5[2] * d5;
        double[] dArr6 = dArr3[2];
        double d10 = d * dArr6[0];
        double d11 = d3 * dArr6[1];
        double d12 = d5 * dArr6[2];
        double dG = ((anar.g(0.5689655172413793d) * 100.0d) * 63.66197723675813d) / 100.0d;
        double dP = aooc.p(1.0d - (java.lang.Math.exp(((-dG) - 42.0d) / 92.0d) * 0.2777777777777778d), 0.0d, 1.0d);
        double d13 = d2 + d4 + d6;
        double d14 = d7 + d8 + d9;
        double d15 = d10 + d11 + d12;
        double[] dArr7 = {(((100.0d / d13) * dP) + 1.0d) - dP, (((100.0d / d14) * dP) + 1.0d) - dP, (((100.0d / d15) * dP) + 1.0d) - dP};
        double d16 = 5.0d * dG;
        double d17 = 1.0d / (d16 + 1.0d);
        double d18 = d17 * d17 * d17 * d17;
        double d19 = 1.0d - d18;
        double dCbrt = 0.1d * d19 * d19 * java.lang.Math.cbrt(d16);
        double dG2 = (anar.g(0.5689655172413793d) * 100.0d) / dArr2[1];
        double dSqrt = java.lang.Math.sqrt(dG2) + 1.48d;
        double dPow = 0.725d / java.lang.Math.pow(dG2, 0.2d);
        double d20 = (d18 * dG) + dCbrt;
        double dPow2 = java.lang.Math.pow(((dArr7[0] * d20) * d13) / 100.0d, 0.42d);
        double dPow3 = java.lang.Math.pow(((dArr7[1] * d20) * d14) / 100.0d, 0.42d);
        double dPow4 = java.lang.Math.pow(((dArr7[2] * d20) * d15) / 100.0d, 0.42d);
        double[] dArr8 = {dPow2, dPow3, dPow4};
        double d21 = dArr8[0];
        double d22 = (d21 * 400.0d) / (d21 + 27.13d);
        double d23 = dArr8[1];
        double d24 = (400.0d * dPow4) / (dPow4 + 27.13d);
        double[] dArr9 = {d22, (d23 * 400.0d) / (d23 + 27.13d), d24};
        double d25 = dArr9[0];
        a = new defpackage.amno(dG2, (d25 + d25 + dArr9[1] + (d24 * 0.05d)) * dPow, dPow, dPow, dArr7, d20, java.lang.Math.pow(d20, 0.25d), dSqrt);
    }

    public amno(double d, double d2, double d3, double d4, double[] dArr, double d5, double d6, double d7) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
        this.g = dArr;
        this.h = d5;
        this.i = d6;
        this.j = d7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.amno) {
            defpackage.amno amnoVar = (defpackage.amno) obj;
            if (java.lang.Double.compare(this.b, amnoVar.b) == 0 && java.lang.Double.compare(this.c, amnoVar.c) == 0 && java.lang.Double.compare(this.d, amnoVar.d) == 0 && java.lang.Double.compare(this.e, amnoVar.e) == 0) {
                double d = amnoVar.f;
                double d2 = amnoVar.k;
                if (aooh.n(this.g, amnoVar.g) && java.lang.Double.compare(this.h, amnoVar.h) == 0 && java.lang.Double.compare(this.i, amnoVar.i) == 0 && java.lang.Double.compare(this.j, amnoVar.j) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((anty.aB(this.b) * 31) + anty.aB(this.c)) * 31) + anty.aB(this.d)) * 31) + anty.aB(this.e)) * 31) + anty.aB(0.69d)) * 31) + anty.aB(1.0d)) * 31) + java.util.Arrays.hashCode(this.g)) * 31) + anty.aB(this.h)) * 31) + anty.aB(this.i)) * 31) + anty.aB(this.j);
    }

    public final java.lang.String toString() {
        return "ViewingConditions(n=" + this.b + ", aw=" + this.c + ", nbb=" + this.d + ", ncb=" + this.e + ", c=0.69, nc=1.0, rgbD=" + java.util.Arrays.toString(this.g) + ", fl=" + this.h + ", flRoot=" + this.i + ", z=" + this.j + ')';
    }
}
