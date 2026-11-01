package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class skv extends defpackage.sks implements ahei {
    private defpackage.sle c;
    private android.content.Context d;
    private boolean e;

    public static defpackage.skv q(defpackage.abxn abxnVar) {
        defpackage.skv skvVar = new defpackage.skv();
        amxr.g(skvVar);
        ahgl.b(skvVar, abxnVar);
        return skvVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.sle sleVarY = y();
            aooh.f(layoutInflater, "inflater");
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(sleVarY.e.A(), (android.util.AttributeSet) null, 0, 6, (aooc) null);
            if (((java.lang.Boolean) sleVarY.q.a()).booleanValue()) {
                composeView.k(dgi.a);
            }
            composeView.a(new cja(-1659677184, true, new defpackage.rzg(sleVarY, 10)));
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

    @Override // defpackage.sks
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
            y().L.i((java.lang.String) null).b(mce.hU);
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

    @Override // defpackage.sks
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.sks
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                slf slfVar = (slf) agab.aC(this, slf.class);
                ahoq ahoqVarY = ahvr.Y(825, defpackage.skv.class, "CreatePeer");
                try {
                    this.c = slfVar.bY();
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
            defpackage.sle sleVarY = y();
            if (bundle == null) {
                if (((java.lang.Boolean) sleVarY.l.a()).booleanValue()) {
                    int iOrdinal = sleVarY.t.a().f.ordinal();
                    if (iOrdinal == 1) {
                        sleVarY.i.o(rmx.yC);
                    } else if (iOrdinal == 2) {
                        sleVarY.i.o(rmx.yD);
                    } else if (iOrdinal == 5) {
                        sleVarY.i.o(rmx.yE);
                    }
                } else {
                    int iAW = a.aW(sleVarY.d.e);
                    if (iAW == 0) {
                        iAW = 1;
                    }
                    int i = iAW - 2;
                    if (i == 1) {
                        sleVarY.i.o(rmx.yC);
                    } else if (i == 2) {
                        sleVarY.i.o(rmx.yD);
                    } else if (i == 5) {
                        sleVarY.i.o(rmx.yE);
                    }
                }
            }
            defpackage.skv skvVar = sleVarY.e;
            sleVarY.z = skvVar.O(new oy(), new kse(sleVarY, 17));
            sleVarY.A = skvVar.O(new pb(), new kse(sleVarY, 18));
            sleVarY.B = skvVar.O(new pa(), new kse(sleVarY, 19));
            agtj agtjVar = sleVarY.r;
            agtjVar.h(sleVarY.E);
            agtjVar.h(sleVarY.F);
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

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final defpackage.sle y() {
        defpackage.sle sleVar = this.c;
        if (sleVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return sleVar;
    }

    @Override // defpackage.sks
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
