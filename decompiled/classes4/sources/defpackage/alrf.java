package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alrf implements alah {
    DTMF_UNDEFINED(0),
    DTMF_ZERO(1),
    DTMF_ONE(2),
    DTMF_TWO(3),
    DTMF_THREE(4),
    DTMF_FOUR(5),
    DTMF_FIVE(6),
    DTMF_SIX(7),
    DTMF_SEVEN(8),
    DTMF_EIGHT(9),
    DTMF_NINE(10),
    DTMF_ASTERISK(11),
    DTMF_POUND(12);

    public final int n;

    alrf(int i) {
        this.n = i;
    }

    public static defpackage.alrf b(int i) {
        switch (i) {
            case 0:
                return DTMF_UNDEFINED;
            case 1:
                return DTMF_ZERO;
            case 2:
                return DTMF_ONE;
            case 3:
                return DTMF_TWO;
            case 4:
                return DTMF_THREE;
            case 5:
                return DTMF_FOUR;
            case 6:
                return DTMF_FIVE;
            case 7:
                return DTMF_SIX;
            case 8:
                return DTMF_SEVEN;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return DTMF_EIGHT;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return DTMF_NINE;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return DTMF_ASTERISK;
            case 12:
                return DTMF_POUND;
            default:
                return null;
        }
    }

    public final int a() {
        return this.n;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.n);
    }
}
