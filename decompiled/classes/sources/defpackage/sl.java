package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class sl {
    private sl() {
    }

    public static android.os.Bundle a(android.os.Bundle bundle) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.unmarshall(bArrMarshall, 0, bArrMarshall.length);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readBundle(defpackage.sl.class.getClassLoader());
        } finally {
            parcelObtain.recycle();
        }
    }

    public static java.util.Iterator b(defpackage.aed aedVar) {
        defpackage.aooh.f(aedVar, "<this>");
        return new aeg(aedVar);
    }

    public static defpackage.cmw c(defpackage.cmw cmwVar, int i) {
        return cmwVar.a(new ayg(i));
    }

    public static defpackage.cmw d(defpackage.cmw cmwVar) {
        return cmwVar.a(new ayj());
    }

    public static void e(defpackage.csv csvVar, defpackage.ctx ctxVar) {
        java.util.List list = ctxVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.sl slVar = (defpackage.sl) list.get(i);
            if (slVar instanceof defpackage.cua) {
                defpackage.csy csyVar = new defpackage.csy();
                defpackage.cua cuaVar = (defpackage.cua) slVar;
                csyVar.c = cuaVar.b;
                csyVar.m = true;
                csyVar.f();
                csyVar.p.m(cuaVar.c);
                csyVar.f();
                java.lang.String str = cuaVar.a;
                csyVar.f();
                csyVar.a = cuaVar.d;
                csyVar.f();
                csyVar.b = cuaVar.e;
                csyVar.f();
                csyVar.f = cuaVar.f;
                csyVar.f();
                csyVar.d = cuaVar.g;
                csyVar.f();
                csyVar.e = cuaVar.h;
                csyVar.n = true;
                csyVar.f();
                csyVar.g = cuaVar.i;
                csyVar.n = true;
                csyVar.f();
                csyVar.h = cuaVar.j;
                csyVar.n = true;
                csyVar.f();
                csyVar.i = cuaVar.k;
                csyVar.n = true;
                csyVar.f();
                csyVar.j = cuaVar.l;
                csyVar.o = true;
                csyVar.f();
                csyVar.k = cuaVar.m;
                csyVar.o = true;
                csyVar.f();
                csyVar.l = cuaVar.n;
                csyVar.o = true;
                csyVar.f();
                csvVar.c(i, csyVar);
            } else if (slVar instanceof defpackage.ctx) {
                defpackage.csv csvVar2 = new defpackage.csv();
                defpackage.ctx ctxVar2 = (defpackage.ctx) slVar;
                csvVar2.f = ctxVar2.a;
                csvVar2.f();
                csvVar2.g = ctxVar2.b;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.j = ctxVar2.e;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.k = ctxVar2.f;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.l = ctxVar2.g;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.m = ctxVar2.h;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.h = ctxVar2.c;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.i = ctxVar2.d;
                csvVar2.n = true;
                csvVar2.f();
                csvVar2.c = ctxVar2.i;
                csvVar2.d = true;
                csvVar2.f();
                e(csvVar2, ctxVar2);
                csvVar.c(i, csvVar2);
            }
        }
    }

    public static defpackage.ctz f(defpackage.csx csxVar, defpackage.cav cavVar) {
        defpackage.dpf dpfVar = (defpackage.dpf) cavVar.e(defpackage.dfo.e);
        float f = csxVar.l;
        float fA = dpfVar.a();
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA);
        cavVar.u(-1202926088);
        defpackage.vx vxVar = (defpackage.vx) cavVar.e(defpackage.dfo.s);
        cavVar.o();
        long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
        boolean zA = cavVar.A(j);
        java.lang.Object objG = cavVar.g();
        if (zA || objG == defpackage.cau.a) {
            objG = vxVar != null ? new defpackage.jxt(csxVar, dpfVar, vxVar) : null;
            cavVar.w(objG);
        }
        defpackage.jxt jxtVar = (defpackage.jxt) objG;
        boolean zA2 = cavVar.A(j);
        java.lang.Object objG2 = cavVar.g();
        if (zA2 || objG2 == defpackage.cau.a) {
            defpackage.csv csvVar = new defpackage.csv();
            e(csvVar, csxVar.h);
            float f2 = csxVar.d;
            float f3 = csxVar.e;
            float fDl = dpfVar.dl(f2);
            float fDl2 = dpfVar.dl(f3);
            long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fDl);
            long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fDl2);
            float fIntBitsToFloat = csxVar.f;
            float fIntBitsToFloat2 = csxVar.g;
            long j2 = (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L);
            if (java.lang.Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
            }
            if (java.lang.Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            long jFloatToRawIntBits5 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32;
            long jFloatToRawIntBits6 = ((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L;
            defpackage.ctz ctzVar = new defpackage.ctz(csvVar, jxtVar);
            java.lang.String str = csxVar.c;
            long j3 = csxVar.i;
            defpackage.cqa cqaVar = j3 != 16 ? new defpackage.cqa(j3, csxVar.j) : null;
            boolean z = csxVar.k;
            ctzVar.a.b(new defpackage.cpp(j2));
            ctzVar.b.b(java.lang.Boolean.valueOf(z));
            defpackage.ctu ctuVar = ctzVar.c;
            ctuVar.e.b(cqaVar);
            ctuVar.f.b(new defpackage.cpp(jFloatToRawIntBits5 | jFloatToRawIntBits6));
            ctuVar.b = str;
            cavVar.w(ctzVar);
            objG2 = ctzVar;
        }
        return (defpackage.ctz) objG2;
    }

    public static void g(java.util.List list, defpackage.cpx cpxVar) {
        defpackage.cts ctsVar;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        java.util.List list2 = list;
        defpackage.cpx cpxVar2 = cpxVar;
        int iA = cpxVar2.a();
        cpxVar2.l();
        cpxVar2.m(iA);
        defpackage.cts ctsVar2 = list2.isEmpty() ? defpackage.cta.a : (defpackage.cts) list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (i < size) {
            defpackage.cts ctsVar3 = (defpackage.cts) list2.get(i);
            if (ctsVar3 instanceof defpackage.cta) {
                cpxVar2.c();
                size = size;
                f15 = f15;
                i = i;
                ctsVar = ctsVar3;
                f16 = f20;
                f19 = f16;
                f17 = f21;
                f18 = f17;
            } else {
                if (ctsVar3 instanceof defpackage.ctm) {
                    defpackage.ctm ctmVar = (defpackage.ctm) ctsVar3;
                    float f22 = ctmVar.a;
                    f18 += f22;
                    float f23 = ctmVar.b;
                    f19 += f23;
                    cpxVar2.a.rMoveTo(f22, f23);
                    f21 = f18;
                    f20 = f19;
                } else if (ctsVar3 instanceof defpackage.cte) {
                    defpackage.cte cteVar = (defpackage.cte) ctsVar3;
                    float f24 = cteVar.a;
                    float f25 = cteVar.b;
                    cpxVar2.f(f24, f25);
                    f19 = f25;
                    f20 = f19;
                    f18 = f24;
                    f21 = f18;
                } else {
                    if (ctsVar3 instanceof defpackage.ctl) {
                        defpackage.ctl ctlVar = (defpackage.ctl) ctsVar3;
                        float f26 = ctlVar.a;
                        f14 = ctlVar.b;
                        cpxVar2.i(f26, f14);
                        f18 += f26;
                    } else {
                        if (ctsVar3 instanceof defpackage.ctd) {
                            defpackage.ctd ctdVar = (defpackage.ctd) ctsVar3;
                            f3 = ctdVar.a;
                            f4 = ctdVar.b;
                            cpxVar2.e(f3, f4);
                        } else if (ctsVar3 instanceof defpackage.ctk) {
                            float f27 = ((defpackage.ctk) ctsVar3).a;
                            cpxVar2.i(f27, f15);
                            f18 += f27;
                        } else if (ctsVar3 instanceof defpackage.ctc) {
                            float f28 = ((defpackage.ctc) ctsVar3).a;
                            cpxVar2.e(f28, f19);
                            f18 = f28;
                        } else if (ctsVar3 instanceof defpackage.ctq) {
                            f14 = ((defpackage.ctq) ctsVar3).a;
                            cpxVar2.i(f15, f14);
                        } else if (ctsVar3 instanceof defpackage.ctr) {
                            float f29 = ((defpackage.ctr) ctsVar3).a;
                            cpxVar2.e(f18, f29);
                            f19 = f29;
                        } else {
                            if (ctsVar3 instanceof ctj) {
                                ctj ctjVar = (ctj) ctsVar3;
                                float f30 = ctjVar.a;
                                float f31 = ctjVar.b;
                                f10 = ctjVar.c;
                                f11 = ctjVar.d;
                                f12 = ctjVar.e;
                                f13 = ctjVar.f;
                                cpxVar2.h(f30, f31, f10, f11, f12, f13);
                            } else {
                                if (ctsVar3 instanceof ctb) {
                                    ctb ctbVar = (ctb) ctsVar3;
                                    float f32 = ctbVar.a;
                                    float f33 = ctbVar.b;
                                    f17 = ctbVar.c;
                                    f5 = ctbVar.d;
                                    f6 = ctbVar.e;
                                    f7 = ctbVar.f;
                                    cpxVar.d(f32, f33, f17, f5, f6, f7);
                                } else if (ctsVar3 instanceof cto) {
                                    if (ctsVar2.h) {
                                        f8 = f18 - f17;
                                        f9 = f19 - f16;
                                    } else {
                                        f8 = f15;
                                        f9 = f8;
                                    }
                                    cto ctoVar = (cto) ctsVar3;
                                    f10 = ctoVar.a;
                                    f11 = ctoVar.b;
                                    f12 = ctoVar.c;
                                    f13 = ctoVar.d;
                                    cpxVar.h(f8, f9, f10, f11, f12, f13);
                                } else if (ctsVar3 instanceof ctg) {
                                    if (ctsVar2.h) {
                                        f19 = (f19 + f19) - f16;
                                        f18 = (f18 + f18) - f17;
                                    }
                                    ctg ctgVar = (ctg) ctsVar3;
                                    f17 = ctgVar.a;
                                    f5 = ctgVar.b;
                                    f6 = ctgVar.c;
                                    f7 = ctgVar.d;
                                    cpxVar.d(f18, f19, f17, f5, f6, f7);
                                } else if (ctsVar3 instanceof defpackage.ctn) {
                                    defpackage.ctn ctnVar = (defpackage.ctn) ctsVar3;
                                    float f34 = ctnVar.a;
                                    float f35 = ctnVar.b;
                                    float f36 = ctnVar.c;
                                    float f37 = ctnVar.d;
                                    cpxVar.j(f34, f35, f36, f37);
                                    float f38 = f34 + f18;
                                    float f39 = f35 + f19;
                                    f18 += f36;
                                    f19 += f37;
                                    f17 = f38;
                                    f16 = f39;
                                } else if (ctsVar3 instanceof defpackage.ctf) {
                                    defpackage.ctf ctfVar = (defpackage.ctf) ctsVar3;
                                    float f40 = ctfVar.a;
                                    float f41 = ctfVar.b;
                                    f3 = ctfVar.c;
                                    f4 = ctfVar.d;
                                    cpxVar.g(f40, f41, f3, f4);
                                    f17 = f40;
                                    f16 = f41;
                                } else if (ctsVar3 instanceof defpackage.ctp) {
                                    if (ctsVar2.i) {
                                        f = f19 - f16;
                                        f2 = f18 - f17;
                                    } else {
                                        f = f15;
                                        f2 = f;
                                    }
                                    defpackage.ctp ctpVar = (defpackage.ctp) ctsVar3;
                                    float f42 = ctpVar.a;
                                    float f43 = ctpVar.b;
                                    cpxVar.j(f2, f, f42, f43);
                                    float f44 = f2 + f18;
                                    float f45 = f + f19;
                                    f18 += f42;
                                    f19 += f43;
                                    f17 = f44;
                                    size = size;
                                    f15 = f15;
                                    i = i;
                                    ctsVar = ctsVar3;
                                    f16 = f45;
                                } else if (ctsVar3 instanceof defpackage.cth) {
                                    if (ctsVar2.i) {
                                        f19 = (f19 + f19) - f16;
                                        f18 = (f18 + f18) - f17;
                                    }
                                    defpackage.cth cthVar = (defpackage.cth) ctsVar3;
                                    float f46 = cthVar.a;
                                    float f47 = cthVar.b;
                                    cpxVar.g(f18, f19, f46, f47);
                                    size = size;
                                    f15 = f15;
                                    i = i;
                                    f17 = f18;
                                    ctsVar = ctsVar3;
                                    f18 = f46;
                                    f16 = f19;
                                    f19 = f47;
                                } else if (ctsVar3 instanceof cti) {
                                    double d = f18;
                                    cti ctiVar = (cti) ctsVar3;
                                    float f48 = ctiVar.f + f18;
                                    float f49 = ctiVar.g + f19;
                                    f15 = 0.0f;
                                    i = i;
                                    size = size;
                                    h(cpxVar, d, f19, f48, f49, ctiVar.a, ctiVar.b, ctiVar.c, ctiVar.d, ctiVar.e);
                                    f17 = f48;
                                    f18 = f17;
                                    f16 = f49;
                                    f19 = f16;
                                    ctsVar = ctsVar3;
                                } else {
                                    size = size;
                                    f15 = f15;
                                    i = i;
                                    if (!(ctsVar3 instanceof csz)) {
                                        throw new defpackage.aois();
                                    }
                                    csz cszVar = (csz) ctsVar3;
                                    float f50 = cszVar.f;
                                    float f51 = cszVar.g;
                                    ctsVar = ctsVar3;
                                    h(cpxVar, f18, f19, f50, f51, cszVar.a, cszVar.b, cszVar.c, cszVar.d, cszVar.e);
                                    f17 = f50;
                                    f18 = f17;
                                    f16 = f51;
                                    f19 = f16;
                                }
                                f16 = f5;
                                f18 = f6;
                                f19 = f7;
                            }
                            f17 = f10 + f18;
                            float f52 = f11 + f19;
                            f18 += f12;
                            f19 += f13;
                            f16 = f52;
                        }
                        f19 = f4;
                        f18 = f3;
                    }
                    f19 += f14;
                }
                ctsVar = ctsVar3;
            }
            i++;
            list2 = list;
            cpxVar2 = cpxVar;
            size = size;
            ctsVar2 = ctsVar;
            f15 = f15;
        }
    }

    private static void h(defpackage.cpx cpxVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = java.lang.Math.cos(d11);
        double dSin = java.lang.Math.sin(d11);
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * dCos) + (d2 * dSin)) / d10;
        double d16 = ((d3 * dCos) + (d4 * dSin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 != 0.0d) {
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                double dSqrt = (float) (java.lang.Math.sqrt(d18) / 1.99999d);
                h(cpxVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
                return;
            }
            double dSqrt2 = java.lang.Math.sqrt(d19);
            double d20 = (d12 + d13) / 2.0d;
            double d21 = d17 * dSqrt2;
            double d22 = (d15 + d16) / 2.0d;
            double d23 = dSqrt2 * d14;
            if (z == z2) {
                d8 = d22 - d23;
                d9 = d20 + d21;
            } else {
                d8 = d22 + d23;
                d9 = d20 - d21;
            }
            double d24 = d9;
            double dAtan2 = java.lang.Math.atan2(d12 - d9, d15 - d8);
            double dAtan3 = java.lang.Math.atan2(d13 - d9, d16 - d8) - dAtan2;
            int i = (dAtan3 > 0.0d ? 1 : (dAtan3 == 0.0d ? 0 : -1));
            if (z2 != ((i ^ (-1)) >>> 31)) {
                dAtan3 += i > 0 ? -6.283185307179586d : 6.283185307179586d;
            }
            double d25 = d8 * d10;
            double d26 = d24 * d6;
            double d27 = d25 * dCos;
            double d28 = d26 * dSin;
            double d29 = d25 * dSin;
            double d30 = d26 * dCos;
            int iCeil = (int) java.lang.Math.ceil(java.lang.Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = java.lang.Math.cos(d11);
            double dSin2 = java.lang.Math.sin(d11);
            double dCos3 = java.lang.Math.cos(dAtan2);
            double dSin3 = java.lang.Math.sin(dAtan2);
            double d31 = dAtan3;
            double d32 = -d10;
            double d33 = d32 * dCos2;
            double d34 = d6 * dSin2;
            double d35 = d32 * dSin2;
            double d36 = d6 * dCos2;
            double d37 = (dSin3 * d35) + (dCos3 * d36);
            double d38 = (d33 * dSin3) - (d34 * dCos3);
            double d39 = dAtan2;
            int i2 = 0;
            double d40 = d;
            double d41 = d2;
            while (i2 < iCeil) {
                int i3 = i2;
                double d42 = d39 + (d31 / ((double) iCeil));
                double dSin4 = java.lang.Math.sin(d42);
                double dCos4 = java.lang.Math.cos(d42);
                double d43 = d42 - d39;
                double dTan = java.lang.Math.tan(d43 / 2.0d);
                double dSin5 = (java.lang.Math.sin(d43) * (java.lang.Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d44 = d41 + (d37 * dSin5);
                int i4 = iCeil;
                double d45 = d29 + d30 + (d10 * dSin2 * dCos4) + (d36 * dSin4);
                double d46 = ((d27 - d28) + ((d10 * dCos2) * dCos4)) - (d34 * dSin4);
                d37 = (dSin4 * d35) + (dCos4 * d36);
                d38 = (d33 * dSin4) - (d34 * dCos4);
                cpxVar.d((float) (d40 + (d38 * dSin5)), (float) d44, (float) (d46 - (dSin5 * d38)), (float) (d45 - (dSin5 * d37)), (float) d46, (float) d45);
                i2 = i3 + 1;
                d39 = d42;
                d40 = d46;
                d30 = d30;
                dCos2 = dCos2;
                d41 = d45;
                iCeil = i4;
                dSin2 = dSin2;
                d10 = d5;
            }
        }
    }

    public sl(char[] cArr) {
    }
}
