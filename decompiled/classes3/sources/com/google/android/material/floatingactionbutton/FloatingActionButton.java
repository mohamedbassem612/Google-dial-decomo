package com.google.android.material.floatingactionbutton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FloatingActionButton extends defpackage.afvq implements agaw, dul {
    public int a;
    boolean b;
    final android.graphics.Rect c;
    private android.content.res.ColorStateList e;
    private android.graphics.PorterDuff.Mode f;
    private android.content.res.ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final android.graphics.Rect l;
    private defpackage.aftn m;
    private final defpackage.agca n;
    private final aaaj o;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$1, reason: invalid class name */
    /* JADX INFO: compiled from: PG */
    public class AnonymousClass1 {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton this$0;
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener val$listener;

        public AnonymousClass1(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
            this.val$listener = onVisibilityChangedListener;
            j$.util.Objects.requireNonNull(floatingActionButton);
            this.this$0 = floatingActionButton;
        }

        public void onHidden() {
            this.val$listener.onHidden(this.this$0);
        }

        public void onShown() {
            this.val$listener.onShown(this.this$0);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class ShadowDelegateImpl {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton this$0;

        public ShadowDelegateImpl(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            j$.util.Objects.requireNonNull(floatingActionButton);
            this.this$0 = floatingActionButton;
        }

        public float getRadius() {
            return this.this$0.b() / 2.0f;
        }

        public boolean isCompatPaddingEnabled() {
            return this.this$0.b;
        }

        public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
            if (drawable != null) {
                com.google.android.material.floatingactionbutton.FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        public void setShadowPadding(int i, int i2, int i3, int i4) {
            this.this$0.c.set(i, i2, i3, i4);
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = this.this$0;
            int i5 = floatingActionButton.a;
            floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
        }
    }

    /* JADX INFO: compiled from: PG */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Size {
    }

    /* JADX INFO: compiled from: PG */
    class TransformationCallbackWrapper {
        private final defpackage.afpi listener;
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton this$0;

        TransformationCallbackWrapper(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, defpackage.afpi afpiVar) {
            j$.util.Objects.requireNonNull(floatingActionButton);
            this.this$0 = floatingActionButton;
            this.listener = afpiVar;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof com.google.android.material.floatingactionbutton.FloatingActionButton.TransformationCallbackWrapper) && ((com.google.android.material.floatingactionbutton.FloatingActionButton.TransformationCallbackWrapper) obj).listener.equals(this.listener);
        }

        public int hashCode() {
            return this.listener.hashCode();
        }

        public void onScaleChanged() {
            this.listener.a();
        }

        public void onTranslationChanged() {
            this.listener.b();
        }
    }

    public FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.LayerDrawable layerDrawable;
        super(agdv.a(context, attributeSet, i, 2132085321), attributeSet, i);
        this.c = new android.graphics.Rect();
        this.l = new android.graphics.Rect();
        android.content.Context context2 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.aftp.c, i, 2132085321, new int[0]);
        this.e = agab.o(context2, typedArrayA, 1);
        this.f = a.q(typedArrayA.getInt(2, -1), (android.graphics.PorterDuff.Mode) null);
        this.g = agab.o(context2, typedArrayA, 12);
        this.i = typedArrayA.getInt(7, -1);
        this.j = typedArrayA.getDimensionPixelSize(6, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(4, 0.0f);
        float dimension2 = typedArrayA.getDimension(9, 0.0f);
        float dimension3 = typedArrayA.getDimension(11, 0.0f);
        this.b = typedArrayA.getBoolean(16, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167102);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(10, 0);
        this.k = dimensionPixelSize2;
        defpackage.aftn aftnVarI = i();
        if (aftnVarI.z != dimensionPixelSize2) {
            aftnVarI.z = dimensionPixelSize2;
            aftnVarI.h();
        }
        defpackage.afpg afpgVarB = defpackage.afpg.b(context2, typedArrayA, 15);
        defpackage.afpg afpgVarB2 = defpackage.afpg.b(context2, typedArrayA, 8);
        agal agalVar = new agal(agal.k(context2, attributeSet, i, 2132085321, agal.a));
        boolean z = typedArrayA.getBoolean(5, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        aaaj aaajVar = new aaaj(this);
        this.o = aaajVar;
        aaajVar.l(attributeSet, i);
        this.n = new defpackage.agca(this);
        i().g(agalVar);
        defpackage.aftn aftnVarI2 = i();
        android.content.res.ColorStateList colorStateList = this.e;
        android.graphics.PorterDuff.Mode mode = this.f;
        android.content.res.ColorStateList colorStateList2 = this.g;
        int i2 = this.h;
        agal agalVar2 = aftnVarI2.l;
        dzk.x(agalVar2);
        aftnVarI2.m = new defpackage.aftm(agalVar2);
        aftnVarI2.m.setTintList(colorStateList);
        if (mode != null) {
            aftnVarI2.m.setTintMode(mode);
        }
        aftnVarI2.m.N(aftnVarI2.B.getContext());
        if (i2 > 0) {
            android.content.Context context3 = aftnVarI2.B.getContext();
            agal agalVar3 = aftnVarI2.l;
            dzk.x(agalVar3);
            defpackage.afsv afsvVar = new defpackage.afsv(agalVar3);
            int color = context3.getColor(2131099833);
            int color2 = context3.getColor(2131099832);
            int color3 = context3.getColor(2131099830);
            int color4 = context3.getColor(2131099831);
            afsvVar.c = color;
            afsvVar.d = color2;
            afsvVar.e = color3;
            afsvVar.f = color4;
            float f = i2;
            if (afsvVar.b != f) {
                afsvVar.b = f;
                afsvVar.a.setStrokeWidth(f * 1.3333f);
                afsvVar.g = true;
                afsvVar.invalidateSelf();
            }
            afsvVar.b(colorStateList);
            aftnVarI2.o = afsvVar;
            defpackage.afsv afsvVar2 = aftnVarI2.o;
            dzk.x(afsvVar2);
            agaf agafVar = aftnVarI2.m;
            dzk.x(agafVar);
            layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{afsvVar2, agafVar});
            drawable = null;
        } else {
            drawable = null;
            aftnVarI2.o = null;
            layerDrawable = aftnVarI2.m;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(afzc.b(colorStateList2), layerDrawable, drawable);
        aftnVarI2.n = rippleDrawable;
        com.google.android.material.focus.FocusRingDrawable.c(aftnVarI2.B.getContext(), rippleDrawable, aftnVarI2.m);
        aftnVarI2.p = rippleDrawable;
        i().u = dimensionPixelSize;
        defpackage.aftn aftnVarI3 = i();
        if (aftnVarI3.r != dimension) {
            aftnVarI3.r = dimension;
            aftnVarI3.e(dimension, aftnVarI3.s, aftnVarI3.t);
        }
        defpackage.aftn aftnVarI4 = i();
        if (aftnVarI4.s != dimension2) {
            aftnVarI4.s = dimension2;
            aftnVarI4.e(aftnVarI4.r, dimension2, aftnVarI4.t);
        }
        defpackage.aftn aftnVarI5 = i();
        if (aftnVarI5.t != dimension3) {
            aftnVarI5.t = dimension3;
            aftnVarI5.e(aftnVarI5.r, aftnVarI5.s, dimension3);
        }
        i().w = afpgVarB;
        i().x = afpgVarB2;
        i().q = z;
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        android.content.res.Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(2131165568) : resources.getDimensionPixelSize(2131165567);
        }
        return java.lang.Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    private final defpackage.aftn i() {
        defpackage.aftn aftnVar = this.m;
        if (aftnVar != null) {
            return aftnVar;
        }
        defpackage.aftn aftnVar2 = new defpackage.aftn(this, new com.google.android.material.floatingactionbutton.FloatingActionButton.ShadowDelegateImpl(this));
        this.m = aftnVar2;
        return aftnVar2;
    }

    private final void j() {
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    private final com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 k(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
        if (onVisibilityChangedListener == null) {
            return null;
        }
        return new com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1(this, onVisibilityChangedListener);
    }

    public final dum a() {
        return new com.google.android.material.floatingactionbutton.FloatingActionButton.Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    public final void d(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        defpackage.aftn aftnVarI = i();
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = aftnVarI.B;
        com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 anonymousClass1K = k(onVisibilityChangedListener);
        if (floatingActionButton.getVisibility() == 0) {
            if (aftnVarI.A == 1) {
                return;
            }
        } else if (aftnVarI.A != 2) {
            return;
        }
        android.animation.Animator animator = aftnVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        if (aftnVarI.l()) {
            defpackage.afpg afpgVar = aftnVarI.x;
            android.animation.AnimatorSet animatorSetB = afpgVar != null ? aftnVarI.b(afpgVar, 0.0f, 0.0f, 0.0f) : aftnVarI.c(0.0f, 0.4f, 0.4f, defpackage.aftn.d, defpackage.aftn.e);
            animatorSetB.addListener(new defpackage.aftj(aftnVarI, z, anonymousClass1K));
            animatorSetB.start();
            return;
        }
        floatingActionButton.g(true != z ? 4 : 8, z);
        if (anonymousClass1K != null) {
            anonymousClass1K.onHidden();
        }
    }

    public final void e(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener, boolean z) {
        defpackage.aftn aftnVarI = i();
        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = aftnVarI.B;
        com.google.android.material.floatingactionbutton.FloatingActionButton.AnonymousClass1 anonymousClass1K = k(onVisibilityChangedListener);
        if (floatingActionButton.getVisibility() != 0) {
            if (aftnVarI.A == 2) {
                return;
            }
        } else if (aftnVarI.A != 1) {
            return;
        }
        android.animation.Animator animator = aftnVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        defpackage.afpg afpgVar = aftnVarI.w;
        if (!aftnVarI.l()) {
            floatingActionButton.g(0, z);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            aftnVarI.f(1.0f);
            if (anonymousClass1K != null) {
                anonymousClass1K.onShown();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            float f = afpgVar == null ? 0.4f : 0.0f;
            floatingActionButton.setScaleY(f);
            floatingActionButton.setScaleX(f);
            aftnVarI.f(f);
        }
        defpackage.afpg afpgVar2 = aftnVarI.w;
        android.animation.AnimatorSet animatorSetB = afpgVar2 != null ? aftnVarI.b(afpgVar2, 1.0f, 1.0f, 1.0f) : aftnVarI.c(1.0f, 1.0f, 1.0f, defpackage.aftn.b, defpackage.aftn.c);
        animatorSetB.addListener(new defpackage.aftk(aftnVarI, z, anonymousClass1K));
        animatorSetB.start();
    }

    public final agal es() {
        agal agalVar = i().l;
        dzk.x(agalVar);
        return agalVar;
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final android.content.res.ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final android.graphics.PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.aftn aftnVarI = i();
        agaf agafVar = aftnVarI.m;
        if (agafVar != null) {
            agab.h(aftnVarI.B, agafVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i().B.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        i().i();
        int iMin = java.lang.Math.min(android.view.View.resolveSize(iB, i), android.view.View.resolveSize(iB, i2));
        android.graphics.Rect rect = this.c;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.stateful.ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.stateful.ExtendableSavedState extendableSavedState = (com.google.android.material.stateful.ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) extendableSavedState).d);
        defpackage.agca agcaVar = this.n;
        android.os.Bundle bundle = (android.os.Bundle) extendableSavedState.a.get("expandableWidgetHelper");
        dzk.x(bundle);
        agcaVar.b = bundle.getBoolean("expanded", false);
        agcaVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (agcaVar.b) {
            android.view.View view = (android.view.View) agcaVar.c;
            androidx.coordinatorlayout.widget.CoordinatorLayout parent = view.getParent();
            if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                parent.b(view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.google.android.material.stateful.ExtendableSavedState] */
    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new android.os.Bundle();
        }
        ?? extendableSavedState = new com.google.android.material.stateful.ExtendableSavedState(parcelableOnSaveInstanceState);
        aec aecVar = extendableSavedState.a;
        defpackage.agca agcaVar = this.n;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("expanded", agcaVar.b);
        bundle.putInt("expandedComponentIdHint", agcaVar.a);
        aecVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            android.graphics.Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            android.graphics.Rect rect2 = this.c;
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            int i = -this.m.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void q(agal agalVar) {
        i().g(agalVar);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        android.util.Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        android.util.Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        android.util.Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            defpackage.aftn aftnVarI = i();
            agaf agafVar = aftnVarI.m;
            if (agafVar != null) {
                agafVar.setTintList(colorStateList);
            }
            defpackage.afsv afsvVar = aftnVarI.o;
            if (afsvVar != null) {
                afsvVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            agaf agafVar = i().m;
            if (agafVar != null) {
                agafVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        j();
    }

    @Override // android.view.View
    public final void setContentDescription(java.lang.CharSequence charSequence) {
        super.setContentDescription(charSequence);
        j();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        agaf agafVar = i().m;
        if (agafVar != null) {
            agafVar.Q(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.n(i);
        android.graphics.drawable.Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.clearColorFilter();
        }
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.graphics.Rect rect) {
            super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(dup dupVar) {
            super.onAttachedToLayoutParams(dupVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.view.View view) {
            super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
            return false;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, int i) {
            super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z) {
            super.setAutoHideEnabled(z);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
            super.setInternalAutoHideListener(onVisibilityChangedListener);
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends dum {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener internalAutoHideListener;
        private android.graphics.Rect tmpRect;

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aftp.d);
            this.autoHideEnabled = typedArrayObtainStyledAttributes.getBoolean(0, AUTO_HIDE_DEFAULT);
            typedArrayObtainStyledAttributes.recycle();
        }

        private boolean ignoreUpdateVisibility(android.view.View view, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            dup layoutParams = floatingActionButton.getLayoutParams();
            if (this.autoHideEnabled && layoutParams.f == view.getId() && floatingActionButton.d == 0) {
                return false;
            }
            return AUTO_HIDE_DEFAULT;
        }

        private static boolean isBottomSheet(android.view.View view) {
            dup layoutParams = view.getLayoutParams();
            if (layoutParams instanceof dup) {
                return layoutParams.a instanceof com.google.android.material.bottomsheet.BottomSheetBehavior;
            }
            return false;
        }

        private void offsetIfNeeded(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            int i;
            android.graphics.Rect rect = floatingActionButton.c;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            dup layoutParams = floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - layoutParams.rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= layoutParams.leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - layoutParams.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= layoutParams.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int i3 = dzs.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i != 0) {
                int i4 = dzs.a;
                floatingActionButton.offsetLeftAndRight(i);
            }
        }

        private boolean updateFabVisibilityForAppBarLayout(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            if (ignoreUpdateVisibility(appBarLayout, floatingActionButton)) {
                return false;
            }
            android.graphics.Rect rect = this.tmpRect;
            if (rect == null) {
                rect = new android.graphics.Rect();
                this.tmpRect = rect;
            }
            defpackage.afub.a(coordinatorLayout, appBarLayout, rect);
            int i = rect.bottom;
            int iD = appBarLayout.d();
            com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener = this.internalAutoHideListener;
            if (i <= iD) {
                floatingActionButton.d(onVisibilityChangedListener, false);
            } else {
                floatingActionButton.e(onVisibilityChangedListener, false);
            }
            return AUTO_HIDE_DEFAULT;
        }

        private boolean updateFabVisibilityForBottomSheet(android.view.View view, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
            if (ignoreUpdateVisibility(view, floatingActionButton)) {
                return false;
            }
            dup layoutParams = floatingActionButton.getLayoutParams();
            int top = view.getTop();
            int height = (floatingActionButton.getHeight() / 2) + layoutParams.topMargin;
            com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener = this.internalAutoHideListener;
            if (top < height) {
                floatingActionButton.d(onVisibilityChangedListener, false);
            } else {
                floatingActionButton.e(onVisibilityChangedListener, false);
            }
            return AUTO_HIDE_DEFAULT;
        }

        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.graphics.Rect rect) {
            android.graphics.Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return AUTO_HIDE_DEFAULT;
        }

        public boolean isAutoHideEnabled() {
            return this.autoHideEnabled;
        }

        public void onAttachedToLayoutParams(dup dupVar) {
            if (dupVar.h == 0) {
                dupVar.h = 80;
            }
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, android.view.View view) {
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                updateFabVisibilityForAppBarLayout(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!isBottomSheet(view)) {
                return false;
            }
            updateFabVisibilityForBottomSheet(view, floatingActionButton);
            return false;
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton, int i) {
            java.util.List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.view.View view = (android.view.View) listA.get(i2);
                if (!(view instanceof com.google.android.material.appbar.AppBarLayout)) {
                    if (isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (updateFabVisibilityForAppBarLayout(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            offsetIfNeeded(coordinatorLayout, floatingActionButton);
            return AUTO_HIDE_DEFAULT;
        }

        public void setAutoHideEnabled(boolean z) {
            this.autoHideEnabled = z;
        }

        public void setInternalAutoHideListener(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener onVisibilityChangedListener) {
            this.internalAutoHideListener = onVisibilityChangedListener;
        }

        public BaseBehavior() {
            this.autoHideEnabled = AUTO_HIDE_DEFAULT;
        }
    }

    /* JADX INFO: compiled from: PG */
    public abstract class OnVisibilityChangedListener {
        public void onHidden(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        }

        public void onShown(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        }
    }

    public FloatingActionButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969445);
    }

    public FloatingActionButton(android.content.Context context) {
        this(context, null);
    }
}
