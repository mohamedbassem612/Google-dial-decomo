package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcc extends defpackage.lci implements ahei {
    private defpackage.lce c;
    private android.content.Context d;
    private boolean e;

    static defpackage.lcc c(defpackage.lcg lcgVar) {
        defpackage.lcc lccVar = new defpackage.lcc();
        amxr.g(lccVar);
        ahgl.b(lccVar, lcgVar);
        return lccVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.lce lceVarY = y();
            defpackage.lcg lcgVar = lceVarY.b;
            int iAQ = a.aQ(lcgVar.e);
            int i = 1;
            ahvr.bN(iAQ == 0 || iAQ == 1 || !lcgVar.f, "For the audio demo text and the help link, at most one can be set.");
            android.view.View viewInflate = layoutInflater.inflate(2131624074, viewGroup, false);
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131427680);
            android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(2131427678);
            android.widget.Button button = (android.widget.Button) viewInflate.findViewById(2131427676);
            android.widget.Button button2 = (android.widget.Button) viewInflate.findViewById(2131427679);
            textView.setText(lcgVar.c);
            textView2.setText(lcgVar.d);
            int iAQ2 = a.aQ(lcgVar.e);
            if (iAQ2 == 0 || iAQ2 == 1) {
                button.setVisibility(8);
            } else {
                button.setVisibility(0);
                button.setOnClickListener(new defpackage.jjg(lceVarY, lcgVar, 3, null));
            }
            if (lcgVar.f) {
                button2.setVisibility(0);
                button2.setOnClickListener(new defpackage.lde(lceVarY, i));
            } else {
                button2.setVisibility(8);
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

    @Override // defpackage.lci
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

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.lce y() {
        defpackage.lce lceVar = this.c;
        if (lceVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return lceVar;
    }

    @Override // defpackage.lci
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                lcf lcfVar = (lcf) agab.aC(this, lcf.class);
                ahoq ahoqVarY = ahvr.Y(255, defpackage.lcc.class, "CreatePeer");
                try {
                    this.c = lcfVar.aa();
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
            defpackage.lce lceVarY = y();
            lceVarY.d.h(lceVarY.g);
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

    @Override // defpackage.lci
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    @Override // defpackage.lci
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
