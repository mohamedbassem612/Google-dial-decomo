package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsl extends defpackage.acrb {
    public defpackage.acsm c;
    public defpackage.acsm d;
    public int e;
    public int f;
    public final ceg g;
    public final ceg h;
    public final cei i;
    public final cei j;
    private final defpackage.acsr k;
    private final defpackage.acso l;
    private aoub m;
    private aoub n;
    private long o;
    private long p;
    private aoub q;
    private aomy r;
    private final aoir s;
    private final aoir t;

    public acsl(aoss aossVar) {
        super(aossVar);
        this.k = new defpackage.acsr();
        this.l = new defpackage.acso();
        this.g = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(1.0f);
        this.h = new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
        this.i = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(0);
        this.o = cfd.S();
        this.p = cfd.S();
        this.s = aooc.ah(3, new defpackage.abmn(aossVar, 13));
        this.t = aooc.ah(3, new defpackage.xtu(aossVar, this, 11, null));
        new android.graphics.RectF();
        new android.graphics.Paint(6);
    }

    private final aoss h() {
        return (aoss) this.t.a();
    }

    private final void i(defpackage.acsm acsmVar, ajl ajlVar) {
        defpackage.aooq aooqVar = new defpackage.aooq();
        ceg cegVar = this.g;
        float fC = cegVar.c();
        aooqVar.a = fC;
        if (fC >= 0.5f) {
            defpackage.acsm acsmVar2 = this.c;
            this.d = acsmVar2;
            fC = acsmVar2 != null ? 1.0f - fC : 0.0f;
            aooqVar.a = fC;
        }
        this.c = acsmVar;
        cegVar.h(fC);
        aoub aoubVar = this.m;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        int i = this.e + 1;
        this.e = i;
        this.m = aoov.an(h(), (aolr) null, 0, new defpackage.xla(aooqVar, ajlVar, i, this, (aoln) null, 6), 3);
    }

    private final boolean j() {
        if (this.g.c() < 0.5f) {
            if (this.d != null) {
                return true;
            }
        } else if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.acrh
    public final /* bridge */ /* synthetic */ void a(defpackage.acrc acrcVar) {
        defpackage.acsm acsmVar = (defpackage.acsm) acrcVar;
        aooh.f(acsmVar, "effect");
        cko ckoVarG = cfd.g();
        aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
        cko ckoVarH = cfd.h(ckoVarG);
        try {
            this.r = null;
            this.f++;
            this.b = acsmVar;
            e().b(acsmVar.k);
            aoiu aoiuVar = acsmVar.c;
            long j = ((cqg) aoiuVar.a).a;
            long j2 = ((cqg) aoiuVar.b).a;
            if (!j()) {
                aoub aoubVar = this.q;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                this.q = null;
                this.o = j;
                this.p = j2;
                this.i.h(cfd.L(j));
                this.j.h(cfd.L(j2));
            } else if (!anty.ah(j, this.o) || !anty.ah(j2, this.p)) {
                this.o = j;
                this.p = j2;
                aoub aoubVar2 = this.q;
                if (aoubVar2 != null) {
                    aoubVar2.s((java.util.concurrent.CancellationException) null);
                }
                this.q = aoov.an(h(), (aolr) null, 0, new defpackage.acsk(this, j, j2, (aoln) null, 0), 3);
            }
            defpackage.acsm acsmVar2 = this.c;
            if (acsmVar2 == null || !a.x(acsmVar2.a, acsmVar.a)) {
                i(acsmVar, j() ? acsmVar.h : acsmVar.f);
            } else {
                this.c = acsmVar;
            }
            aoub aoubVar3 = this.n;
            if ((aoubVar3 == null || !aoubVar3.t()) && g()) {
                this.n = aoov.an(h(), (aolr) null, 0, new defpackage.acbt(this, (aoln) null, 15), 3);
            }
        } finally {
            cfd.i(ckoVarG, ckoVarH, aonjVarI);
        }
    }

    @Override // defpackage.acrh
    public final void b(aomy aomyVar) {
        cko ckoVarG = cfd.g();
        aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
        cko ckoVarH = cfd.h(ckoVarG);
        try {
            this.r = aomyVar;
            int i = this.f + 1;
            this.f = i;
            defpackage.acsm acsmVar = (defpackage.acsm) this.b;
            if (acsmVar == null || !j()) {
                aoub aoubVar = this.m;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                this.m = null;
                this.e++;
                this.c = null;
                this.d = null;
                this.g.h(1.0f);
                aoov.an(this.a, (aolr) null, 0, new defpackage.tmk(i, this, (aoln) null, 4), 3);
            } else {
                i(null, acsmVar.g);
            }
        } finally {
            cfd.i(ckoVarG, ckoVarH, aonjVarI);
        }
    }

    @Override // defpackage.acrh
    public final void c(cpx cpxVar, long j, dpf dpfVar) {
        float[] fArr;
        int[] iArr;
        int i;
        int i2;
        aooh.f(dpfVar, "density");
        float fA = dpfVar.a() * 6.0f;
        defpackage.acsr acsrVar = this.k;
        android.graphics.PathMeasure pathMeasure = acsrVar.r;
        android.graphics.Path path = cpxVar.a;
        cpn cpnVarB = cpxVar.b();
        int i3 = 1;
        pathMeasure.setPath(path, true);
        float length = pathMeasure.getLength();
        if (length != acsrVar.w || fA != acsrVar.x || cpnVarB.b != acsrVar.g || cpnVarB.c != acsrVar.h || cpnVarB.d != acsrVar.i || cpnVarB.e != acsrVar.j) {
            acsrVar.w = length;
            acsrVar.x = fA;
            float f = cpnVarB.b;
            acsrVar.g = f;
            float f2 = cpnVarB.c;
            acsrVar.h = f2;
            float f3 = cpnVarB.d;
            acsrVar.i = f3;
            float f4 = cpnVarB.e;
            acsrVar.j = f4;
            float f5 = (f3 - f) * 0.5f;
            acsrVar.m = f5;
            float f6 = (f4 - f2) * 0.5f;
            acsrVar.n = f6;
            acsrVar.k = f + f5;
            acsrVar.l = f2 + f6;
            float fMin = java.lang.Math.min(f5, f6);
            acsrVar.o = fMin + fMin;
            float fMax = java.lang.Math.max(acsrVar.m, acsrVar.n);
            acsrVar.p = fMax + fMax;
            int i4 = 0;
            boolean z = length > 0.0f && acsrVar.m >= 1.0f && acsrVar.n >= 1.0f;
            acsrVar.a = z;
            if (z) {
                int iW = aooc.w((int) java.lang.Math.ceil(length / java.lang.Math.max(fA, 1.0f)), 48, 256);
                float f7 = iW;
                acsrVar.y = aooc.s(((length + length) / f7) / (acsrVar.o * 0.375f), 0.0873f, 0.5236f);
                while (true) {
                    float f8 = acsrVar.y;
                    acsrVar.z = f8 < 3.1415927f ? (float) java.lang.Math.cos(f8) : -2.0f;
                    acsrVar.b = i4;
                    fArr = acsrVar.u;
                    java.util.Arrays.fill(fArr, i4, 4, 0.0f);
                    iArr = acsrVar.v;
                    java.util.Arrays.fill(iArr, i4, 4, i4);
                    int i5 = i4;
                    while (true) {
                        if (i5 >= iW) {
                            i = i3;
                            i2 = i4;
                            if (acsrVar.a(acsrVar.c[i2], acsrVar.d[i2], acsrVar.f[i2], -acsrVar.e[i2])) {
                                break;
                            }
                        } else {
                            float[] fArr2 = acsrVar.s;
                            i = i3;
                            float[] fArr3 = acsrVar.t;
                            pathMeasure.getPosTan((i5 * length) / f7, fArr2, fArr3);
                            float f9 = fArr2[i4] - acsrVar.k;
                            float f10 = fArr2[i] - acsrVar.l;
                            float f11 = fArr3[i4];
                            float f12 = fArr3[i];
                            if ((i5 <= 0 || acsrVar.a(f9, f10, f11, f12)) && acsrVar.b(f9, f10, f11, f12)) {
                                float fAbs = java.lang.Math.abs(f12);
                                float fAbs2 = java.lang.Math.abs(f11);
                                if (fAbs < 0.98f && fAbs2 < 0.98f) {
                                    int i6 = (f10 > 0.0f ? 2 : i4) + (f9 > 0.0f ? i : i4);
                                    fArr[i6] = fArr[i6] + ((((acsrVar.m - java.lang.Math.abs(f9)) + acsrVar.n) - java.lang.Math.abs(f10)) / ((2.0f - fAbs) - fAbs2));
                                    iArr[i6] = iArr[i6] + 1;
                                }
                                i5++;
                                i3 = i;
                                i4 = i4;
                            } else {
                                i2 = i4;
                            }
                        }
                        float f13 = acsrVar.y;
                        acsrVar.y = f13 + f13;
                        i3 = i;
                        i4 = i2;
                    }
                }
                int i7 = acsrVar.b;
                int i8 = i2;
                float f14 = 0.0f;
                while (i8 < i7) {
                    int i9 = i8 + 1;
                    int i10 = i9 == i7 ? i2 : i9;
                    float[] fArr4 = acsrVar.c;
                    float f15 = fArr4[i8];
                    float[] fArr5 = acsrVar.d;
                    f14 += (f15 * fArr5[i10]) - (fArr4[i10] * fArr5[i8]);
                    i8 = i9;
                }
                if (f14 < 0.0f) {
                    for (int i11 = i2; i11 < i7; i11++) {
                        float[] fArr6 = acsrVar.e;
                        fArr6[i11] = -fArr6[i11];
                        float[] fArr7 = acsrVar.f;
                        fArr7[i11] = -fArr7[i11];
                    }
                }
                float fMin2 = java.lang.Math.min(acsrVar.m, acsrVar.n);
                for (int i12 = i2; i12 < 4; i12++) {
                    float[] fArr8 = acsrVar.q;
                    int i13 = iArr[i12];
                    fArr8[i12] = i13 > 0 ? aooc.s(fArr[i12] / i13, 0.0f, fMin2) : 0.0f;
                }
            } else {
                acsrVar.b = 0;
            }
        }
        defpackage.acso acsoVar = this.l;
        int i14 = acsrVar.b;
        if (i14 > acsoVar.a) {
            acsoVar.a = i14;
            acsoVar.b = new boolean[i14];
            acsoVar.c = new float[i14];
            acsoVar.d = new float[i14];
            acsoVar.e = new float[i14];
            acsoVar.f = new float[i14];
            acsoVar.g = new float[i14];
            acsoVar.h = new float[i14];
            int i15 = i14 + 2;
            acsoVar.i = new float[i15];
            acsoVar.j = new float[i15];
            acsoVar.k = new float[i15];
            acsoVar.l = new float[i15];
            acsoVar.m = new float[i15];
            acsoVar.n = new float[i15];
            acsoVar.o = new float[i15];
            acsoVar.p = new float[i15];
            acsoVar.q = new float[i15];
            acsoVar.r = new float[i15 * 20];
            acsoVar.s = new int[acsoVar.r.length];
            acsoVar.t = defpackage.acsp.c(i15, 7);
            acsoVar.u = defpackage.acsp.c(i15, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:269:0x0867  */
    /* JADX WARN: Code duplicated, block: B:42:0x0189  */
    /* JADX WARN: Code duplicated, block: B:54:0x0213 A[PHI: r0
      0x0213: PHI (r0v34 float) = (r0v33 float), (r0v72 float) binds: [B:44:0x01b1, B:52:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.acrh
    public final void d(cqf cqfVar, cpx cpxVar, long j, dpf dpfVar) throws java.lang.Throwable {
        defpackage.acsm acsmVar;
        float f;
        boolean z;
        boolean z2;
        int iSave;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        int i2;
        int i3;
        int i4;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float fA;
        float f17;
        float f18;
        float fB;
        float fA2;
        float f19;
        float fMin;
        float fB2;
        float fA3;
        float fS;
        float fS2;
        boolean z3;
        boolean z4;
        aooh.f(cqfVar, "canvas");
        aooh.f(dpfVar, "density");
        float fC = this.g.c();
        if (fC < 0.5f) {
            acsmVar = this.d;
            if (acsmVar == null) {
                return;
            }
            float[] fArr = defpackage.acsp.a;
            float fS3 = aooc.s(((fC + fC) - 0.1f) / 0.79999995f, 0.0f, 1.0f);
            f = 1.0f - ((fS3 * fS3) * (3.0f - (fS3 + fS3)));
        } else {
            acsmVar = this.c;
            if (acsmVar == null) {
                return;
            }
            if (fC >= 1.0f) {
                f = 1.0f;
            } else {
                float[] fArr2 = defpackage.acsp.a;
                float fS4 = aooc.s((((fC + fC) - 1.0f) - 0.1f) / 0.79999995f, 0.0f, 1.0f);
                f = fS4 * fS4 * (3.0f - (fS4 + fS4));
            }
        }
        if (f <= 0.0f) {
            return;
        }
        defpackage.acsr acsrVar = this.k;
        if (!acsrVar.a) {
            return;
        }
        defpackage.acso acsoVar = this.l;
        defpackage.acss acssVar = acsmVar.b;
        float fFloatValue = ((java.lang.Number) acsmVar.d.a()).floatValue();
        float fFloatValue2 = ((java.lang.Number) acsmVar.e.a()).floatValue();
        float fC2 = acsmVar.i ? acsmVar.j : this.h.c();
        cei ceiVar = this.i;
        cei ceiVar2 = this.j;
        int iC = ceiVar.c();
        int iC2 = ceiVar2.c();
        acsoVar.x = false;
        acsoVar.C = false;
        float f20 = 0.5f;
        if (acsrVar.a) {
            z = true;
            if (acsrVar.b <= acsoVar.a && f > 0.0f) {
                acsoVar.E = acsrVar.k;
                acsoVar.F = acsrVar.l;
                acsoVar.G = acsrVar.m;
                acsoVar.H = acsrVar.n;
                acsoVar.I = acsrVar.o;
                float f21 = acsrVar.p;
                acsoVar.J = f21;
                acsoVar.K = 1.0f / f21;
                acsoVar.L = acsrVar.q;
                acsoVar.W = iC >>> 24;
                acsoVar.X = (iC >> 16) & 255;
                acsoVar.Y = (iC >> 8) & 255;
                acsoVar.Z = iC & 255;
                acsoVar.aa = iC2 >>> 24;
                acsoVar.ab = (iC2 >> 16) & 255;
                acsoVar.ac = (iC2 >> 8) & 255;
                acsoVar.ad = iC2 & 255;
                float fS5 = aooc.s(fFloatValue, 0.0f, 1.0f);
                float fS6 = aooc.s(fFloatValue2, 0.0f, 1.0f);
                boolean z5 = acssVar.a;
                acsoVar.M = z5;
                float f22 = 1.0f - fS5;
                float f23 = (acssVar.f * f22) + (acssVar.g * fS5);
                acsoVar.N = f23;
                float f24 = (acssVar.d * f22) + (acssVar.e * fS5);
                acsoVar.O = f24;
                float f25 = acssVar.l;
                float f26 = fS5 * acssVar.m;
                float f27 = acssVar.b;
                float f28 = (f22 * f25) + f26;
                if (z5) {
                    float f29 = (0.68f * fS6) + 0.32f;
                    acsoVar.N = f23 * f29;
                    acsoVar.O = f24 * f29;
                    f27 *= (0.62f * fS6) + 0.38f;
                    f28 *= (0.8f * fS6) + 0.19999999f;
                }
                float fS7 = aooc.s(f27, 0.0f, 1.0f);
                boolean z6 = acsoVar.M;
                acsoVar.Q = z6 ? ((fS6 * 0.5f) + 0.5f) * 0.2f : 0.2f;
                acsoVar.V = z6 ? defpackage.acsp.e : defpackage.acsp.d;
                acsoVar.R = defpackage.acsp.a(0.03f * fC2);
                if (acsoVar.M) {
                    float f30 = acsoVar.H;
                    if (f30 >= acsoVar.G) {
                        float f31 = fS6 * 0.1f;
                        f2 = (f31 + f31) * f30;
                    } else {
                        f2 = 0.0f;
                    }
                } else {
                    f2 = 0.0f;
                }
                acsoVar.S = f2;
                float f32 = acsoVar.H;
                acsoVar.T = java.lang.Math.max((f32 + f32) * f28, acsoVar.J * 1.0E-4f);
                acsoVar.U = acsoVar.Q * 0.1f * acsoVar.J;
                float fA4 = acssVar.c;
                acsoVar.P = 1.0f;
                float f33 = acssVar.h;
                if (f33 != 0.0f) {
                    float f34 = fC2 * f33;
                    float fA5 = defpackage.acsp.a(f34);
                    float fCos = 0.5f - (((float) java.lang.Math.cos((fA5 + fA5) * 3.1415927f)) * 0.5f);
                    boolean z7 = acssVar.j;
                    if (!z7) {
                        fA5 = defpackage.acsp.a((f34 * 1.8f) + ((aooc.s(((((((7.118695f * fA5) - 16.45217f) * fA5) + 11.156845f) * fA5) - 0.82337f) * fA5, 0.0f, 1.0f) - fA5) * 0.8f));
                    }
                    float f35 = acssVar.i;
                    if (f35 != 0.0f) {
                        fA5 = ((-0.5f) + fCos) * f35;
                    }
                    fA4 = 1.0f - defpackage.acsp.a(fA4 + fA5);
                    acsoVar.P = ((1.0f - fCos) * acssVar.k) + fCos;
                    if (z7) {
                        f3 = fCos * fCos;
                    } else {
                        f3 = 1.0f;
                    }
                } else {
                    f3 = 1.0f;
                }
                int i5 = 8;
                if (!acsoVar.M || f28 <= 0.0f) {
                    f4 = fA4;
                    f5 = 0.25f;
                    f6 = 0.3f;
                } else {
                    float f36 = acsoVar.T + acsoVar.U;
                    float f37 = acsoVar.H;
                    float fMin2 = java.lang.Math.min(f36, f37 + f37);
                    float f38 = 2.0f;
                    float f39 = fMin2 + 2.0f;
                    float f40 = acsoVar.G;
                    float f41 = -f40;
                    float f42 = f40 + 2.0f;
                    int i6 = 0;
                    int i7 = 0;
                    f5 = 0.25f;
                    f6 = 0.3f;
                    while (i6 < 25) {
                        float f43 = f42 + f42;
                        float f44 = f41 - 2.0f;
                        float f45 = f38;
                        int i8 = 0;
                        while (i8 < i5) {
                            float f46 = f44 + ((f43 / 24.0f) * i6);
                            float f47 = acsoVar.H - (((f39 + f45) * defpackage.acsp.c[i8]) - 2.0f);
                            acsoVar.i(f46, f47);
                            float f48 = fA4;
                            float fC3 = acsoVar.c(f47, acsoVar.ae);
                            float[] fArr3 = acsoVar.z;
                            int i9 = i7 << 1;
                            fArr3[i9] = acsoVar.E + f46;
                            fArr3[i9 + 1] = acsoVar.F + f47;
                            acsoVar.A[i7] = acsoVar.f((1.0f - (acsoVar.af * 0.3f)) * fC3 * f, aooc.s((fC3 * 0.25f) + acsoVar.ag, 0.0f, 1.0f));
                            i7++;
                            i8++;
                            fA4 = f48;
                            i5 = 8;
                        }
                        i6++;
                        f38 = f45;
                        i5 = 8;
                    }
                    f4 = fA4;
                    acsoVar.C = true;
                }
                float f49 = f * f3;
                if (fS7 <= 1.0E-4f || f49 <= 0.0f) {
                    z = true;
                } else {
                    int i10 = acsrVar.b;
                    float[] fArr4 = acsrVar.c;
                    float[] fArr5 = acsrVar.d;
                    float f50 = fS7 * 0.5f;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        f7 = f20 - f50;
                        if (i11 >= i10) {
                            break;
                        }
                        float f51 = fArr4[i11];
                        float f52 = fArr5[i11];
                        acsoVar.i(f51, f52);
                        float f53 = acsoVar.ag * acsoVar.Q;
                        float[] fArr6 = fArr4;
                        float f54 = f49;
                        float[] fArr7 = fArr5;
                        float fS8 = acsoVar.I * 0.4f * aooc.s(acsoVar.N - f53, 0.0f, 1.0f) * acsoVar.P;
                        acsoVar.e[i11] = fS8;
                        acsoVar.f[i11] = aooc.s(acsoVar.O - f53, 0.0f, 1.0f) * acsoVar.P;
                        acsoVar.g[i11] = acsoVar.ae;
                        acsoVar.h[i11] = acsoVar.ag;
                        float f55 = f20;
                        float fMax = java.lang.Math.max(acsoVar.G - fS8, f55);
                        float fMax2 = java.lang.Math.max(acsoVar.H - fS8, f55);
                        float f56 = acsoVar.S - f52;
                        float fMax3 = java.lang.Math.max(java.lang.Math.min(fMax, fMax2), 1.0E-5f);
                        float f57 = fMax3 + fMax3;
                        float f58 = 1.5707964f * fMax3;
                        float fMax4 = java.lang.Math.max((fMax + fMax) - f57, 1.0E-5f);
                        float f59 = fMax4 + f58;
                        float fMax5 = java.lang.Math.max((fMax2 + fMax2) - f57, 1.0E-5f);
                        float f60 = f59 + fMax5;
                        float f61 = f60 + f58;
                        float f62 = f61 + fMax4;
                        float f63 = f62 + f58;
                        float f64 = f63 + fMax5;
                        float f65 = fMax - fMax3;
                        float f66 = f51 >= 0.0f ? 1.0f : -1.0f;
                        float f67 = f51 - (f66 * f65);
                        float f68 = fMax2 - fMax3;
                        float f69 = f56 >= 0.0f ? 1.0f : -1.0f;
                        float f70 = f67 * f66;
                        float f71 = (f56 - (f69 * f68)) * f69;
                        if (f70 <= 0.0f || f71 <= 0.0f) {
                            if (f70 <= 0.0f && (f71 > 0.0f || java.lang.Math.abs(f56) * fMax >= java.lang.Math.abs(f51) * fMax2)) {
                                fS2 = f56 >= 0.0f ? aooc.s((f51 + fMax) - fMax3, 0.0f, fMax4) : f61 + aooc.s(f65 - f51, 0.0f, fMax4);
                            } else if (f51 >= 0.0f) {
                                fS2 = f59 + aooc.s(f68 - f56, 0.0f, fMax5);
                            } else {
                                fS = f63 + aooc.s((f56 + fMax2) - fMax3, 0.0f, fMax5);
                            }
                            fS = fS2;
                        } else {
                            if (f56 >= 0.0f) {
                                if (f51 >= 0.0f) {
                                    f60 = fMax4;
                                    z3 = true;
                                } else {
                                    f60 = f64;
                                    z3 = false;
                                }
                                z4 = true;
                            } else {
                                if (f51 >= 0.0f) {
                                    z3 = true;
                                } else {
                                    f60 = f62;
                                    z3 = false;
                                }
                                z4 = false;
                            }
                            if (z3 == z4) {
                                f70 = f71;
                                f71 = f70;
                            }
                            float f72 = f71 + f70;
                            float f73 = f72 < 1.0E-5f ? 0.0f : f70 / f72;
                            fS = f60 + ((1.0f - (f73 * (((1.56f - (1.04f * f73)) * f73) + 0.48f))) * f58);
                        }
                        float f74 = f64 + f58;
                        float f75 = (fS - (fMax4 * 0.5f)) + f74;
                        float fA6 = defpackage.acsp.a((1.0f - aooc.s((f75 - (((float) java.lang.Math.floor(f75 / f74)) * f74)) / f74, 0.0f, 1.0f)) - f4);
                        acsoVar.c[i11] = fA6;
                        float fS9 = aooc.s((fA6 - f7) / fS7, 0.0f, 1.0f);
                        boolean z8 = fS9 > 0.0f && fS9 < 1.0f;
                        acsoVar.b[i11] = z8;
                        if (z8) {
                            float fAbs = java.lang.Math.abs(fS9 - 0.5f);
                            float f76 = fAbs + fAbs;
                            float f77 = f76 * f76;
                            acsoVar.d[i11] = 1.0f - (f77 * f77);
                            i12++;
                        } else {
                            acsoVar.d[i11] = 0.0f;
                            i13 = i11;
                        }
                        i11++;
                        fArr4 = fArr6;
                        f49 = f54;
                        fArr5 = fArr7;
                        f20 = 0.5f;
                    }
                    float f78 = f49;
                    if (i12 != 0) {
                        if (i13 >= 0) {
                            if (i10 > 0) {
                                int i14 = 1;
                                int i15 = 0;
                                i = 0;
                                int i16 = 0;
                                i2 = 0;
                                while (true) {
                                    int i17 = (i13 + i14) % i10;
                                    if (acsoVar.b[i17]) {
                                        if (i15 == 0) {
                                            i16 = i17;
                                        }
                                        i15++;
                                        if (i15 > i) {
                                            i = i15;
                                            i2 = i16;
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i14 == i10) {
                                        break;
                                    } else {
                                        i14++;
                                    }
                                }
                            } else {
                                i = 0;
                                i2 = 0;
                            }
                            float f79 = f50 + 0.5f;
                            int i18 = ((i2 + i) - 1) % i10;
                            acsoVar.k(acsrVar, i2, ((i2 - 1) + i10) % i10, f7, f79, 0);
                            int i19 = 1;
                            int i20 = 0;
                            while (true) {
                                i3 = i19 + 1;
                                if (i20 >= i) {
                                    break;
                                }
                                acsoVar.g(acsrVar, (i2 + i20) % i10, i19);
                                i20++;
                                i19 = i3;
                            }
                            acsoVar.k(acsrVar, i18, (i18 + 1) % i10, f7, f79, i19);
                            acsoVar = acsoVar;
                            i4 = i3;
                        } else if (i10 >= 0) {
                            int i21 = 0;
                            int i22 = 0;
                            while (true) {
                                i4 = i22 + 1;
                                acsoVar.g(acsrVar, i21 == i10 ? 0 : i21, i22);
                                if (i21 == i10) {
                                    break;
                                }
                                i21++;
                                i22 = i4;
                            }
                        } else {
                            i4 = 0;
                        }
                        boolean z9 = acsoVar.O <= r17 || acsoVar.P <= 925353388;
                        int i23 = true != z9 ? 10 : 7;
                        int i24 = 0;
                        while (i24 < i4) {
                            float f80 = acsoVar.i[i24];
                            float f81 = acsoVar.j[i24];
                            float f82 = acsoVar.k[i24];
                            float f83 = acsoVar.l[i24];
                            float f84 = acsoVar.m[i24];
                            float f85 = acsoVar.p[i24];
                            float f86 = acsoVar.q[i24];
                            float f87 = acsoVar.n[i24] * f6;
                            acsoVar.i((f82 * f87) + f80, (f87 * f83) + f81);
                            float f88 = acsoVar.ae;
                            float f89 = acsoVar.ag;
                            int i25 = i23;
                            int i26 = i24;
                            float fS10 = acsoVar.I * 0.4f * aooc.s(acsoVar.N - (acsoVar.Q * f89), 0.0f, 1.0f) * acsoVar.P;
                            float f90 = acsoVar.L[(f81 > 0.0f ? 2 : 0) + (f80 > 0.0f ? 1 : 0)];
                            float fMax6 = java.lang.Math.max(acsoVar.G - fS10, 0.5f);
                            float fMax7 = java.lang.Math.max(acsoVar.H - fS10, 0.5f);
                            float fMin3 = java.lang.Math.min(fMax6, fMax7);
                            float fMin4 = java.lang.Math.min(java.lang.Math.max(f90 - fS10, fMin3 * 0.05f), fMin3);
                            float f91 = f81 - acsoVar.S;
                            float fAbs2 = java.lang.Math.abs(f80) - (fMax6 - fMin4);
                            float fAbs3 = java.lang.Math.abs(f91) - (fMax7 - fMin4);
                            float f92 = f91 < 0.0f ? -1.0f : 1.0f;
                            float f93 = f80 < 0.0f ? -1.0f : 1.0f;
                            if (fAbs2 > 0.0f && fAbs3 > 0.0f) {
                                float f94 = -f92;
                                float fSqrt = (float) java.lang.Math.sqrt((fAbs2 * fAbs2) + (fAbs3 * fAbs3));
                                f9 = fSqrt - fMin4;
                                f10 = ((-f93) * fAbs2) / fSqrt;
                                f8 = (f94 * fAbs3) / fSqrt;
                            } else if (fAbs2 > fAbs3) {
                                f9 = fAbs2 - fMin4;
                                f10 = -f93;
                                f8 = 0.0f;
                            } else {
                                f8 = -f92;
                                f9 = fAbs3 - fMin4;
                                f10 = 0.0f;
                            }
                            if (f84 <= 0.0f || fS10 <= 0.5f || f9 <= 0.5f) {
                                f11 = f8;
                                f12 = fS10;
                                f13 = f90;
                                f14 = 1.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                            } else {
                                float fMax8 = java.lang.Math.max(f84, 1.75f / fS10);
                                f11 = f8;
                                float fB3 = f78 * acsoVar.b(1.0f - java.lang.Math.min(f84 * fS10, 1.0f));
                                f16 = f9;
                                if (fMax8 < 1.0f) {
                                    int i27 = 0;
                                    float f95 = 0.0f;
                                    while (i27 < 8) {
                                        float f96 = (f95 + f16) * 0.5f;
                                        int i28 = i27;
                                        float f97 = fS10;
                                        float f98 = f90;
                                        if (acsoVar.d(f80 + (f10 * f96), f81 + (f11 * f96), f9 - f96, fS10, f90) >= fMax8) {
                                            f16 = f96;
                                        } else {
                                            f95 = f96;
                                        }
                                        i27 = i28 + 1;
                                        fS10 = f97;
                                        f90 = f98;
                                    }
                                }
                                f12 = fS10;
                                f13 = f90;
                                f14 = fMax8;
                                f15 = fB3;
                            }
                            if (acsoVar.M) {
                                fA = acsoVar.a(f81, f85, f86);
                            } else {
                                float fS11 = aooc.s((f86 * 0.4f) + 0.5f, 0.0f, 1.0f);
                                fA = fS11 * fS11 * (3.0f - (fS11 + fS11));
                            }
                            float f99 = fA;
                            int i29 = i26 * i25;
                            if (z9) {
                                acsoVar.j(i29, f80 - (f82 * 1.5f), f81 - (f83 * 1.5f), f15, f99);
                                f17 = f81;
                                i29++;
                            } else {
                                float f100 = acsoVar.I * f6 * f5 * acsoVar.o[i26];
                                acsoVar.i(f80 - (f82 * f100), f81 - (f100 * f83));
                                float f101 = acsoVar.ae;
                                float f102 = acsoVar.ag;
                                f17 = f81;
                                float fS12 = aooc.s(acsoVar.O - (acsoVar.Q * f102), 0.0f, 1.0f) * acsoVar.P;
                                float f103 = acsoVar.I;
                                float f104 = 0.15f * f103;
                                float f105 = f103 * f5 * fS12;
                                acsoVar.ah = acsoVar.G + f105;
                                acsoVar.ai = acsoVar.H + f105;
                                acsoVar.aj = f13 * ((fS12 * 0.5f) + 1.0f);
                                float f106 = f104 * fS12;
                                float fMax9 = f106 > 0.0f ? java.lang.Math.max(f84, 1.75f / f106) : 1.0f;
                                if (f106 > 0.0f) {
                                    float f107 = f84 * f106;
                                    f18 = 1.0f;
                                    fB = acsoVar.b(1.0f - java.lang.Math.min(f107, 1.0f)) * f78;
                                } else {
                                    f18 = 1.0f;
                                    fB = 0.0f;
                                }
                                float fMin5 = java.lang.Math.min(fMax9, f18);
                                float f108 = (f105 * 1.5f) + f18;
                                float f109 = fMax9;
                                int i30 = 0;
                                float f110 = 0.0f;
                                while (i30 < 8) {
                                    float f111 = (f110 + f108) * 0.5f;
                                    int i31 = i30;
                                    float f112 = f82;
                                    if (acsoVar.e(f80 - (f82 * f111), f17 - (f83 * f111), f111) >= fMin5) {
                                        f108 = f111;
                                    } else {
                                        f110 = f111;
                                    }
                                    i30 = i31 + 1;
                                    f82 = f112;
                                }
                                float f113 = f82;
                                float fMax10 = java.lang.Math.max(f108, 1.0f);
                                int i32 = 0;
                                while (i32 < 4) {
                                    float f114 = defpackage.acsp.b[i32] * fMax10;
                                    float f115 = f80 - (f113 * f114);
                                    int i33 = i32;
                                    float f116 = f17 - (f83 * f114);
                                    float fE = acsoVar.e(f115, f116, f114);
                                    int i34 = i29 + 1;
                                    float f117 = fMax10;
                                    float fB4 = i33 == 0 ? 0.0f : acsoVar.b(fE / f109) * fB;
                                    if (acsoVar.M) {
                                        fA2 = acsoVar.a(f116, f101, f102);
                                    } else {
                                        float fS13 = aooc.s(fE + (f102 * 0.4f) + 0.5f, 0.0f, 1.0f);
                                        fA2 = (3.0f - (fS13 + fS13)) * fS13 * fS13;
                                    }
                                    acsoVar.j(i29, f115, f116, fB4, fA2);
                                    i32 = i33 + 1;
                                    i29 = i34;
                                    fMax10 = f117;
                                }
                            }
                            int i35 = i29 + 1;
                            acsoVar.j(i29, f80, f17, f15, f99);
                            float[] fArr8 = defpackage.acsp.a;
                            int i36 = 0;
                            while (true) {
                                float f118 = fArr8[i36] * f16;
                                float f119 = f80 + (f10 * f118);
                                float f120 = f17 + (f11 * f118);
                                if (f15 <= 0.0f || i36 >= 4) {
                                    f19 = 1.0f;
                                    fMin = java.lang.Math.min(f14, 1.0f);
                                    fB2 = 0.0f;
                                } else {
                                    fMin = acsoVar.d(f119, f120, f9 - f118, f12, f13);
                                    fB2 = acsoVar.b(fMin / f14) * f15;
                                    f19 = 1.0f;
                                }
                                int i37 = i35 + 1;
                                if (acsoVar.M) {
                                    fA3 = acsoVar.a(f120, f88, f89);
                                } else {
                                    float fS14 = aooc.s(((f89 * 0.4f) - fMin) + 0.5f, 0.0f, f19);
                                    fA3 = (3.0f - (fS14 + fS14)) * fS14 * fS14;
                                }
                                acsoVar.j(i35, f119, f120, fB2, fA3);
                                if (i36 != 4) {
                                    i36++;
                                    i35 = i37;
                                }
                            }
                            i24 = i26 + 1;
                            i23 = i25;
                        }
                        int i38 = i23;
                        acsoVar.y = z9;
                        z = true;
                        acsoVar.v = (i4 * i38) << 1;
                        acsoVar.w = (i4 - 1) * 6 * (i38 - 1);
                        acsoVar.x = i4 >= 2;
                    } else {
                        z = true;
                    }
                }
            }
        } else {
            z = true;
        }
        if (!acsoVar.x && !acsoVar.C) {
            return;
        }
        android.graphics.Canvas canvasA = cpr.a(cqfVar);
        android.graphics.Path path = cpxVar.a;
        aooh.f(canvasA, "canvas");
        boolean z10 = (acsoVar.x && acsoVar.y) ? z : false;
        try {
            if (!acsoVar.C) {
                if (z10) {
                    z2 = z;
                }
                if (acsoVar.x || acsoVar.y) {
                    return;
                }
                acsoVar.h(canvasA);
                return;
            }
            z2 = z10;
            if (acsoVar.C) {
                android.graphics.Canvas.VertexMode vertexMode = android.graphics.Canvas.VertexMode.TRIANGLES;
                float[] fArr9 = acsoVar.z;
                int[] iArr = acsoVar.A;
                short[] sArr = acsoVar.B;
                try {
                    canvasA.drawVertices(vertexMode, 400, fArr9, 0, null, 0, iArr, 0, sArr, 0, sArr.length, acsoVar.D);
                } catch (java.lang.Throwable th) {
                    th = th;
                    canvasA = canvasA;
                    canvasA.restoreToCount(iSave);
                    throw th;
                }
            }
            if (z2) {
                acsoVar.h(canvasA);
            }
            canvasA.restoreToCount(iSave);
            if (acsoVar.x) {
                return;
            } else {
                return;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        iSave = canvasA.save();
        canvasA.clipPath(path);
    }

    public final defpackage.acrw e() {
        return (defpackage.acrw) this.s.a();
    }

    public final void f() {
        aomy aomyVar = this.r;
        if (aomyVar != null) {
            this.r = null;
            aoub aoubVar = this.n;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            this.n = null;
            aoub aoubVar2 = this.q;
            if (aoubVar2 != null) {
                aoubVar2.s((java.util.concurrent.CancellationException) null);
            }
            this.q = null;
            this.c = null;
            this.d = null;
            aomyVar.a();
        }
    }

    public final boolean g() {
        defpackage.acsm acsmVar = this.c;
        if (acsmVar != null && !acsmVar.i) {
            return true;
        }
        defpackage.acsm acsmVar2 = this.d;
        return (acsmVar2 == null || acsmVar2.i || this.g.c() >= 0.5f) ? false : true;
    }
}
