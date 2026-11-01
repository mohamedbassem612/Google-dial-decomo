package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oym extends defpackage.oyh implements ahei {
    private defpackage.oyp c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.oyp oypVarY = y();
            aooh.f(layoutInflater, "inflater");
            oypVarY.e.g(2131429329, oypVarY.k.aa(oyn.class, new lme(13)), oypVarY.f.b(oypVarY.i, false));
            android.view.View viewInflate = layoutInflater.inflate(2131624670, viewGroup, false);
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

    @Override // defpackage.oyh
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

    /* JADX WARN: Code duplicated, block: B:7:0x0094  */
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        boolean z;
        this.b.j();
        try {
            aooh.f(view, "view");
            defpackage.oyp oypVarY = y();
            com.google.android.material.button.MaterialButton materialButtonH = oypVarY.h();
            ahpz ahpzVar = oypVarY.d;
            materialButtonH.setOnClickListener(new defpackage.ahpp(ahpzVar, 448, "two button layout clicked answer", (android.view.View.OnClickListener) new nti(oypVarY, 9), 0));
            oypVarY.e().setOnClickListener(new defpackage.ahpp(ahpzVar, 449, "three button layout clicked answer", (android.view.View.OnClickListener) new nti(oypVarY, 10), 0));
            oypVarY.f().setOnClickListener(new defpackage.ahpp(ahpzVar, 450, "clicked answer as RTT", (android.view.View.OnClickListener) new nti(oypVarY, 11), 0));
            oypVarY.i().setOnClickListener(new defpackage.ahpp(ahpzVar, 451, "two button layout clicked decline", (android.view.View.OnClickListener) new nti(oypVarY, 12), 0));
            oypVarY.g().setOnClickListener(new defpackage.ahpp(ahpzVar, 452, "three button layout clicked decline", (android.view.View.OnClickListener) new nti(oypVarY, 13), 0));
            defpackage.own ownVar = oypVarY.h;
            if (ownVar != null) {
                z = defpackage.oyp.n(ownVar);
            }
            oypVarY.m(z);
            if (((android.view.accessibility.AccessibilityManager) oypVarY.b.A().getSystemService(android.view.accessibility.AccessibilityManager.class)).isTouchExplorationEnabled()) {
                oypVarY.g = defpackage.oyf.e(oypVarY.c, view, new defpackage.oyo(oypVarY, 0));
                defpackage.oyf oyfVar = oypVarY.g;
                if (oyfVar != null) {
                    oyfVar.d();
                }
            }
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

    @Override // defpackage.oyh
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.oyh
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                oyq oyqVar = (oyq) agab.aC(this, oyq.class);
                ahoq ahoqVarY = ahvr.Y(445, defpackage.oym.class, "CreatePeer");
                try {
                    this.c = oyqVar.aN();
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

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            defpackage.oyf oyfVar = y().g;
            if (oyfVar != null) {
                oyfVar.a();
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.oyp y() {
        defpackage.oyp oypVar = this.c;
        if (oypVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return oypVar;
    }

    @Override // defpackage.oyh
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
