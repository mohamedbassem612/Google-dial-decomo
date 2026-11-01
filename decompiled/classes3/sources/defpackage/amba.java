package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amba implements alah {
    TYPE_UNSPECIFIED(0),
    TYPE_OFF_HOLD_DETECTION(1),
    TYPE_VISUAL_CALLING(2),
    TYPE_CALL_ASSISTANT(3),
    TYPE_SN(4),
    UNRECOGNIZED(-1);

    private final int h;

    amba(int i) {
        this.h = i;
    }

    public static defpackage.amba b(int i) {
        if (i == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return TYPE_OFF_HOLD_DETECTION;
        }
        if (i == 2) {
            return TYPE_VISUAL_CALLING;
        }
        if (i == 3) {
            return TYPE_CALL_ASSISTANT;
        }
        if (i != 4) {
            return null;
        }
        return TYPE_SN;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
