package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amnm {
    public final double a;
    public final double b;
    public final double c;
    public final int d;

    public amnm(int i) {
        this.d = i;
        double[][] dArr = defpackage.amnl.a;
        defpackage.amno amnoVar = defpackage.amno.a;
        aooh.f(amnoVar, "viewingConditions");
        double[][] dArr2 = defpackage.amnp.a;
        int i2 = (i >> 16) & 255;
        double dB = defpackage.amnp.b(i2);
        int i3 = (i >> 8) & 255;
        double dB2 = defpackage.amnp.b(i3);
        int i4 = i & 255;
        double dB3 = defpackage.amnp.b(i4);
        aooh.f(amnoVar, "viewingConditions");
        double[][] dArr3 = defpackage.amnl.a;
        double[] dArr4 = dArr3[0];
        double d = (0.41233895d * dB) + (0.35762064d * dB2) + (0.18051042d * dB3);
        double d2 = dArr4[0] * d;
        double d3 = (0.2126d * dB) + (0.7152d * dB2) + (0.0722d * dB3);
        double d4 = dArr4[1] * d3;
        double d5 = (dB * 0.01932141d) + (dB2 * 0.11916382d) + (dB3 * 0.95034478d);
        double d6 = dArr4[2] * d5;
        double[] dArr5 = dArr3[1];
        double d7 = dArr5[0] * d;
        double d8 = dArr5[1] * d3;
        double d9 = dArr5[2] * d5;
        double[] dArr6 = dArr3[2];
        double d10 = d * dArr6[0];
        double d11 = d3 * dArr6[1];
        double d12 = d5 * dArr6[2];
        double[] dArr7 = amnoVar.g;
        double d13 = dArr7[0] * (d2 + d4 + d6);
        double d14 = dArr7[1] * (d7 + d8 + d9);
        double d15 = dArr7[2] * (d10 + d11 + d12);
        double dPow = java.lang.Math.pow((amnoVar.h * java.lang.Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = java.lang.Math.pow((amnoVar.h * java.lang.Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = java.lang.Math.pow((amnoVar.h * java.lang.Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((java.lang.Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((java.lang.Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((java.lang.Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double dQ = defpackage.akky.q(java.lang.Math.toDegrees(java.lang.Math.atan2(d17, d16)));
        double radians = java.lang.Math.toRadians(dQ);
        double d18 = dSignum2 * 20.0d;
        double d19 = (amnoVar.d * ((((40.0d * dSignum) + d18) + dSignum3) / 20.0d)) / amnoVar.c;
        double d20 = amnoVar.f;
        double dPow4 = java.lang.Math.pow(d19, amnoVar.j * 0.69d) * 100.0d;
        double d21 = amnoVar.f;
        double d22 = dPow4 / 100.0d;
        double dSqrt = java.lang.Math.sqrt(d22) * 5.797101449275363d * (amnoVar.c + 4.0d) * amnoVar.i;
        double dPow5 = java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, amnoVar.b), 0.73d) * java.lang.Math.pow((((((java.lang.Math.cos(java.lang.Math.toRadians(dQ < 20.14d ? dQ + 360.0d : dQ) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * amnoVar.e) * java.lang.Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (dSignum3 * 21.0d)) / 20.0d) + 0.305d), 0.9d);
        double dSqrt2 = dPow5 * java.lang.Math.sqrt(d22);
        double d23 = amnoVar.i * dSqrt2;
        double d24 = amnoVar.f;
        double dSqrt3 = java.lang.Math.sqrt((dPow5 * 0.69d) / (amnoVar.c + 4.0d)) * 50.0d;
        double dLog1p = java.lang.Math.log1p(0.0228d * d23) * 43.859649122807014d;
        defpackage.amnl amnlVar = new defpackage.amnl(dQ, dSqrt2, dPow4, dSqrt, d23, dSqrt3, (1.7000000000000002d * dPow4) / ((0.007d * dPow4) + 1.0d), dLog1p * java.lang.Math.cos(radians), dLog1p * java.lang.Math.sin(radians));
        this.a = amnlVar.b;
        this.b = amnlVar.c;
        double d25 = defpackage.akky.p(new double[]{defpackage.amnp.b(i2), defpackage.amnp.b(i3), defpackage.amnp.b(i4)}, defpackage.amnp.a)[1] / 100.0d;
        this.c = ((d25 > 0.008856451679035631d ? java.lang.Math.pow(d25, 0.3333333333333333d) : ((d25 * 903.2962962962963d) + 16.0d) / 116.0d) * 116.0d) - 16.0d;
    }

    public final java.lang.String toString() {
        double d = this.c;
        double d2 = this.b;
        return "HCT(" + aopc.h(this.a) + ", " + aopc.h(d2) + ", " + aopc.h(d) + ')';
    }
}
