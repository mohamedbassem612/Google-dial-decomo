package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hb extends defpackage.fk {
    defpackage.gy h;
    public int i;
    public gz j;
    public gw k;
    final defpackage.ha l;
    int m;
    public aaed n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final android.util.SparseBooleanArray t;
    private defpackage.apnt u;

    public hb(android.content.Context context) {
        super(context);
        this.t = new android.util.SparseBooleanArray();
        this.l = new defpackage.ha(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fk
    public final android.view.View b(defpackage.fv fvVar, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View actionView = fvVar.getActionView();
        if (actionView == null || fvVar.m()) {
            defpackage.gf gfVar = view instanceof defpackage.gf ? (defpackage.gf) view : (defpackage.gf) this.d.inflate(2131623940, viewGroup, false);
            gfVar.f(fvVar);
            android.support.v7.view.menu.ActionMenuItemView actionMenuItemView = (android.support.v7.view.menu.ActionMenuItemView) gfVar;
            actionMenuItemView.b = (android.support.v7.widget.ActionMenuView) this.f;
            defpackage.apnt apntVar = this.u;
            if (apntVar == null) {
                apntVar = new defpackage.apnt(this, (byte[]) null);
                this.u = apntVar;
            }
            actionMenuItemView.c = apntVar;
            actionView = (android.view.View) gfVar;
        }
        actionView.setVisibility(true == fvVar.p ? 8 : 0);
        android.view.ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof defpackage.he)) {
            actionView.setLayoutParams(android.support.v7.widget.ActionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.fk, defpackage.ge
    public final void c(android.content.Context context, defpackage.ft ftVar) {
        this.b = context;
        android.view.LayoutInflater.from(this.b);
        this.c = ftVar;
        android.content.res.Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.i = defpackage.den.bM(context);
        int measuredWidth = this.q;
        if (this.o) {
            if (this.h == null) {
                defpackage.gy gyVar = new defpackage.gy(this, this.a);
                this.h = gyVar;
                gyVar.measure(0, 0);
            }
            measuredWidth -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.r = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.ge
    public final android.os.Parcelable cH() {
        android.support.v7.widget.ActionMenuPresenter.SavedState savedState = new android.support.v7.widget.ActionMenuPresenter.SavedState();
        savedState.a = this.m;
        return savedState;
    }

    @Override // defpackage.fk, defpackage.ge
    public final void d(defpackage.ft ftVar, boolean z) {
        p();
        defpackage.gd gdVar = this.e;
        if (gdVar != null) {
            gdVar.a(ftVar, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fk, defpackage.ge
    public final void f(boolean z) {
        defpackage.gy gyVar;
        java.lang.Object parent;
        java.lang.Object obj;
        int i;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f;
        boolean z2 = false;
        if (viewGroup != null) {
            defpackage.ft ftVar = this.c;
            if (ftVar != null) {
                ftVar.m();
                java.util.ArrayList arrayListF = this.c.f();
                int size = arrayListF.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.fv fvVar = (defpackage.fv) arrayListF.get(i2);
                    if (fvVar.o()) {
                        android.view.View childAt = viewGroup.getChildAt(i);
                        defpackage.fv fvVarA = childAt instanceof defpackage.gf ? ((defpackage.gf) childAt).a() : null;
                        android.view.View viewB = b(fvVar, childAt, viewGroup);
                        if (fvVar != fvVarA) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((android.view.ViewGroup) this.f).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.h) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((android.view.View) this.f).requestLayout();
        defpackage.ft ftVar2 = this.c;
        if (ftVar2 != null) {
            ftVar2.m();
            java.util.ArrayList arrayList = ftVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                defpackage.dzk dzkVar = ((defpackage.fv) arrayList.get(i3)).q;
            }
        }
        defpackage.ft ftVar3 = this.c;
        java.util.ArrayList arrayListE = ftVar3 != null ? ftVar3.e() : null;
        if (!this.o || arrayListE == null) {
            gyVar = this.h;
            if (gyVar != null) {
                parent = gyVar.getParent();
                obj = this.f;
                if (parent == obj) {
                    ((android.view.ViewGroup) obj).removeView(this.h);
                }
            }
        } else {
            int size3 = arrayListE.size();
            if (size3 == 1) {
                z2 = !((defpackage.fv) arrayListE.get(0)).p;
            } else if (size3 > 0) {
                z2 = true;
            }
            if (z2) {
                defpackage.gy gyVar2 = this.h;
                if (gyVar2 == null) {
                    defpackage.gy gyVar3 = new defpackage.gy(this, this.a);
                    this.h = gyVar3;
                    gyVar2 = gyVar3;
                }
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) gyVar2.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.h);
                    }
                    android.support.v7.widget.ActionMenuView actionMenuView = (android.support.v7.widget.ActionMenuView) this.f;
                    defpackage.gy gyVar4 = this.h;
                    defpackage.he heVarN = android.support.v7.widget.ActionMenuView.n();
                    heVarN.a = true;
                    actionMenuView.addView(gyVar4, heVarN);
                }
            } else {
                gyVar = this.h;
                if (gyVar != null) {
                    parent = gyVar.getParent();
                    obj = this.f;
                    if (parent == obj) {
                        ((android.view.ViewGroup) obj).removeView(this.h);
                    }
                }
            }
        }
        ((android.support.v7.widget.ActionMenuView) this.f).b = this.o;
    }

    @Override // defpackage.fk, defpackage.ge
    public final boolean g() {
        java.util.ArrayList arrayListF;
        int size;
        boolean z;
        boolean z2;
        defpackage.ft ftVar = this.c;
        android.view.View view = null;
        if (ftVar != null) {
            arrayListF = ftVar.f();
            size = arrayListF.size();
        } else {
            arrayListF = null;
            size = 0;
        }
        int i = this.i;
        int i2 = this.r;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            defpackage.fv fvVar = (defpackage.fv) arrayListF.get(i3);
            if (fvVar.r()) {
                i4++;
            } else if (fvVar.q()) {
                i5++;
            } else {
                z3 = true;
            }
            if (this.s && fvVar.p) {
                i = 0;
            }
            i3++;
        }
        if (this.o && (z3 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        android.util.SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            defpackage.fv fvVar2 = (defpackage.fv) arrayListF.get(i7);
            if (fvVar2.r()) {
                android.view.View viewB = b(fvVar2, view, viewGroup);
                viewB.measure(0, 0);
                int measuredWidth = viewB.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int i9 = fvVar2.b;
                if (i9 != 0) {
                    sparseBooleanArray.put(i9, z);
                }
                fvVar2.k(z);
                z2 = z;
            } else if (fvVar2.q()) {
                int i10 = fvVar2.b;
                boolean z4 = sparseBooleanArray.get(i10);
                boolean z5 = ((i6 > 0 || z4) && i2 > 0) ? z : false;
                if (z5) {
                    android.view.View viewB2 = b(fvVar2, view, viewGroup);
                    viewB2.measure(0, 0);
                    int measuredWidth2 = viewB2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z5 = i2 + i8 > 0 ? z : false;
                }
                if (z5 && i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                } else if (z4) {
                    sparseBooleanArray.put(i10, false);
                    int i11 = 0;
                    while (i11 < i7) {
                        defpackage.fv fvVar3 = (defpackage.fv) arrayListF.get(i11);
                        boolean z6 = z;
                        if (fvVar3.b == i10) {
                            if (fvVar3.o()) {
                                i6++;
                            }
                            fvVar3.k(false);
                        }
                        i11++;
                        z = z6;
                    }
                }
                z2 = z;
                if (z5) {
                    i6--;
                }
                fvVar2.k(z5);
            } else {
                z2 = z;
                fvVar2.k(false);
            }
            i7++;
            z = z2;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fk, defpackage.ge
    public final boolean h(gm gmVar) {
        boolean z = false;
        if (!gmVar.hasVisibleItems()) {
            return false;
        }
        gm gmVar2 = gmVar;
        while (true) {
            defpackage.ft ftVar = gmVar2.k;
            if (ftVar == this.c) {
                break;
            }
            gmVar2 = (gm) ftVar;
        }
        defpackage.fv fvVar = gmVar2.l;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f;
        android.view.View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof defpackage.gf) && ((defpackage.gf) childAt).a() == fvVar) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.m = gmVar.l.a;
        int size = gmVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.view.MenuItem item = gmVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        gw gwVar = new gw(this, this.b, gmVar, view);
        this.k = gwVar;
        gwVar.d(z);
        this.k.f();
        defpackage.gd gdVar = this.e;
        if (gdVar != null) {
            if (gmVar == null) {
                gmVar = this.c;
            }
            gdVar.b(gmVar);
        }
        return true;
    }

    public final void k(android.support.v7.widget.ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean l() {
        java.lang.Object obj;
        java.lang.Runnable runnable = this.n;
        if (runnable != null && (obj = this.f) != null) {
            ((android.view.View) obj).removeCallbacks(runnable);
            this.n = null;
            return true;
        }
        gz gzVar = this.j;
        if (gzVar == null) {
            return false;
        }
        gzVar.b();
        return true;
    }

    public final boolean m() {
        gz gzVar = this.j;
        return gzVar != null && gzVar.h();
    }

    @Override // defpackage.ge
    public final void n(android.os.Parcelable parcelable) {
        int i;
        android.view.MenuItem menuItemFindItem;
        if (!(parcelable instanceof android.support.v7.widget.ActionMenuPresenter.SavedState) || (i = ((android.support.v7.widget.ActionMenuPresenter.SavedState) parcelable).a) <= 0 || (menuItemFindItem = this.c.findItem(i)) == null) {
            return;
        }
        h((gm) menuItemFindItem.getSubMenu());
    }

    public final boolean o() {
        defpackage.ft ftVar;
        if (!this.o || m() || (ftVar = this.c) == null || this.f == null || this.n != null || ftVar.e().isEmpty()) {
            return false;
        }
        this.n = new aaed(this, new gz(this, this.b, this.c, this.h), 1);
        ((android.view.View) this.f).post(this.n);
        return true;
    }

    public final void p() {
        l();
        s();
    }

    public final void q() {
        this.s = true;
    }

    public final void r() {
        this.o = true;
        this.p = true;
    }

    public final void s() {
        gw gwVar = this.k;
        if (gwVar != null) {
            gwVar.b();
        }
    }
}
