package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum tcp implements defpackage.alah {
    UNSPECIFIED(0),
    NOT_VISIBLE(1),
    VISIBLE_DURING_CALL(2),
    ALWAYS_VISIBLE(3),
    UNSUPPORTED(4);

    public final int f;

    tcp(int i) {
        this.f = i;
    }

    public static defpackage.tcp b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return NOT_VISIBLE;
        }
        if (i == 2) {
            return VISIBLE_DURING_CALL;
        }
        if (i == 3) {
            return ALWAYS_VISIBLE;
        }
        if (i != 4) {
            return null;
        }
        return UNSUPPORTED;
    }

    @Override // defpackage.alah
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
