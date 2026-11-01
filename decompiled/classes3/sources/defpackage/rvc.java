package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum rvc implements alah {
    UNSPECIFIED(0),
    CALL_SCREEN(2),
    CALLER_ID_AND_SPAM(3),
    SHARPIE(4),
    HOLD_FOR_ME(5),
    SPAM_AND_CALL_SCREEN(6),
    XATU(7),
    MOTOROLA_FLIPPABLES(8),
    TIMEKEEPER(9),
    ACCESSIBILITY(10),
    ASSISTED_DIALING(11),
    BLOCKED(12),
    CALLING_ACCOUNTS(13),
    CALLS(14),
    CALL_RECORDING(15),
    CRYSTAL_CLEAR_AUDIO(17),
    DISPLAY_OPTIONS(18),
    ANSWER_METHOD(20),
    ENRICHED_CALLING(21),
    LANGUAGE_AND_VOICE(22),
    QUICK_REPLIES(23),
    SOUND_AND_VIBRATION(24),
    VIDEO_CALL(25),
    VOICEMAIL(27),
    CALL_ANNOUNCER(28),
    FLIP_TO_SILENCE(29),
    PREFIXES(30),
    DOBBY(31),
    SONIC(32),
    FERMAT(33),
    EXPRESSO(34),
    CONTACT_RINGTONES(35),
    NAUTILUS(36),
    PATRICK(37),
    BEACON(38),
    BEESLY(39),
    CALL_DIAGNOSTICS(40),
    CALL_CONTEXT(41),
    REVELIO(101),
    RTT(102),
    TEST_FEATURE_SETTING(10001),
    TYPE_INTENT_TEST(10002),
    UNRECOGNIZED(-1);

    private final int S;

    rvc(int i) {
        this.S = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.S;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.S);
    }
}
