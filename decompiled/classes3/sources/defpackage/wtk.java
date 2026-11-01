package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wtk {
    public static final aimz a = aimz.i("com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer");
    public defpackage.ahak C;
    public defpackage.ahak D;
    public final defpackage.agzc E;
    public final odo F;
    public final aoin G;
    public final zpm J;
    public final gpd K;
    public final defpackage.afpl L;
    public den M;
    private final ems N;
    private final aoin O;
    private final aoin P;
    private boolean Q;
    private final aoin T;
    private final zzx U;
    public final defpackage.pnb b;
    public final ruc c;
    public final agtj d;
    public final defpackage.wsx e;
    public final defpackage.wto f;
    public final defpackage.wsb g;
    public final defpackage.wtv h;
    public final ahpz i;
    public final defpackage.wsa j;
    public final defpackage.wsg k;
    public final defpackage.wsf l;
    public final defpackage.wsm m;
    public final defpackage.wtz n;
    public final defpackage.wug o;
    public final defpackage.wrz p;
    public final defpackage.wuc q;
    public final defpackage.wsw r;
    public final defpackage.wsi s;
    public final defpackage.whs t;
    public boolean x;
    public boolean y;
    public final agtk u = new defpackage.wta(this);
    public final agtk v = new defpackage.wtb(this);
    public final na w = new defpackage.wtj(this);
    public int I = 1;
    private j$.util.Optional R = j$.util.Optional.empty();
    private j$.util.Optional S = j$.util.Optional.empty();
    public j$.util.Optional z = j$.util.Optional.empty();
    public j$.util.Optional A = j$.util.Optional.empty();
    public j$.util.Optional B = j$.util.Optional.empty();
    final odm H = new defpackage.quy(this, 18);

    public wtk(defpackage.pnb pnbVar, defpackage.afpl afplVar, ems emsVar, ruc rucVar, agtj agtjVar, zzx zzxVar, defpackage.wsx wsxVar, aoin aoinVar, defpackage.wto wtoVar, defpackage.wsb wsbVar, defpackage.wtv wtvVar, ahpz ahpzVar, defpackage.wsa wsaVar, defpackage.wsg wsgVar, defpackage.wsf wsfVar, defpackage.wsm wsmVar, defpackage.wug wugVar, defpackage.wtz wtzVar, defpackage.wrz wrzVar, defpackage.wuc wucVar, defpackage.wsw wswVar, defpackage.wsi wsiVar, defpackage.whs whsVar, aoin aoinVar2, gpd gpdVar, zpm zpmVar, aoin aoinVar3, defpackage.agzc agzcVar, odo odoVar, aoin aoinVar4) {
        this.b = pnbVar;
        this.L = afplVar;
        this.N = emsVar;
        this.c = rucVar;
        this.d = agtjVar;
        this.U = zzxVar;
        this.e = wsxVar;
        this.f = wtoVar;
        this.O = aoinVar;
        this.g = wsbVar;
        this.h = wtvVar;
        this.i = ahpzVar;
        this.j = wsaVar;
        this.m = wsmVar;
        this.n = wtzVar;
        this.p = wrzVar;
        this.o = wugVar;
        this.q = wucVar;
        this.r = wswVar;
        this.s = wsiVar;
        this.k = wsgVar;
        this.l = wsfVar;
        this.t = whsVar;
        this.P = aoinVar2;
        this.J = zpmVar;
        this.K = gpdVar;
        this.T = aoinVar3;
        this.E = agzcVar;
        this.F = odoVar;
        this.G = aoinVar4;
    }

    public static void h(com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton) {
        floatingActionButton.d(new defpackage.wtg(), true);
    }

    public static void j(android.support.v7.widget.RecyclerView recyclerView) {
        kh khVar = recyclerView.m;
        if (khVar != null) {
            recyclerView.W(khVar.a() - 1);
        }
    }

    private static int v(android.view.View view) {
        int height = view.getHeight();
        if (height != 0) {
            return height;
        }
        view.measure(0, 0);
        int measuredHeight = view.getMeasuredHeight();
        view.setTranslationY(measuredHeight);
        return measuredHeight;
    }

    private final android.animation.Animator w(final android.support.v7.widget.RecyclerView recyclerView, int i) {
        final dtv layoutParams = recyclerView.getLayoutParams();
        android.animation.ValueAnimator valueAnimatorOfInt = android.animation.ValueAnimator.ofInt(layoutParams.bottomMargin, i);
        android.support.v7.widget.LinearLayoutManager linearLayoutManager = recyclerView.n;
        final int iM = linearLayoutManager == null ? -1 : linearLayoutManager.M();
        valueAnimatorOfInt.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: wsz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                dtv dtvVar = layoutParams;
                dtvVar.setMargins(dtvVar.leftMargin, dtvVar.topMargin, dtvVar.rightMargin, ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
                int i2 = this.a.I;
                android.support.v7.widget.RecyclerView recyclerView2 = recyclerView;
                if (i2 == 2) {
                    defpackage.wtk.j(recyclerView2);
                } else {
                    recyclerView2.W(iM);
                }
            }
        });
        return valueAnimatorOfInt;
    }

    private final defpackage.agby x(int i, int i2) {
        defpackage.agby agbyVarO = defpackage.agby.o(this.e.N(), i, i2);
        android.view.View viewFindViewById = agbyVarO.h.findViewById(2131427761);
        if (viewFindViewById == null) {
            throw new java.lang.IllegalArgumentException("Unable to find anchor view with id: 2131427761");
        }
        agbyVarO.m(viewFindViewById);
        agbyVarO.t = (com.google.android.material.snackbar.BaseTransientBottomBar$Behavior) this.P.a();
        return agbyVarO;
    }

    private final j$.util.Optional y(java.lang.String str) {
        al alVarE = this.e.I().e(str);
        if (alVarE == null) {
            return j$.util.Optional.empty();
        }
        return !(alVarE instanceof al) ? j$.util.Optional.empty() : j$.util.Optional.of(alVarE);
    }

    private final void z() {
        j$.util.Optional optional = this.R;
        if (true == optional.isPresent()) {
            ((android.animation.AnimatorSet) optional.get()).cancel();
        }
        j$.util.Optional optional2 = this.S;
        if (true == optional2.isPresent()) {
            ((android.animation.AnimatorSet) optional2.get()).cancel();
        }
    }

    public final j$.util.Optional a() {
        return j$.util.Optional.ofNullable(this.e.I().e("bottom_sheet_tag"));
    }

    public final j$.util.Optional b() {
        j$.util.Optional optional = this.z;
        zzx zzxVar = this.U;
        j$.util.Objects.requireNonNull(zzxVar);
        xbz xbzVar = new xbz(zzxVar, 1);
        if (true != optional.isPresent()) {
            return optional;
        }
        java.lang.Object obj = optional.get();
        j$.util.Optional optionalE = ((zpm) ((zzx) xbzVar.a).a).e(((defpackage.wlc) obj).c);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(((defpackage.wkt) ((defpackage.apqr) optionalE.get()).a(defpackage.wkt.class)).aV());
        }
        j$.util.Optional optional2 = optionalE;
        optional2.getClass();
        return optional2;
    }

    public final j$.util.Optional c() {
        if (!a().isPresent()) {
            return j$.util.Optional.empty();
        }
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(this.e.N().findViewById(2131427589));
        bottomSheetBehaviorH.s(true);
        bottomSheetBehaviorH.w = true;
        bottomSheetBehaviorH.i(new defpackage.wth(this));
        return j$.util.Optional.of(bottomSheetBehaviorH);
    }

    public final j$.util.Optional d() {
        j$.util.Optional optional = this.z;
        zzx zzxVar = this.U;
        j$.util.Objects.requireNonNull(zzxVar);
        defpackage.vmu vmuVar = new defpackage.vmu(zzxVar, 20);
        if (true != optional.isPresent()) {
            return optional;
        }
        java.lang.Object obj = optional.get();
        j$.util.Optional optionalE = ((zpm) ((zzx) vmuVar.a).a).e(((defpackage.wlc) obj).c);
        if (true == optionalE.isPresent()) {
            optionalE = j$.util.Optional.ofNullable(((defpackage.wkt) ((defpackage.apqr) optionalE.get()).a(defpackage.wkt.class)).aW());
        }
        j$.util.Optional optional2 = optionalE;
        optional2.getClass();
        return optional2;
    }

    public final void e(defpackage.wre wreVar) {
        j$.util.Optional optionalD = d();
        defpackage.wlm wlmVar = new defpackage.wlm(wreVar, 19);
        if (true == optionalD.isPresent()) {
            java.lang.Object obj = optionalD.get();
            defpackage.wky wkyVar = (defpackage.wky) obj;
            agsm.i(1071, wkyVar.d(new defpackage.wkx((defpackage.wre) wlmVar.a, j$.util.Optional.empty())), "failed to stop Xatu session", new java.lang.Object[0]);
            agsm.i(1072, wkyVar.b(), "failed to close Xatu ui", new java.lang.Object[0]);
        }
    }

    public final void f() {
        j$.util.Optional optionalC = c();
        if (true == optionalC.isPresent()) {
            ((com.google.android.material.bottomsheet.BottomSheetBehavior) optionalC.get()).t(5);
        }
    }

    public final void g() {
        u(9);
        this.x = false;
        defpackage.wsx wsxVar = this.e;
        android.view.View viewN = wsxVar.N();
        ((com.google.android.material.button.MaterialButton) viewN.findViewById(2131427605)).j(false);
        viewN.findViewById(2131428774).setVisibility(0);
        android.view.View viewFindViewById = viewN.findViewById(2131427982);
        android.view.View viewN2 = wsxVar.N();
        int i = dzs.a;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) dzo.b(viewN2, 2131428773);
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(viewFindViewById, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, v(viewFindViewById));
        objectAnimatorOfFloat.addListener(hrz.a(this.N, new defpackage.oxr(viewFindViewById, 14)));
        android.animation.Animator animatorW = w(recyclerView, 0);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat((com.google.android.material.floatingactionbutton.FloatingActionButton) dzo.b(wsxVar.N(), 2131428875), (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
        z();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, animatorW, objectAnimatorOfFloat2);
        animatorSet.setDuration(wsc.bp(wsxVar.z(), defpackage.urp.DURATION_MEDIUM_4));
        animatorSet.setInterpolator(hrm.b);
        animatorSet.start();
        this.S = j$.util.Optional.of(animatorSet);
        j$.util.Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            ((defpackage.wky) optionalD.get()).e(false);
        }
    }

    public final /* synthetic */ void i(defpackage.wlc wlcVar) {
        defpackage.wow wowVarB = defpackage.wow.b(wlcVar.q);
        if (wowVarB == null) {
            wowVarB = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
        }
        j$.util.Optional optionalOfNullable = this.z;
        if (true == optionalOfNullable.isPresent()) {
            defpackage.wow wowVarB2 = defpackage.wow.b(((defpackage.wlc) optionalOfNullable.get()).q);
            if (wowVarB2 == null) {
                wowVarB2 = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
            }
            optionalOfNullable = j$.util.Optional.ofNullable(wowVarB2);
        }
        byte[] bArr = null;
        defpackage.wow wowVar = (defpackage.wow) optionalOfNullable.orElse((java.lang.Object) null);
        j$.util.Optional optionalOfNullable2 = this.A;
        if (true == optionalOfNullable2.isPresent()) {
            defpackage.wow wowVarB3 = defpackage.wow.b(((defpackage.wsy) optionalOfNullable2.get()).c);
            if (wowVarB3 == null) {
                wowVarB3 = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
            }
            optionalOfNullable2 = j$.util.Optional.ofNullable(wowVarB3);
        }
        defpackage.wow wowVar2 = (defpackage.wow) optionalOfNullable2.orElse((java.lang.Object) null);
        int i = 2;
        int i2 = 3;
        if (!wowVarB.equals(wowVar) && !wowVarB.equals(wowVar2)) {
            if (wowVarB.equals(defpackage.wow.INTRO_FOR_IVR_DATA)) {
                this.I = 3;
            } else {
                this.I = 2;
            }
        }
        defpackage.wsx wsxVar = this.e;
        android.view.View viewN = wsxVar.N();
        int i3 = dzs.a;
        defpackage.wts wtsVarY = ((com.android.dialer.xatu.impl.ui.XatuInCallToolbar) dzo.b(viewN, 2131429294)).y();
        boolean z = wlcVar.d;
        java.lang.Object obj = wtsVarY.e;
        defpackage.wtq wtqVar = new defpackage.wtq(z, 0);
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (true == optional.isPresent()) {
            defpackage.wde wdeVar = (defpackage.wde) optional.get();
            if (wtqVar.a) {
                wdeVar.a();
            } else {
                wdeVar.c();
            }
        }
        this.C.x(wlcVar.e);
        int i4 = this.I;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) dzo.b(wsxVar.N(), 2131428773);
                android.support.v7.widget.LinearLayoutManager linearLayoutManager = recyclerView.n;
                int i6 = wlcVar.r;
                j$.util.Optional optionalOfNullable3 = this.z;
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((defpackage.wlc) optionalOfNullable3.get()).r));
                }
                int iIntValue = ((java.lang.Integer) optionalOfNullable3.orElse(-1)).intValue();
                int i7 = wlcVar.t;
                j$.util.Optional optionalOfNullable4 = this.z;
                if (true == optionalOfNullable4.isPresent()) {
                    optionalOfNullable4 = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((defpackage.wlc) optionalOfNullable4.get()).t));
                }
                int iIntValue2 = ((java.lang.Integer) optionalOfNullable4.orElse(-1)).intValue();
                if (i6 < 0 || i6 == iIntValue) {
                    if (i7 >= 0 && i7 != iIntValue2 && recyclerView.n.N() <= i7) {
                        recyclerView.W(i7);
                    }
                } else if (wlcVar.s) {
                    linearLayoutManager.au(i6);
                }
            }
        } else if (!this.Q && wlcVar.e.size() > 0) {
            r();
            this.Q = true;
        }
        this.D.x(wlcVar.h);
        defpackage.wki wkiVar = wlcVar.f;
        if (wkiVar == null) {
            wkiVar = defpackage.wki.a;
        }
        defpackage.wkj wkjVar = wkiVar.c;
        if (wkjVar == null) {
            wkjVar = defpackage.wkj.a;
        }
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) dzo.b(wsxVar.N(), 2131427607);
        materialButton.j(wkjVar.c);
        materialButton.setContentDescription(wsxVar.A().getString(true != wkjVar.c ? 2132021111 : 2132021089));
        materialButton.setEnabled(wkjVar.d);
        defpackage.wkf wkfVar = wkiVar.d;
        if (wkfVar == null) {
            wkfVar = defpackage.wkf.a;
        }
        com.google.android.material.button.MaterialButton materialButton2 = (com.google.android.material.button.MaterialButton) dzo.b(wsxVar.N(), 2131427602);
        android.widget.TextView textView = (android.widget.TextView) dzo.b(wsxVar.N(), 2131429346);
        materialButton2.setContentDescription(wkfVar.c);
        materialButton2.n(wkfVar.d);
        textView.setText(wkfVar.e);
        materialButton2.j(wkfVar.f);
        q(wlcVar.j);
        k(wlcVar.o);
        if (wlcVar.p) {
            j$.util.Optional optionalOfNullable5 = this.z;
            if (true == optionalOfNullable5.isPresent()) {
                optionalOfNullable5 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable5.get()).p));
            }
            if (!((java.lang.Boolean) optionalOfNullable5.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                defpackage.agby agbyVarX = x(2132021099, 0);
                agbyVarX.s(android.R.string.ok, new defpackage.vxa(agbyVarX, 15));
                agbyVarX.n(new defpackage.wtc(this));
                agbyVarX.h();
            }
        }
        n(wlcVar.l);
        p(wlcVar.k);
        l(wlcVar.n);
        o(wlcVar.m);
        if ((wlcVar.b & 8) == 0) {
            f();
        } else if (!a().isPresent()) {
            j$.util.Optional optionalD = d();
            defpackage.whq whqVar = new defpackage.whq(this, wlcVar, i2, bArr);
            if (true == optionalD.isPresent()) {
                java.lang.Object obj2 = optionalD.get();
                java.lang.Object obj3 = whqVar.b;
                defpackage.wky wkyVar = (defpackage.wky) obj2;
                defpackage.whe wheVarB = defpackage.whe.b(((defpackage.wlc) whqVar.a).g);
                if (wheVarB == null) {
                    wheVarB = defpackage.whe.BOTTOM_SHEET_KEY_UNSPECIFIED;
                }
                aoin aoinVar = (aoin) wkyVar.C.k().get(wheVarB);
                ahvr.cc(aoinVar != null, "XatuBottomSheetFragmentProvider for %s is not bound", wheVarB.name());
                aw awVarA = ((defpackage.whd) aoinVar.a()).a();
                defpackage.wtk wtkVar = (defpackage.wtk) obj3;
                defpackage.wsx wsxVar2 = wtkVar.e;
                u uVar = new u(wsxVar2.I());
                uVar.q(2131427591, awVarA, "bottom_sheet_tag");
                uVar.c();
                wsxVar2.N().findViewById(2131427590).setVisibility(0);
                j$.util.Optional optionalC = wtkVar.c();
                if (true == optionalC.isPresent()) {
                    ((com.google.android.material.bottomsheet.BottomSheetBehavior) optionalC.get()).t(3);
                }
            }
        }
        defpackage.whg whgVar = wlcVar.i;
        if (whgVar == null) {
            whgVar = defpackage.whg.a;
        }
        j$.util.Optional optionalOfNullable6 = this.z;
        if (true == optionalOfNullable6.isPresent()) {
            defpackage.whg whgVar2 = ((defpackage.wlc) optionalOfNullable6.get()).i;
            if (whgVar2 == null) {
                whgVar2 = defpackage.whg.a;
            }
            optionalOfNullable6 = j$.util.Optional.ofNullable(whgVar2);
        }
        if (!whgVar.equals(optionalOfNullable6.orElse((java.lang.Object) null))) {
            j$.util.Optional optionalY = y("XatuTikTokErrorDialogFragmentPeer");
            if (true == optionalY.isPresent()) {
                ((al) optionalY.get()).f();
            }
            j$.util.Optional optionalY2 = y("custom_error_dialog");
            if (true == optionalY2.isPresent()) {
                ((al) optionalY2.get()).f();
            }
            if ((wlcVar.b & 16) != 0) {
                int i8 = whgVar.c;
                if (i8 == 0) {
                    i = 3;
                } else if (i8 == 2) {
                    i = 1;
                } else if (i8 != 3) {
                    i = 0;
                }
                int i9 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i9 == 0) {
                    defpackage.wud wudVar = new defpackage.wud();
                    amxr.g(wudVar);
                    ahgl.b(wudVar, whgVar);
                    wudVar.t();
                    wudVar.r(wsxVar.I(), "XatuTikTokErrorDialogFragmentPeer");
                } else {
                    if (i9 != 1) {
                        throw new java.lang.IllegalStateException("invalid error dialog spec");
                    }
                    defpackage.wsj wsjVar = new defpackage.wsj();
                    amxr.g(wsjVar);
                    ahgl.b(wsjVar, whgVar);
                    wsjVar.t();
                    wsjVar.r(wsxVar.I(), "custom_error_dialog");
                }
            }
        }
        if (((java.lang.Boolean) this.T.a()).booleanValue()) {
            defpackage.wow wowVarB4 = defpackage.wow.b(wlcVar.q);
            if (wowVarB4 == null) {
                wowVarB4 = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
            }
            j$.util.Optional optionalOfNullable7 = this.z;
            if (true == optionalOfNullable7.isPresent()) {
                defpackage.wow wowVarB5 = defpackage.wow.b(((defpackage.wlc) optionalOfNullable7.get()).q);
                if (wowVarB5 == null) {
                    wowVarB5 = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
                }
                optionalOfNullable7 = j$.util.Optional.ofNullable(wowVarB5);
            }
            if (!wowVarB4.equals((defpackage.wow) optionalOfNullable7.orElse((java.lang.Object) null))) {
                android.support.v7.widget.RecyclerView recyclerView2 = (android.support.v7.widget.RecyclerView) dzo.b(wsxVar.N(), 2131428773);
                defpackage.wow wowVarB6 = defpackage.wow.b(wlcVar.q);
                if (wowVarB6 == null) {
                    wowVarB6 = defpackage.wow.CACHED_IVR_DATA_BANNER_NONE;
                }
                hrs hrsVar = wowVarB6 == defpackage.wow.INTRO_FOR_IVR_DATA ? new hrs(((ahfw) wsxVar).a, new defpackage.wtw(this.C)) : new ix();
                hrsVar.u();
                recyclerView2.Z(hrsVar);
            }
        }
        if (this.y) {
            defpackage.pgi pgiVarY = ((com.android.dialer.incall.buttonbar.GenericButtonBarView) wsxVar.N().findViewById(2131427624)).y();
            alat<defpackage.pgg> alatVar = wlcVar.u;
            aooh.f(alatVar, "buttons");
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
            for (defpackage.pgg pggVar : alatVar) {
                java.lang.String str = pggVar.c;
                aooh.e(str, "getButtonKey(...)");
                defpackage.abpe abpeVar = new defpackage.abpe(pggVar.d, pggVar.i, (pggVar.b & 128) != 0 ? java.lang.Long.valueOf(pggVar.j) : null);
                java.lang.String str2 = pggVar.e;
                aooh.e(str2, "getLabel(...)");
                defpackage.abpf abpfVarT = abts.t(str2);
                java.lang.String str3 = pggVar.f;
                aooh.e(str3, "getDescription(...)");
                arrayList.add(new defpackage.abpg(str, abpeVar, abpfVarT, abts.t(str3), pggVar.h, pggVar.g));
            }
            com.google.android.libraries.communications.ux.views.buttonbar.ButtonBarGrid buttonBarGrid = (com.google.android.libraries.communications.ux.views.buttonbar.ButtonBarGrid) pgiVarY.b;
            java.util.List list = buttonBarGrid.b;
            buttonBarGrid.b = arrayList;
            ev.a(new defpackage.abpb(list, arrayList)).c(buttonBarGrid.a);
            buttonBarGrid.c = new pez();
        }
    }

    public final void k(boolean z) {
        if (!z) {
            if (this.B.isPresent()) {
                ((defpackage.agby) this.B.orElseThrow()).e(3);
                this.B = j$.util.Optional.empty();
                return;
            }
            return;
        }
        j$.util.Optional optionalOfNullable = this.z;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable.get()).o));
        }
        if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
            return;
        }
        defpackage.agby agbyVarX = x(2132021097, -2);
        agbyVarX.s(2132021105, new defpackage.vxa(this, 20));
        agbyVarX.h();
        this.B = j$.util.Optional.of(agbyVarX);
    }

    public final void l(boolean z) {
        if (z) {
            j$.util.Optional optionalOfNullable = this.z;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable.get()).n));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            defpackage.agby agbyVarX = x(2132021098, 0);
            agbyVarX.s(android.R.string.ok, new defpackage.vxa(agbyVarX, 19));
            agbyVarX.h();
        }
    }

    public final void m(boolean z) {
        if (z) {
            u(8);
        }
        this.x = true;
        if (this.y) {
            return;
        }
        defpackage.wsx wsxVar = this.e;
        android.view.View viewN = wsxVar.N();
        android.view.View viewFindViewById = viewN.findViewById(2131427982);
        viewFindViewById.setVisibility(0);
        viewN.findViewById(2131428774).setVisibility(4);
        android.view.View viewN2 = wsxVar.N();
        int i = dzs.a;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) dzo.b(viewN2, 2131428773);
        android.view.View viewN3 = wsxVar.N();
        float height = ((android.support.v7.widget.RecyclerView) dzo.b(viewN3, 2131427761)).getHeight() - v((android.view.View) dzo.b(viewN3, 2131427982));
        android.animation.Animator animatorW = w(recyclerView, (int) (-height));
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat((com.google.android.material.floatingactionbutton.FloatingActionButton) dzo.b(wsxVar.N(), 2131428875), (android.util.Property<com.google.android.material.floatingactionbutton.FloatingActionButton, java.lang.Float>) android.view.View.TRANSLATION_Y, height);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(viewFindViewById, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, 0.0f);
        z();
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat2, animatorW, objectAnimatorOfFloat);
        animatorSet.setDuration(wsc.bp(wsxVar.z(), defpackage.urp.DURATION_MEDIUM_4));
        animatorSet.setInterpolator(hrm.a);
        animatorSet.start();
        this.R = j$.util.Optional.of(animatorSet);
        ((com.android.dialer.dialpadview.DialpadView) dzo.b(viewFindViewById, 2131427997)).a();
        f();
        j$.util.Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            ((defpackage.wky) optionalD.get()).e(true);
        }
    }

    public final void n(boolean z) {
        if (z) {
            j$.util.Optional optionalOfNullable = this.z;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable.get()).l));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            defpackage.agby agbyVarX = x(2132021101, 0);
            agbyVarX.s(2132021100, new defpackage.vxa(this, 14));
            agbyVarX.h();
        }
    }

    public final void o(boolean z) {
        if (z) {
            j$.util.Optional optionalOfNullable = this.z;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable.get()).m));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            defpackage.agby agbyVarX = x(2132021102, ((java.lang.Long) this.O.a()).intValue());
            agbyVarX.s(android.R.string.cancel, new defpackage.vxa(agbyVarX, 17));
            agbyVarX.n(new defpackage.wtd(this));
            agbyVarX.h();
        }
    }

    public final void p(boolean z) {
        if (z) {
            j$.util.Optional optionalOfNullable = this.z;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable.get()).k));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            defpackage.agby agbyVarX = x(2132021103, 0);
            agbyVarX.s(android.R.string.ok, new defpackage.vxa(agbyVarX, 16));
            agbyVarX.h();
        }
    }

    public final void q(boolean z) {
        if (z) {
            j$.util.Optional optionalOfNullable = this.z;
            if (true == optionalOfNullable.isPresent()) {
                optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.wlc) optionalOfNullable.get()).j));
            }
            if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                return;
            }
            defpackage.agby agbyVarX = x(2132021104, -2);
            agbyVarX.s(2132021105, new defpackage.vxa(this, 18));
            agbyVarX.h();
        }
    }

    public final void r() {
        android.view.View viewN = this.e.N();
        int i = dzs.a;
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) dzo.b(viewN, 2131428773);
        kh khVar = recyclerView.m;
        if (khVar != null) {
            recyclerView.ac(khVar.a() - 1);
        }
    }

    final void s() {
        j$.util.Optional optionalOfNullable = this.z;
        if (true == optionalOfNullable.isPresent()) {
            defpackage.wki wkiVar = ((defpackage.wlc) optionalOfNullable.get()).f;
            if (wkiVar == null) {
                wkiVar = defpackage.wki.a;
            }
            defpackage.wkf wkfVar = wkiVar.d;
            if (wkfVar == null) {
                wkfVar = defpackage.wkf.a;
            }
            optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(wkfVar.g));
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) optionalOfNullable.orElse(bool)).booleanValue()) {
            pez.j().r(this.e.I(), "AudioRouteSelectorDialog");
            return;
        }
        j$.util.Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            zmq zmqVar = ((defpackage.wky) optionalD.get()).b;
            j$.util.Optional optionalA = zmqVar.a();
            if (true == optionalA.isPresent()) {
                optionalA = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.zmw) optionalA.get()).equals(defpackage.zmw.ROUTE_BLUETOOTH)));
            }
            if (((java.lang.Boolean) optionalA.orElse(bool)).booleanValue()) {
                a.bI(defpackage.wky.a.d(), "toggleSpeaker() called when bluetooth available.", "com/android/dialer/xatu/impl/service/XatuController", "toggleSpeaker", (char) 399, "XatuController.java", zct.b);
            }
            j$.util.Optional optionalA2 = zmqVar.a();
            if (true == optionalA2.isPresent()) {
                optionalA2 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.zmw) optionalA2.get()).equals(defpackage.zmw.ROUTE_SPEAKER)));
            }
            java.lang.Boolean bool2 = (java.lang.Boolean) optionalA2.orElse(bool);
            boolean zBooleanValue = bool2.booleanValue();
            a.bt(defpackage.wky.a.b(), "toggleSpeaker called with isSpeakerOn: %s", bool2, "com/android/dialer/xatu/impl/service/XatuController", "toggleSpeaker", (char) 407, "XatuController.java", zct.a);
            if (zBooleanValue) {
                zmqVar.e(defpackage.zmw.ROUTE_WIRED_OR_EARPIECE);
            } else {
                zmqVar.e(defpackage.zmw.ROUTE_SPEAKER);
            }
        }
    }

    final void t() {
        j$.util.Optional optionalD = d();
        if (true == optionalD.isPresent()) {
            defpackage.wky wkyVar = (defpackage.wky) optionalD.get();
            a.bI(defpackage.wky.a.b(), "enter", "com/android/dialer/xatu/impl/service/XatuController", "toggleMute", (char) 383, "XatuController.java", zct.a);
            wkyVar.b.c(!wkyVar.c.g(), true);
        }
    }

    public final void u(int i) {
        j$.util.Optional optional = this.z;
        defpackage.pqj pqjVar = new defpackage.pqj(this, i, 3);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = pqjVar.b;
            int i2 = pqjVar.a;
            ((defpackage.wtk) obj2).t.b(((defpackage.wlc) obj).c, i2);
        }
    }
}
