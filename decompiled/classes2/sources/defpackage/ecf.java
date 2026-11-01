package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ecf extends dye {
    public final void b(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        accessibilityEvent.setClassName(android.widget.ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.c() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.c());
    }

    public final void c(android.view.View view, defpackage.ebd ebdVar) {
        int iC;
        super.c(view, ebdVar);
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        ebdVar.s(android.widget.ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (iC = nestedScrollView.c()) <= 0) {
            return;
        }
        ebdVar.N(true);
        if (nestedScrollView.getScrollY() > 0) {
            ebdVar.i(defpackage.ebc.h);
            ebdVar.i(defpackage.ebc.m);
        }
        if (nestedScrollView.getScrollY() < iC) {
            ebdVar.i(defpackage.ebc.g);
            ebdVar.i(defpackage.ebc.o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    public final boolean i(android.view.View view, int i, android.os.Bundle bundle) {
        int iMin;
        if (super.i(view, i, bundle)) {
            return true;
        }
        androidx.core.widget.NestedScrollView nestedScrollView = (androidx.core.widget.NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                iMin = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0, iMin, true);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int iMax = java.lang.Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0, iMax, true);
                    return true;
                }
            } else if (i == 16908346) {
                iMin = java.lang.Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.c());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.v(0, iMin, true);
                    return true;
                }
            }
        }
        return false;
    }
}
