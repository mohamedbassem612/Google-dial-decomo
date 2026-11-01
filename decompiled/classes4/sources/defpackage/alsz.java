package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alsz implements alah {
    UNKNOWN_ENTITY(0),
    USER(1),
    BOT(2);

    public final int d;

    alsz(int i) {
        this.d = i;
    }

    public static defpackage.alsz b(int i) {
        if (i == 0) {
            return UNKNOWN_ENTITY;
        }
        if (i == 1) {
            return USER;
        }
        if (i != 2) {
            return null;
        }
        return BOT;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
