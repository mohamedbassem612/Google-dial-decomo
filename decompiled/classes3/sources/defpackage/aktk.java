package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum aktk implements alah {
    UNKNOWN_INSTRUCTION(0),
    SYNC(1),
    FULL_SYNC(2),
    STORE_ALL_ACCOUNTS(3),
    UPDATE_THREAD(4),
    UPDATE_BADGE_COUNT(5),
    REMOVE_STORAGE(6),
    DELETE_NOTIFICATION(7),
    REFRESH_REGISTRATION(8);

    private final int k;

    aktk(int i) {
        this.k = i;
    }

    public static defpackage.aktk b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_INSTRUCTION;
            case 1:
                return SYNC;
            case 2:
                return FULL_SYNC;
            case 3:
                return STORE_ALL_ACCOUNTS;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return UPDATE_THREAD;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return UPDATE_BADGE_COUNT;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return REMOVE_STORAGE;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return DELETE_NOTIFICATION;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return REFRESH_REGISTRATION;
            default:
                return null;
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
