package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lbs implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ lbs(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r14v73, types: [boolean, int] */
    public final java.lang.Object apply(java.lang.Object obj) {
        akzc akzcVarF;
        defpackage.ljx ljxVar;
        defpackage.ljx ljxVar2;
        int i = 0;
        switch (this.$cid) {
            case 0:
                return (aigf) j$.util.Collection.-EL.stream((java.util.List) obj).collect(aido.b(new defpackage.kle(7), new defpackage.kle(10)));
            case 1:
                break;
            case 2:
                return java.lang.Boolean.valueOf(1 == ((((lbv) obj).b & 1) ^ 1));
            case 3:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return true == optional.isPresent() ? j$.util.Optional.ofNullable(((pgi) optional.get()).A()) : optional;
            case 4:
                return abxl.L("CALL_SCREEN_CLICKED", ((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            case 5:
                return abxl.L("CALL_SCREEN_AVAILABLE_RECENTLY", ((java.lang.Boolean) obj).booleanValue() ? 1 : 0);
            case 6:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return "";
                }
                aike aikeVarZ = ((pgi) optional2.orElseThrow()).z(defpackage.lll.UNKNOWN);
                int i2 = aikeVarZ.d;
                while (i < i2) {
                    defpackage.lgk lgkVar = (defpackage.lgk) aikeVarZ.get(i);
                    i++;
                    if (lgkVar.h.equals("report_spam")) {
                        return lgkVar.f;
                    }
                }
                return "";
            case 7:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                return optional3.isPresent() ? ((pgi) optional3.orElseThrow()).y(defpackage.lll.UNKNOWN).a.toString() : "";
            case 8:
                return j$.util.Optional.of((defpackage.idv) obj);
            case 9:
                hgb.f(defpackage.lcl.a.d(), obj, "failed to compress raw audio", "com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "compressAudioData", (char) 166, "CallScreenDonationScottyUploader.java", zct.b);
                return j$.util.Optional.empty();
            case 10:
                j$.util.Optional optional4 = (j$.util.Optional) obj;
                if (!optional4.isPresent()) {
                    a.bI(defpackage.lcl.a.d(), "failed to encode audio file", "com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "prepareAudioUploadForScotty", 'n', "CallScreenDonationScottyUploader.java", zct.b);
                    return j$.util.Optional.empty();
                }
                java.io.File file = new java.io.File(((defpackage.idv) optional4.orElseThrow()).c);
                if (!file.exists()) {
                    a.bt(defpackage.lcl.a.d(), "file %s doesn't exist", file.getName(), "com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "prepareAudioUploadForScotty", 'w', "CallScreenDonationScottyUploader.java", zct.b);
                    return j$.util.Optional.empty();
                }
                java.lang.String name = file.getName();
                if (name == null) {
                    throw new java.lang.NullPointerException("Null fileName");
                }
                try {
                    akzcVarF = akzc.F(new java.io.FileInputStream(file));
                    break;
                } catch (java.io.IOException unused) {
                    a.bt(defpackage.lcl.a.d(), "Unable to load file %s", file.getName(), "com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "safeReadAllBytesFromFile", (char) 197, "CallScreenDonationScottyUploader.java", zct.b);
                    akzcVarF = akzc.d;
                }
                if (akzcVarF == null) {
                    throw new java.lang.NullPointerException("Null audioData");
                }
                defpackage.lcr lcrVar = new defpackage.lcr(name, akzcVarF);
                if (!file.exists()) {
                    defpackage.lcl.a.b().l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "deleteFile", 204, "CallScreenDonationScottyUploader.java").y("file %s doesn't exist", file.getName());
                } else if (!file.delete()) {
                    a.bt(defpackage.lcl.a.d(), "unable to delete file %s", file.getName(), "com/android/dialer/callscreen/impl/donation/scotty/CallScreenDonationScottyUploader", "deleteFile", (char) 209, "CallScreenDonationScottyUploader.java", zct.b);
                }
                return j$.util.Optional.of(lcrVar);
            case 11:
                aimz aimzVar = lcp.a;
                return new gsf();
            case 12:
                hgb.f(lcp.a.c(), obj, "error uploading to scotty", "com/android/dialer/callscreen/impl/donation/scotty/CallScreenMetricsWorker", "uploadEligibleAudioAndMetricsToScotty", 'e', "CallScreenMetricsWorker.java", zct.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                apjb apjbVar = (apjb) obj;
                aigf aigfVar = defpackage.lcq.a;
                if (apjbVar.n()) {
                    defpackage.lcq.b.b().i(zct.a).l("com/android/dialer/callscreen/impl/donation/scotty/CallScreenScottyUploadChannel", "upload", 131, "CallScreenScottyUploadChannel.java").y("Call Screen scotty send completed with %s", ((ammv) apjbVar.a).a);
                }
                if (!apjbVar.m()) {
                    return apjbVar;
                }
                a.bt(defpackage.lcq.b.b(), "Call Screen Scotty send completed with %s", ((amwp) apjbVar.b).c(), "com/android/dialer/callscreen/impl/donation/scotty/CallScreenScottyUploadChannel", "upload", (char) 140, "CallScreenScottyUploadChannel.java", zct.a);
                return apjbVar;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.lkq lkqVar = (defpackage.lkq) obj;
                if (lkqVar == null || (ljxVar = lkqVar.g) == null) {
                    defpackage.lcu.a.b().l("com/android/dialer/callscreen/impl/feedbackintegration/CallScreenFeedbackIntegration", "getIsActivated", 67, "CallScreenFeedbackIntegration.java").v("transcript or feedback data is null");
                    return java.lang.Boolean.FALSE;
                }
                defpackage.ljy ljyVar = ljxVar.c;
                if (ljyVar == null) {
                    ljyVar = defpackage.ljy.a;
                }
                return java.lang.Boolean.valueOf(ljyVar.c);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.lkq lkqVar2 = (defpackage.lkq) obj;
                if (lkqVar2 == null || (ljxVar2 = lkqVar2.g) == null) {
                    defpackage.lcu.a.b().l("com/android/dialer/callscreen/impl/feedbackintegration/CallScreenFeedbackIntegration", "getHasCallBeenSurveyed", 229, "CallScreenFeedbackIntegration.java").v("transcript or feedback data is null");
                    return java.lang.Boolean.FALSE;
                }
                defpackage.ljy ljyVar2 = ljxVar2.c;
                if (ljyVar2 == null) {
                    ljyVar2 = defpackage.ljy.a;
                }
                return ljyVar2.c ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
            case 16:
                return afsq.bR((java.lang.Integer) obj);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (aihd) j$.util.Collection.-EL.stream((java.util.List) obj).filter(new defpackage.jvr(18)).map(new defpackage.kle(14)).collect(aido.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                long j = defpackage.lee.a;
                return java.lang.Boolean.valueOf(((defpackage.led) obj).d);
            default:
                return java.lang.Boolean.valueOf((boolean) (((j$.time.Instant.now().toEpochMilli() - aldi.b((alcf) obj)) > defpackage.lee.a ? 1 : ((j$.time.Instant.now().toEpochMilli() - aldi.b((alcf) obj)) == defpackage.lee.a ? 0 : -1)) >>> 31));
        }
        return null;
    }
}
