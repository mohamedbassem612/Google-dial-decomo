package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hal implements defpackage.hai, defpackage.hay, defpackage.hao {
    float a;
    private final java.lang.String b;
    private final boolean c;
    private final defpackage.hef d;
    private final adb e = new adb(10);
    private final adb f = new adb(10);
    private final android.graphics.Path g;
    private final android.graphics.Paint h;
    private final android.graphics.RectF i;
    private final java.util.List j;
    private final defpackage.hbd k;
    private final defpackage.hbd l;
    private final defpackage.hbd m;
    private final defpackage.hbd n;
    private defpackage.hbd o;
    private defpackage.hbu p;
    private final defpackage.gzs q;
    private final int r;
    private defpackage.hbd s;
    private defpackage.hbg t;
    private final int u;

    public hal(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar, defpackage.hdq hdqVar) {
        android.graphics.Path path = new android.graphics.Path();
        this.g = path;
        this.h = new defpackage.hae(1);
        this.i = new android.graphics.RectF();
        this.j = new java.util.ArrayList();
        this.a = 0.0f;
        this.d = hefVar;
        this.b = hdqVar.f;
        this.c = hdqVar.g;
        this.q = gzsVar;
        this.u = hdqVar.h;
        path.setFillType(hdqVar.a);
        this.r = (int) (gzhVar.a() / 32.0f);
        defpackage.hbd hbdVarA = hdqVar.b.a();
        this.k = hbdVarA;
        hbdVarA.h(this);
        hefVar.i(hbdVarA);
        defpackage.hbd hbdVarA2 = hdqVar.c.a();
        this.l = hbdVarA2;
        hbdVarA2.h(this);
        hefVar.i(hbdVarA2);
        defpackage.hbd hbdVarA3 = hdqVar.d.a();
        this.m = hbdVarA3;
        hbdVarA3.h(this);
        hefVar.i(hbdVarA3);
        defpackage.hbd hbdVarA4 = hdqVar.e.a();
        this.n = hbdVarA4;
        hbdVarA4.h(this);
        hefVar.i(hbdVarA4);
        if (hefVar.q() != null) {
            defpackage.hbd hbdVarA5 = ((defpackage.hdb) hefVar.q().a).a();
            this.s = hbdVarA5;
            hbdVarA5.h(this);
            hefVar.i(this.s);
        }
        if (hefVar.r() != null) {
            this.t = new defpackage.hbg(this, hefVar, hefVar.r());
        }
    }

    private final int h() {
        float f = this.m.c;
        float f2 = this.r;
        int iRound = java.lang.Math.round(f * f2);
        int iRound2 = java.lang.Math.round(this.n.c * f2);
        int iRound3 = java.lang.Math.round(this.k.c * f2);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private final int[] i(int[] iArr) {
        defpackage.hbu hbuVar = this.p;
        if (hbuVar != null) {
            java.lang.Integer[] numArr = (java.lang.Integer[]) hbuVar.e();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                int[] iArr2 = new int[length2];
                while (i < numArr.length) {
                    iArr2[i] = numArr[i].intValue();
                    i++;
                }
                return iArr2;
            }
            while (i < iArr.length) {
                iArr[i] = numArr[i].intValue();
                i++;
            }
        }
        return iArr;
    }

    @Override // defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        defpackage.hbg hbgVar;
        defpackage.hbg hbgVar2;
        defpackage.hbg hbgVar3;
        defpackage.hbg hbgVar4;
        defpackage.hbg hbgVar5;
        if (obj == defpackage.gzx.d) {
            this.l.d = hgpVar;
            return;
        }
        if (obj == defpackage.gzx.K) {
            defpackage.hbd hbdVar = this.o;
            if (hbdVar != null) {
                this.d.k(hbdVar);
            }
            if (hgpVar == null) {
                this.o = null;
                return;
            }
            defpackage.hbu hbuVar = new defpackage.hbu(hgpVar, null);
            this.o = hbuVar;
            hbuVar.h(this);
            this.d.i(this.o);
            return;
        }
        if (obj == defpackage.gzx.L) {
            defpackage.hbu hbuVar2 = this.p;
            if (hbuVar2 != null) {
                this.d.k(hbuVar2);
            }
            if (hgpVar == null) {
                this.p = null;
                return;
            }
            this.e.f();
            this.f.f();
            defpackage.hbu hbuVar3 = new defpackage.hbu(hgpVar, null);
            this.p = hbuVar3;
            hbuVar3.h(this);
            this.d.i(this.p);
            return;
        }
        if (obj == defpackage.gzx.j) {
            defpackage.hbd hbdVar2 = this.s;
            if (hbdVar2 != null) {
                hbdVar2.d = hgpVar;
                return;
            }
            defpackage.hbu hbuVar4 = new defpackage.hbu(hgpVar, null);
            this.s = hbuVar4;
            hbuVar4.h(this);
            this.d.i(this.s);
            return;
        }
        if (obj == defpackage.gzx.e && (hbgVar5 = this.t) != null) {
            hbgVar5.b(hgpVar);
            return;
        }
        if (obj == defpackage.gzx.G && (hbgVar4 = this.t) != null) {
            hbgVar4.f(hgpVar);
            return;
        }
        if (obj == defpackage.gzx.H && (hbgVar3 = this.t) != null) {
            hbgVar3.c(hgpVar);
            return;
        }
        if (obj == defpackage.gzx.I && (hbgVar2 = this.t) != null) {
            hbgVar2.e(hgpVar);
        } else {
            if (obj != defpackage.gzx.J || (hbgVar = this.t) == null) {
                return;
            }
            hbgVar.g(hgpVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00df  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:30:0x0105  */
    /* JADX WARN: Code duplicated, block: B:34:0x0115  */
    @Override // defpackage.hai
    public final void b(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        android.graphics.Shader shader;
        float f;
        android.graphics.Paint paint;
        defpackage.hbd hbdVar;
        defpackage.hbd hbdVar2;
        defpackage.hbg hbgVar;
        float fFloatValue;
        if (this.c) {
            return;
        }
        android.graphics.Path path = this.g;
        path.reset();
        int i2 = 0;
        while (true) {
            java.util.List list = this.j;
            if (i2 >= list.size()) {
                break;
            }
            path.addPath(((defpackage.haq) list.get(i2)).i(), matrix);
            i2++;
        }
        path.computeBounds(this.i, false);
        if (this.u != 1) {
            int iH = h();
            adb adbVar = this.f;
            long j = iH;
            shader = (android.graphics.RadialGradient) adbVar.d(j);
            if (shader == null) {
                android.graphics.PointF pointF = (android.graphics.PointF) this.m.e();
                android.graphics.PointF pointF2 = (android.graphics.PointF) this.n.e();
                defpackage.hdp hdpVar = (defpackage.hdp) this.k.e();
                int[] iArrI = i(hdpVar.b);
                float[] fArr = hdpVar.a;
                float f2 = pointF.x;
                float f3 = pointF.y;
                f = 0.0f;
                float fHypot = (float) java.lang.Math.hypot(pointF2.x - f2, pointF2.y - f3);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(f2, f3, fHypot, iArrI, fArr, android.graphics.Shader.TileMode.CLAMP);
                adbVar.g(j, radialGradient);
                shader = radialGradient;
            }
            shader.setLocalMatrix(matrix);
            paint = this.h;
            paint.setShader(shader);
            hbdVar = this.o;
            if (hbdVar != null) {
                paint.setColorFilter((android.graphics.ColorFilter) hbdVar.e());
            }
            hbdVar2 = this.s;
            if (hbdVar2 != null) {
                fFloatValue = ((java.lang.Float) hbdVar2.e()).floatValue();
                if (fFloatValue == f) {
                    paint.setMaskFilter(null);
                } else if (fFloatValue != this.a) {
                    paint.setMaskFilter(new android.graphics.BlurMaskFilter(fFloatValue, android.graphics.BlurMaskFilter.Blur.NORMAL));
                }
                this.a = fFloatValue;
            }
            hbgVar = this.t;
            if (hbgVar != null) {
                hbgVar.a(paint);
            }
            float fIntValue = ((java.lang.Integer) this.l.e()).intValue();
            int i3 = defpackage.hgh.a;
            paint.setAlpha(java.lang.Math.max(0, java.lang.Math.min(255, (int) ((((i / 255.0f) * fIntValue) / 100.0f) * 255.0f))));
            canvas.drawPath(path, paint);
        }
        int iH2 = h();
        adb adbVar2 = this.e;
        long j2 = iH2;
        shader = (android.graphics.LinearGradient) adbVar2.d(j2);
        if (shader == null) {
            android.graphics.PointF pointF3 = (android.graphics.PointF) this.m.e();
            android.graphics.PointF pointF4 = (android.graphics.PointF) this.n.e();
            defpackage.hdp hdpVar2 = (defpackage.hdp) this.k.e();
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(pointF3.x, pointF3.y, pointF4.x, pointF4.y, i(hdpVar2.b), hdpVar2.a, android.graphics.Shader.TileMode.CLAMP);
            adbVar2.g(j2, linearGradient);
            shader = linearGradient;
        }
        f = 0.0f;
        shader.setLocalMatrix(matrix);
        paint = this.h;
        paint.setShader(shader);
        hbdVar = this.o;
        if (hbdVar != null) {
            paint.setColorFilter((android.graphics.ColorFilter) hbdVar.e());
        }
        hbdVar2 = this.s;
        if (hbdVar2 != null) {
            fFloatValue = ((java.lang.Float) hbdVar2.e()).floatValue();
            if (fFloatValue == f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.a) {
                paint.setMaskFilter(new android.graphics.BlurMaskFilter(fFloatValue, android.graphics.BlurMaskFilter.Blur.NORMAL));
            }
            this.a = fFloatValue;
        }
        hbgVar = this.t;
        if (hbgVar != null) {
            hbgVar.a(paint);
        }
        float fIntValue2 = ((java.lang.Integer) this.l.e()).intValue();
        int i4 = defpackage.hgh.a;
        paint.setAlpha(java.lang.Math.max(0, java.lang.Math.min(255, (int) ((((i / 255.0f) * fIntValue2) / 100.0f) * 255.0f))));
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        android.graphics.Path path = this.g;
        path.reset();
        int i = 0;
        while (true) {
            java.util.List list = this.j;
            if (i >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((defpackage.haq) list.get(i)).i(), matrix);
                i++;
            }
        }
    }

    @Override // defpackage.hay
    public final void d() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.hcx
    public final void e(defpackage.hcw hcwVar, int i, java.util.List list, defpackage.hcw hcwVar2) {
        defpackage.hgh.d(hcwVar, i, list, hcwVar2, this);
    }

    @Override // defpackage.hag
    public final void f(java.util.List list, java.util.List list2) {
        for (int i = 0; i < list2.size(); i++) {
            defpackage.hag hagVar = (defpackage.hag) list2.get(i);
            if (hagVar instanceof defpackage.haq) {
                this.j.add((defpackage.haq) hagVar);
            }
        }
    }

    @Override // defpackage.hag
    public final java.lang.String g() {
        return this.b;
    }
}
