package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class oxs implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ oxs(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v56, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v57, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r8v65, types: [aiii, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int iAN;
        int i = 8;
        int i2 = 4;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                ((defpackage.oyc) this.a).p = 0;
                return;
            case 1:
                ((defpackage.oyc) this.a).r = null;
                return;
            case 2:
                android.widget.TextView textView = (android.widget.TextView) this.a;
                textView.setText((java.lang.String) obj);
                textView.animate().alpha(1.0f).start();
                return;
            case 3:
                this.a.a(obj);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.znd zndVar = (defpackage.znd) obj;
                j$.util.Objects.requireNonNull(zndVar);
                agsm.i(507, ahvr.E(new defpackage.pmx(zndVar, 6), ((defpackage.pti) this.a).a), "Failed sending onParentChanged", new java.lang.Object[0]);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.znc zncVar = (defpackage.znc) obj;
                j$.util.Objects.requireNonNull(zncVar);
                agsm.i(506, ahvr.E(new defpackage.pmx(zncVar, 5), ((defpackage.pti) this.a).a), "Failed sending onDetailsChanged", new java.lang.Object[0]);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                agsm.i(510, ahvr.E(new defpackage.pmx((defpackage.oyx) obj, i2), ((defpackage.pti) this.a).a), "failed sending onRttStatusChanged", new java.lang.Object[0]);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.znf znfVar = (defpackage.znf) obj;
                j$.util.Objects.requireNonNull(znfVar);
                agsm.i(512, ahvr.E(new defpackage.pmx(znfVar, 7), ((defpackage.pti) this.a).a), "failed sending onVideoCallChanged", new java.lang.Object[0]);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.puw puwVar = (defpackage.puw) obj;
                j$.util.Objects.requireNonNull(puwVar);
                agsm.i(556, ahvr.E(new defpackage.pmx(puwVar, i), ((defpackage.pxg) this.a).e), "Failed sending onVideoStateChanged", new java.lang.Object[0]);
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.wak wakVar = (defpackage.wak) obj;
                amrs amrsVar = wakVar.b;
                if ((amrsVar.b & 1) != 0 && (iAN = a.aN(amrsVar.c)) != 0 && iAN == 2) {
                    z = true;
                }
                boolean z2 = wakVar.a;
                defpackage.qbl.a.b().l("com/android/dialer/incall/logging/impl/datalogger/InCallDataLogger", "addTetheredDialerWearMetrics", 273, "InCallDataLogger.java").L("isLoggingConsentGranted: %b; isRequestSuccessful: %b", z2, z);
                if (!z || z2) {
                    akzx akzxVar = (akzx) this.a;
                    akzxVar.u();
                    ampv ampvVar = akzxVar.b;
                    ampv ampvVar2 = ampv.a;
                    j$.util.Objects.requireNonNull(amrsVar);
                    ampvVar.C = amrsVar;
                    ampvVar.c |= 8192;
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    ((defpackage.rap) obj2).h(new defpackage.qsu(obj2, i));
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.afyh afyhVar = (defpackage.afyh) this.a;
                ((com.android.dialer.widget.logoview.LogoView) obj).b(((java.lang.Float) ((j$.util.Optional) afyhVar.a).orElseThrow()).floatValue(), ((java.lang.Float) ((j$.util.Optional) afyhVar.a).orElseThrow()).floatValue());
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.String str = (java.lang.String) obj;
                try {
                    da$.ExternalSyntheticApiModelOutline1.m((android.app.NotificationManager) ((android.content.Context) this.a).getSystemService(android.app.NotificationManager.class), str);
                    return;
                } catch (java.lang.SecurityException e) {
                    rwu.a.d().k(e).l("com/android/dialer/notification/channel/VoicemailChannelUtils", "migrateAllChannelsForT", 376, "VoicemailChannelUtils.java").y("deleteNotificationChannel failed for voicemail channel %s", str);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                akzx akzxVar2 = (akzx) obj;
                akzxVar2.u();
                defpackage.amrf amrfVar = (defpackage.amrf) akzxVar2.b;
                defpackage.amrf amrfVar2 = defpackage.amrf.a;
                java.lang.Object obj3 = this.a;
                j$.util.Objects.requireNonNull(obj3);
                amrfVar.e = (defpackage.amre) obj3;
                amrfVar.b |= 4;
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                this.a.a(obj);
                return;
            case 15:
                this.a.n((rmw) obj);
                return;
            case 16:
                ajcq ajcqVar = (ajcq) obj;
                java.lang.Object obj4 = this.a;
                try {
                    aigf aigfVar = (aigf) aiql.H(ajcqVar);
                    if (aigfVar != null) {
                        ((aigb) obj4).l(aigfVar);
                        return;
                    }
                    return;
                } catch (java.util.concurrent.ExecutionException e2) {
                    a.bq(uex.a.c(), "unable to compute batched in app spam verdict.", "com/android/dialer/spam/inapp/SpamDatabaseUtils", "getAllInAppSpamStatusFromVerdicts", (char) 321, "SpamDatabaseUtils.java", e2.getCause(), zct.b);
                    return;
                }
            case 17:
                java.util.List list = (java.util.List) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.toString(((java.lang.Long) it.next()).longValue()));
                }
                java.lang.Object obj5 = this.a;
                rsr rsrVar = new rsr();
                rsrVar.aC(new kaw("id").aF(arrayList));
                rsr rsrVarAB = rsrVar.aB();
                int iDelete = ((android.database.sqlite.SQLiteDatabase) obj5).delete("speed_dial_entries", (java.lang.String) rsrVarAB.b, (java.lang.String[]) rsrVarAB.a);
                if (iDelete != list.size()) {
                    throw new java.lang.UnsupportedOperationException(a.bj(iDelete, "Attempted to delete an undetermined number of rows: "));
                }
                return;
            case 18:
                this.a.g((java.lang.String) obj);
                return;
            case 19:
                java.lang.String str2 = (java.lang.String) obj;
                akzx akzxVar3 = (akzx) this.a;
                akzxVar3.u();
                defpackage.vgm vgmVar = (defpackage.vgm) akzxVar3.b;
                defpackage.vgm vgmVar2 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str2);
                vgmVar.b |= 4;
                vgmVar.e = str2;
                return;
            default:
                java.lang.String str3 = (java.lang.String) obj;
                akzx akzxVar4 = (akzx) this.a;
                akzxVar4.u();
                defpackage.vgm vgmVar3 = (defpackage.vgm) akzxVar4.b;
                defpackage.vgm vgmVar4 = defpackage.vgm.a;
                j$.util.Objects.requireNonNull(str3);
                vgmVar3.b |= 8;
                vgmVar3.f = str3;
                return;
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
