package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum zmw {
    ROUTE_EARPIECE(1),
    ROUTE_BLUETOOTH(2),
    ROUTE_WIRED_HEADSET(4),
    ROUTE_SPEAKER(8),
    ROUTE_WIRED_OR_EARPIECE(5);

    public final int f;

    zmw(int i) {
        this.f = i;
    }

    public static defpackage.zmw a(int i) {
        if (i == 1) {
            return ROUTE_EARPIECE;
        }
        if (i == 2) {
            return ROUTE_BLUETOOTH;
        }
        if (i == 4) {
            return ROUTE_WIRED_HEADSET;
        }
        if (i == 5) {
            return ROUTE_WIRED_OR_EARPIECE;
        }
        if (i == 8) {
            return ROUTE_SPEAKER;
        }
        throw new java.lang.IllegalArgumentException("Passed invalid audio route.");
    }
}
