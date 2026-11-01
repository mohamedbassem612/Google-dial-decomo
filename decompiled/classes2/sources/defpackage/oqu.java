package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum oqu implements alah {
    DIALER_HATS_PSD_UNKNOWN(0),
    DIALER_HATS_PSD_TEST(1),
    DIALER_HATS_PSD_DEFAULT(2),
    DIALER_HATS_PSD_DOBBY(3),
    DIALER_HATS_PSD_XATU(4),
    DIALER_HATS_PSD_SHARPIE(5),
    DIALER_HATS_PSD_CALLING_CARD(6);

    private final int i;

    oqu(int i) {
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
