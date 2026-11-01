package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xcv implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xcv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Object, vcc] */
    /* JADX WARN: Type inference failed for: r12v68, types: [aoss, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        java.lang.Object obj2;
        int i = 20;
        int i2 = 0;
        byte[] bArr = null;
        int i3 = 5;
        switch (this.$cid) {
            case 0:
                a.bI(defpackage.xcy.a.b(), "stopped reading audio data", "com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", (char) 375, "HoldForMeSession.java", zct.a);
                return ((defpackage.xcy) this.a).h.a();
            case 1:
                return ((defpackage.xcy) this.a).j.b();
            case 2:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj3 = this.a;
                return ahvr.F(new defpackage.wzc(obj3, (defpackage.wzw) optional.orElseThrow(), i3, bArr), ((defpackage.xcy) obj3).p);
            case 3:
                return ((defpackage.xcy) this.a).f.b();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Object obj4 = this.a;
                xbw xbwVar = new xbw(obj4, 5);
                defpackage.xcy xcyVar = (defpackage.xcy) obj4;
                return xcyVar.F.h(xbwVar, xcyVar.p);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.xcy) this.a).i.a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.xca xcaVar = ((defpackage.xcy) this.a).k;
                return xcaVar.i.e(ahqx.b(new xbw(xcaVar, 2)), xcaVar.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.xcc xccVar = ((defpackage.xcy) this.a).l;
                return xccVar.k.g(new defpackage.wwy(xccVar, 14), xccVar.h);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                xeq.a.b().l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "deleteOldRecordings", 115, "CallScreenRecordingsDeletionWorker.java").y("shouldDeleteOldRecordings: %b", bool);
                if (!bool.booleanValue()) {
                    return aiql.z(new gsf());
                }
                java.lang.Object obj5 = this.a;
                xeq xeqVar = (xeq) obj5;
                xeqVar.f.o(rmx.eG);
                ahrv ahrvVarG = ahrv.g(xeqVar.e.d());
                defpackage.xcv xcvVar = new defpackage.xcv(obj5, 9);
                ajct ajctVar = xeqVar.d;
                return ahrvVarG.i(xcvVar, ajctVar).h(new defpackage.wzj(i), ajctVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                long epochMilli = j$.time.Instant.now().toEpochMilli() - xeq.b;
                aimz aimzVar = xeq.a;
                aimzVar.b().l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "deleteOldRecordingsAndTranscripts", 132, "CallScreenRecordingsDeletionWorker.java").x("Clearing recordings older than %s", epochMilli);
                aift aiftVar = new aift(4);
                for (lkq lkqVar : (java.util.List) obj) {
                    if (lkqVar.f < epochMilli) {
                        aimzVar.b().l("com/android/incallui/callscreen/impl/recording/retention/CallScreenRecordingsDeletionWorker", "deleteOldRecordingsAndTranscripts", 137, "CallScreenRecordingsDeletionWorker.java").y("Clearing recording for %s", lkqVar.a);
                        aiftVar.i(lkqVar.a);
                    }
                }
                return ((xeq) this.a).h.a(aiftVar.h());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                aimz aimzVar2 = com.android.voicemail.impl.DialerVisualVoicemailService.a;
                if (optional2.isPresent()) {
                    return ((defpackage.abtr) optional2.orElseThrow()).e.e((android.telecom.PhoneAccountHandle) this.a);
                }
                com.android.voicemail.impl.DialerVisualVoicemailService.a.b().l("com/android/voicemail/impl/DialerVisualVoicemailService", "removeAccount", 377, "DialerVisualVoicemailService.java").v("VvmService not available");
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aify aifyVar = (aify) obj;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int size = aifyVar.size();
                while (true) {
                    java.lang.Object obj6 = this.a;
                    if (i2 >= size) {
                        return arrayList.isEmpty() ? ajcm.a : ahvr.aj(arrayList).o(new defpackage.vnc(10), ((defpackage.xrk) obj6).c);
                    }
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) aifyVar.get(i2);
                    defpackage.xrk xrkVar = (defpackage.xrk) obj6;
                    ahrv ahrvVarG2 = ahrv.g(xrkVar.d.m(phoneAccountHandle));
                    defpackage.xcv xcvVar2 = new defpackage.xcv(phoneAccountHandle, 13);
                    ajct ajctVar2 = xrkVar.c;
                    arrayList.add(ahrvVarG2.i(xcvVar2, ajctVar2).f(java.lang.IllegalStateException.class, new defpackage.qgk(i), ajctVar2));
                    i2++;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ((defpackage.xrk) this.a).e.g((android.telecom.PhoneAccountHandle) obj);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                xbz xbzVar = new xbz(this.a, 5);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((vee) optionalOfNullable.get()).i((android.telecom.PhoneAccountHandle) xbzVar.a));
                }
                if (true != optionalOfNullable.isPresent()) {
                    defpackage.xrk.a.d().l("com/android/voicemail/impl/VoicemailClientReceiver", "scheduleSyncForAccount", 119, "VoicemailClientReceiver.java").v("legacy sync, should not reach here");
                    obj2 = ajcm.a;
                } else {
                    obj2 = optionalOfNullable.get();
                }
                return (ajcq) obj2;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return ((defpackage.ymr) this.a).b.d();
            case 15:
                defpackage.ymc ymcVar = (defpackage.ymc) obj;
                try {
                    return aiql.z(new defpackage.ymq(((defpackage.ymr) this.a).g(ymcVar.a), ymcVar.b));
                } catch (android.os.RemoteException e) {
                    android.util.Log.e(defpackage.ymr.a, "Failed to initialize service.", e);
                    return aiql.y(new defpackage.ymi(2, 6, "Failed to initialize service.", e));
                } catch (java.lang.RuntimeException e2) {
                    android.util.Log.e(defpackage.ymr.a, "Failed to initialize service.", e2);
                    return aiql.y(new defpackage.ymi(2, 0, "Failed to initialize service.", e2));
                }
            case 16:
                return !((java.lang.Boolean) obj).booleanValue() ? aiql.y(new defpackage.ymi(4, 30, "Request blocked due to background use.", null)) : ((defpackage.ymr) this.a).e();
            case 17:
                java.lang.Integer num = (java.lang.Integer) obj;
                int iIntValue = num.intValue();
                java.lang.Object obj7 = this.a;
                if (iIntValue == 0 || num.intValue() == 2147483646) {
                    return ((defpackage.ymr) obj7).e();
                }
                final int iIntValue2 = num.intValue();
                defpackage.ymr ymrVar = (defpackage.ymr) obj7;
                return ajck.w(aiql.D(new java.util.concurrent.Callable() { // from class: ymn
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
                        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        return java.lang.Boolean.valueOf(runningAppProcessInfo.importance <= iIntValue2);
                    }
                }, ymrVar.b.g())).y(new defpackage.xcv(obj7, 16), ymrVar.d);
            case 18:
                defpackage.ymq ymqVar = (defpackage.ymq) obj;
                return ymqVar.b.d(dff.m(new jnr(this.a, ymqVar, 7, (byte[]) null)), new fed(5));
            case 19:
                java.lang.Object obj8 = this.a;
                try {
                    defpackage.ylf ylfVar = ((defpackage.ymc) obj).a;
                    com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelableA = ((defpackage.ymr) obj8).c.a();
                    android.os.Parcel parcelEP = ylfVar.eP();
                    yld.d(parcelEP, abstractSafeParcelableA);
                    android.os.Parcel parcelEQ = ylfVar.eQ(39, parcelEP);
                    int i4 = parcelEQ.readInt();
                    parcelEQ.recycle();
                    return aiql.z(java.lang.Integer.valueOf(i4));
                } catch (android.os.RemoteException e3) {
                    return aiql.y(new defpackage.ymi(4, 6, "Failed to connect to AICore service.", e3));
                }
            default:
                adub adubVar = (adtz) obj;
                aooh.f(adubVar, "result");
                if (!(adubVar instanceof adub) || !((abzt) adubVar.a).a()) {
                    return aiql.z(new adub(aojh.a));
                }
                defpackage.afpl afplVar = (defpackage.afpl) ((acea) this.a).j.a();
                return aosv.F((aoss) afplVar.a, 0, new defpackage.abvg(afplVar, akst.l, (aoln) null, 11), 3);
        }
    }
}
