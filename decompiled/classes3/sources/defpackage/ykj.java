package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ykj implements alah {
    UNKNOWN_POLICY_VIOLATION(0),
    NO_POLICY_VIOLATION(1),
    UNSUPPORTED_POLICY_VIOLATION(2),
    NOT_AVAILABLE_POLICY_VIOLATION(3),
    GIFT_CARD(4),
    PHISHING(5),
    SUSPICIOUS(6),
    SENSITIVE_POLICY_VIOLATION(7),
    RECURRENT_SPAM_PATTERN(8);

    public final int j;

    ykj(int i) {
        this.j = i;
    }

    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
