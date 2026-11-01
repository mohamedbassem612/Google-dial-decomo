package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum kig implements alah {
    CALL_LOG_ICON_UNKNOWN(0),
    CALL_LOG_ICON_STIR_SHAKEN_VERIFIED(1),
    CALL_LOG_ICON_CALL_RECORDING(2),
    CALL_LOG_ICON_CALL_SCREEN(3),
    CALL_LOG_ICON_WIFI(4),
    CALL_LOG_ICON_SHARED_DATA_CALL(5),
    CALL_LOG_ICON_LTE(6),
    CALL_LOG_ICON_HD(7),
    CALL_LOG_ICON_ASSISTED_DIAL(8),
    CALL_LOG_ICON_ASSISTANT(9),
    CALL_LOG_ICON_FERMAT(10),
    CALL_LOG_ICON_FERMAT_CALL_RECORDING(11),
    CALL_LOG_ICON_BEESLY(12),
    CALL_LOG_ICON_HEDWIG(13),
    CALL_LOG_ICON_TEST_1(1000),
    CALL_LOG_ICON_TEST_2(1001);

    private final int r;

    kig(int i) {
        this.r = i;
    }

    public final int a() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.r);
    }
}
