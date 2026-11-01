package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kma extends ld {
    public static final aimz s = aimz.i("com/android/dialer/calllog/ui/ConversationHistoryViewHolder");
    public android.widget.LinearLayout A;
    public defpackage.knk B;
    public boolean C;
    public defpackage.kdc D;
    public boolean E;
    public defpackage.knb F;
    public wgi G;
    public boolean H;
    public final gpd I;
    public final rsr J;
    public final rsr K;
    private final tec L;
    private final aoin M;
    private final sou N;
    private final ssq O;
    private final ahpz P;
    private final android.widget.QuickContactBadge Q;
    private final android.widget.ImageView R;
    private final android.widget.TextView S;
    private final android.widget.TextView T;
    private final com.android.dialer.calllog.icons.container.CallLogIconContainerView U;
    private final android.widget.ImageView V;
    private final android.widget.TextView W;
    private android.widget.TextView X;
    private android.widget.TextView Y;
    private final android.view.View Z;
    private final com.android.dialer.calllog.chips.container.CallLogChipContainerView aa;
    private final android.widget.ImageView ab;
    private final ops ac;
    private final gpd ad;
    private final aeqx ae;
    private final zjm af;
    private final tkl ag;
    private final kaw ah;
    public final defpackage.kol t;
    public final kdd u;
    public final rlv v;
    public final ajct w;
    public final az x;
    public final defpackage.klc y;
    public final com.google.android.material.card.MaterialCardView z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kma(aeqx aeqxVar, defpackage.kol kolVar, tkl tklVar, kdd kddVar, rsr rsrVar, gpd gpdVar, tec tecVar, aoin aoinVar, zjm zjmVar, ops opsVar, rlv rlvVar, sou souVar, gpd gpdVar2, ssq ssqVar, rsr rsrVar2, ahpz ahpzVar, kaw kawVar, ajct ajctVar, az azVar, defpackage.klc klcVar, android.view.View view) {
        super(view);
        aooh.f(kolVar, "callLogRowActions");
        aooh.f(kddVar, "callLogUiModelAdapter");
        aooh.f(rsrVar, "chipCallbackAdapter");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aoinVar, "enableFlippablesRecentTab");
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(souVar, "phoneAccountInfoFetcher");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(ajctVar, "uiExecutor");
        aooh.f(view, "itemView");
        this.ae = aeqxVar;
        this.t = kolVar;
        this.ag = tklVar;
        this.u = kddVar;
        this.K = rsrVar;
        this.I = gpdVar;
        this.L = tecVar;
        this.M = aoinVar;
        this.af = zjmVar;
        this.ac = opsVar;
        this.v = rlvVar;
        this.N = souVar;
        this.ad = gpdVar2;
        this.O = ssqVar;
        this.J = rsrVar2;
        this.P = ahpzVar;
        this.ah = kawVar;
        this.w = ajctVar;
        this.x = azVar;
        this.y = klcVar;
        com.google.android.material.card.MaterialCardView materialCardViewFindViewById = view.findViewById(2131427661);
        com.google.android.material.card.MaterialCardView materialCardView = materialCardViewFindViewById;
        if (J()) {
            materialCardView.g(azVar.getResources().getDimension(2131167934));
        }
        aooh.e(materialCardViewFindViewById, "apply(...)");
        this.z = materialCardView;
        android.view.View viewFindViewById = view.findViewById(2131427660);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.Q = (android.widget.QuickContactBadge) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(2131429518);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.R = (android.widget.ImageView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(2131428725);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.S = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(2131428532);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.T = (android.widget.TextView) viewFindViewById4;
        this.U = (com.android.dialer.calllog.icons.container.CallLogIconContainerView) view.findViewById(2131428352);
        android.view.View viewFindViewById5 = view.findViewById(2131427714);
        aooh.e(viewFindViewById5, "findViewById(...)");
        this.V = (android.widget.ImageView) viewFindViewById5;
        android.view.View viewFindViewById6 = view.findViewById(2131428906);
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById6;
        textView.setTag(2131428318, "call_log_entry");
        aooh.e(viewFindViewById6, "apply(...)");
        this.W = textView;
        this.Z = view.findViewById(2131427760);
        this.aa = (com.android.dialer.calllog.chips.container.CallLogChipContainerView) view.findViewById(2131427657);
        android.view.View viewFindViewById7 = view.findViewById(2131427643);
        aooh.e(viewFindViewById7, "findViewById(...)");
        this.ab = (android.widget.ImageView) viewFindViewById7;
        akzx akzxVarM = defpackage.knb.a.m();
        aooh.f(akzxVarM, "builder");
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        this.F = (defpackage.knb) aladVarP;
        this.G = wsc.ac(wgi.a.m()).g();
        ahvr.f(view, defpackage.jym.class, new defpackage.kiz(this, 2));
        ahvr.f(view, defpackage.klq.class, new ahtl() { // from class: klx
            public final ahtm a(ahth ahthVar) {
                java.lang.Integer num;
                defpackage.kma kmaVar = this.a;
                if (kmaVar.J()) {
                    defpackage.klc klcVar2 = kmaVar.y;
                    klcVar2.y(kmaVar.E());
                    klcVar2.f(kmaVar.c());
                    return ahtm.b;
                }
                android.widget.LinearLayout linearLayout = kmaVar.A;
                byte[] bArr = null;
                if (linearLayout == null || linearLayout.getVisibility() != 0) {
                    defpackage.klc klcVar3 = kmaVar.y;
                    int iC = kmaVar.c();
                    defpackage.kmf kmfVar = klcVar3.e;
                    defpackage.kla klaVar = (defpackage.kla) kmfVar;
                    ld ldVarC = klaVar.c(iC);
                    if (ldVarC != null) {
                        defpackage.kme kmeVar = klaVar.e;
                        java.lang.Integer numValueOf = kmeVar != null ? java.lang.Integer.valueOf(kmeVar.a) : null;
                        if (numValueOf != null && numValueOf.intValue() != iC) {
                            klaVar.e(numValueOf.intValue());
                        }
                        defpackage.hsh hshVar = klaVar.f;
                        if (!hshVar.isRunning() && ((num = klaVar.i) == null || num.intValue() != iC)) {
                            klaVar.d.n(rmw.hK);
                            klaVar.j.i((java.lang.String) null).b(mce.dc);
                            defpackage.kma kmaVar2 = (defpackage.kma) ldVarC;
                            android.widget.LinearLayout linearLayoutC = kmaVar2.C();
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) linearLayoutC.findViewById(2131427408);
                            defpackage.klb klbVar = new defpackage.klb(kmaVar2.E());
                            android.view.View viewFindViewById8 = ldVarC.a.findViewById(2131428555);
                            aooh.e(viewFindViewById8, "findViewById(...)");
                            ((com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView) viewFindViewById8).y().b(klbVar);
                            defpackage.kno.b(kmaVar2.x, linearLayout2, kmaVar2.E(), kmaVar2.F(), kmaVar2.G);
                            defpackage.kmd kmdVar = new defpackage.kmd();
                            kmdVar.c(kmaVar2.c());
                            kmdVar.b(kmaVar2.E().d);
                            klaVar.e = kmdVar.a();
                            linearLayoutC.setVisibility(8);
                            hshVar.d();
                            defpackage.kkx kkxVarD = klaVar.d(ldVarC);
                            hshVar.k(new defpackage.mo(ldVarC, kmfVar, iC, 6, null));
                            float fA = klaVar.a(ldVarC);
                            android.view.View view2 = kkxVarD.d.b;
                            defpackage.hgu.E(hshVar, view2, 0.0f, fA);
                            defpackage.hsh hshVarB = defpackage.hgu.B(hshVar, view2);
                            hshVarB.i(new defpackage.ioi(view2, 14));
                            defpackage.kkw kkwVar = kkxVarD.b;
                            if (kkwVar != null) {
                                defpackage.kkw kkwVar2 = kkxVarD.c;
                                android.view.View view3 = kkwVar.b;
                                float fA2 = kkwVar2 != null ? -view3.getHeight() : klaVar.a(ldVarC);
                                defpackage.hgu.E(hshVarB, view3, 0.0f, fA2);
                                hshVarB = defpackage.hgu.B(hshVarB, view3);
                                hshVarB.i(new defpackage.jnv(view3, kkxVarD, 10, bArr));
                                if (kkwVar2 != null) {
                                    defpackage.hgu.E(hshVarB, kkwVar2.b, 0.0f, fA2);
                                }
                            }
                            float fA3 = klaVar.a(ldVarC);
                            defpackage.kkw kkwVar3 = kkxVarD.c;
                            float fA4 = kkwVar3 != null ? kkwVar3.a() : 0;
                            defpackage.kkw kkwVar4 = kkxVarD.e;
                            defpackage.kkw kkwVar5 = kkxVarD.f;
                            kkwVar5.b.getLayoutParams().height = kkwVar5.c;
                            hshVarB.k(new defpackage.jnv(ldVarC, kkxVarD, 5, bArr));
                            android.view.View view4 = kkwVar4.b;
                            defpackage.hgu.D(hshVarB, view4, 0.0f, kkwVar4.c);
                            defpackage.hgu.E(hshVarB, view4, fA4 - fA3, fA4);
                            defpackage.hsh hshVarA = defpackage.hgu.A(hshVarB, view4);
                            hshVarA.i(new defpackage.jnv(kkxVarD, ldVarC, 6));
                            hshVarA.h(new defpackage.kkv(ldVarC, kkxVarD, 1));
                            hshVarA.i(new defpackage.jnv(kmfVar, ldVarC, 3));
                            hshVarA.setDuration(wsc.bp(klaVar.b(), urp.f)).start();
                        }
                    }
                    klcVar3.y(kmaVar.E());
                } else {
                    defpackage.klc klcVar4 = kmaVar.y;
                    klcVar4.e.e(kmaVar.c());
                    akzx akzxVarZ = klcVar4.z();
                    akzxVarZ.u();
                    defpackage.knb knbVar = (defpackage.knb) akzxVarZ.b;
                    defpackage.knb knbVar2 = defpackage.knb.a;
                    knbVar.c = null;
                    knbVar.b &= -2;
                    akzx akzxVarZ2 = klcVar4.z();
                    akzxVarZ2.u();
                    defpackage.knb knbVar3 = (defpackage.knb) akzxVarZ2.b;
                    knbVar3.e = null;
                    knbVar3.b &= -9;
                }
                return ahtm.a;
            }
        });
    }

    private final boolean L() {
        return this.N.a() <= 1;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    private final boolean M() {
        boolean z;
        defpackage.kme kmeVar = ((defpackage.kla) this.y.e).e;
        if (kmeVar != null) {
            if (kmeVar.a == c() && kmeVar.b == E().d) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!J()) {
            if (z) {
                return true;
            }
            defpackage.knb knbVar = this.F;
            if ((knbVar.b & 1) != 0) {
                defpackage.kna knaVar = knbVar.c;
                if (knaVar == null) {
                    knaVar = defpackage.kna.a;
                }
                kiu kiuVar = knaVar.c;
                if (kiuVar == null) {
                    kiuVar = kiu.a;
                }
                if (kiuVar.d == E().d) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean N() {
        return E().q == 3 && !E().j;
    }

    public final android.widget.LinearLayout C() {
        android.widget.LinearLayout linearLayout = this.A;
        if (linearLayout != null) {
            return linearLayout;
        }
        android.view.View viewInflate = ((android.view.ViewStub) this.a.findViewById(2131428553)).inflate();
        aooh.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewInflate;
        this.A = linearLayout2;
        return linearLayout2;
    }

    public final kgu D(kiu kiuVar) {
        j$.util.Optional optionalG = this.af.g();
        aooh.e(optionalG, "getFeature(...)");
        kgz kgzVar = (kgz) aooh.q(optionalG);
        if (kgzVar != null) {
            return kgzVar.b(kiuVar);
        }
        return null;
    }

    public final kiu E() {
        defpackage.kdc kdcVar = this.D;
        if (kdcVar == null) {
            aooh.j("callLogUiModel");
            kdcVar = null;
        }
        return kdcVar.a;
    }

    public final tcp F() {
        tcp tcpVar = this.y.f.b;
        aooh.e(tcpVar, "getRttConfiguration(...)");
        return tcpVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Type inference failed for: r8v45, types: [aoss, java.lang.Object] */
    public final void G() {
        boolean z;
        android.view.View view;
        android.widget.TextView textView;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.View view2;
        java.lang.CharSequence charSequenceExpandTemplate;
        int i;
        int i2;
        java.lang.CharSequence charSequenceExpandTemplate2;
        az azVar = this.x;
        if (azVar.isDestroyed()) {
            return;
        }
        byte[] bArr = null;
        this.B = null;
        int i3 = 1;
        boolean z2 = ((java.lang.Boolean) this.M.a()).booleanValue() && this.L.a(azVar);
        aeqx aeqxVar = this.ae;
        java.lang.CharSequence charSequenceD = aeqxVar.d(E(), true);
        android.widget.TextView textView2 = this.S;
        textView2.setText(charSequenceD);
        android.widget.TextView textView3 = this.W;
        textView3.setText(mni.be() ? aeqxVar.h(E()) : aeqxVar.g(E()));
        if (N()) {
            int i4 = z2 ? 2132086256 : 2132086255;
            int i5 = z2 ? 2132086293 : 2132086292;
            textView2.setTextAppearance(i4);
            textView2.setTypeface(textView2.getTypeface(), 1);
            textView3.setTextAppearance(i5);
            android.widget.TextView textView4 = this.T;
            textView4.setTextAppearance(i4);
            textView4.setTypeface(textView4.getTypeface(), 1);
        } else {
            int i6 = z2 ? 2132086254 : 2132086253;
            int i7 = z2 ? 2132086291 : 2132086290;
            textView2.setTextAppearance(i6);
            textView3.setTextAppearance(i7);
            this.T.setTextAppearance(i6);
            textView2.setTextColor(urg.c(azVar, 2130969053));
            textView3.setTextColor(urg.c(azVar, 2130969057));
        }
        if (E().q != 3) {
            kiu kiuVarE = E();
            tkl tklVar = this.ag;
            if (tklVar.t(kiuVarE) || tklVar.v(kiuVarE) || E().q == 5) {
                textView3.setTextColor(urg.c(azVar, 2130968953));
            }
        } else {
            textView3.setTextColor(urg.c(azVar, 2130968953));
        }
        ops opsVar = this.ac;
        android.widget.QuickContactBadge quickContactBadge = this.Q;
        opsVar.h(quickContactBadge, this.ad.a(E(), 1).p(), true);
        android.widget.ImageView imageView = this.R;
        defpackage.kiw kiwVar = E().r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        imageView.setVisibility(true != kiwVar.s ? 8 : 0);
        imageView.setImageResource(2131232012);
        defpackage.kis kisVar = E().u;
        if (kisVar == null) {
            kisVar = defpackage.kis.a;
        }
        int size = kisVar.b.size();
        android.widget.TextView textView5 = this.T;
        if (size > 1) {
            java.lang.String str = java.lang.String.format(java.util.Locale.getDefault(), "(%d)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
            aooh.e(str, "format(...)");
            textView5.setText(str);
            textView5.setVisibility(0);
        } else {
            textView5.setVisibility(8);
        }
        aooh.c(charSequenceD);
        kiu kiuVarE2 = E();
        boolean z3 = !this.ah.t(kiuVarE2) && (this.O.c(kiuVarE2.g, kiuVarE2.i) || D(kiuVarE2) != null);
        android.widget.ImageView imageView2 = this.ab;
        imageView2.setVisibility(true != z3 ? 8 : 0);
        char c = 2;
        if (z3) {
            int i8 = E().o & 1;
            int i9 = E().o & 32;
            kgu kguVarD = D(E());
            if (i8 != 0) {
                boolean z4 = !this.E && this.G.d;
                if (z4) {
                    i = 2132017230;
                    i2 = 2131231081;
                } else {
                    i = 2132017229;
                    i2 = 2131231080;
                }
                imageView2.setImageResource(i2);
                if (kguVarD != null) {
                    charSequenceExpandTemplate2 = azVar.getString(2132018860, new java.lang.Object[]{charSequenceD, kguVarD.e});
                    aooh.e(charSequenceExpandTemplate2, "getString(...)");
                } else {
                    charSequenceExpandTemplate2 = android.text.TextUtils.expandTemplate(azVar.getResources().getText(i), charSequenceD);
                    kguVarD = null;
                }
                imageView2.setContentDescription(charSequenceExpandTemplate2);
                imageView2.setOnClickListener(new ahpp(this.P, 207, "ConversationHistoryViewHolder_callButton_startVideoCall", new defpackage.maq(kguVarD, this, z4, 1), 0));
                z = false;
            } else {
                z = false;
                if (F() == tcp.e || i9 != 32) {
                    boolean z5 = this.G.c;
                    int i10 = true != z5 ? 2132017231 : 2132017232;
                    imageView2.setImageResource(true != z5 ? 2131231060 : 2131231083);
                    if (kguVarD != null) {
                        charSequenceExpandTemplate = azVar.getString(2132018861, new java.lang.Object[]{charSequenceD, kguVarD.e});
                        aooh.e(charSequenceExpandTemplate, "getString(...)");
                    } else {
                        charSequenceExpandTemplate = android.text.TextUtils.expandTemplate(azVar.getResources().getText(i10), charSequenceD);
                    }
                    imageView2.setContentDescription(charSequenceExpandTemplate);
                    imageView2.setOnClickListener(new defpackage.jln(this, 15, bArr));
                } else {
                    imageView2.setImageResource(2131232047);
                    imageView2.setContentDescription(android.text.TextUtils.expandTemplate(azVar.getResources().getText(2132017227), charSequenceD));
                    imageView2.setOnClickListener(new defpackage.jln(this, 14, bArr));
                }
            }
        } else {
            z = false;
        }
        android.widget.ImageView imageView3 = this.V;
        imageView3.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(azVar, 2130968958)));
        int i11 = 2131231343;
        switch (E().q) {
            case 1:
            case 7:
                i11 = 2131231344;
                break;
            case 2:
                i11 = 2131231341;
                break;
            case 3:
            case 5:
                imageView3.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(azVar, 2130968953)));
                break;
            case 4:
                throw new java.lang.IllegalStateException("Voicemails not expected in call log");
            case 6:
                i11 = 2131231319;
                break;
            default:
                imageView3.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(azVar, 2130968953)));
                break;
        }
        imageView3.setImageResource(i11);
        if (z2) {
            quickContactBadge.setClickable(z);
        } else {
            if (L()) {
                android.widget.TextView textView6 = this.Y;
                if (textView6 != null) {
                    textView6.setVisibility(8);
                }
            } else if (D(E()) != null) {
                android.widget.TextView textView7 = this.Y;
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
            } else {
                j$.util.Optional optionalB = this.N.b(E().m, E().n);
                aooh.e(optionalB, "getPhoneAccountInfo(...)");
                sot sotVar = (sot) aooh.q(optionalB);
                android.widget.TextView textView8 = this.Y;
                if (sotVar != null) {
                    if (textView8 == null) {
                        android.view.View viewInflate = ((android.view.ViewStub) this.a.findViewById(2131428668)).inflate();
                        aooh.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                        this.Y = (android.widget.TextView) viewInflate;
                    }
                    int iC = sotVar.d;
                    if (iC == 0) {
                        iC = urg.c(azVar, android.R.attr.textColorSecondary);
                    }
                    android.widget.TextView textView9 = this.Y;
                    if (textView9 != null) {
                        textView9.setText(sotVar.c);
                    }
                    android.widget.TextView textView10 = this.Y;
                    if (textView10 != null) {
                        textView10.setTextColor(iC);
                    }
                    android.widget.TextView textView11 = this.Y;
                    if (textView11 != null) {
                        textView11.setVisibility(0);
                    }
                    android.widget.TextView textView12 = this.Y;
                    if (textView12 != null) {
                        textView12.setTextAppearance(true != N() ? 2132086250 : 2132086251);
                    }
                } else if (textView8 != null) {
                    textView8.setVisibility(8);
                }
            }
            M();
            K();
            defpackage.kdc kdcVar = this.D;
            if (kdcVar == null) {
                aooh.j("callLogUiModel");
                kdcVar = null;
            }
            this.H = !kdcVar.c.isEmpty();
            com.android.dialer.calllog.chips.container.CallLogChipContainerView callLogChipContainerView = this.aa;
            aooh.c(callLogChipContainerView);
            defpackage.jyn jynVarY = callLogChipContainerView.y();
            kiu kiuVarE3 = E();
            defpackage.kdc kdcVar2 = this.D;
            if (kdcVar2 == null) {
                aooh.j("callLogUiModel");
                kdcVar2 = null;
            }
            aooh.f(kiuVarE3, "coalescedRow");
            java.util.List<defpackage.jyh> list = kdcVar2.c;
            int size2 = list.size();
            while (jynVarY.a() < size2) {
                com.android.dialer.calllog.chips.container.CallLogChipContainerView.inflate((android.content.Context) jynVarY.d, 2131624001, (android.view.ViewGroup) jynVarY.c);
            }
            for (int i12 = 0; i12 < size2; i12++) {
                jynVarY.b(i12).setVisibility(0);
            }
            int iA = jynVarY.a();
            while (size2 < iA) {
                jynVarY.b(size2).setVisibility(8);
                size2++;
            }
            int i13 = 0;
            for (defpackage.jyh jyhVar : list) {
                int i14 = i13 + 1;
                defpackage.jyd jydVar = jyhVar.a;
                com.google.android.material.chip.Chip chipB = jynVarY.b(i13);
                java.lang.Object obj = jynVarY.d;
                char c2 = c;
                java.lang.Integer num = jydVar.c;
                int iC2 = urg.c((android.content.Context) obj, 2130969053);
                if (num != null) {
                    iC2 = num.intValue();
                }
                chipB.k(jydVar.a);
                defpackage.jlr jlrVar = jydVar.f;
                int iZ = anty.Z(jlrVar);
                if (iZ == 0) {
                    chipB.setText(((defpackage.jyk) jlrVar).a);
                } else {
                    if (iZ != 1) {
                        throw new aois();
                    }
                    chipB.setText(((defpackage.jyj) jlrVar).a);
                }
                chipB.setTag(2131428318, jydVar.b);
                chipB.l(android.content.res.ColorStateList.valueOf(iC2));
                ((ajwr) jynVarY.b).g(chipB, new defpackage.jym(kiuVarE3, jyhVar));
                i13 = i14;
                c = c2;
            }
            defpackage.kdc kdcVar3 = this.D;
            if (kdcVar3 == null) {
                aooh.j("callLogUiModel");
                kdcVar3 = null;
            }
            for (defpackage.jyh jyhVar2 : kdcVar3.c) {
                rsr rsrVar = this.K;
                aooh.f(jyhVar2, "chipWithKey");
                defpackage.jyf jyfVar = jyhVar2.b;
                agsm.i(208, aosv.F((aoss) rsrVar.a, 0, new defpackage.kqd(rsrVar.V(jyfVar), jyhVar2, (aoln) null, 1), 3), "exception when calling CallLogChipIntegration#onShown() for %s", new java.lang.Object[]{jyfVar});
            }
            if (M()) {
                defpackage.klc klcVar = this.y;
                defpackage.kmd kmdVar = new defpackage.kmd();
                kmdVar.c(c());
                kmdVar.b(E().d);
                ((defpackage.kla) klcVar.e).e = kmdVar.a();
                defpackage.klb klbVar = new defpackage.klb(E());
                ((com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView) C().findViewById(2131428555)).y().b(klbVar);
                defpackage.kno.b(azVar, (android.view.ViewGroup) C().findViewById(2131427408), klbVar.a, F(), this.G);
                if (this.H && (view2 = this.Z) != null) {
                    view2.setVisibility(8);
                }
                C().setVisibility(0);
                C().setAlpha(1.0f);
                C().getLayoutParams().width = -1;
                C().getLayoutParams().height = -2;
            } else {
                android.widget.LinearLayout linearLayout = this.A;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                this.z.i();
                if (this.H && (view = this.Z) != null) {
                    view.setVisibility(0);
                    view.setAlpha(1.0f);
                }
            }
            defpackage.kod kodVarU = this.J.U(E());
            android.widget.TextView textView13 = this.X;
            if (kodVarU != null) {
                if (textView13 == null) {
                    android.view.View viewInflate2 = ((android.view.ViewStub) this.a.findViewById(2131428244)).inflate();
                    aooh.d(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
                    textView13 = (android.widget.TextView) viewInflate2;
                    this.X = textView13;
                }
                if (textView13 != null) {
                    textView13.setText(kodVarU.a);
                }
                android.widget.TextView textView14 = this.X;
                if (textView14 != null) {
                    textView14.setTextAppearance(kodVarU.b);
                }
                android.widget.TextView textView15 = this.X;
                if (textView15 != null) {
                    textView15.setVisibility(true != M() ? 0 : 8);
                }
                android.widget.TextView textView16 = this.X;
                if (textView16 != null && textView16.getVisibility() == 0) {
                    android.widget.TextView textView17 = this.X;
                    if (textView17 != null) {
                        textView17.setAlpha(1.0f);
                    }
                    android.widget.TextView textView18 = this.X;
                    if (textView18 != null) {
                        textView18.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.z.getWidth(), 1073741824), 0);
                    }
                    android.widget.TextView textView19 = this.X;
                    if (textView19 != null) {
                        int measuredHeight = textView19.getMeasuredHeight();
                        android.widget.TextView textView20 = this.X;
                        if (textView20 == null || measuredHeight != textView20.getHeight()) {
                            android.widget.TextView textView21 = this.X;
                            if (textView21 != null && (layoutParams = textView21.getLayoutParams()) != null) {
                                layoutParams.height = measuredHeight;
                            }
                            this.z.requestLayout();
                        }
                    }
                }
                if (N() && (textView = this.X) != null) {
                    textView.setTypeface(textView.getTypeface(), 3);
                }
            } else if (textView13 != null) {
                textView13.setVisibility(8);
            }
        }
        android.view.View view3 = this.a;
        if (z2) {
            defpackage.koj kojVar = new defpackage.koj(azVar, E());
            kojVar.a = !L();
            view3.setContentDescription(kojVar.a());
            return;
        }
        defpackage.koj kojVar2 = new defpackage.koj(azVar, E());
        kojVar2.a = !L();
        java.lang.String strS = defpackage.hgu.s(azVar, E());
        aooh.c(strS);
        java.lang.String strSubstring = strS.substring(0, java.lang.Math.min(strS.length(), 120));
        aooh.e(strSubstring, "substring(...)");
        kojVar2.c(strSubstring);
        defpackage.kdc kdcVar4 = this.D;
        if (kdcVar4 == null) {
            aooh.j("callLogUiModel");
            kdcVar4 = null;
        }
        kojVar2.b(ahvr.bv(kdcVar4.b));
        view3.setContentDescription(kojVar2.a());
        view3.setAccessibilityDelegate(new defpackage.klz(this));
        view3.setOnClickListener(new defpackage.jln(this, 16, null));
        view3.setOnTouchListener(new defpackage.klw(this, 0));
        view3.setOnLongClickListener(new defpackage.lmf(this, i3));
        if (this.C) {
            return;
        }
        defpackage.knb knbVar = this.F;
        if ((knbVar.b & 2) != 0) {
            defpackage.kmy kmyVar = knbVar.d;
            if (kmyVar == null) {
                kmyVar = defpackage.kmy.a;
            }
            if (kmyVar.d == E().d) {
                view3.post(new defpackage.ioi(this, 19));
            }
        }
    }

    public final void H(mce mceVar) {
        this.I.i((java.lang.String) null).b(mceVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    public final void I() {
        defpackage.knk knkVar = this.B;
        int i = 2;
        if (knkVar == null) {
            android.view.View view = this.a;
            defpackage.knb knbVar = this.F;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            defpackage.kmy kmyVar = knbVar.d;
            if (kmyVar == null) {
                kmyVar = defpackage.kmy.a;
            }
            defpackage.kmz kmzVar = kmyVar.e;
            if (kmzVar == null) {
                kmzVar = defpackage.kmz.a;
            }
            if ((kmzVar.b & 1) == 0) {
                defpackage.knm.a.b().l("com/android/dialer/calllog/ui/menu/CallLogPopupMenu", "restoreAnchorPointFromSavedPageState", 126, "CallLogPopupMenu.java").v("unable to restore popupMenuAnchorPoint from savedPageState");
                knkVar = new defpackage.knk(iArr[0] + (view.getWidth() / 2), iArr[1] + view.getHeight());
            } else {
                defpackage.kmy kmyVar2 = knbVar.d;
                defpackage.kmz kmzVar2 = (kmyVar2 == null ? defpackage.kmy.a : kmyVar2).e;
                if (kmzVar2 == null) {
                    kmzVar2 = defpackage.kmz.a;
                }
                if ((kmzVar2.b & 2) != 0) {
                    if (kmyVar2 == null) {
                        kmyVar2 = defpackage.kmy.a;
                    }
                    defpackage.kmz kmzVar3 = kmyVar2.e;
                    if (kmzVar3 == null) {
                        kmzVar3 = defpackage.kmz.a;
                    }
                    knkVar = new defpackage.knk((int) (iArr[0] + (view.getWidth() * kmzVar3.c)), (int) (iArr[1] + (view.getHeight() * kmzVar3.d)));
                } else {
                    defpackage.knm.a.b().l("com/android/dialer/calllog/ui/menu/CallLogPopupMenu", "restoreAnchorPointFromSavedPageState", 126, "CallLogPopupMenu.java").v("unable to restore popupMenuAnchorPoint from savedPageState");
                    knkVar = new defpackage.knk(iArr[0] + (view.getWidth() / 2), iArr[1] + view.getHeight());
                }
            }
            this.B = knkVar;
        }
        defpackage.klc klcVar = this.y;
        android.view.View view2 = this.a;
        long j = E().d;
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        akzx akzxVarZ = klcVar.z();
        akzx akzxVarM = defpackage.kmy.a.m();
        int iC = c();
        akzxVarM.u();
        defpackage.kmy kmyVar3 = (defpackage.kmy) akzxVarM.b;
        kmyVar3.b |= 1;
        kmyVar3.c = iC;
        akzxVarM.u();
        defpackage.kmy kmyVar4 = (defpackage.kmy) akzxVarM.b;
        kmyVar4.b |= 2;
        kmyVar4.d = j;
        akzx akzxVarM2 = defpackage.kmz.a.m();
        int i2 = iArr2[0];
        int i3 = knkVar.a;
        float width = view2.getWidth();
        akzxVarM2.u();
        defpackage.kmz kmzVar4 = (defpackage.kmz) akzxVarM2.b;
        kmzVar4.b |= 1;
        kmzVar4.c = (i3 - i2) / width;
        int i4 = iArr2[1];
        int i5 = knkVar.b;
        float height = view2.getHeight();
        akzxVarM2.u();
        defpackage.kmz kmzVar5 = (defpackage.kmz) akzxVarM2.b;
        kmzVar5.b |= 2;
        kmzVar5.d = (i5 - i4) / height;
        akzxVarM.u();
        defpackage.kmy kmyVar5 = (defpackage.kmy) akzxVarM.b;
        defpackage.kmz kmzVar6 = (defpackage.kmz) akzxVarM2.p();
        j$.util.Objects.requireNonNull(kmzVar6);
        kmyVar5.e = kmzVar6;
        kmyVar5.b |= 4;
        akzxVarZ.u();
        defpackage.knb knbVar2 = (defpackage.knb) akzxVarZ.b;
        defpackage.kmy kmyVar6 = (defpackage.kmy) akzxVarM.p();
        defpackage.knb knbVar3 = defpackage.knb.a;
        j$.util.Objects.requireNonNull(kmyVar6);
        knbVar2.d = kmyVar6;
        knbVar2.b |= 2;
        az azVar = this.x;
        kiu kiuVarE = E();
        defpackage.kd kdVar = new defpackage.kd(this, i, null);
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        defpackage.abxx abxxVar = new defpackage.abxx(azVar);
        android.view.View viewInflate = android.view.LayoutInflater.from(azVar).inflate(2131624058, (android.view.ViewGroup) null);
        android.support.v7.widget.AppCompatTextView appCompatTextViewFindViewById = viewInflate.findViewById(2131427669);
        defpackage.kiw kiwVar = kiuVarE.r;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        j$.util.Optional optionalEmpty2 = kiwVar.r ? j$.util.Optional.empty() : ((kiuVarE.s && !kiuVarE.t.isEmpty()) || kiuVarE.h.isEmpty() || defpackage.hgu.v(azVar).oS().r(kiuVarE.i).isPresent()) ? j$.util.Optional.empty() : j$.util.Optional.of(kiuVarE.h);
        if (optionalEmpty2.isPresent()) {
            appCompatTextViewFindViewById.setText(pez.aq(azVar, (java.lang.CharSequence) optionalEmpty2.orElseThrow()));
            appCompatTextViewFindViewById.setVisibility(0);
        } else {
            appCompatTextViewFindViewById.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewInflate.findViewById(2131427666);
        gou gouVarJB = defpackage.hgu.v(azVar).jB();
        defpackage.orc orcVar = new defpackage.orc(azVar, gouVarJB.d(kiuVarE));
        if (((ssq) gouVarJB.a).c(kiuVarE.g, kiuVarE.i)) {
            orcVar.i();
            orcVar.k();
            orcVar.j(((aeqx) gouVarJB.b).d(kiuVarE, true).toString(), azVar, kiuVarE);
            tkl tklVar = (tkl) gouVarJB.d;
            if (tklVar.t(kiuVarE) || tklVar.u(kiuVarE)) {
                orcVar.d();
            } else {
                orcVar.q(11);
            }
        }
        orcVar.e(azVar, kiuVarE);
        orcVar.g(azVar, kiuVarE);
        orcVar.f(azVar, kiuVarE);
        orcVar.h(azVar, kiuVarE);
        java.util.List<defpackage.oqx> listA = orcVar.a();
        listA.add(gou.c(azVar, kiuVarE));
        optionalEmpty.isPresent();
        j$.util.Objects.requireNonNull(listA);
        optionalEmpty.isPresent();
        for (defpackage.oqx oqxVar : listA) {
            android.view.View viewInflate2 = android.view.LayoutInflater.from(azVar).inflate(2131624059, (android.view.ViewGroup) linearLayout, false);
            ((android.widget.ImageView) viewInflate2.findViewById(2131427667)).setImageResource(oqxVar.a());
            ((android.widget.TextView) viewInflate2.findViewById(2131427668)).setText(oqxVar.b());
            oqxVar.d();
            viewInflate2.setEnabled(true);
            viewInflate2.setOnClickListener(new defpackage.knj(oqxVar, view2, abxxVar, 0));
            linearLayout.addView(viewInflate2);
        }
        abxxVar.setContentView(viewInflate);
        abxxVar.setBackgroundDrawable(azVar.getDrawable(2131230956));
        abxxVar.setElevation(azVar.getResources().getDimensionPixelSize(2131165421));
        abxxVar.setFocusable(true);
        abxxVar.setOutsideTouchable(true);
        abxxVar.setOnDismissListener(kdVar);
        abxxVar.showAtLocation(view2, 0, i3, i5);
        defpackage.hgu.v(azVar).bt().n(rmw.hL);
        defpackage.hgu.v(azVar).nJ().i((java.lang.String) null).b(mce.dh);
        this.C = true;
        this.B = null;
    }

    public final boolean J() {
        return rhx.b(this.x);
    }

    public final void K() {
        int integer = this.x.getResources().getInteger(2131493002);
        defpackage.kdc kdcVar = this.D;
        if (kdcVar == null) {
            aooh.j("callLogUiModel");
            kdcVar = null;
        }
        com.android.dialer.calllog.icons.container.CallLogIconContainerView callLogIconContainerView = this.U;
        aooh.c(callLogIconContainerView);
        callLogIconContainerView.a(ahvr.bv(kdcVar.b), N(), java.lang.Integer.valueOf(integer));
    }
}
