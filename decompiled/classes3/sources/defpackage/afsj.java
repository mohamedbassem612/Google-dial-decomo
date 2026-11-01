package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsj {
    public final double a;
    public final double b;
    public final double c;
    public final int d;

    public afsj(int i) {
        this.d = i;
        int i2 = defpackage.afsh.b;
        int i3 = (i >> 16) & 255;
        defpackage.afsl afslVar = defpackage.afsl.a;
        double dB = defpackage.afsi.b(i3);
        int i4 = (i >> 8) & 255;
        double dB2 = defpackage.afsi.b(i4);
        int i5 = i & 255;
        double dB3 = defpackage.afsi.b(i5);
        double[][] dArr = defpackage.afsh.a;
        double[] dArr2 = dArr[0];
        double d = (0.41233895d * dB) + (0.35762064d * dB2) + (0.18051042d * dB3);
        double d2 = dArr2[0] * d;
        double d3 = (0.2126d * dB) + (0.7152d * dB2) + (0.0722d * dB3);
        double d4 = dArr2[1] * d3;
        double d5 = (dB * 0.01932141d) + (dB2 * 0.11916382d) + (dB3 * 0.95034478d);
        double d6 = dArr2[2] * d5;
        double[] dArr3 = dArr[1];
        double d7 = dArr3[0] * d;
        double d8 = dArr3[1] * d3;
        double d9 = dArr3[2] * d5;
        double[] dArr4 = dArr[2];
        double d10 = d * dArr4[0];
        double d11 = d3 * dArr4[1];
        double d12 = d5 * dArr4[2];
        double[] dArr5 = afslVar.g;
        double d13 = dArr5[0] * (d2 + d4 + d6);
        double d14 = dArr5[1] * (d7 + d8 + d9);
        double d15 = dArr5[2] * (d10 + d11 + d12);
        double dPow = java.lang.Math.pow((afslVar.h * java.lang.Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = java.lang.Math.pow((afslVar.h * java.lang.Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = java.lang.Math.pow((afslVar.h * java.lang.Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((java.lang.Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((java.lang.Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((java.lang.Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = java.lang.Math.toDegrees(java.lang.Math.atan2(d17, d16));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d18 = dSignum2 * 20.0d;
        double d19 = (((((40.0d * dSignum) + d18) + dSignum3) / 20.0d) * afslVar.c) / afslVar.b;
        double d20 = afslVar.e;
        double dPow4 = java.lang.Math.pow(d19, afslVar.j * 0.69d) * 100.0d;
        double d21 = afslVar.e;
        double d22 = dPow4 / 100.0d;
        double d23 = afslVar.b;
        double d24 = afslVar.i;
        double dPow5 = java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, afslVar.f), 0.73d) * java.lang.Math.pow((((((java.lang.Math.cos(java.lang.Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * afslVar.d) * java.lang.Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (dSignum3 * 21.0d)) / 20.0d) + 0.305d), 0.9d) * java.lang.Math.sqrt(d22);
        double d25 = afslVar.i;
        double d26 = afslVar.e;
        double d27 = afslVar.b;
        this.a = degrees;
        this.b = dPow5;
        this.c = (defpackage.afsi.a(anty.aC(new double[]{defpackage.afsi.b(i3), defpackage.afsi.b(i4), defpackage.afsi.b(i5)}, defpackage.afsi.a)[1] / 100.0d) * 116.0d) - 16.0d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0365  */
    /* JADX WARN: Code duplicated, block: B:103:0x0368  */
    /* JADX WARN: Code duplicated, block: B:105:0x036b  */
    /* JADX WARN: Code duplicated, block: B:107:0x036e  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0375 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x01da  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x020c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0217  */
    /* JADX WARN: Code duplicated, block: B:57:0x0222 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0224  */
    /* JADX WARN: Code duplicated, block: B:60:0x0235  */
    /* JADX WARN: Code duplicated, block: B:61:0x0240  */
    /* JADX WARN: Code duplicated, block: B:62:0x024b  */
    /* JADX WARN: Code duplicated, block: B:64:0x025b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0267  */
    /* JADX WARN: Code duplicated, block: B:69:0x0277  */
    /* JADX WARN: Code duplicated, block: B:71:0x027d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0283  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:87:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:89:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:91:0x02db  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x0362  */
    public static defpackage.afsj a(double d, double d2, double d3) {
        int iC;
        double d4;
        double d5;
        int i;
        double[] dArr;
        double d6;
        double[] dArr2;
        boolean z;
        int i2;
        double d7;
        double d8;
        int i3;
        double[] dArr3;
        double dB;
        double[] dArr4;
        int i4;
        double d9;
        double d10;
        int iD;
        int iE;
        int i5;
        int iFloor;
        double[] dArr5;
        double dB2;
        boolean zH;
        double d11;
        double d12;
        double d13;
        double d14;
        int i6;
        double d15;
        double d16;
        double d17;
        double d18;
        double[] dArr6;
        double[] dArr7;
        double d19;
        double dB3;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        int i7 = defpackage.afsk.e;
        double d25 = d3 + 16.0d;
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            int i8 = defpackage.afsi.c;
            int iAE = a.aE(anar.g(d25 / 116.0d) * 100.0d);
            iC = iAE | (iAE << 16) | (-16777216) | (iAE << 8);
        } else {
            double dC = afsq.c(d);
            int i9 = defpackage.afsi.c;
            double dG = anar.g(d25 / 116.0d) * 100.0d;
            double dSqrt = java.lang.Math.sqrt(dG) * 11.0d;
            defpackage.afsl afslVar = defpackage.afsl.a;
            double dPow = 1.0d / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, afslVar.f), 0.73d);
            double d26 = (dC / 180.0d) * 3.141592653589793d;
            double d27 = 2.0d;
            double dCos = (java.lang.Math.cos(d26 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * afslVar.d;
            double dSin = java.lang.Math.sin(d26);
            double dCos2 = java.lang.Math.cos(d26);
            int i10 = 0;
            while (true) {
                double d28 = d27;
                if (i10 < 5) {
                    i = 1;
                    double d29 = dSqrt / 100.0d;
                    d4 = dG;
                    double dPow2 = java.lang.Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / java.lang.Math.sqrt(d29)) * dPow, 1.1111111111111112d);
                    double d30 = afslVar.b;
                    double d31 = afslVar.e;
                    d5 = d26;
                    double dPow3 = (d30 * java.lang.Math.pow(d29, 1.4492753623188408d / afslVar.j)) / afslVar.c;
                    double d32 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((23.0d * dCos) + ((dPow2 * 11.0d) * dCos2)) + ((dPow2 * 108.0d) * dSin));
                    double d33 = d32 * dCos2;
                    double d34 = d32 * dSin;
                    double d35 = dPow3 * 460.0d;
                    double[] dArrAC = anty.aC(new double[]{defpackage.afsk.c(((d35 + (451.0d * d33)) + (288.0d * d34)) / 1403.0d), defpackage.afsk.c(((d35 - (891.0d * d33)) - (261.0d * d34)) / 1403.0d), defpackage.afsk.c(((d35 - (d33 * 220.0d)) - (d34 * 6300.0d)) / 1403.0d)}, defpackage.afsk.b);
                    double d36 = dArrAC[0];
                    if (d36 >= 0.0d) {
                        double d37 = dArrAC[1];
                        if (d37 >= 0.0d) {
                            double d38 = dArrAC[2];
                            if (d38 >= 0.0d) {
                                double[] dArr8 = defpackage.afsk.c;
                                double d39 = (dArr8[0] * d36) + (dArr8[1] * d37) + (dArr8[2] * d38);
                                if (d39 > 0.0d) {
                                    if (i10 != 4) {
                                        double d40 = d39 - d4;
                                        if (java.lang.Math.abs(d40) >= 0.002d) {
                                            dSqrt -= (d40 * dSqrt) / (d39 + d39);
                                            i10++;
                                            d27 = d28;
                                            dG = d4;
                                            d26 = d5;
                                        }
                                    }
                                    if (dArrAC[0] <= 100.01d && dArrAC[1] <= 100.01d && dArrAC[2] <= 100.01d) {
                                        iC = defpackage.afsi.c(dArrAC);
                                    }
                                    if (iC == 0) {
                                        dArr = new double[3];
                                        d6 = -1.0d;
                                        dArr[0] = -1.0d;
                                        dArr[i] = -1.0d;
                                        dArr[2] = -1.0d;
                                        dArr2 = dArr;
                                        z = false;
                                        i2 = 0;
                                        d7 = 0.0d;
                                        d8 = 0.0d;
                                        i3 = i;
                                        while (i2 < 12) {
                                            double[] dArr9 = defpackage.afsk.c;
                                            d12 = dArr9[0];
                                            d13 = dArr9[i];
                                            d14 = dArr9[2];
                                            i6 = i2 % 4;
                                            if (i2 % 2 == 0) {
                                                d15 = 0.0d;
                                            } else {
                                                d15 = 100.0d;
                                            }
                                            d16 = d6;
                                            if (i6 <= i) {
                                                d17 = 0.0d;
                                            } else {
                                                d17 = 100.0d;
                                            }
                                            if (i2 < 4) {
                                                d24 = ((d4 - (d13 * d17)) - (d14 * d15)) / d12;
                                                if (anar.i(d24)) {
                                                    dArr6 = new double[]{d24, d17, d15};
                                                } else {
                                                    dArr6 = new double[]{d16, d16, d16};
                                                }
                                            } else if (i2 < 8) {
                                                d19 = ((d4 - (d12 * d15)) - (d14 * d17)) / d13;
                                                if (anar.i(d19)) {
                                                    dArr7 = new double[]{d15, d19, d17};
                                                    dArr6 = dArr7;
                                                } else {
                                                    dArr6 = new double[]{d16, d16, d16};
                                                }
                                            } else {
                                                d18 = ((d4 - (d12 * d17)) - (d13 * d15)) / d14;
                                                if (anar.i(d18)) {
                                                    dArr7 = new double[]{d17, d15, d18};
                                                    dArr6 = dArr7;
                                                } else {
                                                    dArr6 = new double[]{d16, d16, d16};
                                                }
                                            }
                                            if (dArr6[0] >= 0.0d) {
                                                dB3 = defpackage.afsk.b(dArr6);
                                                if (z) {
                                                    if (i3 == 0 || anar.h(d8, dB3, d7)) {
                                                        d21 = d8;
                                                        d22 = d5;
                                                        d8 = d21;
                                                        d5 = d22;
                                                        d23 = d20;
                                                        if (anar.h(d21, d22, d20)) {
                                                            d7 = d23;
                                                            dArr2 = dArr6;
                                                        } else {
                                                            d8 = d23;
                                                            dArr = dArr6;
                                                        }
                                                    }
                                                    i3 = 0;
                                                } else {
                                                    d7 = dB3;
                                                    d8 = d7;
                                                    dArr = dArr6;
                                                    dArr2 = dArr;
                                                }
                                                z = true;
                                            }
                                            i2++;
                                            d6 = d16;
                                            i = 1;
                                        }
                                        double[][] dArr10 = {dArr, dArr2};
                                        dArr3 = dArr10[0];
                                        dB = defpackage.afsk.b(dArr3);
                                        dArr4 = dArr10[1];
                                        for (i4 = 0; i4 < 3; i4++) {
                                            d9 = dArr3[i4];
                                            d10 = dArr4[i4];
                                            if (d9 == d10) {
                                                if (d9 < d10) {
                                                    iD = defpackage.afsk.e(anar.j(d9));
                                                    iE = defpackage.afsk.d(anar.j(dArr4[i4]));
                                                } else {
                                                    iD = defpackage.afsk.d(anar.j(d9));
                                                    iE = defpackage.afsk.e(anar.j(dArr4[i4]));
                                                }
                                                i5 = 0;
                                                while (i5 < 8 && java.lang.Math.abs(iE - iD) > 1) {
                                                    iFloor = (int) java.lang.Math.floor(((double) (iD + iE)) / d28);
                                                    double d41 = defpackage.afsk.d[iFloor];
                                                    double d42 = dArr3[i4];
                                                    double d43 = d41 - d42;
                                                    double d44 = dArr4[i4] - d42;
                                                    double d45 = dArr3[0];
                                                    double d46 = d43 / d44;
                                                    double d47 = dArr3[1];
                                                    double d48 = dArr3[2];
                                                    dArr5 = new double[]{d45 + ((dArr4[0] - d45) * d46), d47 + ((dArr4[1] - d47) * d46), d48 + ((dArr4[2] - d48) * d46)};
                                                    dB2 = defpackage.afsk.b(dArr5);
                                                    double d49 = dB;
                                                    zH = anar.h(d49, d5, dB2);
                                                    d11 = d49;
                                                    if (true == zH) {
                                                        iE = iFloor;
                                                    }
                                                    if (true != zH) {
                                                        iD = iFloor;
                                                    }
                                                    if (true == zH) {
                                                        dArr4 = dArr5;
                                                    }
                                                    if (true != zH) {
                                                    }
                                                    if (true != zH) {
                                                        d11 = dB2;
                                                        dArr3 = dArr5;
                                                    } else {
                                                        d11 = dB2;
                                                    }
                                                    i5++;
                                                    dB = d11;
                                                }
                                                dB = dB;
                                            }
                                        }
                                        iC = defpackage.afsi.c(new double[]{(dArr3[0] + dArr4[0]) / d28, (dArr3[1] + dArr4[1]) / d28, (dArr3[2] + dArr4[2]) / d28});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    d4 = dG;
                    d5 = d26;
                    i = 1;
                }
                iC = 0;
                if (iC == 0) {
                    dArr = new double[3];
                    d6 = -1.0d;
                    dArr[0] = -1.0d;
                    dArr[i] = -1.0d;
                    dArr[2] = -1.0d;
                    dArr2 = dArr;
                    z = false;
                    i2 = 0;
                    d7 = 0.0d;
                    d8 = 0.0d;
                    i3 = i;
                    while (i2 < 12) {
                        double[] dArr11 = defpackage.afsk.c;
                        d12 = dArr11[0];
                        d13 = dArr11[i];
                        d14 = dArr11[2];
                        i6 = i2 % 4;
                        if (i2 % 2 == 0) {
                            d15 = 0.0d;
                        } else {
                            d15 = 100.0d;
                        }
                        d16 = d6;
                        if (i6 <= i) {
                            d17 = 0.0d;
                        } else {
                            d17 = 100.0d;
                        }
                        if (i2 < 4) {
                            d24 = ((d4 - (d13 * d17)) - (d14 * d15)) / d12;
                            if (anar.i(d24)) {
                                dArr6 = new double[]{d24, d17, d15};
                            } else {
                                dArr6 = new double[]{d16, d16, d16};
                            }
                        } else if (i2 < 8) {
                            d19 = ((d4 - (d12 * d15)) - (d14 * d17)) / d13;
                            if (anar.i(d19)) {
                                dArr7 = new double[]{d15, d19, d17};
                                dArr6 = dArr7;
                            } else {
                                dArr6 = new double[]{d16, d16, d16};
                            }
                        } else {
                            d18 = ((d4 - (d12 * d17)) - (d13 * d15)) / d14;
                            if (anar.i(d18)) {
                                dArr7 = new double[]{d17, d15, d18};
                                dArr6 = dArr7;
                            } else {
                                dArr6 = new double[]{d16, d16, d16};
                            }
                        }
                        if (dArr6[0] >= 0.0d) {
                            dB3 = defpackage.afsk.b(dArr6);
                            if (z) {
                                d7 = dB3;
                                d8 = d7;
                                dArr = dArr6;
                                dArr2 = dArr;
                            } else {
                                d20 = i3 == 0 ? dB3 : dB3;
                                d21 = d8;
                                d22 = d5;
                                d8 = d21;
                                d5 = d22;
                                d23 = d20;
                                if (anar.h(d21, d22, d20)) {
                                    d7 = d23;
                                    dArr2 = dArr6;
                                } else {
                                    d8 = d23;
                                    dArr = dArr6;
                                }
                                i3 = 0;
                            }
                            z = true;
                        }
                        i2++;
                        d6 = d16;
                        i = 1;
                    }
                    double[][] dArr12 = {dArr, dArr2};
                    dArr3 = dArr12[0];
                    dB = defpackage.afsk.b(dArr3);
                    dArr4 = dArr12[1];
                    while (i4 < 3) {
                        d9 = dArr3[i4];
                        d10 = dArr4[i4];
                        if (d9 == d10) {
                            if (d9 < d10) {
                                iD = defpackage.afsk.e(anar.j(d9));
                                iE = defpackage.afsk.d(anar.j(dArr4[i4]));
                            } else {
                                iD = defpackage.afsk.d(anar.j(d9));
                                iE = defpackage.afsk.e(anar.j(dArr4[i4]));
                            }
                            i5 = 0;
                            while (i5 < 8) {
                                iFloor = (int) java.lang.Math.floor(((double) (iD + iE)) / d28);
                                double d410 = defpackage.afsk.d[iFloor];
                                double d411 = dArr3[i4];
                                double d412 = d410 - d411;
                                double d413 = dArr4[i4] - d411;
                                double d414 = dArr3[0];
                                double d415 = d412 / d413;
                                double d416 = dArr3[1];
                                double d417 = dArr3[2];
                                dArr5 = new double[]{d414 + ((dArr4[0] - d414) * d415), d416 + ((dArr4[1] - d416) * d415), d417 + ((dArr4[2] - d417) * d415)};
                                dB2 = defpackage.afsk.b(dArr5);
                                double d418 = dB;
                                zH = anar.h(d418, d5, dB2);
                                d11 = d418;
                                if (true == zH) {
                                    iE = iFloor;
                                }
                                if (true != zH) {
                                    iD = iFloor;
                                }
                                if (true == zH) {
                                    dArr4 = dArr5;
                                }
                                if (true != zH) {
                                }
                                if (true != zH) {
                                    d11 = dB2;
                                    dArr3 = dArr5;
                                } else {
                                    d11 = dB2;
                                }
                                i5++;
                                dB = d11;
                            }
                            dB = dB;
                        }
                    }
                    iC = defpackage.afsi.c(new double[]{(dArr3[0] + dArr4[0]) / d28, (dArr3[1] + dArr4[1]) / d28, (dArr3[2] + dArr4[2]) / d28});
                }
            }
        }
        return new defpackage.afsj(iC);
    }
}
