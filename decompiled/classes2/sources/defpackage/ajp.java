package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajp implements defpackage.ajm {
    private final float a;
    private final float b;
    private final float c;
    private final defpackage.akt d;

    public ajp(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        defpackage.akt aktVar = new defpackage.akt();
        if (f < 0.0f) {
            defpackage.akf.a("Damping ratio must be non-negative");
        }
        aktVar.c = f;
        if (aktVar.a() <= 0.0f) {
            defpackage.akf.a("Spring stiffness constant must be positive.");
        }
        aktVar.b = java.lang.Math.sqrt(f2);
        this.d = aktVar;
    }

    public final /* synthetic */ defpackage.alp a(nf nfVar) {
        return new defpackage.alu(this);
    }

    @Override // defpackage.ajm
    public final float b(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.ajm
    public final float c(long j, float f, float f2, float f3) {
        defpackage.akt aktVar = this.d;
        aktVar.a = f2;
        return java.lang.Float.intBitsToFloat((int) (aktVar.b(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.ajm
    public final float d(long j, float f, float f2, float f3) {
        defpackage.akt aktVar = this.d;
        aktVar.a = f2;
        return java.lang.Float.intBitsToFloat((int) (aktVar.b(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // defpackage.ajm
    public final long e(float f, float f2, float f3) {
        double d;
        double dLog;
        long j;
        defpackage.akt aktVar = this.d;
        float fA = aktVar.a();
        float f4 = aktVar.c;
        if (f4 == 0.0f) {
            j = 9223372036854L;
        } else {
            float f5 = f - f2;
            float f6 = this.c;
            float f7 = f3 / f6;
            double d2 = fA;
            double d3 = f4;
            double dSqrt = (d3 + d3) * java.lang.Math.sqrt(d2);
            double d4 = (dSqrt * dSqrt) - (d2 * 4.0d);
            double dSqrt2 = d4 < 0.0d ? 0.0d : java.lang.Math.sqrt(d4);
            double dSqrt3 = d4 < 0.0d ? java.lang.Math.sqrt(java.lang.Math.abs(d4)) : 0.0d;
            double d5 = f7;
            double d6 = -dSqrt;
            double d7 = d6 + dSqrt2;
            double d8 = d6 - dSqrt2;
            double d9 = f5 / f6;
            if (d9 == 0.0d && d5 == 0.0d) {
                j = 0;
            } else {
                if (d9 < 0.0d) {
                    d5 = -d5;
                }
                double d10 = d7 * 0.5d;
                double dAbs = java.lang.Math.abs(d9);
                double d11 = d10 * dAbs;
                double d12 = 1.0d;
                double dAbs2 = Double.MAX_VALUE;
                double d13 = -1.0d;
                if (d3 > 1.0d) {
                    double d14 = d8 * 0.5d;
                    double d15 = d10 - d14;
                    double d16 = (d11 - d5) / d15;
                    double d17 = dAbs - d16;
                    dLog = java.lang.Math.log(java.lang.Math.abs(1.0d / d17)) / d10;
                    double dLog2 = java.lang.Math.log(java.lang.Math.abs(1.0d / d16)) / d14;
                    if ((java.lang.Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((java.lang.Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = java.lang.Math.max(dLog, dLog2);
                    }
                    double d18 = d16 * d14;
                    double d19 = d17 * d10;
                    double dLog3 = java.lang.Math.log(d19 / ((-d16) * d14)) / (d14 - d10);
                    if (java.lang.Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d12 = -1.0d;
                    } else if (dLog3 <= 0.0d || (-((java.lang.Math.exp(d10 * dLog3) * d17) + (java.lang.Math.exp(dLog3 * d14) * d16))) >= 1.0d) {
                        dLog = java.lang.Math.log((-(d18 * d14)) / (d19 * d10)) / d15;
                    } else {
                        dLog = (d16 <= 0.0d || d17 >= 0.0d) ? dLog : 0.0d;
                        d12 = -1.0d;
                    }
                    if (java.lang.Math.abs((java.lang.Math.exp(d10 * dLog) * d19) + (java.lang.Math.exp(d14 * dLog) * d18)) >= 1.0E-4d) {
                        int i = 0;
                        while (dAbs2 > 0.001d && i < 100) {
                            double d20 = d10 * dLog;
                            double d21 = d14 * dLog;
                            double dExp = dLog - ((((java.lang.Math.exp(d20) * d17) + (java.lang.Math.exp(d21) * d16)) + d12) / ((java.lang.Math.exp(d20) * d19) + (java.lang.Math.exp(d21) * d18)));
                            dAbs2 = java.lang.Math.abs(dLog - dExp);
                            i++;
                            dLog = dExp;
                        }
                    }
                } else {
                    double d22 = d5 - d11;
                    if (d3 < 1.0d) {
                        double d23 = d22 / (dSqrt3 * 0.5d);
                        dLog = java.lang.Math.log(1.0d / java.lang.Math.sqrt((dAbs * dAbs) + (d23 * d23))) / d10;
                    } else {
                        double dLog4 = java.lang.Math.log(java.lang.Math.abs(1.0d / dAbs)) / d10;
                        double dLog5 = java.lang.Math.log(java.lang.Math.abs(1.0d / d22));
                        double dLog6 = dLog5;
                        int i2 = 0;
                        while (true) {
                            d = dLog6 / d10;
                            if (i2 >= 6) {
                                break;
                            }
                            dLog6 = dLog5 - java.lang.Math.log(java.lang.Math.abs(d));
                            i2++;
                        }
                        if ((java.lang.Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                            dLog4 = d;
                        } else if ((java.lang.Double.doubleToRawLongBits(d) & Long.MAX_VALUE) < 9218868437227405312L) {
                            dLog4 = java.lang.Math.max(dLog4, d);
                        }
                        double d24 = (-(d11 + d22)) / (d10 * d22);
                        double d25 = d10 * d24;
                        double dExp2 = java.lang.Math.exp(d25) * dAbs;
                        double dExp3 = d22 * d24 * java.lang.Math.exp(d25);
                        if (!java.lang.Double.isNaN(d24) && d24 > 0.0d) {
                            if (d24 <= 0.0d || (-(dExp2 + dExp3)) >= 1.0d) {
                                dLog4 = (-(2.0d / d10)) - (dAbs / d22);
                                d13 = 1.0d;
                            } else {
                                dLog4 = (d22 >= 0.0d || dAbs <= 0.0d) ? dLog4 : 0.0d;
                            }
                        }
                        dLog = dLog4;
                        int i3 = 0;
                        while (dAbs2 > 0.001d && i3 < 100) {
                            double d26 = d10 * dLog;
                            double dExp4 = dLog - (((((d22 * dLog) + dAbs) * java.lang.Math.exp(d26)) + d13) / ((((d26 + 1.0d) * d22) + d11) * java.lang.Math.exp(d26)));
                            dAbs2 = java.lang.Math.abs(dLog - dExp4);
                            i3++;
                            dLog = dExp4;
                        }
                    }
                }
                j = (long) (dLog * 1000.0d);
            }
        }
        return j * 1000000;
    }
}
