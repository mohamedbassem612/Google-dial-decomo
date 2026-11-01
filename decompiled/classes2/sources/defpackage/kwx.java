package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum kwx implements alah {
    UNSPECIFIED(0),
    NEVER(1),
    AFTER_7_DAYS(2),
    AFTER_14_DAYS(3),
    AFTER_30_DAYS(4);

    public final int f;

    kwx(int i) {
        this.f = i;
    }

    public static defpackage.kwx b(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return NEVER;
        }
        if (i == 2) {
            return AFTER_7_DAYS;
        }
        if (i == 3) {
            return AFTER_14_DAYS;
        }
        if (i != 4) {
            return null;
        }
        return AFTER_30_DAYS;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
