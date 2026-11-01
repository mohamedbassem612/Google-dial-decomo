package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lyb extends defpackage.lzb implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.lyi c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.lyi lyiVarY = y();
            android.view.View viewInflate = layoutInflater.inflate(true != ((java.lang.Boolean) lyiVarY.y.a()).booleanValue() ? 2131624109 : 2131624110, viewGroup, false);
            if (!lyiVarY.f) {
                ahpr ahprVar = new ahpr(lyiVarY.s, 327, "conversation_history_call_details_apply_window_insets_compat", new defpackage.izf(5));
                int i = dzs.a;
                dzk.o(viewInflate, ahprVar);
            }
            if (viewInflate == null) {
                mni.bC(this, y());
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

    public final void ag(int i, int i2, android.content.Intent intent) {
        ahpm ahpmVarL = this.b.l();
        try {
            aV(i, i2, intent);
            defpackage.lyi lyiVarY = y();
            if (i == 10 && intent != null && intent.getBooleanExtra("call_recording_deleted_key", false)) {
                agby.o(((aw) lyiVarY.n).Q.findViewById(2131427865), 2132018188, 0).h();
            }
            ahpmVarL.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lzb
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
            defpackage.lyi lyiVarY = y();
            lyiVarY.D.i((java.lang.String) null).b(mce.eB);
            if (!((java.lang.Boolean) lyiVarY.u.a()).booleanValue()) {
                epq.a(lyiVarY.m).c(lyiVarY.c);
            }
            if (lyiVarY.m.isFinishing()) {
                java.lang.Object obj = lyiVarY.E.a;
                ((akzx) obj).u();
                defpackage.knb knbVar = (defpackage.knb) ((akzx) obj).b;
                defpackage.knb knbVar2 = defpackage.knb.a;
                knbVar.e = null;
                knbVar.b &= -9;
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

    public final void al() {
        this.b.j();
        try {
            be();
            defpackage.lyi lyiVarY = y();
            mni.cw().removeCallbacks(lyiVarY.k);
            if (lyiVarY.j) {
                agsm.i(326, lyiVarY.p.a(), "Failed to clear all missed calls.", new java.lang.Object[0]);
            }
            if (((aw) lyiVarY.n).Q != null) {
                if (lyiVarY.m.isChangingConfigurations()) {
                    android.support.v7.widget.RecyclerView recyclerViewA = lyiVarY.a();
                    int iL = recyclerViewA != null ? recyclerViewA.n.L() : 0;
                    akzx akzxVarM = defpackage.kmx.a.m();
                    long j = lyiVarY.g.d;
                    akzxVarM.u();
                    defpackage.kmx kmxVar = (defpackage.kmx) akzxVarM.b;
                    kmxVar.b |= 1;
                    kmxVar.c = j;
                    boolean zA = lyiVarY.h.A();
                    akzxVarM.u();
                    defpackage.kmx kmxVar2 = (defpackage.kmx) akzxVarM.b;
                    kmxVar2.b |= 2;
                    kmxVar2.d = zA;
                    boolean zI = lyiVarY.i();
                    akzxVarM.u();
                    defpackage.kmx kmxVar3 = (defpackage.kmx) akzxVarM.b;
                    kmxVar3.b |= 4;
                    kmxVar3.e = zI;
                    akzxVarM.u();
                    defpackage.kmx kmxVar4 = (defpackage.kmx) akzxVarM.b;
                    kmxVar4.b |= 8;
                    kmxVar4.f = iL;
                    defpackage.kmx kmxVar5 = (defpackage.kmx) akzxVarM.p();
                    java.lang.Object obj = lyiVarY.E.a;
                    ((akzx) obj).u();
                    defpackage.knb knbVar = (defpackage.knb) ((akzx) obj).b;
                    defpackage.knb knbVar2 = defpackage.knb.a;
                    j$.util.Objects.requireNonNull(kmxVar5);
                    knbVar.e = kmxVar5;
                    knbVar.b |= 8;
                } else {
                    java.lang.Object obj2 = lyiVarY.E.a;
                    defpackage.kmx kmxVar6 = defpackage.kmx.a;
                    ((akzx) obj2).u();
                    defpackage.knb knbVar3 = (defpackage.knb) ((akzx) obj2).b;
                    defpackage.knb knbVar4 = defpackage.knb.a;
                    j$.util.Objects.requireNonNull(kmxVar6);
                    knbVar3.e = kmxVar6;
                    knbVar3.b |= 8;
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

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.lyi lyiVarY = y();
            lyiVarY.F.t();
            lyiVarY.h();
            lyiVarY.j = false;
            mni.cw().postDelayed(lyiVarY.k, defpackage.lyi.b);
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
            mni.bC(this, y());
            aooh.f(view, "view");
            final defpackage.lyi lyiVarY = y();
            lyiVarY.h = (com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsToolbar) view.findViewById(2131429294);
            lyiVarY.h.o(2131755013);
            lyiVarY.h.u(new defpackage.lde(lyiVarY, 13));
            if (lyiVarY.i()) {
                lyiVarY.h.t((android.graphics.drawable.Drawable) null);
            }
            lyiVarY.g(lyiVarY.h.f());
            ((android.support.v7.widget.Toolbar) lyiVarY.h).u = new lv() { // from class: lyg
                public final boolean a(android.view.MenuItem menuItem) {
                    int i = ((fv) menuItem).a;
                    defpackage.lyi lyiVar = lyiVarY;
                    boolean z = true;
                    if (i == 2131427891) {
                        lyiVar.r.n(rmw.hw);
                        mni.cB(lyiVar.m, lyiVar.g.g);
                        return true;
                    }
                    if (i == 2131427893) {
                        lyiVar.r.n(rmw.hx);
                        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", uyb.b(lyiVar.g.g));
                        if (!lyiVar.i()) {
                            lyiVar.e();
                        }
                        uxw.b(lyiVar.m, intent, 2132017288);
                        return true;
                    }
                    if (i == 2131427863) {
                        android.view.View.OnClickListener onClickListener = lyiVar.q.b(lyiVar.g, true).e;
                        if (onClickListener != null) {
                            onClickListener.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else if (i == 2131427864) {
                        android.view.View.OnClickListener onClickListener2 = lyiVar.q.c(lyiVar.g, true).e;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else if (i == 2131427899) {
                        android.view.View.OnClickListener onClickListener3 = lyiVar.q.j(lyiVar.g, true).e;
                        if (onClickListener3 != null) {
                            onClickListener3.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else if (i == 2131427862) {
                        android.view.View.OnClickListener onClickListener4 = lyiVar.q.a(lyiVar.m, lyiVar.g, true).e;
                        if (onClickListener4 != null) {
                            onClickListener4.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else if (i == 2131427898) {
                        final mau mauVar = lyiVar.q;
                        final kiu kiuVar = lyiVar.g;
                        final rmw rmwVar = rmw.hz;
                        final j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                        final j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                        vua vuaVar = new vua((byte[]) null, (byte[]) null);
                        vuaVar.k(2131231990);
                        vuaVar.m(mauVar.b.getString(2132018175));
                        vuaVar.l(true);
                        vuaVar.c = new android.view.View.OnClickListener() { // from class: mat
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view2) {
                                mau mauVar2 = mauVar;
                                rlv rlvVar = mauVar2.c;
                                rmw rmwVar2 = rmwVar;
                                rlvVar.n(rmwVar2);
                                j$.util.Objects.requireNonNull(rlvVar);
                                optionalEmpty.isPresent();
                                int i2 = rmwVar2 == rmw.hz ? 8 : 2;
                                rsr rsrVar = mauVar2.n;
                                kiu kiuVar2 = kiuVar;
                                j$.util.Optional optional = optionalEmpty2;
                                defpackage.jjx jjxVarAq = rsrVar.aq(kiuVar2, i2);
                                optional.isPresent();
                                defpackage.jmc.a.b().l("com/android/dialer/blockreportspam/ShowBlockReportSpamDialogNotifier", "notifyShowDialogToReportSpamAndBlock", 112, "ShowBlockReportSpamDialogNotifier.java").v("enter");
                                android.content.Intent intent2 = new android.content.Intent();
                                intent2.setAction("show_dialog_to_report_spam_and_block");
                                sns.u(intent2, "dialog_info", jjxVarAq);
                                epq.a(mauVar2.b).d(intent2);
                            }
                        };
                        android.view.View.OnClickListener onClickListener5 = vuaVar.i().e;
                        if (onClickListener5 != null) {
                            onClickListener5.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else if (i == 2131427896) {
                        android.view.View.OnClickListener onClickListener6 = lyiVar.q.g(lyiVar.g, true).e;
                        if (onClickListener6 != null) {
                            onClickListener6.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else if (i == 2131427895) {
                        android.view.View.OnClickListener onClickListener7 = lyiVar.q.f(lyiVar.g, true).e;
                        if (onClickListener7 != null) {
                            onClickListener7.onClick(menuItem.getActionView());
                            return true;
                        }
                    } else {
                        if (i == 2131427892) {
                            defpackage.lyr.aU(defpackage.lyq.a).r(lyiVar.n.I(), "ConversationHistoryDeleteDialogFragment");
                            return true;
                        }
                        if (i == 2131427887) {
                            lyiVar.r.o(rmx.ev);
                            j$.util.Optional optionalG = lyiVar.C.g();
                            if (optionalG.isPresent()) {
                                rsr rsrVar = (rsr) optionalG.orElseThrow();
                                defpackage.al alVarAl = rsr.al(defpackage.hhv.j(lyiVar.g, 4, 2131427865));
                                da daVar = lyiVar.m;
                                java.lang.Object obj = rsrVar.a;
                                alVarAl.r(daVar.a(), "caller_id_feedback_dialog_fragment");
                                return true;
                            }
                        } else if (i == 2131427888) {
                            lyiVar.r.o(rmx.ft);
                            j$.util.Optional optionalG2 = lyiVar.C.g();
                            if (optionalG2.isPresent()) {
                                rsr rsrVar2 = (rsr) optionalG2.orElseThrow();
                                defpackage.al alVarAm = rsr.am(defpackage.hhv.j(lyiVar.g, 4, 2131427865));
                                da daVar2 = lyiVar.m;
                                java.lang.Object obj2 = rsrVar2.a;
                                alVarAm.r(daVar2.a(), "caller_id_suggestion_dialog_fragment");
                                return true;
                            }
                        } else if (i == 2131427889) {
                            lyiVar.r.o(rmx.fa);
                            j$.util.Optional optionalG3 = lyiVar.C.g();
                            if (optionalG3.isPresent()) {
                                rsr rsrVar3 = (rsr) optionalG3.orElseThrow();
                                defpackage.al alVarAn = rsr.an(defpackage.hhv.j(lyiVar.g, 4, 2131427865));
                                da daVar3 = lyiVar.m;
                                java.lang.Object obj3 = rsrVar3.a;
                                alVarAn.r(daVar3.a(), "caller_tag_feedback_dialog_fragment");
                            }
                        } else if (i == 2131427890) {
                            lyiVar.r.o(rmx.fh);
                            j$.util.Optional optionalG4 = lyiVar.C.g();
                            if (optionalG4.isPresent()) {
                                rsr rsrVar4 = (rsr) optionalG4.orElseThrow();
                                defpackage.al alVarAo = rsr.ao(defpackage.hhv.j(lyiVar.g, 4, 2131427865));
                                da daVar4 = lyiVar.m;
                                java.lang.Object obj4 = rsrVar4.a;
                                alVarAo.r(daVar4.a(), "caller_tag_selector_dialog_fragment");
                            }
                        } else {
                            z = false;
                            if (i == 2131427897) {
                                defpackage.lyb lybVar = lyiVar.n;
                                lyiVar.o.g(lyiVar.q.m(lybVar.H(), lyiVar.g, lybVar.N().findViewById(2131427865)), 5L, java.util.concurrent.TimeUnit.SECONDS);
                            }
                        }
                    }
                    return z;
                }
            };
            defpackage.lyn lynVarC = lyiVarY.c();
            rai raiVar = lyiVarY.H;
            da daVar = lyiVarY.m;
            defpackage.lyb lybVar = lyiVarY.n;
            abwd abwdVar = lynVarC.c;
            if (abwdVar == null) {
                abwdVar = abwd.a;
            }
            java.lang.String str = lynVarC.d;
            java.lang.Object obj = raiVar.a;
            defpackage.him himVar = ((hir) obj).a;
            android.content.Context context = (android.content.Context) himVar.s.a();
            ahbv ahbvVarCw = himVar.a.cw();
            his hisVar = ((hir) obj).b;
            aazc aazcVar = (aazc) himVar.l.a();
            rai raiVar2 = (rai) hisVar.D.a();
            hisVar.dD();
            lyiVarY.i = new defpackage.lxt(context, ahbvVarCw, aazcVar, raiVar2, himVar.mZ(), daVar, lybVar, abwdVar, str);
            android.support.v7.widget.RecyclerView recyclerViewFindViewById = view.findViewById(2131428773);
            int i = 0;
            recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
            recyclerViewFindViewById.Y(lyiVarY.i);
            lyiVarY.i.t(2);
            com.google.android.material.appbar.AppBarLayout appBarLayoutFindViewById = view.findViewById(2131429305);
            appBarLayoutFindViewById.setBackgroundColor(urg.c(daVar, 2130969107));
            daVar.getWindow().setStatusBarColor(urg.c(daVar, 2130969107));
            if (lyiVarY.i()) {
                appBarLayoutFindViewById.e = false;
            } else {
                recyclerViewFindViewById.setOnScrollChangeListener(new defpackage.lyf(appBarLayoutFindViewById, recyclerViewFindViewById, i));
                appBarLayoutFindViewById.f.add(new rai(lyiVarY));
                if (appBarLayoutFindViewById.getBackground() instanceof agaf) {
                    daVar.getWindow().setStatusBarColor(appBarLayoutFindViewById.getBackground().H().getDefaultColor());
                }
            }
            defpackage.mj mjVar = new defpackage.mj(lyiVarY.l);
            android.support.v7.widget.RecyclerView recyclerView = mjVar.p;
            if (recyclerView != recyclerViewFindViewById) {
                if (recyclerView != null) {
                    recyclerView.as(mjVar);
                    mjVar.p.U(mjVar.u);
                    java.util.List list = mjVar.p.x;
                    if (list != null) {
                        list.remove(mjVar);
                    }
                    java.util.List list2 = mjVar.n;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        defpackage.mi miVar = (defpackage.mi) list2.get(0);
                        miVar.a();
                        defpackage.mf.f(miVar.h);
                    }
                    list2.clear();
                    mjVar.f();
                    defpackage.mg mgVar = mjVar.t;
                    if (mgVar != null) {
                        mgVar.a = false;
                        mjVar.t = null;
                    }
                    if (mjVar.s != null) {
                        mjVar.s = null;
                    }
                }
                mjVar.p = recyclerViewFindViewById;
                if (recyclerViewFindViewById != null) {
                    android.content.res.Resources resources = recyclerViewFindViewById.getResources();
                    mjVar.e = resources.getDimension(2131166223);
                    mjVar.f = resources.getDimension(2131166222);
                    mjVar.o = android.view.ViewConfiguration.get(mjVar.p.getContext()).getScaledTouchSlop();
                    mjVar.p.at(mjVar);
                    mjVar.p.s(mjVar.u);
                    android.support.v7.widget.RecyclerView recyclerView2 = mjVar.p;
                    if (recyclerView2.x == null) {
                        recyclerView2.x = new java.util.ArrayList();
                    }
                    recyclerView2.x.add(mjVar);
                    mjVar.t = new defpackage.mg(mjVar);
                    mjVar.s = new android.view.GestureDetector(mjVar.p.getContext(), mjVar.t);
                }
            }
            if (!((java.lang.Boolean) lyiVarY.u.a()).booleanValue()) {
                epq.a(daVar).b(lyiVarY.c, kcq.l());
            }
            java.lang.Object obj2 = lyiVarY.E.a;
            defpackage.kmx kmxVar = ((defpackage.knb) ((akzx) obj2).b).e;
            if (kmxVar == null) {
                kmxVar = defpackage.kmx.a;
            }
            if (lyiVarY.g.d != kmxVar.c || (kmxVar.e && !lyiVarY.i())) {
                defpackage.kmx kmxVar2 = defpackage.kmx.a;
                ((akzx) obj2).u();
                defpackage.knb knbVar = (defpackage.knb) ((akzx) obj2).b;
                j$.util.Objects.requireNonNull(kmxVar2);
                knbVar.e = kmxVar2;
                knbVar.b |= 8;
            } else if (kmxVar.d) {
                lyiVarY.h.eu();
            }
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

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.lyi y() {
        defpackage.lyi lyiVar = this.c;
        if (lyiVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return lyiVar;
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

    public final ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.lzb
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                lyk lykVar = (lyk) agab.aC(this, lyk.class);
                ahoq ahoqVarY = ahvr.Y(324, defpackage.lyb.class, "CreatePeer");
                try {
                    this.c = lykVar.ak();
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

    /* JADX WARN: Type inference failed for: r0v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [aoin, java.lang.Object] */
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.lyi lyiVarY = y();
            defpackage.lyi.a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer", "onCreate", 321, "ConversationHistoryCallDetailsFragmentPeer.java").v("onCreate");
            if (bundle == null) {
                lyiVarY.e.a(lyiVarY.g);
            }
            agzc agzcVar = lyiVarY.d;
            pgi pgiVar = lyiVarY.F;
            defpackage.lzt lztVar = lyiVarY.e;
            aooh.f(lztVar, "state");
            java.lang.Object obj = pgiVar.a;
            defpackage.lzm lzmVar = (defpackage.lzm) ((pub) obj).f.a();
            lzmVar.getClass();
            defpackage.lzv lzvVar = (defpackage.lzv) ((pub) obj).g.a();
            lzvVar.getClass();
            aoss aossVar = (aoss) ((pub) obj).a.a();
            aossVar.getClass();
            defpackage.lzs lzsVar = (defpackage.lzs) ((pub) obj).c.a();
            lzsVar.getClass();
            aolr aolrVar = (aolr) ((pub) obj).h.a();
            aolrVar.getClass();
            sqo sqoVar = (sqo) ((pub) obj).b.a();
            sqoVar.getClass();
            ojo ojoVar = (ojo) ((pub) obj).e.a();
            ojoVar.getClass();
            lztVar.getClass();
            ((gus) ((pub) obj).d.a()).getClass();
            agzcVar.g(2131429354, new defpackage.lzz(lzmVar, lzvVar, aossVar, lzsVar, aolrVar, sqoVar, ojoVar, lztVar), new uvn(lyiVarY, 1));
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
            defpackage.lyi lyiVarY = y();
            if (lyiVarY.h.A()) {
                lyiVarY.h.l();
            }
            int iC = urg.c(lyiVarY.m, 2130969107);
            defpackage.lyb lybVar = lyiVarY.n;
            lybVar.G().getWindow().setStatusBarColor(0);
            lybVar.G().getWindow().setNavigationBarColor(iC);
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
        this.b.j();
        try {
            y();
            defpackage.lyi.a.b().l("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsFragmentPeer", "onSaveInstanceState", 502, "ConversationHistoryCallDetailsFragmentPeer.java").v("onSaveInstanceState");
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
            defpackage.lyi lyiVarY = y();
            da daVar = lyiVarY.m;
            ft$.ExternalSyntheticApiModelOutline0.m(daVar.getWindow(), 0);
            daVar.getWindow().setNavigationBarColor(urg.c(daVar, 2130969108));
            if (((java.lang.Boolean) lyiVarY.u.a()).booleanValue()) {
                epq.a(daVar).b(lyiVarY.c, kcq.l());
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

    public final void m() {
        this.b.j();
        try {
            bh();
            defpackage.lyi lyiVarY = y();
            if (((java.lang.Boolean) lyiVarY.u.a()).booleanValue()) {
                epq.a(lyiVarY.m).c(lyiVarY.c);
            }
            if (!lyiVarY.m.isChangingConfigurations()) {
                lyiVarY.D.i((java.lang.String) null).b(mce.eA);
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

    @Override // defpackage.lzb
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.lzb
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
