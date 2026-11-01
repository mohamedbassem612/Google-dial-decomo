package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfu implements defpackage.dct {
    public defpackage.aonn a;
    private defpackage.cso b;
    private final defpackage.deg c;
    private defpackage.aomy d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private defpackage.cqx o;
    private boolean p;
    private boolean q;
    private boolean s;
    private final defpackage.apkl u;
    private long e = 9223372034707292159L;
    private final float[] g = defpackage.cqt.e();
    private defpackage.dpf j = new defpackage.dpg(1.0f, 1.0f);
    private defpackage.dpq k = defpackage.dpq.a;
    private final defpackage.csh l = new defpackage.csh();
    private long n = defpackage.mni.bj(0.5f, 0.5f);
    private boolean r = true;
    private final defpackage.aonj t = new defpackage.ddz(this, 7);

    public dfu(defpackage.cso csoVar, defpackage.apkl apklVar, defpackage.deg degVar, defpackage.aonn aonnVar, defpackage.aomy aomyVar) {
        this.b = csoVar;
        this.u = apklVar;
        this.c = degVar;
        this.a = aonnVar;
        this.d = aomyVar;
    }

    private final void l(boolean z) {
        if (z != this.i) {
            this.i = z;
            defpackage.deg degVar = this.c;
            if (!z) {
                if (degVar.s) {
                    return;
                }
                degVar.I.p(this);
                defpackage.adq adqVar = degVar.J;
                if (adqVar != null) {
                    adqVar.p(this);
                    return;
                }
                return;
            }
            if (!degVar.s) {
                degVar.I.q(this);
                return;
            }
            defpackage.adq adqVar2 = degVar.J;
            if (adqVar2 == null) {
                adqVar2 = new defpackage.adq(16);
                degVar.J = adqVar2;
            }
            adqVar2.q(this);
        }
    }

    private final void m() {
        defpackage.deg degVar = this.c;
        android.view.ViewParent parent = degVar.getParent();
        if (parent != null) {
            da$.ExternalSyntheticApiModelOutline1.m(parent, degVar, degVar);
        }
    }

    private final float[] n() {
        float[] fArrE = this.h;
        if (fArrE == null) {
            fArrE = defpackage.cqt.e();
            this.h = fArrE;
        }
        if (!this.q) {
            if (java.lang.Float.isNaN(fArrE[0])) {
                return null;
            }
            return fArrE;
        }
        this.q = false;
        float[] fArrO = o();
        if (this.r) {
            return fArrO;
        }
        if (!defpackage.dfd.d(fArrO, fArrE)) {
            fArrE[0] = Float.NaN;
            return null;
        }
        return fArrE;
    }

    private final float[] o() {
        if (this.p) {
            defpackage.cso csoVar = this.b;
            long jQ = csoVar.p;
            if ((9223372034707292159L & jQ) == 9205357640488583168L) {
                jQ = defpackage.cdh.q(defpackage.dpy.l(this.e));
            }
            float[] fArr = this.g;
            int i = (int) (4294967295L & jQ);
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jQ >> 32));
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
            defpackage.csp cspVar = csoVar.s;
            float f = cspVar.k;
            float f2 = cspVar.o;
            float f3 = cspVar.i;
            float f4 = cspVar.j;
            double d = ((double) f2) * 0.017453292519943295d;
            float fSin = (float) java.lang.Math.sin(d);
            float fCos = (float) java.lang.Math.cos(d);
            float f5 = fCos * 1.0f;
            float f6 = ((fSin * 0.0f) + f5) * f3;
            float f7 = fSin * 1.0f * f3;
            float f8 = ((fCos * (-0.0f)) + (fSin * 0.0f)) * f3;
            float f9 = -fSin;
            float f10 = ((f9 * 1.0f) + (fCos * 0.0f)) * f4;
            float f11 = f5 * f4;
            float f12 = ((f9 * (-0.0f)) + (fCos * 0.0f)) * f4;
            fArr[0] = f6;
            fArr[1] = f7;
            fArr[2] = f8;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            fArr[5] = f11;
            fArr[6] = f12;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = -0.0f;
            fArr[10] = 1.0f;
            fArr[11] = 0.0f;
            float f13 = -fIntBitsToFloat;
            float f14 = f6 * f13;
            fArr[12] = (f14 - (f10 * fIntBitsToFloat2)) + (f * 1.0f) + 0.0f + fIntBitsToFloat;
            fArr[13] = ((f7 * f13) - (f11 * fIntBitsToFloat2)) + 0.0f + fIntBitsToFloat2;
            fArr[14] = ((f13 * f8) - (fIntBitsToFloat2 * f12)) + ((-f) * 0.0f) + 0.0f;
            fArr[15] = 1.0f;
            this.p = false;
            this.r = defpackage.cfd.I(fArr);
        }
        return this.g;
    }

    @Override // defpackage.dct
    public final long a(long j, boolean z) {
        float[] fArrO;
        if (z) {
            fArrO = n();
            if (fArrO == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrO = o();
        }
        return !this.r ? defpackage.cqt.a(fArrO, j) : j;
    }

    @Override // defpackage.dct
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        l(false);
        defpackage.apkl apklVar = this.u;
        if (apklVar != null) {
            apklVar.k(this.b);
            defpackage.deg degVar = this.c;
            defpackage.enr enrVar = degVar.M;
            enrVar.i();
            ((defpackage.cfc) enrVar.b).n(new java.lang.ref.WeakReference(this, (java.lang.ref.ReferenceQueue) enrVar.a));
            degVar.I.p(this);
        }
    }

    @Override // defpackage.dct
    public final void c(defpackage.cqf cqfVar, defpackage.cso csoVar) {
        h();
        this.s = this.b.b() > 0.0f;
        defpackage.csh cshVar = this.l;
        defpackage.csg csgVar = cshVar.b;
        csgVar.e(cqfVar);
        csgVar.a = csoVar;
        defpackage.den.H(cshVar, this.b);
    }

    @Override // defpackage.dct
    public final void d(defpackage.cpl cplVar, boolean z) {
        float[] fArrN = z ? n() : o();
        if (this.r) {
            return;
        }
        if (fArrN == null) {
            cplVar.d(0.0f, 0.0f);
        } else {
            defpackage.cqt.b(fArrN, cplVar);
        }
    }

    @Override // defpackage.dct
    public final void e(long j) {
        if (defpackage.deg.ao()) {
            this.c.F(-4.0f);
        }
        defpackage.cso csoVar = this.b;
        if (csoVar.j != j) {
            csoVar.j = j;
            csoVar.k(j, csoVar.k);
        }
        m();
    }

    @Override // defpackage.dct
    public final void f(long j) {
        if (j != this.e) {
            defpackage.deg degVar = this.c;
            if (defpackage.deg.ao()) {
                degVar.F(-4.0f);
            }
            this.e = j;
            invalidate();
        }
    }

    @Override // defpackage.dct
    public final void g(defpackage.aonn aonnVar, defpackage.aomy aomyVar) {
        defpackage.apkl apklVar = this.u;
        if (apklVar == null) {
            defpackage.cwh.b("currently reuse is only supported when we manage the layer lifecycle");
            throw new defpackage.aoiq();
        }
        if (!this.b.i) {
            defpackage.cwh.c("layer should have been released before reuse");
        }
        this.b = apklVar.i();
        this.f = false;
        this.a = aonnVar;
        this.d = aomyVar;
        this.p = false;
        this.q = false;
        this.r = true;
        defpackage.cqt.c(this.g);
        float[] fArr = this.h;
        if (fArr != null) {
            defpackage.cqt.c(fArr);
        }
        this.n = defpackage.mni.bj(0.5f, 0.5f);
        this.s = false;
        this.e = 9223372034707292159L;
        this.o = null;
        this.m = 0;
    }

    @Override // defpackage.dct
    public final void h() {
        if (this.i) {
            if (this.n != defpackage.mni.bj(0.5f, 0.5f)) {
                defpackage.cso csoVar = this.b;
                if (csoVar.k != this.e) {
                    csoVar.j((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L)))) & 4294967295L));
                }
            }
            this.b.g(this.j, this.k, this.e, this.t);
            l(false);
        }
    }

    @Override // defpackage.dct
    public final void i(defpackage.cra craVar) {
        defpackage.aomy aomyVar;
        defpackage.aomy aomyVar2;
        int i = craVar.a | this.m;
        this.k = craVar.s;
        defpackage.dpf dpfVar = craVar.r;
        this.j = dpfVar;
        boolean z = false;
        if ((1048576 & i) != 0) {
            defpackage.cso csoVar = this.b;
            float f = craVar.q.b;
            int iDp = dpfVar.dp(0.0f);
            float f2 = craVar.q.c;
            int iDp2 = dpfVar.dp(0.0f);
            float f3 = craVar.q.d;
            int iDp3 = dpfVar.dp(0.0f);
            float f4 = craVar.q.e;
            int iDp4 = dpfVar.dp(0.0f);
            csoVar.l = iDp;
            csoVar.m = iDp2;
            csoVar.n = iDp3;
            csoVar.o = iDp4;
            defpackage.csp cspVar = csoVar.s;
            if (iDp < 0 || iDp2 < 0 || iDp3 < 0 || iDp4 < 0) {
                defpackage.cqp.a("Outsets cannot be negative! Left: " + iDp + ", Top: " + iDp2 + ", Right: " + iDp3 + ", Bottom: " + iDp4);
            }
            int i2 = cspVar.q;
            if (iDp != i2 || iDp2 != cspVar.r || iDp3 != cspVar.s || iDp4 != cspVar.t) {
                boolean z2 = (iDp == i2 && iDp2 == cspVar.r) ? false : true;
                cspVar.q = iDp;
                cspVar.r = iDp2;
                cspVar.s = iDp3;
                cspVar.t = iDp4;
                cspVar.e();
                if (z2) {
                    cspVar.d();
                }
            }
            invalidate();
        }
        int i3 = i & 4096;
        if (i3 != 0) {
            this.n = craVar.l;
        }
        if ((i & 1) != 0) {
            defpackage.cso csoVar2 = this.b;
            float f5 = craVar.b;
            defpackage.csp cspVar2 = csoVar2.s;
            if (cspVar2.i != f5) {
                cspVar2.i = f5;
                fn$.ExternalSyntheticApiModelOutline0.m(cspVar2.b, f5);
            }
        }
        if ((i & 2) != 0) {
            defpackage.cso csoVar3 = this.b;
            float f6 = craVar.c;
            defpackage.csp cspVar3 = csoVar3.s;
            if (cspVar3.j != f6) {
                cspVar3.j = f6;
                fn$.ExternalSyntheticApiModelOutline0.m$1(cspVar3.b, f6);
            }
        }
        if ((i & 4) != 0) {
            this.b.i(craVar.d);
        }
        if ((i & 8) != 0) {
            defpackage.cso csoVar4 = this.b;
            float f7 = craVar.e;
            defpackage.csp cspVar4 = csoVar4.s;
            if (cspVar4.k != f7) {
                cspVar4.k = f7;
                fn$.ExternalSyntheticApiModelOutline0.m$2(cspVar4.b, f7);
            }
        }
        if ((i & 16) != 0) {
            defpackage.cso csoVar5 = this.b;
            float f8 = craVar.f;
            defpackage.csp cspVar5 = csoVar5.s;
        }
        if ((i & 32) != 0) {
            defpackage.cso csoVar6 = this.b;
            float f9 = craVar.g;
            defpackage.csp cspVar6 = csoVar6.s;
            if (cspVar6.l != f9) {
                cspVar6.l = f9;
                fn$.ExternalSyntheticApiModelOutline0.m$3(cspVar6.b, f9);
                csoVar6.c = true;
                csoVar6.d();
            }
            if (craVar.g > 0.0f && !this.s && (aomyVar2 = this.d) != null) {
                aomyVar2.a();
            }
        }
        if ((i & 64) != 0) {
            defpackage.cso csoVar7 = this.b;
            long j = craVar.h;
            defpackage.csp cspVar7 = csoVar7.s;
            if (j != cspVar7.m) {
                cspVar7.m = j;
                android.graphics.RenderNode renderNode = cspVar7.b;
                float[] fArr = defpackage.crp.a;
                fn$.ExternalSyntheticApiModelOutline0.m(renderNode, (int) (defpackage.cqg.e(j, defpackage.crp.e) >>> 32));
            }
        }
        if ((i & 128) != 0) {
            defpackage.cso csoVar8 = this.b;
            long j2 = craVar.i;
            defpackage.csp cspVar8 = csoVar8.s;
            if (j2 != cspVar8.n) {
                cspVar8.n = j2;
                android.graphics.RenderNode renderNode2 = cspVar8.b;
                float[] fArr2 = defpackage.crp.a;
                fn$.ExternalSyntheticApiModelOutline0.m$1(renderNode2, (int) (defpackage.cqg.e(j2, defpackage.crp.e) >>> 32));
            }
        }
        if ((i & 1024) != 0) {
            defpackage.cso csoVar9 = this.b;
            float f10 = craVar.j;
            defpackage.csp cspVar9 = csoVar9.s;
            if (cspVar9.o != f10) {
                cspVar9.o = f10;
                fn$.ExternalSyntheticApiModelOutline0.m$4(cspVar9.b, f10);
            }
        }
        if ((i & 256) != 0) {
            defpackage.csp cspVar10 = this.b.s;
        }
        if ((i & 512) != 0) {
            defpackage.csp cspVar11 = this.b.s;
        }
        if ((i & 2048) != 0) {
            defpackage.cso csoVar10 = this.b;
            float f11 = craVar.k;
            defpackage.csp cspVar12 = csoVar10.s;
            if (cspVar12.p != f11) {
                cspVar12.p = f11;
                fn$.ExternalSyntheticApiModelOutline0.m$5(cspVar12.b, f11);
            }
        }
        if (i3 != 0) {
            long j3 = this.n;
            long jBj = defpackage.mni.bj(0.5f, 0.5f);
            defpackage.cso csoVar11 = this.b;
            if (j3 == jBj) {
                csoVar11.j(9205357640488583168L);
            } else {
                csoVar11.j((((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n >> 32)) * ((int) (this.e >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (this.n & 4294967295L)) * ((int) (this.e & 4294967295L)))) & 4294967295L));
            }
        }
        if ((i & 16384) != 0) {
            defpackage.cso csoVar12 = this.b;
            boolean z3 = craVar.n;
            if (csoVar12.q != z3) {
                csoVar12.q = z3;
                csoVar12.c = true;
                csoVar12.d();
            }
        }
        if ((131072 & i) != 0) {
            defpackage.csp cspVar13 = this.b.s;
        }
        if ((262144 & i) != 0) {
            defpackage.csp cspVar14 = this.b.s;
        }
        if ((524288 & i) != 0) {
            defpackage.cso csoVar13 = this.b;
            int i4 = craVar.t;
            defpackage.csp cspVar15 = csoVar13.s;
            if (cspVar15.g != i4) {
                cspVar15.g = i4;
                android.graphics.Paint paint = cspVar15.d;
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    cspVar15.d = paint;
                }
                da$.ExternalSyntheticApiModelOutline0.m(paint, defpackage.rz.i(i4));
                cspVar15.c();
            }
        }
        if ((32768 & i) != 0) {
            defpackage.cso csoVar14 = this.b;
            int i5 = craVar.o;
            defpackage.csp cspVar16 = csoVar14.s;
            if (cspVar16.w != i5) {
                cspVar16.w = i5;
                cspVar16.c();
            }
        }
        if ((i & 7963) != 0) {
            this.p = true;
            this.q = true;
        }
        if (!defpackage.aooh.n(this.o, craVar.u)) {
            defpackage.cqx cqxVar = craVar.u;
            this.o = cqxVar;
            if (cqxVar == null) {
                z = true;
            } else {
                defpackage.cso csoVar15 = this.b;
                if (cqxVar instanceof defpackage.cqv) {
                    defpackage.cpn cpnVar = ((defpackage.cqv) cqxVar).a;
                    float f12 = cpnVar.b;
                    long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f12);
                    float f13 = cpnVar.c;
                    csoVar15.l((jFloatToRawIntBits << 32) | (((long) java.lang.Float.floatToRawIntBits(f13)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cpnVar.d - f12)) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpnVar.e - f13)) & 4294967295L), 0.0f);
                } else if (cqxVar instanceof defpackage.cqu) {
                    csoVar15.m(((defpackage.cqu) cqxVar).a);
                } else {
                    if (!(cqxVar instanceof defpackage.cqw)) {
                        throw new defpackage.aois();
                    }
                    defpackage.cqw cqwVar = (defpackage.cqw) cqxVar;
                    defpackage.cpx cpxVar = cqwVar.b;
                    if (cpxVar != null) {
                        csoVar15.m(cpxVar);
                    } else {
                        defpackage.cpo cpoVar = cqwVar.a;
                        csoVar15.l((java.lang.Float.floatToRawIntBits(cpoVar.a) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpoVar.b)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cpoVar.b())) << 32) | (((long) java.lang.Float.floatToRawIntBits(cpoVar.a())) & 4294967295L), java.lang.Float.intBitsToFloat((int) (cpoVar.h >> 32)));
                    }
                }
                if (android.os.Build.VERSION.SDK_INT < 33 && (((cqxVar instanceof defpackage.cqu) || ((cqxVar instanceof defpackage.cqw) && !defpackage.cdh.u(((defpackage.cqw) cqxVar).a))) && (aomyVar = this.d) != null)) {
                    aomyVar.a();
                }
                z = true;
            }
        }
        this.m = craVar.a;
        if (i != 0 || z) {
            m();
            defpackage.deg degVar = this.c;
            if (defpackage.deg.ao()) {
                degVar.F(0.0f);
            }
        }
    }

    @Override // defpackage.dct
    public final void invalidate() {
        if (this.i || this.f) {
            return;
        }
        this.c.invalidate();
        l(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r5 < r0.e) goto L53;
     */
    @Override // defpackage.dct
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(long r26) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfu.j(long):boolean");
    }

    @Override // defpackage.dct
    public final float[] k() {
        return o();
    }
}
