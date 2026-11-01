package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ee extends defpackage.cp implements defpackage.gt {
    private static final android.view.animation.Interpolator r = new android.view.animation.AccelerateInterpolator();
    private static final android.view.animation.Interpolator s = new android.view.animation.DecelerateInterpolator();
    android.content.Context a;
    android.support.v7.widget.ActionBarOverlayLayout b;
    public android.support.v7.widget.ActionBarContainer c;
    android.support.v7.widget.ActionBarContextView d;
    android.view.View e;
    defpackage.ed f;
    defpackage.ey g;
    defpackage.ex h;
    public int i;
    public boolean j;
    public boolean k;
    public defpackage.fg l;
    boolean m;
    final defpackage.dzz n;
    final defpackage.dzz o;
    defpackage.ly p;
    final rai q;
    private android.content.Context t;
    private boolean u;
    private boolean v;
    private final java.util.ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ee(android.app.Activity activity, boolean z) {
        new java.util.ArrayList();
        this.w = new java.util.ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new defpackage.eb(this);
        this.o = new defpackage.ec(this);
        this.q = new rai(this, (byte[]) null);
        android.view.View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(android.R.id.content);
    }

    private final void A() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    static boolean y(boolean z, boolean z2) {
        return z2 || !z;
    }

    private final void z(android.view.View view) {
        android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = (android.support.v7.widget.ActionBarOverlayLayout) view.findViewById(2131427923);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((defpackage.ee) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int i2 = dzs.a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
            }
        }
        android.support.v7.widget.Toolbar toolbarFindViewById = view.findViewById(2131427398);
        if (!(toolbarFindViewById instanceof android.support.v7.widget.Toolbar)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't make a decor toolbar out of ");
            sb.append(toolbarFindViewById != null ? toolbarFindViewById.getClass().getSimpleName() : "null");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        this.p = toolbarFindViewById.C();
        this.d = (android.support.v7.widget.ActionBarContextView) view.findViewById(2131427412);
        android.support.v7.widget.ActionBarContainer actionBarContainer = (android.support.v7.widget.ActionBarContainer) view.findViewById(2131427401);
        this.c = actionBarContainer;
        defpackage.ly lyVar = this.p;
        if (lyVar == null || this.d == null || actionBarContainer == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = lyVar.a();
        if ((this.p.b & 4) != 0) {
            this.u = true;
        }
        android.content.Context context = this.a;
        int i3 = context.getApplicationInfo().targetSdkVersion;
        den.bN(context);
        A();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, ef.a, 2130968584, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new java.lang.IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.m = true;
            actionBarOverlayLayout2.k(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            android.support.v7.widget.ActionBarContainer actionBarContainer2 = this.c;
            int i4 = dzs.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.cp
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.cp
    public final android.content.Context b() {
        if (this.t == null) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.a.getTheme().resolveAttribute(2130968589, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new android.view.ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.cp
    public final defpackage.ey c(defpackage.ex exVar) {
        defpackage.ed edVar = this.f;
        if (edVar != null) {
            edVar.f();
        }
        this.b.k(false);
        this.d.i();
        defpackage.ed edVar2 = new defpackage.ed(this, this.d.getContext(), exVar);
        android.view.Menu menu = edVar2.a;
        menu.u();
        try {
            boolean zC = edVar2.b.c(edVar2, menu);
            edVar2.a.t();
            if (!zC) {
                return null;
            }
            this.f = edVar2;
            edVar2.g();
            this.d.h(edVar2);
            v(true);
            return edVar2;
        } catch (java.lang.Throwable th) {
            edVar2.a.t();
            throw th;
        }
    }

    @Override // defpackage.cp
    public final java.lang.CharSequence d() {
        return this.p.b();
    }

    @Override // defpackage.cp
    public final void e(boolean z) {
        if (z != this.v) {
            this.v = z;
            java.util.ArrayList arrayList = this.w;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((defpackage.co) arrayList.get(i)).a();
            }
        }
    }

    @Override // defpackage.cp
    public final void g(boolean z) {
        if (this.u) {
            return;
        }
        w(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.cp
    public final void h(boolean z) {
        defpackage.fg fgVar;
        this.z = z;
        if (z || (fgVar = this.l) == null) {
            return;
        }
        fgVar.a();
    }

    @Override // defpackage.cp
    public final void i(int i) {
        j(this.a.getString(i));
    }

    @Override // defpackage.cp
    public final void j(java.lang.CharSequence charSequence) {
        this.p.h(charSequence);
    }

    @Override // defpackage.cp
    public final void k(java.lang.CharSequence charSequence) {
        this.p.j(charSequence);
    }

    @Override // defpackage.cp
    public final boolean m() {
        defpackage.ly lyVar = this.p;
        if (lyVar == null || !lyVar.k()) {
            return false;
        }
        lyVar.c();
        return true;
    }

    @Override // defpackage.cp
    public final boolean o(int i, android.view.KeyEvent keyEvent) {
        defpackage.ed edVar = this.f;
        if (edVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        ft ftVar = edVar.a;
        ftVar.setQwertyMode(android.view.KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return ftVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.cp
    public final void r() {
        den.bN(this.a);
        A();
    }

    @Override // defpackage.cp
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.cp
    public final void t() {
        this.p.f(null);
    }

    @Override // defpackage.cp
    public final void u() {
        w(4, 4);
    }

    public final void v(boolean z) {
        defpackage.ni niVarG;
        defpackage.ni niVarG2;
        boolean z2 = this.x;
        if (z) {
            if (!z2) {
                this.x = true;
                x(false);
            }
        } else if (z2) {
            this.x = false;
            x(false);
        }
        if (!this.c.isLaidOut()) {
            defpackage.ly lyVar = this.p;
            if (z) {
                lyVar.i(4);
                this.d.setVisibility(0);
                return;
            } else {
                lyVar.i(0);
                this.d.setVisibility(8);
                return;
            }
        }
        defpackage.ly lyVar2 = this.p;
        if (z) {
            niVarG = lyVar2.o(4, 100L);
            niVarG2 = this.d.g(0, 200L);
        } else {
            defpackage.ni niVarO = lyVar2.o(0, 200L);
            niVarG = this.d.g(8, 100L);
            niVarG2 = niVarO;
        }
        defpackage.fg fgVar = new defpackage.fg();
        java.util.ArrayList arrayList = fgVar.a;
        arrayList.add(niVarG);
        android.view.View view = (android.view.View) ((java.lang.ref.WeakReference) niVarG.a).get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        android.view.View view2 = (android.view.View) ((java.lang.ref.WeakReference) niVarG2.a).get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(niVarG2);
        fgVar.b();
    }

    public final void w(int i, int i2) {
        defpackage.ly lyVar = this.p;
        int i3 = lyVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        lyVar.e((i & i2) | (i3 & (~i2)));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    public final void x(boolean z) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        boolean zY = y(this.k, this.x);
        boolean z2 = this.y;
        if (!zY) {
            if (z2) {
                this.y = false;
                defpackage.fg fgVar = this.l;
                if (fgVar != null) {
                    fgVar.a();
                }
                if (this.i == 0) {
                    if (!this.z) {
                        if (z) {
                            z = true;
                        }
                    }
                    this.c.setAlpha(1.0f);
                    this.c.a(true);
                    defpackage.fg fgVar2 = new defpackage.fg();
                    float f = -this.c.getHeight();
                    if (z) {
                        int[] iArr = {0, 0};
                        this.c.getLocationInWindow(iArr);
                        f -= iArr[1];
                    }
                    defpackage.ni niVarO = dzs.o(this.c);
                    niVarO.n(f);
                    niVarO.Z(this.q);
                    fgVar2.f(niVarO);
                    if (this.j && (view = this.e) != null) {
                        defpackage.ni niVarO2 = dzs.o(view);
                        niVarO2.n(f);
                        fgVar2.f(niVarO2);
                    }
                    fgVar2.d(r);
                    fgVar2.c();
                    fgVar2.e(this.n);
                    this.l = fgVar2;
                    fgVar2.b();
                    return;
                }
                this.n.a();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.y = true;
        defpackage.fg fgVar3 = this.l;
        if (fgVar3 != null) {
            fgVar3.a();
        }
        this.c.setVisibility(0);
        if (this.i != 0) {
            this.c.setAlpha(1.0f);
            this.c.setTranslationY(0.0f);
            if (this.j && (view2 = this.e) != null) {
                view2.setTranslationY(0.0f);
            }
            this.o.a();
        } else {
            if (!this.z) {
                if (z) {
                    z = true;
                } else {
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationY(0.0f);
                    if (this.j) {
                        view2.setTranslationY(0.0f);
                    }
                    this.o.a();
                }
            }
            this.c.setTranslationY(0.0f);
            float f2 = -this.c.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.c.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.c.setTranslationY(f2);
            defpackage.fg fgVar4 = new defpackage.fg();
            defpackage.ni niVarO3 = dzs.o(this.c);
            niVarO3.n(0.0f);
            niVarO3.Z(this.q);
            fgVar4.f(niVarO3);
            if (this.j && (view3 = this.e) != null) {
                view3.setTranslationY(f2);
                defpackage.ni niVarO4 = dzs.o(this.e);
                niVarO4.n(0.0f);
                fgVar4.f(niVarO4);
            }
            fgVar4.d(s);
            fgVar4.c();
            fgVar4.e(this.o);
            this.l = fgVar4;
            fgVar4.b();
        }
        android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        if (actionBarOverlayLayout != null) {
            int i = dzs.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public ee(android.app.Dialog dialog) {
        new java.util.ArrayList();
        this.w = new java.util.ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new defpackage.eb(this);
        this.o = new defpackage.ec(this);
        this.q = new rai(this, (byte[]) null);
        z(dialog.getWindow().getDecorView());
    }
}
