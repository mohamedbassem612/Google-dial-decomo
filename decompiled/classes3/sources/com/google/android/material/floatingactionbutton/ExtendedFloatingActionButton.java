package com.google.android.material.floatingactionbutton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements dul {
    public static final /* synthetic */ int B = 0;
    public static final android.util.Property p = new defpackage.afta(java.lang.Float.class);
    public static final android.util.Property q = new defpackage.aftb(java.lang.Float.class);
    public static final android.util.Property r = new defpackage.aftc(java.lang.Float.class);
    public static final android.util.Property s = new defpackage.aftd(java.lang.Float.class);
    public int A;
    private boolean C;
    private final defpackage.afto D;
    private final defpackage.afto E;
    private final defpackage.afto F;
    private final defpackage.afto G;
    private int H;
    private final dum I;
    private final int J;
    private final defpackage.amdx K;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public android.content.res.ColorStateList y;
    public int z;

    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public ExtendedFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132086105), attributeSet, i);
        this.t = 0;
        this.C = true;
        defpackage.amdx amdxVar = new defpackage.amdx();
        this.K = amdxVar;
        defpackage.aftg aftgVar = new defpackage.aftg(this, amdxVar);
        this.F = aftgVar;
        defpackage.aftf aftfVar = new defpackage.aftf(this, amdxVar);
        this.G = aftfVar;
        this.w = true;
        this.x = false;
        android.content.Context context2 = getContext();
        this.I = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.aftp.a, i, 2132086105, new int[0]);
        defpackage.afpg afpgVarB = defpackage.afpg.b(context2, typedArrayA, 5);
        defpackage.afpg afpgVarB2 = defpackage.afpg.b(context2, typedArrayA, 4);
        defpackage.afpg afpgVarB3 = defpackage.afpg.b(context2, typedArrayA, 2);
        defpackage.afpg afpgVarB4 = defpackage.afpg.b(context2, typedArrayA, 6);
        this.H = typedArrayA.getDimensionPixelSize(0, -1);
        int i2 = typedArrayA.getInt(3, 1);
        this.J = i2;
        this.u = getPaddingStart();
        this.v = getPaddingEnd();
        defpackage.amdx amdxVar2 = new defpackage.amdx();
        defpackage.afth afswVar = new defpackage.afsw(this, 0);
        defpackage.afsx afsxVar = new defpackage.afsx(this, afswVar);
        defpackage.afsy afsyVar = new defpackage.afsy(this, afsxVar, afswVar);
        ?? r3 = 1;
        if (i2 != 1) {
            afswVar = i2 != 2 ? afsyVar : afsxVar;
            r3 = 1;
        }
        defpackage.afte afteVar = new defpackage.afte(this, amdxVar2, afswVar, r3);
        this.E = afteVar;
        defpackage.afte afteVar2 = new defpackage.afte(this, amdxVar2, new defpackage.afsw(this, r3, null), false);
        this.D = afteVar2;
        aftgVar.a = afpgVarB;
        aftfVar.a = afpgVarB2;
        afteVar.a = afpgVarB3;
        afteVar2.a = afpgVarB4;
        typedArrayA.recycle();
        q(new agal(agal.k(context2, attributeSet, i, 2132086105, agal.a)));
        F();
    }

    private final void F() {
        this.y = getTextColors();
    }

    public final int A() {
        return this.y.getColorForState(getDrawableState(), 0);
    }

    public final void B(android.content.res.ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final void C() {
        java.lang.CharSequence text = null;
        if (!this.w && isClickable()) {
            text = getText();
            if (android.text.TextUtils.isEmpty(text)) {
                text = getContentDescription();
            }
        }
        if (android.text.TextUtils.equals(getTooltipText(), text)) {
            return;
        }
        setTooltipText(text);
    }

    public final boolean D() {
        int visibility = getVisibility();
        int i = this.t;
        if (visibility != 0) {
            if (i != 2) {
                return false;
            }
        } else if (i == 1) {
            return false;
        }
        return true;
    }

    public final void E(int i) {
        defpackage.afto aftoVar;
        if (i == 0) {
            aftoVar = this.F;
        } else if (i != 1) {
            aftoVar = i != 2 ? this.E : this.D;
        } else {
            aftoVar = this.G;
        }
        if (aftoVar.j()) {
            return;
        }
        if (this.C) {
            if (!isLaidOut()) {
                D();
            } else if (!isInEditMode()) {
                if (i == 2) {
                    android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.z = layoutParams.width;
                        this.A = layoutParams.height;
                    } else {
                        this.z = getWidth();
                        this.A = getHeight();
                    }
                }
                measure(0, 0);
                android.animation.AnimatorSet animatorSetA = aftoVar.a();
                animatorSetA.addListener(new defpackage.afsz(this, aftoVar));
                java.util.Iterator it = aftoVar.d().iterator();
                while (it.hasNext()) {
                    animatorSetA.addListener((android.animation.Animator.AnimatorListener) it.next());
                }
                animatorSetA.start();
                return;
            }
        }
        aftoVar.i();
        aftoVar.k();
    }

    public final dum a() {
        return this.I;
    }

    public final java.lang.CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // com.google.android.material.button.MaterialButton
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.w || !android.text.TextUtils.isEmpty(getText()) || this.c == null) {
            C();
        } else {
            this.w = false;
            this.D.i();
        }
    }

    public final void setClickable(boolean z) {
        super.setClickable(z);
        C();
    }

    public final void setContentDescription(java.lang.CharSequence charSequence) {
        super.setContentDescription(charSequence);
        C();
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.w || this.x) {
            return;
        }
        this.u = getPaddingStart();
        this.v = getPaddingEnd();
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.w || this.x) {
            return;
        }
        this.u = i;
        this.v = i3;
    }

    @Override // com.google.android.material.button.MaterialButton
    public final void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        C();
    }

    public final void setTextColor(int i) {
        super.setTextColor(i);
        F();
    }

    public final int y() {
        return (z() - this.e) / 2;
    }

    public final int z() {
        int i = this.H;
        return i < 0 ? (java.lang.Math.min(getPaddingStart(), getPaddingEnd()) << 1) + this.e : i;
    }

    public final void setTextColor(android.content.res.ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        F();
    }

    /* JADX INFO: compiled from: PG */
    public class ExtendedFloatingActionButtonBehavior extends dum {
        private android.graphics.Rect a;
        private final boolean b;
        private final boolean c;

        public ExtendedFloatingActionButtonBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aftp.b);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.c = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean g(android.view.View view) {
            dup layoutParams = view.getLayoutParams();
            if (layoutParams instanceof dup) {
                return layoutParams.a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
            }
            return false;
        }

        private final boolean h(android.view.View view, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && extendedFloatingActionButton.getLayoutParams().f == view.getId();
        }

        private final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!h(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            android.graphics.Rect rect = this.a;
            if (rect == null) {
                rect = new android.graphics.Rect();
                this.a = rect;
            }
            defpackage.afub.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                f(extendedFloatingActionButton);
            } else {
                e(extendedFloatingActionButton);
            }
            return true;
        }

        private final boolean j(android.view.View view, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!h(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + extendedFloatingActionButton.getLayoutParams().topMargin) {
                f(extendedFloatingActionButton);
            } else {
                e(extendedFloatingActionButton);
            }
            return true;
        }

        protected final void e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.B;
            extendedFloatingActionButton.E(true != this.c ? 0 : 3);
        }

        protected final void f(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.B;
            extendedFloatingActionButton.E(true == this.c ? 2 : 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* bridge */ /* synthetic */ boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect) {
            return false;
        }

        public final void onAttachedToLayoutParams(dup dupVar) {
            if (dupVar.h == 0) {
                dupVar.h = 80;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) view;
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                i(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view2, extendedFloatingActionButton);
                return false;
            }
            if (!g(view2)) {
                return false;
            }
            j(view2, extendedFloatingActionButton);
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton] */
        public final /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
            ?? r7 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) view;
            java.util.List listA = coordinatorLayout.a((android.view.View) r7);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.view.View view2 = (android.view.View) listA.get(i2);
                if (!(view2 instanceof com.google.android.material.appbar.AppBarLayout)) {
                    if (g(view2) && j(view2, r7)) {
                        break;
                    }
                } else {
                    if (i(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view2, r7)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j((android.view.View) r7, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
    }

    public ExtendedFloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969402);
    }

    public ExtendedFloatingActionButton(android.content.Context context) {
        this(context, null);
    }
}
