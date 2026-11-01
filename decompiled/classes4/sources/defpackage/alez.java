package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alez implements alah {
    OK(0),
    INITIALIZATION_IN_PROGRESS(1),
    INITIALIZATION_FAILED(2),
    MODEL_NOT_FOUND(3),
    MALFORMED_MODEL_METADATA(4),
    TARTARUS_OUTPUT_CONVERSION_FAILED(5),
    TARTARUS_OUTPUT_NO_VERDICT(6),
    TARTARUS_OUTPUT_UNKNOWN_ACTION(7),
    TARTARUS_CORE_LOAD_ERROR(8),
    TARTARUS_CORE_CLASSIFY_ERROR(9),
    UNKNOWN_ERROR(10),
    TARTARUS_VM_LOAD_ERROR(11),
    TARTARUS_VM_CLASSIFY_ERROR(12),
    PERSEPHONE_DOWNLOAD_FAILED(13),
    LOAD_PROTECTIONS_FAILED(14),
    MDD_READ_FILE_FAILED(15),
    MDD_PROTECTION_EXTRACTION_FAILED(16),
    TARTARUS_CORE_ILLEGAL_ARGUMENT_ERROR(17),
    PERSEPHONE_DOWNLOAD_FAILED_MDD(18);

    private final int u;

    alez(int i) {
        this.u = i;
    }

    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.u);
    }
}
