package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amos implements alai {
    private final /* synthetic */ int $cid;
    static final alai u = new defpackage.amos(20);
    static final alai t = new defpackage.amos(19);
    static final alai s = new defpackage.amos(18);
    static final alai r = new defpackage.amos(17);
    static final alai q = new defpackage.amos(16);
    static final alai p = new defpackage.amos(15);
    static final alai o = new defpackage.amos(14);
    static final alai n = new defpackage.amos(13);
    static final alai m = new defpackage.amos(12);
    static final alai l = new defpackage.amos(11);
    static final alai k = new defpackage.amos(10);
    static final alai j = new defpackage.amos(9);
    static final alai i = new defpackage.amos(8);
    static final alai h = new defpackage.amos(7);
    static final alai g = new defpackage.amos(6);
    static final alai f = new defpackage.amos(5);
    static final alai e = new defpackage.amos(4);
    static final alai d = new defpackage.amos(3);
    public static final alai c = new defpackage.amos(2);
    static final alai b = new defpackage.amos(1);
    static final alai a = new defpackage.amos(0);

    private amos(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        java.lang.Enum r2 = null;
        switch (this.$cid) {
            case 0:
                switch (i2) {
                    case 0:
                        r2 = defpackage.amot.NONE;
                        break;
                    case 1:
                        r2 = defpackage.amot.GLOBAL_SPAM_LIST;
                        break;
                    case 2:
                        r2 = defpackage.amot.LOCAL_SPAM_LIST;
                        break;
                    case 3:
                        r2 = defpackage.amot.LOCAL_WHITELIST;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r2 = defpackage.amot.SAME_PREFIX;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r2 = defpackage.amot.GCORE_SPAM;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r2 = defpackage.amot.GCORE_SPOOF;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r2 = defpackage.amot.GCORE_STIR_SHAKEN_FAILED;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        r2 = defpackage.amot.DIALER_STIR_SHAKER_VERIFIED;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        r2 = defpackage.amot.PATRONUS_SPAM;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 1:
                if (i2 == 0) {
                    r2 = defpackage.amor.UNDEFINED;
                } else if (i2 == 1) {
                    r2 = defpackage.amor.NEVER_VIBRATE;
                } else if (i2 == 2) {
                    r2 = defpackage.amor.ALWAYS_VIBRATE;
                } else if (i2 == 3) {
                    r2 = defpackage.amor.RAMPING_RINGER;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 2:
                if (defpackage.ampc.b(i2) == null) {
                    return false;
                }
                break;
            case 3:
                if (defpackage.ampe.b(i2) == null) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                if (i2 == 0) {
                    r2 = defpackage.ampm.UNKNOWN;
                } else if (i2 == 1) {
                    r2 = defpackage.ampm.VERIFIED;
                } else if (i2 == 2) {
                    r2 = defpackage.ampm.SPOOF;
                } else if (i2 == 3) {
                    r2 = defpackage.ampm.NOT_SURE;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return a.ax(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return a.aF(i2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
            case 18:
            case 19:
                return a.aw(i2);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                if (amqd.b(i2) == null) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
            default:
                return a.av(i2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                if (i2 == 0) {
                    r2 = defpackage.amql.ENROLLMENT_STATUS_UNKNOWN;
                } else if (i2 == 1) {
                    r2 = defpackage.amql.ENROLLMENT_STATUS_MANUAL_OPTED_OUT;
                } else if (i2 == 2) {
                    r2 = defpackage.amql.ENROLLMENT_STATUS_MANUAL_OPTED_IN;
                } else if (i2 == 3) {
                    r2 = defpackage.amql.ENROLLMENT_STATUS_OPTED_OUT_FROM_OUT_OF_DATE_MESSAGE_APP;
                } else if (i2 == 4) {
                    r2 = defpackage.amql.ENROLLMENT_STATUS_OPTED_IN_FROM_UPGRADED_MESSAGE_APP;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                if (i2 == 0) {
                    r2 = defpackage.amqs.UNSPECIFIED;
                } else if (i2 == 1) {
                    r2 = defpackage.amqs.DO_NOT_DISTURB;
                } else if (i2 == 2) {
                    r2 = defpackage.amqs.SILENT_AND_NO_VIBRATE;
                } else if (i2 == 3) {
                    r2 = defpackage.amqs.SILENCED_BY_COMPANION_APP;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                if (i2 == 0) {
                    r2 = defpackage.amqu.NO_CC_SHOWN;
                } else if (i2 == 1) {
                    r2 = defpackage.amqu.MY_CALLING_CARD;
                } else if (i2 == 2) {
                    r2 = defpackage.amqu.CONTACT_CALLING_CARD;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                if (a.ag(i2) == 0) {
                    return false;
                }
                break;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                if (defpackage.amqw.b(i2) == null) {
                    return false;
                }
                break;
            case 15:
                switch (i2) {
                    case 0:
                        r2 = defpackage.amrc.OUTCOME_UNSPECIFIED;
                        break;
                    case 1:
                        r2 = defpackage.amrc.CALL_AUTO_REJECTED;
                        break;
                    case 2:
                        r2 = defpackage.amrc.CALLER_DISCONNECTED;
                        break;
                    case 3:
                        r2 = defpackage.amrc.REVELIO_VOICEMAIL_TIMED_OUT;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r2 = defpackage.amrc.CALL_ACCEPTED_BY_USER;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r2 = defpackage.amrc.CALL_REJECTED_BY_USER;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r2 = defpackage.amrc.MORE_INFO_REQUESTED_BY_USER;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r2 = defpackage.amrc.REJECT_WITH_SMS_REQUESTED_FROM_INCOMING_CALL_SCREEN;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 16:
                if (i2 == 0) {
                    r2 = defpackage.amrg.SEARCH_DATA_SOURCE_UNKNOWN;
                } else if (i2 == 1) {
                    r2 = defpackage.amrg.SEARCH_DATA_SOURCE_SMARTDIAL_TABLE;
                } else if (i2 == 2) {
                    r2 = defpackage.amrg.SEARCH_DATA_SOURCE_CONTACT_RETRIEVER;
                } else if (i2 == 3) {
                    r2 = defpackage.amrg.SEARCH_DATA_SOURCE_APP_SEARCH;
                }
                if (r2 == null) {
                    return false;
                }
                break;
            case 17:
                switch (i2) {
                    case 0:
                        r2 = defpackage.amrk.SODA_ERROR_UNKNOWN;
                        break;
                    case 1:
                        r2 = defpackage.amrk.SODA_ERROR_LANGUAGE_UNAVAILABLE;
                        break;
                    case 2:
                        r2 = defpackage.amrk.SODA_ERROR_INTERRUPTED;
                        break;
                    case 3:
                        r2 = defpackage.amrk.SODA_ERROR_AUDIO;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r2 = defpackage.amrk.SODA_ERROR_CLIENT;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r2 = defpackage.amrk.SODA_ERROR_INSUFFICIENT_PERMISSIONS;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r2 = defpackage.amrk.SODA_ERROR_SERVER;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r2 = defpackage.amrk.SODA_ERROR_NETWORK;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        r2 = defpackage.amrk.SODA_ERROR_NETWORK_TIMEOUT;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        r2 = defpackage.amrk.SODA_ERROR_NO_MATCH;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        r2 = defpackage.amrk.SODA_ERROR_RECOGNIZER_BUSY;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        r2 = defpackage.amrk.SODA_ERROR_SPEECH_TIMEOUT;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        r2 = defpackage.amrk.SODA_ERROR_GRPC_UNIMPLEMENTED;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        r2 = defpackage.amrk.SODA_ERROR_GRPC_PERMISSION_DENIED;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        r2 = defpackage.amrk.SODA_ERROR_GRPC_UNAVAILABLE;
                        break;
                    case 15:
                        r2 = defpackage.amrk.SODA_ERROR_GRPC_CANCELLED;
                        break;
                    case 16:
                        r2 = defpackage.amrk.SODA_ERROR_GRPC_INTERNAL;
                        break;
                    case 17:
                        r2 = defpackage.amrk.SODA_ERROR_GRPC_UNKNOWN;
                        break;
                    case 18:
                        r2 = defpackage.amrk.SODA_ERROR_INVALID_REQUEST;
                        break;
                    case 19:
                        r2 = defpackage.amrk.SODA_ERROR_NO_SPEECH_DETECTED;
                        break;
                    case 20:
                        r2 = defpackage.amrk.SODA_ERROR_MIC_BUSY;
                        break;
                    case 21:
                        r2 = defpackage.amrk.SODA_ERROR_AUDIO_BUFFER_OVERFLOW;
                        break;
                    case 22:
                        r2 = defpackage.amrk.SODA_ERROR_SODA;
                        break;
                    case 23:
                        r2 = defpackage.amrk.SODA_ERROR_CANCELLED;
                        break;
                    case 24:
                        r2 = defpackage.amrk.SODA_ERROR_AICORE_NOT_ENABLED_RUNTIME_LIMITS;
                        break;
                    case 25:
                        r2 = defpackage.amrk.SODA_ERROR_AICORE_APP_QUOTA;
                        break;
                }
                if (r2 == null) {
                    return false;
                }
                break;
        }
        return true;
    }
}
