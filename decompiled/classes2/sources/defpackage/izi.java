package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class izi extends defpackage.ize implements ahei {
    private defpackage.izm c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.izm izmVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.content.Context context = layoutInflater.getContext();
            aooh.e(context, "getContext(...)");
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
            if (((java.lang.Boolean) izmVarY.e.a()).booleanValue()) {
                composeView.k(dgi.a);
            }
            composeView.a(new cja(-713862941, true, new defpackage.izk(izmVarY, 0)));
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

    @Override // defpackage.ize
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

    @Override // defpackage.ize
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.ize
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                izn iznVar = (izn) agab.aC(this, izn.class);
                ahoq ahoqVarY = ahvr.Y(142, defpackage.izi.class, "CreatePeer");
                try {
                    this.c = iznVar.j();
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
            defpackage.izm izmVarY = y();
            defpackage.izm.a.b().l("com/android/dialer/beesly/impl/settings/greeting/ui/RecordGreetingFragmentPeer", "onCreate", 85, "RecordGreetingFragmentPeer.kt").v("enter");
            defpackage.izi iziVar = izmVarY.b;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            defpackage.izj izjVar = new defpackage.izj(izmVarY, 0);
            aopu[] aopuVarArr = aoou.a;
            dzl.o(new aooa(vol.class), izjVar, linkedHashMap);
            izmVarY.f = new eog(iziVar, dzl.n(linkedHashMap)).a(vol.class);
            vol volVar = izmVarY.f;
            vol volVar2 = null;
            if (volVar == null) {
                aooh.j("greetingRecorder");
                volVar = null;
            }
            volVar.n.g(iziVar, new vog(1));
            volVar.b.g(iziVar, new vog(0));
            if (bundle == null) {
                vol volVar3 = izmVarY.f;
                if (volVar3 == null) {
                    aooh.j("greetingRecorder");
                } else {
                    volVar2 = volVar3;
                }
                volVar2.e.setMaxDuration(60000);
            }
            izmVarY.c.h(izmVarY.g);
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.izm y() {
        defpackage.izm izmVar = this.c;
        if (izmVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return izmVar;
    }

    @Override // defpackage.ize
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
