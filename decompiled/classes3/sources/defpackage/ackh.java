package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ackh extends android.view.ViewGroup {
    private final int[] A;
    private final android.graphics.Point B;
    private final int C;
    private final android.graphics.Shader D;
    private final android.graphics.Shader E;
    private final android.graphics.Shader F;
    private final android.graphics.Shader G;
    private final android.graphics.Shader H;
    private final android.graphics.Shader I;
    private final android.graphics.Shader J;
    private final float K;
    private final float L;
    private final float M;
    private final float N;
    private final float O;
    private final float P;
    private final float Q;
    private final float R;
    private final float S;
    private final float T;
    private final float U;
    private final float V;
    private final float W;
    public final android.graphics.Rect a;
    private int aa;
    private int ab;
    private int ac;
    boolean b;
    public android.widget.PopupWindow c;
    public boolean d;
    public android.view.View e;
    public android.view.View f;
    public float g;
    public int h;
    public int i;
    public android.view.View.OnClickListener j;
    public android.view.View.OnClickListener k;
    private final android.graphics.Path l;
    private final android.graphics.RectF m;
    private final android.graphics.Paint n;
    private final android.graphics.Paint o;
    private final android.graphics.RectF p;
    private final android.graphics.RectF q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public ackh(android.content.Context context) {
        super(context);
        this.a = new android.graphics.Rect();
        this.A = new int[2];
        this.B = new android.graphics.Point();
        this.ab = 3;
        this.g = 1.0f;
        this.h = 0;
        this.i = 0;
        this.ac = 1;
        setId(2131429300);
        setWillNotDraw(false);
        this.l = new android.graphics.Path();
        this.m = new android.graphics.RectF();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.n = paint;
        this.p = new android.graphics.RectF();
        this.q = new android.graphics.RectF();
        android.graphics.Paint paint2 = new android.graphics.Paint(4);
        this.o = paint2;
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(defpackage.ackg.a);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, aesg.l(displayMetrics, 0));
        this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, aesg.l(displayMetrics, true != anfq.f() ? 8 : 2));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, aesg.l(displayMetrics, 16));
        this.t = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, aesg.l(displayMetrics, 24));
        this.w = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, aesg.l(displayMetrics, 4));
        this.C = dimensionPixelSize3;
        int iL = aesg.l(displayMetrics, 4);
        this.u = iL;
        int iL2 = aesg.l(displayMetrics, 4);
        this.v = iL2;
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, aesg.l(displayMetrics, true != anfq.f() ? 24 : 8));
        this.x = dimensionPixelSize4;
        this.z = aesg.l(displayMetrics, 30);
        int color = typedArrayObtainStyledAttributes.getColor(2, -16033840);
        int color2 = typedArrayObtainStyledAttributes.getColor(6, 1075847200);
        this.y = color2;
        typedArrayObtainStyledAttributes.recycle();
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        b(color);
        int iH = dwm.h(color2, 68);
        int iH2 = dwm.h(color2, 20);
        int iH3 = dwm.h(color2, 0);
        this.D = new android.graphics.LinearGradient(0.0f, 0.0f, 0.0f, dimensionPixelSize3, new int[]{iH, iH2, iH3}, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        this.E = new android.graphics.LinearGradient(0.0f, 0.0f, dimensionPixelSize3, 0.0f, new int[]{iH, iH2, iH3}, (float[]) null, android.graphics.Shader.TileMode.CLAMP);
        float f = dimensionPixelSize4 + dimensionPixelSize3;
        float fE = e(f);
        this.F = new android.graphics.RadialGradient(f, f, f, new int[]{0, 0, iH, iH2, iH3}, new float[]{0.0f, fE, fE, ((1.0f - fE) / 2.0f) + fE, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
        float f2 = dimensionPixelSize - iL;
        this.K = f2;
        float f3 = dimensionPixelSize2;
        float f4 = (f3 * f2) / (dimensionPixelSize << 1);
        this.L = f4;
        float f5 = f3 - (f4 + f4);
        this.M = f5;
        float degrees = (float) java.lang.Math.toDegrees(java.lang.Math.atan(f2 / f4));
        this.N = degrees;
        float f6 = f4 * 0.15f;
        float fK = k((float) java.lang.Math.hypot(f6 + f6, f2 * 0.15f), degrees);
        this.T = fK;
        float fE2 = e(fK);
        this.G = new android.graphics.RadialGradient(fK, fK, fK, new int[]{0, iH3, iH2, iH}, new float[]{0.0f, fE2, ((1.0f - fE2) / 2.0f) + fE2, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
        float fK2 = k(f5, degrees + degrees) + dimensionPixelSize3;
        this.U = fK2;
        float fE3 = e(fK2);
        this.H = new android.graphics.RadialGradient(fK2, fK2, fK2, new int[]{0, 0, iH, iH2, iH3}, new float[]{0.0f, fE3, fE3, ((1.0f - fE3) / 2.0f) + fE3, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
        float f7 = dimensionPixelSize - iL2;
        this.O = f7;
        float f8 = dimensionPixelSize2;
        float f9 = dimensionPixelSize;
        float f10 = ((f9 - f7) * f8) / f9;
        this.P = f10;
        float f11 = f8 - f10;
        this.R = f11;
        float degrees2 = (float) java.lang.Math.toDegrees(java.lang.Math.atan(f7 / f11));
        this.S = degrees2;
        float f12 = f11 * 0.05f;
        float fK3 = k((float) java.lang.Math.hypot(f12 + f12, f7 * 0.05f), degrees2);
        this.V = fK3;
        float fE4 = e(fK3);
        this.I = new android.graphics.RadialGradient(fK3, fK3, fK3, new int[]{0, iH3, iH2, iH}, new float[]{0.0f, fE4, ((1.0f - fE4) / 2.0f) + fE4, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
        float f13 = dimensionPixelSize;
        float f14 = iL2;
        float f15 = dimensionPixelSize2 * ((f13 - (f13 - (0.7f * f14))) / f13);
        this.Q = f15;
        float fK4 = k((float) java.lang.Math.hypot(f15, f14 * 0.3f), degrees2 + 90.0f) + dimensionPixelSize3;
        this.W = fK4;
        float fE5 = e(fK4);
        this.J = new android.graphics.RadialGradient(fK4, fK4, fK4, new int[]{0, 0, iH, iH2, iH3}, new float[]{0.0f, fE5, fE5, ((1.0f - fE5) / 2.0f) + fE5, 1.0f}, android.graphics.Shader.TileMode.CLAMP);
        this.d = true;
    }

    private final float e(float f) {
        return 1.0f - (this.C / f);
    }

    private final int f() {
        android.graphics.Rect rect = this.a;
        int iWidth = rect.width() / 2;
        int i = dzs.a;
        if (getLayoutDirection() == 1) {
            iWidth = rect.width() - iWidth;
        }
        return iWidth + rect.left;
    }

    private final int g() {
        return (int) (this.h + this.m.width());
    }

    private static int h(int i, int i2, int i3) {
        return java.lang.Math.min(i3, java.lang.Math.max(i2, i));
    }

    private final void i(android.graphics.Canvas canvas, int i) {
        if (i != 0) {
            canvas.save();
            android.graphics.RectF rectF = this.p;
            canvas.rotate(i, rectF.centerX(), rectF.centerY());
        }
        canvas.drawRect(this.p, this.o);
        if (i != 0) {
            canvas.restore();
        }
    }

    private final void j(android.graphics.Point point) {
        ((android.view.WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private static final float k(float f, float f2) {
        return (float) (((double) (f / 2.0f)) / java.lang.Math.sin(java.lang.Math.toRadians(f2 / 2.0f)));
    }

    public final void a(android.graphics.Rect rect) {
        this.a.set(rect);
    }

    public final void b(int i) {
        this.n.setColor(i);
    }

    public final void c() {
        int iHeight;
        android.graphics.Point point = this.B;
        j(point);
        int i = point.x;
        int i2 = point.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.ac = 1;
        int i3 = this.ab;
        if (i3 == 1) {
            iHeight = (-measuredHeight) - this.s;
        } else if (i3 == 2) {
            android.graphics.Rect rect = this.a;
            iHeight = rect.height() + this.s;
        } else {
            iHeight = 0;
        }
        android.graphics.Rect rect2 = this.a;
        int iWidth = rect2.left + ((rect2.width() - measuredWidth) / 2);
        int i4 = rect2.top + iHeight;
        int i5 = this.s;
        this.h = h(iWidth, i5, (i - i5) - measuredWidth);
        this.i = h(i4, i5, (i2 - i5) - measuredHeight);
        int iF = f();
        int i6 = this.w / 2;
        int i7 = iF - i6;
        int i8 = i6 + iF;
        int i9 = this.h;
        int i10 = i7 - i9;
        int i11 = this.C;
        int i12 = i9 + measuredWidth;
        int i13 = this.z;
        if (i10 + i11 < i13) {
            this.h = iF - i11;
            this.ac = 2;
        } else if ((i12 + i11) - i8 < i13) {
            this.h = (iF - measuredWidth) - i11;
            this.ac = 3;
        }
    }

    public final void d(android.view.View view, android.graphics.Rect rect, int i) {
        this.f = view;
        a(rect);
        this.aa = i;
        this.ab = 3;
        this.b = true;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.RectF rectF;
        float f;
        android.graphics.RectF rectF2;
        float f2;
        float f3;
        float f4;
        float f5;
        float fSin;
        float f6;
        float f7;
        canvas.save();
        android.graphics.Paint paint = this.o;
        paint.setShader(this.F);
        int i = this.C;
        int i2 = this.x;
        float f8 = i + i2;
        float f9 = f8 + f8;
        android.graphics.RectF rectF3 = this.p;
        float f10 = 0.0f;
        rectF3.set(0.0f, 0.0f, f9, f9);
        canvas.save();
        if (this.ab == 2) {
            canvas.translate(0.0f, this.t);
        }
        boolean z = this.ab == 1;
        int i3 = this.ac;
        boolean z2 = i3 == 2;
        boolean z3 = i3 == 3;
        if (z || !z2) {
            rectF = rectF3;
            canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        } else {
            rectF = rectF3;
        }
        android.graphics.RectF rectF4 = this.m;
        float f11 = i2 << 1;
        canvas.translate(rectF4.width() - f11, 0.0f);
        if (z || !z3) {
            f = f11;
            rectF2 = rectF4;
            canvas.drawArc(rectF, 270.0f, 90.0f, true, paint);
        } else {
            rectF2 = rectF4;
            f = f11;
        }
        canvas.translate(0.0f, rectF2.height() - f);
        if (!z || !z3) {
            canvas.drawArc(rectF, 0.0f, 90.0f, true, paint);
        }
        canvas.translate(-(rectF2.width() - f), 0.0f);
        if (!z || !z2) {
            canvas.drawArc(rectF, 90.0f, 90.0f, true, paint);
        }
        android.graphics.RectF rectF5 = rectF;
        canvas.restore();
        android.graphics.Shader shader = this.D;
        paint.setShader(shader);
        float f12 = i;
        rectF5.set(0.0f, 0.0f, rectF2.width() - f, f12);
        canvas.save();
        if (this.ab == 2) {
            canvas.translate(0.0f, this.t);
        }
        if (this.ab != 2) {
            canvas.save();
            canvas.translate(f8, 0.0f);
            i(canvas, 180);
            canvas.restore();
        }
        if (this.ab != 1) {
            canvas.save();
            canvas.translate(f8, rectF2.height() + f12);
            i(canvas, 0);
            canvas.restore();
        }
        android.graphics.Shader shader2 = this.E;
        paint.setShader(shader2);
        rectF5.set(0.0f, 0.0f, f12, rectF2.height() - f);
        canvas.save();
        canvas.translate(0.0f, f8);
        i(canvas, 180);
        canvas.translate(rectF2.width() + f12, 0.0f);
        i(canvas, 0);
        canvas.restore();
        canvas.restore();
        int i4 = this.ac;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        float f13 = i2;
        if (i5 == 0) {
            f2 = f12;
            f3 = f13;
            int i6 = 0;
            int i7 = this.ab;
            float f14 = f();
            canvas.save();
            boolean z4 = i7 == 1;
            canvas.translate(f8, z4 ? rectF2.height() + f2 : this.t);
            float f15 = f14 - this.h;
            int i8 = this.w;
            float f16 = this.L;
            float f17 = i8 / 2.0f;
            float f18 = f16 * 0.15f;
            rectF5.set(0.0f, 0.0f, (((f15 - f2) - f17) - f3) - f18, f2);
            paint.setShader(shader);
            if (true != z4) {
                i6 = 180;
            }
            i(canvas, i6);
            float fWidth = rectF5.width();
            float f19 = this.T;
            float f20 = fWidth - f19;
            if (z4) {
                f4 = 0.0f;
            } else {
                float f21 = -f19;
                f4 = f21 + f21 + f2;
            }
            canvas.translate(f20, f4);
            android.graphics.Shader shader3 = this.G;
            paint.setShader(shader3);
            int i9 = i6;
            android.graphics.RectF rectF6 = this.q;
            float f22 = f19 + f19;
            rectF6.set(0.0f, 0.0f, f22, f22);
            float f23 = z4 ? 270.0f : 90.0f - this.N;
            float f24 = this.N;
            float f25 = 90.0f - f24;
            boolean z5 = z4;
            canvas.drawArc(rectF6, f23, f24, true, paint);
            if (!z5) {
                canvas.translate(0.0f, f22);
            }
            int i10 = i7 == 1 ? 1 : -1;
            float f26 = this.K;
            float f27 = i10;
            canvas.translate(f18 + f18 + f19, f27 * f26 * 0.15f);
            float f28 = f27 * f24;
            canvas.rotate(f28);
            if (!z5) {
                canvas.translate(0.0f, -i);
            }
            float f29 = f16 * 0.85f;
            float f30 = 0.85f * f26;
            rectF5.right = (float) java.lang.Math.hypot(f29, f30);
            paint.setShader(shader);
            i(canvas, i9);
            if (!z5) {
                canvas.translate(0.0f, f2);
            }
            float f31 = this.U;
            float f32 = f31 - f2;
            float f33 = this.M;
            float f34 = f33 / 2.0f;
            if (z5) {
                f5 = f31;
                fSin = f5 + ((float) (java.lang.Math.sin(java.lang.Math.toRadians(f25)) * ((double) f32)));
            } else {
                f5 = f31;
                fSin = f5 - ((float) (java.lang.Math.sin(java.lang.Math.toRadians(f25)) * ((double) f32)));
            }
            float f35 = fSin;
            float f36 = f5 - f34;
            float f37 = f27 * (-f24);
            canvas.rotate(f37);
            canvas.translate(f29 - f36, z5 ? f30 - f35 : (-f30) - f35);
            paint.setShader(this.H);
            float f38 = f5 + f5;
            rectF6.set(0.0f, 0.0f, f38, f38);
            canvas.drawArc(rectF6, (true != z5 ? 270 : 90) - f24, f24 + f24, true, paint);
            canvas.translate(f33 + f36, f35);
            canvas.rotate(f37);
            if (z5) {
                f6 = 0.0f;
            } else {
                f6 = 0.0f;
                canvas.translate(0.0f, -i);
            }
            paint.setShader(shader);
            i(canvas, i9);
            if (!z5) {
                canvas.translate(f6, f2);
            }
            canvas.rotate(f28);
            canvas.translate((f16 * 1.15f) - f19, f27 * (-f26));
            if (z5) {
                f7 = 0.0f;
            } else {
                float f39 = -f19;
                f7 = 0.0f;
                canvas.translate(0.0f, f39 + f39);
            }
            paint.setShader(shader3);
            rectF6.set(f7, f7, f22, f22);
            canvas.drawArc(rectF6, z5 ? 270.0f - f24 : 90.0f, f24, true, paint);
            rectF5.right = (((rectF2.width() - f3) - ((f14 - this.h) - f2)) - f17) - f18;
            canvas.translate(f19, z5 ? 0.0f : f22 - f2);
            paint.setShader(shader);
            canvas.save();
            i(canvas, i9);
            canvas.restore();
            canvas.restore();
        } else if (i5 == 1) {
            int i11 = 0;
            f2 = f12;
            f3 = f13;
            int i12 = this.ab;
            int i13 = this.h;
            canvas.save();
            int i14 = (i13 - this.h) + i;
            int i15 = this.w;
            float f40 = this.R;
            boolean z6 = i12 == 1;
            float f41 = f40 * 0.05f;
            canvas.translate(i14 + i15 + f41, z6 ? rectF2.height() + f2 : this.t);
            rectF5.set(0.0f, 0.0f, ((rectF2.width() - i15) - f3) - f41, f2);
            paint.setShader(shader);
            if (true != z6) {
                i11 = 180;
            }
            i(canvas, i11);
            float f42 = this.V;
            float f43 = -f42;
            canvas.translate(f43, z6 ? 0.0f : f43 + f43 + f2);
            paint.setShader(this.I);
            int i16 = i11;
            android.graphics.RectF rectF7 = this.q;
            float f44 = f42 + f42;
            rectF7.set(0.0f, 0.0f, f44, f44);
            float f45 = z6 ? 270.0f - this.S : 90.0f;
            float f46 = this.S;
            canvas.drawArc(rectF7, f45, f46, true, paint);
            if (!z6) {
                canvas.translate(0.0f, f44);
            }
            int i17 = i12 == 1 ? 1 : -1;
            float f47 = this.P;
            float f48 = this.O;
            int i18 = this.v;
            float f49 = i17;
            float f50 = f49 * f48 * 0.05f;
            float f51 = f42 - (f41 + f41);
            float f52 = (0.95f * f48) + (i18 * 0.3f);
            float f53 = (f40 * 0.95f) + (f47 * 0.3f);
            int i19 = i17;
            canvas.translate(f51 - f53, f50 + (f49 * f52));
            canvas.rotate((-f46) * f49);
            if (!z6) {
                canvas.translate(0.0f, -i);
            }
            rectF5.right = (float) java.lang.Math.hypot(f53, f52);
            paint.setShader(shader);
            i(canvas, i16);
            if (!z6) {
                canvas.translate(0.0f, f2);
            }
            float f54 = this.W;
            double d = 90.0f - f46;
            double d2 = f54 - f2;
            double dCos = java.lang.Math.cos(java.lang.Math.toRadians(d)) * d2;
            float fSin2 = z6 ? ((float) (java.lang.Math.sin(java.lang.Math.toRadians(d)) * d2)) + f54 : f54 - ((float) (java.lang.Math.sin(java.lang.Math.toRadians(d)) * d2));
            canvas.rotate(f49 * f46);
            float f55 = f54 + f54;
            float f56 = (float) (((double) f54) - dCos);
            canvas.translate(f56 - f55, -fSin2);
            float f57 = f46 + 90.0f;
            paint.setShader(this.J);
            rectF7.set(0.0f, 0.0f, f55, f55);
            canvas.drawArc(rectF7, 180.0f - (true != z6 ? 0.0f : f57), f57, true, paint);
            canvas.translate(((f55 - f56) - this.Q) - f2, fSin2 - ((i19 * i18) * 0.3f));
            rectF5.set(0.0f, 0.0f, f2, f48 + f3);
            if (z6) {
                canvas.translate(0.0f, -rectF5.height());
            }
            paint.setShader(shader2);
            i(canvas, 180);
            canvas.restore();
        } else if (i5 != 2) {
            f2 = f12;
            f3 = f13;
        } else {
            int i20 = this.ab;
            int iG = g();
            canvas.save();
            boolean z7 = i20 == 1;
            canvas.translate(f8, z7 ? f12 + rectF2.height() : this.t);
            int i21 = iG - this.h;
            int i22 = this.w;
            float f58 = this.R;
            float f59 = (i21 - i22) - i2;
            float f60 = f58 * 0.05f;
            rectF5.set(0.0f, 0.0f, f59 - f60, f12);
            paint.setShader(shader);
            int i23 = true != z7 ? 180 : 0;
            i(canvas, i23);
            float fWidth2 = rectF5.width();
            float f61 = this.V;
            float f62 = fWidth2 - f61;
            if (!z7) {
                float f63 = -f61;
                f10 = f63 + f63 + f12;
            }
            canvas.translate(f62, f10);
            paint.setShader(this.I);
            android.graphics.RectF rectF8 = this.q;
            float f64 = f61 + f61;
            rectF8.set(0.0f, 0.0f, f64, f64);
            float f65 = z7 ? 270.0f : 90.0f - this.S;
            float f66 = this.S;
            f2 = f12;
            f3 = f13;
            boolean z8 = z7;
            canvas.drawArc(rectF8, f65, f66, true, paint);
            if (!z8) {
                canvas.translate(0.0f, f64);
            }
            int i24 = i20 == 1 ? 1 : -1;
            float f67 = this.O;
            float f68 = i24;
            canvas.translate(f60 + f60 + f61, f68 * f67 * 0.05f);
            canvas.rotate(f68 * f66);
            if (!z8) {
                canvas.translate(0.0f, -i);
            }
            float f69 = this.P;
            int i25 = this.v;
            float f70 = (0.95f * f67) + (i25 * 0.3f);
            float f71 = (f58 * 0.95f) + (f69 * 0.3f);
            int i26 = i24;
            rectF5.right = (float) java.lang.Math.hypot(f71, f70);
            paint.setShader(shader);
            i(canvas, i23);
            if (!z8) {
                canvas.translate(0.0f, f2);
            }
            float f72 = this.W;
            double d3 = 90.0f - f66;
            double dCos2 = java.lang.Math.cos(java.lang.Math.toRadians(d3));
            double d4 = f72 - f2;
            double d5 = dCos2 * d4;
            float fSin3 = z8 ? ((float) (d4 * java.lang.Math.sin(java.lang.Math.toRadians(d3)))) + f72 : f72 - ((float) (d4 * java.lang.Math.sin(java.lang.Math.toRadians(d3))));
            canvas.rotate((-f66) * f68);
            float f73 = (float) (((double) f72) - d5);
            canvas.translate(f71 - f73, (f70 * f68) - fSin3);
            float f74 = f66 + 90.0f;
            paint.setShader(this.J);
            float f75 = f72 + f72;
            rectF8.set(0.0f, 0.0f, f75, f75);
            canvas.drawArc(rectF8, z8 ? 0.0f : 270.0f - f66, f74, true, paint);
            canvas.translate(f73 + this.Q, fSin3 - ((i26 * i25) * 0.3f));
            rectF5.set(0.0f, 0.0f, f2, f67 + f3);
            if (z8) {
                canvas.translate(0.0f, -rectF5.height());
            }
            paint.setShader(shader2);
            i(canvas, 0);
            canvas.restore();
        }
        canvas.translate(f2, f2);
        canvas.save();
        canvas.translate(this.s - this.h, 0.0f);
        android.graphics.Path path = this.l;
        android.graphics.Paint paint2 = this.n;
        canvas.drawPath(path, paint2);
        canvas.restore();
        float f76 = f3;
        canvas.drawRoundRect(rectF2, f76, f76, paint2);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        android.view.View view = this.e;
        int i6 = this.ab;
        if (i6 == 2) {
            i5 = this.t;
            i6 = 2;
        } else {
            i5 = 0;
        }
        int i7 = this.r;
        int i8 = this.C;
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int i11 = i6 == 1 ? this.t : 0;
        int i12 = i8 + i7;
        view.layout(i12, i5 + i12, i9 - i7, (i10 - i7) - i11);
        c();
        this.c.update(this.h, this.i, getMeasuredWidth(), getMeasuredHeight(), true);
        int i13 = this.ac;
        if (i13 == 1) {
            int iF = f();
            android.graphics.Path path = this.l;
            path.reset();
            int i14 = this.ab;
            if (i14 == 1) {
                int i15 = iF - this.s;
                int i16 = this.w;
                path.moveTo((i15 - i8) - (i16 / 2), this.m.bottom);
                path.rLineTo(i16, 0.0f);
                float f = -this.L;
                float f2 = this.K;
                path.rLineTo(f, f2);
                float f3 = this.M;
                float f4 = -f3;
                path.rQuadTo(f4 / 2.0f, f3 / 2.0f, f4, 0.0f);
                path.rLineTo(f, -f2);
                path.close();
                return;
            }
            if (i14 == 2) {
                int i17 = iF - this.s;
                int i18 = this.w;
                path.moveTo((i17 - i8) + (i18 / 2), this.m.top);
                path.rLineTo(-i18, 0.0f);
                float f5 = this.L;
                float f6 = this.K;
                path.rLineTo(f5, -f6);
                float f7 = this.M;
                path.rQuadTo(f7 / 2.0f, (-f7) / 2.0f, f7, 0.0f);
                path.rLineTo(f5, f6);
                path.close();
                return;
            }
            return;
        }
        if (i13 == 3) {
            int iG = g();
            android.graphics.Path path2 = this.l;
            path2.reset();
            int i19 = this.ab;
            if (i19 == 1) {
                int i20 = iG - this.s;
                int i21 = this.w;
                android.graphics.RectF rectF = this.m;
                float f8 = this.x;
                path2.moveTo(i20 - i21, rectF.bottom - f8);
                path2.rLineTo(i21, 0.0f);
                float f9 = this.O;
                path2.rLineTo(0.0f, f8 + f9);
                float f10 = -this.P;
                path2.rQuadTo(f10 / 10.0f, this.v, f10, 0.0f);
                path2.rLineTo(-this.R, -f9);
                path2.close();
                return;
            }
            if (i19 == 2) {
                int i22 = iG - this.s;
                int i23 = this.w;
                android.graphics.RectF rectF2 = this.m;
                float f11 = this.x;
                path2.moveTo(i22 - i23, rectF2.top + f11);
                path2.rLineTo(i23, 0.0f);
                float f12 = this.O;
                path2.rLineTo(0.0f, -(f11 + f12));
                float f13 = -this.P;
                path2.rQuadTo(f13 / 10.0f, -this.v, f13, 0.0f);
                path2.rLineTo(-this.R, f12);
                path2.close();
                return;
            }
            return;
        }
        if (i13 == 2 && i13 == 2) {
            int i24 = this.h;
            android.graphics.Path path3 = this.l;
            path3.reset();
            int i25 = this.ab;
            if (i25 == 1) {
                int i26 = i24 - this.s;
                int i27 = this.w;
                android.graphics.RectF rectF3 = this.m;
                float f14 = this.x;
                path3.moveTo(i26 + i27, rectF3.bottom - f14);
                path3.rLineTo(-i27, 0.0f);
                float f15 = this.O;
                path3.rLineTo(0.0f, f14 + f15);
                float f16 = this.P;
                path3.rQuadTo(f16 / 10.0f, this.v, f16, 0.0f);
                path3.rLineTo(this.R, -f15);
                path3.close();
                return;
            }
            if (i25 == 2) {
                int i28 = i24 - this.s;
                int i29 = this.w;
                android.graphics.RectF rectF4 = this.m;
                float f17 = this.x;
                path3.moveTo(i28 + i29, rectF4.top + f17);
                path3.rLineTo(-i29, 0.0f);
                float f18 = this.O;
                path3.rLineTo(0.0f, -(f17 + f18));
                float f19 = this.P;
                path3.rQuadTo(f19 / 10.0f, -this.v, f19, 0.0f);
                path3.rLineTo(this.R, f18);
                path3.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int iHeight;
        boolean z;
        int i5;
        if (this.ab == 3 && this.b) {
            int i6 = this.aa;
            int i7 = i6 - 1;
            if (i6 == 0) {
                throw null;
            }
            if (i7 == 0) {
                i5 = 1;
            } else {
                if (i7 != 1) {
                    throw new java.lang.RuntimeException(null, null);
                }
                i5 = 2;
            }
            this.ab = i5;
        }
        int[] iArr = this.A;
        android.graphics.Point point = this.B;
        j(point);
        int i8 = point.x;
        int i9 = point.y;
        int i10 = this.ab;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            i3 = this.s;
            i4 = i8 - (i3 << 1);
            iHeight = this.a.top;
        } else {
            if (i11 != 1) {
                throw new java.lang.IllegalStateException();
            }
            i3 = this.s;
            i4 = i8 - (i3 << 1);
            android.graphics.Rect rect = this.a;
            iHeight = (i9 - rect.top) - rect.height();
        }
        int i12 = iHeight - i3;
        iArr[0] = i4;
        iArr[1] = i12;
        int i13 = this.r << 1;
        int i14 = this.C;
        int i15 = this.t;
        j(point);
        int i16 = i14 << 1;
        int i17 = (i4 - i13) - i16;
        int i18 = ((i12 - i13) - i16) - i15;
        this.e.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min((int) (point.x * this.g), i17), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(i18, 0));
        if (this.e.getMeasuredHeight() > i18) {
            this.e.measure(android.view.View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(i18, 0));
            if (this.e.getMeasuredHeight() > i18) {
                this.e.measure(android.view.View.MeasureSpec.makeMeasureSpec(i17, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE));
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        int measuredWidth = this.e.getMeasuredWidth() + i13;
        int measuredHeight = this.e.getMeasuredHeight() + i13;
        android.graphics.RectF rectF = this.m;
        int i19 = this.ab;
        rectF.set(0.0f, i19 == 2 ? i15 : 0.0f, measuredWidth, measuredHeight + (i19 == 2 ? i15 : 0));
        setMeasuredDimension(((int) rectF.width()) + i16, (((int) rectF.height()) + i16 + i15) | (true != z ? 16777216 : 0));
    }
}
