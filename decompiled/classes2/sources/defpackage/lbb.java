package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lbb implements alah {
    UNKNOWN(0),
    UNRESTRICTED(1),
    RESTRICTED_CROSBY_CALL_RECORDING_AVAILABLE(2),
    RESTRICTED_CROSBY_CALL_RECORDING_NOT_AVAILABLE(3),
    CALL_RECORDING(4),
    RESTRICTED_CALL_RECORDING(5);

    public final int g;

    lbb(int i) {
        this.g = i;
    }

    public static defpackage.lbb b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UNRESTRICTED;
        }
        if (i == 2) {
            return RESTRICTED_CROSBY_CALL_RECORDING_AVAILABLE;
        }
        if (i == 3) {
            return RESTRICTED_CROSBY_CALL_RECORDING_NOT_AVAILABLE;
        }
        if (i == 4) {
            return CALL_RECORDING;
        }
        if (i != 5) {
            return null;
        }
        return RESTRICTED_CALL_RECORDING;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
