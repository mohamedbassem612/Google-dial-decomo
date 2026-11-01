package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dy extends defpackage.cp {
    public final android.view.Window.Callback a;
    boolean b;
    final defpackage.ly c;
    final rai d;
    private boolean e;
    private boolean f;
    private final java.util.ArrayList g = new java.util.ArrayList();
    private final java.lang.Runnable h = new ae(this, 19, (byte[]) null);
    private final lv i;

    public dy(android.support.v7.widget.Toolbar toolbar, java.lang.CharSequence charSequence, android.view.Window.Callback callback) {
        defpackage.jlh jlhVar = new defpackage.jlh(this, 1);
        this.i = jlhVar;
        defpackage.ly lyVar = new defpackage.ly(toolbar, false);
        this.c = lyVar;
        dzk.x(callback);
        this.a = callback;
        lyVar.d = callback;
        toolbar.u = jlhVar;
        lyVar.j(charSequence);
        this.d = new rai(this, (byte[]) null);
    }

    @Override // defpackage.cp
    public final int a() {
        return this.c.b;
    }

    @Override // defpackage.cp
    public final android.content.Context b() {
        return this.c.a();
    }

    @Override // defpackage.cp
    public final java.lang.CharSequence d() {
        return this.c.b();
    }

    @Override // defpackage.cp
    public final void e(boolean z) {
        if (z != this.f) {
            this.f = z;
            java.util.ArrayList arrayList = this.g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.co) arrayList.get(i)).a();
            }
        }
    }

    @Override // defpackage.cp
    public final void f() {
        this.c.a.removeCallbacks(this.h);
    }

    @Override // defpackage.cp
    public final void i(int i) {
        defpackage.ly lyVar = this.c;
        lyVar.h(lyVar.a().getText(i));
    }

    @Override // defpackage.cp
    public final void j(java.lang.CharSequence charSequence) {
        this.c.h(charSequence);
    }

    @Override // defpackage.cp
    public final void k(java.lang.CharSequence charSequence) {
        this.c.j(charSequence);
    }

    @Override // defpackage.cp
    public final boolean l() {
        return this.c.l();
    }

    @Override // defpackage.cp
    public final boolean m() {
        defpackage.ly lyVar = this.c;
        if (!lyVar.k()) {
            return false;
        }
        lyVar.c();
        return true;
    }

    @Override // defpackage.cp
    public final boolean n() {
        android.support.v7.widget.Toolbar toolbar = this.c.a;
        java.lang.Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        int i = dzs.a;
        toolbar.postOnAnimation(runnable);
        return true;
    }

    @Override // defpackage.cp
    public final boolean o(int i, android.view.KeyEvent keyEvent) {
        android.view.Menu menuV = v();
        if (menuV == null) {
            return false;
        }
        menuV.setQwertyMode(android.view.KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuV.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.cp
    public final boolean p(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // defpackage.cp
    public final boolean q() {
        return this.c.n();
    }

    @Override // defpackage.cp
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.cp
    public final void t() {
        this.c.f(null);
    }

    @Override // defpackage.cp
    public final void u() {
        w(4, 4);
    }

    public final android.view.Menu v() {
        if (!this.e) {
            defpackage.ly lyVar = this.c;
            defpackage.dw dwVar = new defpackage.dw(this);
            defpackage.dx dxVar = new defpackage.dx(this);
            android.support.v7.widget.Toolbar toolbar = lyVar.a;
            toolbar.x = dwVar;
            toolbar.y = dxVar;
            android.support.v7.widget.ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.i(dwVar, dxVar);
            }
            this.e = true;
        }
        return this.c.a.f();
    }

    public final void w(int i, int i2) {
        defpackage.ly lyVar = this.c;
        lyVar.e((i & i2) | (lyVar.b & (~i2)));
    }

    @Override // defpackage.cp
    public final void r() {
    }

    @Override // defpackage.cp
    public final void g(boolean z) {
    }

    @Override // defpackage.cp
    public final void h(boolean z) {
    }
}
