package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rms implements alah {
    UNKNOWN_LOOKUP_RESULT_TYPE(0),
    NOT_FOUND(1),
    LOCAL_CONTACT(2),
    LOCAL_CACHE(3),
    REMOTE(4),
    EMERGENCY(5),
    VOICEMAIL(6),
    REMOTE_PLACES(7),
    REMOTE_PROFILE(8),
    LOCAL_CACHE_UNKNOWN(9),
    LOCAL_CACHE_DIRECTORY(10),
    LOCAL_CACHE_EXTENDED(11),
    LOCAL_CACHE_PLACES(12),
    LOCAL_CACHE_PROFILE(13),
    LOCAL_CACHE_CNAP(14),
    LOCAL_CACHE_CEQUINT(15),
    REMOTE_OTHER(16),
    LOCAL_CACHE_REMOTE_OTHER(17),
    REMOTE_MANUAL(18),
    LOCAL_CACHE_REMOTE_MANUAL(19),
    REMOTE_GOOGLE_VOICE(20),
    LOCAL_CACHE_REMOTE_GOOGLE_VOICE(21),
    REMOTE_CSA(22),
    LOCAL_CACHE_REMOTE_CSA(23),
    REMOTE_KNOWLEDGE_GRAPH(24),
    LOCAL_CACHE_REMOTE_KNOWLEDGE_GRAPH(25),
    CEQUINT(26);

    public final int B;

    rms(int i) {
        this.B = i;
    }

    public static defpackage.rms b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LOOKUP_RESULT_TYPE;
            case 1:
                return NOT_FOUND;
            case 2:
                return LOCAL_CONTACT;
            case 3:
                return LOCAL_CACHE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return REMOTE;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return EMERGENCY;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return VOICEMAIL;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return REMOTE_PLACES;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return REMOTE_PROFILE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return LOCAL_CACHE_UNKNOWN;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return LOCAL_CACHE_DIRECTORY;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return LOCAL_CACHE_EXTENDED;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return LOCAL_CACHE_PLACES;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return LOCAL_CACHE_PROFILE;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return LOCAL_CACHE_CNAP;
            case 15:
                return LOCAL_CACHE_CEQUINT;
            case 16:
                return REMOTE_OTHER;
            case 17:
                return LOCAL_CACHE_REMOTE_OTHER;
            case 18:
                return REMOTE_MANUAL;
            case 19:
                return LOCAL_CACHE_REMOTE_MANUAL;
            case 20:
                return REMOTE_GOOGLE_VOICE;
            case 21:
                return LOCAL_CACHE_REMOTE_GOOGLE_VOICE;
            case 22:
                return REMOTE_CSA;
            case 23:
                return LOCAL_CACHE_REMOTE_CSA;
            case 24:
                return REMOTE_KNOWLEDGE_GRAPH;
            case 25:
                return LOCAL_CACHE_REMOTE_KNOWLEDGE_GRAPH;
            case 26:
                return CEQUINT;
            default:
                return null;
        }
    }

    public final int a() {
        return this.B;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.B);
    }
}
