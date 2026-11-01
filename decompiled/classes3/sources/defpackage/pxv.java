package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxv extends defpackage.pxq implements ahei {
    private defpackage.pxx c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.pxx pxxVarY = y();
            defpackage.pxx.a.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "onCreateView", 80, "InCallDialogHostFragmentPeer.java").v("enter");
            ajwr ajwrVar = pxxVarY.g;
            defpackage.pxn pxnVar = pxxVarY.d;
            ajwrVar.n(new agxo(pxnVar.c, new kvx(pxnVar, 6), defpackage.pxn.a), pxxVarY.f);
            ahns.l();
            return null;
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

    @Override // defpackage.pxq
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

    @Override // defpackage.pxq
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.pxq
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                pxy pxyVar = (pxy) agab.aC(this, pxy.class);
                ahoq ahoqVarY = ahvr.Y(559, defpackage.pxv.class, "CreatePeer");
                try {
                    this.c = pxyVar.aZ();
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

    public final void l() {
        this.b.j();
        try {
            bg();
            defpackage.pxx pxxVarY = y();
            defpackage.pxx.a.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "onStart", 127, "InCallDialogHostFragmentPeer.java").v("enter");
            pxxVarY.e.b(true);
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

    public final void m() {
        this.b.j();
        try {
            bh();
            defpackage.pxx pxxVarY = y();
            aimz aimzVar = defpackage.pxx.a;
            aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "onStop", 133, "InCallDialogHostFragmentPeer.java").v("enter");
            defpackage.pxm pxmVar = pxxVarY.e;
            pxmVar.b(false);
            az azVarG = pxxVarY.c.G();
            if (azVarG == null || !azVarG.isChangingConfigurations()) {
                pxmVar.a();
            } else {
                aimzVar.b().l("com/android/dialer/incall/dialog/ui/InCallDialogHostFragmentPeer", "onStop", 137, "InCallDialogHostFragmentPeer.java").v("configuration change, don't clear dialog model");
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
    public final defpackage.pxx y() {
        defpackage.pxx pxxVar = this.c;
        if (pxxVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return pxxVar;
    }

    @Override // defpackage.pxq
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
