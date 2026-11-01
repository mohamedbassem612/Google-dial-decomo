package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qgk implements ajat {
    private final /* synthetic */ int $cid;

    public /* synthetic */ qgk(int i) {
        this.$cid = i;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 1;
        switch (this.$cid) {
            case 0:
                return ((defpackage.qgm) aooc.ar((hkl) obj, defpackage.qgm.class)).aG();
            case 1:
                aimz aimzVar = defpackage.qfj.a;
                return ((defpackage.qfi) aooc.ar((hkl) obj, defpackage.qfi.class)).ax();
            case 2:
                return ((defpackage.qvn) aooc.ar((hkl) obj, defpackage.qvn.class)).aP();
            case 3:
                return ((defpackage.tal) obj).aN();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.tal) obj).y();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.tzu) obj).y();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((hxf) obj).b();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((java.lang.Boolean) obj).booleanValue() ? ajcm.a : aiql.y(new defpackage.vcv(defpackage.vbs.INCOMPATIBLE_NETWORK_CONDITIONS));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return !((java.lang.Boolean) obj).booleanValue() ? aiql.y(new defpackage.vcv(defpackage.vbs.NO_CARRIER_NETWORK_CELLULAR_REQUIRED)) : ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return !((java.lang.Boolean) obj).booleanValue() ? aiql.y(new defpackage.vcv(defpackage.vbs.NETWORK_CONNECTION_UNEXPECTED_ERROR)) : ajcm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return !((java.lang.Boolean) obj).booleanValue() ? aiql.y(new defpackage.vcv(defpackage.vbs.NO_CARRIER_NETWORK_CELLULAR_REQUIRED)) : ajcm.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                oko okoVar = (oko) obj;
                return aosv.F(okoVar.b, 0, new okl(okoVar, (aoln) null, 4, (int[]) null), 3);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((oko) ((j$.util.Optional) obj).orElseThrow()).l();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                oko okoVar2 = (oko) ((j$.util.Optional) obj).orElseThrow(new defpackage.vjq(i));
                return aosv.F(okoVar2.b, 0, new okl(okoVar2, (aoln) null, 17, (boolean[][][]) null), 3);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num.intValue() != 1) {
                    a.bt(defpackage.wih.a.d(), "Number of rows cleared = %d", num, "com/android/dialer/xatu/impl/feedback/XatuFeedbackIntegration", "clearMetrics", (char) 307, "XatuFeedbackIntegration.java", zct.b);
                }
                return ajcm.a;
            case 15:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return aiql.z(aike.a);
                }
                aift aiftVar = new aift(4);
                defpackage.wqt wqtVar = ((defpackage.wqp) optional.orElseThrow()).e;
                if (wqtVar == null) {
                    wqtVar = defpackage.wqt.a;
                }
                defpackage.wqs wqsVar = wqtVar.c;
                if (wqsVar == null) {
                    wqsVar = defpackage.wqs.a;
                }
                for (defpackage.wrf wrfVar : wqsVar.c) {
                    if ((wrfVar.b & 2) != 0) {
                        akzx akzxVarM = defpackage.utq.a.m();
                        defpackage.wqn wqnVar = wrfVar.d;
                        if (wqnVar == null) {
                            wqnVar = defpackage.wqn.a;
                        }
                        alcf alcfVarE = aldi.e(wqnVar.d);
                        akzxVarM.u();
                        defpackage.utq utqVar = (defpackage.utq) akzxVarM.b;
                        j$.util.Objects.requireNonNull(alcfVarE);
                        utqVar.c = alcfVarE;
                        utqVar.b |= 1;
                        defpackage.wqn wqnVar2 = wrfVar.d;
                        if (wqnVar2 == null) {
                            wqnVar2 = defpackage.wqn.a;
                        }
                        java.lang.String str = wqnVar2.c;
                        akzxVarM.u();
                        defpackage.utq utqVar2 = (defpackage.utq) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str);
                        utqVar2.b |= 2;
                        utqVar2.d = str;
                        akzxVarM.u();
                        defpackage.utq utqVar3 = (defpackage.utq) akzxVarM.b;
                        utqVar3.e = 1;
                        utqVar3.b |= 4;
                        aiftVar.i((defpackage.utq) akzxVarM.p());
                    }
                }
                return aiql.z(aiftVar.h());
            case 16:
                return ((hxf) obj).b();
            case 17:
                return ((hxf) obj).a();
            case 18:
                return ((hxf) obj).c();
            case 19:
                return ((defpackage.xcx) aooc.ar((hkl) obj, defpackage.xcx.class)).bl();
            default:
                defpackage.xrk.a.c().i(zct.b).k((java.lang.IllegalStateException) obj).l("com/android/voicemail/impl/VoicemailClientReceiver", "scheduleSyncForAccount", 132, "VoicemailClientReceiver.java").v("could not schedule sync for vvm");
                return ajcm.a;
        }
    }
}
