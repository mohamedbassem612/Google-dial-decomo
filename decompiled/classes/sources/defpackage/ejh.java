package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ejh extends defpackage.ecl {
    public final int a;
    public defpackage.ecm b;
    public final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout c;
    private final java.lang.Runnable d = new defpackage.ddv(this, 5);

    public ejh(androidx.drawerlayout.widget.DrawerLayout drawerLayout, int i) {
        this.c = drawerLayout;
        this.a = i;
    }

    @Override // defpackage.ecl
    public final int a(android.view.View view) {
        if (androidx.drawerlayout.widget.DrawerLayout.t(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.ecl
    public final void b(int i, int i2) {
        int i3 = i & 1;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.c;
        android.view.View viewC = i3 == 1 ? drawerLayout.c(3) : drawerLayout.c(5);
        if (viewC == null || this.c.a(viewC) != 0) {
            return;
        }
        this.b.d(viewC, i2);
    }

    @Override // defpackage.ecl
    public final void c(android.view.View view, int i) {
        ((defpackage.ejg) view.getLayoutParams()).c = false;
        m();
    }

    @Override // defpackage.ecl
    public final void d(int i) {
        this.c.m(i, this.b.k);
    }

    @Override // defpackage.ecl
    public final void e(android.view.View view, float f, float f2) {
        int width;
        float fQ = androidx.drawerlayout.widget.DrawerLayout.q(view);
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.c;
        int width2 = view.getWidth();
        if (drawerLayout.n(view, 3)) {
            width = 0;
            if (f <= 0.0f && (f != 0.0f || fQ <= 0.5f)) {
                width = -width2;
            }
        } else {
            width = drawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && fQ > 0.5f)) {
                width -= width2;
            }
        }
        this.b.h(width, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // defpackage.ecl
    public final boolean f(android.view.View view, int i) {
        if (androidx.drawerlayout.widget.DrawerLayout.t(view)) {
            androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.c;
            if (drawerLayout.n(view, this.a) && drawerLayout.a(view) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecl
    public final int g(android.view.View view, int i) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.c;
        if (drawerLayout.n(view, 3)) {
            return java.lang.Math.max(-view.getWidth(), java.lang.Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return java.lang.Math.max(width - view.getWidth(), java.lang.Math.min(i, width));
    }

    @Override // defpackage.ecl
    public final int h(android.view.View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.ecl
    public final void k() {
        this.c.postDelayed(this.d, 160L);
    }

    @Override // defpackage.ecl
    public final void l(android.view.View view, int i, int i2) {
        int width = view.getWidth();
        float f = width;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.c;
        float width2 = (drawerLayout.n(view, 3) ? width + i : drawerLayout.getWidth() - i) / f;
        drawerLayout.j(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    public final void m() {
        int i = this.a == 3 ? 5 : 3;
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.c;
        android.view.View viewC = drawerLayout.c(i);
        if (viewC != null) {
            drawerLayout.g(viewC, true);
        }
    }

    public final void n() {
        this.c.removeCallbacks(this.d);
    }

    @Override // defpackage.ecl
    public final void j() {
    }
}
