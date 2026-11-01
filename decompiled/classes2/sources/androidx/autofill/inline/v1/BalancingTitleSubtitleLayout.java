package androidx.autofill.inline.v1;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class BalancingTitleSubtitleLayout extends android.view.ViewGroup {
    public static final defpackage.rq a = new defpackage.rq();
    private android.view.View b;
    private android.widget.TextView c;
    private android.widget.TextView d;
    private android.view.View e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(android.content.Context context) {
        this(context, null, 0, 6, null);
        aooh.f(context, "context");
    }

    private static final void a(android.view.View view, int i, int i2, aoor aoorVar, boolean z, int i3) {
        if (view.getVisibility() != 8) {
            int measuredHeight = i + ((i2 - view.getMeasuredHeight()) / 2);
            int iC = aoorVar.a + defpackage.rq.c(view);
            aoorVar.a = iC;
            if (!z) {
                iC = (i3 - iC) - view.getMeasuredWidth();
            }
            view.layout(iC, measuredHeight, view.getMeasuredWidth() + iC, view.getMeasuredHeight() + measuredHeight);
            aoorVar.a += view.getMeasuredWidth() + defpackage.rq.b(view);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new android.view.ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 4) {
            throw new java.lang.IllegalStateException("TitleSubtitleLayout can host up to 4 children.");
        }
        android.view.View viewFindViewById = findViewById(2131427520);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.b = viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(2131427522);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.c = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = findViewById(2131427521);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.d = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = findViewById(2131427519);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.e = viewFindViewById4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View view;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        int paddingTop2 = getPaddingTop();
        int layoutDirection = getLayoutDirection();
        aoor aoorVar = new aoor();
        aoorVar.a = getPaddingStart();
        android.view.View view2 = this.b;
        if (view2 == null) {
            aooh.j("startIcon");
            view = null;
        } else {
            view = view2;
        }
        boolean z2 = layoutDirection == 0;
        int i5 = i3 - i;
        a(view, paddingTop2, paddingTop, aoorVar, z2, i5);
        android.widget.TextView textView3 = this.c;
        if (textView3 == null) {
            aooh.j("titleView");
            textView = null;
        } else {
            textView = textView3;
        }
        a(textView, paddingTop2, paddingTop, aoorVar, z2, i5);
        android.widget.TextView textView4 = this.d;
        if (textView4 == null) {
            aooh.j("subtitleView");
            textView2 = null;
        } else {
            textView2 = textView4;
        }
        a(textView2, paddingTop2, paddingTop, aoorVar, z2, i5);
        android.view.View view3 = this.e;
        if (view3 == null) {
            aooh.j("endIcon");
            view3 = null;
        }
        a(view3, paddingTop2, paddingTop, aoorVar, z2, i5);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        android.view.View view;
        android.view.View view2;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        int size = android.view.View.MeasureSpec.getSize(i);
        int paddingStart = (size - getPaddingStart()) - getPaddingEnd();
        android.view.View view3 = this.b;
        android.widget.TextView textView3 = null;
        if (view3 == null) {
            aooh.j("startIcon");
            view = null;
        } else {
            view = view3;
        }
        measureChildWithMargins(view, i, 0, i2, 0);
        android.view.View view4 = this.b;
        if (view4 == null) {
            aooh.j("startIcon");
            view4 = null;
        }
        int iF = defpackage.rq.f(view4);
        android.view.View view5 = this.b;
        if (view5 == null) {
            aooh.j("startIcon");
            view5 = null;
        }
        int iMax = java.lang.Math.max(0, defpackage.rq.d(view5));
        android.view.View view6 = this.e;
        if (view6 == null) {
            aooh.j("endIcon");
            view2 = null;
        } else {
            view2 = view6;
        }
        measureChildWithMargins(view2, i, 0, i2, 0);
        android.view.View view7 = this.e;
        if (view7 == null) {
            aooh.j("endIcon");
            view7 = null;
        }
        int iF2 = iF + defpackage.rq.f(view7);
        android.view.View view8 = this.e;
        if (view8 == null) {
            aooh.j("endIcon");
            view8 = null;
        }
        int iMax2 = java.lang.Math.max(iMax, defpackage.rq.d(view8));
        android.widget.TextView textView4 = this.c;
        if (textView4 == null) {
            aooh.j("titleView");
            textView = null;
        } else {
            textView = textView4;
        }
        measureChildWithMargins(textView, i, 0, i2, 0);
        android.widget.TextView textView5 = this.d;
        if (textView5 == null) {
            aooh.j("subtitleView");
            textView2 = null;
        } else {
            textView2 = textView5;
        }
        measureChildWithMargins(textView2, i, 0, i2, 0);
        android.widget.TextView textView6 = this.c;
        if (textView6 == null) {
            aooh.j("titleView");
            textView6 = null;
        }
        int iF3 = defpackage.rq.f(textView6);
        android.widget.TextView textView7 = this.d;
        if (textView7 == null) {
            aooh.j("subtitleView");
            textView7 = null;
        }
        int i3 = paddingStart - iF2;
        float f = size;
        int iF4 = defpackage.rq.f(textView7);
        if (iF3 + iF4 > i3) {
            int i4 = i3 - iF3;
            int i5 = (int) (f * 0.37f);
            if (i4 >= i5) {
                iF4 = i4;
            } else if (iF4 <= i5) {
                iF3 = i3 - iF4;
            } else {
                iF3 = i3 - i5;
                iF4 = i5;
            }
        }
        android.widget.TextView textView8 = this.c;
        if (textView8 == null) {
            aooh.j("titleView");
            textView8 = null;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(iF3 - defpackage.rq.e(textView8), 1073741824);
        android.widget.TextView textView9 = this.d;
        if (textView9 == null) {
            aooh.j("subtitleView");
            textView9 = null;
        }
        int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(iF4 - defpackage.rq.e(textView9), 1073741824);
        android.widget.TextView textView10 = this.c;
        if (textView10 == null) {
            aooh.j("titleView");
            textView10 = null;
        }
        textView10.measure(iMakeMeasureSpec, 0);
        android.widget.TextView textView11 = this.d;
        if (textView11 == null) {
            aooh.j("subtitleView");
            textView11 = null;
        }
        textView11.measure(iMakeMeasureSpec2, 0);
        android.widget.TextView textView12 = this.c;
        if (textView12 == null) {
            aooh.j("titleView");
            textView12 = null;
        }
        int iF5 = iF2 + defpackage.rq.f(textView12);
        android.widget.TextView textView13 = this.d;
        if (textView13 == null) {
            aooh.j("subtitleView");
            textView13 = null;
        }
        int iF6 = iF5 + defpackage.rq.f(textView13);
        android.widget.TextView textView14 = this.c;
        if (textView14 == null) {
            aooh.j("titleView");
            textView14 = null;
        }
        int iMax3 = java.lang.Math.max(iMax2, defpackage.rq.d(textView14));
        android.widget.TextView textView15 = this.d;
        if (textView15 == null) {
            aooh.j("subtitleView");
        } else {
            textView3 = textView15;
        }
        setMeasuredDimension(android.view.ViewGroup.resolveSize(iF6 + getPaddingStart() + getPaddingEnd(), i), android.view.ViewGroup.resolveSize(java.lang.Math.max(iMax3, defpackage.rq.d(textView3)) + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new android.view.ViewGroup.MarginLayoutParams(layoutParams);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalancingTitleSubtitleLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        aooh.f(context, "context");
    }

    public /* synthetic */ BalancingTitleSubtitleLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, aooc aoocVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
