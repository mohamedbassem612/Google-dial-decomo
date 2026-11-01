package androidx.drawerlayout.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class DrawerLayout extends android.view.ViewGroup {
    public static final /* synthetic */ int e = 0;
    private float A;
    private android.graphics.drawable.Drawable B;
    private final java.util.ArrayList C;
    private android.graphics.Rect D;
    private android.graphics.Matrix E;
    private final defpackage.ebo F;
    public boolean b;
    public defpackage.eax c;
    public boolean d;
    private float g;
    private final int h;
    private int i;
    private float j;
    private final android.graphics.Paint k;
    private final defpackage.ecm l;
    private final defpackage.ecm m;
    private final defpackage.ejh n;
    private final defpackage.ejh o;
    private int p;
    private boolean q;
    private boolean r;
    private android.window.OnBackInvokedCallback s;
    private android.window.OnBackInvokedDispatcher t;
    private int u;
    private int v;
    private int w;
    private int x;
    private java.util.List y;
    private float z;
    private static final int[] f = {android.R.attr.colorPrimaryDark};
    public static final int[] a = {android.R.attr.layout_gravity};

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new defpackage.ejf();
        this.i = -1728053248;
        this.k = new android.graphics.Paint();
        this.r = true;
        this.u = 3;
        this.v = 3;
        this.w = 3;
        this.x = 3;
        this.F = new defpackage.ebo() { // from class: ejd
            @Override // defpackage.ebo
            public final boolean a(android.view.View view) {
                androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.a;
                if (!drawerLayout.o(view) || drawerLayout.a(view) == 2) {
                    return false;
                }
                drawerLayout.g(view, true);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f2 = getResources().getDisplayMetrics().density;
        this.h = (int) ((64.0f * f2) + 0.5f);
        float f3 = f2 * 400.0f;
        defpackage.ejh ejhVar = new defpackage.ejh(this, 3);
        this.n = ejhVar;
        defpackage.ejh ejhVar2 = new defpackage.ejh(this, 5);
        this.o = ejhVar2;
        defpackage.ecm ecmVarM = defpackage.ecm.m(this, ejhVar);
        this.l = ecmVarM;
        ecmVarM.j = 1;
        ecmVarM.g = f3;
        ejhVar.b = ecmVarM;
        defpackage.ecm ecmVarM2 = defpackage.ecm.m(this, ejhVar2);
        this.m = ecmVarM2;
        ecmVarM2.j = 2;
        ecmVarM2.g = f3;
        ejhVar2.b = ecmVarM2;
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        defpackage.eje ejeVar = new defpackage.eje(this);
        defpackage.dzs.l(this);
        setAccessibilityDelegate(ejeVar.A);
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            defpackage.dzk.o(this, new izf(1));
            setSystemUiVisibility(1280);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f);
            try {
                this.B = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.ejc.a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.g = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.g = getResources().getDimension(2131165535);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.C = new java.util.ArrayList();
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    static java.lang.String f(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : java.lang.Integer.toHexString(i);
    }

    public static final float q(android.view.View view) {
        return ((defpackage.ejg) view.getLayoutParams()).b;
    }

    static final boolean r(android.view.View view) {
        return ((defpackage.ejg) view.getLayoutParams()).a == 0;
    }

    public static final boolean t(android.view.View view) {
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(((defpackage.ejg) view.getLayoutParams()).a, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    private final void x(android.view.View view) {
        ebc ebcVar = ebc.k;
        defpackage.dzs.g(view, ebcVar.a());
        if (!o(view) || a(view) == 2) {
            return;
        }
        defpackage.dzs.h(view, ebcVar, null, this.F);
    }

    private final void y(android.view.View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (z ? childAt != view : t(childAt)) {
                childAt.setImportantForAccessibility(4);
            } else {
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final int a(android.view.View view) {
        int i;
        int i2;
        if (!t(view)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(view, "View ", " is not a drawer"));
        }
        int i3 = ((defpackage.ejg) view.getLayoutParams()).a;
        int layoutDirection = getLayoutDirection();
        if (i3 == 3) {
            i = this.u;
            if (i == 3) {
                i2 = layoutDirection == 0 ? this.w : this.x;
                if (i2 == 3) {
                    return 0;
                }
                return i2;
            }
            return i;
        }
        if (i3 == 5) {
            i = this.v;
            if (i == 3) {
                i2 = layoutDirection == 0 ? this.x : this.w;
                if (i2 == 3) {
                    return 0;
                }
                return i2;
            }
            return i;
        }
        if (i3 == 8388611) {
            i = this.w;
            if (i == 3) {
                i2 = layoutDirection == 0 ? this.u : this.v;
                if (i2 == 3) {
                    return 0;
                }
                return i2;
            }
            return i;
        }
        if (i3 != 8388613) {
            return 0;
        }
        i = this.x;
        if (i == 3) {
            i2 = layoutDirection == 0 ? this.v : this.u;
            if (i2 == 3) {
                return 0;
            }
            return i2;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (!t(childAt)) {
                    this.C.add(childAt);
                } else if (o(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                java.util.ArrayList arrayList2 = this.C;
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    android.view.View view = (android.view.View) arrayList2.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.C.clear();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (d() != null || t(view)) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public final int b(android.view.View view) {
        return android.view.Gravity.getAbsoluteGravity(((defpackage.ejg) view.getLayoutParams()).a, getLayoutDirection());
    }

    public final android.view.View c(int i) {
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if ((b(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.ejg) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = java.lang.Math.max(fMax, ((defpackage.ejg) getChildAt(i).getLayoutParams()).b);
        }
        this.j = fMax;
        defpackage.ecm ecmVar = this.l;
        defpackage.ecm ecmVar2 = this.m;
        boolean zL = ecmVar.l();
        boolean zL2 = ecmVar2.l();
        if (zL || zL2) {
            postInvalidateOnAnimation();
        }
    }

    final android.view.View d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if ((((defpackage.ejg) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.j <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                android.view.View childAt = getChildAt(childCount);
                android.graphics.Rect rect = this.D;
                if (rect == null) {
                    rect = new android.graphics.Rect();
                    this.D = rect;
                }
                childAt.getHitRect(rect);
                if (this.D.contains((int) x, (int) y) && !r(childAt)) {
                    if (childAt.getMatrix().isIdentity()) {
                        float scrollX = getScrollX() - childAt.getLeft();
                        float scrollY = getScrollY() - childAt.getTop();
                        motionEvent.offsetLocation(scrollX, scrollY);
                        zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-scrollX, -scrollY);
                    } else {
                        int scrollX2 = getScrollX() - childAt.getLeft();
                        int scrollY2 = getScrollY() - childAt.getTop();
                        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                        motionEventObtain.offsetLocation(scrollX2, scrollY2);
                        android.graphics.Matrix matrix = childAt.getMatrix();
                        if (!matrix.isIdentity()) {
                            android.graphics.Matrix matrix2 = this.E;
                            if (matrix2 == null) {
                                matrix2 = new android.graphics.Matrix();
                                this.E = matrix2;
                            }
                            matrix.invert(matrix2);
                            motionEventObtain.transform(this.E);
                        }
                        zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (zDispatchGenericMotionEvent) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        android.graphics.drawable.Drawable background;
        int height = getHeight();
        boolean zR = r(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zR) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && t(childAt) && childAt.getHeight() >= height) {
                    if (n(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f2 = this.j;
        if (f2 > 0.0f && zR) {
            int i4 = this.i;
            android.graphics.Paint paint = this.k;
            paint.setColor((((int) ((i4 >>> 24) * f2)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final android.view.View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (t(childAt)) {
                if (!t(childAt)) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bg(childAt, "View ", " is not a drawer"));
                }
                if (((defpackage.ejg) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final void g(android.view.View view, boolean z) {
        if (!t(view)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(view, "View ", " is not a sliding drawer"));
        }
        defpackage.ejg ejgVar = (defpackage.ejg) view.getLayoutParams();
        if (this.r) {
            ejgVar.b = 0.0f;
            ejgVar.d = 0;
        } else if (z) {
            ejgVar.d |= 4;
            if (n(view, 3)) {
                this.l.j(view, -view.getWidth(), view.getTop());
            } else {
                this.m.j(view, getWidth(), view.getTop());
            }
        } else {
            float fQ = q(view);
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (fQ * width));
            if (!n(view, 3)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            j(view, 0.0f);
            m(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.ejg();
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.ejg) {
            return new defpackage.ejg((defpackage.ejg) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.ejg((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.ejg(layoutParams);
    }

    public final void h(boolean z) {
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            defpackage.ejg ejgVar = (defpackage.ejg) childAt.getLayoutParams();
            if (t(childAt) && (!z || ejgVar.c)) {
                zJ |= n(childAt, 3) ? this.l.j(childAt, -childAt.getWidth(), childAt.getTop()) : this.m.j(childAt, getWidth(), childAt.getTop());
                ejgVar.c = false;
            }
        }
        this.n.n();
        this.o.n();
        if (zJ) {
            invalidate();
        }
    }

    public final void i(int i, int i2) {
        android.view.View viewC;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.u = i;
        } else if (i2 == 5) {
            this.v = i;
        } else if (i2 == 8388611) {
            this.w = i;
        } else if (i2 == 8388613) {
            this.x = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.l : this.m).c();
        }
        if (i != 1) {
            if (i != 2 || (viewC = c(absoluteGravity)) == null) {
                return;
            }
            u(viewC);
            return;
        }
        android.view.View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            g(viewC2, true);
        }
    }

    public final void j(android.view.View view, float f2) {
        defpackage.ejg ejgVar = (defpackage.ejg) view.getLayoutParams();
        if (f2 == ejgVar.b) {
            return;
        }
        ejgVar.b = f2;
        java.util.List list = this.y;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.emo) this.y.get(size)).f(view);
            }
        }
    }

    public final void k(int i) {
        this.i = i;
        invalidate();
    }

    final void l() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.view.View viewE = e();
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(this);
            if (viewE == null || onBackInvokedDispatcherM == null || a(viewE) != 0 || !isAttachedToWindow()) {
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.t;
                if (onBackInvokedDispatcher != null) {
                    ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, this.s);
                    this.t = null;
                    return;
                }
                return;
            }
            if (this.t == null) {
                if (this.s == null) {
                    drn drnVar = new drn(this, 4);
                    j$.util.Objects.requireNonNull(drnVar);
                    this.s = new ls(drnVar, 2);
                }
                ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, 1000000, this.s);
                this.t = onBackInvokedDispatcherM;
            }
        }
    }

    public final void m(int i, android.view.View view) {
        int i2;
        android.view.View rootView;
        defpackage.ecm ecmVar = this.m;
        int i3 = this.l.a;
        int i4 = ecmVar.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((defpackage.ejg) view.getLayoutParams()).b;
            if (f2 == 0.0f) {
                defpackage.ejg ejgVar = (defpackage.ejg) view.getLayoutParams();
                if ((ejgVar.d & 1) == 1) {
                    ejgVar.d = 0;
                    java.util.List list = this.y;
                    if (list != null) {
                        int size = list.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            } else {
                                ((defpackage.emo) this.y.get(size)).d(view);
                            }
                        }
                    }
                    y(view, false);
                    x(view);
                    l();
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                defpackage.ejg ejgVar2 = (defpackage.ejg) view.getLayoutParams();
                if ((ejgVar2.d & 1) == 0) {
                    ejgVar2.d = 1;
                    java.util.List list2 = this.y;
                    if (list2 != null) {
                        int size2 = list2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            } else {
                                ((defpackage.emo) this.y.get(size2)).e(view);
                            }
                        }
                    }
                    y(view, true);
                    x(view);
                    l();
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        java.util.List list3 = this.y;
        if (list3 == null) {
            return;
        }
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            }
        }
    }

    public final boolean n(android.view.View view, int i) {
        return (b(view) & i) == i;
    }

    public final boolean o(android.view.View view) {
        if (t(view)) {
            return (((defpackage.ejg) view.getLayoutParams()).d & 1) == 1;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bg(view, "View ", " is not a drawer"));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r = true;
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r = true;
        this.n.n();
        this.o.n();
        l();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.d || this.B == null) {
            return;
        }
        defpackage.eax eaxVar = this.c;
        int iD = eaxVar != null ? eaxVar.d() : 0;
        if (iD > 0) {
            this.B.setBounds(0, 0, getWidth(), iD);
            this.B.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View viewA;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        defpackage.ecm ecmVar = this.m;
        defpackage.ecm ecmVar2 = this.l;
        int actionMasked = motionEvent.getActionMasked();
        boolean zI = ecmVar2.i(motionEvent) | ecmVar.i(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                h(true);
                this.b = false;
            } else if (actionMasked == 2) {
                float[] fArr4 = ecmVar2.c;
                if (fArr4 != null) {
                    for (int i = 0; i < fArr4.length; i++) {
                        if (ecmVar2.g(i)) {
                            float[] fArr5 = ecmVar2.c;
                            if (fArr5 != null && (fArr = ecmVar2.d) != null && (fArr2 = ecmVar2.e) != null && (fArr3 = ecmVar2.f) != null) {
                                float f2 = fArr2[i] - fArr5[i];
                                float f3 = fArr3[i] - fArr[i];
                                int i2 = ecmVar2.b;
                                if ((f2 * f2) + (f3 * f3) > i2 * i2) {
                                    this.n.n();
                                    this.o.n();
                                    break;
                                }
                            } else {
                                android.util.Log.w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                h(true);
                this.b = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.z = x;
            this.A = y;
            z = this.j > 0.0f && (viewA = ecmVar2.a((int) x, (int) y)) != null && r(viewA);
            this.b = false;
        }
        if (zI || z) {
            return true;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((defpackage.ejg) getChildAt(i3).getLayoutParams()).c) {
                return true;
            }
        }
        return this.b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (e() != null) {
                keyEvent.startTracking();
                return true;
            }
            i = 4;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        android.view.View viewE = e();
        if (viewE != null && a(viewE) == 0) {
            h(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        this.q = true;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                defpackage.ejg ejgVar = (defpackage.ejg) childAt.getLayoutParams();
                if (r(childAt)) {
                    childAt.layout(ejgVar.leftMargin, ejgVar.topMargin, ejgVar.leftMargin + childAt.getMeasuredWidth(), ejgVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    float f3 = measuredWidth;
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (n(childAt, 3)) {
                        i5 = (-measuredWidth) + ((int) (ejgVar.b * f3));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        int i7 = i3 - i;
                        int i8 = i7 - ((int) (ejgVar.b * f3));
                        float f4 = (i7 - i8) / f3;
                        i5 = i8;
                        f2 = f4;
                    }
                    int i9 = measuredWidth + i5;
                    float f5 = ejgVar.b;
                    int i10 = ejgVar.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < ejgVar.topMargin) {
                            i12 = ejgVar.topMargin;
                        } else if (i12 + measuredHeight > i11 - ejgVar.bottomMargin) {
                            i12 = (i11 - ejgVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i12, i9, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i5, ejgVar.topMargin, i9, ejgVar.topMargin + measuredHeight);
                    } else {
                        int i13 = i4 - i2;
                        childAt.layout(i5, (i13 - ejgVar.bottomMargin) - childAt.getMeasuredHeight(), i9, i13 - ejgVar.bottomMargin);
                    }
                    if (f2 != f5) {
                        j(childAt, f2);
                    }
                    int i14 = ejgVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i14) {
                        childAt.setVisibility(i14);
                    }
                }
            }
        }
        int i15 = defpackage.dzs.a;
        defpackage.eax eaxVarA = defpackage.dzl.a(this);
        if (eaxVarA != null) {
            defpackage.ecm ecmVar = this.l;
            defpackage.dwn dwnVarD = eaxVarA.b.D();
            ecmVar.h = java.lang.Math.max(ecmVar.i, dwnVarD.b);
            defpackage.ecm ecmVar2 = this.m;
            ecmVar2.h = java.lang.Math.max(ecmVar2.i, dwnVarD.d);
        }
        this.q = false;
        this.r = false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                throw new java.lang.IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        } else if (mode2 != 1073741824) {
            mode = 1073741824;
            if (isInEditMode()) {
                throw new java.lang.IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.c != null) {
            int i4 = defpackage.dzs.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < childCount) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                defpackage.ejg ejgVar = (defpackage.ejg) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(ejgVar.a, layoutDirection);
                    int i8 = defpackage.dzs.a;
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    defpackage.eax eaxVarP = this.c;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            eaxVarP = eaxVarP.p(eaxVarP.b(), eaxVarP.d(), i3, eaxVarP.a());
                        } else if (absoluteGravity == 5) {
                            eaxVarP = eaxVarP.p(i3, eaxVarP.d(), eaxVarP.c(), eaxVarP.a());
                        }
                        defpackage.dzs.d(childAt, eaxVarP);
                    } else {
                        if (absoluteGravity == 3) {
                            eaxVarP = eaxVarP.p(eaxVarP.b(), eaxVarP.d(), i3, eaxVarP.a());
                        } else if (absoluteGravity == 5) {
                            eaxVarP = eaxVarP.p(i3, eaxVarP.d(), eaxVarP.c(), eaxVarP.a());
                        }
                        ejgVar.leftMargin = eaxVarP.b();
                        ejgVar.topMargin = eaxVarP.d();
                        ejgVar.rightMargin = eaxVarP.c();
                        ejgVar.bottomMargin = eaxVarP.a();
                    }
                }
                if (!r(childAt)) {
                    if (!t(childAt)) {
                        throw new java.lang.IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    int i9 = defpackage.dzs.a;
                    float elevation = childAt.getElevation();
                    float f2 = this.g;
                    if (elevation != f2) {
                        childAt.setElevation(f2);
                    }
                    int iB = b(childAt) & 7;
                    int i10 = iB == 3 ? 1 : i3;
                    if (i10 == 0) {
                        if (i10 == 0) {
                            if (i7 == 0) {
                                i7 = i3;
                            }
                        }
                        i6 |= i10;
                        childAt.measure(getChildMeasureSpec(i, this.h + ejgVar.leftMargin + ejgVar.rightMargin, ejgVar.width), getChildMeasureSpec(i2, ejgVar.topMargin + ejgVar.bottomMargin, ejgVar.height));
                        i7 |= i10 ^ 1;
                    } else if (i6 == 0) {
                        i6 = i3;
                        if (i10 == 0) {
                            if (i7 == 0) {
                                i7 = i3;
                            }
                        }
                        i6 |= i10;
                        childAt.measure(getChildMeasureSpec(i, this.h + ejgVar.leftMargin + ejgVar.rightMargin, ejgVar.width), getChildMeasureSpec(i2, ejgVar.topMargin + ejgVar.bottomMargin, ejgVar.height));
                        i7 |= i10 ^ 1;
                    }
                    throw new java.lang.IllegalStateException("Child drawer has absolute gravity " + f(iB) + " but this DrawerLayout already has a drawer view along that edge");
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec((size - ejgVar.leftMargin) - ejgVar.rightMargin, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((size2 - ejgVar.topMargin) - ejgVar.bottomMargin, 1073741824));
            }
            i5++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View viewC;
        if (!(parcelable instanceof androidx.drawerlayout.widget.DrawerLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = (androidx.drawerlayout.widget.DrawerLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        int i = savedState.a;
        if (i != 0 && (viewC = c(i)) != null) {
            u(viewC);
        }
        int i2 = savedState.b;
        if (i2 != 3) {
            i(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            i(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            i(i4, 8388611);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            i(i5, 8388613);
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = new androidx.drawerlayout.widget.DrawerLayout.SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            defpackage.ejg ejgVar = (defpackage.ejg) getChildAt(i).getLayoutParams();
            int i2 = ejgVar.d;
            if (i2 == 1 || i2 == 2) {
                savedState.a = ejgVar.a;
                break;
            }
        }
        savedState.b = this.u;
        savedState.e = this.v;
        savedState.f = this.w;
        savedState.g = this.x;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View viewD;
        defpackage.ecm ecmVar = this.l;
        ecmVar.e(motionEvent);
        this.m.e(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.z = x;
            this.A = y;
            this.b = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            android.view.View viewA = ecmVar.a((int) x2, (int) y2);
            if (viewA != null && r(viewA)) {
                float f2 = x2 - this.z;
                float f3 = y2 - this.A;
                int i = ecmVar.b;
                z = (f2 * f2) + (f3 * f3) >= ((float) (i * i)) || (viewD = d()) == null || a(viewD) == 2;
            }
            h(z);
        } else if (action == 3) {
            h(true);
            this.b = false;
        }
        return true;
    }

    public final void p() {
        android.view.View viewC = c(8388611);
        if (viewC == null) {
            throw new java.lang.IllegalArgumentException("No drawer view found with gravity ".concat(java.lang.String.valueOf(f(8388611))));
        }
        g(viewC, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            h(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.q) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        android.view.View viewC = c(8388611);
        if (viewC != null) {
            return o(viewC);
        }
        return false;
    }

    public final void u(android.view.View view) {
        if (!t(view)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bg(view, "View ", " is not a sliding drawer"));
        }
        defpackage.ejg ejgVar = (defpackage.ejg) view.getLayoutParams();
        if (this.r) {
            ejgVar.b = 1.0f;
            ejgVar.d = 1;
            y(view, true);
            x(view);
            l();
        } else {
            ejgVar.d |= 2;
            if (n(view, 3)) {
                this.l.j(view, 0, view.getTop());
            } else {
                this.m.j(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void v(defpackage.emo emoVar) {
        if (this.y == null) {
            this.y = new java.util.ArrayList();
        }
        this.y.add(emoVar);
    }

    public final void w(defpackage.emo emoVar) {
        java.util.List list = this.y;
        if (list != null) {
            list.remove(emoVar);
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.ejg(getContext(), attributeSet);
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.kw(6);
        int a;
        int b;
        int e;
        int f;
        int g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = 0;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
        }
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969315);
    }

    public DrawerLayout(android.content.Context context) {
        this(context, null);
    }
}
