package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum udj implements defpackage.alah {
    SPAM_STATUS_UNKNOWN(0),
    SPAM_STATUS_NOT_SPAM(1),
    SPAM_STATUS_SPAM(2),
    SPAM_STATUS_UNDECIDED(3),
    DOBBY_DO_NOT_SCREEN(4);

    public final int f;

    udj(int i) {
        this.f = i;
    }

    public static defpackage.udj b(int i) {
        if (i == 0) {
            return SPAM_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return SPAM_STATUS_NOT_SPAM;
        }
        if (i == 2) {
            return SPAM_STATUS_SPAM;
        }
        if (i == 3) {
            return SPAM_STATUS_UNDECIDED;
        }
        if (i != 4) {
            return null;
        }
        return DOBBY_DO_NOT_SCREEN;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
