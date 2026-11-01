package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmc extends defpackage.lmp implements ahei {
    private defpackage.lmk c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.lmk lmkVarY = y();
            defpackage.lmk.a.b().l("com/android/dialer/callscreen/impl/ui/CallScreenFragmentPeer", "onCreateView", 177, "CallScreenFragmentPeer.java").v("onCreateView");
            int i = 0;
            android.view.View viewInflate = layoutInflater.inflate(2131624075, viewGroup, false);
            viewInflate.setBackgroundColor(urg.c(viewInflate.getContext(), android.R.attr.colorBackground));
            urs ursVar = lmkVarY.g;
            defpackage.lmc lmcVar = lmkVarY.b;
            ursVar.k(lmcVar);
            if (bundle != null && bundle.containsKey("lock_recycler_view_to_bottom")) {
                lmkVarY.l = bundle.getBoolean("lock_recycler_view_to_bottom");
            }
            if (bundle == null) {
                lmkVarY.s.aF(viewInflate.findViewById(2131427841), new defpackage.ldf(lmkVarY, 13));
            }
            pnb pnbVar = lmkVarY.d;
            pnc pncVar = new pnc();
            pncVar.f(j$.util.Optional.of(viewInflate.findViewById(2131427811)));
            pncVar.i(j$.util.Optional.of((android.widget.TextView) viewInflate.findViewById(2131427841)));
            pncVar.b(j$.util.Optional.ofNullable((android.widget.ImageView) viewInflate.findViewById(2131427823)));
            pncVar.e(j$.util.Optional.of((android.widget.Chronometer) viewInflate.findViewById(2131427831)));
            pnbVar.j(pncVar.a());
            pnbVar.k();
            final android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131427684);
            lmcVar.z();
            android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(1, false);
            linearLayoutManager.t(true);
            recyclerViewFindViewById.aa(linearLayoutManager);
            defpackage.lmb lmbVar = lmkVarY.e;
            lmbVar.k = lmkVarY.q;
            recyclerViewFindViewById.Y(lmbVar);
            java.util.List list = recyclerViewFindViewById.M;
            if (list != null) {
                list.clear();
            }
            recyclerViewFindViewById.au(new defpackage.lmi(lmkVarY, linearLayoutManager));
            recyclerViewFindViewById.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: lmd
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    defpackage.lmk lmkVar = lmkVarY;
                    if (lmkVar.m || !lmkVar.l) {
                        return;
                    }
                    defpackage.lmb lmbVar2 = lmkVar.e;
                    if (lmbVar2.a() > 0) {
                        recyclerViewFindViewById.ac(lmbVar2.a() - 1);
                    }
                }
            });
            recyclerViewFindViewById.Z((km) null);
            viewInflate.findViewById(2131428426).setOnClickListener(new defpackage.lde(lmkVarY, 7));
            viewInflate.findViewById(2131428120).setOnClickListener(new defpackage.lde(lmkVarY, 8));
            android.view.View viewFindViewById = viewInflate.findViewById(2131429000);
            viewFindViewById.setOnLongClickListener(new defpackage.lmf(lmkVarY, i));
            int i2 = 2;
            viewFindViewById.setOnTouchListener(new defpackage.klw(lmkVarY, i2));
            viewInflate.findViewById(2131427681).setBackgroundColor(urg.c(lmcVar.A(), 2130969107));
            lmcVar.H().getWindow().setNavigationBarColor(urg.c(lmcVar.A(), 2130969107));
            ft$.ExternalSyntheticApiModelOutline0.m(lmcVar.H().getWindow(), 0);
            ahpr ahprVar = new ahpr(lmkVarY.j, 309, "call_screen_fragment_apply_window_insets_compat", new defpackage.ebx(viewInflate, i2));
            int i3 = dzs.a;
            dzk.o(viewInflate, ahprVar);
            lmkVarY.c.o(rmx.bO);
            lmkVarY.h.g(2131427682, lmkVarY.r.aa(defpackage.lmj.class, new defpackage.lme(i)), lmkVarY.i.a(lmkVarY.o));
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

    @Override // defpackage.lmp
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.lmk y() {
        defpackage.lmk lmkVar = this.c;
        if (lmkVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return lmkVar;
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

    @Override // defpackage.lmp
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.lmp
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                lml lmlVar = (lml) agab.aC(this, lml.class);
                ahoq ahoqVarY = ahvr.Y(308, defpackage.lmc.class, "CreatePeer");
                try {
                    this.c = lmlVar.af();
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
            bundle.putBoolean("lock_recycler_view_to_bottom", y().l);
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

    @Override // defpackage.lmp
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
