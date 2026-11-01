package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csb extends defpackage.crn {
    private static final defpackage.cru q = new defpackage.cro(6);
    public final defpackage.csd d;
    public final float e;
    public final float f;
    public final defpackage.csc g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final defpackage.cru k;
    public final defpackage.aonj l;
    public final defpackage.cru m;
    public final defpackage.cru n;
    public final defpackage.aonj o;
    public final defpackage.cru p;
    private final boolean r;

    /* JADX WARN: Code duplicated, block: B:30:0x0159  */
    /* JADX WARN: Code duplicated, block: B:46:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public csb(java.lang.String str, float[] fArr, defpackage.csd csdVar, float[] fArr2, defpackage.cru cruVar, defpackage.cru cruVar2, float f, float f2, defpackage.csc cscVar, int i) {
        char c;
        char c2;
        int i2;
        float[] fArr3;
        boolean z;
        defpackage.csb csbVar;
        double d;
        super(str, 12884901888L, i);
        this.d = csdVar;
        this.e = f;
        this.f = f2;
        this.g = cscVar;
        this.k = cruVar;
        this.l = new defpackage.bjp(this, 14);
        final int i3 = 1;
        this.m = new defpackage.cru() { // from class: cry
            @Override // defpackage.cru
            public final double a(double d2) {
                int i4 = i3;
                if (i4 == 0) {
                    defpackage.csb csbVar2 = (defpackage.csb) this;
                    return csbVar2.n.a(defpackage.aooc.p(d2, csbVar2.e, csbVar2.f));
                }
                if (i4 == 1) {
                    defpackage.csb csbVar3 = (defpackage.csb) this;
                    return defpackage.aooc.p(csbVar3.k.a(d2), csbVar3.e, csbVar3.f);
                }
                java.lang.Object obj = this;
                if (i4 != 2) {
                    defpackage.csc cscVar2 = (defpackage.csc) obj;
                    double d3 = cscVar2.a;
                    double d4 = cscVar2.e;
                    return defpackage.cfd.r(d2, cscVar2.b, cscVar2.c, cscVar2.d, d4, d3);
                }
                defpackage.csc cscVar3 = (defpackage.csc) obj;
                double d5 = cscVar3.a;
                double d6 = cscVar3.e;
                return defpackage.cfd.s(d2, cscVar3.b, cscVar3.c, cscVar3.d, d6, d5);
            }
        };
        this.n = cruVar2;
        this.o = new defpackage.bjp(this, 15);
        final int i4 = 0;
        this.p = new defpackage.cru() { // from class: cry
            @Override // defpackage.cru
            public final double a(double d2) {
                int i5 = i4;
                if (i5 == 0) {
                    defpackage.csb csbVar2 = (defpackage.csb) this;
                    return csbVar2.n.a(defpackage.aooc.p(d2, csbVar2.e, csbVar2.f));
                }
                if (i5 == 1) {
                    defpackage.csb csbVar3 = (defpackage.csb) this;
                    return defpackage.aooc.p(csbVar3.k.a(d2), csbVar3.e, csbVar3.f);
                }
                java.lang.Object obj = this;
                if (i5 != 2) {
                    defpackage.csc cscVar2 = (defpackage.csc) obj;
                    double d3 = cscVar2.a;
                    double d4 = cscVar2.e;
                    return defpackage.cfd.r(d2, cscVar2.b, cscVar2.c, cscVar2.d, d4, d3);
                }
                defpackage.csc cscVar3 = (defpackage.csc) obj;
                double d5 = cscVar3.a;
                double d6 = cscVar3.e;
                return defpackage.cfd.s(d2, cscVar3.b, cscVar3.c, cscVar3.d, d6, d5);
            }
        };
        int length = fArr.length;
        if (f >= f2) {
            throw new java.lang.IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArr4 = new float[6];
        defpackage.ajsz.de(fArr, fArr4, 6, 6);
        this.h = fArr4;
        if (fArr2 == null) {
            float f3 = fArr4[0];
            float f4 = fArr4[1];
            float f5 = fArr4[2];
            float f6 = fArr4[3];
            float f7 = fArr4[4];
            float f8 = fArr4[5];
            c = 5;
            float f9 = csdVar.a;
            c2 = 1;
            float f10 = csdVar.b;
            float f11 = 1.0f - f3;
            float f12 = f11 / f4;
            float f13 = 1.0f - f5;
            float f14 = 1.0f - f7;
            float f15 = (1.0f - f9) / f10;
            float f16 = f3 / f4;
            float f17 = (f7 / f8) - f16;
            float f18 = (f5 / f6) - f16;
            float f19 = (f9 / f10) - f16;
            float f20 = (f13 / f6) - f12;
            float f21 = (((f15 - f12) * f18) - (f20 * f19)) / ((((f14 / f8) - f12) * f18) - (f17 * f20));
            float f22 = (f19 - (f17 * f21)) / f18;
            float f23 = (1.0f - f22) - f21;
            float f24 = f23 / f4;
            float f25 = f22 / f6;
            float f26 = f21 / f8;
            i2 = 0;
            fArr3 = new float[]{f3 * f24, f23, f24 * (f11 - f4), f5 * f25, f22, f25 * (f13 - f6), f7 * f26, f21, f26 * (f14 - f8)};
            this.i = fArr3;
        } else {
            c = 5;
            c2 = 1;
            i2 = 0;
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = defpackage.cfd.w(fArr3);
        float fM = defpackage.den.M(fArr4);
        float[] fArr5 = defpackage.crp.a;
        if (fM / defpackage.den.M(defpackage.crp.b) > 0.9f) {
            float f27 = fArr4[i2];
            float f28 = fArr4[c2];
            float f29 = fArr4[2];
            float f30 = fArr4[3];
            float f31 = fArr4[4];
            float f32 = fArr4[c];
        }
        if (i == 0) {
            z = c2;
        } else {
            float[] fArr6 = defpackage.crp.a;
            if (fArr4 != fArr6) {
                int i5 = i2;
                while (true) {
                    if (i5 >= 6) {
                        defpackage.csd csdVar2 = defpackage.crv.a;
                        if (defpackage.cfd.u(csdVar, defpackage.crv.d) && f == 0.0f && f2 == 1.0f) {
                            csbVar = defpackage.crp.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = c2;
                                } else if (!defpackage.den.N(d, cruVar, csbVar.k) && defpackage.den.N(d, cruVar2, csbVar.n)) {
                                    d += 0.00392156862745098d;
                                }
                            }
                        }
                    } else if (java.lang.Float.compare(fArr4[i5], fArr6[i5]) == 0 || java.lang.Math.abs(fArr4[i5] - fArr6[i5]) <= 0.001f) {
                        i5++;
                    }
                }
            } else {
                defpackage.csd csdVar3 = defpackage.crv.a;
                if (defpackage.cfd.u(csdVar, defpackage.crv.d)) {
                    csbVar = defpackage.crp.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = c2;
                        } else if (!defpackage.den.N(d, cruVar, csbVar.k)) {
                        }
                        d += 0.00392156862745098d;
                    }
                }
            }
            z = i2;
        }
        this.r = z;
    }

    @Override // defpackage.crn
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.crn
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.crn
    public final float c(float f, float f2, float f3) {
        defpackage.cru cruVar = this.p;
        float fA = (float) cruVar.a(f);
        float fA2 = (float) cruVar.a(f2);
        float fA3 = (float) cruVar.a(f3);
        float[] fArr = this.i;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // defpackage.crn
    public final long d(float f, float f2, float f3) {
        defpackage.cru cruVar = this.p;
        float fA = (float) cruVar.a(f);
        float fA2 = (float) cruVar.a(f2);
        float fA3 = (float) cruVar.a(f3);
        float[] fArr = this.i;
        int length = fArr.length;
        float f4 = fArr[0] * fA;
        float f5 = fArr[3] * fA2;
        float f6 = fArr[6] * fA3;
        float f7 = fArr[1] * fA;
        float f8 = fArr[4] * fA2;
        return (((long) java.lang.Float.floatToRawIntBits((f4 + f5) + f6)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f7 + f8 + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // defpackage.crn
    public final long e(float f, float f2, float f3, float f4, defpackage.crn crnVar) {
        float[] fArr = this.j;
        float f5 = fArr[0] * f;
        float f6 = fArr[3] * f2;
        float f7 = fArr[6] * f3;
        float f8 = fArr[1] * f;
        float f9 = fArr[4] * f2;
        float f10 = fArr[7] * f3;
        float f11 = fArr[2] * f;
        float f12 = fArr[5] * f2;
        float f13 = fArr[8] * f3;
        defpackage.cru cruVar = this.m;
        return defpackage.cfd.N((float) cruVar.a(f5 + f6 + f7), (float) cruVar.a(f8 + f9 + f10), (float) cruVar.a(f11 + f12 + f13), f4, crnVar);
    }

    @Override // defpackage.crn
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            defpackage.csb csbVar = (defpackage.csb) obj;
            if (java.lang.Float.compare(csbVar.e, this.e) == 0 && java.lang.Float.compare(csbVar.f, this.f) == 0 && defpackage.aooh.n(this.d, csbVar.d) && java.util.Arrays.equals(this.h, csbVar.h)) {
                defpackage.csc cscVar = this.g;
                if (cscVar != null) {
                    return defpackage.aooh.n(cscVar, csbVar.g);
                }
                if (csbVar.g == null) {
                    return true;
                }
                if (defpackage.aooh.n(this.k, csbVar.k)) {
                    return defpackage.aooh.n(this.n, csbVar.n);
                }
            }
        }
        return false;
    }

    @Override // defpackage.crn
    public final boolean f() {
        return this.r;
    }

    @Override // defpackage.crn
    public final int hashCode() {
        int iHashCode = (((super.hashCode() * 31) + this.d.hashCode()) * 31) + java.util.Arrays.hashCode(this.h);
        float f = this.e;
        int iFloatToIntBits = ((iHashCode * 31) + (f == 0.0f ? 0 : java.lang.Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : java.lang.Float.floatToIntBits(f2))) * 31;
        defpackage.csc cscVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (cscVar != null ? cscVar.hashCode() : 0);
        return cscVar == null ? (((iHashCode2 * 31) + this.k.hashCode()) * 31) + this.n.hashCode() : iHashCode2;
    }

    public csb(java.lang.String str, float[] fArr, defpackage.csd csdVar, final defpackage.csc cscVar, int i) {
        csa csaVar;
        csa csaVar2;
        final int i2 = 3;
        if (cscVar.a()) {
            csaVar = new csa(cscVar, 3);
        } else if (cscVar.b()) {
            csaVar = new csa(cscVar, 4);
        } else if (cscVar.f == 0.0d && cscVar.g == 0.0d) {
            csaVar = new defpackage.cru() { // from class: cry
                @Override // defpackage.cru
                public final double a(double d2) {
                    int i5 = i2;
                    if (i5 == 0) {
                        defpackage.csb csbVar2 = (defpackage.csb) cscVar;
                        return csbVar2.n.a(defpackage.aooc.p(d2, csbVar2.e, csbVar2.f));
                    }
                    if (i5 == 1) {
                        defpackage.csb csbVar3 = (defpackage.csb) cscVar;
                        return defpackage.aooc.p(csbVar3.k.a(d2), csbVar3.e, csbVar3.f);
                    }
                    java.lang.Object obj = cscVar;
                    if (i5 != 2) {
                        defpackage.csc cscVar2 = (defpackage.csc) obj;
                        double d3 = cscVar2.a;
                        double d4 = cscVar2.e;
                        return defpackage.cfd.r(d2, cscVar2.b, cscVar2.c, cscVar2.d, d4, d3);
                    }
                    defpackage.csc cscVar3 = (defpackage.csc) obj;
                    double d5 = cscVar3.a;
                    double d6 = cscVar3.e;
                    return defpackage.cfd.s(d2, cscVar3.b, cscVar3.c, cscVar3.d, d6, d5);
                }
            };
        } else {
            csaVar = new csa(cscVar, 5);
        }
        csa csaVar3 = csaVar;
        if (cscVar.a()) {
            csaVar2 = new csa(cscVar, 1);
        } else if (cscVar.b()) {
            csaVar2 = new csa(cscVar, 0);
        } else {
            final int i3 = 2;
            if (cscVar.f == 0.0d && cscVar.g == 0.0d) {
                csaVar2 = new defpackage.cru() { // from class: cry
                    @Override // defpackage.cru
                    public final double a(double d2) {
                        int i5 = i3;
                        if (i5 == 0) {
                            defpackage.csb csbVar2 = (defpackage.csb) cscVar;
                            return csbVar2.n.a(defpackage.aooc.p(d2, csbVar2.e, csbVar2.f));
                        }
                        if (i5 == 1) {
                            defpackage.csb csbVar3 = (defpackage.csb) cscVar;
                            return defpackage.aooc.p(csbVar3.k.a(d2), csbVar3.e, csbVar3.f);
                        }
                        java.lang.Object obj = cscVar;
                        if (i5 != 2) {
                            defpackage.csc cscVar2 = (defpackage.csc) obj;
                            double d3 = cscVar2.a;
                            double d4 = cscVar2.e;
                            return defpackage.cfd.r(d2, cscVar2.b, cscVar2.c, cscVar2.d, d4, d3);
                        }
                        defpackage.csc cscVar3 = (defpackage.csc) obj;
                        double d5 = cscVar3.a;
                        double d6 = cscVar3.e;
                        return defpackage.cfd.s(d2, cscVar3.b, cscVar3.c, cscVar3.d, d6, d5);
                    }
                };
            } else {
                csaVar2 = new csa(cscVar, 2);
            }
        }
        this(str, fArr, csdVar, null, csaVar3, csaVar2, 0.0f, 1.0f, cscVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public csb(java.lang.String str, float[] fArr, defpackage.csd csdVar, final double d, float f, float f2, int i) {
        defpackage.cru cruVar;
        defpackage.cru cruVar2;
        if (d == 1.0d) {
            cruVar = q;
        } else {
            final int i2 = 1;
            cruVar = new defpackage.cru() { // from class: crz
                @Override // defpackage.cru
                public final double a(double d2) {
                    if (i2 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return java.lang.Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return java.lang.Math.pow(d2, d3);
                }
            };
        }
        defpackage.cru cruVar3 = cruVar;
        if (d == 1.0d) {
            cruVar2 = q;
        } else {
            final int i3 = 0;
            cruVar2 = new defpackage.cru() { // from class: crz
                @Override // defpackage.cru
                public final double a(double d2) {
                    if (i3 != 0) {
                        if (d2 < 0.0d) {
                            d2 = 0.0d;
                        }
                        return java.lang.Math.pow(d2, 1.0d / d);
                    }
                    double d3 = d;
                    if (d2 < 0.0d) {
                        d2 = 0.0d;
                    }
                    return java.lang.Math.pow(d2, d3);
                }
            };
        }
        this(str, fArr, csdVar, null, cruVar3, cruVar2, f, f2, new defpackage.csc(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
