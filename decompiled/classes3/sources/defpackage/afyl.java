package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afyl extends defpackage.afyi {
    final android.util.Pair f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private float o;

    public afyl(defpackage.afyt afytVar) {
        super(afytVar);
        this.g = 300.0f;
        this.f = new android.util.Pair(new defpackage.afyh(this), new defpackage.afyh(this));
    }

    private final void j(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        android.graphics.Canvas canvas2;
        android.util.Pair pair;
        float f7 = 1.0f - this.o;
        float fA = dzk.A(f, 0.0f, 1.0f);
        float f8 = ((1.0f - fA) * f7) + fA;
        float f9 = this.g;
        float f10 = f8 * f9;
        float fA2 = dzk.A(f2, 0.0f, 1.0f);
        float f11 = ((1.0f - fA2) * f7) + fA2;
        float f12 = this.i;
        float f13 = this.j;
        float fA3 = (f9 * f11) - ((int) ((i3 * (1.0f - dzk.A(f11, 0.99f, 1.0f))) / 0.01f));
        int iA = (int) (f10 + ((int) ((i2 * dzk.A(f8, 0.0f, 0.01f)) / 0.01f)));
        int i4 = (int) fA3;
        if (f12 != f13) {
            float fMax = java.lang.Math.max(f12, f13);
            float f14 = this.g;
            float f15 = fMax / f14;
            float f16 = this.i;
            float f17 = this.j;
            float fA4 = dzk.A(iA / f14, 0.0f, f15) / f15;
            float fA5 = dzk.A((f14 - i4) / f14, 0.0f, f15) / f15;
            float f18 = ((1.0f - fA5) * f16) + (fA5 * f17);
            f5 = ((1.0f - fA4) * f16) + (fA4 * f17);
            f6 = f18;
        } else {
            f5 = f12;
            f6 = f5;
        }
        float f19 = -this.g;
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        boolean z2 = afytVar.c(this.n) && z && f3 > 0.0f;
        if (iA <= i4) {
            float f20 = f19 / 2.0f;
            float f21 = iA + f5;
            float f22 = i4 - f6;
            float f23 = f5 + f5;
            boolean z3 = z2;
            float f24 = f6 + f6;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            android.util.Pair pair2 = this.f;
            ((defpackage.afyh) pair2.first).c();
            ((defpackage.afyh) pair2.second).c();
            ((defpackage.afyh) pair2.first).f(f21 + f20);
            ((defpackage.afyh) pair2.second).f(f20 + f22);
            if (iA == 0 && f22 + f6 < f21 + f5) {
                k(canvas, paint, (defpackage.afyh) pair2.first, f23, this.h, f5, (defpackage.afyh) pair2.second, f24, this.h, f6, true);
                return;
            }
            if (f21 - f5 > f22 - f6) {
                k(canvas, paint, (defpackage.afyh) pair2.second, f24, this.h, f6, (defpackage.afyh) pair2.first, f23, this.h, f5, false);
                return;
            }
            float f25 = f6;
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeCap(afytVar.f() ? android.graphics.Paint.Cap.ROUND : android.graphics.Paint.Cap.BUTT);
            if (z3) {
                android.graphics.PathMeasure pathMeasure = this.d;
                android.graphics.Path path = this.c;
                float f26 = this.g;
                float f27 = f21 / f26;
                float f28 = f22 / f26;
                int i5 = this.n ? afytVar.j : afytVar.k;
                if (i5 != this.m) {
                    this.m = i5;
                    g();
                }
                path.rewind();
                float f29 = (-this.g) / 2.0f;
                boolean zC = afytVar.c(this.n);
                if (zC) {
                    float f30 = this.g;
                    float f31 = this.l;
                    float f32 = f30 / f31;
                    float f33 = f4 / f32;
                    f29 -= f31 * f4;
                    float f34 = f32 / (f32 + 1.0f);
                    f28 = (f28 + f33) * f34;
                    f27 = (f27 + f33) * f34;
                }
                float length = f27 * pathMeasure.getLength();
                float length2 = f28 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                defpackage.afyh afyhVar = (defpackage.afyh) pair2.first;
                afyhVar.c();
                pathMeasure.getPosTan(length, (float[]) afyhVar.a, (float[]) afyhVar.b);
                defpackage.afyh afyhVar2 = (defpackage.afyh) pair2.second;
                afyhVar2.c();
                pathMeasure.getPosTan(length2, (float[]) afyhVar2.a, (float[]) afyhVar2.b);
                android.graphics.Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f29, 0.0f);
                afyhVar.f(f29);
                afyhVar2.f(f29);
                if (zC) {
                    float f35 = this.k * f3;
                    matrix.postScale(1.0f, f35);
                    afyhVar.e(f35);
                    afyhVar2.e(f35);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                canvas.drawLine(((float[]) ((defpackage.afyh) pair2.first).a)[0], ((float[]) ((defpackage.afyh) pair2.first).a)[1], ((float[]) ((defpackage.afyh) pair2.second).a)[0], ((float[]) ((defpackage.afyh) pair2.second).a)[1], paint);
                canvas2 = canvas;
                f23 = f23;
            }
            if (afytVar.f()) {
                return;
            }
            if (f21 <= 0.0f || f5 <= 0.0f) {
                pair = pair2;
            } else {
                pair = pair2;
                k(canvas2, paint, (defpackage.afyh) pair2.first, f23, this.h, f5, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f22 >= this.g || f25 <= 0.0f) {
                return;
            }
            k(canvas, paint, (defpackage.afyh) pair.second, f24, this.h, f25, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    private final void k(android.graphics.Canvas canvas, android.graphics.Paint paint, defpackage.afyh afyhVar, float f, float f2, float f3, defpackage.afyh afyhVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float fMin = java.lang.Math.min(f2, this.h);
        float f9 = -fMin;
        float f10 = fMin / 2.0f;
        float f11 = (-f) / 2.0f;
        float f12 = f9 / 2.0f;
        float f13 = f / 2.0f;
        android.graphics.RectF rectF = new android.graphics.RectF(f11, f12, f13, f10);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.save();
        if (afyhVar2 != null) {
            float fMin2 = java.lang.Math.min(f5, this.h);
            float fMin3 = java.lang.Math.min(f4 / 2.0f, (f6 * fMin2) / this.h);
            android.graphics.RectF rectF2 = new android.graphics.RectF();
            if (z) {
                c = 1;
                float f14 = (((float[]) afyhVar2.a)[0] - fMin3) - (((float[]) afyhVar.a)[0] - f3);
                if (f14 > 0.0f) {
                    afyhVar2.f((-f14) / 2.0f);
                    f8 = f4 + f14;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f12, f13, f10);
            } else {
                c = 1;
                float f15 = (((float[]) afyhVar2.a)[0] + fMin3) - (((float[]) afyhVar.a)[0] + f3);
                if (f15 < 0.0f) {
                    afyhVar2.f((-f15) / 2.0f);
                    f7 = f4 - f15;
                } else {
                    f7 = f4;
                }
                rectF2.set(f11, f12, 0.0f, f10);
                f8 = f7;
            }
            android.graphics.RectF rectF3 = new android.graphics.RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            float[] fArr = (float[]) afyhVar2.a;
            canvas.translate(fArr[0], fArr[c]);
            canvas.rotate(i((float[]) afyhVar2.b));
            android.graphics.Path path = new android.graphics.Path();
            path.addRoundRect(rectF3, fMin3, fMin3, android.graphics.Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i((float[]) afyhVar2.b));
            float[] fArr2 = (float[]) afyhVar2.a;
            canvas.translate(-fArr2[0], -fArr2[c]);
            float[] fArr3 = (float[]) afyhVar.a;
            canvas.translate(fArr3[0], fArr3[c]);
            canvas.rotate(i((float[]) afyhVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = (float[]) afyhVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i((float[]) afyhVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.afyi
    public final int a() {
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        return afytVar.a + (afytVar.l << 1);
    }

    @Override // defpackage.afyi
    public final int b() {
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    @Override // defpackage.afyi
    public final void c(android.graphics.Canvas canvas, android.graphics.Rect rect, float f, boolean z, boolean z2) {
        if (this.g != rect.width()) {
            this.g = rect.width();
            g();
        }
        float fA = a();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + java.lang.Math.max(0.0f, (rect.height() - fA) / 2.0f));
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        if (afytVar.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.g / 2.0f;
        float f3 = fA / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        int i = afytVar.a;
        float f4 = i;
        this.h = f4 * f;
        this.i = java.lang.Math.min(i / 2, afytVar.a()) * f;
        this.k = afytVar.l * f;
        this.j = java.lang.Math.min(f4 / 2.0f, afytVar.g()) * f;
        if (z) {
            if ((z && afytVar.g == 2) || (z2 && afytVar.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || afytVar.h != 3) {
                canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
            }
            if (z2 || afytVar.h != 3) {
                f = 1.0f;
            }
        } else if (z2) {
            z2 = true;
            if (z) {
                canvas.scale(1.0f, -1.0f);
            } else {
                canvas.scale(1.0f, -1.0f);
            }
            if (z) {
                canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
            } else {
                canvas.translate(0.0f, (f4 * (1.0f - f)) / 2.0f);
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
    public final void d(android.graphics.Canvas canvas, android.graphics.Paint paint, int i, int i2) {
        int iW = agab.W(i, i2);
        this.n = false;
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        int i3 = afytVar.t;
        int iMin = java.lang.Math.min(i3, afytVar.a);
        if (iMin <= 0 || iW == 0) {
            return;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(iW);
        java.lang.Integer num = afytVar.u;
        float f = iMin;
        k(canvas, paint, new defpackage.afyh(this, new float[]{(this.g / 2.0f) - (num != null ? num.floatValue() + (i3 / 2.0f) : this.h / 2.0f), 0.0f}, new float[]{1.0f, 0.0f}), f, f, (this.i * f) / this.h, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // defpackage.afyi
    public final void e(android.graphics.Canvas canvas, android.graphics.Paint paint, defpackage.afyg afygVar, int i) {
        int iW = agab.W(afygVar.c, i);
        this.n = afygVar.h;
        float f = afygVar.a;
        float f2 = afygVar.b;
        int i2 = afygVar.d;
        j(canvas, paint, f, f2, iW, i2, i2, afygVar.e, afygVar.f, true);
    }

    @Override // defpackage.afyi
    public final void f(android.graphics.Canvas canvas, android.graphics.Paint paint, float f, float f2, int i, int i2, int i3) {
        int iW = agab.W(i, i2);
        this.n = false;
        j(canvas, paint, f, f2, iW, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.afyi
    public final void g() {
        android.graphics.Path path = this.b;
        path.rewind();
        defpackage.afyt afytVar = (defpackage.afyt) this.a;
        if (afytVar.c(this.n)) {
            int i = this.n ? afytVar.j : afytVar.k;
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 << 1;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                path.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            android.graphics.Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.l / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.g, 0.0f);
        }
        this.d.setPath(path, false);
    }
}
