package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qht implements android.view.View.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qht(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v51, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v107, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v112, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = 0;
        switch (this.$cid) {
            case 0:
                defpackage.qhv qhvVar = (defpackage.qhv) this.a;
                j$.util.Optional optionalF = qhvVar.a.y().f();
                if (true == optionalF.isPresent()) {
                    defpackage.qfj qfjVar = (defpackage.qfj) optionalF.get();
                    defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onBackToVoiceClicked", 241, "RttChatController.java").v("onBackToVoiceClicked");
                    qfjVar.p.a(qbc.dR);
                    defpackage.pqm pqmVar = qfjVar.m;
                    defpackage.pqm.a.b().l("com/android/dialer/incall/core/call/CallControllerImpl", "stopRtt", 597, "CallControllerImpl.java").v("stopRtt");
                    pqmVar.f.a(mfy.ep);
                    rs$.ExternalSyntheticApiModelOutline0.m(pqmVar.b);
                }
                qhvVar.dismiss();
                break;
            case 1:
                defpackage.qhj qhjVar = (defpackage.qhj) this.a;
                j$.util.Optional optionalF2 = qhjVar.f();
                if (true == optionalF2.isPresent()) {
                    defpackage.qfj qfjVar2 = (defpackage.qfj) optionalF2.get();
                    qfjVar2.h.n(rmw.ix);
                    qfjVar2.o.a(qfjVar2.d.a());
                }
                qhjVar.i();
                break;
            case 2:
                defpackage.qhu qhuVar = new defpackage.qhu();
                defpackage.qhv qhvVar2 = (defpackage.qhv) this.a;
                ahvr.j(qhuVar, qhvVar2.b);
                qhvVar2.dismiss();
                break;
            case 3:
                j$.util.Optional optionalF3 = ((defpackage.qgw) this.a).y().f();
                if (true == optionalF3.isPresent()) {
                    defpackage.qfj qfjVar3 = (defpackage.qfj) optionalF3.get();
                    defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onAddCallClicked", 151, "RttChatController.java").v("onAddCallClicked");
                    qfjVar3.e.a();
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qnd qndVarD = ((defpackage.qnv) this.a).d();
                if (qndVarD != null) {
                    if (!qndVarD.l.t()) {
                        qndVarD.a(defpackage.zcy.a);
                        agsm.i(627, qndVarD.m.b(), "failed to answer as voice", new java.lang.Object[0]);
                    } else {
                        qndVarD.b(defpackage.zcy.a);
                        agsm.i(628, qndVarD.n.f(), "failed to reject upgrade request", new java.lang.Object[0]);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.qnd qndVarD2 = ((defpackage.qnv) this.a).d();
                if (qndVarD2 != null) {
                    if (!qndVarD2.l.t()) {
                        qndVarD2.a(defpackage.zcy.c);
                        agsm.i(629, qndVarD2.m.e(), "failed to answer video with local camera off", new java.lang.Object[0]);
                    } else {
                        defpackage.zcy zcyVar = defpackage.zcy.c;
                        qndVarD2.b(zcyVar);
                        agsm.i(630, qndVarD2.n.c(zcyVar), "failed to accept upgrade request as RX only", new java.lang.Object[0]);
                    }
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.android.dialer.incall.video.ui.VideoCheckableLabeledButton videoCheckableLabeledButton = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) this.a;
                android.widget.ImageView imageView = videoCheckableLabeledButton.a;
                if (imageView.getDrawable() instanceof android.graphics.drawable.Animatable) {
                    ((android.graphics.drawable.Animatable) imageView.getDrawable()).start();
                }
                j$.util.Optional optional = videoCheckableLabeledButton.g;
                defpackage.qmp qmpVar = new defpackage.qmp(view, 13);
                if (true == optional.isPresent()) {
                    ((android.view.View.OnClickListener) optional.get()).onClick((android.view.View) qmpVar.a);
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aihd aihdVar = defpackage.qtd.a;
                ahvr.j(new defpackage.qtc((defpackage.qmy) this.a), view);
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onButtonGridScrollViewClicked", 824, "VideoScreenFragmentPeer.java").v("scroll view is clicked");
                ((defpackage.qtd) this.a).v();
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onEndCallButtonClicked", 797, "VideoScreenFragmentPeer.java").v("end call button is clicked");
                j$.util.Optional optionalK = ((defpackage.qtd) this.a).k();
                if (true == optionalK.isPresent()) {
                    defpackage.qrv qrvVar = (defpackage.qrv) optionalK.get();
                    qrvVar.e.a();
                    agsm.i(653, qrvVar.p.f(), "Failed to disconnect", new java.lang.Object[0]);
                }
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onEnterFullscreenButtonClicked", 808, "VideoScreenFragmentPeer.java").v("enter full screen button is clicked");
                j$.util.Optional optionalK2 = ((defpackage.qtd) this.a).k();
                if (true == optionalK2.isPresent()) {
                    ((defpackage.qrv) optionalK2.get()).j(true);
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "onVideoRemoteViewClicked", 816, "VideoScreenFragmentPeer.java").v("remote video view is clicked");
                ((defpackage.qtd) this.a).v();
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.qcr qcrVar = (defpackage.qcr) this.a.a();
                ((java.util.concurrent.atomic.AtomicBoolean) qcrVar.b).set(true);
                ((zpz) qcrVar.a).a(ajcm.a);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                view.setAlpha(0.3f);
                view.setEnabled(false);
                view.setClickable(false);
                java.lang.Object obj = this.a;
                vwb vwbVar = (vwb) obj;
                j$.util.Optional optionalE = ((zpm) ((defpackage.rhx) vwbVar.a).a).e(((defpackage.rhc) ((j$.util.Optional) vwbVar.c).orElseThrow()).a);
                if (true == optionalE.isPresent()) {
                    optionalE = j$.util.Optional.ofNullable(((defpackage.rgv) ((defpackage.apqr) optionalE.get()).a(defpackage.rgv.class)).cP());
                }
                defpackage.rhb rhbVar = new defpackage.rhb(obj, i);
                if (true == optionalE.isPresent()) {
                    defpackage.qcr qcrVar2 = (defpackage.qcr) optionalE.get();
                    defpackage.rea reaVar = ((defpackage.rhc) ((j$.util.Optional) ((vwb) rhbVar.a).c).orElseThrow()).b;
                    java.lang.Object obj2 = qcrVar2.b;
                    aoin aoinVar = (aoin) ((zzx) qcrVar2.a).k().get(reaVar);
                    ahvr.cl(aoinVar, "no controller for %s", reaVar.name());
                    ((zpz) obj2).a(((defpackage.rdz) aoinVar.a()).c());
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooh.f(view, "p0");
                defpackage.rkc rkcVar = (defpackage.rkc) this.a;
                rkcVar.c.i(defpackage.zoe.N(aosv.F(rkcVar.f, 0, new oxe(rkcVar, (aoln) null, 18, (byte[]) null), 3)), rkcVar.i);
                break;
            case 15:
                aooh.f(view, "p0");
                defpackage.rkc rkcVar2 = (defpackage.rkc) this.a;
                rkcVar2.c.i(defpackage.zoe.N(aosv.F(rkcVar2.f, 0, new oxe(rkcVar2, (aoln) null, 17), 3)), rkcVar2.j);
                break;
            case 16:
                android.content.Context contextA = ((aw) this.a).A();
                android.content.Intent intentPutExtra = new android.content.Intent("android.settings.ADD_ACCOUNT_SETTINGS").putExtra("account_types", new java.lang.String[]{"com.google"});
                aooh.e(intentPutExtra, "putExtra(...)");
                ahqx.l(contextA, intentPutExtra);
                break;
            case 17:
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer = (com.android.dialer.playback.CallRecordingPlayer) this.a;
                boolean zEquals = callRecordingPlayer.b.equals(defpackage.sta.d);
                callRecordingPlayer.h.isPresent();
                j$.util.Optional optionalA = com.android.dialer.playback.CallRecordingPlayer.a(callRecordingPlayer.getContext());
                if (!zEquals) {
                    callRecordingPlayer.j();
                } else {
                    if (true == optionalA.isPresent()) {
                        ((android.app.Activity) optionalA.get()).setVolumeControlStream(Integer.MIN_VALUE);
                    }
                    callRecordingPlayer.c(false);
                }
                break;
            case 18:
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer2 = (com.android.dialer.playback.CallRecordingPlayer) this.a;
                if (!callRecordingPlayer2.m) {
                    callRecordingPlayer2.k();
                } else {
                    callRecordingPlayer2.h(false);
                    defpackage.ssu ssuVar = callRecordingPlayer2.d;
                    ssuVar.e(5);
                    if (callRecordingPlayer2.b == defpackage.sta.d) {
                        ssuVar.h();
                    }
                }
                break;
            case 19:
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer3 = (com.android.dialer.playback.CallRecordingPlayer) this.a;
                j$.util.Optional optional2 = callRecordingPlayer3.k;
                optional2.isPresent();
                if (!callRecordingPlayer3.v.isPresent()) {
                    a.bI(com.android.dialer.playback.CallRecordingPlayer.a.d(), "attempting to share recording with missing audio uri or filepath", "com/android/dialer/playback/CallRecordingPlayer", "onShareButtonPressed", (char) 444, "CallRecordingPlayer.java", zct.b);
                } else {
                    callRecordingPlayer3.c(false);
                    optional2.isPresent();
                    int i2 = ((defpackage.amwp) callRecordingPlayer3.v.orElseThrow()).a;
                    ?? r11 = ((defpackage.amwp) callRecordingPlayer3.v.orElseThrow()).b;
                    android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                    intent.setType("audio/*");
                    intent.putExtra("android.intent.extra.STREAM", (android.os.Parcelable) r11);
                    intent.setFlags(1);
                    ahqx.l(callRecordingPlayer3.getContext(), android.content.Intent.createChooser(intent, null));
                }
                break;
            default:
                com.android.dialer.playback.CallRecordingPlayer callRecordingPlayer4 = (com.android.dialer.playback.CallRecordingPlayer) this.a;
                j$.util.Optional optional3 = callRecordingPlayer4.j;
                if (true == optional3.isPresent()) {
                    optional3.get().run();
                }
                callRecordingPlayer4.setVisibility(8);
                if (callRecordingPlayer4.l) {
                    callRecordingPlayer4.b();
                }
                break;
        }
    }

    public qht(defpackage.qtd qtdVar, int i) {
        this.$cid = i;
        this.a = qtdVar;
    }
}
