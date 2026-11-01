package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyn extends defpackage.pym implements ahei {
    private defpackage.pyu c;
    private android.content.Context d;
    private boolean e;

    public static defpackage.pyn q(defpackage.pyk pykVar) {
        defpackage.pyn pynVar = new defpackage.pyn();
        amxr.g(pynVar);
        ahgl.b(pynVar, pykVar);
        return pynVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i;
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.pyu pyuVarY = y();
            android.view.View viewInflate = layoutInflater.inflate(2131624155, viewGroup, false);
            com.android.dialer.dialpadview.DialpadView dialpadViewFindViewById = viewInflate.findViewById(2131427997);
            dialpadViewFindViewById.findViewById(2131427936).setVisibility(4);
            dialpadViewFindViewById.findViewById(2131427988).setVisibility(8);
            android.widget.EditText editText = (android.widget.EditText) dialpadViewFindViewById.findViewById(2131428000);
            editText.setClickable(false);
            editText.setLongClickable(false);
            editText.setFocusableInTouchMode(false);
            editText.setCursorVisible(false);
            if (pyuVarY.d.dX().getBoolean(2131034147)) {
                com.android.dialer.dialpadview.DialpadView dialpadViewFindViewById2 = viewInflate.findViewById(2131427997);
                ebx ebxVar = new ebx(pyuVarY, 3);
                int i2 = dzs.a;
                dzk.o(viewInflate, ebxVar);
                dzk.o(dialpadViewFindViewById2, new ebx(pyuVarY, 4));
            }
            final android.widget.EditText editText2 = (android.widget.EditText) viewInflate.findViewById(2131428000);
            pyuVarY.g = new defpackage.miq() { // from class: pyp
                @Override // defpackage.miq
                public final void a(android.view.View view, boolean z) {
                    defpackage.pyu pyuVar = pyuVarY;
                    int i3 = 1;
                    if (!z) {
                        if (pyuVar.h != null) {
                            pyuVar.c(qbc.lY);
                            j$.util.Optional optionalB = pyuVar.b();
                            if (true == optionalB.isPresent()) {
                                ((defpackage.pzm) ((defpackage.pzm) optionalB.get()).a).b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    java.util.Map map = defpackage.pyu.b;
                    if (!map.containsKey(java.lang.Integer.valueOf(view.getId())) || pyuVar.h == null) {
                        return;
                    }
                    char cCharValue = ((java.lang.Character) map.get(java.lang.Integer.valueOf(view.getId()))).charValue();
                    j$.util.Optional optionalB2 = pyuVar.b();
                    defpackage.pyo pyoVar = new defpackage.pyo(cCharValue, i3);
                    if (true == optionalB2.isPresent()) {
                        java.lang.Object obj = optionalB2.get();
                        defpackage.pzm pzmVar = (defpackage.pzm) obj;
                        ((java.lang.StringBuilder) pzmVar.b).append(pyoVar.a);
                        ((zpz) pzmVar.c).a(ajcm.a);
                    }
                    android.widget.EditText editText3 = editText2;
                    editText3.setSelection(editText3.length());
                    pyuVar.c(qbc.lW);
                    j$.util.Optional optionalB3 = pyuVar.b();
                    defpackage.pyo pyoVar2 = new defpackage.pyo(cCharValue, 0);
                    if (true == optionalB3.isPresent()) {
                        java.lang.Object obj2 = optionalB3.get();
                        ((defpackage.pzm) ((defpackage.pzm) obj2).a).a(pyoVar2.a);
                    }
                }
            };
            if (editText2 != null) {
                j$.lang.Iterable.-EL.forEach(defpackage.pyu.b.keySet(), new rh(pyuVarY, dialpadViewFindViewById, 12, (byte[]) null));
            }
            android.view.View viewFindViewById = dialpadViewFindViewById.findViewById(2131427979);
            defpackage.pyk pykVar = pyuVarY.c;
            if (pykVar.f) {
                viewFindViewById.setVisibility(4);
            } else {
                viewFindViewById.setTag(2131428318, "dialpad_back_button");
                viewFindViewById.setVisibility(0);
                defpackage.pyu.a.b().l("com/android/dialer/incall/dialpad/ui/TidePodsDialpadFragmentPeer", "onCreateView", 209, "TidePodsDialpadFragmentPeer.java").v("Dialpad back button onClick registered.");
                pyuVarY.j.g(viewFindViewById, new defpackage.pyd());
            }
            int i3 = 1;
            if ((pykVar.b & 1) != 0 && (i = pykVar.c) != -1) {
                dialpadViewFindViewById.setPadding(0, 0, 0, i);
            }
            if (pykVar.d) {
                dialpadViewFindViewById.setElevation(0.0f);
            }
            android.content.Context context = dialpadViewFindViewById.getContext();
            int iBt = pykVar.h ? wsc.bt(context) : urg.c(context, 2130969107);
            int iAN = a.aN(pykVar.e);
            if (iAN == 0) {
                iAN = 1;
            }
            int i4 = iAN - 1;
            if (i4 == 2) {
                float dimension = dialpadViewFindViewById.getContext().getResources().getDimension(2131165610);
                dialpadViewFindViewById.setBackground(wsc.bs(iBt, dimension, dimension, 0.0f, 0.0f));
            } else if (i4 == 3) {
                float dimension2 = dialpadViewFindViewById.getContext().getResources().getDimension(2131165610);
                dialpadViewFindViewById.setBackground(wsc.bs(iBt, dimension2, dimension2, dimension2, dimension2));
            }
            pyuVarY.e.g(2131429272, pyuVarY.k.aa(defpackage.pyt.class, new defpackage.qam(i3)), pyuVarY.f.a(pyuVarY.i));
            ahns.l();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.pym
    public final void ah(android.app.Activity activity) {
        this.b.j();
        try {
            super.ah(activity);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ahgi(this, layoutInflaterCloneInContext));
            ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.pym
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.pym
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                pyv pyvVar = (pyv) agab.aC(this, pyv.class);
                ahoq ahoqVarY = ahvr.Y(562, defpackage.pyn.class, "CreatePeer");
                try {
                    this.c = pyvVar.bb();
                    ahoqVarY.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            y().g = null;
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j() {
        ahpm ahpmVarD = this.b.d();
        try {
            bd();
            this.e = true;
            ahpmVarD.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarD.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final defpackage.pyu y() {
        defpackage.pyu pyuVar = this.c;
        if (pyuVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return pyuVar;
    }

    @Override // defpackage.pym
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
