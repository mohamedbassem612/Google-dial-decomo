package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fn extends defpackage.gb implements android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener, ge {
    private android.widget.PopupWindow.OnDismissListener A;
    public final android.os.Handler a;
    android.view.View d;
    android.view.ViewTreeObserver e;
    public boolean f;
    private final android.content.Context h;
    private final int i;
    private final int j;
    private final int k;
    private final boolean l;
    private android.view.View r;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean y;
    private gd z;
    private final java.util.List m = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();
    final android.view.ViewTreeObserver.OnGlobalLayoutListener c = new defpackage.gj(this, 1);
    private final android.view.View.OnAttachStateChangeListener n = new defpackage.gk(this, 1);
    private final defpackage.jw o = new defpackage.fm(this);
    private int p = 0;
    private int q = 0;
    private boolean x = false;
    private int s = B();

    public fn(android.content.Context context, android.view.View view, int i, int i2, boolean z) {
        this.h = context;
        this.r = view;
        this.j = i;
        this.k = i2;
        this.l = z;
        android.content.res.Resources resources = context.getResources();
        this.i = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165209));
        this.a = new android.os.Handler();
    }

    private final int B() {
        return this.r.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x0126 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c A[PHI: r4
      0x012c: PHI (r4v14 int) = (r4v5 int), (r4v16 int) binds: [B:54:0x012e, B:52:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    private final void C(ft ftVar) {
        alic alicVar;
        android.view.View childAt;
        int i;
        android.view.MenuItem item;
        defpackage.fq fqVar;
        int headersCount;
        int firstVisiblePosition;
        android.content.Context context = this.h;
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        defpackage.fq fqVar2 = new defpackage.fq(ftVar, layoutInflaterFrom, this.l, 2131623949);
        if (!x() && this.x) {
            fqVar2.b = true;
        } else if (x()) {
            fqVar2.b = defpackage.gb.z(ftVar);
        }
        int iA = A(fqVar2, context, this.i);
        defpackage.jy jyVar = new defpackage.jy(context, this.j, this.k);
        jyVar.a = this.o;
        jyVar.l = this;
        jyVar.t(this);
        jyVar.k = this.r;
        jyVar.j = this.q;
        jyVar.y();
        jyVar.w();
        jyVar.e(fqVar2);
        jyVar.r(iA);
        jyVar.j = this.q;
        java.util.List list = this.b;
        if (list.size() > 0) {
            alicVar = (alic) list.get(list.size() - 1);
            ft ftVar2 = (ft) alicVar.b;
            int size = ftVar2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    item = null;
                    break;
                }
                item = ftVar2.getItem(i2);
                if (item.hasSubMenu() && ftVar == item.getSubMenu()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (item != null) {
                android.widget.ListView listViewO = alicVar.o();
                android.widget.ListAdapter adapter = listViewO.getAdapter();
                if (adapter instanceof android.widget.HeaderViewListAdapter) {
                    android.widget.HeaderViewListAdapter headerViewListAdapter = (android.widget.HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    fqVar = (defpackage.fq) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fqVar = (defpackage.fq) adapter;
                    headersCount = 0;
                }
                int count = fqVar.getCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= count) {
                        i3 = -1;
                        break;
                    } else if (item == fqVar.getItem(i3)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1 && (firstVisiblePosition = (i3 + headersCount) - listViewO.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewO.getChildCount()) {
                    childAt = listViewO.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt != null) {
                android.widget.PopupWindow popupWindow = jyVar.p;
                fn$.ExternalSyntheticApiModelOutline0.m(popupWindow, false);
                popupWindow.setEnterTransition(null);
                android.widget.ListView listViewO2 = ((alic) list.get(list.size() - 1)).o();
                int[] iArr = new int[2];
                listViewO2.getLocationOnScreen(iArr);
                android.graphics.Rect rect = new android.graphics.Rect();
                this.d.getWindowVisibleDisplayFrame(rect);
                i = (this.s == 1 ? iArr[0] - iA >= 0 : (iArr[0] + listViewO2.getWidth()) + iA > rect.right) ? 0 : 1;
                this.s = i;
                jyVar.k = childAt;
                if ((this.q & 5) == 5) {
                    if (i == 0) {
                        iA = childAt.getWidth();
                        iA = -iA;
                    }
                } else if (i != 0) {
                    iA = childAt.getWidth();
                } else {
                    iA = -iA;
                }
                jyVar.g = iA;
                jyVar.i = true;
                jyVar.h = true;
                jyVar.j(0);
            } else {
                if (this.t) {
                    jyVar.g = this.v;
                }
                if (this.u) {
                    jyVar.j(this.w);
                }
                jyVar.s(this.g);
            }
            list.add(new alic(jyVar, ftVar, this.s));
            jyVar.v();
            defpackage.je jeVar = jyVar.e;
            jeVar.setOnKeyListener(this);
            if (alicVar == null || !this.y || ftVar.e == null) {
                return;
            }
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) layoutInflaterFrom.inflate(2131623956, (android.view.ViewGroup) jeVar, false);
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(ftVar.e);
            jeVar.addHeaderView(frameLayout, null, false);
            jyVar.v();
            return;
        }
        alicVar = null;
        childAt = null;
        if (childAt != null) {
            android.widget.PopupWindow popupWindow2 = jyVar.p;
            fn$.ExternalSyntheticApiModelOutline0.m(popupWindow2, false);
            popupWindow2.setEnterTransition(null);
            android.widget.ListView listViewO3 = ((alic) list.get(list.size() - 1)).o();
            int[] iArr2 = new int[2];
            listViewO3.getLocationOnScreen(iArr2);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            this.d.getWindowVisibleDisplayFrame(rect2);
            if (this.s == 1) {
            }
            this.s = i;
            jyVar.k = childAt;
            if ((this.q & 5) == 5) {
                if (i == 0) {
                    iA = childAt.getWidth();
                    iA = -iA;
                }
            } else if (i != 0) {
                iA = childAt.getWidth();
            } else {
                iA = -iA;
            }
            jyVar.g = iA;
            jyVar.i = true;
            jyVar.h = true;
            jyVar.j(0);
        } else {
            if (this.t) {
                jyVar.g = this.v;
            }
            if (this.u) {
                jyVar.j(this.w);
            }
            jyVar.s(this.g);
        }
        list.add(new alic(jyVar, ftVar, this.s));
        jyVar.v();
        defpackage.je jeVar2 = jyVar.e;
        jeVar2.setOnKeyListener(this);
        if (alicVar == null) {
        }
    }

    public final android.os.Parcelable cH() {
        return null;
    }

    @Override // defpackage.gi
    public final android.widget.ListView cI() {
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((alic) list.get(list.size() - 1)).o();
    }

    public final void d(ft ftVar, boolean z) {
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (ftVar == ((alic) list.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < list.size()) {
                ((ft) ((alic) list.get(i2)).b).i(false);
            }
            alic alicVar = (alic) list.remove(i);
            ((ft) alicVar.b).o(this);
            if (this.f) {
                java.lang.Object obj = alicVar.c;
                ((defpackage.jy) obj).p.setExitTransition(null);
                ((defpackage.jv) obj).p.setAnimationStyle(0);
            }
            ((defpackage.jv) alicVar.c).m();
            int size2 = list.size();
            if (size2 > 0) {
                this.s = ((alic) list.get(size2 - 1)).a;
            } else {
                this.s = B();
            }
            if (size2 != 0) {
                if (z) {
                    ((ft) ((alic) list.get(0)).b).i(false);
                    return;
                }
                return;
            }
            m();
            gd gdVar = this.z;
            if (gdVar != null) {
                gdVar.a(ftVar, true);
            }
            android.view.ViewTreeObserver viewTreeObserver = this.e;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.e.removeGlobalOnLayoutListener(this.c);
                }
                this.e = null;
            }
            this.d.removeOnAttachStateChangeListener(this.n);
            this.A.onDismiss();
        }
    }

    public final void e(gd gdVar) {
        this.z = gdVar;
    }

    public final void f(boolean z) {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            y(((alic) it.next()).o().getAdapter()).notifyDataSetChanged();
        }
    }

    public final boolean g() {
        return false;
    }

    public final boolean h(defpackage.gm gmVar) {
        for (alic alicVar : this.b) {
            if (gmVar == alicVar.b) {
                alicVar.o().requestFocus();
                return true;
            }
        }
        if (!gmVar.hasVisibleItems()) {
            return false;
        }
        l(gmVar);
        gd gdVar = this.z;
        if (gdVar == null) {
            return true;
        }
        gdVar.b(gmVar);
        return true;
    }

    @Override // defpackage.gb
    public final void l(ft ftVar) {
        ftVar.h(this, this.h);
        if (x()) {
            C(ftVar);
        } else {
            this.m.add(ftVar);
        }
    }

    @Override // defpackage.gi
    public final void m() {
        java.util.List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        alic[] alicVarArr = (alic[]) list.toArray(new alic[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            defpackage.jv jvVar = (defpackage.jv) alicVarArr[size].c;
            if (jvVar.x()) {
                jvVar.m();
            }
        }
    }

    @Override // defpackage.gb
    public final void o(android.view.View view) {
        if (this.r != view) {
            this.r = view;
            this.q = android.view.Gravity.getAbsoluteGravity(this.p, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        alic alicVar;
        java.util.List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                alicVar = null;
                break;
            }
            alicVar = (alic) list.get(i);
            if (!((defpackage.jv) alicVar.c).x()) {
                break;
            } else {
                i++;
            }
        }
        if (alicVar != null) {
            ((ft) alicVar.b).i(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View view, int i, android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m();
        return true;
    }

    @Override // defpackage.gb
    public final void p(boolean z) {
        this.x = z;
    }

    @Override // defpackage.gb
    public final void q(int i) {
        if (this.p != i) {
            this.p = i;
            this.q = android.view.Gravity.getAbsoluteGravity(i, this.r.getLayoutDirection());
        }
    }

    @Override // defpackage.gb
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.gb
    public final void s(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // defpackage.gb
    public final void t(boolean z) {
        this.y = z;
    }

    @Override // defpackage.gb
    public final void u(int i) {
        this.u = true;
        this.w = i;
    }

    @Override // defpackage.gi
    public final void v() {
        if (x()) {
            return;
        }
        java.util.List list = this.m;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            C((ft) it.next());
        }
        list.clear();
        android.view.View view = this.r;
        this.d = view;
        if (view != null) {
            android.view.ViewTreeObserver viewTreeObserver = this.e;
            android.view.ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.n);
        }
    }

    @Override // defpackage.gb
    protected final boolean w() {
        return false;
    }

    @Override // defpackage.gi
    public final boolean x() {
        java.util.List list = this.b;
        return list.size() > 0 && ((defpackage.jv) ((alic) list.get(0)).c).x();
    }

    public final void n(android.os.Parcelable parcelable) {
    }
}
