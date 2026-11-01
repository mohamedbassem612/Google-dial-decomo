package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wsx extends defpackage.wru implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.wtk c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        int i;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.wtk wtkVarY = y();
            int i2 = 3;
            int i3 = 2;
            if (bundle != null) {
                if (bundle.containsKey("last_model")) {
                    try {
                        wtkVarY.A = j$.util.Optional.of(defpackage.akmr.m(bundle, "last_model", defpackage.wsy.a, akzq.a()));
                    } catch (alaz e) {
                        a.bq(defpackage.wtk.a.c(), "invalid XatuInCallFragmentInstanceState proto", "com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer", "restoreSavedInstance", (char) 511, "XatuInCallFragmentPeer.java", e, zct.b);
                        wtkVarY.A = j$.util.Optional.of(defpackage.wsy.a);
                    }
                }
                if (bundle.containsKey("autoscroll_method")) {
                    java.lang.String string = bundle.getString("autoscroll_method");
                    int iHashCode = string.hashCode();
                    if (iHashCode == -1784938017) {
                        if (string.equals("SHOW_AHEAD")) {
                            i = 3;
                            wtkVarY.I = i;
                        }
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (iHashCode == 2337004) {
                        if (string.equals("LIVE")) {
                            i = 2;
                            wtkVarY.I = i;
                        }
                        throw new java.lang.IllegalArgumentException();
                    }
                    if (iHashCode == 2402104 && string.equals("NONE")) {
                        i = 1;
                        wtkVarY.I = i;
                    }
                    throw new java.lang.IllegalArgumentException();
                }
            }
            android.view.View viewInflate = layoutInflater.inflate(2131624720, viewGroup, false);
            defpackage.wsx wsxVar = wtkVarY.e;
            wtkVarY.y = defpackage.rhx.b(wsxVar.H());
            wtkVarY.E.g(2131429540, wtkVarY.L.aa(defpackage.wti.class, new defpackage.qam(19)), wtkVarY.F.a(wtkVarY.H));
            viewInflate.setBackgroundColor(urg.c(viewInflate.getContext(), android.R.attr.colorBackground));
            int i4 = dzs.a;
            com.android.dialer.xatu.impl.ui.XatuInCallToolbar xatuInCallToolbar = (com.android.dialer.xatu.impl.ui.XatuInCallToolbar) dzo.b(viewInflate, 2131429294);
            defpackage.pnb pnbVar = wtkVarY.b;
            defpackage.pnc pncVar = new defpackage.pnc();
            pncVar.f(j$.util.Optional.of(xatuInCallToolbar));
            pncVar.i(j$.util.Optional.of((android.widget.TextView) xatuInCallToolbar.findViewById(2131429341)));
            pncVar.b(j$.util.Optional.ofNullable((android.widget.ImageView) xatuInCallToolbar.findViewById(2131428365)));
            pncVar.e(j$.util.Optional.of((android.widget.Chronometer) xatuInCallToolbar.findViewById(2131427766)));
            pncVar.k(j$.util.Optional.of((android.widget.TextView) xatuInCallToolbar.findViewById(2131427706)));
            pncVar.d(j$.util.Optional.of((android.widget.ViewAnimator) xatuInCallToolbar.findViewById(2131429252)));
            pnbVar.j(pncVar.a());
            pnbVar.k();
            android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) dzo.b(viewInflate, 2131428773);
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = (com.google.android.material.floatingactionbutton.FloatingActionButton) dzo.b(viewInflate, 2131428875);
            amcn amcnVar = new amcn();
            amcnVar.d = new defpackage.wrn(wtkVarY, i3);
            amcnVar.n(new defpackage.wro(i2));
            amcnVar.a = defpackage.ahaj.b();
            wtkVarY.C = amcnVar.m();
            wtkVarY.M = new defpackage.wte(wtkVarY, recyclerView, floatingActionButton);
            wtkVarY.C.u(wtkVarY.M);
            wsxVar.A();
            android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(1, false);
            recyclerView.r = true;
            recyclerView.aa(linearLayoutManager);
            wtkVarY.C.t(2);
            recyclerView.Y(wtkVarY.C);
            recyclerView.at(wtkVarY.f);
            recyclerView.au(new defpackage.wtf(wtkVarY));
            lj ljVar = recyclerView.E;
            if (ljVar instanceof lj) {
                ljVar.u();
            }
            android.support.v7.widget.RecyclerView recyclerView2 = (android.support.v7.widget.RecyclerView) dzo.b(viewInflate, 2131427761);
            amcn amcnVar2 = new amcn();
            amcnVar2.o(wtkVarY.s);
            amcnVar2.n(new defpackage.wro(i3));
            amcnVar2.a = defpackage.ahaj.b();
            wtkVarY.D = amcnVar2.m();
            wsxVar.A();
            recyclerView2.aa(new android.support.v7.widget.LinearLayoutManager(0, false));
            recyclerView2.at(wtkVarY.g);
            recyclerView2.Y(wtkVarY.D);
            recyclerView2.Z((km) null);
            aw awVarD = wsxVar.I().d(2131427982);
            if (awVarD != null) {
                u uVar = new u(wsxVar.I());
                uVar.k(awVarD);
                uVar.c();
            }
            u uVar2 = new u(wsxVar.I());
            akzx akzxVarM = defpackage.pyk.a.m();
            akzxVarM.u();
            defpackage.pyk pykVar = (defpackage.pyk) akzxVarM.b;
            pykVar.b |= 1;
            pykVar.c = 0;
            boolean zBooleanValue = ((java.lang.Boolean) wtkVarY.G.a()).booleanValue();
            akzxVarM.u();
            defpackage.pyk pykVar2 = (defpackage.pyk) akzxVarM.b;
            pykVar2.b |= 16;
            pykVar2.g = zBooleanValue;
            if (wtkVarY.y) {
                akzxVarM.u();
                defpackage.pyk pykVar3 = (defpackage.pyk) akzxVarM.b;
                pykVar3.e = 2;
                pykVar3.b |= 4;
                akzxVarM.u();
                defpackage.pyk pykVar4 = (defpackage.pyk) akzxVarM.b;
                pykVar4.b |= 8;
                pykVar4.f = true;
                akzxVarM.u();
                defpackage.pyk pykVar5 = (defpackage.pyk) akzxVarM.b;
                pykVar5.b |= 2;
                pykVar5.d = true;
                int dimensionPixelSize = wsxVar.dX().getDimensionPixelSize(2131167971);
                akzxVarM.u();
                defpackage.pyk pykVar6 = (defpackage.pyk) akzxVarM.b;
                pykVar6.b |= 1;
                pykVar6.c = dimensionPixelSize;
            }
            defpackage.pyk pykVar7 = (defpackage.pyk) akzxVarM.p();
            aimz aimzVar = defpackage.pyu.a;
            uVar2.e(2131427982, defpackage.pyn.q(pykVar7), (java.lang.String) null, 1);
            uVar2.c();
            if (wtkVarY.y) {
                com.android.dialer.incall.buttonbar.GenericButtonBarView genericButtonBarView = (com.android.dialer.incall.buttonbar.GenericButtonBarView) dzo.b(viewInflate, 2131427624);
                android.content.Context context = viewInflate.getContext();
                aooh.f(context, "context");
                int iC = urg.c(context, 2130969107);
                float dimension = context.getResources().getDimension(2131165600);
                genericButtonBarView.setBackground(wsc.bs(iC, 0.0f, 0.0f, dimension, dimension));
            }
            if (!wtkVarY.y) {
                wsxVar.H().setTheme(2132083285);
            }
            dzk.o(viewInflate, new ahpr(wtkVarY.i, 1110, "xatu_in_call_fragment_apply_window_insets_compat", new ebx(viewInflate, 9)));
            if (viewInflate == null) {
                throw new java.lang.IllegalStateException("Fragments without views cannot use Android event listeners such as @OnClick, @OnCheckedChange, @OnLongClick, etc.");
            }
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

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.wru
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
            defpackage.wtk wtkVarY = y();
            wtkVarY.c.m(ruc.q);
            wtkVarY.B = j$.util.Optional.empty();
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
            defpackage.wtk wtkVarY = y();
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131427606), new defpackage.wtm(wtkVarY, 1));
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131427607), new defpackage.wtm(wtkVarY, 0));
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131427605), new defpackage.wtm(wtkVarY, 2));
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131427602), new defpackage.wtm(wtkVarY, 3));
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131427588), new defpackage.wtm(wtkVarY, 4));
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131428875), new defpackage.wtm(wtkVarY, 5));
            defpackage.wtk wtkVarY2 = y();
            ahvr.e(this, defpackage.pgh.class, new defpackage.wtl(wtkVarY2, 2));
            ahvr.e(this, defpackage.pyr.class, new defpackage.wtl(wtkVarY2, 3));
            ahvr.e(this, defpackage.pys.class, new defpackage.wtl(wtkVarY2, 4));
            ahvr.e(this, defpackage.wrr.class, new defpackage.wtl(wtkVarY2, 5));
            ahvr.e(this, defpackage.wrs.class, new defpackage.wtl(wtkVarY2, 6));
            ahvr.e(this, defpackage.wsh.class, new defpackage.wtl(wtkVarY2, 7));
            ahvr.e(this, defpackage.wsq.class, new defpackage.wtl(wtkVarY2, 8));
            ahvr.e(this, defpackage.wsr.class, new defpackage.wtl(wtkVarY2, 9));
            ahvr.e(this, defpackage.wsv.class, new defpackage.wtl(wtkVarY2, 10));
            ahvr.e(this, defpackage.wtr.class, new defpackage.wtl(wtkVarY2, 1));
            ahvr.e(this, defpackage.wua.class, new defpackage.wtl(wtkVarY2, 0));
            aooh.f(view, "view");
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

    @Override // defpackage.wru
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                wtn wtnVar = (wtn) agab.aC(this, wtn.class);
                ahoq ahoqVarY = ahvr.Y(1107, defpackage.wsx.class, "CreatePeer");
                try {
                    this.c = wtnVar.cP();
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
            defpackage.wtk wtkVarY = y();
            hgb.c(defpackage.wtk.a.b(), "starting Xatu timer", "com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer", "onCreate", (char) 328, "XatuInCallFragmentPeer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            wtkVarY.c.j(ruc.q);
            j$.util.Optional optionalH = wtkVarY.J.h();
            if (true == optionalH.isPresent()) {
                optionalH = j$.util.Optional.ofNullable(((defpackage.apqr) optionalH.get()).b);
            }
            wtkVarY.K.i((java.lang.String) optionalH.orElse((java.lang.Object) null)).b(mce.fr);
            agtj agtjVar = wtkVarY.d;
            agtjVar.h(wtkVarY.u);
            agtjVar.h(wtkVarY.v);
            defpackage.wsx wsxVar = wtkVarY.e;
            wsxVar.H().setTheme(2132086223);
            wsxVar.H().fc().d(wsxVar, wtkVarY.w);
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

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            defpackage.wtk wtkVarY = y();
            wtkVarY.C.v(wtkVarY.M);
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

    public final void k(android.os.Bundle bundle) {
        java.lang.String str;
        this.b.j();
        try {
            defpackage.wtk wtkVarY = y();
            bundle.putBoolean("dialpad_show", wtkVarY.x);
            if (wtkVarY.z.isPresent()) {
                akzx akzxVarM = defpackage.wsy.a.m();
                boolean z = ((defpackage.wlc) wtkVarY.z.orElseThrow()).o;
                akzxVarM.u();
                defpackage.wsy wsyVar = (defpackage.wsy) akzxVarM.b;
                wsyVar.b |= 2;
                wsyVar.d = z;
                defpackage.wow wowVarB = defpackage.wow.b(((defpackage.wlc) wtkVarY.z.orElseThrow()).q);
                if (wowVarB == null) {
                    wowVarB = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
                }
                akzxVarM.u();
                defpackage.wsy wsyVar2 = (defpackage.wsy) akzxVarM.b;
                wsyVar2.c = wowVarB.a();
                wsyVar2.b |= 1;
                boolean z2 = ((defpackage.wlc) wtkVarY.z.orElseThrow()).j;
                akzxVarM.u();
                defpackage.wsy wsyVar3 = (defpackage.wsy) akzxVarM.b;
                wsyVar3.b |= 4;
                wsyVar3.e = z2;
                boolean z3 = ((defpackage.wlc) wtkVarY.z.orElseThrow()).n;
                akzxVarM.u();
                defpackage.wsy wsyVar4 = (defpackage.wsy) akzxVarM.b;
                wsyVar4.b |= 32;
                wsyVar4.h = z3;
                boolean z4 = ((defpackage.wlc) wtkVarY.z.orElseThrow()).l;
                akzxVarM.u();
                defpackage.wsy wsyVar5 = (defpackage.wsy) akzxVarM.b;
                wsyVar5.b |= 8;
                wsyVar5.f = z4;
                boolean z5 = ((defpackage.wlc) wtkVarY.z.orElseThrow()).k;
                akzxVarM.u();
                defpackage.wsy wsyVar6 = (defpackage.wsy) akzxVarM.b;
                wsyVar6.b |= 64;
                wsyVar6.i = z5;
                boolean z6 = ((defpackage.wlc) wtkVarY.z.orElseThrow()).m;
                akzxVarM.u();
                defpackage.wsy wsyVar7 = (defpackage.wsy) akzxVarM.b;
                wsyVar7.b |= 16;
                wsyVar7.g = z6;
                defpackage.akmr.u(bundle, "last_model", akzxVarM.p());
                int i = wtkVarY.I;
                if (i == 1) {
                    str = "NONE";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "SHOW_AHEAD";
                } else {
                    str = "LIVE";
                }
                if (i == 0) {
                    throw null;
                }
                bundle.putString("autoscroll_method", str);
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

    public final void n(android.os.Bundle bundle) {
        this.b.j();
        try {
            super.n(bundle);
            defpackage.wtk wtkVarY = y();
            if (bundle != null) {
                if (bundle.getBoolean("dialpad_show", false)) {
                    wtkVarY.m(false);
                }
                if (bundle.containsKey("last_model") && wtkVarY.A.isPresent()) {
                    wtkVarY.k(((defpackage.wsy) wtkVarY.A.orElseThrow()).d);
                    wtkVarY.q(((defpackage.wsy) wtkVarY.A.orElseThrow()).e);
                    wtkVarY.l(((defpackage.wsy) wtkVarY.A.orElseThrow()).h);
                    wtkVarY.n(((defpackage.wsy) wtkVarY.A.orElseThrow()).f);
                    wtkVarY.o(((defpackage.wsy) wtkVarY.A.orElseThrow()).g);
                    wtkVarY.p(((defpackage.wsy) wtkVarY.A.orElseThrow()).i);
                }
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

    @Override // defpackage.wru
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.wtk y() {
        defpackage.wtk wtkVar = this.c;
        if (wtkVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return wtkVar;
    }

    @Override // defpackage.wru
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
