package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dqc extends android.view.ViewGroup implements dyw, cap, dcw, dyy {
    public static final aonj a = new defpackage.dkq(5);
    public aonj A;
    public aonj B;
    private final aomy C;
    private final int[] D;
    private final dyx E;
    private final cjx F;
    private final int G;
    private final java.lang.String H;
    private adkz I;
    public final cuq b;
    public final android.view.View c;
    public final dcv d;
    public aomy e;
    public boolean f;
    public aomy g;
    public aomy h;
    public cmw i;
    public final aonj j;
    public dpf k;
    public final aonj l;
    public emx m;
    public gii n;
    public final int[] o;
    public long p;
    public eax q;
    public aonj r;
    public final aomy s;
    public final aonj t;
    public int u;
    public int v;
    public boolean w;
    public final dbk x;
    public final android.view.View y;
    public aonj z;

    public dqc(android.content.Context context, caz cazVar, android.view.View view, cuq cuqVar, cjx cjxVar, int i, dcv dcvVar) {
        super(context);
        this.b = cuqVar;
        this.c = view;
        this.d = dcvVar;
        adw adwVar = dgx.a;
        setTag(2131427460, cazVar);
        setSaveFromParentEnabled(false);
        addView(view);
        defpackage.dqa dqaVar = new defpackage.dqa(this);
        int i2 = dzs.a;
        eae.a(this, dqaVar);
        dzk.o(this, this);
        this.e = new defpackage.bmt(15);
        this.g = new defpackage.bmt(16);
        this.h = new defpackage.bmt(17);
        this.i = cmw.c;
        this.k = new dpg(1.0f, 1.0f);
        int i3 = 2;
        this.o = new int[2];
        this.p = 0L;
        this.s = new defpackage.bup(this, 20);
        this.C = new defpackage.dqk(this, 1);
        this.D = new int[2];
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.E = new dyx();
        dbk dbkVar = new dbk(false, 3, (byte[]) null);
        dbkVar.l = this;
        cmw cmwVarB = dig.b(new defpackage.cur(defpackage.dqe.a, cuqVar), true, new defpackage.dkq(6));
        defpackage.cvs cvsVar = new defpackage.cvs();
        cvsVar.a = new clc(this, 14);
        defpackage.cvw cvwVar = new defpackage.cvw();
        defpackage.cvw cvwVar2 = cvsVar.b;
        if (cvwVar2 != null) {
            cvwVar2.a = null;
        }
        cvsVar.b = cvwVar;
        defpackage.cvw cvwVar3 = cvsVar.b;
        if (cvwVar3 != null) {
            cvwVar3.a = cvsVar;
        }
        this.t = cvwVar;
        cmw cmwVarA = vn.e(ru.k(cmwVarB.a(cvsVar), new afx(this, dbkVar, this, 15, (short[]) null)), new dpz(this, dbkVar, 0)).a(new defpackage.dqj(new dih(this, 2)));
        dbkVar.ad(this.i.a(cmwVarA));
        this.j = new dpz(dbkVar, cmwVarA, 2);
        dbkVar.aa(this.k);
        this.l = new dih(dbkVar, 3);
        dbkVar.z = new dpz(this, dbkVar, 3);
        dbkVar.A = new dih(this, 4);
        dbkVar.ac(new defpackage.dqb(this, dbkVar));
        this.x = dbkVar;
        this.y = view;
        this.F = cjxVar;
        this.G = i;
        setClipChildren(false);
        java.lang.String strValueOf = java.lang.String.valueOf(i);
        this.H = strValueOf;
        java.lang.Object objA = cjxVar != null ? cjxVar.a(strValueOf) : null;
        android.util.SparseArray<android.os.Parcelable> sparseArray = objA instanceof android.util.SparseArray ? (android.util.SparseArray) objA : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (cjxVar != null) {
            p(cjxVar.f(strValueOf, new defpackage.dqk(this, i3)));
        }
        aonj aonjVar = defpackage.dqi.a;
        this.z = aonjVar;
        this.A = aonjVar;
        this.B = aonjVar;
    }

    public static final dwn l(dwn dwnVar, int i, int i2, int i3, int i4) {
        int i5 = dwnVar.b - i;
        int i6 = dwnVar.c - i2;
        int i7 = dwnVar.d - i3;
        int i8 = dwnVar.e - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return dwn.d(i5, i6, i7, i8);
    }

    public static final int m(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return android.view.View.MeasureSpec.makeMeasureSpec(aooc.w(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return android.view.View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return android.view.View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return 0;
    }

    public final boolean B() {
        return isAttachedToWindow();
    }

    public final void b() {
        this.g.a();
        removeAllViewsInLayout();
    }

    public final void c() {
        this.h.a();
    }

    public final void d(android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            cuq cuqVar = this.b;
            float fA = defpackage.dqe.a(i);
            float fA2 = defpackage.dqe.a(i2);
            long jB = cuqVar.b((((long) java.lang.Float.floatToRawIntBits(fA)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fA2)) & 4294967295L), 1 != i3 ? 1 : 2);
            iArr[0] = -aopc.i(java.lang.Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = -aopc.i(java.lang.Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    public final eax dC(android.view.View view, eax eaxVar) {
        this.q = new eax(eaxVar);
        return j(eaxVar);
    }

    public final void e(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            cuq cuqVar = this.b;
            float fA = defpackage.dqe.a(i);
            float fA2 = defpackage.dqe.a(i2);
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
            float fA3 = defpackage.dqe.a(i3);
            cuqVar.a((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), (((long) java.lang.Float.floatToRawIntBits(defpackage.dqe.a(i4))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fA3) << 32), 1 == i5 ? 2 : 1);
        }
    }

    public final void f(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            cuq cuqVar = this.b;
            float fA = defpackage.dqe.a(i);
            float fA2 = defpackage.dqe.a(i2);
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(fA2);
            float fA3 = defpackage.dqe.a(i3);
            long jA = cuqVar.a((jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits << 32), (((long) java.lang.Float.floatToRawIntBits(defpackage.dqe.a(i4))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fA3) << 32), 1 != i5 ? 1 : 2);
            iArr[0] = -aopc.i(java.lang.Float.intBitsToFloat((int) (jA >> 32)));
            iArr[1] = -aopc.i(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }

    public final void g(android.view.View view, android.view.View view2, int i, int i2) {
        this.E.b(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(android.graphics.Region region) {
        if (region != null) {
            int[] iArr = this.D;
            getLocationInWindow(iArr);
            int i = iArr[0];
            region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), android.graphics.Region.Op.DIFFERENCE);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.viewinterop.AndroidViewHolder";
    }

    @Override // android.view.View
    public final android.view.ViewGroup.LayoutParams getLayoutParams() {
        android.view.ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.E.a();
    }

    public final void h(android.view.View view, int i) {
        this.E.c(i);
    }

    public final dcy i() {
        if (!isAttachedToWindow()) {
            cwh.d("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.p();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        k();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final eax j(eax eaxVar) {
        dwn dwnVarF = eaxVar.f(-1);
        dwn dwnVar = dwn.a;
        if (dwnVarF.equals(dwnVar) && eaxVar.g(-9).equals(dwnVar) && eaxVar.k() == null) {
            return eaxVar;
        }
        dck dckVarO = this.x.o();
        if (!dckVarO.u()) {
            return eaxVar;
        }
        long jL = dfd.l(dckVarO.k(0L));
        int iA = dpn.a(jL);
        if (iA < 0) {
            iA = 0;
        }
        int iB = dpn.b(jL);
        if (iB < 0) {
            iB = 0;
        }
        long jH = den.G(dckVarO).h();
        long j = jH >> 32;
        long j2 = jH & 4294967295L;
        long j3 = ((czc) dckVarO).c;
        long jL2 = dfd.l(dckVarO.k((((long) java.lang.Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) java.lang.Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L)));
        int iA2 = ((int) j) - dpn.a(jL2);
        if (iA2 < 0) {
            iA2 = 0;
        }
        int iB2 = ((int) j2) - dpn.b(jL2);
        int i = iB2 >= 0 ? iB2 : 0;
        return (iA == 0 && iB == 0 && iA2 == 0 && i == 0) ? eaxVar : eaxVar.o(iA, iB, iA2, i);
    }

    public final void k() {
        if (this.w) {
            this.c.postOnAnimation(new defpackage.jd(this.C, 20, null));
        } else {
            this.x.F();
        }
    }

    public final void n(aonj aonjVar) {
        this.B = aonjVar;
        this.h = new defpackage.dqk(this, 3);
    }

    public final void o(aonj aonjVar) {
        this.z = aonjVar;
        this.e = new defpackage.dqk(this, 5);
        this.f = true;
        this.s.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
        super.onDescendantInvalidated(view, view2);
        k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        android.view.View view = this.c;
        if (view.getParent() != this) {
            setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.u = i;
        this.v = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (isNestedScrollingEnabled()) {
            float f3 = -f;
            float f4 = -f2;
            aoov.an(this.b.f(), (aolr) null, 0, new defpackage.nrt(z, this, mni.bj(f3, f4), (aoln) null, 1), 3);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        if (isNestedScrollingEnabled()) {
            float f3 = -f;
            float f4 = -f2;
            aoov.an(this.b.f(), (aolr) null, 0, new defpackage.atg(this, mni.bj(f3, f4), (aoln) null, 5), 3);
        }
        return false;
    }

    public final void p(adkz adkzVar) {
        adkz adkzVar2 = this.I;
        if (adkzVar2 != null) {
            adkzVar2.b();
        }
        this.I = adkzVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        aonj aonjVar = this.r;
        if (aonjVar == null) {
            return true;
        }
        aonjVar.a(rect != null ? cfd.B(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        aonj aonjVar = this.t;
        if (aonjVar != null) {
            aonjVar.a(java.lang.Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean t(android.view.View view, android.view.View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }
}
