package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ogb extends defpackage.ogm implements ahei {
    private defpackage.ogg c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.ogg oggVarY = y();
            aooh.f(layoutInflater, "inflater");
            aooh.f(viewGroup, "container");
            oggVarY.b.g(2131428218, oggVarY.n.aa(defpackage.ogd.class, new defpackage.lme(8)), oggVarY.c.b(oggVarY.k, false));
            android.view.View viewInflate = layoutInflater.inflate(2131624213, viewGroup, false);
            aooh.e(viewInflate, "inflate(...)");
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

    @Override // defpackage.ogm
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
    public final defpackage.ogg y() {
        defpackage.ogg oggVar = this.c;
        if (oggVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return oggVar;
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

    @Override // defpackage.ogm
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.ogm
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                ogh oghVar = (ogh) agab.aC(this, ogh.class);
                ahoq ahoqVarY = ahvr.Y(402, defpackage.ogb.class, "CreatePeer");
                try {
                    this.c = oghVar.aC();
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

    @Override // defpackage.ogm
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
