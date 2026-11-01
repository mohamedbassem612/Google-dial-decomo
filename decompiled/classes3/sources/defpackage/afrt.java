package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrt extends hk {
    private static final int e = 2132086101;
    private static final int[] f = {2130970454};
    private static final int[] g = {2130970453};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, 2130970453}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = android.content.res.Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    android.content.res.ColorStateList b;
    final android.content.res.ColorStateList c;
    public int[] d;
    private final java.util.LinkedHashSet j;
    private android.content.res.ColorStateList k;
    private boolean l;
    private final boolean m;
    private final boolean n;
    private final java.lang.CharSequence o;
    private android.graphics.drawable.Drawable p;
    private android.graphics.drawable.Drawable q;
    private boolean r;
    private final android.graphics.PorterDuff.Mode s;
    private int t;
    private boolean u;
    private java.lang.CharSequence v;
    private android.widget.CompoundButton.OnCheckedChangeListener w;
    private final glw x;
    private final gls y;

    /* JADX WARN: Illegal instructions before constructor call */
    public afrt(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.ColorStateList colorStateListAv;
        int i2 = e;
        super(agdv.a(context, attributeSet, 2130968842, i2), attributeSet, 2130968842);
        new java.util.LinkedHashSet();
        this.j = new java.util.LinkedHashSet();
        android.content.Context context2 = getContext();
        glw glwVar = new glw(context2);
        android.content.res.Resources resources = context2.getResources();
        android.content.res.Resources.Theme theme = context2.getTheme();
        int i3 = dwk.a;
        android.graphics.drawable.Drawable drawable = resources.getDrawable(2131231848, theme);
        drawable.setCallback(glwVar.d);
        new glv(drawable.getConstantState());
        glwVar.e = drawable;
        this.x = glwVar;
        this.y = new defpackage.afrr(this);
        android.content.Context context3 = getContext();
        android.content.res.ColorStateList buttonTintList = this.b;
        if (buttonTintList == null) {
            buttonTintList = super.getButtonTintList() != null ? super.getButtonTintList() : null;
        }
        this.b = buttonTintList;
        hm hmVar = ((hk) this).a;
        if (hmVar != null) {
            hmVar.b = true;
            hmVar.a();
        }
        ajxw ajxwVarF = afvl.f(context3, attributeSet, defpackage.afru.a, 2130968842, i2, new int[0]);
        this.q = ajxwVarF.t(2);
        if (this.p != null && agab.B(context3)) {
            int iR = ajxwVarF.r(0, 0);
            int iR2 = ajxwVarF.r(1, 0);
            if (iR == i && iR2 == 0) {
                super.setButtonDrawable((android.graphics.drawable.Drawable) null);
                this.p = den.bO(context3, 2131231847);
                this.r = true;
                if (this.q == null) {
                    this.q = den.bO(context3, 2131231849);
                }
            }
        }
        this.c = agab.av(context3, ajxwVarF, 3);
        this.s = a.q(ajxwVarF.o(4, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        this.l = ajxwVarF.y(11, false);
        this.m = ajxwVarF.y(6, true);
        this.n = ajxwVarF.y(9, false);
        this.o = ajxwVarF.v(8);
        if (ajxwVarF.z(7)) {
            a(ajxwVarF.o(7, 0));
        }
        if (ajxwVarF.z(10) && (colorStateListAv = agab.av(context3, ajxwVarF, 10)) != null) {
            android.graphics.drawable.Drawable background = getBackground();
            background = background instanceof android.graphics.drawable.DrawableWrapper ? ((android.graphics.drawable.DrawableWrapper) background).getDrawable() : background;
            if (background instanceof android.graphics.drawable.RippleDrawable) {
                ((android.graphics.drawable.RippleDrawable) background).setColor(colorStateListAv);
            }
        }
        ajxwVarF.x();
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void b() {
        android.content.res.ColorStateList colorStateList;
        android.animation.Animator.AnimatorListener animatorListener;
        this.p = agab.U(this.p, this.b, getButtonTintMode());
        android.graphics.drawable.Drawable drawable = this.q;
        android.content.res.ColorStateList colorStateList2 = this.c;
        this.q = agab.U(drawable, colorStateList2, this.s);
        if (this.r) {
            glw glwVar = this.x;
            if (glwVar != null) {
                gls glsVar = this.y;
                if (glsVar != null) {
                    android.graphics.drawable.Drawable drawable2 = glwVar.e;
                    if (drawable2 != null) {
                        ((android.graphics.drawable.AnimatedVectorDrawable) drawable2).unregisterAnimationCallback(glsVar.a());
                    }
                    java.util.ArrayList arrayList = glwVar.c;
                    if (arrayList != null) {
                        arrayList.remove(glsVar);
                        if (glwVar.c.size() == 0 && (animatorListener = glwVar.b) != null) {
                            glwVar.a.c.removeListener(animatorListener);
                            glwVar.b = null;
                        }
                    }
                }
                if (glsVar != null) {
                    android.graphics.drawable.Drawable drawable3 = glwVar.e;
                    if (drawable3 != null) {
                        ((android.graphics.drawable.AnimatedVectorDrawable) drawable3).registerAnimationCallback(glsVar.a());
                    } else {
                        if (glwVar.c == null) {
                            glwVar.c = new java.util.ArrayList();
                        }
                        if (!glwVar.c.contains(glsVar)) {
                            glwVar.c.add(glsVar);
                            if (glwVar.b == null) {
                                glwVar.b = new glt(glwVar);
                            }
                            glwVar.a.c.addListener(glwVar.b);
                        }
                    }
                }
            }
            android.graphics.drawable.Drawable drawable4 = this.p;
            if ((drawable4 instanceof android.graphics.drawable.AnimatedStateListDrawable) && glwVar != null) {
                ((android.graphics.drawable.AnimatedStateListDrawable) drawable4).addTransition(2131427756, 2131429355, glwVar, false);
                ((android.graphics.drawable.AnimatedStateListDrawable) this.p).addTransition(2131428413, 2131429355, glwVar, false);
            }
        }
        android.graphics.drawable.Drawable drawable5 = this.p;
        if (drawable5 != null && (colorStateList = this.b) != null) {
            drawable5.setTintList(colorStateList);
        }
        android.graphics.drawable.Drawable drawable6 = this.q;
        if (drawable6 != null && colorStateList2 != null) {
            drawable6.setTintList(colorStateList2);
        }
        super.setButtonDrawable(agab.R(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void c() {
        java.lang.String string;
        if (this.v == null) {
            int i2 = this.t;
            if (i2 == 1) {
                string = getResources().getString(2132019377);
            } else {
                string = i2 == 0 ? getResources().getString(2132019379) : getResources().getString(2132019378);
            }
            super.setStateDescription(string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i2) {
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            c();
            if (this.u) {
                return;
            }
            this.u = true;
            java.util.LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                java.util.Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((defpackage.afrs) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.w) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            android.view.autofill.AutofillManager autofillManagerM11m = defpackage.aa$$ExternalSyntheticApiModelOutline0.m11m(getContext().getSystemService(defpackage.aa$$ExternalSyntheticApiModelOutline0.m24m$1()));
            if (autofillManagerM11m != null) {
                autofillManagerM11m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    public final android.graphics.drawable.Drawable getButtonDrawable() {
        return this.p;
    }

    public final android.content.res.ColorStateList getButtonTintList() {
        return this.b;
    }

    public final boolean isChecked() {
        return this.t == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            android.content.res.ColorStateList colorStateList = this.k;
            if (colorStateList == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int iX = agab.X(this, 2130968944);
                int iX2 = agab.X(this, 2130968952);
                int iX3 = agab.X(this, 2130969105);
                int iX4 = agab.X(this, 2130969053);
                android.content.res.ColorStateList colorStateList2 = new android.content.res.ColorStateList(iArr, new int[]{agab.ab(iX3, iX2, 1.0f), agab.ab(iX3, iX, 1.0f), agab.ab(iX3, iX4, 0.54f), agab.ab(iX3, iX4, 0.38f), agab.ab(iX3, iX4, 0.38f)});
                this.k = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }

    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(iArrOnCreateDrawableState, g);
        }
        this.d = agab.T(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void onDraw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        if (!this.m || !android.text.TextUtils.isEmpty(getText()) || (drawable = this.p) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == agab.L(this) ? -1 : 1;
        int width = getWidth() - drawable.getIntrinsicWidth();
        int iSave = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            android.graphics.Rect bounds = drawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null || !this.n) {
            return;
        }
        accessibilityNodeInfo.setText(java.lang.String.valueOf(accessibilityNodeInfo.getText()) + ", " + java.lang.String.valueOf(this.o));
    }

    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.checkbox.MaterialCheckBox$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.checkbox.MaterialCheckBox$SavedState materialCheckBox$SavedState = (com.google.android.material.checkbox.MaterialCheckBox$SavedState) parcelable;
        super.onRestoreInstanceState(materialCheckBox$SavedState.getSuperState());
        a(materialCheckBox$SavedState.a);
    }

    public final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.checkbox.MaterialCheckBox$SavedState materialCheckBox$SavedState = new com.google.android.material.checkbox.MaterialCheckBox$SavedState(super.onSaveInstanceState());
        materialCheckBox$SavedState.a = this.t;
        return materialCheckBox$SavedState;
    }

    public final void setButtonDrawable(int i2) {
        setButtonDrawable(den.bO(getContext(), i2));
    }

    public final void setButtonTintList(android.content.res.ColorStateList colorStateList) {
        if (this.b != colorStateList) {
            this.b = colorStateList;
            b();
        }
    }

    public final void setButtonTintMode(android.graphics.PorterDuff.Mode mode) {
        hm hmVar = ((hk) this).a;
        if (hmVar != null) {
            hmVar.a = mode;
            hmVar.c = true;
            hmVar.a();
        }
        b();
    }

    public final void setChecked(boolean z) {
        a(z ? 1 : 0);
    }

    public final void setOnCheckedChangeListener(android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }

    public final void setStateDescription(java.lang.CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            c();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public final void toggle() {
        a(!isChecked() ? 1 : 0);
    }

    public final void setButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.p = drawable;
        this.r = false;
        b();
    }
}
