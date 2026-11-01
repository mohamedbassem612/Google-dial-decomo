package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akhb implements alah {
    CONNECTIVITY_UNKNOWN(0),
    OFFLINE(1),
    ONLINE(2),
    UNRECOGNIZED(-1);

    private final int f;

    akhb(int i) {
        this.f = i;
    }

    public static defpackage.akhb b(int i) {
        if (i == 0) {
            return CONNECTIVITY_UNKNOWN;
        }
        if (i == 1) {
            return OFFLINE;
        }
        if (i != 2) {
            return null;
        }
        return ONLINE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
