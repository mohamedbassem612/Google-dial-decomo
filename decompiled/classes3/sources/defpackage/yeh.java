package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class yeh implements java.lang.Cloneable {
    private int a;
    private int b;
    public android.graphics.drawable.Drawable f;
    public int g;
    public android.graphics.drawable.Drawable h;
    public int i;
    public boolean n;
    public android.graphics.drawable.Drawable p;
    public android.content.res.Resources.Theme t;
    public boolean u;
    public boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float c = 1.0f;
    public defpackage.xwm d = defpackage.xwm.e;
    public defpackage.xsm e = defpackage.xsm.c;
    public boolean j = true;
    public int k = -1;
    public int l = -1;
    public defpackage.xuo m = defpackage.yfm.b;
    public boolean o = true;
    public defpackage.xus q = new defpackage.xus();
    public java.util.Map r = new defpackage.yfq();
    public java.lang.Class s = java.lang.Object.class;
    public boolean v = true;

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    private final defpackage.yeh b(defpackage.ybe ybeVar, defpackage.xuw xuwVar) {
        defpackage.yeh yehVarX = x(ybeVar, xuwVar);
        yehVarX.v = true;
        return yehVarX;
    }

    public defpackage.yeh A(android.graphics.drawable.Drawable drawable) {
        if (this.u) {
            return j().A(drawable);
        }
        this.h = drawable;
        int i = this.a | 64;
        this.i = 0;
        this.a = i & (-129);
        P();
        return this;
    }

    public defpackage.yeh B(defpackage.xsm xsmVar) {
        if (this.u) {
            return j().B(xsmVar);
        }
        this.e = xsmVar;
        this.a |= 8;
        P();
        return this;
    }

    final defpackage.yeh C(defpackage.xur xurVar) {
        if (this.u) {
            return j().C(xurVar);
        }
        this.q.b.remove(xurVar);
        P();
        return this;
    }

    public defpackage.yeh D(defpackage.xur xurVar, java.lang.Object obj) {
        if (this.u) {
            return j().D(xurVar, obj);
        }
        anty.aI(xurVar, "Argument must not be null");
        this.q.d(xurVar, obj);
        P();
        return this;
    }

    public defpackage.yeh E(defpackage.xuo xuoVar) {
        if (this.u) {
            return j().E(xuoVar);
        }
        this.m = xuoVar;
        this.a |= 1024;
        P();
        return this;
    }

    public defpackage.yeh F(android.content.res.Resources.Theme theme) {
        if (this.u) {
            return j().F(theme);
        }
        this.t = theme;
        int i = this.a;
        if (theme != null) {
            this.a = i | 32768;
            return D(defpackage.ycr.a, theme);
        }
        this.a = i & (-32769);
        return C(defpackage.ycr.a);
    }

    public defpackage.yeh G(defpackage.xuw xuwVar) {
        return H(xuwVar, true);
    }

    public final defpackage.yeh H(defpackage.xuw xuwVar, boolean z) {
        if (this.u) {
            return j().H(xuwVar, z);
        }
        defpackage.ybk ybkVar = new defpackage.ybk(xuwVar, z);
        J(android.graphics.Bitmap.class, xuwVar, z);
        J(android.graphics.drawable.Drawable.class, ybkVar, z);
        J(android.graphics.drawable.BitmapDrawable.class, ybkVar, z);
        J(defpackage.ycv.class, new defpackage.ycy(xuwVar), z);
        P();
        return this;
    }

    final defpackage.yeh I(defpackage.ybe ybeVar, defpackage.xuw xuwVar) {
        if (this.u) {
            return j().I(ybeVar, xuwVar);
        }
        s(ybeVar);
        return G(xuwVar);
    }

    final defpackage.yeh J(java.lang.Class cls, defpackage.xuw xuwVar, boolean z) {
        if (this.u) {
            return j().J(cls, xuwVar, z);
        }
        this.r.put(cls, xuwVar);
        int i = this.a;
        this.o = true;
        this.a = 67584 | i;
        this.v = false;
        if (z) {
            this.a = i | 198656;
            this.n = true;
        }
        P();
        return this;
    }

    public final boolean K(defpackage.yeh yehVar) {
        if (java.lang.Float.compare(yehVar.c, this.c) == 0) {
            int i = yehVar.g;
            android.graphics.drawable.Drawable drawable = yehVar.f;
            char[] cArr = defpackage.ygc.a;
            if (a.L((java.lang.Object) null, (java.lang.Object) null)) {
                int i2 = yehVar.i;
                if (a.L(this.h, yehVar.h)) {
                    int i3 = yehVar.b;
                    if (a.L(this.p, yehVar.p) && this.j == yehVar.j && this.k == yehVar.k && this.l == yehVar.l && this.n == yehVar.n && this.o == yehVar.o) {
                        boolean z = yehVar.y;
                        boolean z2 = yehVar.z;
                        if (this.d.equals(yehVar.d) && this.e == yehVar.e && this.q.equals(yehVar.q) && this.r.equals(yehVar.r) && this.s.equals(yehVar.s) && a.L(this.m, yehVar.m) && a.L(this.t, yehVar.t)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean L(int i) {
        return a(this.a, i);
    }

    public final boolean M() {
        return defpackage.ygc.l(this.l, this.k);
    }

    public defpackage.yeh N() {
        if (this.u) {
            return j().N();
        }
        this.j = false;
        this.a |= 256;
        P();
        return this;
    }

    public defpackage.yeh O() {
        if (this.u) {
            return j().O();
        }
        this.w = true;
        this.a |= 1048576;
        P();
        return this;
    }

    protected final void P() {
        if (this.x) {
            throw new java.lang.IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public void Q() {
        this.x = true;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yeh) {
            return K((defpackage.yeh) obj);
        }
        return false;
    }

    public int hashCode() {
        float f = this.c;
        char[] cArr = defpackage.ygc.a;
        return defpackage.ygc.c(this.t, defpackage.ygc.c(this.m, defpackage.ygc.c(this.s, defpackage.ygc.c(this.r, defpackage.ygc.c(this.q, defpackage.ygc.c(this.e, defpackage.ygc.c(this.d, ((((((((((defpackage.ygc.c(this.p, defpackage.ygc.c(this.h, defpackage.ygc.c(null, (java.lang.Float.floatToIntBits(f) + 527) * 31) * 31) * 31) * 31) + (this.j ? 1 : 0)) * 31) + this.k) * 31) + this.l) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 961)))))));
    }

    public defpackage.yeh i(defpackage.yeh yehVar) {
        if (this.u) {
            return j().i(yehVar);
        }
        int i = yehVar.a;
        if (a(i, 2)) {
            this.c = yehVar.c;
        }
        if (a(i, 262144)) {
            boolean z = yehVar.y;
            this.y = false;
        }
        if (a(i, 1048576)) {
            this.w = yehVar.w;
        }
        if (a(i, 4)) {
            this.d = yehVar.d;
        }
        if (a(i, 8)) {
            this.e = yehVar.e;
        }
        if (a(i, 16)) {
            android.graphics.drawable.Drawable drawable = yehVar.f;
            this.f = null;
            this.g = 0;
            this.a &= -33;
        }
        if (a(yehVar.a, 32)) {
            int i2 = yehVar.g;
            this.g = 0;
            this.f = null;
            this.a &= -17;
        }
        if (a(yehVar.a, 64)) {
            this.h = yehVar.h;
            this.i = 0;
            this.a &= -129;
        }
        if (a(yehVar.a, 128)) {
            int i3 = yehVar.i;
            this.i = 0;
            this.h = null;
            this.a &= -65;
        }
        int i4 = yehVar.a;
        if (a(i4, 256)) {
            this.j = yehVar.j;
        }
        if (a(i4, 512)) {
            this.l = yehVar.l;
            this.k = yehVar.k;
        }
        if (a(i4, 1024)) {
            this.m = yehVar.m;
        }
        if (a(i4, 4096)) {
            this.s = yehVar.s;
        }
        if (a(i4, 8192)) {
            this.p = yehVar.p;
            this.b = 0;
            this.a &= -16385;
        }
        if (a(yehVar.a, 16384)) {
            int i5 = yehVar.b;
            this.b = 0;
            this.p = null;
            this.a &= -8193;
        }
        int i6 = yehVar.a;
        if (a(i6, 32768)) {
            this.t = yehVar.t;
        }
        if (a(i6, 65536)) {
            this.o = yehVar.o;
        }
        if (a(i6, 131072)) {
            this.n = yehVar.n;
        }
        if (a(i6, 2048)) {
            this.r.putAll(yehVar.r);
            this.v = yehVar.v;
        }
        if (a(yehVar.a, 524288)) {
            boolean z2 = yehVar.z;
            this.z = false;
        }
        if (!this.o) {
            this.r.clear();
            int i7 = this.a;
            this.n = false;
            this.a = i7 & (-133121);
            this.v = true;
        }
        this.a |= yehVar.a;
        this.q.c(yehVar.q);
        P();
        return this;
    }

    @Override // 
    public defpackage.yeh j() {
        try {
            defpackage.yeh yehVar = (defpackage.yeh) super.clone();
            defpackage.xus xusVar = new defpackage.xus();
            yehVar.q = xusVar;
            xusVar.c(this.q);
            aca yfqVar = new defpackage.yfq();
            yehVar.r = yfqVar;
            yfqVar.putAll(this.r);
            yehVar.x = false;
            yehVar.u = false;
            return yehVar;
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public defpackage.yeh n() {
        if (this.x && !this.u) {
            throw new java.lang.IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.u = true;
        Q();
        return this;
    }

    public final defpackage.yeh o() {
        return I(defpackage.ybe.c, new defpackage.yas());
    }

    public defpackage.yeh p(java.lang.Class cls) {
        if (this.u) {
            return j().p(cls);
        }
        this.s = cls;
        this.a |= 4096;
        P();
        return this;
    }

    public defpackage.yeh q(defpackage.xwm xwmVar) {
        if (this.u) {
            return j().q(xwmVar);
        }
        this.d = xwmVar;
        this.a |= 4;
        P();
        return this;
    }

    public defpackage.yeh r() {
        if (this.u) {
            return j().r();
        }
        this.r.clear();
        int i = this.a;
        this.n = false;
        this.o = false;
        this.a = (i & (-133121)) | 65536;
        this.v = true;
        P();
        return this;
    }

    public defpackage.yeh s(defpackage.ybe ybeVar) {
        defpackage.xur xurVar = defpackage.ybe.g;
        anty.aI(ybeVar, "Argument must not be null");
        return D(xurVar, ybeVar);
    }

    public defpackage.yeh t(android.graphics.drawable.Drawable drawable) {
        if (this.u) {
            return j().t(drawable);
        }
        this.p = drawable;
        int i = this.a | 8192;
        this.b = 0;
        this.a = i & (-16385);
        P();
        return this;
    }

    public defpackage.yeh u() {
        return x(defpackage.ybe.d, new defpackage.yaq());
    }

    public defpackage.yeh v() {
        return b(defpackage.ybe.c, new defpackage.yar());
    }

    public defpackage.yeh w() {
        return b(defpackage.ybe.b, new defpackage.ybm());
    }

    final defpackage.yeh x(defpackage.ybe ybeVar, defpackage.xuw xuwVar) {
        if (this.u) {
            return j().x(ybeVar, xuwVar);
        }
        s(ybeVar);
        return H(xuwVar, false);
    }

    public defpackage.yeh y(int i) {
        return z(i, i);
    }

    public defpackage.yeh z(int i, int i2) {
        if (this.u) {
            return j().z(i, i2);
        }
        this.l = i;
        this.k = i2;
        this.a |= 512;
        P();
        return this;
    }
}
