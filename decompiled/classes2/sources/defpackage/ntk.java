package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ntk extends defpackage.nub implements ahei {
    private defpackage.nts c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.Window window;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.nts ntsVarY = y();
            aooh.f(layoutInflater, "inflater");
            defpackage.ntk ntkVar = ntsVarY.b;
            az azVarG = ntkVar.G();
            if (azVarG != null && (window = azVarG.getWindow()) != null) {
                window.setNavigationBarColor(urg.c(ntkVar.z(), 2130969108));
            }
            if (((java.lang.Boolean) ntsVarY.f.a()).booleanValue()) {
                ntsVarY.e.l(ntkVar);
            }
            android.view.View viewInflate = layoutInflater.inflate(2131624169, viewGroup, false);
            androidx.compose.ui.platform.ComposeView composeViewFindViewById = viewInflate.findViewById(2131428047);
            composeViewFindViewById.k(dgi.a);
            composeViewFindViewById.a(new cja(-2030318127, true, new defpackage.ntw(ntsVarY, 1)));
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

    @Override // defpackage.nub
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

    public final void ai() {
        ahpm ahpmVarE = this.b.e();
        try {
            aX();
            y().d(mce.bX);
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.nts y() {
        defpackage.nts ntsVar = this.c;
        if (ntsVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return ntsVar;
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

    @Override // defpackage.nub
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.nub
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                ntt nttVar = (ntt) agab.aC(this, ntt.class);
                ahoq ahoqVarY = ahvr.Y(380, defpackage.ntk.class, "CreatePeer");
                try {
                    this.c = nttVar.av();
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
            defpackage.nts ntsVarY = y();
            agtj agtjVar = ntsVarY.c;
            agtjVar.h(ntsVarY.h);
            agtjVar.h(ntsVarY.g);
            agtjVar.h(ntsVarY.i);
            agtjVar.h(ntsVarY.j);
            agtjVar.h(ntsVarY.k);
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

    @Override // defpackage.nub
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
