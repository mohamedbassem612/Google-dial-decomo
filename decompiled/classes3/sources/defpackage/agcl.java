package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcl extends android.widget.LinearLayout {
    public android.animation.ValueAnimator a;
    public final /* synthetic */ com.google.android.material.tabs.TabLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agcl(com.google.android.material.tabs.TabLayout tabLayout, android.content.Context context) {
        super(context);
        j$.util.Objects.requireNonNull(tabLayout);
        this.b = tabLayout;
        setWillNotDraw(false);
    }

    private final void e(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = this.b;
        if (tabLayout.B == 0 || (tabLayout.l.getBounds().left == -1 && tabLayout.l.getBounds().right == -1)) {
            android.view.View childAt = getChildAt(i);
            android.graphics.drawable.Drawable drawable = tabLayout.l;
            android.graphics.RectF rectFH = defpackage.aftt.h(tabLayout, childAt);
            drawable.setBounds((int) rectFH.left, drawable.getBounds().top, (int) rectFH.right, drawable.getBounds().bottom);
            tabLayout.a = i;
        }
    }

    public final void a() {
        e(this.b.a());
    }

    public final void b(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = this.b;
        android.graphics.Rect bounds = tabLayout.l.getBounds();
        tabLayout.l.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(android.view.View view, android.view.View view2, float f) {
        if (view == null || view.getWidth() <= 0) {
            com.google.android.material.tabs.TabLayout tabLayout = this.b;
            android.graphics.drawable.Drawable drawable = tabLayout.l;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.l.getBounds().bottom);
        } else {
            com.google.android.material.tabs.TabLayout tabLayout2 = this.b;
            tabLayout2.C.i(tabLayout2, view, view2, f, tabLayout2.l);
        }
        postInvalidateOnAnimation();
    }

    public final void d(boolean z, int i, int i2) {
        com.google.android.material.tabs.TabLayout tabLayout = this.b;
        if (tabLayout.a != i) {
            android.view.View childAt = getChildAt(tabLayout.a());
            android.view.View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a();
                return;
            }
            tabLayout.a = i;
            defpackage.agck agckVar = new defpackage.agck(this, childAt, childAt2, 0);
            if (!z) {
                this.a.removeAllUpdateListeners();
                this.a.addUpdateListener(agckVar);
                return;
            }
            android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
            this.a = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.z);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(agckVar);
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int height;
        com.google.android.material.tabs.TabLayout tabLayout = this.b;
        int iHeight = tabLayout.l.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.l.getIntrinsicHeight();
        }
        int i = tabLayout.t;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            int height2 = getHeight() - iHeight;
            iHeight = (getHeight() + iHeight) / 2;
            height = height2 / 2;
        }
        if (tabLayout.l.getBounds().width() > 0) {
            android.graphics.Rect bounds = tabLayout.l.getBounds();
            tabLayout.l.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.l.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.animation.ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(false, this.b.a(), -1);
            return;
        }
        com.google.android.material.tabs.TabLayout tabLayout = this.b;
        int iA = tabLayout.a;
        if (iA == -1) {
            iA = tabLayout.a();
            tabLayout.a = iA;
        }
        e(iA);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) == 1073741824) {
            com.google.android.material.tabs.TabLayout tabLayout = this.b;
            if (tabLayout.r == 1 || tabLayout.u == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    android.view.View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = java.lang.Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax > 0) {
                    if (iMax * childCount <= getMeasuredWidth() - (((int) agab.E(getContext(), 16)) << 1)) {
                        boolean z = false;
                        for (int i4 = 0; i4 < childCount; i4++) {
                            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                            if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                                layoutParams.width = iMax;
                                layoutParams.weight = 0.0f;
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        tabLayout.r = 0;
                        tabLayout.m(false);
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }
}
