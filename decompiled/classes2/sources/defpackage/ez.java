package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ez extends defpackage.ey implements fr {
    public final ft a;
    private final android.content.Context b;
    private final android.support.v7.widget.ActionBarContextView c;
    private final defpackage.ex f;
    private java.lang.ref.WeakReference g;
    private boolean h;

    public ez(android.content.Context context, android.support.v7.widget.ActionBarContextView actionBarContextView, defpackage.ex exVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = exVar;
        ft ftVar = new ft(actionBarContextView.getContext());
        ftVar.E();
        this.a = ftVar;
        ftVar.b = this;
    }

    public final void H(ft ftVar) {
        g();
        this.c.o();
    }

    public final boolean L(ft ftVar, android.view.MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.ey
    public final android.view.Menu a() {
        return this.a;
    }

    @Override // defpackage.ey
    public final android.view.MenuInflater b() {
        return new fe(this.c.getContext());
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
        return this.c.h;
    }

    @Override // defpackage.ey
    public final java.lang.CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.ey
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.ey
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.ey
    public final void h(android.view.View view) {
        this.c.j(view);
        this.g = view != null ? new java.lang.ref.WeakReference(view) : null;
    }

    @Override // defpackage.ey
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.ey
    public final void j(java.lang.CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.ey
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.ey
    public final void l(java.lang.CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.ey
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.ey
    public final boolean n() {
        return this.c.j;
    }
}
