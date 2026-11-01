package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnr extends defpackage.qnq implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.qnv c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.qnv qnvVarY = y();
            aooh.f(layoutInflater, "inflater");
            defpackage.qnv.a.b().l("com/android/dialer/incall/video/answer/ui/VideoAnswerFragmentPeer", "onCreateView", 179, "VideoAnswerFragmentPeer.kt").v("enter");
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(new android.view.ContextThemeWrapper((android.content.Context) qnvVarY.b.G(), 2132084748));
            qnvVarY.i.g(2131429384, qnvVarY.q.aa(defpackage.qnt.class, new defpackage.qam(4)), qnvVarY.j.b(qnvVarY.n, false));
            android.view.View viewInflate = layoutInflaterCloneInContext.inflate(true != qnvVarY.j() ? 2131624295 : 2131624254, viewGroup, false);
            viewInflate.setBackgroundColor(urg.c(viewInflate.getContext(), android.R.attr.colorBackground));
            defpackage.pnb pnbVar = qnvVarY.e;
            defpackage.pnc pncVar = new defpackage.pnc();
            pncVar.f(j$.util.Optional.of(viewInflate.findViewById(2131428372)));
            pncVar.k(j$.util.Optional.of(viewInflate.findViewById(2131427844)));
            pncVar.i(j$.util.Optional.of(viewInflate.findViewById(2131427832)));
            pncVar.c(j$.util.Optional.of(viewInflate.findViewById(2131427828)));
            pncVar.j(j$.util.Optional.of(viewInflate.findViewById(2131427843)));
            pncVar.l(j$.util.Optional.of(viewInflate.findViewById(2131427846)));
            pncVar.h(j$.util.Optional.of(viewInflate.findViewById(2131427839)));
            pnbVar.j(pncVar.a());
            pnbVar.k();
            layoutInflaterCloneInContext.inflate(2131624677, (android.view.ViewGroup) viewInflate.findViewById(2131427533), true);
            layoutInflater.inflate(2131624678, (android.view.ViewGroup) viewInflate.findViewById(2131428380), true);
            aooh.c(viewInflate);
            ahpr ahprVar = new ahpr(qnvVarY.d, 635, "video_answer_fragment_apply_window_insets_compat", new izf(7));
            int i = dzs.a;
            dzk.o(viewInflate, ahprVar);
            if (viewInflate == null) {
                pez.u(this, y());
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

    @Override // defpackage.qnq
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
        java.lang.Object obj;
        ahpm ahpmVarE = this.b.e();
        try {
            aX();
            defpackage.qnv qnvVarY = y();
            gpd gpdVar = qnvVarY.o;
            defpackage.qnf qnfVar = qnvVarY.k;
            if (qnfVar == null || (obj = qnfVar.a) == null) {
                j$.util.Optional optionalH = qnvVarY.m.h();
                aooh.e(optionalH, "getPrimaryCallScope(...)");
                defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
                obj = apqrVar != null ? apqrVar.b : null;
            }
            gpdVar.i((java.lang.String) obj).b(mce.as);
            defpackage.qnf qnfVar2 = qnvVarY.k;
            if (qnfVar2 != null && qnfVar2.b) {
                qnvVarY.g.b(qnvVarY.b);
            }
            urs ursVar = qnvVarY.g;
            defpackage.qnr qnrVar = qnvVarY.b;
            ursVar.i(qnrVar);
            ursVar.e(qnrVar);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void ak(boolean z) throws aois {
        defpackage.qnv qnvVarY = y();
        defpackage.oyl oylVar = qnvVarY.f;
        defpackage.qnr qnrVar = qnvVarY.b;
        android.view.View view = ((aw) qnrVar).Q;
        oylVar.b(true, view != null ? view.findViewById(2131427470) : null, null);
        android.view.View view2 = ((aw) qnrVar).Q;
        if (view2 != null) {
            qnvVarY.h(view2);
        }
        qnvVarY.i();
    }

    public final void al() {
        this.b.j();
        try {
            be();
            y().h.b();
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
            y().h.a();
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
            ahvr.x(this).a = view;
            y();
            pez.u(this, y());
            aooh.f(view, "view");
            defpackage.qnv qnvVarY = y();
            aooh.f(view, "view");
            qnvVarY.i();
            qnvVarY.f.b(true, view.findViewById(2131427470), null);
            qnvVarY.h(view);
            view.findViewById(2131427533).setBackgroundColor(-16777216);
            view.findViewById(2131428408).setVisibility(0);
            android.view.TextureView textureView = (android.view.TextureView) view.findViewById(2131428407);
            textureView.setVisibility(0);
            textureView.setSurfaceTextureListener(new defpackage.qtn(qnvVarY.h));
            ahpz ahpzVar = qnvVarY.d;
            textureView.addOnLayoutChangeListener(new defpackage.ahpo(ahpzVar, 632, "on texture view layout for answer screen changed", new defpackage.qns(qnvVarY, 1)));
            android.view.View viewFindViewById = qnvVarY.b.N().findViewById(2131428380);
            aooh.e(viewFindViewById, "findViewById(...)");
            ((android.widget.LinearLayout) viewFindViewById).setVisibility(0);
            qnvVarY.k(qnvVarY.e(), 2131231060, 2132017667);
            qnvVarY.k(qnvVarY.f(), 2131231078, 2132017668);
            qnvVarY.e().setOnClickListener(new defpackage.ahpp(ahpzVar, 633, "Clicked on answer_as_audio_chip", new defpackage.qht(qnvVarY, 4), 0));
            qnvVarY.f().setOnClickListener(new defpackage.ahpp(ahpzVar, 634, "Clicked on answer_with_local_camera_off_chip", new defpackage.qht(qnvVarY, 5), 0));
            android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) view.findViewById(2131428381);
            horizontalScrollView.addOnLayoutChangeListener(new defpackage.qns(horizontalScrollView, 0));
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

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.qnq
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                qnw qnwVar = (qnw) agab.aC(this, qnw.class);
                ahoq ahoqVarY = ahvr.Y(631, defpackage.qnr.class, "CreatePeer");
                try {
                    this.c = qnwVar.bk();
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
            defpackage.qnv qnvVarY = y();
            qnvVarY.c.h(qnvVarY.l);
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

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
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

    @Override // defpackage.qnq
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.qnv y() {
        defpackage.qnv qnvVar = this.c;
        if (qnvVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return qnvVar;
    }

    @Override // defpackage.qnq
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
