package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class fd {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public android.content.res.ColorStateList C = null;
    public android.graphics.PorterDuff.Mode D = null;
    final /* synthetic */ defpackage.fe E;
    defpackage.dzk F;
    public final android.view.Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public java.lang.CharSequence k;
    public java.lang.CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public java.lang.String x;
    public java.lang.String y;
    public java.lang.String z;

    public fd(defpackage.fe feVar, android.view.Menu menu) {
        this.E = feVar;
        this.a = menu;
        c();
    }

    public final android.view.SubMenu a() {
        this.h = true;
        android.view.SubMenu subMenuAddSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
        d(subMenuAddSubMenu.getItem());
        return subMenuAddSubMenu;
    }

    public final java.lang.Object b(java.lang.String str, java.lang.Class[] clsArr, java.lang.Object[] objArr) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName(str, false, this.E.e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (java.lang.Exception e) {
            android.util.Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = true;
        this.g = true;
    }

    public final void d(android.view.MenuItem menuItem) {
        boolean z;
        boolean z2 = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r > 0).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.z != null) {
            defpackage.fe feVar = this.E;
            android.content.Context context = feVar.e;
            if (context.isRestricted()) {
                throw new java.lang.IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (feVar.f == null) {
                feVar.f = feVar.a(context);
            }
            menuItem.setOnMenuItemClickListener(new fc(feVar.f, this.z));
        }
        if (this.r >= 2) {
            if (menuItem instanceof defpackage.fv) {
                ((defpackage.fv) menuItem).j(true);
            } else if (menuItem instanceof ga) {
                ga gaVar = (ga) menuItem;
                try {
                    if (gaVar.e == null) {
                        gaVar.e = gaVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", java.lang.Boolean.TYPE);
                    }
                    gaVar.e.invoke(gaVar.d, java.lang.Boolean.TRUE);
                } catch (java.lang.Exception e) {
                    android.util.Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        java.lang.String str = this.x;
        if (str != null) {
            menuItem.setActionView((android.view.View) b(str, defpackage.fe.a, this.E.c));
            z = true;
        } else {
            z = false;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        defpackage.dzk dzkVar = this.F;
        if (dzkVar != null) {
            if (menuItem instanceof defpackage.dwx) {
                ((defpackage.dwx) menuItem).d(dzkVar);
            } else {
                android.util.Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        java.lang.CharSequence charSequence = this.A;
        boolean z3 = menuItem instanceof defpackage.dwx;
        if (z3) {
            ((defpackage.dwx) menuItem).a(charSequence);
        } else {
            da$.ExternalSyntheticApiModelOutline1.m$1(menuItem, charSequence);
        }
        java.lang.CharSequence charSequence2 = this.B;
        if (z3) {
            ((defpackage.dwx) menuItem).b(charSequence2);
            z2 = true;
        } else {
            da$.ExternalSyntheticApiModelOutline1.m(menuItem, charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((defpackage.dwx) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            da$.ExternalSyntheticApiModelOutline1.m$1(menuItem, c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((defpackage.dwx) menuItem).setNumericShortcut(c2, i4);
        } else {
            da$.ExternalSyntheticApiModelOutline1.m(menuItem, c2, i4);
        }
        android.graphics.PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((defpackage.dwx) menuItem).setIconTintMode(mode);
            } else {
                da$.ExternalSyntheticApiModelOutline1.m(menuItem, mode);
            }
        }
        android.content.res.ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((defpackage.dwx) menuItem).setIconTintList(colorStateList);
            } else {
                da$.ExternalSyntheticApiModelOutline1.m(menuItem, colorStateList);
            }
        }
    }
}
