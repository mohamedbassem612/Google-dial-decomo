package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum acvo implements alah {
    UNDEFINED(0),
    SHARED_PREFERENCES_ONLY(1),
    SHARED_PREFERENCES_AND_PROTOSTORE(2),
    PROTOSTORE_ONLY(3);

    private final int f;

    acvo(int i) {
        this.f = i;
    }

    public static defpackage.acvo b(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return SHARED_PREFERENCES_ONLY;
        }
        if (i == 2) {
            return SHARED_PREFERENCES_AND_PROTOSTORE;
        }
        if (i != 3) {
            return null;
        }
        return PROTOSTORE_ONLY;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
