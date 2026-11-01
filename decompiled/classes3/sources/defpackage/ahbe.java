package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum ahbe implements alah {
    REAPER_EVENT_STRATEGY_UNSPECIFIED(0),
    REAPER_EVENT_STRATEGY_POLLING(1),
    REAPER_EVENT_STRATEGY_COMPONENT_CALLBACKS(2);

    public final int d;

    ahbe(int i) {
        this.d = i;
    }

    public static defpackage.ahbe b(int i) {
        if (i == 0) {
            return REAPER_EVENT_STRATEGY_UNSPECIFIED;
        }
        if (i == 1) {
            return REAPER_EVENT_STRATEGY_POLLING;
        }
        if (i != 2) {
            return null;
        }
        return REAPER_EVENT_STRATEGY_COMPONENT_CALLBACKS;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
