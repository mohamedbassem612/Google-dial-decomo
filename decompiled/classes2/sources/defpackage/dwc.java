package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dwc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public dwc(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    static defpackage.dwc b(int i) {
        defpackage.dwl dwlVar = defpackage.dwl.a;
        int i2 = defpackage.dwd.e;
        float fA = defpackage.dwd.a(android.graphics.Color.red(i));
        float fA2 = defpackage.dwd.a(android.graphics.Color.green(i));
        float fA3 = defpackage.dwd.a(android.graphics.Color.blue(i));
        float[][] fArr = defpackage.dwd.d;
        float[] fArr2 = fArr[0];
        float f = (fArr2[0] * fA) + (fArr2[1] * fA2);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[0] * fA) + (fArr3[1] * fA2);
        float[] fArr4 = fArr[2];
        float f3 = (fA * fArr4[0]) + (fA2 * fArr4[1]) + (fA3 * fArr4[2]);
        float[] fArr5 = {f + (fArr2[2] * fA3), f2 + (fArr3[2] * fA3), f3};
        float[][] fArr6 = defpackage.dwd.a;
        float f4 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f5 = fArr7[0] * f4;
        float f6 = fArr5[1];
        float f7 = fArr7[1] * f6;
        float f8 = fArr7[2] * f3;
        float[] fArr8 = fArr6[1];
        float f9 = fArr8[0] * f4;
        float f10 = fArr8[1] * f6;
        float f11 = fArr8[2] * f3;
        float[] fArr9 = fArr6[2];
        float f12 = f4 * fArr9[0];
        float f13 = f6 * fArr9[1];
        float f14 = f3 * fArr9[2];
        float[] fArr10 = dwlVar.g;
        float f15 = fArr10[0] * (f5 + f7 + f8);
        float f16 = fArr10[1] * (f9 + f10 + f11);
        float f17 = fArr10[2] * (f12 + f13 + f14);
        float f18 = dwlVar.h;
        float fPow = (float) java.lang.Math.pow(((double) (java.lang.Math.abs(f15) * f18)) / 100.0d, 0.42d);
        float fPow2 = (float) java.lang.Math.pow(((double) (java.lang.Math.abs(f16) * f18)) / 100.0d, 0.42d);
        float fPow3 = (float) java.lang.Math.pow(((double) (f18 * java.lang.Math.abs(f17))) / 100.0d, 0.42d);
        float fSignum = ((java.lang.Math.signum(f15) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((java.lang.Math.signum(f16) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((java.lang.Math.signum(f17) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f19 = ((float) (((double) (fSignum + fSignum2)) - (d + d))) / 9.0f;
        float f20 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d)) / 11.0f;
        float fAtan2 = (((float) java.lang.Math.atan2(f19, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fSignum2 * 20.0f;
        float f22 = (3.1415927f * fAtan2) / 180.0f;
        float f23 = ((((40.0f * fSignum) + f21) + fSignum3) / 20.0f) * dwlVar.c;
        float f24 = dwlVar.b;
        float f25 = dwlVar.e;
        float fPow4 = ((float) java.lang.Math.pow(f23 / f24, dwlVar.j * 0.69f)) * 100.0f;
        float fSqrt = (float) java.lang.Math.sqrt(fPow4 / 100.0f);
        float f26 = f24 + 4.0f;
        float f27 = dwlVar.i;
        float f28 = fSqrt * 5.7971015f * f26 * f27;
        float fPow5 = ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, dwlVar.f), 0.73d)) * ((float) java.lang.Math.pow(((((((float) (java.lang.Math.cos(((((double) (((double) fAtan2) < 20.14d ? fAtan2 + 360.0f : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * dwlVar.d) * ((float) java.lang.Math.sqrt((f20 * f20) + (f19 * f19)))) / (((((fSignum * 20.0f) + f21) + (fSignum3 * 21.0f)) / 20.0f) + 0.305f), 0.9d));
        float fSqrt2 = ((float) java.lang.Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float f29 = f27 * fSqrt2;
        float fSqrt3 = (float) java.lang.Math.sqrt((fPow5 * 0.69f) / f26);
        double d2 = f22;
        float fLog = ((float) java.lang.Math.log((0.0228f * f29) + 1.0f)) * 43.85965f;
        float fCos = (float) java.lang.Math.cos(d2);
        float fSin = (float) java.lang.Math.sin(d2);
        fArr5[0] = fAtan2;
        fArr5[1] = fSqrt2;
        float f30 = fLog * fSin;
        float[] fArr11 = {fPow4, f28, f29, fSqrt3 * 50.0f, (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f), fCos * fLog, f30};
        return new defpackage.dwc(fAtan2, fSqrt2, fArr11[0], fArr11[4], fArr11[5], f30);
    }

    public static defpackage.dwc c(float f, float f2, float f3) {
        defpackage.dwl dwlVar = defpackage.dwl.a;
        float f4 = dwlVar.e;
        float f5 = dwlVar.b;
        double d = (3.1415927f * f3) / 180.0f;
        float fLog = ((float) java.lang.Math.log((((double) (dwlVar.i * f2)) * 0.0228d) + 1.0d)) * 43.85965f;
        return new defpackage.dwc(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), fLog * ((float) java.lang.Math.cos(d)), fLog * ((float) java.lang.Math.sin(d)));
    }

    final int a(defpackage.dwl dwlVar) {
        float f = this.b;
        float fSqrt = 0.0f;
        if (f != 0.0d) {
            double d = this.c;
            if (d != 0.0d) {
                fSqrt = f / ((float) java.lang.Math.sqrt(d / 100.0d));
            }
        }
        float fPow = (float) java.lang.Math.pow(((double) fSqrt) / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, dwlVar.f), 0.73d), 1.1111111111111112d);
        double d2 = (this.a * 3.1415927f) / 180.0f;
        double dCos = java.lang.Math.cos(2.0d + d2) + 3.8d;
        float f2 = dwlVar.b;
        double d3 = ((double) this.c) / 100.0d;
        float f3 = dwlVar.e;
        float fPow2 = f2 * ((float) java.lang.Math.pow(d3, 1.4492753673265821d / ((double) dwlVar.j)));
        float f4 = ((float) dCos) * 0.25f * 3846.1538f * dwlVar.d;
        float f5 = fPow2 / dwlVar.c;
        float fSin = (float) java.lang.Math.sin(d2);
        float fCos = (float) java.lang.Math.cos(d2);
        float f6 = (((0.305f + f5) * 23.0f) * fPow) / (((f4 * 23.0f) + ((11.0f * fPow) * fCos)) + ((108.0f * fPow) * fSin));
        float f7 = fCos * f6;
        float f8 = f6 * fSin;
        float f9 = f5 * 460.0f;
        float f10 = (((451.0f * f7) + f9) + (288.0f * f8)) / 1403.0f;
        float fMax = (float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f10)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f10))));
        float f11 = 100.0f / dwlVar.h;
        float fSignum = java.lang.Math.signum(f10) * f11;
        float fPow3 = (float) java.lang.Math.pow(fMax, 2.380952380952381d);
        float f12 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float fMax2 = (float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f12)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f12))));
        float fSignum2 = java.lang.Math.signum(f12) * f11;
        float fPow4 = (float) java.lang.Math.pow(fMax2, 2.380952380952381d);
        float f13 = ((f9 - (220.0f * f7)) - (f8 * 6300.0f)) / 1403.0f;
        float fMax3 = (float) java.lang.Math.max(0.0d, (((double) java.lang.Math.abs(f13)) * 27.13d) / (400.0d - ((double) java.lang.Math.abs(f13))));
        float fSignum3 = java.lang.Math.signum(f13) * f11;
        float fPow5 = (float) java.lang.Math.pow(fMax3, 2.380952380952381d);
        float[] fArr = dwlVar.g;
        float f14 = (fSignum * fPow3) / fArr[0];
        float f15 = (fSignum2 * fPow4) / fArr[1];
        float f16 = (fSignum3 * fPow5) / fArr[2];
        float[][] fArr2 = defpackage.dwd.b;
        float[] fArr3 = fArr2[0];
        float f17 = fArr3[0] * f14;
        float f18 = fArr3[1] * f15;
        float f19 = fArr3[2] * f16;
        float[] fArr4 = fArr2[1];
        float f20 = fArr4[0] * f14;
        float f21 = fArr4[1] * f15;
        float f22 = fArr4[2] * f16;
        float[] fArr5 = fArr2[2];
        return dwm.e(f17 + f18 + f19, f20 + f21 + f22, (f14 * fArr5[0]) + (f15 * fArr5[1]) + (f16 * fArr5[2]));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000f  */
    public final int d(defpackage.bzc bzcVar) {
        float fSqrt;
        float f = this.b;
        if (f != 0.0f) {
            float f2 = this.c;
            if (f2 == 0.0f) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) java.lang.Math.sqrt(f2 / 100.0f));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) java.lang.Math.pow(1.64f - ((float) java.lang.Math.pow((float) java.lang.Math.pow(0.28999999165534973d, bzcVar.b), 0.7300000190734863d)), 1.1111111640930176d);
        float f3 = (this.a * 3.1415927f) / 180.0f;
        float fCos = (float) java.lang.Math.cos(2.0f + f3);
        float f4 = bzcVar.c;
        float f5 = this.c / 100.0f;
        float f6 = bzcVar.f;
        float fPow2 = f4 * ((float) java.lang.Math.pow(f5, 1.4492753f / bzcVar.j));
        float f7 = (fCos + 3.8f) * 0.25f * 3846.1538f * bzcVar.e;
        float f8 = fPow2 / bzcVar.d;
        double d = f3;
        float fSin = (float) java.lang.Math.sin(d);
        float fCos2 = (float) java.lang.Math.cos(d);
        float f9 = fSqrt / fPow;
        float f10 = (((0.305f + f8) * 23.0f) * f9) / (((f7 * 23.0f) + ((11.0f * f9) * fCos2)) + ((108.0f * f9) * fSin));
        float f11 = fCos2 * f10;
        float f12 = f10 * fSin;
        float f13 = f8 * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float fMax = java.lang.Math.max(0.0f, (java.lang.Math.abs(f14) * 27.13f) / (400.0f - java.lang.Math.abs(f14)));
        float f15 = 100.0f / bzcVar.h;
        float fSignum = java.lang.Math.signum(f14) * f15;
        float fPow3 = (float) java.lang.Math.pow(fMax, 2.3809523582458496d);
        float f16 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float fMax2 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f16) * 27.13f) / (400.0f - java.lang.Math.abs(f16)));
        float fSignum2 = java.lang.Math.signum(f16) * f15;
        float fPow4 = (float) java.lang.Math.pow(fMax2, 2.3809523582458496d);
        float f17 = ((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f;
        float fMax3 = java.lang.Math.max(0.0f, (java.lang.Math.abs(f17) * 27.13f) / (400.0f - java.lang.Math.abs(f17)));
        float fSignum3 = java.lang.Math.signum(f17) * f15;
        float fPow5 = (float) java.lang.Math.pow(fMax3, 2.3809523582458496d);
        float[] fArr = bzcVar.g;
        float f18 = (fSignum * fPow3) / fArr[0];
        float f19 = (fSignum2 * fPow4) / fArr[1];
        float f20 = (fSignum3 * fPow5) / fArr[2];
        float[][] fArr2 = defpackage.bzb.a;
        float[][] fArr3 = defpackage.bzb.b;
        float[] fArr4 = fArr3[0];
        float f21 = fArr4[0] * f18;
        float f22 = fArr4[1] * f19;
        float f23 = fArr4[2] * f20;
        float[] fArr5 = fArr3[1];
        float f24 = fArr5[0] * f18;
        float f25 = fArr5[1] * f19;
        float f26 = fArr5[2] * f20;
        float[] fArr6 = fArr3[2];
        return dwm.e(f21 + f22 + f23, f24 + f25 + f26, (f18 * fArr6[0]) + (f19 * fArr6[1]) + (f20 * fArr6[2]));
    }
}
