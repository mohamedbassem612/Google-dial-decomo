package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum upk implements alah {
    UNKNOWN(0),
    VOICE(1),
    IMS_VIDEO(2),
    DUO(3),
    RTT(4),
    UNRECOGNIZED(-1);

    private final int h;

    upk(int i) {
        this.h = i;
    }

    public static defpackage.upk b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VOICE;
        }
        if (i == 2) {
            return IMS_VIDEO;
        }
        if (i == 3) {
            return DUO;
        }
        if (i != 4) {
            return null;
        }
        return RTT;
    }

    public final int a() {
        return this == UNRECOGNIZED ? alau.a() : this.h;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.h);
    }
}
