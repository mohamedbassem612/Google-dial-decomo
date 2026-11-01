package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eax {
    public static final defpackage.eax a;
    public final defpackage.eau b;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            a = defpackage.eas.h;
        } else {
            a = defpackage.eaq.g;
        }
    }

    public eax(defpackage.eax eaxVar) {
        if (eaxVar == null) {
            this.b = new defpackage.eau(this);
            return;
        }
        defpackage.eau eauVar = eaxVar.b;
        if (android.os.Build.VERSION.SDK_INT >= 35 && (eauVar instanceof defpackage.eat)) {
            this.b = new defpackage.eat(this, (defpackage.eat) eauVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 34 && (eauVar instanceof defpackage.eas)) {
            this.b = new defpackage.eas(this, (defpackage.eas) eauVar);
        } else if (android.os.Build.VERSION.SDK_INT >= 31 && (eauVar instanceof defpackage.ear)) {
            this.b = new defpackage.ear(this, (defpackage.ear) eauVar);
        } else if (eauVar instanceof defpackage.eaq) {
            this.b = new defpackage.eaq(this, (defpackage.eaq) eauVar);
        } else if (eauVar instanceof defpackage.eap) {
            this.b = new defpackage.eap(this, (defpackage.eap) eauVar);
        } else if (eauVar instanceof defpackage.eao) {
            this.b = new defpackage.eao(this, (defpackage.eao) eauVar);
        } else if (eauVar instanceof defpackage.ean) {
            this.b = new defpackage.ean(this, (defpackage.ean) eauVar);
        } else if (eauVar instanceof defpackage.eam) {
            this.b = new defpackage.eam(this, (defpackage.eam) eauVar);
        } else {
            this.b = new defpackage.eau(this);
        }
        eauVar.i(this);
    }

    public static defpackage.dwn j(defpackage.dwn dwnVar, int i, int i2, int i3, int i4) {
        int iMax = java.lang.Math.max(0, dwnVar.b - i);
        int iMax2 = java.lang.Math.max(0, dwnVar.c - i2);
        int iMax3 = java.lang.Math.max(0, dwnVar.d - i3);
        int iMax4 = java.lang.Math.max(0, dwnVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? dwnVar : defpackage.dwn.d(iMax, iMax2, iMax3, iMax4);
    }

    public static defpackage.eax q(android.view.WindowInsets windowInsets, android.view.View view) {
        windowInsets.getClass();
        defpackage.eax eaxVar = new defpackage.eax(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = defpackage.dzs.a;
            eaxVar.t(defpackage.dzl.a(view));
            eaxVar.r(view.getRootView());
            eaxVar.u(view.getWindowSystemUiVisibility());
        }
        return eaxVar;
    }

    @java.lang.Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @java.lang.Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @java.lang.Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @java.lang.Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final android.view.WindowInsets e() {
        defpackage.eau eauVar = this.b;
        if (eauVar instanceof defpackage.eam) {
            return ((defpackage.eam) eauVar).a;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eax) {
            return j$.util.Objects.equals(this.b, ((defpackage.eax) obj).b);
        }
        return false;
    }

    public final defpackage.dwn f(int i) {
        return this.b.a(i);
    }

    public final defpackage.dwn g(int i) {
        return this.b.c(i);
    }

    @java.lang.Deprecated
    public final defpackage.dwn h() {
        return this.b.w();
    }

    public final int hashCode() {
        defpackage.eau eauVar = this.b;
        if (eauVar == null) {
            return 0;
        }
        return eauVar.hashCode();
    }

    @java.lang.Deprecated
    public final defpackage.dwn i() {
        return this.b.d();
    }

    public final dyo k() {
        return this.b.A();
    }

    @java.lang.Deprecated
    public final defpackage.eax l() {
        return this.b.B();
    }

    @java.lang.Deprecated
    public final defpackage.eax m() {
        return this.b.x();
    }

    @java.lang.Deprecated
    public final defpackage.eax n() {
        return this.b.y();
    }

    public final defpackage.eax o(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    @java.lang.Deprecated
    public final defpackage.eax p(int i, int i2, int i3, int i4) {
        defpackage.eal eahVar;
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            eahVar = new defpackage.eak(this);
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            eahVar = new defpackage.eaj(this);
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            eahVar = new defpackage.eai(this);
        } else {
            eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.eah(this) : new defpackage.eag(this);
        }
        eahVar.c(defpackage.dwn.d(i, i2, i3, i4));
        return eahVar.a();
    }

    final void r(android.view.View view) {
        defpackage.eau eauVar = this.b;
        eauVar.h(view);
        eauVar.j(view);
        eauVar.k();
    }

    final void s(dyq dyqVar) {
        this.b.l(dyqVar);
    }

    final void t(defpackage.eax eaxVar) {
        this.b.o(eaxVar);
    }

    final void u(int i) {
        this.b.p(i);
    }

    final void v(android.graphics.Rect[][] rectArr) {
        this.b.q(rectArr);
    }

    final void w(android.graphics.Rect[][] rectArr) {
        this.b.r(rectArr);
    }

    public final boolean x() {
        return this.b.z();
    }

    public final boolean y(int i) {
        return this.b.u(i);
    }

    public eax(android.view.WindowInsets windowInsets) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.b = new defpackage.eat(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            this.b = new defpackage.eas(this, windowInsets);
        } else if (android.os.Build.VERSION.SDK_INT >= 31) {
            this.b = new defpackage.ear(this, windowInsets);
        } else {
            this.b = new defpackage.eaq(this, windowInsets);
        }
    }
}
