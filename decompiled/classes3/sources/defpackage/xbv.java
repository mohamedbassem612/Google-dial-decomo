package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xbv implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xbv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final ajcq a(java.lang.Object obj) {
        int i = 10;
        byte[] bArr = null;
        int i2 = 12;
        switch (this.$cid) {
            case 0:
                defpackage.xbx.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "start", 139, "HoldForMeCallAudioReader.java").v("previous attempt succeeded");
                return (ajcq) ((defpackage.xbx) this.a).m.orElseThrow();
            case 1:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj2 = this.a;
                if (zBooleanValue) {
                    return ((defpackage.xbx) obj2).n.a(j$.time.Duration.ofSeconds(5L));
                }
                defpackage.xbx xbxVar = (defpackage.xbx) obj2;
                xbxVar.b.b(xbxVar.i, defpackage.alex.ATLAS_AUDIO_ABSENT);
                throw new java.lang.IllegalStateException("call audio absent");
            case 2:
                defpackage.xbx.a.b().k((java.lang.Throwable) obj).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "start", 146, "HoldForMeCallAudioReader.java").v("previous attempt failed, restarting");
                defpackage.xbx xbxVar2 = (defpackage.xbx) this.a;
                xbxVar2.m = j$.util.Optional.of(xbxVar2.a());
                return (ajcq) xbxVar2.m.orElseThrow();
            case 3:
                defpackage.xca xcaVar = (defpackage.xca) this.a;
                j$.util.Optional optionalA = xcaVar.c.a();
                if (!optionalA.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object objOrElseThrow = optionalA.orElseThrow();
                defpackage.zmw zmwVar = defpackage.zmw.ROUTE_EARPIECE;
                if (objOrElseThrow != zmwVar) {
                    defpackage.xca.a.b().i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioroutecontroller/HoldForMeCallAudioRouteController", "configCallAudioRoute", 163, "HoldForMeCallAudioRouteController.java").w("current audio route is %d; no route change is needed", ((defpackage.zmw) optionalA.orElseThrow()).f);
                    xcaVar.f = j$.util.Optional.empty();
                    return ajcm.a;
                }
                if (!xcaVar.f.isPresent()) {
                    xcaVar.f = j$.util.Optional.of(zmwVar);
                }
                a.bI(defpackage.xca.a.b(), "changing audio route to speaker", "com/android/incallui/atlas/ui/impl/tidepods/service/callaudioroutecontroller/HoldForMeCallAudioRouteController", "configCallAudioRoute", (char) 174, "HoldForMeCallAudioRouteController.java", zct.a);
                return xcaVar.b(defpackage.zmw.ROUTE_SPEAKER);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.xbk xbkVar = ((defpackage.xcy) this.a).n;
                return xbkVar.t.g(new defpackage.wwy(xbkVar, i2), xbkVar.j);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.xcy xcyVar = (defpackage.xcy) this.a;
                defpackage.xbk xbkVar2 = xcyVar.n;
                defpackage.xbc xbcVar = xcyVar.f;
                return xbcVar.e.e(ahqx.b(new defpackage.wwg(xbcVar, xbkVar2, 5, bArr)), xbcVar.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.xbf xbfVar = ((defpackage.xcy) this.a).h;
                return aiql.D(ahqx.i(new defpackage.wwy(xbfVar, i)), xbfVar.c);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.xbx xbxVar3 = ((defpackage.xcy) this.a).j;
                return xbxVar3.o.e(ahqx.b(new xbw(xbxVar3, 1)), xbxVar3.e);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                a.bI(defpackage.xcy.a.b(), "started reading audio data", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "startInternal", (char) 229, "HoldForMeSession.java", zct.a);
                akzx akzxVarM = defpackage.wxp.a.m();
                akzxVarM.u();
                defpackage.wxp wxpVar = (defpackage.wxp) akzxVarM.b;
                defpackage.xcy xcyVar2 = (defpackage.xcy) this.a;
                java.lang.String str = xcyVar2.v;
                j$.util.Objects.requireNonNull(str);
                wxpVar.b |= 2;
                wxpVar.d = str;
                akzxVarM.u();
                defpackage.wxp wxpVar2 = (defpackage.wxp) akzxVarM.b;
                wxpVar2.b |= 8;
                wxpVar2.e = true;
                akzxVarM.u();
                defpackage.wxp wxpVar3 = (defpackage.wxp) akzxVarM.b;
                wxpVar3.b |= 32;
                wxpVar3.g = true;
                return xcyVar2.u.g(xcyVar2.r, (defpackage.wxp) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.xcy.a.c().i(zct.b).i(zct.a).k((java.lang.Throwable) obj).l("com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "startInternal", 253, "HoldForMeSession.java").v("failed to start session");
                java.lang.Object obj3 = this.a;
                defpackage.xcy xcyVar3 = (defpackage.xcy) obj3;
                xcyVar3.e.b(xcyVar3.r, defpackage.alex.ATLAS_FAILED_TO_START_OFF_HOLD_DETECTION);
                ahrv ahrvVarG = ahrv.g(xcyVar3.l.a());
                defpackage.xbv xbvVar = new defpackage.xbv(obj3, i);
                ajct ajctVar = xcyVar3.p;
                return ahrvVarG.i(xbvVar, ajctVar).i(new defpackage.xbv(obj3, 11), ajctVar).i(new defpackage.xbv(obj3, i2), ajctVar).i(new defpackage.xbv(obj3, 13), ajctVar).i(new defpackage.xbv(obj3, 14), ajctVar).i(new defpackage.xbv(obj3, 15), ajctVar);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.xcy) this.a).n.a();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((defpackage.xcy) this.a).j.b();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.xcy) this.a).h.a();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.xcy) this.a).f.b();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.xcy) this.a).f.a();
            case 15:
                akzx akzxVarM2 = defpackage.wya.a.m();
                akzx akzxVarM3 = defpackage.wxs.a.m();
                akzxVarM3.u();
                defpackage.wxs wxsVar = (defpackage.wxs) akzxVarM3.b;
                wxsVar.c = 0;
                wxsVar.b |= 1;
                akzxVarM2.u();
                defpackage.wya wyaVar = (defpackage.wya) akzxVarM2.b;
                defpackage.wxs wxsVar2 = (defpackage.wxs) akzxVarM3.p();
                j$.util.Objects.requireNonNull(wxsVar2);
                wyaVar.d = wxsVar2;
                wyaVar.c = 8;
                akzxVarM2.u();
                defpackage.wya wyaVar2 = (defpackage.wya) akzxVarM2.b;
                wyaVar2.b |= 1;
                defpackage.xcy xcyVar4 = (defpackage.xcy) this.a;
                wyaVar2.e = xcyVar4.r;
                return xcyVar4.o.b((defpackage.wya) akzxVarM2.p());
            case 16:
                android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) ((j$.util.Optional) obj).orElse(new android.telecom.DisconnectCause(0));
                akzx akzxVarM4 = defpackage.wyb.a.m();
                int iAd = a.ad(disconnectCause.getCode());
                akzxVarM4.u();
                defpackage.wyb wybVar = (defpackage.wyb) akzxVarM4.b;
                if (iAd == 0) {
                    throw null;
                }
                java.lang.Object obj4 = this.a;
                wybVar.d = iAd - 1;
                wybVar.b |= 2;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarM4.u();
                defpackage.wyb wybVar2 = (defpackage.wyb) akzxVarM4.b;
                wybVar2.b |= 1;
                wybVar2.c = epochMilli;
                defpackage.wyb wybVar3 = (defpackage.wyb) akzxVarM4.p();
                akzx akzxVarM5 = defpackage.wxp.a.m();
                akzxVarM5.u();
                defpackage.wxp wxpVar4 = (defpackage.wxp) akzxVarM5.b;
                j$.util.Objects.requireNonNull(wybVar3);
                wxpVar4.c = wybVar3;
                wxpVar4.b |= 1;
                defpackage.wxp wxpVar5 = (defpackage.wxp) akzxVarM5.p();
                defpackage.xcy xcyVar5 = (defpackage.xcy) obj4;
                wzd wzdVar = xcyVar5.u;
                long j = xcyVar5.r;
                agsm.i(1176, wzdVar.g(j, wxpVar5), "could not update disconnect info of atlas call details in database", new java.lang.Object[0]);
                int iAd2 = a.ad(wybVar3.d);
                if (iAd2 == 0) {
                    iAd2 = 1;
                }
                int i3 = iAd2 - 1;
                if (i3 == 1) {
                    xcyVar5.e.b(j, defpackage.alex.ATLAS_ERROR_DISCONNECT_CALL);
                } else if (i3 == 2) {
                    xcyVar5.e.b(j, defpackage.alex.USER_HANG_UP_CALL);
                } else if (i3 == 3) {
                    xcyVar5.e.b(j, defpackage.alex.ATLAS_REMOTE_HANG_UP_CALL);
                }
                akzx akzxVar = xcyVar5.D;
                akzxVar.u();
                defpackage.xac xacVar = (defpackage.xac) akzxVar.b;
                defpackage.xac xacVar2 = defpackage.xac.a;
                j$.util.Objects.requireNonNull(wybVar3);
                xacVar.f = wybVar3;
                xacVar.b |= 4;
                int iAd3 = a.ad(wybVar3.d);
                if (iAd3 == 0) {
                    iAd3 = 1;
                }
                int i4 = iAd3 + (-1) != 3 ? 2 : 3;
                akzxVar.u();
                defpackage.xac xacVar3 = (defpackage.xac) akzxVar.b;
                xacVar3.e = i4 - 1;
                xacVar3.b |= 2;
                return xcyVar5.a(!((java.lang.Boolean) xcyVar5.t.a()).booleanValue());
            case 17:
                return ((defpackage.xcy) this.a).l.a();
            case 18:
                return ((defpackage.xcy) this.a).f.a();
            case 19:
                java.lang.Object obj5 = this.a;
                defpackage.alex alexVar = defpackage.alex.ATLAS_SHUTDOWN_DETECTOR;
                defpackage.xcy xcyVar6 = (defpackage.xcy) obj5;
                long j2 = xcyVar6.r;
                xcyVar6.e.b(j2, alexVar);
                aimz aimzVar = defpackage.xcy.a;
                a.bI(aimzVar.b(), "shut down detector", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", (char) 400, "HoldForMeSession.java", zct.a);
                aimzVar.b().l("com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", 401, "HoldForMeSession.java").v("detaching call metrics logger and saving detection metrics");
                defpackage.wys wysVar = xcyVar6.d;
                agsm.i(1144, ahvr.F(new jww(wysVar, j2, 16), wysVar.c), "failed to detach from session for call %d", new java.lang.Object[]{java.lang.Long.valueOf(j2)});
                return xcyVar6.u.h(j2, (defpackage.xac) xcyVar6.D.p());
            default:
                defpackage.xcy xcyVar7 = (defpackage.xcy) this.a;
                xcyVar7.e.b(xcyVar7.r, defpackage.alex.ATLAS_UNMUTE_CALL_AUDIO);
                defpackage.xbs xbsVar = xcyVar7.i;
                return xbsVar.g.e(ahqx.b(new defpackage.viv(xbsVar, 20)), xbsVar.c);
        }
    }
}
