package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rjw extends defpackage.rjo implements ahei {
    private defpackage.rkc c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        defpackage.aggh agghVarA;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.rkc rkcVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624283, viewGroup, false);
            android.content.Context context = viewInflate.getContext();
            aooh.c(viewInflate);
            aooh.f(viewInflate, "<this>");
            android.view.View viewFindViewById = viewInflate.findViewById(2131428308);
            aooh.e(viewFindViewById, "findViewById(...)");
            com.google.android.setupdesign.GlifLayout glifLayout = (com.google.android.setupdesign.GlifLayout) viewFindViewById;
            defpackage.aggf aggfVar = (defpackage.aggf) glifLayout.j(defpackage.aggf.class);
            defpackage.rjw rjwVar = rkcVarY.b;
            android.content.Context contextZ = rjwVar.z();
            defpackage.aggh agghVarA2 = null;
            if (contextZ != null) {
                defpackage.aggg agggVar = new defpackage.aggg(contextZ);
                agggVar.b(2132019148);
                agggVar.b = 5;
                agggVar.c = 2132084005;
                agggVar.a = new defpackage.qht(rkcVarY, 14);
                agghVarA = agggVar.a();
            } else {
                agghVarA = null;
            }
            aggfVar.n(agghVarA);
            android.content.Context contextZ2 = rjwVar.z();
            if (contextZ2 != null) {
                defpackage.aggg agggVar2 = new defpackage.aggg(contextZ2);
                agggVar2.b(2132019147);
                agggVar2.b = 7;
                agggVar2.c = 2132084006;
                agggVar2.a = new defpackage.qht(rkcVarY, 15);
                agghVarA2 = agggVar2.a();
            }
            aggfVar.z(agghVarA2);
            android.widget.ImageView imageView = (android.widget.ImageView) glifLayout.findViewById(2131428362);
            aooh.c(context);
            aooh.f(context, "<this>");
            xtq xtqVar = defpackage.agij.a;
            imageView.setImageDrawable(context.getDrawable(true != defpackage.agfz.t(context) ? 2131230953 : 2131230954));
            defpackage.agzc agzcVar = rkcVarY.g;
            defpackage.rjl rjlVar = rkcVarY.e;
            final aju ajuVar = new aju(rkcVarY, glifLayout, viewInflate, context, 15);
            agzcVar.g(2131428427, rjlVar, new defpackage.agza() { // from class: rjx
                @Override // defpackage.agza
                public final /* synthetic */ void a(java.lang.Throwable th) {
                    throw new defpackage.agzb(th);
                }

                @Override // defpackage.agza
                public final void b(java.lang.Object obj) {
                    ajuVar.a(obj);
                }
            });
            ahns.l();
            return viewInflate;
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

    @Override // defpackage.rjo
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

    /* JADX WARN: Type inference failed for: r2v0, types: [aoxh, java.lang.Object] */
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            aooh.f(view, "view");
            defpackage.rkc rkcVarY = y();
            aooh.f(view, "view");
            aoov.an(rkcVarY.d, (aolr) null, 0, new defpackage.rjk(rkcVarY, (aoxh) rkcVarY.l.a, new defpackage.qji(rkcVarY, 13), (aoln) null, 2), 3);
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

    @Override // defpackage.rjo
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.rjo
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rkd rkdVar = (rkd) agab.aC(this, rkd.class);
                ahoq ahoqVarY = ahvr.Y(727, defpackage.rjw.class, "CreatePeer");
                try {
                    this.c = rkdVar.bH();
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
            defpackage.rkc rkcVarY = y();
            agtj agtjVar = rkcVarY.c;
            agtjVar.h(rkcVarY.i);
            agtjVar.h(rkcVarY.j);
            rkcVarY.h.o(rmx.wm);
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
    public final defpackage.rkc y() {
        defpackage.rkc rkcVar = this.c;
        if (rkcVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rkcVar;
    }

    @Override // defpackage.rjo
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
