package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrz extends agaf implements android.graphics.drawable.Drawable.Callback, afvg {
    private android.content.res.ColorStateList E;
    private android.content.res.ColorStateList F;
    private float G;
    private android.content.res.ColorStateList H;
    private float I;
    private boolean J;
    private android.graphics.drawable.Drawable K;
    private android.content.res.ColorStateList L;
    private float M;
    private boolean N;
    private android.graphics.drawable.Drawable O;
    private android.content.res.ColorStateList P;
    private float Q;
    private boolean R;
    private android.graphics.drawable.Drawable S;
    private android.content.res.ColorStateList T;
    private float U;
    private float V;
    private float W;
    private float X;
    private final android.graphics.Paint Y;
    private final android.graphics.Paint.FontMetrics Z;
    private final android.graphics.RectF aa;
    private final android.graphics.PointF ab;
    private final android.graphics.Path ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private boolean ai;
    private int aj;
    private int ak;
    private android.graphics.ColorFilter al;
    private android.graphics.PorterDuffColorFilter am;
    private android.content.res.ColorStateList an;
    private android.graphics.PorterDuff.Mode ao;
    private int[] ap;
    private java.lang.ref.WeakReference aq;
    private boolean ar;
    public float b;
    public android.content.res.ColorStateList c;
    public java.lang.CharSequence d;
    public boolean e;
    public android.graphics.drawable.Drawable f;
    public boolean g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final android.content.Context l;
    public final defpackage.afvh m;
    public android.text.TextUtils.TruncateAt n;
    public boolean o;
    public int p;
    public static final int[] a = {android.R.attr.state_enabled};
    private static final android.graphics.drawable.ShapeDrawable D = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.OvalShape());

    private afrz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.G = -1.0f;
        this.Y = new android.graphics.Paint(1);
        this.Z = new android.graphics.Paint.FontMetrics();
        this.aa = new android.graphics.RectF();
        this.ab = new android.graphics.PointF();
        this.ac = new android.graphics.Path();
        this.ak = 255;
        this.ao = android.graphics.PorterDuff.Mode.SRC_IN;
        this.aq = new java.lang.ref.WeakReference(null);
        N(context);
        this.l = context;
        defpackage.afvh afvhVar = new defpackage.afvh(this);
        this.m = afvhVar;
        this.d = "";
        afvhVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        w(iArr);
        this.o = true;
        D.setTint(-1);
    }

    private final float ae() {
        android.graphics.drawable.Drawable drawable = this.ai ? this.S : this.K;
        float f = this.M;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final android.graphics.ColorFilter af() {
        android.graphics.ColorFilter colorFilter = this.al;
        return colorFilter == null ? this.am : colorFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ag(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f) {
                drawable.setTintList(this.P);
                if (drawable.isStateful()) {
                    drawable.setState(this.ap);
                    return;
                }
                return;
            }
            android.graphics.drawable.Drawable drawable2 = this.K;
            if (drawable == drawable2 && this.N) {
                drawable2.setTintList(this.L);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void ah(android.graphics.Rect rect, android.graphics.RectF rectF) {
        rectF.setEmpty();
        if (am() || al()) {
            float f = this.h + this.U;
            float fAe = ae();
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + fAe;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - fAe;
            }
            android.graphics.drawable.Drawable drawable = this.ai ? this.S : this.K;
            float fCeil = this.M;
            if (fCeil <= 0.0f && drawable != null) {
                fCeil = (float) java.lang.Math.ceil(agab.E(this.l, 24));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.bottom = rectF.top + fCeil;
        }
    }

    private final boolean ai() {
        return this.R && this.S != null && this.g;
    }

    private static boolean aj(android.content.res.ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean ak(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        android.content.res.ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        android.content.res.ColorStateList colorStateList2 = this.E;
        int iE = E(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.ad) : 0);
        boolean state = true;
        if (this.ad != iE) {
            this.ad = iE;
            zOnStateChange = true;
        }
        android.content.res.ColorStateList colorStateList3 = this.F;
        int iE2 = E(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ae) : 0);
        if (this.ae != iE2) {
            this.ae = iE2;
            zOnStateChange = true;
        }
        int iG = dwm.g(iE2, iE);
        if ((this.af != iG) | (H() == null)) {
            this.af = iG;
            R(android.content.res.ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        android.content.res.ColorStateList colorStateList4 = this.H;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.ag) : 0;
        if (this.ag != colorForState) {
            this.ag = colorForState;
            zOnStateChange = true;
        }
        defpackage.afza afzaVar = this.m.e;
        int colorForState2 = (afzaVar == null || (colorStateList = afzaVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.ah);
        if (this.ah != colorForState2) {
            this.ah = colorForState2;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int i = 0;
        while (true) {
            if (i < state2.length) {
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.g) {
                    z = true;
                    break;
                }
            }
            z = false;
            break;
        }
        if (this.ai == z || this.S == null) {
            z2 = false;
        } else {
            float fA = a();
            this.ai = z;
            if (fA != a()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        android.content.res.ColorStateList colorStateList5 = this.an;
        int colorForState3 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.aj) : 0;
        if (this.aj != colorForState3) {
            this.aj = colorForState3;
            this.am = agab.Q(this, this.an, this.ao);
        } else {
            state = zOnStateChange;
        }
        if (v(this.K)) {
            state |= this.K.setState(iArr);
        }
        if (v(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (v(this.f)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            java.lang.System.arraycopy(iArr, 0, iArr3, 0, length);
            java.lang.System.arraycopy(iArr2, 0, iArr3, length, length2);
            state |= this.f.setState(iArr3);
        }
        if (v(this.O)) {
            state |= this.O.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            i();
        }
        return state;
    }

    private final boolean al() {
        return this.R && this.S != null && this.ai;
    }

    private final boolean am() {
        return this.J && this.K != null;
    }

    private final boolean an() {
        return this.e && this.f != null;
    }

    private static final void ao(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025a  */
    /* JADX WARN: Code duplicated, block: B:107:0x0275  */
    /* JADX WARN: Code duplicated, block: B:111:0x0297  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:119:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:121:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:124:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:130:0x0313  */
    /* JADX WARN: Code duplicated, block: B:132:0x031e  */
    /* JADX WARN: Code duplicated, block: B:135:0x032d  */
    /* JADX WARN: Code duplicated, block: B:137:0x0338  */
    /* JADX WARN: Code duplicated, block: B:140:0x0347  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:48:0x0142  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01be  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01de  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x020e  */
    /* JADX WARN: Code duplicated, block: B:98:0x023f  */
    public static defpackage.afrz e(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        android.text.TextUtils.TruncateAt truncateAt;
        float dimension;
        android.graphics.drawable.Drawable drawableP;
        android.graphics.drawable.Drawable drawableD;
        android.content.res.ColorStateList colorStateListO;
        float dimension2;
        boolean z;
        android.graphics.drawable.Drawable drawableP2;
        float dimension3;
        float dimension4;
        float dimension5;
        float dimension6;
        float dimension7;
        float dimension8;
        float dimension9;
        float dimension10;
        float fA;
        float fA2;
        float fA3;
        float fA4;
        android.content.res.ColorStateList colorStateListO2;
        float fA5;
        float fA6;
        float fA7;
        float fA8;
        float fB;
        android.graphics.drawable.Drawable drawableMutate;
        float fB2;
        float fA9;
        float fA10;
        defpackage.afrz afrzVar = new defpackage.afrz(context, attributeSet, i, i2);
        android.content.Context context2 = afrzVar.l;
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.afsc.a, i, i2, new int[0]);
        afrzVar.ar = typedArrayA.hasValue(39);
        android.content.res.ColorStateList colorStateListO3 = agab.o(context2, typedArrayA, 25);
        if (afrzVar.E != colorStateListO3) {
            afrzVar.E = colorStateListO3;
            afrzVar.onStateChange(afrzVar.getState());
        }
        afrzVar.k(agab.o(context2, typedArrayA, 12));
        float dimension11 = typedArrayA.getDimension(20, 0.0f);
        if (afrzVar.b != dimension11) {
            afrzVar.b = dimension11;
            afrzVar.invalidateSelf();
            afrzVar.i();
        }
        if (typedArrayA.hasValue(13)) {
            float dimension12 = typedArrayA.getDimension(13, 0.0f);
            if (afrzVar.G != dimension12) {
                afrzVar.G = dimension12;
                afrzVar.q(afrzVar.es().c(dimension12));
            }
        }
        afrzVar.o(agab.o(context2, typedArrayA, 23));
        float dimension13 = typedArrayA.getDimension(24, 0.0f);
        if (afrzVar.I != dimension13) {
            afrzVar.I = dimension13;
            afrzVar.Y.setStrokeWidth(dimension13);
            if (afrzVar.ar) {
                super.aa(dimension13);
            }
            afrzVar.invalidateSelf();
        }
        android.content.res.ColorStateList colorStateListO4 = agab.o(context2, typedArrayA, 38);
        if (afrzVar.c != colorStateListO4) {
            afrzVar.c = colorStateListO4;
            afrzVar.onStateChange(afrzVar.getState());
        }
        afrzVar.s(typedArrayA.getText(5));
        defpackage.afza afzaVarS = agab.s(context2, typedArrayA);
        afzaVarS.l = typedArrayA.getDimension(1, afzaVarS.l);
        int iM = agab.m(typedArrayA, 34, 7);
        if (typedArrayA.hasValue(iM)) {
            afzaVarS.c = typedArrayA.getString(iM);
        }
        afrzVar.t(afzaVarS);
        int i3 = typedArrayA.getInt(3, 0);
        if (i3 == 1) {
            truncateAt = android.text.TextUtils.TruncateAt.START;
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    truncateAt = android.text.TextUtils.TruncateAt.END;
                }
                afrzVar.n(typedArrayA.getBoolean(19, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    afrzVar.n(typedArrayA.getBoolean(16, false));
                }
                afrzVar.l(agab.p(context2, typedArrayA, 15));
                if (typedArrayA.hasValue(18)) {
                    afrzVar.m(agab.o(context2, typedArrayA, 18));
                }
                dimension = typedArrayA.getDimension(17, -1.0f);
                if (afrzVar.M != dimension) {
                    fA9 = afrzVar.a();
                    afrzVar.M = dimension;
                    fA10 = afrzVar.a();
                    afrzVar.invalidateSelf();
                    if (fA9 != fA10) {
                        afrzVar.i();
                    }
                }
                afrzVar.p(typedArrayA.getBoolean(32, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    afrzVar.p(typedArrayA.getBoolean(27, false));
                }
                drawableP = agab.p(context2, typedArrayA, 26);
                drawableD = afrzVar.d();
                if (drawableD != drawableP) {
                    fB = afrzVar.b();
                    if (drawableP != null) {
                        drawableMutate = drawableP.mutate();
                    } else {
                        drawableMutate = null;
                    }
                    afrzVar.f = drawableMutate;
                    android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(afzc.b(afrzVar.c), afrzVar.f, D);
                    com.google.android.material.focus.FocusRingDrawable.c(context2, rippleDrawable, (agaf) null);
                    afrzVar.O = rippleDrawable;
                    fB2 = afrzVar.b();
                    ao(drawableD);
                    if (afrzVar.an()) {
                        afrzVar.ag(afrzVar.f);
                    }
                    afrzVar.invalidateSelf();
                    if (fB != fB2) {
                        afrzVar.i();
                    }
                }
                colorStateListO = agab.o(context2, typedArrayA, 31);
                if (afrzVar.P != colorStateListO) {
                    afrzVar.P = colorStateListO;
                    if (afrzVar.an()) {
                        afrzVar.f.setTintList(colorStateListO);
                    }
                    afrzVar.onStateChange(afrzVar.getState());
                }
                dimension2 = typedArrayA.getDimension(29, 0.0f);
                if (afrzVar.Q != dimension2) {
                    afrzVar.Q = dimension2;
                    afrzVar.invalidateSelf();
                    if (afrzVar.an()) {
                        afrzVar.i();
                    }
                }
                z = typedArrayA.getBoolean(6, false);
                if (afrzVar.g != z) {
                    afrzVar.g = z;
                    fA7 = afrzVar.a();
                    if (!z && afrzVar.ai) {
                        afrzVar.ai = false;
                    }
                    fA8 = afrzVar.a();
                    afrzVar.invalidateSelf();
                    if (fA7 != fA8) {
                        afrzVar.i();
                    }
                }
                afrzVar.j(typedArrayA.getBoolean(11, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    afrzVar.j(typedArrayA.getBoolean(9, false));
                }
                drawableP2 = agab.p(context2, typedArrayA, 8);
                if (afrzVar.S != drawableP2) {
                    fA5 = afrzVar.a();
                    afrzVar.S = drawableP2;
                    fA6 = afrzVar.a();
                    ao(afrzVar.S);
                    afrzVar.ag(afrzVar.S);
                    afrzVar.invalidateSelf();
                    if (fA5 != fA6) {
                        afrzVar.i();
                    }
                }
                if (typedArrayA.hasValue(10) && afrzVar.T != (colorStateListO2 = agab.o(context2, typedArrayA, 10))) {
                    afrzVar.T = colorStateListO2;
                    if (afrzVar.ai()) {
                        afrzVar.S.setTintList(colorStateListO2);
                    }
                    afrzVar.onStateChange(afrzVar.getState());
                }
                defpackage.afpg.b(context2, typedArrayA, 41);
                defpackage.afpg.b(context2, typedArrayA, 35);
                dimension3 = typedArrayA.getDimension(22, 0.0f);
                if (afrzVar.h != dimension3) {
                    afrzVar.h = dimension3;
                    afrzVar.invalidateSelf();
                    afrzVar.i();
                }
                dimension4 = typedArrayA.getDimension(37, 0.0f);
                if (afrzVar.U != dimension4) {
                    fA3 = afrzVar.a();
                    afrzVar.U = dimension4;
                    fA4 = afrzVar.a();
                    afrzVar.invalidateSelf();
                    if (fA3 != fA4) {
                        afrzVar.i();
                    }
                }
                dimension5 = typedArrayA.getDimension(36, 0.0f);
                if (afrzVar.V != dimension5) {
                    fA = afrzVar.a();
                    afrzVar.V = dimension5;
                    fA2 = afrzVar.a();
                    afrzVar.invalidateSelf();
                    if (fA != fA2) {
                        afrzVar.i();
                    }
                }
                dimension6 = typedArrayA.getDimension(43, 0.0f);
                if (afrzVar.i != dimension6) {
                    afrzVar.i = dimension6;
                    afrzVar.invalidateSelf();
                    afrzVar.i();
                }
                dimension7 = typedArrayA.getDimension(42, 0.0f);
                if (afrzVar.j != dimension7) {
                    afrzVar.j = dimension7;
                    afrzVar.invalidateSelf();
                    afrzVar.i();
                }
                dimension8 = typedArrayA.getDimension(30, 0.0f);
                if (afrzVar.W != dimension8) {
                    afrzVar.W = dimension8;
                    afrzVar.invalidateSelf();
                    if (afrzVar.an()) {
                        afrzVar.i();
                    }
                }
                dimension9 = typedArrayA.getDimension(28, 0.0f);
                if (afrzVar.X != dimension9) {
                    afrzVar.X = dimension9;
                    afrzVar.invalidateSelf();
                    if (afrzVar.an()) {
                        afrzVar.i();
                    }
                }
                dimension10 = typedArrayA.getDimension(14, 0.0f);
                if (afrzVar.k != dimension10) {
                    afrzVar.k = dimension10;
                    afrzVar.invalidateSelf();
                    afrzVar.i();
                }
                afrzVar.p = typedArrayA.getDimensionPixelSize(4, Integer.MAX_VALUE);
                typedArrayA.recycle();
                return afrzVar;
            }
            truncateAt = android.text.TextUtils.TruncateAt.MIDDLE;
        }
        afrzVar.n = truncateAt;
        afrzVar.n(typedArrayA.getBoolean(19, false));
        if (attributeSet != null) {
            afrzVar.n(typedArrayA.getBoolean(16, false));
        }
        afrzVar.l(agab.p(context2, typedArrayA, 15));
        if (typedArrayA.hasValue(18)) {
            afrzVar.m(agab.o(context2, typedArrayA, 18));
        }
        dimension = typedArrayA.getDimension(17, -1.0f);
        if (afrzVar.M != dimension) {
            fA9 = afrzVar.a();
            afrzVar.M = dimension;
            fA10 = afrzVar.a();
            afrzVar.invalidateSelf();
            if (fA9 != fA10) {
                afrzVar.i();
            }
        }
        afrzVar.p(typedArrayA.getBoolean(32, false));
        if (attributeSet != null) {
            afrzVar.p(typedArrayA.getBoolean(27, false));
        }
        drawableP = agab.p(context2, typedArrayA, 26);
        drawableD = afrzVar.d();
        if (drawableD != drawableP) {
            fB = afrzVar.b();
            if (drawableP != null) {
                drawableMutate = drawableP.mutate();
            } else {
                drawableMutate = null;
            }
            afrzVar.f = drawableMutate;
            android.graphics.drawable.RippleDrawable rippleDrawable2 = new android.graphics.drawable.RippleDrawable(afzc.b(afrzVar.c), afrzVar.f, D);
            com.google.android.material.focus.FocusRingDrawable.c(context2, rippleDrawable2, (agaf) null);
            afrzVar.O = rippleDrawable2;
            fB2 = afrzVar.b();
            ao(drawableD);
            if (afrzVar.an()) {
                afrzVar.ag(afrzVar.f);
            }
            afrzVar.invalidateSelf();
            if (fB != fB2) {
                afrzVar.i();
            }
        }
        colorStateListO = agab.o(context2, typedArrayA, 31);
        if (afrzVar.P != colorStateListO) {
            afrzVar.P = colorStateListO;
            if (afrzVar.an()) {
                afrzVar.f.setTintList(colorStateListO);
            }
            afrzVar.onStateChange(afrzVar.getState());
        }
        dimension2 = typedArrayA.getDimension(29, 0.0f);
        if (afrzVar.Q != dimension2) {
            afrzVar.Q = dimension2;
            afrzVar.invalidateSelf();
            if (afrzVar.an()) {
                afrzVar.i();
            }
        }
        z = typedArrayA.getBoolean(6, false);
        if (afrzVar.g != z) {
            afrzVar.g = z;
            fA7 = afrzVar.a();
            if (!z) {
                afrzVar.ai = false;
            }
            fA8 = afrzVar.a();
            afrzVar.invalidateSelf();
            if (fA7 != fA8) {
                afrzVar.i();
            }
        }
        afrzVar.j(typedArrayA.getBoolean(11, false));
        if (attributeSet != null) {
            afrzVar.j(typedArrayA.getBoolean(9, false));
        }
        drawableP2 = agab.p(context2, typedArrayA, 8);
        if (afrzVar.S != drawableP2) {
            fA5 = afrzVar.a();
            afrzVar.S = drawableP2;
            fA6 = afrzVar.a();
            ao(afrzVar.S);
            afrzVar.ag(afrzVar.S);
            afrzVar.invalidateSelf();
            if (fA5 != fA6) {
                afrzVar.i();
            }
        }
        if (typedArrayA.hasValue(10)) {
            afrzVar.T = colorStateListO2;
            if (afrzVar.ai()) {
                afrzVar.S.setTintList(colorStateListO2);
            }
            afrzVar.onStateChange(afrzVar.getState());
        }
        defpackage.afpg.b(context2, typedArrayA, 41);
        defpackage.afpg.b(context2, typedArrayA, 35);
        dimension3 = typedArrayA.getDimension(22, 0.0f);
        if (afrzVar.h != dimension3) {
            afrzVar.h = dimension3;
            afrzVar.invalidateSelf();
            afrzVar.i();
        }
        dimension4 = typedArrayA.getDimension(37, 0.0f);
        if (afrzVar.U != dimension4) {
            fA3 = afrzVar.a();
            afrzVar.U = dimension4;
            fA4 = afrzVar.a();
            afrzVar.invalidateSelf();
            if (fA3 != fA4) {
                afrzVar.i();
            }
        }
        dimension5 = typedArrayA.getDimension(36, 0.0f);
        if (afrzVar.V != dimension5) {
            fA = afrzVar.a();
            afrzVar.V = dimension5;
            fA2 = afrzVar.a();
            afrzVar.invalidateSelf();
            if (fA != fA2) {
                afrzVar.i();
            }
        }
        dimension6 = typedArrayA.getDimension(43, 0.0f);
        if (afrzVar.i != dimension6) {
            afrzVar.i = dimension6;
            afrzVar.invalidateSelf();
            afrzVar.i();
        }
        dimension7 = typedArrayA.getDimension(42, 0.0f);
        if (afrzVar.j != dimension7) {
            afrzVar.j = dimension7;
            afrzVar.invalidateSelf();
            afrzVar.i();
        }
        dimension8 = typedArrayA.getDimension(30, 0.0f);
        if (afrzVar.W != dimension8) {
            afrzVar.W = dimension8;
            afrzVar.invalidateSelf();
            if (afrzVar.an()) {
                afrzVar.i();
            }
        }
        dimension9 = typedArrayA.getDimension(28, 0.0f);
        if (afrzVar.X != dimension9) {
            afrzVar.X = dimension9;
            afrzVar.invalidateSelf();
            if (afrzVar.an()) {
                afrzVar.i();
            }
        }
        dimension10 = typedArrayA.getDimension(14, 0.0f);
        if (afrzVar.k != dimension10) {
            afrzVar.k = dimension10;
            afrzVar.invalidateSelf();
            afrzVar.i();
        }
        afrzVar.p = typedArrayA.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayA.recycle();
        return afrzVar;
    }

    public static boolean v(android.graphics.drawable.Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final float a() {
        if (!am() && !al()) {
            return 0.0f;
        }
        return this.V + this.U + ae();
    }

    public final float b() {
        if (an()) {
            return this.W + this.Q + this.X;
        }
        return 0.0f;
    }

    public final float c() {
        return this.ar ? B() : this.G;
    }

    public final android.graphics.drawable.Drawable d() {
        android.graphics.drawable.Drawable drawable = this.f;
        if (drawable != null) {
            return dzk.C(drawable);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void draw(android.graphics.Canvas canvas) {
        int i;
        android.graphics.Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.ak) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.ak);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        if (!this.ar) {
            android.graphics.Paint paint = this.Y;
            paint.setColor(this.ad);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.RectF rectF = this.aa;
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, c(), c(), paint);
        }
        if (!this.ar) {
            android.graphics.Paint paint2 = this.Y;
            paint2.setColor(this.ae);
            paint2.setStyle(android.graphics.Paint.Style.FILL);
            paint2.setColorFilter(af());
            android.graphics.RectF rectF2 = this.aa;
            rectF2.set(bounds);
            canvas2.drawRoundRect(rectF2, c(), c(), paint2);
        }
        if (this.ar) {
            super.draw(canvas);
        }
        if (this.I <= 0.0f || this.ar) {
            f = 2.0f;
        } else {
            android.graphics.Paint paint3 = this.Y;
            paint3.setColor(this.ag);
            paint3.setStyle(android.graphics.Paint.Style.STROKE);
            if (!this.ar) {
                paint3.setColorFilter(af());
            }
            android.graphics.RectF rectF3 = this.aa;
            f = 2.0f;
            rectF3.set(bounds.left + (this.I / 2.0f), bounds.top + (this.I / 2.0f), bounds.right - (this.I / 2.0f), bounds.bottom - (this.I / 2.0f));
            float f2 = this.G - (this.I / 2.0f);
            canvas2.drawRoundRect(rectF3, f2, f2, paint3);
        }
        android.graphics.Paint paint4 = this.Y;
        paint4.setColor(0);
        paint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.RectF rectF4 = this.aa;
        rectF4.set(bounds);
        if (this.ar) {
            android.graphics.RectF rectF5 = new android.graphics.RectF(bounds);
            android.graphics.Path path = this.ac;
            K(rectF5, path);
            super.L(canvas2, paint4, path, ((agaf) this).q.a.a(), ((agaf) this).A, I());
        } else {
            canvas2.drawRoundRect(rectF4, c(), c(), paint4);
        }
        if (am()) {
            ah(bounds, rectF4);
            float f3 = rectF4.left;
            float f4 = rectF4.top;
            canvas2.translate(f3, f4);
            this.K.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.K.draw(canvas2);
            canvas2.translate(-f3, -f4);
        }
        if (al()) {
            ah(bounds, rectF4);
            float f5 = rectF4.left;
            float f6 = rectF4.top;
            canvas2.translate(f5, f6);
            this.S.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.S.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (this.o && this.d != null) {
            android.graphics.PointF pointF = this.ab;
            pointF.set(0.0f, 0.0f);
            android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
            if (this.d != null) {
                float fA = this.h + a() + this.i;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fA;
                    align = android.graphics.Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fA;
                    align = android.graphics.Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                defpackage.afvh afvhVar = this.m;
                android.graphics.Paint.FontMetrics fontMetrics = this.Z;
                afvhVar.a.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF4.setEmpty();
            if (this.d != null) {
                float fA2 = this.h + a() + this.i;
                float fB = this.k + b() + this.j;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + fA2;
                    rectF4.right = bounds.right - fB;
                } else {
                    rectF4.left = bounds.left + fB;
                    rectF4.right = bounds.right - fA2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            defpackage.afvh afvhVar2 = this.m;
            if (afvhVar2.e != null) {
                afvhVar2.a.drawableState = getState();
                afvhVar2.d(this.l);
            }
            android.text.TextPaint textPaint = afvhVar2.a;
            textPaint.setTextAlign(align);
            boolean z = java.lang.Math.round(afvhVar2.a(this.d.toString())) > java.lang.Math.round(rectF4.width());
            if (z) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF4);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            java.lang.CharSequence charSequenceEllipsize = this.d;
            if (z && this.n != null) {
                charSequenceEllipsize = android.text.TextUtils.ellipsize(charSequenceEllipsize, textPaint, rectF4.width(), this.n);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint);
            canvas2 = canvas;
            if (z) {
                canvas2.restoreToCount(i2);
            }
        }
        if (an()) {
            rectF4.setEmpty();
            if (an()) {
                float f7 = this.k + this.X;
                if (getLayoutDirection() == 0) {
                    rectF4.right = bounds.right - f7;
                    rectF4.left = rectF4.right - this.Q;
                } else {
                    rectF4.left = bounds.left + f7;
                    rectF4.right = rectF4.left + this.Q;
                }
                rectF4.top = bounds.exactCenterY() - (this.Q / f);
                rectF4.bottom = rectF4.top + this.Q;
            }
            float f8 = rectF4.left;
            float f9 = rectF4.top;
            canvas2.translate(f8, f9);
            this.f.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.O.setBounds(this.f.getBounds());
            this.O.jumpToCurrentState();
            this.O.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.ak < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final defpackage.afza g() {
        return this.m.e;
    }

    public final int getAlpha() {
        return this.ak;
    }

    public final android.graphics.ColorFilter getColorFilter() {
        return this.al;
    }

    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    public final int getIntrinsicWidth() {
        return java.lang.Math.min(java.lang.Math.round(this.h + a() + this.i + this.m.a(this.d.toString()) + this.j + b() + this.k), this.p);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(android.graphics.Outline outline) {
        android.graphics.Outline outline2;
        if (this.ar) {
            super.getOutline(outline);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.G);
        } else {
            outline.setRoundRect(bounds, this.G);
            outline2 = outline;
        }
        outline2.setAlpha(this.ak / 255.0f);
    }

    public final void h() {
        i();
        invalidateSelf();
    }

    protected final void i() {
        defpackage.afry afryVar = (defpackage.afry) this.aq.get();
        if (afryVar != null) {
            afryVar.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        defpackage.afza afzaVar;
        android.content.res.ColorStateList colorStateList;
        return aj(this.E) || aj(this.F) || aj(this.H) || !((afzaVar = this.m.e) == null || (colorStateList = afzaVar.k) == null || !colorStateList.isStateful()) || ai() || v(this.K) || v(this.S) || aj(this.an);
    }

    public final void j(boolean z) {
        if (this.R != z) {
            boolean zAl = al();
            this.R = z;
            boolean zAl2 = al();
            if (zAl != zAl2) {
                android.graphics.drawable.Drawable drawable = this.S;
                if (zAl2) {
                    ag(drawable);
                } else {
                    ao(drawable);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void k(android.content.res.ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    public final void l(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = this.K;
        android.graphics.drawable.Drawable drawableC = drawable2 != null ? dzk.C(drawable2) : null;
        if (drawableC != drawable) {
            float fA = a();
            this.K = drawable != null ? drawable.mutate() : null;
            float fA2 = a();
            ao(drawableC);
            if (am()) {
                ag(this.K);
            }
            invalidateSelf();
            if (fA != fA2) {
                i();
            }
        }
    }

    public final void m(android.content.res.ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (am()) {
                this.K.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void n(boolean z) {
        if (this.J != z) {
            boolean zAm = am();
            this.J = z;
            boolean zAm2 = am();
            if (zAm != zAm2) {
                android.graphics.drawable.Drawable drawable = this.K;
                if (zAm2) {
                    ag(drawable);
                } else {
                    ao(drawable);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void o(android.content.res.ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (this.ar) {
                Y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (am()) {
            zOnLayoutDirectionChanged |= this.K.setLayoutDirection(i);
        }
        if (al()) {
            zOnLayoutDirectionChanged |= this.S.setLayoutDirection(i);
        }
        if (an()) {
            zOnLayoutDirectionChanged |= this.f.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    protected final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (am()) {
            zOnLevelChange |= this.K.setLevel(i);
        }
        if (al()) {
            zOnLevelChange |= this.S.setLevel(i);
        }
        if (an()) {
            zOnLevelChange |= this.f.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.ar) {
            super.onStateChange(iArr);
        }
        return ak(iArr, this.ap);
    }

    public final void p(boolean z) {
        if (this.e != z) {
            boolean zAn = an();
            this.e = z;
            boolean zAn2 = an();
            if (zAn != zAn2) {
                android.graphics.drawable.Drawable drawable = this.f;
                if (zAn2) {
                    ag(drawable);
                } else {
                    ao(drawable);
                }
                invalidateSelf();
                i();
            }
        }
    }

    public final void r(defpackage.afry afryVar) {
        this.aq = new java.lang.ref.WeakReference(afryVar);
    }

    public final void s(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (android.text.TextUtils.equals(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.m.g();
        invalidateSelf();
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.ak != i) {
            this.ak = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.al != colorFilter) {
            this.al = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.an != colorStateList) {
            this.an = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.ao != mode) {
            this.ao = mode;
            this.am = agab.Q(this, this.an, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (am()) {
            visible |= this.K.setVisible(z, z2);
        }
        if (al()) {
            visible |= this.S.setVisible(z, z2);
        }
        if (an()) {
            visible |= this.f.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(defpackage.afza afzaVar) {
        this.m.c(afzaVar, this.l);
    }

    public final void u(int i) {
        t(new defpackage.afza(this.l, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean w(int[] iArr) {
        if (!java.util.Arrays.equals(this.ap, iArr)) {
            this.ap = iArr;
            if (an()) {
                return ak(getState(), iArr);
            }
        }
        return false;
    }
}
