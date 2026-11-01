package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ihh implements alah {
    DUPLEX_AVAILABILITY_FAILURE_UNKNOWN(0),
    DUPLEX_AVAILABILITY_FAILURE_MISSING_FILE_GROUP(1),
    DUPLEX_AVAILABILITY_FAILURE_NO_FILE_SPECIFIED(2),
    DUPLEX_AVAILABILITY_FAILURE_FILE_GROUP_LOCALE_MISMATCHED(3),
    DUPLEX_AVAILABILITY_FAILURE_MDD_USE_CASES_MISMATCHED(4),
    UNRECOGNIZED(-1);

    private final int h;

    ihh(int i) {
        this.h = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
