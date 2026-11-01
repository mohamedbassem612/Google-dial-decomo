package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class quy implements odm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public quy(defpackage.qqj qqjVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qqjVar);
        this.a = qqjVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r2v91, types: [aonj, java.lang.Object] */
    public final /* synthetic */ void a(java.lang.Object obj) throws aois {
        aw awVarA;
        rnv rnvVar;
        rmx rmxVar;
        j$.util.Optional optional;
        int i = 14;
        int i2 = 18;
        int i3 = 2;
        int i4 = 4;
        int i5 = 3;
        int i6 = 0;
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                ahoq ahoqVarW = ahvr.W(661, "AudioSelectorFragmentPeer_modelCallback_onDataLoad");
                try {
                    defpackage.quz.a.b().l("com/android/dialer/incall/voice/audioselector/ui/AudioSelectorFragmentPeer$modelCallback$<anonymous>", "onDataLoad$<anonymous>", 83, "AudioSelectorFragmentPeer.kt").y("newModelOptional.isPresent: %b", java.lang.Boolean.valueOf(optional2.isPresent()));
                    defpackage.pcq pcqVar = (defpackage.pcq) aooh.q(optional2);
                    if (pcqVar != null) {
                        ((defpackage.quz) obj2).g.b(pcqVar);
                        ahbv.D(((defpackage.quz) obj2).e);
                        break;
                    }
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW, th);
                        throw th2;
                    }
                }
            case 1:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                defpackage.qqj qqjVar = (defpackage.qqj) this.a;
                defpackage.qqh qqhVar = qqjVar.b;
                android.widget.ImageView imageView = (android.widget.ImageView) ((aw) qqhVar).Q.findViewById(2131428727);
                android.widget.TextView textView = (android.widget.TextView) ((aw) qqhVar).Q.findViewById(2131428728);
                if (!optional3.isPresent()) {
                    ((aw) qqhVar).Q.setVisibility(8);
                    return;
                }
                ((aw) qqhVar).Q.setVisibility(0);
                defpackage.abwd abwdVar = ((defpackage.qqe) optional3.orElseThrow()).a;
                qqjVar.f.g(imageView, abwdVar, oph.a(), false);
                textView.setText(abwdVar.c);
                return;
            case 2:
                java.lang.Object obj3 = this.a;
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                ahoq ahoqVarW2 = ahvr.W(670, "CallAssistFragmentPeer_modelCallback_onDataLoad");
                try {
                    defpackage.qyb.a.b().l("com/android/dialer/incall/voice/culdesac/callassist/ui/CallAssistFragmentPeer$modelCallback$<anonymous>", "onDataLoad$<anonymous>", 110, "CallAssistFragmentPeer.kt").y("newModelOptional.isPresent: %b", java.lang.Boolean.valueOf(optional4.isPresent()));
                    defpackage.qxw qxwVar = (defpackage.qxw) aooh.q(optional4);
                    if (qxwVar != null) {
                        defpackage.qxo qxoVar = qxwVar.a;
                        if (!((defpackage.qyb) obj3).j) {
                            alat alatVar = qxoVar.d;
                            aooh.e(alatVar, "getVoiceButtonsList(...)");
                            if (!alatVar.isEmpty()) {
                                ((defpackage.qyb) obj3).j = true;
                                java.lang.String str = qxoVar.e;
                                aooh.e(str, "getCallId(...)");
                                ahoq ahoqVarW3 = ahvr.W(672, "CallAssistFragmentPeer_logCallAssistShownEvent");
                                try {
                                    zas zasVarI = ((defpackage.qyb) obj3).m.i(str);
                                    ((defpackage.qyb) obj3).p.aG(((defpackage.qyb) obj3).b.N(), new defpackage.qsu(zasVarI, 3), new defpackage.qsu(zasVarI, i4));
                                    ajsz.ak(ahoqVarW3, (java.lang.Throwable) null);
                                } catch (java.lang.Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (java.lang.Throwable th4) {
                                        ajsz.ak(ahoqVarW3, th3);
                                        throw th4;
                                    }
                                }
                            }
                        }
                        ((defpackage.qyb) obj3).i.b(qxoVar);
                        ((defpackage.qyb) obj3).e.a(j$.util.Optional.ofNullable(qxwVar.b));
                        alat<defpackage.quf> alatVar2 = qxoVar.d;
                        aooh.e(alatVar2, "getVoiceButtonsList(...)");
                        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar2, 10));
                        for (defpackage.quf qufVar : alatVar2) {
                            defpackage.rhx rhxVarBA = pez.bA(defpackage.rct.a.m());
                            defpackage.qug qugVarB = defpackage.qug.b(qufVar.e);
                            if (qugVarB == null) {
                                qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                            }
                            rhxVarBA.f(qugVarB);
                            rhxVarBA.g(qufVar.c == 2 ? ((java.lang.Integer) qufVar.d).intValue() : 0);
                            rhxVarBA.h(qufVar.j);
                            arrayList.add(rhxVarBA.e());
                        }
                        ((defpackage.qyb) obj3).g.b(ahvr.bx(arrayList), qxoVar.e);
                        ahbv.D(((defpackage.qyb) obj3).b);
                    }
                    ajsz.ak(ahoqVarW2, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th5) {
                    try {
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        ajsz.ak(ahoqVarW2, th5);
                        throw th6;
                    }
                }
            case 3:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                defpackage.qyv.a.b().l("com/android/dialer/incall/voice/culdesac/ui/CuldesacFragmentPeer$modelCallback$<anonymous>", "onDataLoad", 83, "CuldesacFragmentPeer.kt").y("newModelOptional.isPresent: %b", java.lang.Boolean.valueOf(optional5.isPresent()));
                defpackage.qyr qyrVar = (defpackage.qyr) aooh.q(optional5);
                if (qyrVar != null) {
                    alat alatVar3 = qyrVar.b;
                    aooh.e(alatVar3, "getCategoryButtonsList(...)");
                    if (!alatVar3.isEmpty()) {
                        java.lang.Object obj4 = this.a;
                        defpackage.qyv qyvVar = (defpackage.qyv) obj4;
                        if (!aooh.n(qyvVar.b().b, qyrVar.b)) {
                            qyvVar.k.aF(qyvVar.b.N(), new defpackage.pmw(obj4, qyrVar, i2));
                        }
                    }
                    defpackage.qyv qyvVar2 = (defpackage.qyv) this.a;
                    qyvVar2.g.b(qyrVar);
                    ahbv.D(qyvVar2.b);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optional6 = (j$.util.Optional) obj;
                ahoq ahoqVarW4 = ahvr.W(678, "MoreMenuFragmentPeer_modelCallback_onDataLoad");
                try {
                    defpackage.qzk.a.b().l("com/android/dialer/incall/voice/moremenu/ui/MoreMenuFragmentPeer$modelCallback$<anonymous>", "onDataLoad$<anonymous>", 94, "MoreMenuFragmentPeer.kt").y("newModelOptional.isPresent: %b", java.lang.Boolean.valueOf(optional6.isPresent()));
                    defpackage.qze qzeVar = (defpackage.qze) aooh.q(optional6);
                    if (qzeVar != null) {
                        java.util.List<defpackage.qzb> list = qzeVar.b;
                        boolean zIsEmpty = list.isEmpty();
                        java.lang.Object obj5 = this.a;
                        if (!zIsEmpty || ((defpackage.qzk) obj5).a().b.isEmpty()) {
                            ((defpackage.qzk) obj5).h.b(qzeVar);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
                            for (defpackage.qzb qzbVar : list) {
                                defpackage.rhx rhxVarBA2 = pez.bA(defpackage.rct.a.m());
                                rhxVarBA2.f(qzbVar.e);
                                rhxVarBA2.g(qzbVar.a);
                                rhxVarBA2.h(qzbVar.f);
                                arrayList2.add(rhxVarBA2.e());
                            }
                            ((defpackage.qzk) obj5).f.b(ahvr.bx(arrayList2), qzeVar.a);
                            ahbv.D(((defpackage.qzk) obj5).e);
                        }
                        break;
                    }
                    ajsz.ak(ahoqVarW4, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th7) {
                    try {
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        ajsz.ak(ahoqVarW4, th7);
                        throw th8;
                    }
                }
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optional7 = (j$.util.Optional) obj;
                if (optional7.isPresent()) {
                    defpackage.rdk rdkVar = (defpackage.rdk) this.a;
                    rdkVar.n((defpackage.rcc) aooh.q(optional7));
                    rdkVar.o();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.roj rojVar = (defpackage.roj) obj;
                defpackage.rpn.a.b().l("com/android/dialer/main/impl/ui/CoverScreenMainFragmentPeer", "updateRootView", 99, "CoverScreenMainFragmentPeer.kt").y("Show default dialer = %b", java.lang.Boolean.valueOf(rojVar.b));
                boolean z = rojVar.b;
                java.lang.Object obj6 = this.a;
                if (z) {
                    awVarA = ((mhy) ((defpackage.rpn) obj6).h.g().orElseThrow()).a();
                } else {
                    aoin aoinVar = (aoin) ((defpackage.rpn) obj6).i.k().get(roc.b);
                    awVarA = (aoinVar == null || (rnvVar = (rnv) aoinVar.a()) == null) ? null : rnvVar.a();
                    if (awVarA == null) {
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    }
                }
                defpackage.rpn rpnVar = (defpackage.rpn) obj6;
                defpackage.rpm rpmVar = rpnVar.b;
                u uVar = new u(rpmVar.I());
                uVar.q(2131427908, awVarA, (java.lang.String) null);
                uVar.c();
                if (rojVar.c) {
                    defpackage.rpp.aU().r(rpmVar.I(), "device_incompatible_dialog");
                    rpnVar.c.e();
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.rqv rqvVar = ((rrw) obj).a;
                if (rqvVar != null) {
                    ((defpackage.rqz) this.a).e(rqvVar);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.rqv rqvVar2 = ((rrw) obj).a;
                if (rqvVar2 != null) {
                    ((defpackage.rri) this.a).e(rqvVar2);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.rtj rtjVar = (defpackage.rtj) obj;
                defpackage.rtp.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/marquee/impl/ui/MarqueeFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 94, "MarqueeFragmentPeer.kt").v("loaded MarqueeLoadResult");
                java.lang.Object obj7 = this.a;
                defpackage.rtp rtpVar = (defpackage.rtp) obj7;
                rtpVar.i.b(rtjVar);
                android.view.View viewN = rtpVar.e.N();
                j$.util.Objects.checkIndex(0, 3);
                if (rtjVar instanceof rti) {
                    rtpVar.n.i((java.lang.String) null).b(mce.gK);
                } else {
                    if (!(rtjVar instanceof defpackage.rth)) {
                        throw new aois();
                    }
                    defpackage.rth rthVar = (defpackage.rth) rtjVar;
                    int iAf = anty.af(rthVar.b);
                    if (iAf == 0) {
                        rmxVar = rmx.sa;
                    } else if (iAf == 1) {
                        rmxVar = rmx.sb;
                    } else if (iAf == 2) {
                        rmxVar = rmx.sc;
                    } else if (iAf == 3) {
                        rmxVar = rmx.sd;
                    } else {
                        if (iAf != 4) {
                            throw new aois();
                        }
                        rmxVar = rmx.se;
                    }
                    rtpVar.f.o(rmxVar);
                    rsd rsdVar = rtpVar.j;
                    rrz rrzVar = rthVar.a;
                    if (rsdVar != rrzVar.b()) {
                        rrzVar.g();
                    }
                    rtpVar.o.aF(viewN, new defpackage.qsu(obj7, i2));
                    if (((java.lang.Boolean) rtpVar.h.a()).booleanValue()) {
                        rtpVar.d.b(rrzVar.b());
                    }
                }
                rsd rsdVarB = rtjVar instanceof defpackage.rth ? ((defpackage.rth) rtjVar).a.b() : null;
                rsd rsdVar2 = rtpVar.j;
                if (rsdVar2 == null || rsdVarB == rsdVar2) {
                    return;
                }
                rtpVar.o.aF(viewN, new defpackage.qsu(obj7, 19));
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.rvs rvsVar = (defpackage.rvs) obj;
                defpackage.rvz.a.b().l("com/android/dialer/multibindingsettings/impl/DialerSettingsFragmentPeer$1", "onDataLoad", 88, "DialerSettingsFragmentPeer.java").v("onDataLoad");
                androidx.preference.PreferenceScreen preferenceScreen = ((defpackage.rvz) this.a).f;
                synchronized (preferenceScreen) {
                    java.util.List list2 = ((androidx.preference.PreferenceGroup) preferenceScreen).b;
                    for (int size = list2.size() - 1; size >= 0; size--) {
                        preferenceScreen.ag((androidx.preference.Preference) list2.get(0));
                    }
                    break;
                }
                preferenceScreen.C();
                aimz aimzVar = defpackage.rvz.a;
                aimzVar.b().l("com/android/dialer/multibindingsettings/impl/DialerSettingsFragmentPeer$1", "onDataLoad", 91, "DialerSettingsFragmentPeer.java").v("enable banner infra");
                defpackage.ruu ruuVar = rvsVar.b;
                if (ruuVar != null) {
                    aimzVar.b().l("com/android/dialer/multibindingsettings/impl/DialerSettingsFragmentPeer$1", "onDataLoad", 93, "DialerSettingsFragmentPeer.java").v("has banner data");
                    defpackage.rvz rvzVar = (defpackage.rvz) this.a;
                    com.android.dialer.multibindingsettings.impl.BannerPreference bannerPreference = new com.android.dialer.multibindingsettings.impl.BannerPreference(rvzVar.b, null);
                    bannerPreference.L(rvzVar.b.getString(2132017501));
                    bannerPreference.e = ruuVar.a;
                    bannerPreference.c = ruuVar.b;
                    bannerPreference.d = ruuVar.c;
                    defpackage.rut rutVar = ruuVar.d;
                    if (rutVar != null) {
                        bannerPreference.a = rutVar.a;
                        bannerPreference.b = rutVar.b;
                    }
                    rvzVar.f.ae(bannerPreference);
                }
                java.lang.Object obj8 = this.a;
                aify aifyVar = rvsVar.a;
                aidf aidfVar = new aidf((byte[]) null);
                aigb aigbVar = new aigb(4);
                int size2 = aifyVar.size();
                int i7 = 0;
                while (i7 < size2) {
                    defpackage.rvb rvbVar = (defpackage.rvb) aifyVar.get(i7);
                    androidx.preference.Preference preference = new androidx.preference.Preference(((defpackage.rvz) obj8).b);
                    defpackage.rvc rvcVar = rvbVar.c;
                    preference.L(rvcVar.name());
                    pez pezVar = rvbVar.d;
                    j$.util.Objects.requireNonNull(pezVar);
                    j$.util.Objects.checkIndex(0, i5);
                    if (pezVar == null) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    preference.P(((defpackage.rva) pezVar).a);
                    android.graphics.drawable.Drawable drawable = rvbVar.a;
                    if (drawable != null) {
                        preference.K(drawable);
                    }
                    preference.o = new jrv(obj8, 5);
                    preference.q = -1;
                    preference.ac();
                    aidfVar.t(rvbVar.b, preference);
                    aigbVar.i(preference, rvcVar);
                    i7++;
                    i5 = 3;
                }
                j$.util.DesugarArrays.stream(defpackage.ruz.values()).forEach(new rh(obj8, aidfVar, 14));
                ((defpackage.rvz) obj8).i = aigbVar.e(true);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optional8 = (j$.util.Optional) obj;
                java.lang.Object obj9 = this.a;
                defpackage.tbs tbsVar = ((defpackage.tbu) obj9).b;
                ((android.widget.TextView) ((aw) tbsVar).Q.findViewById(2131427718)).setText((java.lang.CharSequence) (true != optional8.isPresent() ? optional8 : j$.util.Optional.ofNullable(((defpackage.tao) optional8.get()).b)).orElse(""));
                android.widget.TextView textView2 = (android.widget.TextView) ((aw) tbsVar).Q.findViewById(2131429151);
                if (true != optional8.isPresent()) {
                    optional = optional8;
                } else {
                    optional = ((defpackage.tao) optional8.get()).c;
                    optional.getClass();
                }
                textView2.setText((java.lang.CharSequence) optional.orElse(""));
                defpackage.rhb rhbVar = new defpackage.rhb(obj9, 20);
                if (true == optional8.isPresent()) {
                    java.lang.Object obj10 = optional8.get();
                    defpackage.tbu tbuVar = (defpackage.tbu) rhbVar.a;
                    android.widget.ImageView imageView2 = (android.widget.ImageView) ((aw) tbuVar.b).Q.findViewById(2131427525);
                    defpackage.abwd abwdVar2 = ((defpackage.tao) obj10).a;
                    defpackage.akcu akcuVar = new defpackage.akcu();
                    akcuVar.f();
                    akcuVar.g(false);
                    akcuVar.h(false);
                    tbuVar.f.g(imageView2, abwdVar2, akcuVar.e(), false);
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((defpackage.ubh) this.a).a().k(((defpackage.ubf) obj).c);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj11 = this.a;
                j$.util.Optional optional9 = (j$.util.Optional) obj;
                defpackage.ubv ubvVar = new defpackage.ubv(new tge(obj11, 4), i6);
                if (true == optional9.isPresent()) {
                    ubvVar.a.a(optional9.get());
                }
                ahbv.D(((defpackage.ubw) obj11).b);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional10 = (j$.util.Optional) obj;
                defpackage.ubv ubvVar2 = new defpackage.ubv(this.a, i3);
                if (true == optional10.isPresent()) {
                    ((com.google.android.libraries.communications.ux.views.promo.PromoCard) ((aw) ((defpackage.ucc) ubvVar2.a).b).Q.findViewById(2131428742)).setEnabled(((defpackage.uap) optional10.get()).c);
                    return;
                }
                return;
            case 15:
                unc uncVar = (ttj) obj;
                defpackage.uoo.b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoad", 142, "FavoritesBarFragmentPeer.kt").v("enter");
                java.lang.Object obj12 = this.a;
                defpackage.uoo uooVar = (defpackage.uoo) obj12;
                uooVar.c(uncVar);
                if (uooVar.p) {
                    uooVar.p = false;
                    uooVar.B.aF(uooVar.d.N(), new defpackage.sxq(obj12, i2));
                    uooVar.c.d();
                    if (uncVar instanceof unc) {
                        uooVar.j.o(uncVar.b ? rmx.rV : rmx.rW);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((defpackage.uza) this.a).g = (j$.util.Optional) obj;
                return;
            case 17:
                j$.util.Optional optional11 = (j$.util.Optional) obj;
                if (!optional11.isPresent()) {
                    defpackage.uzf.a.b().l("com/android/dialer/videohandoverdialog/impl/ui/VideoHandoverDialogHeadlessFragmentPeer$1", "onDataLoad", 49, "VideoHandoverDialogHeadlessFragmentPeer.java").v("no video handover dialog model yet.");
                    return;
                }
                defpackage.uyq uyqVar = (defpackage.uyq) optional11.orElseThrow();
                boolean z2 = uyqVar.d;
                defpackage.uzf uzfVar = (defpackage.uzf) this.a;
                defpackage.uzd uzdVar = uzfVar.b;
                defpackage.uyx uyxVarE = uzdVar.I().e("video_handover_dialog_fragment");
                boolean z3 = uyxVarE != null;
                defpackage.uzf.a.b().l("com/android/dialer/videohandoverdialog/impl/ui/VideoHandoverDialogHeadlessFragmentPeer$1", "onDataLoad", 63, "VideoHandoverDialogHeadlessFragmentPeer.java").L("should show video handover dialog: %b, video handover dialog is showing: %b", z2, z3);
                if (!z2) {
                    if (z3) {
                        uzfVar.c.o(rmx.fB);
                        j$.util.Optional optionalA = uzfVar.a(uyqVar);
                        if (true == optionalA.isPresent()) {
                            ((defpackage.zlr) optionalA.get()).k();
                        }
                        uyxVarE.f();
                        return;
                    }
                    return;
                }
                if (z3) {
                    return;
                }
                uzfVar.c.o(rmx.fA);
                j$.util.Optional optionalA2 = uzfVar.a(uyqVar);
                if (true == optionalA2.isPresent()) {
                    agsm.i(960, ((defpackage.pvr) ((defpackage.zlr) optionalA2.get()).a).e(), "Failed to pause video.", new java.lang.Object[0]);
                }
                defpackage.uyy uyyVar = uyqVar.e;
                if (uyyVar == null) {
                    uyyVar = defpackage.uyy.a;
                }
                defpackage.uyx uyxVar = new defpackage.uyx();
                amxr.g(uyxVar);
                ahgl.b(uyxVar, uyyVar);
                uyxVar.r(uzdVar.I(), "video_handover_dialog_fragment");
                return;
            default:
                java.lang.Object obj13 = this.a;
                j$.util.Optional optional12 = (j$.util.Optional) obj;
                defpackage.wlm wlmVar = new defpackage.wlm(obj13, i);
                if (true == optional12.isPresent()) {
                    ((defpackage.wtk) wlmVar.a).i((defpackage.wlc) optional12.get());
                }
                defpackage.wtk wtkVar = (defpackage.wtk) obj13;
                wtkVar.z = optional12;
                if (optional12.isPresent()) {
                    java.util.Iterator it = ((defpackage.wlc) optional12.orElseThrow()).e.iterator();
                    while (it.hasNext()) {
                        if (((defpackage.wlf) it.next()).c == 2) {
                            hgb.c(defpackage.wtk.a.b(), "stopping Xatu timer", "com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer$3", "onDataLoad", (char) 239, "XatuInCallFragmentPeer.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
                            ruc rucVar = wtkVar.c;
                            rucVar.m(ruc.q);
                            rucVar.n(ruc.r, rub.b);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [aonj, java.lang.Object] */
    public final void b(java.lang.Throwable th) throws java.lang.Throwable {
        switch (this.$cid) {
            case 0:
                defpackage.quz.a.d().k(th).l("com/android/dialer/incall/voice/audioselector/ui/AudioSelectorFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 91, "AudioSelectorFragmentPeer.kt").v("failed loading AudioRouteSelectorModel");
                ahbv.D(((defpackage.quz) this.a).e);
                return;
            case 1:
                a.bq(defpackage.qqj.a.c(), "Error with ProfilePhotoModel DataServiceCallbacks", "com/android/dialer/incall/video/profilephoto/ui/ProfilePhotoFragmentPeer$1", "onDataLoadError", 'L', "ProfilePhotoFragmentPeer.java", th, zct.b);
                return;
            case 2:
                defpackage.qyb.a.d().k(th).l("com/android/dialer/incall/voice/culdesac/callassist/ui/CallAssistFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 129, "CallAssistFragmentPeer.kt").v("failed loading CategoryMenuUiModel");
                defpackage.qyb qybVar = (defpackage.qyb) this.a;
                j$.util.Optional optionalH = qybVar.k.h();
                defpackage.qkv qkvVar = new defpackage.qkv(new qks(8), 9);
                if (true == optionalH.isPresent()) {
                    optionalH = j$.util.Optional.ofNullable(a.l((aonj) qkvVar.a, optionalH.get()));
                }
                gpd gpdVar = qybVar.m;
                aooh.e(optionalH, "map(...)");
                gpdVar.i((java.lang.String) aooh.q(optionalH)).a(mcd.aI);
                ahbv.D(qybVar.b);
                return;
            case 3:
                defpackage.qyv.a.d().k(th).l("com/android/dialer/incall/voice/culdesac/ui/CuldesacFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 99, "CuldesacFragmentPeer.kt").v("failed loading CuldesacUiModel");
                ahbv.D(((defpackage.qyv) this.a).b);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qzk.a.d().k(th).l("com/android/dialer/incall/voice/moremenu/ui/MoreMenuFragmentPeer$modelCallback$<anonymous>", "onDataLoadError", 108, "MoreMenuFragmentPeer.kt").v("failed loading MoreMenuUiModel");
                ahbv.D(((defpackage.qzk) this.a).e);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.rdk rdkVar = (defpackage.rdk) this.a;
                rdkVar.J.i(rdkVar.e()).a(mcd.s);
                defpackage.rdk.a.c().k(th).m(aioa.b).l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 389, "VoiceFragmentPeer.kt").v("failed to load VoiceModel");
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.rpn.a.d().k(th).l("com/android/dialer/main/impl/ui/CoverScreenMainFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 53, "CoverScreenMainFragmentPeer.kt").v("couldn't load CoverScreenFragmentDataModel.");
                throw th;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer$callbacks$<anonymous>", "onDataLoadError", 96, "DialpadSearchFragmentPeer.kt").v("failed to load");
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.rri.b.b().l("com/android/dialer/main/impl/ui/searchcontainer/NewDialpadSearchFragmentPeer$callbacks$<anonymous>", "onDataLoadError", 95, "NewDialpadSearchFragmentPeer.kt").v("failed to load");
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.rtp.a.d().k(th).l("com/android/dialer/marquee/impl/ui/MarqueeFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 133, "MarqueeFragmentPeer.kt").v("couldn't load MarqueeLoadResult");
                ((defpackage.rtp) this.a).n.i((java.lang.String) null).a(mcd.aH);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                throw new defpackage.ahzr("failed to load Preference data", th);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                a.bq(defpackage.tbu.a.c(), "failed to load RevelioSummaryCenterFragmentModel", "com/android/dialer/revelio/impl/tidepods/impl/ui/RevelioSummaryCenterFragmentPeer$1", "onDataLoadError", '<', "RevelioSummaryCenterFragmentPeer.java", th, zct.b);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                a.bq(defpackage.ubh.a.c(), "failed to load SonicSettingsFragmentModel", "com/android/dialer/sonic/impl/settings/SonicSettingsFragmentPeer$1", "onDataLoadError", '5', "SonicSettingsFragmentPeer.java", th, zct.b);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.ubw ubwVar = (defpackage.ubw) this.a;
                ubwVar.k.i(ubwVar.b()).a(mcd.ag);
                defpackage.ubw.a.c().k(th).m(aioa.b).l("com/android/dialer/sonic/impl/ui/SonicGridFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 125, "SonicGridFragmentPeer.kt").v("failed to load SonicGridFragmentModel");
                ahbv.D(ubwVar.b);
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.ucc uccVar = (defpackage.ucc) this.a;
                uccVar.h.i(uccVar.c()).a(mcd.ah);
                defpackage.ucc.a.c().k(th).m(aioa.b).l("com/android/dialer/sonic/impl/ui/SonicPromoCenterFragmentPeer$1", "onDataLoadError", 71, "SonicPromoCenterFragmentPeer.java").v("failed to load SonicPromoFragmentModel");
                return;
            case 15:
                defpackage.uoo.b.d().k(th).l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer$subscriptionCallbacks$<anonymous>", "onDataLoadError", 167, "FavoritesBarFragmentPeer.kt").v("couldn't load FavoritesBarUiModel");
                ((defpackage.uoo) this.a).x.i((java.lang.String) null).a(mcd.aC);
                return;
            case 16:
                a.bq(defpackage.uza.a.d(), "failed to load VideoHandoverDialogModel at VideoHandoverDialogFragmentPeer", "com/android/dialer/videohandoverdialog/impl/ui/VideoHandoverDialogFragmentPeer$1", "onDataLoadError", 'F', "VideoHandoverDialogFragmentPeer.java", th, zct.b);
                return;
            case 17:
                a.bq(defpackage.uzf.a.d(), "failed to load VideoHandoverDialogModel at VideoHandoverDialogHeadlessFragmentPeer", "com/android/dialer/videohandoverdialog/impl/ui/VideoHandoverDialogHeadlessFragmentPeer$1", "onDataLoadError", 'Z', "VideoHandoverDialogHeadlessFragmentPeer.java", th, zct.b);
                return;
            default:
                a.bq(defpackage.wtk.a.c(), "failed to load XatuInCallFragmentModel", "com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer$3", "onDataLoadError", (char) 253, "XatuInCallFragmentPeer.java", th, zct.b);
                return;
        }
    }

    public quy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public quy(defpackage.rvz rvzVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(rvzVar);
        this.a = rvzVar;
    }

    public quy(defpackage.tbu tbuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(tbuVar);
        this.a = tbuVar;
    }

    public quy(defpackage.ubh ubhVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ubhVar);
        this.a = ubhVar;
    }

    public quy(defpackage.ucc uccVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uccVar);
        this.a = uccVar;
    }

    public quy(defpackage.uza uzaVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uzaVar);
        this.a = uzaVar;
    }

    public quy(defpackage.uzf uzfVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uzfVar);
        this.a = uzfVar;
    }

    public quy(defpackage.wtk wtkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wtkVar);
        this.a = wtkVar;
    }
}
