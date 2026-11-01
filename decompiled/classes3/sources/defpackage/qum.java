package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum qum {
    ALERT(1),
    ACTIVE_CONTENT(2),
    PROMO(3),
    DEFAULT_TYPE(4),
    TYPE_NOT_SET(0);

    public final int f;

    qum(int i) {
        this.f = i;
    }

    public static defpackage.qum a(int i) {
        if (i == 0) {
            return TYPE_NOT_SET;
        }
        if (i == 1) {
            return ALERT;
        }
        if (i == 2) {
            return ACTIVE_CONTENT;
        }
        if (i == 3) {
            return PROMO;
        }
        if (i != 4) {
            return null;
        }
        return DEFAULT_TYPE;
    }
}
