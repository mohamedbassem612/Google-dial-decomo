package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zvl implements alah {
    UNSPECIFIED_FIX(0),
    DO_NOTHING(1),
    TEST_ONLY_FIX(2),
    FILE_DELETION(3),
    EXEC_SQL_FIX(4),
    SEND_BROADCAST(5),
    WEBVIEW_SAFEMODE_FIX(6),
    LOCAL_APP_ERROR(7),
    PROCESS_RESTART(8),
    SHARED_PREFERENCES_DELETION(9),
    PHONESKY_FIX(10),
    COMPONENT_ENABLED_SETTING_FIX(11),
    EMERGENCY_PLAY_STORE_INSTALL(12),
    START_SERVICE(13),
    PHENOTYPE_SYNC(14),
    UNRECOGNIZED(-1);

    private final int r;

    zvl(int i) {
        this.r = i;
    }

    public static defpackage.zvl b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_FIX;
            case 1:
                return DO_NOTHING;
            case 2:
                return TEST_ONLY_FIX;
            case 3:
                return FILE_DELETION;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return EXEC_SQL_FIX;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return SEND_BROADCAST;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return WEBVIEW_SAFEMODE_FIX;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return LOCAL_APP_ERROR;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return PROCESS_RESTART;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return SHARED_PREFERENCES_DELETION;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return PHONESKY_FIX;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return COMPONENT_ENABLED_SETTING_FIX;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return EMERGENCY_PLAY_STORE_INSTALL;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return START_SERVICE;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return PHENOTYPE_SYNC;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.r;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.r);
    }
}
