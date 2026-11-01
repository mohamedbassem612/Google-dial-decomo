package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tvw implements alah {
    AICORE_MODEL_DOWNLOAD_STATUS_UNKNOWN(0),
    AICORE_MODEL_DOWNLOAD_STATUS_DOWNLOADABLE(1),
    AICORE_MODEL_DOWNLOAD_STATUS_DOWNLOADING(2),
    AICORE_MODEL_DOWNLOAD_STATUS_DOWNLOADED(3),
    UNRECOGNIZED(-1);

    private final int g;

    tvw(int i) {
        this.g = i;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
