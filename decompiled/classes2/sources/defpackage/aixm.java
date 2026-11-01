package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aixm implements alah {
    UNKNOWN_CALL_DURATION_TYPE(0),
    CALL_DURATION_VERY_SHORT(1),
    CALL_DURATION_SHORT(2),
    CALL_DURATION_MEDIUM(3),
    CALL_DURATION_LONG(4);

    public final int f;

    aixm(int i) {
        this.f = i;
    }

    public static defpackage.aixm b(int i) {
        if (i == 0) {
            return UNKNOWN_CALL_DURATION_TYPE;
        }
        if (i == 1) {
            return CALL_DURATION_VERY_SHORT;
        }
        if (i == 2) {
            return CALL_DURATION_SHORT;
        }
        if (i == 3) {
            return CALL_DURATION_MEDIUM;
        }
        if (i != 4) {
            return null;
        }
        return CALL_DURATION_LONG;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
