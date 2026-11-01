package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum uyp implements alah {
    UNSPECIFIED(0),
    WIFI_TO_LTE(1),
    LTE_TO_WIFI(2),
    LTE_TO_WIFI_FAILED(3);

    private final int f;

    uyp(int i) {
        this.f = i;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
