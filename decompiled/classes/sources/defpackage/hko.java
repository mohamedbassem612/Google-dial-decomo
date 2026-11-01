package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hko implements defpackage.hsk, defpackage.izh, defpackage.juf, defpackage.ksw, defpackage.kti, defpackage.kwi, defpackage.lec, defpackage.llc, defpackage.lyp, defpackage.mei, defpackage.mej, defpackage.mek, defpackage.olm, defpackage.ooh, defpackage.ost, defpackage.oua, defpackage.owe, defpackage.pdg, defpackage.qcs, defpackage.rhy, defpackage.rjq, defpackage.rkn, defpackage.rkp, defpackage.roi, defpackage.rvv, defpackage.ryh, defpackage.ryv, defpackage.sku, defpackage.ulr, defpackage.uve, defpackage.uvh, defpackage.uzy, defpackage.vqv, defpackage.vwc, defpackage.zsp, defpackage.agnd, defpackage.agrd, defpackage.ahiz, defpackage.ahjb, defpackage.amxq, defpackage.amyo {
    public final defpackage.amwv a;
    public final him b;
    final defpackage.amyz c;
    final defpackage.amyz d;
    final defpackage.amyz e;
    final defpackage.amyz f;
    final defpackage.amyz g;
    final defpackage.amyz h;
    final defpackage.amyz i;
    final defpackage.amyz j;
    final defpackage.amyz k;
    final defpackage.amyz l;
    final defpackage.amyz n;
    final defpackage.amyz o;
    final defpackage.amyz p;
    public final defpackage.hkg q;
    private final defpackage.hkh r;
    private final defpackage.hko s = this;
    final defpackage.amyz m = defpackage.hka.a;

    public hko(him himVar, defpackage.hkh hkhVar, defpackage.hkg hkgVar, defpackage.amwv amwvVar) {
        this.b = himVar;
        this.r = hkhVar;
        this.q = hkgVar;
        this.a = amwvVar;
        this.c = defpackage.amzc.b(new defpackage.hjc(himVar, hkhVar, hkgVar, this, 0));
        this.d = defpackage.amzc.b(new defpackage.hjc(himVar, hkhVar, hkgVar, this, 1));
        this.e = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 3);
        this.f = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 2);
        this.g = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 4);
        this.h = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 5);
        this.i = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 6);
        this.j = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 7);
        this.k = new defpackage.hjc(himVar, hkhVar, hkgVar, this, 8);
        this.l = defpackage.amyu.c(new defpackage.hjc(himVar, hkhVar, hkgVar, this, 11));
        this.n = defpackage.amyu.c(new defpackage.hjc(himVar, hkhVar, hkgVar, this, 12));
        this.o = defpackage.amyu.c(new defpackage.hjc(himVar, hkhVar, hkgVar, this, 10));
        this.p = defpackage.amyu.c(new defpackage.hjc(himVar, hkhVar, hkgVar, this, 9));
    }

    @Override // defpackage.ulr
    public final ulq A() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.spamnotification.impl.ui.SpamNotificationActivity spamNotificationActivityA = hkgVar.a();
        if (spamNotificationActivityA instanceof com.android.dialer.spamnotification.impl.ui.SpamNotificationActivity) {
            return new ulq(spamNotificationActivityA, (defpackage.zjm) hkgVar.e());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) spamNotificationActivityA, ulq.class));
    }

    @Override // defpackage.uve
    public final uvd B() {
        com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity feedbackActivityA = this.q.a();
        if (!(feedbackActivityA instanceof com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) feedbackActivityA, uvd.class));
        }
        him himVar = this.b;
        return new uvd(feedbackActivityA, (defpackage.agsm) himVar.aT.a(), (ulw) J(), (uwp) himVar.a.gX.a());
    }

    @Override // defpackage.uvh
    public final uvg C() {
        com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity feedbackConsentActivityA = this.q.a();
        if (feedbackConsentActivityA instanceof com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity) {
            return new uvg(feedbackConsentActivityA, L());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) feedbackConsentActivityA, uvg.class));
    }

    @Override // defpackage.uzy
    public final uzx D() {
        com.android.dialer.voicemail.configui.VoicemailSecretCodeActivity voicemailSecretCodeActivityA = this.q.a();
        if (voicemailSecretCodeActivityA instanceof com.android.dialer.voicemail.configui.VoicemailSecretCodeActivity) {
            return new uzx(voicemailSecretCodeActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) voicemailSecretCodeActivityA, uzx.class));
    }

    @Override // defpackage.vqv
    public final vqu E() {
        com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity voicemailChangePinActivityA = this.q.a();
        if (voicemailChangePinActivityA instanceof com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity) {
            return new vqu(voicemailChangePinActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) voicemailChangePinActivityA, vqu.class));
    }

    @Override // defpackage.vwc
    public final defpackage.vwb F() {
        com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity archivedVisualVoicemailActivityA = this.q.a();
        if (archivedVisualVoicemailActivityA instanceof com.android.dialer.voicemail.tab.impl.ui.ArchivedVisualVoicemailActivity) {
            return new defpackage.vwb(archivedVisualVoicemailActivityA, this.b.a.O());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) archivedVisualVoicemailActivityA, defpackage.vwb.class));
    }

    @Override // defpackage.zsp
    public final zso G() {
        com.google.android.dialershared.precall.impl.PrecallActivity precallActivityA = this.q.a();
        if (precallActivityA instanceof com.google.android.dialershared.precall.impl.PrecallActivity) {
            return new zso(precallActivityA, j$.util.Optional.of(this.b.nv()));
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) precallActivityA, zso.class));
    }

    @Override // defpackage.agrd
    public final agrc H() {
        com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity expressSignInActivityA = this.q.a();
        if (expressSignInActivityA instanceof com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity) {
            return new agrc(expressSignInActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) expressSignInActivityA, agrc.class));
    }

    public final ahji I() {
        defpackage.hkg hkgVar = this.q;
        android.app.Activity activityA = hkgVar.a();
        defpackage.aigb aigbVarG = defpackage.aigf.g(19);
        him himVar = this.b;
        hip hipVar = himVar.a;
        aigbVarG.i("com.android.dialer.atlas.AtlasPixelTipsGateway", hipVar.hf);
        aigbVarG.i("com.android.incallui.atlas.ui.impl.growthkit.SettingDeepLink", hipVar.hg);
        aigbVarG.i("com.android.dialer.beesly.impl.growthkit.SettingsDeepLink", hipVar.hh);
        aigbVarG.i("com.android.dialer.beesly.impl.settings.gateway.TikTokDeepLink", hipVar.hi);
        aigbVarG.i("com.android.dialer.callannouncer.impl.growthkit.SettingsDeepLink", hipVar.hj);
        aigbVarG.i("com.android.dialer.dobby.impl.growthkit.SettingsDeepLink", hipVar.hk);
        aigbVarG.i("com.android.dialer.incall.answer.method.promo.growthkit.SettingsDeepLink", hipVar.hl);
        aigbVarG.i("com.android.dialer.callannouncer.impl.settings.gateway.TikTokDeepLink", hipVar.hm);
        aigbVarG.i("com.android.dialer.callrecording.disclosure.impl.growthkit.SettingsDeepLink", hipVar.hn);
        aigbVarG.i("com.android.dialer.callscreen.impl.promotion.CallScreenDemoGateway", hipVar.ho);
        aigbVarG.i("com.android.dialer.patrick.impl.settings.gateway.TikTokDeepLink", hipVar.hp);
        aigbVarG.i("com.android.dialer.joyball.JoyballDeepLink", hipVar.hq);
        aigbVarG.i("com.android.dialer.patrick.impl.promo.growthkit.OnboardingDeepLink", hipVar.hr);
        aigbVarG.i("com.android.dialer.revelio.impl.tidepods.impl.gateway.RevelioGateway", hipVar.hs);
        aigbVarG.i("com.android.dialer.rtt.settings.impl.gateway.RttSettingsDeepLink", hipVar.ht);
        aigbVarG.i("com.android.dialer.sonic.impl.service.SonicGatewayHandler", hipVar.hu);
        aigbVarG.i("com.android.dialer.xatu.impl.growthkit.SettingDeepLink", hipVar.hv);
        aigbVarG.i("com.android.dialer.sharpie.impl.growthkit.SettingsDeepLink", hipVar.hw);
        aigbVarG.i("com.android.dialer.voicemail.settings.deeplink.TikTokDeepLink", hipVar.hx);
        defpackage.aigf aigfVarE = aigbVarG.e(true);
        defpackage.ahyn.h(hkgVar.q);
        return new ahji(activityA, aigfVarE, (defpackage.agtj) hkgVar.p.a(), new ahjh(defpackage.amzb.a, (java.util.concurrent.Executor) himVar.L.a()));
    }

    public final java.lang.Object J() {
        him himVar = this.b;
        return new ulw((defpackage.kjr) himVar.pn.a(), (defpackage.ajct) himVar.r.a(), O());
    }

    @Override // defpackage.amxq
    public final defpackage.hiq K() {
        return new defpackage.hiq(this.b, this.r, this.q, this.s);
    }

    public final uyg L() {
        return new uyg((defpackage.rwi) this.b.Bs.a(), j$.util.Optional.of(new defpackage.wsc(null)), (byte[]) null);
    }

    @Override // defpackage.agnd
    public final agmc M() {
        return (agmc) this.p.a();
    }

    public final defpackage.tkl N() {
        defpackage.amyz amyzVar = this.f;
        him himVar = this.b;
        defpackage.amyz amyzVar2 = himVar.fj;
        hip hipVar = himVar.a;
        return new defpackage.tkl(amyzVar, amyzVar2, hipVar.gL, hipVar.gM);
    }

    public final defpackage.zzx O() {
        return new defpackage.zzx(this.k);
    }

    @Override // defpackage.ahjb
    public final uzx P() {
        return new uzx(I());
    }

    @Override // defpackage.ahiz
    public final uzx Q() {
        return new uzx(I(), (byte[]) null);
    }

    @Override // defpackage.mek
    public final defpackage.mni R() {
        return new defpackage.mni();
    }

    @Override // defpackage.mej
    public final defpackage.mni S() {
        return new defpackage.mni();
    }

    @Override // defpackage.mei
    public final defpackage.mni T() {
        return new defpackage.mni();
    }

    @Override // defpackage.hsk
    public final hsj a() {
        defpackage.hkg hkgVar = this.q;
        android.content.Context context = (android.content.Context) hkgVar.g.a();
        him himVar = this.b;
        defpackage.agsm agsmVar = (defpackage.agsm) himVar.aT.a();
        com.android.dialer.app.calllog.CallLogNotificationsActivity callLogNotificationsActivityA = hkgVar.a();
        if (!(callLogNotificationsActivityA instanceof com.android.dialer.app.calllog.CallLogNotificationsActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callLogNotificationsActivityA, hsj.class));
        }
        com.android.dialer.app.calllog.CallLogNotificationsActivity callLogNotificationsActivity = callLogNotificationsActivityA;
        hip hipVar = himVar.a;
        return new hsj(context, agsmVar, callLogNotificationsActivity, hipVar.dy, hipVar.e(), hipVar.f(), himVar.oV(), himVar.bz(), (defpackage.rwi) himVar.Bs.a(), (defpackage.gpd) himVar.fD.a());
    }

    @Override // defpackage.izh
    public final defpackage.izg b() {
        com.android.dialer.beesly.impl.settings.greeting.ui.RecordGreetingActivity recordGreetingActivityA = this.q.a();
        if (!(recordGreetingActivityA instanceof com.android.dialer.beesly.impl.settings.greeting.ui.RecordGreetingActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) recordGreetingActivityA, defpackage.izg.class));
        }
        return new defpackage.izg(recordGreetingActivityA, hip.bZ(), (defpackage.ahpz) this.b.bb.a());
    }

    @Override // defpackage.juf
    public final jue c() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity callerIdFeedbackDialogActivityA = hkgVar.a();
        if (!(callerIdFeedbackDialogActivityA instanceof com.android.dialer.calleridfeedback.impl.ui.CallerIdFeedbackDialogActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callerIdFeedbackDialogActivityA, jue.class));
        }
        java.lang.Object objE = hkgVar.e();
        defpackage.aoss aossVar = (defpackage.aoss) hkgVar.h.a();
        him himVar = this.b;
        hip hipVar = himVar.a;
        return new jue(callerIdFeedbackDialogActivityA, (defpackage.zjm) objE, aossVar, hipVar.cb(), hipVar.U(), (defpackage.ahbv) himVar.fg.a(), himVar.jF());
    }

    @Override // defpackage.ksw
    public final ksv d() {
        com.android.dialer.calloptions.ui.CallOptionsActivity callOptionsActivityA = this.q.a();
        if (!(callOptionsActivityA instanceof com.android.dialer.calloptions.ui.CallOptionsActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callOptionsActivityA, ksv.class));
        }
        him himVar = this.b;
        defpackage.aazc aazcVar = (defpackage.aazc) himVar.l.a();
        rze rzeVar = new rze((android.content.Context) himVar.s.a());
        java.lang.Object objGq = himVar.gq();
        hip hipVar = himVar.a;
        return new ksv(callOptionsActivityA, aazcVar, rzeVar, new kso(hipVar.cp, (defpackage.zzx) objGq), hipVar.gv, (defpackage.rlv) himVar.fq.a(), (kvt) hipVar.cq.a(), (defpackage.gpd) himVar.fD.a(), new ksr(new zlr(new uyg((android.content.Context) himVar.s.a(), (defpackage.aolr) himVar.bg.a()), himVar.pf(), himVar.oq()), himVar.oU()), new kst(), (defpackage.aoss) himVar.cb.a(), (defpackage.urg) himVar.ft.a());
    }

    @Override // defpackage.kti
    public final kth e() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivityA = hkgVar.a();
        if (!(callQualityRatingActivityA instanceof com.android.dialer.callqualityrating.impl.CallQualityRatingActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callQualityRatingActivityA, kth.class));
        }
        com.android.dialer.callqualityrating.impl.CallQualityRatingActivity callQualityRatingActivity = callQualityRatingActivityA;
        java.lang.Object objE = hkgVar.e();
        him himVar = this.b;
        j$.util.Optional optionalOf = j$.util.Optional.of("com.google.android.apps.tycho.provider.voicelibrarylogprovider");
        defpackage.aooc.ap(optionalOf);
        hip hipVar = himVar.a;
        him himVar2 = hipVar.a;
        ktj ktjVar = new ktj(optionalOf, (defpackage.ojo) himVar2.oF.a());
        return new kth(callQualityRatingActivity, (defpackage.zjm) objE, ktjVar, new ktk((android.content.Context) himVar2.s.a(), (defpackage.ajct) himVar2.r.a()), (defpackage.zzd) hipVar.gw.a(), (defpackage.zzd) hipVar.gx.a(), (defpackage.zzd) hipVar.gy.a(), hipVar.gz, (rai) this.c.a(), (rai) this.d.a());
    }

    @Override // defpackage.kwi
    public final kwh f() {
        com.android.dialer.callrecording.impl.history.CallRecordingSessionActivity callRecordingSessionActivityA = this.q.a();
        if (callRecordingSessionActivityA instanceof com.android.dialer.callrecording.impl.history.CallRecordingSessionActivity) {
            return new kwh(callRecordingSessionActivityA, (defpackage.urg) this.b.ft.a());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callRecordingSessionActivityA, kwh.class));
    }

    @Override // defpackage.lec
    public final leb g() {
        com.android.dialer.callscreen.impl.postcall.SurveyActivity surveyActivityA = this.q.a();
        if (!(surveyActivityA instanceof com.android.dialer.callscreen.impl.postcall.SurveyActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) surveyActivityA, leb.class));
        }
        him himVar = this.b;
        return new leb(surveyActivityA, new lea(himVar.cx()), j$.util.Optional.empty(), (defpackage.urg) himVar.ft.a());
    }

    @Override // defpackage.llc
    public final llb h() {
        com.android.dialer.callscreen.impl.survey.CallScreenSurveyActivity callScreenSurveyActivityA = this.q.a();
        if (callScreenSurveyActivityA instanceof com.android.dialer.callscreen.impl.survey.CallScreenSurveyActivity) {
            return new llb(callScreenSurveyActivityA, new oq(this.b.bw()));
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callScreenSurveyActivityA, llb.class));
    }

    @Override // defpackage.lyp
    public final lyo i() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity conversationHistoryCallDetailsWrapperActivityA = hkgVar.a();
        if (!(conversationHistoryCallDetailsWrapperActivityA instanceof com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsWrapperActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) conversationHistoryCallDetailsWrapperActivityA, lyo.class));
        }
        java.lang.Object objE = hkgVar.e();
        defpackage.ttj ttjVar = new defpackage.ttj();
        him himVar = this.b;
        hip hipVar = himVar.a;
        rhx rhxVarBZ = hip.bZ();
        defpackage.ipc ipcVarSG = himVar.sG();
        defpackage.amyz amyzVar = himVar.uQ;
        hipVar.O();
        return new lyo(conversationHistoryCallDetailsWrapperActivityA, (defpackage.zjm) objE, ttjVar, rhxVarBZ, ipcVarSG, amyzVar);
    }

    @Override // defpackage.olm
    public final oll j() {
        him himVar = this.b;
        hip hipVar = himVar.a;
        him himVar2 = hipVar.a;
        j$.util.Optional optionalOf = j$.util.Optional.of(new sxr((android.content.Context) himVar2.s.a()));
        defpackage.dpy.p((defpackage.ecx) hipVar.gA.a(), (defpackage.ajct) himVar2.r.a());
        himVar2.oy();
        int i = uyc.a;
        himVar2.rX();
        defpackage.zjm zjmVar = new defpackage.zjm(j$.util.Optional.of(new vqf(new uyg(himVar2.s, himVar2.fq))), j$.util.Optional.of(new uyi(hipVar.gB)));
        defpackage.hkg hkgVar = this.q;
        defpackage.zjm zjmVarML = himVar.mL();
        com.android.dialer.featuredemo.FeatureDemoActivity featureDemoActivityA = hkgVar.a();
        if (featureDemoActivityA instanceof com.android.dialer.featuredemo.FeatureDemoActivity) {
            return new oll(optionalOf, zjmVar, zjmVarML, featureDemoActivityA, (defpackage.rlv) himVar.fq.a(), hip.bZ());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) featureDemoActivityA, oll.class));
    }

    @Override // defpackage.ooh
    public final oog k() {
        com.android.dialer.fliptosilence.impl.gateway.FlipToSilenceSettingsRedirectorActivity flipToSilenceSettingsRedirectorActivityA = this.q.a();
        if (flipToSilenceSettingsRedirectorActivityA instanceof com.android.dialer.fliptosilence.impl.gateway.FlipToSilenceSettingsRedirectorActivity) {
            return new oog(flipToSilenceSettingsRedirectorActivityA, this.b.re());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) flipToSilenceSettingsRedirectorActivityA, oog.class));
    }

    @Override // defpackage.ost
    public final oss l() {
        com.android.dialer.incall.accountselectordialog.ui.AccountSelectorDialogActivity accountSelectorDialogActivityA = this.q.a();
        if (accountSelectorDialogActivityA instanceof com.android.dialer.incall.accountselectordialog.ui.AccountSelectorDialogActivity) {
            return new oss(accountSelectorDialogActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) accountSelectorDialogActivityA, oss.class));
    }

    @Override // defpackage.oua
    public final otz m() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.incall.activity.ui.InCallActivity inCallActivityA = hkgVar.a();
        if (!(inCallActivityA instanceof com.android.dialer.incall.activity.ui.InCallActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) inCallActivityA, otz.class));
        }
        com.android.dialer.incall.activity.ui.InCallActivity inCallActivity = inCallActivityA;
        him himVar = this.b;
        defpackage.zpm zpmVar = (defpackage.zpm) himVar.fn.a();
        java.lang.Object objE = hkgVar.e();
        defpackage.zms zmsVar = (defpackage.zms) himVar.EB.a();
        defpackage.adae adaeVar = (defpackage.adae) himVar.ru.a();
        defpackage.tkl tklVarN = N();
        defpackage.amyz amyzVar = this.g;
        hip hipVar = himVar.a;
        return new otz(inCallActivity, zpmVar, (defpackage.zjm) objE, zmsVar, adaeVar, tklVarN, hipVar.gN, himVar.MX, new defpackage.zzx(amyzVar), (defpackage.qba) himVar.gU.a(), (defpackage.tkl) himVar.gv.a(), new pgi((defpackage.ruc) himVar.eK.a(), (defpackage.ajcu) himVar.r.a()), (otq) himVar.Ml.a(), (defpackage.ruc) himVar.eK.a(), hip.ci(), (defpackage.rlv) himVar.fq.a(), (defpackage.gat) himVar.ER.a(), hipVar.ds(), j$.util.Optional.of(new rai(hipVar.aA())), j$.util.Optional.of(new her((defpackage.zpm) hipVar.a.fn.a(), (byte[]) null, (byte[]) null, (byte[]) null)), hip.bZ(), himVar.no(), hipVar.K(), (defpackage.mgw) himVar.cc.a(), (defpackage.gpd) himVar.fD.a(), (defpackage.zjv) himVar.cf.a(), (defpackage.sou) himVar.vr.a(), (defpackage.oud) himVar.gw.a());
    }

    @Override // defpackage.owe
    public final owd n() {
        com.android.dialer.incall.answer.method.promo.postcall.PostCallAnswerMethodPromoActivity postCallAnswerMethodPromoActivityA = this.q.a();
        if (!(postCallAnswerMethodPromoActivityA instanceof com.android.dialer.incall.answer.method.promo.postcall.PostCallAnswerMethodPromoActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) postCallAnswerMethodPromoActivityA, owd.class));
        }
        him himVar = this.b;
        return new owd(postCallAnswerMethodPromoActivityA, (defpackage.aoss) himVar.cb.a(), himVar.nl(), (defpackage.rwi) himVar.Bs.a(), (defpackage.rlv) himVar.fq.a(), himVar.re());
    }

    @Override // defpackage.pdg
    public final pdf o() {
        com.android.dialer.incall.audioroute.ui.TidepodsAudioRouteSelectorActivity tidepodsAudioRouteSelectorActivityA = this.q.a();
        if (tidepodsAudioRouteSelectorActivityA instanceof com.android.dialer.incall.audioroute.ui.TidepodsAudioRouteSelectorActivity) {
            return new pdf(tidepodsAudioRouteSelectorActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) tidepodsAudioRouteSelectorActivityA, pdf.class));
    }

    @Override // defpackage.qcs
    public final qcr p() {
        com.android.dialer.incall.postchardialog.impl.ui.TidepodsPostCharDialogActivity tidepodsPostCharDialogActivityA = this.q.a();
        if (tidepodsPostCharDialogActivityA instanceof com.android.dialer.incall.postchardialog.impl.ui.TidepodsPostCharDialogActivity) {
            return new qcr(tidepodsPostCharDialogActivityA, (defpackage.urg) this.b.ft.a());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) tidepodsPostCharDialogActivityA, qcr.class));
    }

    @Override // defpackage.rhy
    public final rhx q() {
        com.android.dialer.internationalcallonwifi.ui.InternationalCallOnWifiDialogActivity internationalCallOnWifiDialogActivityA = this.q.a();
        if (internationalCallOnWifiDialogActivityA instanceof com.android.dialer.internationalcallonwifi.ui.InternationalCallOnWifiDialogActivity) {
            return new rhx(internationalCallOnWifiDialogActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) internationalCallOnWifiDialogActivityA, rhx.class));
    }

    @Override // defpackage.rjq
    public final rjp r() {
        com.android.dialer.joyball.impl.ui.JoyballActivity joyballActivityA = this.q.a();
        if (joyballActivityA instanceof com.android.dialer.joyball.impl.ui.JoyballActivity) {
            return new rjp(joyballActivityA, (rjj) this.b.a.ex.a());
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) joyballActivityA, rjp.class));
    }

    public final defpackage.rkg s() {
        him himVar = this.b;
        return new defpackage.rkg((android.content.Context) himVar.s.a(), new defpackage.rkh((android.content.Context) himVar.a.a.s.a()), (defpackage.rlv) himVar.fq.a(), himVar.mN());
    }

    @Override // defpackage.rkn
    public final rkm t() {
        android.app.Activity activityA = this.q.a();
        if (activityA instanceof com.android.dialer.largescreensupport.activityembedding.TerminatingActivity) {
            return new rkm((com.android.dialer.largescreensupport.activityembedding.TerminatingActivity) activityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) activityA, rkm.class));
    }

    @Override // defpackage.rkp
    public final rko u() {
        defpackage.hkg hkgVar = this.q;
        android.content.Context context = (android.content.Context) hkgVar.g.a();
        android.app.Activity activityA = hkgVar.a();
        if (activityA instanceof com.android.dialer.largescreensupport.activityembedding.TrampolineActivity) {
            return new rko(context, (com.android.dialer.largescreensupport.activityembedding.TrampolineActivity) activityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) activityA, rko.class));
    }

    @Override // defpackage.roi
    public final defpackage.rog v() {
        defpackage.hkg hkgVar = this.q;
        android.app.Activity activityA = hkgVar.a();
        if (!(activityA instanceof com.android.dialer.main.impl.MainActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) activityA, defpackage.rog.class));
        }
        defpackage.rkg rkgVarS = s();
        him himVar = this.b;
        hip hipVar = himVar.a;
        defpackage.uqf uqfVar = (defpackage.uqf) hipVar.cx.a();
        defpackage.lpe lpeVar = (defpackage.lpe) himVar.AZ.a();
        java.lang.Object objE = hkgVar.e();
        defpackage.zjm zjmVarCi = hip.ci();
        defpackage.amyz amyzVar = hipVar.gQ;
        defpackage.ipc ipcVarSG = himVar.sG();
        defpackage.rlv rlvVar = (defpackage.rlv) himVar.fq.a();
        defpackage.zzx zzxVar = new defpackage.zzx(this.h);
        defpackage.gpd gpdVar = (defpackage.gpd) himVar.fD.a();
        defpackage.urs ursVarO = hipVar.O();
        defpackage.ruc rucVar = (defpackage.ruc) himVar.eK.a();
        defpackage.ttj ttjVar = new defpackage.ttj();
        defpackage.adae adaeVar = (defpackage.adae) himVar.ru.a();
        defpackage.tkl tklVarN = N();
        defpackage.amyz amyzVar2 = this.i;
        return new defpackage.rog((com.android.dialer.main.impl.MainActivity) activityA, rkgVarS, uqfVar, lpeVar, (defpackage.zjm) objE, zjmVarCi, amyzVar, ipcVarSG, rlvVar, zzxVar, gpdVar, ursVarO, rucVar, ttjVar, adaeVar, tklVarN, himVar.no(), hipVar.K(), new defpackage.rsr((defpackage.aoin) himVar.Jw, (defpackage.aoin) amyzVar2, (char[]) null), (defpackage.aogc) himVar.Ea.a(), (defpackage.mgw) himVar.cc.a());
    }

    @Override // defpackage.rvv
    public final rvu w() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.multibindingsettings.impl.DialerSettingsActivity dialerSettingsActivityA = hkgVar.a();
        if (!(dialerSettingsActivityA instanceof com.android.dialer.multibindingsettings.impl.DialerSettingsActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) dialerSettingsActivityA, rvu.class));
        }
        com.android.dialer.multibindingsettings.impl.DialerSettingsActivity dialerSettingsActivity = dialerSettingsActivityA;
        java.lang.Object objE = hkgVar.e();
        him himVar = this.b;
        defpackage.amyz amyzVar = this.j;
        return new rvu(dialerSettingsActivity, (defpackage.zjm) objE, himVar.ob(), new defpackage.zzx(amyzVar), (whl) hkgVar.k.a(), himVar.a.O(), hip.ch(), (defpackage.ruc) himVar.eK.a(), (defpackage.agsm) himVar.aT.a());
    }

    @Override // defpackage.ryh
    public final ryg x() {
        com.android.dialer.patrick.account.sharing.ui.CallingCardSharingActivity callingCardSharingActivityA = this.q.a();
        if (callingCardSharingActivityA instanceof com.android.dialer.patrick.account.sharing.ui.CallingCardSharingActivity) {
            return new ryg(callingCardSharingActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callingCardSharingActivityA, ryg.class));
    }

    @Override // defpackage.ryv
    public final ryu y() {
        com.android.dialer.patrick.account.ui.CallingCardAccountActivity callingCardAccountActivityA = this.q.a();
        if (callingCardAccountActivityA instanceof com.android.dialer.patrick.account.ui.CallingCardAccountActivity) {
            return new ryu(callingCardAccountActivityA);
        }
        throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) callingCardAccountActivityA, ryu.class));
    }

    @Override // defpackage.sku
    public final skt z() {
        defpackage.hkg hkgVar = this.q;
        com.android.dialer.patrick.onboarding.ui.OnboardingFlowActivity onboardingFlowActivityA = hkgVar.a();
        if (!(onboardingFlowActivityA instanceof com.android.dialer.patrick.onboarding.ui.OnboardingFlowActivity)) {
            throw new java.lang.IllegalStateException(defpackage.hhx.c((defpackage.az) onboardingFlowActivityA, skt.class));
        }
        return new skt(onboardingFlowActivityA, (android.content.Context) hkgVar.g.a(), (sjf) hkgVar.m.a(), this.b.tt, (sjh) hkgVar.l.a(), (sjl) this.r.t.a());
    }
}
