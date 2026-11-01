package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum wvj implements alah {
    UNKNOWN_ATLAS_BUSINESS(0),
    TOLL_FREE(1045),
    TEST_PHENOTYPE(1046),
    BIRDSONG_CLOUD_SERVICE_TEST_1(1050),
    BIRDSONG_CLOUD_SERVICE_TEST_2(1051),
    WHITELISTED_NON_TOLL_FREE(1053),
    DUPLEX_VERIFIED_DATA_EXTRACTION_NUMBER(1054);

    private final int i;

    wvj(int i) {
        this.i = i;
    }

    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
