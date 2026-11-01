package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qgx implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qgx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r13v21, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v28, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        int iAN;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.concurrent.atomic.AtomicLong atomicLong;
        switch (this.$cid) {
            case 0:
                defpackage.qgp qgpVar = (defpackage.qgp) obj;
                java.lang.Object obj2 = this.a;
                return (qgpVar == null || (iAN = a.aN(qgpVar.e)) == 0 || iAN != 4) ? ((defpackage.qhj) obj2).c : ((defpackage.qhj) obj2).d;
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    a.bI(defpackage.qfj.a.c().m(aioa.b), "toggling speakerphone not allowed when bluetooth supported.", "com/android/dialer/incall/rtt/service/RttChatController", "setAudioRouteOnToggleSpeakerPhoneClicked", (char) 209, "RttChatController.java", zct.b);
                    return null;
                }
                defpackage.qfj qfjVar = (defpackage.qfj) this.a;
                defpackage.zmw zmwVarA = qfjVar.f.a();
                defpackage.zmw zmwVar = defpackage.zmw.ROUTE_SPEAKER;
                if (zmwVarA == zmwVar) {
                    qfjVar.g.e(defpackage.zmw.ROUTE_WIRED_OR_EARPIECE);
                    defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "setAudioRouteOnToggleSpeakerPhoneClicked", 215, "RttChatController.java").v("Turned on wired or earpiece audio route.");
                    return null;
                }
                qfjVar.g.e(zmwVar);
                defpackage.qfj.a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "setAudioRouteOnToggleSpeakerPhoneClicked", 218, "RttChatController.java").v("Turned on speakerphone audio route.");
                return null;
            case 2:
                this.a.a(obj);
                return null;
            case 3:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.qou) this.a).a.a(qbc.bG);
                    return null;
                }
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.qpq qpqVar = (defpackage.qpq) this.a;
                    if (qpqVar.i.get()) {
                        qpqVar.k.a(qbc.bm);
                        return null;
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return this.a.a(obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                boolean zIsPresent = optional.isPresent();
                java.lang.Object obj3 = this.a;
                if (zIsPresent && ((java.lang.Boolean) optional.orElseThrow()).booleanValue()) {
                    ((defpackage.qvo) obj3).e.set(true);
                    return null;
                }
                ((defpackage.qvo) obj3).a();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                akzx akzxVarM = defpackage.quf.a.m();
                defpackage.qug qugVar = defpackage.qug.BUTTON_MERGE;
                akzxVarM.u();
                defpackage.quf qufVar = (defpackage.quf) akzxVarM.b;
                qufVar.e = qugVar.H;
                qufVar.b |= 1;
                android.content.Context context = (android.content.Context) this.a;
                java.lang.String string = context.getString(2132019069);
                akzxVarM.u();
                defpackage.quf qufVar2 = (defpackage.quf) akzxVarM.b;
                j$.util.Objects.requireNonNull(string);
                qufVar2.b |= 4;
                qufVar2.g = string;
                akzxVarM.u();
                defpackage.quf qufVar3 = (defpackage.quf) akzxVarM.b;
                qufVar3.c = 2;
                qufVar3.d = 2131231342;
                java.lang.String string2 = context.getString(2132019051);
                akzxVarM.u();
                defpackage.quf qufVar4 = (defpackage.quf) akzxVarM.b;
                j$.util.Objects.requireNonNull(string2);
                qufVar4.b |= 8;
                qufVar4.h = string2;
                defpackage.que queVar = defpackage.que.MORE;
                akzxVarM.u();
                defpackage.quf qufVar5 = (defpackage.quf) akzxVarM.b;
                qufVar5.l = queVar.g;
                qufVar5.b |= 512;
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                akzxVarM.u();
                defpackage.quf qufVar6 = (defpackage.quf) akzxVarM.b;
                qufVar6.b |= 16;
                qufVar6.i = zBooleanValue;
                return j$.util.Optional.of((defpackage.quf) akzxVarM.p());
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                akzx akzxVarM2 = defpackage.quf.a.m();
                defpackage.qug qugVar2 = defpackage.qug.BUTTON_UPGRADE_TO_RTT;
                akzxVarM2.u();
                defpackage.quf qufVar7 = (defpackage.quf) akzxVarM2.b;
                qufVar7.e = qugVar2.H;
                qufVar7.b |= 1;
                android.content.Context context2 = (android.content.Context) this.a;
                java.lang.String string3 = context2.getString(2132019075);
                akzxVarM2.u();
                defpackage.quf qufVar8 = (defpackage.quf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string3);
                qufVar8.b |= 4;
                qufVar8.g = string3;
                akzxVarM2.u();
                defpackage.quf qufVar9 = (defpackage.quf) akzxVarM2.b;
                qufVar9.c = 2;
                qufVar9.d = 2131231580;
                java.lang.String string4 = context2.getString(2132019075);
                akzxVarM2.u();
                defpackage.quf qufVar10 = (defpackage.quf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(string4);
                qufVar10.b |= 8;
                qufVar10.h = string4;
                defpackage.que queVar2 = defpackage.que.MORE;
                akzxVarM2.u();
                defpackage.quf qufVar11 = (defpackage.quf) akzxVarM2.b;
                qufVar11.l = queVar2.g;
                qufVar11.b |= 512;
                boolean zBooleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                akzxVarM2.u();
                defpackage.quf qufVar12 = (defpackage.quf) akzxVarM2.b;
                qufVar12.b |= 16;
                qufVar12.i = zBooleanValue2;
                return j$.util.Optional.of((defpackage.quf) akzxVarM2.p());
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVarM3 = defpackage.quf.a.m();
                defpackage.qug qugVar3 = defpackage.qug.BUTTON_UPGRADE_TO_TRANSMISSION_ONLY_VIDEO;
                akzxVarM3.u();
                defpackage.quf qufVar13 = (defpackage.quf) akzxVarM3.b;
                qufVar13.e = qugVar3.H;
                qufVar13.b |= 1;
                android.content.Context context3 = (android.content.Context) this.a;
                java.lang.String string5 = context3.getString(2132019079);
                akzxVarM3.u();
                defpackage.quf qufVar14 = (defpackage.quf) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string5);
                qufVar14.b |= 4;
                qufVar14.g = string5;
                akzxVarM3.u();
                defpackage.quf qufVar15 = (defpackage.quf) akzxVarM3.b;
                qufVar15.c = 2;
                qufVar15.d = 2131231079;
                java.lang.String string6 = context3.getString(2132019079);
                akzxVarM3.u();
                defpackage.quf qufVar16 = (defpackage.quf) akzxVarM3.b;
                j$.util.Objects.requireNonNull(string6);
                qufVar16.b |= 8;
                qufVar16.h = string6;
                defpackage.que queVar3 = defpackage.que.MORE;
                akzxVarM3.u();
                defpackage.quf qufVar17 = (defpackage.quf) akzxVarM3.b;
                qufVar17.l = queVar3.g;
                qufVar17.b |= 512;
                boolean zBooleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                akzxVarM3.u();
                defpackage.quf qufVar18 = (defpackage.quf) akzxVarM3.b;
                qufVar18.b |= 16;
                qufVar18.i = zBooleanValue3;
                return j$.util.Optional.of((defpackage.quf) akzxVarM3.p());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.zmy zmyVar = (defpackage.zmy) obj;
                java.lang.Object obj4 = this.a;
                if (zmyVar != defpackage.zmy.b) {
                    ((defpackage.rap) obj4).g.b(mce.eq);
                }
                defpackage.rap rapVar = (defpackage.rap) obj4;
                if (!((java.lang.Boolean) rapVar.w.e().orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    rapVar.g.b(mce.ae);
                    return null;
                }
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.qst qstVar = new defpackage.qst(this.a, 12);
                if (true == optional2.isPresent()) {
                    defpackage.qud qudVar = (defpackage.qud) optional2.get();
                    ailj ailjVarK = ((defpackage.rap) qstVar.a).u.e().k();
                    while (ailjVarK.hasNext()) {
                        defpackage.uar uarVar = (defpackage.uar) ailjVarK.next();
                        int iBX = pez.bX(qudVar.g);
                        if (iBX == 0) {
                            iBX = 1;
                        }
                        uarVar.b(iBX, qudVar.h);
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                defpackage.qst qstVar2 = new defpackage.qst(this.a, 13);
                if (true == optional3.isPresent()) {
                    defpackage.qud qudVar2 = (defpackage.qud) optional3.get();
                    ailj ailjVarK2 = ((defpackage.rap) qstVar2.a).u.e().k();
                    while (ailjVarK2.hasNext()) {
                        defpackage.uar uarVar2 = (defpackage.uar) ailjVarK2.next();
                        int iBX2 = pez.bX(qudVar2.g);
                        if (iBX2 == 0) {
                            iBX2 = 1;
                        }
                        uarVar2.a(iBX2);
                    }
                }
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.rap) this.a).e(((defpackage.rcd) obj) == defpackage.rcd.DIALPAD ? qbc.gi : qbc.gj);
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.quc qucVar = (defpackage.quc) akzxVar.b;
                defpackage.quc qucVar2 = defpackage.quc.a;
                j$.util.Objects.requireNonNull(str);
                qucVar.c = 5;
                qucVar.d = str;
                return null;
            case 15:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.quc qucVar3 = (defpackage.quc) akzxVar2.b;
                defpackage.quc qucVar4 = defpackage.quc.a;
                j$.util.Objects.requireNonNull(str2);
                qucVar3.e = 6;
                qucVar3.f = str2;
                return null;
            case 16:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                defpackage.rie.a.b().l("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogLauncher", "onConnectionEvent", 68, "InternationalCallOnWifiDialogLauncher.java").y("shouldAlwaysShowWarning: %s", optional4);
                boolean zIsPresent2 = optional4.isPresent();
                java.lang.Object obj5 = this.a;
                if (!zIsPresent2) {
                    ((defpackage.rie) obj5).b(false);
                    return null;
                }
                if (((java.lang.Boolean) optional4.orElseThrow()).booleanValue()) {
                    ((defpackage.rie) obj5).b(true);
                    return null;
                }
                defpackage.rie rieVar = (defpackage.rie) obj5;
                rieVar.c.a(qbc.eh);
                rieVar.b.b(ruc.av);
                return null;
            case 17:
                rno rnoVar = (rno) obj;
                int i = rnoVar.b & 1;
                java.lang.Object obj6 = this.a;
                if (i != 0) {
                    ((adnp) obj6).e = j$.util.Optional.of(rnoVar.c);
                } else {
                    adnp adnpVar = (adnp) obj6;
                    adnpVar.e = j$.util.Optional.of(java.util.UUID.randomUUID().toString());
                    agsm.i(739, ((aogc) adnpVar.d).bl(new jsd((java.lang.String) ((j$.util.Optional) adnpVar.e).orElseThrow(), 18)), "fail to save seed for remote number logging", new java.lang.Object[0]);
                }
                return ((adnp) obj6).e;
            case 18:
                defpackage.ruo ruoVar = (defpackage.ruo) obj;
                java.lang.String str3 = ruoVar.a;
                if (str3 == null) {
                    return ruoVar.b;
                }
                defpackage.rur rurVar = (defpackage.rur) this.a;
                oko okoVar = rurVar.f;
                if (android.text.TextUtils.equals(okoVar.f.getPackageName(), okoVar.h.getDefaultDialerPackage())) {
                    rs$.ExternalSyntheticApiModelOutline0.m(okoVar.j, str3);
                    zjv zjvVar = okoVar.g;
                    mgv mgvVar = mgv.bg;
                    java.util.List listAY = ajsz.aY(gus.aw(str3));
                    android.telecom.PhoneAccountHandle phoneAccountHandle = okoVar.i;
                    zjv.i(zjvVar, mgvVar, listAY, gus.aw(aais.aH(phoneAccountHandle != null ? phoneAccountHandle.getId() : null)), 0, 24);
                } else {
                    oko.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/externals/androidapis/telephony/DialerTelephony", "handleSecretCodeLegacy", 365, "DialerTelephony.kt").v("not default dialer, cannot send special code");
                }
                aimz aimzVar = defpackage.rur.a;
                aimzVar.b().l("com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "processMmiCode", 228, "MmiCodesProcessorImpl.java").v("send secret code");
                rurVar.e.o(rmx.ij);
                aimzVar.b().l("com/android/dialer/mmi/impl/MmiCodesProcessorImpl", "processMmiCode", 230, "MmiCodesProcessorImpl.java").v("finish processing mmi code");
                return ruoVar.b;
            case 19:
                return ((rwi) this.a).d.getActiveNotifications();
            default:
                aifi aifiVar = new aifi();
                java.util.HashSet<android.service.notification.StatusBarNotification> hashSet = new java.util.HashSet();
                for (android.service.notification.StatusBarNotification statusBarNotification : (android.service.notification.StatusBarNotification[]) obj) {
                    if (!android.text.TextUtils.isEmpty(statusBarNotification.getGroupKey())) {
                        if ((statusBarNotification.getNotification().flags & 512) != 0) {
                            hashSet.add(statusBarNotification);
                        } else {
                            aifiVar.a(statusBarNotification.getGroupKey(), 1);
                        }
                    }
                }
                ajau ajauVar = new ajau(new j$.util.concurrent.ConcurrentHashMap());
                for (android.service.notification.StatusBarNotification statusBarNotification2 : hashSet) {
                    long jB = aifiVar.b(statusBarNotification2.getGroupKey());
                    do {
                        concurrentHashMap = ajauVar.a;
                        atomicLong = (java.util.concurrent.atomic.AtomicLong) concurrentHashMap.get(statusBarNotification2);
                        if (atomicLong == null && (atomicLong = (java.util.concurrent.atomic.AtomicLong) concurrentHashMap.putIfAbsent(statusBarNotification2, new java.util.concurrent.atomic.AtomicLong(jB))) == null) {
                        }
                        while (true) {
                            long j = atomicLong.get();
                            if (j != 0) {
                                if (atomicLong.compareAndSet(j, jB)) {
                                }
                                break;
                            }
                        }
                        break;
                    } while (!concurrentHashMap.replace(statusBarNotification2, atomicLong, new java.util.concurrent.atomic.AtomicLong(jB)));
                }
                java.util.Map mapUnmodifiableMap = ajauVar.b;
                if (mapUnmodifiableMap == null) {
                    mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(ahvr.aI(ajauVar.a, new acen(ajauVar, 14)));
                    ajauVar.b = mapUnmodifiableMap;
                }
                for (java.util.Map.Entry entry : mapUnmodifiableMap.entrySet()) {
                    android.service.notification.StatusBarNotification statusBarNotification3 = (android.service.notification.StatusBarNotification) entry.getKey();
                    if (((java.lang.Long) entry.getValue()).longValue() == 0) {
                        java.lang.Object obj7 = this.a;
                        rwi.a.b().l("com/android/dialer/notification/DialerNotificationManager", "cancelEmptyGroups", 239, "DialerNotificationManager.java").y("last notification in group (%s) removed, also removing group summary", statusBarNotification3.getGroupKey());
                        if (statusBarNotification3.getTag() != null) {
                            ((rwi) obj7).j(statusBarNotification3.getTag(), statusBarNotification3.getId());
                        } else {
                            ((rwi) obj7).i(statusBarNotification3.getId());
                        }
                    }
                }
                return null;
        }
    }
}
