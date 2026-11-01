package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum lll implements alah {
    UNSET(0),
    FAVORITE(1),
    LOCAL_CONTACT(2),
    OTHER_CONTACT(3),
    BUSINESS(4),
    SPAM(5),
    UNKNOWN(6);

    public final int h;

    lll(int i2) {
        this.h = i2;
    }

    public static defpackage.lll b(int i2) {
        switch (i2) {
            case 0:
                return UNSET;
            case 1:
                return FAVORITE;
            case 2:
                return LOCAL_CONTACT;
            case 3:
                return OTHER_CONTACT;
            case 4:
                return BUSINESS;
            case 5:
                return SPAM;
            case 6:
                return UNKNOWN;
            default:
                return null;
        }
    }

    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
