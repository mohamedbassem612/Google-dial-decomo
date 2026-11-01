package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryw extends defpackage.rzd implements ahei {
    private defpackage.rza c;
    private android.content.Context d;
    private boolean e;

    public static defpackage.ryw c(defpackage.abxn abxnVar) {
        defpackage.ryw rywVar = new defpackage.ryw();
        amxr.g(rywVar);
        ahgl.b(rywVar, abxnVar);
        return rywVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        defpackage.aeks aeksVarA;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.rza rzaVarY = y();
            aooh.f(layoutInflater, "inflater");
            aoin aoinVar = rzaVarY.j;
            if (!((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                rzaVarY.d.b(rzaVarY.o);
            }
            rzaVarY.r.n(rzaVarY.i.f, rzaVarY.q);
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                defpackage.sjl sjlVar = rzaVarY.l;
                if (sjlVar.a().f == defpackage.sjk.f && sjlVar.a().e == defpackage.sjj.b) {
                    defpackage.aekr aekrVarA = defpackage.aeks.a();
                    aekrVarA.b(new defpackage.aekw());
                    aekrVarA.a = ahwt.a;
                    aekrVarA.c(false);
                    aeksVarA = aekrVarA.a();
                } else {
                    defpackage.aekr aekrVarA2 = defpackage.aeks.a();
                    aekrVarA2.b(new defpackage.aekw());
                    aekrVarA2.a = ahwt.a;
                    aeksVarA = aekrVarA2.a();
                }
            } else {
                aeksVarA = rzaVarY.g;
            }
            defpackage.afmm afmmVarA = defpackage.aekp.a();
            afmmVarA.c(aeksVarA);
            afmmVarA.b = new defpackage.agri(rzaVarY.s, 1);
            defpackage.aekp aekpVarB = afmmVarA.b();
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(rzaVarY.b.A(), (android.util.AttributeSet) null, 0, 6, (aooc) null);
            if (((java.lang.Boolean) rzaVarY.k.a()).booleanValue()) {
                composeView.k(dgi.a);
            }
            composeView.a(new cja(1545802936, true, new qyh(rzaVarY, aekpVarB, 11)));
            ahns.l();
            return composeView;
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

    public final eoq T() {
        eos eosVar = new eos(super.T());
        eosVar.b(env.c, new android.os.Bundle());
        return eosVar;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.rzd
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

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.rza y() {
        defpackage.rza rzaVar = this.c;
        if (rzaVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rzaVar;
    }

    @Override // defpackage.rzd
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rzb rzbVar = (rzb) agab.aC(this, rzb.class);
                ahoq ahoqVarY = ahvr.Y(772, defpackage.ryw.class, "CreatePeer");
                try {
                    this.c = rzbVar.bU();
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
            defpackage.rza rzaVarY = y();
            rzaVarY.e.h(rzaVarY.p);
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

    @Override // defpackage.rzd
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    @Override // defpackage.rzd
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
