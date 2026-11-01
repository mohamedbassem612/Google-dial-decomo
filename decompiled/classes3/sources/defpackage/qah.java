package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qah extends defpackage.qaf implements ahei {
    private defpackage.qar c;
    private android.content.Context d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.qar qarVarY = y();
            defpackage.qar.a.b().l("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentPeer", "onCreateView", 268, "ScreenHostFragmentPeer.java").v("enter");
            int i = 0;
            android.view.View viewInflate = layoutInflater.inflate(2131624660, viewGroup, false);
            if (bundle != null && bundle.containsKey("current_screen_key")) {
                qarVarY.j = j$.util.Optional.of(defpackage.pzp.b(bundle.getInt("current_screen_key")));
            }
            defpackage.qai qaiVar = qarVarY.b;
            if ((qaiVar.b & 1) != 0 && bundle == null) {
                defpackage.abvz abvzVar = qaiVar.c;
                if (abvzVar == null) {
                    abvzVar = defpackage.abvz.a;
                }
                qarVarY.e.o(qaiVar.d == 0 ? rmx.le : rmx.lf);
                her herVar = qarVarY.s;
                long j = qaiVar.d;
                defpackage.pzp pzpVar = defpackage.pzp.VOICE_SCREEN;
                ?? r0 = herVar.a;
                j$.util.Optional optionalEmpty = !r0.containsKey(pzpVar) ? j$.util.Optional.empty() : ((defpackage.pzs) ((aoin) r0.get(pzpVar)).a()).c(abvzVar, j);
                hvp hvpVar = new hvp(qarVarY, viewInflate, 19);
                if (true == optionalEmpty.isPresent()) {
                    java.lang.Object obj = optionalEmpty.get();
                    java.lang.Object obj2 = hvpVar.a;
                    java.lang.Object obj3 = hvpVar.b;
                    ((defpackage.qar) obj2).j = j$.util.Optional.of(pzpVar);
                    u uVar = new u(((defpackage.qar) obj2).c.I());
                    uVar.q(2131429273, (aw) obj, (java.lang.String) null);
                    uVar.c();
                    agsm.i(566, ((defpackage.qar) obj2).q.i(((defpackage.qar) obj2).b.d, jxn.f), "Emitting ENTRY_SCREEN_COMMITTED_INTO_LAYOUT failed.", new java.lang.Object[0]);
                    ((defpackage.qar) obj2).u.aF((android.view.View) obj3, new defpackage.pmx(obj2, 10));
                }
            }
            qarVarY.f.g(2131428869, qarVarY.t.aa(defpackage.qaq.class, new defpackage.qam(i)), qarVarY.g.a(qarVarY.n));
            defpackage.qah qahVar = qarVarY.c;
            qahVar.H().fc().d(qahVar, qarVarY.m);
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

    @Override // defpackage.qaf
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

    @Override // defpackage.qaf
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.qaf
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                qas qasVar = (qas) agab.aC(this, qas.class);
                ahoq ahoqVarY = ahvr.Y(563, defpackage.qah.class, "CreatePeer");
                try {
                    this.c = qasVar.bd();
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

    public final void k(android.os.Bundle bundle) {
        this.b.j();
        try {
            defpackage.qar qarVarY = y();
            if (qarVarY.j.isPresent()) {
                bundle.putInt("current_screen_key", ((defpackage.pzp) qarVarY.j.orElseThrow()).t);
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.qar y() {
        defpackage.qar qarVar = this.c;
        if (qarVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return qarVar;
    }

    @Override // defpackage.qaf
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
