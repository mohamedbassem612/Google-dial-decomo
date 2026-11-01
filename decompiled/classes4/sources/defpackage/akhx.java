package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akhx implements alah {
    CONDITION_UNKNOWN(0),
    CONDITION_NETWORK(1),
    CONDITION_NETWORK_NOT_READY(2),
    CONDITION_LOCALE(3),
    CONDITION_REGION(4),
    CONDITION_BATTERY(5),
    CONDITION_INSTALLED_APP(6),
    CONDITION_VIEW_NOT_IN_SCREEN(7),
    CONDITION_KEYBOARD_PRESENT(8),
    CONDITION_TIME_CONSTRAINT(9),
    CONDITION_SYNC_REQUIRED(10),
    CONDITION_VALID_INTENT(11),
    CONDITION_DASHER(12),
    CONDITION_MINOR(13),
    CONDITION_AUTH_URL(14),
    CONDITIONS_ORIENTATION(15),
    CONDITIONS_DEVICE_TYPE(16);

    public final int r;

    akhx(int i) {
        this.r = i;
    }

    public static defpackage.akhx b(int i) {
        switch (i) {
            case 0:
                return CONDITION_UNKNOWN;
            case 1:
                return CONDITION_NETWORK;
            case 2:
                return CONDITION_NETWORK_NOT_READY;
            case 3:
                return CONDITION_LOCALE;
            case 4:
                return CONDITION_REGION;
            case 5:
                return CONDITION_BATTERY;
            case 6:
                return CONDITION_INSTALLED_APP;
            case 7:
                return CONDITION_VIEW_NOT_IN_SCREEN;
            case 8:
                return CONDITION_KEYBOARD_PRESENT;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return CONDITION_TIME_CONSTRAINT;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return CONDITION_SYNC_REQUIRED;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return CONDITION_VALID_INTENT;
            case 12:
                return CONDITION_DASHER;
            case 13:
                return CONDITION_MINOR;
            case 14:
                return CONDITION_AUTH_URL;
            case 15:
                return CONDITIONS_ORIENTATION;
            case 16:
                return CONDITIONS_DEVICE_TYPE;
            default:
                return null;
        }
    }

    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.r);
    }
}
