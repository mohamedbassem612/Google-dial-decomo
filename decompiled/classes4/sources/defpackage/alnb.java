package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alnb implements alah {
    EVENT_UNKNOWN(0),
    EVENT_ASR_RESULT(1),
    EVENT_INTENT_EXTRACTION(2),
    EVENT_EXTRACTION_RESULT(81),
    EVENT_FLOW_OUTPUT(3),
    EVENT_SAY(4),
    EVENT_INTERRUPT_ROUTER(5),
    EVENT_TEXT(6),
    EVENT_STATE_UPDATE(7),
    EVENT_START_CONVERSATION(8),
    EVENT_PAUSE_CONVERSATION(67),
    EVENT_SAY_INITIATED_TIMING(9),
    EVENT_END_SAY_TIMING(10),
    EVENT_TIMEOUT(11),
    EVENT_EXTRACTION_TIMING_SIGNALS(12),
    EVENT_PROCESSED_ASR_RESULT(13),
    EVENT_SMART_REPLY_FLOW_OUTPUT(14),
    EVENT_SMART_REPLY_OPTIONS(15),
    EVENT_SELECTED_INTENTS(16),
    EVENT_RINGING_STARTED(17),
    EVENT_RINGING_ENDED(18),
    EVENT_USER_END_CALL(19),
    EVENT_USER_JOIN_CALL(20),
    EVENT_SCOOBY_SPAM_SIGNAL(21),
    EVENT_FLOW_SIGNALS(22),
    EVENT_DAREDEVIL(23),
    EVENT_ENDPOINT_SPEECH_START(34),
    EVENT_ENDPOINT_SPEECH_END(35),
    EVENT_CALLER_TYPE(37),
    EVENT_POSSIBLY_INCOMPLETE(38),
    EVENT_ROBOCALL_DETECTED(39),
    EVENT_CONTINUE_TRANSCRIBING(40),
    EVENT_SMART_REPLY_FLOW_OUTPUT_DARK_LAUNCH(41),
    EVENT_STOP_BOT_SPEECH(42),
    EVENT_QUICK_REPLY_CHIPS_READY(43),
    EVENT_QUICK_REPLY_CHIP_CLICKED(44),
    EVENT_EXPERIMENT_SUMMARY(45),
    EVENT_LANG_ID(46),
    EVENT_LANGUAGE_DETECTED(47),
    EVENT_AUDIO_EMBEDDING(48),
    EVENT_SPAM_AUDIO_MATCH(49),
    EVENT_BOT_SILENCE_DEADLINE_REACHED(51),
    EVENT_TIMEOUT_AFTER_HUMAN_SPEECH(56),
    EVENT_AVAILABLE_LLM_FEATURES(61),
    EVENT_SELECTED_LLM_FEATURES(62),
    EVENT_LLM_INFERENCE_REQUEST(63),
    EVENT_LLM_INFERENCE_RESPONSE(64),
    EVENT_LLM_INFERENCE_RESULT(80),
    EVENT_SELECTED_OPTION(65),
    EVENT_LLM_CANCEL_REQUEST(66),
    EVENT_RESOLVE_OPTION_FULL_TEXT(69),
    EVENT_SMART_REPLY_LLM_ACTIVE(70),
    EVENT_SPAM_FILTER_LLM_ACTIVE(84),
    EVENT_ASR_COMPLETE_SENTENCE(85),
    EVENT_ASR_PARTIAL_CHUNK(86),
    EVENT_AGENTIC_LLM_ACTIVE(87),
    EVENT_SILENCE_DETECTED(88),
    EVENT_AGENTIC_NEW_MODEL_VERDICT(89),
    EVENT_AGENTIC_TRIGGER_INFERENCE(90),
    EVENT_AGENTIC_NEW_MODEL_SUMMARY(91),
    EVENT_TTS_AVAILABLE(71),
    EVENT_SET_TTS_VOICE(72),
    EVENT_LLM_FEATURE_DOWNLOADING(74),
    EVENT_LLM_FEATURE_MISSING(75),
    EVENT_USER_CONSENTED_TO_AI_GENERATED_REPLIES(79),
    EVENT_LLM_FEATURE_AVAILABLE(82),
    EVENT_SHOULD_ASK_FOR_LLM_CONSENT(83),
    EVENT_SMART_SUMMARY_REQUEST(53),
    EVENT_SMART_SUMMARY_OUTPUT(54),
    EVENT_CALL_TRANSCRIPT(55),
    EVENT_SMART_SUMMARY_EXTRACTION(57),
    EVENT_SMART_SUMMARY_METRICS(59),
    EVENT_SMART_SUMMARY_POST_PROCESSED(60),
    EVENT_SMART_SUMMARY_POST_SAFETY_CHECK(73),
    EVENT_SMART_SUMMARY_TITLE_EXTRACTION(76),
    EVENT_SMART_SUMMARY_POST_PROCESSED_POST_SAFETY_CHECK(77),
    EVENT_SMART_SUMMARY_ACTIONS_EXTRACTION(78),
    EVENT_PARSING_MODEL_INPUT(24),
    EVENT_PARSING_MODEL_OUTPUT(25),
    EVENT_COMPACT_MODEL_OUTPUT(50),
    EVENT_BUSINESS_PHONE_DATA(26),
    EVENT_RECOGNITION_MODEL_RESULT(27),
    EVENT_ENDPOINTER_RESULT(28),
    EVENT_AUDIO_TICK(29),
    EVENT_CACHE_STATE_UPDATE(30),
    EVENT_USER_ACTION(31),
    EVENT_AUDIO_DETECTION(32),
    EVENT_CALL_MENU_STATE(33),
    EVENT_CALL_MENU_STATE_PARSING_RESULT(52),
    EVENT_RECOGNITION_HUMAN_INTENT_EXTRACTION(36),
    EVENT_MORE_HOLD_TIME(58);

    public final int aN;

    alnb(int i) {
        this.aN = i;
    }

    public static defpackage.alnb b(int i) {
        switch (i) {
            case 0:
                return EVENT_UNKNOWN;
            case 1:
                return EVENT_ASR_RESULT;
            case 2:
                return EVENT_INTENT_EXTRACTION;
            case 3:
                return EVENT_FLOW_OUTPUT;
            case 4:
                return EVENT_SAY;
            case 5:
                return EVENT_INTERRUPT_ROUTER;
            case 6:
                return EVENT_TEXT;
            case 7:
                return EVENT_STATE_UPDATE;
            case 8:
                return EVENT_START_CONVERSATION;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return EVENT_SAY_INITIATED_TIMING;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return EVENT_END_SAY_TIMING;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return EVENT_TIMEOUT;
            case 12:
                return EVENT_EXTRACTION_TIMING_SIGNALS;
            case 13:
                return EVENT_PROCESSED_ASR_RESULT;
            case 14:
                return EVENT_SMART_REPLY_FLOW_OUTPUT;
            case 15:
                return EVENT_SMART_REPLY_OPTIONS;
            case 16:
                return EVENT_SELECTED_INTENTS;
            case 17:
                return EVENT_RINGING_STARTED;
            case 18:
                return EVENT_RINGING_ENDED;
            case 19:
                return EVENT_USER_END_CALL;
            case 20:
                return EVENT_USER_JOIN_CALL;
            case 21:
                return EVENT_SCOOBY_SPAM_SIGNAL;
            case 22:
                return EVENT_FLOW_SIGNALS;
            case 23:
                return EVENT_DAREDEVIL;
            case 24:
                return EVENT_PARSING_MODEL_INPUT;
            case 25:
                return EVENT_PARSING_MODEL_OUTPUT;
            case 26:
                return EVENT_BUSINESS_PHONE_DATA;
            case 27:
                return EVENT_RECOGNITION_MODEL_RESULT;
            case 28:
                return EVENT_ENDPOINTER_RESULT;
            case 29:
                return EVENT_AUDIO_TICK;
            case 30:
                return EVENT_CACHE_STATE_UPDATE;
            case 31:
                return EVENT_USER_ACTION;
            case 32:
                return EVENT_AUDIO_DETECTION;
            case 33:
                return EVENT_CALL_MENU_STATE;
            case 34:
                return EVENT_ENDPOINT_SPEECH_START;
            case 35:
                return EVENT_ENDPOINT_SPEECH_END;
            case 36:
                return EVENT_RECOGNITION_HUMAN_INTENT_EXTRACTION;
            case 37:
                return EVENT_CALLER_TYPE;
            case 38:
                return EVENT_POSSIBLY_INCOMPLETE;
            case 39:
                return EVENT_ROBOCALL_DETECTED;
            case 40:
                return EVENT_CONTINUE_TRANSCRIBING;
            case 41:
                return EVENT_SMART_REPLY_FLOW_OUTPUT_DARK_LAUNCH;
            case 42:
                return EVENT_STOP_BOT_SPEECH;
            case 43:
                return EVENT_QUICK_REPLY_CHIPS_READY;
            case 44:
                return EVENT_QUICK_REPLY_CHIP_CLICKED;
            case 45:
                return EVENT_EXPERIMENT_SUMMARY;
            case 46:
                return EVENT_LANG_ID;
            case 47:
                return EVENT_LANGUAGE_DETECTED;
            case 48:
                return EVENT_AUDIO_EMBEDDING;
            case 49:
                return EVENT_SPAM_AUDIO_MATCH;
            case 50:
                return EVENT_COMPACT_MODEL_OUTPUT;
            case 51:
                return EVENT_BOT_SILENCE_DEADLINE_REACHED;
            case 52:
                return EVENT_CALL_MENU_STATE_PARSING_RESULT;
            case 53:
                return EVENT_SMART_SUMMARY_REQUEST;
            case 54:
                return EVENT_SMART_SUMMARY_OUTPUT;
            case 55:
                return EVENT_CALL_TRANSCRIPT;
            case 56:
                return EVENT_TIMEOUT_AFTER_HUMAN_SPEECH;
            case 57:
                return EVENT_SMART_SUMMARY_EXTRACTION;
            case 58:
                return EVENT_MORE_HOLD_TIME;
            case 59:
                return EVENT_SMART_SUMMARY_METRICS;
            case 60:
                return EVENT_SMART_SUMMARY_POST_PROCESSED;
            case 61:
                return EVENT_AVAILABLE_LLM_FEATURES;
            case 62:
                return EVENT_SELECTED_LLM_FEATURES;
            case 63:
                return EVENT_LLM_INFERENCE_REQUEST;
            case 64:
                return EVENT_LLM_INFERENCE_RESPONSE;
            case 65:
                return EVENT_SELECTED_OPTION;
            case 66:
                return EVENT_LLM_CANCEL_REQUEST;
            case 67:
                return EVENT_PAUSE_CONVERSATION;
            case 68:
            default:
                return null;
            case 69:
                return EVENT_RESOLVE_OPTION_FULL_TEXT;
            case 70:
                return EVENT_SMART_REPLY_LLM_ACTIVE;
            case 71:
                return EVENT_TTS_AVAILABLE;
            case 72:
                return EVENT_SET_TTS_VOICE;
            case 73:
                return EVENT_SMART_SUMMARY_POST_SAFETY_CHECK;
            case 74:
                return EVENT_LLM_FEATURE_DOWNLOADING;
            case 75:
                return EVENT_LLM_FEATURE_MISSING;
            case 76:
                return EVENT_SMART_SUMMARY_TITLE_EXTRACTION;
            case 77:
                return EVENT_SMART_SUMMARY_POST_PROCESSED_POST_SAFETY_CHECK;
            case 78:
                return EVENT_SMART_SUMMARY_ACTIONS_EXTRACTION;
            case 79:
                return EVENT_USER_CONSENTED_TO_AI_GENERATED_REPLIES;
            case 80:
                return EVENT_LLM_INFERENCE_RESULT;
            case 81:
                return EVENT_EXTRACTION_RESULT;
            case 82:
                return EVENT_LLM_FEATURE_AVAILABLE;
            case 83:
                return EVENT_SHOULD_ASK_FOR_LLM_CONSENT;
            case 84:
                return EVENT_SPAM_FILTER_LLM_ACTIVE;
            case 85:
                return EVENT_ASR_COMPLETE_SENTENCE;
            case 86:
                return EVENT_ASR_PARTIAL_CHUNK;
            case 87:
                return EVENT_AGENTIC_LLM_ACTIVE;
            case 88:
                return EVENT_SILENCE_DETECTED;
            case 89:
                return EVENT_AGENTIC_NEW_MODEL_VERDICT;
            case 90:
                return EVENT_AGENTIC_TRIGGER_INFERENCE;
            case 91:
                return EVENT_AGENTIC_NEW_MODEL_SUMMARY;
        }
    }

    public final int a() {
        return this.aN;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.aN);
    }
}
