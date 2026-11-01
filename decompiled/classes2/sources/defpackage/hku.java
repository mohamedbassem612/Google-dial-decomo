package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hku implements defpackage.ifc, defpackage.ifr, defpackage.jls, defpackage.jlt, defpackage.jva, defpackage.jvb, defpackage.jxx, defpackage.jxy, defpackage.jyo, defpackage.jyp, defpackage.knz, defpackage.koa, defpackage.lit, defpackage.liu, defpackage.mak, defpackage.mal, defpackage.npx, defpackage.npy, defpackage.ogk, defpackage.ogl, defpackage.oij, defpackage.oik, defpackage.ojj, defpackage.ojk, pgj, pgk, qcj, qck, rdq, rdr, tyt, tyu, ucn, uco, vwl, vwm, vwt, vwu, vye, vyf, vyl, vym, vyt, wem, wen, wsd, wse, wst, wsu, wtt, wtu, ahtk, amyo {
    public final defpackage.him a;
    public final his b;
    final amyz c;
    final amyz d;
    final amyz e;
    private final android.view.View f;
    private final hkg g;
    private final defpackage.hku h = this;

    public hku(defpackage.him himVar, hkg hkgVar, his hisVar, android.view.View view) {
        this.a = himVar;
        this.g = hkgVar;
        this.b = hisVar;
        this.f = view;
        this.c = new defpackage.hjr(himVar, hisVar, this, 0, 0);
        this.d = new defpackage.hjr(himVar, hisVar, this, 1, 0);
        this.e = amzc.b(new defpackage.hjr(himVar, hisVar, this, 2, 0));
    }

    public final aglm Y() {
        defpackage.him himVar = this.a;
        ajwr ajwrVarCl = himVar.a.cl();
        gpd gpdVarJC = himVar.jC();
        ops opsVar = (ops) himVar.BM.a();
        his hisVar = this.b;
        return new aglm(this.f, ajwrVarCl, gpdVarJC, opsVar, himVar.my(), hisVar.cK());
    }

    public final ajwr Z() {
        return this.a.a.cl();
    }

    @Override // defpackage.ifc
    public final defpackage.ifb a() {
        android.content.Context context = (android.content.Context) this.g.g.a();
        java.lang.Object obj = this.f;
        if (!(obj instanceof defpackage.ifs)) {
            throw new java.lang.IllegalStateException(hhx.b(obj, defpackage.ifb.class, "Attempt to inject a View wrapper of type "));
        }
        defpackage.ifs ifsVar = (defpackage.ifs) obj;
        aooc.ap(ifsVar);
        this.a.a.g();
        return new defpackage.ifb(context, ifsVar);
    }

    @Override // defpackage.ifr
    public final defpackage.ifq b() {
        defpackage.him himVar = this.a;
        defpackage.hip hipVar = himVar.a;
        ahda ahdaVarCx = hipVar.cx();
        android.content.Context context = (android.content.Context) this.g.g.a();
        java.lang.Object obj = this.f;
        if (!(obj instanceof com.android.dialer.audioplayback.impl.ui.AudioPlaybackView)) {
            throw new java.lang.IllegalStateException(hhx.b(obj, defpackage.ifq.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.audioplayback.impl.ui.AudioPlaybackView audioPlaybackView = (com.android.dialer.audioplayback.impl.ui.AudioPlaybackView) obj;
        aooc.ap(audioPlaybackView);
        his hisVar = this.b;
        return new defpackage.ifq(ahdaVarCx, context, audioPlaybackView, hisVar.a, hipVar.cl(), (iez) hipVar.hC.a(), (aazc) himVar.l.a(), (rlv) himVar.fq.a(), (gpd) himVar.fD.a(), hipVar.g(), 3, himVar.vq);
    }

    @Override // defpackage.jls
    public final defpackage.jlr c() {
        java.lang.Object obj = this.f;
        if (!(obj instanceof com.android.dialer.blockreportspam.ScamFeedbackChipView)) {
            throw new java.lang.IllegalStateException(hhx.b(obj, defpackage.jlr.class, "Attempt to inject a View wrapper of type "));
        }
        aooc.ap((com.android.dialer.blockreportspam.ScamFeedbackChipView) obj);
        return new defpackage.jlr();
    }

    @Override // defpackage.jva
    public final defpackage.juz d() {
        java.lang.Object obj = this.f;
        if (!(obj instanceof com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView)) {
            throw new java.lang.IllegalStateException(hhx.b(obj, defpackage.juz.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView callerTagChipView = (com.android.dialer.calleridfeedback.impl.ui.callertagselector.CallerTagChipView) obj;
        aooc.ap(callerTagChipView);
        return new defpackage.juz(callerTagChipView, (ahhp) this.b.aa.a());
    }

    @Override // defpackage.jxx
    public final defpackage.jxw e() {
        android.view.View view = this.f;
        if (!(view instanceof com.android.dialer.calllocation.ui.LocationView)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.jxw.class, "Attempt to inject a View wrapper of type "));
        }
        his hisVar = this.b;
        com.android.dialer.calllocation.ui.LocationView locationView = (com.android.dialer.calllocation.ui.LocationView) view;
        aooc.ap(locationView);
        defpackage.him himVar = this.a;
        aais aaisVar = (aais) himVar.ce.a();
        zpm zpmVar = (zpm) himVar.fn.a();
        gpd gpdVar = (gpd) himVar.fD.a();
        aw awVar = hisVar.a;
        ahey aheyVarCZ = hisVar.cZ();
        defpackage.hip hipVar = himVar.a;
        return new defpackage.jxw(awVar, locationView, aaisVar, zpmVar, gpdVar, aheyVarCZ, hipVar.gl, hipVar.gm);
    }

    @Override // defpackage.jyo
    public final defpackage.jyn f() {
        android.view.View view = this.f;
        if (!(view instanceof com.android.dialer.calllog.chips.container.CallLogChipContainerView)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.jyn.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.calllog.chips.container.CallLogChipContainerView callLogChipContainerView = (com.android.dialer.calllog.chips.container.CallLogChipContainerView) view;
        aooc.ap(callLogChipContainerView);
        return new defpackage.jyn(callLogChipContainerView, this.a.a.cl());
    }

    @Override // defpackage.knz
    public final defpackage.kny g() {
        android.view.View view = this.f;
        if (!(view instanceof com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.kny.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView dropdownMenuView = (com.android.dialer.calllog.ui.multibindingmenu.DropdownMenuView) view;
        aooc.ap(dropdownMenuView);
        return new defpackage.kny(dropdownMenuView, new zzx(this.c), this.a.vq);
    }

    @Override // defpackage.lit
    public final defpackage.lis h() {
        android.view.View view = this.f;
        if (!(view instanceof defpackage.liv)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.lis.class, "Attempt to inject a View wrapper of type "));
        }
        defpackage.liv livVar = (defpackage.liv) view;
        aooc.ap(livVar);
        return new defpackage.lis(livVar);
    }

    @Override // defpackage.mak
    public final defpackage.maj i() {
        android.content.Context context = (android.content.Context) this.g.g.a();
        android.view.View view = this.f;
        if (!(view instanceof com.android.dialer.conversationhistorycalldetails.integrations.internal.CallDetailsFeatureIntegrationView)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.maj.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.conversationhistorycalldetails.integrations.internal.CallDetailsFeatureIntegrationView callDetailsFeatureIntegrationView = (com.android.dialer.conversationhistorycalldetails.integrations.internal.CallDetailsFeatureIntegrationView) view;
        aooc.ap(callDetailsFeatureIntegrationView);
        return new defpackage.maj(context, callDetailsFeatureIntegrationView, (ahpz) this.a.bb.a(), new zzx(this.d));
    }

    @Override // defpackage.npx
    public final defpackage.npw j() {
        android.view.View view = this.f;
        boolean z = view instanceof com.android.dialer.dobby.impl.settings.ui.radiogrouppreference.RadioButtonPreferenceView;
        ahey aheyVarCZ = this.b.cZ();
        if (!z) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.npw.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.dobby.impl.settings.ui.radiogrouppreference.RadioButtonPreferenceView radioButtonPreferenceView = (com.android.dialer.dobby.impl.settings.ui.radiogrouppreference.RadioButtonPreferenceView) view;
        aooc.ap(radioButtonPreferenceView);
        return new defpackage.npw(aheyVarCZ, radioButtonPreferenceView);
    }

    @Override // defpackage.ogk
    public final defpackage.ogj k() {
        android.view.View view = this.f;
        if (!(view instanceof defpackage.ogo)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.ogj.class, "Attempt to inject a View wrapper of type "));
        }
        defpackage.ogo ogoVar = (defpackage.ogo) view;
        aooc.ap(ogoVar);
        return new defpackage.ogj(ogoVar);
    }

    @Override // defpackage.oij
    public final defpackage.oii l() {
        this.a.a.cl();
        android.view.View view = this.f;
        if (!(view instanceof com.android.dialer.expresso.sender.impl.ui.grid.ExpressoGridView)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.oii.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.expresso.sender.impl.ui.grid.ExpressoGridView expressoGridView = (com.android.dialer.expresso.sender.impl.ui.grid.ExpressoGridView) view;
        aooc.ap(expressoGridView);
        return new defpackage.oii(expressoGridView);
    }

    @Override // defpackage.ojj
    public final defpackage.oji m() {
        android.view.View view = this.f;
        if (!(view instanceof defpackage.ojl)) {
            throw new java.lang.IllegalStateException(hhx.b(view, defpackage.oji.class, "Attempt to inject a View wrapper of type "));
        }
        defpackage.ojl ojlVar = (defpackage.ojl) view;
        aooc.ap(ojlVar);
        return new defpackage.oji(ojlVar, this.a.dB(), (rai) this.e.a(), (aoss) this.b.an.a());
    }

    public final pgi n() {
        com.android.dialer.incall.buttonbar.GenericButtonBarView genericButtonBarView = this.f;
        if (!(genericButtonBarView instanceof com.android.dialer.incall.buttonbar.GenericButtonBarView)) {
            throw new java.lang.IllegalStateException(hhx.b(genericButtonBarView, pgi.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.incall.buttonbar.GenericButtonBarView genericButtonBarView2 = genericButtonBarView;
        aooc.ap(genericButtonBarView2);
        this.a.a.cl();
        return new pgi(genericButtonBarView2);
    }

    public final qci o() {
        com.android.dialer.incall.onhold.ui.OnHoldView onHoldView = this.f;
        if (!(onHoldView instanceof com.android.dialer.incall.onhold.ui.OnHoldView)) {
            throw new java.lang.IllegalStateException(hhx.b(onHoldView, qci.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.incall.onhold.ui.OnHoldView onHoldView2 = onHoldView;
        aooc.ap(onHoldView2);
        return new qci(onHoldView2);
    }

    public final rdp p() {
        com.android.dialer.incall.voice.ui.VoiceScreenChipView voiceScreenChipView = this.f;
        if (!(voiceScreenChipView instanceof com.android.dialer.incall.voice.ui.VoiceScreenChipView)) {
            throw new java.lang.IllegalStateException(hhx.b(voiceScreenChipView, rdp.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.incall.voice.ui.VoiceScreenChipView voiceScreenChipView2 = voiceScreenChipView;
        aooc.ap(voiceScreenChipView2);
        return new rdp(voiceScreenChipView2, this.a.a.cl());
    }

    public final tys q() {
        tyx tyxVar = this.f;
        if (!(tyxVar instanceof tyx)) {
            throw new java.lang.IllegalStateException(hhx.b(tyxVar, tys.class, "Attempt to inject a View wrapper of type "));
        }
        tyx tyxVar2 = tyxVar;
        aooc.ap(tyxVar2);
        return new tys(tyxVar2);
    }

    public final ucm r() {
        com.android.dialer.sonic.impl.ui.grid.SonicGridView sonicGridView = this.f;
        if (!(sonicGridView instanceof com.android.dialer.sonic.impl.ui.grid.SonicGridView)) {
            throw new java.lang.IllegalStateException(hhx.b(sonicGridView, ucm.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.sonic.impl.ui.grid.SonicGridView sonicGridView2 = sonicGridView;
        aooc.ap(sonicGridView2);
        return new ucm(sonicGridView2, this.a.a.cl());
    }

    public final vwk s() {
        com.android.dialer.voicemail.tab.impl.ui.ErrorBannerView errorBannerView = this.f;
        if (!(errorBannerView instanceof com.android.dialer.voicemail.tab.impl.ui.ErrorBannerView)) {
            throw new java.lang.IllegalStateException(hhx.b(errorBannerView, vwk.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.voicemail.tab.impl.ui.ErrorBannerView errorBannerView2 = errorBannerView;
        aooc.ap(errorBannerView2);
        return new vwk(errorBannerView2, this.b.a, (vvb) this.a.a.aE());
    }

    public final vws t() {
        vww vwwVar = this.f;
        if (!(vwwVar instanceof vww)) {
            throw new java.lang.IllegalStateException(hhx.b(vwwVar, vws.class, "Attempt to inject a View wrapper of type "));
        }
        vww vwwVar2 = vwwVar;
        aooc.ap(vwwVar2);
        defpackage.him himVar = this.a;
        return new vws(vwwVar2, (rlv) himVar.fq.a(), himVar.a.cl());
    }

    public final vyd u() {
        his hisVar = this.b;
        ahey aheyVarCZ = hisVar.cZ();
        com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView = this.f;
        if (!(voicemailEntryView instanceof com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView)) {
            throw new java.lang.IllegalStateException(hhx.b(voicemailEntryView, vyd.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.voicemail.tab.impl.ui.VoicemailEntryView voicemailEntryView2 = voicemailEntryView;
        aooc.ap(voicemailEntryView2);
        defpackage.him himVar = this.a;
        aeqx aeqxVarMy = himVar.my();
        ops opsVar = (ops) himVar.BM.a();
        gpd gpdVarJC = himVar.jC();
        ssq ssqVar = (ssq) himVar.qE.a();
        kaw kawVarJA = himVar.jA();
        tkl tklVarOx = himVar.ox();
        defpackage.hip hipVar = himVar.a;
        return new vyd(aheyVarCZ, voicemailEntryView2, aeqxVarMy, opsVar, gpdVarJC, new zlr(ssqVar, kawVarJA, tklVarOx, hipVar.cw()), hipVar.cl(), (ahpz) himVar.bb.a(), hisVar.cK(), (gpd) himVar.fD.a());
    }

    public final vys v() {
        com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView voicemailDetailView = this.f;
        boolean z = voicemailDetailView instanceof com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView;
        ahey aheyVarCZ = this.b.cZ();
        if (!z) {
            throw new java.lang.IllegalStateException(hhx.b(voicemailDetailView, vys.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.voicemail.tab.impl.ui.largescreensupport.VoicemailDetailView voicemailDetailView2 = voicemailDetailView;
        aooc.ap(voicemailDetailView2);
        defpackage.him himVar = this.a;
        return new vys(aheyVarCZ, voicemailDetailView2, (ops) himVar.BM.a(), (gpd) himVar.fD.a());
    }

    public final wel w() {
        com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView = this.f;
        if (!(errorContentView instanceof com.android.dialer.widget.errorcontentview.ErrorContentView)) {
            throw new java.lang.IllegalStateException(hhx.b(errorContentView, wel.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.widget.errorcontentview.ErrorContentView errorContentView2 = errorContentView;
        aooc.ap(errorContentView2);
        return new wel(errorContentView2);
    }

    public final wsc x() {
        ahey aheyVarCZ = this.b.cZ();
        com.android.dialer.xatu.impl.ui.XatuCachedIvrDataBannerView xatuCachedIvrDataBannerView = this.f;
        if (!(xatuCachedIvrDataBannerView instanceof com.android.dialer.xatu.impl.ui.XatuCachedIvrDataBannerView)) {
            throw new java.lang.IllegalStateException(hhx.b(xatuCachedIvrDataBannerView, wsc.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.xatu.impl.ui.XatuCachedIvrDataBannerView xatuCachedIvrDataBannerView2 = xatuCachedIvrDataBannerView;
        aooc.ap(xatuCachedIvrDataBannerView2);
        return new wsc(aheyVarCZ, xatuCachedIvrDataBannerView2);
    }

    public final wss y() {
        his hisVar = this.b;
        ahey aheyVarCZ = hisVar.cZ();
        com.android.dialer.xatu.impl.ui.XatuDtmfOptionView xatuDtmfOptionView = this.f;
        if (!(xatuDtmfOptionView instanceof com.android.dialer.xatu.impl.ui.XatuDtmfOptionView)) {
            throw new java.lang.IllegalStateException(hhx.b(xatuDtmfOptionView, wss.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.xatu.impl.ui.XatuDtmfOptionView xatuDtmfOptionView2 = xatuDtmfOptionView;
        aooc.ap(xatuDtmfOptionView2);
        defpackage.hip hipVar = this.a.a;
        return new wss(aheyVarCZ, xatuDtmfOptionView2, hipVar.cl(), (zlr) hisVar.dg(), hipVar.gu);
    }

    public final wts z() {
        voc vocVar = (voc) this.b.s.a();
        ajwr ajwrVarCl = this.a.a.cl();
        com.android.dialer.xatu.impl.ui.XatuInCallToolbar xatuInCallToolbar = this.f;
        if (!(xatuInCallToolbar instanceof com.android.dialer.xatu.impl.ui.XatuInCallToolbar)) {
            throw new java.lang.IllegalStateException(hhx.b(xatuInCallToolbar, wts.class, "Attempt to inject a View wrapper of type "));
        }
        com.android.dialer.xatu.impl.ui.XatuInCallToolbar xatuInCallToolbar2 = xatuInCallToolbar;
        aooc.ap(xatuInCallToolbar2);
        return new wts(vocVar, ajwrVarCl, xatuInCallToolbar2);
    }

    @Override // defpackage.mal
    public final void A() {
    }

    @Override // defpackage.jyp
    public final void B() {
    }

    @Override // defpackage.jvb
    public final void C() {
    }

    @Override // defpackage.ojk
    public final void D() {
    }

    @Override // defpackage.koa
    public final void E() {
    }

    public final void F() {
    }

    public final void G() {
    }

    @Override // defpackage.ogl
    public final void H() {
    }

    @Override // defpackage.oik
    public final void I() {
    }

    public final void J() {
    }

    @Override // defpackage.jxy
    public final void K() {
    }

    public final void L() {
    }

    @Override // defpackage.npy
    public final void M() {
    }

    @Override // defpackage.jlt
    public final void N() {
    }

    public final void O() {
    }

    public final void P() {
    }

    public final void Q() {
    }

    @Override // defpackage.liu
    public final void R() {
    }

    public final void S() {
    }

    public final void T() {
    }

    public final void U() {
    }

    public final void V() {
    }

    public final void W() {
    }

    public final void X() {
    }
}
