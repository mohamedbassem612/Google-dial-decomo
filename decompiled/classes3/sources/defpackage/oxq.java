package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oxq extends defpackage.oyg implements ahei {
    private defpackage.oyc c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.oyc oycVarY = y();
            defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onCreateView", 270, "FlingUpDownAnswerMethodFragmentPeer.java").v("onCreateView");
            oycVarY.j.g(2131428286, oycVarY.y.aa(oya.class, new lme(12)), oycVarY.k.a(oycVarY.u));
            android.view.View viewInflate = oycVarY.g.a(oycVarY.b) ? layoutInflater.inflate(2131624658, viewGroup, false) : layoutInflater.inflate(2131624657, viewGroup, false);
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

    @Override // defpackage.oyg
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

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.oyc oycVarY = y();
            defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onResume", 346, "FlingUpDownAnswerMethodFragmentPeer.java").v("onResume");
            oycVarY.n();
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
            defpackage.oyc oycVarY = y();
            defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onViewCreated", 286, "FlingUpDownAnswerMethodFragmentPeer.java").v("onViewCreated");
            oycVarY.c().setVisibility(8);
            oycVarY.c().setAlpha(0.0f);
            view.setOnTouchListener(oycVarY);
            android.view.View viewFindViewById = view.findViewById(2131428409);
            viewFindViewById.setAccessibilityDelegate(new defpackage.oxx(oycVarY));
            oycVarY.q = 0.0f;
            oycVarY.p();
            oycVarY.s = j$.util.Optional.of(defpackage.oyf.e(oycVarY.d, viewFindViewById, oycVarY.v));
            oycVarY.o(1);
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
    public final defpackage.oyc y() {
        defpackage.oyc oycVar = this.c;
        if (oycVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return oycVar;
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

    @Override // defpackage.oyg
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.oyg
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                oyd oydVar = (oyd) agab.aC(this, oyd.class);
                ahoq ahoqVarY = ahvr.Y(442, defpackage.oxq.class, "CreatePeer");
                try {
                    this.c = oydVar.aM();
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

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            defpackage.oyc oycVarY = y();
            defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onDestroyView", 362, "FlingUpDownAnswerMethodFragmentPeer.java").v("onDestroyView");
            j$.util.Optional optional = oycVarY.s;
            if (true == optional.isPresent()) {
                ((defpackage.oyf) optional.get()).a();
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
            defpackage.oyc oycVarY = y();
            defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onStart", 339, "FlingUpDownAnswerMethodFragmentPeer.java").v("onStart");
            boolean z = oycVarY.e.a;
            oycVarY.n();
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
            defpackage.oyc oycVarY = y();
            defpackage.oyc.a.b().l("com/android/dialer/incall/answer/method/ui/FlingUpDownAnswerMethodFragmentPeer", "onStop", 352, "FlingUpDownAnswerMethodFragmentPeer.java").v("onStop");
            oycVarY.f();
            boolean z = oycVarY.e.a;
            if (oycVarY.c.G().isFinishing()) {
                oycVarY.o(6);
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

    @Override // defpackage.oyg
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
