package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amnd implements defpackage.amni {
    public static final defpackage.amnd a = new defpackage.amnd();

    private static final defpackage.amnm c(defpackage.amnm amnmVar, defpackage.amnm amnmVar2, boolean z, double d, boolean z2) {
        double d2;
        double d3;
        double d4;
        double d5 = amnmVar2.c;
        double d6 = amnmVar.c;
        double dAbs = java.lang.Math.abs(d5 - d6);
        if (dAbs > 20.0d) {
            if (z2) {
                if (z) {
                    d2 = d6 * 0.25d;
                    d4 = 0.75d;
                } else {
                    d2 = d6 * 0.58d;
                    d4 = 0.42d;
                }
                d3 = d5 * d4;
            } else {
                d2 = (d6 + d6) / 3.0d;
                d3 = d5 / 3.0d;
            }
        } else if (dAbs < 8.0d) {
            d2 = d6 / 3.0d;
            d5 += d5;
            d3 = d5 / 3.0d;
        } else {
            d2 = d6 / 2.0d;
            d3 = d5 / 2.0d;
        }
        double d7 = d2 + d3;
        double d8 = amnmVar.b;
        double d9 = amnmVar2.b;
        double dMax = (d8 + d9) / 2.0d;
        if (z2) {
            dMax = java.lang.Math.max(d8, d9);
        }
        return defpackage.akky.s(d, dMax, d7);
    }

    private static final double d(double d) {
        java.lang.Double dValueOf = java.lang.Double.valueOf(0.0d);
        java.lang.Double dValueOf2 = java.lang.Double.valueOf(1.0d);
        aoiu aoiuVar = new aoiu(dValueOf, dValueOf2);
        int i = 0;
        java.util.List listBb = ajsz.bb(new aoiu[]{aoiuVar, new aoiu(java.lang.Double.valueOf(50.0d), dValueOf2), new aoiu(java.lang.Double.valueOf(90.0d), java.lang.Double.valueOf(0.6d)), new aoiu(java.lang.Double.valueOf(140.0d), java.lang.Double.valueOf(0.9d)), new aoiu(java.lang.Double.valueOf(210.0d), java.lang.Double.valueOf(1.2d)), new aoiu(java.lang.Double.valueOf(280.0d), java.lang.Double.valueOf(1.5d)), new aoiu(java.lang.Double.valueOf(320.0d), java.lang.Double.valueOf(1.1d)), new aoiu(java.lang.Double.valueOf(360.0d), dValueOf2)});
        int size = listBb.size() - 1;
        while (i < size) {
            double d2 = ((d % 360.0d) + 360.0d) % 360.0d;
            aoiu aoiuVar2 = (aoiu) listBb.get(i);
            double dDoubleValue = ((java.lang.Number) aoiuVar2.a).doubleValue();
            double dDoubleValue2 = ((java.lang.Number) aoiuVar2.b).doubleValue();
            i++;
            aoiu aoiuVar3 = (aoiu) listBb.get(i);
            double dDoubleValue3 = ((java.lang.Number) aoiuVar3.a).doubleValue();
            double dDoubleValue4 = ((java.lang.Number) aoiuVar3.b).doubleValue();
            if (d2 >= dDoubleValue && d2 <= dDoubleValue3) {
                return dDoubleValue2 + (((d2 - dDoubleValue) / (dDoubleValue3 - dDoubleValue)) * (dDoubleValue4 - dDoubleValue2));
            }
        }
        return 1.0d;
    }

    private static final defpackage.amnm e(defpackage.amnm amnmVar, double d, boolean z, boolean z2, boolean z3, int i) {
        double dMin;
        double d2;
        boolean z4;
        double d3;
        double dMax;
        double dMax2;
        double d4;
        double d5;
        double d6;
        boolean z5;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        int i2 = i;
        double d12 = amnmVar.c;
        boolean z6 = false;
        if (d12 <= 20.0d) {
            dMax2 = (d12 < 13.0d ? 55.0d : 40.0d) + d12;
            if (z2) {
                dMax2 = java.lang.Math.max(d12 + 48.0d, 61.0d);
                z6 = true;
            }
            double d13 = amnmVar.b;
            double dMin2 = 3.0d * d13;
            if (i2 != 0) {
                dMin2 = java.lang.Math.min(java.lang.Math.max(dMin2, d13 + 20.0d), 80.0d);
            }
            d4 = d;
            if (z6) {
                dMin = dMax2;
                d2 = 54.0d;
            } else {
                d2 = dMin2;
                dMin = dMax2;
            }
        } else if (d12 < 86.0d) {
            if (d12 >= 42.0d) {
                z5 = z2;
                d7 = 35.0d;
                d8 = 40.0d;
            } else if (z2) {
                z5 = true;
                d7 = 35.0d;
                d8 = 35.0d;
            } else {
                z5 = false;
                d8 = 30.0d;
                d7 = 35.0d;
            }
            double dMin3 = java.lang.Math.min(97.0d, d12 + d8);
            double d14 = amnmVar.b;
            double dMin4 = true == z5 ? 54.0d : java.lang.Math.min(java.lang.Math.max(28.0d, d14 + d14), 60.0d);
            double d15 = dMin4;
            if (defpackage.akky.s(d, dMin4, dMin3).b < d15 - 0.5d || z3) {
                double dX = defpackage.akky.x(d, true != z5 ? 60.0d : 54.0d, dMin3);
                if (z) {
                    d9 = d12 - 16.0d;
                    z6 = true;
                } else {
                    d9 = d12 + 6.0d;
                }
                double dMax3 = java.lang.Math.max(dX, d9);
                if (d12 < 73.0d) {
                    dMax3 = java.lang.Math.max(dMax3, z6 ? 10.0d + d12 : d12 + 8.0d);
                }
                if (z5 && i2 == 3) {
                    if (d12 < 42.0d) {
                        if (z6) {
                            d10 = d12 + d7;
                        } else {
                            d11 = 26.0d;
                            d10 = d12 + d11;
                        }
                    } else if (d12 < 82.0d) {
                        d11 = z6 ? 7.0d : 9.0d;
                        d10 = d12 + d11;
                    } else {
                        d10 = z6 ? d12 - 16.0d : d12 + 6.0d;
                    }
                    dMax2 = d10;
                    d4 = d;
                    d2 = d15;
                    dMin = dMax2;
                } else {
                    d4 = d;
                    dMin = dMax3;
                    d2 = d15;
                }
            } else {
                d4 = d;
                d2 = d15;
                dMin = dMin3;
            }
        } else {
            dMin = java.lang.Math.min(97.0d, 5.0d + d12);
            double d16 = amnmVar.b;
            double dMax4 = java.lang.Math.max(28.0d, java.lang.Math.max(d16 + 20.0d, d16 + d16));
            if (i2 == 4) {
                dMax4 = java.lang.Math.max(32.0d, d16 * 8.0d);
                i2 = 4;
            }
            double dMin5 = java.lang.Math.min(dMax4, 80.0d);
            if (z2) {
                z4 = true;
                d2 = true != z ? 48.0d : 54.0d;
            } else {
                d2 = dMin5;
                z4 = false;
            }
            if (defpackage.akky.s(d, d2, dMin).b < d2 - 0.5d || z3) {
                double dX2 = defpackage.akky.x(d, d2, dMin);
                if (i2 != 4) {
                    if (z) {
                        d6 = (-14.0d) + d12;
                        z6 = true;
                    } else {
                        d6 = d12 - 5.0d;
                    }
                    dMax = java.lang.Math.max(dX2, d6);
                } else {
                    if (z) {
                        d3 = (-14.0d) + d12;
                        z6 = true;
                    } else {
                        d3 = d12 - 24.0d;
                    }
                    dMax = java.lang.Math.max(dX2, d3);
                }
                dMax2 = dMax;
                if (z4) {
                    if (i2 == 3) {
                        d5 = z6 ? -7.0d : -2.0d;
                    } else {
                        d5 = -12.0d;
                        if (i2 != 4) {
                            if (!z6) {
                                d5 = -8.0d;
                            }
                        } else if (!z6) {
                            d5 = -28.0d;
                        }
                    }
                    dMax2 = d12 + d5;
                }
                d4 = d;
                dMin = dMax2;
            } else {
                d4 = d;
            }
        }
        defpackage.amnm amnmVarS = defpackage.akky.s(d4, d2, dMin);
        double d17 = amnmVarS.a;
        return (d17 < 180.0d || d17 > 212.0d || amnmVarS.b <= 45.0d) ? amnmVarS : defpackage.akky.s(d17, 45.0d, amnmVarS.c);
    }

    @Override // defpackage.amni
    public final java.util.List a(defpackage.amnm amnmVar, boolean z) {
        double d = amnmVar.a;
        double dQ = defpackage.akky.q(10.0d + d);
        defpackage.amnm amnmVarE = e(amnmVar, defpackage.akky.q(d + 21.0d), z, false, false, 0);
        return ajsz.bb(new defpackage.amnm[]{c(amnmVar, amnmVarE, z, dQ, false), amnmVarE});
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[PHI: r41
      0x0072: PHI (r41v8 boolean) = (r41v1 boolean), (r41v9 boolean) binds: [B:28:0x0070, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    @Override // defpackage.amni
    public final java.util.List b(defpackage.amnm amnmVar, defpackage.amnm amnmVar2, defpackage.amnm amnmVar3, defpackage.amnm amnmVar4, boolean z, int i) {
        boolean zW;
        boolean z2;
        boolean z3;
        double d;
        boolean z4;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        boolean z5;
        int i2;
        defpackage.amnm amnmVarS;
        double dQ;
        double dT;
        double d10;
        int i3 = i;
        boolean z6 = amnmVar2.b < 4.0d || amnmVar3.b < 4.0d;
        double d11 = amnmVar4.c;
        boolean z7 = d11 <= 50.0d;
        if (i3 == 0) {
            zW = defpackage.akky.w(amnmVar, amnmVar4);
            i3 = 0;
        } else {
            zW = i3 == 4;
        }
        if (i3 == 0) {
            double d12 = amnmVar2.a;
            z2 = zW;
            double d13 = amnmVar3.a;
            double dO = defpackage.akky.o(d12, d13);
            if (dO > d(d12) * 10.0d && dO > d(d13) * 10.0d) {
                double d14 = amnmVar.a;
                z3 = defpackage.akky.o(d14, d13) < d(d14) * 15.0d;
            }
        } else {
            z2 = zW;
            if (i3 == 3) {
            }
        }
        double d15 = amnmVar.a;
        if (z) {
            if (d15 <= 170.0d) {
                d = 1.0d;
            } else if (d15 <= 240.0d) {
                d = 2.0d;
            } else if (d15 <= 265.0d) {
                d = 1.7d;
            } else {
                d = 1.0d;
            }
            z4 = true;
        } else {
            if (d15 <= 37.0d) {
                d = 1.5d;
            } else if (d15 <= 97.0d) {
                d = 1.25d;
            } else if (d15 <= 160.0d) {
                d = 0.48d;
            } else if (d15 <= 203.0d) {
                d = 1.86d;
            } else if (d15 <= 277.0d) {
                d = 1.14d;
            } else if (d15 <= 332.0d) {
                d = 1.0d;
            } else {
                d = 1.25d;
            }
            z4 = false;
        }
        if (z4) {
            if (z3) {
                d2 = d * 16.0d;
                d10 = 0.25d * d2;
            } else {
                d2 = 4.0d;
                d10 = -5.0d;
            }
            d4 = d10;
            d3 = 10.0d;
        } else {
            double d16 = d * 10.0d;
            d2 = d * 21.0d;
            d3 = 15.0d;
            d4 = d16;
        }
        defpackage.amnc amncVar = new defpackage.amnc(d4, d2, d3);
        int i4 = i3;
        double d17 = amncVar.a;
        double d18 = amncVar.b;
        double d19 = amncVar.c;
        double d20 = amnmVar2.a;
        double d21 = amnmVar3.a;
        double dSignum = java.lang.Math.signum(defpackage.akky.r(d20, d21));
        double dO2 = defpackage.akky.o(d20, d21);
        boolean z8 = true;
        if (z) {
            d6 = dSignum * (true == z3 ? -4.3d : -1.0d);
        } else {
            if (i4 != 0) {
                d6 = dSignum * (true != z3 ? 1.0d : -1.0d);
            } else {
                if (z3) {
                    if (dO2 > 10.0d) {
                        d5 = -1.0d;
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    d6 = dSignum * d5;
                } else {
                    z3 = false;
                }
                d5 = 1.0d;
                d6 = dSignum * d5;
            }
            z8 = false;
        }
        double d22 = 268.0d;
        if (z2) {
            if (z8) {
                d8 = d11 <= 50.0d ? 262.0d : 239.0d;
                if (d11 > 50.0d) {
                    d22 = 260.0d;
                }
                d9 = d8;
                z5 = true;
            } else {
                double d23 = d19 * d6;
                d22 = d20 + d23;
                d7 = d20 + (d23 * 0.75d);
                d9 = d7;
                z5 = false;
            }
        } else if (z8) {
            if (z3) {
                d8 = d15 + (d17 * d6);
                d22 = d15 + (d18 * d6);
            } else if (d15 < 250.0d) {
                d8 = d15 + 8.0d;
            } else if (d15 < 258.0d) {
                d8 = d15 - 5.0d;
            } else {
                d8 = d15 + d17;
                d22 = 274.0d;
            }
            d9 = d8;
            z5 = true;
        } else {
            d7 = d15 + (d17 * d6);
            d22 = d15 + (d18 * d6);
            d9 = d7;
            z5 = false;
        }
        if (i4 != 0) {
            i2 = i4;
        } else if (z3) {
            i2 = 3;
        } else {
            i2 = z2 ? 4 : 5;
        }
        boolean z9 = z7;
        defpackage.amnm amnmVarE = e(amnmVar, defpackage.akky.q(d22), z9, z5, z6, i2);
        boolean z10 = z6;
        boolean z11 = z5;
        defpackage.amnm amnmVarC = c(amnmVar, amnmVarE, z9, defpackage.akky.q(d9), z11);
        java.util.List<defpackage.amnm> listBd = ajsz.bd(new defpackage.amnm[]{amnmVarC, amnmVarE});
        if (z2) {
            double d24 = amnmVar.c;
            double dR = defpackage.akky.r(d20, d21);
            if (z11 || z10) {
                double d25 = amnmVarE.a;
                int i5 = d11 <= 50.0d ? 12 : 17;
                double d26 = amnmVarE.b;
                int i6 = d11 <= 50.0d ? 8 : 12;
                double d27 = amnmVarE.c;
                int i7 = d11 > 50.0d ? -10 : 5;
                double dN = defpackage.akky.n(0.0d, 100.0d, d26 + ((double) i6));
                double d28 = d27 + ((double) i7);
                double dN2 = defpackage.akky.n(0.0d, 100.0d, d28);
                double dQ2 = defpackage.akky.q(d25 + ((double) i5));
                amnmVarS = defpackage.akky.s(dQ2, dN, dN2);
                dQ = dQ2;
                dT = d28;
            } else {
                double d29 = amnmVarE.a;
                double dU = defpackage.akky.u(d29, z9) * 24.0d * dR;
                double d30 = amnmVarE.b + 8.0d;
                dQ = defpackage.akky.q(d29 + dU);
                dT = defpackage.akky.t(dQ, d30, amnmVarE.c, z9, d24 - 24.0d);
                amnmVarS = defpackage.akky.s(dQ, defpackage.akky.n(0.0d, 100.0d, d30), dT);
            }
            aoiu aoiuVar = new aoiu(z11 ? defpackage.akky.s(defpackage.akky.q(amnmVarC.a + ((double) (d11 <= 50.0d ? 10 : 19))), defpackage.akky.n(0.0d, 100.0d, amnmVarC.b + ((double) (d11 <= 50.0d ? 4 : 12))), defpackage.akky.n(0.0d, 100.0d, amnmVarC.c + ((double) (d11 <= 50.0d ? 10 : -10)))) : defpackage.akky.s(defpackage.akky.q(d15 + (((dR >= 0.0d ? ((dQ - d15) + 360.0d) % 360.0d : -(((d15 - dQ) + 360.0d) % 360.0d)) * 3.0d) / 4.0d)), defpackage.akky.n(0.0d, 100.0d, amnmVarC.b + 4.0d), defpackage.akky.n(0.0d, 100.0d, ((dT + dT) / 5.0d) + ((d24 * 3.0d) / 5.0d))), amnmVarS);
            listBd.add(aoiuVar.a);
            listBd.add(aoiuVar.b);
        } else {
            z10 = z10;
        }
        if (!z10) {
            return listBd;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBd, 10));
        for (defpackage.amnm amnmVar5 : listBd) {
            arrayList.add(defpackage.akky.s(amnmVar5.a, 0.0d, amnmVar5.c));
        }
        return arrayList;
    }
}
