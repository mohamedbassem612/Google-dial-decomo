package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class di extends defpackage.fh {
    public boolean a;
    public boolean b;
    final /* synthetic */ defpackage.dq c;
    public rai d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(defpackage.dq dqVar, android.view.Window.Callback callback) {
        super(callback);
        this.c = dqVar;
    }

    public final void a(android.view.Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (this.a) {
            return this.e.dispatchKeyEvent(keyEvent);
        }
        return this.c.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        if (super.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        defpackage.dq dqVar = this.c;
        int keyCode = keyEvent.getKeyCode();
        cp cpVarB = dqVar.b();
        if (cpVarB != null && cpVarB.o(keyCode, keyEvent)) {
            return true;
        }
        defpackage.C0000do c0000do = dqVar.C;
        if (c0000do != null && dqVar.Q(c0000do, keyEvent.getKeyCode(), keyEvent)) {
            defpackage.C0000do c0000do2 = dqVar.C;
            if (c0000do2 == null) {
                return true;
            }
            c0000do2.l = true;
            return true;
        }
        if (dqVar.C == null) {
            defpackage.C0000do c0000doP = dqVar.P(0);
            dqVar.M(c0000doP, keyEvent);
            boolean zQ = dqVar.Q(c0000doP, keyEvent.getKeyCode(), keyEvent);
            c0000doP.k = false;
            if (zQ) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        if (i == 0) {
            if (!(menu instanceof defpackage.ft)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final android.view.View onCreatePanelView(int i) {
        android.view.View view;
        rai raiVar = this.d;
        if (raiVar != null) {
            if (i == 0) {
                view = new android.view.View(((dy) raiVar.a).c.a());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        cp cpVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (cpVarB = this.c.b()) != null) {
            cpVarB.e(true);
        }
        return true;
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        defpackage.dq dqVar = this.c;
        if (i == 108) {
            cp cpVarB = dqVar.b();
            if (cpVarB != null) {
                cpVarB.e(false);
                return;
            }
            return;
        }
        if (i == 0) {
            defpackage.C0000do c0000doP = dqVar.P(0);
            if (c0000doP.m) {
                dqVar.C(c0000doP, false);
            }
        }
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        defpackage.ft ftVar = menu instanceof defpackage.ft ? (defpackage.ft) menu : null;
        if (i == 0) {
            if (ftVar == null) {
                return false;
            }
            i = 0;
        }
        if (ftVar != null) {
            ftVar.j = true;
        }
        rai raiVar = this.d;
        if (raiVar != null && i == 0) {
            dy dyVar = (dy) raiVar.a;
            if (!dyVar.b) {
                dyVar.c.g();
                dyVar.b = true;
            }
            i = 0;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (ftVar != null) {
            ftVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List list, android.view.Menu menu, int i) {
        defpackage.ft ftVar = this.c.P(0).h;
        if (ftVar != null) {
            super.onProvideKeyboardShortcuts(list, ftVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
        defpackage.dq dqVar = this.c;
        if (!dqVar.u || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        android.content.Context context = dqVar.k;
        fa faVar = new fa(context, callback);
        ey eyVar = dqVar.q;
        if (eyVar != null) {
            eyVar.f();
        }
        dh dhVar = new dh(dqVar, faVar);
        cp cpVarB = dqVar.b();
        if (cpVarB != null) {
            dqVar.q = cpVarB.c(dhVar);
        }
        if (dqVar.q == null) {
            dqVar.E();
            ey eyVar2 = dqVar.q;
            if (eyVar2 != null) {
                eyVar2.f();
            }
            if (dqVar.r == null) {
                if (dqVar.A) {
                    android.util.TypedValue typedValue = new android.util.TypedValue();
                    android.content.res.Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(2130968588, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        android.content.res.Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        defpackage.pc pcVar = new defpackage.pc(context, 0);
                        pcVar.getTheme().setTo(themeNewTheme);
                        context = pcVar;
                    }
                    dqVar.r = new android.support.v7.widget.ActionBarContextView(context);
                    dqVar.s = new android.widget.PopupWindow(context, (android.util.AttributeSet) null, 2130968603);
                    dqVar.s.setWindowLayoutType(2);
                    dqVar.s.setContentView(dqVar.r);
                    dqVar.s.setWidth(-1);
                    context.getTheme().resolveAttribute(2130968582, typedValue, true);
                    dqVar.r.e = android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    dqVar.s.setHeight(-2);
                    dqVar.t = new defpackage.ae(dqVar, 18, null);
                } else {
                    android.support.v7.widget.ViewStubCompat viewStubCompat = (android.support.v7.widget.ViewStubCompat) dqVar.w.findViewById(2131427423);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = android.view.LayoutInflater.from(dqVar.u());
                        dqVar.r = viewStubCompat.a();
                    }
                }
            }
            if (dqVar.r != null) {
                dqVar.E();
                dqVar.r.i();
                ez ezVar = new ez(dqVar.r.getContext(), dqVar.r, dhVar);
                if (dhVar.c(ezVar, ezVar.a)) {
                    ezVar.g();
                    dqVar.r.h(ezVar);
                    dqVar.q = ezVar;
                    if (dqVar.N()) {
                        dqVar.r.setAlpha(0.0f);
                        ni niVarO = defpackage.dzs.o(dqVar.r);
                        niVarO.k(1.0f);
                        dqVar.L = niVarO;
                        dqVar.L.m(new df(dqVar));
                    } else {
                        dqVar.r.setAlpha(1.0f);
                        dqVar.r.setVisibility(0);
                        if (dqVar.r.getParent() instanceof android.view.View) {
                            android.view.View view = (android.view.View) dqVar.r.getParent();
                            int i2 = defpackage.dzs.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (dqVar.s != null) {
                        dqVar.l.getDecorView().post(dqVar.t);
                    }
                } else {
                    dqVar.q = null;
                }
            }
            dqVar.I();
        }
        dqVar.I();
        ey eyVar3 = dqVar.q;
        if (eyVar3 != null) {
            return faVar.e(eyVar3);
        }
        return null;
    }

    @Override // defpackage.fh, android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }
}
