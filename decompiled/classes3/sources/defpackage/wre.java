package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wre implements alah {
    UNKNOWN(0),
    AGENT_DETECTED(1),
    HOLD_DETECTED(2),
    CALL_DEACTIVATED(3),
    USER_ENDED(4),
    ADDON_FEATURE_ACTIVATION(5),
    ERROR(6);

    public final int h;

    wre(int i2) {
        this.h = i2;
    }

    public static defpackage.wre b(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return AGENT_DETECTED;
            case 2:
                return HOLD_DETECTED;
            case 3:
                return CALL_DEACTIVATED;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return USER_ENDED;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ADDON_FEATURE_ACTIVATION;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ERROR;
            default:
                return null;
        }
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
