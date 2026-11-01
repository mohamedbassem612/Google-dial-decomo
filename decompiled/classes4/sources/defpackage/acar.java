package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class acar extends ahxq {
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.akie akieVar = (defpackage.akie) obj;
        switch (akieVar.ordinal()) {
            case 0:
                return defpackage.akvm.TARGETING_FAILED_REASON_UNKNOWN;
            case 1:
                return defpackage.akvm.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case 2:
                return defpackage.akvm.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case 3:
                return defpackage.akvm.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case 4:
                return defpackage.akvm.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case 5:
                return defpackage.akvm.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case 6:
                return defpackage.akvm.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case 7:
                return defpackage.akvm.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case 8:
                return defpackage.akvm.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return defpackage.akvm.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return defpackage.akvm.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return defpackage.akvm.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case 12:
                return defpackage.akvm.TARGETING_FAILED_REASON_REQUIRED_PERMISSION_NOT_GRANTED;
            case 13:
                return defpackage.akvm.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akieVar.toString()));
        }
    }

    protected final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        defpackage.akvm akvmVar = (defpackage.akvm) obj;
        switch (akvmVar.ordinal()) {
            case 0:
                return defpackage.akie.TARGETING_FAILED_REASON_UNKNOWN;
            case 1:
                return defpackage.akie.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case 2:
                return defpackage.akie.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case 3:
                return defpackage.akie.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case 4:
                return defpackage.akie.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case 5:
                return defpackage.akie.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case 6:
                return defpackage.akie.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case 7:
                return defpackage.akie.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case 8:
                return defpackage.akie.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return defpackage.akie.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return defpackage.akie.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return defpackage.akie.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case 12:
                return defpackage.akie.TARGETING_FAILED_REASON_REQUIRED_PERMISSION_NOT_GRANTED;
            case 13:
                return defpackage.akie.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(akvmVar.toString()));
        }
    }
}
