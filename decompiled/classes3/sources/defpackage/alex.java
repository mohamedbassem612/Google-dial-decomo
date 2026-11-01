package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum alex implements alah {
    UNKNOWN_VALUE(0),
    ATLAS_UI_HFM_BUTTON_SHOWN(1),
    ATLAS_CALL_CONNECT(2),
    ATLAS_SERVICE_ACTIVATION(3),
    ATLAS_DETECTOR_START(5),
    ATLAS_START_DUPLEX_CONVERSATION(6),
    ATLAS_START_INPUT_AUDIO_TO_DUPLEX(7),
    DUPLEX_SUGGEST_OFFHOLD(8),
    DUPLEX_IVR_DETECTED(9),
    USER_CLICK_HFM_BUTTON(11),
    ATLAS_UI_OFFHOLD_CONFIRMATION_DIALOG(12),
    USER_OFFHOLD_CONFIRMATION_DIALOG_CONFIRM(13),
    USER_OFFHOLD_CONFIRMATION_DIALOG_CANCEL(14),
    ATLAS_END_DUPLEX_CONVERSATION(15),
    ATLAS_DETECTOR_FINISH(16),
    ATLAS_USE_OFFHOLD_MODE(17),
    DUPLEX_PLAYING_PROBING_AUDIO(18),
    ATLAS_FINISH_PLAYING_PROBING_AUDIO(19),
    ATLAS_UI_IVR_SAVE(20),
    USER_CLICK_RETURN_CALL_BUTTON_WHEN_IVR_SAVE(21),
    DUPLEX_NOTIFY_USER(22),
    ATLAS_START_PLAYING_DISCLOSURE_AUDIO(23),
    ATLAS_FINISH_PLAYING_DISCLOSURE_AUDIO(24),
    ATLAS_UI_NOTIFYING(25),
    ATLAS_START_RINGING(26),
    USER_CLICK_RETURN_CALL_BUTTON_WHEN_AGENT_READY(27),
    USER_CLICK_CANCEL_OFFHOLD_DETECTION(28),
    DUPLEX_DO_NOT_RECORD_CALL(29),
    ATLAS_DELETE_RECORD(30),
    USER_CLICK_DISCONNECTION_BUTTON(31),
    ATLAS_REMOTE_HANG_UP_CALL(32),
    ATLAS_AUDIO_ABSENT(33),
    ATLAS_EMPTY_AUDIO(35),
    DUPLEX_RUN_RECOGNITION_ERROR(36),
    ATLAS_PSTN_MODE(37),
    ATLAS_VOIP_MODE(38),
    DUPLEX_AUDIO_ERROR(39),
    ATLAS_AUDIO_FORMAT_CHANGED(40),
    ATLAS_UI_AUDIO_ERROR(41),
    USER_STOP_ATLAS_SERVICE(42),
    ATLAS_STOP_ITSELF(43),
    USER_HANG_UP_CALL(44),
    ATLAS_IGNORE_IVR_ALERT_EVENT(45),
    USER_CLICK_RETURN_TO_CALL_BUTTON_WHEN_AUDIO_ERROR(46),
    ATLAS_RECEIVE_TELEPHONY_HOLD(47),
    ATLAS_UNMUTE_CALL_AUDIO(48),
    ATLAS_RECOVERED_SERVICE(49),
    USER_CLICK_DTMF(50),
    ATLAS_FAILED_TO_START_OFF_HOLD_DETECTION(51),
    ATLAS_UI_UNSPECIFIED_ERROR(52),
    USER_CLICK_RETURN_TO_CALL_BUTTON_ON_UNSPECIFIED_ERROR(53),
    ATLAS_GREETING_TO_AGENT_PLAYBACK_TIMEOUT(54),
    ATLAS_DID_NOT_FIND_DUPLEX_MODEL(55),
    ATLAS_METRICS_COLLECTION_TIMEOUT(56),
    DUPLEX_UNKNOWN_ERROR(57),
    DUPLEX_RECOGNIZER_STATUS_INITIALIZATION_ERROR(58),
    DUPLEX_RECOGNIZER_STATUS_STREAM_BROKEN(59),
    DUPLEX_INVALID_INPUT_FORMAT(60),
    DUPLEX_START_CALLED_WHILE_IN_PROGRESS(61),
    DUPLEX_SPECS_LOADING_FAILURE(62),
    DUPLEX_CALLBACK_HANDLING_FAILURE(63),
    ATLAS_TOO_MANY_MISSING_BYTES(64),
    USER_SWITCH_FROM_BLUETOOTH_TO_EARPIECE(65),
    USER_DISMISS_BLUETOOTH_DIALOG(66),
    ATLAS_ASR_QUEUE_BLOCKED(67),
    DUPLEX_START_CALLED_BEFORE_INITIALIZATION(68),
    ATLAS_FAILED_TO_UNMUTE_CALL(69),
    ATLAS_UI_READY(70),
    ATLAS_VOIP_AUDIO_INJECTED_TO_FI_VOICE_LIB(71),
    ATLAS_SHUTDOWN_DETECTOR(72),
    ATLAS_CALL_QUALITY_CHANGED(73),
    ATLAS_TELEPHONY_CONFERENCE_CALL(74),
    ATLAS_CALL_REMOTELY_HELD(75),
    ATLAS_FAILED_TO_UNZIP_DUPLEX_MODEL(76),
    ATLAS_INJECT_PROBING_AUDIO(77),
    ATLAS_START_PLAYING_PROBING_AUDIO(78),
    ATLAS_INJECT_DISCLOSURE_AUDIO(79),
    ATLAS_SHOW_CONNECTING_COUNTDOWN(80),
    ATLAS_ERROR_DISCONNECT_CALL(81),
    ATLAS_GREETING_TO_AGENT_PLAYBACK_FAILED(82),
    ATLAS_UI_NOTIFYING_IN_MULTI_WINDOW(83),
    ATLAS_UI_SHOW_DND_DIALOG(84),
    ATLAS_UI_SHOW_BLUETOOTH_DIALOG(85),
    ATLAS_USE_TIDEPODS_INTERNALS(86),
    ATLAS_USE_LEGACY_INTERNALS(87),
    CORE_INFRA_FATAL_FAILURE(88);

    public final int aI;

    alex(int i) {
        this.aI = i;
    }

    public static defpackage.alex b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_VALUE;
            case 1:
                return ATLAS_UI_HFM_BUTTON_SHOWN;
            case 2:
                return ATLAS_CALL_CONNECT;
            case 3:
                return ATLAS_SERVICE_ACTIVATION;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
            case 34:
            default:
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ATLAS_DETECTOR_START;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ATLAS_START_DUPLEX_CONVERSATION;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ATLAS_START_INPUT_AUDIO_TO_DUPLEX;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return DUPLEX_SUGGEST_OFFHOLD;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return DUPLEX_IVR_DETECTED;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return USER_CLICK_HFM_BUTTON;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ATLAS_UI_OFFHOLD_CONFIRMATION_DIALOG;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return USER_OFFHOLD_CONFIRMATION_DIALOG_CONFIRM;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return USER_OFFHOLD_CONFIRMATION_DIALOG_CANCEL;
            case 15:
                return ATLAS_END_DUPLEX_CONVERSATION;
            case 16:
                return ATLAS_DETECTOR_FINISH;
            case 17:
                return ATLAS_USE_OFFHOLD_MODE;
            case 18:
                return DUPLEX_PLAYING_PROBING_AUDIO;
            case 19:
                return ATLAS_FINISH_PLAYING_PROBING_AUDIO;
            case 20:
                return ATLAS_UI_IVR_SAVE;
            case 21:
                return USER_CLICK_RETURN_CALL_BUTTON_WHEN_IVR_SAVE;
            case 22:
                return DUPLEX_NOTIFY_USER;
            case 23:
                return ATLAS_START_PLAYING_DISCLOSURE_AUDIO;
            case 24:
                return ATLAS_FINISH_PLAYING_DISCLOSURE_AUDIO;
            case 25:
                return ATLAS_UI_NOTIFYING;
            case 26:
                return ATLAS_START_RINGING;
            case 27:
                return USER_CLICK_RETURN_CALL_BUTTON_WHEN_AGENT_READY;
            case 28:
                return USER_CLICK_CANCEL_OFFHOLD_DETECTION;
            case 29:
                return DUPLEX_DO_NOT_RECORD_CALL;
            case 30:
                return ATLAS_DELETE_RECORD;
            case 31:
                return USER_CLICK_DISCONNECTION_BUTTON;
            case 32:
                return ATLAS_REMOTE_HANG_UP_CALL;
            case 33:
                return ATLAS_AUDIO_ABSENT;
            case 35:
                return ATLAS_EMPTY_AUDIO;
            case 36:
                return DUPLEX_RUN_RECOGNITION_ERROR;
            case 37:
                return ATLAS_PSTN_MODE;
            case 38:
                return ATLAS_VOIP_MODE;
            case 39:
                return DUPLEX_AUDIO_ERROR;
            case 40:
                return ATLAS_AUDIO_FORMAT_CHANGED;
            case 41:
                return ATLAS_UI_AUDIO_ERROR;
            case 42:
                return USER_STOP_ATLAS_SERVICE;
            case 43:
                return ATLAS_STOP_ITSELF;
            case 44:
                return USER_HANG_UP_CALL;
            case 45:
                return ATLAS_IGNORE_IVR_ALERT_EVENT;
            case 46:
                return USER_CLICK_RETURN_TO_CALL_BUTTON_WHEN_AUDIO_ERROR;
            case 47:
                return ATLAS_RECEIVE_TELEPHONY_HOLD;
            case 48:
                return ATLAS_UNMUTE_CALL_AUDIO;
            case 49:
                return ATLAS_RECOVERED_SERVICE;
            case 50:
                return USER_CLICK_DTMF;
            case 51:
                return ATLAS_FAILED_TO_START_OFF_HOLD_DETECTION;
            case 52:
                return ATLAS_UI_UNSPECIFIED_ERROR;
            case 53:
                return USER_CLICK_RETURN_TO_CALL_BUTTON_ON_UNSPECIFIED_ERROR;
            case 54:
                return ATLAS_GREETING_TO_AGENT_PLAYBACK_TIMEOUT;
            case 55:
                return ATLAS_DID_NOT_FIND_DUPLEX_MODEL;
            case 56:
                return ATLAS_METRICS_COLLECTION_TIMEOUT;
            case 57:
                return DUPLEX_UNKNOWN_ERROR;
            case 58:
                return DUPLEX_RECOGNIZER_STATUS_INITIALIZATION_ERROR;
            case 59:
                return DUPLEX_RECOGNIZER_STATUS_STREAM_BROKEN;
            case 60:
                return DUPLEX_INVALID_INPUT_FORMAT;
            case 61:
                return DUPLEX_START_CALLED_WHILE_IN_PROGRESS;
            case 62:
                return DUPLEX_SPECS_LOADING_FAILURE;
            case 63:
                return DUPLEX_CALLBACK_HANDLING_FAILURE;
            case 64:
                return ATLAS_TOO_MANY_MISSING_BYTES;
            case 65:
                return USER_SWITCH_FROM_BLUETOOTH_TO_EARPIECE;
            case 66:
                return USER_DISMISS_BLUETOOTH_DIALOG;
            case 67:
                return ATLAS_ASR_QUEUE_BLOCKED;
            case 68:
                return DUPLEX_START_CALLED_BEFORE_INITIALIZATION;
            case 69:
                return ATLAS_FAILED_TO_UNMUTE_CALL;
            case 70:
                return ATLAS_UI_READY;
            case 71:
                return ATLAS_VOIP_AUDIO_INJECTED_TO_FI_VOICE_LIB;
            case 72:
                return ATLAS_SHUTDOWN_DETECTOR;
            case 73:
                return ATLAS_CALL_QUALITY_CHANGED;
            case 74:
                return ATLAS_TELEPHONY_CONFERENCE_CALL;
            case 75:
                return ATLAS_CALL_REMOTELY_HELD;
            case 76:
                return ATLAS_FAILED_TO_UNZIP_DUPLEX_MODEL;
            case 77:
                return ATLAS_INJECT_PROBING_AUDIO;
            case 78:
                return ATLAS_START_PLAYING_PROBING_AUDIO;
            case 79:
                return ATLAS_INJECT_DISCLOSURE_AUDIO;
            case 80:
                return ATLAS_SHOW_CONNECTING_COUNTDOWN;
            case 81:
                return ATLAS_ERROR_DISCONNECT_CALL;
            case 82:
                return ATLAS_GREETING_TO_AGENT_PLAYBACK_FAILED;
            case 83:
                return ATLAS_UI_NOTIFYING_IN_MULTI_WINDOW;
            case 84:
                return ATLAS_UI_SHOW_DND_DIALOG;
            case 85:
                return ATLAS_UI_SHOW_BLUETOOTH_DIALOG;
            case 86:
                return ATLAS_USE_TIDEPODS_INTERNALS;
            case 87:
                return ATLAS_USE_LEGACY_INTERNALS;
            case 88:
                return CORE_INFRA_FATAL_FAILURE;
        }
    }

    public final int a() {
        return this.aI;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.aI);
    }
}
