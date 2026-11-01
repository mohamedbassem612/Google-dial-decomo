package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amrx implements alai {
    private final /* synthetic */ int $cid;
    public static final alai u = new defpackage.amrx(20);
    public static final alai t = new defpackage.amrx(19);
    public static final alai s = new defpackage.amrx(18);
    static final alai r = new defpackage.amrx(17);
    static final alai q = new defpackage.amrx(16);
    static final alai p = new defpackage.amrx(15);
    static final alai o = new defpackage.amrx(14);
    static final alai n = new defpackage.amrx(13);
    static final alai m = new defpackage.amrx(12);
    static final alai l = new defpackage.amrx(11);
    static final alai k = new defpackage.amrx(10);
    static final alai j = new defpackage.amrx(9);
    static final alai i = new defpackage.amrx(8);
    static final alai h = new defpackage.amrx(7);
    static final alai g = new defpackage.amrx(6);
    static final alai f = new defpackage.amrx(5);
    static final alai e = new defpackage.amrx(4);
    static final alai d = new defpackage.amrx(3);
    static final alai c = new defpackage.amrx(2);
    static final alai b = new defpackage.amrx(1);
    static final alai a = new defpackage.amrx(0);

    private amrx(int i2) {
        this.$cid = i2;
    }

    public final boolean a(int i2) {
        java.lang.Enum r1 = null;
        switch (this.$cid) {
            case 0:
                return a.ax(i2);
            case 1:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return a.av(i2);
            case 2:
                return defpackage.amsb.b(i2) != null;
            case 3:
                if (i2 == 0) {
                    r1 = defpackage.amsd.UNKNOWN_REQUEST_TYPE;
                } else if (i2 == 1) {
                    r1 = defpackage.amsd.INCOMING_REQUEST_TYPE;
                } else if (i2 == 2) {
                    r1 = defpackage.amsd.OUTGOING_REQUEST_TYPE;
                }
                return r1 != null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                if (i2 != 100) {
                    switch (i2) {
                        case 0:
                            r1 = defpackage.amsh.UNKNOWN_CLIENT_TYPE;
                            break;
                        case 1:
                            r1 = defpackage.amsh.TMO_REST;
                            break;
                        case 2:
                            r1 = defpackage.amsh.TMO_CVVM_OMTP;
                            break;
                        case 3:
                            r1 = defpackage.amsh.OMTP_1_1;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            r1 = defpackage.amsh.OMTP_1_2;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            r1 = defpackage.amsh.OMTP_1_3;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            r1 = defpackage.amsh.ADVVM;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            r1 = defpackage.amsh.VVM3;
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            r1 = defpackage.amsh.VVM3_MVNO;
                            break;
                    }
                } else {
                    r1 = defpackage.amsh.TEST_CLIENT_TYPE;
                }
                return r1 != null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    case 15:
                    case 16:
                        return true;
                    default:
                        return false;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        return true;
                    default:
                        return false;
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return a.aX(i2) != 0;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return a.ay(i2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return a.aC(i2);
            case 15:
                switch (i2) {
                    case 0:
                        r1 = defpackage.amsr.FAILURE_REASON_UNSPECIFIED;
                        break;
                    case 1:
                        r1 = defpackage.amsr.NETWORK_ERROR;
                        break;
                    case 2:
                        r1 = defpackage.amsr.INTERNAL_ERROR;
                        break;
                    case 3:
                        r1 = defpackage.amsr.TIMEOUT;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r1 = defpackage.amsr.API_NOT_CONNECTED;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r1 = defpackage.amsr.OTHER;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r1 = defpackage.amsr.ERROR;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r1 = defpackage.amsr.NODE_ID_IS_NULL;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        r1 = defpackage.amsr.UNSUPPORTED_API_CALL;
                        break;
                }
                return r1 != null;
            case 16:
                switch (i2) {
                    case 0:
                        r1 = defpackage.amth.UNKNOWN_ENROLLMENT_STATUS;
                        break;
                    case 1:
                        r1 = defpackage.amth.USER_OPTED_OUT;
                        break;
                    case 3:
                        r1 = defpackage.amth.UNSUPPORTED_NUMBER;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r1 = defpackage.amth.SCREEN_READER_ENABLED;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r1 = defpackage.amth.MORE_THAN_ONE_ONGOING_CALL;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r1 = defpackage.amth.NOT_AN_OUTGOING_CALL;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r1 = defpackage.amth.PIPELINE_RUNNER_PRECONDITION_CHECK_FAILED;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        r1 = defpackage.amth.HEDWIG_ACTIVE;
                        break;
                }
                return r1 != null;
            case 17:
                switch (i2) {
                    case 0:
                        r1 = defpackage.amtj.UNKNOWN_RESULT;
                        break;
                    case 1:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_SUCCEEDED;
                        break;
                    case 2:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILED;
                        break;
                    case 3:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_STOP_SUCCEEDED;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_STOP_FAILED;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_UNKNOWN;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_PRECONDITIONS_NOT_SATISFIED;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_MODELS_FAILED_TO_START;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_CALL_AUDIO_READER_FAILED_TO_START;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_APPLYING_AUDIO_CONFIG;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_START_FAILURE_NO_SESSION_RESERVATION;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_RESERVE_FAILURE_UNKNOWN;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_RESERVE_FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION;
                        break;
                    case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_RESERVE_FAILURE_INCOMPATIBLE_CLIENT_IN_SESSION;
                        break;
                    case 15:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_CALL_PRECONDITIONS_NOT_SATISFIED;
                        break;
                    case 16:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_MODELS_NOT_AVAILABLE;
                        break;
                    case 17:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_UPLINK_REQUESTED_WHEN_DUOLINKS_UNAVAILABLE;
                        break;
                    case 18:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_LOCALE_MISMATCH;
                        break;
                    case 19:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_DEVICE_EXCEEDS_THERMAL_THRESHOLD;
                        break;
                    case 20:
                        r1 = defpackage.amtj.PIPELINE_RUNNER_PRECONDITION_FAILURE_UNKNOWN;
                        break;
                }
                return r1 != null;
            case 18:
                if (i2 == 0) {
                    r1 = defpackage.amtq.UNKNOWN;
                } else if (i2 == 1) {
                    r1 = defpackage.amtq.SHARPIE_SCAM_DETECTED;
                }
                return r1 != null;
            case 19:
                if (i2 == 0) {
                    r1 = defpackage.amts.EXPRESSO_NOT_SET;
                } else if (i2 == 1) {
                    r1 = defpackage.amts.EXPRESSO_URGENT_CLICKED;
                } else if (i2 == 2) {
                    r1 = defpackage.amts.EXPRESSO_QUESTION_CLICKED;
                } else if (i2 == 3) {
                    r1 = defpackage.amts.EXPRESSO_CATCH_UP_CLICKED;
                } else if (i2 == 4) {
                    r1 = defpackage.amts.EXPRESSO_NEWS_CLICKED;
                }
                return r1 != null;
            default:
                switch (i2) {
                    case 0:
                        r1 = defpackage.amtu.SONIC_NOT_SET;
                        break;
                    case 1:
                        r1 = defpackage.amtu.SONIC_HEART_CLICKED;
                        break;
                    case 2:
                        r1 = defpackage.amtu.SONIC_DRUMROLL_CLICKED;
                        break;
                    case 3:
                        r1 = defpackage.amtu.SONIC_POOP_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        r1 = defpackage.amtu.SONIC_PARTY_POPPER_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        r1 = defpackage.amtu.SONIC_CRY_LAUGH_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        r1 = defpackage.amtu.SONIC_APPLAUSE_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        r1 = defpackage.amtu.SONIC_SAD_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        r1 = defpackage.amtu.SONIC_HALLOWEEN_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        r1 = defpackage.amtu.SONIC_CHRISTMAS_CLICKED;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        r1 = defpackage.amtu.SONIC_NEW_YEAR_CLICKED;
                        break;
                }
                return r1 != null;
        }
    }
}
