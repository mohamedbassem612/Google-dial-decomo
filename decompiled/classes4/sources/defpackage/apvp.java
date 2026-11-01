package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum apvp {
    CRONET_SOURCE_UNSPECIFIED("Unspecified"),
    CRONET_SOURCE_STATICALLY_LINKED("Statically Linked"),
    CRONET_SOURCE_PLAY_SERVICES("Play Services"),
    CRONET_SOURCE_FALLBACK("Fallback"),
    CRONET_SOURCE_PLATFORM("HttpEngine"),
    CRONET_SOURCE_FAKE("Fake");

    private final java.lang.String h;

    apvp(java.lang.String str) {
        this.h = str;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.h;
    }
}
