package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ly {
    public final android.support.v7.widget.Toolbar a;
    public int b;
    java.lang.CharSequence c;
    public android.view.Window.Callback d;
    boolean e;
    public hb f;
    private android.view.View g;
    private android.graphics.drawable.Drawable h;
    private android.graphics.drawable.Drawable i;
    private android.graphics.drawable.Drawable j;
    private boolean k;
    private java.lang.CharSequence l;
    private java.lang.CharSequence m;
    private int n;
    private android.graphics.drawable.Drawable o;

    public ly(android.support.v7.widget.Toolbar toolbar, boolean z) {
        android.graphics.drawable.Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.i();
        this.l = toolbar.r;
        this.k = this.c != null;
        this.j = toolbar.e();
        ajxw ajxwVarD = ajxw.D(toolbar.getContext(), (android.util.AttributeSet) null, ef.a, 2130968584, 0);
        int i = 15;
        this.o = ajxwVarD.t(15);
        if (z) {
            java.lang.CharSequence charSequenceV = ajxwVarD.v(27);
            if (!android.text.TextUtils.isEmpty(charSequenceV)) {
                h(charSequenceV);
            }
            java.lang.CharSequence charSequenceV2 = ajxwVarD.v(25);
            if (!android.text.TextUtils.isEmpty(charSequenceV2)) {
                this.l = charSequenceV2;
                if ((this.b & 8) != 0) {
                    toolbar.w(charSequenceV2);
                }
            }
            android.graphics.drawable.Drawable drawableT = ajxwVarD.t(20);
            if (drawableT != null) {
                f(drawableT);
            }
            android.graphics.drawable.Drawable drawableT2 = ajxwVarD.t(17);
            if (drawableT2 != null) {
                this.h = drawableT2;
                s();
            }
            if (this.j == null && (drawable = this.o) != null) {
                this.j = drawable;
                r();
            }
            e(ajxwVarD.o(10, 0));
            int iR = ajxwVarD.r(9, 0);
            if (iR != 0) {
                android.view.View viewInflate = android.view.LayoutInflater.from(toolbar.getContext()).inflate(iR, (android.view.ViewGroup) toolbar, false);
                android.view.View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                e(this.b | 16);
            }
            int iQ = ajxwVarD.q(13, 0);
            if (iQ > 0) {
                android.view.ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iQ;
                toolbar.setLayoutParams(layoutParams);
            }
            int iM = ajxwVarD.m(7, -1);
            int iM2 = ajxwVarD.m(3, -1);
            if (iM >= 0 || iM2 >= 0) {
                int iMax = java.lang.Math.max(iM, 0);
                int iMax2 = java.lang.Math.max(iM2, 0);
                toolbar.m();
                toolbar.p.a(iMax, iMax2);
            }
            int iR2 = ajxwVarD.r(28, 0);
            if (iR2 != 0) {
                android.content.Context context = toolbar.getContext();
                toolbar.k = iR2;
                android.widget.TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, iR2);
                }
            }
            int iR3 = ajxwVarD.r(26, 0);
            if (iR3 != 0) {
                android.content.Context context2 = toolbar.getContext();
                toolbar.l = iR3;
                android.widget.TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iR3);
                }
            }
            int iR4 = ajxwVarD.r(22, 0);
            if (iR4 != 0) {
                toolbar.v(iR4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        ajxwVarD.x();
        if (this.n != 2132017246) {
            this.n = 2132017246;
            if (android.text.TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.m = i2 != 0 ? a().getString(i2) : null;
                q();
            }
        }
        this.m = toolbar.h();
        toolbar.u(new defpackage.lw(this));
    }

    private final void p(java.lang.CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            android.support.v7.widget.Toolbar toolbar = this.a;
            toolbar.x(charSequence);
            if (this.k) {
                dzs.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void q() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = android.text.TextUtils.isEmpty(this.m);
            android.support.v7.widget.Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.q(this.n);
            } else {
                toolbar.r(this.m);
            }
        }
    }

    private final void r() {
        int i = this.b & 4;
        android.support.v7.widget.Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.t((android.graphics.drawable.Drawable) null);
            return;
        }
        android.graphics.drawable.Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.t(drawable);
    }

    private final void s() {
        android.graphics.drawable.Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.p(drawable);
    }

    public final android.content.Context a() {
        return this.a.getContext();
    }

    public final java.lang.CharSequence b() {
        return this.a.i();
    }

    public final void c() {
        this.a.k();
    }

    public final void d() {
        this.a.l();
    }

    public final void e(int i) {
        android.view.View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    q();
                }
                r();
            }
            if ((i2 & 3) != 0) {
                s();
            }
            if ((i2 & 8) != 0) {
                int i3 = i & 8;
                android.support.v7.widget.Toolbar toolbar = this.a;
                if (i3 != 0) {
                    toolbar.x(this.c);
                    toolbar.w(this.l);
                } else {
                    toolbar.x((java.lang.CharSequence) null);
                    toolbar.w((java.lang.CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.g) == null) {
                return;
            }
            int i4 = i & 16;
            android.support.v7.widget.Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void f(android.graphics.drawable.Drawable drawable) {
        this.i = drawable;
        s();
    }

    public final void g() {
        this.e = true;
    }

    public final void h(java.lang.CharSequence charSequence) {
        this.k = true;
        p(charSequence);
    }

    public final void i(int i) {
        this.a.setVisibility(i);
    }

    public final void j(java.lang.CharSequence charSequence) {
        if (this.k) {
            return;
        }
        p(charSequence);
    }

    public final boolean k() {
        return this.a.z();
    }

    public final boolean l() {
        hb hbVar;
        android.support.v7.widget.ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (hbVar = actionMenuView.c) == null || !hbVar.l()) ? false : true;
    }

    public final boolean m() {
        return this.a.A();
    }

    public final boolean n() {
        return this.a.eu();
    }

    public final defpackage.ni o(int i, long j) {
        defpackage.ni niVarO = dzs.o(this.a);
        niVarO.k(i == 0 ? 1.0f : 0.0f);
        niVarO.l(j);
        niVarO.m(new defpackage.lx(this, i));
        return niVarO;
    }
}
