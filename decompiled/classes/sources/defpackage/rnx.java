package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum rnx implements defpackage.alah {
    UNKNOWN_MENU_ITEM_KEY(0),
    VOICE_SEARCH_MENU_ITEM_KEY(1),
    SIMULATOR_MENU_ITEM_KEY(6),
    DEBUG_OPTIONS_MENU_ITEM_KEY(7),
    TEST_FIRST_MENU_ITEM_KEY(10000),
    TEST_SECOND_MENU_ITEM_KEY(10001),
    UNRECOGNIZED(-1);

    private final int i;

    rnx(int i) {
        this.i = i;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
