package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum vbs implements alah {
    UNSPECIFIED(0),
    UNRECOGNIZED_ERROR(30),
    FAILED_FUTURE(16),
    ACTION_NOT_SPECIFIED(17),
    VVM_CARRIER_SERVICE_NOT_FOUND(18),
    MAXIMUM_RETRIES_MET(19),
    INCOMPATIBLE_NETWORK_CONDITIONS(21),
    ACCOUNT_NOT_ACTIVATED_YET(26),
    NO_CARRIER_NETWORK_CELLULAR_REQUIRED(63),
    PIN_CHANGE_TOO_SHORT(1),
    PIN_CHANGE_TOO_LONG(2),
    PIN_CHANGE_TOO_WEAK(3),
    PIN_CHANGE_INVALID_CHARACTER(4),
    PIN_CHANGE_INCORRECT_OLD_PIN(5),
    PIN_CHANGE_REPEATED_DIGITS(6),
    PIN_CHANGE_CONSECUTIVE_DIGITS(7),
    PIN_CHANGE_MSISDN_LAST_4_DIGITS(8),
    PIN_CHANGE_NEW_UNCHANGED(9),
    PIN_CHANGE_RECENTLY_CHANGED(10),
    PIN_CHANGE_SYSTEM_ERROR(11),
    ACTIVATE_VVM_NOT_ENABLED(12),
    ACTIVATE_MAILBOX_LOCKED(13),
    ACTIVATE_UNKNOWN_ERROR(15),
    ACTIVATE_PROVISIONING_STATE_UNKNOWN(32),
    ACTIVATE_PROVISIONING_STATE_BLOCKED(33),
    ACTIVATE_PROVISIONING_FAILED(34),
    STATUS_CHECK_NEEDS_ACTIVATION(62),
    GREETING_SYNC_NO_GREETING(25),
    NETWORK_CONNECTION_UNEXPECTED_ERROR(27),
    NETWORK_CONNECTION_AUTH_UNKNOWN_USER(29),
    NEW_VOICEMAIL_FROM_CALLER_PROHIBITED(64),
    CUSTOM_GREETING_UPLOAD_ERROR(65),
    CUSTOM_GREETING_DOWNLOAD_ERROR(66),
    UNRECOGNIZED(-1);

    private final int J;

    vbs(int i) {
        this.J = i;
    }

    public static defpackage.vbs b(int i) {
        if (i == 21) {
            return INCOMPATIBLE_NETWORK_CONDITIONS;
        }
        if (i == 29) {
            return NETWORK_CONNECTION_AUTH_UNKNOWN_USER;
        }
        if (i == 30) {
            return UNRECOGNIZED_ERROR;
        }
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return PIN_CHANGE_TOO_SHORT;
            case 2:
                return PIN_CHANGE_TOO_LONG;
            case 3:
                return PIN_CHANGE_TOO_WEAK;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return PIN_CHANGE_INVALID_CHARACTER;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return PIN_CHANGE_INCORRECT_OLD_PIN;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return PIN_CHANGE_REPEATED_DIGITS;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return PIN_CHANGE_CONSECUTIVE_DIGITS;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return PIN_CHANGE_MSISDN_LAST_4_DIGITS;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return PIN_CHANGE_NEW_UNCHANGED;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return PIN_CHANGE_RECENTLY_CHANGED;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return PIN_CHANGE_SYSTEM_ERROR;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ACTIVATE_VVM_NOT_ENABLED;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return ACTIVATE_MAILBOX_LOCKED;
            default:
                switch (i) {
                    case 15:
                        return ACTIVATE_UNKNOWN_ERROR;
                    case 16:
                        return FAILED_FUTURE;
                    case 17:
                        return ACTION_NOT_SPECIFIED;
                    case 18:
                        return VVM_CARRIER_SERVICE_NOT_FOUND;
                    case 19:
                        return MAXIMUM_RETRIES_MET;
                    default:
                        switch (i) {
                            case 25:
                                return GREETING_SYNC_NO_GREETING;
                            case 26:
                                return ACCOUNT_NOT_ACTIVATED_YET;
                            case 27:
                                return NETWORK_CONNECTION_UNEXPECTED_ERROR;
                            default:
                                switch (i) {
                                    case 32:
                                        return ACTIVATE_PROVISIONING_STATE_UNKNOWN;
                                    case 33:
                                        return ACTIVATE_PROVISIONING_STATE_BLOCKED;
                                    case 34:
                                        return ACTIVATE_PROVISIONING_FAILED;
                                    default:
                                        switch (i) {
                                            case 62:
                                                return STATUS_CHECK_NEEDS_ACTIVATION;
                                            case 63:
                                                return NO_CARRIER_NETWORK_CELLULAR_REQUIRED;
                                            case 64:
                                                return NEW_VOICEMAIL_FROM_CALLER_PROHIBITED;
                                            case 65:
                                                return CUSTOM_GREETING_UPLOAD_ERROR;
                                            case 66:
                                                return CUSTOM_GREETING_DOWNLOAD_ERROR;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.J;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.J);
    }
}
