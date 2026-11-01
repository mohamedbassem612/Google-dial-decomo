package com.android.dialer.xatu.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class XatuSnackbarBehavior extends com.google.android.material.snackbar.BaseTransientBottomBar$Behavior {
    private final int[] h = new int[2];
    private final android.graphics.Point i = new android.graphics.Point(0, 0);

    private final int g(android.view.View view, android.view.View view2) {
        return ((h(view).y + view.getHeight()) - (view2.getVisibility() == 4 ? ((int) view2.getY()) + view2.getHeight() : h(view2).y)) + view2.getResources().getDimensionPixelSize(2131168035);
    }

    private final android.graphics.Point h(android.view.View view) {
        int[] iArr = this.h;
        view.getLocationOnScreen(iArr);
        android.graphics.Point point = this.i;
        point.set(iArr[0], iArr[1]);
        return point;
    }

    private static final boolean i(android.view.View view, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, int i) {
        if (i == 0) {
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin + i);
        coordinatorLayout.j(view, coordinatorLayout.getLayoutDirection());
        return true;
    }

    public final boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        aooh.f(coordinatorLayout, "parent");
        aooh.f(view, "child");
        aooh.f(view2, "dependency");
        return view2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton;
    }

    public final boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        aooh.f(coordinatorLayout, "parent");
        aooh.f(view, "snackbar");
        aooh.f(view2, "dependency");
        return i(view, coordinatorLayout, g(view, view2));
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        aooh.f(coordinatorLayout, "parent");
        aooh.f(view, "snackbar");
        super.onLayoutChild(coordinatorLayout, view, i);
        java.util.List listA = coordinatorLayout.a(view);
        aooh.e(listA, "getDependencies(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listA) {
            if (obj instanceof com.google.android.material.floatingactionbutton.FloatingActionButton) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            int height = 0;
            if (!it.hasNext()) {
                break;
            }
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) it.next();
            int height2 = (coordinatorLayout.getHeight() - ((int) floatingActionButton.getY())) + coordinatorLayout.getResources().getDimensionPixelSize(2131168035);
            if (floatingActionButton.isShown()) {
                if (view.getHeight() <= 0 || g(view, floatingActionButton) == floatingActionButton.getHeight()) {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    height = height2 - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
                }
            } else if (height2 > 0) {
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                height = (height2 - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0)) - floatingActionButton.getHeight();
            }
            arrayList2.add(java.lang.Integer.valueOf(height));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(arrayList2, 10));
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Boolean.valueOf(i(view, coordinatorLayout, ((java.lang.Number) it2.next()).intValue())));
        }
        return arrayList3.contains(java.lang.Boolean.TRUE);
    }
}
