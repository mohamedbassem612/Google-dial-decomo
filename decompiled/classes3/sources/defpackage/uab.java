package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum uab {
    SONIC_KEY_APPLAUSE("SONIC_KEY_APPLAUSE"),
    SONIC_KEY_PARTY_POPPER("SONIC_KEY_PARTY_POPPER"),
    SONIC_KEY_SAD("SONIC_KEY_SAD"),
    SONIC_KEY_CRY_LAUGH("SONIC_KEY_CRY_LAUGH"),
    SONIC_KEY_POOP("SONIC_KEY_POOP"),
    SONIC_KEY_DRUMROLL("SONIC_KEY_DRUMROLL");

    public final java.lang.String g;

    uab(java.lang.String str) {
        this.g = str;
    }

    public static j$.util.Optional a(java.lang.String str) {
        for (defpackage.uab uabVar : values()) {
            if (uabVar.g.equals(str)) {
                return j$.util.Optional.of(uabVar);
            }
        }
        return j$.util.Optional.empty();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.g;
    }
}
