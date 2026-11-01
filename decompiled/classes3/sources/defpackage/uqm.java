package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uqm implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uqm(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        char c = 1;
        switch (this.$cid) {
            case 0:
                aimz aimzVar = defpackage.uqp.a;
                aigb aigbVar = new aigb(4);
                aigbVar.l((java.util.Map) obj);
                aigbVar.k(java.util.Collections.reverseOrder());
                return aigbVar.e(true);
            case 1:
                aimz aimzVar2 = defpackage.uqp.a;
                return (aify) j$.util.Collection.-EL.stream((aify) obj).sorted(j$.util.Comparator.-EL.reversed(j$.util.Comparator.-CC.comparingDouble(new alyx(1)))).map(new defpackage.thw(15)).collect(aido.a);
            case 2:
                hgb.f(defpackage.usf.a.c(), obj, "fail to load data from the file to database", "com/android/dialer/timekeeper/impl/TimeKeeperDetailsImporter", "loadDataFromFileToDb", 'O', "TimeKeeperDetailsImporter.java", zct.b);
                return null;
            case 3:
                hgb.f(defpackage.usf.a.c(), obj, "failed to read data from the dataset file", "com/android/dialer/timekeeper/impl/TimeKeeperDetailsImporter", "readDataFromFile", 'g', "TimeKeeperDetailsImporter.java", zct.b);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                hgb.f(defpackage.usj.a.c(), obj, "failed to get database version", "com/android/dialer/timekeeper/impl/database/SafeTimeKeeperDao", "getDatabaseVersion", (char) 162, "SafeTimeKeeperDao.java", zct.b);
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                hgb.f(defpackage.usj.a.c(), obj, "failed to upsert a timekeeper call history", "com/android/dialer/timekeeper/impl/database/SafeTimeKeeperDao", "upsertCallHistory", (char) 237, "SafeTimeKeeperDao.java", zct.b);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.usm usmVar = (defpackage.usm) obj;
                return (usmVar.b & 1) != 0 ? j$.util.Optional.of(java.lang.Integer.valueOf(usmVar.c)) : j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                hgb.f(defpackage.usj.a.c(), obj, "failed to find TimeKeeperData by phone number", "com/android/dialer/timekeeper/impl/database/SafeTimeKeeperDao", "findByPhoneNumber", 'L', "SafeTimeKeeperDao.java", zct.b);
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                hgb.f(defpackage.usj.a.c(), obj, "failed to find TimeKeeperCallHistory by call creation time", "com/android/dialer/timekeeper/impl/database/SafeTimeKeeperDao", "findCallHistory", (char) 206, "SafeTimeKeeperDao.java", zct.b);
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                hgb.f(defpackage.usj.a.c(), obj, "failed to refresh database", "com/android/dialer/timekeeper/impl/database/SafeTimeKeeperDao", "refreshDatabase", 'i', "SafeTimeKeeperDao.java", zct.b);
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return java.lang.Boolean.valueOf(optional.isPresent() && !((defpackage.uru) optional.orElseThrow()).g);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                return j$.util.Optional.ofNullable(acuiVar != null ? java.lang.Integer.valueOf(acuiVar.f) : null);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.acui acuiVar2 = (defpackage.acui) obj;
                if (acuiVar2 == null) {
                    hgb.j(defpackage.utf.a.d(), "No dataset has been downloaded yet.", "com/android/dialer/timekeeper/impl/mdd/TimeKeeperDataRepository", "getDownloadedZipFileUri", (char) 162, "TimeKeeperDataRepository.java", zct.b, zct.a);
                    return j$.util.Optional.empty();
                }
                j$.util.Optional optionalFindAny = j$.util.Collection.-EL.stream(acuiVar2.h).filter(new defpackage.sqj(7)).findAny();
                if (optionalFindAny.isPresent()) {
                    return j$.util.Optional.of(android.net.Uri.parse(((defpackage.acuh) optionalFindAny.orElseThrow()).d));
                }
                hgb.j(defpackage.utf.a.d(), "No data found in downloaded file group.", "com/android/dialer/timekeeper/impl/mdd/TimeKeeperDataRepository", "getDownloadedZipFileUri", (char) 176, "TimeKeeperDataRepository.java", zct.b, zct.a);
                return j$.util.Optional.empty();
            case 15:
                agux aguxVar = uti.a;
                return new gsf();
            case 16:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                if (!optional2.isPresent()) {
                    return j$.util.Optional.empty();
                }
                akzx akzxVarM = defpackage.whc.a.m();
                akzxVarM.u();
                defpackage.whc whcVar = (defpackage.whc) akzxVarM.b;
                whcVar.e = 2;
                whcVar.b |= 1;
                akzxVarM.u();
                defpackage.whc whcVar2 = (defpackage.whc) akzxVarM.b;
                whcVar2.f = 1;
                whcVar2.b |= 2;
                akzxVarM.u();
                defpackage.whc whcVar3 = (defpackage.whc) akzxVarM.b;
                whcVar3.b |= 4;
                whcVar3.g = 2131232003;
                akzx akzxVarM2 = defpackage.whb.a.m();
                akzxVarM2.u();
                defpackage.whb whbVar = (defpackage.whb) akzxVarM2.b;
                whbVar.b |= 1;
                whbVar.c = 2132020586;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                defpackage.urv urvVar = ((defpackage.urw) optional2.orElseThrow()).c;
                if (urvVar == null) {
                    urvVar = defpackage.urv.a;
                }
                java.lang.String strValueOf = java.lang.String.valueOf(((long) urvVar.d) / 60);
                akzxVarM2.u();
                defpackage.whb whbVar2 = (defpackage.whb) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strValueOf);
                alat alatVar = whbVar2.d;
                if (!alatVar.c()) {
                    whbVar2.d = alad.J(alatVar);
                }
                whbVar2.d.add(strValueOf);
                defpackage.whb whbVar3 = (defpackage.whb) akzxVarM2.p();
                akzxVarM.u();
                defpackage.whc whcVar4 = (defpackage.whc) akzxVarM.b;
                j$.util.Objects.requireNonNull(whbVar3);
                whcVar4.d = whbVar3;
                whcVar4.c = 5;
                return j$.util.Optional.of((defpackage.whc) akzxVarM.p());
            case 17:
                hgb.f(defpackage.uvb.a.d(), obj, "At least one of the input audio files was not found or couldn't be encoded", "com/android/dialer/transcriptaudiofeedback/impl/AudioRecordingCombiner", "combineAudioFiles", (char) 136, "AudioRecordingCombiner.java", zct.b);
                return j$.util.Optional.empty();
            case 18:
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream((java.util.List) obj).anyMatch(new defpackage.sqj(9)));
            case 19:
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream((java.util.List) obj).allMatch(new defpackage.sqj(10)));
            default:
                j$.util.stream.Stream streamFlatMap = j$.util.Collection.-EL.stream((java.util.List) obj).flatMap(new defpackage.thw(20));
                defpackage.var varVar = new defpackage.var(c == true ? 1 : 0);
                alcf alcfVar = aldi.a;
                return (aify) streamFlatMap.sorted(j$.util.Comparator.-CC.comparing(varVar, defpackage.aldh.INSTANCE)).collect(aido.a);
        }
    }
}
