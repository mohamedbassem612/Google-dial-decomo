package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class osu extends defpackage.otb implements ahei {
    private defpackage.osx c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.osx osxVarY = y();
            osxVarY.f.g(2131427389, osxVarY.k.aa(osw.class, new lme(10)), osxVarY.g.a(osxVarY.h));
            android.view.View view = new android.view.View(osxVarY.b.A());
            ahns.l();
            return view;
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

    @Override // defpackage.otb
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.osx y() {
        defpackage.osx osxVar = this.c;
        if (osxVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return osxVar;
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

    @Override // defpackage.otb
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.otb
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                osy osyVar = (osy) agab.aC(this, osy.class);
                ahoq ahoqVarY = ahvr.Y(430, defpackage.osu.class, "CreatePeer");
                try {
                    this.c = osyVar.aI();
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
            defpackage.osx osxVarY = y();
            zpm zpmVar = osxVarY.i;
            java.lang.String str = osxVarY.e;
            j$.util.Optional optionalE = zpmVar.e(str);
            if (optionalE.isPresent()) {
                defpackage.osv osvVar = (defpackage.osv) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.osv.class);
                defpackage.qbe qbeVarCp = osvVar.cp();
                j$.util.Optional optional = osvVar.X().b;
                if (optional.isPresent() && ((defpackage.suc) optional.orElseThrow()).b.isPresent()) {
                    defpackage.oso osoVarW = osvVar.W();
                    ve veVar = osxVarY.j;
                    veVar.d(osoVarW);
                    defpackage.osx.a.b().l("com/android/dialer/incall/accountselectordialog/ui/AccountSelectorDialogContainerFragmentPeer", "onCreate", 150, "AccountSelectorDialogContainerFragmentPeer.java").v("show AccountSelectorDialogFragment");
                    osxVarY.d.o(rmx.jz);
                    ((java.util.concurrent.atomic.AtomicBoolean) osvVar.V().a).set(true);
                    akzx akzxVar = (akzx) ((defpackage.suc) optional.orElseThrow()).b.orElseThrow();
                    akzxVar.u();
                    lvm lvmVar = akzxVar.b;
                    lvm lvmVar2 = lvm.a;
                    j$.util.Objects.requireNonNull(str);
                    lvmVar.b |= 8;
                    lvmVar.f = str;
                    lvk.aX(akzxVar.p(), veVar).r(osxVarY.b.I(), "account_selector_dialog_tag");
                } else {
                    a.bI(defpackage.osx.a.c().m(aioa.b), "empty or invalid Result found when starting the dialog activity", "com/android/dialer/incall/accountselectordialog/ui/AccountSelectorDialogContainerFragmentPeer", "onCreate", (char) 137, "AccountSelectorDialogContainerFragmentPeer.java", zct.b);
                    osxVarY.c.b(ruc.aN);
                    qbeVarCp.a(qbc.gt);
                    osxVarY.b.H().finish();
                }
            } else {
                defpackage.osx.a.b().l("com/android/dialer/incall/accountselectordialog/ui/AccountSelectorDialogContainerFragmentPeer", "onCreate", 118, "AccountSelectorDialogContainerFragmentPeer.java").v("call scope is no longer present, finishing activity");
                osxVarY.c.b(ruc.aN);
                osxVarY.b.H().finish();
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

    @Override // defpackage.otb
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
