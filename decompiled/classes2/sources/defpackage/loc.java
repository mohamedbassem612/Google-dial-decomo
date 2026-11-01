package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class loc extends defpackage.loo implements ahei {
    private defpackage.loi c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.loi loiVarY = y();
            aooh.f(layoutInflater, "inflater");
            ahoq ahoqVarW = ahvr.W(314, "ChocolateChipFragmentPeer_onCreateView");
            try {
                android.view.View viewInflate = layoutInflater.inflate(2131624245, viewGroup, false);
                aooh.e(viewInflate, "inflate(...)");
                final com.android.dialer.chocolatechip.impl.ui.FastScroller fastScroller = (com.android.dialer.chocolatechip.impl.ui.FastScroller) viewInflate.findViewById(2131428240);
                final android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131427458);
                final android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131428773);
                viewInflate.findViewById(2131427848).setBackground(null);
                recyclerViewFindViewById.setBackground((android.graphics.drawable.Drawable) null);
                if (loiVarY.f()) {
                    loiVarY.i.d(recyclerViewFindViewById, ruc.u);
                } else {
                    loiVarY.i.d(recyclerViewFindViewById, ruc.t);
                }
                rai raiVar = new rai(loiVarY, (byte[]) null);
                rai raiVar2 = loiVarY.z;
                defpackage.loc locVar = loiVarY.d;
                android.content.Context contextA = locVar.A();
                java.lang.Object obj = raiVar2.a;
                his hisVar = ((hir) obj).b;
                rai raiVar3 = (rai) hisVar.v.a();
                rai raiVar4 = (rai) hisVar.w.a();
                defpackage.him himVar = ((hir) obj).a;
                loiVarY.p = new defpackage.lom(contextA, raiVar, raiVar3, raiVar4, (aolr) himVar.bn.a(), (aolr) himVar.bg.a());
                recyclerViewFindViewById.Y(loiVarY.p);
                locVar.z();
                loiVarY.o = new android.support.v7.widget.LinearLayoutManager() { // from class: com.android.dialer.chocolatechip.impl.ui.ChocolateChipFragmentPeer$onCreateView$1$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1, false);
                    }

                    public final void p(kt ktVar, la laVar) {
                        aooh.f(ktVar, "recycler");
                        aooh.f(laVar, "state");
                        super.ab(ktVar, laVar);
                        int iN = N() - L();
                        final defpackage.loi loiVar = loiVarY;
                        defpackage.lom lomVar = loiVar.p;
                        int iA = lomVar != null ? lomVar.a() : -1;
                        int i = iN + 1;
                        final com.android.dialer.chocolatechip.impl.ui.FastScroller fastScroller2 = fastScroller;
                        if (iA > i) {
                            fastScroller2.setVisibility(0);
                            final android.support.v7.widget.RecyclerView recyclerView = recyclerViewFindViewById;
                            aooh.c(fastScroller2);
                            final android.widget.TextView textView2 = textView;
                            aooh.c(textView2);
                            aooh.c(recyclerView);
                            aooh.f(fastScroller2, "fastScroller");
                            aooh.f(textView2, "anchoredHeader");
                            aooh.f(recyclerView, "recyclerView");
                            loiVar.o = recyclerView.n;
                            loiVar.w = new android.view.View.OnScrollChangeListener() { // from class: lod
                                @Override // android.view.View.OnScrollChangeListener
                                public final void onScrollChange(android.view.View view, int i2, int i3, int i4, int i5) {
                                    defpackage.lom lomVar2;
                                    defpackage.lns lnsVar;
                                    android.support.v7.widget.RecyclerView recyclerView2 = recyclerView;
                                    aooh.f(recyclerView2, "recyclerView");
                                    com.android.dialer.chocolatechip.impl.ui.FastScroller fastScroller3 = fastScroller2;
                                    android.view.View view2 = fastScroller3.a;
                                    if (view2 != null && !view2.isSelected()) {
                                        fastScroller3.a(fastScroller3.getHeight() * (recyclerView2.computeVerticalScrollOffset() / (recyclerView2.computeVerticalScrollRange() - fastScroller3.getHeight())));
                                    }
                                    defpackage.loi loiVar2 = loiVar;
                                    android.support.v7.widget.LinearLayoutManager linearLayoutManager = loiVar2.o;
                                    if (linearLayoutManager == null || (lomVar2 = loiVar2.p) == null || lomVar2.a() == 0) {
                                        return;
                                    }
                                    android.widget.TextView textView3 = textView2;
                                    int iL = linearLayoutManager.L();
                                    if (iL == 0) {
                                        textView3.setVisibility(4);
                                        return;
                                    }
                                    textView3.setVisibility(0);
                                    java.lang.String str = "";
                                    if (iL < 0 || iL >= lomVar2.a()) {
                                        defpackage.lom.e.d().l("com/android/dialer/chocolatechip/impl/ui/ContactsPagingAdapter", "getHeaderString", 120, "ContactsPagingAdapter.kt").y("Invalid position %s", new aepb(iL));
                                    } else if (iL == 0) {
                                        str = "+";
                                    } else {
                                        defpackage.lns lnsVar2 = (defpackage.lns) lomVar2.w(iL);
                                        if (lnsVar2 != null) {
                                            str = lnsVar2.a;
                                        }
                                    }
                                    textView3.setText(str);
                                    if (iL < lomVar2.a() - 1 && ((lnsVar = (defpackage.lns) lomVar2.w(iL + 1)) == null || !lnsVar.g)) {
                                        textView3.setTranslationY(0.0f);
                                        return;
                                    }
                                    ld ldVarF = recyclerView2.f(iL);
                                    int bottom = ldVarF != null ? ldVarF.a.getBottom() : 0;
                                    if (bottom < textView3.getHeight()) {
                                        textView3.setTranslationY(bottom - textView3.getHeight());
                                    } else {
                                        textView3.setTranslationY(0.0f);
                                    }
                                }
                            };
                            android.view.View.OnScrollChangeListener onScrollChangeListener = loiVar.w;
                            aooh.d(onScrollChangeListener, "null cannot be cast to non-null type android.view.View.OnScrollChangeListener");
                            recyclerView.setOnScrollChangeListener(onScrollChangeListener);
                        } else {
                            fastScroller2.setVisibility(8);
                        }
                        ahbv.D(loiVar.d);
                    }
                };
                recyclerViewFindViewById.aa(loiVarY.o);
                loiVarY.t = new defpackage.af((java.lang.Object) loiVarY, (android.view.View) recyclerViewFindViewById, (java.lang.Object) fastScroller, 20);
                if (dvx.c(locVar.A(), "android.permission.READ_CONTACTS") == 0) {
                    loiVarY.c();
                } else {
                    com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewCC = mni.cC(viewInflate);
                    emptyContentViewCC.f(2131951676);
                    emptyContentViewCC.g(2132019754);
                    emptyContentViewCC.e(2132019755, new defpackage.lde(loiVarY, 10));
                    emptyContentViewCC.setVisibility(0);
                    loiVarY.b(emptyContentViewCC);
                    recyclerViewFindViewById.setVisibility(8);
                }
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                ahns.l();
                return viewInflate;
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
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
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

    @Override // defpackage.loo
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
            y().x.i((java.lang.String) null).b(mce.eL);
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

    public final void aj(boolean z) {
        y().d(z);
    }

    public final void am(int i, java.lang.String[] strArr, int[] iArr) {
        defpackage.loi loiVarY = y();
        aooh.f(strArr, "permissions");
        if (i == 1 && iArr.length != 0 && iArr[0] == 0) {
            zrw zrwVar = loiVarY.h;
            java.lang.String str = strArr[0];
            aooh.f(str, "permission");
            zrw.a.b().l("com/google/android/dialershared/permissions/PermissionsUtilAsync", "notifyPermissionGranted", 375, "PermissionsUtilAsync.kt").y("Permission: %s", str);
            epq.a(zrwVar.c).d(new android.content.Intent(str));
        }
    }

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            aooh.f(view, "view");
            defpackage.loi loiVarY = y();
            aooh.f(view, "view");
            loiVarY.y.B(loiVarY.d);
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
    public final defpackage.loi y() {
        defpackage.loi loiVar = this.c;
        if (loiVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return loiVar;
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

    @Override // defpackage.loo
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.loo
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                loj lojVar = (loj) agab.aC(this, loj.class);
                ahoq ahoqVarY = ahvr.Y(310, defpackage.loc.class, "CreatePeer");
                try {
                    this.c = lojVar.ag();
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
            defpackage.loi loiVar = this.c;
            ahoq ahoqVarW = ahvr.W(312, "ChocolateChipFragmentPeer_onAttach");
            try {
                loiVar.d(false);
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                ahns.l();
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

    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.loi loiVarY = y();
            ahoq ahoqVarW = ahvr.W(313, "ChocolateChipFragmentPeer_onCreate");
            try {
                defpackage.loi.a.b().l("com/android/dialer/chocolatechip/impl/ui/ChocolateChipFragmentPeer", "onCreate$<anonymous>", 191, "ChocolateChipFragmentPeer.kt").v("enter");
                loiVarY.n.h(loiVarY.v);
                if (bundle != null) {
                    loiVarY.q = (android.net.Uri) bundle.getParcelable("saved_selected_contact_uri");
                    loiVarY.r = bundle.getBoolean("saved_instance_key_selected_contact_displayed_in_second_column");
                }
                rkg rkgVar = loiVarY.l;
                defpackage.loc locVar = loiVarY.d;
                rkgVar.a(locVar, locVar.H(), new defpackage.hp(loiVarY, 3));
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
        this.b.j();
        try {
            defpackage.loi loiVarY = y();
            android.net.Uri uri = loiVarY.q;
            if (uri != null) {
                bundle.putParcelable("saved_selected_contact_uri", uri);
            }
            bundle.putBoolean("saved_instance_key_selected_contact_displayed_in_second_column", loiVarY.r);
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

    public final void l() {
        this.b.j();
        try {
            bg();
            defpackage.loi loiVarY = y();
            zrw zrwVar = loiVarY.h;
            android.content.BroadcastReceiver broadcastReceiver = loiVarY.u;
            aooh.f(broadcastReceiver, "receiver");
            zrw.a.b().l("com/google/android/dialershared/permissions/PermissionsUtilAsync", "registerPermissionReceiver", 364, "PermissionsUtilAsync.kt").y("Permission: %s", "android.permission.READ_CONTACTS");
            epq.a(zrwVar.c).b(broadcastReceiver, new android.content.IntentFilter("android.permission.READ_CONTACTS"));
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
            defpackage.loi loiVarY = y();
            zrw zrwVar = loiVarY.h;
            android.content.BroadcastReceiver broadcastReceiver = loiVarY.u;
            aooh.f(broadcastReceiver, "receiver");
            zrw.a.b().l("com/google/android/dialershared/permissions/PermissionsUtilAsync", "unregisterPermissionReceiver", 370, "PermissionsUtilAsync.kt").v("unregisterPermissionReceiver");
            epq.a(zrwVar.c).c(broadcastReceiver);
            if (!loiVarY.c.isChangingConfigurations()) {
                loiVarY.x.i((java.lang.String) null).b(mce.eK);
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

    @Override // defpackage.loo
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
