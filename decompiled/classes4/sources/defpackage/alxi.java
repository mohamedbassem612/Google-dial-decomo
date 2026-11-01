package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum alxi implements alah {
    ENTRY_POINT_DEFAULT(0),
    ENTRY_POINT_CHECK_URGENT_CALL_FROM_CONTACT(1),
    ENTRY_POINT_CHECK_CALL_IN_PUBLIC(2);

    public final int d;

    alxi(int i) {
        this.d = i;
    }

    public static defpackage.alxi b(int i) {
        if (i == 0) {
            return ENTRY_POINT_DEFAULT;
        }
        if (i == 1) {
            return ENTRY_POINT_CHECK_URGENT_CALL_FROM_CONTACT;
        }
        if (i != 2) {
            return null;
        }
        return ENTRY_POINT_CHECK_CALL_IN_PUBLIC;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
