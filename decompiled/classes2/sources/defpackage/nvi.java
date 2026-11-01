package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvi extends defpackage.nvo implements ahei {
    private defpackage.nvl c;
    private android.content.Context d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r5v5, types: [aonj, java.lang.Object] */
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.nvl nvlVarY = y();
            aooh.f(layoutInflater, "inflater");
            int i = 6;
            nvlVarY.c.g(2131427537, nvlVarY.j.aa(defpackage.nvk.class, new defpackage.lme(i)), nvlVarY.e.b(nvlVarY.h, false));
            android.view.View viewInflate = layoutInflater.inflate(2131624022, viewGroup, false);
            j$.util.Optional optionalG = nvlVarY.i.g();
            defpackage.lwx lwxVar = new defpackage.lwx(new defpackage.lte(nvlVarY, viewInflate, i, null), 8);
            if (true == optionalG.isPresent()) {
                lwxVar.a.a(optionalG.get());
            }
            aooh.e(viewInflate, "apply(...)");
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

    @Override // defpackage.nvo
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

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.nvl nvlVarY = y();
            if (!nvlVarY.f) {
                nvlVarY.b(nvlVarY.b, new nto(nvlVarY, (aoln) null, 8));
                nvlVarY.f = true;
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.nvl y() {
        defpackage.nvl nvlVar = this.c;
        if (nvlVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return nvlVar;
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

    @Override // defpackage.nvo
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.nvo
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                nvm nvmVar = (nvm) agab.aC(this, nvm.class);
                ahoq ahoqVarY = ahvr.Y(382, defpackage.nvi.class, "CreatePeer");
                try {
                    this.c = nvmVar.ax();
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

    @Override // defpackage.nvo
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
