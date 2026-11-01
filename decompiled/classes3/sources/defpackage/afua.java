package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afua {
    public boolean A;
    public final android.text.TextPaint B;
    public final android.text.TextPaint C;
    public android.animation.TimeInterpolator D;
    public android.animation.TimeInterpolator E;
    public float F;
    public float G;
    public float H;
    public android.content.res.ColorStateList I;
    public float J;
    public float K;
    public android.text.StaticLayout L;
    public float M;
    public float N;
    public float O;
    public java.lang.CharSequence P;
    public boolean U;
    private float X;
    private float Y;
    private float Z;
    public final android.view.View a;
    private float aa;
    private android.graphics.Typeface ab;
    private android.graphics.Typeface ac;
    private android.graphics.Typeface ad;
    private android.graphics.Typeface ae;
    private int ag;
    private float ah;
    public float b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final android.graphics.RectF e;
    public android.content.res.ColorStateList h;
    public android.content.res.ColorStateList i;
    public int j;
    public float k;
    public float l;
    public android.graphics.Typeface m;
    public android.graphics.Typeface n;
    public android.graphics.Typeface o;
    public defpackage.afyw p;
    public java.lang.CharSequence q;
    public java.lang.CharSequence r;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public int y;
    public int[] z;
    private int V = 16;
    private int W = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    private final android.text.TextUtils.TruncateAt af = android.text.TextUtils.TruncateAt.END;
    public int Q = 1;
    public int R = 1;
    public int S = -1;
    public int T = -1;

    public afua(android.view.View view) {
        this.a = view;
        android.text.TextPaint textPaint = new android.text.TextPaint(129);
        this.B = textPaint;
        this.C = new android.text.TextPaint(textPaint);
        this.d = new android.graphics.Rect();
        this.c = new android.graphics.Rect();
        this.e = new android.graphics.RectF();
        h(view.getContext().getResources().getConfiguration());
    }

    private final void A(float f) {
        z(f, false);
        this.a.postInvalidateOnAnimation();
    }

    private static boolean B(float f, float f2) {
        return java.lang.Math.abs(f - f2) < 1.0E-5f;
    }

    private static final float C(android.text.TextPaint textPaint, java.lang.CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public static boolean r(android.graphics.Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private static float v(float f, float f2, float f3, android.animation.TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        android.animation.TimeInterpolator timeInterpolator2 = afpc.a;
        return f + (f3 * (f2 - f));
    }

    private static int w(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return android.graphics.Color.argb(java.lang.Math.round((android.graphics.Color.alpha(i) * f2) + (android.graphics.Color.alpha(i2) * f)), java.lang.Math.round((android.graphics.Color.red(i) * f2) + (android.graphics.Color.red(i2) * f)), java.lang.Math.round((android.graphics.Color.green(i) * f2) + (android.graphics.Color.green(i2) * f)), java.lang.Math.round((android.graphics.Color.blue(i) * f2) + (android.graphics.Color.blue(i2) * f)));
    }

    private final int x(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.z;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private final void y() {
        android.graphics.Rect rect = this.c;
        float f = this.b;
        float f2 = rect.left;
        android.graphics.Rect rect2 = this.d;
        float fV = v(f2, rect2.left, f, this.D);
        android.graphics.RectF rectF = this.e;
        rectF.left = fV;
        rectF.top = v(this.X, this.Y, f, this.D);
        rectF.right = v(rect.right, rect2.right, f, this.D);
        rectF.bottom = v(rect.bottom, rect2.bottom, f, this.D);
        this.k = v(this.Z, this.aa, f, this.D);
        this.l = v(this.X, this.Y, f, this.D);
        A(f);
        float f3 = this.J;
        float f4 = this.K;
        android.text.TextPaint textPaint = this.B;
        if (f3 != f4) {
            textPaint.setLetterSpacing(v(f4, f3, f, afpc.b));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        android.animation.TimeInterpolator timeInterpolator = afpc.b;
        this.N = 1.0f - v(0.0f, 1.0f, 1.0f - f, timeInterpolator);
        android.view.View view = this.a;
        view.postInvalidateOnAnimation();
        this.O = v(1.0f, 0.0f, f, timeInterpolator);
        view.postInvalidateOnAnimation();
        android.content.res.ColorStateList colorStateList = this.i;
        android.content.res.ColorStateList colorStateList2 = this.h;
        android.text.TextPaint textPaint2 = this.B;
        if (colorStateList != colorStateList2) {
            textPaint2.setColor(w(x(colorStateList2), d(), f));
        } else {
            textPaint2.setColor(d());
        }
        this.v = v(0.0f, this.F, f, null);
        this.w = v(0.0f, this.G, f, null);
        this.x = v(0.0f, this.H, f, null);
        int iW = w(x(null), x(this.I), f);
        this.y = iW;
        this.B.setShadowLayer(this.v, this.w, this.x, iW);
        view.postInvalidateOnAnimation();
    }

    private final void z(float f, boolean z) {
        android.graphics.Typeface typeface;
        float f2;
        float f3;
        if (this.q != null) {
            float fWidth = this.d.width();
            float fWidth2 = this.c.width();
            if (B(f, 1.0f)) {
                f2 = u() ? this.g : this.f;
                f3 = u() ? this.J : this.K;
                this.t = u() ? 1.0f : v(this.f, this.g, f, this.E) / this.f;
                if (true != u()) {
                    fWidth = fWidth2;
                }
                typeface = this.ab;
                fWidth2 = fWidth;
            } else {
                float f4 = this.f;
                float f5 = this.K;
                typeface = this.m;
                if (B(f, 0.0f)) {
                    this.t = 1.0f;
                } else {
                    this.t = v(this.f, this.g, f, this.E) / this.f;
                }
                float f6 = this.g / this.f;
                float f7 = fWidth2 * f6;
                if (!z && f7 > fWidth && u()) {
                    fWidth2 = java.lang.Math.min(fWidth / f6, fWidth2);
                }
                f2 = f4;
                f3 = f5;
            }
            int i = f < 0.5f ? this.Q : this.R;
            boolean z2 = false;
            if (fWidth2 > 0.0f) {
                float f8 = this.u;
                float f9 = this.ah;
                android.graphics.Typeface typeface2 = this.ae;
                android.text.StaticLayout staticLayout = this.L;
                boolean z3 = (f8 == f2 && f9 == f3 && !(staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) && typeface2 == typeface && this.ag == i && !this.A) ? false : true;
                this.u = f2;
                this.ah = f3;
                this.ae = typeface;
                this.A = false;
                this.ag = i;
                this.B.setLinearText(this.t != 1.0f);
                z2 = z3;
            }
            if (this.r == null || z2) {
                android.text.TextPaint textPaint = this.B;
                textPaint.setTextSize(this.u);
                textPaint.setTypeface(this.ae);
                textPaint.setLetterSpacing(this.ah);
                boolean zQ = q(this.q);
                this.s = zQ;
                android.text.StaticLayout staticLayoutE = e(true != t() ? 1 : i, textPaint, this.q, fWidth2 * (u() ? 1.0f : this.t), zQ);
                this.L = staticLayoutE;
                this.r = staticLayoutE.getText();
            }
        }
    }

    public final float a() {
        android.text.TextPaint textPaint = this.C;
        f(textPaint);
        return -textPaint.ascent();
    }

    public final float b() {
        int i = this.S;
        return i != -1 ? i : a();
    }

    public final float c() {
        android.text.TextPaint textPaint = this.C;
        g(textPaint);
        return -textPaint.ascent();
    }

    public final int d() {
        return x(this.i);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e A[Catch: afvd -> 0x004b, TryCatch #0 {afvd -> 0x004b, blocks: (B:4:0x0004, B:16:0x0029, B:5:0x0008, B:7:0x0014, B:13:0x0021, B:12:0x001e, B:14:0x0024), top: B:22:0x0002 }] */
    public final android.text.StaticLayout e(int i, android.text.TextPaint textPaint, java.lang.CharSequence charSequence, float f, boolean z) {
        android.text.Layout.Alignment alignment;
        int i2;
        android.text.Layout.Alignment alignment2;
        android.text.StaticLayout staticLayoutA = null;
        try {
            if (i == 1) {
                alignment2 = android.text.Layout.Alignment.ALIGN_NORMAL;
                i2 = 1;
            } else {
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.V, this.s ? 1 : 0) & 7;
                if (absoluteGravity != 1) {
                    boolean z2 = this.s;
                    if (absoluteGravity != 5) {
                        if (z2) {
                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (z2) {
                        alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                    }
                } else {
                    alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                }
                android.text.Layout.Alignment alignment3 = alignment;
                i2 = i;
                alignment2 = alignment3;
            }
            defpackage.afve afveVar = new defpackage.afve(charSequence, textPaint, (int) f);
            afveVar.f = this.af;
            afveVar.e = z;
            afveVar.a = alignment2;
            afveVar.d = false;
            afveVar.b = i2;
            afveVar.b(0.0f, 1.0f);
            afveVar.c = 1;
            afveVar.g = null;
            staticLayoutA = afveVar.a();
        } catch (defpackage.afvd e) {
            android.util.Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
        }
        dzk.x(staticLayoutA);
        return staticLayoutA;
    }

    public final void f(android.text.TextPaint textPaint) {
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.ab);
        textPaint.setLetterSpacing(this.J);
    }

    public final void g(android.text.TextPaint textPaint) {
        textPaint.setTextSize(this.f);
        textPaint.setTypeface(this.m);
        textPaint.setLetterSpacing(this.K);
    }

    public final void h(android.content.res.Configuration configuration) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.graphics.Typeface typeface = this.ad;
            if (typeface != null) {
                this.ac = defpackage.aftt.j(configuration, typeface);
            }
            android.graphics.Typeface typeface2 = this.o;
            if (typeface2 != null) {
                this.n = defpackage.aftt.j(configuration, typeface2);
            }
            android.graphics.Typeface typeface3 = this.ac;
            if (typeface3 == null) {
                typeface3 = this.ad;
            }
            this.ab = typeface3;
            android.graphics.Typeface typeface4 = this.n;
            if (typeface4 == null) {
                typeface4 = this.o;
            }
            this.m = typeface4;
            i(true);
        }
    }

    public final void i(boolean z) {
        float fC;
        android.text.StaticLayout staticLayout;
        android.view.View view = this.a;
        if (view.getHeight() <= 0 || view.getWidth() <= 0) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        z(1.0f, z);
        java.lang.CharSequence charSequenceEllipsize = this.r;
        if (charSequenceEllipsize != null && (staticLayout = this.L) != null) {
            if (u()) {
                charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceEllipsize, this.B, staticLayout.getWidth(), this.af);
            }
            this.P = charSequenceEllipsize;
        }
        java.lang.CharSequence charSequence = this.P;
        if (charSequence != null) {
            this.M = C(this.B, charSequence);
        } else {
            this.M = 0.0f;
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(this.W, this.s ? 1 : 0);
        android.graphics.Rect rect = this.d;
        int i = absoluteGravity & 112;
        if (i == 48) {
            this.Y = rect.top;
        } else if (i != 80) {
            android.text.TextPaint textPaint = this.B;
            this.Y = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.Y = rect.bottom + this.B.ascent();
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.aa = rect.centerX() - (this.M / 2.0f);
        } else if (i2 != 5) {
            this.aa = rect.left;
        } else {
            this.aa = rect.right - this.M;
        }
        if (this.M <= rect.width()) {
            float fMax = this.aa + java.lang.Math.max(0.0f, rect.left - this.aa);
            this.aa = fMax;
            this.aa = fMax + java.lang.Math.min(0.0f, rect.right - (this.aa + this.M));
        }
        android.text.TextPaint textPaint2 = this.C;
        f(textPaint2);
        if ((-textPaint2.ascent()) + textPaint2.descent() <= rect.height()) {
            float fMax2 = this.Y + java.lang.Math.max(0.0f, rect.top - this.Y);
            this.Y = fMax2;
            this.Y = fMax2 + java.lang.Math.min(0.0f, rect.bottom - (this.Y + b()));
        }
        z(0.0f, z);
        android.text.StaticLayout staticLayout2 = this.L;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        android.text.StaticLayout staticLayout3 = this.L;
        if (staticLayout3 == null || this.Q <= 1) {
            java.lang.CharSequence charSequence2 = this.r;
            fC = charSequence2 != null ? C(this.B, charSequence2) : 0.0f;
        } else {
            fC = staticLayout3.getWidth();
        }
        android.text.StaticLayout staticLayout4 = this.L;
        this.j = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(this.V, this.s ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 != 48) {
            android.graphics.Rect rect2 = this.c;
            if (i3 != 80) {
                this.X = rect2.centerY() - (height / 2.0f);
            } else {
                this.X = (rect2.bottom - height) + (this.U ? this.B.descent() : 0.0f);
            }
        } else {
            this.X = this.c.top;
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 != 1) {
            android.graphics.Rect rect3 = this.c;
            if (i4 != 5) {
                this.Z = rect3.left;
            } else {
                this.Z = rect3.right - fC;
            }
        } else {
            this.Z = this.c.centerX() - (fC / 2.0f);
        }
        A(this.b);
        y();
    }

    public final void j(android.content.res.ColorStateList colorStateList) {
        if (this.i == colorStateList && this.h == colorStateList) {
            return;
        }
        this.i = colorStateList;
        this.h = colorStateList;
        i(false);
    }

    public final void k(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.d;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (r(rect2, i, i2, i3, i4)) {
            return;
        }
        rect2.set(i, i2, i3, i4);
        this.A = true;
    }

    public final void l(android.content.res.ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            i(false);
        }
    }

    public final void m(int i) {
        if (this.W != i) {
            this.W = i;
            i(false);
        }
    }

    public final void n(int i) {
        if (this.V != i) {
            this.V = i;
            i(false);
        }
    }

    public final void o(float f) {
        if (this.f != f) {
            this.f = f;
            i(false);
        }
    }

    public final void p(float f) {
        float fA = dzk.A(f, 0.0f, 1.0f);
        if (fA != this.b) {
            this.b = fA;
            y();
        }
    }

    public final boolean q(java.lang.CharSequence charSequence) {
        return (this.a.getLayoutDirection() == 1 ? dxv.d : dxv.c).f(charSequence, charSequence.length());
    }

    public final boolean s(android.graphics.Typeface typeface) {
        defpackage.afyw afywVar = this.p;
        if (afywVar != null) {
            afywVar.c();
        }
        if (this.ad == typeface) {
            return false;
        }
        this.ad = typeface;
        android.graphics.Typeface typefaceJ = defpackage.aftt.j(this.a.getContext().getResources().getConfiguration(), typeface);
        this.ac = typefaceJ;
        if (typefaceJ == null) {
            typefaceJ = this.ad;
        }
        this.ab = typefaceJ;
        return true;
    }

    public final boolean t() {
        return (this.Q > 1 || this.R > 1) && !this.s;
    }

    public final boolean u() {
        return this.R == 1;
    }
}
