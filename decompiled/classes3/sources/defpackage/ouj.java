package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ouj implements alah {
    UNKNOWN(0),
    ANSWER_AS_RTT(1),
    ANSWER_AND_END_ONGOING_CALL(2),
    DOBBY_MANUALLY_SCREEN_CALL(10),
    DOBBY_POST_SCREENING_FIRST_REPLY_CHIP(11),
    DOBBY_POST_SCREENING_SECOND_REPLY_CHIP(12),
    REVELIO_SEE_CONVERSATION(20),
    CALL_SCREEN(22),
    REPLY_WITH_SMS(25),
    BUILD_TYPE(10001),
    COIN(10002),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int n;

    ouj(int i) {
        this.n = i;
    }

    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
