package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum miy implements alah {
    UNKNOWN(0),
    VOICE(1),
    WAIT_TIME(2),
    RTT(3),
    BUSINESS_MESSAGE(4),
    TEST(1000);

    public final int g;

    miy(int i) {
        this.g = i;
    }

    public static defpackage.miy b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VOICE;
        }
        if (i == 2) {
            return WAIT_TIME;
        }
        if (i == 3) {
            return RTT;
        }
        if (i == 4) {
            return BUSINESS_MESSAGE;
        }
        if (i != 1000) {
            return null;
        }
        return TEST;
    }

    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.g);
    }
}
