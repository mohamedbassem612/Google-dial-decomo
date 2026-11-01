package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum nof implements alah {
    CONSENT_NOT_SET(0),
    CONSENT_USER_OPTED_OUT(1),
    CONSENT_USER_OPTED_IN(2),
    UNRECOGNIZED(-1);

    private final int f;

    nof(int i) {
        this.f = i;
    }

    public static defpackage.nof b(int i) {
        if (i == 0) {
            return CONSENT_NOT_SET;
        }
        if (i == 1) {
            return CONSENT_USER_OPTED_OUT;
        }
        if (i != 2) {
            return null;
        }
        return CONSENT_USER_OPTED_IN;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
