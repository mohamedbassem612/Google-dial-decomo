package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alyl implements alah {
    NO_TRIGGER(0),
    START_TAKING_MESSAGE_TRIGGER(1),
    CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER(2),
    TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER(3),
    MESSAGE_TOO_LONG_TRIGGER(4),
    INCOMPLETE_TRIGGER(5),
    ANCIENT_TRIGGER(6);

    public final int h;

    alyl(int i2) {
        this.h = i2;
    }

    public static defpackage.alyl b(int i2) {
        switch (i2) {
            case 0:
                return NO_TRIGGER;
            case 1:
                return START_TAKING_MESSAGE_TRIGGER;
            case 2:
                return CALLER_FINISHED_LEAVING_MESSAGE_TRIGGER;
            case 3:
                return TIMEOUT_DURING_LEAVING_MESSAGE_TRIGGER;
            case 4:
                return MESSAGE_TOO_LONG_TRIGGER;
            case 5:
                return INCOMPLETE_TRIGGER;
            case 6:
                return ANCIENT_TRIGGER;
            default:
                return null;
        }
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
