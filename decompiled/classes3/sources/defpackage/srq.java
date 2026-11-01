package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class srq implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ srq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, sug] */
    public final ajcq a(java.lang.Object obj) {
        int i = 8;
        int i2 = 18;
        int i3 = 17;
        int i4 = 14;
        int i5 = 10;
        int i6 = 19;
        int i7 = 0;
        switch (this.$cid) {
            case 0:
                srr.a.d().i(zct.b).m(aioa.b).l("com/android/dialer/phonelookup/dialergatewayserver/CallInfoLookupServicePhoneLookupContributor", "lookup", 101, "CallInfoLookupServicePhoneLookupContributor.java").v("lookup for call failed");
                ((srr) this.a).c.n(rmw.iH);
                return aiql.z(defpackage.zhj.a);
            case 1:
                return ((sqq) this.a).i(((hkd) obj).c);
            case 2:
                return ((srr) this.a).c((hkd) obj);
            case 3:
                long jLongValue = ((java.lang.Long) obj).longValue();
                ueh uehVar = ((udy) this.a).b.e;
                return aosv.F(uehVar.b, 0, new jie(uehVar, jLongValue, (aoln) null, 7), 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                jsd jsdVar = new jsd((ste) obj, 19);
                stm stmVar = (stm) this.a;
                return stmVar.d.p(stmVar.e.bl(jsdVar));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.a.tq().bl(new lbn(12));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((tbq) this.a).a((j$.util.Optional) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((tbq) this.a).a((j$.util.Optional) obj);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((tbq) this.a).a((j$.util.Optional) obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 800, "RevelioController.java").v("user took action on the call before playing end call after voicemail message");
                    return ajcm.a;
                }
                java.lang.Object obj2 = this.a;
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 804, "RevelioController.java").v("maximum time for revelio voicemail reached and the user took no action,  play end call after voicemail message");
                defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playEndCallAfterVoicemailAudioMessage", 144, "RevelioInCallAudioPlayer.java").v("playing endCallAfterVoicemailAudioMessage");
                defpackage.tbj tbjVar = ((defpackage.szs) obj2).o;
                return ahrv.g(tbjVar.a().af()).i(new defpackage.tai(tbjVar, i6), tbjVar.c);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.szs) this.a).c();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 814, "RevelioController.java").v("user took action on the call before entering into rejectCall, not rejecting");
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "updateCallerWhileWaitingForUserWithAutoRejectTimeout", 818, "RevelioController.java").v("rejecting call due to voicemail timeout and the user took no action");
                defpackage.szs szsVar = (defpackage.szs) obj3;
                szsVar.l(10);
                szsVar.D.a(qbc.fm);
                return ahvr.I(szsVar.h(defpackage.amrc.REVELIO_VOICEMAIL_TIMED_OUT), new defpackage.srq(obj3, i2), szsVar.e);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.szs szsVar2 = (defpackage.szs) this.a;
                return szsVar2.G.o() ? szsVar2.F.g(false) : szsVar2.F.b();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ((defpackage.szs) this.a).h.b(lgj.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.szs) this.a).e();
            case 15:
                if (((j$.util.Optional) obj).isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj4 = this.a;
                akzx akzxVarM = defpackage.tan.a.m();
                akzxVarM.u();
                defpackage.tan tanVar = (defpackage.tan) akzxVarM.b;
                tanVar.c = 2;
                tanVar.b |= 1;
                defpackage.szs szsVar3 = (defpackage.szs) obj4;
                java.lang.String string = szsVar3.b.getString(2132019929);
                akzxVarM.u();
                defpackage.tan tanVar2 = (defpackage.tan) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                tanVar2.b |= 2;
                tanVar2.d = string;
                akzxVarM.u();
                defpackage.tan tanVar3 = (defpackage.tan) akzxVarM.b;
                tanVar3.b |= 4;
                tanVar3.e = false;
                return szsVar3.i((defpackage.tan) akzxVarM.p());
            case 16:
                return ((defpackage.szs) this.a).F.g(true);
            case 17:
                defpackage.tbj.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/soundplayer/RevelioInCallAudioPlayer", "playTryToReachAudioMessage", 123, "RevelioInCallAudioPlayer.java").v("playing tryToReachAudioMessage");
                java.lang.Object obj5 = this.a;
                defpackage.szs szsVar4 = (defpackage.szs) obj5;
                defpackage.tbj tbjVar2 = szsVar4.o;
                ahrv ahrvVarG = ahrv.g(ahrv.g(tbjVar2.a().bM()).i(new defpackage.tai(tbjVar2, i6), tbjVar2.c));
                defpackage.szq szqVar = new defpackage.szq(szsVar4, 7);
                ajcu ajcuVar = szsVar4.e;
                agsm.i(853, ahrvVarG.i(szqVar, ajcuVar).i(new defpackage.szq(szsVar4, i5), ajcuVar).i(new defpackage.szq(szsVar4, i4), ajcuVar).i(new defpackage.szq(szsVar4, i3), ajcuVar).i(new defpackage.szq(szsVar4, i2), ajcuVar).i(new defpackage.szq(szsVar4, i6), ajcuVar).i(new defpackage.szq(szsVar4, 20), ajcuVar).i(new defpackage.srq(obj5, 9), ajcuVar).i(new defpackage.srq(obj5, i5), ajcuVar).i(new defpackage.srq(obj5, 11), ajcuVar), "Failed to update caller while waiting for user and schedule auto-reject timeout", new java.lang.Object[0]);
                return ahvr.H(ahrv.g(szsVar4.m.b()).i(new defpackage.szq(szsVar4, i7), ajcuVar), new defpackage.syf(i), ajcuVar);
            case 18:
                return ((defpackage.szs) this.a).f(true);
            case 19:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(java.lang.Boolean.FALSE);
                }
                java.lang.Object obj6 = this.a;
                defpackage.szs szsVar5 = (defpackage.szs) obj6;
                szsVar5.l(8);
                szsVar5.D.a(qbc.fy);
                ahrv ahrvVarG2 = ahrv.g(ahvr.E(new defpackage.sxq(obj6, 5), szsVar5.g));
                defpackage.srq srqVar = new defpackage.srq(obj6, i4);
                ajcu ajcuVar2 = szsVar5.e;
                return ahrvVarG2.i(srqVar, ajcuVar2).i(new defpackage.srq(obj6, 15), ajcuVar2).i(new defpackage.srq(obj6, 16), ajcuVar2).i(new defpackage.srq(obj6, i3), ajcuVar2);
            default:
                return ((defpackage.szs) this.a).c();
        }
    }
}
