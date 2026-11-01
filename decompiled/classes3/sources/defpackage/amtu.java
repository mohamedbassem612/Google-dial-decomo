package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum amtu implements alah {
    SONIC_NOT_SET(0),
    SONIC_HEART_CLICKED(1),
    SONIC_DRUMROLL_CLICKED(2),
    SONIC_POOP_CLICKED(3),
    SONIC_PARTY_POPPER_CLICKED(4),
    SONIC_CRY_LAUGH_CLICKED(5),
    SONIC_APPLAUSE_CLICKED(6),
    SONIC_SAD_CLICKED(7),
    SONIC_HALLOWEEN_CLICKED(8),
    SONIC_CHRISTMAS_CLICKED(9),
    SONIC_NEW_YEAR_CLICKED(10);

    public final int l;

    amtu(int i) {
        this.l = i;
    }

    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.l);
    }
}
