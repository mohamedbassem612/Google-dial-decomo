package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rro extends defpackage.rre implements defpackage.ahei {
    private rrr c;
    private android.content.Context d;
    private boolean e;

    @Override // defpackage.ahfw, defpackage.aw
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            rrr rrrVarY = y();
            defpackage.aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624420, viewGroup, false);
            int i = defpackage.dzs.a;
            int i2 = 759;
            android.view.View view = (android.view.View) defpackage.dzo.b(viewInflate, 2131428886);
            defpackage.dzk.o(view, new defpackage.ahpr(rrrVarY.e, i2, "search_bar_search_search_fragment_apply_window_insets_compat", new izf(8)));
            defpackage.aooh.c(viewInflate);
            defpackage.ahns.l();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aheg
    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new defpackage.ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.rre, defpackage.aw
    public final void ah(android.app.Activity activity) {
        this.b.j();
        try {
            super.ah(activity);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            defpackage.aooh.f(view, "view");
            rrr rrrVarY = y();
            defpackage.aooh.f(view, "view");
            defpackage.ahbv ahbvVar = rrrVarY.i;
            defpackage.rro rroVar = rrrVarY.b;
            ahbvVar.B(rroVar);
            boolean z = bundle == null;
            rrrVarY.a().g(true);
            if (z) {
                rrrVarY.a().c();
            }
            tkd tkdVarE = rroVar.I().e("search_fragment_tag");
            tkd tkdVar = tkdVarE instanceof tkd ? tkdVarE : null;
            if (tkdVar == null) {
                tkdVar = new tkd();
                defpackage.u uVar = new defpackage.u(rroVar.I());
                uVar.e(2131428886, tkdVar, "search_fragment_tag", 1);
                uVar.c();
            }
            android.widget.EditText editText = (android.widget.EditText) rroVar.N().findViewById(2131428633);
            editText.addTextChangedListener(new jul(tkdVar, 4));
            defpackage.mni.cx(new rrq(z, editText, rrrVarY, 0));
            rrrVarY.j.aF(rrrVarY.a(), new qsu(rrrVarY, 15));
            rrrVarY.g.h(rrrVarY.a().g, defpackage.rqr.a);
            if (!z) {
                boolean z2 = bundle.getBoolean("key_is_keyboard_shown", false);
                android.widget.EditText editText2 = rrrVarY.a().k;
                defpackage.aooh.e(editText2, "getEditText(...)");
                defpackage.aoot aootVar = new defpackage.aoot();
                aootVar.a = new rrp(editText2, aootVar, z2, rrrVarY, 0);
                editText2.getViewTreeObserver().addOnWindowFocusChangeListener((android.view.ViewTreeObserver.OnWindowFocusChangeListener) aootVar.a);
            }
            view.findViewById(2131428630).setBackgroundColor(defpackage.urg.c(view.getContext(), 2130969069));
            defpackage.ahbv.D(rroVar);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.aw
    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        defpackage.ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    @Override // defpackage.aw
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new defpackage.amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new defpackage.ahgi(this, layoutInflaterCloneInContext));
            defpackage.ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rre
    protected final /* synthetic */ defpackage.amxr f() {
        return new defpackage.ahgl(this);
    }

    @Override // defpackage.rre, defpackage.ahfw, defpackage.aw
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                defpackage.rrs rrsVar = (defpackage.rrs) defpackage.agab.aC(this, defpackage.rrs.class);
                defpackage.ahoq ahoqVarY = defpackage.ahvr.Y(758, defpackage.rro.class, "CreatePeer");
                try {
                    this.c = rrsVar.bP();
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
            defpackage.ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.aw
    public final void j() {
        defpackage.ahpm ahpmVarD = this.b.d();
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

    @Override // defpackage.ahfw, defpackage.aw
    public final void k(android.os.Bundle bundle) {
        this.b.j();
        try {
            rrr rrrVarY = y();
            boolean zHideSoftInputFromWindow = rrrVarY.d.hideSoftInputFromWindow(rrrVarY.a().getWindowToken(), 0);
            ((defpackage.aimw) rrr.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchBarSearchFragmentPeer", "onSaveInstanceState", 202, "SearchBarSearchFragmentPeer.kt")).y("saving state of soft keyboard. isShowing: %s", java.lang.Boolean.valueOf(zHideSoftInputFromWindow));
            bundle.putBoolean("key_is_keyboard_shown", zHideSoftInputFromWindow);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ahei
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final rrr y() {
        rrr rrrVar = this.c;
        if (rrrVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rrrVar;
    }

    @Override // defpackage.rre, defpackage.aw
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
