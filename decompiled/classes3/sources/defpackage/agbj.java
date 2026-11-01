package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agbj extends android.view.View {
    public static final java.lang.String a = "agbj";
    static final int b = 2132086147;
    private static final int n = 2130970061;
    private static final int o = 2130970064;
    private static final int p = 2130970071;
    private static final int q = 2130970069;
    private int A;
    private boolean B;
    private android.animation.ValueAnimator C;
    private android.animation.ValueAnimator D;
    private final int E;
    private final int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int W;
    private boolean aA;
    private java.util.ArrayList aB;
    private int aC;
    private float aD;
    private int aE;
    private float[] aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private boolean aK;
    private android.content.res.ColorStateList aL;
    private android.content.res.ColorStateList aM;
    private android.content.res.ColorStateList aN;
    private android.content.res.ColorStateList aO;
    private android.content.res.ColorStateList aP;
    private final android.graphics.Path aQ;
    private final android.graphics.RectF aR;
    private final android.graphics.RectF aS;
    private final android.graphics.RectF aT;
    private final android.graphics.RectF aU;
    private final android.graphics.Rect aV;
    private final android.graphics.RectF aW;
    private final android.graphics.Rect aX;
    private final android.graphics.Matrix aY;
    private final java.util.List aZ;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private boolean ah;
    private android.graphics.drawable.Drawable ai;
    private boolean aj;
    private android.graphics.drawable.Drawable ak;
    private boolean al;
    private android.content.res.ColorStateList am;
    private android.graphics.drawable.Drawable an;
    private boolean ao;
    private android.graphics.drawable.Drawable ap;
    private boolean aq;
    private android.content.res.ColorStateList ar;
    private int as;
    private int at;
    private int au;
    private float av;
    private float aw;
    private android.view.MotionEvent ax;
    private final android.graphics.Rect ay;
    private java.util.List az;
    private java.util.List ba;
    private float bb;
    private float bc;
    private android.content.res.ColorStateList bd;
    private android.content.res.ColorStateList be;
    private float bf;
    private final android.view.ViewTreeObserver.OnScrollChangedListener bg;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener bh;
    private boolean bi;
    public final defpackage.agbi c;
    public final java.util.List d;
    public final java.util.List e;
    public final java.util.List f;
    java.util.List g;
    public float h;
    public float i;
    public int j;
    public boolean k;
    public final int l;
    public final java.lang.Runnable m;
    private final android.graphics.Paint r;
    private final android.graphics.Paint s;
    private final android.graphics.Paint t;
    private final android.graphics.Paint u;
    private final android.graphics.Paint v;
    private final android.graphics.Paint w;
    private final android.graphics.Paint x;
    private final android.view.accessibility.AccessibilityManager y;
    private defpackage.agbh z;

    /* JADX WARN: Illegal instructions before constructor call */
    public agbj(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.content.res.ColorStateList colorStateListO;
        int i2 = b;
        super(agdv.a(context, attributeSet, i, i2), attributeSet, i);
        this.d = new java.util.ArrayList();
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.B = false;
        this.ab = -1;
        this.ac = -1;
        this.ad = -1;
        this.ah = false;
        this.aj = false;
        this.al = false;
        this.ao = false;
        this.aq = false;
        this.ay = new android.graphics.Rect();
        this.g = new java.util.ArrayList();
        this.az = new java.util.ArrayList();
        this.aA = false;
        this.aB = new java.util.ArrayList();
        this.j = -1;
        this.aC = -1;
        this.aD = 0.0f;
        this.aE = 0;
        this.aK = false;
        this.aQ = new android.graphics.Path();
        this.aR = new android.graphics.RectF();
        this.aS = new android.graphics.RectF();
        this.aT = new android.graphics.RectF();
        this.aU = new android.graphics.RectF();
        this.aV = new android.graphics.Rect();
        this.aW = new android.graphics.RectF();
        this.aX = new android.graphics.Rect();
        this.aY = new android.graphics.Matrix();
        this.aZ = new java.util.ArrayList();
        this.ba = java.util.Collections.EMPTY_LIST;
        this.bg = new defpackage.aggt(this, 1);
        this.bh = new gj(this, 6);
        this.m = new defpackage.aflt(this, 15);
        android.content.Context context2 = getContext();
        this.bi = isShown();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.r = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.s = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        this.t = paint3;
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        android.graphics.Paint paint4 = new android.graphics.Paint(1);
        this.u = paint4;
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint5 = new android.graphics.Paint();
        this.v = paint5;
        paint5.setStyle(android.graphics.Paint.Style.STROKE);
        paint5.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint6 = new android.graphics.Paint();
        this.w = paint6;
        paint6.setStyle(android.graphics.Paint.Style.STROKE);
        paint6.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Paint paint7 = new android.graphics.Paint();
        this.x = paint7;
        paint7.setStyle(android.graphics.Paint.Style.FILL);
        paint7.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        this.F = context2.getResources().getDimensionPixelSize(2131166835);
        android.content.res.Resources resources = context2.getResources();
        this.P = resources.getDimensionPixelSize(2131167185);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131167184);
        this.G = dimensionPixelOffset;
        this.T = dimensionPixelOffset;
        this.H = resources.getDimensionPixelSize(2131167180);
        this.I = resources.getDimensionPixelSize(2131167183);
        this.J = resources.getDimensionPixelSize(2131167182);
        this.K = resources.getDimensionPixelSize(2131167182);
        this.L = resources.getDimensionPixelSize(2131167181);
        this.au = resources.getDimensionPixelSize(2131167176);
        this.at = resources.getDimensionPixelOffset(2131166837);
        this.N = resources.getDimensionPixelSize(2131167139);
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.agbk.a, i, i2, new int[0]);
        int i3 = typedArrayA.getInt(2, 0);
        if (this.O != i3) {
            this.O = i3;
            W(true);
        }
        this.A = typedArrayA.getResourceId(11, 2132086181);
        this.h = typedArrayA.getFloat(4, 0.0f);
        this.i = typedArrayA.getFloat(5, 1.0f);
        boolean z = typedArrayA.getBoolean(6, false);
        if (this.ah != z) {
            this.ah = z;
            float f = this.h;
            if (z) {
                e(java.lang.Float.valueOf((f + this.i) / 2.0f));
            } else {
                e(java.lang.Float.valueOf(f));
            }
            W(true);
        }
        this.aD = typedArrayA.getFloat(3, 0.0f);
        this.aE = typedArrayA.getInt(7, 0);
        this.M = (int) java.lang.Math.ceil(typedArrayA.getDimension(12, agab.A(context2)));
        boolean zHasValue = typedArrayA.hasValue(28);
        int i4 = zHasValue ? 28 : 30;
        int i5 = true != zHasValue ? 29 : 28;
        android.content.res.ColorStateList colorStateListO2 = agab.o(context2, typedArrayA, i4);
        colorStateListO2 = colorStateListO2 == null ? dvx.d(context2, 2131102037) : colorStateListO2;
        if (!colorStateListO2.equals(this.aP)) {
            this.aP = colorStateListO2;
            paint.setColor(s(colorStateListO2));
            invalidate();
        }
        android.content.res.ColorStateList colorStateListO3 = agab.o(context2, typedArrayA, i5);
        colorStateListO3 = colorStateListO3 == null ? dvx.d(context2, 2131102034) : colorStateListO3;
        if (!colorStateListO3.equals(this.aO)) {
            this.aO = colorStateListO3;
            paint2.setColor(s(colorStateListO3));
            invalidate();
        }
        android.content.res.ColorStateList colorStateListO4 = agab.o(context2, typedArrayA, 13);
        colorStateListO4 = colorStateListO4 == null ? dvx.d(context2, 2131102038) : colorStateListO4;
        if (!colorStateListO4.equals(this.be)) {
            this.be = colorStateListO4;
            int i6 = 0;
            while (true) {
                java.util.List list = this.aZ;
                if (i6 >= list.size()) {
                    break;
                }
                ((agaf) list.get(i6)).R(this.be);
                i6++;
            }
            invalidate();
        }
        if (typedArrayA.hasValue(17) && (colorStateListO = agab.o(context2, typedArrayA, 17)) != this.bd) {
            this.bd = colorStateListO;
            int i7 = 0;
            while (true) {
                java.util.List list2 = this.aZ;
                if (i7 >= list2.size()) {
                    break;
                }
                ((agaf) list2.get(i7)).Y(colorStateListO);
                i7++;
            }
            postInvalidate();
        }
        float dimension = typedArrayA.getDimension(18, 0.0f);
        if (dimension != this.bc) {
            this.bc = dimension;
            int i8 = 0;
            while (true) {
                java.util.List list3 = this.aZ;
                if (i8 >= list3.size()) {
                    break;
                }
                ((agaf) list3.get(i8)).aa(dimension);
                i8++;
            }
            postInvalidate();
        }
        android.content.res.ColorStateList colorStateListO5 = agab.o(context2, typedArrayA, 8);
        colorStateListO5 = colorStateListO5 == null ? dvx.d(context2, 2131102035) : colorStateListO5;
        if (!colorStateListO5.equals(this.aL)) {
            this.aL = colorStateListO5;
            android.graphics.drawable.RippleDrawable rippleDrawableW = w();
            if (ae() || rippleDrawableW == null) {
                android.graphics.Paint paint8 = this.u;
                paint8.setColor(s(colorStateListO5));
                paint8.setAlpha(63);
                invalidate();
            } else {
                rippleDrawableW.setColor(colorStateListO5);
            }
        }
        this.aG = typedArrayA.hasValue(26) ? typedArrayA.getInt(26, -1) : true != typedArrayA.getBoolean(27, true) ? 2 : 0;
        boolean zHasValue2 = typedArrayA.hasValue(21);
        int i9 = zHasValue2 ? 21 : 23;
        int i10 = true != zHasValue2 ? 22 : 21;
        android.content.res.ColorStateList colorStateListO6 = agab.o(context2, typedArrayA, i9);
        colorStateListO6 = colorStateListO6 == null ? dvx.d(context2, 2131102036) : colorStateListO6;
        if (!colorStateListO6.equals(this.aN)) {
            this.aN = colorStateListO6;
            this.v.setColor(s(colorStateListO6));
            invalidate();
        }
        android.content.res.ColorStateList colorStateListO7 = agab.o(context2, typedArrayA, i10);
        colorStateListO7 = colorStateListO7 == null ? dvx.d(context2, 2131102033) : colorStateListO7;
        if (!colorStateListO7.equals(this.aM)) {
            this.aM = colorStateListO7;
            this.w.setColor(s(colorStateListO7));
            invalidate();
        }
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(19, 0);
        if (this.aa != dimensionPixelSize) {
            this.aa = dimensionPixelSize;
            invalidate();
        }
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(41, 0);
        if (this.ae != dimensionPixelSize2) {
            this.ae = dimensionPixelSize2;
            this.x.setStrokeWidth(dimensionPixelSize2);
            invalidate();
        }
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(31, -1);
        if (this.af != dimensionPixelSize3) {
            this.af = dimensionPixelSize3;
            invalidate();
        }
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(40, 0);
        if (this.ag != dimensionPixelSize4) {
            this.ag = dimensionPixelSize4;
            invalidate();
        }
        android.graphics.drawable.Drawable drawableP = agab.p(context2, typedArrayA, 35);
        if (drawableP != this.ai) {
            this.ai = drawableP;
            this.aj = false;
            S();
            invalidate();
        }
        android.graphics.drawable.Drawable drawableP2 = agab.p(context2, typedArrayA, 34);
        if (drawableP2 != this.ak) {
            this.ak = drawableP2;
            this.al = false;
            R();
            invalidate();
        }
        android.content.res.ColorStateList colorStateListO8 = agab.o(context2, typedArrayA, 33);
        if (colorStateListO8 != this.am) {
            this.am = colorStateListO8;
            S();
            R();
            invalidate();
        }
        android.graphics.drawable.Drawable drawableP3 = agab.p(context2, typedArrayA, 38);
        if (drawableP3 != this.an) {
            this.an = drawableP3;
            this.ao = false;
            U();
            invalidate();
        }
        android.graphics.drawable.Drawable drawableP4 = agab.p(context2, typedArrayA, 37);
        if (drawableP4 != this.ap) {
            this.ap = drawableP4;
            this.aq = false;
            T();
            invalidate();
        }
        android.content.res.ColorStateList colorStateListO9 = agab.o(context2, typedArrayA, 36);
        if (colorStateListO9 != this.ar) {
            this.ar = colorStateListO9;
            U();
            T();
            invalidate();
        }
        int dimensionPixelSize5 = typedArrayA.getDimensionPixelSize(39, 0);
        if (this.as != dimensionPixelSize5) {
            this.as = dimensionPixelSize5;
            invalidate();
        }
        int dimensionPixelSize6 = typedArrayA.getDimensionPixelSize(16, 0) << 1;
        int dimensionPixelSize7 = typedArrayA.getDimensionPixelSize(20, dimensionPixelSize6);
        int dimensionPixelSize8 = typedArrayA.getDimensionPixelSize(15, dimensionPixelSize6);
        if (dimensionPixelSize7 != this.U) {
            this.U = dimensionPixelSize7;
            for (int i11 = 0; i11 < this.ba.size(); i11++) {
                y(dimensionPixelSize7, (android.graphics.drawable.Drawable) this.ba.get(i11));
            }
            L(dimensionPixelSize7, -1, null);
        }
        if (dimensionPixelSize8 != this.V) {
            this.V = dimensionPixelSize8;
            int i12 = 0;
            while (true) {
                java.util.List list4 = this.aZ;
                if (i12 >= list4.size()) {
                    break;
                }
                ((agaf) list4.get(i12)).setBounds(0, 0, this.U, this.V);
                i12++;
            }
            java.util.Iterator it = this.ba.iterator();
            while (it.hasNext()) {
                y(this.U, (android.graphics.drawable.Drawable) it.next());
            }
            W(false);
        }
        int dimensionPixelSize9 = typedArrayA.getDimensionPixelSize(9, 0);
        if (dimensionPixelSize9 != this.W) {
            this.W = dimensionPixelSize9;
            android.graphics.drawable.RippleDrawable rippleDrawableW2 = w();
            if (ae() || rippleDrawableW2 == null) {
                postInvalidate();
            } else {
                rippleDrawableW2.setRadius(this.W);
            }
        }
        float dimension2 = typedArrayA.getDimension(14, 0.0f);
        if (dimension2 != this.bb) {
            this.bb = dimension2;
            int i13 = 0;
            while (true) {
                java.util.List list5 = this.aZ;
                if (i13 >= list5.size()) {
                    break;
                }
                ((agaf) list5.get(i13)).Q(this.bb);
                i13++;
            }
        }
        int dimensionPixelSize10 = typedArrayA.getDimensionPixelSize(32, 0);
        if (this.S != dimensionPixelSize10) {
            this.S = dimensionPixelSize10;
            this.r.setStrokeWidth(dimensionPixelSize10);
            this.s.setStrokeWidth(this.S);
            W(false);
        }
        int dimensionPixelSize11 = typedArrayA.getDimensionPixelSize(24, this.ae / 2);
        if (this.aH != dimensionPixelSize11) {
            this.aH = dimensionPixelSize11;
            this.w.setStrokeWidth(dimensionPixelSize11 << 1);
            W(false);
        }
        int dimensionPixelSize12 = typedArrayA.getDimensionPixelSize(25, this.ae / 2);
        if (this.aI != dimensionPixelSize12) {
            this.aI = dimensionPixelSize12;
            this.v.setStrokeWidth(dimensionPixelSize12 << 1);
            W(false);
        }
        int i14 = typedArrayA.getInt(10, 0);
        if (this.R != i14) {
            this.R = i14;
            W(true);
        }
        if (!typedArrayA.getBoolean(0, true)) {
            setEnabled(false);
        }
        e(java.lang.Float.valueOf(this.h));
        typedArrayA.recycle();
        setFocusable(true);
        setClickable(true);
        this.E = android.view.ViewConfiguration.get(context2).getScaledTouchSlop();
        defpackage.agbi agbiVar = new defpackage.agbi(this);
        this.c = agbiVar;
        dzs.i(this, agbiVar);
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        this.y = accessibilityManager;
        this.l = da$.ExternalSyntheticApiModelOutline0.m(accessibilityManager, defpackage.aehk.NEXT_REQUEST_CODE, 6);
    }

    private final void A(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.drawable.Drawable drawable, boolean z) {
        if (drawable != null) {
            android.graphics.RectF rectF2 = this.aW;
            int i = this.as;
            int i2 = this.at;
            if (rectF.right - rectF.left >= (i2 << 1) + i) {
                float f = i;
                float f2 = i2;
                boolean z2 = true;
                if (!i() && !j()) {
                    z2 = false;
                }
                float f3 = z ^ z2 ? rectF.left + f2 : (rectF.right - f2) - f;
                float fR = r() - (f / 2.0f);
                rectF2.set(f3, fR, f + f3, fR + f);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (j()) {
                this.aY.mapRect(rectF2);
            }
            android.graphics.Rect rect = this.aX;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void B(defpackage.agdx agdxVar) {
        android.view.ViewGroup viewGroupG = agab.G(this);
        if (viewGroupG != null) {
            viewGroupG.getOverlay().remove(agdxVar);
            viewGroupG.removeOnLayoutChangeListener(agdxVar.c);
        }
    }

    private final void C(android.graphics.Canvas canvas, float f, float f2) {
        for (int i = 0; i < this.aB.size(); i++) {
            float fP = p(((java.lang.Float) this.aB.get(i)).floatValue());
            float fQ = q(i) + (this.U / 2.0f);
            if (f >= fP - fQ && f <= fP + fQ) {
                return;
            }
        }
        boolean zJ = j();
        android.graphics.Paint paint = this.x;
        if (zJ) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    private final void D(android.graphics.Canvas canvas, int i, int i2, float f, android.graphics.drawable.Drawable drawable) {
        canvas.save();
        if (j()) {
            canvas.concat(this.aY);
        }
        canvas.translate((this.T + ((int) (o(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    private final void E(int i, int i2, android.graphics.Canvas canvas, android.graphics.Paint paint) {
        while (i < i2) {
            boolean zJ = j();
            float[] fArr = this.aF;
            float f = zJ ? fArr[i + 1] : fArr[i];
            int i3 = 0;
            while (true) {
                if (i3 >= this.aB.size()) {
                    if (!this.ah) {
                        float[] fArr2 = this.aF;
                        canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                        break;
                        break;
                    }
                    int i4 = this.aJ + (this.T << 1);
                    float f2 = this.aa;
                    float f3 = i4 / 2.0f;
                    if (f >= f3 - f2 && f <= f3 + f2) {
                        break;
                    }
                    float[] fArr3 = this.aF;
                    canvas.drawPoint(fArr3[i], fArr3[i + 1], paint);
                    break;
                }
                float fP = p(((java.lang.Float) this.aB.get(i3)).floatValue());
                float fQ = q(i3) + (this.U / 2.0f);
                if (f >= fP - fQ && f <= fP + fQ) {
                    break;
                } else {
                    i3++;
                }
            }
            i += 2;
        }
    }

    private final void F(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.RectF rectF2) {
        if (this.ai == null && this.ak == null && this.an == null && this.ap == null) {
            return;
        }
        if (this.aB.size() > 1) {
            android.util.Log.w(a, "Track icons can only be used when only 1 thumb is present.");
        }
        A(canvas, rectF, this.ai, true);
        A(canvas, rectF2, this.an, true);
        A(canvas, rectF, this.ak, false);
        A(canvas, rectF2, this.ap, false);
    }

    private final void G(boolean z) {
        if (!this.B) {
            this.B = true;
            android.animation.ValueAnimator valueAnimatorV = v(true);
            this.C = valueAnimatorV;
            this.D = null;
            valueAnimatorV.start();
        }
        java.util.List list = this.d;
        java.util.Iterator it = list.iterator();
        if (z) {
            for (int i = 0; i < this.aB.size() && it.hasNext(); i++) {
                if (i != this.aC) {
                    M((defpackage.agdx) it.next(), ((java.lang.Float) this.aB.get(i)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Not enough labels(%d) to display all the values(%d)", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(this.aB.size())));
        }
        M((defpackage.agdx) it.next(), ((java.lang.Float) this.aB.get(this.aC)).floatValue());
    }

    private final void H() {
        if (this.B) {
            this.B = false;
            android.animation.ValueAnimator valueAnimatorV = v(false);
            this.D = valueAnimatorV;
            this.C = null;
            valueAnimatorV.addListener(new defpackage.agbg(this));
            this.D.start();
        }
    }

    private final void I() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ifq ifqVar = (ifq) ((defpackage.rai) it.next()).a;
            iek iekVar = ifqVar.k;
            if (iekVar != null) {
                ied iedVar = iekVar.c;
                if (iedVar == null) {
                    iedVar = ied.a;
                }
                if (iedVar != null) {
                    iez iezVar = ifqVar.d;
                    boolean z = false;
                    if (iezVar.t() && iezVar.s(iedVar)) {
                        z = true;
                    }
                    ifqVar.l = z;
                    iezVar.k(iedVar, true);
                }
            }
        }
    }

    private final void J() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ifq ifqVar = (ifq) ((defpackage.rai) it.next()).a;
            iek iekVar = ifqVar.k;
            if (iekVar != null) {
                ied iedVar = iekVar.c;
                if (iedVar == null) {
                    iedVar = ied.a;
                }
                if (iedVar != null && ifqVar.l) {
                    ifqVar.d.l(iedVar);
                }
            }
        }
    }

    private final void K() {
        int i;
        if (!Y() || (i = this.ab) == -1 || this.ac == -1) {
            return;
        }
        L(i, this.ad, java.lang.Integer.valueOf(this.j));
    }

    private final void L(int i, int i2, java.lang.Integer num) {
        int i3 = 0;
        while (true) {
            java.util.List list = this.aZ;
            if (i3 >= list.size()) {
                W(false);
                return;
            }
            if (num == null || i3 == num.intValue()) {
                agaf agafVar = (agaf) list.get(i3);
                aguv aguvVar = new aguv((byte[]) null);
                aguvVar.q(i / 2.0f);
                agafVar.q(new agal(aguvVar));
                ((agaf) list.get(i3)).setBounds(0, 0, i, i2 >= 0 ? i2 : this.V);
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0081  */
    /* JADX WARN: Code duplicated, block: B:15:0x009e  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void M(defpackage.agdx agdxVar, float f) {
        int iO;
        int intrinsicWidth;
        int iR;
        int intrinsicHeight;
        int iR2;
        android.graphics.Rect rect;
        android.view.ViewOverlay viewOverlayB;
        agdxVar.b(c(f));
        boolean zJ = j();
        int i = this.T;
        if (zJ) {
            iO = (i + ((int) (o(f) * this.aJ))) - (agdxVar.getIntrinsicHeight() / 2);
            intrinsicWidth = agdxVar.getIntrinsicHeight() + iO;
            if (i()) {
                iR = r() - (this.au + (this.V / 2));
                intrinsicHeight = agdxVar.getIntrinsicWidth();
            } else {
                iR2 = this.au + (this.V / 2) + r();
                iR = agdxVar.getIntrinsicWidth() + iR2;
            }
            rect = this.aV;
            rect.set(iO, iR2, intrinsicWidth, iR);
            if (j()) {
                android.graphics.RectF rectF = new android.graphics.RectF(rect);
                this.aY.mapRect(rectF);
                rectF.round(rect);
            }
            defpackage.afub.b(agab.G(this), this, rect);
            agdxVar.setBounds(rect);
            viewOverlayB = b();
            if (viewOverlayB != null) {
                viewOverlayB.add(agdxVar);
            }
        }
        iO = (i + ((int) (o(f) * this.aJ))) - (agdxVar.getIntrinsicWidth() / 2);
        intrinsicWidth = agdxVar.getIntrinsicWidth() + iO;
        iR = r() - (this.au + (this.V / 2));
        intrinsicHeight = agdxVar.getIntrinsicHeight();
        iR2 = iR - intrinsicHeight;
        rect = this.aV;
        rect.set(iO, iR2, intrinsicWidth, iR);
        if (j()) {
            android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
            this.aY.mapRect(rectF2);
            rectF2.round(rect);
        }
        defpackage.afub.b(agab.G(this), this, rect);
        agdxVar.setBounds(rect);
        viewOverlayB = b();
        if (viewOverlayB != null) {
            viewOverlayB.add(agdxVar);
        }
    }

    private final void N(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalArgumentException("At least one value must be set");
        }
        java.util.Collections.sort(arrayList);
        if (this.aB.size() == arrayList.size() && this.aB.equals(arrayList)) {
            return;
        }
        this.aB = arrayList;
        this.k = true;
        java.util.List list = this.aZ;
        if (list.size() != this.aB.size()) {
            list.clear();
            for (int i = 0; i < this.aB.size(); i++) {
                agaf agafVar = new agaf();
                agafVar.ad();
                agafVar.R(this.be);
                aguv aguvVar = new aguv((byte[]) null);
                aguvVar.q(this.U / 2.0f);
                agafVar.q(new agal(aguvVar));
                agafVar.setBounds(0, 0, this.U, this.V);
                agafVar.Q(this.bb);
                agafVar.aa(this.bc);
                agafVar.Z(this.bd);
                agafVar.setState(getDrawableState());
                list.add(agafVar);
            }
        }
        this.aC = 0;
        g();
        java.util.List list2 = this.d;
        if (list2.size() > this.aB.size()) {
            java.util.List<defpackage.agdx> listSubList = list2.subList(this.aB.size(), list2.size());
            for (defpackage.agdx agdxVar : listSubList) {
                if (isAttachedToWindow()) {
                    B(agdxVar);
                }
            }
            listSubList.clear();
        }
        while (list2.size() < this.aB.size()) {
            android.content.Context context = getContext();
            int i2 = this.A;
            defpackage.agdx agdxVar2 = new defpackage.agdx(context, i2);
            android.content.Context context2 = agdxVar2.a;
            android.content.res.TypedArray typedArrayA = afvl.a(context2, (android.util.AttributeSet) null, defpackage.agdw.a, 0, i2, new int[0]);
            agdxVar2.i = context2.getResources().getDimensionPixelSize(2131167208);
            boolean z = typedArrayA.getBoolean(8, true);
            agdxVar2.h = z;
            if (z) {
                aguv aguvVar2 = new aguv(agdxVar2.es());
                aguvVar2.l = agdxVar2.a();
                agdxVar2.q(new agal(aguvVar2));
            } else {
                agdxVar2.i = 0;
            }
            agdxVar2.b(typedArrayA.getText(6));
            defpackage.afza afzaVarS = agab.s(context2, typedArrayA);
            if (afzaVarS != null && typedArrayA.hasValue(1)) {
                afzaVarS.k = agab.o(context2, typedArrayA, 1);
            }
            agdxVar2.b.c(afzaVarS, context2);
            agdxVar2.R(android.content.res.ColorStateList.valueOf(typedArrayA.getColor(7, dwm.g(dwm.h(agab.Z(context2, 2130969026, defpackage.agdx.class.getCanonicalName()), 153), dwm.h(agab.Z(context2, android.R.attr.colorBackground, defpackage.agdx.class.getCanonicalName()), 229)))));
            agdxVar2.Y(android.content.res.ColorStateList.valueOf(agab.Z(context2, 2130969105, defpackage.agdx.class.getCanonicalName())));
            agdxVar2.d = typedArrayA.getDimensionPixelSize(2, 0);
            agdxVar2.e = typedArrayA.getDimensionPixelSize(4, 0);
            agdxVar2.f = typedArrayA.getDimensionPixelSize(5, 0);
            agdxVar2.g = typedArrayA.getDimensionPixelSize(3, 0);
            typedArrayA.recycle();
            list2.add(agdxVar2);
            if (isAttachedToWindow()) {
                z(agdxVar2);
            }
        }
        int i3 = list2.size() == 1 ? 0 : 1;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((defpackage.agdx) it.next()).aa(i3);
        }
        for (defpackage.rai raiVar : this.e) {
            java.util.ArrayList arrayList2 = this.aB;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                raiVar.h(this, ((java.lang.Float) arrayList2.get(i4)).floatValue(), false);
            }
        }
        postInvalidate();
    }

    private final void O() {
        if (Y() && this.ba.isEmpty()) {
            int i = this.U;
            this.ab = i;
            this.ad = this.V;
            this.ac = this.aa;
            int iRound = java.lang.Math.round(i * 0.5f);
            com.google.android.material.focus.FocusRingDrawable focusRingDrawableX = x();
            int i2 = -1;
            if (focusRingDrawableX != null && focusRingDrawableX.c.c) {
                i2 = this.V - this.F;
            }
            L(iRound, i2, java.lang.Integer.valueOf(this.j));
        }
    }

    private final void P() {
        int iMin;
        X();
        if (this.aD <= 0.0f) {
            Q(this.aE);
            return;
        }
        int i = this.aG;
        if (i != 0) {
            iMin = 0;
            if (i == 1) {
                int iT = t();
                if (iT <= u()) {
                    iMin = iT;
                }
            } else if (i != 2) {
                throw new java.lang.IllegalStateException(a.bj(i, "Unexpected tickVisibilityMode: "));
            }
        } else {
            iMin = java.lang.Math.min(t(), u());
        }
        Q(iMin);
    }

    private final void Q(int i) {
        if (i == 0) {
            this.aF = null;
            return;
        }
        float[] fArr = this.aF;
        int i2 = i << 1;
        if (fArr == null || fArr.length != i2) {
            this.aF = new float[i2];
        }
        float f = this.aJ;
        int i3 = i - 1;
        float fR = r();
        for (int i4 = 0; i4 < i2; i4 += 2) {
            float[] fArr2 = this.aF;
            fArr2[i4] = this.T + ((i4 / 2.0f) * (f / i3));
            fArr2[i4 + 1] = fR;
        }
        if (j()) {
            this.aY.mapPoints(this.aF);
        }
    }

    private final void R() {
        android.graphics.drawable.Drawable drawableMutate = this.ak;
        if (drawableMutate != null) {
            if (!this.al) {
                if (this.am == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.ak = drawableMutate;
                this.al = true;
            }
            drawableMutate.setTintList(this.am);
        }
    }

    private final void S() {
        android.graphics.drawable.Drawable drawableMutate = this.ai;
        if (drawableMutate != null) {
            if (!this.aj) {
                if (this.am == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.ai = drawableMutate;
                this.aj = true;
            }
            drawableMutate.setTintList(this.am);
        }
    }

    private final void T() {
        android.graphics.drawable.Drawable drawableMutate = this.ap;
        if (drawableMutate != null) {
            if (!this.aq) {
                if (this.ar == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.ap = drawableMutate;
                this.aq = true;
            }
            drawableMutate.setTintList(this.ar);
        }
    }

    private final void U() {
        android.graphics.drawable.Drawable drawableMutate = this.an;
        if (drawableMutate != null) {
            if (!this.ao) {
                if (this.ar == null) {
                    return;
                }
                drawableMutate = drawableMutate.mutate();
                this.an = drawableMutate;
                this.ao = true;
            }
            drawableMutate.setTintList(this.ar);
        }
    }

    private final void V(int i) {
        this.aJ = java.lang.Math.max(i - (this.T << 1), 0);
        P();
    }

    private final void W(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (j()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingTop + paddingBottom;
        int iMax = java.lang.Math.max(this.P, java.lang.Math.max(this.S + i, this.V + i));
        boolean z3 = true;
        if (iMax == this.Q) {
            z2 = false;
        } else {
            this.Q = iMax;
            z2 = true;
        }
        int iMax2 = this.G + java.lang.Math.max(java.lang.Math.max(java.lang.Math.max((this.U / 2) - this.H, 0), java.lang.Math.max((this.S - this.I) / 2, 0)), java.lang.Math.max(java.lang.Math.max(this.aH - this.J, 0), java.lang.Math.max(this.aI - this.K, 0)));
        if (this.T == iMax2) {
            z3 = false;
        } else {
            this.T = iMax2;
            if (isLaidOut()) {
                V(j() ? getHeight() : getWidth());
            }
        }
        if (j()) {
            float fR = r();
            android.graphics.Matrix matrix = this.aY;
            matrix.reset();
            matrix.setRotate(90.0f, fR, fR);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    private final void X() {
        if (this.k) {
            float f = this.h;
            if (f >= this.i) {
                throw new java.lang.IllegalStateException(java.lang.String.format("valueFrom(%s) must be smaller than valueTo(%s)", java.lang.Float.valueOf(f), java.lang.Float.valueOf(this.i)));
            }
            java.util.ArrayList arrayList = this.aB;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                java.lang.Float f2 = (java.lang.Float) arrayList.get(i);
                if (f2.floatValue() < this.h || f2.floatValue() > this.i) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f2, java.lang.Float.valueOf(this.h), java.lang.Float.valueOf(this.i)));
                }
                if (this.aD > 0.0f && !ag(f2.floatValue())) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f2, java.lang.Float.valueOf(this.h), java.lang.Float.valueOf(this.aD), java.lang.Float.valueOf(this.aD)));
                }
            }
            if (this.aD > 0.0f && !ag(this.i)) {
                throw new java.lang.IllegalStateException(java.lang.String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", java.lang.Float.valueOf(this.aD), java.lang.Float.valueOf(this.h), java.lang.Float.valueOf(this.i)));
            }
            float f3 = this.aD;
            if (f3 != 0.0f) {
                if (((int) f3) != f3) {
                    android.util.Log.w(a, java.lang.String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "stepSize", java.lang.Float.valueOf(f3)));
                }
                float f4 = this.h;
                if (((int) f4) != f4) {
                    android.util.Log.w(a, java.lang.String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueFrom", java.lang.Float.valueOf(f4)));
                }
                float f5 = this.i;
                if (((int) f5) != f5) {
                    android.util.Log.w(a, java.lang.String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.", "valueTo", java.lang.Float.valueOf(f5)));
                }
            }
            this.k = false;
        }
    }

    private final boolean Y() {
        return this.aa > 0;
    }

    private static boolean Z(android.view.MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private final boolean aa(android.view.MotionEvent motionEvent) {
        if (!Z(motionEvent)) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean ab(android.view.MotionEvent motionEvent) {
        if (!Z(motionEvent)) {
            for (android.view.ViewParent parent = getParent(); parent instanceof android.view.ViewGroup; parent = parent.getParent()) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean ac(int i) {
        int i2 = this.aC;
        int size = this.aB.size() - 1;
        long j = ((long) i2) + ((long) i);
        if (j < 0) {
            j = 0;
        } else {
            long j2 = size;
            if (j > j2) {
                j = j2;
            }
        }
        int i3 = (int) j;
        this.aC = i3;
        if (i3 == i2) {
            return false;
        }
        this.j = i3;
        O();
        g();
        postInvalidate();
        return true;
    }

    private final boolean ad() {
        return this.R == 3;
    }

    private final boolean ae() {
        return w() == null;
    }

    private final boolean af(float f) {
        return k(this.j, f);
    }

    private final boolean ag(float f) {
        double dDoubleValue = new java.math.BigDecimal(java.lang.Double.toString(new java.math.BigDecimal(java.lang.Float.toString(f)).subtract(new java.math.BigDecimal(java.lang.Float.toString(this.h)), java.math.MathContext.DECIMAL64).doubleValue())).divide(new java.math.BigDecimal(java.lang.Float.toString(this.aD)), java.math.MathContext.DECIMAL64).doubleValue();
        return java.lang.Math.abs(((double) java.lang.Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private final float[] ah() {
        float fFloatValue = ((java.lang.Float) this.aB.get(0)).floatValue();
        java.util.ArrayList arrayList = this.aB;
        float fFloatValue2 = ((java.lang.Float) arrayList.get(arrayList.size() - 1)).floatValue();
        if (this.aB.size() == 1) {
            fFloatValue = this.h;
        }
        float fO = o(fFloatValue);
        float fO2 = o(fFloatValue2);
        if (this.ah) {
            float fMin = java.lang.Math.min(0.5f, fO2);
            fO2 = java.lang.Math.max(0.5f, fO2);
            fO = fMin;
        }
        return (this.ah || !(i() || j())) ? new float[]{fO, fO2} : new float[]{fO2, fO};
    }

    private final void ai(float f, float f2, float f3, float f4, android.graphics.Canvas canvas, android.graphics.RectF rectF, int i, int i2) {
        if (f2 - f > a() - i2) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        aj(canvas, this.r, rectF, a(), i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    private final void aj(android.graphics.Canvas canvas, android.graphics.Paint paint, android.graphics.RectF rectF, float f, int i) {
        float fMax;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.aB.isEmpty() || !Y()) {
            fMax = f;
        } else {
            float fP = p(((java.lang.Float) this.aB.get((i() || j()) ? this.aB.size() - 1 : 0)).floatValue()) - this.T;
            if (fP < f) {
                fMax = java.lang.Math.max(fP, this.ag);
            } else {
                fMax = f;
            }
        }
        if (!this.aB.isEmpty() && Y()) {
            float fP2 = p(((java.lang.Float) this.aB.get((i() || j()) ? 0 : this.aB.size() - 1)).floatValue()) - this.T;
            float f2 = this.aJ;
            if (fP2 > f2 - f) {
                f = java.lang.Math.max(f2 - fP2, this.ag);
            }
        }
        int i2 = i - 1;
        if (i2 != 1) {
            fMax = this.ag;
            if (i2 != 2) {
                f = fMax;
            }
        } else {
            f = this.ag;
        }
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        if (Y()) {
            paint.setAntiAlias(true);
        }
        android.graphics.RectF rectF2 = new android.graphics.RectF(rectF);
        if (j()) {
            this.aY.mapRect(rectF2);
        }
        android.graphics.Path path = this.aQ;
        path.reset();
        if (rectF.width() >= fMax + f) {
            path.addRoundRect(rectF2, j() ? new float[]{fMax, fMax, fMax, fMax, f, f, f, f} : new float[]{fMax, fMax, f, f, f, f, fMax, fMax}, android.graphics.Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        float fMin = java.lang.Math.min(fMax, f);
        float fMax2 = java.lang.Math.max(fMax, f);
        canvas.save();
        path.addRoundRect(rectF2, fMin, fMin, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        if (i2 != 1) {
            android.graphics.RectF rectF3 = this.aU;
            if (i2 != 2) {
                rectF3.set(rectF.centerX() - fMax2, rectF.top, rectF.centerX() + fMax2, rectF.bottom);
            } else {
                rectF3.set(rectF.right - (fMax2 + fMax2), rectF.top, rectF.right, rectF.bottom);
            }
        } else {
            this.aU.set(rectF.left, rectF.top, rectF.left + fMax2 + fMax2, rectF.bottom);
        }
        if (j()) {
            this.aY.mapRect(this.aU);
        }
        canvas.drawRoundRect(this.aU, fMax2, fMax2, paint);
        canvas.restore();
    }

    private final void ak(int i) {
        if (i() || j()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        ac(i);
    }

    private final void al() {
        double dRound;
        float f = this.bf;
        float f2 = this.aD;
        if (f2 > 0.0f) {
            int i = (int) ((this.i - this.h) / f2);
            dRound = ((double) java.lang.Math.round(f * i)) / ((double) i);
        } else {
            dRound = f;
        }
        if (i() || j()) {
            dRound = 1.0d - dRound;
        }
        float f3 = this.i;
        float f4 = this.h;
        af((float) ((dRound * ((double) (f3 - f4))) + ((double) f4)));
    }

    private final float n() {
        float f = this.aD;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    private final float o(float f) {
        float f2 = this.h;
        float f3 = (f - f2) / (this.i - f2);
        return (i() || j()) ? 1.0f - f3 : f3;
    }

    private final float p(float f) {
        return (o(f) * this.aJ) + this.T;
    }

    private final int q(int i) {
        if (!this.aA || i != this.j || !this.ba.isEmpty()) {
            return this.aa;
        }
        return this.aa - ((this.U - java.lang.Math.round(this.U * 0.5f)) / 2);
    }

    private final int r() {
        int i = this.Q / 2;
        int intrinsicHeight = 0;
        if (this.R == 1 || ad()) {
            java.util.List list = this.d;
            if (!list.isEmpty()) {
                intrinsicHeight = ((defpackage.agdx) list.get(0)).getIntrinsicHeight();
            }
        }
        return i + intrinsicHeight;
    }

    private final int s(android.content.res.ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    private final int t() {
        return (int) (((this.i - this.h) / this.aD) + 1.0f);
    }

    private final int u() {
        return (this.aJ / this.L) + 1;
    }

    private final android.animation.ValueAnimator v(boolean z) {
        int iU;
        android.animation.TimeInterpolator timeInterpolatorC;
        android.animation.ValueAnimator valueAnimator = z ? this.D : this.C;
        float fFloatValue = true != z ? 1.0f : 0.0f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fFloatValue, true != z ? 0.0f : 1.0f);
        if (z) {
            iU = agab.u(getContext(), n, 83);
            timeInterpolatorC = agab.C(getContext(), p, afpc.e);
        } else {
            iU = agab.u(getContext(), o, 117);
            timeInterpolatorC = agab.C(getContext(), q, afpc.c);
        }
        valueAnimatorOfFloat.setDuration(iU);
        valueAnimatorOfFloat.setInterpolator(timeInterpolatorC);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.afzo(this, 5));
        return valueAnimatorOfFloat;
    }

    private final android.graphics.drawable.RippleDrawable w() {
        android.graphics.drawable.Drawable background = getBackground();
        if (background instanceof android.graphics.drawable.DrawableWrapper) {
            background = ((android.graphics.drawable.DrawableWrapper) background).getDrawable();
        }
        if (background instanceof android.graphics.drawable.RippleDrawable) {
            return (android.graphics.drawable.RippleDrawable) background;
        }
        return null;
    }

    private final com.google.android.material.focus.FocusRingDrawable x() {
        return com.google.android.material.focus.FocusRingDrawable.b(getBackground());
    }

    private final void y(int i, android.graphics.drawable.Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1) {
            if (intrinsicHeight == -1) {
                drawable.setBounds(0, 0, i, this.V);
                return;
            }
            intrinsicWidth = -1;
        }
        float fMax = java.lang.Math.max(i, this.V) / java.lang.Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
    }

    private final void z(defpackage.agdx agdxVar) {
        android.view.ViewGroup viewGroupG = agab.G(this);
        if (viewGroupG != null) {
            agdxVar.c(viewGroupG);
            viewGroupG.addOnLayoutChangeListener(agdxVar.c);
        }
    }

    public final int a() {
        int i = this.af;
        return i == -1 ? this.S / 2 : i;
    }

    public final android.view.ViewOverlay b() {
        android.view.ViewGroup viewGroupG = agab.G(this);
        if (viewGroupG == null) {
            return null;
        }
        return viewGroupG.getOverlay();
    }

    public final java.lang.String c(float f) {
        return java.lang.String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", java.lang.Float.valueOf(f));
    }

    public final java.util.List d() {
        return new java.util.ArrayList(this.aB);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(android.view.MotionEvent motionEvent) {
        defpackage.agbi agbiVar = this.c;
        android.view.accessibility.AccessibilityManager accessibilityManager = ((ecj) agbiVar).a;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int i = 0;
                while (true) {
                    defpackage.agbj agbjVar = agbiVar.f;
                    if (i >= agbjVar.d().size()) {
                        i = -1;
                        break;
                    }
                    android.graphics.Rect rect = agbiVar.g;
                    agbjVar.f(i, rect);
                    if (rect.contains((int) x, (int) y)) {
                        break;
                    }
                    i++;
                }
                agbiVar.q(i);
                if (i == Integer.MIN_VALUE) {
                    if (!super.dispatchHoverEvent(motionEvent)) {
                        return false;
                    }
                }
            } else if (action == 10 && ((ecj) agbiVar).e != Integer.MIN_VALUE) {
                agbiVar.q(Integer.MIN_VALUE);
            } else if (!super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (!super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        this.r.setColor(s(this.aP));
        this.s.setColor(s(this.aO));
        this.v.setColor(s(this.aN));
        this.w.setColor(s(this.aM));
        this.x.setColor(s(this.aN));
        for (defpackage.agdx agdxVar : this.d) {
            if (agdxVar.isStateful()) {
                agdxVar.setState(getDrawableState());
            }
        }
        int i = 0;
        while (true) {
            java.util.List list = this.aZ;
            if (i >= list.size()) {
                android.graphics.Paint paint = this.u;
                paint.setColor(s(this.aL));
                paint.setAlpha(63);
                return;
            } else {
                if (((agaf) list.get(i)).isStateful()) {
                    ((agaf) list.get(i)).setState(getDrawableState());
                }
                i++;
            }
        }
    }

    public final void e(java.lang.Float... fArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collections.addAll(arrayList, fArr);
        N(arrayList);
    }

    final void f(int i, android.graphics.Rect rect) {
        int iO = this.T + ((int) (o(((java.lang.Float) d().get(i)).floatValue()) * this.aJ));
        int iR = r();
        int iMax = java.lang.Math.max(this.M, this.N) / 2;
        int iMax2 = java.lang.Math.max(this.U / 2, iMax);
        int iMax3 = java.lang.Math.max(this.V / 2, iMax);
        android.graphics.RectF rectF = new android.graphics.RectF(iO - iMax2, iR - iMax3, iO + iMax2, iR + iMax3);
        if (j()) {
            this.aY.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void g() {
        android.graphics.drawable.RippleDrawable rippleDrawableW;
        float fO = (o(((java.lang.Float) this.aB.get(this.aC)).floatValue()) * this.aJ) + this.T;
        int iR = r();
        if (!ae() && getMeasuredWidth() > 0 && (rippleDrawableW = w()) != null) {
            int i = this.W;
            float f = i;
            float[] fArr = {fO - f, iR - i, f + fO, i + iR};
            if (j()) {
                this.aY.mapPoints(fArr);
            }
            rippleDrawableW.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        float f2 = iR;
        com.google.android.material.focus.FocusRingDrawable focusRingDrawableX = x();
        if (focusRingDrawableX != null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166834);
            float f3 = this.U;
            float f4 = dimensionPixelOffset;
            float f5 = this.V;
            boolean zJ = j();
            float f6 = (f5 / 2.0f) + f4;
            float f7 = f2 + f6;
            float f8 = f2 - f6;
            float f9 = (f3 / 2.0f) + f4 + f4;
            float f10 = fO + f9;
            float f11 = fO - f9;
            float f12 = true != zJ ? f7 : f10;
            float f13 = true != zJ ? f8 : f11;
            if (true != zJ) {
                f7 = f10;
            }
            if (true != zJ) {
                f8 = f11;
            }
            focusRingDrawableX.mutate();
            defpackage.afts aftsVar = focusRingDrawableX.c;
            if (aftsVar.w == null) {
                aftsVar.w = new android.graphics.Rect();
            }
            focusRingDrawableX.c.w.set((int) f8, (int) f13, (int) f7, (int) f12);
        }
    }

    @Override // android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public final void h() {
        boolean zJ = j();
        boolean zI = i();
        float f = 1.2f;
        float f2 = 0.5f;
        if (!zJ) {
            f2 = 1.2f;
            f = 0.5f;
        } else if (zI) {
            f = -0.2f;
        }
        for (defpackage.agdx agdxVar : this.d) {
            agdxVar.l = f;
            agdxVar.m = f2;
            agdxVar.invalidateSelf();
        }
        int i = this.R;
        if (i == 0 || i == 1) {
            if (this.j == -1 || !isEnabled()) {
                H();
                return;
            } else {
                G(false);
                return;
            }
        }
        if (i == 2) {
            H();
            return;
        }
        if (i != 3) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "Unexpected labelBehavior: "));
        }
        if (isEnabled()) {
            android.graphics.Rect rect = new android.graphics.Rect();
            agab.G(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.bi) {
                G(true);
                return;
            }
        }
        H();
    }

    final boolean i() {
        return getLayoutDirection() == 1;
    }

    public final boolean j() {
        return this.O == 1;
    }

    public final boolean k(int i, float f) {
        android.view.View view;
        android.view.ViewParent parent;
        this.aC = i;
        if (java.lang.Math.abs(f - ((java.lang.Float) this.aB.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        i();
        int i2 = i + 1;
        int i3 = i - 1;
        this.aB.set(i, java.lang.Float.valueOf(dzk.A(f, i3 < 0 ? this.h : ((java.lang.Float) this.aB.get(i3)).floatValue() + 0.0f, i2 >= this.aB.size() ? this.i : ((java.lang.Float) this.aB.get(i2)).floatValue() + 0.0f)));
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((defpackage.rai) it.next()).h(this, ((java.lang.Float) this.aB.get(i)).floatValue(), true);
        }
        android.view.accessibility.AccessibilityManager accessibilityManager = this.y;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            java.lang.Runnable runnable = this.z;
            if (runnable == null) {
                this.z = new defpackage.agbh(this);
            } else {
                removeCallbacks(runnable);
            }
            defpackage.agbh agbhVar = this.z;
            agbhVar.a = i;
            postDelayed(agbhVar, 200L);
            defpackage.agbi agbiVar = this.c;
            if (i != Integer.MIN_VALUE && ((ecj) agbiVar).a.isEnabled() && (parent = (view = ((ecj) agbiVar).b).getParent()) != null) {
                android.view.accessibility.AccessibilityEvent accessibilityEventJ = agbiVar.j(i, 2048);
                accessibilityEventJ.setContentChangeTypes(0);
                parent.requestSendAccessibilityEvent(view, accessibilityEventJ);
            }
        }
        return true;
    }

    public final float l() {
        float fN = n();
        float f = (this.i - this.h) / fN;
        return f > 20.0f ? fN * java.lang.Math.round(f / 20.0f) : fN;
    }

    protected void m() {
        throw null;
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.bi = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.bg);
        getViewTreeObserver().addOnGlobalLayoutListener(this.bh);
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            z((defpackage.agdx) it.next());
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        defpackage.agbh agbhVar = this.z;
        if (agbhVar != null) {
            removeCallbacks(agbhVar);
        }
        this.B = false;
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            B((defpackage.agdx) it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.bg);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.bh);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f7 A[PHI: r3
      0x00f7: PHI (r3v4 int) = (r3v3 int), (r3v3 int), (r3v21 int), (r3v21 int) binds: [B:36:0x00e2, B:38:0x00e6, B:40:0x00ed, B:42:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int iQ;
        int iQ2;
        int i;
        float fQ;
        float f;
        float f2;
        android.graphics.RectF rectF;
        int iQ3;
        int i2;
        defpackage.agbj agbjVar = this;
        if (agbjVar.k) {
            agbjVar.X();
            agbjVar.P();
        }
        super.onDraw(canvas);
        int iR = agbjVar.r();
        int i3 = agbjVar.aJ;
        float[] fArrAh = agbjVar.ah();
        float f3 = iR;
        float f4 = agbjVar.S;
        float f5 = 0.5f;
        int i4 = 0;
        if (agbjVar.ah && fArrAh[0] == 0.5f) {
            iQ = agbjVar.aa;
        } else {
            iQ = agbjVar.q((agbjVar.i() || agbjVar.j()) ? agbjVar.aB.size() - 1 : 0);
        }
        int i5 = iQ;
        float f6 = 2.0f;
        float f7 = f4 / 2.0f;
        float f8 = f3 + f7;
        float f9 = f3 - f7;
        int i6 = agbjVar.T;
        int iA = i6 - agbjVar.a();
        float f10 = i3;
        float f11 = fArrAh[0] * f10;
        android.graphics.RectF rectF2 = agbjVar.aS;
        agbjVar.ai(iA, (i6 + f11) - i5, f9, f8, canvas, rectF2, 2, i5);
        if (agbjVar.ah && fArrAh[1] == 0.5f) {
            iQ2 = agbjVar.aa;
        } else {
            iQ2 = agbjVar.q((agbjVar.i() || agbjVar.j()) ? 0 : agbjVar.aB.size() - 1);
        }
        int i7 = iQ2;
        int i8 = agbjVar.T;
        float f12 = i8;
        float f13 = fArrAh[1] * f10;
        int iA2 = i8 + i3 + agbjVar.a();
        android.graphics.RectF rectF3 = agbjVar.aT;
        agbjVar.ai(f12 + f13 + i7, iA2, f9, f8, canvas, rectF3, 3, i7);
        int i9 = agbjVar.aJ;
        float[] fArrAh2 = agbjVar.ah();
        float f14 = agbjVar.T;
        float f15 = i9;
        float f16 = fArrAh2[1] * f15;
        float fQ2 = (fArrAh2[0] * f15) + f14;
        float fP = f14 + f16;
        int i10 = 2;
        if (fQ2 >= fP) {
            agbjVar.aR.setEmpty();
        } else {
            int i11 = 4;
            if (agbjVar.aB.size() != 1 || agbjVar.ah) {
                i = i11;
            } else {
                i11 = 3;
                if (agbjVar.i() || agbjVar.j()) {
                    i = i11;
                } else {
                    i = 2;
                }
            }
            int i12 = 0;
            while (i12 < agbjVar.aB.size()) {
                if (agbjVar.aB.size() > 1) {
                    fP = i12 > 0 ? agbjVar.p(((java.lang.Float) agbjVar.aB.get(i12 - 1)).floatValue()) : fQ2;
                    float fP2 = agbjVar.p(((java.lang.Float) agbjVar.aB.get(i12)).floatValue());
                    if (agbjVar.i() || agbjVar.j()) {
                        fQ2 = fP2;
                    } else {
                        fQ2 = fP;
                        fP = fP2;
                    }
                }
                int iA3 = agbjVar.a();
                float f17 = f5;
                int i13 = i - 1;
                if (i13 != 1) {
                    if (i13 != i10) {
                        if (i12 > 0) {
                            fQ2 += agbjVar.q(i12 - 1);
                            iQ3 = agbjVar.q(i12);
                        } else {
                            if (fArrAh2[1] == f17) {
                                fQ2 += agbjVar.q(i12);
                            } else if (fArrAh2[0] == f17) {
                                iQ3 = agbjVar.q(i12);
                            }
                            f = fP;
                            f6 = f6;
                        }
                        fP -= iQ3;
                        f = fP;
                        f6 = f6;
                    } else {
                        fQ2 += agbjVar.q(i12);
                        fQ = fP + iA3;
                    }
                    f2 = fQ2;
                    rectF = agbjVar.aR;
                    if (f2 >= f) {
                        rectF.setEmpty();
                    } else {
                        float f18 = iA3;
                        float f19 = agbjVar.S / f6;
                        rectF.set(f2, f3 - f19, f, f3 + f19);
                        agbjVar.aj(canvas, agbjVar.s, rectF, f18, i);
                    }
                    i12++;
                    fP = f;
                    fQ2 = f2;
                    f5 = f17;
                    f6 = f6;
                    i10 = 2;
                } else {
                    fQ2 -= iA3;
                    fQ = fP - agbjVar.q(i12);
                }
                f = fQ;
                f2 = fQ2;
                rectF = agbjVar.aR;
                if (f2 >= f) {
                    rectF.setEmpty();
                } else {
                    float f110 = iA3;
                    float f111 = agbjVar.S / f6;
                    rectF.set(f2, f3 - f111, f, f3 + f111);
                    agbjVar.aj(canvas, agbjVar.s, rectF, f110, i);
                }
                i12++;
                fP = f;
                fQ2 = f2;
                f5 = f17;
                f6 = f6;
                i10 = 2;
            }
        }
        android.graphics.Canvas canvas2 = canvas;
        float f20 = f6;
        if (agbjVar.i() || agbjVar.j()) {
            agbjVar.F(canvas2, agbjVar.aR, rectF2);
        } else {
            agbjVar.F(canvas2, agbjVar.aR, rectF3);
        }
        float[] fArr = agbjVar.aF;
        if (fArr != null && fArr.length != 0) {
            float[] fArrAh3 = agbjVar.ah();
            int iCeil = (int) java.lang.Math.ceil(fArrAh3[0] * ((agbjVar.aF.length / f20) - 1.0f));
            int iFloor = (int) java.lang.Math.floor(fArrAh3[1] * ((agbjVar.aF.length / f20) - 1.0f));
            if (iCeil > 0) {
                agbjVar.E(0, iCeil << 1, canvas2, agbjVar.v);
            }
            if (iCeil <= iFloor) {
                agbjVar.E(iCeil << 1, (iFloor + 1) << 1, canvas2, agbjVar.w);
            }
            int length = agbjVar.aF.length;
            int i14 = (iFloor + 1) << 1;
            if (i14 < length) {
                agbjVar.E(i14, length, canvas2, agbjVar.v);
            }
        }
        if (agbjVar.ae > 0 && !agbjVar.aB.isEmpty()) {
            java.util.ArrayList arrayList = agbjVar.aB;
            float fFloatValue = ((java.lang.Float) arrayList.get(arrayList.size() - 1)).floatValue();
            float f21 = agbjVar.i;
            if (fFloatValue < f21) {
                agbjVar.C(canvas2, agbjVar.p(f21), f3);
            }
            if (agbjVar.ah || (agbjVar.aB.size() > 1 && ((java.lang.Float) agbjVar.aB.get(0)).floatValue() > agbjVar.h)) {
                agbjVar.C(canvas2, agbjVar.p(agbjVar.h), f3);
            }
        }
        if ((agbjVar.aA || agbjVar.isFocused()) && agbjVar.isEnabled()) {
            int i15 = agbjVar.aJ;
            if (agbjVar.ae()) {
                float[] fArr2 = {agbjVar.T + (agbjVar.o(((java.lang.Float) agbjVar.aB.get(agbjVar.aC)).floatValue()) * i15), f3};
                if (agbjVar.j()) {
                    agbjVar.aY.mapPoints(fArr2);
                }
                canvas2.drawCircle(fArr2[0], fArr2[1], agbjVar.W, agbjVar.u);
            }
        }
        agbjVar.h();
        int i16 = agbjVar.aJ;
        while (i4 < agbjVar.aB.size()) {
            float fFloatValue2 = ((java.lang.Float) agbjVar.aB.get(i4)).floatValue();
            if (i4 < agbjVar.ba.size()) {
                i2 = iR;
                agbjVar.D(canvas2, i16, i2, fFloatValue2, (android.graphics.drawable.Drawable) agbjVar.ba.get(i4));
            } else {
                i2 = iR;
                if (!agbjVar.isEnabled()) {
                    canvas2.drawCircle(agbjVar.T + (agbjVar.o(fFloatValue2) * i16), f3, agbjVar.U / 2, agbjVar.t);
                }
                agbjVar.D(canvas2, i16, i2, fFloatValue2, (android.graphics.drawable.Drawable) agbjVar.aZ.get(i4));
            }
            i4++;
            agbjVar = this;
            canvas2 = canvas;
            iR = i2;
        }
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            K();
            this.j = -1;
            this.c.s(this.aC);
            return;
        }
        if (this.j == -1) {
            if (i == 1) {
                ac(Integer.MAX_VALUE);
            } else if (i == 2) {
                ac(Integer.MIN_VALUE);
            } else if (i == 17) {
                ak(Integer.MAX_VALUE);
            } else if (i == 66) {
                ak(Integer.MIN_VALUE);
            }
            this.j = this.aC;
        }
        K();
        O();
        this.c.u(this.aC);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        java.lang.Float fValueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.j = this.aC;
        boolean zIsLongPress = this.aK | keyEvent.isLongPress();
        this.aK = zIsLongPress;
        float fL = zIsLongPress ? l() : n();
        if (i == 21) {
            if (!i()) {
                fL = -fL;
            }
            fValueOf = java.lang.Float.valueOf(fL);
        } else if (i == 22) {
            if (i()) {
                fL = -fL;
            }
            fValueOf = java.lang.Float.valueOf(fL);
        } else if (i != 69) {
            fValueOf = (i == 70 || i == 81) ? java.lang.Float.valueOf(fL) : null;
        } else {
            fValueOf = java.lang.Float.valueOf(-fL);
        }
        if (fValueOf != null) {
            if (af(((java.lang.Float) this.aB.get(this.j)).floatValue() + fValueOf.floatValue())) {
                g();
                postInvalidate();
            }
            return true;
        }
        if (i != 61) {
            return super.onKeyDown(i, keyEvent);
        }
        K();
        if (keyEvent.hasNoModifiers()) {
            return ac(1);
        }
        if (keyEvent.isShiftPressed()) {
            return ac(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        this.aK = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.graphics.Rect rect = this.ay;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        if (!this.g.contains(rect)) {
            this.g.add(rect);
        }
        java.util.List list = this.g;
        int i5 = dzs.a;
        dzp.c(this, list);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(this.Q + ((this.R == 1 || ad()) ? ((defpackage.agdx) this.d.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (j()) {
            super.onMeasure(iMakeMeasureSpec, i2);
        } else {
            super.onMeasure(i, iMakeMeasureSpec);
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        com.google.android.material.slider.BaseSlider$SliderState baseSlider$SliderState = (com.google.android.material.slider.BaseSlider$SliderState) parcelable;
        super.onRestoreInstanceState(baseSlider$SliderState.getSuperState());
        this.h = baseSlider$SliderState.a;
        this.i = baseSlider$SliderState.b;
        N(baseSlider$SliderState.c);
        this.aD = baseSlider$SliderState.d;
        if (baseSlider$SliderState.e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.slider.BaseSlider$SliderState baseSlider$SliderState = new com.google.android.material.slider.BaseSlider$SliderState(super.onSaveInstanceState());
        baseSlider$SliderState.a = this.h;
        baseSlider$SliderState.b = this.i;
        baseSlider$SliderState.c = new java.util.ArrayList(this.aB);
        baseSlider$SliderState.d = this.aD;
        baseSlider$SliderState.e = hasFocus();
        return baseSlider$SliderState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (true == j()) {
            i = i2;
        }
        V(i);
        g();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float y = j() ? motionEvent.getY() : motionEvent.getX();
        float x = j() ? motionEvent.getX() : motionEvent.getY();
        float f = (y - this.T) / this.aJ;
        this.bf = f;
        float fMax = java.lang.Math.max(0.0f, f);
        this.bf = fMax;
        this.bf = java.lang.Math.min(1.0f, fMax);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.av = y;
            this.aw = x;
            this.az.clear();
            this.az = d();
            if ((j() || !ab(motionEvent)) && (!j() || !aa(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                m();
                requestFocus();
                this.aA = true;
                O();
                I();
                al();
                g();
                invalidate();
            }
        } else if (actionMasked == 1) {
            this.aA = false;
            android.view.MotionEvent motionEvent2 = this.ax;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                float x2 = this.ax.getX() - motionEvent.getX();
                float f2 = this.E;
                if (java.lang.Math.abs(x2) <= f2 && java.lang.Math.abs(this.ax.getY() - motionEvent.getY()) <= f2) {
                    m();
                    I();
                }
            }
            if (this.j != -1) {
                al();
                g();
                K();
                this.j = -1;
                J();
            }
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.aA) {
                if (!j() && ab(motionEvent)) {
                    if (java.lang.Math.abs(y - this.av) < this.E) {
                        return false;
                    }
                }
                if (j() && aa(motionEvent)) {
                    if (java.lang.Math.abs(x - this.aw) < this.E * 0.8f) {
                        return false;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m();
                this.aA = true;
                O();
                I();
            }
            al();
            g();
            invalidate();
        } else if (actionMasked == 3) {
            this.aA = false;
            if (this.j != -1 && !this.az.isEmpty()) {
                for (int i = 0; i < this.aB.size(); i++) {
                    if (i == this.j) {
                        k(i, ((java.lang.Float) this.az.get(i)).floatValue());
                        break;
                    }
                }
            }
            g();
            K();
            this.j = -1;
            J();
            invalidate();
        }
        setPressed(this.aA);
        this.ax = android.view.MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.bi = z;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(android.view.View view, int i) {
        android.view.ViewOverlay viewOverlayB;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (viewOverlayB = b()) == null) {
            return;
        }
        java.util.Iterator it = this.d.iterator();
        while (it.hasNext()) {
            viewOverlayB.remove((defpackage.agdx) it.next());
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(true != z ? 2 : 0, null);
    }

    public agbj(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970404);
    }

    public agbj(android.content.Context context) {
        this(context, null);
    }
}
