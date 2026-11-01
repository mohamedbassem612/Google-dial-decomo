package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class yoz implements java.util.function.Function {
    private final /* synthetic */ int $cid;

    public /* synthetic */ yoz(int i) {
        this.$cid = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).f);
            case 1:
                return java.lang.Integer.valueOf(((defpackage.xqh) ((akzx) obj).b).e);
            case 2:
                return java.lang.Integer.valueOf(((defpackage.xqh) ((akzx) obj).b).g);
            case 3:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).h);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return java.lang.Integer.valueOf(((defpackage.xqh) ((akzx) obj).b).i);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.Long.valueOf(((defpackage.xqh) ((akzx) obj).b).j);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return (j$.util.Optional) ((aoin) ((zjm) obj).f().orElseThrow()).a();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((j$.util.Optional) obj).get();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return (mhc) obj;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                try {
                    return ((ajas) obj).a();
                } catch (java.lang.Exception e) {
                    return aiql.y(e);
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((j$.util.Optional) obj).get();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return (ajas) ((defpackage.uyg) obj).t().orElseThrow();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                try {
                    return ((ajas) obj).a();
                } catch (java.lang.Exception e2) {
                    return aiql.y(e2);
                }
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                try {
                    return (j$.util.Optional) aiql.H((ajcq) obj);
                } catch (java.lang.Exception e3) {
                    a.by(defpackage.zkb.a.c(), "production failed", "com/google/android/dialershared/featureguarding/safeproducers/SafeProducedMultibindingSet", "get", 'E', "SafeProducedMultibindingSet.java", e3);
                    return null;
                }
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) obj;
                aimz aimzVar = zms.a;
                try {
                    java.lang.String strM = baa$.ExternalSyntheticApiModelOutline1.m(bluetoothDevice);
                    zms.a.b().l("com/google/android/dialershared/incall/core/audiomode/AudioModeProvider", "getDeviceAliasName", 184, "AudioModeProvider.java").I("BT device alias for address [%s]: %s", bluetoothDevice.getAddress(), strM != null ? strM : "<empty>");
                    return strM;
                } catch (java.lang.SecurityException e4) {
                    a.by(zms.a.b(), "Security exception calling getAlias() device directly, bluetooth permissions may be missing.", "com/google/android/dialershared/incall/core/audiomode/AudioModeProvider", "getDeviceAliasName", (char) 189, "AudioModeProvider.java", e4);
                    return "";
                }
            case 15:
                defpackage.aaal aaalVar = new defpackage.aaal((defpackage.aaam) obj);
                aaalVar.c(true);
                return aaalVar.a();
            case 16:
                return ((defpackage.aaam) obj).a;
            case 17:
                return ((defpackage.aaam) obj).b;
            case 18:
                return j$.util.stream.Stream.-CC.ofNullable(((defpackage.zyz) obj).b());
            case 19:
                com.google.android.gms.duokit.RemoteUserReachability remoteUserReachability = new com.google.android.gms.duokit.RemoteUserReachability();
                remoteUserReachability.a = (com.google.android.gms.duokit.DuoId) obj;
                remoteUserReachability.b = 0;
                return remoteUserReachability;
            default:
                return new android.os.PatternMatcher((java.lang.String) obj, 2);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
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
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
