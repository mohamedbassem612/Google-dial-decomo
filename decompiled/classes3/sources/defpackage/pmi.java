package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pmi implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public pmi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0554  */
    /* JADX WARN: Code duplicated, block: B:155:0x05b3  */
    public final /* synthetic */ defpackage.ahtm a(ahth ahthVar) {
        android.widget.CheckBox checkBox;
        ajcq ajcqVarD;
        ajcq ajcqVarC;
        boolean z = false;
        int i = 1;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optionalA = ((defpackage.pmh) this.a).a();
                if (true == optionalA.isPresent()) {
                    defpackage.plv plvVar = (defpackage.plv) optionalA.get();
                    agsm.i(488, aosv.F(plvVar.b, 0, new loe(plvVar, (aoln) null, 17), 3), "Failed to invoke consultative call transfer.", new java.lang.Object[0]);
                }
                return defpackage.ahtm.a;
            case 1:
                defpackage.pdf.a.b().l("com/android/dialer/incall/audioroute/ui/TidepodsAudioRouteSelectorActivityPeer", "onAudioRouteSelectorDialogDismissEvent", 52, "TidepodsAudioRouteSelectorActivityPeer.kt").v("audio route dialog dismissed. finishing activity");
                ((defpackage.pdf) this.a).b.finish();
                return defpackage.ahtm.a;
            case 2:
                defpackage.pxt.a.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onNegativeButtonClicked", 119, "InCallDialogFragmentPeer.java").v("onNegativeButtonClicked");
                defpackage.pxt pxtVar = (defpackage.pxt) this.a;
                defpackage.pxk pxkVar = (defpackage.pxk) pxtVar.c.b.get();
                if (pxkVar == null) {
                    defpackage.pxm.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogController", "onNegativeClick", 111, "InCallDialogController.java").v("negative click but dialogConfig changed, ignored");
                } else if (pxkVar.a.equals(pxtVar.b)) {
                    j$.util.Optional optional = pxkVar.c;
                    if (true == optional.isPresent()) {
                        ((defpackage.rai) optional.get()).c();
                    }
                } else {
                    defpackage.pxm.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogController", "onNegativeClick", 111, "InCallDialogController.java").v("negative click but dialogConfig changed, ignored");
                }
                return defpackage.ahtm.a;
            case 3:
                defpackage.pxt.a.b().l("com/android/dialer/incall/dialog/ui/InCallDialogFragmentPeer", "onPositiveButtonClicked", 112, "InCallDialogFragmentPeer.java").v("onPositiveButtonClicked");
                defpackage.pxt pxtVar2 = (defpackage.pxt) this.a;
                defpackage.pxk pxkVar2 = (defpackage.pxk) pxtVar2.c.b.get();
                if (pxkVar2 == null) {
                    defpackage.pxm.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogController", "onPositiveClick", 96, "InCallDialogController.java").v("positive click but dialogConfig changed, ignored");
                } else if (pxkVar2.a.equals(pxtVar2.b)) {
                    j$.util.Optional optional2 = pxkVar2.b;
                    if (true == optional2.isPresent()) {
                        ((defpackage.rai) optional2.get()).c();
                    }
                } else {
                    defpackage.pxm.a.b().l("com/android/dialer/incall/dialog/service/InCallDialogController", "onPositiveClick", 96, "InCallDialogController.java").v("positive click but dialogConfig changed, ignored");
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qcw qcwVar = (defpackage.qcw) this.a;
                qcwVar.a(qbc.dl);
                qcwVar.b(false);
                qcwVar.a(qbc.dm);
                qcwVar.b.G().finish();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.qcw qcwVar2 = (defpackage.qcw) this.a;
                qcwVar2.a(qbc.dk);
                qcwVar2.b(true);
                qcwVar2.a(qbc.dm);
                qcwVar2.b.G().finish();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                j$.util.Optional optionalF = ((defpackage.qhj) this.a).f();
                if (true == optionalF.isPresent()) {
                    ((defpackage.qfj) optionalF.get()).a();
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj = this.a;
                j$.util.Optional optionalF2 = ((defpackage.qhj) obj).f();
                defpackage.qgz qgzVar = new defpackage.qgz(obj, (defpackage.qhq) ahthVar, i);
                if (true == optionalF2.isPresent()) {
                    java.lang.Object obj2 = optionalF2.get();
                    java.lang.Object obj3 = qgzVar.b;
                    defpackage.qfj qfjVar = (defpackage.qfj) obj2;
                    if (((defpackage.qhq) qgzVar.a).a) {
                        agsm.i(606, ((defpackage.qhj) obj3).K.c(), "Failed to suppress Rtt Merge Dialog", new java.lang.Object[0]);
                    }
                    qfjVar.b();
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                final defpackage.qhj qhjVar = (defpackage.qhj) this.a;
                j$.util.Optional optionalOfNullable = qhjVar.v;
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qfz) optionalOfNullable.get()).y));
                }
                if (((java.lang.Boolean) optionalOfNullable.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    qhjVar.u.b("android.permission.BLUETOOTH_CONNECT");
                }
                final boolean z2 = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
                zmq zmqVar = qhjVar.i;
                zms zmsVar = qhjVar.j;
                defpackage.qgw qgwVar = qhjVar.l;
                qhjVar.n = new defpackage.qgs(zmqVar, zmsVar, qgwVar.z(), new qgr() { // from class: qha
                    public final void a() {
                        defpackage.qhj qhjVar2 = qhjVar;
                        if (z2) {
                            qhjVar2.m.showAtLocation(((aw) qhjVar2.l).Q, 51, 0, 0);
                        } else {
                            qhjVar2.m.showAtLocation(((aw) qhjVar2.l).Q, 53, 0, 0);
                        }
                    }
                });
                defpackage.qgs qgsVar = qhjVar.n;
                j$.util.Optional optionalOfNullable2 = qhjVar.v;
                if (true == optionalOfNullable2.isPresent()) {
                    defpackage.qgo qgoVar = ((defpackage.qfz) optionalOfNullable2.get()).r;
                    if (qgoVar == null) {
                        qgoVar = defpackage.qgo.a;
                    }
                    optionalOfNullable2 = j$.util.Optional.ofNullable(qgoVar);
                }
                qgsVar.a((defpackage.qgo) optionalOfNullable2.orElse((java.lang.Object) null));
                if (z2) {
                    qhjVar.n.showAtLocation(((aw) qgwVar).Q, 51, 0, 0);
                } else {
                    qhjVar.n.showAtLocation(((aw) qgwVar).Q, 53, 0, 0);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooh.f((defpackage.ahtf) ahthVar, "event");
                android.app.Dialog dialog = ((al) ((defpackage.qhr) this.a).a).d;
                if (dialog != null && (checkBox = (android.widget.CheckBox) dialog.findViewById(2131428780)) != null && checkBox.getVisibility() == 0 && checkBox.isChecked()) {
                    z = true;
                }
                return new defpackage.ahtm(new defpackage.qhq(z));
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.oza ozaVar = (defpackage.oza) ahthVar;
                aooh.f(ozaVar, "acceptEvent");
                java.lang.String str = ozaVar.a;
                defpackage.qnv qnvVar = (defpackage.qnv) this.a;
                j$.util.Optional optionalV = qnvVar.p.V(str);
                aooh.e(optionalV, "forCallId(...)");
                defpackage.qnd qndVar = (defpackage.qnd) aooh.q(optionalV);
                if (qndVar != null) {
                    agtj agtjVar = qnvVar.c;
                    if (qndVar.l.t()) {
                        defpackage.pvr pvrVar = qndVar.n;
                        j$.util.Optional optionalH = pvrVar.h();
                        defpackage.qmp qmpVar = new defpackage.qmp(qndVar, 11);
                        if (true == optionalH.isPresent()) {
                            ((defpackage.qnd) qmpVar.a).b((defpackage.zcy) optionalH.get());
                        }
                        ajcqVarD = pvrVar.b();
                    } else {
                        defpackage.zcy zcyVarA = qndVar.n.a();
                        int iOrdinal = zcyVarA.ordinal();
                        if (iOrdinal == 1) {
                            ajcqVarD = qndVar.m.d();
                        } else if (iOrdinal != 2) {
                            a.bt(defpackage.qnd.a.c().m(aioa.b), "unsupported imcoming video call: %s", zcyVarA, "com/android/dialer/incall/video/answer/service/VideoAnswerController", "accept", (char) 148, "VideoAnswerController.java", zct.b);
                            ajcqVarD = qndVar.m.d();
                        } else {
                            ajcqVarD = qndVar.m.e();
                        }
                        qndVar.a(zcyVarA);
                        qndVar.f.b();
                    }
                    agtjVar.j(defpackage.zoe.N(aiql.G(ajcqVarD, 5000L, java.util.concurrent.TimeUnit.MILLISECONDS, qndVar.g)), new defpackage.zoe("accept"), qnvVar.l);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.ozb ozbVar = (defpackage.ozb) ahthVar;
                aooh.f(ozbVar, "answerProgressEvent");
                float fAbs = java.lang.Math.abs(ozbVar.a) - 1.0f;
                defpackage.pnb pnbVar = ((defpackage.qnv) this.a).e;
                float fMax = java.lang.Math.max(0.0f, (fAbs / 0.75f) + 1.0f);
                android.view.View viewA = pnbVar.a();
                if (viewA != null) {
                    float f = 1.0f - fMax;
                    viewA.setAlpha((viewA.getAlpha() * 0.5f) + (f * 0.5f));
                    float f2 = (f + (fMax * 0.75f)) * 0.5f;
                    viewA.setScaleX((viewA.getScaleX() * 0.5f) + f2);
                    viewA.setScaleY((viewA.getScaleY() * 0.5f) + f2);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.oze ozeVar = (defpackage.oze) ahthVar;
                aooh.f(ozeVar, "rejectEvent");
                java.lang.String str2 = ozeVar.a;
                defpackage.qnv qnvVar2 = (defpackage.qnv) this.a;
                j$.util.Optional optionalV2 = qnvVar2.p.V(str2);
                aooh.e(optionalV2, "forCallId(...)");
                defpackage.qnd qndVar2 = (defpackage.qnd) aooh.q(optionalV2);
                if (qndVar2 != null) {
                    agtj agtjVar2 = qnvVar2.c;
                    if (qndVar2.l.t()) {
                        defpackage.pvr pvrVar2 = qndVar2.n;
                        defpackage.qbe qbeVar = qndVar2.o;
                        ajcqVarC = pvrVar2.f();
                        qbeVar.a(qbc.bE);
                    } else {
                        defpackage.wjc wjcVar = qndVar2.q;
                        defpackage.qbe qbeVar2 = qndVar2.o;
                        ajcqVarC = wjcVar.c();
                        qbeVar2.a(qbc.bA);
                    }
                    agtjVar2.j(defpackage.zoe.N(aiql.G(ajcqVarC, 5000L, java.util.concurrent.TimeUnit.MILLISECONDS, qndVar2.g)), new defpackage.zoe("reject"), qnvVar2.l);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.qsa.a.b().l("com/android/dialer/incall/video/ui/AddCallPromptDialogFragmentPeer", "onPositiveButtonClicked", 65, "AddCallPromptDialogFragmentPeer.java").v("Add call prompt accepted by the user.");
                return new defpackage.ahtm(new defpackage.qrz(((android.widget.CheckBox) ((al) ((defpackage.qsa) this.a).b).d.findViewById(2131427434)).isChecked()));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.qsd.a.b().l("com/android/dialer/incall/video/ui/ChargesAlertDialogFragmentPeer", "onPositiveButtonClicked", 67, "ChargesAlertDialogFragmentPeer.java").v("charges alert dialog was confirmed by the user.");
                defpackage.qsd qsdVar = (defpackage.qsd) this.a;
                if (((android.widget.CheckBox) ((al) qsdVar.b).d.findViewById(2131428030)).isChecked()) {
                    j$.util.Optional optionalAd = qsdVar.e.ad(qsdVar.c);
                    if (true == optionalAd.isPresent()) {
                        defpackage.qrv qrvVar = (defpackage.qrv) optionalAd.get();
                        qrvVar.s.a(qrvVar.v.bl(new lbn(9)));
                    }
                }
                return defpackage.ahtm.a;
            case 15:
                j$.util.Optional optionalK = ((defpackage.qtd) this.a).k();
                if (true == optionalK.isPresent()) {
                    defpackage.qrv qrvVar2 = (defpackage.qrv) optionalK.get();
                    defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogDismissed", 410, "VideoScreenController.java").v("onDialogDismissed");
                    qrvVar2.f.a(false);
                    qrvVar2.e.a();
                }
                return defpackage.ahtm.a;
            case 16:
                boolean z3 = ((defpackage.qrz) ahthVar).a;
                java.lang.Object obj4 = this.a;
                if (z3) {
                    j$.util.Optional optionalK2 = ((defpackage.qtd) obj4).k();
                    if (true == optionalK2.isPresent()) {
                        defpackage.qrv qrvVar3 = (defpackage.qrv) optionalK2.get();
                        qrvVar3.s.a(qrvVar3.v.bl(new lbn(10)));
                    }
                }
                defpackage.qtd qtdVar = (defpackage.qtd) obj4;
                if (qtdVar.j.isKeyguardLocked()) {
                    qtdVar.r();
                } else {
                    j$.util.Optional optionalK3 = qtdVar.k();
                    if (true == optionalK3.isPresent()) {
                        ((defpackage.qrv) optionalK3.get()).c();
                    }
                }
                return defpackage.ahtm.a;
            case 17:
                if (((defpackage.qsk) ahthVar).a) {
                    j$.util.Optional optionalK4 = ((defpackage.qtd) this.a).k();
                    if (true == optionalK4.isPresent()) {
                        defpackage.qrv qrvVar4 = (defpackage.qrv) optionalK4.get();
                        qrvVar4.e.a();
                        qrvVar4.e(qbc.bU);
                        qrvVar4.p.o();
                    }
                }
                return defpackage.ahtm.a;
            case 18:
                defpackage.qsn qsnVar = (defpackage.qsn) ahthVar;
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onShowHideButtonClicked", 785, "VideoScreenFragmentPeer.java").y("preview minimize button clicked (willMinimize: %b)", java.lang.Boolean.valueOf(qsnVar.a));
                j$.util.Optional optionalK5 = ((defpackage.qtd) this.a).k();
                defpackage.qsv qsvVar = new defpackage.qsv(qsnVar);
                if (true == optionalK5.isPresent()) {
                    defpackage.qrv qrvVar5 = (defpackage.qrv) optionalK5.get();
                    boolean z4 = qsvVar.a.a;
                    qrvVar5.e(z4 ? qbc.ca : qbc.cb);
                    qrvVar5.g.set(z4);
                    qrvVar5.s.a(ajcm.a);
                }
                return defpackage.ahtm.a;
            case 19:
                j$.util.Optional optionalK6 = ((defpackage.qtd) this.a).k();
                if (true == optionalK6.isPresent()) {
                    defpackage.qrv qrvVar6 = (defpackage.qrv) optionalK6.get();
                    defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogDismissed", 410, "VideoScreenController.java").v("onDialogDismissed");
                    qrvVar6.f.a(false);
                    qrvVar6.e.a();
                }
                return defpackage.ahtm.a;
            default:
                defpackage.rfm rfmVar = (defpackage.rfm) ahthVar;
                aooh.f(rfmVar, "event");
                defpackage.qyb.a.b().l("com/android/dialer/incall/voice/culdesac/callassist/ui/CallAssistFragmentPeer", "onAbortFeatureActivationEvent", 237, "CallAssistFragmentPeer.kt").y("abort activation for %s", rfmVar.a());
                defpackage.qyb qybVar = (defpackage.qyb) this.a;
                java.lang.String str3 = qybVar.a().e;
                aooh.e(str3, "getCallId(...)");
                defpackage.rfa rfaVarC = qybVar.c(str3);
                if (rfaVarC != null) {
                    rfaVarC.b(rfmVar.a());
                }
                return defpackage.ahtm.a;
        }
    }
}
