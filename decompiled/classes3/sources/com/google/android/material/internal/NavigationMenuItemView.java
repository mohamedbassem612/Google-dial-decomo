package com.google.android.material.internal;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class NavigationMenuItemView extends defpackage.afug implements gf {
    private static final int[] o = {android.R.attr.state_checked};
    public int c;
    public boolean d;
    public boolean e;
    public boolean i;
    public final android.widget.CheckedTextView j;
    public android.widget.FrameLayout k;
    public fv l;
    public android.content.res.ColorStateList m;
    public boolean n;
    private android.graphics.drawable.Drawable p;
    private final dye q;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        defpackage.afum afumVar = new defpackage.afum(this);
        this.q = afumVar;
        r(0);
        android.view.LayoutInflater.from(context).inflate(2131624138, (android.view.ViewGroup) this, true);
        this.c = context.getResources().getDimensionPixelSize(2131165573);
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) findViewById(2131427947);
        this.j = checkedTextView;
        dzs.i(checkedTextView, afumVar);
    }

    public final fv a() {
        return this.l;
    }

    public final void b(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            if (this.n) {
                android.graphics.drawable.Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.m);
            }
            int i = this.c;
            drawable.setBounds(0, 0, i, i);
        } else if (this.d) {
            if (this.p == null) {
                android.content.res.Resources resources = getResources();
                android.content.res.Resources.Theme theme = getContext().getTheme();
                int i2 = dwk.a;
                android.graphics.drawable.Drawable drawable2 = resources.getDrawable(2131231887, theme);
                this.p = drawable2;
                if (drawable2 != null) {
                    int i3 = this.c;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.p;
        }
        this.j.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public final boolean e() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(fv fvVar) {
        android.graphics.drawable.StateListDrawable stateListDrawable;
        this.l = fvVar;
        int i = fvVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != fvVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (getContext().getTheme().resolveAttribute(2130968945, typedValue, true)) {
                stateListDrawable = new android.graphics.drawable.StateListDrawable();
                stateListDrawable.addState(o, new android.graphics.drawable.ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = fvVar.isCheckable();
        refreshDrawableState();
        if (this.e != zIsCheckable) {
            this.e = zIsCheckable;
            this.q.e(this.j, 2048);
        }
        boolean zIsChecked = fvVar.isChecked();
        refreshDrawableState();
        android.widget.CheckedTextView checkedTextView = this.j;
        checkedTextView.setChecked(zIsChecked);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.i) ? 1 : 0);
        setEnabled(fvVar.isEnabled());
        checkedTextView.setText(fvVar.d);
        b(fvVar.getIcon());
        android.view.View actionView = fvVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (android.widget.FrameLayout) ((android.view.ViewStub) findViewById(2131427946)).inflate();
            }
            if (actionView.getParent() != null) {
                ((android.view.ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(fvVar.m);
        setTooltipText(fvVar.n);
        fv fvVar2 = this.l;
        if (fvVar2.d == null && fvVar2.getIcon() == null && this.l.getActionView() != null) {
            checkedTextView.setVisibility(8);
            android.widget.FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                android.view.ViewGroup.LayoutParams layoutParams = (jo) frameLayout.getLayoutParams();
                ((jo) layoutParams).width = -1;
                this.k.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        android.widget.FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = (jo) frameLayout2.getLayoutParams();
            ((jo) layoutParams2).width = -2;
            this.k.setLayoutParams(layoutParams2);
        }
    }

    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        fv fvVar = this.l;
        if (fvVar != null && fvVar.isCheckable() && fvVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, o);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(android.content.Context context) {
        this(context, null);
    }
}
