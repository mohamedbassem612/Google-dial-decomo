package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ed extends defpackage.ey implements fr {
    public final ft a;
    public defpackage.ex b;
    final /* synthetic */ defpackage.ee c;
    private final android.content.Context f;
    private java.lang.ref.WeakReference g;

    public ed(defpackage.ee eeVar, android.content.Context context, defpackage.ex exVar) {
        this.c = eeVar;
        this.f = context;
        this.b = exVar;
        ft ftVar = new ft(context);
        ftVar.E();
        this.a = ftVar;
        ftVar.b = this;
    }

    public final void H(ft ftVar) {
        if (this.b != null) {
            g();
            this.c.d.o();
        }
    }

    public final boolean L(ft ftVar, android.view.MenuItem menuItem) {
        defpackage.ex exVar = this.b;
        if (exVar != null) {
            return exVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.ey
    public final android.view.Menu a() {
        return this.a;
    }

    @Override // defpackage.ey
    public final android.view.MenuInflater b() {
        return new fe(this.f);
    }

    @Override // defpackage.ey
    public final android.view.View c() {
        java.lang.ref.WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.ey
    public final java.lang.CharSequence d() {
        return this.c.d.h;
    }

    @Override // defpackage.ey
    public final java.lang.CharSequence e() {
        return this.c.d.g;
    }

    @Override // defpackage.ey
    public final void f() {
        defpackage.ee eeVar = this.c;
        if (eeVar.f == this) {
            if (defpackage.ee.y(eeVar.k, false)) {
                this.b.a(this);
            } else {
                eeVar.g = this;
                eeVar.h = this.b;
            }
            this.b = null;
            eeVar.v(false);
            android.support.v7.widget.ActionBarContextView actionBarContextView = eeVar.d;
            if (actionBarContextView.i == null) {
                actionBarContextView.i();
            }
            eeVar.b.k(eeVar.m);
            eeVar.f = null;
        }
    }

    @Override // defpackage.ey
    public final void g() {
        if (this.c.f == this) {
            android.view.Menu menu = this.a;
            menu.u();
            try {
                this.b.d(this, menu);
            } finally {
                this.a.t();
            }
        }
    }

    @Override // defpackage.ey
    public final void h(android.view.View view) {
        this.c.d.j(view);
        this.g = new java.lang.ref.WeakReference(view);
    }

    @Override // defpackage.ey
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ey
    public final void j(java.lang.CharSequence charSequence) {
        this.c.d.k(charSequence);
    }

    @Override // defpackage.ey
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.ey
    public final void l(java.lang.CharSequence charSequence) {
        this.c.d.l(charSequence);
    }

    @Override // defpackage.ey
    public final void m(boolean z) {
        this.e = z;
        this.c.d.m(z);
    }

    @Override // defpackage.ey
    public final boolean n() {
        return this.c.d.j;
    }
}
