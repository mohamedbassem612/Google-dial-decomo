package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rpm extends defpackage.rpr implements ahei {
    private defpackage.rpn c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        rnv rnvVar;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.rpn rpnVarY = y();
            aooh.f(layoutInflater, "inflater");
            rpnVarY.d.g(2131427907, new defpackage.rph(rpnVarY.c, 0), rpnVarY.e.b(rpnVarY.f, false));
            android.view.View viewInflate = layoutInflater.inflate(2131624121, viewGroup, false);
            if (bundle == null) {
                aoin aoinVar = (aoin) rpnVarY.i.k().get(roc.b);
                aw awVarA = (aoinVar == null || (rnvVar = (rnv) aoinVar.a()) == null) ? null : rnvVar.a();
                if (awVarA == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                u uVar = new u(rpnVarY.b.I());
                uVar.q(2131427908, awVarA, (java.lang.String) null);
                uVar.c();
            }
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

    @Override // defpackage.rpr
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
            y().c.d();
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
    public final defpackage.rpn y() {
        defpackage.rpn rpnVar = this.c;
        if (rpnVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rpnVar;
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

    @Override // defpackage.rpr
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.rpr
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rpo rpoVar = (rpo) agab.aC(this, rpo.class);
                ahoq ahoqVarY = ahvr.Y(747, defpackage.rpm.class, "CreatePeer");
                try {
                    this.c = rpoVar.bI();
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
            defpackage.rpn rpnVarY = y();
            ailj ailjVarK = rpnVarY.g.e().k();
            aooh.e(ailjVarK, "iterator(...)");
            while (ailjVarK.hasNext()) {
                rnt rntVar = (rnt) ailjVarK.next();
                emy emyVar = ((ahfw) rpnVarY.b).a;
                aooh.c(rntVar);
                emyVar.c(rntVar);
            }
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

    @Override // defpackage.rpr
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
