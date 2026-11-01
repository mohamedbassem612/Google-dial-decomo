package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qim implements alah {
    PRIORITY_UNKNOWN(99999),
    SHARPIE_NOTIFICATION_PRIORITY(10),
    CONTACT_CHECKER_NOTIFICATION_PRIORITY(11),
    REVELIO_PRIORITY(70),
    VIDEO_UPGRADE_NOTIFICATION_PRIORITY(80),
    BEESLY_CALL_NOTIFICATION_PRIORITY(89),
    GAMING_MODE_CALL_NOTIFICATION_PRIORITY(90),
    BASIC_CALL_NOTIFICATION_PRIORITY(100),
    TEST_HIGH_PRIORITY(9999),
    TEST_LOW_PRIORITY(defpackage.aehk.NEXT_REQUEST_CODE);

    private final int l;

    qim(int i) {
        this.l = i;
    }

    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
