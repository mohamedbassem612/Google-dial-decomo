package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum alrb implements alah {
    UNKNOWN(0),
    MUSIC(1),
    SPEECH(2),
    TELEPHONY(3),
    SILENCE(4);

    public final int f;

    alrb(int i) {
        this.f = i;
    }

    public static defpackage.alrb b(int i) {
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
        return this.f;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f);
    }
}
