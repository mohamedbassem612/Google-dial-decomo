package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbw extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(aify aifyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aifyVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                c((aoss) obj, (aoln) obj2).b(aojh.a);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 15:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 17:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 18:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 19:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v36, types: [ccp, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                ((defpackage.pbx) this.a).c.a();
                return aojh.a;
            case 1:
                aooc.af(obj);
                return ((aogc) this.a).aI();
            case 2:
                aooc.af(obj);
                defpackage.pzg pzgVar = (defpackage.pzg) this.a;
                int i = pzgVar.d;
                if (i == 0) {
                    throw new java.lang.IllegalStateException("No active audio capture disclaimers. Start needs to be called.");
                }
                int i2 = i - 1;
                pzgVar.d = i2;
                if (i2 != 0) {
                    return defpackage.pze.a;
                }
                aoiu aoiuVar = pzgVar.e;
                if (aoiuVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                defpackage.pze pzeVar = defpackage.pze.a;
                pzgVar.b();
                pzgVar.e = null;
                pzgVar.h = 1;
                return pzeVar;
            case 3:
                aooc.af(obj);
                defpackage.pzg.a.b().l("com/android/dialer/incall/disclaimer/controller/internal/AudioCaptureDisclaimerController", "onCallDisconnected$<anonymous>", 250, "AudioCaptureDisclaimerController.kt").v("callScopeDisconnectedListener called, cleaning up repeating audio scheduler");
                ((defpackage.pzg) this.a).b();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooc.af(obj);
                akzx akzxVarM = defpackage.ampx.a.m();
                aooh.f(akzxVarM, "builder");
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.ampx) akzxVarM.b).b);
                aooh.e(listUnmodifiableList, "getDisclaimerEventSequenceList(...)");
                new alct(listUnmodifiableList);
                akzxVarM.u();
                defpackage.ampx ampxVar = (defpackage.ampx) akzxVarM.b;
                alat alatVar = ampxVar.b;
                if (!alatVar.c()) {
                    ampxVar.b = alad.J(alatVar);
                }
                akyl.i((java.lang.Iterable) ((defpackage.pzm) this.a).c, ampxVar.b);
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                return (defpackage.ampx) aladVarP;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aooc.af(obj);
                qed qedVar = (qed) this.a;
                qedVar.b.unregisterListener(qedVar.i);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooc.af(obj);
                try {
                    java.lang.Object obj2 = this.a;
                    android.hardware.SensorManager sensorManager = ((qed) obj2).b;
                    return java.lang.Boolean.valueOf(sensorManager.registerListener(((qed) obj2).i, sensorManager.getDefaultSensor(8), 3));
                } catch (java.lang.IllegalStateException e) {
                    qed.a.d().k(e).l("com/android/dialer/incall/proximitysensor/impl/incall/ProximityTracker", "enable$<anonymous>", 124, "ProximityTracker.kt").v("could not register sensorEventListener. Values from the proximity sensor are not tracked.");
                    return aojh.a;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aooc.af(obj);
                try {
                    java.lang.Object obj3 = this.a;
                    ((defpackage.qhz) obj3).a.unregisterReceiver(((defpackage.qhz) obj3).h);
                    break;
                } catch (java.lang.IllegalArgumentException unused) {
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooc.af(obj);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
                defpackage.qhz qhzVar = (defpackage.qhz) this.a;
                dvx.f(qhzVar.a, qhzVar.h, intentFilter, (java.lang.String) null, 4);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aooc.af(obj);
                ((defpackage.qvc) this.a).e.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooc.af(obj);
                this.a.b((java.lang.Object) null);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aooc.af(obj);
                return ((defpackage.qym) this.a).h.R(oqt.p);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aooc.af(obj);
                return this.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aooc.af(obj);
                defpackage.rah.a.b().l("com/android/dialer/incall/voice/service/CallMergeCompletedController", "clearSnackbar$<anonymous>", 52, "CallMergeCompletedController.kt").v("clearing call merge completed snackbar");
                defpackage.rah rahVar = (defpackage.rah) this.a;
                rahVar.c = false;
                rahVar.d.a(ajcm.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aooc.af(obj);
                defpackage.rah.a.b().l("com/android/dialer/incall/voice/service/CallMergeCompletedController", "onMergeCompleted$<anonymous>", 35, "CallMergeCompletedController.kt").v("merge has successfully completed");
                defpackage.rah rahVar2 = (defpackage.rah) this.a;
                rahVar2.c = true;
                rahVar2.d.a(ajcm.a);
                return aojh.a;
            case 15:
                aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.rah) this.a).c);
            case 16:
                aooc.af(obj);
                rpa rpaVar = (rpa) this.a;
                rom romVar = rpaVar.i;
                if (!romVar.b) {
                    rpaVar.i = rom.a(romVar, false, true, 1);
                    rpaVar.o.s(ajcm.a, rpl.a);
                }
                return aojh.a;
            case 17:
                aooc.af(obj);
                ((defpackage.rss) this.a).a.s(ajcm.a, defpackage.rsz.a);
                return aojh.a;
            case 18:
                aooc.af(obj);
                rxl rxlVar = (rxl) this.a;
                android.content.Context context = rxlVar.a;
                int iM = fn$.ExternalSyntheticApiModelOutline0.m((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class), "android:record_audio", android.os.Process.myUid(), fn$.ExternalSyntheticApiModelOutline0.m(context));
                if (iM != 0 && iM != 4) {
                    return defpackage.zsz.DECISION_RUN_WITHOUT_UI;
                }
                rxlVar.b.o(rmx.kf);
                return defpackage.zsz.DECISION_CONTINUE;
            case 19:
                aooc.af(obj);
                return this.a;
            default:
                aooc.af(obj);
                try {
                    android.content.pm.ApplicationInfo applicationInfo = ((defpackage.sbo) this.a).b.getPackageManager().getPackageInfo("com.google.android.contacts", 0).applicationInfo;
                    return java.lang.Boolean.valueOf(applicationInfo != null ? applicationInfo.enabled : false);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                    return java.lang.Boolean.FALSE;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.pbw((defpackage.pbx) this.a, aolnVar, 0);
            case 1:
                return new defpackage.pbw((aogc) this.a, aolnVar, 1);
            case 2:
                return new defpackage.pbw((defpackage.pzg) this.a, aolnVar, 2);
            case 3:
                return new defpackage.pbw((defpackage.pzg) this.a, aolnVar, 3, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.pbw((defpackage.pzm) this.a, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return new defpackage.pbw((qed) this.a, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return new defpackage.pbw((qed) this.a, aolnVar, 6, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return new defpackage.pbw((defpackage.qhz) this.a, aolnVar, 7);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return new defpackage.pbw((defpackage.qhz) this.a, aolnVar, 8, (byte[]) null);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.pbw((defpackage.qvc) this.a, aolnVar, 9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return new defpackage.pbw((ccp) this.a, aolnVar, 10);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return new defpackage.pbw((defpackage.qym) this.a, aolnVar, 11);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return new defpackage.pbw((aify) this.a, aolnVar, 12);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return new defpackage.pbw((defpackage.rah) this.a, aolnVar, 13);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return new defpackage.pbw((defpackage.rah) this.a, aolnVar, 14, (byte[]) null);
            case 15:
                return new defpackage.pbw((defpackage.rah) this.a, aolnVar, 15, (char[]) null);
            case 16:
                return new defpackage.pbw((rpa) this.a, aolnVar, 16);
            case 17:
                return new defpackage.pbw((defpackage.rss) this.a, aolnVar, 17);
            case 18:
                return new defpackage.pbw((rxl) this.a, aolnVar, 18);
            case 19:
                return new defpackage.pbw((java.util.List) this.a, aolnVar, 19);
            default:
                return new defpackage.pbw((defpackage.sbo) this.a, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(aogc aogcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = aogcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(ccp ccpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ccpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.pbx pbxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = pbxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.pzg pzgVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = pzgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.pzg pzgVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = pzgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.pzm pzmVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = pzmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(qed qedVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = qedVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(qed qedVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = qedVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.qhz qhzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = qhzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.qhz qhzVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = qhzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.qvc qvcVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = qvcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.qym qymVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = qymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.rah rahVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.rah rahVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.rah rahVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rahVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(rpa rpaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rpaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.rss rssVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rssVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(rxl rxlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = rxlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbw(defpackage.sbo sboVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = sboVar;
    }
}
