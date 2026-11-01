package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wpd implements alah {
    PROMPT_NONE(0),
    HOLD_FOR_ME_WAITING_TO_ACTIVATE(1),
    LOW_QUALITY_TRANSCRIPT(2),
    AUDIO_ERROR(3),
    HUMAN_AGENT_DETECTED(4),
    CONNECTING_TO_HUMAN_AGENT(5),
    HOLD_DETECTED(6),
    PIPELINE_ERROR(7),
    UNRECOGNIZED(-1);

    private final int k;

    wpd(int i) {
        this.k = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.k;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.k);
    }
}
