package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sxs extends defpackage.sxm implements ahei {
    private defpackage.sxv c;
    private android.content.Context d;
    private boolean e;

    static defpackage.sxs q(defpackage.sxo sxoVar) {
        defpackage.sxs sxsVar = new defpackage.sxs();
        amxr.g(sxsVar);
        ahgl.b(sxsVar, sxoVar);
        return sxsVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.sxv sxvVarY = y();
            android.view.View viewInflate = layoutInflater.inflate(2131624404, viewGroup, false);
            android.support.v7.widget.AppCompatTextView appCompatTextViewFindViewById = viewInflate.findViewById(2131428795);
            defpackage.sxo sxoVar = sxvVarY.c;
            appCompatTextViewFindViewById.setText(sxoVar.c);
            android.support.v7.widget.AppCompatTextView appCompatTextViewFindViewById2 = viewInflate.findViewById(2131428794);
            if (sxoVar.e) {
                defpackage.sxs sxsVar = sxvVarY.d;
                java.lang.String string = sxsVar.z().getString(sxoVar.d);
                defpackage.taq taqVar = sxvVarY.j;
                az azVarG = sxsVar.G();
                ahvr.ci(azVarG);
                appCompatTextViewFindViewById2.setText(taqVar.b(azVarG, string));
                appCompatTextViewFindViewById2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            } else {
                appCompatTextViewFindViewById2.setText(sxoVar.d);
            }
            if ((sxoVar.b & 8) != 0) {
                sxvVarY.k.n(new agxo(sxvVarY.l, new kvx(sxvVarY, 7), defpackage.sxv.b), sxvVarY.i);
            } else {
                viewInflate.findViewById(2131428792).setVisibility(8);
            }
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

    @Override // defpackage.sxm
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

    @Override // defpackage.sxm
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.sxm
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                sxw sxwVar = (sxw) agab.aC(this, sxw.class);
                ahoq ahoqVarY = ahvr.Y(848, defpackage.sxs.class, "CreatePeer");
                try {
                    this.c = sxwVar.ca();
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
            defpackage.sxv sxvVarY = y();
            sxvVarY.f.h(sxvVarY.h);
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
    public final defpackage.sxv y() {
        defpackage.sxv sxvVar = this.c;
        if (sxvVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return sxvVar;
    }

    @Override // defpackage.sxm
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
