package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rrl extends defpackage.rrd implements ahei {
    private defpackage.rrm c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624420, viewGroup, false);
            aooh.c(viewInflate);
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

    @Override // defpackage.rrd
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

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            aooh.f(view, "view");
            final defpackage.rrm rrmVarY = y();
            aooh.f(view, "view");
            int i = 1;
            boolean z = bundle == null;
            rrmVarY.a().g(true);
            if (z) {
                rrmVarY.a().c();
            }
            defpackage.rrl rrlVar = rrmVarY.b;
            defpackage.tgc tgcVarE = rrlVar.I().e("search_fragment_tag");
            defpackage.tgc tgcVarAy = tgcVarE instanceof defpackage.tgc ? tgcVarE : null;
            if (tgcVarAy == null) {
                tgcVarAy = snl.ay();
                u uVar = new u(rrlVar.I());
                uVar.e(2131428886, tgcVarAy, "search_fragment_tag", 1);
                uVar.c();
            }
            android.widget.EditText editText = (android.widget.EditText) rrlVar.N().findViewById(2131428633);
            editText.addTextChangedListener(new jul(tgcVarAy.y(), 3));
            mni.cx(new defpackage.rrq(z, editText, rrmVarY, i));
            rrmVarY.h.aF(rrmVarY.a(), new defpackage.qsu(rrmVarY, 14));
            rrmVarY.f.h(rrmVarY.a().g, rqr.a);
            if (!z) {
                final boolean z2 = bundle.getBoolean("key_is_keyboard_shown", false);
                final android.widget.EditText editText2 = rrmVarY.a().k;
                aooh.e(editText2, "getEditText(...)");
                final aoot aootVar = new aoot();
                final int i2 = 1;
                aootVar.a = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() { // from class: rrp
                    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                    public final void onWindowFocusChanged(boolean z3) {
                        com.google.android.material.search.SearchView searchView;
                        com.google.android.material.search.SearchView searchView2;
                        if (i2 != 0) {
                            if (z3) {
                                boolean z4 = z2;
                                editText2.getViewTreeObserver().removeOnWindowFocusChangeListener((android.view.ViewTreeObserver.OnWindowFocusChangeListener) aootVar.a);
                                if (z4) {
                                    java.lang.Object obj = rrmVarY;
                                    aimz aimzVar = defpackage.rrm.a;
                                    aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewSearchBarSearchFragmentPeer", "setUpWindowFocus$<anonymous>", 91, "NewSearchBarSearchFragmentPeer.kt").v("restoring state: showing keyboard");
                                    android.view.View view2 = ((aw) ((defpackage.rrm) obj).b).Q;
                                    if (view2 == null || (searchView2 = (com.google.android.material.search.SearchView) view2.findViewById(2131428887)) == null) {
                                        aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewSearchBarSearchFragmentPeer", "setUpWindowFocus$<anonymous>", 99, "NewSearchBarSearchFragmentPeer.kt").v("View is not available when onWindowFocusChange is fired, meaning that the keyboard is not restored.");
                                        return;
                                    } else {
                                        searchView2.c();
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        if (z3) {
                            boolean z5 = z2;
                            editText2.getViewTreeObserver().removeOnWindowFocusChangeListener((android.view.ViewTreeObserver.OnWindowFocusChangeListener) aootVar.a);
                            if (z5) {
                                java.lang.Object obj2 = rrmVarY;
                                aimz aimzVar2 = defpackage.rrr.a;
                                aimzVar2.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchBarSearchFragmentPeer", "setUpWindowFocus$<anonymous>", 114, "SearchBarSearchFragmentPeer.kt").v("restoring state: showing keyboard");
                                android.view.View view3 = ((aw) ((defpackage.rrr) obj2).b).Q;
                                if (view3 == null || (searchView = (com.google.android.material.search.SearchView) view3.findViewById(2131428887)) == null) {
                                    aimzVar2.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchBarSearchFragmentPeer", "setUpWindowFocus$<anonymous>", 122, "SearchBarSearchFragmentPeer.kt").v("View is not available when onWindowFocusChange is fired, meaning that the keyboard is not restored.");
                                } else {
                                    searchView.c();
                                }
                            }
                        }
                    }
                };
                editText2.getViewTreeObserver().addOnWindowFocusChangeListener((android.view.ViewTreeObserver.OnWindowFocusChangeListener) aootVar.a);
            }
            view.findViewById(2131428630).setBackgroundColor(urg.c(view.getContext(), 2130969069));
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
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

    @Override // defpackage.rrd
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.rrd
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rrn rrnVar = (rrn) agab.aC(this, rrn.class);
                ahoq ahoqVarY = ahvr.Y(757, defpackage.rrl.class, "CreatePeer");
                try {
                    this.c = rrnVar.bO();
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

    public final void k(android.os.Bundle bundle) {
        this.b.j();
        try {
            defpackage.rrm rrmVarY = y();
            boolean zHideSoftInputFromWindow = rrmVarY.d.hideSoftInputFromWindow(rrmVarY.a().getWindowToken(), 0);
            defpackage.rrm.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewSearchBarSearchFragmentPeer", "onSaveInstanceState", 181, "NewSearchBarSearchFragmentPeer.kt").y("saving state of soft keyboard. isShowing: %s", java.lang.Boolean.valueOf(zHideSoftInputFromWindow));
            bundle.putBoolean("key_is_keyboard_shown", zHideSoftInputFromWindow);
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.rrm y() {
        defpackage.rrm rrmVar = this.c;
        if (rrmVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rrmVar;
    }

    @Override // defpackage.rrd
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
