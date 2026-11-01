package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum tbe implements alah {
    NOT_SET_BY_USER(0),
    RING_PHONE(1),
    AUTOMATICALLY_SCREEN(2),
    SILENTLY_DECLINE(3);

    public final int e;

    tbe(int i) {
        this.e = i;
    }

    public static defpackage.tbe b(int i) {
        if (i == 0) {
            return NOT_SET_BY_USER;
        }
        if (i == 1) {
            return RING_PHONE;
        }
        if (i == 2) {
            return AUTOMATICALLY_SCREEN;
        }
        if (i != 3) {
            return null;
        }
        return SILENTLY_DECLINE;
    }

    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
