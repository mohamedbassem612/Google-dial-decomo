package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acrz extends defpackage.acrb {
    private float A;
    private final defpackage.acsg B;
    private android.graphics.RenderNode C;
    private android.graphics.Bitmap D;
    private android.graphics.Canvas E;
    private float F;
    private final android.graphics.RectF G;
    private final android.graphics.Paint H;
    private final android.graphics.PathMeasure I;
    private final android.graphics.PathMeasure J;
    private final defpackage.acrj K;
    private final defpackage.acrj L;
    private final float[] M;
    private final float[] N;
    private final android.graphics.Path O;
    private final android.graphics.Path P;
    private final android.graphics.Path Q;
    private final android.graphics.Matrix R;
    private final android.graphics.Path S;
    private final android.graphics.RectF T;
    private final android.graphics.Paint U;
    private float V;
    private float W;
    private float X;
    private float Y;
    private float Z;
    private float aa;
    private defpackage.acrw ab;
    private aoss ac;
    private final cpv ad;
    private final cpv ae;
    public final aii c;
    public final aii d;
    public final aii e;
    public final aii f;
    public final aii g;
    public aii h;
    public aii i;
    public aii j;
    public aii k;
    public final defpackage.acsh l;
    public final defpackage.acsh m;
    public float n;
    public aoub o;
    public aoub p;
    public aoub q;
    public aoub r;
    public aoub s;
    public aoub t;
    public boolean u;
    private final ccp v;
    private defpackage.acrt w;
    private float x;
    private float y;
    private float z;

    public acrz(aoss aossVar) {
        super(aossVar);
        this.c = aij.a(0.0f);
        this.d = aij.a(1.0f);
        this.e = aij.a(0.0f);
        this.f = aij.a(0.0f);
        this.g = aij.a(0.0f);
        defpackage.acrt acrtVar = defpackage.acrt.a;
        this.v = new androidx.compose.runtime.ParcelableSnapshotMutableState(acrtVar, cdu.c);
        this.w = acrtVar;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = -1.0f;
        this.A = 1.0f;
        this.l = new defpackage.acsh();
        this.m = new defpackage.acsh();
        this.B = new defpackage.acsg();
        this.F = 1.0f;
        this.G = new android.graphics.RectF();
        android.graphics.Paint paintN = cdh.n(new cpv());
        paintN.setFilterBitmap(true);
        paintN.setDither(true);
        this.H = paintN;
        this.I = new android.graphics.PathMeasure();
        this.J = new android.graphics.PathMeasure();
        this.K = new defpackage.acrj();
        this.L = new defpackage.acrj();
        this.M = new float[2];
        this.N = new float[2];
        this.O = new android.graphics.Path();
        this.P = new android.graphics.Path();
        this.Q = new android.graphics.Path();
        this.R = new android.graphics.Matrix();
        this.S = new android.graphics.Path();
        this.T = new android.graphics.RectF();
        android.graphics.Paint paintN2 = cdh.n(new cpv());
        paintN2.setAntiAlias(true);
        paintN2.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        this.U = paintN2;
        cpv cpvVar = new cpv();
        cpvVar.r(1);
        this.ad = cpvVar;
        cpv cpvVar2 = new cpv();
        cpvVar2.r(1);
        this.ae = cpvVar2;
        this.V = 1.0f;
    }

    private final defpackage.acrt f() {
        return (defpackage.acrt) this.v.a();
    }

    private final aoss g(int i) {
        java.lang.Object objAe;
        if (i < 120) {
            defpackage.acrw acrwVar = this.ab;
            if (acrwVar == null) {
                aolr aolrVar = this.a.a;
                cch cchVar = cci.a;
                cci cciVar = aolrVar.get(cchVar);
                if (cciVar == null) {
                    try {
                        aoir aoirVar = det.a;
                        objAe = (cci) dez.c().get(cchVar);
                    } catch (java.lang.Throwable th) {
                        objAe = aooc.ae(th);
                    }
                    if (true == (objAe instanceof aoiv)) {
                        objAe = null;
                    }
                    cciVar = (cci) objAe;
                }
                defpackage.acrw acrwVar2 = new defpackage.acrw(cciVar, i);
                this.ab = acrwVar2;
                this.ac = aosv.p(this.a, acrwVar2);
                acrwVar = acrwVar2;
            }
            acrwVar.b(i);
            aoss aossVar = this.ac;
            if (aossVar != null) {
                return aossVar;
            }
        }
        return this.a;
    }

    private final void h(android.graphics.PathMeasure pathMeasure, android.graphics.Path path, float f, float f2, float f3, defpackage.acrj acrjVar) {
        path.rewind();
        float fR = 0.0f;
        if (f <= 0.0f) {
            pathMeasure.getSegment(0.0f, pathMeasure.getLength(), path, true);
            path.close();
            return;
        }
        float length = pathMeasure.getLength();
        float fS = aooc.s(f3, 1.0f, aooc.q(length / 17.0f, 1.0f));
        if (java.lang.Math.abs(acrjVar.a - length) > 1.0f || java.lang.Math.abs(acrjVar.b - fS) > 1.0f) {
            acrjVar.a = length;
            acrjVar.b = fS;
            int iCeil = (((int) java.lang.Math.ceil(length / fS)) + 2) * 7;
            if (acrjVar.c.length < iCeil) {
                acrjVar.c = new float[iCeil];
            }
            float[] fArr = this.N;
            float[] fArr2 = this.M;
            float[] fArr3 = acrjVar.c;
            pathMeasure.getPosTan(0.0f, fArr2, fArr);
            fArr3[0] = fArr2[0];
            fArr3[1] = fArr2[1];
            fArr3[2] = fArr[0];
            fArr3[3] = fArr[1];
            fArr3[4] = 0.0f;
            fArr3[5] = 0.0f;
            fArr3[6] = 0.0f;
            int i = 7;
            while (fR < length) {
                fR = aooc.r(fR + fS, length);
                pathMeasure.getPosTan(fR, fArr2, fArr);
                fArr3[i] = fArr2[0];
                fArr3[i + 1] = fArr2[1];
                fArr3[i + 2] = fArr[0];
                fArr3[i + 3] = fArr[1];
                fArr3[i + 4] = 0.02f * fR;
                int i2 = i + 6;
                fArr3[i + 5] = 0.05f * fR;
                i += 7;
                fArr3[i2] = 0.13f * fR;
            }
            acrjVar.d = i / 7;
        }
        float[] fArr4 = acrjVar.c;
        path.moveTo(fArr4[0], fArr4[1]);
        float f4 = f2 + f2;
        float f5 = 3.0f * f2;
        int i3 = acrjVar.d;
        for (int i4 = 1; i4 < i3; i4++) {
            int i5 = i4 * 7;
            float f6 = fArr4[i5];
            float f7 = fArr4[i5 + 1];
            float f8 = fArr4[i5 + 2];
            float f9 = fArr4[i5 + 3];
            float fSin = (((float) java.lang.Math.sin(fArr4[i5 + 4] + f2)) + (((float) java.lang.Math.sin(fArr4[i5 + 5] - f4)) * 0.5f) + (((float) java.lang.Math.sin(fArr4[i5 + 6] + f5)) * 0.25f)) * f;
            path.lineTo(f6 + ((-f9) * fSin), f7 + (f8 * fSin));
        }
        path.close();
    }

    private final void i(defpackage.acsa acsaVar, defpackage.acsa acsaVar2, boolean z) {
        boolean z2 = acsaVar2 != null && acsaVar2.F < 120;
        int i = acsaVar.F;
        boolean z3 = (aooh.n(acsaVar2 != null ? acsaVar2.v : null, acsaVar.v) && aooh.n(acsaVar2.z, acsaVar.z) && aooh.n(acsaVar2.A, acsaVar.A) && aooh.n(acsaVar2.B, acsaVar.B) && z2 == (i > 0 && i < 120)) ? false : true;
        if (!this.u || acsaVar.j != defpackage.acrt.b) {
            aoub aoubVar = this.t;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            if (this.h == null || acsaVar.j == defpackage.acrt.b) {
                return;
            }
            aoub aoubVar2 = this.q;
            if (aoubVar2 == null || !aoubVar2.t() || z) {
                aoub aoubVar3 = this.q;
                if (aoubVar3 != null) {
                    aoubVar3.s((java.util.concurrent.CancellationException) null);
                }
                this.q = aoov.an(this.a, (aolr) null, 0, new defpackage.acju(this, acsaVar, (aoln) null, 16, (float[]) null), 3);
                return;
            }
            return;
        }
        if (acsaVar.E) {
            aoub aoubVar4 = this.q;
            if (aoubVar4 != null) {
                aoubVar4.s((java.util.concurrent.CancellationException) null);
            }
            aoub aoubVar5 = this.t;
            if (aoubVar5 != null) {
                aoubVar5.s((java.util.concurrent.CancellationException) null);
                return;
            }
            return;
        }
        aoub aoubVar6 = this.t;
        if (aoubVar6 == null || !aoubVar6.t() || z || z3) {
            aoss aossVarG = g(i);
            aoub aoubVar7 = this.q;
            if (aoubVar7 != null) {
                aoubVar7.s((java.util.concurrent.CancellationException) null);
            }
            aoub aoubVar8 = this.t;
            if (aoubVar8 != null) {
                aoubVar8.s((java.util.concurrent.CancellationException) null);
            }
            this.t = aoov.an(aossVarG, (aolr) null, 0, new defpackage.yrw(z, this, acsaVar, (aoln) null, 2), 3);
        }
    }

    private static final float j(defpackage.acrt acrtVar) {
        int iOrdinal = acrtVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? 1.0f : 0.8f;
        }
        return 0.5f;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146  */
    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:25:0x0036  */
    /* JADX WARN: Code duplicated, block: B:26:0x0038  */
    /* JADX WARN: Code duplicated, block: B:29:0x0041  */
    /* JADX WARN: Code duplicated, block: B:35:0x004f  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x0116  */
    /* JADX WARN: Code duplicated, block: B:87:0x0119  */
    @Override // defpackage.acrh
    public final /* bridge */ /* synthetic */ void a(defpackage.acrc acrcVar) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        aoss aossVarG;
        aiq aiqVar;
        boolean z4;
        aoub aoubVar;
        aoub aoubVar2;
        aiq aiqVar2;
        aoub aoubVar3;
        aoub aoubVar4;
        defpackage.acrz acrzVar;
        boolean z5;
        aoub aoubVar5;
        defpackage.acrt acrtVar;
        defpackage.acsa acsaVar;
        boolean z6;
        aiq aiqVar3;
        aoub aoubVar6;
        aoub aoubVar7;
        aii aiiVar;
        float fFloatValue;
        aii aiiVar2;
        float fFloatValue2;
        defpackage.acsa acsaVar2 = (defpackage.acsa) acrcVar;
        aooh.f(acsaVar2, "effect");
        defpackage.acsa acsaVar3 = (defpackage.acsa) this.b;
        defpackage.acrt acrtVar2 = acsaVar3 != null ? acsaVar3.j : null;
        boolean z7 = true;
        boolean z8 = (acrtVar2 == null || acrtVar2 == acsaVar2.j) ? false : true;
        if (acsaVar3 != null) {
            if (acsaVar3.F < 120) {
                z = true;
            }
            i = acsaVar2.F;
            if (i > 0 || i >= 120) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z != z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            aossVarG = g(i);
            this.b = acsaVar2;
            if (z8) {
                if (this.u && acrtVar2 == defpackage.acrt.b) {
                    defpackage.acsg acsgVar = this.B;
                    aiiVar = this.i;
                    if (aiiVar != null) {
                        fFloatValue = ((java.lang.Number) aiiVar.d()).floatValue();
                    } else {
                        fFloatValue = -0.2f;
                    }
                    aiiVar2 = this.j;
                    if (aiiVar2 != null) {
                        fFloatValue2 = ((java.lang.Number) aiiVar2.d()).floatValue();
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    aii aiiVar3 = this.k;
                    float fFloatValue3 = aiiVar3 != null ? ((java.lang.Number) aiiVar3.d()).floatValue() : 0.0f;
                    acsgVar.f = fFloatValue;
                    acsgVar.g = fFloatValue2;
                    acsgVar.h = fFloatValue3;
                }
                this.w = acrtVar2;
            }
            if (acsaVar3 != null) {
                aiqVar = acsaVar3.x;
            } else {
                aiqVar = null;
            }
            boolean zN = aooh.n(aiqVar, acsaVar2.x);
            z4 = acsaVar2.E;
            aoubVar = this.r;
            if (z4) {
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
            } else if (aoubVar != null || !aoubVar.t() || !zN || z3) {
                aoubVar2 = this.r;
                if (aoubVar2 != null) {
                    aoubVar2.s((java.util.concurrent.CancellationException) null);
                }
                this.r = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acju(this, acsaVar2, (aoln) null, 10), 3);
            }
            if (acsaVar3 != null) {
                aiqVar2 = acsaVar3.w;
            } else {
                aiqVar2 = null;
            }
            boolean zN2 = aooh.n(aiqVar2, acsaVar2.w);
            aoubVar3 = this.s;
            if (z4) {
                if (aoubVar3 != null) {
                    aoubVar3.s((java.util.concurrent.CancellationException) null);
                }
                acrzVar = this;
                z5 = true;
            } else {
                if (aoubVar3 == null && aoubVar3.t() && zN2 && !z3) {
                    acrzVar = this;
                } else {
                    aoubVar4 = this.s;
                    if (aoubVar4 != null) {
                        aoubVar4.s((java.util.concurrent.CancellationException) null);
                    }
                    acrzVar = this;
                    acrzVar.s = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar2, (aoln) null, 11, (byte[]) null), 3);
                }
                z5 = false;
            }
            aoubVar5 = acrzVar.o;
            if (aoubVar5 != null) {
                aoubVar5.s((java.util.concurrent.CancellationException) null);
            }
            acrtVar = acrtVar2;
            acsaVar = acsaVar3;
            z6 = z8;
            acrzVar.o = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acry(acrzVar, acsaVar2, acsaVar, z6, acrtVar, null), 3);
            acrzVar.i(acsaVar2, acsaVar, z6);
            if (acsaVar != null) {
                aiqVar3 = acsaVar.v;
            } else {
                aiqVar3 = null;
            }
            if (aooh.n(aiqVar3, acsaVar2.v) && aooh.n(acsaVar.y, acsaVar2.y)) {
                z7 = false;
            }
            aoubVar6 = acrzVar.p;
            if (aoubVar6 != null || !aoubVar6.t() || z6 || z7 || z3) {
                aoubVar7 = acrzVar.p;
                if (aoubVar7 != null) {
                    aoubVar7.s((java.util.concurrent.CancellationException) null);
                }
                if (z5) {
                    acrzVar.p = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acbt(acrzVar, (aoln) null, 14), 3);
                } else {
                    defpackage.acrz acrzVar2 = acrzVar;
                    acrzVar2.p = aoov.an(aossVarG, (aolr) null, 0, new bus(z6, acrtVar, acrzVar2, acsaVar2, (aoln) null, 5), 3);
                }
            }
            return;
        }
        acsaVar3 = null;
        z = false;
        i = acsaVar2.F;
        if (i > 0) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        aossVarG = g(i);
        this.b = acsaVar2;
        if (z8) {
            if (this.u) {
                defpackage.acsg acsgVar2 = this.B;
                aiiVar = this.i;
                if (aiiVar != null) {
                    fFloatValue = ((java.lang.Number) aiiVar.d()).floatValue();
                } else {
                    fFloatValue = -0.2f;
                }
                aiiVar2 = this.j;
                if (aiiVar2 != null) {
                    fFloatValue2 = ((java.lang.Number) aiiVar2.d()).floatValue();
                } else {
                    fFloatValue2 = 0.0f;
                }
                aii aiiVar4 = this.k;
                if (aiiVar4 != null) {
                }
                acsgVar2.f = fFloatValue;
                acsgVar2.g = fFloatValue2;
                acsgVar2.h = fFloatValue3;
            }
            this.w = acrtVar2;
        }
        if (acsaVar3 != null) {
            aiqVar = acsaVar3.x;
        } else {
            aiqVar = null;
        }
        boolean zN3 = aooh.n(aiqVar, acsaVar2.x);
        z4 = acsaVar2.E;
        aoubVar = this.r;
        if (z4) {
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
        } else if (aoubVar != null) {
            aoubVar2 = this.r;
            if (aoubVar2 != null) {
                aoubVar2.s((java.util.concurrent.CancellationException) null);
            }
            this.r = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acju(this, acsaVar2, (aoln) null, 10), 3);
        } else {
            aoubVar2 = this.r;
            if (aoubVar2 != null) {
                aoubVar2.s((java.util.concurrent.CancellationException) null);
            }
            this.r = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acju(this, acsaVar2, (aoln) null, 10), 3);
        }
        if (acsaVar3 != null) {
            aiqVar2 = acsaVar3.w;
        } else {
            aiqVar2 = null;
        }
        boolean zN4 = aooh.n(aiqVar2, acsaVar2.w);
        aoubVar3 = this.s;
        if (z4) {
            if (aoubVar3 != null) {
                aoubVar3.s((java.util.concurrent.CancellationException) null);
            }
            acrzVar = this;
            z5 = true;
        } else {
            if (aoubVar3 == null) {
                aoubVar4 = this.s;
                if (aoubVar4 != null) {
                    aoubVar4.s((java.util.concurrent.CancellationException) null);
                }
                acrzVar = this;
                acrzVar.s = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar2, (aoln) null, 11, (byte[]) null), 3);
            } else {
                aoubVar4 = this.s;
                if (aoubVar4 != null) {
                    aoubVar4.s((java.util.concurrent.CancellationException) null);
                }
                acrzVar = this;
                acrzVar.s = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar2, (aoln) null, 11, (byte[]) null), 3);
            }
            z5 = false;
        }
        aoubVar5 = acrzVar.o;
        if (aoubVar5 != null) {
            aoubVar5.s((java.util.concurrent.CancellationException) null);
        }
        acrtVar = acrtVar2;
        acsaVar = acsaVar3;
        z6 = z8;
        acrzVar.o = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acry(acrzVar, acsaVar2, acsaVar, z6, acrtVar, null), 3);
        acrzVar.i(acsaVar2, acsaVar, z6);
        if (acsaVar != null) {
            aiqVar3 = acsaVar.v;
        } else {
            aiqVar3 = null;
        }
        if (aooh.n(aiqVar3, acsaVar2.v)) {
            z7 = false;
        }
        aoubVar6 = acrzVar.p;
        if (aoubVar6 != null) {
        }
        aoubVar7 = acrzVar.p;
        if (aoubVar7 != null) {
            aoubVar7.s((java.util.concurrent.CancellationException) null);
        }
        if (z5) {
            acrzVar.p = aoov.an(aossVarG, (aolr) null, 0, new defpackage.acbt(acrzVar, (aoln) null, 14), 3);
        } else {
            defpackage.acrz acrzVar3 = acrzVar;
            acrzVar3.p = aoov.an(aossVarG, (aolr) null, 0, new bus(z6, acrtVar, acrzVar3, acsaVar2, (aoln) null, 5), 3);
        }
    }

    @Override // defpackage.acrh
    public final void b(aomy aomyVar) {
        defpackage.acsa acsaVar = (defpackage.acsa) this.b;
        aoov.an(acsaVar != null ? g(acsaVar.F) : this.a, (aolr) null, 0, new defpackage.xhb(acsaVar, this, aomyVar, (aoln) null, 16), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.graphics.MaskFilter] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [android.graphics.MaskFilter] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.graphics.Paint] */
    @Override // defpackage.acrh
    public final void c(cpx cpxVar, long j, dpf dpfVar) {
        android.graphics.CornerPathEffect cornerPathEffect;
        int i;
        android.graphics.Bitmap bitmap;
        android.graphics.CornerPathEffect cornerPathEffect2;
        ?? blurMaskFilter;
        aooh.f(dpfVar, "density");
        defpackage.acsa acsaVar = (defpackage.acsa) this.b;
        if (acsaVar != null) {
            int i2 = (int) (j >> 32);
            int iT = aooc.t(aopc.i(java.lang.Float.intBitsToFloat(i2)), 1);
            int i3 = (int) (j & 4294967295L);
            int iT2 = aooc.t(aopc.i(java.lang.Float.intBitsToFloat(i3)), 1);
            float fA = cpp.a(j);
            float f = acsaVar.D;
            ?? r10 = ((fA > f ? 1 : (fA == f ? 0 : -1)) ^ (-1)) >>> 31;
            boolean z = this.u;
            this.u = r10;
            if (r10 != z) {
                i(acsaVar, null, false);
            }
            this.V = (!this.u || f <= 0.0f) ? 1.0f : (fA / f) * 1.1f;
            this.W = ((float) java.lang.Math.hypot(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3))) * 1.5f;
            this.X = java.lang.Float.intBitsToFloat(i2) / 2.0f;
            this.Y = java.lang.Float.intBitsToFloat(i3) / 2.0f;
            float fDl = dpfVar.dl(16.0f) * 1.4f;
            this.Z = fDl;
            float f2 = iT;
            float f3 = iT2;
            android.graphics.Matrix matrix = this.R;
            float f4 = fDl + fDl;
            matrix.setScale((f4 + f2) / f2, (f3 + f4) / f3, this.X, this.Y);
            android.graphics.PathMeasure pathMeasure = this.I;
            android.graphics.Path path = cpxVar.a;
            pathMeasure.setPath(path, true);
            android.graphics.Path path2 = this.Q;
            path2.rewind();
            path.transform(matrix, path2);
            this.J.setPath(path2, true);
            float fDl2 = dpfVar.dl(100.0f);
            float f5 = fDl2 > 0.0f ? fA / fDl2 : 1.0f;
            this.A = f5;
            float fQ = aooc.q(((java.lang.Number) acsaVar.d.a()).floatValue(), 0.0f);
            this.x = fQ;
            float f6 = 45.0f * f5 * fQ;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                float f7 = 1.0f / acsaVar.C;
                android.graphics.RenderNode renderNode = this.C;
                if (renderNode == null) {
                    renderNode = new android.graphics.RenderNode("EnergyNode");
                    i = 0;
                    da$.ExternalSyntheticApiModelOutline0.m(renderNode, false);
                    this.C = renderNode;
                } else {
                    i = 0;
                }
                if (renderNode != null) {
                    da$.ExternalSyntheticApiModelOutline0.m(renderNode, i, i, (int) (f2 * f7), (int) (f3 * f7));
                }
                float f8 = f7 * f6;
                android.graphics.RenderNode renderNode2 = this.C;
                if (f8 > 0.0f) {
                    if (renderNode2 != null) {
                        renderNode2.setRenderEffect(android.graphics.RenderEffect.createBlurEffect(f8, f8, android.graphics.Shader.TileMode.CLAMP));
                    }
                    cornerPathEffect = null;
                } else {
                    cornerPathEffect = null;
                    if (renderNode2 != null) {
                        renderNode2.setRenderEffect(null);
                    }
                }
            } else {
                cornerPathEffect = null;
                i = 0;
                this.F = 1.0f / acsaVar.C;
                float fCeil = (float) java.lang.Math.ceil(this.Z + f6 + 40.0f);
                this.aa = fCeil;
                float f9 = this.F;
                int iT3 = aooc.t((int) (fCeil * f9), 1);
                android.graphics.Bitmap bitmap2 = this.D;
                int i4 = iT3 << 1;
                int i5 = ((int) (f2 * f9)) + i4;
                int i6 = ((int) (f9 * f3)) + i4;
                if (bitmap2 == null || bitmap2.getWidth() != i5 || (bitmap = this.D) == null || bitmap.getHeight() != i6) {
                    android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i5, i6, android.graphics.Bitmap.Config.ARGB_8888);
                    aooh.e(bitmapCreateBitmap, "createBitmap(...)");
                    this.E = new android.graphics.Canvas(bitmapCreateBitmap);
                    this.D = bitmapCreateBitmap;
                }
                android.graphics.RectF rectF = this.G;
                float f10 = this.aa;
                float f11 = -f10;
                rectF.set(f11, f11, f2 + f10, f3 + f10);
            }
            if (((android.os.Build.VERSION.SDK_INT >= 31 || f6 <= 0.0f) ? i : 1) != 0) {
                cornerPathEffect2 = cornerPathEffect;
                blurMaskFilter = new android.graphics.BlurMaskFilter(f6, android.graphics.BlurMaskFilter.Blur.NORMAL);
            } else {
                cornerPathEffect2 = new android.graphics.CornerPathEffect(fA * 0.15f);
                blurMaskFilter = cornerPathEffect;
            }
            cpv cpvVar = this.ad;
            cdh.n(cpvVar).setPathEffect(cornerPathEffect2);
            cdh.n(cpvVar).setMaskFilter(blurMaskFilter);
            cpv cpvVar2 = this.ae;
            cdh.n(cpvVar2).setPathEffect(cornerPathEffect2);
            cdh.n(cpvVar2).setMaskFilter(blurMaskFilter);
            float fQ2 = aooc.q(((java.lang.Number) acsaVar.e.a()).floatValue(), 0.0f);
            this.y = fQ2;
            this.U.setMaskFilter(fQ2 > 0.0f ? new android.graphics.BlurMaskFilter(f5 * 100.0f * fQ2, android.graphics.BlurMaskFilter.Blur.NORMAL) : cornerPathEffect);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x039c  */
    /* JADX WARN: Code duplicated, block: B:103:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:106:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:109:0x0405  */
    /* JADX WARN: Code duplicated, block: B:110:0x0433  */
    /* JADX WARN: Code duplicated, block: B:113:0x044a  */
    /* JADX WARN: Code duplicated, block: B:114:0x044f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0460  */
    /* JADX WARN: Code duplicated, block: B:120:0x046c  */
    /* JADX WARN: Code duplicated, block: B:125:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:128:0x0507  */
    /* JADX WARN: Code duplicated, block: B:129:0x050d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0519  */
    /* JADX WARN: Code duplicated, block: B:134:0x0523  */
    /* JADX WARN: Code duplicated, block: B:136:0x052b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0567 A[Catch: all -> 0x05df, TRY_LEAVE, TryCatch #8 {all -> 0x05df, blocks: (B:137:0x0538, B:139:0x054d, B:141:0x0562, B:143:0x0567, B:145:0x0575, B:147:0x057a, B:148:0x057d, B:166:0x05d6, B:167:0x05d9, B:169:0x05db, B:170:0x05de, B:140:0x0557, B:144:0x056e, B:138:0x0544), top: B:218:0x0538, inners: #2, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0590  */
    /* JADX WARN: Code duplicated, block: B:155:0x0593  */
    /* JADX WARN: Code duplicated, block: B:160:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:174:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:176:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:183:0x062d A[Catch: all -> 0x0652, TRY_LEAVE, TryCatch #1 {all -> 0x0652, blocks: (B:177:0x05f4, B:179:0x0613, B:181:0x0628, B:183:0x062d, B:185:0x063b, B:187:0x0640, B:188:0x0643, B:191:0x0649, B:192:0x064c, B:194:0x064e, B:195:0x0651, B:180:0x061d, B:178:0x0608, B:184:0x0634), top: B:205:0x05f4, inners: #3, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x065b  */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x023f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0252  */
    /* JADX WARN: Code duplicated, block: B:72:0x025f  */
    /* JADX WARN: Code duplicated, block: B:74:0x026a  */
    /* JADX WARN: Code duplicated, block: B:76:0x026f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0276  */
    /* JADX WARN: Code duplicated, block: B:79:0x027b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0280  */
    /* JADX WARN: Code duplicated, block: B:82:0x0288  */
    /* JADX WARN: Code duplicated, block: B:86:0x029d  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0313  */
    /* JADX WARN: Code duplicated, block: B:94:0x0316  */
    /* JADX WARN: Code duplicated, block: B:97:0x0390  */
    /* JADX WARN: Code duplicated, block: B:98:0x0393  */
    @Override // defpackage.acrh
    public final void d(cqf cqfVar, cpx cpxVar, long j, dpf dpfVar) {
        float f;
        cpv cpvVar;
        cpv cpvVar2;
        defpackage.acsa acsaVar;
        float f2;
        float f3;
        android.graphics.Path path;
        boolean z;
        float f4;
        float f5;
        float fSin;
        aonj aonjVar;
        float fFloatValue;
        float f6;
        float f7;
        float f8;
        boolean z2;
        float fR;
        float f9;
        float f10;
        android.graphics.Canvas canvas;
        android.graphics.Bitmap bitmap;
        int iSave;
        int iSave2;
        int iSave3;
        int iSave4;
        float f11;
        android.graphics.RenderNode renderNode;
        android.graphics.RecordingCanvas recordingCanvasM;
        int iSave5;
        int iSave6;
        float f12;
        int iSave7;
        boolean z3;
        android.graphics.Canvas canvasA;
        int iSave8;
        int iSave9;
        float f13;
        float fSin2;
        float f14;
        android.graphics.Path path2;
        android.graphics.RectF rectF;
        float fQ;
        aii aiiVar;
        float fFloatValue2;
        float fQ2;
        float fQ3;
        android.graphics.BlurMaskFilter blurMaskFilter;
        float f15;
        android.graphics.BlurMaskFilter blurMaskFilter2;
        float f16;
        android.graphics.RenderNode renderNode2;
        android.graphics.RenderEffect renderEffectCreateBlurEffect;
        aooh.f(cqfVar, "canvas");
        aooh.f(dpfVar, "density");
        defpackage.acsa acsaVar2 = (defpackage.acsa) this.b;
        if (acsaVar2 != null) {
            float f17 = this.z;
            float f18 = acsaVar2.C;
            if (f18 != f17) {
                this.z = f18;
                c(cpxVar, j, dpfVar);
            }
            aii aiiVar2 = this.d;
            float fFloatValue3 = ((java.lang.Number) aiiVar2.d()).floatValue();
            float f19 = (this.u && f() == defpackage.acrt.b) ? 1.0f : 0.0f;
            defpackage.acsh acshVar = this.m;
            defpackage.acsh acshVar2 = this.l;
            float f20 = this.n;
            if (fFloatValue3 == 1.0f) {
                acshVar.a(acsaVar2, f19);
                acshVar.b = f20;
            } else {
                float f21 = 1.0f - fFloatValue3;
                acshVar.a = (acshVar2.a * f21) + (acsaVar2.f * fFloatValue3);
                acshVar.b = (acshVar2.b * f21) + (f20 * fFloatValue3);
                acshVar.c = (acshVar2.c * f21) + (acsaVar2.h * fFloatValue3);
                acshVar.d = (acshVar2.d * f21) + (acsaVar2.i * fFloatValue3);
                acshVar.e = (acshVar2.e * f21) + (f19 * fFloatValue3);
                acshVar.f = (acshVar2.f * f21) + (acsaVar2.m * fFloatValue3);
                acshVar.g = (acshVar2.g * f21) + (acsaVar2.n * fFloatValue3);
                acshVar.h = (acshVar2.h * f21) + (acsaVar2.o * fFloatValue3);
                acshVar.i = (acshVar2.i * f21) + (acsaVar2.p * fFloatValue3);
                acshVar.j = (acshVar2.j * f21) + (acsaVar2.k * fFloatValue3);
                acshVar.k = (acshVar2.k * f21) + (acsaVar2.l * fFloatValue3);
                acshVar.l = (acshVar2.l * f21) + (acsaVar2.q * fFloatValue3);
                acshVar.m = (acshVar2.m * f21) + (acsaVar2.r * fFloatValue3);
                acshVar.n = (acshVar2.n * f21) + (((java.lang.Number) acsaVar2.d.a()).floatValue() * fFloatValue3);
                acshVar.o = (f21 * acshVar2.o) + (((java.lang.Number) acsaVar2.e.a()).floatValue() * fFloatValue3);
                long j2 = ((cqg) acshVar2.p.a).a;
                aoiu aoiuVar = acsaVar2.a;
                acshVar.p = new aoiu(new cqg(cfd.Q(j2, ((cqg) aoiuVar.a).a, fFloatValue3)), new cqg(cfd.Q(((cqg) acshVar2.p.b).a, ((cqg) aoiuVar.b).a, fFloatValue3)));
            }
            float fFloatValue4 = ((java.lang.Number) this.e.d()).floatValue();
            defpackage.acsg acsgVar = this.B;
            if (this.u) {
                defpackage.acrt acrtVarF = f();
                defpackage.acrt acrtVar = defpackage.acrt.b;
                boolean z4 = acrtVarF == acrtVar;
                boolean z5 = this.w == acrtVar;
                boolean z6 = !z5 && z4;
                boolean z7 = z5 && !z4;
                aii aiiVar3 = this.i;
                float fFloatValue5 = aiiVar3 != null ? ((java.lang.Number) aiiVar3.d()).floatValue() : -0.2f;
                aii aiiVar4 = this.j;
                float fFloatValue6 = aiiVar4 != null ? ((java.lang.Number) aiiVar4.d()).floatValue() : 0.0f;
                boolean z8 = z4;
                aii aiiVar5 = this.k;
                float fFloatValue7 = aiiVar5 != null ? ((java.lang.Number) aiiVar5.d()).floatValue() : 0.0f;
                boolean z9 = z7;
                float fJ = j(f());
                if (fFloatValue3 == 1.0f) {
                    acsgVar.e = fJ;
                    if (z8) {
                        acsgVar.a = fFloatValue5;
                        acsgVar.b = fFloatValue6;
                        acsgVar.c = fFloatValue7;
                        acsgVar.d = 1.0f;
                    } else {
                        acsgVar.a = fFloatValue4;
                        acsgVar.b = 1.0f;
                        acsgVar.c = 0.0f;
                        acsgVar.d = 0.0f;
                    }
                } else {
                    float f22 = 1.0f - fFloatValue3;
                    boolean z10 = z6;
                    acsgVar.e = (j(this.w) * f22) + (fJ * fFloatValue3);
                    if (z10) {
                        acsgVar.a = (fFloatValue4 * f22) + (fFloatValue5 * fFloatValue3);
                        acsgVar.b = (fFloatValue6 * fFloatValue3) + f22;
                        acsgVar.c = (f22 * 0.0f) + (fFloatValue7 * fFloatValue3);
                    } else if (z9) {
                        float f23 = fFloatValue3 * 0.0f;
                        acsgVar.a = (acsgVar.f * f22) + f23 + fFloatValue4;
                        acsgVar.b = (acsgVar.g * f22) + fFloatValue3;
                        acsgVar.c = (acsgVar.h * f22) + f23;
                        acsgVar.d = f22;
                    } else if (z8) {
                        acsgVar.a = fFloatValue5;
                        acsgVar.b = fFloatValue6;
                        acsgVar.c = fFloatValue7;
                        fFloatValue3 = 1.0f;
                    } else {
                        acsgVar.a = fFloatValue4;
                        acsgVar.b = 1.0f;
                        f = 0.0f;
                    }
                    acsgVar.d = fFloatValue3;
                }
                cpvVar = this.ad;
                cpvVar.j(((cqg) acshVar.p.a).a);
                cpvVar2 = this.ae;
                cpvVar2.j(((cqg) acshVar.p.b).a);
                acsaVar = (defpackage.acsa) this.b;
                if (acsaVar != null) {
                    fQ2 = aooc.q(acshVar.n, 0.0f);
                    fQ3 = aooc.q(acshVar.o, 0.0f);
                    if (fQ2 != this.x) {
                        this.x = fQ2;
                        f15 = this.A * 45.0f * fQ2;
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            f16 = f15 * (1.0f / acsaVar.C);
                            renderNode2 = this.C;
                            if (renderNode2 != null) {
                                if (f16 > 0.0f) {
                                    renderEffectCreateBlurEffect = android.graphics.RenderEffect.createBlurEffect(f16, f16, android.graphics.Shader.TileMode.CLAMP);
                                } else {
                                    renderEffectCreateBlurEffect = null;
                                }
                                renderNode2.setRenderEffect(renderEffectCreateBlurEffect);
                            }
                        } else {
                            if (f15 > 0.0f) {
                                blurMaskFilter2 = new android.graphics.BlurMaskFilter(f15, android.graphics.BlurMaskFilter.Blur.NORMAL);
                            } else {
                                blurMaskFilter2 = null;
                            }
                            cdh.n(cpvVar).setMaskFilter(blurMaskFilter2);
                            cdh.n(cpvVar2).setMaskFilter(blurMaskFilter2);
                        }
                    }
                    if (fQ3 != this.y) {
                        this.y = fQ3;
                        android.graphics.Paint paint = this.U;
                        if (fQ3 > 0.0f) {
                            blurMaskFilter = new android.graphics.BlurMaskFilter(this.A * 100.0f * fQ3, android.graphics.BlurMaskFilter.Blur.NORMAL);
                        } else {
                            blurMaskFilter = null;
                        }
                        paint.setMaskFilter(blurMaskFilter);
                    }
                }
                float fFloatValue8 = ((java.lang.Number) this.c.d()).floatValue();
                float fFloatValue9 = ((java.lang.Number) acsaVar2.b.a()).floatValue();
                float f24 = fFloatValue9 + fFloatValue9;
                float f25 = f24 * fFloatValue8;
                float fFloatValue10 = ((java.lang.Number) acsaVar2.c.a()).floatValue();
                float fA = cpp.a(j);
                float f26 = (fFloatValue10 + 1.0f) * f24;
                cpvVar.q(acshVar.f * fA * fFloatValue8 * f26);
                float f27 = acshVar.g * fA * fFloatValue8;
                float f28 = this.Z;
                cpvVar2.q((f27 * f26) + ((f28 + f28) * fFloatValue8));
                float f29 = fFloatValue10 + fFloatValue10 + 1.0f;
                float f30 = (0.5f * fFloatValue10) + 1.0f;
                f2 = -1.0f;
                if (true != this.u) {
                    f3 = 1.0f;
                } else {
                    f3 = -1.0f;
                }
                float fFloatValue11 = ((java.lang.Number) this.f.d()).floatValue();
                float f31 = fFloatValue11 + fFloatValue11;
                float fQ4 = aooc.q(f24, 0.001f);
                float f32 = acshVar.l * fA;
                float f33 = this.V;
                float f34 = f32 * f33;
                float f35 = acshVar.m * fA * f33;
                android.graphics.PathMeasure pathMeasure = this.I;
                float f36 = f3;
                path = this.O;
                float fQ5 = aooc.q(acshVar.h, 0.0f) * fA;
                defpackage.acrj acrjVar = this.K;
                float fQ6 = aooc.q(f29 * f25, 0.001f);
                float f37 = f31 * 3.1415927f * f36;
                h(pathMeasure, path, fQ5 * fQ6, f37, f34 / fQ4, acrjVar);
                h(this.J, this.P, aooc.q(acshVar.i, 0.0f) * fA * fQ6, f37, f35 / fQ4, this.L);
                z = this.u;
                if (z) {
                    f4 = acshVar.c;
                } else {
                    f4 = acshVar.d;
                }
                f5 = acshVar.b + f4;
                if (z) {
                    long j3 = j >> 32;
                    f5 -= 180.0f;
                    aiiVar = this.h;
                    if (aiiVar != null) {
                        fFloatValue2 = ((java.lang.Number) aiiVar.d()).floatValue();
                    } else {
                        fFloatValue2 = 0.0f;
                    }
                    fSin = ((float) java.lang.Math.sin((fFloatValue2 + fFloatValue2) * 3.1415927f)) * java.lang.Float.intBitsToFloat((int) j3) * 0.025f * acshVar.e * acshVar.f;
                } else {
                    fSin = 0.0f;
                    f2 = 1.0f;
                }
                float fQ7 = aooc.q(f25 * f30, 0.001f);
                float f38 = acshVar.j * fA;
                final float fS = f38 * fQ7 * aooc.s(fFloatValue10, 0.0f, 1.0f);
                float fFloatValue12 = ((java.lang.Number) this.g.d()).floatValue();
                final float f39 = (((1.0f - fFloatValue12) * (-f38)) + (fFloatValue12 * f38)) * fQ7;
                aonjVar = new aonj() { // from class: acrx
                    public final java.lang.Object a(java.lang.Object obj) {
                        defpackage.acrt acrtVar2 = (defpackage.acrt) obj;
                        aooh.f(acrtVar2, "mode");
                        return java.lang.Float.valueOf(acrtVar2 == defpackage.acrt.a ? fS : f39);
                    }
                };
                if (aiiVar2.k()) {
                    float fFloatValue13 = ((java.lang.Number) aonjVar.a(this.w)).floatValue();
                    float fFloatValue14 = ((java.lang.Number) aonjVar.a(f())).floatValue();
                    float fFloatValue15 = ((java.lang.Number) aiiVar2.d()).floatValue();
                    fFloatValue = (((1.0f - fFloatValue15) * fFloatValue13) + (fFloatValue15 * fFloatValue14)) * f2;
                } else {
                    fFloatValue = ((java.lang.Number) aonjVar.a(f())).floatValue() * f2;
                }
                f6 = acshVar.f;
                if (f6 > 0.0f) {
                    f7 = acshVar.g / f6;
                } else {
                    f7 = 0.0f;
                }
                f8 = f7 * fFloatValue;
                float f40 = acshVar.a * acsgVar.e;
                z2 = this.u;
                fR = aooc.r(f40, 360.0f);
                if (z2) {
                    fR *= acsgVar.b;
                }
                if (fR < 360.0f) {
                    f9 = fFloatValue;
                    f13 = (acsgVar.a * 360.0f) + f5;
                    float f41 = f5;
                    float fQ8 = aooc.q(acshVar.k, 0.0f);
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) * fQ8;
                    int i = (int) (j & 4294967295L);
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i) * fQ8;
                    double d = (f13 * 3.1415927f) / 180.0f;
                    float fCos = (float) java.lang.Math.cos(d);
                    fSin2 = ((float) java.lang.Math.sin(d)) * fIntBitsToFloat2;
                    if (this.u || acsgVar.d <= 0.0f) {
                        f14 = fSin2;
                    } else {
                        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i) * 0.15f * acsgVar.c;
                        float fSin3 = fIntBitsToFloat2 * ((float) java.lang.Math.sin((f41 * 3.1415927f) / 180.0f));
                        float f42 = acsgVar.d;
                        f14 = ((1.0f - f42) * fSin2) + (f42 * (fSin3 - fIntBitsToFloat3));
                    }
                    float f43 = this.X + (fIntBitsToFloat * fCos);
                    float f44 = this.Y + f14;
                    path2 = this.S;
                    path2.rewind();
                    path2.moveTo(f43, f44);
                    rectF = this.T;
                    float f45 = this.W;
                    rectF.set(f43 - f45, f44 - f45, f43 + f45, f44 + f45);
                    fQ = 360.0f - aooc.q(fR, 0.0f);
                    if (fQ >= 360.0f) {
                        path2.addOval(rectF, android.graphics.Path.Direction.CW);
                    } else {
                        path2.arcTo(rectF, f13 + (fR / 2.0f), fQ, false);
                    }
                    path2.close();
                } else {
                    f9 = fFloatValue;
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    f10 = f9;
                    canvas = this.E;
                    if (canvas != null) {
                        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                        iSave = canvas.save();
                        try {
                            float f46 = this.aa * this.F;
                            canvas.translate(f46, f46);
                            float f47 = this.F;
                            canvas.scale(f47, f47);
                            iSave2 = canvas.save();
                            canvas.translate(fSin, f10);
                            try {
                                canvas.drawPath(this.O, cdh.n(this.ad));
                                canvas.restoreToCount(iSave2);
                                iSave3 = canvas.save();
                                canvas.translate(fSin, f8);
                                try {
                                    canvas.drawPath(this.P, cdh.n(this.ae));
                                    canvas.restoreToCount(iSave3);
                                    if (r5 < 0) {
                                        iSave4 = canvas.save();
                                        canvas.translate(fSin, f10);
                                        try {
                                            canvas.drawPath(this.S, this.U);
                                            canvas.restoreToCount(iSave4);
                                        } catch (java.lang.Throwable th) {
                                            canvas.restoreToCount(iSave4);
                                            throw th;
                                        }
                                    }
                                    canvas.restoreToCount(iSave);
                                } catch (java.lang.Throwable th2) {
                                    canvas.restoreToCount(iSave3);
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                canvas.restoreToCount(iSave2);
                                throw th3;
                            }
                        } catch (java.lang.Throwable th4) {
                            canvas.restoreToCount(iSave);
                            throw th4;
                        }
                    }
                    bitmap = this.D;
                    if (bitmap != null) {
                        cpr.a(cqfVar).drawBitmap(bitmap, (android.graphics.Rect) null, this.G, this.H);
                        return;
                    }
                    return;
                }
                f11 = 1.0f / f18;
                renderNode = this.C;
                if (renderNode != null) {
                    recordingCanvasM = da$.ExternalSyntheticApiModelOutline0.m(renderNode);
                    aooh.e(recordingCanvasM, "beginRecording(...)");
                    iSave5 = recordingCanvasM.save();
                    try {
                        da$.ExternalSyntheticApiModelOutline0.m(recordingCanvasM, f11, f11);
                        iSave6 = recordingCanvasM.save();
                        f12 = f9;
                        recordingCanvasM.translate(fSin, f12);
                        try {
                            recordingCanvasM.drawPath(path, cdh.n(cpvVar));
                            recordingCanvasM.restoreToCount(iSave6);
                            iSave7 = recordingCanvasM.save();
                            recordingCanvasM.translate(fSin, f8);
                            try {
                                recordingCanvasM.drawPath(this.P, cdh.n(this.ae));
                                recordingCanvasM.restoreToCount(iSave7);
                                if (r5 < 0) {
                                    iSave9 = recordingCanvasM.save();
                                    recordingCanvasM.translate(fSin, f12);
                                    try {
                                        recordingCanvasM.drawPath(this.S, this.U);
                                        recordingCanvasM.restoreToCount(iSave9);
                                    } catch (java.lang.Throwable th5) {
                                        recordingCanvasM.restoreToCount(iSave9);
                                        throw th5;
                                    }
                                }
                                recordingCanvasM.restoreToCount(iSave5);
                                da$.ExternalSyntheticApiModelOutline0.m(renderNode);
                                if (this.x <= 0.0f || fR >= 360.0f) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (z3) {
                                    cpr.a(cqfVar).saveLayer(0.0f, 0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), null);
                                }
                                canvasA = cpr.a(cqfVar);
                                iSave8 = canvasA.save();
                                try {
                                    android.graphics.Canvas canvasA2 = cpr.a(cqfVar);
                                    float f48 = acsaVar2.C;
                                    canvasA2.scale(f48, f48);
                                    da$.ExternalSyntheticApiModelOutline0.m(cpr.a(cqfVar), renderNode);
                                    canvasA.restoreToCount(iSave8);
                                    if (z3) {
                                        cpr.a(cqfVar).restore();
                                    }
                                } catch (java.lang.Throwable th6) {
                                    canvasA.restoreToCount(iSave8);
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                recordingCanvasM.restoreToCount(iSave7);
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            recordingCanvasM.restoreToCount(iSave6);
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        recordingCanvasM.restoreToCount(iSave5);
                        throw th9;
                    }
                }
            }
            f = 0.0f;
            acsgVar.e = 1.0f;
            acsgVar.a = fFloatValue4;
            acsgVar.b = 1.0f;
            acsgVar.c = f;
            acsgVar.d = f;
            cpvVar = this.ad;
            cpvVar.j(((cqg) acshVar.p.a).a);
            cpvVar2 = this.ae;
            cpvVar2.j(((cqg) acshVar.p.b).a);
            acsaVar = (defpackage.acsa) this.b;
            if (acsaVar != null) {
                fQ2 = aooc.q(acshVar.n, 0.0f);
                fQ3 = aooc.q(acshVar.o, 0.0f);
                if (fQ2 != this.x) {
                    this.x = fQ2;
                    f15 = this.A * 45.0f * fQ2;
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        f16 = f15 * (1.0f / acsaVar.C);
                        renderNode2 = this.C;
                        if (renderNode2 != null) {
                            if (f16 > 0.0f) {
                                renderEffectCreateBlurEffect = android.graphics.RenderEffect.createBlurEffect(f16, f16, android.graphics.Shader.TileMode.CLAMP);
                            } else {
                                renderEffectCreateBlurEffect = null;
                            }
                            renderNode2.setRenderEffect(renderEffectCreateBlurEffect);
                        }
                    } else {
                        if (f15 > 0.0f) {
                            blurMaskFilter2 = new android.graphics.BlurMaskFilter(f15, android.graphics.BlurMaskFilter.Blur.NORMAL);
                        } else {
                            blurMaskFilter2 = null;
                        }
                        cdh.n(cpvVar).setMaskFilter(blurMaskFilter2);
                        cdh.n(cpvVar2).setMaskFilter(blurMaskFilter2);
                    }
                }
                if (fQ3 != this.y) {
                    this.y = fQ3;
                    android.graphics.Paint paint2 = this.U;
                    if (fQ3 > 0.0f) {
                        blurMaskFilter = new android.graphics.BlurMaskFilter(this.A * 100.0f * fQ3, android.graphics.BlurMaskFilter.Blur.NORMAL);
                    } else {
                        blurMaskFilter = null;
                    }
                    paint2.setMaskFilter(blurMaskFilter);
                }
            }
            float fFloatValue16 = ((java.lang.Number) this.c.d()).floatValue();
            float fFloatValue17 = ((java.lang.Number) acsaVar2.b.a()).floatValue();
            float f210 = fFloatValue17 + fFloatValue17;
            float f211 = f210 * fFloatValue16;
            float fFloatValue18 = ((java.lang.Number) acsaVar2.c.a()).floatValue();
            float fA2 = cpp.a(j);
            float f212 = (fFloatValue18 + 1.0f) * f210;
            cpvVar.q(acshVar.f * fA2 * fFloatValue16 * f212);
            float f213 = acshVar.g * fA2 * fFloatValue16;
            float f214 = this.Z;
            cpvVar2.q((f213 * f212) + ((f214 + f214) * fFloatValue16));
            float f215 = fFloatValue18 + fFloatValue18 + 1.0f;
            float f310 = (0.5f * fFloatValue18) + 1.0f;
            f2 = -1.0f;
            if (true != this.u) {
                f3 = 1.0f;
            } else {
                f3 = -1.0f;
            }
            float fFloatValue19 = ((java.lang.Number) this.f.d()).floatValue();
            float f311 = fFloatValue19 + fFloatValue19;
            float fQ9 = aooc.q(f210, 0.001f);
            float f312 = acshVar.l * fA2;
            float f313 = this.V;
            float f314 = f312 * f313;
            float f315 = acshVar.m * fA2 * f313;
            android.graphics.PathMeasure pathMeasure2 = this.I;
            float f316 = f3;
            path = this.O;
            float fQ10 = aooc.q(acshVar.h, 0.0f) * fA2;
            defpackage.acrj acrjVar2 = this.K;
            float fQ11 = aooc.q(f215 * f211, 0.001f);
            float f317 = f311 * 3.1415927f * f316;
            h(pathMeasure2, path, fQ10 * fQ11, f317, f314 / fQ9, acrjVar2);
            h(this.J, this.P, aooc.q(acshVar.i, 0.0f) * fA2 * fQ11, f317, f315 / fQ9, this.L);
            z = this.u;
            if (z) {
                f4 = acshVar.c;
            } else {
                f4 = acshVar.d;
            }
            f5 = acshVar.b + f4;
            if (z) {
                long j4 = j >> 32;
                f5 -= 180.0f;
                aiiVar = this.h;
                if (aiiVar != null) {
                    fFloatValue2 = ((java.lang.Number) aiiVar.d()).floatValue();
                } else {
                    fFloatValue2 = 0.0f;
                }
                fSin = ((float) java.lang.Math.sin((fFloatValue2 + fFloatValue2) * 3.1415927f)) * java.lang.Float.intBitsToFloat((int) j4) * 0.025f * acshVar.e * acshVar.f;
            } else {
                fSin = 0.0f;
                f2 = 1.0f;
            }
            float fQ12 = aooc.q(f211 * f310, 0.001f);
            float f318 = acshVar.j * fA2;
            final float fS2 = f318 * fQ12 * aooc.s(fFloatValue18, 0.0f, 1.0f);
            float fFloatValue110 = ((java.lang.Number) this.g.d()).floatValue();
            final float f319 = (((1.0f - fFloatValue110) * (-f318)) + (fFloatValue110 * f318)) * fQ12;
            aonjVar = new aonj() { // from class: acrx
                public final java.lang.Object a(java.lang.Object obj) {
                    defpackage.acrt acrtVar2 = (defpackage.acrt) obj;
                    aooh.f(acrtVar2, "mode");
                    return java.lang.Float.valueOf(acrtVar2 == defpackage.acrt.a ? fS2 : f319);
                }
            };
            if (aiiVar2.k()) {
                float fFloatValue111 = ((java.lang.Number) aonjVar.a(this.w)).floatValue();
                float fFloatValue112 = ((java.lang.Number) aonjVar.a(f())).floatValue();
                float fFloatValue113 = ((java.lang.Number) aiiVar2.d()).floatValue();
                fFloatValue = (((1.0f - fFloatValue113) * fFloatValue111) + (fFloatValue113 * fFloatValue112)) * f2;
            } else {
                fFloatValue = ((java.lang.Number) aonjVar.a(f())).floatValue() * f2;
            }
            f6 = acshVar.f;
            if (f6 > 0.0f) {
                f7 = acshVar.g / f6;
            } else {
                f7 = 0.0f;
            }
            f8 = f7 * fFloatValue;
            float f49 = acshVar.a * acsgVar.e;
            z2 = this.u;
            fR = aooc.r(f49, 360.0f);
            if (z2) {
                fR *= acsgVar.b;
            }
            if (fR < 360.0f) {
                f9 = fFloatValue;
                f13 = (acsgVar.a * 360.0f) + f5;
                float f410 = f5;
                float fQ13 = aooc.q(acshVar.k, 0.0f);
                float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j >> 32)) * fQ13;
                int i2 = (int) (j & 4294967295L);
                float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i2) * fQ13;
                double d2 = (f13 * 3.1415927f) / 180.0f;
                float fCos2 = (float) java.lang.Math.cos(d2);
                fSin2 = ((float) java.lang.Math.sin(d2)) * fIntBitsToFloat5;
                if (this.u) {
                    f14 = fSin2;
                } else {
                    f14 = fSin2;
                }
                float f411 = this.X + (fIntBitsToFloat4 * fCos2);
                float f412 = this.Y + f14;
                path2 = this.S;
                path2.rewind();
                path2.moveTo(f411, f412);
                rectF = this.T;
                float f413 = this.W;
                rectF.set(f411 - f413, f412 - f413, f411 + f413, f412 + f413);
                fQ = 360.0f - aooc.q(fR, 0.0f);
                if (fQ >= 360.0f) {
                    path2.addOval(rectF, android.graphics.Path.Direction.CW);
                } else {
                    path2.arcTo(rectF, f13 + (fR / 2.0f), fQ, false);
                }
                path2.close();
            } else {
                f9 = fFloatValue;
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                f10 = f9;
                canvas = this.E;
                if (canvas != null) {
                    canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                    iSave = canvas.save();
                    float f414 = this.aa * this.F;
                    canvas.translate(f414, f414);
                    float f415 = this.F;
                    canvas.scale(f415, f415);
                    iSave2 = canvas.save();
                    canvas.translate(fSin, f10);
                    canvas.drawPath(this.O, cdh.n(this.ad));
                    canvas.restoreToCount(iSave2);
                    iSave3 = canvas.save();
                    canvas.translate(fSin, f8);
                    canvas.drawPath(this.P, cdh.n(this.ae));
                    canvas.restoreToCount(iSave3);
                    if (r5 < 0) {
                        iSave4 = canvas.save();
                        canvas.translate(fSin, f10);
                        canvas.drawPath(this.S, this.U);
                        canvas.restoreToCount(iSave4);
                    }
                    canvas.restoreToCount(iSave);
                }
                bitmap = this.D;
                if (bitmap != null) {
                    cpr.a(cqfVar).drawBitmap(bitmap, (android.graphics.Rect) null, this.G, this.H);
                    return;
                }
                return;
            }
            f11 = 1.0f / f18;
            renderNode = this.C;
            if (renderNode != null) {
                recordingCanvasM = da$.ExternalSyntheticApiModelOutline0.m(renderNode);
                aooh.e(recordingCanvasM, "beginRecording(...)");
                iSave5 = recordingCanvasM.save();
                da$.ExternalSyntheticApiModelOutline0.m(recordingCanvasM, f11, f11);
                iSave6 = recordingCanvasM.save();
                f12 = f9;
                recordingCanvasM.translate(fSin, f12);
                recordingCanvasM.drawPath(path, cdh.n(cpvVar));
                recordingCanvasM.restoreToCount(iSave6);
                iSave7 = recordingCanvasM.save();
                recordingCanvasM.translate(fSin, f8);
                recordingCanvasM.drawPath(this.P, cdh.n(this.ae));
                recordingCanvasM.restoreToCount(iSave7);
                if (r5 < 0) {
                    iSave9 = recordingCanvasM.save();
                    recordingCanvasM.translate(fSin, f12);
                    recordingCanvasM.drawPath(this.S, this.U);
                    recordingCanvasM.restoreToCount(iSave9);
                }
                recordingCanvasM.restoreToCount(iSave5);
                da$.ExternalSyntheticApiModelOutline0.m(renderNode);
                if (this.x <= 0.0f) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (z3) {
                    cpr.a(cqfVar).saveLayer(0.0f, 0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), null);
                }
                canvasA = cpr.a(cqfVar);
                iSave8 = canvasA.save();
                android.graphics.Canvas canvasA3 = cpr.a(cqfVar);
                float f416 = acsaVar2.C;
                canvasA3.scale(f416, f416);
                da$.ExternalSyntheticApiModelOutline0.m(cpr.a(cqfVar), renderNode);
                canvasA.restoreToCount(iSave8);
                if (z3) {
                    cpr.a(cqfVar).restore();
                }
            }
        }
    }

    public final void e(defpackage.acrt acrtVar) {
        this.v.b(acrtVar);
    }
}
