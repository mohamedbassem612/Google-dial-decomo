package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum rnz implements defpackage.alah {
    UNKNOWN_NAV_MENU_ITEM_KEY(0),
    CONTACTS_NAV_MENU_KEY(1),
    SETTINGS_NAV_MENU_KEY(2),
    CLEAR_CALL_HISTORY_NAV_MENU_KEY(3),
    CALL_HISTORY_NAV_MENU_KEY(4),
    CALL_DIAGNOSTICS_NAV_MENU_KEY(5),
    HELP_AND_FEEDBACK_NAV_MENU_KEY(6),
    UNRECOGNIZED(-1);

    private final int j;

    rnz(int i2) {
        this.j = i2;
    }

    @Override // defpackage.alah
    public final int a() {
        return this == UNRECOGNIZED ? defpackage.alau.a() : this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
