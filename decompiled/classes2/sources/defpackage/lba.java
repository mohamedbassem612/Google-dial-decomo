package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lba implements alah {
    UNKNOWN(0),
    UNRESTRICTED(1),
    RESTRICTED_CALL_RECORDING_AVAILABLE(2),
    RESTRICTED_CALL_RECORDING_NOT_AVAILABLE(3);

    public final int e;

    lba(int i) {
        this.e = i;
    }

    public static defpackage.lba b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UNRESTRICTED;
        }
        if (i == 2) {
            return RESTRICTED_CALL_RECORDING_AVAILABLE;
        }
        if (i != 3) {
            return null;
        }
        return RESTRICTED_CALL_RECORDING_NOT_AVAILABLE;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
