package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ActionBarContextView extends defpackage.gp {
    public java.lang.CharSequence g;
    public java.lang.CharSequence h;
    public android.view.View i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    private android.view.View n;
    private android.view.View o;
    private android.widget.LinearLayout p;
    private android.widget.TextView q;
    private android.widget.TextView r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ajxw ajxwVarD = ajxw.D(context, attributeSet, ef.d, i, 0);
        setBackground(ajxwVarD.t(0));
        this.s = ajxwVarD.r(5, 0);
        this.t = ajxwVarD.r(4, 0);
        this.e = ajxwVarD.q(3, 0);
        this.u = ajxwVarD.r(2, 2131623943);
        ajxwVarD.x();
        this.v = getPaddingLeft();
        this.w = getPaddingTop();
        this.x = getPaddingRight();
        this.y = getPaddingBottom();
    }

    private final void p() {
        if (this.p == null) {
            android.view.LayoutInflater.from(getContext()).inflate(2131623938, this);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) getChildAt(getChildCount() - 1);
            this.p = linearLayout;
            this.q = (android.widget.TextView) linearLayout.findViewById(2131427407);
            this.r = (android.widget.TextView) this.p.findViewById(2131427406);
            if (this.s != 0) {
                this.q.setTextAppearance(getContext(), this.s);
            }
            if (this.t != 0) {
                this.r.setTextAppearance(getContext(), this.t);
            }
        }
        this.q.setText(this.g);
        this.r.setText(this.h);
        boolean zIsEmpty = android.text.TextUtils.isEmpty(this.g);
        boolean zIsEmpty2 = android.text.TextUtils.isEmpty(this.h);
        this.r.setVisibility(true != zIsEmpty2 ? 0 : 8);
        this.p.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.p.getParent() == null) {
            addView(this.p);
        }
    }

    @Override // defpackage.gp
    public final void c(int i) {
        this.e = i;
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(defpackage.ey eyVar) {
        android.view.View view = this.i;
        if (view == null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(this.u, (android.view.ViewGroup) this, false);
            this.i = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.i);
        }
        android.view.View viewFindViewById = this.i.findViewById(2131427424);
        this.n = viewFindViewById;
        viewFindViewById.setOnClickListener(new defpackage.gr(eyVar, 0));
        ft ftVarA = eyVar.a();
        hb hbVar = this.d;
        if (hbVar != null) {
            hbVar.p();
        }
        this.d = new hb(getContext());
        this.d.r();
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-2, -1);
        ftVarA.h(this.d, this.b);
        hb hbVar2 = this.d;
        android.support.v7.widget.ActionMenuView actionMenuView = hbVar2.f;
        if (((fk) hbVar2).f == null) {
            ((fk) hbVar2).f = ((fk) hbVar2).d.inflate(2131623941, (android.view.ViewGroup) this, false);
            ((fk) hbVar2).f.a(((fk) hbVar2).c);
            hbVar2.f(true);
        }
        android.support.v7.widget.ActionMenuView actionMenuView2 = ((fk) hbVar2).f;
        if (actionMenuView != actionMenuView2) {
            actionMenuView2.k(hbVar2);
        }
        this.c = actionMenuView2;
        this.c.setBackground((android.graphics.drawable.Drawable) null);
        addView((android.view.View) this.c, layoutParams);
    }

    public final void i() {
        removeAllViews();
        this.o = null;
        this.c = null;
        this.d = null;
        android.view.View view = this.n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public final void j(android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.view.View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        this.o = view;
        if (view != null && (linearLayout = this.p) != null) {
            removeView(linearLayout);
            this.p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public final void k(java.lang.CharSequence charSequence) {
        this.h = charSequence;
        p();
    }

    public final void l(java.lang.CharSequence charSequence) {
        this.g = charSequence;
        p();
        dzs.k(this, charSequence);
    }

    public final void m(boolean z) {
        if (z != this.j) {
            requestLayout();
        }
        this.j = z;
    }

    public final void n() {
        super.setPadding(this.k + this.v, this.l + this.w, this.m + this.x, this.y);
    }

    public final void o() {
        hb hbVar = this.d;
        if (hbVar != null) {
            hbVar.o();
        }
    }

    @Override // defpackage.gp, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, ef.d, 2130968607, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hb hbVar = this.d;
        if (hbVar != null) {
            hbVar.l();
            this.d.s();
        }
    }

    @Override // defpackage.gp, android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean zBK = den.bK(this);
        int paddingRight = zBK ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        android.view.View view = this.i;
        if (view != null && view.getVisibility() != 8) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            if (zBK) {
                i5 = marginLayoutParams.rightMargin;
                i6 = marginLayoutParams.leftMargin;
            } else {
                i5 = marginLayoutParams.leftMargin;
                i6 = marginLayoutParams.rightMargin;
            }
            int iA = a(paddingRight, i5, zBK);
            paddingRight = a(iA + f(this.i, iA, paddingTop, paddingTop2, zBK), i6, zBK);
        }
        android.widget.LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null && linearLayout.getVisibility() != 8) {
            paddingRight += f(this.p, paddingRight, paddingTop, paddingTop2, zBK);
        }
        android.view.View view2 = this.o;
        if (view2 != null) {
            f(view2, paddingRight, paddingTop, paddingTop2, zBK);
        }
        int paddingLeft = zBK ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        android.support.v7.widget.ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            f(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zBK);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (android.view.View.MeasureSpec.getMode(i2) == 0) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(getClass().getSimpleName()).concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i3 = this.e;
        int size2 = i3 > 0 ? i3 + this.l : android.view.View.MeasureSpec.getSize(i2);
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        android.view.View view = this.i;
        if (view != null) {
            int iE = e(view, paddingLeft, iMakeMeasureSpec);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.i.getLayoutParams();
            paddingLeft = iE - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        android.support.v7.widget.ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = e(this.c, paddingLeft, iMakeMeasureSpec);
        }
        android.widget.LinearLayout linearLayout = this.p;
        if (linearLayout != null && this.o == null) {
            if (this.j) {
                linearLayout.measure(0, iMakeMeasureSpec);
                int measuredWidth = this.p.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.p.setVisibility(true != z ? 8 : 0);
            } else {
                paddingLeft = e(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        android.view.View view2 = this.o;
        if (view2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = java.lang.Math.min(layoutParams.width, paddingLeft);
            }
            int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
            if (layoutParams.height >= 0) {
                iMin = java.lang.Math.min(layoutParams.height, iMin);
            }
            this.o.measure(android.view.View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), android.view.View.MeasureSpec.makeMeasureSpec(iMin, i5));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i6) {
                i6 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i6);
    }

    @Override // defpackage.gp, android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.v = i;
        this.w = i2;
        this.x = i3;
        this.y = i4;
        n();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            i3 = i;
            i = i3;
        }
        this.v = i;
        this.x = i3;
        this.w = i2;
        this.y = i4;
        n();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968607);
    }

    public ActionBarContextView(android.content.Context context) {
        this(context, null);
    }
}
