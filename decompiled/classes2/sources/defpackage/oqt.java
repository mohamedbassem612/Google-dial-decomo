package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public enum oqt implements alah {
    DIALER_HATS_EVENT_TYPE_UNKNOWN(0),
    DIALER_HATS_CALL_END(1),
    DIALER_HATS_ATLAS_ACTIVATED(2),
    DIALER_HATS_XATU_ACTIVATED(3),
    DIALER_HATS_TIMEKEEPER_DATA_AVAILABLE(4),
    DIALER_HATS_CALL_SCREEN_ACTIVATED(5),
    DIALER_HATS_XATU_SHOW_AHEAD_AVAILABLE(8),
    DIALER_HATS_DOBBY_ACTIVATED(9),
    DIALER_HATS_SONIC_EMOJI_CLICKED(10),
    DIALER_HATS_SONIC_GRID_SHOWN(11),
    DIALER_HATS_FERMAT_SUMMARY_SHOWN(12),
    DIALER_HATS_RECENTS_TAB_STARTED(13),
    DIALER_HATS_EXPRESSO_SENDER_CLICKED(14),
    DIALER_HATS_EXPRESSO_SENDER_GRID_SHOWN(15),
    DIALER_HATS_EXPRESSO_RECEIVER_INCALL_SHOWN(16),
    DIALER_HATS_SWITCHBOARD_CULDESAC_SHOWN(17),
    DIALER_HATS_SHARPIE_ALERT_DISPLAYED(18),
    DIALER_HATS_BEACON_CARD_DISPLAYED(19),
    DIALER_HATS_CALLING_CARD_DISPLAYED(20),
    DIALER_HATS_EVENT_TYPE_TEST_1(1000),
    DIALER_HATS_EVENT_TYPE_TEST_2(1001),
    DIALER_HATS_EVENT_TYPE_TEST_RESET(1002);

    public final int w;

    oqt(int i) {
        this.w = i;
    }

    public static defpackage.oqt b(int i) {
        if (i == 0) {
            return DIALER_HATS_EVENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DIALER_HATS_CALL_END;
        }
        if (i == 2) {
            return DIALER_HATS_ATLAS_ACTIVATED;
        }
        if (i == 3) {
            return DIALER_HATS_XATU_ACTIVATED;
        }
        if (i == 4) {
            return DIALER_HATS_TIMEKEEPER_DATA_AVAILABLE;
        }
        if (i == 5) {
            return DIALER_HATS_CALL_SCREEN_ACTIVATED;
        }
        switch (i) {
            case 8:
                return DIALER_HATS_XATU_SHOW_AHEAD_AVAILABLE;
            case 9:
                return DIALER_HATS_DOBBY_ACTIVATED;
            case 10:
                return DIALER_HATS_SONIC_EMOJI_CLICKED;
            case 11:
                return DIALER_HATS_SONIC_GRID_SHOWN;
            case 12:
                return DIALER_HATS_FERMAT_SUMMARY_SHOWN;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return DIALER_HATS_RECENTS_TAB_STARTED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return DIALER_HATS_EXPRESSO_SENDER_CLICKED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return DIALER_HATS_EXPRESSO_SENDER_GRID_SHOWN;
            case 16:
                return DIALER_HATS_EXPRESSO_RECEIVER_INCALL_SHOWN;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return DIALER_HATS_SWITCHBOARD_CULDESAC_SHOWN;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return DIALER_HATS_SHARPIE_ALERT_DISPLAYED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return DIALER_HATS_BEACON_CARD_DISPLAYED;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                return DIALER_HATS_CALLING_CARD_DISPLAYED;
            default:
                switch (i) {
                    case 1000:
                        return DIALER_HATS_EVENT_TYPE_TEST_1;
                    case 1001:
                        return DIALER_HATS_EVENT_TYPE_TEST_2;
                    case 1002:
                        return DIALER_HATS_EVENT_TYPE_TEST_RESET;
                    default:
                        return null;
                }
        }
    }

    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.w);
    }
}
