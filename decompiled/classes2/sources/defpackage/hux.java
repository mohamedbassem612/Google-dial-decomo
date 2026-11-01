package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum hux implements alah {
    VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED(0),
    FIRE(1),
    POLICE(2),
    MEDICAL(3),
    CAR_CRASH(4),
    EMERGENCY_SOS(5);

    public final int g;

    hux(int i) {
        this.g = i;
    }

    public static defpackage.hux b(int i) {
        if (i == 0) {
            return VOICE_ASSIST_EMERGENCY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return FIRE;
        }
        if (i == 2) {
            return POLICE;
        }
        if (i == 3) {
            return MEDICAL;
        }
        if (i == 4) {
            return CAR_CRASH;
        }
        if (i != 5) {
            return null;
        }
        return EMERGENCY_SOS;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
