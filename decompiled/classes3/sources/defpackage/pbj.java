package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbj extends defpackage.pbs implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.pbp c;
    private android.content.Context d;
    private boolean e;

    /* JADX WARN: Code duplicated, block: B:11:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x005b A[Catch: all -> 0x027b, TryCatch #2 {all -> 0x027b, blocks: (B:4:0x0025, B:7:0x0042, B:17:0x007c, B:18:0x00aa, B:20:0x00b2, B:22:0x00d1, B:23:0x00db, B:25:0x0101, B:27:0x010a, B:29:0x0110, B:30:0x0119, B:31:0x0120, B:32:0x0121, B:34:0x013d, B:35:0x0142, B:37:0x014f, B:38:0x0152, B:40:0x0187, B:42:0x0193, B:43:0x0198, B:45:0x01ac, B:47:0x01b6, B:51:0x01c6, B:52:0x01d8, B:54:0x01e3, B:56:0x0200, B:57:0x0205, B:59:0x0214, B:60:0x0219, B:62:0x0227, B:66:0x0234, B:67:0x0246, B:9:0x004b, B:12:0x005b, B:13:0x0063, B:15:0x006d, B:16:0x0075), top: B:89:0x0025, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0063 A[Catch: all -> 0x027b, TryCatch #2 {all -> 0x027b, blocks: (B:4:0x0025, B:7:0x0042, B:17:0x007c, B:18:0x00aa, B:20:0x00b2, B:22:0x00d1, B:23:0x00db, B:25:0x0101, B:27:0x010a, B:29:0x0110, B:30:0x0119, B:31:0x0120, B:32:0x0121, B:34:0x013d, B:35:0x0142, B:37:0x014f, B:38:0x0152, B:40:0x0187, B:42:0x0193, B:43:0x0198, B:45:0x01ac, B:47:0x01b6, B:51:0x01c6, B:52:0x01d8, B:54:0x01e3, B:56:0x0200, B:57:0x0205, B:59:0x0214, B:60:0x0219, B:62:0x0227, B:66:0x0234, B:67:0x0246, B:9:0x004b, B:12:0x005b, B:13:0x0063, B:15:0x006d, B:16:0x0075), top: B:89:0x0025, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x006d A[Catch: all -> 0x027b, TryCatch #2 {all -> 0x027b, blocks: (B:4:0x0025, B:7:0x0042, B:17:0x007c, B:18:0x00aa, B:20:0x00b2, B:22:0x00d1, B:23:0x00db, B:25:0x0101, B:27:0x010a, B:29:0x0110, B:30:0x0119, B:31:0x0120, B:32:0x0121, B:34:0x013d, B:35:0x0142, B:37:0x014f, B:38:0x0152, B:40:0x0187, B:42:0x0193, B:43:0x0198, B:45:0x01ac, B:47:0x01b6, B:51:0x01c6, B:52:0x01d8, B:54:0x01e3, B:56:0x0200, B:57:0x0205, B:59:0x0214, B:60:0x0219, B:62:0x0227, B:66:0x0234, B:67:0x0246, B:9:0x004b, B:12:0x005b, B:13:0x0063, B:15:0x006d, B:16:0x0075), top: B:89:0x0025, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0075 A[Catch: all -> 0x027b, TryCatch #2 {all -> 0x027b, blocks: (B:4:0x0025, B:7:0x0042, B:17:0x007c, B:18:0x00aa, B:20:0x00b2, B:22:0x00d1, B:23:0x00db, B:25:0x0101, B:27:0x010a, B:29:0x0110, B:30:0x0119, B:31:0x0120, B:32:0x0121, B:34:0x013d, B:35:0x0142, B:37:0x014f, B:38:0x0152, B:40:0x0187, B:42:0x0193, B:43:0x0198, B:45:0x01ac, B:47:0x01b6, B:51:0x01c6, B:52:0x01d8, B:54:0x01e3, B:56:0x0200, B:57:0x0205, B:59:0x0214, B:60:0x0219, B:62:0x0227, B:66:0x0234, B:67:0x0246, B:9:0x004b, B:12:0x005b, B:13:0x0063, B:15:0x006d, B:16:0x0075), top: B:89:0x0025, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r10v44, types: [aonj, java.lang.Object] */
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View viewInflate;
        android.view.View viewFindViewById;
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.pbp pbpVarY = y();
            aooh.f(layoutInflater, "inflater");
            ahoq ahoqVarW = ahvr.W(470, "AnswerFragmentPeer_onCreateView");
            try {
                tec tecVar = pbpVarY.k;
                defpackage.pbj pbjVar = pbpVarY.c;
                boolean zA = tecVar.a(pbjVar.A());
                aoin aoinVar = pbpVarY.t;
                if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    if (zA) {
                        zA = true;
                        if (((java.lang.Boolean) pbpVarY.s.a()).booleanValue()) {
                            if (zA) {
                                viewInflate = layoutInflater.inflate(2131624252, viewGroup, false);
                            } else {
                                viewInflate = layoutInflater.inflate(2131624250, viewGroup, false);
                            }
                        } else if (zA) {
                            viewInflate = layoutInflater.inflate(2131624251, viewGroup, false);
                        } else {
                            viewInflate = layoutInflater.inflate(2131624248, viewGroup, false);
                        }
                    } else {
                        viewInflate = layoutInflater.inflate(2131624249, viewGroup, false);
                    }
                } else if (((java.lang.Boolean) pbpVarY.s.a()).booleanValue()) {
                    if (zA) {
                        viewInflate = layoutInflater.inflate(2131624252, viewGroup, false);
                    } else {
                        viewInflate = layoutInflater.inflate(2131624250, viewGroup, false);
                    }
                } else if (zA) {
                    viewInflate = layoutInflater.inflate(2131624251, viewGroup, false);
                } else {
                    viewInflate = layoutInflater.inflate(2131624248, viewGroup, false);
                }
                pbpVarY.g.g(2131427467, pbpVarY.L.aa(pbl.class, new lme(16)), pbpVarY.h.b(pbpVarY.A, false));
                aihd<defpackage.pgi> aihdVarE = pbpVarY.F.e();
                aooh.e(aihdVarE, "get(...)");
                for (defpackage.pgi pgiVar : aihdVarE) {
                    j$.util.Optional optionalH = ((zpm) pgiVar.b).h();
                    lwx lwxVar = new lwx(new lvd(pgiVar, 2), 3);
                    if (true == optionalH.isPresent()) {
                        lwxVar.a.a(optionalH.get());
                    }
                }
                aooh.c(viewInflate);
                aimz aimzVar = defpackage.pbp.a;
                aimzVar.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setupComposableContactGrid", 679, "AnswerFragmentPeer.kt").v("Using Composable Contact Grid.");
                if (((java.lang.Boolean) pbpVarY.p.a()).booleanValue() && (viewFindViewById = viewInflate.findViewById(2131428372)) != null) {
                    android.view.ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if (layoutParams == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = 0;
                    viewFindViewById.setLayoutParams(marginLayoutParams);
                }
                androidx.compose.ui.platform.ComposeView composeViewFindViewById = viewInflate.findViewById(2131427787);
                aooh.e(composeViewFindViewById, "findViewById(...)");
                androidx.compose.ui.platform.ComposeView composeView = composeViewFindViewById;
                aoin aoinVar2 = pbpVarY.r;
                if (((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
                    composeView.k(dgi.a);
                }
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(2131428378);
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                composeView.setVisibility(0);
                composeView.a(new cja(1381059529, true, new ntw(pbpVarY, 11)));
                aimzVar.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setupBackgroundComposable", 720, "AnswerFragmentPeer.kt").v("enter");
                androidx.compose.ui.platform.ComposeView composeViewFindViewById2 = viewInflate.findViewById(2131427532);
                if (composeViewFindViewById2 != null) {
                    if (((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
                        composeViewFindViewById2.k(dgi.a);
                    }
                    composeViewFindViewById2.setVisibility(0);
                    composeViewFindViewById2.setImportantForAccessibility(4);
                    composeViewFindViewById2.a(new cja(1670728945, true, new lpn(pbpVarY, ((java.lang.Boolean) aoinVar.a()).booleanValue() && !tecVar.a(pbjVar.A()) && pbjVar.dX().getBoolean(2131034170), 2)));
                }
                androidx.compose.ui.platform.ComposeView composeViewFindViewById3 = viewInflate.findViewById(2131427758);
                if (composeViewFindViewById3 != null) {
                    aimzVar.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "setupAnswerChipsComposable", 825, "AnswerFragmentPeer.kt").v("enter");
                    if (((java.lang.Boolean) aoinVar2.a()).booleanValue()) {
                        composeViewFindViewById3.k(dgi.a);
                    }
                    composeViewFindViewById3.setVisibility(0);
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewInflate.findViewById(2131428380);
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    composeViewFindViewById3.a(new cja(-896782266, true, new lpn(pbpVarY, ((java.lang.Boolean) pbpVarY.v.a()).booleanValue() && tecVar.a(pbjVar.A()), 3)));
                }
                pbpVarY.e.b(false, (android.widget.Space) viewInflate.findViewById(2131427470), null);
                ahpr ahprVar = new ahpr(pbpVarY.q, 471, "answer_fragment_apply_window_insets_compat", new defpackage.pbk(viewInflate, pbpVarY, 0));
                int i = dzs.a;
                dzk.o(viewInflate, ahprVar);
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                if (viewInflate == null) {
                    pez.r(this, y());
                }
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

    @Override // defpackage.pbs
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
            defpackage.pbp pbpVarY = y();
            pbpVarY.H.i((java.lang.String) null).b(mce.as);
            if (!((java.lang.Boolean) pbpVarY.u.a()).booleanValue()) {
                defpackage.pac pacVarB = pbpVarY.b();
                if (pacVarB != null && pacVarB.f) {
                    pbpVarY.f.b(pbpVarY.c);
                }
                urs ursVar = pbpVarY.f;
                defpackage.pbj pbjVar = pbpVarY.c;
                ursVar.i(pbjVar);
                ursVar.e(pbjVar);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void ak(boolean z) throws aois {
        defpackage.pbp pbpVarY = y();
        pbpVarY.e.b(false, null, null);
        pbpVarY.k(pbpVarY.b());
    }

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            ahvr.x(this).a = view;
            y();
            pez.r(this, y());
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.pbp y() {
        defpackage.pbp pbpVar = this.c;
        if (pbpVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return pbpVar;
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

    @Override // defpackage.pbs
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                pbq pbqVar = (pbq) agab.aC(this, pbq.class);
                ahoq ahoqVarY = ahvr.Y(467, defpackage.pbj.class, "CreatePeer");
                try {
                    this.c = pbqVar.aT();
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

    /* JADX WARN: Type inference failed for: r5v9, types: [aonj, java.lang.Object] */
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.pbp pbpVarY = y();
            ahoq ahoqVarW = ahvr.W(469, "AnswerFragmentPeer_onCreate");
            try {
                pbpVarY.d.h(pbpVarY.B);
                if (bundle == null) {
                    pbpVarY.c().b(mce.ai);
                    aihd<defpackage.rdp> aihdVarE = pbpVarY.E.e();
                    aooh.e(aihdVarE, "get(...)");
                    for (defpackage.rdp rdpVar : aihdVarE) {
                        j$.util.Optional optionalH = ((zpm) rdpVar.b).h();
                        lwx lwxVar = new lwx(new lvd(rdpVar, 14), 5);
                        if (true == optionalH.isPresent()) {
                            lwxVar.a.a(optionalH.get());
                        }
                    }
                }
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

    @Override // defpackage.pbs
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.pbs
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
