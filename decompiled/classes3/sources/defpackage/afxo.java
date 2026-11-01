package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afxo extends defpackage.afyi {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private float o;
    private final android.graphics.RectF p;
    private final android.util.Pair q;

    public afxo(defpackage.afxz afxzVar) {
        super(afxzVar);
        this.p = new android.graphics.RectF();
        this.q = new android.util.Pair(new defpackage.afyh(this), new defpackage.afyh(this));
    }

    private final int j() {
        defpackage.afxz afxzVar = (defpackage.afxz) this.a;
        return afxzVar.r + (afxzVar.s << 1);
    }

    private final void k(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        android.graphics.Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                k(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) java.lang.Math.toDegrees(this.g / this.i);
        float f9 = (-0.99f) + f6;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float f11 = this.o;
        float f12 = 1.0f - f11;
        float f13 = (1.0f - f6) * 0.0f;
        float f14 = f6 * f11;
        float degrees2 = (float) java.lang.Math.toDegrees(i2 / this.i);
        float degrees3 = (((f13 + f14) * 360.0f) - degrees2) - ((float) java.lang.Math.toDegrees(i3 / this.i));
        float f15 = ((1.0f - f7) * f12) + f7;
        if (degrees3 > 0.0f) {
            defpackage.afxz afxzVar = (defpackage.afxz) this.a;
            boolean z2 = false;
            if (afxzVar.c(this.n) && z && f3 > 0.0f) {
                z2 = true;
            }
            float f16 = (f15 * 360.0f) + degrees2;
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f);
            float f17 = this.g;
            float f18 = f17 + f17;
            float f19 = degrees + degrees;
            if (degrees3 < f19) {
                float f20 = degrees3 / f19;
                float f21 = f16 + (degrees * f20);
                defpackage.afyh afyhVar = new defpackage.afyh(this);
                if (z2) {
                    android.graphics.PathMeasure pathMeasure = this.d;
                    float length = ((f21 / 360.0f) * pathMeasure.getLength()) / 2.0f;
                    float f22 = this.h * f3;
                    float f23 = this.i;
                    if (f23 != this.m || f22 != this.k) {
                        this.k = f22;
                        this.m = f23;
                        g();
                    }
                    pathMeasure.getPosTan(length, (float[]) afyhVar.a, (float[]) afyhVar.b);
                } else {
                    afyhVar.d(f21 + 90.0f);
                    afyhVar.a(-this.i);
                }
                paint.setStyle(android.graphics.Paint.Style.FILL);
                l(canvas, paint, afyhVar, f18, this.f, f20);
                return;
            }
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeCap(afxzVar.f() ? android.graphics.Paint.Cap.ROUND : android.graphics.Paint.Cap.BUTT);
            float f24 = f16 + degrees;
            float f25 = degrees3 - f19;
            android.util.Pair pair = this.q;
            ((defpackage.afyh) pair.first).c();
            ((defpackage.afyh) pair.second).c();
            if (z2) {
                android.graphics.PathMeasure pathMeasure2 = this.d;
                android.graphics.Path path = this.c;
                float f26 = f24 / 360.0f;
                float f27 = f25 / 360.0f;
                float f28 = this.h * f3;
                int i4 = this.n ? afxzVar.j : afxzVar.k;
                float f29 = this.i;
                if (f29 != this.m || f28 != this.k || i4 != this.l) {
                    this.k = f28;
                    this.l = i4;
                    this.m = f29;
                    g();
                }
                path.rewind();
                float fA = dzk.A(f27, 0.0f, 1.0f);
                if (afxzVar.c(this.n)) {
                    float f30 = f4 / ((float) ((((double) this.i) * 6.283185307179586d) / ((double) this.j)));
                    f26 += f30;
                    f5 = -(f30 * 360.0f);
                } else {
                    f5 = 0.0f;
                }
                float f31 = f26 % 1.0f;
                float length2 = (pathMeasure2.getLength() * f31) / 2.0f;
                float length3 = ((f31 + fA) * pathMeasure2.getLength()) / 2.0f;
                pathMeasure2.getSegment(length2, length3, path, true);
                defpackage.afyh afyhVar2 = (defpackage.afyh) pair.first;
                afyhVar2.c();
                pathMeasure2.getPosTan(length2, (float[]) afyhVar2.a, (float[]) afyhVar2.b);
                defpackage.afyh afyhVar3 = (defpackage.afyh) pair.second;
                afyhVar3.c();
                pathMeasure2.getPosTan(length3, (float[]) afyhVar3.a, (float[]) afyhVar3.b);
                android.graphics.Matrix matrix = this.e;
                matrix.reset();
                matrix.setRotate(f5);
                afyhVar2.d(f5);
                afyhVar3.d(f5);
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                ((defpackage.afyh) pair.first).d(f24 + 90.0f);
                ((defpackage.afyh) pair.first).a(-this.i);
                ((defpackage.afyh) pair.second).d(f24 + f25 + 90.0f);
                ((defpackage.afyh) pair.second).a(-this.i);
                android.graphics.RectF rectF = this.p;
                float f32 = this.i;
                float f33 = -f32;
                rectF.set(f33, f33, f32, f32);
                canvas.drawArc(rectF, f24, f25, false, paint);
                canvas2 = canvas;
            }
            if (afxzVar.f() || this.g <= 0.0f) {
                return;
            }
            paint.setStyle(android.graphics.Paint.Style.FILL);
            l(canvas2, paint, (defpackage.afyh) pair.first, f18, this.f, 1.0f);
            l(canvas, paint, (defpackage.afyh) pair.second, f18, this.f, 1.0f);
        }
    }

    private final void l(android.graphics.Canvas canvas, android.graphics.Paint paint, defpackage.afyh afyhVar, float f, float f2, float f3) {
        float fMin = java.lang.Math.min(f2, this.f);
        float f4 = (this.g * fMin) / this.f;
        float f5 = -f;
        float f6 = f / 2.0f;
        float fMin2 = java.lang.Math.min(f6, f4);
        android.graphics.RectF rectF = new android.graphics.RectF(f5 / 2.0f, (-fMin) / 2.0f, f6, fMin / 2.0f);
        canvas.save();
        float[] fArr = (float[]) afyhVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i((float[]) afyhVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // defpackage.afyi
    public final int a() {
        return j();
    }

    @Override // defpackage.afyi
    public final int b() {
        return j();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0087  */
    /* JADX WARN: Code duplicated, block: B:21:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    @Override // defpackage.afyi
    public final void c(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, boolean z, boolean z2) {
        float f2;
        float fWidth = rect.width();
        float fJ = j();
        float fHeight = rect.height();
        float fJ2 = j();
        defpackage.afxz afxzVar = (defpackage.afxz) this.a;
        int i = afxzVar.r;
        float f3 = (i / 2.0f) + afxzVar.s;
        float f4 = fWidth / fJ;
        float f5 = fHeight / fJ2;
        canvas.translate((f3 * f4) + rect.left, (f3 * f5) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(f4, f5);
        if (afxzVar.t != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f6 = -f3;
        canvas.clipRect(f6, f6, f3, f3);
        int i2 = afxzVar.a;
        float f7 = i2;
        this.f = f7 * f;
        this.g = java.lang.Math.min(i2 / 2, afxzVar.a()) * f;
        this.h = afxzVar.l * f;
        float f8 = (i - i2) / 2.0f;
        this.i = f8;
        boolean z3 = true;
        if (z) {
            f2 = ((1.0f - f) * f7) / 2.0f;
            if ((z || afxzVar.g != 2) && !(z2 && afxzVar.h == 1)) {
                if (!z && afxzVar.g == 1) {
                    z3 = z2;
                } else if (z2 && afxzVar.h == 2) {
                }
                this.i = f8 - f2;
                z2 = z3;
            } else {
                this.i = f8 + f2;
            }
            if (z2 || afxzVar.h != 3) {
                f = 1.0f;
            }
        } else if (z2) {
            z2 = true;
            f2 = ((1.0f - f) * f7) / 2.0f;
            if (z) {
                if (!z) {
                    if (z2) {
                        this.i = f8 - f2;
                        z2 = z3;
                    }
                } else if (z2) {
                    this.i = f8 - f2;
                    z2 = z3;
                }
            } else if (!z) {
                if (z2) {
                    this.i = f8 - f2;
                    z2 = z3;
                }
            } else if (z2) {
                this.i = f8 - f2;
                z2 = z3;
            }
            if (z2) {
                f = 1.0f;
            } else {
                f = 1.0f;
            }
        } else {
            f = 1.0f;
        }
        this.o = f;
    }

    @Override // defpackage.afyi
    public final void e(android.graphics.Canvas canvas, android.graphics.Paint paint, defpackage.afyg afygVar, int i) {
        int iW = agab.W(afygVar.c, i);
        canvas.save();
        canvas.rotate(afygVar.g);
        this.n = afygVar.h;
        float f = afygVar.a;
        float f2 = afygVar.b;
        int i2 = afygVar.d;
        k(canvas, paint, f, f2, iW, i2, i2, afygVar.e, afygVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.afyi
    public final void f(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i, int i2, int i3) {
        int iW = agab.W(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, iW, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.afyi
    public final void g() {
        android.graphics.Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        android.graphics.Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        defpackage.afxz afxzVar = (defpackage.afxz) this.a;
        if (afxzVar.c(this.n)) {
            android.graphics.PathMeasure pathMeasure = this.d;
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int iMax = java.lang.Math.max(3, (int) ((length / (this.n ? afxzVar.j : afxzVar.k)) / 2.0f)) << 1;
            this.j = length / iMax;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < iMax; i2++) {
                defpackage.afyh afyhVar = new defpackage.afyh(this);
                float f3 = i2;
                pathMeasure.getPosTan(this.j * f3, (float[]) afyhVar.a, (float[]) afyhVar.b);
                defpackage.afyh afyhVar2 = new defpackage.afyh(this);
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), (float[]) afyhVar2.a, (float[]) afyhVar2.b);
                arrayList.add(afyhVar);
                afyhVar2.a(f2 + f2);
                arrayList.add(afyhVar2);
            }
            arrayList.add((defpackage.afyh) arrayList.get(0));
            defpackage.afyh afyhVar3 = (defpackage.afyh) arrayList.get(0);
            float[] fArr = (float[]) afyhVar3.a;
            path.moveTo(fArr[0], fArr[1]);
            int i3 = 1;
            while (i3 < arrayList.size()) {
                defpackage.afyh afyhVar4 = (defpackage.afyh) arrayList.get(i3);
                float f5 = this.j / 2.0f;
                defpackage.afyh afyhVar5 = new defpackage.afyh(this, afyhVar3);
                defpackage.afyh afyhVar6 = new defpackage.afyh(this, afyhVar4);
                float f6 = f5 * 0.48f;
                afyhVar5.b(f6);
                afyhVar6.b(-f6);
                float[] fArr2 = (float[]) afyhVar5.a;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = (float[]) afyhVar6.a;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = (float[]) afyhVar4.a;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i3++;
                afyhVar3 = afyhVar4;
            }
        }
        this.d.setPath(path, false);
    }

    @Override // defpackage.afyi
    public final void d(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2) {
    }
}
