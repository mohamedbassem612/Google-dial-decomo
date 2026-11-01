package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum mlt implements alah {
    PROMPT_TYPE_UNKNOWN(0),
    PROMPT_TYPE_USE_DUNE(1),
    PROMPT_TYPE_MISSING_ACCOUNT(2),
    PROMPT_TYPE_ENABLE_WIFI_CALLING(3),
    PROMPT_TYPE_VIDEO_CALL_NOT_AVAILABLE(4),
    PROMPT_TYPE_DEFAULT_ERROR(5);

    private final int h;

    mlt(int i) {
        this.h = i;
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
