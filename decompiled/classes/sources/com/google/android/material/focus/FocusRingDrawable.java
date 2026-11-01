package com.google.android.material.focus;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class FocusRingDrawable extends android.graphics.drawable.DrawableWrapper {
    public static final int[] a = {android.R.attr.state_focused, android.R.attr.state_window_focused};
    private static final android.animation.TimeInterpolator d = new android.view.animation.OvershootInterpolator(4.0f);
    private static final android.util.FloatProperty e = new defpackage.aftq();
    public float b;
    public afts c;
    private final android.graphics.Paint f;
    private final android.graphics.RectF g;
    private final android.graphics.Rect h;
    private final android.graphics.Path i;
    private final android.graphics.Path j;
    private final android.graphics.Matrix k;
    private final defpackage.agan l;
    private java.lang.ref.WeakReference m;
    private float n;
    private android.animation.ObjectAnimator o;
    private boolean p;
    private boolean q;
    private boolean r;

    private FocusRingDrawable(afts aftsVar, android.content.res.Resources resources) {
        super(null);
        this.f = new android.graphics.Paint(1);
        this.g = new android.graphics.RectF();
        this.h = new android.graphics.Rect();
        this.i = new android.graphics.Path();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Matrix();
        this.l = defpackage.agan.a();
        this.n = -1.0f;
        this.b = 1.0f;
        this.q = false;
        this.r = false;
        afts aftsVar2 = new afts(aftsVar);
        this.c = aftsVar2;
        android.graphics.drawable.Drawable.ConstantState constantState = aftsVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        k();
    }

    public static android.graphics.drawable.Drawable a(android.content.Context context, android.graphics.drawable.Drawable drawable) {
        return m(context) ? new com.google.android.material.focus.FocusRingDrawable(context, drawable) : drawable;
    }

    public static com.google.android.material.focus.FocusRingDrawable b(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof com.google.android.material.focus.FocusRingDrawable) {
            return (com.google.android.material.focus.FocusRingDrawable) drawable;
        }
        if (drawable instanceof android.graphics.drawable.DrawableWrapper) {
            android.graphics.drawable.Drawable drawable2 = ((android.graphics.drawable.DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof com.google.android.material.focus.FocusRingDrawable) {
                return (com.google.android.material.focus.FocusRingDrawable) drawable2;
            }
        }
        if (drawable instanceof android.graphics.drawable.LayerDrawable) {
            android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
            for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
                android.graphics.drawable.Drawable drawable3 = layerDrawable.getDrawable(i);
                if (drawable3 instanceof com.google.android.material.focus.FocusRingDrawable) {
                    return (com.google.android.material.focus.FocusRingDrawable) drawable3;
                }
            }
        }
        return null;
    }

    public static com.google.android.material.focus.FocusRingDrawable c(android.content.Context context, android.graphics.drawable.LayerDrawable layerDrawable, defpackage.agaf agafVar) {
        if (!m(context)) {
            return null;
        }
        com.google.android.material.focus.FocusRingDrawable focusRingDrawable = new com.google.android.material.focus.FocusRingDrawable(context, new android.graphics.drawable.ColorDrawable(0));
        if (agafVar != null) {
            focusRingDrawable.d(agafVar);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    private final float f() {
        afts aftsVar = this.c;
        return aftsVar.p + ((aftsVar.j / 2.0f) * this.b);
    }

    private final void g(android.graphics.RectF rectF) {
        android.graphics.Rect rect = this.c.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((defpackage.agaf) this.m.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof android.graphics.drawable.RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = (android.graphics.drawable.RippleDrawable) getDrawable();
        android.graphics.Rect rect2 = this.h;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(java.lang.Math.max(0, (rect2.width() / 2) - radius), java.lang.Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    private final void h(android.graphics.Canvas canvas, android.graphics.Path path, float f, float f2, int i) {
        android.graphics.RectF rectF = this.g;
        g(rectF);
        float f3 = f + f;
        float fWidth = f3 / rectF.width();
        float fHeight = f3 / rectF.height();
        android.graphics.Matrix matrix = this.k;
        matrix.reset();
        matrix.postScale(1.0f - fWidth, 1.0f - fHeight, rectF.centerX(), rectF.centerY());
        android.graphics.Path path2 = this.i;
        path.transform(matrix, path2);
        float f4 = f2 * this.b;
        android.graphics.Paint paint = this.f;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    private final void i(android.graphics.Canvas canvas, float f, float f2, float f3, int i) {
        android.graphics.RectF rectF = this.g;
        g(rectF);
        rectF.inset(f2, f2);
        float f4 = f3 * this.b;
        android.graphics.Paint paint = this.f;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    private final void j(android.content.res.Resources.Theme theme) {
        android.util.TypedValue typedValueX;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(aftu.a);
        int i = this.c.d;
        if (i != Integer.MIN_VALUE && (typedValueX = defpackage.agab.x(theme, i)) != null) {
            this.c.c = typedValueX.data != 0;
            afts.a(this.c);
        }
        afts aftsVar = this.c;
        if (!aftsVar.e) {
            aftsVar.c = defpackage.agab.z(theme, 2130969472, aftsVar.c);
        }
        afts aftsVar2 = this.c;
        if (aftsVar2.c) {
            aftsVar2.f = q(aftsVar2.f, theme, aftsVar2.g, typedArrayObtainStyledAttributes, 5, -16777216);
            afts aftsVar3 = this.c;
            aftsVar3.h = q(aftsVar3.h, theme, aftsVar3.i, typedArrayObtainStyledAttributes, 1, -1);
            afts aftsVar4 = this.c;
            aftsVar4.j = r(aftsVar4.j, theme, aftsVar4.k, typedArrayObtainStyledAttributes, 6, 2131167111);
            afts aftsVar5 = this.c;
            aftsVar5.l = r(aftsVar5.l, theme, aftsVar5.m, typedArrayObtainStyledAttributes, 3, 2131167110);
            afts aftsVar6 = this.c;
            aftsVar6.n = r(aftsVar6.n, theme, aftsVar6.o, typedArrayObtainStyledAttributes, 7, 0);
            afts aftsVar7 = this.c;
            aftsVar7.p = r(aftsVar7.p, theme, aftsVar7.q, typedArrayObtainStyledAttributes, 4, 0);
            if (java.lang.Float.isNaN(this.c.p)) {
                this.c.p = 0.0f;
            }
            afts aftsVar8 = this.c;
            aftsVar8.r = r(aftsVar8.r, theme, aftsVar8.s, typedArrayObtainStyledAttributes, 2, 2131167109);
            afts aftsVar9 = this.c;
            int i2 = aftsVar9.u;
            if (i2 != Integer.MIN_VALUE) {
                aftsVar9.t = new defpackage.agal(defpackage.agal.i(theme, i2));
            } else {
                int i3 = aftsVar9.v;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = 2130969480;
                }
                android.util.TypedValue typedValueX2 = defpackage.agab.x(theme, i3);
                if (typedValueX2 != null) {
                    this.c.t = new defpackage.agal(defpackage.agal.i(theme, typedValueX2.resourceId));
                }
            }
            afts aftsVar10 = this.c;
            int i4 = aftsVar10.y;
            if (i4 != Integer.MIN_VALUE) {
                aftsVar10.x = o(theme, i4);
            } else {
                android.util.TypedValue typedValueX3 = defpackage.agab.x(theme, 2130969481);
                if (typedValueX3 != null && typedValueX3.resourceId != 0) {
                    this.c.x = o(theme, typedValueX3.resourceId);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        k();
    }

    private final void k() {
        android.graphics.Paint paint = this.f;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        if (java.lang.Float.isNaN(this.c.j)) {
            return;
        }
        paint.setStrokeWidth(this.c.j);
    }

    private final void l(defpackage.agak agakVar) {
        android.graphics.RectF rectF = this.g;
        g(rectF);
        defpackage.agal agalVarB = agakVar.b(a);
        if (!agalVarB.h(rectF)) {
            this.l.c(agalVarB, null, 1.0f, rectF, null, this.j);
            this.n = -1.0f;
        } else {
            float f = f();
            rectF.inset(f, f);
            this.n = agalVarB.b.a(rectF);
            this.j.reset();
        }
    }

    private static boolean m(android.content.Context context) {
        return defpackage.agab.z(context.getTheme(), 2130969472, false);
    }

    private static final int n(android.content.res.TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 1) {
            return typedArray.getResourceId(i, Integer.MIN_VALUE);
        }
        return Integer.MIN_VALUE;
    }

    private static final int[] o(android.content.res.Resources.Theme theme, int i) {
        android.content.res.TypedArray typedArrayObtainTypedArray = theme.getResources().obtainTypedArray(i);
        int[] iArr = new int[typedArrayObtainTypedArray.length()];
        for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    private static final int p(android.content.res.TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 2) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (typedArray.getValue(i, typedValue)) {
                return typedValue.data;
            }
        }
        return Integer.MIN_VALUE;
    }

    private static final int q(int i, android.content.res.Resources.Theme theme, int i2, android.content.res.TypedArray typedArray, int i3, int i4) {
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (i2 != Integer.MIN_VALUE) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (theme.resolveAttribute(i2, typedValue, true)) {
                return typedValue.data;
            }
        }
        return typedArray.getColor(i3, i4);
    }

    private static final float r(float f, android.content.res.Resources.Theme theme, int i, android.content.res.TypedArray typedArray, int i2, int i3) {
        if (!java.lang.Float.isNaN(f)) {
            return f;
        }
        android.content.res.Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!java.lang.Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
        j(theme);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(defpackage.agaf agafVar) {
        this.m = new java.lang.ref.WeakReference(agafVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r4
      0x0043: PHI (r4v2 android.graphics.Path) = (r4v1 android.graphics.Path), (r4v22 android.graphics.Path) binds: [B:7:0x0026, B:13:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Path path;
        float fMax;
        android.graphics.drawable.Drawable drawable;
        int radius;
        super.draw(canvas);
        if (this.c.c && this.q) {
            float f = f();
            afts aftsVar = this.c;
            float f2 = aftsVar.p + aftsVar.r;
            float f3 = (aftsVar.l / 2.0f) * this.b;
            android.graphics.Path path2 = this.j;
            if (path2.isEmpty()) {
                java.lang.ref.WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path2 = ((defpackage.agaf) this.m.get()).w;
                    if (!path2.isEmpty()) {
                        path = path2;
                    }
                }
                path = null;
            } else {
                path = path2;
            }
            float f4 = f2 + f3;
            afts aftsVar2 = this.c;
            if (path != null) {
                h(canvas, path, f4, aftsVar2.l, aftsVar2.h);
                afts aftsVar3 = this.c;
                h(canvas, path, f, aftsVar3.j, aftsVar3.f);
                return;
            }
            if (java.lang.Float.isNaN(aftsVar2.n)) {
                fMax = this.n;
                if (fMax < 0.0f) {
                    java.lang.ref.WeakReference weakReference2 = this.m;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        drawable = getDrawable();
                        if ((drawable instanceof android.graphics.drawable.RippleDrawable) || (radius = ((android.graphics.drawable.RippleDrawable) drawable).getRadius()) < 0) {
                            fMax = 0.0f;
                        } else {
                            fMax = radius;
                        }
                    } else {
                        defpackage.agaf agafVar = (defpackage.agaf) this.m.get();
                        float fX = agafVar.x(agafVar.I(), agafVar.q.a.a(), agafVar.A);
                        if (fX >= 0.0f) {
                            fX *= agafVar.q.k;
                        }
                        if (fX >= 0.0f) {
                            fMax = java.lang.Math.max(0.0f, fX - (this.c.j / 2.0f));
                        } else {
                            drawable = getDrawable();
                            if (drawable instanceof android.graphics.drawable.RippleDrawable) {
                                fMax = 0.0f;
                            } else {
                                fMax = 0.0f;
                            }
                        }
                    }
                }
            } else {
                fMax = this.c.n;
            }
            float fMax2 = java.lang.Math.max(0.0f, fMax - (this.c.j / 2.0f));
            afts aftsVar4 = this.c;
            i(canvas, fMax2, f4, aftsVar4.l, aftsVar4.h);
            afts aftsVar5 = this.c;
            i(canvas, fMax, f, aftsVar5.j, aftsVar5.f);
        }
    }

    public final void e(defpackage.agak agakVar) {
        this.c.t = agakVar;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        afts aftsVar = this.c;
        if (aftsVar.a == null) {
            return null;
        }
        aftsVar.b = getChangingConfigurations();
        return this.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            return super.hasFocusStateSpecified() || this.c.c;
        } catch (java.lang.NoSuchMethodError unused) {
            return this.c.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, aftu.a, 0, 0) : resources.obtainAttributes(attributeSet, aftu.a);
        this.c.d = p(typedArrayObtainStyledAttributes, 0);
        if (this.c.d == Integer.MIN_VALUE && typedArrayObtainStyledAttributes.hasValue(0)) {
            afts aftsVar = this.c;
            aftsVar.c = typedArrayObtainStyledAttributes.getBoolean(0, aftsVar.c);
            afts.a(this.c);
        }
        this.c.g = p(typedArrayObtainStyledAttributes, 5);
        afts aftsVar2 = this.c;
        if (aftsVar2.g == Integer.MIN_VALUE) {
            aftsVar2.f = typedArrayObtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.c.i = p(typedArrayObtainStyledAttributes, 1);
        afts aftsVar3 = this.c;
        if (aftsVar3.i == Integer.MIN_VALUE) {
            aftsVar3.h = typedArrayObtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.c.k = p(typedArrayObtainStyledAttributes, 6);
        afts aftsVar4 = this.c;
        if (aftsVar4.k == Integer.MIN_VALUE) {
            aftsVar4.j = typedArrayObtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.c.m = p(typedArrayObtainStyledAttributes, 3);
        afts aftsVar5 = this.c;
        if (aftsVar5.m == Integer.MIN_VALUE) {
            aftsVar5.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.c.m = p(typedArrayObtainStyledAttributes, 3);
        afts aftsVar6 = this.c;
        if (aftsVar6.m == Integer.MIN_VALUE) {
            aftsVar6.l = typedArrayObtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.c.o = p(typedArrayObtainStyledAttributes, 7);
        afts aftsVar7 = this.c;
        if (aftsVar7.o == Integer.MIN_VALUE) {
            aftsVar7.n = typedArrayObtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.c.q = p(typedArrayObtainStyledAttributes, 4);
        afts aftsVar8 = this.c;
        if (aftsVar8.q == Integer.MIN_VALUE) {
            aftsVar8.p = typedArrayObtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.c.s = p(typedArrayObtainStyledAttributes, 2);
        afts aftsVar9 = this.c;
        if (aftsVar9.s == Integer.MIN_VALUE) {
            aftsVar9.r = typedArrayObtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.c.v = p(typedArrayObtainStyledAttributes, 8);
        this.c.u = n(typedArrayObtainStyledAttributes, 8);
        this.c.y = n(typedArrayObtainStyledAttributes, 9);
        typedArrayObtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        android.graphics.drawable.Drawable colorDrawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
            } else if (next == 2) {
                colorDrawable = android.graphics.drawable.Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (colorDrawable == null) {
            colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        }
        setDrawable(colorDrawable);
        this.c.a = colorDrawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        return drawable != null && da$.ExternalSyntheticApiModelOutline0.m(drawable);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.c.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        android.animation.ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        if (!this.r && super.mutate() == this) {
            this.c = new afts(this.c);
            android.graphics.drawable.Drawable drawable = getDrawable();
            if (drawable != null) {
                this.c.a = drawable.getConstantState();
            }
            this.r = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        float[] fArrM;
        float fM;
        super.onBoundsChange(rect);
        afts aftsVar = this.c;
        if (aftsVar.c) {
            defpackage.agak agakVar = aftsVar.t;
            if (agakVar != null) {
                l(agakVar);
                return;
            }
            android.graphics.drawable.Drawable drawable = getDrawable();
            defpackage.agal agalVar = null;
            if (drawable instanceof android.graphics.drawable.ShapeDrawable) {
                android.graphics.Outline outline = new android.graphics.Outline();
                ((android.graphics.drawable.ShapeDrawable) drawable).getOutline(outline);
                if (aa$.ExternalSyntheticApiModelOutline1.m(outline) > 0.0f) {
                    defpackage.aguv aguvVar = new defpackage.aguv((byte[]) null);
                    aguvVar.k(aa$.ExternalSyntheticApiModelOutline1.m(outline));
                    agalVar = new defpackage.agal(aguvVar);
                }
            } else if (drawable instanceof android.graphics.drawable.GradientDrawable) {
                android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) drawable;
                try {
                    fArrM = aa$.ExternalSyntheticApiModelOutline1.m(gradientDrawable);
                } catch (java.lang.NullPointerException unused) {
                    fArrM = null;
                }
                if (fArrM != null) {
                    defpackage.aguv aguvVar2 = new defpackage.aguv((byte[]) null);
                    aguvVar2.i(java.lang.Math.min(fArrM[0], fArrM[1]));
                    aguvVar2.j(java.lang.Math.min(fArrM[2], fArrM[3]));
                    aguvVar2.h(java.lang.Math.min(fArrM[4], fArrM[5]));
                    aguvVar2.g(java.lang.Math.min(fArrM[6], fArrM[7]));
                    agalVar = new defpackage.agal(aguvVar2);
                } else {
                    try {
                        fM = aa$.ExternalSyntheticApiModelOutline1.m(gradientDrawable);
                    } catch (java.lang.NullPointerException unused2) {
                        fM = -1.0f;
                    }
                    if (fM > 0.0f) {
                        defpackage.aguv aguvVar3 = new defpackage.aguv((byte[]) null);
                        aguvVar3.k(fM);
                        agalVar = new defpackage.agal(aguvVar3);
                    }
                }
            }
            if (agalVar != null) {
                l(agalVar);
            } else {
                this.n = -1.0f;
                this.j.reset();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        afts aftsVar = this.c;
        if (!aftsVar.c) {
            this.q = false;
            return super.onStateChange(iArr);
        }
        boolean zStateSetMatches = android.util.StateSet.stateSetMatches(aftsVar.x, iArr);
        boolean z = this.q != zStateSetMatches;
        this.q = zStateSetMatches;
        if (z && iArr.length > 0 && !this.p) {
            android.animation.ObjectAnimator objectAnimator = this.o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.o = null;
            }
            if (zStateSetMatches) {
                android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, e, 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(300L);
                objectAnimatorOfFloat.setInterpolator(d);
                objectAnimatorOfFloat.addListener(new aftr(this));
                this.o = objectAnimatorOfFloat;
                objectAnimatorOfFloat.start();
            } else {
                this.b = 1.0f;
            }
        }
        this.p = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.f = new android.graphics.Paint(1);
        this.g = new android.graphics.RectF();
        this.h = new android.graphics.Rect();
        this.i = new android.graphics.Path();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Matrix();
        this.l = defpackage.agan.a();
        this.n = -1.0f;
        this.b = 1.0f;
        this.q = false;
        this.r = false;
        this.c = new afts((afts) null);
    }

    public FocusRingDrawable(android.content.Context context, android.graphics.drawable.Drawable drawable) {
        super(drawable);
        this.f = new android.graphics.Paint(1);
        this.g = new android.graphics.RectF();
        this.h = new android.graphics.Rect();
        this.i = new android.graphics.Path();
        this.j = new android.graphics.Path();
        this.k = new android.graphics.Matrix();
        this.l = defpackage.agan.a();
        this.n = -1.0f;
        this.b = 1.0f;
        this.q = false;
        this.r = false;
        afts aftsVar = new afts((afts) null);
        this.c = aftsVar;
        if (drawable != null) {
            aftsVar.a = drawable.getConstantState();
        }
        j(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(afts aftsVar, android.content.res.Resources resources, aftt afttVar) {
        this(aftsVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
