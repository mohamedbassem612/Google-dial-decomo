package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum uty implements alah {
    UNKNOWN(0),
    ATLAS(1),
    XATU(2),
    TIME_KEEPER(3),
    CALL_SCREEN(4),
    DOBBY(5),
    FERMAT(6),
    BEESLY(7),
    HEDWIG(8),
    TEST_FEATURE_1(10001),
    TEST_FEATURE_2(10002),
    UNRECOGNIZED(-1);

    private final int n;

    uty(int i) {
        this.n = i;
    }

    public static defpackage.uty b(int i) {
        if (i == 10001) {
            return TEST_FEATURE_1;
        }
        if (i == 10002) {
            return TEST_FEATURE_2;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ATLAS;
            case 2:
                return XATU;
            case 3:
                return TIME_KEEPER;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return CALL_SCREEN;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return DOBBY;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return FERMAT;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return BEESLY;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return HEDWIG;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
