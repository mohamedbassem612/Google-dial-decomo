package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amnf implements defpackage.amni {
    public static final defpackage.amnf a = new defpackage.amnf();

    private static final double c(double d) {
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

    private static final defpackage.amnm d(defpackage.amnm amnmVar, double d, boolean z, boolean z2, boolean z3, int i) {
        double d2;
        double d3;
        double d4;
        double dMin;
        boolean z4;
        double d5;
        double dMax;
        double d6;
        double d7;
        boolean z5;
        double d8;
        double d9;
        double dMax2;
        double d10;
        double d11;
        double d12;
        boolean z6;
        boolean z7;
        boolean z8 = z;
        int i2 = i;
        double d13 = amnmVar.c;
        if (d13 <= 20.0d) {
            double dMax3 = d13 + (d13 < 13.0d ? 48.0d : 40.0d);
            if (z2) {
                dMax3 = java.lang.Math.max(d13 + 48.0d, 61.0d);
                z7 = true;
            } else {
                z7 = false;
            }
            double d14 = amnmVar.b;
            double dN = d14 * 3.0d;
            if (i2 != 0) {
                dN = d14 < 4.0d ? defpackage.akky.n(20.0d, 70.0d, dN) : defpackage.akky.n(d14 + 25.0d, 70.0d, dN);
            }
            if (z7) {
                dN = 58.0d;
            }
            d = d;
            d3 = 86.0d;
            dMin = dMax3;
            d5 = dN;
            d2 = 8.0d;
            d4 = 40.0d;
        } else {
            d2 = 8.0d;
            d3 = 86.0d;
            d4 = 40.0d;
            if (d13 < 86.0d) {
                if (d13 >= 42.0d) {
                    z5 = z2;
                    d8 = 40.0d;
                } else if (z2) {
                    d8 = 32.0d;
                    z5 = true;
                } else {
                    d8 = 30.0d;
                    z5 = false;
                }
                double dMin2 = java.lang.Math.min(97.0d, d13 + d8);
                double d15 = amnmVar.b;
                double dMin3 = java.lang.Math.min(java.lang.Math.max(28.0d, d15 + d15), 60.0d);
                if (z5) {
                    dMin3 = true != z8 ? 51.0d : 59.0d;
                }
                double d16 = dMin3;
                if (defpackage.akky.s(d, d16, dMin2).b < d16 - 0.5d || z3) {
                    if (!z5) {
                        d9 = 60.0d;
                    } else if (z8) {
                        z8 = true;
                        d9 = 59.0d;
                    } else {
                        d9 = 51.0d;
                        z8 = false;
                    }
                    double dX = defpackage.akky.x(d, d9, dMin2);
                    if (z8) {
                        dMax2 = java.lang.Math.max(dX, d13 - (true != z5 ? 16.0d : 24.0d));
                    } else {
                        dMax2 = java.lang.Math.max(dX, d13 + 6.0d);
                    }
                    if (d13 < 73.0d) {
                        if (z8) {
                            d12 = 10.0d + d13;
                            z6 = true;
                        } else {
                            d12 = d13 + 8.0d;
                            z6 = false;
                        }
                        dMax2 = java.lang.Math.max(dMax2, d12);
                        z8 = z6;
                    }
                    if (z5 && i2 == 3) {
                        if (d13 < 42.0d) {
                            d11 = z8 ? 35.0d : 26.0d;
                        } else {
                            if (d13 < 82.0d) {
                                d11 = z8 ? 7.0d : 9.0d;
                            } else {
                                d10 = z8 ? d13 - 16.0d : d13 + 6.0d;
                            }
                            dMin = d10;
                        }
                        d10 = d13 + d11;
                        dMin = d10;
                    } else {
                        dMin = dMax2;
                    }
                } else {
                    dMin = dMin2;
                }
                d5 = d16;
            } else {
                dMin = java.lang.Math.min(97.0d, d13 + 5.0d);
                double d17 = amnmVar.b;
                double dMax4 = java.lang.Math.max(28.0d, java.lang.Math.max(d17 + 20.0d, d17 + d17));
                if (i2 == 4) {
                    dMax4 = java.lang.Math.max(32.0d, d17 * 6.0d);
                    i2 = 4;
                }
                double dMin4 = java.lang.Math.min(dMax4, 66.0d);
                if (z2) {
                    dMin4 = true != z8 ? 47.0d : 54.0d;
                    z4 = true;
                } else {
                    z4 = false;
                }
                d5 = dMin4;
                if (defpackage.akky.s(d, d5, dMin).b < d5 - 0.5d || z3) {
                    double dX2 = defpackage.akky.x(d, d5, dMin);
                    if (i2 != 4) {
                        dMax = java.lang.Math.max(dX2, d13 - (true == z8 ? 14.0d : 5.0d));
                    } else {
                        dMax = java.lang.Math.max(dX2, d13 - (true == z8 ? 14.0d : 24.0d));
                    }
                    if (z4) {
                        if (i2 == 3) {
                            d6 = z8 ? -7.0d : -10.0d;
                        } else {
                            if (i2 != 4) {
                                if (!z8) {
                                    d7 = d13 - 16.0d;
                                }
                                d = d;
                                dMin = d7;
                            } else {
                                if (!z8) {
                                    d6 = -26.0d;
                                }
                                d = d;
                                dMin = d7;
                            }
                            d7 = d13 - 12.0d;
                            d = d;
                            dMin = d7;
                        }
                        d7 = d13 + d6;
                        d = d;
                        dMin = d7;
                    } else {
                        d = d;
                        dMin = dMax;
                    }
                } else {
                    d = d;
                }
            }
        }
        defpackage.amnm amnmVarS = defpackage.akky.s(d, d5, dMin);
        double d18 = amnmVarS.a;
        if (d18 >= 160.0d && d18 <= 207.0d) {
            double d19 = amnmVarS.b;
            if (d19 > d4) {
                amnmVarS = defpackage.akky.s(d18, d19 * 0.9d, amnmVarS.c);
            }
        }
        double d20 = amnmVarS.a;
        if (d20 < 105.0d || d20 > 139.0d) {
            return amnmVarS;
        }
        if (d13 <= 20.0d && amnmVar.b > d2) {
            return defpackage.akky.s(d20, amnmVarS.b * 1.5d, amnmVarS.c);
        }
        double d21 = amnmVarS.c;
        return d21 >= d3 ? defpackage.akky.s(d20, amnmVarS.b * 1.2d, d21) : amnmVarS;
    }

    @Override // defpackage.amni
    public final java.util.List a(defpackage.amnm amnmVar, boolean z) {
        double d = amnmVar.a;
        double dQ = defpackage.akky.q(10.0d + d);
        defpackage.amnm amnmVarD = d(amnmVar, defpackage.akky.q(d + 21.0d), z, false, false, 0);
        return ajsz.bb(new defpackage.amnm[]{defpackage.akky.v(amnmVar, amnmVarD, z, dQ, false), amnmVarD});
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[PHI: r48
      0x0072: PHI (r48v11 boolean) = (r48v1 boolean), (r48v12 boolean) binds: [B:28:0x0070, B:25:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
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
        boolean z5;
        int i2;
        double d8;
        double dQ;
        defpackage.amnm amnmVarS;
        double dT;
        double d9;
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
            if (dO > c(d12) * 10.0d && dO > c(d13) * 10.0d) {
                double d14 = amnmVar.a;
                z3 = defpackage.akky.o(d14, d13) < c(d14) * 15.0d;
            }
        } else {
            z2 = zW;
            if (i3 == 3) {
            }
        }
        double d15 = amnmVar.a;
        double d16 = 1.0d;
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
                d9 = d * 16.0d;
                d10 = 0.25d * d9;
            } else {
                d9 = -22.0d;
                d10 = 4.0d;
            }
            d2 = d9;
            d3 = d10;
            d4 = 10.0d;
        } else {
            d2 = d * 21.0d;
            d3 = d * 10.0d;
            d4 = 15.0d;
        }
        defpackage.amne amneVar = new defpackage.amne(d3, d2, d4);
        double d17 = amneVar.a;
        double d18 = amneVar.b;
        double d19 = amneVar.c;
        double d20 = amnmVar2.a;
        double d21 = amnmVar3.a;
        double dSignum = java.lang.Math.signum(defpackage.akky.r(d20, d21));
        double dO2 = defpackage.akky.o(d20, d21);
        boolean z8 = true;
        if (z) {
            d5 = dSignum * (true == z3 ? -4.3d : -1.0d);
        } else {
            if (i3 != 0) {
                if (true == z3) {
                    d16 = -1.0d;
                }
            } else if (z3) {
                d16 = dO2 > 10.0d ? -1.0d : 1.0d;
                z3 = true;
            } else {
                z3 = false;
            }
            d5 = dSignum * d16;
            z8 = false;
        }
        if (z2) {
            if (z8) {
                d6 = d11 > 50.0d ? 239.0d : 262.0d;
                d7 = d11 <= 50.0d ? 268.0d : 260.0d;
                z5 = true;
            } else {
                double d22 = d19 * d5;
                d6 = d20 + (d22 * 0.75d);
                d7 = d20 + d22;
                z5 = false;
            }
        } else if (z8) {
            if (z3) {
                d17 *= d5;
                d18 *= d5;
            } else {
                d7 = 269.0d;
                if (d15 < 240.0d) {
                    d6 = d15 + 15.0d;
                } else if (d15 < 250.0d) {
                    d6 = d15 + 8.0d;
                } else if (d15 < 262.0d) {
                    d6 = d15 + 12.0d;
                    d7 = d11 <= 50.0d ? 255.0d : 251.0d;
                }
                z5 = true;
            }
            d6 = d15 + d17;
            d7 = d15 + d18;
            z5 = true;
        } else {
            d6 = d15 + (d17 * d5);
            d7 = d15 + (d18 * d5);
            z5 = false;
        }
        if (i3 != 0) {
            i2 = i3;
        } else if (z3) {
            i2 = 3;
        } else {
            i2 = z2 ? 4 : 5;
        }
        boolean z9 = z5;
        boolean z10 = z7;
        defpackage.amnm amnmVarD = d(amnmVar, defpackage.akky.q(d7), z10, z9, z6, i2);
        boolean z11 = z6;
        defpackage.amnm amnmVarV = defpackage.akky.v(amnmVar, amnmVarD, z10, defpackage.akky.q(d6), z9);
        java.util.List<defpackage.amnm> listBd = ajsz.bd(new defpackage.amnm[]{amnmVarV, amnmVarD});
        if (z2) {
            double d23 = amnmVar.c;
            double dR = defpackage.akky.r(d20, d21);
            if (z9 || z11) {
                d8 = d23;
                double d24 = amnmVarD.a;
                int i4 = d11 <= 50.0d ? 12 : 17;
                double d25 = amnmVarD.b;
                int i5 = d11 <= 50.0d ? 8 : 12;
                double d26 = amnmVarD.c;
                int i6 = d11 <= 50.0d ? 5 : -10;
                double dN = defpackage.akky.n(0.0d, 100.0d, d25 + ((double) i5));
                double d27 = d26 + ((double) i6);
                double dN2 = defpackage.akky.n(0.0d, 100.0d, d27);
                dQ = defpackage.akky.q(d24 + ((double) i4));
                amnmVarS = defpackage.akky.s(dQ, dN, dN2);
                dT = d27;
            } else {
                double d28 = amnmVarD.a;
                double dU = defpackage.akky.u(d28, z10) * 24.0d * dR;
                d8 = d23;
                double d29 = amnmVarD.b + 8.0d;
                dQ = defpackage.akky.q(d28 + dU);
                dT = defpackage.akky.t(dQ, d29, amnmVarD.c, z10, d8 - 24.0d);
                amnmVarS = defpackage.akky.s(dQ, defpackage.akky.n(0.0d, 100.0d, d29), dT);
            }
            aoiu aoiuVar = new aoiu(z9 ? defpackage.akky.s(defpackage.akky.q(amnmVarV.a + ((double) (d11 <= 50.0d ? 10 : 19))), defpackage.akky.n(0.0d, 100.0d, amnmVarV.b + ((double) (d11 <= 50.0d ? 4 : 12))), defpackage.akky.n(0.0d, 100.0d, amnmVarV.c + ((double) (d11 <= 50.0d ? 10 : -10)))) : defpackage.akky.s(defpackage.akky.q(d15 + (((dR >= 0.0d ? ((dQ - d15) + 360.0d) % 360.0d : -(((d15 - dQ) + 360.0d) % 360.0d)) * 3.0d) / 4.0d)), defpackage.akky.n(0.0d, 100.0d, amnmVarV.b + 4.0d), defpackage.akky.n(0.0d, 100.0d, ((dT + dT) / 5.0d) + ((d8 * 3.0d) / 5.0d))), amnmVarS);
            listBd.add(aoiuVar.a);
            listBd.add(aoiuVar.b);
        }
        if (!z11) {
            return listBd;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBd, 10));
        for (defpackage.amnm amnmVar5 : listBd) {
            arrayList.add(defpackage.akky.s(amnmVar5.a, 0.0d, amnmVar5.c));
        }
        return arrayList;
    }
}
