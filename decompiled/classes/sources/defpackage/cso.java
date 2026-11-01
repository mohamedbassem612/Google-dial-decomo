package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cso {
    public static final /* synthetic */ int v = 0;
    private float A;
    private defpackage.cqx B;
    private android.graphics.RectF C;
    public boolean e;
    public defpackage.csh f;
    public int g;
    public boolean i;
    public long j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;
    public long p;
    public boolean q;
    public defpackage.cpv r;
    public final defpackage.csp s;
    public defpackage.cpx t;
    public defpackage.cpx u;
    private android.graphics.Outline y;
    public defpackage.dpf a = defpackage.csi.a;
    public defpackage.dpq b = defpackage.dpq.a;
    private defpackage.aonj w = new defpackage.ckc(6);
    private final defpackage.aonj x = new defpackage.bjp(this, 16);
    public boolean c = true;
    public long d = 0;
    private long z = 9205357640488583168L;
    public final defpackage.csn h = new defpackage.csn();

    static {
        defpackage.aooh.n(android.os.Build.FINGERPRINT, "robolectric");
    }

    public cso(defpackage.csp cspVar) {
        this.s = cspVar;
        cspVar.b(false);
        this.j = 0L;
        this.k = 0L;
        this.p = 9205357640488583168L;
    }

    private final android.graphics.Outline n() {
        android.graphics.Outline outline = this.y;
        if (outline != null) {
            return outline;
        }
        android.graphics.Outline outline2 = new android.graphics.Outline();
        this.y = outline2;
        return outline2;
    }

    private final void o() {
        this.g--;
        e();
    }

    private final void p() {
        this.B = null;
        this.t = null;
        this.z = 9205357640488583168L;
        this.d = 0L;
        this.A = 0.0f;
        this.c = true;
        this.e = false;
    }

    public final float a() {
        return this.s.f;
    }

    public final float b() {
        return this.s.l;
    }

    public final defpackage.cqx c() {
        defpackage.cqx cqvVar;
        defpackage.cqx cqxVar = this.B;
        defpackage.cpx cpxVar = this.t;
        if (cqxVar != null) {
            return cqxVar;
        }
        if (cpxVar != null) {
            defpackage.cqu cquVar = new defpackage.cqu(cpxVar);
            this.B = cquVar;
            return cquVar;
        }
        long jL = defpackage.dpy.l(this.k);
        long j = this.d;
        long j2 = this.z;
        if (j2 != 9205357640488583168L) {
            jL = j2;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = fIntBitsToFloat + java.lang.Float.intBitsToFloat((int) (jL >> 32));
        float fIntBitsToFloat4 = fIntBitsToFloat2 + java.lang.Float.intBitsToFloat((int) (jL & 4294967295L));
        float f = this.A;
        if (f > 0.0f) {
            cqvVar = new defpackage.cqw(defpackage.cdh.t(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L)));
        } else {
            cqvVar = new defpackage.cqv(new defpackage.cpn(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.B = cqvVar;
        return cqvVar;
    }

    public final void d() {
        if (this.c) {
            boolean z = this.q;
            if (z || b() > 0.0f) {
                defpackage.cpx cpxVar = this.t;
                if (cpxVar != null) {
                    android.graphics.RectF rectF = this.C;
                    if (rectF == null) {
                        rectF = new android.graphics.RectF();
                        this.C = rectF;
                    }
                    android.graphics.Path path = cpxVar.a;
                    path.computeBounds(rectF, false);
                    android.graphics.Outline outlineN = n();
                    baa$.ExternalSyntheticApiModelOutline1.m(outlineN, path);
                    outlineN.offset(this.l, this.m);
                    this.e = !outlineN.canClip();
                    this.t = cpxVar;
                    outlineN.setAlpha(a());
                    defpackage.csp cspVar = this.s;
                    rectF.width();
                    rectF.height();
                    cspVar.f(outlineN);
                    if (this.e && this.q) {
                        cspVar.b(false);
                        cspVar.a();
                    } else {
                        cspVar.b(this.q);
                    }
                } else {
                    defpackage.csp cspVar2 = this.s;
                    cspVar2.b(z);
                    android.graphics.Outline outlineN2 = n();
                    long jL = defpackage.dpy.l(this.k);
                    long j = this.d;
                    long j2 = this.z;
                    long j3 = j2 == 9205357640488583168L ? jL : j2;
                    int i = (int) (j >> 32);
                    int i2 = (int) (j & 4294967295L);
                    outlineN2.setRoundRect(java.lang.Math.round(java.lang.Float.intBitsToFloat(i)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i2)), java.lang.Math.round(java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j3 >> 32))), java.lang.Math.round(java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (4294967295L & j3))), this.A);
                    outlineN2.setAlpha(a());
                    defpackage.dpy.j(j3);
                    cspVar2.f(outlineN2);
                }
            } else {
                defpackage.csp cspVar3 = this.s;
                cspVar3.b(false);
                cspVar3.f(null);
            }
        }
        this.c = false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x005c A[LOOP:0: B:14:0x0025->B:25:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f A[EDGE_INSN: B:30:0x005f->B:26:0x005f BREAK  A[LOOP:0: B:14:0x0025->B:25:0x005c], SYNTHETIC] */
    public final void e() {
        int i;
        if (this.i && this.g == 0) {
            defpackage.csn csnVar = this.h;
            defpackage.cso csoVar = csnVar.a;
            if (csoVar != null) {
                csoVar.o();
                csnVar.a = null;
            }
            defpackage.ady adyVar = csnVar.d;
            if (adyVar != null) {
                java.lang.Object[] objArr = adyVar.b;
                long[] jArr = adyVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    ((defpackage.cso) objArr[(i2 << 3) + i4]).o();
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            } else if (i2 != length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                adyVar.d();
            }
            this.s.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0081 A[LOOP:0: B:20:0x004a->B:31:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[EDGE_INSN: B:35:0x0084->B:32:0x0084 BREAK  A[LOOP:0: B:20:0x004a->B:31:0x0081], SYNTHETIC] */
    public final void f(defpackage.csj csjVar) {
        int i;
        defpackage.csn csnVar = this.h;
        csnVar.b = csnVar.a;
        defpackage.ady adyVar = csnVar.d;
        if (adyVar != null && adyVar.c()) {
            defpackage.ady adyVar2 = csnVar.e;
            if (adyVar2 == null) {
                defpackage.ady adyVar3 = defpackage.adz.a;
                adyVar2 = new defpackage.ady(6);
                csnVar.e = adyVar2;
            }
            adyVar2.f(adyVar);
            adyVar.d();
        }
        csnVar.c = true;
        this.w.a(csjVar);
        csnVar.c = false;
        defpackage.cso csoVar = csnVar.b;
        if (csoVar != null) {
            csoVar.o();
        }
        defpackage.ady adyVar4 = csnVar.e;
        if (adyVar4 == null || !adyVar4.c()) {
            return;
        }
        java.lang.Object[] objArr = adyVar4.b;
        long[] jArr = adyVar4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            ((defpackage.cso) objArr[(i2 << 3) + i4]).o();
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        adyVar4.d();
    }

    public final void g(defpackage.dpf dpfVar, defpackage.dpq dpqVar, long j, defpackage.aonj aonjVar) {
        if (this.k != j) {
            this.k = j;
            k(this.j, j);
            if (this.z == 9205357640488583168L) {
                this.c = true;
                d();
            }
        }
        this.a = dpfVar;
        this.b = dpqVar;
        this.w = aonjVar;
        h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [cqf, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h() {
        defpackage.csp cspVar = this.s;
        android.graphics.RenderNode renderNode = cspVar.b;
        defpackage.dpf dpfVar = this.a;
        defpackage.dpq dpqVar = this.b;
        android.graphics.RecordingCanvas recordingCanvasM = da$.ExternalSyntheticApiModelOutline0.m(renderNode);
        float f = cspVar.q;
        float f2 = cspVar.r;
        long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
        try {
            ?? r8 = cspVar.x.a;
            android.graphics.Canvas canvas = ((defpackage.cpq) r8).a;
            ((defpackage.cpq) r8).a = recordingCanvasM;
            defpackage.csh cshVar = cspVar.a;
            defpackage.csg csgVar = cshVar.b;
            csgVar.f(dpfVar);
            csgVar.g(dpqVar);
            csgVar.a = this;
            csgVar.h(cspVar.c);
            csgVar.e(r8);
            int i = cspVar.q;
            defpackage.aonj aonjVar = this.x;
            if (i > 0.0f || cspVar.r > 0.0f) {
                long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L);
                int i2 = (int) (j >> 32);
                int i3 = (int) (j & 4294967295L);
                r8.i(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3));
                aonjVar.a(cshVar);
                r8.i(-java.lang.Float.intBitsToFloat(i2), -java.lang.Float.intBitsToFloat(i3));
            } else {
                aonjVar.a(cshVar);
            }
            ((defpackage.cpq) r8).a = canvas;
        } finally {
            da$.ExternalSyntheticApiModelOutline0.m(cspVar.b);
        }
    }

    public final void i(float f) {
        defpackage.csp cspVar = this.s;
        if (cspVar.f != f) {
            cspVar.f = f;
            da$.ExternalSyntheticApiModelOutline0.m$2(cspVar.b, f);
        }
    }

    public final void j(long j) {
        if (this.p != j) {
            this.p = j;
            defpackage.csp cspVar = this.s;
            cspVar.h = j;
            cspVar.d();
        }
    }

    public final void k(long j, long j2) {
        defpackage.csp cspVar = this.s;
        cspVar.u = (int) (j >> 32);
        cspVar.v = (int) (j & 4294967295L);
        long j3 = cspVar.c;
        long jL = defpackage.dpy.l(j2);
        cspVar.c = defpackage.dpy.l(j2);
        cspVar.e();
        if ((j3 == jL) || cspVar.h != 9205357640488583168L) {
            return;
        }
        android.graphics.RenderNode renderNode = cspVar.b;
        da$.ExternalSyntheticApiModelOutline0.m(renderNode, (((int) (j2 >> 32)) / 2.0f) + cspVar.q);
        da$.ExternalSyntheticApiModelOutline0.m$1(renderNode, (((int) (j2 & 4294967295L)) / 2.0f) + cspVar.r);
    }

    public final void l(long j, long j2, float f) {
        long jBl = defpackage.mni.bl(j, (((long) java.lang.Float.floatToRawIntBits(this.l)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.m)) & 4294967295L));
        if (this.d == jBl && this.z == j2 && this.A == f && this.t == null) {
            return;
        }
        p();
        this.d = jBl;
        this.z = j2;
        this.A = f;
        d();
    }

    public final void m(defpackage.cpx cpxVar) {
        p();
        this.t = cpxVar;
        d();
    }
}
