package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class eau {
    static final defpackage.eax i;
    final defpackage.eax j;

    static {
        defpackage.eal eahVar;
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            eahVar = new defpackage.eak();
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            eahVar = new defpackage.eaj();
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            eahVar = new defpackage.eai();
        } else {
            eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.eah() : new defpackage.eag();
        }
        i = eahVar.a().l().m().n();
    }

    public eau(defpackage.eax eaxVar) {
        this.j = eaxVar;
    }

    public dyo A() {
        return null;
    }

    public defpackage.eax B() {
        return this.j;
    }

    public defpackage.dwn C() {
        return d();
    }

    public defpackage.dwn D() {
        return d();
    }

    public defpackage.dwn E() {
        return d();
    }

    public defpackage.dwn a(int i2) {
        return defpackage.dwn.a;
    }

    public defpackage.dwn c(int i2) {
        if ((i2 & 8) == 0) {
            return defpackage.dwn.a;
        }
        throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public defpackage.dwn d() {
        return defpackage.dwn.a;
    }

    public defpackage.eax e(int i2, int i3, int i4, int i5) {
        return i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eau) {
            defpackage.eau eauVar = (defpackage.eau) obj;
            if (s() == eauVar.s() && z() == eauVar.z() && j$.util.Objects.equals(d(), eauVar.d()) && j$.util.Objects.equals(w(), eauVar.w()) && j$.util.Objects.equals(A(), eauVar.A())) {
                return true;
            }
        }
        return false;
    }

    public java.util.List f(int i2) {
        return java.util.Collections.EMPTY_LIST;
    }

    public java.util.List g(int i2) {
        return java.util.Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(s()), java.lang.Boolean.valueOf(z()), d(), w(), A()});
    }

    public boolean s() {
        return false;
    }

    public boolean u(int i2) {
        return true;
    }

    public defpackage.dwn w() {
        return defpackage.dwn.a;
    }

    public defpackage.eax x() {
        return this.j;
    }

    public defpackage.eax y() {
        return this.j;
    }

    public boolean z() {
        return false;
    }

    public void k() {
    }

    public void h(android.view.View view) {
    }

    public void i(defpackage.eax eaxVar) {
    }

    public void j(android.view.View view) {
    }

    public void l(dyq dyqVar) {
    }

    public void m(defpackage.dwn[] dwnVarArr) {
    }

    public void n(defpackage.dwn dwnVar) {
    }

    public void o(defpackage.eax eaxVar) {
    }

    public void p(int i2) {
    }

    public void q(android.graphics.Rect[][] rectArr) {
    }

    public void r(android.graphics.Rect[][] rectArr) {
    }
}
