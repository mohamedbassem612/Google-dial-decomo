package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum iho implements alah {
    SODA_AVAILABILITY_FAILURE_UNKNOWN(0),
    SODA_AVAILABILITY_FAILURE_NO_LP_DOWNLOADED(2),
    SODA_AVAILABILITY_FAILURE_LP_VERSION_RANGE_MISMATCHED(4),
    SODA_AVAILABILITY_FAILURE_DIARIAZATION_UNSUPPORTED(5),
    SODA_AVAILABILITY_FAILURE_LOCALE_MISMATCH(6),
    UNRECOGNIZED(-1);

    private final int h;

    iho(int i) {
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
