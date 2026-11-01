package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class ecj extends dye {
    private static final android.graphics.Rect f = new android.graphics.Rect(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final android.view.accessibility.AccessibilityManager a;
    public final android.view.View b;
    private defpackage.eci k;
    private final android.graphics.Rect g = new android.graphics.Rect();
    private final android.graphics.Rect h = new android.graphics.Rect();
    private final android.graphics.Rect i = new android.graphics.Rect();
    private final int[] j = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;

    public ecj(android.view.View view) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("View may not be null");
        }
        this.b = view;
        this.a = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final ebg a(android.view.View view) {
        defpackage.eci eciVar = this.k;
        if (eciVar != null) {
            return eciVar;
        }
        defpackage.eci eciVar2 = new defpackage.eci(this);
        this.k = eciVar2;
        return eciVar2;
    }

    public void c(android.view.View view, defpackage.ebd ebdVar) {
        super.c(view, ebdVar);
        n(ebdVar);
    }

    public final android.view.accessibility.AccessibilityEvent j(int i, int i2) {
        if (i == -1) {
            android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain(i2);
            this.b.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        android.view.accessibility.AccessibilityEvent accessibilityEventObtain2 = android.view.accessibility.AccessibilityEvent.obtain(i2);
        defpackage.ebd ebdVarK = k(i);
        accessibilityEventObtain2.getText().add(ebdVarK.e());
        accessibilityEventObtain2.setContentDescription(ebdVarK.d());
        accessibilityEventObtain2.setScrollable(ebdVarK.ac());
        accessibilityEventObtain2.setPassword(ebdVarK.ab());
        accessibilityEventObtain2.setEnabled(ebdVarK.Y());
        accessibilityEventObtain2.setChecked(ebdVarK.a.isChecked());
        m(i, accessibilityEventObtain2);
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(ebdVarK.c());
        android.view.View view = this.b;
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    final defpackage.ebd k(int i) {
        defpackage.ebd ebdVarB;
        if (i == -1) {
            android.view.View view = this.b;
            ebdVarB = new defpackage.ebd(android.view.accessibility.AccessibilityNodeInfo.obtain(view));
            int i2 = dzs.a;
            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = ebdVarB.a;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            l(arrayList);
            if (accessibilityNodeInfo.getChildCount() > 0 && arrayList.size() > 0) {
                throw new java.lang.RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ebdVarB.j(view, ((java.lang.Integer) arrayList.get(i3)).intValue());
            }
        } else {
            ebdVarB = defpackage.ebd.b();
            ebdVarB.y(true);
            ebdVarB.A(true);
            ebdVarB.s("android.view.View");
            android.graphics.Rect rect = f;
            ebdVarB.o(rect);
            ebdVarB.p(rect);
            android.view.View view2 = this.b;
            ebdVarB.J(view2);
            o(i, ebdVarB);
            if (ebdVarB.e() == null && ebdVarB.d() == null) {
                throw new java.lang.RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            }
            android.graphics.Rect rect2 = this.h;
            ebdVarB.k(rect2);
            android.graphics.Rect rect3 = this.g;
            ebdVarB.l(rect3);
            if (rect2.equals(rect) && rect3.equals(rect)) {
                throw new java.lang.RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            }
            int actions = ebdVarB.a.getActions();
            if ((actions & 64) != 0) {
                throw new java.lang.RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            if ((actions & 128) != 0) {
                throw new java.lang.RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            ebdVarB.H(view2.getContext().getPackageName());
            ebdVarB.P(view2, i);
            if (this.c == i) {
                ebdVarB.m(true);
                ebdVarB.h(128);
            } else {
                ebdVarB.m(false);
                ebdVarB.h(64);
            }
            boolean z = this.d == i;
            if (z) {
                ebdVarB.h(2);
            } else if (ebdVarB.Z()) {
                ebdVarB.h(1);
            }
            ebdVarB.B(z);
            int[] iArr = this.j;
            view2.getLocationOnScreen(iArr);
            if (rect3.equals(rect)) {
                ebdVarB.o(rect2);
                android.graphics.Rect rect4 = new android.graphics.Rect();
                rect4.set(rect2);
                if (ebdVarB.b != -1) {
                    defpackage.ebd ebdVarB2 = defpackage.ebd.b();
                    android.graphics.Rect rect5 = new android.graphics.Rect();
                    for (int i4 = ebdVarB.b; i4 != -1; i4 = ebdVarB2.b) {
                        ebdVarB2.K(view2, -1);
                        ebdVarB2.o(rect);
                        o(i4, ebdVarB2);
                        ebdVarB2.k(rect5);
                        rect4.offset(rect5.left, rect5.top);
                    }
                }
                view2.getLocationOnScreen(iArr);
                rect4.offset(iArr[0] - view2.getScrollX(), iArr[1] - view2.getScrollY());
                ebdVarB.p(rect4);
                ebdVarB.l(rect3);
            }
            android.graphics.Rect rect6 = this.i;
            if (view2.getLocalVisibleRect(rect6)) {
                rect6.offset(iArr[0] - view2.getScrollX(), iArr[1] - view2.getScrollY());
                if (rect3.intersect(rect6)) {
                    ebdVarB.p(rect3);
                    if (rect3 != null && !rect3.isEmpty() && view2.getWindowVisibility() == 0) {
                        java.lang.Object parent = view2.getParent();
                        while (parent instanceof android.view.View) {
                            android.view.View view3 = (android.view.View) parent;
                            if (view3.getAlpha() > 0.0f && view3.getVisibility() == 0) {
                                parent = view3.getParent();
                            }
                        }
                        if (parent != null) {
                            ebdVarB.W(true);
                        }
                    }
                }
            }
        }
        return ebdVarB;
    }

    protected abstract void l(java.util.List list);

    protected abstract void o(int i, defpackage.ebd ebdVar);

    public final void q(int i) {
        int i2 = this.e;
        if (i2 != i) {
            this.e = i;
            v(i, 128);
            v(i2, 256);
        }
    }

    public final boolean r(int i) {
        if (this.c != i) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.b.invalidate();
        v(i, 65536);
        return true;
    }

    public final boolean s(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        p(i, false);
        v(i, 8);
        return true;
    }

    public abstract boolean t(int i, int i2, android.os.Bundle bundle);

    public final boolean u(int i) {
        int i2;
        android.view.View view = this.b;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.d) != i) {
            if (i2 != Integer.MIN_VALUE) {
                s(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.d = i;
                p(i, true);
                v(i, 8);
                return true;
            }
        }
        return false;
    }

    public final void v(int i, int i2) {
        android.view.View view;
        android.view.ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = (view = this.b).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, j(i, i2));
    }

    protected void n(defpackage.ebd ebdVar) {
    }

    protected void m(int i, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
    }

    protected void p(int i, boolean z) {
    }
}
