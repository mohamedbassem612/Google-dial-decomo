package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alss implements alah {
    SPAM_STATUS_UNKNOWN(0),
    SPAM_STATUS_NOT_SPAM(1),
    SPAM_STATUS_SPAM(2),
    SPAM_STATUS_UNDECIDED(3);

    public final int e;

    alss(int i) {
        this.e = i;
    }

    public static defpackage.alss b(int i) {
        if (i == 0) {
            return SPAM_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return SPAM_STATUS_NOT_SPAM;
        }
        if (i == 2) {
            return SPAM_STATUS_SPAM;
        }
        if (i != 3) {
            return null;
        }
        return SPAM_STATUS_UNDECIDED;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
