package com.google.android.material.chip;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class Chip extends hk implements defpackage.afry, agaw, defpackage.afuh {
    private static final int h = 2132086091;
    public defpackage.afrz c;
    public android.widget.CompoundButton.OnCheckedChangeListener d;
    public boolean e;
    public final android.graphics.Rect f;
    public defpackage.aprf g;
    private android.graphics.drawable.InsetDrawable k;
    private android.graphics.drawable.RippleDrawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private final android.graphics.RectF s;
    private final defpackage.afzb t;
    public static final android.graphics.Rect b = new android.graphics.Rect();
    private static final int[] i = {android.R.attr.state_selected};
    private static final int[] j = {android.R.attr.state_checkable};

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public Chip(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        int i3 = h;
        super(agdv.a(context, attributeSet, i2, i3), attributeSet, i2);
        this.f = new android.graphics.Rect();
        this.s = new android.graphics.RectF();
        this.t = new defpackage.afrv(this);
        android.content.Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                android.util.Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new java.lang.UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                android.util.Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        defpackage.afrz afrzVarE = defpackage.afrz.e(context2, attributeSet, i2, i3);
        int[] iArr = defpackage.afsc.a;
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, iArr, i2, i3, new int[0]);
        this.p = typedArrayA.getBoolean(33, false);
        this.r = (int) java.lang.Math.ceil(typedArrayA.getDimension(21, agab.A(context2)));
        typedArrayA.recycle();
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != afrzVarE) {
            if (afrzVar != null) {
                afrzVar.r(null);
            }
            this.c = afrzVarE;
            afrzVarE.o = false;
            afrzVarE.r(this);
            n(this.r);
        }
        afrzVarE.Q(getElevation());
        android.content.res.TypedArray typedArrayA2 = afvl.a(context2, attributeSet, iArr, i2, i3, new int[0]);
        boolean zHasValue = typedArrayA2.hasValue(39);
        typedArrayA2.recycle();
        new defpackage.afrx(this, this);
        o();
        dzs.i(this, (dye) null);
        if (!zHasValue) {
            setOutlineProvider(new defpackage.afrw(this));
        }
        setChecked(this.m);
        setText(afrzVarE.d);
        setEllipsize(afrzVarE.n);
        s();
        if (!this.c.o) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        r();
        if (this.p) {
            setMinHeight(this.r);
        }
        this.q = getLayoutDirection();
        super.setOnCheckedChangeListener(new gfe(this, 6));
    }

    private final void a() {
        if (this.k != null) {
            this.k = null;
            setMinWidth(0);
            defpackage.afrz afrzVar = this.c;
            setMinHeight((int) (afrzVar != null ? afrzVar.b : 0.0f));
            d();
        }
    }

    private final void b(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
        }
    }

    private final void c(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
        }
    }

    private final void d() {
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(afzc.b(this.c.c), g(), null);
        com.google.android.material.focus.FocusRingDrawable.c(getContext(), rippleDrawable, this.c);
        this.l = rippleDrawable;
        setBackground(rippleDrawable);
        r();
    }

    private final void r() {
        defpackage.afrz afrzVar;
        if (android.text.TextUtils.isEmpty(getText()) || (afrzVar = this.c) == null) {
            return;
        }
        float fB = afrzVar.k + afrzVar.j + afrzVar.b();
        int iA = (int) (afrzVar.h + afrzVar.i + afrzVar.a());
        int i2 = (int) fB;
        if (this.k != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.k.getPadding(rect);
            iA += rect.left;
            i2 += rect.right;
        }
        setPaddingRelative(iA, getPaddingTop(), i2, getPaddingBottom());
    }

    private final void s() {
        android.text.TextPaint paint = getPaint();
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            paint.drawableState = afrzVar.getState();
        }
        defpackage.afrz afrzVar2 = this.c;
        defpackage.afza afzaVarG = afrzVar2 != null ? afrzVar2.g() : null;
        if (afzaVarG != null) {
            afzaVarG.c(getContext(), paint, this.t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    protected final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        defpackage.afrz afrzVar = this.c;
        if (afrzVar == null || !defpackage.afrz.v(afrzVar.f)) {
            return;
        }
        defpackage.afrz afrzVar2 = this.c;
        ?? IsEnabled = isEnabled();
        if (this.e) {
            i2 = IsEnabled;
            i2 = IsEnabled + 1;
        }
        i2 = IsEnabled;
        int i3 = i2;
        if (this.o) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (this.n) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (isChecked()) {
            i5 = i4 + 1;
        }
        int[] iArr = new int[i5];
        int i6 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i6 = 1;
        }
        if (this.e) {
            iArr[i6] = 16842908;
            i6++;
        }
        if (this.o) {
            iArr[i6] = 16843623;
            i6++;
        }
        if (this.n) {
            iArr[i6] = 16842919;
            i6++;
        }
        if (isChecked()) {
            iArr[i6] = 16842913;
        }
        if (afrzVar2.w(iArr)) {
            invalidate();
        }
    }

    public final android.graphics.RectF e() {
        android.graphics.RectF rectF = this.s;
        rectF.setEmpty();
        o();
        return rectF;
    }

    public final agal es() {
        return this.c.es();
    }

    public final android.graphics.drawable.Drawable g() {
        android.graphics.drawable.InsetDrawable insetDrawable = this.k;
        return insetDrawable == null ? this.c : insetDrawable;
    }

    public final java.lang.CharSequence getAccessibilityClassName() {
        if (m()) {
            android.view.ViewParent parent = getParent();
            if ((parent instanceof com.google.android.material.chip.ChipGroup) && ((com.google.android.material.chip.ChipGroup) parent).c()) {
                return "android.widget.RadioButton";
            }
        } else if (!isClickable()) {
            return "android.view.View";
        }
        return "android.widget.Button";
    }

    public final android.text.TextUtils.TruncateAt getEllipsize() {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            return afrzVar.n;
        }
        return null;
    }

    public final java.lang.String getFontVariationSettings() {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar == null) {
            return super.getFontVariationSettings();
        }
        defpackage.afza afzaVarG = afrzVar.g();
        if (afzaVarG != null) {
            return afzaVarG.c;
        }
        return null;
    }

    @Override // defpackage.afry
    public final void h() {
        n(this.r);
        requestLayout();
        invalidateOutline();
    }

    public final void i(android.content.res.ColorStateList colorStateList) {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.k(colorStateList);
        }
    }

    public final void j(android.graphics.drawable.Drawable drawable) {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.l(drawable);
        }
    }

    public final void k(int i2) {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.l(den.bO(afrzVar.l, i2));
        }
    }

    public final void l(android.content.res.ColorStateList colorStateList) {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.m(colorStateList);
        }
    }

    public final boolean m() {
        defpackage.afrz afrzVar = this.c;
        return afrzVar != null && afrzVar.g;
    }

    public final void n(int i2) {
        int i3;
        this.r = i2;
        if (!this.p) {
            if (this.k != null) {
                a();
                return;
            } else {
                d();
                return;
            }
        }
        int iMax = java.lang.Math.max(0, i2 - this.c.getIntrinsicHeight());
        int iMax2 = java.lang.Math.max(0, i2 - this.c.getIntrinsicWidth());
        if (iMax2 > 0) {
            i3 = iMax2 >> 1;
        } else {
            if (iMax <= 0) {
                if (this.k != null) {
                    a();
                    return;
                } else {
                    d();
                    return;
                }
            }
            i3 = 0;
        }
        int i4 = iMax > 0 ? iMax >> 1 : 0;
        if (this.k != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.k.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                d();
                return;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.k = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) this.c, i3, i4, i3, i4);
        d();
    }

    public final void o() {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        agab.h(this, this.c);
    }

    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        if (m()) {
            mergeDrawableStates(iArrOnCreateDrawableState, j);
        }
        return iArrOnCreateDrawableState;
    }

    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            b(e().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            b(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof com.google.android.material.chip.ChipGroup) {
            com.google.android.material.chip.ChipGroup chipGroup = (com.google.android.material.chip.ChipGroup) getParent();
            ebd ebdVar = new ebd(accessibilityNodeInfo);
            if (!chipGroup.e) {
                i2 = -1;
                break;
            }
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= chipGroup.getChildCount()) {
                    i2 = -1;
                    break;
                }
                java.lang.Object childAt = chipGroup.getChildAt(i3);
                if ((childAt instanceof com.google.android.material.chip.Chip) && chipGroup.b(i3)) {
                    if (((com.google.android.material.chip.Chip) childAt) == this) {
                        i2 = i4;
                        break;
                    }
                    i4++;
                }
                i3++;
            }
            java.lang.Object tag = getTag(2131428811);
            ebdVar.v(ni.r(tag instanceof java.lang.Integer ? ((java.lang.Integer) tag).intValue() : -1, 1, i2, 1, false, isChecked()));
        }
    }

    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i2) {
        return (e().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? aa$.ExternalSyntheticApiModelOutline1.m(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i2);
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.q != i2) {
            this.q = i2;
            r();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.e()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L41
        L21:
            boolean r0 = r5.n
            if (r0 == 0) goto L41
            if (r1 != 0) goto L48
            r5.c(r3)
            goto L48
        L2b:
            boolean r0 = r5.n
            if (r0 == 0) goto L34
            r5.playSoundEffect(r3)
            r0 = r2
            goto L35
        L34:
            r0 = r3
        L35:
            r5.c(r3)
            if (r0 != 0) goto L48
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.c(r2)
            goto L48
        L41:
            boolean r5 = super.onTouchEvent(r6)
            if (r5 != 0) goto L48
            r2 = r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // defpackage.afuh
    public final void p(defpackage.aprf aprfVar) {
        this.g = aprfVar;
    }

    public final void q(agal agalVar) {
        this.c.q(agalVar);
    }

    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        if (drawable == g() || drawable == this.l) {
            super.setBackground(drawable);
        } else {
            android.util.Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundColor(int i2) {
        android.util.Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        if (drawable == g() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        } else {
            android.util.Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundResource(int i2) {
        android.util.Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        android.util.Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        android.util.Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar == null) {
            this.m = z;
        } else if (afrzVar.g) {
            super.setChecked(z);
        }
    }

    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables((android.graphics.drawable.Drawable) null, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative((android.graphics.drawable.Drawable) null, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i3, 0, i5);
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(0, i3, 0, i5);
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.Q(f);
        }
    }

    public final void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        if (this.c != null) {
            if (truncateAt == android.text.TextUtils.TruncateAt.MARQUEE) {
                throw new java.lang.UnsupportedOperationException("Text within a chip are not allowed to scroll.");
            }
            super.setEllipsize(truncateAt);
            defpackage.afrz afrzVar = this.c;
            if (afrzVar != null) {
                afrzVar.n = truncateAt;
            }
        }
    }

    public final boolean setFontVariationSettings(java.lang.String str) {
        super.setFontVariationSettings(str);
        defpackage.afrz afrzVar = this.c;
        if (afrzVar == null) {
            return false;
        }
        defpackage.afza afzaVarG = afrzVar.g();
        if (afzaVarG != null) {
            afzaVarG.c = str;
        }
        s();
        return true;
    }

    public final void setGravity(int i2) {
        if (i2 != 8388627) {
            android.util.Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    public final void setLayoutDirection(int i2) {
        if (this.c != null) {
            super.setLayoutDirection(i2);
        }
    }

    public final void setLines(int i2) {
        if (i2 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    public final void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    public final void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.p = i2;
        }
    }

    public final void setMinLines(int i2) {
        if (i2 > 1) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    public final void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.d = onCheckedChangeListener;
    }

    public final void setSingleLine(boolean z) {
        if (!z) {
            throw new java.lang.UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(true);
    }

    public final void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(true != afrzVar.o ? charSequence : null, bufferType);
            defpackage.afrz afrzVar2 = this.c;
            if (afrzVar2 != null) {
                afrzVar2.s(charSequence);
            }
        }
    }

    public final void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.u(i2);
        }
        s();
    }

    public final void setTextSize(int i2, float f) {
        super.setTextSize(i2, f);
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            float fApplyDimension = android.util.TypedValue.applyDimension(i2, f, getResources().getDisplayMetrics());
            defpackage.afza afzaVarG = afrzVar.g();
            if (afzaVarG != null) {
                afzaVarG.l = fApplyDimension;
                afrzVar.m.a.setTextSize(fApplyDimension);
                afrzVar.h();
            }
        }
        s();
    }

    public final void setTextAppearance(android.content.Context context, int i2) {
        super.setTextAppearance(context, i2);
        defpackage.afrz afrzVar = this.c;
        if (afrzVar != null) {
            afrzVar.u(i2);
        }
        s();
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null) {
            throw new java.lang.UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, drawable2, (android.graphics.drawable.Drawable) null, drawable4);
            return;
        }
        throw new java.lang.UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    public Chip(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968874);
    }

    public Chip(android.content.Context context) {
        this(context, null);
    }
}
