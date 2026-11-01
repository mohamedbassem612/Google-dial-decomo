package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum aktn implements alah {
    CONNECTIVITY_STATE_UNSPECIFIED(0),
    OFFLINE(1),
    ONLINE(2);

    private final int e;

    aktn(int i) {
        this.e = i;
    }

    public static defpackage.aktn b(int i) {
        if (i == 0) {
            return CONNECTIVITY_STATE_UNSPECIFIED;
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
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
