package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcx extends defpackage.rcj implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.rdk c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.rdk rdkVarY = y();
            aooh.f(layoutInflater, "inflater");
            tec tecVar = rdkVarY.l;
            defpackage.rcx rcxVar = rdkVarY.c;
            final android.view.View viewInflate = layoutInflater.inflate(true != tecVar.a(rcxVar.A()) ? 2131624694 : 2131624695, viewGroup, false);
            aooh.e(viewInflate, "inflate(...)");
            android.view.View viewFindViewById = viewInflate.findViewById(2131427592);
            if (viewFindViewById != null) {
                viewFindViewById.setBackground(wsc.br(rcxVar.A()));
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(viewFindViewById);
                bottomSheetBehaviorH.x = true;
                bottomSheetBehaviorH.w = true;
                bottomSheetBehaviorH.s(true);
                bottomSheetBehaviorH.r(true);
                bottomSheetBehaviorH.t(5);
                bottomSheetBehaviorH.i(new defpackage.rdj(rdkVarY));
                rdkVarY.A = bottomSheetBehaviorH;
                rdkVarY.k(false);
            }
            if (viewInflate.findViewById(2131427910) != null) {
                android.view.View viewFindViewById2 = viewInflate.findViewById(2131428486);
                if (viewFindViewById2 != null) {
                    dtv layoutParams = viewFindViewById2.getLayoutParams();
                    aooh.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    dtv dtvVar = layoutParams;
                    dtvVar.l = 2131427910;
                    viewFindViewById2.setLayoutParams(dtvVar);
                }
                android.view.View viewFindViewById3 = viewInflate.findViewById(2131428488);
                if (viewFindViewById3 != null) {
                    dtv layoutParams2 = viewFindViewById3.getLayoutParams();
                    aooh.d(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    dtv dtvVar2 = layoutParams2;
                    dtvVar2.l = 2131427910;
                    viewFindViewById3.setLayoutParams(dtvVar2);
                }
            }
            viewInflate.setVisibility(4);
            defpackage.agzc agzcVar = rdkVarY.j;
            defpackage.afpl afplVar = rdkVarY.N;
            final aopw aopwVar = (((java.lang.Boolean) rdkVarY.p.a()).booleanValue() || tecVar.a(rcxVar.A())) ? defpackage.rdi.a : defpackage.rdh.a;
            agzcVar.g(2131429451, afplVar.aa(defpackage.rdc.class, new defpackage.zpt() { // from class: rcz
                @Override // defpackage.zpt
                public final ajcq a(java.lang.Object obj) {
                    return (ajcq) aopwVar.a((defpackage.rdc) obj);
                }
            }), rdkVarY.k.b(rdkVarY.C, false));
            android.view.View viewFindViewById4 = viewInflate.findViewById(2131429361);
            if (viewFindViewById4 != null) {
                android.content.Context context = viewFindViewById4.getContext();
                aooh.e(context, "getContext(...)");
                float dimension = viewInflate.getResources().getDimension(2131167978);
                aooh.f(context, "context");
                viewFindViewById4.setBackground(wsc.bs(wsc.bt(context), dimension, dimension, dimension, dimension));
            }
            androidx.compose.ui.platform.ComposeView composeViewFindViewById = viewInflate.findViewById(2131428390);
            aooh.e(composeViewFindViewById, "findViewById(...)");
            androidx.compose.ui.platform.ComposeView composeView = composeViewFindViewById;
            aoin aoinVar = rdkVarY.u;
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                composeView.k(dgi.a);
            }
            int i = 6;
            composeView.a(new cja(1250507951, true, new lpn(rdkVarY, tecVar.a(rcxVar.A()), 6)));
            aimz aimzVar = defpackage.rdk.a;
            aimzVar.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "onCreateView", 524, "VoiceFragmentPeer.kt").v("Set edge-to-edge.");
            int i2 = 8;
            if (rdkVarY.p()) {
                android.view.View viewFindViewById5 = viewInflate.findViewById(2131428375);
                aooh.e(viewFindViewById5, "findViewById(...)");
                rdkVarY.m(viewFindViewById5, new defpackage.qxy(rdkVarY, i2));
                android.view.View viewFindViewById6 = viewInflate.findViewById(2131429443);
                aooh.e(viewFindViewById6, "findViewById(...)");
                rdkVarY.m(viewFindViewById6, new defpackage.qxy(rdkVarY, 9));
            } else {
                android.view.View viewFindViewById7 = viewInflate.findViewById(2131428375);
                aooh.e(viewFindViewById7, "findViewById(...)");
                final android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById7;
                ahpr ahprVar = new ahpr(rdkVarY.h, 696, "voice_fragment_apply_window_insets_compat", new dyy() { // from class: rda
                    public final eax dC(android.view.View view, eax eaxVar) {
                        android.view.View viewFindViewById8;
                        defpackage.rdk.a.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "setLayoutEdgeToEdge$<anonymous>", 720, "VoiceFragmentPeer.kt").v("Applying padding for edge-to-edge.");
                        android.view.View view2 = viewInflate;
                        defpackage.rdk rdkVar = rdkVarY;
                        dwn dwnVarF = eaxVar.f(647);
                        if (rdkVar.r()) {
                            android.view.View viewFindViewById9 = view2.findViewById(2131429443);
                            aooh.e(viewFindViewById9, "findViewById(...)");
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) viewFindViewById9;
                            frameLayout2.setPadding(frameLayout2.getPaddingLeft(), dwnVarF.c, frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
                        }
                        android.widget.FrameLayout frameLayout3 = frameLayout;
                        int dimensionPixelOffset = rdkVar.c.dX().getDimensionPixelOffset(2131165513);
                        android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout3.getLayoutParams();
                        if (layoutParams3 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        int i3 = dwnVarF.c;
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams.topMargin = dimensionPixelOffset + i3;
                        frameLayout3.setLayoutParams(marginLayoutParams);
                        android.view.View viewFindViewById10 = view2.findViewById(2131429453);
                        aooh.e(viewFindViewById10, "findViewById(...)");
                        android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) viewFindViewById10;
                        android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout4.getLayoutParams();
                        aooh.d(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams2.topMargin = i3;
                        frameLayout4.setLayoutParams(marginLayoutParams2);
                        if (((java.lang.Boolean) rdkVar.v.a()).booleanValue() && (viewFindViewById8 = view2.findViewById(2131428390)) != null) {
                            dzs.d(viewFindViewById8, eaxVar);
                        }
                        return eax.a;
                    }
                });
                int i3 = dzs.a;
                dzk.o(viewInflate, ahprVar);
            }
            android.view.View viewFindViewById8 = viewInflate.findViewById(2131427745);
            if (viewFindViewById8 != null) {
                android.view.ViewGroup.LayoutParams layoutParams3 = viewFindViewById8.getLayoutParams();
                layoutParams3.height = rdkVarY.e.getResources().getDimensionPixelOffset(2131165531);
                viewFindViewById8.setLayoutParams(layoutParams3);
            }
            aimzVar.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "setupBackgroundComposable", 1119, "VoiceFragmentPeer.kt").v("enter");
            androidx.compose.ui.platform.ComposeView composeViewFindViewById2 = viewInflate.findViewById(2131427532);
            if (composeViewFindViewById2 != null) {
                composeViewFindViewById2.setImportantForAccessibility(4);
                if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    composeViewFindViewById2.k(dgi.a);
                }
                composeViewFindViewById2.setVisibility(0);
                composeViewFindViewById2.a(new cja(-605078899, true, new defpackage.qxy(rdkVarY, i)));
            }
            aimzVar.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "setupComposableContactGrid", 1529, "VoiceFragmentPeer.kt").v("Using Composable Contact Grid.");
            android.view.ViewStub viewStub = (android.view.ViewStub) viewInflate.findViewById(2131428377);
            if (viewStub != null) {
                viewStub.setVisibility(8);
            }
            android.view.ViewStub viewStub2 = (android.view.ViewStub) viewInflate.findViewById(2131428374);
            if (viewStub2 != null) {
                viewStub2.setVisibility(8);
            }
            androidx.compose.ui.platform.ComposeView composeViewFindViewById3 = viewInflate.findViewById(2131427787);
            aooh.e(composeViewFindViewById3, "findViewById(...)");
            androidx.compose.ui.platform.ComposeView composeView2 = composeViewFindViewById3;
            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                composeView2.k(dgi.a);
            }
            composeView2.setVisibility(0);
            composeView2.a(new cja(1914137269, true, new defpackage.qxy(rdkVarY, 7)));
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) viewInflate.findViewById(2131427591);
            if (frameLayout2 != null) {
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
            }
            if (viewInflate == null) {
                pez.br(this, y());
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

    @Override // defpackage.rcj
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
        defpackage.rcd rcdVarB;
        defpackage.rdd rddVar;
        defpackage.rap rapVarAs;
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.rdk rdkVarY = y();
            defpackage.rap rapVarB = rdkVarY.b();
            if (rapVarB != null) {
                rapVarB.k();
                rapVarB.l();
            }
            if (rdkVarY.b() == null) {
                j$.util.Optional optionalH = rdkVarY.G.h();
                aooh.e(optionalH, "getPrimaryCallScope(...)");
                defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
                if (apqrVar != null && (rddVar = (defpackage.rdd) apqrVar.a(defpackage.rdd.class)) != null && (rapVarAs = rddVar.as()) != null) {
                    rapVarAs.k();
                }
            }
            defpackage.rcc rccVarD = rdkVarY.d();
            if (rccVarD != null) {
                tec tecVar = rdkVarY.l;
                defpackage.rcx rcxVar = rdkVarY.c;
                if (tecVar.a(rcxVar.A()) && rdkVarY.I.e()) {
                    defpackage.rce rceVar = rccVarD.k;
                    if (rceVar != null) {
                        rcdVarB = defpackage.rcd.b(rceVar.c);
                        if (rcdVarB == null) {
                            rcdVarB = defpackage.rcd.EMPTY;
                        }
                    } else {
                        rcdVarB = null;
                    }
                    if (rcdVarB != defpackage.rcd.DIALPAD) {
                        bo boVarI = rcxVar.I();
                        aooh.e(boVarI, "getChildFragmentManager(...)");
                        aw awVarE = rcxVar.I().e("tidepods_dialpad_fragment");
                        if (awVarE != null) {
                            defpackage.rdk.a.b().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "hideDialpadFragment$<anonymous>", 876, "VoiceFragmentPeer.kt").v("hide dialpad fragment");
                            u uVar = new u(boVarI);
                            uVar.j(awVarE);
                            uVar.c();
                            awVarE.aC(false);
                            rdkVarY.l(false);
                        }
                    }
                }
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
            ahvr.x(this).a = view;
            y();
            pez.br(this, y());
            aooh.f(view, "view");
            defpackage.rdk rdkVarY = y();
            ahoq ahoqVarW = ahvr.W(693, "VoiceFragmentPeer_onViewCreated");
            try {
                defpackage.rcx rcxVar = rdkVarY.c;
                if (rcxVar.I().e("tag_on_hold_fragment") == null) {
                    u uVar = new u(rcxVar.I());
                    uVar.e(2131429453, defpackage.qcd.q(), "tag_on_hold_fragment", 1);
                    uVar.c();
                }
                rdkVarY.g.k(rcxVar);
                rcxVar.H().getWindow().setNavigationBarColor(urg.c(rdkVarY.e, 2130969108));
                ahoq ahoqVarW2 = ahvr.W(690, "VoiceFragmentPeer_loadInitialDataModel");
                try {
                    java.lang.String str = rdkVarY.b;
                    if (str.length() != 0) {
                        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.rcc) ((j$.util.concurrent.ConcurrentHashMap) rdkVarY.L.a).remove(str));
                        aooh.e(optionalOfNullable, "pollInitialDataModel(...)");
                        rdkVarY.n((defpackage.rcc) aooh.q(optionalOfNullable));
                        rdkVarY.o();
                    }
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    ahns.l();
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW2, th);
                        throw th2;
                    }
                }
            } catch (java.lang.Throwable th3) {
                try {
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    ajsz.ak(ahoqVarW, th3);
                    throw th4;
                }
            }
        } catch (java.lang.Throwable th5) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
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

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.rcj
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rdl rdlVar = (rdl) agab.aC(this, rdl.class);
                ahoq ahoqVarY = ahvr.Y(687, defpackage.rcx.class, "CreatePeer");
                try {
                    this.c = rdlVar.by();
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
            defpackage.rdk rdkVarY = y();
            j$.util.Optional optionalH = rdkVarY.G.h();
            aooh.e(optionalH, "getPrimaryCallScope(...)");
            defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
            java.lang.Object obj = apqrVar != null ? apqrVar.b : null;
            gpd gpdVar = rdkVarY.J;
            gpdVar.i((java.lang.String) obj).b(mce.bB);
            gpdVar.i((java.lang.String) obj).a(mcd.az);
            aw awVar = rdkVarY.c;
            awVar.H().fc().d(awVar, rdkVarY.x);
            rdkVarY.m.h(rdkVarY.D);
            rdkVarY.B = awVar.O(new pa(), new kse(rdkVarY, 8));
            rdkVarY.f.b(awVar, rdkVarY.i);
            ahoq ahoqVarW = ahvr.W(692, "VoiceFragmentPeer_onCreate_syncStatusBarAppearanceToTheme");
            try {
                rdkVarY.g.l(awVar);
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                ahns.l();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
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

    public final void m() {
        this.b.j();
        try {
            bh();
            defpackage.rap rapVarB = y().b();
            if (rapVarB != null) {
                rapVarB.h(new defpackage.qsu(rapVarB, 5));
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

    @Override // defpackage.rcj
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.rdk y() {
        defpackage.rdk rdkVar = this.c;
        if (rdkVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rdkVar;
    }

    @Override // defpackage.rcj
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
