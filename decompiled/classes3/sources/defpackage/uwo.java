package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uwo implements ajcb {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public uwo(defpackage.uwp uwpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uwpVar);
        this.a = uwpVar;
    }

    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, xva] */
    public final void a(java.lang.Throwable th) {
        switch (this.$cid) {
            case 0:
                a.bq(defpackage.uwp.a.c(), "could not log transcript audio feedback metrics", "com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger$1", "onFailure", (char) 143, "FeedbackMetricsLogger.java", th, zct.b);
                return;
            case 1:
                a.bq(defpackage.umr.ak.d(), "failed to update database", "com/android/dialer/speeddial/DisambigDialog$1", "onFailure", (char) 498, "DisambigDialog.java", th, zct.b);
                return;
            case 2:
                a.bq(defpackage.wky.a.c(), "Fail to start pipeline", "com/android/dialer/xatu/impl/service/XatuController$1", "onFailure", (char) 500, "XatuController.java", th, zct.b);
                ((defpackage.wky) this.a).h.o(rmx.gG);
                return;
            case 3:
                a.by(defpackage.xbx.a.c(), "failed to get ReadResult from AudioTee", "com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader$1", "onFailure", (char) 220, "HoldForMeCallAudioReader.java", th);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                a.by(defpackage.xcy.a.d(), "Failed to get raw number from inCallProductionComponent in HFM", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession$1", "onFailure", (char) 297, "HoldForMeSession.java", th);
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj = this.a;
                synchronized (((defpackage.ymr) obj).f) {
                    ((defpackage.ymr) obj).g = null;
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.acwu acwuVar = (defpackage.acwu) this.a;
                ahvr.G(new uej(acwuVar, acwuVar.b, acwuVar.c, acwuVar.d, acwuVar.a, 8), acwuVar.f.f);
                return;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.acwb acwbVar = ((defpackage.adcg) this.a).a.c;
                if (acwbVar == null) {
                    acwbVar = defpackage.acwb.a;
                }
                adbe.g(th, "%s: Unable to increment LoggingStateStore network usage for %s", new java.lang.Object[]{"NetworkUsageMonitor", acwbVar.c});
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                android.util.Log.e("SingleDataFileGroupPop", "Failed to add file group", th);
                return;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                adnr.a.d().k(th).l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl$1", "onFailure", 368, "CallAvatarSessionManagerImpl.java").y("Failed to prepare resources for channel %s", this.a);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                adrw.a.c().k(th).l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl$1", "onFailure", 108, "TerseModelManagerImpl.java").w("loadResources(): Failed to download most recent Terse model (version %d) - will continue to use existing version.", ((adrw) this.a).f);
                return;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.f(th instanceof java.lang.Exception ? (java.lang.Exception) th : new java.lang.Exception(th));
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.ahhu) this.a).f(new defpackage.xxa("Error getting auth token", th));
                return;
            case 15:
                defpackage.akbj akbjVar = (defpackage.akbj) this.a;
                akbjVar.b = true;
                akbjVar.c.a(anqw.d(th), new anph());
                return;
            case 16:
                a.by(aljp.a.c(), "Error while running Event Router.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ControllerImpl$1", "onFailure", 'r', "ControllerImpl.java", th);
                ((aljp) this.a).d.a(th, "Error while running Event Router.", "start", aljr.j);
                return;
            case 17:
                a.by(aljp.a.c(), "Error while starting Audio Router.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/ControllerImpl$2", "onFailure", (char) 136, "ControllerImpl.java", th);
                ((aljp) this.a).d.a(th, "Error while starting audio router.", "start", aljr.j);
                return;
            case 18:
                aimw aimwVarL = alkr.a.c().k(th).l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/IntentExtractionProcessor$1", "onFailure", 193, "IntentExtractionProcessor.java");
                almz almzVar = ((almy) this.a).h;
                if (almzVar == null) {
                    almzVar = almz.a;
                }
                alnb alnbVarB = alnb.b(almzVar.c);
                if (alnbVarB == null) {
                    alnbVarB = alnb.a;
                }
                aimwVarL.y("Consuming event %s failed.", alnbVarB.name());
                return;
            case 19:
                ((anrx) this.a).f(th);
                return;
            default:
                ((anrx) this.a).f(th);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.Object, xva] */
    /* JADX WARN: Type inference failed for: r10v55, types: [java.lang.Object, xva] */
    /* JADX WARN: Type inference failed for: r11v63, types: [java.lang.Object, xvb] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, xvb] */
    public final /* synthetic */ void b(java.lang.Object obj) {
        defpackage.xvb xvbVar;
        switch (this.$cid) {
            case 0:
                defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger$1", "onSuccess", 133, "FeedbackMetricsLogger.java").v("logged transcript audio feedback metrics");
                ((defpackage.uwp) this.a).c.y((amry) obj);
                return;
            case 1:
                aimw aimwVarL = defpackage.umr.ak.b().l("com/android/dialer/speeddial/DisambigDialog$1", "onSuccess", 487, "DisambigDialog.java");
                defpackage.upk upkVarB = defpackage.upk.b(((defpackage.upl) this.a).f);
                if (upkVarB == null) {
                    upkVarB = defpackage.upk.UNRECOGNIZED;
                }
                aimwVarL.y("successfully updated database with channel technology: %s", upkVarB);
                return;
            case 2:
                return;
            case 3:
                if (((hxb) obj) == hxb.c) {
                    a.bI(defpackage.xbx.a.b(), "Audio format is detected to be changed.", "com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader$1", "onSuccess", (char) 208, "HoldForMeCallAudioReader.java", zct.a);
                    defpackage.xbx xbxVar = (defpackage.xbx) this.a;
                    xbxVar.b.b(xbxVar.i, defpackage.alex.ATLAS_AUDIO_FORMAT_CHANGED);
                    if (xbxVar.j.get()) {
                        agsm.i(1167, xbxVar.a(), "fail to restart reading call audio", new java.lang.Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                akzx akzxVar = ((defpackage.xcy) this.a).D;
                j$.util.Objects.requireNonNull(akzxVar);
                defpackage.xch xchVar = new defpackage.xch(akzxVar, 3);
                if (true == optional.isPresent()) {
                    java.lang.String str = (java.lang.String) optional.get();
                    akzx akzxVar2 = (akzx) xchVar.a;
                    akzxVar2.u();
                    defpackage.xac xacVar = (defpackage.xac) akzxVar2.b;
                    defpackage.xac xacVar2 = defpackage.xac.a;
                    j$.util.Objects.requireNonNull(str);
                    xacVar.b |= 8;
                    xacVar.h = str;
                    return;
                }
                return;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable samplerDecisionParcelable = (com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable) obj;
                java.util.WeakHashMap weakHashMap = defpackage.aaar.b;
                synchronized (weakHashMap) {
                    j$.util.Map.-EL.putIfAbsent(weakHashMap, java.lang.Integer.valueOf(((defpackage.aaar) this.a).c.hashCode()), samplerDecisionParcelable);
                    break;
                }
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                try {
                    ((defpackage.acwu) this.a).a(acuiVar);
                    return;
                } catch (java.lang.Exception e) {
                    adbe.j(e, "%s: Listener onComplete failed for group %s", new java.lang.Object[]{"MobileDataDownload", acuiVar.c});
                    return;
                }
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.acwb acwbVar = ((defpackage.adcg) this.a).a.c;
                if (acwbVar == null) {
                    acwbVar = defpackage.acwb.a;
                }
                java.lang.String str2 = acwbVar.c;
                int i = adbe.a;
                return;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                java.lang.String str3 = ((acux) ((adcq) this.a).a.eZ()).c;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    android.util.Log.d("SingleDataFileGroupPop", "Added file group ".concat(java.lang.String.valueOf(str3)));
                    return;
                } else {
                    android.util.Log.e("SingleDataFileGroupPop", "Failed to add file group ".concat(java.lang.String.valueOf(str3)));
                    return;
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                adnr.a.b().l("com/google/android/libraries/micore/telephony/api/CallAvatarSessionManagerImpl$1", "onSuccess", 362, "CallAvatarSessionManagerImpl.java").y("Finished preparing resources for channel %s", this.a);
                return;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    adrw.a.b().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl$1", "onSuccess", 94, "TerseModelManagerImpl.java").w("loadResources(): Successfully downloaded most recent Terse model (version %d).", ((adrw) this.a).f);
                    return;
                } else {
                    adrw.a.c().l("com/google/android/libraries/micore/telephony/common/speechrecognition/terse/TerseModelManagerImpl$1", "onSuccess", 99, "TerseModelManagerImpl.java").w("loadResources(): Failed to download most recent Terse model (version %d) - will continue to use existing version.", ((adrw) this.a).f);
                    return;
                }
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.c((android.graphics.Bitmap) obj);
                return;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    ((aemm) this.a).i((android.accounts.Account) it.next());
                }
                return;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj2 = this.a;
                defpackage.ahhu ahhuVar = (defpackage.ahhu) obj2;
                defpackage.xzg xzgVar = ahhuVar.a;
                ucm ucmVar = (ucm) obj;
                java.lang.String strC = xzgVar.c();
                java.util.Map mapD = xzgVar.d();
                defpackage.xzi xziVar = new defpackage.xzi();
                xziVar.b("Authorization", java.lang.String.format(java.util.Locale.US, "Bearer %s", ucmVar.b));
                xziVar.b("X-Auth-Time", java.lang.Long.toString(((j$.time.Instant) ucmVar.c).toEpochMilli()));
                for (java.util.Map.Entry entry : mapD.entrySet()) {
                    xziVar.b((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                defpackage.xzg xzgVar2 = new defpackage.xzg(strC, xziVar.a());
                if (ahhuVar.e.get()) {
                    return;
                }
                ucm ucmVarB = ahhuVar.i.a.b(xzgVar2, ahhuVar.b, ahhuVar.c, ahhuVar.d);
                if (ucmVarB == null) {
                    ahhuVar.f(new defpackage.xxa("No fetcher available"));
                    return;
                }
                synchronized (ahhuVar.f) {
                    xvbVar = ((defpackage.ahhu) obj2).g;
                    ((defpackage.ahhu) obj2).g = ucmVarB.c;
                    break;
                }
                ?? r11 = ucmVarB.c;
                ?? r10 = this.a;
                defpackage.ahhu ahhuVar2 = (defpackage.ahhu) r10;
                r11.g(ahhuVar2.h, r10);
                if (xvbVar != null) {
                    xvbVar.d();
                    xvbVar.e();
                }
                if (ahhuVar2.e.get()) {
                    ahhuVar2.e();
                    return;
                }
                return;
            case 15:
                ajsz ajszVar = (ajsz) obj;
                try {
                    java.lang.Object obj3 = this.a;
                    ((defpackage.akbj) obj3).d = ajszVar;
                    java.util.Iterator it2 = ((defpackage.akbj) obj3).a.iterator();
                    while (it2.hasNext()) {
                        ((java.lang.Runnable) it2.next()).run();
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    a(th);
                    return;
                }
            case 16:
                return;
            case 17:
                return;
            case 18:
                return;
            case 19:
                ((anrx) this.a).h((anqw) obj);
                return;
            default:
                ((anrx) this.a).e((anqw) obj);
                return;
        }
    }

    public uwo(defpackage.upl uplVar, int i) {
        this.$cid = i;
        this.a = uplVar;
    }

    public uwo(defpackage.wky wkyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(wkyVar);
        this.a = wkyVar;
    }

    public uwo(defpackage.xbx xbxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xbxVar);
        this.a = xbxVar;
    }

    public uwo(defpackage.xcy xcyVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(xcyVar);
        this.a = xcyVar;
    }

    public uwo(defpackage.ymr ymrVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ymrVar);
        this.a = ymrVar;
    }

    public uwo(defpackage.aaar aaarVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aaarVar);
        this.a = aaarVar;
    }

    public uwo(acwx acwxVar, defpackage.acwu acwuVar, int i) {
        this.$cid = i;
        this.a = acwuVar;
        j$.util.Objects.requireNonNull(acwxVar);
    }

    public uwo(defpackage.adcg adcgVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(adcgVar);
        this.a = adcgVar;
    }

    public uwo(adcq adcqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(adcqVar);
        this.a = adcqVar;
    }

    public uwo(adnr adnrVar, adoa adoaVar, int i) {
        this.$cid = i;
        this.a = adoaVar;
        j$.util.Objects.requireNonNull(adnrVar);
    }

    public uwo(adrw adrwVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(adrwVar);
        this.a = adrwVar;
    }

    public uwo(defpackage.aelc aelcVar, defpackage.xva xvaVar, int i) {
        this.$cid = i;
        this.a = xvaVar;
        j$.util.Objects.requireNonNull(aelcVar);
    }

    public uwo(aemm aemmVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aemmVar);
        this.a = aemmVar;
    }

    public uwo(defpackage.ahhu ahhuVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(ahhuVar);
        this.a = ahhuVar;
    }

    public uwo(defpackage.akbj akbjVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(akbjVar);
        this.a = akbjVar;
    }

    public uwo(aljp aljpVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljpVar);
        this.a = aljpVar;
    }

    public uwo(aljp aljpVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aljpVar);
        this.a = aljpVar;
    }

    public uwo(alkr alkrVar, almy almyVar, int i) {
        this.$cid = i;
        this.a = almyVar;
        j$.util.Objects.requireNonNull(alkrVar);
    }

    public uwo(anrx anrxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anrxVar);
        this.a = anrxVar;
    }

    public uwo(anrx anrxVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anrxVar);
        this.a = anrxVar;
    }
}
