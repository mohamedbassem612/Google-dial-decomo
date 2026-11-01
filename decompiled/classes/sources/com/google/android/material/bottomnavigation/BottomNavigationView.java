package com.google.android.material.bottomnavigation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class BottomNavigationView extends defpackage.afwx {
    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.Context context2 = getContext();
        int[] iArr = defpackage.afqn.a;
        defpackage.afvl.b(context2, attributeSet, i, i2);
        defpackage.afvl.d(context2, attributeSet, iArr, i, i2, new int[0]);
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, i2));
        boolean zY = ajxwVar.y(2, true);
        defpackage.afql afqlVar = (defpackage.afql) this.b;
        if (afqlVar.a != zY) {
            afqlVar.a = zY;
            this.c.f(false);
        }
        if (ajxwVar.z(0)) {
            setMinimumHeight(ajxwVar.n(0, 0));
        }
        ajxwVar.x();
        defpackage.agab.J(this, new defpackage.afqm(this));
    }

    @Override // defpackage.afwx
    public final int a() {
        return 6;
    }

    @Override // defpackage.afwx
    protected final defpackage.afwq b(android.content.Context context) {
        return new defpackage.afql(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (android.view.View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumHeight <= 0) {
            iMakeMeasureSpec = i2;
        } else {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(android.view.View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
        }
        super.onMeasure(i, iMakeMeasureSpec);
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), java.lang.Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968750);
    }

    public BottomNavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132085318);
    }

    public BottomNavigationView(android.content.Context context) {
        this(context, null);
    }
}
