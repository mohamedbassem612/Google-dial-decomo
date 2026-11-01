package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qsr extends defpackage.qsi implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.qtd c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            android.view.View viewA = y().A(layoutInflater, viewGroup);
            if (viewA == null) {
                throw new java.lang.IllegalStateException("Fragments without views cannot use Android event listeners such as @OnClick, @OnCheckedChange, @OnLongClick, etc.");
            }
            ahns.l();
            return viewA;
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

    @Override // defpackage.qsi
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

    public final void ak(boolean z) {
        defpackage.pnb pnbVar = y().f;
        if (pnbVar.e == null || pnbVar.d == z) {
            return;
        }
        pnbVar.d = z;
        pnbVar.i();
    }

    public final void al() {
        this.b.j();
        try {
            be();
            defpackage.qtd qtdVarY = y();
            qtdVarY.h.b();
            qtdVarY.i.b();
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

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.qtd qtdVarY = y();
            j$.util.Optional optionalK = qtdVarY.k();
            if (optionalK.isPresent()) {
                ((defpackage.qrv) optionalK.orElseThrow()).h();
                ((defpackage.qrv) optionalK.orElseThrow()).i();
            }
            qtdVarY.h.a();
            qtdVarY.i.a();
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
            ajwr ajwrVarX = ahvr.x(this);
            ajwrVarX.a = view;
            defpackage.qtd qtdVarY = y();
            ((android.view.View) ajwrVarX.a).findViewById(2131429408).setTag(2131429276, "videocall_end_call");
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131429408), new defpackage.qht(qtdVarY, 9));
            ((android.view.View) ajwrVarX.a).findViewById(2131429409).setTag(2131429276, "videocall_enter_full_screen");
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131429409), new defpackage.qht(qtdVarY, 10));
            ((android.view.View) ajwrVarX.a).findViewById(2131429428).setTag(2131429276, "videocall_video_remote");
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131429428), new defpackage.qht(qtdVarY, 11));
            ((android.view.View) ajwrVarX.a).findViewById(2131429407).setTag(2131429276, "videocall_controls_content");
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131429407), new defpackage.qht(qtdVarY, 8));
            defpackage.qtd qtdVarY2 = y();
            ahvr.e(this, defpackage.pdb.class, new defpackage.pmi(qtdVarY2, 15));
            ahvr.e(this, defpackage.qrz.class, new defpackage.pmi(qtdVarY2, 16));
            ahvr.e(this, defpackage.qsk.class, new defpackage.pmi(qtdVarY2, 17));
            ahvr.e(this, defpackage.qsn.class, new defpackage.pmi(qtdVarY2, 18));
            ahvr.e(this, defpackage.qsq.class, new defpackage.pmi(qtdVarY2, 19));
            ahvr.e(this, defpackage.qtc.class, new defpackage.qte(qtdVarY2));
            aooh.f(view, "view");
            defpackage.qtd qtdVarY3 = y();
            ahpz ahpzVar = qtdVarY3.e;
            int i = 2;
            ahpr ahprVar = new ahpr(ahpzVar, 656, "on window inset applied in video screen", new defpackage.pbk(qtdVarY3, view, i));
            int i2 = dzs.a;
            dzk.o(view, ahprVar);
            qtdVarY3.d().addOnLayoutChangeListener(new defpackage.ahpo(ahpzVar, 657, "on background texture view layout changed", new defpackage.qns(qtdVarY3, i)));
            qtdVarY3.e().addOnLayoutChangeListener(new defpackage.ahpo(ahpzVar, 658, "on preview texture view layout changed", new defpackage.qns(qtdVarY3, 3)));
            android.widget.TextView textViewI = qtdVarY3.i();
            textViewI.setVisibility(8);
            textViewI.setAccessibilityLiveRegion(1);
            defpackage.qsr qsrVar = qtdVarY3.d;
            defpackage.qsy qsyVar = new defpackage.qsy(qtdVarY3, qsrVar.dX().getDimensionPixelSize(2131167958));
            android.view.TextureView textureViewE = qtdVarY3.e();
            textureViewE.setOutlineProvider(qsyVar);
            textureViewE.setClipToOutline(true);
            android.widget.ImageView imageViewH = qtdVarY3.h();
            imageViewH.setOutlineProvider(qsyVar);
            imageViewH.setClipToOutline(true);
            qtdVarY3.e().setSurfaceTextureListener(new defpackage.qtn(qtdVarY3.h));
            qtdVarY3.d().setSurfaceTextureListener(new defpackage.qtn(qtdVarY3.i));
            ((android.widget.ImageButton) qsrVar.N().findViewById(2131429409)).setVisibility(0);
            if (qsrVar.I().e("tag_on_hold_fragment") == null) {
                u uVar = new u(qsrVar.I());
                uVar.e(2131429404, defpackage.qcd.q(), "tag_on_hold_fragment", 1);
                uVar.c();
            }
            qtdVarY3.h().setVisibility(8);
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

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.qsi
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                qtf qtfVar = (qtf) agab.aC(this, qtf.class);
                ahoq ahoqVarY = ahvr.Y(651, defpackage.qsr.class, "CreatePeer");
                try {
                    this.c = qtfVar.bq();
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
            defpackage.qtd qtdVarY = y();
            ahoq ahoqVarW = ahvr.W(654, "VideoScreenFragmentPeer_onCreate");
            try {
                qtdVarY.q = qtdVarY.d.O(new pa(), new kse(qtdVarY, 6));
                ahoqVarW.close();
                ahns.l();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            y().s();
            if (((aw) this).Q == null) {
                this.ak.l();
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
            y().o.enable();
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
            y().o.disable();
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

    @Override // defpackage.qsi
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.qtd y() {
        defpackage.qtd qtdVar = this.c;
        if (qtdVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return qtdVar;
    }

    @Override // defpackage.qsi
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
