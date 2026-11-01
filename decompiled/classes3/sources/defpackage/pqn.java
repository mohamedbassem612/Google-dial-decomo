package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class pqn implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ pqn(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        int i = 3;
        switch (this.$cid) {
            case 0:
                defpackage.pqo.a.c().i(zct.b).k((java.util.concurrent.TimeoutException) obj).l("com/android/dialer/incall/core/call/CallDirectionImpl", "<init>", 61, "CallDirectionImpl.java").v("Timeout getting call direction");
                return defpackage.zmy.c;
            case 1:
                return j$.util.Optional.ofNullable((defpackage.pmp) obj);
            case 2:
                return java.lang.Boolean.valueOf(((defpackage.pvs) obj).c);
            case 3:
                return j$.util.Optional.of(java.lang.Integer.valueOf(((rmw) obj).lo));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                a.bI(defpackage.qbl.a.d(), "No phone read permission -> Cannot log call properties.", "com/android/dialer/incall/logging/impl/datalogger/InCallDataLogger", "logDialerData", (char) 231, "InCallDataLogger.java", zct.b);
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return (!optional.isPresent() || ((java.lang.Long) optional.orElseThrow()).longValue() <= 0) ? rmw.L : rmw.B;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.qer) obj).c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (true != optional2.isPresent()) {
                    return optional2;
                }
                defpackage.qep qepVar = (defpackage.qep) optional2.get();
                akzx akzxVarM = defpackage.qgp.a.m();
                java.lang.String strA = qepVar.a();
                akzxVarM.u();
                defpackage.qgp qgpVar = (defpackage.qgp) akzxVarM.b;
                j$.util.Objects.requireNonNull(strA);
                qgpVar.b |= 1;
                qgpVar.c = strA;
                i = true != qepVar.a ? 2 : 3;
                akzxVarM.u();
                defpackage.qgp qgpVar2 = (defpackage.qgp) akzxVarM.b;
                qgpVar2.e = i - 1;
                qgpVar2.b |= 4;
                boolean z = qepVar.c;
                akzxVarM.u();
                defpackage.qgp qgpVar3 = (defpackage.qgp) akzxVarM.b;
                qgpVar3.b |= 2;
                qgpVar3.d = z;
                return j$.util.Optional.ofNullable((defpackage.qgp) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                if (true != optional3.isPresent()) {
                    return optional3;
                }
                defpackage.qep qepVar2 = (defpackage.qep) optional3.get();
                akzx akzxVarM2 = defpackage.qgp.a.m();
                java.lang.String strA2 = qepVar2.a();
                akzxVarM2.u();
                defpackage.qgp qgpVar4 = (defpackage.qgp) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strA2);
                qgpVar4.b |= 1;
                qgpVar4.c = strA2;
                i = true != qepVar2.a ? 2 : 3;
                akzxVarM2.u();
                defpackage.qgp qgpVar5 = (defpackage.qgp) akzxVarM2.b;
                qgpVar5.e = i - 1;
                qgpVar5.b |= 4;
                boolean z2 = qepVar2.c;
                akzxVarM2.u();
                defpackage.qgp qgpVar6 = (defpackage.qgp) akzxVarM2.b;
                qgpVar6.b |= 2;
                qgpVar6.d = z2;
                return j$.util.Optional.ofNullable((defpackage.qgp) akzxVarM2.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (true != optional4.isPresent()) {
                    return null;
                }
                ((defpackage.qep) optional4.get()).c();
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.util.Optional optional5 = (j$.util.Optional) obj;
                if (true != optional5.isPresent()) {
                    return null;
                }
                ((defpackage.qep) optional5.get()).d();
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return j$.util.Collection.-EL.stream((aify) obj).filter(new mif(12)).findFirst();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return !((java.lang.Boolean) obj).booleanValue() ? j$.util.Optional.empty() : j$.util.Optional.of(new oai(2));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return !((java.lang.Boolean) obj).booleanValue() ? j$.util.Optional.empty() : j$.util.Optional.of(new defpackage.qqa(0));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return !((java.lang.Boolean) obj).booleanValue() ? j$.util.Optional.empty() : j$.util.Optional.of(new defpackage.qip(defpackage.qid.DECLINE_VIDEO_UPGRADE, defpackage.qid.ACCEPT_VIDEO_UPGRADE, defpackage.qim.VIDEO_UPGRADE_NOTIFICATION_PRIORITY));
            case 15:
                return java.lang.Boolean.valueOf(((defpackage.qrx) obj).c);
            case 16:
                return java.lang.Boolean.valueOf(((defpackage.qrx) obj).d);
            case 17:
                defpackage.qvx.a.c().i(zct.b).k((java.util.concurrent.TimeoutException) obj).l("com/android/dialer/incall/voice/buttons/SwapSimButtonController", "placeNewCall", 238, "SwapSimButtonController.java").v("timeout placing swap SIM call");
                return null;
            case 18:
                return (aihd) j$.util.Collection.-EL.stream((aihd) obj).map(new defpackage.pvu(20)).collect(aido.b);
            case 19:
                return j$.util.Collection.-EL.stream((aihd) obj).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(i)));
            default:
                defpackage.rau.a.c().k((java.lang.Throwable) obj).g(10, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/incall/voice/service/VoiceProducerModule", "produceSelectedCenterFragmentKey", 558, "VoiceProducerModule.java").v("error selecting promo");
                return j$.util.Optional.empty();
        }
    }
}
