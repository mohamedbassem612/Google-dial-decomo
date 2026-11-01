package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public enum akti implements defpackage.alah {
    REGISTRATION_REASON_UNSPECIFIED(0),
    DEVICE_START(1),
    APP_UPDATED(2),
    ACCOUNT_CHANGED(3),
    SERVER_SYNC_INSTRUCTION(4),
    LOCALE_CHANGED(5),
    TIMEZONE_CHANGED(6),
    COLLABORATOR_API_CALL(7),
    GUNS_MIGRATION(8),
    REGISTRATION_ID_CHANGED(9),
    APP_BLOCK_STATE_CHANGED(14),
    CHANNEL_BLOCK_STATE_CHANGED(10),
    GROWTHKIT_PERIODIC_REGISTRATION(11),
    PERIODIC_REGISTRATION(12),
    GMSCORE_DEBUG(13);

    public final int p;

    akti(int i) {
        this.p = i;
    }

    public static defpackage.akti b(int i) {
        switch (i) {
            case 0:
                return REGISTRATION_REASON_UNSPECIFIED;
            case 1:
                return DEVICE_START;
            case 2:
                return APP_UPDATED;
            case 3:
                return ACCOUNT_CHANGED;
            case 4:
                return SERVER_SYNC_INSTRUCTION;
            case 5:
                return LOCALE_CHANGED;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return TIMEZONE_CHANGED;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return COLLABORATOR_API_CALL;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return GUNS_MIGRATION;
            case 9:
                return REGISTRATION_ID_CHANGED;
            case 10:
                return CHANNEL_BLOCK_STATE_CHANGED;
            case 11:
                return GROWTHKIT_PERIODIC_REGISTRATION;
            case 12:
                return PERIODIC_REGISTRATION;
            case 13:
                return GMSCORE_DEBUG;
            case 14:
                return APP_BLOCK_STATE_CHANGED;
            default:
                return null;
        }
    }

    @Override // defpackage.alah
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.p);
    }
}
