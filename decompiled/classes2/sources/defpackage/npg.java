package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class npg extends defpackage.npt implements ahei {
    private defpackage.npr c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.Window window;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.npr nprVarY = y();
            aooh.f(layoutInflater, "inflater");
            defpackage.npg npgVar = nprVarY.b;
            az azVarG = npgVar.G();
            if (azVarG != null && (window = azVarG.getWindow()) != null) {
                window.setNavigationBarColor(urg.c(npgVar.z(), 2130969108));
            }
            android.view.View viewInflate = layoutInflater.inflate(2131624174, viewGroup, false);
            androidx.compose.ui.platform.ComposeView composeViewFindViewById = viewInflate.findViewById(2131428053);
            composeViewFindViewById.k(dgi.a);
            composeViewFindViewById.a(new cja(-1209837714, true, new defpackage.kmh(nprVarY, 19)));
            aooh.c(viewInflate);
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

    @Override // defpackage.npt
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

    public final void ai() {
        ahpm ahpmVarE = this.b.e();
        try {
            aX();
            defpackage.npe npeVar = y().e;
            if (npeVar.j != null) {
                npeVar.q.i(aoov.am(npeVar.b, 0, new defpackage.nht(npeVar, (aoln) null, 15), 3));
            }
            if (npeVar.k != null) {
                npeVar.q.i(aoov.am(npeVar.b, 0, new defpackage.mhq(npeVar, (aoln) null, 13, (byte[]) null), 3));
            }
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.cp cpVarI = y().b.H().i();
            if (cpVarI != null) {
                cpVarI.i(2132018481);
            }
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            aooh.f(view, "view");
            defpackage.npr nprVarY = y();
            aooh.f(view, "view");
            ft$.ExternalSyntheticApiModelOutline0.m(view, nprVarY.c.getString(2132018481));
            url.a(((aw) nprVarY.b).Q, 519);
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
    public final defpackage.npr y() {
        defpackage.npr nprVar = this.c;
        if (nprVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return nprVar;
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

    @Override // defpackage.npt
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.npt
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                nps npsVar = (nps) agab.aC(this, nps.class);
                ahoq ahoqVarY = ahvr.Y(378, defpackage.npg.class, "CreatePeer");
                try {
                    this.c = npsVar.at();
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
            defpackage.npr nprVarY = y();
            agtj agtjVar = nprVarY.i;
            agtjVar.h(nprVarY.p);
            agtjVar.h(nprVarY.q);
            agtjVar.h(nprVarY.r);
            agtjVar.h(nprVarY.s);
            agtjVar.h(nprVarY.t);
            agtjVar.h(nprVarY.u);
            defpackage.npe npeVar = nprVarY.e;
            npeVar.j = npeVar.m.m(nprVarY.b, new defpackage.npc(npeVar, 0));
            npeVar.k = new uxa(npeVar.n, new defpackage.npd(npeVar));
            nprVarY.z.j(aoov.an(nprVarY.d, (aolr) null, 0, new nto(nprVarY, (aoln) null, 1), 3), 1000L);
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

    @Override // defpackage.npt
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
