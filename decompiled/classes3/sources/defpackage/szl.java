package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class szl implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public szl(defpackage.usy usyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(usyVar);
        this.a = usyVar;
    }

    /* JADX WARN: Type inference failed for: r14v20, types: [java.lang.Object, tjh] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ajcq ajcqVarH;
        ajcq ajcqVarI;
        defpackage.aprf aprfVar;
        int i = 10;
        int i2 = 18;
        switch (this.$cid) {
            case 0:
                aooh.f(view, "unused");
                defpackage.szk szkVar = (defpackage.szk) this.a;
                szkVar.a();
                j$.util.Optional optionalG = szkVar.f.g();
                aooh.e(optionalG, "getFeature(...)");
                swv swvVar = (swv) aooh.q(optionalG);
                if (swvVar != null) {
                    defpackage.szk.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioPrecallIntegrationDialogFragmentPeer", "onButtonEndScreenClick", 70, "RevelioPrecallIntegrationDialogFragmentPeer.kt").v("Attempting to end background revelio call");
                    agtj agtjVar = szkVar.d;
                    tbm tbmVar = swvVar.d;
                    if (tbmVar.e().isPresent()) {
                        java.lang.String str = (java.lang.String) tbmVar.e().orElseThrow();
                        j$.util.Optional optionalE = swvVar.g.e(str);
                        if (optionalE.isPresent()) {
                            defpackage.swu swuVar = (defpackage.swu) ((defpackage.apqr) optionalE.orElseThrow()).a(defpackage.swu.class);
                            ajcqVarH = ahvr.H(swuVar.aA().g(), new defpackage.soi(swuVar, i), swvVar.c);
                        } else {
                            swv.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl", "rejectScreeningCall", 336, "TidepodsRevelioImpl.java").y("no call scope for call ID: %s", str);
                            ajcqVarH = aiql.z(java.lang.Boolean.FALSE);
                        }
                    } else {
                        swv.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioImpl", "rejectScreeningCall", 329, "TidepodsRevelioImpl.java").v("no call ID running Revelio");
                        ajcqVarH = aiql.z(java.lang.Boolean.FALSE);
                    }
                    agtjVar.i(new defpackage.zoe((java.lang.Object) ajcqVarH), szkVar.e);
                } else {
                    defpackage.szk.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioPrecallIntegrationDialogFragmentPeer", "onButtonEndScreenClick", 65, "RevelioPrecallIntegrationDialogFragmentPeer.kt").v("Revelio no longer running, proceeding with outgoing call");
                    ahvr.h(new defpackage.ztc(szkVar.b), szkVar.c);
                }
                break;
            case 1:
                defpackage.sxv sxvVar = (defpackage.sxv) this.a;
                java.lang.String str2 = sxvVar.c.f;
                defpackage.sxx.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoPlayer", "playAudio", 45, "TidepodsRevelioDemoPlayer.java").y("audioMessageName: %s", str2);
                defpackage.sxx sxxVar = sxvVar.e;
                defpackage.sxp sxpVar = sxxVar.b;
                j$.util.Optional optionalG2 = sxpVar.d.g();
                if (optionalG2.isPresent()) {
                    ahrv ahrvVarG = ahrv.g(((tkl) optionalG2.orElseThrow()).p());
                    tbq tbqVar = sxpVar.c;
                    j$.util.Objects.requireNonNull(tbqVar);
                    defpackage.srq srqVar = new defpackage.srq(tbqVar, 7);
                    ajct ajctVar = sxpVar.b;
                    ajcqVarI = ahrvVarG.i(srqVar, ajctVar).i(new defpackage.phd(sxpVar, str2, i2), ajctVar);
                } else {
                    defpackage.sxp.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoAudioFileFetcher", "fetchOptionalPath", 51, "TidepodsRevelioDemoAudioFileFetcher.java").v("call screen not available");
                    ajcqVarI = aiql.z(j$.util.Optional.empty());
                }
                sxvVar.f.i(defpackage.zoe.M(ahvr.H(ahvr.H(ajcqVarI, new defpackage.rht(20), sxpVar.b), new defpackage.soi(sxxVar, 11), sxxVar.c)), sxvVar.h);
                break;
            case 2:
                aooh.f(view, "unused");
                defpackage.szk szkVar2 = (defpackage.szk) this.a;
                szkVar2.a();
                defpackage.szk.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioPrecallIntegrationDialogFragmentPeer", "onButtonCancelCallClick", 93, "RevelioPrecallIntegrationDialogFragmentPeer.kt").v("Cancel outgoing call");
                ahvr.h(new defpackage.zsy(), szkVar2.c);
                break;
            case 3:
                java.lang.Object obj = this.a;
                com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat tidepodsCallerActionPreferenceCompat = (com.android.dialer.revelio.impl.tidepods.impl.settings.TidepodsCallerActionPreferenceCompat) obj;
                defpackage.tbe tbeVar = (defpackage.tbe) tidepodsCallerActionPreferenceCompat.M.get((android.widget.RadioButton) view);
                ahvr.bY(tidepodsCallerActionPreferenceCompat.J.isPresent());
                ahvr.bY(tidepodsCallerActionPreferenceCompat.F.isPresent());
                defpackage.tbe tbeVar2 = defpackage.tbe.AUTOMATICALLY_SCREEN;
                if (tbeVar == tbeVar2 && tidepodsCallerActionPreferenceCompat.F.orElseThrow() != tbeVar2) {
                    tidepodsCallerActionPreferenceCompat.K.b(((androidx.preference.Preference) obj).j, tidepodsCallerActionPreferenceCompat.ae().e(), new kll(obj, 10), new jox(15));
                } else {
                    tidepodsCallerActionPreferenceCompat.k(tbeVar);
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat.a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "onRadioButtonClick", 200, "RttSettingsPreferenceCompat.java").v("onRadioButtonClick");
                com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat rttSettingsPreferenceCompat = (com.android.dialer.rtt.settings.impl.ui.RttSettingsPreferenceCompat) this.a;
                tcp tcpVar = (tcp) rttSettingsPreferenceCompat.b.get((android.widget.RadioButton) view);
                if (tcpVar != null && !tcpVar.equals(rttSettingsPreferenceCompat.c.orElseThrow()) && (aprfVar = rttSettingsPreferenceCompat.d) != null) {
                    defpackage.tdn tdnVar = ((defpackage.tdm) aprfVar.a).a;
                    ajcq ajcqVarC = tdnVar.f.c(tcpVar);
                    aogc aogcVar = tdnVar.h;
                    aogcVar.s(ajcqVarC, "load_rtt_data_key");
                    aogcVar.s(ajcqVarC, defpackage.tdd.b);
                    break;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                this.a.a();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aw awVar = (aw) this.a;
                java.lang.String[] strArrB = zqz.b(awVar.z(), zqz.d);
                if (strArrB.length > 0) {
                    defpackage.tkd.a.b().l("com/android/dialer/searchfragment/list/SearchFragment", "requestContactsGroupPermissions", 676, "SearchFragment.java").y("Requesting permissions: %s", java.util.Arrays.toString(strArrB));
                    awVar.ar(strArrB, 1);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                ahvr.j(new defpackage.tyq(((defpackage.tys) this.a).a), view);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                android.content.Context context = view.getContext();
                akzx akzxVarM = defpackage.rvq.a.m();
                akzx akzxVarM2 = defpackage.rvo.a.m();
                defpackage.rvc rvcVar = defpackage.rvc.CALLER_ID_AND_SPAM;
                akzxVarM2.u();
                ((defpackage.rvo) akzxVarM2.b).d = rvcVar.a();
                defpackage.rvo rvoVar = (defpackage.rvo) akzxVarM2.p();
                akzxVarM.u();
                defpackage.rvq rvqVar = (defpackage.rvq) akzxVarM.b;
                j$.util.Objects.requireNonNull(rvoVar);
                rvqVar.d = rvoVar;
                rvqVar.c = 2;
                ahqx.l(context, ((uhs) ((defpackage.uhp) this.a).h).f.aL((defpackage.rvq) akzxVarM.p()));
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aify aifyVar = com.android.dialer.timekeeper.histogram.HistogramView.j;
                ((android.widget.PopupWindow) this.a).dismiss();
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.usy usyVar = (defpackage.usy) this.a;
                if (usyVar.f.isPresent()) {
                    rlv rlvVar = usyVar.c;
                    akzx akzxVarP = ((amrw) usyVar.f.orElseThrow()).p();
                    akzxVarP.u();
                    amrw amrwVar = akzxVarP.b;
                    amrwVar.h = 1;
                    amrwVar.b |= 32;
                    rlvVar.x(akzxVarP.p());
                }
                agsm.i(943, usyVar.d.d(usyVar.b.c), "failed to update survey status", new java.lang.Object[0]);
                usyVar.a();
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.usy usyVar2 = (defpackage.usy) this.a;
                defpackage.uru uruVar = (defpackage.uru) usyVar2.g.orElseThrow();
                akzx akzxVarM3 = defpackage.urz.a.m();
                int i3 = uruVar.h;
                akzxVarM3.u();
                defpackage.urz urzVar = (defpackage.urz) akzxVarM3.b;
                urzVar.b |= 32;
                urzVar.g = i3;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                defpackage.urw urwVar = uruVar.d;
                if (urwVar == null) {
                    urwVar = defpackage.urw.a;
                }
                defpackage.urv urvVar = urwVar.c;
                if (urvVar == null) {
                    urvVar = defpackage.urv.a;
                }
                int i4 = (int) (((long) urvVar.c) / 60);
                akzxVarM3.u();
                defpackage.urz urzVar2 = (defpackage.urz) akzxVarM3.b;
                urzVar2.b |= 8;
                urzVar2.e = i4;
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
                defpackage.urw urwVar2 = uruVar.d;
                if (urwVar2 == null) {
                    urwVar2 = defpackage.urw.a;
                }
                defpackage.urv urvVar2 = urwVar2.c;
                if (urvVar2 == null) {
                    urvVar2 = defpackage.urv.a;
                }
                int i5 = (int) (((long) urvVar2.d) / 60);
                akzxVarM3.u();
                defpackage.urz urzVar3 = (defpackage.urz) akzxVarM3.b;
                urzVar3.b |= 4;
                urzVar3.d = i5;
                akzm akzmVar = uruVar.f;
                if (akzmVar == null) {
                    akzmVar = akzm.a;
                }
                long jB = aldf.b(akzmVar);
                akzxVarM3.u();
                defpackage.urz urzVar4 = (defpackage.urz) akzxVarM3.b;
                urzVar4.b |= 1;
                urzVar4.c = jB;
                java.lang.String str3 = uruVar.e;
                akzxVarM3.u();
                defpackage.urz urzVar5 = (defpackage.urz) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str3);
                urzVar5.b |= 16;
                urzVar5.f = str3;
                akzxVarM3.u();
                defpackage.urz urzVar6 = (defpackage.urz) akzxVarM3.b;
                urzVar6.j = 2;
                urzVar6.b |= 256;
                long j = usyVar2.b.c;
                akzxVarM3.u();
                defpackage.urz urzVar7 = (defpackage.urz) akzxVarM3.b;
                urzVar7.b |= 64;
                urzVar7.h = j;
                defpackage.urz urzVar8 = (defpackage.urz) akzxVarM3.p();
                defpackage.usp uspVar = new defpackage.usp();
                amxr.g(uspVar);
                ahgl.b(uspVar, urzVar8);
                uspVar.r(usyVar2.e.I(), "survey_dialog_fragment");
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.uvo uvoVar = (defpackage.uvo) this.a;
                java.lang.String str4 = uvoVar.f.e;
                defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logUserContinuedFromTranscriptView", 101, "FeedbackMetricsLogger.java").v("logging user continued from transcript view");
                uvoVar.d.b(str4, new lct(18));
                uvoVar.b();
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.uwc uwcVar = (defpackage.uwc) this.a;
                defpackage.afpl afplVar = new defpackage.afpl((android.app.Activity) uwcVar.e.G());
                com.google.android.gms.googlehelp.GoogleHelp googleHelp = new com.google.android.gms.googlehelp.GoogleHelp((java.lang.String) uwcVar.f.a());
                googleHelp.q = android.net.Uri.parse((java.lang.String) uwcVar.g.a());
                com.google.android.gms.feedback.ThemeSettings themeSettings = new com.google.android.gms.feedback.ThemeSettings(3, 0);
                themeSettings.a = 3;
                googleHelp.s = themeSettings;
                afplVar.N(googleHelp.a());
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj2 = this.a;
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2).t.n(rmw.cf);
                defpackage.afsn afsnVar = new defpackage.afsn((android.content.Context) obj2, 0);
                afsnVar.x(2132019842);
                afsnVar.r(2132019843);
                afsnVar.w(2132019855, new ktq(obj2, 15));
                afsnVar.t(2132019831, new ktq(obj2, 16));
                cy cyVarCreate = afsnVar.create();
                cyVarCreate.setOnShowListener(new jlg(obj2, 12));
                cyVarCreate.show();
                break;
            case 15:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).x();
                break;
            case 16:
                ((com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) this.a).r.k();
                break;
            case 17:
                ((defpackage.vrh) this.a).j();
                break;
            case 18:
                com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer recordLottieViewContainer = (com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer) this.a;
                defpackage.vtk vtkVar = recordLottieViewContainer.b.e;
                com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer.a.b().l("com/android/dialer/voicemail/settings/widget/RecordLottieViewContainer", "clickRecord", 88, "RecordLottieViewContainer.java").y("component: %s", vtkVar);
                if (vtkVar == defpackage.vtk.b) {
                    recordLottieViewContainer.a(2, 0.0f);
                } else if (vtkVar == defpackage.vtk.d) {
                    recordLottieViewContainer.callOnClick();
                }
                break;
            case 19:
                aimw aimwVarL = com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer.a.b().l("com/android/dialer/voicemail/settings/widget/RecordLottieViewContainer", "clickPlayback", 99, "RecordLottieViewContainer.java");
                com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer recordLottieViewContainer2 = (com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer) this.a;
                aimwVarL.y("component: %s", recordLottieViewContainer2.c.e);
                recordLottieViewContainer2.callOnClick();
                break;
            default:
                defpackage.vwk vwkVar = (defpackage.vwk) this.a;
                if (vwkVar.f.isPresent() && (((defpackage.vtx) vwkVar.f.orElseThrow()).b & 8) != 0) {
                    defpackage.vvb vvbVar = vwkVar.g;
                    aw awVar2 = vwkVar.a;
                    defpackage.vtw vtwVar = ((defpackage.vtx) vwkVar.f.orElseThrow()).f;
                    if (vtwVar == null) {
                        vtwVar = defpackage.vtw.a;
                    }
                    int iAd = a.ad(vtwVar.c);
                    int i6 = iAd != 0 ? iAd : 1;
                    vzi vziVar = ((defpackage.vtx) vwkVar.f.orElseThrow()).c;
                    if (vziVar == null) {
                        vziVar = vzi.a;
                    }
                    vvbVar.d(awVar2, i6, vziVar);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ szl(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }

    public szl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public szl(defpackage.usy usyVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(usyVar);
        this.a = usyVar;
    }
}
