package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum veq implements alah {
    EVENT_UNSPECIFIED(0),
    EVENT_NEW_MESSAGE(1),
    EVENT_MAILBOX_UPDATE(2),
    EVENT_GREETINGS_UPDATE(3),
    UNRECOGNIZED(-1);

    private final int g;

    veq(int i) {
        this.g = i;
    }

    public static defpackage.veq b(int i) {
        if (i == 0) {
            return EVENT_UNSPECIFIED;
        }
        if (i == 1) {
            return EVENT_NEW_MESSAGE;
        }
        if (i == 2) {
            return EVENT_MAILBOX_UPDATE;
        }
        if (i != 3) {
            return null;
        }
        return EVENT_GREETINGS_UPDATE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
