package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amsb implements alah {
    TTS_SYNTHESIS_ERROR_INVALID_REQUEST(0),
    TTS_SYNTHESIS_ERROR_NETWORK(1),
    TTS_SYNTHESIS_ERROR_NETWORK_TIMEOUT(2),
    TTS_SYNTHESIS_ERROR_NOT_INSTALLED_YET(3),
    TTS_SYNTHESIS_ERROR_OUTPUT(4),
    TTS_SYNTHESIS_ERROR_SERVICE(5),
    TTS_SYNTHESIS_ERROR_SYNTHESIS(6),
    TTS_SYNTHESIS_ERROR_UNKNOWN(7),
    TTS_SYNTHESIS_ERROR_GENERIC(8);

    public final int j;

    amsb(int i) {
        this.j = i;
    }

    public static defpackage.amsb b(int i) {
        switch (i) {
            case 0:
                return TTS_SYNTHESIS_ERROR_INVALID_REQUEST;
            case 1:
                return TTS_SYNTHESIS_ERROR_NETWORK;
            case 2:
                return TTS_SYNTHESIS_ERROR_NETWORK_TIMEOUT;
            case 3:
                return TTS_SYNTHESIS_ERROR_NOT_INSTALLED_YET;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return TTS_SYNTHESIS_ERROR_OUTPUT;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return TTS_SYNTHESIS_ERROR_SERVICE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return TTS_SYNTHESIS_ERROR_SYNTHESIS;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return TTS_SYNTHESIS_ERROR_UNKNOWN;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return TTS_SYNTHESIS_ERROR_GENERIC;
            default:
                return null;
        }
    }

    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
