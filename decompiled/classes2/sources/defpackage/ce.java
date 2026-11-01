package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ce {
    private static boolean f(java.util.List list, android.view.View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    protected static void v(java.util.List list, android.view.View view) {
        int size = list.size();
        if (f(list, view, size)) {
            return;
        }
        int i = dzs.a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            android.view.View view2 = (android.view.View) list.get(i2);
            if (view2 instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    android.view.View childAt = viewGroup.getChildAt(i3);
                    if (!f(list, childAt, size) && childAt.getTransitionName() != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    protected static boolean x(java.util.List list) {
        return list == null || list.isEmpty();
    }

    protected static final void y(android.view.View view, android.graphics.Rect rect) {
        if (view.isAttachedToWindow()) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            java.lang.Object parent = view.getParent();
            while (parent instanceof android.view.View) {
                android.view.View view2 = (android.view.View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(java.lang.Math.round(rectF.left), java.lang.Math.round(rectF.top), java.lang.Math.round(rectF.right), java.lang.Math.round(rectF.bottom));
        }
    }

    public abstract java.lang.Object a(java.lang.Object obj);

    public abstract java.lang.Object b(java.lang.Object obj);

    public abstract void c(java.lang.Object obj, android.view.View view);

    public abstract void d(java.lang.Object obj, java.util.ArrayList arrayList);

    public abstract void e(android.view.ViewGroup viewGroup, java.lang.Object obj);

    public abstract void g(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void h(java.lang.Object obj, android.graphics.Rect rect);

    public abstract void i(java.lang.Object obj, android.view.View view);

    public abstract void j(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList);

    public abstract void k(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2);

    public abstract boolean l(java.lang.Object obj);

    public boolean m() {
        throw null;
    }

    public boolean n(java.lang.Object obj) {
        throw null;
    }

    public abstract java.lang.Object o(java.lang.Object obj, java.lang.Object obj2);

    public abstract void p(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2);

    public void q(java.lang.Object obj, defpackage.dxa dxaVar, java.lang.Runnable runnable) {
        throw null;
    }

    public abstract java.lang.Object r(java.lang.Object obj, java.lang.Object obj2);

    public java.lang.Object s(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        return null;
    }

    public void z(java.lang.Object obj, defpackage.dxa dxaVar, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        runnable2.run();
    }

    public void t(java.lang.Object obj) {
    }

    public void u(java.lang.Object obj, java.lang.Runnable runnable) {
    }

    public void w(java.lang.Object obj, float f) {
    }
}
