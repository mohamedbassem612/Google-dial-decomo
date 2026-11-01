package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rpv extends defpackage.rpt implements defpackage.ahei, defpackage.ahtq {
    private final defpackage.ahda ak = new defpackage.ahda((byte[]) null, (byte[]) null);
    private defpackage.rqi c;
    private android.content.Context d;
    private boolean e;

    @Override // defpackage.ahfw, defpackage.aw
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.Window window;
        this.b.j();
        if (layoutInflater == null) {
            try {
                defpackage.aooh.i("inflater");
            } catch (java.lang.Throwable th) {
                try {
                    defpackage.ahns.l();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        defpackage.rqi rqiVarY = y();
        if (layoutInflater == null) {
            defpackage.aooh.i("inflater");
            layoutInflater = null;
        }
        defpackage.ajwr ajwrVar = rqiVarY.E;
        defpackage.rpj rpjVar = rqiVarY.d;
        int i = 1;
        ajwrVar.n(new defpackage.agxo(rpjVar.f, new defpackage.sth(rpjVar, i), defpackage.rpl.a), rqiVarY.u);
        j$.util.Optional optionalG = rqiVarY.C.g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        if (optionalG == null) {
            defpackage.aooh.i("<this>");
        }
        int i2 = ((defpackage.gus) optionalG.orElse((java.lang.Object) null)) != null ? 2131624180 : 2131624179;
        defpackage.ruc rucVar = rqiVarY.j;
        defpackage.aenj aenjVar = defpackage.ruc.bC;
        rucVar.j(aenjVar);
        android.view.View viewInflate = layoutInflater.inflate(i2, viewGroup, false);
        defpackage.aooh.e(viewInflate, "inflate(...)");
        rucVar.m(aenjVar);
        int i3 = defpackage.dzs.a;
        java.lang.Object objB = defpackage.dzo.b(viewInflate, 2131428496);
        defpackage.aooh.e(objB, "requireViewById(...)");
        defpackage.dzk.o((android.view.View) defpackage.dzo.b(viewInflate, 2131428497), new defpackage.rpz(rqiVarY, viewInflate, i));
        defpackage.dzk.o((android.view.View) objB, new defpackage.ahpr(rqiVarY.g, 751, "main_screen_container_apply_window_insets_compat", new defpackage.rpz(rqiVarY, viewInflate, 0)));
        defpackage.aimz aimzVar = defpackage.rqi.a;
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "setUpNavigation", 526, "MainFragmentPeer.kt")).v("enter");
        defpackage.rqi.j(viewInflate).v(rqiVarY.y);
        rqiVarY.f(viewInflate);
        defpackage.rpv rpvVar = rqiVarY.b;
        if (rpvVar.I().e("search_fragment_tag") != null) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onCreateView", 351, "MainFragmentPeer.kt")).v("SearchBarFragment already exists, doing nothing");
        } else {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onCreateView", 353, "MainFragmentPeer.kt")).v("SearchBarFragment does not exist, creating a new one and committing");
            defpackage.u uVar = new defpackage.u(rpvVar.I());
            defpackage.rqo rqoVar = new defpackage.rqo();
            defpackage.amxr.g(rqoVar);
            uVar.e(2131429215, rqoVar, "search_fragment_tag", 1);
            uVar.c();
        }
        if (bundle == null && rpvVar.H().getIntent() == null) {
            rqiVarY.g(defpackage.roc.CALL_LOG_TAB_KEY, true);
        }
        if (bundle != null) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onCreateView", 370, "MainFragmentPeer.kt")).v("savedInstanceState is not null");
            rqiVarY.p = true;
        }
        defpackage.az azVarG = rpvVar.G();
        if (azVarG != null && (window = azVarG.getWindow()) != null) {
            window.setNavigationBarColor(defpackage.urg.c(rpvVar.z(), 2130969108));
        }
        if (viewInflate == null) {
            defpackage.ttj.Q(this, y());
        }
        defpackage.ahns.l();
        return viewInflate;
    }

    @Override // defpackage.aheg
    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new defpackage.ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.rpt, defpackage.aw
    public final void ah(android.app.Activity activity) {
        this.b.j();
        try {
            super.ah(activity);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void ai() {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            aX();
            defpackage.rqi rqiVarY = y();
            ((defpackage.aimw) defpackage.rqi.a.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onDestroy", 433, "MainFragmentPeer.kt")).v("enter");
            java.util.Iterator it = rqiVarY.s.iterator();
            if (it.hasNext()) {
                throw null;
            }
            rqiVarY.k.b();
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

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw null;
     */
    @Override // defpackage.ahfw, defpackage.aw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void an() {
        /*
            r6 = this;
            ajwa r0 = r6.b
            ahpm r0 = r0.e()
            r6.bf()     // Catch: java.lang.Throwable -> L56
            rqi r6 = r6.y()     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = "MainFragmentPeer.kt"
            aimz r2 = defpackage.rqi.a     // Catch: java.lang.Throwable -> L56
            ainm r2 = r2.b()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "com/android/dialer/main/impl/ui/MainFragmentPeer"
            java.lang.String r4 = "onResume"
            r5 = 390(0x186, float:5.47E-43)
            ainm r1 = r2.l(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L56
            aimw r1 = (defpackage.aimw) r1     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "enter"
            r1.v(r2)     // Catch: java.lang.Throwable -> L56
            r1 = 0
            r6.o = r1     // Catch: java.lang.Throwable -> L56
            rpj r1 = r6.d     // Catch: java.lang.Throwable -> L56
            r1.d()     // Catch: java.lang.Throwable -> L56
            java.util.List r1 = r6.s     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L56
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L4d
            rpv r1 = r6.b     // Catch: java.lang.Throwable -> L56
            az r2 = r1.H()     // Catch: java.lang.Throwable -> L56
            nf r2 = r2.fc()     // Catch: java.lang.Throwable -> L56
            rqd r6 = r6.z     // Catch: java.lang.Throwable -> L56
            r2.d(r1, r6)     // Catch: java.lang.Throwable -> L56
            r0.close()
            return
        L4d:
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L56
            rnu r6 = (rnu) r6     // Catch: java.lang.Throwable -> L56
            r6 = 0
            throw r6     // Catch: java.lang.SecurityException -> L55 java.lang.Throwable -> L56
        L55:
            throw r6     // Catch: java.lang.Throwable -> L56
        L56:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            r6.addSuppressed(r0)
        L5f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpv.an():void");
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            ((defpackage.ahtj) defpackage.aooc.ar(this, defpackage.ahtj.class)).dp().a = view;
            y();
            defpackage.ttj.Q(this, y());
            if (view == null) {
                defpackage.aooh.i("view");
            }
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aw
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new defpackage.amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new defpackage.ahgi(this, layoutInflaterCloneInContext));
            defpackage.ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ahtq
    public final ahtm f(defpackage.ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.rpt, defpackage.ahfw, defpackage.aw
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                defpackage.rqj rqjVar = (defpackage.rqj) defpackage.agab.aC(this, defpackage.rqj.class);
                defpackage.ahoq ahoqVarY = defpackage.ahvr.Y(749, defpackage.rpv.class, "CreatePeer");
                try {
                    this.c = rqjVar.bJ();
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
            defpackage.ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.rqi rqiVarY = y();
            defpackage.aimz aimzVar = defpackage.rqi.a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onCreate", 285, "MainFragmentPeer.kt")).v("enter");
            defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onCreate", 286, "MainFragmentPeer.kt");
            boolean z = bundle != null;
            aimwVar.y("savedInstanceState non-null: %b", java.lang.Boolean.valueOf(z));
            rqiVarY.m = z;
            defpackage.agtj agtjVar = rqiVarY.f;
            agtjVar.h(rqiVarY.v);
            agtjVar.h(rqiVarY.w);
            agtjVar.h(rqiVarY.x);
            defpackage.ailj it = rqiVarY.D.e().iterator();
            defpackage.aooh.e(it, "iterator(...)");
            while (it.hasNext()) {
                defpackage.rnt rntVar = (defpackage.rnt) it.next();
                defpackage.emy emyVar = ((defpackage.ahfw) rqiVarY.b).a;
                if (rntVar == null) {
                    defpackage.aooh.g();
                }
                emyVar.c(rntVar);
            }
            defpackage.rkg rkgVar = rqiVarY.c;
            defpackage.rpv rpvVar = rqiVarY.b;
            rkgVar.a(rpvVar, rpvVar.H(), new defpackage.ax(rqiVarY, 8));
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void i() {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            bc();
            if (this.Q == null) {
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

    @Override // defpackage.aw
    public final void j() {
        defpackage.ahpm ahpmVarD = this.b.d();
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

    @Override // defpackage.ahfw, defpackage.aw
    public final void m() {
        this.b.j();
        try {
            bh();
            defpackage.rqi rqiVarY = y();
            defpackage.aimz aimzVar = defpackage.rqi.a;
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onStop", 420, "MainFragmentPeer.kt")).v("enter");
            if (rqiVarY.o) {
                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/main/impl/ui/MainFragmentPeer", "onStop", 422, "MainFragmentPeer.kt")).v("will close search");
                rqiVarY.e.g(rqiVarY.d.a(), 5L, java.util.concurrent.TimeUnit.SECONDS);
            }
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rpt
    protected final /* synthetic */ defpackage.amxr p() {
        return new defpackage.ahgl(this);
    }

    @Override // defpackage.ahtq
    public final void q(java.lang.Class cls, defpackage.ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.ahei
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.rqi y() {
        defpackage.rqi rqiVar = this.c;
        if (rqiVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rqiVar;
    }

    @Override // defpackage.rpt, defpackage.aw
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
