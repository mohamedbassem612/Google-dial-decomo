package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kbi extends defpackage.kcx implements defpackage.ahei, defpackage.ahtq {
    private final defpackage.ahda ak = new defpackage.ahda((byte[]) null, (byte[]) null);
    private defpackage.kbk c;
    private android.content.Context d;
    private boolean e;

    @Override // defpackage.ahfw, defpackage.aw
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        if (layoutInflater == null) {
            try {
                defpackage.aooh.i("inflater");
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
        defpackage.kbk kbkVarY = y();
        if (layoutInflater == null) {
            defpackage.aooh.i("inflater");
        }
        defpackage.cop copVar = kbkVarY.g;
        defpackage.kbi kbiVar = kbkVarY.a;
        copVar.e(kbiVar);
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(kbiVar.A(), null, 0, 6, null);
        if (((java.lang.Boolean) kbkVarY.b.a()).booleanValue()) {
            composeView.k(defpackage.dgi.a);
        }
        composeView.a(new defpackage.cja(885377949, true, new defpackage.bae(kbkVarY, 17)));
        defpackage.ahns.l();
        return composeView;
    }

    @Override // defpackage.aw, defpackage.emn
    public final defpackage.eoq T() {
        defpackage.eos eosVar = new defpackage.eos(super.T());
        eosVar.b(defpackage.env.c, new android.os.Bundle());
        return eosVar;
    }

    @Override // defpackage.aheg
    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new defpackage.ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.kcx, defpackage.aw
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
            ((defpackage.ahtj) defpackage.aooc.ar(this, defpackage.ahtj.class)).dp().a = view;
            y();
            defpackage.kbk kbkVarY = y();
            defpackage.ahvr.e(this, defpackage.kuk.class, new defpackage.kbl(kbkVarY, 1));
            defpackage.ahvr.e(this, defpackage.map.class, new defpackage.kbl(kbkVarY, 0));
            if (view == null) {
                defpackage.aooh.i("view");
            }
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
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.kbk y() {
        defpackage.kbk kbkVar = this.c;
        if (kbkVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return kbkVar;
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

    @Override // defpackage.ahtq
    public final ahtm f(defpackage.ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.kcx, defpackage.ahfw, defpackage.aw
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                defpackage.kbm kbmVar = (defpackage.kbm) defpackage.agab.aC(this, defpackage.kbm.class);
                defpackage.ahoq ahoqVarY = defpackage.ahvr.Y(190, defpackage.kbi.class, "CreatePeer");
                try {
                    this.c = kbmVar.I();
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

    @Override // defpackage.ahfw, defpackage.aw
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.kbk kbkVarY = y();
            kbkVarY.e.h(kbkVarY.f);
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
    public final void i() {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            bc();
            if (this.Q == null) {
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

    @Override // defpackage.kcx
    protected final /* synthetic */ defpackage.amxr p() {
        return new defpackage.ahgl(this);
    }

    @Override // defpackage.ahtq
    public final void q(java.lang.Class cls, defpackage.ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.kcx, defpackage.aw
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
