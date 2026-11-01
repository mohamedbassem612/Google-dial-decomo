package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oqo extends defpackage.oqr implements ahei {
    private android.content.Context c;
    private boolean d;
    private defpackage.heq e;

    public static defpackage.oqo c() {
        defpackage.oqo oqoVar = new defpackage.oqo();
        amxr.g(oqoVar);
        return oqoVar;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.c == null) {
            this.c = new ahgi(this, super.z());
        }
        return this.c;
    }

    @Override // defpackage.oqr
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

    @Override // defpackage.oqr
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.oqr
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.d) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.e == null) {
                oqp oqpVar = (oqp) agab.aC(this, oqp.class);
                ahoq ahoqVarY = ahvr.Y(415, defpackage.oqo.class, "CreatePeer");
                try {
                    this.e = oqpVar.dy();
                    ahoqVarY.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            agsm.d("com/android/dialer/hats/postcallintegration/HatsPostCallIntegrationFragmentPeer", "onAttach", 30, ((defpackage.heq) this.e.a).R(defpackage.oqt.DIALER_HATS_CALL_END), zct.b, "failed to trigger post call HaTS event", new java.lang.Object[0]);
            ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final void j() {
        ahpm ahpmVarD = this.b.d();
        try {
            bd();
            this.d = true;
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

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.heq heqVar = this.e;
        if (heqVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.d) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return heqVar;
    }

    @Override // defpackage.oqr
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
