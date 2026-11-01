package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rcn implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public rcn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02c7  */
    /* JADX WARN: Type inference failed for: r0v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v23, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v24, types: [aonj, java.lang.Object] */
    public final /* synthetic */ defpackage.ahtm a(ahth ahthVar) {
        ajcq ajcqVarE;
        defpackage.ahtm ahtmVar;
        int i = 16;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optionalA = ((defpackage.rcm) this.a).a();
                if (true == optionalA.isPresent()) {
                    ((defpackage.qvo) optionalA.get()).d.b(mce.bg);
                }
                if (true == optionalA.isPresent()) {
                    ((defpackage.qvo) optionalA.get()).a();
                }
                return defpackage.ahtm.a;
            case 1:
                defpackage.rfw rfwVar = (defpackage.rfw) ahthVar;
                aooh.f(rfwVar, "event");
                defpackage.qyb.a.b().l("com/android/dialer/incall/voice/culdesac/callassist/ui/CallAssistFragmentPeer", "onFixFeatureActivationErrorEvent", 229, "CallAssistFragmentPeer.kt").y("fix activation error for %s", rfwVar.a());
                defpackage.qyb qybVar = (defpackage.qyb) this.a;
                java.lang.String str = qybVar.a().e;
                aooh.e(str, "getCallId(...)");
                defpackage.rfa rfaVarC = qybVar.c(str);
                if (rfaVarC != null) {
                    rfaVarC.d(rfwVar.a());
                }
                return defpackage.ahtm.a;
            case 2:
                aooh.f((defpackage.ahtf) ahthVar, "event");
                defpackage.rcr rcrVar = (defpackage.rcr) this.a;
                if (((android.widget.CheckBox) ((defpackage.rcp) rcrVar.a).c().findViewById(2131428780)).isChecked()) {
                    j$.util.Optional optionalB = rcrVar.b();
                    defpackage.qst qstVar = new defpackage.qst(new qks(15), 15);
                    if (true == optionalB.isPresent()) {
                        qstVar.a.a(optionalB.get());
                    }
                }
                j$.util.Optional optionalA2 = rcrVar.a();
                defpackage.qkv qkvVar = new defpackage.qkv(new qks(14), 14);
                if (true == optionalA2.isPresent()) {
                    optionalA2 = j$.util.Optional.ofNullable(qkvVar.a.a(optionalA2.get()));
                }
                defpackage.qst qstVar2 = new defpackage.qst(new qks(16), i);
                if (true == optionalA2.isPresent()) {
                    qstVar2.a.a(optionalA2.get());
                }
                return defpackage.ahtm.a;
            case 3:
                aooh.f((defpackage.pyr) ahthVar, "event");
                defpackage.rdk rdkVar = (defpackage.rdk) this.a;
                rdkVar.f();
                defpackage.rap rapVarB = rdkVar.b();
                if (rapVarB != null) {
                    rapVarB.n(4);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooh.f((defpackage.raf) ahthVar, "event");
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addFlags(268435456);
                defpackage.rcx rcxVar = ((defpackage.rdk) this.a).c;
                az azVarG = rcxVar.G();
                android.net.Uri uri = android.net.Uri.parse("package:".concat(java.lang.String.valueOf(azVarG != null ? azVarG.getPackageName() : null)));
                aooh.e(uri, "parse(...)");
                intent.setData(uri);
                afsq.G(rcxVar, intent);
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.rcv rcvVar = (defpackage.rcv) ahthVar;
                aooh.f(rcvVar, "event");
                ((defpackage.rdk) this.a).j(rcvVar.a);
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.rdm rdmVar = (defpackage.rdm) ahthVar;
                aooh.f(rdmVar, "event");
                defpackage.rdk rdkVar2 = (defpackage.rdk) this.a;
                if (rdkVar2.b() == null) {
                    defpackage.rdk.a.d().l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "onVoiceScreenChipClickEvent", 938, "VoiceFragmentPeer.kt").v("VoiceController is empty.");
                    return defpackage.ahtm.a;
                }
                defpackage.rap rapVarB2 = rdkVar2.b();
                if (rapVarB2 != null) {
                    agtj agtjVar = rdkVar2.m;
                    defpackage.qur qurVar = rdmVar.a;
                    defpackage.uas uasVar = (defpackage.uas) ((aoin) rapVarB2.i.get(qurVar)).a();
                    if (uasVar == null) {
                        defpackage.rap.a.b().l("com/android/dialer/incall/voice/service/VoiceController", "onChipClicked", 229, "VoiceController.java").y("Listener for %s not injected to CallScopeComponent.", qurVar.name());
                        ajcqVarE = ajcm.a;
                    } else {
                        defpackage.uas.a.b().l("com/android/dialer/sonic/impl/service/SonicVoiceChipClickListener", "onChipClicked", 33, "SonicVoiceChipClickListener.java").v("Sonic voice chip was clicked, running callback");
                        defpackage.uss ussVar = uasVar.d;
                        ussVar.a(mce.cL);
                        ((defpackage.qbe) ussVar.a).a(qbc.hL);
                        defpackage.uaq uaqVar = uasVar.b;
                        j$.util.Objects.requireNonNull(uaqVar);
                        ajcqVarE = ahvr.E(new defpackage.sxq(uaqVar, i), uasVar.c);
                    }
                    agtjVar.i(defpackage.zoe.N(ajcqVarE), rdkVar2.D);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                rdt rdtVar = (rdt) ahthVar;
                aooh.f(rdtVar, "event");
                defpackage.rap rapVarB3 = ((defpackage.rdk) this.a).b();
                if (rapVarB3 == null) {
                    defpackage.rdk.a.d().i(zct.b).l("com/android/dialer/incall/voice/ui/VoiceFragmentPeer", "onAudioRouteSelectedEvent", 924, "VoiceFragmentPeer.kt").v("VoiceController is empty.");
                    return defpackage.ahtm.a;
                }
                defpackage.zmv zmvVar = rdtVar.a;
                defpackage.zmw zmwVar = zmvVar.a;
                j$.util.Optional optional = zmvVar.c;
                zms zmsVar = rapVarB3.e;
                defpackage.zmw zmwVarA = zmsVar.a();
                int i2 = 7;
                if (zmwVar != zmwVarA) {
                    rapVarB3.g.b(mce.aX);
                } else if (zmwVarA == defpackage.zmw.ROUTE_BLUETOOTH) {
                    j$.util.Optional optionalD = zmsVar.d();
                    xbz xbzVar = new xbz(zmsVar, 7);
                    if (true == optionalD.isPresent()) {
                        optionalD = ((zms) xbzVar.a).e((android.bluetooth.BluetoothDevice) optionalD.get());
                        optionalD.getClass();
                    }
                    if (!optionalD.equals(optional)) {
                        rapVarB3.g.b(mce.aX);
                    }
                }
                rapVarB3.c.d(zmvVar);
                rapVarB3.p.a(ajcm.a);
                rapVarB3.h(new defpackage.qsu(rapVarB3, i2));
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooh.f((defpackage.rdu) ahthVar, "event");
                defpackage.rdk rdkVar3 = (defpackage.rdk) this.a;
                if (rdkVar3.b() == null) {
                    rdkVar3.g(mcd.v);
                } else {
                    rdkVar3.h(mce.aT);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.rea reaVarB = defpackage.rea.b(((defpackage.rgc) this.a).b.c);
                if (reaVarB == null) {
                    reaVarB = defpackage.rea.UNRECOGNIZED;
                }
                ahtmVar = new defpackage.ahtm(new defpackage.rfp(reaVarB));
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.rea reaVarB2 = defpackage.rea.b(((defpackage.rgc) this.a).b.c);
                if (reaVarB2 == null) {
                    reaVarB2 = defpackage.rea.UNRECOGNIZED;
                }
                ahtmVar = new defpackage.ahtm(new defpackage.rfq(reaVarB2));
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optionalA3 = ((defpackage.rgi) this.a).a();
                defpackage.qst qstVar3 = new defpackage.qst((defpackage.rfm) ahthVar, 19);
                if (true == optionalA3.isPresent()) {
                    ((defpackage.rfa) optionalA3.get()).b(((defpackage.rfm) qstVar3.a).a());
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optionalA4 = ((defpackage.rgi) this.a).a();
                defpackage.qst qstVar4 = new defpackage.qst((defpackage.rfw) ahthVar, 20);
                if (true == optionalA4.isPresent()) {
                    ((defpackage.rfa) optionalA4.get()).d(((defpackage.rfw) qstVar4.a).a());
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.ric.a.b().l("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogFragmentPeer", "onNegativeButtonClicked", 143, "InternationalCallOnWifiDialogFragmentPeer.java").v("enter");
                java.lang.Object obj = this.a;
                defpackage.ric ricVar = (defpackage.ric) obj;
                j$.util.Optional optionalA5 = ricVar.a();
                defpackage.rhb rhbVar = new defpackage.rhb(obj, 2);
                if (true == optionalA5.isPresent()) {
                    java.lang.Object obj2 = optionalA5.get();
                    boolean zB = ((defpackage.ric) rhbVar.a).b();
                    defpackage.rhp.b.b().l("com/android/dialer/internationalcallonwifi/service/InternationalCallOnWifiDialogController", "onNegativeButtonClicked", 68, "InternationalCallOnWifiDialogController.java").v("enter");
                    agsm.i(715, ahvr.E(new gql(obj2, zB, 8), ((defpackage.rhp) obj2).c), "Failed to execute negative button press.", new java.lang.Object[0]);
                }
                ricVar.c.f();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.ric.a.b().l("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogFragmentPeer", "onPositiveButtonClicked", 151, "InternationalCallOnWifiDialogFragmentPeer.java").v("enter");
                java.lang.Object obj3 = this.a;
                defpackage.ric ricVar2 = (defpackage.ric) obj3;
                j$.util.Optional optionalA6 = ricVar2.a();
                defpackage.rhb rhbVar2 = new defpackage.rhb(obj3, 3);
                if (true == optionalA6.isPresent()) {
                    java.lang.Object obj4 = optionalA6.get();
                    boolean zB2 = ((defpackage.ric) rhbVar2.a).b();
                    defpackage.rhp.b.b().l("com/android/dialer/internationalcallonwifi/service/InternationalCallOnWifiDialogController", "onPositiveButtonClicked", 88, "InternationalCallOnWifiDialogController.java").v("enter");
                    agsm.i(716, ahvr.E(new gql(obj4, zB2, 9), ((defpackage.rhp) obj4).c), "Failed to execute positive button press.", new java.lang.Object[0]);
                }
                ricVar2.c.f();
                return defpackage.ahtm.a;
            case 15:
                aooh.f((mlb) ahthVar, "event");
                mla mlaVarA = ((defpackage.rqz) this.a).a();
                if (mlaVarA != null) {
                    mli mliVarR = mlaVarA.r();
                    mliVarR.a();
                    mliVarR.d();
                }
                return new defpackage.ahtm(new rqs());
            case 16:
                mlc mlcVar = (mlc) ahthVar;
                aooh.f(mlcVar, "event");
                ((defpackage.rqz) this.a).g(mlcVar.a());
                return defpackage.ahtm.a;
            case 17:
                aooh.f((defpackage.rqx) ahthVar, "event");
                defpackage.rqz rqzVar = (defpackage.rqz) this.a;
                rqzVar.f.o(rmx.jQ);
                mla mlaVarA2 = rqzVar.a();
                if (mlaVarA2 != null) {
                    mlaVarA2.r().a();
                    mlaVarA2.r().h(defpackage.rqz.m);
                }
                return new defpackage.ahtm(rqr.a);
            case 18:
                aooh.f((defpackage.tjr) ahthVar, "event");
                mla mlaVarA3 = ((defpackage.rqz) this.a).a();
                if (mlaVarA3 != null) {
                    mli mliVarR2 = mlaVarA3.r();
                    mliVarR2.a();
                    mliVarR2.d();
                }
                return new defpackage.ahtm(new rqs());
            case 19:
                aooh.f((mlb) ahthVar, "event");
                mla mlaVarA4 = ((defpackage.rri) this.a).a();
                if (mlaVarA4 != null) {
                    mli mliVarR3 = mlaVarA4.r();
                    mliVarR3.a();
                    mliVarR3.d();
                }
                return new defpackage.ahtm(new rqs());
            default:
                mlc mlcVar2 = (mlc) ahthVar;
                aooh.f(mlcVar2, "event");
                ((defpackage.rri) this.a).g(mlcVar2.a());
                return defpackage.ahtm.a;
        }
        return ahtmVar;
    }
}
