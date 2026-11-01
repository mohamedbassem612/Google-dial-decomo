package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum aixh implements alah {
    UNKNOWN(0),
    GROUP_NOT_FOUND(1),
    NEW_BUILD_ID(2),
    NEW_VARIANT_ID(3),
    NEW_VERSION_NUMBER(4),
    DIFFERENT_FILES(5),
    DIFFERENT_STALE_LIFETIME(6),
    DIFFERENT_EXPIRATION_DATE(7),
    DIFFERENT_DOWNLOAD_CONDITIONS(8),
    DIFFERENT_ALLOWED_READERS(9),
    DIFFERENT_DOWNLOAD_POLICY(10),
    DIFFERENT_EXPERIMENT_INFO(11),
    DIFFERENT_CUSTOM_METADATA(12),
    UNRECOGNIZED(-1);

    private final int p;

    aixh(int i) {
        this.p = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.p;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.p);
    }
}
