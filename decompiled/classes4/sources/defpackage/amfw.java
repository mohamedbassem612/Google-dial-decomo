package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum amfw implements alah {
    UNKNOWN(0),
    LOW_CONFIDENCE(1),
    VOICE_COMMAND(2),
    MATCHED_CACHE(3),
    PREDICTED_BY_CACHE(4);

    public final int f;

    amfw(int i) {
        this.f = i;
    }

    public static defpackage.amfw b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return LOW_CONFIDENCE;
        }
        if (i == 2) {
            return VOICE_COMMAND;
        }
        if (i == 3) {
            return MATCHED_CACHE;
        }
        if (i != 4) {
            return null;
        }
        return PREDICTED_BY_CACHE;
    }

    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
