package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akus implements alal {
    private final /* synthetic */ int $cid;

    public akus(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(int i) {
        java.lang.Object obj = null;
        switch (this.$cid) {
            case 0:
                defpackage.akvb akvbVarB = defpackage.akvb.b(i);
                return akvbVarB == null ? defpackage.akvb.ANDROID_PERMISSION_TYPE_UNSPECIFIED : akvbVarB;
            case 1:
                ammm ammmVarB = ammm.b(i);
                return ammmVarB == null ? ammm.a : ammmVarB;
            case 2:
                defpackage.akwr akwrVarB = defpackage.akwr.b(i);
                return akwrVarB == null ? defpackage.akwr.SENSITIVE_CLASSIFICATION_REASON_CODE_UNSPECIFIED : akwrVarB;
            case 3:
                if (i == 0) {
                    obj = defpackage.akwp.SEARCH_ADS_LIMITED_FOR_UNSPECIFIED;
                } else if (i == 1) {
                    obj = defpackage.akwp.SEARCH_ADS_LIMITED_FOR_EDTREK;
                } else if (i == 2) {
                    obj = defpackage.akwp.SEARCH_ADS_LIMITED_FOR_SENSITIVE_ATTRIBUTES_P13N;
                }
                if (obj == null) {
                    return defpackage.akwp.UNRECOGNIZED;
                }
                break;
            case 4:
                if (i == 0) {
                    obj = defpackage.akwq.SEARCH_GENAI_TRAINING_EXCLUDED_FOR_UNSPECIFIED;
                } else if (i == 999) {
                    obj = defpackage.akwq.SEARCH_GENAI_TRAINING_EXCLUDED_FOR_TEST_SLICE;
                }
                if (obj == null) {
                    return defpackage.akwq.UNRECOGNIZED;
                }
                break;
            case 5:
                defpackage.alrf alrfVarB = defpackage.alrf.b(i);
                return alrfVarB == null ? defpackage.alrf.DTMF_UNDEFINED : alrfVarB;
            case 6:
                defpackage.alwk alwkVarB = defpackage.alwk.b(i);
                return alwkVarB == null ? defpackage.alwk.NO_TRIGGER : alwkVarB;
            case 7:
                defpackage.ambp ambpVarB = defpackage.ambp.b(i);
                return ambpVarB == null ? defpackage.ambp.SUMMARY_SAFETY_CHECK_UNSPECIFIED : ambpVarB;
            case 8:
                if (i == 0) {
                    obj = defpackage.amhv.COMPLETION_STYLE_UNKNOWN;
                } else if (i == 1) {
                    obj = defpackage.amhv.COMPLETION_STYLE_CARD;
                } else if (i == 2) {
                    obj = defpackage.amhv.COMPLETION_STYLE_TOAST;
                }
                if (obj == null) {
                    return defpackage.amhv.UNRECOGNIZED;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                if (i == 0) {
                    obj = defpackage.amhy.PROMPT_STYLE_UNKNOWN;
                } else if (i == 1) {
                    obj = defpackage.amhy.PROMPT_STYLE_FIRST_CARD_NON_MODAL;
                } else if (i == 2) {
                    obj = defpackage.amhy.PROMPT_STYLE_FIRST_CARD_MODAL;
                }
                if (obj == null) {
                    return defpackage.amhy.UNRECOGNIZED;
                }
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.amqd amqdVarB = defpackage.amqd.b(i);
                return amqdVarB == null ? defpackage.amqd.UNKNOWN_ERROR : amqdVarB;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                amqw amqwVarB = amqw.b(i);
                return amqwVarB == null ? amqw.a : amqwVarB;
            default:
                amsb amsbVarB = amsb.b(i);
                return amsbVarB == null ? amsb.a : amsbVarB;
        }
        return obj;
    }
}
