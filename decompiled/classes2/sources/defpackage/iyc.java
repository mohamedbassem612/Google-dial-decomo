package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyc extends defpackage.iza implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.iyi c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.compose.ui.platform.ComposeView composeViewInflate;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.iyi iyiVarY = y();
            aooh.f(layoutInflater, "inflater");
            int i = 1;
            iyiVarY.d.g(2131427567, new defpackage.mmj(iyiVarY.c, 1), iyiVarY.r);
            cop copVar = iyiVarY.v;
            defpackage.iyc iycVar = iyiVarY.b;
            copVar.e(iycVar);
            if (((java.lang.Boolean) iyiVarY.j.a()).booleanValue()) {
                android.content.Context context = layoutInflater.getContext();
                aooh.e(context, "getContext(...)");
                composeViewInflate = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
                if (((java.lang.Boolean) iyiVarY.k.a()).booleanValue()) {
                    composeViewInflate.k(dgi.a);
                }
                composeViewInflate.a(new cja(1958315044, true, new brg(iyiVarY, 19)));
            } else {
                composeViewInflate = layoutInflater.inflate(2131624030, viewGroup, false);
                amcn amcnVar = new amcn();
                amcnVar.d = new defpackage.hup(new defpackage.izj(iyiVarY, i), 12);
                amcnVar.n(new defpackage.hup(new defpackage.guv(16), 13));
                amcnVar.a = ahaj.b();
                iyiVarY.m = amcnVar.m();
                android.support.v7.widget.RecyclerView recyclerViewFindViewById = composeViewInflate.findViewById(2131427559);
                iycVar.A();
                recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
                kh khVar = iyiVarY.m;
                byte[] bArr = null;
                if (khVar == null) {
                    aooh.j("adapter");
                    khVar = null;
                }
                recyclerViewFindViewById.Y(khVar);
                recyclerViewFindViewById.r = true;
                recyclerViewFindViewById.Z((km) null);
                recyclerViewFindViewById.at(new defpackage.iyv(iycVar.dX().getDimensionPixelSize(2131165342)));
                com.android.dialer.widget.DialerMaterialToolbar dialerMaterialToolbarFindViewById = composeViewInflate.findViewById(2131429294);
                android.os.Bundle bundle2 = ((aw) iycVar).m;
                int i2 = 8;
                if (bundle2 != null && !bundle2.isEmpty()) {
                    rvq rvqVarP = akmr.p(bundle2, "extra_settings_launch_config", rvq.a, akzq.a());
                    rvo rvoVar = rvqVarP.c == 2 ? (rvo) rvqVarP.d : rvo.a;
                    if ((rvoVar.b == 9 ? (rvg) rvoVar.c : rvg.a).b) {
                        dialerMaterialToolbarFindViewById.setVisibility(8);
                    }
                    da daVarG = iycVar.G();
                    aooh.d(daVarG, "null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
                    defpackage.cp cpVarI = daVarG.i();
                    if (cpVarI != null) {
                        cpVarI.j(iycVar.A().getString(2132017550));
                    }
                }
                dialerMaterialToolbarFindViewById.x(dialerMaterialToolbarFindViewById.getContext().getText(2132017550));
                dialerMaterialToolbarFindViewById.F();
                dialerMaterialToolbarFindViewById.setBackgroundColor(urg.c(iycVar.A(), 2130969107));
                android.view.View viewFindViewById = composeViewInflate.findViewById(2131429024);
                viewFindViewById.setOnClickListener(new defpackage.gr(iyiVarY, i2, bArr));
                if (iycVar.dX().getConfiguration().orientation == 2) {
                    android.view.ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    aooh.d(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    defpackage.dup dupVar = (defpackage.dup) layoutParams;
                    dupVar.c = 8388693;
                    int dimensionPixelSize = iycVar.dX().getDimensionPixelSize(2131165346);
                    dupVar.setMargins(0, 0, dimensionPixelSize, dimensionPixelSize);
                    viewFindViewById.setLayoutParams(dupVar);
                }
                aooh.c(composeViewInflate);
            }
            if (composeViewInflate == null) {
                defpackage.hhb.g(this, y());
            }
            ahns.l();
            return composeViewInflate;
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

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.iza
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
            ahvr.x(this).a = view;
            y();
            defpackage.hhb.g(this, y());
            aooh.f(view, "view");
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
    public final defpackage.iyi y() {
        defpackage.iyi iyiVar = this.c;
        if (iyiVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return iyiVar;
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

    public final ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.iza
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                iyj iyjVar = (iyj) agab.aC(this, iyj.class);
                ahoq ahoqVarY = ahvr.Y(136, defpackage.iyc.class, "CreatePeer");
                try {
                    this.c = iyjVar.g();
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

    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.iyi iyiVarY = y();
            defpackage.iyi.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/BeeslyGreetingSettingsFragmentPeer", "onCreate", 249, "BeeslyGreetingSettingsFragmentPeer.kt").v("onCreate");
            agtj agtjVar = iyiVarY.g;
            agtjVar.h(iyiVarY.s);
            agtjVar.h(iyiVarY.t);
            agtjVar.h(iyiVarY.u);
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

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            if (((aw) this).Q == null) {
                this.ak.l();
            }
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

    @Override // defpackage.iza
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.iza
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
