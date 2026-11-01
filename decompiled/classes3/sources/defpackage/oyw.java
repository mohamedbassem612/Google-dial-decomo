package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyw extends defpackage.oyj implements ahei {
    private defpackage.oyx c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.oyx oyxVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624675, viewGroup, false);
            android.view.View viewFindViewById = viewInflate.findViewById(2131429360);
            aooh.d(viewFindViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            java.lang.Object obj = oyxVarY.a;
            android.content.Context contextA = ((aw) obj).A();
            float dimension = ((aw) obj).dX().getDimension(2131167940);
            ((android.widget.LinearLayout) viewFindViewById).setBackground(wsc.bs(urg.c(contextA, 2130969107), dimension, dimension, dimension, dimension));
            android.view.View viewFindViewById2 = viewInflate.findViewById(2131429364);
            aooh.d(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((android.widget.TextView) viewFindViewById2).setText(2132020659);
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

    @Override // defpackage.oyj
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

    @Override // defpackage.oyj
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.oyj
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                oyy oyyVar = (oyy) agab.aC(this, oyy.class);
                ahoq ahoqVarY = ahvr.Y(461, defpackage.oyw.class, "CreatePeer");
                try {
                    this.c = oyyVar.aP();
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
    public final defpackage.oyx y() {
        defpackage.oyx oyxVar = this.c;
        if (oyxVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return oyxVar;
    }

    @Override // defpackage.oyj
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
