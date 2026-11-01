package com.google.android.setupcompat.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class ButtonBarLayout extends android.widget.LinearLayout {
    private static final xtq f = new xtq(com.google.android.setupcompat.view.ButtonBarLayout.class);
    public defpackage.aprf a;
    private boolean b;
    private int c;
    private int d;
    private boolean e;

    public ButtonBarLayout(android.content.Context context) {
        super(context);
        this.b = false;
    }

    private static void b(java.util.List list, int i, android.view.View view) {
        if (list.get(i) == null) {
            list.set(i, view);
        } else {
            list.add(view);
        }
    }

    private final void c(boolean z) {
        if (this.b != z) {
            this.b = z;
            int childCount = getChildCount();
            int i = 0;
            boolean z2 = false;
            int i2 = 0;
            while (i < childCount) {
                android.view.View childAt = getChildAt(i);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (z) {
                    childAt.setTag(2131429045, java.lang.Float.valueOf(layoutParams.weight));
                    childAt.setTag(2131429044, java.lang.Integer.valueOf(layoutParams.getMarginStart()));
                    childAt.setTag(2131429043, java.lang.Integer.valueOf(layoutParams.getMarginEnd()));
                    layoutParams.weight = 0.0f;
                    layoutParams.setMarginStart(0);
                    layoutParams.setMarginEnd(0);
                } else {
                    java.lang.Float f2 = (java.lang.Float) childAt.getTag(2131429045);
                    if (f2 != null) {
                        layoutParams.weight = f2.floatValue();
                        z2 = z2;
                    } else {
                        z2 = true;
                    }
                    java.lang.Integer num = (java.lang.Integer) childAt.getTag(2131429044);
                    if (num != null) {
                        layoutParams.setMarginStart(num.intValue());
                    }
                    java.lang.Integer num2 = (java.lang.Integer) childAt.getTag(2131429043);
                    if (num2 != null) {
                        layoutParams.setMarginEnd(num2.intValue());
                    }
                    if (d(childAt)) {
                        i2++;
                    }
                }
                childAt.setLayoutParams(layoutParams);
                i++;
                z2 = z2;
            }
            setOrientation(z ? 1 : 0);
            if (!z2) {
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break;
                    } else {
                        bringChildToFront(getChildAt(childCount));
                    }
                }
            } else {
                f.B("Reorder the FooterActionButtons in the container");
                java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList();
                if (i2 <= 1) {
                    arrayList.addAll(java.util.Collections.nCopies(3, null));
                }
                for (int i3 = 0; i3 < childCount; i3++) {
                    android.view.View childAt2 = getChildAt(i3);
                    if (i2 <= 1) {
                        if (d(childAt2)) {
                            b(arrayList, 2, childAt2);
                        } else if (childAt2 instanceof com.google.android.setupcompat.template.FooterActionButton) {
                            b(arrayList, 0, childAt2);
                        } else {
                            b(arrayList, 1, childAt2);
                        }
                    } else if ((childAt2 instanceof com.google.android.setupcompat.template.FooterActionButton) || arrayList.size() <= 0) {
                        arrayList.add(childAt2);
                    } else {
                        arrayList.add(1, childAt2);
                    }
                }
                for (android.view.View view : arrayList) {
                    if (view != null) {
                        bringChildToFront(view);
                    }
                }
            }
            if (!z) {
                if (defpackage.agfz.t(getContext())) {
                    return;
                }
                setPadding(this.c, getPaddingTop(), this.d, getPaddingBottom());
                return;
            }
            if (!defpackage.agfz.i(getContext()).n(getContext()) && getContext().getResources().getBoolean(2131034160) && defpackage.agfz.t(getContext())) {
                setHorizontalGravity(8388613);
            } else {
                setHorizontalGravity(17);
            }
            if (defpackage.agfz.t(getContext())) {
                return;
            }
            this.c = getPaddingLeft();
            int paddingRight = getPaddingRight();
            this.d = paddingRight;
            int iMax = java.lang.Math.max(this.c, paddingRight);
            setPadding(iMax, getPaddingTop(), iMax, getPaddingBottom());
        }
    }

    private static final boolean d(android.view.View view) {
        return (view instanceof com.google.android.setupcompat.template.FooterActionButton) && ((com.google.android.setupcompat.template.FooterActionButton) view).b;
    }

    public final void a(boolean z) {
        boolean z2 = false;
        if (z && defpackage.agfz.t(getContext())) {
            z2 = true;
        }
        this.e = z2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        if (defpackage.agfz.A(getContext())) {
            super.onMeasure(i, i2);
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        c(false);
        if (android.view.View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = 0;
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        boolean z2 = (size > 0 && getMeasuredWidth() > size) || this.e;
        android.content.Context context = getContext();
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            if (d(getChildAt(i5))) {
                i4++;
            }
        }
        if (!(i4 == 2 && context.getResources().getConfiguration().smallestScreenWidthDp >= 600 && defpackage.agfz.D(context)) && z2) {
            c(true);
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            defpackage.aprf aprfVar = this.a;
            if (aprfVar == null || i != 0) {
                return;
            }
            ((defpackage.aggf) aprfVar.a).z = 0;
        }
    }

    public ButtonBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
    }
}
