package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ztb implements defpackage.alah {
    TEST_CALL_PARAMETER_INTERCEPTOR(-1),
    PHONE_METRIC_POPULATOR(1),
    PHONE_PERMISSION_CHECK(2),
    PHONE_MALFORMED_NUMBER_RECTIFIER(3),
    PHONE_WARN_FOR_OUTGOING_CALLS_TO_BLOCKED_NUMBERS_LOADER(4),
    PHONE_WARN_FOR_OUTGOING_CALLS_TO_BLOCKED_NUMBERS(5),
    PHONE_REVELIO_ONGOING(6),
    PHONE_CALLING_ACCOUNT_LOADER(7),
    PHONE_CALLING_ACCOUNT_SELECTOR(8),
    PHONE_ASSISTED_DIAL(9),
    PHONE_WPS_WARNING_DIALOG(10),
    PHONE_OPS_RECORD_AUDIO_ACCESS_LOADER(11),
    PHONE_OPS_RECORD_AUDIO_ACCESS(12),
    PHONE_DOBBY(13),
    PHONE_DOBBY_DISCONNECT_CURRENT_CALLS(14),
    PHONE_XATU(15),
    PHONE_ENRICHED_CALLING(16),
    WEAR_CALL_INITIATION_VALIDATOR(100),
    WEAR_DOUBLE_TAP_CALL_BLOCKER(101),
    WEAR_PHONE_ACCOUNT_SELECTOR(102),
    WEAR_COMPANION_EMERGENCY_CALL_BLOCKER(103),
    WEAR_ALLOWED_NUMBER_VERIFICATION(104),
    WEAR_CALL_TYPE_DISAMBIGUATION(105),
    WEAR_END_ONGOING_CALL(106),
    TEST_INTEGRATION(10000);

    public final int z;

    ztb(int i) {
        this.z = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.z);
    }
}
