package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qbf implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ qbf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v28, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                ((defpackage.qbg) this.a).c = j$.util.Optional.of(java.lang.Long.valueOf(j$.time.Instant.now().toEpochMilli() - ((java.lang.Long) obj).longValue()));
                break;
            case 1:
                ((defpackage.qbg) this.a).b = j$.util.Optional.of(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) obj).longValue()));
                break;
            case 2:
                ((defpackage.qbg) this.a).d = j$.util.Optional.of(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - ((java.lang.Long) obj).longValue()));
                break;
            case 3:
                ((defpackage.qds) ((defpackage.apqr) obj).a(defpackage.qds.class)).cp().a((qbc) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.String str = (java.lang.String) obj;
                aimw aimwVarL = defpackage.qfg.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessagesCache", "updateRemoteMessage", 73, "RttCallMessagesCache.java");
                defpackage.qfa qfaVar = (defpackage.qfa) this.a;
                defpackage.qfg qfgVar = qfaVar.d;
                aais aaisVar = qfgVar.j;
                aimwVarL.y("updateRemoteMessage: %s", aais.aD(str));
                qfaVar.h.a(ahvr.E(new defpackage.pmw(qfgVar, str, 13, bArr), qfgVar.e));
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                akzxVar.u();
                defpackage.tdt tdtVar = (defpackage.tdt) akzxVar.b;
                defpackage.tdt tdtVar2 = defpackage.tdt.a;
                j$.util.Objects.requireNonNull(str2);
                tdtVar.b |= 2;
                tdtVar.d = str2;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.qfz qfzVar = (defpackage.qfz) akzxVar2.b;
                defpackage.qfz qfzVar2 = defpackage.qfz.a;
                qfzVar.b |= 524288;
                qfzVar.u = iIntValue;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.qgp qgpVar = (defpackage.qgp) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.qfz qfzVar3 = (defpackage.qfz) akzxVar3.b;
                defpackage.qfz qfzVar4 = defpackage.qfz.a;
                j$.util.Objects.requireNonNull(qgpVar);
                qfzVar3.z = qgpVar;
                qfzVar3.b |= 16777216;
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.qgo qgoVar = (defpackage.qgo) akzxVar4.b;
                defpackage.qgo qgoVar2 = defpackage.qgo.a;
                j$.util.Objects.requireNonNull(str3);
                qgoVar.b |= 8;
                qgoVar.f = str3;
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.qfj qfjVar = (defpackage.qfj) obj;
                qfjVar.o.a(qfjVar.d.b(this.a.toString()));
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.qfj qfjVar2 = (defpackage.qfj) obj;
                alat alatVar = ((defpackage.qfz) this.a).d;
                if (!qfjVar2.l && j$.util.Collection.-EL.stream(alatVar).anyMatch(new mif(11))) {
                    qfjVar2.l = true;
                    qfjVar2.p.a(qbc.dS);
                }
                qfjVar2.c();
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.qhd) this.a).c((defpackage.qfz) obj);
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.a(obj);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((android.app.Notification.Builder) this.a).setContentIntent((android.app.PendingIntent) obj);
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((android.app.Notification.Builder) this.a).setFullScreenIntent((android.app.PendingIntent) obj, true);
                break;
            case 15:
                ((android.app.Notification.Builder) this.a).setCategory((java.lang.String) obj);
                break;
            case 16:
                ((android.app.Notification.Builder) this.a).setProgress(0, 0, ((defpackage.qiv) obj).a);
                break;
            case 17:
                rs$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, (java.lang.String) obj);
                break;
            case 18:
                ft$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Action.Builder) this.a, ((java.lang.Integer) obj).intValue());
                break;
            case 19:
                defpackage.qko qkoVar = (defpackage.qko) obj;
                defpackage.qit qitVar = ((defpackage.qjd) this.a).a;
                aimz aimzVar = defpackage.qko.a;
                aimzVar.b().l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationController", "onNotificationModelShown", 177, "StatusBarNotificationController.java").y("Notification model shown: %s", qitVar.name());
                if (!qkoVar.f.getAndSet(true)) {
                    qkoVar.r.a(qbc.dI);
                    defpackage.qax qaxVar = qkoVar.m;
                    if (qaxVar.m == -1) {
                        aazc aazcVar = qaxVar.A;
                        qaxVar.m = android.os.SystemClock.elapsedRealtime();
                    }
                }
                aoin aoinVar = (aoin) qkoVar.d.get(qitVar);
                if (aoinVar != null) {
                    ((defpackage.qjc) aoinVar.a()).a();
                } else {
                    aimzVar.b().l("com/android/dialer/incall/statusbarnotification/service/StatusBarNotificationController", "onNotificationModelShown", 188, "StatusBarNotificationController.java").y("Notification model shown listener for %s is not provided", qitVar.name());
                }
                break;
            default:
                defpackage.qjd qjdVar = (defpackage.qjd) obj;
                if (qmt.j(qjdVar)) {
                    java.lang.Object obj2 = this.a;
                    j$.util.Optional optional = ((qmt) obj2).p;
                    defpackage.qgz qgzVar = new defpackage.qgz(obj2, qjdVar, 6, bArr);
                    if (true == optional.isPresent()) {
                        java.lang.Object obj3 = optional.get();
                        java.lang.Object obj4 = qgzVar.a;
                        java.lang.Object obj5 = qgzVar.b;
                        defpackage.qjd qjdVar2 = (defpackage.qjd) obj3;
                        if (qmt.j(qjdVar2)) {
                            defpackage.qjd qjdVar3 = (defpackage.qjd) obj5;
                            if (qjdVar2.b.equals(qjdVar3.b)) {
                                defpackage.qin qinVar = qjdVar3.e;
                                java.lang.String string = qinVar.a().toString();
                                defpackage.qin qinVar2 = qjdVar2.e;
                                if (!string.equals(qinVar2.a().toString())) {
                                    ((qmt) obj4).n.o(rmx.cC);
                                }
                                if (!qinVar.c.toString().contentEquals(qinVar2.c)) {
                                    ((qmt) obj4).n.o(rmx.cD);
                                }
                            }
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                break;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                break;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
