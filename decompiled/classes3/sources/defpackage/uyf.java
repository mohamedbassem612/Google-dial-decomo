package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyf extends defpackage.uyd implements ahei {
    private defpackage.uyg c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.uyg uygVarY = y();
            aooh.f(layoutInflater, "inflater");
            aooh.f(viewGroup, "container");
            java.lang.Object obj = uygVarY.a;
            android.view.View viewInflate = layoutInflater.inflate(((defpackage.uyk) obj).d, viewGroup, false);
            if ((((defpackage.uyk) obj).b & 1) != 0) {
                android.view.View viewFindViewById = viewInflate.findViewById(2131429394);
                aooh.d(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((android.widget.TextView) viewFindViewById).setText(((defpackage.uyk) obj).c);
            }
            if ((((defpackage.uyk) obj).b & 32) != 0) {
                android.view.View viewFindViewById2 = viewInflate.findViewById(2131429393);
                aooh.d(viewFindViewById2, "null cannot be cast to non-null type android.widget.ImageView");
                ((android.widget.ImageView) viewFindViewById2).setImageResource(((defpackage.uyk) obj).h);
            }
            if ((((defpackage.uyk) obj).b & 4) != 0) {
                android.view.View viewFindViewById3 = viewInflate.findViewById(2131429392);
                aooh.e(viewFindViewById3, "findViewById(...)");
                android.widget.TextView textView = (android.widget.TextView) viewFindViewById3;
                int i = ((defpackage.uyk) obj).b;
                if ((i & 16) != 0) {
                    if ((i & 8) != 0) {
                        java.lang.Object obj2 = uygVarY.b;
                        textView.setText(new defpackage.akwb(((aw) obj2).z(), false).d(((aw) obj2).Y(((defpackage.uyk) obj).e), ((aw) obj2).Y(((defpackage.uyk) obj).f), ((aw) obj2).Y(((defpackage.uyk) obj).g)));
                    } else {
                        java.lang.Object obj3 = uygVarY.b;
                        textView.setText(fh$.ExternalSyntheticApiModelOutline0.m(((aw) obj3).Z(((defpackage.uyk) obj).e, new java.lang.Object[]{((aw) obj3).Y(((defpackage.uyk) obj).g)}), 0));
                    }
                    textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    aooh.c(viewInflate);
                } else {
                    textView.setText(((defpackage.uyk) obj).e);
                    aooh.c(viewInflate);
                }
            } else {
                aooh.c(viewInflate);
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

    @Override // defpackage.uyd
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

    @Override // defpackage.uyd
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.uyd
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                uyh uyhVar = (uyh) agab.aC(this, uyh.class);
                ahoq ahoqVarY = ahvr.Y(958, defpackage.uyf.class, "CreatePeer");
                try {
                    this.c = uyhVar.cx();
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
    public final defpackage.uyg y() {
        defpackage.uyg uygVar = this.c;
        if (uygVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return uygVar;
    }

    @Override // defpackage.uyd
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
