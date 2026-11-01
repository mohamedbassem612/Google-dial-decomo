package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class osd extends defpackage.osc implements ahei {
    private defpackage.osg c;
    private android.content.Context d;
    private boolean e;

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.osc
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

    @Override // defpackage.osc
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.osc
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                osh oshVar = (osh) agab.aC(this, osh.class);
                ahoq ahoqVarY = ahvr.Y(426, defpackage.osd.class, "CreatePeer");
                try {
                    this.c = oshVar.aH();
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

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.osg osgVarY = y();
            ajwr ajwrVar = osgVarY.f;
            defpackage.ory oryVar = osgVarY.b;
            ageo ageoVar = osgVarY.e;
            defpackage.oii oiiVar = oryVar.d;
            agxo agxoVar = new agxo(oryVar.e, new defpackage.kvx(ahrv.g(ahvr.H(((aogc) oiiVar.c).bk(), ahqx.a(new defpackage.onp(8)), (java.util.concurrent.Executor) oiiVar.b)).h(new defpackage.oqe(oryVar, ageoVar, 2), oryVar.b), 5), "review_info_data_source");
            defpackage.agya agyaVar = defpackage.agya.FEW_SECONDS;
            agye agyeVar = osgVarY.d;
            afec.c();
            ((agtg) ajwrVar.b).execute(new defpackage.abb((java.lang.Object) ajwrVar, (java.lang.Object) agxoVar, (java.lang.Object) agyaVar, (java.lang.Object) agyeVar, 13, (byte[]) null));
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
    public final defpackage.osg y() {
        defpackage.osg osgVar = this.c;
        if (osgVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return osgVar;
    }

    @Override // defpackage.osc
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
