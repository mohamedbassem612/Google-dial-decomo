package androidx.coordinatorlayout.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements defpackage.dyv, defpackage.dyw {
    public static final java.lang.String a;
    public static final java.lang.Class[] b;
    public static final java.lang.ThreadLocal c;
    static final java.util.Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final defpackage.dxz j;
    public defpackage.eax e;
    public boolean f;
    public android.view.ViewGroup.OnHierarchyChangeListener g;
    public final defpackage.kgl h;
    private final java.util.List k;
    private final java.util.List l;
    private android.graphics.Paint m;
    private final int[] n;
    private final int[] o;
    private final int[] p;
    private boolean q;
    private boolean r;
    private int[] s;
    private android.view.View t;
    private android.view.View u;
    private boolean v;
    private android.graphics.drawable.Drawable w;
    private defpackage.dyy x;
    private final defpackage.dyx y;
    private jvi z;

    static {
        java.lang.Package r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new defpackage.agl(3);
        b = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class};
        c = new java.lang.ThreadLocal();
        j = new defpackage.dyb(12);
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i2);
        this.k = new java.util.ArrayList();
        this.h = new defpackage.kgl((byte[]) null);
        this.l = new java.util.ArrayList();
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.y = new defpackage.dyx();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.duk.a, 0, 2132086191);
            int[] iArr = defpackage.duk.a;
            int i3 = defpackage.dzs.a;
            defpackage.dzp.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 2132086191);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.duk.a, i2, 0);
            int[] iArr2 = defpackage.duk.a;
            int i4 = defpackage.dzs.a;
            defpackage.dzp.b(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            android.content.res.Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (int i5 = 0; i5 < length; i5++) {
                int[] iArr3 = this.s;
                iArr3[i5] = (int) (iArr3[i5] * f);
            }
        }
        this.w = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new defpackage.duo(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private final boolean A(dum dumVar, android.view.View view, android.view.MotionEvent motionEvent, int i2) {
        return i2 != 0 ? dumVar.onTouchEvent(this, view, motionEvent) : dumVar.onInterceptTouchEvent(this, view, motionEvent);
    }

    private final boolean B(android.view.MotionEvent motionEvent, int i2) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        java.util.List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        java.util.Comparator comparator = d;
        if (comparator != null) {
            java.util.Collections.sort(list, comparator);
        }
        int size = list.size();
        android.view.MotionEvent motionEventD = null;
        boolean zA = false;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            android.view.View view = (android.view.View) list.get(i4);
            dup layoutParams = view.getLayoutParams();
            dum dumVar = layoutParams.a;
            if (!(zA || z) || actionMasked == 0) {
                if (!z && !zA && dumVar != null && (zA = A(dumVar, view, motionEvent, i2))) {
                    this.t = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            android.view.View view2 = (android.view.View) list.get(i5);
                            dum dumVar2 = view2.getLayoutParams().a;
                            if (dumVar2 != null) {
                                if (motionEventD == null) {
                                    motionEventD = D(motionEvent);
                                }
                                A(dumVar2, view2, motionEventD, i2);
                            }
                        }
                    }
                }
                dum dumVar3 = layoutParams.a;
                if (dumVar3 == null) {
                    layoutParams.m = false;
                }
                boolean z2 = layoutParams.m;
                if (z2) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = dumVar3 != null ? dumVar3.blocksInteractionBelow(this, view) : false;
                    layoutParams.m = zBlocksInteractionBelow;
                }
                boolean z3 = zBlocksInteractionBelow && !z2;
                if (zBlocksInteractionBelow && !z3) {
                    break;
                }
                z = z3;
            } else if (dumVar != null) {
                if (motionEventD == null) {
                    motionEventD = D(motionEvent);
                }
                A(dumVar, view, motionEventD, i2);
            }
        }
        list.clear();
        if (motionEventD != null) {
            motionEventD.recycle();
        }
        return zA;
    }

    private static final void C(int i2, android.graphics.Rect rect, android.graphics.Rect rect2, dup dupVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = dupVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(r(dupVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final android.view.MotionEvent D(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void E(android.view.View view, int i2) {
        dup layoutParams = view.getLayoutParams();
        int i3 = layoutParams.i;
        if (i3 != i2) {
            int i4 = defpackage.dzs.a;
            view.offsetLeftAndRight(i2 - i3);
            layoutParams.i = i2;
        }
    }

    private static final void F(android.view.View view, int i2) {
        dup layoutParams = view.getLayoutParams();
        int i3 = layoutParams.j;
        if (i3 != i2) {
            int i4 = defpackage.dzs.a;
            view.offsetTopAndBottom(i2 - i3);
            layoutParams.j = i2;
        }
    }

    static final dup m(android.view.View view) {
        dup layoutParams = view.getLayoutParams();
        if (!layoutParams.b) {
            if (view instanceof dul) {
                dum dumVarA = ((dul) view).a();
                if (dumVarA == null) {
                    android.util.Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.b(dumVarA);
                layoutParams.b = true;
            } else {
                dun dunVar = null;
                for (java.lang.Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    dunVar = (dun) superclass.getAnnotation(dun.class);
                    if (dunVar != null) {
                        break;
                    }
                }
                if (dunVar != null) {
                    try {
                        layoutParams.b((dum) dunVar.a().getDeclaredConstructor(null).newInstance(null));
                    } catch (java.lang.Exception e) {
                        android.util.Log.e("CoordinatorLayout", "Default behavior class " + dunVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                layoutParams.b = true;
            }
        }
        return layoutParams;
    }

    private final int n() {
        return o() - getHeight();
    }

    private final int o() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            dup layoutParams = childAt.getLayoutParams();
            height += childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
        return height;
    }

    private final int p(int i2) {
        int[] iArr = this.s;
        if (iArr == null) {
            android.util.Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        android.util.Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int q() {
        return (int) (getHeight() * 0.2f);
    }

    private static int r(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int s(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static android.graphics.Rect u() {
        android.graphics.Rect rect = (android.graphics.Rect) j.a();
        return rect == null ? new android.graphics.Rect() : rect;
    }

    private final void v(dup dupVar, android.graphics.Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = java.lang.Math.max(getPaddingLeft() + dupVar.leftMargin, java.lang.Math.min(rect.left, ((width - getPaddingRight()) - i2) - dupVar.rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + dupVar.topMargin, java.lang.Math.min(rect.top, ((height - getPaddingBottom()) - i3) - dupVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void w(android.graphics.Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void x() {
        android.view.View view = this.t;
        if (view != null) {
            dum dumVar = view.getLayoutParams().a;
            if (dumVar != null) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                dumVar.onTouchEvent(this, this.t, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.t = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams().m = false;
        }
        this.q = false;
    }

    private final void y() {
        int i2 = defpackage.dzs.a;
        if (!getFitsSystemWindows()) {
            defpackage.dzk.o(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new ebx(this, 1);
        }
        defpackage.dzk.o(this, this.x);
        setSystemUiVisibility(1280);
    }

    private final boolean z(int i2) {
        android.view.View view;
        android.view.View focusedChild = this;
        while (true) {
            view = null;
            if (focusedChild != null) {
                if (focusedChild.isFocused()) {
                    view = focusedChild;
                    break;
                }
                focusedChild = focusedChild instanceof android.view.ViewGroup ? ((android.view.ViewGroup) focusedChild).getFocusedChild() : null;
            } else {
                break;
            }
        }
        t(this, view, 2, 1);
        int[] iArr = this.p;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    public final java.util.List a(android.view.View view) {
        defpackage.aec aecVar = (defpackage.aec) this.h.b;
        int i2 = aecVar.d;
        java.util.ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) aecVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(aecVar.d(i3));
            }
        }
        return arrayList == null ? java.util.Collections.EMPTY_LIST : arrayList;
    }

    public final void b(android.view.View view) {
        java.util.ArrayList arrayListJ = this.h.J(view);
        if (arrayListJ == null || arrayListJ.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListJ.size(); i2++) {
            android.view.View view2 = (android.view.View) arrayListJ.get(i2);
            dum dumVar = view2.getLayoutParams().a;
            if (dumVar != null) {
                dumVar.onDependentViewChanged(this, view2, view);
            }
        }
    }

    final void c(android.view.View view, boolean z, android.graphics.Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            duq.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof dup) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.dyv
    public final void d(android.view.View view, int i2, int i3, int[] iArr, int i4) {
        dum dumVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                dup layoutParams = childAt.getLayoutParams();
                if (layoutParams.d(i4) && (dumVar = layoutParams.a) != null) {
                    int[] iArr2 = this.n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    dumVar.onNestedPreScroll(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? java.lang.Math.max(iMax, iArr2[0]) : java.lang.Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? java.lang.Math.max(iMax2, iArr2[1]) : java.lang.Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (zDispatchKeyEvent || keyEvent.getAction() != 0) {
            return zDispatchKeyEvent;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? z(-getHeight()) : z(-q());
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? z(getHeight()) : z(q());
        }
        if (keyCode == 62) {
            return keyEvent.isShiftPressed() ? z(-o()) : z(n());
        }
        if (keyCode == 92) {
            return z(-getHeight());
        }
        if (keyCode == 93) {
            return z(getHeight());
        }
        if (keyCode != 122) {
            return keyCode == 123 ? z(n()) : zDispatchKeyEvent;
        }
        return z(-o());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j2) {
        android.graphics.Canvas canvas2;
        dup layoutParams = view.getLayoutParams();
        dum dumVar = layoutParams.a;
        if (dumVar != null) {
            float scrimOpacity = dumVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                android.graphics.Paint paint = this.m;
                if (paint == null) {
                    paint = new android.graphics.Paint();
                    this.m = paint;
                }
                paint.setColor(layoutParams.a.getScrimColor(this, view));
                android.graphics.Paint paint2 = this.m;
                int iRound = java.lang.Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint2.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas2 = canvas;
                    canvas2.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
                } else {
                    canvas2 = canvas;
                }
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.m);
                canvas2.restoreToCount(iSave);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        return super.drawChild(canvas2, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.dyv
    public final void e(android.view.View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.o);
    }

    @Override // defpackage.dyw
    public final void f(android.view.View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        dum dumVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                dup layoutParams = childAt.getLayoutParams();
                if (layoutParams.d(i6) && (dumVar = layoutParams.a) != null) {
                    int[] iArr2 = this.n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    dumVar.onNestedScroll(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    iMax = i4 > 0 ? java.lang.Math.max(iMax, iArr2[0]) : java.lang.Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? java.lang.Math.max(iMax2, iArr2[1]) : java.lang.Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.dyv
    public final void g(android.view.View view, android.view.View view2, int i2, int i3) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
        android.view.View view3;
        android.view.View view4;
        int i4;
        int i5;
        dum dumVar;
        this.y.b(i2, i3);
        this.u = view2;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            android.view.View childAt = this.getChildAt(i6);
            dup layoutParams = childAt.getLayoutParams();
            if (!layoutParams.d(i3) || (dumVar = layoutParams.a) == null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
                dumVar.onNestedScrollAccepted(coordinatorLayout, childAt, view3, view4, i4, i5);
            }
            i6++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i2 = i4;
            i3 = i5;
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new dup();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof dup) {
            return new dup((dup) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new dup((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new dup(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return java.lang.Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return java.lang.Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.dyv
    public final void h(android.view.View view, int i2) {
        this.y.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            dup layoutParams = childAt.getLayoutParams();
            if (layoutParams.d(i2)) {
                dum dumVar = layoutParams.a;
                if (dumVar != null) {
                    dumVar.onStopNestedScroll(this, childAt, view, i2);
                }
                layoutParams.c(i2, false);
                layoutParams.a();
            }
        }
        this.u = null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x025b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    public final void i(int i2) {
        int i3;
        java.util.List list;
        dum dumVar;
        boolean zOnDependentViewChanged;
        java.util.List list2;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int height;
        int i5;
        dup dupVar;
        dum dumVar2;
        int layoutDirection = getLayoutDirection();
        java.util.List list3 = this.k;
        int size = list3.size();
        android.graphics.Rect rectU = u();
        android.graphics.Rect rectU2 = u();
        android.graphics.Rect rectU3 = u();
        int i6 = 0;
        while (i6 < size) {
            android.view.View view = (android.view.View) list3.get(i6);
            dup layoutParams = view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                list2 = list3;
                i3 = i6;
            } else {
                int i7 = 0;
                while (i7 < i6) {
                    if (layoutParams.l == ((android.view.View) list3.get(i7))) {
                        dup dupVar2 = (dup) view.getLayoutParams();
                        if (dupVar2.k != null) {
                            dup dupVar3 = layoutParams;
                            android.graphics.Rect rectU4 = u();
                            android.graphics.Rect rectU5 = u();
                            android.graphics.Rect rectU6 = u();
                            duq.a(this, dupVar2.k, rectU4);
                            c(view, false, rectU5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            dupVar = dupVar3;
                            C(layoutDirection, rectU4, rectU6, dupVar2, measuredWidth, measuredHeight);
                            boolean z3 = (rectU6.left == rectU5.left && rectU6.top == rectU5.top) ? false : true;
                            v(dupVar2, rectU6, measuredWidth, measuredHeight);
                            int i8 = rectU6.left - rectU5.left;
                            int i9 = rectU6.top - rectU5.top;
                            if (i8 != 0) {
                                int i10 = defpackage.dzs.a;
                                view.offsetLeftAndRight(i8);
                            }
                            if (i9 != 0) {
                                int i11 = defpackage.dzs.a;
                                view.offsetTopAndBottom(i9);
                            }
                            if (z3 && (dumVar2 = dupVar2.a) != null) {
                                dumVar2.onDependentViewChanged(this, view, dupVar2.k);
                            }
                            w(rectU4);
                            w(rectU5);
                            w(rectU6);
                        } else {
                            dupVar = layoutParams;
                        }
                    } else {
                        dupVar = layoutParams;
                    }
                    i7++;
                    i6 = i6;
                    layoutParams = dupVar;
                }
                dup dupVar4 = layoutParams;
                i3 = i6;
                c(view, true, rectU2);
                if (dupVar4.g != 0 && !rectU2.isEmpty()) {
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(dupVar4.g, layoutDirection);
                    int i12 = absoluteGravity & 112;
                    if (i12 == 48) {
                        rectU.top = java.lang.Math.max(rectU.top, rectU2.bottom);
                    } else if (i12 == 80) {
                        rectU.bottom = java.lang.Math.max(rectU.bottom, getHeight() - rectU2.top);
                    }
                    int i13 = absoluteGravity & 7;
                    if (i13 == 3) {
                        rectU.left = java.lang.Math.max(rectU.left, rectU2.right);
                    } else if (i13 == 5) {
                        rectU.right = java.lang.Math.max(rectU.right, getWidth() - rectU2.left);
                    }
                }
                if (dupVar4.h == 0 || view.getVisibility() != 0 || !view.isLaidOut() || view.getWidth() <= 0 || view.getHeight() <= 0) {
                    list = list3;
                } else {
                    dup layoutParams2 = view.getLayoutParams();
                    dum dumVar3 = layoutParams2.a;
                    android.graphics.Rect rectU7 = u();
                    android.graphics.Rect rectU8 = u();
                    list = list3;
                    rectU8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (dumVar3 == null || !dumVar3.getInsetDodgeRect(this, view, rectU7)) {
                        rectU7.set(rectU8);
                    } else if (!rectU8.contains(rectU7)) {
                        throw new java.lang.IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectU7.toShortString() + " | Bounds:" + rectU8.toShortString());
                    }
                    w(rectU8);
                    if (rectU7.isEmpty()) {
                        w(rectU7);
                    } else {
                        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(layoutParams2.h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i5 = (rectU7.top - layoutParams2.topMargin) - layoutParams2.j) >= rectU.top) {
                            z = false;
                        } else {
                            F(view, rectU.top - i5);
                            z = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectU7.bottom) - layoutParams2.bottomMargin) + layoutParams2.j) < rectU.bottom) {
                            F(view, height - rectU.bottom);
                        } else if (!z) {
                            F(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i4 = (rectU7.left - layoutParams2.leftMargin) - layoutParams2.i) >= rectU.left) {
                            z2 = false;
                        } else {
                            E(view, rectU.left - i4);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectU7.right) - layoutParams2.rightMargin) + layoutParams2.i) < rectU.right) {
                            E(view, width - rectU.right);
                        } else if (!z2) {
                            E(view, 0);
                        }
                        w(rectU7);
                    }
                }
                int i14 = i3 + 1;
                if (i2 != 2) {
                    rectU3.set(view.getLayoutParams().p);
                    if (!rectU3.equals(rectU2)) {
                        view.getLayoutParams().p.set(rectU2);
                        while (i14 < size) {
                            java.util.List list4 = list;
                            android.view.View view2 = (android.view.View) list4.get(i14);
                            dup layoutParams3 = view2.getLayoutParams();
                            dumVar = layoutParams3.a;
                            if (dumVar == null && dumVar.layoutDependsOn(this, view2, view)) {
                                if (i2 == 0 && layoutParams3.o) {
                                    layoutParams3.a();
                                } else {
                                    if (i2 != 2) {
                                        zOnDependentViewChanged = dumVar.onDependentViewChanged(this, view2, view);
                                    } else {
                                        dumVar.onDependentViewRemoved(this, view2, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i2 == 1) {
                                        layoutParams3.o = zOnDependentViewChanged;
                                    }
                                }
                            }
                            i14++;
                            list = list4;
                        }
                    }
                } else {
                    while (i14 < size) {
                        java.util.List list5 = list;
                        android.view.View view3 = (android.view.View) list5.get(i14);
                        dup layoutParams4 = view3.getLayoutParams();
                        dumVar = layoutParams4.a;
                        if (dumVar == null) {
                        }
                        i14++;
                        list = list5;
                    }
                }
                list2 = list;
            }
            i6 = i3 + 1;
            list3 = list2;
        }
        w(rectU);
        w(rectU2);
        w(rectU3);
    }

    public final void j(android.view.View view, int i2) {
        int i3;
        dup layoutParams = view.getLayoutParams();
        android.view.View view2 = layoutParams.k;
        if (view2 != null) {
            android.graphics.Rect rectU = u();
            android.graphics.Rect rectU2 = u();
            try {
                duq.a(this, view2, rectU);
                dup dupVar = (dup) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                C(i2, rectU, rectU2, dupVar, measuredWidth, measuredHeight);
                v(dupVar, rectU2, measuredWidth, measuredHeight);
                view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
                return;
            } finally {
                w(rectU);
                w(rectU2);
            }
        }
        if (layoutParams.f != -1) {
            throw new java.lang.IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        int i4 = layoutParams.e;
        if (i4 < 0) {
            dup layoutParams2 = view.getLayoutParams();
            android.graphics.Rect rectU3 = u();
            rectU3.set(getPaddingLeft() + layoutParams2.leftMargin, getPaddingTop() + layoutParams2.topMargin, (getWidth() - getPaddingRight()) - layoutParams2.rightMargin, (getHeight() - getPaddingBottom()) - layoutParams2.bottomMargin);
            if (this.e != null) {
                int i5 = defpackage.dzs.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectU3.left += this.e.b();
                    rectU3.top += this.e.d();
                    rectU3.right -= this.e.c();
                    rectU3.bottom -= this.e.a();
                }
            }
            android.graphics.Rect rectU4 = u();
            android.view.Gravity.apply(r(layoutParams2.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectU3, rectU4, i2);
            view.layout(rectU4.left, rectU4.top, rectU4.right, rectU4.bottom);
            w(rectU3);
            w(rectU4);
            return;
        }
        dup layoutParams3 = view.getLayoutParams();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(s(layoutParams3.c), i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i4 = width - i4;
        }
        int iP = p(i4) - measuredWidth2;
        if (i6 == 1) {
            iP += measuredWidth2 / 2;
        } else if (i6 == 5) {
            iP += measuredWidth2;
        }
        if (i7 != 16) {
            i3 = i7 != 80 ? 0 : measuredHeight2;
        } else {
            i3 = measuredHeight2 / 2;
        }
        int iMax = java.lang.Math.max(getPaddingLeft() + layoutParams3.leftMargin, java.lang.Math.min(iP, ((width - getPaddingRight()) - measuredWidth2) - layoutParams3.rightMargin));
        int iMax2 = java.lang.Math.max(getPaddingTop() + layoutParams3.topMargin, java.lang.Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - layoutParams3.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void k(android.view.View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final boolean l(android.view.View view, int i2, int i3) {
        android.graphics.Rect rectU = u();
        duq.a(this, view, rectU);
        try {
            return rectU.contains(i2, i3);
        } finally {
            w(rectU);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.v) {
            if (this.z == null) {
                this.z = new jvi(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.z);
        }
        if (this.e == null) {
            int i2 = defpackage.dzs.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
        if (this.v && this.z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.z);
        }
        android.view.View view = this.u;
        if (view != null) {
            h(view, 0);
        }
        this.r = false;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.w == null) {
            return;
        }
        defpackage.eax eaxVar = this.e;
        int iD = eaxVar != null ? eaxVar.d() : 0;
        if (iD > 0) {
            this.w.setBounds(0, 0, getWidth(), iD);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x();
            actionMasked = 0;
        }
        boolean zB = B(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.t = null;
            x();
        }
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        dum dumVar;
        int layoutDirection = getLayoutDirection();
        java.util.List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            android.view.View view = (android.view.View) list.get(i6);
            if (view.getVisibility() != 8 && ((dumVar = view.getLayoutParams().a) == null || !dumVar.onLayoutChild(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Type inference failed for: r11v9, types: [dxz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [dxz, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected final void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
        android.view.View view2;
        float f3;
        float f4;
        boolean z2;
        dum dumVar;
        int childCount = getChildCount();
        int i2 = 0;
        boolean zOnNestedFling = false;
        while (i2 < childCount) {
            android.view.View childAt = this.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dup layoutParams = childAt.getLayoutParams();
                if (!layoutParams.n || (dumVar = layoutParams.a) == null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                    zOnNestedFling |= dumVar.onNestedFling(coordinatorLayout, childAt, view2, f3, f4, z2);
                }
            } else {
                coordinatorLayout = this;
                view2 = view;
                f3 = f;
                f4 = f2;
                z2 = z;
            }
            i2++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
            z = z2;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout2 = this;
        if (zOnNestedFling) {
            coordinatorLayout2.i(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout;
        android.view.View view2;
        float f3;
        float f4;
        dum dumVar;
        int childCount = getChildCount();
        int i2 = 0;
        boolean zOnNestedPreFling = false;
        while (i2 < childCount) {
            android.view.View childAt = this.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                dup layoutParams = childAt.getLayoutParams();
                if (!layoutParams.n || (dumVar = layoutParams.a) == null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    zOnNestedPreFling |= dumVar.onNestedPreFling(coordinatorLayout, childAt, view2, f3, f4);
                }
            } else {
                coordinatorLayout = this;
                view2 = view;
                f3 = f;
                f4 = f2;
            }
            i2++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        android.util.SparseArray sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            int id = childAt.getId();
            dum dumVar = m(childAt).a;
            if (id != -1 && dumVar != null && (parcelable2 = (android.os.Parcelable) sparseArray.get(id)) != null) {
                dumVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState;
        androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState savedState = new androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState(super.onSaveInstanceState());
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            int id = childAt.getId();
            dum dumVar = childAt.getLayoutParams().a;
            if (id != -1 && dumVar != null && (parcelableOnSaveInstanceState = dumVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zB;
        int actionMasked = motionEvent.getActionMasked();
        android.view.View view = this.t;
        boolean z = false;
        if (view != null) {
            dum dumVar = view.getLayoutParams().a;
            zB = dumVar != null ? dumVar.onTouchEvent(this, this.t, motionEvent) : false;
        } else {
            zB = B(motionEvent, 1);
            if (actionMasked != 0 && zB) {
                z = true;
            }
        }
        if (this.t == null || actionMasked == 3) {
            zB |= super.onTouchEvent(motionEvent);
        } else if (z) {
            android.view.MotionEvent motionEventD = D(motionEvent);
            super.onTouchEvent(motionEventD);
            motionEventD.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.t = null;
            x();
        }
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        dum dumVar = view.getLayoutParams().a;
        if (dumVar == null || !dumVar.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.q) {
            return;
        }
        if (this.t == null) {
            int childCount = getChildCount();
            android.view.MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                dum dumVar = childAt.getLayoutParams().a;
                if (dumVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                        motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    dumVar.onInterceptTouchEvent(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        x();
        this.q = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        android.graphics.drawable.Drawable drawable = this.w;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.w.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.dyv
    public final boolean t(android.view.View view, android.view.View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                dup layoutParams = childAt.getLayoutParams();
                dum dumVar = layoutParams.a;
                if (dumVar != null) {
                    boolean zOnStartNestedScroll = dumVar.onStartNestedScroll(this, childAt, view, view2, i2, i3);
                    z |= zOnStartNestedScroll;
                    layoutParams.c(i3, zOnStartNestedScroll);
                } else {
                    layoutParams.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new dup(getContext(), attributeSet);
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.kw(4);
        android.util.SparseArray a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            android.os.Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new android.util.SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.util.SparseArray sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (android.os.Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CoordinatorLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969195);
    }

    public CoordinatorLayout(android.content.Context context) {
        this(context, null);
    }
}
