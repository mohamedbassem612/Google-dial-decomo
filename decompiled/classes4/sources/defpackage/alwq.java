package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alwq implements alah {
    TYPE_UNSET(0),
    TYPE_FAVORITE(1),
    TYPE_CONTACT(2),
    TYPE_WORK(3),
    TYPE_BUSINESS(4),
    TYPE_SPAM(5),
    TYPE_UNKNOWN(6),
    TYPE_HIDDEN_NUMBER(7);

    public final int i;

    alwq(int i) {
        this.i = i;
    }

    public static defpackage.alwq b(int i) {
        switch (i) {
            case 0:
                return TYPE_UNSET;
            case 1:
                return TYPE_FAVORITE;
            case 2:
                return TYPE_CONTACT;
            case 3:
                return TYPE_WORK;
            case 4:
                return TYPE_BUSINESS;
            case 5:
                return TYPE_SPAM;
            case 6:
                return TYPE_UNKNOWN;
            case 7:
                return TYPE_HIDDEN_NUMBER;
            default:
                return null;
        }
    }

    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
