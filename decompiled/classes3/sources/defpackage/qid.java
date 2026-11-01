package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qid implements alah {
    UNKNOWN(0),
    ANSWER_AS_RTT(1),
    DOBBY_ANSWER(2),
    DOBBY_SCREEN_CALL(3),
    DOBBY_HANG_UP(4),
    BEESLY_DECLINE(5),
    BEESLY_ANSWER(6),
    REVELIO_ANSWER(7),
    REVELIO_VIEW_TRANSCRIPT(8),
    REVELIO_HANG_UP(9),
    SHARPIE_DISMISS(10),
    SHARPIE_SEE_WARNING(11),
    ACCEPT_VIDEO_UPGRADE(12),
    DECLINE_VIDEO_UPGRADE(13),
    LEGACY_ACCEPT_VIDEO_UPGRADE(14),
    LEGACY_DECLINE_VIDEO_UPGRADE(15),
    GAMING_MODE_ANSWER(16),
    ANSWER(18),
    ANSWER_VIDEO(19),
    REJECT(20),
    DISCONNECT(21),
    CALL_SCREEN(22),
    CANCEL_ATLAS(23),
    SPEAKER_ON(24),
    SPEAKER_OFF(25),
    UNHOLD(26),
    MUTE(27),
    UNMUTE(28),
    HEDWIG_FOLLOW_ALONG(29),
    DOBBY_SCREEN_CALL_ANDROID_AUTO(30),
    TEST_HIGHEST_PRIORITY(99999),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001),
    TEST_LOWEST_PRIORITY(100002);

    public final int I;

    qid(int i) {
        this.I = i;
    }

    public final int a() {
        return this.I;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.I);
    }
}
