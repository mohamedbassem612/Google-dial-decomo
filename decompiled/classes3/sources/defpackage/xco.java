package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum xco implements alah {
    UNKNOWN(0),
    CALL_ON_TELEPHONY_HOLD(1),
    CANNOT_RING(2),
    FI_WITH_BLUETOOTH(3),
    DISCLAIMER_NOT_ACKED(4);

    private final int g;

    xco(int i) {
        this.g = i;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
