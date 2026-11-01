package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum ihb implements alah {
    UNKNOWN(0),
    MUSIC(1),
    SPEECH(2),
    TELEPHONY(3),
    SILENCE(4),
    UNRECOGNIZED(-1);

    private final int h;

    ihb(int i) {
        this.h = i;
    }

    public static defpackage.ihb b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return MUSIC;
        }
        if (i == 2) {
            return SPEECH;
        }
        if (i == 3) {
            return TELEPHONY;
        }
        if (i != 4) {
            return null;
        }
        return SILENCE;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
