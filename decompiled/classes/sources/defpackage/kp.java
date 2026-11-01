package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class kp {
    public int A;
    public int B;
    public int C;
    public int D;
    public final defpackage.nf E;
    public final defpackage.nf F;
    private final defpackage.ma a;
    private final defpackage.ma b;
    defpackage.ip r;
    public android.support.v7.widget.RecyclerView s;
    public kz t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public kp() {
        defpackage.kn knVar = new defpackage.kn(this, 1);
        this.a = knVar;
        defpackage.kn knVar2 = new defpackage.kn(this, 0);
        this.b = knVar2;
        this.E = new defpackage.nf(knVar);
        this.F = new defpackage.nf(knVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static ko aC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        ko koVar = new ko();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ei.a, i, i2);
        koVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        koVar.b = typedArrayObtainStyledAttributes.getInt(11, 1);
        koVar.c = typedArrayObtainStyledAttributes.getBoolean(10, false);
        koVar.d = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        return koVar;
    }

    public static int av(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? java.lang.Math.max(i2, i3) : size;
        }
        return java.lang.Math.min(size, java.lang.Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    public static int ax(int i, int i2, int i3, int i4, boolean z) {
        int iMax = java.lang.Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static final int bh(android.view.View view) {
        return ((defpackage.kq) view.getLayoutParams()).d.bottom;
    }

    public static final int bi(android.view.View view) {
        android.graphics.Rect rect = ((defpackage.kq) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bj(android.view.View view) {
        android.graphics.Rect rect = ((defpackage.kq) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bk(android.view.View view) {
        return ((defpackage.kq) view.getLayoutParams()).d.left;
    }

    public static final int bl(android.view.View view) {
        return ((defpackage.kq) view.getLayoutParams()).eA();
    }

    public static final int bm(android.view.View view) {
        return ((defpackage.kq) view.getLayoutParams()).d.right;
    }

    public static final int bn(android.view.View view) {
        return ((defpackage.kq) view.getLayoutParams()).d.top;
    }

    public static final void bq(android.view.View view, int i, int i2, int i3, int i4) {
        defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
        android.graphics.Rect rect = kqVar.d;
        view.layout(i + rect.left + kqVar.leftMargin, i2 + rect.top + kqVar.topMargin, (i3 - rect.right) - kqVar.rightMargin, (i4 - rect.bottom) - kqVar.bottomMargin);
    }

    public static final int bw(android.view.View view) {
        return view.getBottom() + bh(view);
    }

    public static final int bx(android.view.View view) {
        return view.getLeft() - bk(view);
    }

    public static final int by(android.view.View view) {
        return view.getRight() + bm(view);
    }

    public static final int bz(android.view.View view) {
        return view.getTop() - ((defpackage.kq) view.getLayoutParams()).d.top;
    }

    public void C(int i, int i2) {
        bs(i);
    }

    public int D(defpackage.la laVar) {
        throw null;
    }

    public int E(defpackage.la laVar) {
        throw null;
    }

    public int F(defpackage.la laVar) {
        throw null;
    }

    public int G(defpackage.la laVar) {
        throw null;
    }

    public int H(defpackage.la laVar) {
        throw null;
    }

    public int I(defpackage.la laVar) {
        throw null;
    }

    public android.os.Parcelable Q() {
        throw null;
    }

    public android.view.View V(int i) {
        int iAw = aw();
        for (int i2 = 0; i2 < iAw; i2++) {
            android.view.View viewAE = aE(i2);
            defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(viewAE);
            if (ldVarI != null && ldVarI.c() == i && !ldVarI.A() && (this.s.L.g || !ldVarI.v())) {
                return viewAE;
            }
        }
        return null;
    }

    public void X(java.lang.String str) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.t(str);
        }
    }

    public final int aA() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        int i = defpackage.dzs.a;
        return recyclerView.getMinimumHeight();
    }

    public final int aB() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        int i = defpackage.dzs.a;
        return recyclerView.getMinimumWidth();
    }

    public final android.view.View aD(android.view.View view) {
        android.view.View viewK;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewK = recyclerView.k(view)) == null || this.r.k(viewK)) {
            return null;
        }
        return viewK;
    }

    public final android.view.View aE(int i) {
        defpackage.ip ipVar = this.r;
        if (ipVar != null) {
            return ipVar.d(i);
        }
        return null;
    }

    public final android.view.View aF() {
        android.view.View focusedChild;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aG(android.view.View view, int i, boolean z) {
        int i2 = android.support.v7.widget.RecyclerView.aa;
        defpackage.ld ldVar = view == null ? null : ((defpackage.kq) view.getLayoutParams()).c;
        if (z || ldVar.v()) {
            this.s.V.i(ldVar);
        } else {
            this.s.V.n(ldVar);
        }
        defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
        if (ldVar.B() || ldVar.w()) {
            if (ldVar.w()) {
                ldVar.p();
            } else {
                ldVar.i();
            }
            this.r.g(view, i, view.getLayoutParams(), false);
        } else {
            android.view.ViewParent parent = view.getParent();
            android.support.v7.widget.RecyclerView recyclerView = this.s;
            defpackage.ip ipVar = this.r;
            if (parent == recyclerView) {
                int iC = ipVar.c(view);
                if (i == -1) {
                    i = this.r.a();
                }
                if (iC == -1) {
                    throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.l());
                }
                if (iC != i) {
                    defpackage.kp kpVar = this.s.n;
                    android.view.View viewAE = kpVar.aE(iC);
                    if (viewAE == null) {
                        throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + iC + kpVar.s.toString());
                    }
                    kpVar.aJ(iC);
                    defpackage.kq kqVar2 = (defpackage.kq) viewAE.getLayoutParams();
                    defpackage.ld ldVar2 = ((defpackage.kq) viewAE.getLayoutParams()).c;
                    if (ldVar2.v()) {
                        kpVar.s.V.i(ldVar2);
                    } else {
                        kpVar.s.V.n(ldVar2);
                    }
                    kpVar.r.g(viewAE, i, kqVar2, ldVar2.v());
                }
            } else {
                ipVar.f(view, i, false);
                kqVar.e = true;
                kz kzVar = this.t;
                if (kzVar != null && kzVar.e && kz.f(view) == kzVar.a) {
                    kzVar.f = view;
                }
            }
        }
        if (kqVar.f) {
            ldVar.a.invalidate();
            kqVar.f = false;
        }
    }

    public final void aH(android.view.View view, android.graphics.Rect rect) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.e(view));
        }
    }

    public final void aI(defpackage.kt ktVar) {
        int iAw = aw();
        while (true) {
            iAw--;
            if (iAw < 0) {
                return;
            }
            android.view.View viewAE = aE(iAw);
            int i = android.support.v7.widget.RecyclerView.aa;
            defpackage.ld ldVar = viewAE == null ? null : ((defpackage.kq) viewAE.getLayoutParams()).c;
            if (!ldVar.A()) {
                if (!ldVar.t() || ldVar.v() || this.s.m.c) {
                    aJ(iAw);
                    ktVar.k(viewAE);
                    this.s.V.n(ldVar);
                } else {
                    aV(iAw);
                    ktVar.j(ldVar);
                }
            }
        }
    }

    public final void aJ(int i) {
        aE(i);
        this.r.h(i);
    }

    public final void aK(android.support.v7.widget.RecyclerView recyclerView) {
        this.v = true;
        aN(recyclerView);
    }

    public void aL(int i) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aM(int i) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aO(android.view.View view, ebd ebdVar) {
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (ldVarI == null || ldVarI.v() || this.r.k(ldVarI.a)) {
            return;
        }
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        eJ(recyclerView.e, recyclerView.L, view, ebdVar);
    }

    public final void aQ() {
        int iAw = aw();
        while (true) {
            iAw--;
            if (iAw < 0) {
                return;
            } else {
                this.r.j(iAw);
            }
        }
    }

    public final void aR(defpackage.kt ktVar) {
        int iAw = aw();
        while (true) {
            iAw--;
            if (iAw < 0) {
                return;
            }
            android.view.View viewAE = aE(iAw);
            int i = android.support.v7.widget.RecyclerView.aa;
            if (!(viewAE == null ? null : ((defpackage.kq) viewAE.getLayoutParams()).c).A()) {
                aU(iAw, ktVar);
            }
        }
    }

    public final void aS(defpackage.kt ktVar) {
        java.util.ArrayList arrayList = ktVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            android.view.View view = ((defpackage.ld) arrayList.get(i)).a;
            int i2 = android.support.v7.widget.RecyclerView.aa;
            defpackage.ld ldVar = ((defpackage.kq) view.getLayoutParams()).c;
            if (!ldVar.A()) {
                ldVar.n(false);
                if (ldVar.x()) {
                    this.s.removeDetachedView(view, false);
                }
                defpackage.km kmVar = this.s.E;
                if (kmVar != null) {
                    kmVar.b(ldVar);
                }
                ldVar.n(true);
                ktVar.f(view);
            }
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = ktVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aT(android.view.View view, defpackage.kt ktVar) {
        defpackage.ip ipVar = this.r;
        int i = ipVar.c;
        if (i == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            ipVar.c = 1;
            ipVar.d = view;
            defpackage.apnt apntVar = ipVar.e;
            int iE = apntVar.E(view);
            if (iE >= 0) {
                if (ipVar.a.g(iE)) {
                    ipVar.l(view);
                }
                apntVar.H(iE);
            }
            ipVar.c = 0;
            ipVar.d = null;
            ktVar.i(view);
        } catch (java.lang.Throwable th) {
            ipVar.c = 0;
            ipVar.d = null;
            throw th;
        }
    }

    public final void aU(int i, defpackage.kt ktVar) {
        android.view.View viewAE = aE(i);
        aV(i);
        ktVar.i(viewAE);
    }

    public final void aV(int i) {
        if (aE(i) != null) {
            this.r.j(i);
        }
    }

    public final void aW() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aX() {
        this.u = true;
    }

    public final void aY(android.support.v7.widget.RecyclerView recyclerView) {
        aZ(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aZ(int i, int i2) {
        this.C = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !android.support.v7.widget.RecyclerView.a) {
            this.C = 0;
        }
        this.D = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || android.support.v7.widget.RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public void aa(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        defpackage.kt ktVar = recyclerView.e;
        defpackage.la laVar = recyclerView.L;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        defpackage.kh khVar = this.s.m;
        if (khVar != null) {
            accessibilityEvent.setItemCount(khVar.a());
        }
    }

    public void ac(android.os.Parcelable parcelable) {
        throw null;
    }

    public void ae(int i) {
        throw null;
    }

    public boolean ah() {
        throw null;
    }

    public boolean ai() {
        throw null;
    }

    public boolean aj() {
        throw null;
    }

    public boolean al() {
        return false;
    }

    public boolean an() {
        return false;
    }

    public void at(android.support.v7.widget.RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int aw() {
        defpackage.ip ipVar = this.r;
        if (ipVar != null) {
            return ipVar.a();
        }
        return 0;
    }

    public final int ay() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        defpackage.kh khVar = recyclerView != null ? recyclerView.m : null;
        if (khVar != null) {
            return khVar.a();
        }
        return 0;
    }

    public final int az() {
        return this.s.getLayoutDirection();
    }

    public final void ba(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public final void bb(int i, int i2) {
        int iAw = aw();
        if (iAw == 0) {
            this.s.ep(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAw; i7++) {
            android.view.View viewAE = aE(i7);
            android.graphics.Rect rect = this.s.k;
            android.support.v7.widget.RecyclerView.I(viewAE, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.s.k.set(i4, i5, i3, i6);
        eK(this.s.k, i, i2);
    }

    public final void bc(android.support.v7.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void bd(kz kzVar) {
        kz kzVar2 = this.t;
        if (kzVar2 != null && kzVar != kzVar2 && kzVar2.e) {
            kzVar2.c();
        }
        this.t = kzVar;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        recyclerView.I.d();
        if (kzVar.g) {
            android.util.Log.w("RecyclerView", "An instance of " + kzVar.getClass().getSimpleName() + " was started more than once. Each instance of" + kzVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        kzVar.b = recyclerView;
        kzVar.c = this;
        int i = kzVar.a;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("Invalid target position");
        }
        android.support.v7.widget.RecyclerView recyclerView2 = kzVar.b;
        recyclerView2.L.a = i;
        kzVar.e = true;
        kzVar.d = true;
        kzVar.f = recyclerView2.n.V(kzVar.a);
        kzVar.b.I.b();
        kzVar.g = true;
    }

    public final boolean be() {
        kz kzVar = this.t;
        return kzVar != null && kzVar.e;
    }

    public final boolean bf(android.support.v7.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.C - getPaddingRight();
        int paddingBottom = this.D - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int i2 = top - paddingTop;
        int i3 = iHeight - paddingBottom;
        int iMin = java.lang.Math.min(0, i);
        int i4 = iWidth - paddingRight;
        int iMin2 = java.lang.Math.min(0, i2);
        int iMax = java.lang.Math.max(0, i4);
        int iMax2 = java.lang.Math.max(0, i3);
        if (az() == 1) {
            iMin = iMax != 0 ? iMax : java.lang.Math.max(iMin, i4);
        } else if (iMin == 0) {
            iMin = java.lang.Math.min(i, iMax);
        }
        if (iMin2 == 0) {
            iMin2 = java.lang.Math.min(i2, iMax2);
        }
        int i5 = new int[]{iMin, iMin2}[0];
        if (z2) {
            android.view.View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft2 = getPaddingLeft();
            int paddingTop2 = getPaddingTop();
            int paddingRight2 = this.C - getPaddingRight();
            int paddingBottom2 = this.D - getPaddingBottom();
            android.graphics.Rect rect2 = this.s.k;
            android.support.v7.widget.RecyclerView.I(focusedChild, rect2);
            if (rect2.left - i5 >= paddingRight2 || rect2.right - i5 <= paddingLeft2 || rect2.top - iMin2 >= paddingBottom2 || rect2.bottom - iMin2 <= paddingTop2) {
                return false;
            }
        }
        if (i5 == 0) {
            if (iMin2 == 0) {
                return false;
            }
            i5 = 0;
        }
        if (z) {
            recyclerView.scrollBy(i5, iMin2);
        } else {
            recyclerView.aq(i5, iMin2, false);
        }
        return true;
    }

    public boolean bg(android.view.View view, int i, int i2, defpackage.kq kqVar) {
        return (!view.isLayoutRequested() && this.w && defpackage.afsq.bI(view.getWidth(), i, kqVar.width) && defpackage.afsq.bI(view.getHeight(), i2, kqVar.height)) ? false : true;
    }

    public final void bo(android.view.View view, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        android.graphics.Rect rect2 = ((defpackage.kq) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.s.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean bp(android.view.View view) {
        return (this.E.r(view) && this.F.r(view)) ? false : true;
    }

    public final void bt(int i, int i2) {
        this.s.ep(i, i2);
    }

    public final void bu(java.lang.Runnable runnable) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bv(android.support.v7.widget.RecyclerView recyclerView) {
        this.v = false;
        as(recyclerView);
    }

    public int d(int i, defpackage.kt ktVar, defpackage.la laVar) {
        throw null;
    }

    public int e(int i, defpackage.kt ktVar, defpackage.la laVar) {
        throw null;
    }

    public int eD(defpackage.kt ktVar, defpackage.la laVar) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || recyclerView.m == null || !ah()) {
            return 1;
        }
        return this.s.m.a();
    }

    public int eE(defpackage.kt ktVar, defpackage.la laVar) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || recyclerView.m == null || !ai()) {
            return 1;
        }
        return this.s.m.a();
    }

    public defpackage.kq eF(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.kq) {
            return new defpackage.kq((defpackage.kq) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.kq((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.kq(layoutParams);
    }

    public android.view.View eG(int i, defpackage.kt ktVar, defpackage.la laVar) {
        return null;
    }

    public android.view.View eH(android.view.View view, int i, defpackage.kt ktVar, defpackage.la laVar) {
        return null;
    }

    public void eI(defpackage.kt ktVar, defpackage.la laVar, ebd ebdVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            ebdVar.h(8192);
            ebdVar.N(true);
            ebdVar.n(67108864, true);
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            ebdVar.h(4096);
            ebdVar.N(true);
            ebdVar.n(67108864, true);
        }
        ebdVar.u(ni.t(eE(ktVar, laVar), eD(ktVar, laVar), 0));
    }

    public void eJ(defpackage.kt ktVar, defpackage.la laVar, android.view.View view, ebd ebdVar) {
        ebdVar.v(ni.r(ai() ? bl(view) : 0, 1, ah() ? bl(view) : 0, 1, false, false));
    }

    public void eK(android.graphics.Rect rect, int i, int i2) {
        ba(av(i, rect.width() + getPaddingLeft() + getPaddingRight(), aB()), av(i2, rect.height() + getPaddingTop() + getPaddingBottom(), aA()));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[PHI: r0
      0x008b: PHI (r0v7 int) = (r0v4 int), (r0v16 int) binds: [B:25:0x007e, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean eL(int i, android.os.Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        defpackage.kt ktVar = recyclerView.e;
        defpackage.la laVar = recyclerView.L;
        if (recyclerView == null) {
            return false;
        }
        int iHeight = this.D;
        int iWidth = this.C;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (this.s.getMatrix().isIdentity() && this.s.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.s.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.s.canScrollHorizontally(1)) {
                paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
            } else {
                paddingLeft = 0;
            }
        } else if (i != 8192) {
            paddingTop = 0;
            paddingLeft = 0;
        } else {
            paddingTop = this.s.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.s.canScrollHorizontally(-1)) {
                paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
            } else {
                paddingLeft = 0;
            }
        }
        if (paddingTop == 0) {
            if (paddingLeft == 0) {
                return false;
            }
            paddingTop = 0;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < 0.0f) {
                return false;
            }
        } else {
            f = 1.0f;
        }
        if (java.lang.Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
            android.support.v7.widget.RecyclerView recyclerView2 = this.s;
            defpackage.kh khVar = recyclerView2.m;
            if (khVar == null) {
                return false;
            }
            if (i == 4096) {
                recyclerView2.ac(khVar.a() - 1);
            } else if (i == 8192) {
                recyclerView2.ac(0);
            }
        } else {
            if (java.lang.Float.compare(1.0f, f) != 0 && java.lang.Float.compare(0.0f, f) != 0) {
                paddingTop = (int) (paddingTop * f);
                paddingLeft = (int) (paddingLeft * f);
            }
            this.s.aq(paddingLeft, paddingTop, true);
        }
        return true;
    }

    public boolean eM() {
        return false;
    }

    public abstract defpackage.kq f();

    public final int getPaddingBottom() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            return 0;
        }
        int i = defpackage.dzs.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            return 0;
        }
        int i = defpackage.dzs.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public defpackage.kq h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.kq(context, attributeSet);
    }

    public void p(defpackage.kt ktVar, defpackage.la laVar) {
        throw null;
    }

    public boolean u(defpackage.kq kqVar) {
        return kqVar != null;
    }

    public void br() {
    }

    public void eN() {
    }

    public void aN(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void aP(int i) {
    }

    public void as(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void bs(int i) {
    }

    public void q(defpackage.la laVar) {
    }

    public void A(int i, int i2) {
    }

    public void B(int i, int i2) {
    }

    public void ap(int i, defpackage.jj jjVar) {
    }

    public void y(int i, int i2) {
    }

    public void ao(int i, int i2, defpackage.la laVar, defpackage.jj jjVar) {
    }
}
