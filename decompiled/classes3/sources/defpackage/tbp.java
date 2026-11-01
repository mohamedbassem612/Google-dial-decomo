package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tbp implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ tbp(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((j$.util.Optional) obj).isPresent());
            case 1:
                defpackage.acui acuiVar = (defpackage.acui) obj;
                if (acuiVar == null) {
                    tbq.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "getClientFileGroup", 102, "RevelioTtsRepository.java").y("no ClientFileGroup for %s", "revelio-strings-tts");
                    return j$.util.Optional.empty();
                }
                tbq.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/tts/RevelioTtsRepository", "getClientFileGroup", 106, "RevelioTtsRepository.java").y("found ClientFileGroup for %s", "revelio-strings-tts");
                return j$.util.Optional.of(acuiVar);
            case 2:
                return ((tcp) obj) == tcp.e ? j$.util.Optional.empty() : j$.util.Optional.of(new defpackage.tco(defpackage.tdf.class.getName(), defpackage.tdl.class.getName()));
            case 3:
                java.lang.Integer num = (java.lang.Integer) obj;
                tcu.a.b().l("com/android/dialer/rtt/settings/impl/configuration/RttConfigurationDao", "isRttCallingModeEnabled", 154, "RttConfigurationDao.java").y("RTT calling mode: %d", num);
                return java.lang.Boolean.valueOf(num.intValue() != 0);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return tcp.b(((java.lang.Integer) obj).intValue());
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                android.content.Intent intent = (android.content.Intent) obj;
                return intent != null ? com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination.b(intent) : com.google.apps.tiktok.nav.gateway.GatewayHandler$GatewayDestination.a("intent is null, RTT visibility setting is not supported.");
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aimz aimzVar = defpackage.tia.a;
                return (aify) j$.util.Collection.-EL.stream((aify) obj).map(new defpackage.rat(20)).collect(aido.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aify aifyVar = (aify) obj;
                aimz aimzVar2 = defpackage.tia.a;
                aift aiftVar = new aift(4);
                aca acaVar = new aca();
                int size = aifyVar.size();
                for (int i = 0; i < size; i++) {
                    defpackage.tin tinVar = (defpackage.tin) aifyVar.get(i);
                    j$.util.Optional optional = tinVar.e;
                    if (!optional.isPresent()) {
                        aiftVar.i(tinVar);
                    } else if (!acaVar.containsKey(optional.orElseThrow()) || ((java.lang.Long) acaVar.get(optional.orElseThrow())).longValue() != tinVar.l) {
                        acaVar.put((java.lang.String) optional.orElseThrow(), java.lang.Long.valueOf(tinVar.l));
                        aiftVar.i(tinVar);
                    }
                }
                return aiftVar.h();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return java.lang.Boolean.valueOf(!((defpackage.tkf) obj).equals(defpackage.tkf.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                akzx akzxVarM = ooj.a.m();
                boolean z = ((defpackage.tkf) obj).c;
                akzxVarM.u();
                akzxVarM.b.b = z;
                return akzxVarM.p();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return afsq.bU((java.lang.Boolean) obj);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return afsq.bR((java.lang.Integer) obj);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Boolean.valueOf(((java.lang.Integer) obj).intValue() == 0);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return afsq.bR((java.lang.Integer) obj);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                tzq.a.b().l("com/android/dialer/sonic/impl/mdd/SonicMddRepository", "downloadInForeground", 149, "SonicMddRepository.java").v("download completed");
                return null;
            case 15:
                aimz aimzVar3 = defpackage.tzr.a;
                return ((java.io.File) ((j$.util.Optional) obj).orElseThrow()).getAbsolutePath();
            case 16:
                defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "playAudioForLocalAndRemoteInternalSync", 231, "SonicAudioPlayer.java").v("sonic audio play succeeded");
                return null;
            case 17:
                return ((java.io.File) ((j$.util.Optional) obj).orElseThrow()).getAbsolutePath();
            case 18:
                defpackage.tzv.a.b().l("com/android/dialer/sonic/impl/service/SonicAudioPlayer", "playAudioForLocalInternalSync", 266, "SonicAudioPlayer.java").v("sonic audio play succeeded");
                return null;
            case 19:
                return (defpackage.tzu) aooc.ar((hkl) obj, defpackage.tzu.class);
            default:
                return (defpackage.uad) aooc.ar((hkl) obj, defpackage.uad.class);
        }
    }
}
