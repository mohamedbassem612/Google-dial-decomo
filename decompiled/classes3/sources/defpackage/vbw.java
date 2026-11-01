package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum vbw implements alah {
    OMTP_UNSPECIFIED(0),
    SMS_SERVER_NOT_RESPONDING(27),
    FAILED_SENDING_SMS_TO_SMS_SERVER(28),
    SENDING_SMS_TO_SMS_SERVER_TIMED_OUT(36),
    SENDING_SMS_TO_SMS_SERVER_CANCELLED(37),
    SENDING_SMS_TO_SMS_SERVER_RIL_GENERIC_ERROR(38),
    SENDING_SMS_TO_SMS_SERVER_FAIL_RETRY(39),
    SENDING_SMS_TO_SMS_SERVER_GENERIC_FAILURE(40),
    SENDING_SMS_TO_SMS_SERVER_NO_SERVICE(41),
    SENDING_SMS_TO_SMS_SERVER_RIL_MODEM_ERR(42),
    SENDING_SMS_TO_SMS_SERVER_ERROR_RADIO_OFF(45),
    SENDING_SMS_TO_SMS_SERVER_ERROR_NULL_PDU(46),
    SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_ERR(47),
    SENDING_SMS_TO_SMS_SERVER_MODEM_ERROR(48),
    SENDING_SMS_TO_SMS_SERVER_NETWORK_ERROR(49),
    SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_REJECT(50),
    SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_NOT_READY(51),
    SENDING_SMS_TO_SMS_SERVER_RIL_ACCESS_BARRED(52),
    EXISTING_SMS_IS_PROCESSING(34),
    NETWORK_CONNECTION_INVALID_PORT(3),
    NETWORK_CONNECTION_FAILED_CELLULAR_REQUIRED(4),
    NETWORK_CONNECTION_FAILED_NO_CONNECTION(5),
    NETWORK_CONNECTION_CANNOT_RESOLVE_HOST(6),
    NETWORK_CONNECTION_ALL_SOCKET_CONNECTION_FAILED(7),
    NETWORK_CONNECTION_CANNOT_ESTABLISH_SSL_SESSION(8),
    NETWORK_CONNECTION_SSL_INVALID_HOST_NAME(9),
    NETWORK_CONNECTION_BAD_IMAP_CREDENTIAL(10),
    NETWORK_CONNECTION_AUTH_UNKNOWN_DEVICE(12),
    NETWORK_CONNECTION_AUTH_INVALID_PASSWORD(13),
    NETWORK_CONNECTION_AUTH_MAILBOX_NOT_INITIALIZED(14),
    NETWORK_CONNECTION_AUTH_SERVICE_NOT_PROVISIONED(15),
    NETWORK_CONNECTION_AUTH_SERVICE_NOT_ACTIVATED(16),
    NETWORK_CONNECTION_AUTH_USER_IS_BLOCKED(17),
    NETWORK_CONNECTION_REJECTED_SERVER_RESPONSE(18),
    NETWORK_CONNECTION_INVALID_INITIAL_SERVER_RESPONSE(19),
    NETWORK_CONNECTION_IOE_ON_OPEN(20),
    NETWORK_CONNECTION_MAILBOX_OPEN_FAILED(21),
    NETWORK_CONNECTION_GENERIC_IMAP_IOE(23),
    NETWORK_CONNECTION_SSL_EXCEPTION(24),
    NETWORK_CONNECTION_CELL_SIGNAL_LOST(25),
    PROVISION_ERROR_SUBSCRIBER_STATUS(43),
    PROVISION_CHECK_STATUS_NOT_READY(44),
    PROVISION_NOT_REQUIRED(53),
    PROVISION_NEED_TO_DISABLE_VVM(54),
    PROVISION_GENERIC_FAILURE(55),
    SYNC_ERROR_INBOX_FULL(26),
    SYNC_ERROR_INBOX_ALMOST_FULL(35),
    VOICE_MESSAGING_GATEWAY_CONNECTION_FAILED(30),
    SELF_PROVISIONING_GATEWAY_CONNECTION_FAILED(31),
    VOICE_MESSAGING_GATEWAY_URL_UNKNOWN(56),
    PIN_NOT_SET(32),
    NO_RECEIVE_SMS_PERMISSION(33),
    EMPTY_VOICEMAIL_PAYLOAD(57),
    UNRECOGNIZED(-1);

    private final int ad;

    vbw(int i) {
        this.ad = i;
    }

    public static defpackage.vbw b(int i) {
        switch (i) {
            case 0:
                return OMTP_UNSPECIFIED;
            case 1:
            case 2:
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
            case 22:
            case 29:
            default:
                return null;
            case 3:
                return NETWORK_CONNECTION_INVALID_PORT;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return NETWORK_CONNECTION_FAILED_CELLULAR_REQUIRED;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return NETWORK_CONNECTION_FAILED_NO_CONNECTION;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return NETWORK_CONNECTION_CANNOT_RESOLVE_HOST;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return NETWORK_CONNECTION_ALL_SOCKET_CONNECTION_FAILED;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return NETWORK_CONNECTION_CANNOT_ESTABLISH_SSL_SESSION;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return NETWORK_CONNECTION_SSL_INVALID_HOST_NAME;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return NETWORK_CONNECTION_BAD_IMAP_CREDENTIAL;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return NETWORK_CONNECTION_AUTH_UNKNOWN_DEVICE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return NETWORK_CONNECTION_AUTH_INVALID_PASSWORD;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return NETWORK_CONNECTION_AUTH_MAILBOX_NOT_INITIALIZED;
            case 15:
                return NETWORK_CONNECTION_AUTH_SERVICE_NOT_PROVISIONED;
            case 16:
                return NETWORK_CONNECTION_AUTH_SERVICE_NOT_ACTIVATED;
            case 17:
                return NETWORK_CONNECTION_AUTH_USER_IS_BLOCKED;
            case 18:
                return NETWORK_CONNECTION_REJECTED_SERVER_RESPONSE;
            case 19:
                return NETWORK_CONNECTION_INVALID_INITIAL_SERVER_RESPONSE;
            case 20:
                return NETWORK_CONNECTION_IOE_ON_OPEN;
            case 21:
                return NETWORK_CONNECTION_MAILBOX_OPEN_FAILED;
            case 23:
                return NETWORK_CONNECTION_GENERIC_IMAP_IOE;
            case 24:
                return NETWORK_CONNECTION_SSL_EXCEPTION;
            case 25:
                return NETWORK_CONNECTION_CELL_SIGNAL_LOST;
            case 26:
                return SYNC_ERROR_INBOX_FULL;
            case 27:
                return SMS_SERVER_NOT_RESPONDING;
            case 28:
                return FAILED_SENDING_SMS_TO_SMS_SERVER;
            case 30:
                return VOICE_MESSAGING_GATEWAY_CONNECTION_FAILED;
            case 31:
                return SELF_PROVISIONING_GATEWAY_CONNECTION_FAILED;
            case 32:
                return PIN_NOT_SET;
            case 33:
                return NO_RECEIVE_SMS_PERMISSION;
            case 34:
                return EXISTING_SMS_IS_PROCESSING;
            case 35:
                return SYNC_ERROR_INBOX_ALMOST_FULL;
            case 36:
                return SENDING_SMS_TO_SMS_SERVER_TIMED_OUT;
            case 37:
                return SENDING_SMS_TO_SMS_SERVER_CANCELLED;
            case 38:
                return SENDING_SMS_TO_SMS_SERVER_RIL_GENERIC_ERROR;
            case 39:
                return SENDING_SMS_TO_SMS_SERVER_FAIL_RETRY;
            case 40:
                return SENDING_SMS_TO_SMS_SERVER_GENERIC_FAILURE;
            case 41:
                return SENDING_SMS_TO_SMS_SERVER_NO_SERVICE;
            case 42:
                return SENDING_SMS_TO_SMS_SERVER_RIL_MODEM_ERR;
            case 43:
                return PROVISION_ERROR_SUBSCRIBER_STATUS;
            case 44:
                return PROVISION_CHECK_STATUS_NOT_READY;
            case 45:
                return SENDING_SMS_TO_SMS_SERVER_ERROR_RADIO_OFF;
            case 46:
                return SENDING_SMS_TO_SMS_SERVER_ERROR_NULL_PDU;
            case 47:
                return SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_ERR;
            case 48:
                return SENDING_SMS_TO_SMS_SERVER_MODEM_ERROR;
            case 49:
                return SENDING_SMS_TO_SMS_SERVER_NETWORK_ERROR;
            case 50:
                return SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_REJECT;
            case 51:
                return SENDING_SMS_TO_SMS_SERVER_RIL_NETWORK_NOT_READY;
            case 52:
                return SENDING_SMS_TO_SMS_SERVER_RIL_ACCESS_BARRED;
            case 53:
                return PROVISION_NOT_REQUIRED;
            case 54:
                return PROVISION_NEED_TO_DISABLE_VVM;
            case 55:
                return PROVISION_GENERIC_FAILURE;
            case 56:
                return VOICE_MESSAGING_GATEWAY_URL_UNKNOWN;
            case 57:
                return EMPTY_VOICEMAIL_PAYLOAD;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.ad;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.ad);
    }
}
