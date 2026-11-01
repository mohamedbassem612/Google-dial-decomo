package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum ihe implements defpackage.alah {
    USE_CASE_UNKNOWN(0),
    USE_CASE_SPAM_FILTER(1),
    USE_CASE_SMART_REPLY(2),
    USE_CASE_DEMO(3),
    USE_CASE_VISUAL_CALLING(4),
    USE_CASE_FERMAT(5),
    USE_CASE_BEESLY(6),
    USE_CASE_BAM(7),
    USE_CASE_AGENTIC_CALL_SCREEN(8),
    UNRECOGNIZED(-1);

    private final int l;

    ihe(int i) {
        this.l = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
