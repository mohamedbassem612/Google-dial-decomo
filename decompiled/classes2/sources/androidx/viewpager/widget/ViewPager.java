package androidx.viewpager.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ViewPager extends android.view.ViewGroup {
    public static final int[] a = {android.R.attr.layout_gravity};
    private static final java.util.Comparator t = new cph(7);
    private static final android.view.animation.Interpolator u = new defpackage.gmj();
    private boolean A;
    private defpackage.gmq B;
    private boolean C;
    private boolean D;
    private final int E;
    private boolean F;
    private int G;
    private int H;
    private int I;
    private final boolean J;
    private float K;
    private float L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private int R;
    private final java.lang.Runnable S;
    private int T;
    public final java.util.ArrayList b;
    public defpackage.gmi c;
    public int d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public int k;
    public android.view.VelocityTracker l;
    public int m;
    public boolean n;
    public long o;
    public android.widget.EdgeEffect p;
    public android.widget.EdgeEffect q;
    public java.util.List r;
    public java.util.List s;
    private int v;
    private final defpackage.gmm w;
    private final android.graphics.Rect x;
    private int y;
    private android.widget.Scroller z;

    public ViewPager(android.content.Context context) {
        super(context);
        this.b = new java.util.ArrayList();
        this.w = new defpackage.gmm();
        this.x = new android.graphics.Rect();
        this.y = -1;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.E = 1;
        this.J = true;
        this.k = -1;
        this.P = true;
        this.S = new defpackage.fkh(this, 7);
        this.T = 0;
        v(context);
    }

    private final void A(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.k) {
            int i = actionIndex == 0 ? 1 : 0;
            this.i = motionEvent.getX(i);
            this.k = motionEvent.getPointerId(i);
            android.view.VelocityTracker velocityTracker = this.l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void B(int i, boolean z, int i2, boolean z2) {
        int scrollX;
        int i3;
        int iAbs;
        defpackage.gmm gmmVarF = f(i);
        int iB = gmmVarF != null ? (int) (b() * java.lang.Math.max(this.e, java.lang.Math.min(gmmVarF.e, this.f))) : 0;
        if (!z) {
            if (z2) {
                z(i);
            }
            y(false);
            scrollTo(iB, 0);
            u(iB);
            return;
        }
        if (getChildCount() == 0) {
            C(false);
        } else {
            android.widget.Scroller scroller = this.z;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.A;
                android.widget.Scroller scroller2 = this.z;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.z.abortAnimation();
                C(false);
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = iB - i4;
            int i6 = -scrollY;
            if (i5 != 0) {
                i3 = i5;
            } else if (i6 == 0) {
                y(false);
                j();
                p(0);
            } else {
                i3 = 0;
            }
            C(true);
            p(2);
            int iB2 = b();
            int i7 = iB2 / 2;
            float f = iB2;
            float fSin = (float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i3) / f) - 0.5f) * 0.47123894f);
            int iAbs2 = java.lang.Math.abs(i2);
            if (iAbs2 > 0) {
                float f2 = i7;
                iAbs = java.lang.Math.round(java.lang.Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) << 2;
            } else {
                iAbs = (int) (((java.lang.Math.abs(i3) / (f + 0.0f)) + 1.0f) * 100.0f);
            }
            int iMin = java.lang.Math.min(iAbs, 600);
            this.A = false;
            this.z.startScroll(i4, scrollY, i3, i6, iMin);
            postInvalidateOnAnimation();
        }
        if (z2) {
            z(i);
        }
    }

    private final void C(boolean z) {
        if (this.D != z) {
            this.D = z;
        }
    }

    private final boolean D(float f, float f2) {
        float fE;
        boolean z;
        float f3 = this.i - f;
        this.i = f;
        float height = getHeight();
        float width = f3 / getWidth();
        float f4 = f2 / height;
        if (defpackage.dzm.d(this.p) != 0.0f) {
            fE = -defpackage.dzm.e(this.p, -width, 1.0f - f4);
        } else {
            fE = defpackage.dzm.d(this.q) != 0.0f ? defpackage.dzm.e(this.q, width, f4) : 0.0f;
        }
        float width2 = fE * getWidth();
        float f5 = f3 - width2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = width2 != 0.0f;
        if (java.lang.Math.abs(f5) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f5;
        float fB = b();
        float f6 = this.e * fB;
        float f7 = this.f * fB;
        java.util.ArrayList arrayList = this.b;
        defpackage.gmm gmmVar = (defpackage.gmm) arrayList.get(0);
        defpackage.gmm gmmVar2 = (defpackage.gmm) arrayList.get(arrayList.size() - 1);
        if (gmmVar.b != 0) {
            f6 = gmmVar.e * fB;
            z = false;
        } else {
            z = true;
        }
        if (gmmVar2.b != this.c.i() - 1) {
            f7 = gmmVar2.e * fB;
        } else {
            z2 = true;
        }
        if (scrollX < f6) {
            if (z) {
                defpackage.dzm.e(this.p, (f6 - scrollX) / fB, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f6;
        } else if (scrollX > f7) {
            if (z2) {
                defpackage.dzm.e(this.q, (scrollX - f7) / fB, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f7;
        } else {
            z3 = z4;
        }
        int i = (int) scrollX;
        this.i += scrollX - i;
        scrollTo(i, getScrollY());
        u(i);
        return z3;
    }

    private final boolean E() {
        this.k = -1;
        i();
        this.p.onRelease();
        this.q.onRelease();
        return (this.p.isFinished() && this.q.isFinished()) ? false : true;
    }

    private final void F() {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final android.graphics.Rect x(android.graphics.Rect rect, android.view.View view) {
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            android.view.ViewParent parent = view.getParent();
            while ((parent instanceof android.view.ViewGroup) && parent != this) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                rect.left += viewGroup.getLeft();
                rect.right += viewGroup.getRight();
                rect.top += viewGroup.getTop();
                rect.bottom += viewGroup.getBottom();
                parent = viewGroup.getParent();
            }
        }
        return rect;
    }

    private final void y(boolean z) {
        boolean z2 = this.T == 2;
        if (z2) {
            C(false);
            if (!this.z.isFinished()) {
                this.z.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.z.getCurrX();
                int currY = this.z.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        u(currX);
                    }
                }
            }
        }
        this.g = false;
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            defpackage.gmm gmmVar = (defpackage.gmm) arrayList.get(i);
            if (gmmVar.c) {
                gmmVar.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            java.lang.Runnable runnable = this.S;
            if (!z) {
                runnable.run();
            } else {
                int i2 = dzs.a;
                postOnAnimation(runnable);
            }
        }
    }

    private final void z(int i) {
        java.util.List list = this.r;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.gmp gmpVar = (defpackage.gmp) this.r.get(i2);
                if (gmpVar != null) {
                    gmpVar.b(i);
                }
            }
        }
    }

    public final int a(int i, float f, int i2, int i3) {
        if (java.lang.Math.abs(i3) <= this.N || java.lang.Math.abs(i2) <= this.M || defpackage.dzm.d(this.p) != 0.0f || defpackage.dzm.d(this.q) != 0.0f) {
            i += (int) (f + (i >= this.d ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        java.util.ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return java.lang.Math.max(((defpackage.gmm) arrayList.get(0)).b, java.lang.Math.min(i, ((defpackage.gmm) arrayList.get(arrayList.size() - 1)).b));
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        defpackage.gmm gmmVarD;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (gmmVarD = d(childAt)) != null && gmmVarD.b == this.d) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(java.util.ArrayList arrayList) {
        defpackage.gmm gmmVarD;
        for (int i = 0; i < getChildCount(); i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (gmmVarD = d(childAt)) != null && gmmVarD.b == this.d) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new defpackage.gmn();
        }
        defpackage.gmn gmnVar = (defpackage.gmn) layoutParams;
        boolean z = gmnVar.a | (view.getClass().getAnnotation(defpackage.gml.class) != null);
        gmnVar.a = z;
        if (!this.C) {
            super.addView(view, i, layoutParams);
        } else {
            if (gmnVar != null && z) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            gmnVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final int b() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    final defpackage.gmm c(int i, int i2) {
        defpackage.gmm gmmVar = new defpackage.gmm();
        gmmVar.b = i;
        gmmVar.a = this.c.b(this, i);
        gmmVar.d = 1.0f;
        if (i2 >= 0) {
            java.util.ArrayList arrayList = this.b;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, gmmVar);
            } else {
                this.b.add(gmmVar);
            }
        } else {
            this.b.add(gmmVar);
        }
        return gmmVar;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.c == null) {
            return false;
        }
        int iB = b();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (iB * this.e))) {
                return false;
            }
        } else if (i <= 0 || scrollX >= ((int) (iB * this.f))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.gmn) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A = true;
        if (this.z.isFinished() || !this.z.computeScrollOffset()) {
            y(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.z.getCurrX();
        int currY = this.z.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!u(currX)) {
                this.z.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    final defpackage.gmm d(android.view.View view) {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            defpackage.gmm gmmVar = (defpackage.gmm) arrayList.get(i);
            if (this.c.d(view, gmmVar.a)) {
                return gmmVar;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean zS;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            zS = false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                zS = keyEvent.hasModifiers(2) ? s() : q(17);
            } else if (keyCode == 22) {
                zS = keyEvent.hasModifiers(2) ? t() : q(66);
            } else if (keyCode != 61) {
                zS = false;
            } else if (keyEvent.hasNoModifiers()) {
                zS = q(2);
            } else if (keyEvent.hasModifiers(1)) {
                zS = q(1);
            } else {
                zS = false;
            }
        }
        return zS;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.gmm gmmVarD;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (gmmVarD = d(childAt)) != null && gmmVarD.b == this.d && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        boolean zDraw;
        defpackage.gmi gmiVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (gmiVar = this.c) == null || gmiVar.i() <= 1)) {
            this.p.finish();
            this.q.finish();
            return;
        }
        if (this.p.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.e * width);
            this.p.setSize(height, width);
            zDraw = this.p.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.q.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.f + 1.0f)) * width2);
            this.q.setSize(height2, width2);
            zDraw |= this.q.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    public final defpackage.gmm e() {
        float f;
        float scrollX;
        int i;
        int iB = b();
        float f2 = 0.0f;
        if (iB > 0) {
            scrollX = getScrollX() / iB;
            f = 0.0f / iB;
        } else {
            f = 0.0f;
            scrollX = 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        boolean z = true;
        defpackage.gmm gmmVar = null;
        float f3 = 0.0f;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return gmmVar;
            }
            defpackage.gmm gmmVar2 = (defpackage.gmm) arrayList.get(i2);
            if (!z && gmmVar2.b != (i = i3 + 1)) {
                gmmVar2 = this.w;
                gmmVar2.e = f2 + f3 + f;
                gmmVar2.b = i;
                gmmVar2.d = 1.0f;
                i2--;
            }
            defpackage.gmm gmmVar3 = gmmVar2;
            f2 = gmmVar3.e;
            float f4 = gmmVar3.d + f2 + f;
            if (!z && scrollX < f2) {
                return gmmVar;
            }
            if (scrollX < f4 || i2 == arrayList.size() - 1) {
                return gmmVar3;
            }
            i3 = gmmVar3.b;
            i2++;
            gmmVar = gmmVar3;
            f3 = gmmVar3.d;
            z = false;
        }
    }

    final defpackage.gmm f(int i) {
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            defpackage.gmm gmmVar = (defpackage.gmm) arrayList.get(i2);
            if (gmmVar.b == i) {
                return gmmVar;
            }
            i2++;
        }
    }

    public final void g(defpackage.gmp gmpVar) {
        if (this.r == null) {
            this.r = new java.util.ArrayList();
        }
        this.r.add(gmpVar);
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.gmn();
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.gmn(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public final void h() {
        int i = this.c.i();
        this.v = i;
        int i2 = this.E << 1;
        java.util.ArrayList arrayList = this.b;
        boolean z = arrayList.size() < i2 + 1 && arrayList.size() < i;
        int i3 = this.d;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            java.lang.Object obj = ((defpackage.gmm) arrayList.get(i4)).a;
        }
        java.util.Collections.sort(arrayList, t);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                defpackage.gmn gmnVar = (defpackage.gmn) getChildAt(i5).getLayoutParams();
                if (!gmnVar.a) {
                    gmnVar.c = 0.0f;
                }
            }
            o(i3, false, true, 0);
            requestLayout();
        }
    }

    public final void i() {
        this.h = false;
        this.F = false;
        android.view.VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void j() {
        k(this.d);
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00e5 A[PHI: r5 r7 r11
      0x00e5: PHI (r5v58 float) = (r5v57 float), (r5v60 float) binds: [B:57:0x00db, B:54:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r7v13 int) = (r7v12 int), (r7v4 int) binds: [B:57:0x00db, B:54:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r11v30 int) = (r11v1 int), (r11v32 int) binds: [B:57:0x00db, B:54:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016c A[PHI: r4
      0x016c: PHI (r4v15 float) = (r4v14 float), (r4v17 float) binds: [B:93:0x0163, B:90:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    final void k(int i) {
        defpackage.gmm gmmVarF;
        java.lang.String hexString;
        java.util.ArrayList arrayList;
        defpackage.gmm gmmVarC;
        float f;
        defpackage.gmm gmmVarD;
        defpackage.gmm gmmVarD2;
        int i2;
        int i3;
        defpackage.gmm gmmVar;
        defpackage.gmm gmmVar2;
        defpackage.gmm gmmVar3;
        int i4 = this.d;
        if (i4 != i) {
            gmmVarF = f(i4);
            this.d = i;
        } else {
            gmmVarF = null;
        }
        if (this.c == null || this.g || getWindowToken() == null) {
            return;
        }
        this.c.c(this);
        int i5 = this.E;
        int iMax = java.lang.Math.max(0, this.d - i5);
        int i6 = this.c.i();
        int iMin = java.lang.Math.min(i6 - 1, this.d + i5);
        if (i6 != this.v) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (android.content.res.Resources.NotFoundException unused) {
                hexString = java.lang.Integer.toHexString(getId());
            }
            throw new java.lang.IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.v + ", found: " + i6 + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.c.getClass());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.b;
            if (i7 < arrayList.size()) {
                gmmVarC = (defpackage.gmm) arrayList.get(i7);
                int i8 = gmmVarC.b;
                int i9 = this.d;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            gmmVarC = null;
            break;
        }
        if (gmmVarC == null && i6 > 0) {
            gmmVarC = c(this.d, i7);
        }
        if (gmmVarC != null) {
            int i10 = i7 - 1;
            defpackage.gmm gmmVar4 = i10 >= 0 ? (defpackage.gmm) arrayList.get(i10) : null;
            int iB = b();
            float paddingLeft = iB <= 0 ? 0.0f : (2.0f - gmmVarC.d) + (getPaddingLeft() / iB);
            float f2 = 0.0f;
            for (int i11 = this.d - 1; i11 >= 0; i11--) {
                if (f2 >= paddingLeft && i11 < iMax) {
                    if (gmmVar4 == null) {
                        break;
                    }
                    if (i11 == gmmVar4.b && !gmmVar4.c) {
                        int i12 = i10 - 1;
                        i7--;
                        arrayList.remove(i10);
                        this.c.e(gmmVar4.a);
                        gmmVar4 = i12 >= 0 ? (defpackage.gmm) arrayList.get(i12) : null;
                        i10 = i12;
                    }
                } else if (gmmVar4 == null || i11 != gmmVar4.b) {
                    i7++;
                    f2 += c(i11, i10 + 1).d;
                    if (i10 >= 0) {
                        gmmVar3 = (defpackage.gmm) arrayList.get(i10);
                        gmmVar4 = gmmVar3;
                    } else {
                        gmmVar4 = null;
                    }
                } else {
                    i10--;
                    f2 += gmmVar4.d;
                    if (i10 >= 0) {
                        gmmVar3 = (defpackage.gmm) arrayList.get(i10);
                        gmmVar4 = gmmVar3;
                    } else {
                        gmmVar4 = null;
                    }
                }
            }
            f = 0.0f;
            int i13 = i7 + 1;
            float f3 = gmmVarC.d;
            if (f3 < 2.0f) {
                defpackage.gmm gmmVar5 = i13 < arrayList.size() ? (defpackage.gmm) arrayList.get(i13) : null;
                float paddingRight = iB <= 0 ? 0.0f : (getPaddingRight() / iB) + 2.0f;
                int i14 = i13;
                for (int i15 = this.d + 1; i15 < i6; i15++) {
                    if (f3 >= paddingRight && i15 > iMin) {
                        if (gmmVar5 == null) {
                            break;
                        }
                        if (i15 == gmmVar5.b && !gmmVar5.c) {
                            arrayList.remove(i14);
                            this.c.e(gmmVar5.a);
                            gmmVar5 = i14 < arrayList.size() ? (defpackage.gmm) arrayList.get(i14) : null;
                        }
                    } else {
                        int i16 = i14 + 1;
                        if (gmmVar5 == null || i15 != gmmVar5.b) {
                            f3 += c(i15, i14).d;
                            if (i16 < arrayList.size()) {
                                gmmVar5 = (defpackage.gmm) arrayList.get(i16);
                            } else {
                                gmmVar5 = null;
                            }
                        } else {
                            f3 += gmmVar5.d;
                            if (i16 < arrayList.size()) {
                                gmmVar5 = (defpackage.gmm) arrayList.get(i16);
                            } else {
                                gmmVar5 = null;
                            }
                        }
                        i14 = i16;
                    }
                }
            }
            int i17 = this.c.i();
            int iB2 = b();
            float f4 = iB2 > 0 ? 0.0f / iB2 : 0.0f;
            if (gmmVarF != null) {
                int i18 = gmmVarF.b;
                int i19 = gmmVarC.b;
                if (i18 < i19) {
                    float f5 = gmmVarF.e + gmmVarF.d + f4;
                    int i20 = i18 + 1;
                    int i21 = 0;
                    while (i20 <= gmmVarC.b && i21 < arrayList.size()) {
                        java.lang.Object obj = arrayList.get(i21);
                        while (true) {
                            gmmVar2 = (defpackage.gmm) obj;
                            if (i20 <= gmmVar2.b || i21 >= arrayList.size() - 1) {
                                break;
                            }
                            i21++;
                            obj = arrayList.get(i21);
                        }
                        while (i20 < gmmVar2.b) {
                            f5 += f4 + 1.0f;
                            i20++;
                        }
                        gmmVar2.e = f5;
                        f5 += gmmVar2.d + f4;
                        i20++;
                    }
                } else if (i18 > i19) {
                    int size = arrayList.size() - 1;
                    float f6 = gmmVarF.e;
                    while (true) {
                        i18--;
                        if (i18 < gmmVarC.b || size < 0) {
                            break;
                        }
                        java.lang.Object obj2 = arrayList.get(size);
                        while (true) {
                            gmmVar = (defpackage.gmm) obj2;
                            if (i18 >= gmmVar.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i18 > gmmVar.b) {
                            f6 -= f4 + 1.0f;
                            i18--;
                        }
                        f6 -= gmmVar.d + f4;
                        gmmVar.e = f6;
                    }
                }
            }
            int size2 = arrayList.size();
            float f7 = gmmVarC.e;
            int i22 = gmmVarC.b;
            int i23 = i22 - 1;
            this.e = i22 == 0 ? f7 : -3.4028235E38f;
            int i24 = i17 - 1;
            this.f = i22 == i24 ? (gmmVarC.d + f7) - 1.0f : Float.MAX_VALUE;
            for (int i25 = i7 - 1; i25 >= 0; i25--) {
                defpackage.gmm gmmVar6 = (defpackage.gmm) arrayList.get(i25);
                while (true) {
                    i3 = gmmVar6.b;
                    if (i23 <= i3) {
                        break;
                    }
                    f7 -= f4 + 1.0f;
                    i23--;
                }
                f7 -= gmmVar6.d + f4;
                gmmVar6.e = f7;
                if (i3 == 0) {
                    this.e = f7;
                }
                i23--;
            }
            float f8 = gmmVarC.e + gmmVarC.d + f4;
            int i26 = gmmVarC.b + 1;
            while (i13 < size2) {
                defpackage.gmm gmmVar7 = (defpackage.gmm) arrayList.get(i13);
                while (true) {
                    i2 = gmmVar7.b;
                    if (i26 >= i2) {
                        break;
                    }
                    f8 += f4 + 1.0f;
                    i26++;
                }
                if (i2 == i24) {
                    this.f = (gmmVar7.d + f8) - 1.0f;
                }
                gmmVar7.e = f8;
                f8 += gmmVar7.d + f4;
                i26++;
                i13++;
            }
            this.c.h(gmmVarC.a);
        } else {
            f = 0.0f;
        }
        this.c.f();
        int childCount = getChildCount();
        for (int i27 = 0; i27 < childCount; i27++) {
            android.view.View childAt = getChildAt(i27);
            defpackage.gmn gmnVar = (defpackage.gmn) childAt.getLayoutParams();
            gmnVar.f = i27;
            if (!gmnVar.a && gmnVar.c == f && (gmmVarD2 = d(childAt)) != null) {
                gmnVar.c = gmmVarD2.d;
                gmnVar.e = gmmVarD2.b;
            }
        }
        if (hasFocus()) {
            android.view.View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                gmmVarD = null;
                break;
            }
            while (true) {
                java.lang.Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    gmmVarD = d(viewFindFocus);
                    break;
                } else {
                    if (!(parent instanceof android.view.View)) {
                        gmmVarD = null;
                        break;
                    }
                    viewFindFocus = (android.view.View) parent;
                }
            }
            if (gmmVarD == null || gmmVarD.b != this.d) {
                for (int i28 = 0; i28 < getChildCount(); i28++) {
                    android.view.View childAt2 = getChildAt(i28);
                    defpackage.gmm gmmVarD3 = d(childAt2);
                    if (gmmVarD3 != null && gmmVarD3.b == this.d && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void l(defpackage.gmi gmiVar) {
        java.util.ArrayList arrayList;
        defpackage.gmi gmiVar2 = this.c;
        if (gmiVar2 != null) {
            gmiVar2.j();
            this.c.c(this);
            int i = 0;
            while (true) {
                arrayList = this.b;
                if (i >= arrayList.size()) {
                    break;
                }
                defpackage.gmm gmmVar = (defpackage.gmm) arrayList.get(i);
                defpackage.gmi gmiVar3 = this.c;
                int i2 = gmmVar.b;
                gmiVar3.e(gmmVar.a);
                i++;
            }
            this.c.f();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((defpackage.gmn) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.d = 0;
            scrollTo(0, 0);
        }
        this.c = gmiVar;
        this.v = 0;
        if (gmiVar != null) {
            if (this.B == null) {
                this.B = new defpackage.gmq(this);
            }
            this.c.j();
            this.g = false;
            boolean z = this.P;
            this.P = true;
            this.v = this.c.i();
            if (this.y >= 0) {
                this.c.g();
                o(this.y, false, true, 0);
                this.y = -1;
            } else if (z) {
                requestLayout();
            } else {
                j();
            }
        }
        java.util.List list = this.s;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.s.size();
        for (int i4 = 0; i4 < size; i4++) {
            agcg agcgVar = (agcg) this.s.get(i4);
            com.google.android.material.tabs.TabLayout tabLayout = agcgVar.b;
            if (tabLayout.A == this) {
                tabLayout.k(gmiVar, agcgVar.a);
            }
        }
    }

    public final void m(int i) {
        this.g = false;
        o(i, !this.P, false, 0);
    }

    public final void n(int i, boolean z) {
        this.g = false;
        o(i, z, false, 0);
    }

    public final void o(int i, boolean z, boolean z2, int i2) {
        defpackage.gmi gmiVar = this.c;
        if (gmiVar == null || gmiVar.i() <= 0) {
            C(false);
            return;
        }
        if (!z2 && this.d == i && this.b.size() != 0) {
            C(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.c.i()) {
            i = this.c.i() - 1;
        }
        int i3 = this.E;
        int i4 = this.d;
        if (i > i4 + i3 || i < i4 - i3) {
            int i5 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.b;
                if (i5 >= arrayList.size()) {
                    break;
                }
                ((defpackage.gmm) arrayList.get(i5)).c = true;
                i5++;
            }
        }
        boolean z3 = this.d != i;
        if (!this.P) {
            k(i);
            B(i, z, i2, z3);
        } else {
            this.d = i;
            if (z3) {
                z(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.S);
        android.widget.Scroller scroller = this.z;
        if (scroller != null && !scroller.isFinished()) {
            this.z.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            E();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.j = x;
            this.i = x;
            float y = motionEvent.getY();
            this.L = y;
            this.K = y;
            this.k = motionEvent.getPointerId(0);
            this.F = false;
            this.A = true;
            this.z.computeScrollOffset();
            if (this.T == 2 && java.lang.Math.abs(this.z.getFinalX() - this.z.getCurrX()) > this.O) {
                this.z.abortAnimation();
                this.g = false;
                j();
                this.h = true;
                F();
                p(1);
            } else if (defpackage.dzm.d(this.p) == 0.0f && defpackage.dzm.d(this.q) == 0.0f) {
                y(false);
                this.h = false;
            } else {
                this.h = true;
                p(1);
                if (defpackage.dzm.d(this.p) != 0.0f) {
                    defpackage.dzm.e(this.p, 0.0f, 1.0f - (this.K / getHeight()));
                }
                if (defpackage.dzm.d(this.q) != 0.0f) {
                    defpackage.dzm.e(this.q, 0.0f, this.K / getHeight());
                }
            }
        } else {
            if (this.h) {
                return true;
            }
            if (this.F) {
                return false;
            }
            if (action == 2) {
                int i = this.k;
                if (i != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.i;
                    float fAbs = java.lang.Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = java.lang.Math.abs(y2 - this.L);
                    if (f != 0.0f) {
                        float f2 = this.i;
                        if ((this.J || ((f2 >= this.H || f <= 0.0f) && (f2 <= getWidth() - this.H || f >= 0.0f))) && r(this, false, (int) f, (int) x2, (int) y2)) {
                            this.i = x2;
                            this.K = y2;
                            this.F = true;
                            return false;
                        }
                    }
                    float f3 = this.I;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.h = true;
                        F();
                        p(1);
                        float f4 = this.j;
                        this.i = f > 0.0f ? f4 + this.I : f4 - this.I;
                        this.K = y2;
                        C(true);
                    } else if (fAbs2 > f3) {
                        this.F = true;
                    }
                    if (this.h && D(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                A(motionEvent);
            }
        }
        android.view.VelocityTracker velocityTrackerObtain = this.l;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.l = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        defpackage.gmm gmmVarD;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i5 = i4 - i2;
            i6 = i3 - i;
            if (i7 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                defpackage.gmn gmnVar = (defpackage.gmn) childAt.getLayoutParams();
                if (gmnVar.a) {
                    int i9 = gmnVar.b;
                    int i10 = i9 & 7;
                    int i11 = i9 & 112;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i5 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = java.lang.Math.max((i5 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = java.lang.Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i5 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = java.lang.Math.max((i5 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
            i7++;
        }
        int i19 = (i6 - paddingLeft) - paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            android.view.View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                defpackage.gmn gmnVar2 = (defpackage.gmn) childAt2.getLayoutParams();
                if (!gmnVar2.a && (gmmVarD = d(childAt2)) != null) {
                    float f = i19;
                    int i21 = ((int) (gmmVarD.e * f)) + paddingLeft;
                    if (gmnVar2.d) {
                        gmnVar2.d = false;
                        childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (f * gmnVar2.c), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((i5 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i21, paddingTop, childAt2.getMeasuredWidth() + i21, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.R = i8;
        if (this.P) {
            B(this.d, false, 0, false);
        }
        this.P = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        defpackage.gmn gmnVar;
        defpackage.gmn gmnVar2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.H = java.lang.Math.min(measuredWidth / 10, this.G);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (gmnVar2 = (defpackage.gmn) childAt.getLayoutParams()) != null && gmnVar2.a) {
                int i8 = gmnVar2.b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (i9 != 3 && i9 != 5) {
                    z2 = z;
                }
                int i11 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (gmnVar2.width != -2) {
                    i4 = gmnVar2.width != -1 ? gmnVar2.width : paddingLeft;
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (gmnVar2.height != -2) {
                    i5 = gmnVar2.height != -1 ? gmnVar2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i4, i11), android.view.View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.C = true;
        j();
        this.C = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            android.view.View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((gmnVar = (defpackage.gmn) childAt2.getLayoutParams()) == null || !gmnVar.a)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gmnVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        int i2;
        int i3;
        int i4;
        defpackage.gmm gmmVarD;
        int i5 = i & 2;
        int childCount = getChildCount();
        if (i5 != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (gmmVarD = d(childAt)) != null && gmmVarD.b == this.d && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.viewpager.widget.ViewPager.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.viewpager.widget.ViewPager.SavedState savedState = (androidx.viewpager.widget.ViewPager.SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).d);
        if (this.c != null) {
            android.os.Parcelable parcelable2 = savedState.b;
            java.lang.ClassLoader classLoader = savedState.e;
            o(savedState.a, false, true, 0);
        } else {
            this.y = savedState.a;
            android.os.Parcelable parcelable3 = savedState.b;
            java.lang.ClassLoader classLoader2 = savedState.e;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.viewpager.widget.ViewPager$SavedState] */
    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        ?? savedState = new androidx.viewpager.widget.ViewPager.SavedState(super.onSaveInstanceState());
        savedState.a = this.d;
        if (this.c != null) {
            savedState.b = null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            if (i3 > 0 && !this.b.isEmpty()) {
                if (!this.z.isFinished()) {
                    this.z.setFinalX(this.d * b());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i3 - getPaddingLeft()) - getPaddingRight())) * ((i - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            defpackage.gmm gmmVarF = f(this.d);
            int iMin = (int) ((gmmVarF != null ? java.lang.Math.min(gmmVarF.e, this.f) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                y(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        defpackage.gmi gmiVar;
        boolean zD;
        if (this.n) {
            return true;
        }
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (gmiVar = this.c) == null || gmiVar.i() == 0) {
            return false;
        }
        android.view.VelocityTracker velocityTrackerObtain = this.l;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.l = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.z.abortAnimation();
            this.g = false;
            j();
            float x = motionEvent.getX();
            this.j = x;
            this.i = x;
            float y = motionEvent.getY();
            this.L = y;
            this.K = y;
            this.k = motionEvent.getPointerId(0);
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.i = motionEvent.getX(actionIndex);
                        this.k = motionEvent.getPointerId(actionIndex);
                        return true;
                    }
                    if (action != 6) {
                        return true;
                    }
                    A(motionEvent);
                    this.i = motionEvent.getX(motionEvent.findPointerIndex(this.k));
                    return true;
                }
                if (!this.h) {
                    return true;
                }
                B(this.d, true, 0, false);
                zD = E();
            } else if (!this.h) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.k);
                if (iFindPointerIndex == -1) {
                    zD = E();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = java.lang.Math.abs(x2 - this.i);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = java.lang.Math.abs(y2 - this.K);
                    if (fAbs > this.I && fAbs > fAbs2) {
                        this.h = true;
                        F();
                        float f = this.j;
                        float f2 = x2 - f;
                        int i = this.I;
                        this.i = f2 > 0.0f ? f + i : f - i;
                        this.K = y2;
                        p(1);
                        C(true);
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.h) {
                        return true;
                    }
                    int iFindPointerIndex2 = motionEvent.findPointerIndex(this.k);
                    zD = D(motionEvent.getX(iFindPointerIndex2), motionEvent.getY(iFindPointerIndex2));
                }
            } else {
                if (this.h) {
                    return true;
                }
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.k);
                zD = D(motionEvent.getX(iFindPointerIndex3), motionEvent.getY(iFindPointerIndex3));
            }
        } else {
            if (!this.h) {
                return true;
            }
            android.view.VelocityTracker velocityTracker = this.l;
            velocityTracker.computeCurrentVelocity(1000, this.m);
            int xVelocity = (int) velocityTracker.getXVelocity(this.k);
            this.g = true;
            int iB = b();
            int scrollX = getScrollX();
            defpackage.gmm gmmVarE = e();
            float f3 = iB;
            int i2 = gmmVarE.b;
            int iA = a(i2, ((scrollX / f3) - gmmVarE.e) / (gmmVarE.d + (0.0f / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.k)) - this.j));
            o(iA, true, true, xVelocity);
            boolean zE = E();
            if (iA == i2 && zE) {
                if (defpackage.dzm.d(this.q) != 0.0f) {
                    this.q.onAbsorb(-xVelocity);
                } else if (defpackage.dzm.d(this.p) != 0.0f) {
                    this.p.onAbsorb(xVelocity);
                }
            }
            zD = zE;
        }
        if (!zD) {
            return true;
        }
        postInvalidateOnAnimation();
        return true;
    }

    public final void p(int i) {
        if (this.T != i) {
            this.T = i;
            java.util.List list = this.r;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.gmp gmpVar = (defpackage.gmp) this.r.get(i2);
                    if (gmpVar != null) {
                        gmpVar.a(i);
                    }
                }
            }
        }
    }

    public final boolean q(int i) {
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            android.view.ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof android.view.ViewGroup)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (android.view.ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof android.view.ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    android.util.Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zS = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i == 17 || i == 1) {
                zS = s();
            } else if (i == 66 || i == 2) {
                zS = t();
            }
        } else if (i == 17) {
            android.graphics.Rect rect = this.x;
            zS = (viewFindFocus == null || x(rect, viewFindNextFocus).left < x(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : s();
        } else if (i == 66) {
            android.graphics.Rect rect2 = this.x;
            zS = (viewFindFocus == null || x(rect2, viewFindNextFocus).left > x(rect2, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : t();
        }
        if (zS) {
            playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zS;
    }

    protected final boolean r(android.view.View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && r(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        if (this.C) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    final boolean s() {
        int i = this.d;
        if (i <= 0) {
            return false;
        }
        n(i - 1, true);
        return true;
    }

    final boolean t() {
        defpackage.gmi gmiVar = this.c;
        if (gmiVar == null || this.d >= gmiVar.i() - 1) {
            return false;
        }
        n(this.d + 1, true);
        return true;
    }

    public final boolean u(int i) {
        if (this.b.size() == 0) {
            if (this.P) {
                return false;
            }
            this.Q = false;
            w(0, 0.0f);
            if (this.Q) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        defpackage.gmm gmmVarE = e();
        float fB = b();
        int i2 = gmmVarE.b;
        float f = (i / fB) - gmmVarE.e;
        float f2 = gmmVarE.d;
        this.Q = false;
        w(i2, f / (f2 + (0.0f / fB)));
        if (this.Q) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    final void v(android.content.Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.z = new android.widget.Scroller(context, u);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.I = viewConfiguration.getScaledPagingTouchSlop();
        this.M = (int) (400.0f * f);
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p = new android.widget.EdgeEffect(context);
        this.q = new android.widget.EdgeEffect(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (f + f);
        this.G = (int) (f * 16.0f);
        dzs.i(this, new defpackage.gmo(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        dzk.o(this, new defpackage.gmk(this));
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    protected final void w(int i, float f) {
        int iMax;
        int width;
        int left;
        if (this.R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                defpackage.gmn gmnVar = (defpackage.gmn) childAt.getLayoutParams();
                if (gmnVar.a) {
                    int i3 = gmnVar.b & 7;
                    if (i3 != 1) {
                        if (i3 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i3 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = java.lang.Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i4 = iMax;
                    width = paddingLeft;
                    paddingLeft = i4;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        java.util.List list = this.r;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                defpackage.gmp gmpVar = (defpackage.gmp) this.r.get(i5);
                if (gmpVar != null) {
                    gmpVar.c(i, f);
                }
            }
        }
        this.Q = true;
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.gmn();
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new kw(7);
        int a;
        android.os.Parcelable b;
        java.lang.ClassLoader e;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final java.lang.String toString() {
            return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.a + '}';
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new java.util.ArrayList();
        this.w = new defpackage.gmm();
        this.x = new android.graphics.Rect();
        this.y = -1;
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.E = 1;
        this.J = true;
        this.k = -1;
        this.P = true;
        this.S = new defpackage.fkh(this, 7);
        this.T = 0;
        v(context);
    }
}
