package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vmb implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vmb(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [aosy, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vrr vrrVar;
        j$.util.Optional optionalEmpty;
        switch (this.$cid) {
            case 0:
                aify aifyVar = (aify) obj;
                aimz aimzVar = vmc.a;
                int size = aifyVar.size();
                ?? r0 = this.a;
                if (size == r0.size()) {
                    return null;
                }
                vmc.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "markServerVoicemailsAsRead", 261, "RestVvmSyncService.java").z("Actual marked as read server voicemails are different from requested: %d/%d", aifyVar.size(), r0.size());
                return null;
            case 1:
                aimz aimzVar2 = vls.a;
                aift aiftVar = new aift(4);
                aiftVar.k((java.lang.Iterable) this.a);
                aiftVar.k((aify) obj);
                return aiftVar.h();
            case 2:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    hgb.j(vmc.a.d(), "No network state permissions", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "isConnectedToWifi", (char) 416, "RestVvmSyncService.java", zct.b, zct.a);
                    return java.lang.Boolean.FALSE;
                }
                android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) ((vmc) this.a).d.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    hgb.j(vmc.a.d(), "No network or not connected", "com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "isConnectedToWifi", (char) 427, "RestVvmSyncService.java", zct.b, zct.a);
                    return java.lang.Boolean.FALSE;
                }
                vmc.a.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "isConnectedToWifi", 430, "RestVvmSyncService.java").w("network type: %s", activeNetworkInfo.getType());
                return java.lang.Boolean.valueOf(activeNetworkInfo.getType() == 1);
            case 3:
                vmc vmcVar = (vmc) this.a;
                vmcVar.l.n(rmw.aO);
                vmcVar.o.f(vmc.c);
                return vmc.b;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                aimz aimzVar3 = vmc.a;
                int iIntValue = num.intValue();
                ?? r1 = this.a;
                if (iIntValue == r1.size()) {
                    return null;
                }
                vmc.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "markLocalVoicemailsAsRead", 236, "RestVvmSyncService.java").G("Actual marked as read local voicemails are different from requested: %d/%d", num, r1.size());
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                aimz aimzVar4 = vmc.a;
                int iIntValue2 = num2.intValue();
                aify aifyVar2 = (aify) this.a;
                if (iIntValue2 == aifyVar2.size()) {
                    return null;
                }
                vmc.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestVvmSyncService", "deleteLocalVoicemails", 284, "RestVvmSyncService.java").G("Actual deleted local voicemails are different from requested: %d/%d", num2, aifyVar2.size());
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                vmi vmiVar = (vmi) this.a;
                vmiVar.h.f(vmi.b);
                return vmiVar.i;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                vml vmlVar = (vml) obj;
                aify aifyVar3 = (aify) j$.util.Collection.-EL.stream(j$.util.DesugarCollections.unmodifiableList(vmlVar.p().b.b)).map(new thy(this.a, 15)).collect(aido.a);
                akzx akzxVarP = vmlVar.p();
                akzxVarP.u();
                akzxVarP.b.b = albq.a;
                akzxVarP.Y(aifyVar3);
                return akzxVarP.p();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return (aify) j$.util.Collection.-EL.stream((java.util.List) obj).map(new thy(this.a, 17)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int millis = (int) j$.time.Duration.ofSeconds(((defpackage.vpf) obj).a).toMillis();
                defpackage.vol volVar = (defpackage.vol) this.a;
                volVar.i = millis;
                defpackage.vol.a.b().l("com/android/dialer/voicemail/settings/GreetingRecorder", "setPhoneAccountHandle", 214, "GreetingRecorder.java").w("maxDuration: %d", volVar.i);
                int i = volVar.i;
                if (i == 0) {
                    i = 30000;
                    volVar.i = 30000;
                }
                volVar.e.setMaxDuration(i);
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return vpq.a((android.telecom.PhoneAccountHandle) this.a, (vpk) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vpk vpkVar = (vpk) obj;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.a;
                return !vpq.g(phoneAccountHandle, vpkVar) ? vpq.b(phoneAccountHandle, vpkVar) : vpkVar;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (((java.lang.Integer) obj).intValue() != 1) {
                    defpackage.vqb.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/GreetingEntryPlayer", "play", 155, "GreetingEntryPlayer.java").v("Audio focus is not granted; probably something with a higher priority has the focus.");
                    return null;
                }
                defpackage.vqb vqbVar = (defpackage.vqb) this.a;
                if (vqbVar.h.isPresent()) {
                    vqbVar.c().g(((java.lang.Integer) vqbVar.h.orElseThrow()).intValue());
                    vqbVar.h = j$.util.Optional.empty();
                }
                vqbVar.c().m();
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj2 = this.a;
                defpackage.vqp.a.b().l("com/android/dialer/voicemail/settings/multibinding/VoicemailSettingsIntegration", "getPrefData", 67, "VoicemailSettingsIntegration.java").v("adding voicemail settings");
                defpackage.rus rusVar = new defpackage.rus();
                rusVar.d(defpackage.ruz.GENERAL);
                rusVar.c(defpackage.rvc.VOICEMAIL);
                rusVar.e(new defpackage.rva(2132020947));
                rusVar.b(((defpackage.vqp) obj2).b.getDrawable(2131232005));
                return j$.util.Optional.of(rusVar.a());
            case 15:
                ((defpackage.txk) obj).a((akff) this.a);
                return null;
            case 16:
                defpackage.vru vruVar = (defpackage.vru) obj;
                j$.util.Optional optional = vruVar.f;
                if (!optional.isEmpty() && (vrrVar = ((defpackage.vrt) optional.orElseThrow()).e) != defpackage.vrr.c) {
                    java.lang.Object obj3 = this.a;
                    aooh.f(vrrVar, "voicemailTranscriptionPreferenceState");
                    defpackage.wts wtsVar = ((defpackage.vrp) ((defpackage.vrn) obj3).b).k;
                    ?? r4 = wtsVar.e;
                    if (r4 == 0) {
                        ((aogc) wtsVar.a).s(aosv.F((aoss) wtsVar.c, 0, new nut(wtsVar, (aoln) null, 6), 3), new agxj("voicemail_settings_data_service_key"));
                        optionalEmpty = j$.util.Optional.empty();
                        aooh.e(optionalEmpty, "empty(...)");
                    } else if (r4.x()) {
                        defpackage.tyz tyzVar = (defpackage.tyz) r4.b();
                        defpackage.uzx uzxVarCf = wsc.cf(defpackage.tyw.a.m());
                        int iBY = wsc.bY(tyzVar.d);
                        if (iBY == 0) {
                            iBY = 1;
                        }
                        uzxVarCf.u(wsc.bX(iBY));
                        java.lang.String str = tyzVar.c;
                        aooh.e(str, "getLanguageCode(...)");
                        uzxVarCf.y(str);
                        java.lang.String string = ((android.content.Context) wtsVar.b).getResources().getString(2132020949);
                        aooh.e(string, "getString(...)");
                        uzxVarCf.w(string);
                        uzxVarCf.x(vrrVar == defpackage.vrr.a);
                        optionalEmpty = j$.util.Optional.of(uzxVarCf.t());
                        aooh.e(optionalEmpty, "of(...)");
                    } else {
                        optionalEmpty = j$.util.Optional.empty();
                        aooh.e(optionalEmpty, "empty(...)");
                    }
                    if (optionalEmpty.isPresent()) {
                        defpackage.vrq vrqVar = new defpackage.vrq(vruVar);
                        vrqVar.g(optionalEmpty);
                        return vrqVar.a();
                    }
                }
                return vruVar;
            case 17:
                java.lang.Object obj4 = this.a;
                return wsc.av((android.content.Context) obj4, (j$.util.Optional) obj).or(new defpackage.pxs(obj4, 15));
            case 18:
                vtn vtnVar = (vtn) obj;
                if (vtnVar.c) {
                    return j$.util.Optional.empty();
                }
                int iAN = a.aN(vtnVar.d);
                if ((iAN != 0 ? iAN : 1) - 1 == 3) {
                    return j$.util.Optional.of(((android.content.Context) this.a).getResources().getString(2132020869));
                }
                throw new java.lang.IllegalStateException("Tab not shown but reason is invalid, code somewhere is incorrect.");
            case 19:
                java.lang.Object obj5 = this.a;
                return wsc.av((android.content.Context) obj5, (j$.util.Optional) obj).or(new defpackage.pxs(obj5, 14));
            default:
                j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(((vtg) obj).b).filter(new vpl(this.a, 5)).findFirst();
                if (true == optionalFindFirst.isPresent()) {
                    optionalFindFirst = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.vtf) optionalFindFirst.get()).e));
                }
                return (java.lang.Boolean) optionalFindFirst.orElse(java.lang.Boolean.FALSE);
        }
    }
}
