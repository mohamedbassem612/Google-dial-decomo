package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akng implements alah {
    UNKNOWN_PHONE_TYPE(0),
    HOME(1),
    WORK(2),
    MOBILE(3),
    FAX_HOME(4),
    FAX_WORK(5),
    OTHER_FAX(6),
    PAGER(7),
    WORK_MOBILE(8),
    WORK_PAGER(9),
    MAIN(10),
    OTHER(11),
    UNRECOGNIZED(-1);

    private final int o;

    akng(int i) {
        this.o = i;
    }

    public static defpackage.akng b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PHONE_TYPE;
            case 1:
                return HOME;
            case 2:
                return WORK;
            case 3:
                return MOBILE;
            case 4:
                return FAX_HOME;
            case 5:
                return FAX_WORK;
            case 6:
                return OTHER_FAX;
            case 7:
                return PAGER;
            case 8:
                return WORK_MOBILE;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return WORK_PAGER;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return MAIN;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return OTHER;
            default:
                return null;
        }
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.o;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.o);
    }
}
