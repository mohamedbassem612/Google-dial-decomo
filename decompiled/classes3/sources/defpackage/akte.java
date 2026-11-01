package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum akte implements alah {
    UNKNOWN(0),
    SYSTEM_TRAY(1),
    IN_APP(2);

    public final int d;

    akte(int i) {
        this.d = i;
    }

    public static defpackage.akte b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SYSTEM_TRAY;
        }
        if (i != 2) {
            return null;
        }
        return IN_APP;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
