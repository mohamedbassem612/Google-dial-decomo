package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nvp implements alah {
    EVENT_UNKNOWN(0),
    EVENT_DOBBY_SESSION_STARTED(1),
    EVENT_DOBBY_READY_FOR_MANUAL_SCREENING(2),
    EVENT_DOBBY_START_AUTO_SCREENING(3),
    EVENT_DOBBY_START_MANUAL_SCREENING(4),
    EVENT_DOBBY_START_RINGING_DURING_ACTIVE_SESSION(5),
    EVENT_DOBBY_START_RINGING_DURING_NOT_ACTIVE_SESSION(6),
    EVENT_DOBBY_START_TAKING_MESSAGE(7),
    EVENT_DOBBY_START_FOREGROUND_DECLINING(8),
    EVENT_DOBBY_START_BACKGROUND_DECLINING(9),
    EVENT_DOBBY_ANSWER(10),
    EVENT_DOBBY_REQUEST_DECLINE(11),
    EVENT_DOBBY_RINGING_TIMEOUT(12),
    EVENT_DOBBY_STARTED_PLAYING_RECORDING(13),
    EVENT_DOBBY_STARTED_PLAYING_DIAL_TONE(14),
    EVENT_DOBBY_STOPPED_PLAYING_RECORDING_OR_DIAL_TONE(15),
    EVENT_DUPLEX_REQUEST_PLAYING_RECORDING(16),
    EVENT_DUPLEX_CALL_ACTION_END_CALL(17),
    EVENT_DUPLEX_CALL_ACTION_END_SPAM_CALL(18),
    EVENT_DUPLEX_CALL_ACTION_START_RINGING(19),
    EVENT_DUPLEX_CALL_ACTION_ANSWER_CALL(20),
    EVENT_DUPLEX_NOTIFY_TRANSCRIPTION_SUMMARY(21),
    EVENT_DOBBY_SODA_ERROR(22),
    EVENT_SODA_CALLER_START_SPEAKING(23),
    EVENT_DOBBY_PRECONDITIONS_NOT_MET(24),
    EVENT_DOBBY_AUDIO_PRISM_SESSION_START_FAILS(25),
    EVENT_DOBBY_RELAY_TO_DUPLEX_BOT_SPEECH_STARTED(26),
    EVENT_DOBBY_RELAY_TO_DUPLEX_BOT_SPEECH_ENDED(27),
    EVENT_DOBBY_RELAY_TO_DUPLEX_SUGGESTED_REPLY_SELECTED(28),
    EVENT_DOBBY_RELAY_TO_DUPLEX_MANUAL_END_CALL(29),
    EVENT_DOBBY_RELAY_TO_DUPLEX_MANUAL_ANSWER_CALL(30),
    EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_STARTED(31),
    EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_ANSWERED(32),
    EVENT_SODA_CALLER_STOP_SPEAKING(33),
    EVENT_DOBBY_CALL_DISCONNECTED_BY_CALLER(34),
    EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_NOT_REACHED(35),
    EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_DECLINED(36),
    EVENT_USER_ANSWER_SCREEN_ACTION_ANSWER_CALL(37),
    EVENT_USER_ANSWER_SCREEN_ACTION_REJECT_CALL(38),
    EVENT_USER_ANSWER_SCREEN_ACTION_SCREEN_CALL(39),
    EVENT_DUPLEX_ERROR(40),
    EVENT_USER_NOTIFICATION_ANSWER_CALL_BUTTON_CLICKED(41),
    EVENT_USER_NOTIFICATION_REJECT_CALL_BUTTON_CLICKED(42),
    EVENT_USER_NOTIFICATION_SCREEN_CALL_BUTTON_CLICKED(43),
    EVENT_USER_MANUAL_SCREENING_ANSWER_CALL_BUTTON_CLICKED(44),
    EVENT_USER_MANUAL_SCREENING_REJECT_CALL_BUTTON_CLICKED(45),
    EVENT_USER_MANUAL_SCREENING_SUGGESTED_REPLY_CHIP_CLICKED(46),
    EVENT_USER_MANUAL_SCREENING_REPORT_SPAM_CLICKED(47),
    EVENT_DUPLEX_CALL_ACTION_END_MISSED_CALL(48),
    EVENT_DOBBY_FALLBACK_END_SPAM_CALL(49),
    EVENT_DOBBY_PLAY_RECORDING_ERROR(50),
    EVENT_DOBBY_FALLBACK_DUE_TO_ERROR(51),
    EVENT_DUPLEX_CALL_ACTION_START_TAKING_MESSAGE(52),
    EVENT_DUPLEX_ROBOCALL_DETECTED(53),
    EVENT_DUPLEX_POST_SCREENING_QUICK_REPLY_CHIPS_RECEIVED(54),
    EVENT_USER_POST_SCREENING_QUICK_REPLY_CHIP_CLICKED(55),
    EVENT_USER_ANSWER_SCREEN_ACTION_ASK_IF_URGENT(56),
    EVENT_USER_NOTIFICATION_ASK_IF_URGENT_BUTTON_CLICKED(57),
    EVENT_USER_NOTIFICATION_ASK_IF_URGENT_BUTTON_PRODUCED(58),
    EVENT_USER_NOTIFICATION_SCREEN_CALL_BUTTON_PRODUCED(59),
    EVENT_USER_ANSWER_SCREEN_ASK_IF_URGENT_BUTTON_PRODUCED(60),
    EVENT_USER_ANSWER_SCREEN_SCREEN_CALL_BUTTON_PRODUCED(61),
    EVENT_DOBBY_CALL_DISCONNECTED(62),
    EVENT_DUPLEX_AUDIO_MATCH_DETECTED(63),
    EVENT_USER_ANSWER_SCREEN_ACTION_IN_PUBLIC(64),
    EVENT_DOBBY_START_BAM_FROM_WEAR_RECEIVED(68),
    EVENT_DOBBY_START_BAM(69),
    EVENT_BAM_CENTER_FRAGMENT_RESUMED(70),
    EVENT_BAM_CENTER_FRAGMENT_DATA_LOADED(71),
    EVENT_DOBBY_START_AUTO_SCREENING_WITH_UI(72),
    EVENT_DUPLEX_LLM_ACTIVE(73),
    EVENT_DUPLEX_LLM_FEATURE_DOWNLOADING(74),
    EVENT_DUPLEX_LLM_FEATURE_MISSING(75),
    EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED(76),
    EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED(77),
    EVENT_AI_REPLIES_SUGGESTION_CHIP_CLICKED(78),
    EVENT_AI_REPLIES_CONSENT_DIALOG_SHOWN(79),
    EVENT_AI_REPLIES_CONSENT_DIALOG_POSITIVE_BUTTON_CLICKED(80),
    EVENT_AI_REPLIES_CONSENT_DIALOG_NEGATIVE_BUTTON_CLICKED(81),
    EVENT_AI_REPLIES_CONSENT_DIALOG_DISMISSED(82),
    EVENT_DUPLEX_LLM_INFERENCE_REQUEST(83),
    EVENT_DUPLEX_LLM_CANCEL_INFERENCE_REQUEST(84),
    EVENT_DUPLEX_LLM_INFERENCE_SUCCESS(85),
    EVENT_DUPLEX_LLM_INFERENCE_SUCCESS_EMPTY(86),
    EVENT_DUPLEX_LLM_INFERENCE_FAILURE(87),
    EVENT_DOBBY_TTS_AVAILABLE(88),
    EVENT_DOBBY_TTS_UNAVAILABLE(89),
    EVENT_DUPLEX_EXTRACTION_SUCCESS(90),
    EVENT_DUPLEX_EXTRACTION_PARSING_FAILURE(91),
    EVENT_DUPLEX_EXTRACTION_LLM_INFERENCE_FAILURE(92),
    EVENT_DUPLEX_EXTRACTION_EMPTY_OUTPUT_FAILURE(93),
    EVENT_DUPLEX_LLM_FEATURE_AVAILABLE(94),
    EVENT_DOBBY_START_BEESLY(95),
    EVENT_BEESLY_FALLBACK_DUE_TO_ERROR(96),
    EVENT_BEESLY_FAIL_TO_START_SESSION(97),
    EVENT_DOBBY_START_BEESLY_WITH_UI(98),
    EVENT_DOBBY_LOGGING_SESSION_TIMEOUT(99),
    EVENT_DOBBY_USE_GEMINI_RUNNER_SELECTED(100),
    EVENT_DOBBY_CALL_SCOPE_REMOVED(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    EVENT_WINKY_STARTING_FROM_WEAR(102),
    EVENT_DOBBY_IGNORE_CALL_ACTION_BOT(103),
    EVENT_DOBBY_START_MANUAL_SCREENING_WITHOUT_UI(104),
    EVENT_DOBBY_TTS_SYNTHESIS_ERROR(105),
    EVENT_DOBBY_UPLINK_AUDIO_PLAYBACK_ERROR(106),
    EVENT_DOBBY_OPENING_DISCLOSURE_FAILED(107),
    EVENT_DOBBY_USE_GACS_SELECTED(108),
    EVENT_DOBBY_USE_GACS_MANUAL_SCREENING_SELECTED(109),
    EVENT_DOBBY_TTS_SYNTHESIS_TIMEOUT(110),
    EVENT_WINKY_STARTING_FROM_AUTO(111),
    EVENT_DOBBY_NOT_A_DOBBY_CALL(112);

    public final int bg;

    nvp(int i) {
        this.bg = i;
    }

    public static defpackage.nvp b(int i) {
        switch (i) {
            case 0:
                return EVENT_UNKNOWN;
            case 1:
                return EVENT_DOBBY_SESSION_STARTED;
            case 2:
                return EVENT_DOBBY_READY_FOR_MANUAL_SCREENING;
            case 3:
                return EVENT_DOBBY_START_AUTO_SCREENING;
            case 4:
                return EVENT_DOBBY_START_MANUAL_SCREENING;
            case 5:
                return EVENT_DOBBY_START_RINGING_DURING_ACTIVE_SESSION;
            case 6:
                return EVENT_DOBBY_START_RINGING_DURING_NOT_ACTIVE_SESSION;
            case 7:
                return EVENT_DOBBY_START_TAKING_MESSAGE;
            case 8:
                return EVENT_DOBBY_START_FOREGROUND_DECLINING;
            case 9:
                return EVENT_DOBBY_START_BACKGROUND_DECLINING;
            case 10:
                return EVENT_DOBBY_ANSWER;
            case 11:
                return EVENT_DOBBY_REQUEST_DECLINE;
            case 12:
                return EVENT_DOBBY_RINGING_TIMEOUT;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return EVENT_DOBBY_STARTED_PLAYING_RECORDING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return EVENT_DOBBY_STARTED_PLAYING_DIAL_TONE;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return EVENT_DOBBY_STOPPED_PLAYING_RECORDING_OR_DIAL_TONE;
            case 16:
                return EVENT_DUPLEX_REQUEST_PLAYING_RECORDING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return EVENT_DUPLEX_CALL_ACTION_END_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return EVENT_DUPLEX_CALL_ACTION_END_SPAM_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return EVENT_DUPLEX_CALL_ACTION_START_RINGING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return EVENT_DUPLEX_CALL_ACTION_ANSWER_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                return EVENT_DUPLEX_NOTIFY_TRANSCRIPTION_SUMMARY;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_RIGHT /* 22 */:
                return EVENT_DOBBY_SODA_ERROR;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_LEFT /* 23 */:
                return EVENT_SODA_CALLER_START_SPEAKING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return EVENT_DOBBY_PRECONDITIONS_NOT_MET;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_LEFT /* 25 */:
                return EVENT_DOBBY_AUDIO_PRISM_SESSION_START_FAILS;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_BOT_SPEECH_STARTED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_BOT_SPEECH_ENDED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_SUGGESTED_REPLY_SELECTED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_MANUAL_END_CALL;
            case 30:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_MANUAL_ANSWER_CALL;
            case 31:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_STARTED;
            case 32:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_ANSWERED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return EVENT_SODA_CALLER_STOP_SPEAKING;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return EVENT_DOBBY_CALL_DISCONNECTED_BY_CALLER;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_NOT_REACHED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                return EVENT_DOBBY_RELAY_TO_DUPLEX_RINGING_ENDED_DUE_TO_USER_DECLINED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT /* 37 */:
                return EVENT_USER_ANSWER_SCREEN_ACTION_ANSWER_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return EVENT_USER_ANSWER_SCREEN_ACTION_REJECT_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                return EVENT_USER_ANSWER_SCREEN_ACTION_SCREEN_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return EVENT_DUPLEX_ERROR;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return EVENT_USER_NOTIFICATION_ANSWER_CALL_BUTTON_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return EVENT_USER_NOTIFICATION_REJECT_CALL_BUTTON_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return EVENT_USER_NOTIFICATION_SCREEN_CALL_BUTTON_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                return EVENT_USER_MANUAL_SCREENING_ANSWER_CALL_BUTTON_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return EVENT_USER_MANUAL_SCREENING_REJECT_CALL_BUTTON_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return EVENT_USER_MANUAL_SCREENING_SUGGESTED_REPLY_CHIP_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return EVENT_USER_MANUAL_SCREENING_REPORT_SPAM_CLICKED;
            case 48:
                return EVENT_DUPLEX_CALL_ACTION_END_MISSED_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return EVENT_DOBBY_FALLBACK_END_SPAM_CALL;
            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                return EVENT_DOBBY_PLAY_RECORDING_ERROR;
            case 51:
                return EVENT_DOBBY_FALLBACK_DUE_TO_ERROR;
            case 52:
                return EVENT_DUPLEX_CALL_ACTION_START_TAKING_MESSAGE;
            case 53:
                return EVENT_DUPLEX_ROBOCALL_DETECTED;
            case 54:
                return EVENT_DUPLEX_POST_SCREENING_QUICK_REPLY_CHIPS_RECEIVED;
            case 55:
                return EVENT_USER_POST_SCREENING_QUICK_REPLY_CHIP_CLICKED;
            case 56:
                return EVENT_USER_ANSWER_SCREEN_ACTION_ASK_IF_URGENT;
            case 57:
                return EVENT_USER_NOTIFICATION_ASK_IF_URGENT_BUTTON_CLICKED;
            case 58:
                return EVENT_USER_NOTIFICATION_ASK_IF_URGENT_BUTTON_PRODUCED;
            case 59:
                return EVENT_USER_NOTIFICATION_SCREEN_CALL_BUTTON_PRODUCED;
            case 60:
                return EVENT_USER_ANSWER_SCREEN_ASK_IF_URGENT_BUTTON_PRODUCED;
            case 61:
                return EVENT_USER_ANSWER_SCREEN_SCREEN_CALL_BUTTON_PRODUCED;
            case 62:
                return EVENT_DOBBY_CALL_DISCONNECTED;
            case 63:
                return EVENT_DUPLEX_AUDIO_MATCH_DETECTED;
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                return EVENT_USER_ANSWER_SCREEN_ACTION_IN_PUBLIC;
            case 65:
            case 66:
            case 67:
            default:
                return null;
            case 68:
                return EVENT_DOBBY_START_BAM_FROM_WEAR_RECEIVED;
            case 69:
                return EVENT_DOBBY_START_BAM;
            case 70:
                return EVENT_BAM_CENTER_FRAGMENT_RESUMED;
            case 71:
                return EVENT_BAM_CENTER_FRAGMENT_DATA_LOADED;
            case 72:
                return EVENT_DOBBY_START_AUTO_SCREENING_WITH_UI;
            case 73:
                return EVENT_DUPLEX_LLM_ACTIVE;
            case 74:
                return EVENT_DUPLEX_LLM_FEATURE_DOWNLOADING;
            case 75:
                return EVENT_DUPLEX_LLM_FEATURE_MISSING;
            case 76:
                return EVENT_DUPLEX_SUGGESTED_REPLY_CHIPS_DISPLAYED;
            case 77:
                return EVENT_AI_REPLIES_SUGGESTION_CHIP_DISPLAYED;
            case 78:
                return EVENT_AI_REPLIES_SUGGESTION_CHIP_CLICKED;
            case 79:
                return EVENT_AI_REPLIES_CONSENT_DIALOG_SHOWN;
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return EVENT_AI_REPLIES_CONSENT_DIALOG_POSITIVE_BUTTON_CLICKED;
            case 81:
                return EVENT_AI_REPLIES_CONSENT_DIALOG_NEGATIVE_BUTTON_CLICKED;
            case 82:
                return EVENT_AI_REPLIES_CONSENT_DIALOG_DISMISSED;
            case 83:
                return EVENT_DUPLEX_LLM_INFERENCE_REQUEST;
            case 84:
                return EVENT_DUPLEX_LLM_CANCEL_INFERENCE_REQUEST;
            case 85:
                return EVENT_DUPLEX_LLM_INFERENCE_SUCCESS;
            case 86:
                return EVENT_DUPLEX_LLM_INFERENCE_SUCCESS_EMPTY;
            case 87:
                return EVENT_DUPLEX_LLM_INFERENCE_FAILURE;
            case 88:
                return EVENT_DOBBY_TTS_AVAILABLE;
            case 89:
                return EVENT_DOBBY_TTS_UNAVAILABLE;
            case 90:
                return EVENT_DUPLEX_EXTRACTION_SUCCESS;
            case 91:
                return EVENT_DUPLEX_EXTRACTION_PARSING_FAILURE;
            case 92:
                return EVENT_DUPLEX_EXTRACTION_LLM_INFERENCE_FAILURE;
            case 93:
                return EVENT_DUPLEX_EXTRACTION_EMPTY_OUTPUT_FAILURE;
            case 94:
                return EVENT_DUPLEX_LLM_FEATURE_AVAILABLE;
            case 95:
                return EVENT_DOBBY_START_BEESLY;
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return EVENT_BEESLY_FALLBACK_DUE_TO_ERROR;
            case 97:
                return EVENT_BEESLY_FAIL_TO_START_SESSION;
            case 98:
                return EVENT_DOBBY_START_BEESLY_WITH_UI;
            case 99:
                return EVENT_DOBBY_LOGGING_SESSION_TIMEOUT;
            case 100:
                return EVENT_DOBBY_USE_GEMINI_RUNNER_SELECTED;
            case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return EVENT_DOBBY_CALL_SCOPE_REMOVED;
            case 102:
                return EVENT_WINKY_STARTING_FROM_WEAR;
            case 103:
                return EVENT_DOBBY_IGNORE_CALL_ACTION_BOT;
            case 104:
                return EVENT_DOBBY_START_MANUAL_SCREENING_WITHOUT_UI;
            case 105:
                return EVENT_DOBBY_TTS_SYNTHESIS_ERROR;
            case 106:
                return EVENT_DOBBY_UPLINK_AUDIO_PLAYBACK_ERROR;
            case 107:
                return EVENT_DOBBY_OPENING_DISCLOSURE_FAILED;
            case 108:
                return EVENT_DOBBY_USE_GACS_SELECTED;
            case 109:
                return EVENT_DOBBY_USE_GACS_MANUAL_SCREENING_SELECTED;
            case 110:
                return EVENT_DOBBY_TTS_SYNTHESIS_TIMEOUT;
            case 111:
                return EVENT_WINKY_STARTING_FROM_AUTO;
            case 112:
                return EVENT_DOBBY_NOT_A_DOBBY_CALL;
        }
    }

    public final int a() {
        return this.bg;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.bg);
    }
}
