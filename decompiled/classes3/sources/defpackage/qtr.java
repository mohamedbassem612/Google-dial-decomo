package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qtr implements alah {
    BOTTOM_SHEET_FRAGMENT_KEY_NONE(0),
    SONIC_GRID(1),
    EXPRESSO_GRID(2),
    CULDESAC(3),
    CALL_ASSIST(4),
    MORE_MENU(5),
    AUDIO_ROUTE_SELECTOR(6),
    TTT(7),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int k;

    qtr(int i) {
        this.k = i;
    }

    public static defpackage.qtr b(int i) {
        switch (i) {
            case 0:
                return BOTTOM_SHEET_FRAGMENT_KEY_NONE;
            case 1:
                return SONIC_GRID;
            case 2:
                return EXPRESSO_GRID;
            case 3:
                return CULDESAC;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return CALL_ASSIST;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return MORE_MENU;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return AUDIO_ROUTE_SELECTOR;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return TTT;
            default:
                switch (i) {
                    case 100000:
                        return TEST_HIGH_PRIORITY;
                    case 100001:
                        return TEST_LOW_PRIORITY;
                    default:
                        return null;
                }
        }
    }

    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
