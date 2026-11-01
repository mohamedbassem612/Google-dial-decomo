package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akij implements alah {
    UNKNOWN(0),
    ACTIVITY(1),
    SERVICE(2),
    BROADCAST(3),
    ACTIVITY_WITH_RESULT(4);

    public final int f;

    akij(int i) {
        this.f = i;
    }

    public static defpackage.akij b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACTIVITY;
        }
        if (i == 2) {
            return SERVICE;
        }
        if (i == 3) {
            return BROADCAST;
        }
        if (i != 4) {
            return null;
        }
        return ACTIVITY_WITH_RESULT;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
