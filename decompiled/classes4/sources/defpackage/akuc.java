package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akuc implements alah {
    BUTTONS_ORDER_UNSPECIFIED(0),
    ACTION_BUTTON_PRIMARY(1),
    ACK_BUTTON_PRIMARY(2);

    private final int e;

    akuc(int i) {
        this.e = i;
    }

    public static defpackage.akuc b(int i) {
        if (i == 0) {
            return BUTTONS_ORDER_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_BUTTON_PRIMARY;
        }
        if (i != 2) {
            return null;
        }
        return ACK_BUTTON_PRIMARY;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
