package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gl extends defpackage.gb implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, android.view.View.OnKeyListener, ge {
    final defpackage.jy a;
    android.view.View c;
    android.view.ViewTreeObserver d;
    private final android.content.Context e;
    private final ft f;
    private final defpackage.fq h;
    private final boolean i;
    private final int j;
    private final int k;
    private final int l;
    private android.widget.PopupWindow.OnDismissListener n;
    private android.view.View o;
    private gd p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean u;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener b = new defpackage.gj(this, 0);
    private final android.view.View.OnAttachStateChangeListener m = new defpackage.gk(this, 0);
    private int t = 0;

    public gl(android.content.Context context, ft ftVar, android.view.View view, int i, int i2, boolean z) {
        this.e = context;
        this.f = ftVar;
        this.i = z;
        this.h = new defpackage.fq(ftVar, android.view.LayoutInflater.from(context), z, 2131623957);
        this.k = i;
        this.l = i2;
        android.content.res.Resources resources = context.getResources();
        this.j = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165209));
        this.o = view;
        this.a = new defpackage.jy(context, i, i2);
        ftVar.h(this, context);
    }

    public final android.os.Parcelable cH() {
        return null;
    }

    @Override // defpackage.gi
    public final android.widget.ListView cI() {
        return this.a.e;
    }

    public final void d(ft ftVar, boolean z) {
        if (ftVar == this.f) {
            m();
            gd gdVar = this.p;
            if (gdVar != null) {
                gdVar.a(ftVar, z);
            }
        }
    }

    public final void e(gd gdVar) {
        this.p = gdVar;
    }

    public final void f(boolean z) {
        this.r = false;
        defpackage.fq fqVar = this.h;
        if (fqVar != null) {
            fqVar.notifyDataSetChanged();
        }
    }

    public final boolean g() {
        return false;
    }

    public final boolean h(defpackage.gm gmVar) {
        if (!gmVar.hasVisibleItems()) {
            return false;
        }
        defpackage.gc gcVar = new defpackage.gc(this.e, gmVar, this.c, this.i, this.k, this.l);
        gcVar.e(this.p);
        gcVar.d(defpackage.gb.z(gmVar));
        gcVar.c = this.n;
        this.n = null;
        this.f.i(false);
        defpackage.jy jyVar = this.a;
        int width = jyVar.g;
        int iB = jyVar.b();
        if ((android.view.Gravity.getAbsoluteGravity(this.t, this.o.getLayoutDirection()) & 7) == 5) {
            width += this.o.getWidth();
        }
        if (!gcVar.h()) {
            if (gcVar.a == null) {
                return false;
            }
            gcVar.g(width, iB, true, true);
        }
        gd gdVar = this.p;
        if (gdVar != null) {
            gdVar.b(gmVar);
        }
        return true;
    }

    @Override // defpackage.gi
    public final void m() {
        if (x()) {
            this.a.m();
        }
    }

    @Override // defpackage.gb
    public final void o(android.view.View view) {
        this.o = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.q = true;
        this.f.i(true);
        android.view.ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.m);
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.h.b = z;
    }

    @Override // defpackage.gb
    public final void q(int i) {
        this.t = i;
    }

    @Override // defpackage.gb
    public final void r(int i) {
        this.a.g = i;
    }

    @Override // defpackage.gb
    public final void s(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    @Override // defpackage.gb
    public final void t(boolean z) {
        this.u = z;
    }

    @Override // defpackage.gb
    public final void u(int i) {
        this.a.j(i);
    }

    @Override // defpackage.gi
    public final void v() {
        android.view.View view;
        if (x()) {
            return;
        }
        if (this.q || (view = this.o) == null) {
            throw new java.lang.IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        defpackage.jy jyVar = this.a;
        jyVar.t(this);
        jyVar.l = this;
        jyVar.y();
        android.view.View view2 = this.c;
        android.view.ViewTreeObserver viewTreeObserver = this.d;
        android.view.ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.m);
        jyVar.k = view2;
        jyVar.j = this.t;
        if (!this.r) {
            this.s = A(this.h, this.e, this.j);
            this.r = true;
        }
        jyVar.r(this.s);
        jyVar.w();
        jyVar.s(this.g);
        jyVar.v();
        defpackage.je jeVar = jyVar.e;
        jeVar.setOnKeyListener(this);
        if (this.u) {
            ft ftVar = this.f;
            if (ftVar.e != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.LayoutInflater.from(this.e).inflate(2131623956, (android.view.ViewGroup) jeVar, false);
                android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(ftVar.e);
                }
                frameLayout.setEnabled(false);
                jeVar.addHeaderView(frameLayout, null, false);
            }
        }
        jyVar.e(this.h);
        jyVar.v();
    }

    @Override // defpackage.gi
    public final boolean x() {
        return !this.q && this.a.x();
    }

    @Override // defpackage.gb
    public final void l(ft ftVar) {
    }

    public final void n(android.os.Parcelable parcelable) {
    }
}
