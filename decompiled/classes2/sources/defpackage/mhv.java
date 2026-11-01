package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mhv extends defpackage.mia implements ahei {
    private defpackage.mhw c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.mhw mhwVarY = y();
            defpackage.mhw.a.b().l("com/android/dialer/defaultdialer/impl/DefaultDialerFragmentPeer", "onCreateView", 108, "DefaultDialerFragmentPeer.java").v("enter");
            android.view.View viewInflate = layoutInflater.inflate(2131624125, viewGroup, false);
            ((android.widget.Button) viewInflate.findViewById(2131428926)).setOnClickListener(new defpackage.lde(mhwVarY, 16));
            ahpr ahprVar = new ahpr(mhwVarY.f, 355, "default_dialer_insets_compat", new defpackage.izf(6));
            int i = dzs.a;
            dzk.o(viewInflate, ahprVar);
            mhwVarY.h.i((java.lang.String) null).b(mce.i);
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

    public final void ag(int i, int i2, android.content.Intent intent) {
        ahpm ahpmVarL = this.b.l();
        try {
            aV(i, i2, intent);
            defpackage.mhw mhwVarY = y();
            defpackage.mhw.a.b().l("com/android/dialer/defaultdialer/impl/DefaultDialerFragmentPeer", "onActivityResult", 131, "DefaultDialerFragmentPeer.java").v("enter");
            if (i == 8) {
                mhz mhzVar = mhwVarY.e;
                if (!mhzVar.b()) {
                    mhwVarY.g.b((java.lang.String[]) mhzVar.a().toArray(new java.lang.String[0]));
                } else if (i2 != -1) {
                    mhwVarY.d.n(rmw.ki);
                } else {
                    agby.o(mhwVarY.c.N(), 2132018219, -1).h();
                    mhwVarY.d.n(rmw.kj);
                }
            }
            ahpmVarL.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mia
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
    public final defpackage.mhw y() {
        defpackage.mhw mhwVar = this.c;
        if (mhwVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return mhwVar;
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

    @Override // defpackage.mia
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.mia
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                mhx mhxVar = (mhx) agab.aC(this, mhx.class);
                ahoq ahoqVarY = ahvr.Y(354, defpackage.mhv.class, "CreatePeer");
                try {
                    this.c = mhxVar.an();
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
            defpackage.mhw mhwVarY = y();
            defpackage.mhw.a.b().l("com/android/dialer/defaultdialer/impl/DefaultDialerFragmentPeer", "onCreate", 88, "DefaultDialerFragmentPeer.java").v("enter");
            mhwVarY.d.n(rmw.kh);
            mhwVarY.g = mhwVarY.c.O(new oz(), new defpackage.kse(mhwVarY, 3));
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

    @Override // defpackage.mia
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
