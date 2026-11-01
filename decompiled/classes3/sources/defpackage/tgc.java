package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgc extends defpackage.tga implements ahei {
    private defpackage.tgf c;
    private android.content.Context d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r5v4, types: [aoin, java.lang.Object] */
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.tgf tgfVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624258, viewGroup, false);
            androidx.compose.ui.platform.ComposeView composeViewFindViewById = viewInflate.findViewById(2131427790);
            if (((java.lang.Boolean) tgfVarY.e.a()).booleanValue()) {
                composeViewFindViewById.k(dgi.a);
            }
            composeViewFindViewById.a(new cja(1631693125, true, new defpackage.rzg(tgfVarY, 19)));
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

    @Override // defpackage.tga
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

    public final void aj(boolean z) {
        defpackage.tgf tgfVarY = y();
        if (z) {
            return;
        }
        ((defpackage.thj) tgfVarY.c).e();
    }

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            ((defpackage.thj) y().c).e();
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

    @Override // defpackage.tga
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.tga
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                tgg tggVar = (tgg) agab.aC(this, tgg.class);
                ahoq ahoqVarY = ahvr.Y(882, defpackage.tgc.class, "CreatePeer");
                try {
                    this.c = tggVar.ch();
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.tgf y() {
        defpackage.tgf tgfVar = this.c;
        if (tgfVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return tgfVar;
    }

    @Override // defpackage.tga
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
